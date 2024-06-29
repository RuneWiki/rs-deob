import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class262 extends class360 implements class231 {

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Ltv;")
    public class360 field3809;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    public static boolean field3823 = false;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Lpp;")
    public static class464 field3810 = new class464(26, 8);

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lbv;")
    public static class567 field3827 = new class567("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field3831 = 0;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "F")
    public static float field3821;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZII)I")
    public static final int method1669(int arg0, boolean arg1, int arg2, int arg3) {
        field3829++;
        class217 var4 = class132.method1024(arg3, 0, arg1);
        int var5 = -72 % ((arg2 + 42) / 46);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field3280.length > arg0) {
            return var4.field3280[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILqa;)Lkm;")
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 > -50) {
            this.method263((byte) -26, null, 19, -77);
        }
        field3817++;
        return this.field3809.method260(-107, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLqa;)V")
    public final void method268(boolean arg0, class167 arg1) {
        field3820++;
        if (!arg0) {
            field3827 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public final void method867(int arg0) {
        if (arg0 < 12) {
            this.method262(-78);
        }
        field3818++;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        field3819++;
        int var2 = -3 / ((-arg0 - 1) / 47);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lco;B)V")
    public static final void method1670(class268 arg0, byte arg1) {
        field3816++;
        if (arg1 != -24) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class374.field5490 != null) {
            try {
                class374.field5490.method2375(0L, (byte) 59);
                class374.field5490.method2374(var2, (byte) -117);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1725(0, 24, (byte) -12, var2);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)I")
    public final int method1175(boolean arg0) {
        if (arg0) {
            return -81;
        } else {
            field3824++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static void method1671(int arg0) {
        if (arg0 <= 117) {
            field3821 = 0.75410044F;
        }
        field3810 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZ)V")
    public static final void method1672(int arg0, int arg1, int arg2, boolean arg3) {
        field3813++;
        class104.field1755 = new byte[arg1][arg0][arg2];
        if (!arg3) {
            field3821 = 0.40639332F;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        field3815++;
        if (arg0 != -21131) {
            this.method866((byte) -46, true, 114, null, -97, 86, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        if (arg0 != -25792) {
            this.method1175(false);
        }
        field3807++;
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLqa;II)Z")
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        field3826++;
        if (arg0 != 29) {
            this.method255(118, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIIIILtv;)V")
    public class262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class360 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class477.method2759(arg1, (byte) 79, arg0));
        this.field3809 = arg10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        field3822++;
        if (arg0 != -13265) {
            this.method262(94);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I")
    public final int method258(byte arg0) {
        field3814++;
        if (arg0 != -36) {
            this.method270(4);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;B)V")
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 != -40) {
            this.method267(null, 15);
        }
        field3811++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;I)Lbi;")
    public final class465 method267(class167 arg0, int arg1) {
        if (arg1 != 2) {
            field3831 = 24;
        }
        field3832++;
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZILqa;IILcea;)V")
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        field3808++;
        if (arg0 != -84) {
            this.method267(null, 87);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)Z")
    public final boolean method868(boolean arg0) {
        if (arg0) {
            field3821 = -0.39514688F;
        }
        field3825++;
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        field3828++;
        if (arg2) {
            method1670(null, (byte) 43);
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILqa;)V")
    public final void method255(int arg0, class167 arg1) {
        int var3 = 105 / ((arg0 + 46) / 42);
        field3812++;
    }
}
