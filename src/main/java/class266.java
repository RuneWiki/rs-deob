import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class266 {

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "[I")
    private int[] field3655 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Lrg;")
    public class594 field3659;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Z")
    public static boolean field3658;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[S")
    private short[] field3647;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[S")
    private short[] field3650;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "[S")
    private short[] field3660;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BZLjava/lang/String;ZLwd;)V")
    public static final void method1610(byte arg0, boolean arg1, String arg2, boolean arg3, class248 arg4) {
        field3652++;
        if (arg0 != -118) {
            field3658 = false;
        }
        if (!arg1) {
            class663.method3747(3, arg2, arg0 ^ 0x742A, arg4);
            return;
        }
        if (class248.field3420.startsWith("win") && arg4.field3404) {
            String var5 = null;
            if (class627.field8991 != null) {
                var5 = class627.field8991.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class477 var6 = class663.method3747(0, arg2, -29792, arg4);
                class602.field8681 = arg4;
                class37.field704 = arg2;
                class552.field8018 = var6;
                return;
            }
        }
        if (class248.field3420.startsWith("mac")) {
            String var7 = null;
            if (class627.field8991 != null) {
                var7 = class627.field8991.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class663.method3747(1, arg2, -29792, arg4);
                return;
            }
        }
        class663.method3747(2, arg2, -29792, arg4);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILun;)V")
    public final void method1611(int arg0, class389 arg1) {
        field3654++;
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.method1611(54, null);
                    return;
                }
            }
            this.method1617(arg1, (byte) -121, var3);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Lkk;")
    public final class173 method1612(int arg0) {
        field3646++;
        class173[] var2 = new class173[5];
        int var3 = 0;
        if (arg0 > -37) {
            return null;
        }
        class668 var4 = this.field3659.field8580;
        synchronized (this.field3659.field8580) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3655[var5] != -1) {
                    var2[var3++] = class110.method797((byte) 104, 0, this.field3659.field8580, this.field3655[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2137 < 13) {
                var2[var6].method1097(2, (byte) -39);
            }
        }
        class173 var7 = new class173(var2, var3);
        if (this.field3647 != null) {
            for (int var8 = 0; var8 < this.field3647.length; var8++) {
                var7.method1083(this.field3647[var8], this.field3650[var8], (byte) -120);
            }
        }
        if (this.field3651 != null) {
            for (int var9 = 0; var9 < this.field3651.length; var9++) {
                var7.method1090(this.field3651[var9], (byte) 18, this.field3660[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Z")
    public final boolean method1613(boolean arg0) {
        field3645++;
        if (this.field3653 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            return false;
        }
        class668 var3 = this.field3659.field8580;
        synchronized (this.field3659.field8580) {
            for (int var4 = 0; var4 < this.field3653.length; var4++) {
                if (!this.field3659.field8580.method3783(this.field3653[var4], 0, 32069)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -100 % ((arg6 - 84) / 37);
        if (arg0 != 8 && arg0 != 16) {
            class433 var8 = class281.field3808[arg5][arg1][arg4];
            if (var8 == null) {
                var8 = new class433(arg5);
            }
            if (arg0 == 1) {
                var8.field6215 = (short) arg3;
                var8.field6206 = (short) arg2;
            } else if (arg0 == 2) {
                var8.field6213 = (short) arg2;
                var8.field6208 = (short) arg3;
            }
            if (class463.field6471) {
                class188.method1165((byte) 61);
            }
        } else if (arg0 == 8) {
            int var9 = arg1 << class295.field3981;
            int var10 = class454.field6392 + var9;
            int var11 = arg4 << class295.field3981;
            int var12 = class454.field6392 + var11;
            int var13 = class399.field5631[arg5].method437(97, arg4, arg1);
            int var14 = class399.field5631[arg5].method437(101, arg4 + 1, arg1 + 1);
            class683.field9755[class133.field1693++] = new class568(arg0, arg5, var9, var10, var10, var9, var13, var14, var14 - arg3, -arg3 + var13, var11, var12, var12, var11);
        } else {
            int var15 = (arg1 << class295.field3981) + class454.field6392;
            int var16 = var15 - class454.field6392;
            int var17 = arg4 << class295.field3981;
            int var18 = class454.field6392 + var17;
            int var19 = class399.field5631[arg5].method437(89, arg4, arg1 + 1);
            int var20 = class399.field5631[arg5].method437(112, arg4 + 1, arg1);
            class683.field9755[class133.field1693++] = new class568(arg0, arg5, var15, var16, var16, var15, var19, var20, var20 - arg3, -arg3 + var19, var17, var18, var18, var17);
        }
        field3657++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
    public final boolean method1615(byte arg0) {
        field3648++;
        boolean var2 = true;
        class668 var3 = this.field3659.field8580;
        synchronized (this.field3659.field8580) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3655[var4] != -1 && !this.field3659.field8580.method3783(this.field3655[var4], 0, 32069)) {
                    var2 = false;
                }
            }
            int var5 = 97 % ((-arg0 - 25) / 37);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Lkk;")
    public final class173 method1616(byte arg0) {
        field3649++;
        if (this.field3653 == null) {
            return null;
        }
        class173[] var2 = new class173[this.field3653.length];
        class668 var3 = this.field3659.field8580;
        synchronized (this.field3659.field8580) {
            if (arg0 > -80) {
                this.method1613(false);
            }
            int var4 = 0;
            while (true) {
                if (var4 >= this.field3653.length) {
                    break;
                }
                var2[var4] = class110.method797((byte) 104, 0, this.field3659.field8580, this.field3653[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3653.length; var5++) {
            if (var2[var5].field2137 < 13) {
                var2[var5].method1097(2, (byte) -39);
            }
        }
        class173 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class173(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3647 != null) {
            for (int var7 = 0; var7 < this.field3647.length; var7++) {
                var6.method1083(this.field3647[var7], this.field3650[var7], (byte) -122);
            }
        }
        if (this.field3651 != null) {
            for (int var8 = 0; var8 < this.field3651.length; var8++) {
                var6.method1090(this.field3651[var8], (byte) 20, this.field3660[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lun;BI)V")
    private final void method1617(class389 arg0, byte arg1, int arg2) {
        field3656++;
        if (arg2 == 1) {
            arg0.method2229(255);
        } else if (arg2 == 2) {
            int var4 = arg0.method2229(255);
            this.field3653 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3653[var5] = arg0.method2260(-49);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var8 = arg0.method2229(255);
                this.field3647 = new short[var8];
                this.field3650 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3647[var9] = (short) arg0.method2260(-42);
                    this.field3650[var9] = (short) arg0.method2260(-32);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method2229(255);
                this.field3660 = new short[var6];
                this.field3651 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3651[var7] = (short) arg0.method2260(-26);
                    this.field3660[var7] = (short) arg0.method2260(-54);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field3655[arg2 - 60] = arg0.method2260(-80);
            }
        }
        if (arg1 >= -63) {
            this.method1616((byte) 81);
        }
    }
}
