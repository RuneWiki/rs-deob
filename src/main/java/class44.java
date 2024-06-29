import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class44 extends class231 {

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "[B")
    public byte[] field704;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Z")
    public boolean field701;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lth;)Lqq;", line = 9)
    public final class44 method461(class74 arg0) {
        this.field704 = arg0.method660(this.field704, (byte) -121);
        this.field700 = arg0.method659(116, this.field700);
        if (this.field703 == this.field702) {
            this.field702 = this.field703 = arg0.method662(true, this.field702);
        } else {
            this.field702 = arg0.method662(true, this.field702);
            this.field703 = arg0.method662(true, this.field703);
            if (this.field703 == this.field702) {
                this.field702--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class44(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field700 = arg0;
        this.field704 = arg1;
        this.field702 = arg2;
        this.field703 = arg3;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class44(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field700 = arg0;
        this.field704 = arg1;
        this.field702 = arg2;
        this.field703 = arg3;
        this.field701 = arg4;
    }
}
