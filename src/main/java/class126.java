import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class126 extends class18 {

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "[I")
    private int[] field1988;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "[I")
    private int[] field1992;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "Loj;")
    private class160 field1982;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Loj;")
    private class160 field1981;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Loj;")
    private class160 field1991;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "[Loj;")
    private class160[] field1996;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "[Z")
    public static boolean[] field1995 = new boolean[100];

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[Lre;")
    public static class228[] field1986;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IDZLwk;ZLhc;II)[I")
    public final int[] method873(int arg0, double arg1, boolean arg2, class279 arg3, boolean arg4, class235 arg5, int arg6, int arg7) {
        class286.method1918(arg1, (byte) 84);
        class199.field3129 = arg3;
        if (arg6 != -16005) {
            return null;
        }
        int[] var10 = new int[arg0 * arg7];
        field1990++;
        class260.field4158 = arg5;
        class201.method1358(arg0, arg7, (byte) 113);
        for (int var11 = 0; var11 < this.field1996.length; var11++) {
            this.field1996[var11].method1088(false, arg7, arg0);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = arg7 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg7;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1981.field2494) {
                int[] var18 = this.field1981.method1(var16, (byte) 57);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1981.method3(var16, true);
                var19 = var22[2];
                var21 = var22[1];
                var20 = var22[0];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class56.field928[var25];
                int var27 = var19[var23] >> 4;
                int var28 = class56.field928[var24];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class56.field928[var27];
                var10[var15++] = (var28 << 16) + (var26 << 8) + var29;
                if (arg2) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1996.length; var17++) {
            this.field1996[var17].method1086(-121);
        }
        return var10;
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method874(int arg0) {
        String var1;
        if (class73.field1227 == 1 && class128.field2018 < 2) {
            var1 = class137.field2109 + class57.field945 + class243.field3951 + " ->";
        } else if (class122.field1960 && class128.field2018 < 2) {
            var1 = class37.field518 + class57.field945 + class190.field2950 + " ->";
        } else if (class244.field3975 && class106.field1764[81] && class128.field2018 > 2) {
            var1 = class179.method1214(class128.field2018 - 2, -1);
        } else {
            var1 = class179.method1214(class128.field2018 - 1, -1);
        }
        if (arg0 != 9403) {
            return null;
        }
        if (class128.field2018 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class128.field2018 - 2) + class132.field2069;
        }
        field1984++;
        return var1;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static final void method875(int arg0) {
        class167.field2612.method1898((byte) 65);
        class171.field2676.method1898((byte) -1);
        field1983++;
        if (arg0 < 80) {
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwk;Lhc;I)Z")
    public final boolean method876(class279 arg0, class235 arg1, int arg2) {
        field1994++;
        if (class60.field1040 <= 0) {
            for (int var4 = 0; var4 < this.field1988.length; var4++) {
                if (!arg1.method1613(false, this.field1988[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1988.length; var5++) {
                if (!arg1.method1615(-57, class60.field1040, this.field1988[var5])) {
                    return false;
                }
            }
        }
        if (arg2 >= -13) {
            this.field1991 = null;
        }
        for (int var6 = 0; var6 < this.field1992.length; var6++) {
            if (!arg0.method1880(-257, this.field1992[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1989++;
        int var8 = class219.method1470(class90.field1568, arg7, -1, class266.field4247);
        int var9 = 125 % ((arg2 - 79) / 40);
        int var10 = class219.method1470(class90.field1568, arg4, -1, class266.field4247);
        int var11 = class219.method1470(class223.field3423, arg3, -1, class148.field2338);
        int var12 = class219.method1470(class223.field3423, arg1, -1, class148.field2338);
        int var13 = class219.method1470(class90.field1568, arg6 + arg7, -1, class266.field4247);
        int var14 = class219.method1470(class90.field1568, arg4 - arg6, -1, class266.field4247);
        for (int var15 = var8; var15 < var13; var15++) {
            class166.method1124(true, class154.field2406[var15], var12, arg0, var11);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class166.method1124(true, class154.field2406[var16], var12, arg0, var11);
        }
        int var17 = class219.method1470(class223.field3423, arg3 + arg6, -1, class148.field2338);
        int var18 = class219.method1470(class223.field3423, arg1 - arg6, -1, class148.field2338);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class154.field2406[var19];
            class166.method1124(true, var20, var17, arg0, var11);
            class166.method1124(true, var20, var18, arg5, var17);
            class166.method1124(true, var20, var12, arg0, var18);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILwk;DZBILhc;)Ljb;")
    public final class276 method878(int arg0, class279 arg1, double arg2, boolean arg3, byte arg4, int arg5, class235 arg6) {
        field1985++;
        class286.method1918(arg2, (byte) 84);
        class199.field3129 = arg1;
        class260.field4158 = arg6;
        class201.method1358(arg0, arg5, (byte) 80);
        class276 var9 = new class276(arg5, arg0);
        for (int var10 = 0; var10 < this.field1996.length; var10++) {
            this.field1996[var10].method1088(false, arg5, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1981.field2494) {
                int[] var18 = this.field1981.method1(var12, (byte) 57);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field1981.method3(var12, true);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            for (int var19 = 0; var19 != arg5; var19++) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                int var22 = var17[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class56.field928[var21];
                int var24 = class56.field928[var22];
                int var25 = class56.field928[var20];
                var9.field4393[var11++] = (var25 << 16) + (var23 << 8) + var24;
                if (arg3) {
                    var11 += arg5 - 1;
                }
            }
        }
        if (arg4 > -74) {
            this.method873(26, 0.6153430775247796D, false, (class279) null, true, (class235) null, -49, 70);
        }
        for (int var13 = 0; var13 < this.field1996.length; var13++) {
            this.field1996[var13].method1086(-107);
        }
        return var9;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method879(Component arg0, int arg1) {
        arg0.removeMouseListener(class62.field1062);
        arg0.removeMouseMotionListener(class62.field1062);
        arg0.removeFocusListener(class62.field1062);
        class22.field309 = 0;
        field1987++;
        if (arg1 != 28602) {
            method880(71);
        }
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1995 = null;
        field1986 = null;
        if (arg0 != 0) {
            method874(-91);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwk;IDIZLhc;I)Lfc;")
    public final class123 method881(class279 arg0, int arg1, double arg2, int arg3, boolean arg4, class235 arg5, int arg6) {
        class286.method1918(arg2, (byte) 60);
        field1993++;
        class260.field4158 = arg5;
        if (arg1 >= -26) {
            this.field1991 = null;
        }
        class199.field3129 = arg0;
        class201.method1358(arg3, arg6, (byte) 124);
        class123 var9 = new class123(arg6, arg3);
        for (int var10 = 0; var10 < this.field1996.length; var10++) {
            this.field1996[var10].method1088(false, arg6, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1981.field2494) {
                int[] var14 = this.field1981.method1(var12, (byte) 57);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1981.method3(var12, true);
                var15 = var18[2];
                var17 = var18[1];
                var16 = var18[0];
            }
            int[] var19;
            if (this.field1991.field2494) {
                var19 = this.field1991.method1(var12, (byte) 57);
            } else {
                var19 = this.field1991.method3(var12, true)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class56.field928[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = var15[var20] >> 4;
                int var25 = class56.field928[var22];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class56.field928[var24];
                int var27;
                if (var25 == 0 && var23 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field4393[var11++] = (var27 << 24) + (var25 << 16) + (var23 << 8) + var26;
                if (arg4) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1996.length; var13++) {
            this.field1996[var13].method1086(74);
        }
        return var9;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class126() {
        this.field1988 = new int[0];
        this.field1992 = new int[0];
        this.field1982 = new class101(0);
        this.field1982.field2492 = 1;
        this.field1981 = new class101();
        this.field1981.field2492 = 1;
        this.field1991 = new class101();
        this.field1991.field2492 = 1;
        this.field1996 = new class160[] { this.field1981, this.field1991, this.field1982 };
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lai;)V")
    public class126(class88 arg0) {
        int var2 = arg0.method633(109);
        int var3 = 0;
        this.field1996 = new class160[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class160 var16 = class52.method388(true, arg0);
            if (var16.method1087((byte) 89) >= 0) {
                var5++;
            }
            if (var16.method1090(-1) >= 0) {
                var3++;
            }
            int var17 = var16.field2489.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method633(97);
            }
            this.field1996[var6] = var16;
        }
        this.field1992 = new int[var3];
        this.field1988 = new int[var5];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class160 var11 = this.field1996[var9];
            int var12 = var11.field2489.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2489[var13] = this.field1996[var4[var9][var13]];
            }
            int var14 = var11.method1087((byte) 89);
            int var15 = var11.method1090(-1);
            if (var14 > 0) {
                this.field1988[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1992[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field1981 = this.field1996[arg0.method633(85)];
        this.field1991 = this.field1996[arg0.method633(101)];
        this.field1982 = this.field1996[arg0.method633(105)];
    }
}
