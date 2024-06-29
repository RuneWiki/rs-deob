import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class452 extends class737 {

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public int field6180;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "F")
    public float field6181;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "F")
    public float field6183;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Z")
    public boolean field6182;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[C")
    public static char[] field6179 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIII[I)V", line = 3)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6178 = arg1;
        this.field6180 = arg2;
        this.method4112((byte) -60, arg1, 0, arg2, 0, true, arg5, 0, 0);
        this.field6181 = (float) arg2 / (float) arg4;
        this.field6183 = (float) arg1 / (float) arg3;
        this.field6182 = false;
        this.method4116((byte) -60, false, false);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIIIZ)V", line = 17)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field6282 != 34037) {
            this.field6182 = true;
            this.field6183 = this.field6181 = 1.0F;
        } else {
            this.field6183 = (float) arg4;
            this.field6181 = (float) arg5;
            this.field6182 = false;
        }
        this.field6178 = arg4;
        this.field6180 = arg5;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIII)V", line = 38)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6183 = (float) arg2 / (float) arg4;
        this.field6181 = (float) arg3 / (float) arg5;
        this.field6182 = false;
        this.field6180 = arg3;
        this.field6178 = arg2;
        this.method4116((byte) -60, false, false);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIII[BI)V", line = 51)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6178 = arg2;
        this.field6180 = arg3;
        this.method4118(arg6, arg7, 0, 0, 0, 0, true, arg3, 66, arg2);
        this.field6181 = (float) arg3 / (float) arg5;
        this.field6182 = false;
        this.field6183 = (float) arg2 / (float) arg4;
        this.method4116((byte) -60, false, false);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIZ[III)V", line = 65)
    public class452(class663 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6178 = arg2;
        this.field6180 = arg3;
        if (~super.field6282 == -34038) {
            this.field6183 = (float) arg2;
            this.field6181 = (float) arg3;
            this.field6182 = false;
        } else {
            this.field6182 = true;
            this.field6183 = this.field6181 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2575(boolean arg0) {
        if (arg0) {
            field6179 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIIZ[BI)V", line = 97)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field6282 == 34037) {
            this.field6182 = false;
            this.field6183 = (float) arg3;
            this.field6181 = (float) arg4;
        } else {
            this.field6183 = this.field6181 = 1.0F;
            this.field6182 = true;
        }
        this.field6180 = arg4;
        this.field6178 = arg3;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIII)V", line = 119)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6180 = arg4;
        this.field6178 = arg3;
        if (super.field6282 != 34037) {
            this.field6182 = true;
            this.field6183 = this.field6181 = 1.0F;
        } else {
            this.field6181 = (float) arg4;
            this.field6182 = false;
            this.field6183 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lrda;IIIIIIZ)V", line = 147)
    public class452(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6180 = arg4;
        this.field6183 = (float) arg3 / (float) arg5;
        this.field6182 = false;
        this.field6181 = (float) arg4 / (float) arg6;
        this.field6178 = arg3;
        this.method4116((byte) -60, false, false);
    }
}
