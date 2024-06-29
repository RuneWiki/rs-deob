import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class254 extends class145 {

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    private int field3620 = 2048;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field3621 = 1024;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    private int field3618 = 3072;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Lsd;")
    public static class80 field3619 = new class80(16);

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "[Lfh;")
    public static class567[] field3627 = new class567[5];

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "Z")
    public static boolean field3629 = false;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "Lkca;")
    public static class73 field3630;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient;")
    public static client field3624;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILfa;Lcq;ILjava/lang/String;IILta;IIILqf;)V")
    public static final void method1688(int arg0, class199 arg1, class402 arg2, int arg3, String arg4, int arg5, int arg6, class181 arg7, int arg8, int arg9, int arg10, class593 arg11) {
        ++field3628;
        int var12;
        if (~class236.field3384 == -5) {
            var12 = 16383 & (int) class388.field5967;
        } else {
            var12 = (int) class388.field5967 + class17.field173 & 16383;
        }
        int var13 = Math.max(arg11.field8570 / 2, arg11.field8518 / 2) - -10;
        int var14 = arg6 * arg6 - -(arg8 * arg8);
        if (var14 <= var13 * var13) {
            int var15 = class605.field8859[var12];
            int var16 = class605.field8858[var12];
            if (~class236.field3384 != -5) {
                var16 = var16 * 256 / (class34.field389 + 256);
                var15 = var15 * 256 / (class34.field389 + 256);
            }
            int var17 = arg6 * var16 + arg8 * var15 >> 14;
            int var18 = arg8 * var16 + -(arg6 * var15) >> 14;
            int var19 = arg2.method2559((byte) 6, (class433[]) null, arg4, 100);
            int var20 = var17 - var19 / arg10;
            int var21 = arg2.method2562((byte) 66, (class433[]) null, 0, 100, arg4);
            if (~(-arg11.field8570) >= ~var20 && arg11.field8570 >= var20 && ~var18 <= ~(-arg11.field8518) && arg11.field8518 >= var18) {
                arg7.method1029(0, -33, arg11.field8518 / 2 + arg9 + -arg5 - var18 + -var21, 50, arg0, arg3, arg1, 1, 0, arg11.field8570 / 2 + arg0 + var20, arg4, (class433[]) null, (int[]) null, arg9, 0, var19);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1689(byte arg0) {
        if (arg0 == -86) {
            field3619 = null;
            field3624 = null;
            field3630 = null;
            field3627 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
    public static final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3623;
        if (arg1 >= class113.field1385 && ~class4.field43 <= ~arg1) {
            int var5 = class132.method818((byte) -93, arg2, class418.field6298, class461.field6877);
            int var6 = class132.method818((byte) -93, arg4, class418.field6298, class461.field6877);
            class547.method3184(var6, 16247, arg0, arg1, var5);
        }
        if (arg3 != 0) {
            method1690(-16, 87, 58, -43, 75);
        }
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Ljava/lang/String;")
    public static final String method1691(int arg0) {
        ++field3626;
        String var1 = "www";
        if (class224.field3156 == class197.field2667) {
            var1 = "www-wtrc";
        } else if (class605.field8857 == class197.field2667) {
            var1 = "www-wtqa";
        } else if (class3.field16 == class197.field2667) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class651.field9388 != null) {
            var2 = "/p=" + class651.field9388;
        }
        return arg0 != 10000 ? null : "http://" + var1 + "." + class184.field2291.field1844 + ".com/l=" + class35.field396 + "/a=" + class448.field6686 + var2 + "/";
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 22 % ((arg0 - -46) / 45);
        this.field3620 = -this.field3621 + this.field3618;
        ++field3617;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 >= -67) {
            field3627 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1790 = ~arg2.method1177(255) == -2;
                }
            } else {
                this.field3618 = arg2.method1220(124);
            }
        } else {
            this.field3621 = arg2.method1220(-99);
        }
        ++field3615;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLkea;IZI)V")
    public static final void method1692(int arg0, byte arg1, class203 arg2, int arg3, boolean arg4, int arg5) {
        class438.field6508 = arg4;
        ++field3622;
        class22.field221 = arg0;
        if (arg1 != -60) {
            field3630 = null;
        }
        class568.field8160 = 1;
        class195.field2647 = arg2;
        class190.field2345 = 10000;
        class509.field7411 = arg3;
        class332.field4779 = arg5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field3616;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) 64);
            for (int var5 = 0; ~var5 > ~class647.field9368; ++var5) {
                var3[var5] = this.field3621 - -(var4[var5] * this.field3620 >> 12);
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field3625;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 >= -28) {
            field3619 = null;
        }
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) 96);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class647.field9368; ++var11) {
                var8[var11] = this.field3621 - -(var5[var11] * this.field3620 >> 12);
                var9[var11] = this.field3621 - -(var6[var11] * this.field3620 >> 12);
                var10[var11] = (var7[var11] * this.field3620 >> 12) + this.field3621;
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < field3627.length; ++var0) {
            field3627[var0] = new class567();
        }
        field3630 = new class73(46, 8);
    }
}
