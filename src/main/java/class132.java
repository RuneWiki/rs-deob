import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class132 extends class128 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
    public static int[] field2088 = new int[100];

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    public static int[] field2074 = new int[128];

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[I")
    public static int[] field2082 = new int[14];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2070 = "Loaded textures";

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Loi;")
    public class102 field2084;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lqj;")
    public class248 field2077;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ltc;")
    public class266 field2072;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lrj;")
    public class290 field2073;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[I")
    public static int[] field2079;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field2088 = null;
        field2079 = null;
        if (arg0 < 57) {
            field2088 = null;
        }
        field2074 = null;
        field2082 = null;
        field2070 = null;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public final void method932(int arg0) {
        this.field2077 = null;
        this.field2073 = null;
        this.field2084 = null;
        field2075++;
        int var2 = -89 % ((-arg0 - 62) / 40);
        this.field2072 = null;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static final void method933(int arg0) {
        class176.field2880 = new class246();
        field2092++;
        if (arg0 != -1) {
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
    public static final void method934(int arg0) {
        if (class247.field3934 < arg0) {
            class301.field4815 = -1;
            class247.field3934 = 0;
            class68.field1132 = -1;
        }
        if (class247.field3934 > class275.field4408) {
            class68.field1132 = -1;
            class247.field3934 = class275.field4408;
            class301.field4815 = -1;
        }
        if (class129.field2029 < 0) {
            class301.field4815 = -1;
            class68.field1132 = -1;
            class129.field2029 = 0;
        }
        if (class129.field2029 > class275.field4416) {
            class301.field4815 = -1;
            class68.field1132 = -1;
            class129.field2029 = class275.field4416;
        }
        field2080++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2093++;
        class273.method1828((byte) 98, arg6);
        int var7 = arg6;
        int var8 = 0;
        int var9 = -arg6;
        int var10 = arg6 - arg2;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = -1;
        int var12 = -var10;
        int var13 = -1;
        int[] var14 = class204.field3253[arg4];
        int var15 = var10;
        int var16 = arg5 - var10;
        int var17 = arg5 + var10;
        int var18 = -74 % ((arg1 - 14) / 39);
        class73.method494(arg3, var14, 4028, var16, arg5 - arg6);
        class73.method494(arg0, var14, 4028, var17, var16);
        class73.method494(arg3, var14, 4028, arg5 + arg6, var17);
        while (var7 > var8) {
            var13 += 2;
            var11 += 2;
            var12 += var11;
            var9 += var13;
            if (var12 >= 0 && var15 >= 1) {
                class167.field2727[var15] = var8;
                var15--;
                var12 -= var15 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var7--;
                var9 -= var7 << 1;
                if (var7 >= var10) {
                    int[] var19 = class204.field3253[arg4 + var7];
                    int[] var20 = class204.field3253[arg4 - var7];
                    int var21 = arg5 - var8;
                    int var22 = arg5 + var8;
                    class73.method494(arg3, var19, 4028, var22, var21);
                    class73.method494(arg3, var20, 4028, var22, var21);
                } else {
                    int[] var23 = class204.field3253[arg4 + var7];
                    int var24 = class167.field2727[var7];
                    int var25 = arg5 + var8;
                    int[] var26 = class204.field3253[arg4 - var7];
                    int var27 = arg5 - var8;
                    int var28 = arg5 + var24;
                    int var29 = arg5 - var24;
                    class73.method494(arg3, var23, 4028, var29, var27);
                    class73.method494(arg0, var23, 4028, var28, var29);
                    class73.method494(arg3, var23, 4028, var25, var28);
                    class73.method494(arg3, var26, 4028, var29, var27);
                    class73.method494(arg0, var26, 4028, var28, var29);
                    class73.method494(arg3, var26, 4028, var25, var28);
                }
            }
            int[] var30 = class204.field3253[arg4 + var8];
            int[] var31 = class204.field3253[arg4 - var8];
            int var32 = arg5 + var7;
            int var33 = arg5 - var7;
            if (var8 >= var10) {
                class73.method494(arg3, var30, 4028, var32, var33);
                class73.method494(arg3, var31, 4028, var32, var33);
            } else {
                int var34 = var8 <= var15 ? var15 : class167.field2727[var8];
                int var35 = arg5 + var34;
                int var36 = arg5 - var34;
                class73.method494(arg3, var30, 4028, var36, var33);
                class73.method494(arg0, var30, 4028, var35, var36);
                class73.method494(arg3, var30, 4028, var32, var35);
                class73.method494(arg3, var31, 4028, var36, var33);
                class73.method494(arg0, var31, 4028, var35, var36);
                class73.method494(arg3, var31, 4028, var32, var35);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3) {
        class151 var4 = class218.field3584[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class259 var5 = var4.field2355;
        if (var5 != null) {
            var5.field4178 = var5.field4178 * arg3 / 16;
            var5.field4180 = var5.field4180 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;JIIZILjava/lang/String;IIZZ)V")
    public static final void method937(String arg0, long arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class162 var14 = new class162(128);
        var14.method1108(10, true);
        var14.method1120((arg4 ? 2 : 0) | (arg10 ? 1 : 0) | (arg9 ? 4 : 0), true);
        var14.method1156(-31881, arg1);
        field2085++;
        var14.method1125(var12[0], 255);
        var14.method1148((byte) -99, arg0);
        var14.method1125(var12[1], 255);
        var14.method1120(class1.field17, true);
        var14.method1108(arg3, true);
        var14.method1108(arg2, true);
        var14.method1125(var12[arg7], 255);
        var14.method1120(arg8, true);
        var14.method1120(arg5, true);
        var14.method1125(var12[3], arg7 + 253);
        var14.method1110(class104.field1663, (byte) 126, class309.field4937);
        class162 var15 = new class162(350);
        var15.method1148((byte) -99, arg6);
        int var16 = 8 - class230.method1551(arg6, (byte) -87) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1108((int) (Math.random() * 255.0D), true);
        }
        var15.method1124(-930593224, var12);
        class314.field5061.field2568 = 0;
        class314.field5061.method1108(22, true);
        class314.field5061.method1120(var14.field2568 + var15.field2568 + 2, true);
        class314.field5061.method1120(552, true);
        class314.field5061.method1131(var14.field2568, var14.field2573, 0, 2);
        class314.field5061.method1131(var15.field2568, var15.field2573, 0, 2);
        class225.field3653 = 0;
        class9.field91 = -3;
        class81.field1364 = 0;
        class176.field2873 = 1;
    }
}
