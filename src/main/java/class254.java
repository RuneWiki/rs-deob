import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class254 {

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    private int field3660 = -1;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "Z")
    public boolean field3673 = true;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Lqg;")
    private class321 field3667;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "Lab;")
    private class471 field3669;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    private int field3659;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Lce;")
    private class201 field3665;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "Lvq;")
    private class320 field3674;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "Ljp;")
    private class236 field3668;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Lgf;")
    public static class180 field3662 = new class180("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field3677 = 500;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "Lvp;")
    public static class123 field3676 = new class123(68, 2);

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "F")
    public static float field3672;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I")
    public static final int method1614(int arg0, int arg1) {
        if (arg0 != 2794) {
            method1614(-50, -41);
        }
        field3657++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method1615(int arg0) {
        this.method1619(this.field3665, (byte) 9, this.field3659);
        if (arg0 == 5123) {
            field3670++;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[BB)V")
    public final void method1616(int arg0, int arg1, byte[] arg2, byte arg3) {
        this.field3674.method760(arg2, arg1, 96, this.field3667.method2079((byte) 116, arg1) * arg0);
        field3663++;
        this.method1619(this.field3674, (byte) 9, arg0);
        if (arg3 < 86) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
    public static void method1617(boolean arg0) {
        field3662 = null;
        if (!arg0) {
            field3672 = -0.5704352F;
        }
        field3676 = null;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)V")
    private final void method1618(boolean arg0) {
        field3666++;
        if (!this.field3673) {
            return;
        }
        this.field3673 = false;
        byte[] var2 = this.field3669.field6930;
        if (!arg0) {
            this.method1616(29, -82, null, (byte) 6);
        }
        byte[] var3 = class408.field6014;
        int var4 = 0;
        int var5 = this.field3669.field6919;
        int var6 = this.field3664 + (this.field3669.field6919 * this.field3671);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3668 != null && this.field3660 == var4) {
            this.field3673 = false;
            return;
        }
        this.field3660 = var4;
        int var8 = 0;
        int var9 = this.field3671 * var5 + this.field3664;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field3669.field6919 - 128;
        }
        if (this.field3668 == null) {
            this.field3668 = new class236(this.field3667, 3553, 6406, 128, 128, false, class408.field6014, 6406, false);
            this.field3668.method1534(false, 99, false);
            this.field3668.method2673(-81, true);
        } else {
            this.field3668.method1533(0, false, class408.field6014, 6406, 128, 0, arg0, 0, 0, 128);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lce;BI)V")
    private final void method1619(class201 arg0, byte arg1, int arg2) {
        field3658++;
        if (arg1 != 9) {
            this.method1618(true);
        }
        if (arg2 != 0) {
            this.method1618(true);
            this.field3667.method2042(this.field3668, arg1 ^ 0x9);
            this.field3667.method2086(arg2, arg0, 0, 4, 0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(JB)V")
    public static final void method1620(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 <= 74) {
            method1617(true);
        }
        field3661++;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lqg;Lab;Lpp;IIIII)V")
    public class254(class321 arg0, class471 arg1, class267 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3664 = arg6;
        this.field3671 = arg7;
        this.field3667 = arg0;
        this.field3669 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field532 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3879[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3659 = var10;
        if (var10 <= 0) {
            this.field3668 = null;
        } else {
            class303 var14 = new class303(var10 * 2);
            if (this.field3667.field4850) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field532 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3879[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1874(var23[var24] & 0xFFFF, (byte) -110);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field532 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3879[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1863((byte) -122, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3665 = this.field3667.method2012(5123, var14.field4333, false, (byte) 16, var14.field4326);
            this.field3674 = new class320(this.field3667, 5123, null, 1);
        }
    }
}
