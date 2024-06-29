import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class445 extends class420 {

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[B")
    public byte[] field6483;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
    public boolean field6484;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lvc;)Lkr;")
    public final class445 method2755(class171 arg0) {
        this.field6483 = arg0.method1191(this.field6483, 0);
        this.field6485 = arg0.method1189((byte) 55, this.field6485);
        if (this.field6486 == this.field6482) {
            this.field6486 = this.field6482 = arg0.method1190(this.field6486, 125);
        } else {
            this.field6486 = arg0.method1190(this.field6486, 10);
            this.field6482 = arg0.method1190(this.field6482, -14);
            if (this.field6486 == this.field6482) {
                this.field6486--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I[BII)V")
    public class445(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6485 = arg0;
        this.field6483 = arg1;
        this.field6486 = arg2;
        this.field6482 = arg3;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I[BIIZ)V")
    public class445(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6485 = arg0;
        this.field6483 = arg1;
        this.field6486 = arg2;
        this.field6482 = arg3;
        this.field6484 = arg4;
    }
}
