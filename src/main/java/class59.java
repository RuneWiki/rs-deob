import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class59 extends class520 {

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
    public boolean field773;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "F")
    public float field768;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "F")
    public float field772;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 4)
    public static final void method352(int arg0, int arg1) {
        ++field769;
        int var2 = -class580.field7339 + class693.field8900;
        if (~var2 <= -101) {
            class525.field6679 = -1;
            class524.field6672 = -1;
            class507.field6476 = 1;
        } else {
            int var3 = (int) class297.field3762;
            if (~var3 > ~(class162.field2160 >> 8)) {
                var3 = class162.field2160 >> 8;
            }
            if (arg1 != 10971) {
                method352(71, -81);
            }
            if (class420.field5545[4] && ~var3 > ~(class600.field7632[4] + 128)) {
                var3 = class600.field7632[4] - -128;
            }
            int var4 = 16383 & (int) class698.field9250 + class181.field2474;
            class88.method539(var3, class572.field7251, arg0, (var3 >> 3) * 3 + 600 << 2, class599.field7622, var4, -105, -200 + class512.method2831(class309.field3877, (byte) 116, class422.field5564.field2896, class422.field5564.field2900));
            float var5 = -((float) ((100 - var2) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
            class439.field5770 = (int) ((float) (-class455.field5968 + class439.field5770) * var5 + (float) class455.field5968);
            class463.field6022 = (int) ((float) (class463.field6022 - class532.field6737) * var5 + (float) class532.field6737);
            class97.field1309 = (int) ((float) (-class38.field433 + class97.field1309) * var5 + (float) class38.field433);
            class148.field1890 = (int) ((float) (-class422.field5554 + class148.field1890) * var5 + (float) class422.field5554);
            int var6 = -class57.field764 + class232.field3122;
            if (~var6 < -8193) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class232.field3122 = (int) ((float) var6 * var5 + (float) class57.field764);
            class232.field3122 &= 16383;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIII[I)V", line = 54)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field771 = arg2;
        this.field770 = arg1;
        this.method2867(true, arg5, 0, arg1, 0, 0, 0, 0, arg2);
        this.field773 = false;
        this.field768 = (float) arg2 / (float) arg4;
        this.field772 = (float) arg1 / (float) arg3;
        this.method2873(-26403, false, false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIZ[III)V", line = 69)
    public class59(class733 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field771 = arg3;
        this.field770 = arg2;
        if (~super.field1710 != -34038) {
            this.field773 = true;
            this.field772 = this.field768 = 1.0F;
        } else {
            this.field773 = false;
            this.field768 = (float) arg3;
            this.field772 = (float) arg2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIII[BI)V", line = 90)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field770 = arg2;
        this.field771 = arg3;
        this.method2874((byte) -92, 0, arg6, arg3, 0, arg2, 0, 0, true, arg7);
        this.field768 = (float) arg3 / (float) arg5;
        this.field773 = false;
        this.field772 = (float) arg2 / (float) arg4;
        this.method2873(-26403, false, false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIIIZ)V", line = 104)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field1710 == -34038) {
            this.field768 = (float) arg5;
            this.field772 = (float) arg4;
            this.field773 = false;
        } else {
            this.field772 = this.field768 = 1.0F;
            this.field773 = true;
        }
        this.field771 = arg5;
        this.field770 = arg4;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIII)V", line = 125)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field771 = arg4;
        if (super.field1710 == 34037) {
            this.field773 = false;
            this.field768 = (float) arg4;
            this.field772 = (float) arg3;
        } else {
            this.field772 = this.field768 = 1.0F;
            this.field773 = true;
        }
        this.field770 = arg3;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIIIIZ)V", line = 146)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field771 = arg4;
        this.field773 = false;
        this.field772 = (float) arg3 / (float) arg5;
        this.field770 = arg3;
        this.field768 = (float) arg4 / (float) arg6;
        this.method2873(-26403, false, false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIII)V", line = 164)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field773 = false;
        this.field771 = arg3;
        this.field770 = arg2;
        this.field768 = (float) arg3 / (float) arg5;
        this.field772 = (float) arg2 / (float) arg4;
        this.method2873(-26403, false, false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lck;IIIIZ[BI)V", line = 177)
    public class59(class733 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field1710 == 34037) {
            this.field768 = (float) arg4;
            this.field773 = false;
            this.field772 = (float) arg3;
        } else {
            this.field772 = this.field768 = 1.0F;
            this.field773 = true;
        }
        this.field770 = arg3;
        this.field771 = arg4;
    }
}
