import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class385 extends class446 {

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "Z")
    public boolean field5145;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "F")
    public float field5147;

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "F")
    public float field5143;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "Lpr;")
    public static class407 field5146 = new class407(16, 6);

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "Z")
    public static boolean field5149;

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "[Lqf;")
    public static class623[] field5152;

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIIIIIZ)V", line = 3)
    public class385(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5145 = false;
        this.field5147 = (float) arg4 / (float) arg6;
        this.field5148 = arg3;
        this.field5151 = arg4;
        this.field5143 = (float) arg3 / (float) arg5;
        this.method2467(false, false, 64);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Llt;I)V", line = 17)
    public static final void method2111(class617 arg0, int arg1) {
        ++field5150;
        arg0.method3459((byte) -116);
        int var2 = class90.field1038;
        class455 var3 = class377.field4914 = class362.field4726[var2] = new class455();
        var3.field3784 = var2;
        int var4 = arg0.method3465(30, (byte) -90);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 268420267) >> 14;
        int var7 = 16383 & var4;
        var3.field3839[0] = -class682.field9685 + var6;
        var3.field4641 = (var3.field3839[0] << 9) + (var3.method1656(true) << 8);
        var3.field3841[0] = var7 - class146.field1642;
        var3.field4647 = (var3.field3841[0] << 9) + (var3.method1656(true) << 8);
        class353.field4625 = var3.field4638 = var5;
        if (class288.field3709[var2] != null) {
            var3.method2583(class288.field3709[var2], -1);
        }
        class11.field111 = 0;
        class79.field827[class11.field111++] = var2;
        class173.field2062[var2] = 0;
        class548.field7833 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (var2 != var8) {
                int var9 = arg0.method3465(18, (byte) -91);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65534) >> 8;
                int var12 = 255 & var9;
                class383 var13 = class412.field5458[var8] = new class383();
                var13.field5134 = 0;
                var13.field5131 = -1;
                var13.field5130 = false;
                var13.field5132 = (var10 << 28) + var12 - -(var11 << 14);
                class324.field4223[class548.field7833++] = var8;
                class173.field2062[var8] = 0;
            }
        }
        if (arg1 != -7834) {
            method2112((byte) 120);
        }
        arg0.method3463((byte) 104);
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(B)V", line = 93)
    public static void method2112(byte arg0) {
        int var1 = -8 % ((60 - arg0) / 55);
        field5152 = null;
        field5146 = null;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIII[I)V", line = 103)
    public class385(class435 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5148 = arg1;
        this.field5151 = arg2;
        this.method2472(0, arg5, 0, 0, arg1, 127, true, 0, arg2);
        this.field5145 = false;
        this.field5143 = (float) arg1 / (float) arg3;
        this.field5147 = (float) arg2 / (float) arg4;
        this.method2467(false, false, 91);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILfp;)V", line = 117)
    public static final void method2113(int arg0, class292 arg1) {
        ++field5144;
        boolean var2 = false;
        if (~class469.field6549 != ~arg1.field3826 && arg1.field3778 != -1 && ~arg1.field3797 == -1) {
            class576 var3 = class618.field8696.method124(24006, arg1.field3778);
            if (var3.field8218 || ~var3.field8208[arg1.field3744] > ~(arg1.field3810 + 1)) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = arg1.field3826 - arg1.field3783;
            int var5 = class469.field6549 - arg1.field3783;
            int var6 = arg1.field3759 * 512 - -(256 * arg1.method1656(true));
            int var7 = arg1.field3753 * 512 + 256 * arg1.method1656(true);
            int var8 = arg1.field3808 * 512 - -(arg1.method1656(true) * 256);
            int var9 = arg1.field3827 * 512 - -(256 * arg1.method1656(true));
            arg1.field4641 = ((-var5 + var4) * var6 - -(var5 * var8)) / var4;
            arg1.field4647 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg1.field3837 = 0;
        if (arg1.field3829 == 0) {
            arg1.method1648(false, 8192, (byte) -65);
        }
        if (arg1.field3829 == 1) {
            arg1.method1648(false, 12288, (byte) -95);
        }
        if (arg1.field3829 == 2) {
            arg1.method1648(false, 0, (byte) -111);
        }
        if (arg1.field3829 == 3) {
            arg1.method1648(false, 4096, (byte) -114);
        }
        if (arg0 != 512) {
            field5146 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIIZ[I)V", line = 175)
    public class385(class435 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5148 = arg2;
        if (~super.field5464 == -34038) {
            this.field5143 = (float) arg2;
            this.field5147 = (float) arg3;
            this.field5145 = false;
        } else {
            this.field5143 = this.field5147 = 1.0F;
            this.field5145 = true;
        }
        this.field5151 = arg3;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIIIIZ)V", line = 198)
    public class385(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field5151 = arg5;
        if (~super.field5464 != -34038) {
            this.field5145 = true;
            this.field5143 = this.field5147 = 1.0F;
        } else {
            this.field5143 = (float) arg4;
            this.field5147 = (float) arg5;
            this.field5145 = false;
        }
        this.field5148 = arg4;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIIII[BI)V", line = 220)
    public class385(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5148 = arg2;
        this.field5151 = arg3;
        this.method2471(arg6, 9, 0, 0, 0, 0, arg3, true, arg2, arg7);
        this.field5147 = (float) arg3 / (float) arg5;
        this.field5145 = false;
        this.field5143 = (float) arg2 / (float) arg4;
        this.method2467(false, false, 78);
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lap;IIIIZ[BI)V", line = 240)
    public class385(class435 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field5464 != -34038) {
            this.field5143 = this.field5147 = 1.0F;
            this.field5145 = true;
        } else {
            this.field5147 = (float) arg4;
            this.field5143 = (float) arg3;
            this.field5145 = false;
        }
        this.field5148 = arg3;
        this.field5151 = arg4;
    }
}
