import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class40 extends class319 {

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[B")
    public byte[] field861;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
    public boolean field865;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ldh;)Ltc;", line = 4)
    public final class40 method350(class166 arg0) {
        this.field861 = arg0.method1302((byte) -26, this.field861);
        this.field864 = arg0.method1298(this.field864, -121);
        if (this.field863 == this.field862) {
            this.field863 = this.field862 = arg0.method1292(this.field863, -3606);
        } else {
            this.field863 = arg0.method1292(this.field863, -3606);
            this.field862 = arg0.method1292(this.field862, -3606);
            if (this.field863 == this.field862) {
                this.field863--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class40(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field864 = arg0;
        this.field861 = arg1;
        this.field863 = arg2;
        this.field862 = arg3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class40(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field864 = arg0;
        this.field861 = arg1;
        this.field863 = arg2;
        this.field862 = arg3;
        this.field865 = arg4;
    }
}
