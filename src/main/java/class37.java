import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class37 extends class329 {

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[B")
    public byte[] field425;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
    public boolean field427;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnc;)Lfn;", line = 5)
    public final class37 method240(class164 arg0) {
        this.field425 = arg0.method1175(14, this.field425);
        this.field423 = arg0.method1178(this.field423, 24235);
        if (this.field426 == this.field424) {
            this.field426 = this.field424 = arg0.method1177((byte) -112, this.field426);
        } else {
            this.field426 = arg0.method1177((byte) -118, this.field426);
            this.field424 = arg0.method1177((byte) 106, this.field424);
            if (this.field426 == this.field424) {
                this.field426--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class37(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field423 = arg0;
        this.field425 = arg1;
        this.field426 = arg2;
        this.field424 = arg3;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class37(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field423 = arg0;
        this.field425 = arg1;
        this.field426 = arg2;
        this.field424 = arg3;
        this.field427 = arg4;
    }
}
