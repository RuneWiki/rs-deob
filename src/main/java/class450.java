import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class450 extends class261 {

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field6311;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[B")
    public byte[] field6310;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field6313;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
    public boolean field6309;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljs;)Lug;")
    public final class450 method2594(class271 arg0) {
        this.field6310 = arg0.method1589(this.field6310, 22157);
        this.field6311 = arg0.method1592((byte) -94, this.field6311);
        if (this.field6313 == this.field6312) {
            this.field6312 = this.field6313 = arg0.method1590(this.field6312, 6);
        } else {
            this.field6312 = arg0.method1590(this.field6312, 6);
            this.field6313 = arg0.method1590(this.field6313, 6);
            if (this.field6313 == this.field6312) {
                this.field6312--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[BII)V")
    public class450(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6311 = arg0;
        this.field6310 = arg1;
        this.field6312 = arg2;
        this.field6313 = arg3;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[BIIZ)V")
    public class450(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6311 = arg0;
        this.field6310 = arg1;
        this.field6312 = arg2;
        this.field6313 = arg3;
        this.field6309 = arg4;
    }
}
