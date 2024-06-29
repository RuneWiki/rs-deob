import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class206 extends class171 {

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public int field3436 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lok;")
    public static class146 field3422 = class235.method1724(-12908, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lok;")
    public static class146 field3444 = class235.method1724(-12908, "Ausw-=hlen");

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3419 = 0;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field3449 = 0;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Lge;")
    public class149 field3427;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Lge;")
    public class149 field3437;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Ltd;")
    public class234 field3430;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Lsh;")
    public class282 field3438;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Lvi;")
    public class5 field3447;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "Z")
    public boolean field3450;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[I")
    public int[] field3445;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "[Lcj;")
    public static class311[] field3433;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "[[[I")
    public static int[][][] field3446;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 5)
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class189.field3124 * 128) {
            arg0 = class189.field3124 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class192.field3168 * 128) {
            arg2 = class192.field3168 * 128 - 1;
        }
        class180.field3020 = class109.field1750[arg3];
        class138.field2295 = class109.field1757[arg3];
        class293.field4978 = class109.field1750[arg4];
        class72.field1175 = class109.field1757[arg4];
        class82.field1311 = arg0;
        class298.field5066 = arg1;
        class287.field4923 = arg2;
        class106.field1703 = arg0 / 128;
        class175.field2932 = arg2 / 128;
        class218.field3611 = class106.field1703 - class132.field2230;
        if (class218.field3611 < 0) {
            class218.field3611 = 0;
        }
        class189.field3129 = class175.field2932 - class132.field2230;
        if (class189.field3129 < 0) {
            class189.field3129 = 0;
        }
        class43.field740 = class132.field2230 + class106.field1703;
        if (class43.field740 > class189.field3124) {
            class43.field740 = class189.field3124;
        }
        class36.field664 = class175.field2932 + class132.field2230;
        if (class36.field664 > class192.field3168) {
            class36.field664 = class192.field3168;
        }
        short var15;
        if (class271.field4640) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class132.field2230 + class132.field2230 + 2; var16++) {
            for (int var17 = 0; var17 < class132.field2230 + class132.field2230 + 2; var17++) {
                int var18 = (var16 - class132.field2230 << 7) - (class82.field1311 & 0x7F);
                int var19 = (var17 - class132.field2230 << 7) - (class287.field4923 & 0x7F);
                int var20 = class106.field1703 + var16 - class132.field2230;
                int var21 = class175.field2932 + var17 - class132.field2230;
                if (var20 >= 0 && var21 >= 0 && var20 < class189.field3124 && var21 < class192.field3168) {
                    int var22;
                    if (class297.field5051 == null) {
                        var22 = class300.field5082[0][var20][var21] + 128 - class298.field5066;
                    } else {
                        var22 = class297.field5051[0][var20][var21] + 128 - class298.field5066;
                    }
                    int var23 = class300.field5082[3][var20][var21] - class298.field5066 - 1000;
                    class102.field1645[var16][var17] = class41.method294(var18, var23, var22, var19, var15);
                } else {
                    class102.field1645[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class132.field2230 + class132.field2230 + 1; var24++) {
            for (int var25 = 0; var25 < class132.field2230 + class132.field2230 + 1; var25++) {
                class202.field3364[var24][var25] = class102.field1645[var24][var25] || class102.field1645[var24 + 1][var25] || class102.field1645[var24][var25 + 1] || class102.field1645[var24 + 1][var25 + 1];
            }
        }
        class216.field3565 = arg6;
        class156.field2616 = arg7;
        class203.field3380 = arg8;
        class56.field994 = arg9;
        class133.field2240 = arg10;
        class92.method636();
        if (class89.field1426 != null) {
            class279.method2025(true);
            class298.method2113(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class271.field4640) {
                class212.field3508 = false;
                class140.method1033(0, 0, -5);
                class231.method1693((float[]) null);
                class53.method439();
            }
            class279.method2025(false);
        }
        class298.method2113(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)V", line = 136)
    public static final void method1560(int arg0, byte arg1, int arg2) {
        if (class98.field1598 != arg2) {
            class210.field3485 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class210.field3485[var3] = (var3 << 12) / arg2;
            }
            class98.field1598 = arg2;
            class218.field3595 = arg2 - 1;
            class26.field460 = arg2 == 64 ? 2048 : 4096;
        }
        int var4 = 115 % ((-arg1 - 41) / 63);
        field3441++;
        if (class104.field1676 == arg0) {
            return;
        }
        if (class98.field1598 == arg0) {
            class312.field5326 = class210.field3485;
        } else {
            class312.field5326 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class312.field5326[var5] = (var5 << 12) / arg0;
            }
        }
        class259.field4297 = arg0 - 1;
        class104.field1676 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 183)
    public static final void method1561(boolean arg0) {
        int var1 = class63.field1091;
        field3440++;
        if (!arg0) {
            return;
        }
        int var2 = class72.field1173 - class148.field2518 - var1;
        int var3 = class310.field5284;
        int var4 = class248.field4170 - var3 - class56.field997;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class18.field358 != null) {
                var7 = class18.field358;
            } else if (class144.field2418 == null) {
                var7 = class232.field3876.field2162;
            } else {
                var7 = class144.field2418;
            }
            if (class144.field2418 == var7) {
                Insets var8 = class144.field2418.getInsets();
                var5 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var6, var1, class248.field4170);
            }
            if (var3 > 0) {
                var9.fillRect(var5, var6, class72.field1173, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class72.field1173 + var5 - var2, var6, var2, class248.field4170);
            }
            if (var4 > 0) {
                var9.fillRect(var5, class248.field4170 + var6 - var4, class72.field1173, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)Z", line = 271)
    public static final boolean method1562(int arg0, int arg1) {
        if (arg1 >= -3) {
            field3429 = -107;
        }
        field3423++;
        return (arg0 & 0x3CFE9F) >> 21 != 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLr;)Lok;", line = 287)
    public static final class146 method1563(byte arg0, class264 arg1) {
        field3439++;
        if (class268.method1947(123, client.method1789(arg1)) == 0) {
            return null;
        }
        if (arg0 != 0) {
            method1562(61, -11);
        }
        if (arg1.field4509 == null || arg1.field4509.method1096((byte) -89).method1094((byte) -57) == 0) {
            return class128.field2096 ? class117.field1879 : null;
        } else {
            return arg1.field4509;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lac;", line = 312)
    public static final class158 method1564(int arg0, int arg1, int arg2) {
        if (arg2 >= -97) {
            field3446 = (int[][][]) ((int[][][]) null);
        }
        class158 var3 = (class158) class194.field3235.method810((byte) -121, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class158(arg1, arg0);
            class194.field3235.method805(var3, var3.field2883, 101);
        }
        field3424++;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V", line = 331)
    public static void method1565(int arg0) {
        field3446 = (int[][][]) null;
        field3422 = null;
        if (arg0 != -4689) {
            method1561(false);
        }
        field3433 = null;
        field3444 = null;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V", line = 368)
    public final void method1566(int arg0) {
        int var2 = this.field3434;
        field3442++;
        if (this.field3447 != null) {
            class5 var5 = this.field3447.method36((byte) -73);
            if (var5 == null) {
                this.field3432 = 0;
                this.field3434 = -1;
                this.field3435 = 0;
                this.field3421 = 0;
                this.field3445 = null;
            } else {
                this.field3434 = var5.field104;
                this.field3421 = var5.field49;
                this.field3445 = var5.field75;
                this.field3432 = var5.field90;
                this.field3435 = var5.field99 * 128;
            }
        } else if (this.field3438 != null) {
            int var3 = class234.method1714(this.field3438, (byte) 63);
            if (var2 != var3) {
                this.field3434 = var3;
                class301 var4 = this.field3438.field4838;
                if (var4.field5092 != null) {
                    var4 = var4.method2135(-1);
                }
                if (var4 == null) {
                    this.field3435 = 0;
                } else {
                    this.field3435 = var4.field5159 * 128;
                }
            }
        } else if (this.field3430 != null) {
            this.field3434 = class267.method1940(0, this.field3430);
            this.field3435 = this.field3430.field3914 * 128;
        }
        if (arg0 != 11279) {
            method1562(60, 8);
        }
        if (this.field3434 != var2 && this.field3437 != null) {
            class82.field1315.method1331(this.field3437);
            this.field3437 = null;
        }
    }
}
