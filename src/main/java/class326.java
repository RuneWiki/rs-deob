import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class326 extends class188 {

    @OriginalMember(owner = "client!dja", name = "m", descriptor = "Z")
    private boolean field4745 = false;

    @OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
    public static int field4746 = 1;

    @OriginalMember(owner = "client!dja", name = "p", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!dja", name = "s", descriptor = "F")
    public static float field4751;

    @OriginalMember(owner = "client!dja", name = "i", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dja", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!dja", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!dja", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!dja", name = "o", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!dja", name = "q", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!dja", name = "r", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!dja", name = "u", descriptor = "Lmp;")
    public static class793 field4753;

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lai;)V")
    public class326(class626 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method955((byte) 67);
        }
        ++field4747;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        super.field2510.method3513(class521.field7150, class364.field5299, -58);
        ++field4750;
        if (arg0 != 22789) {
            this.method962(58, false);
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        ++field4752;
        class149 var3 = super.field2510.method3519(-73);
        if (arg1 != 2) {
            method2067(126, (byte) 73, -24, 112, -99, 44);
        }
        if (var3 != null && arg0) {
            super.field2510.method3470((byte) -22, 1);
            super.field2510.method3520(true, var3);
            super.field2510.method870(58, class451.field6282);
            super.field2510.method3470((byte) -40, 1);
            super.field2510.method3513(class521.field7150, class412.field5923, -39);
            super.field2510.method907(true, false, (byte) -67, 2, class386.field5627);
            super.field2510.method3509(0, class461.field6387, -96);
            class754 var4 = super.field2510.method3506((byte) -124);
            var4.method4192(super.field2510.method3458(0), (byte) 88);
            super.field2510.method3471(arg1 ^ 85, class592.field7968);
            super.field2510.method3470((byte) -23, 0);
            this.field4745 = true;
        } else {
            super.field2510.method3509(0, class461.field6387, -103);
        }
    }

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)V")
    public static final void method2065(int arg0) {
        if (arg0 < 68) {
            method2066((byte) -73);
        }
        ++field4742;
        class455.field6322 = new class275(class474.field6543.method2780(118, class38.field589), "", class660.field9129, 1004, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        if (!this.field4745) {
            super.field2510.method3509(0, class122.field1782, -107);
        } else {
            super.field2510.method3470((byte) 36, 1);
            super.field2510.method870(110, class381.field5564);
            super.field2510.method3513(class364.field5299, class364.field5299, -30);
            super.field2510.method3514((byte) -81, class109.field1493, 2);
            super.field2510.method3509(0, class122.field1782, -77);
            super.field2510.method3504((byte) -57);
            super.field2510.method3520(true, (class123) null);
            super.field2510.method3470((byte) -63, 0);
            this.field4745 = false;
        }
        if (arg0 < 54) {
            this.method958(-95, 104, true);
        }
        ++field4749;
        super.field2510.method3513(class364.field5299, class364.field5299, 122);
    }

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "(B)V")
    public static void method2066(byte arg0) {
        field4753 = null;
        int var1 = -26 % ((arg0 - -15) / 34);
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBIIII)V")
    public static final void method2067(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -125) {
            field4751 = -0.2882615F;
        }
        ++field4741;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        class138.method1069(class785.field10808[arg4], (byte) 86, -arg0 + arg3, arg0 + arg3, arg2);
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var21 = -var7 + arg4;
            int var22 = arg4 - -var7;
            int var23 = arg3 + var6;
            int var24 = -var6 + arg3;
            class138.method1069(class785.field10808[var21], (byte) 116, var24, var23, arg2);
            class138.method1069(class785.field10808[var22], (byte) -85, var24, var23, arg2);
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        if (arg0 < 53) {
            this.method958(27, 100, false);
        }
        ++field4744;
        return true;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        super.field2510.method3520(true, arg2);
        ++field4743;
        int var4 = 86 % ((arg1 - 60) / 61);
        super.field2510.method3503((byte) -97, arg0);
    }
}
