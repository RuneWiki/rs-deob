import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class554 extends class214 {

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field7896 = 0;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field7902 = 4096;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Ltm;")
    public static class334 field7898 = new class334(20, 6);

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Z")
    public static boolean field7906 = false;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field7905;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
    public static void method3231(byte arg0) {
        if (arg0 >= 124) {
            field7898 = null;
            field7905 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field7901;
        int[] var3 = super.field3544.method3869(arg0, arg1 ^ -125);
        if (arg1 != 5) {
            method3231((byte) 24);
        }
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, -1);
            for (int var5 = 0; ~var5 > ~class626.field8787; ++var5) {
                int var6 = var4[var5];
                if (this.field7896 > var6) {
                    var3[var5] = this.field7896;
                } else if (~var6 < ~this.field7902) {
                    var3[var5] = this.field7902;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            method3232((String) null, true);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3540 = ~arg1.method1987(-6) == -2;
                }
            } else {
                this.field7902 = arg1.method1989((byte) -57);
            }
        } else {
            this.field7896 = arg1.method1989((byte) -52);
        }
        ++field7900;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public static final byte[] method3232(String arg0, boolean arg1) {
        ++field7904;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        } else {
            if (!arg1) {
                method3231((byte) -81);
            }
            int var3 = var2 + 3 & -4;
            int var4 = var3 / 4 * 3;
            if (~(var3 + -2) > ~var2 && class544.method3192(arg0.charAt(var3 + -2), -120) != -1) {
                if (var2 <= var3 - 1 || class544.method3192(arg0.charAt(var3 + -1), -113) == -1) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class5.method21(var5, -1150301404, 0, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field7899;
        if (arg1 != -256) {
            field7898 = null;
        }
        int[][] var3 = super.field3545.method2996((byte) 124, arg0);
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class626.field8787; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field7896) {
                    if (~var12 < ~this.field7902) {
                        var8[var11] = this.field7902;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field7896;
                }
                if (var13 >= this.field7896) {
                    if (var13 <= this.field7902) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field7902;
                    }
                } else {
                    var9[var11] = this.field7896;
                }
                if (~this.field7896 < ~var14) {
                    var10[var11] = this.field7896;
                } else if (var14 > this.field7902) {
                    var10[var11] = this.field7902;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 6) {
            method3233(61, -74, 80, -75, 104, 112, -18, 79, 114);
        }
        ++field7903;
        class478.field6940[class757.field10543++] = new class328(arg2, arg5, arg4, arg8, arg8, arg4, arg6, arg7, arg7, arg6, arg3, arg3, arg0, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class554() {
        super(1, false);
    }
}
