import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class101 extends class155 {

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[I")
    private int[] field1597;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "[I")
    private int[] field1604;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Ljj;")
    private class182 field1614;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Ljj;")
    private class182 field1615;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Ljj;")
    private class182 field1616;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "[Ljj;")
    private class182[] field1602;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
    public static volatile boolean field1603 = true;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Z")
    public static boolean field1601 = false;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lka;")
    public static class144 field1612;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "Lpe;")
    public static class173 field1599;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[I")
    public static int[] field1605;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILaj;DZLve;)Lkh;")
    public final class266 method713(int arg0, int arg1, int arg2, class151 arg3, double arg4, boolean arg5, class198 arg6) {
        field1598++;
        class15.method86(arg4, true);
        class197.field3182 = arg3;
        class195.field3155 = arg6;
        if (arg2 != -1) {
            this.method720((byte) 63, -5, true, (class151) null, (class198) null, -43, -0.56100973736244D, false);
        }
        class145.method1074(arg1, arg0, (byte) 92);
        class266 var9 = new class266(arg0, arg1);
        for (int var10 = 0; var10 < this.field1602.length; var10++) {
            this.field1602[var10].method1324(-256, arg1, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1615.field2896) {
                int[] var14 = this.field1615.method153(false, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1615.method157((byte) -121, var12);
                var17 = var18[2];
                var16 = var18[1];
                var15 = var18[0];
            }
            int[] var19;
            if (this.field1616.field2896) {
                var19 = this.field1616.method153(false, var12);
            } else {
                var19 = this.field1616.method157((byte) 36, var12)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                int var22 = var17[var20] >> 4;
                int var23 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class121.field2030[var23];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class121.field2030[var21];
                int var26 = class121.field2030[var22];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var9.field1516[var11++] = (var27 << 24) + (var24 << 8) + (var25 << 16) + var26;
                if (arg5) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1602.length; var13++) {
            this.field1602[var13].method462(arg2 ^ 0xFFFFFFDA);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lve;ILaj;)Z")
    public final boolean method714(class198 arg0, int arg1, class151 arg2) {
        int var4 = 59 / ((11 - arg1) / 50);
        field1613++;
        if (class142.field2348 <= 0) {
            for (int var5 = 0; var5 < this.field1604.length; var5++) {
                if (!arg2.method1118((byte) 32, this.field1604[var5])) {
                    return false;
                }
            }
        } else {
            for (int var6 = 0; var6 < this.field1604.length; var6++) {
                if (!arg2.method1136(class142.field2348, this.field1604[var6], true)) {
                    return false;
                }
            }
        }
        for (int var7 = 0; var7 < this.field1597.length; var7++) {
            if (!arg0.method796(false, this.field1597[var7])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method715(byte arg0) {
        field1612 = null;
        if (arg0 < 36) {
            field1608 = -124;
        }
        field1605 = null;
        field1599 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Laj;DZILve;IB)Lbj;")
    public final class92 method716(class151 arg0, double arg1, boolean arg2, int arg3, class198 arg4, int arg5, byte arg6) {
        class15.method86(arg1, true);
        class195.field3155 = arg4;
        field1606++;
        class197.field3182 = arg0;
        class145.method1074(arg5, arg3, (byte) 92);
        class92 var9 = new class92(arg3, arg5);
        if (arg6 != 40) {
            method715((byte) 110);
        }
        for (int var10 = 0; var10 < this.field1602.length; var10++) {
            this.field1602[var10].method1324(-256, arg5, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1615.field2896) {
                int[] var14 = this.field1615.method153(false, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1615.method157((byte) 25, var12);
                var16 = var18[1];
                var15 = var18[0];
                var17 = var18[2];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class121.field2030[var20];
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var17[var19] >> 4;
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class121.field2030[var22];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class121.field2030[var23];
                var9.field1516[var11++] = (var21 << 16) + (var24 << 8) + var25;
                if (arg2) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1602.length; var13++) {
            this.field1602[var13].method462(121);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
    public static final void method717(int arg0) {
        class237.field3992.method94(34);
        if (arg0 != 23825) {
            method718(23, true, 62, -17);
        }
        class54.field947.method94(34);
        field1607++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method718(int arg0, boolean arg1, int arg2, int arg3) {
        field1600++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg0 != 48) {
                method718(-20, false, -102, -44);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg2;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IC)Z")
    public static final boolean method719(int arg0, char arg1) {
        if (arg0 >= -79) {
            return false;
        }
        field1609++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class169.field2742;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIZLaj;Lve;IDZ)[I")
    public final int[] method720(byte arg0, int arg1, boolean arg2, class151 arg3, class198 arg4, int arg5, double arg6, boolean arg7) {
        class15.method86(arg6, true);
        class195.field3155 = arg4;
        int[] var10 = new int[arg1 * arg5];
        field1611++;
        class197.field3182 = arg3;
        class145.method1074(arg5, arg1, (byte) 92);
        if (arg0 != -28) {
            this.method714((class198) null, -9, (class151) null);
        }
        for (int var11 = 0; var11 < this.field1602.length; var11++) {
            this.field1602[var11].method1324(arg0 - 228, arg5, arg1);
        }
        int var12;
        byte var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg1 - 1;
        } else {
            var12 = arg1;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1615.field2896) {
                int[] var18 = this.field1615.method153(false, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1615.method157((byte) 11, var16);
                var20 = var22[0];
                var19 = var22[1];
                var21 = var22[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var21[var23] >> 4;
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class121.field2030[var25];
                int var28 = class121.field2030[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class121.field2030[var26];
                var10[var15++] = (var29 << 16) + (var27 << 8) + var28;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1602.length; var17++) {
            this.field1602[var17].method462(100);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class101() {
        this.field1597 = new int[0];
        this.field1604 = new int[0];
        this.field1614 = new class258(0);
        this.field1614.field2913 = 1;
        this.field1615 = new class258();
        this.field1615.field2913 = 1;
        this.field1616 = new class258();
        this.field1602 = new class182[] { this.field1615, this.field1616, this.field1614 };
        this.field1616.field2913 = 1;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lab;)V")
    public class101(class249 arg0) {
        int var2 = arg0.method1802((byte) 119);
        int var3 = 0;
        this.field1602 = new class182[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class182 var16 = class147.method1087(arg0, false);
            if (var16.method461(-123) >= 0) {
                var3++;
            }
            if (var16.method1321(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field2909.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1802((byte) 38);
            }
            this.field1602[var6] = var16;
        }
        this.field1604 = new int[var3];
        this.field1597 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class182 var11 = this.field1602[var9];
            int var12 = var11.field2909.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2909[var13] = this.field1602[var5[var9][var13]];
            }
            int var14 = var11.method461(-123);
            int var15 = var11.method1321(-1);
            if (var14 > 0) {
                this.field1604[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1597[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field1615 = this.field1602[arg0.method1802((byte) 79)];
        this.field1616 = this.field1602[arg0.method1802((byte) 78)];
        this.field1614 = this.field1602[arg0.method1802((byte) 63)];
    }
}
