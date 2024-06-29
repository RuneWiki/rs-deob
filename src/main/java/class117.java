import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class117 extends class162 {

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "[I")
    private int[] field1769;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "[I")
    private int[] field1770;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lda;")
    private class198 field1777;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Lda;")
    private class198 field1779;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Lda;")
    private class198 field1774;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "[Lda;")
    private class198[] field1787;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Lkk;")
    public static class254 field1772 = null;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field1778 = -1;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "[Z")
    public static boolean[] field1771;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZII)V")
    public static final void method756(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1783++;
            if (class235.method1632(16, arg1)) {
                class118.method766(0, arg2, class283.field4741[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZDLvb;IILfa;ZI)[I")
    public final int[] method757(boolean arg0, double arg1, class61 arg2, int arg3, int arg4, class273 arg5, boolean arg6, int arg7) {
        if (arg3 != 28607) {
            field1788 = -58;
        }
        field1776++;
        class268.method1846(arg1, (byte) 45);
        class311.field5031 = arg2;
        class15.field215 = arg5;
        class218.method1523((byte) -70, arg7, arg4);
        int[] var10 = new int[arg4 * arg7];
        for (int var11 = 0; var11 < this.field1787.length; var11++) {
            this.field1787[var11].method1373(arg4, arg7, -2);
        }
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var14 = -1;
            var13 = arg4 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1779.field3139) {
                int[] var18 = this.field1779.method32(true, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1779.method200(var16, -2);
                var19 = var22[1];
                var20 = var22[2];
                var21 = var22[0];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                int var26 = class82.field1299[var24];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class82.field1299[var25];
                int var28 = var20[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class82.field1299[var28];
                var10[var15++] = (var26 << 16) + var29 + (var27 << 8);
                if (arg6) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1787.length; var17++) {
            this.field1787[var17].method696(128);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILfa;Lvb;)Z")
    public final boolean method758(int arg0, class273 arg1, class61 arg2) {
        field1775++;
        if (class78.field1241 > 0) {
            for (int var4 = 0; var4 < this.field1770.length; var4++) {
                if (!arg1.method1898(class78.field1241, this.field1770[var4], true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1770.length; var5++) {
                if (!arg1.method1874(this.field1770[var5], 3883)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1769.length; var6++) {
            if (!arg2.method377(this.field1769[var6], true)) {
                return false;
            }
        }
        if (arg0 != 1) {
            field1772 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field1782++;
        if (arg0 != -1) {
            method763(false, -23, (String) null, -124, 72);
        }
        if (class190.field2937 != null) {
            class40 var1 = class190.field2937;
            synchronized (class190.field2937) {
                class190.field2937 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfa;ZLvb;IIDB)Lmk;")
    public final class108 method760(class273 arg0, boolean arg1, class61 arg2, int arg3, int arg4, double arg5, byte arg6) {
        field1785++;
        class268.method1846(arg5, (byte) 120);
        class311.field5031 = arg2;
        class15.field215 = arg0;
        class218.method1523((byte) -70, arg3, arg4);
        class108 var9 = new class108(arg4, arg3);
        for (int var10 = 0; var10 < this.field1787.length; var10++) {
            this.field1787[var10].method1373(arg4, arg3, -2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field1779.field3139) {
                int[] var19 = this.field1779.method32(true, var12);
                var16 = var19;
                var17 = var19;
                var18 = var19;
            } else {
                int[][] var15 = this.field1779.method200(var12, -2);
                var16 = var15[2];
                var17 = var15[1];
                var18 = var15[0];
            }
            int[] var20;
            if (this.field1774.field3139) {
                var20 = this.field1774.method32(true, var12);
            } else {
                var20 = this.field1774.method200(var12, -2)[0];
            }
            for (int var21 = arg4 - 1; var21 >= 0; var21--) {
                int var22 = var17[var21] >> 4;
                int var23 = var18[var21] >> 4;
                int var24 = var16[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                int var25 = class82.field1299[var23];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = class82.field1299[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class82.field1299[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var9.field488[var11++] = (var26 << 8) + ((var28 << 24) + (var25 << 16)) + var27;
                if (arg1) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1787.length; var13++) {
            this.field1787[var13].method696(128);
        }
        int var14 = 93 / ((-arg6 - 68) / 56);
        return var9;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1771 = null;
        if (arg0 >= -40) {
            method756(true, -19, -100);
        }
        field1772 = null;
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    public static final void method762(int arg0) {
        field1789++;
        class73.method466(24521);
        class25.method151(true);
        class302.method2084(false);
        class181.method1208(-95);
        class165.method1109(true);
        class161.method1072((byte) 51);
        class96.method615((byte) -9);
        class55.method324(6);
        class181.method1204(2);
        class66.method420(arg0 ^ 0xFFFFFF00);
        class66.method421(arg0 + 1551136633);
        class299.method2072(0);
        class27.method162(0);
        class8.method46((byte) 116);
        class169.method1118(0);
        class2.method8(107);
        class177.method1191((byte) 29);
        class225.method1570(19472);
        class154.method1011(1);
        if (~class169.field2630 != arg0) {
            for (int var1 = 0; var1 < class183.field2837.length; var1++) {
                class183.field2837[var1] = null;
            }
            class175.field2737 = 0;
        }
        class277.method1929(32768);
        class195.method1355(arg0 + 1);
        class248.method1728(-12649);
        class76.method500(123);
        class1.field4.method145(arg0 - 65);
        ((class266) class172.field2670).method1840(255);
        class294.field4843.method1338(false);
        class31.field397.method1878(-37);
        class265.field4361.method1878(-27);
        class190.field2931.method1878(arg0 - 123);
        class9.field119.method1878(arg0 - 55);
        class145.field2296.method1878(arg0 ^ 0x7F);
        class274.field4518.method1878(-25);
        class120.field1846.method1878(-70);
        class3.field22.method1878(arg0 - 50);
        class173.field2691.method1878(-49);
        class66.field977.method1878(arg0 - 48);
        class119.field1835.method1878(-49);
        class11.field150.method145(arg0 - 75);
        class37.field480.method145(-116);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class117() {
        this.field1769 = new int[0];
        this.field1770 = new int[0];
        this.field1777 = new class10(0);
        this.field1777.field3142 = 1;
        this.field1779 = new class10();
        this.field1779.field3142 = 1;
        this.field1774 = new class10();
        this.field1787 = new class198[] { this.field1779, this.field1774, this.field1777 };
        this.field1774.field3142 = 1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lma;)V")
    public class117(class202 arg0) {
        int var2 = arg0.method1420((byte) 0);
        this.field1787 = new class198[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class198 var16 = class248.method1727(0, arg0);
            if (var16.method1368(-1) >= 0) {
                var3++;
            }
            if (var16.method700((byte) -45) >= 0) {
                var4++;
            }
            int var17 = var16.field3146.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1420((byte) 0);
            }
            this.field1787[var6] = var16;
        }
        this.field1769 = new int[var4];
        this.field1770 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class198 var11 = this.field1787[var9];
            int var12 = var11.field3146.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3146[var13] = this.field1787[var5[var9][var13]];
            }
            int var14 = var11.method1368(-1);
            int var15 = var11.method700((byte) 21);
            if (var14 > 0) {
                this.field1770[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1769[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1779 = this.field1787[arg0.method1420((byte) 0)];
        Object var10 = null;
        this.field1774 = this.field1787[arg0.method1420((byte) 0)];
        this.field1777 = this.field1787[arg0.method1420((byte) 0)];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZILjava/lang/String;II)V")
    public static final void method763(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
        class254 var5 = class79.method529(arg4, 76, arg3);
        field1780++;
        if (var5 == null) {
            return;
        }
        if (var5.field4032 != null) {
            class298 var6 = new class298();
            var6.field4906 = var5;
            var6.field4903 = arg1;
            var6.field4902 = arg2;
            var6.field4905 = var5.field4032;
            class126.method844(200000, var6);
        }
        boolean var7 = arg0;
        if (var5.field4060 > 0) {
            var7 = class109.method708(var5, true);
        }
        if (!var7 || !client.method1085(var5).method1647((byte) -39, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class72.field1051++;
            class276.field4572.method1391(0, 232);
            class276.field4572.method1425(arg4, (byte) -102);
            class276.field4572.method1412(arg3, !arg0);
        }
        if (arg1 == 2) {
            class276.field4572.method1391(0, 237);
            class176.field2745++;
            class276.field4572.method1425(arg4, (byte) -120);
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 3) {
            class276.field4572.method1391(0, 81);
            class114.field1718++;
            class276.field4572.method1425(arg4, (byte) -127);
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 4) {
            class76.field1190++;
            class276.field4572.method1391(0, 27);
            class276.field4572.method1425(arg4, (byte) -114);
            class276.field4572.method1412(arg3, !arg0);
        }
        if (arg1 == 5) {
            class276.field4572.method1391(0, 183);
            class274.field4516++;
            class276.field4572.method1425(arg4, (byte) -115);
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 6) {
            class276.field4572.method1391(0, 231);
            class276.field4572.method1425(arg4, (byte) -101);
            class130.field2006++;
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 7) {
            class8.field83++;
            class276.field4572.method1391(0, 242);
            class276.field4572.method1425(arg4, (byte) -98);
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 8) {
            class276.field4572.method1391(0, 133);
            class47.field638++;
            class276.field4572.method1425(arg4, (byte) -112);
            class276.field4572.method1412(arg3, !arg0);
        }
        if (arg1 == 9) {
            class276.field4572.method1391(0, 221);
            class145.field2269++;
            class276.field4572.method1425(arg4, (byte) -103);
            class276.field4572.method1412(arg3, false);
        }
        if (arg1 == 10) {
            class295.field4849++;
            class276.field4572.method1391(0, 48);
            class276.field4572.method1425(arg4, (byte) -108);
            class276.field4572.method1412(arg3, !arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(DIZILvb;Lfa;I)Lea;")
    public final class38 method764(double arg0, int arg1, boolean arg2, int arg3, class61 arg4, class273 arg5, int arg6) {
        field1786++;
        class268.method1846(arg0, (byte) 123);
        class311.field5031 = arg4;
        class15.field215 = arg5;
        class218.method1523((byte) -70, arg6, arg3);
        class38 var9 = new class38(arg3, arg6);
        for (int var10 = 0; var10 < this.field1787.length; var10++) {
            this.field1787[var10].method1373(arg3, arg6, -2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field1779.field3139) {
                int[] var15 = this.field1779.method32(true, var12);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field1779.method200(var12, -2);
                var16 = var19[0];
                var17 = var19[1];
                var18 = var19[2];
            }
            if (arg2) {
                var11 = var12;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var18[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class82.field1299[var23];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class82.field1299[var22];
                int var26 = class82.field1299[var21];
                var9.field488[var11++] = (var25 << 16) + (var26 << 8) + var24;
                if (arg2) {
                    var11 += arg3 - 1;
                }
            }
        }
        int var13 = -13 % ((4 - arg1) / 62);
        for (int var14 = 0; var14 < this.field1787.length; var14++) {
            this.field1787[var14].method696(128);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
    public static final void method765(int arg0, int arg1) {
        class97.field1437.method147(arg1, (byte) -116);
        field1781++;
        if (arg0 <= 116) {
            method756(false, 111, 12);
        }
    }
}
