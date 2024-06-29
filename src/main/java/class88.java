import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class88 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lad;")
    public static class275 field1373 = new class275(64);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1377 = "Face here";

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lrg;")
    public static class248 field1379;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lrk;")
    public static class292[] field1374;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
    public static final boolean method613(byte arg0) {
        field1376++;
        if (field1378 == 0) {
            if (arg0 != -87) {
                field1378 = 81;
            }
            return class91.field1454.method1968(72);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BB)C")
    public static final char method614(byte arg0, byte arg1) {
        int var2 = arg0 & 0xFF;
        field1370++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class311.field5033[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg1 != -85) {
            field1373 = null;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class50.method322(arg0, -108);
        field1372++;
        int var7 = 0;
        int var8 = arg0;
        int var9 = arg0 - arg5;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = var9;
        int var11 = -arg0;
        int var12 = -1;
        int var13 = -var9;
        int var14 = -1;
        if (arg6 != 91) {
            return;
        }
        if (arg4 >= class52.field766 && class191.field3112 >= arg4) {
            int[] var15 = class232.field3629[arg4];
            int var16 = class268.method1789(class148.field2371, -112, arg3 - arg0, class34.field561);
            int var17 = class268.method1789(class148.field2371, arg6 ^ 0xFFFFFFE7, arg0 + arg3, class34.field561);
            int var18 = class268.method1789(class148.field2371, 24, arg3 - var9, class34.field561);
            int var19 = class268.method1789(class148.field2371, arg6 ^ 0xFFFFFFC3, arg3 + var9, class34.field561);
            class309.method2096(arg1, var18, (byte) -117, var15, var16);
            class309.method2096(arg2, var19, (byte) -117, var15, var18);
            class309.method2096(arg1, var17, (byte) -117, var15, var19);
        }
        while (var8 > var7) {
            var14 += 2;
            var13 += var14;
            var12 += 2;
            var11 += var12;
            if (var13 >= 0 && var10 >= 1) {
                var10--;
                class225.field3536[var10] = var7;
                var13 -= var10 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var8--;
                int var20 = arg4 - var8;
                var11 -= var8 << 1;
                int var21 = arg4 + var8;
                if (class52.field766 <= var21 && var20 <= class191.field3112) {
                    if (var9 <= var8) {
                        int var22 = class268.method1789(class148.field2371, 67, arg3 + var7, class34.field561);
                        int var23 = class268.method1789(class148.field2371, 123, arg3 - var7, class34.field561);
                        if (var21 <= class191.field3112) {
                            class309.method2096(arg1, var22, (byte) -117, class232.field3629[var21], var23);
                        }
                        if (class52.field766 <= var20) {
                            class309.method2096(arg1, var22, (byte) -117, class232.field3629[var20], var23);
                        }
                    } else {
                        int var24 = class225.field3536[var8];
                        int var25 = class268.method1789(class148.field2371, 118, arg3 + var7, class34.field561);
                        int var26 = class268.method1789(class148.field2371, arg6 ^ 0xFFFFFFF3, arg3 - var7, class34.field561);
                        int var27 = class268.method1789(class148.field2371, -97, arg3 + var24, class34.field561);
                        int var28 = class268.method1789(class148.field2371, -117, arg3 - var24, class34.field561);
                        if (var21 <= class191.field3112) {
                            int[] var29 = class232.field3629[var21];
                            class309.method2096(arg1, var28, (byte) -117, var29, var26);
                            class309.method2096(arg2, var27, (byte) -117, var29, var28);
                            class309.method2096(arg1, var25, (byte) -117, var29, var27);
                        }
                        if (class52.field766 <= var20) {
                            int[] var30 = class232.field3629[var20];
                            class309.method2096(arg1, var28, (byte) -117, var30, var26);
                            class309.method2096(arg2, var27, (byte) -117, var30, var28);
                            class309.method2096(arg1, var25, (byte) -117, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (class52.field766 <= var32 && var31 <= class191.field3112) {
                int var33 = arg3 + var8;
                int var34 = arg3 - var8;
                if (var33 >= class34.field561 && var34 <= class148.field2371) {
                    int var35 = class268.method1789(class148.field2371, 70, var33, class34.field561);
                    int var36 = class268.method1789(class148.field2371, -84, var34, class34.field561);
                    if (var9 > var7) {
                        int var37 = var10 < var7 ? class225.field3536[var7] : var10;
                        int var38 = class268.method1789(class148.field2371, -82, arg3 + var37, class34.field561);
                        int var39 = class268.method1789(class148.field2371, arg6 + 26, -var37 + arg3, class34.field561);
                        if (class191.field3112 >= var32) {
                            int[] var40 = class232.field3629[var32];
                            class309.method2096(arg1, var39, (byte) -117, var40, var36);
                            class309.method2096(arg2, var38, (byte) -117, var40, var39);
                            class309.method2096(arg1, var35, (byte) -117, var40, var38);
                        }
                        if (var31 >= class52.field766) {
                            int[] var41 = class232.field3629[var31];
                            class309.method2096(arg1, var39, (byte) -117, var41, var36);
                            class309.method2096(arg2, var38, (byte) -117, var41, var39);
                            class309.method2096(arg1, var35, (byte) -117, var41, var38);
                        }
                    } else {
                        if (var32 <= class191.field3112) {
                            class309.method2096(arg1, var35, (byte) -117, class232.field3629[var32], var36);
                        }
                        if (var31 >= class52.field766) {
                            class309.method2096(arg1, var35, (byte) -117, class232.field3629[var31], var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method616(byte[] arg0, int arg1, int arg2, int arg3) {
        field1375++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class311.field5033[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 != -161) {
            method613((byte) -43);
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method617(boolean arg0) {
        field1377 = null;
        field1374 = null;
        field1379 = null;
        if (!arg0) {
            field1373 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            field1379 = null;
        }
        field1371++;
        if (class191.field3112 < arg0 || class52.field766 > arg3) {
            return;
        }
        boolean var6;
        if (class34.field561 > arg1) {
            var6 = false;
            arg1 = class34.field561;
        } else if (arg1 > class148.field2371) {
            arg1 = class148.field2371;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg2 < class34.field561) {
            arg2 = class34.field561;
            var7 = false;
        } else if (class148.field2371 >= arg2) {
            var7 = true;
        } else {
            arg2 = class148.field2371;
            var7 = false;
        }
        if (arg0 >= class52.field766) {
            class309.method2096(arg4, arg2, (byte) -117, class232.field3629[arg0++], arg1);
        } else {
            arg0 = class52.field766;
        }
        if (arg3 <= class191.field3112) {
            class309.method2096(arg4, arg2, (byte) -117, class232.field3629[arg3--], arg1);
        } else {
            arg3 = class191.field3112;
        }
        if (var6 && var7) {
            for (int var8 = arg0; var8 <= arg3; var8++) {
                int[] var9 = class232.field3629[var8];
                var9[arg1] = var9[arg2] = arg4;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg0; var10 <= arg3; var10++) {
                class232.field3629[var10][arg1] = arg4;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg0; var11 <= arg3; var11++) {
                class232.field3629[var11][arg2] = arg4;
            }
            return;
        }
    }
}
