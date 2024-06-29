import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class137 {

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Laf;")
    public static class7 field1459 = class48.method406(40, "::fpsoff");

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Laf;")
    public static class7 field1461 = class48.method406(40, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!je", name = "J", descriptor = "Laf;")
    public static class7 field1467 = class48.method406(40, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lrd;")
    public static class122 field1470 = new class122(8);

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Laf;")
    public static class7 field1477 = class48.method406(40, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lqc;")
    public static class114 field1471;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lkb;")
    public static class71 field1463;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
    public int[] field1465;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "[I")
    public int[] field1473;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[I")
    public int[] field1474;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "[Ln;")
    public class90[] field1464;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "[Ln;")
    public class90[] field1468;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[[[B")
    public byte[][][] field1472;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1475++;
        if (class9.method106(arg5, (byte) 93)) {
            class151.field3537 = null;
            class82.method682(arg6, arg7, arg0, class52.field1251[arg5], arg8, arg4, (byte) 37, arg3, -1, arg1);
            if (arg2 != 0) {
                field1459 = null;
            }
            if (class151.field3537 != null) {
                class82.method682(arg6, arg7, class69.field1518, class151.field3537, class108.field2641, arg4, (byte) 127, arg3, -1412584499, arg1);
                class151.field3537 = null;
            }
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class2.field9[var9] = true;
            }
        } else {
            class2.field9[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILfd;)V")
    private static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, class40 arg5) {
        if (arg0 >= 0) {
            return;
        }
        int var6 = arg4 * arg4 + arg3 * arg3;
        field1466++;
        if (var6 <= 4225 || var6 >= 90000) {
            class127.method1051(arg1, arg2, arg3, -105, arg4, arg5);
            return;
        }
        int var7 = class4.field48 + client.field577 & 0x7FF;
        int var8 = class134.field3164[var7];
        int var9 = class134.field3160[var7];
        int var10 = var9 * 256 / (class113.field2705 + 256);
        int var11 = var8 * 256 / (class113.field2705 + 256);
        int var12 = arg3 * var11 + arg4 * var10 >> 16;
        int var13 = arg3 * var10 - arg4 * var11 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class64.field1416.method350(var16 + arg2 + 94 + 4 - 10, -var17 + -20 + arg1 - -83, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILkb;)Z")
    public static final boolean method541(int arg0, int arg1, int arg2, class71 arg3) {
        field1476++;
        byte[] var4 = arg3.method572(arg1, false, arg0);
        if (var4 == null) {
            return false;
        } else if (arg2 >= -73) {
            return false;
        } else {
            class42.method372(var4, -2);
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZII)V")
    public static final void method542(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return;
        }
        class118.method915((byte) -60);
        field1462++;
        class33.method301(arg2, arg3, class93.field2184.field2723 + arg2, class93.field2184.field2722 + arg3);
        if (class135.field3230 == 2 || class135.field3230 == 5) {
            class33.method294(arg2 + 25, arg3 - -5, 0, class102.field2416, class13.field343);
        } else {
            int var4 = client.field577 + class4.field48 & 0x7FF;
            int var5 = class21.field531.field505 / 32 + 48;
            int var6 = 464 - class21.field531.field491 / 32;
            class9.field251.method361(arg2 + 25, arg3 + 5, 146, 151, var5, var6, var4, class113.field2705 + 256, class102.field2416, class13.field343);
            for (int var7 = 0; var7 < class21.field528; var7++) {
                int var37 = class10.field263[var7] * 4 + 2 - class21.field531.field505 / 32;
                int var38 = class2.field21[var7] * 4 + 2 - class21.field531.field491 / 32;
                class127.method1051(arg3, arg2, var38, -106, var37, class131.field3102[var7]);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class94 var34 = class9.field252[class8.field186][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class21.field531.field505 / 32;
                        int var36 = var33 * 4 + 2 - class21.field531.field491 / 32;
                        class127.method1051(arg3, arg2, var36, -21, var35, class118.field2785[0]);
                    }
                }
            }
            for (int var9 = 0; var9 < class106.field2615; var9++) {
                class141 var29 = class121.field2843[class155.field3600[var9]];
                if (var29 != null && var29.method186(-128)) {
                    class95 var30 = var29.field3323;
                    if (var30 != null && var30.field2213 != null) {
                        var30 = var30.method775(30856);
                    }
                    if (var30 != null && var30.field2254 && var30.field2235) {
                        int var31 = var29.field505 / 32 - class21.field531.field505 / 32;
                        int var32 = var29.field491 / 32 - class21.field531.field491 / 32;
                        class127.method1051(arg3, arg2, var32, -21, var31, class118.field2785[1]);
                    }
                }
            }
            for (int var10 = 0; var10 < class130.field3088; var10++) {
                class92 var21 = class18.field425[class87.field2046[var10]];
                if (var21 != null && var21.method186(-127)) {
                    int var22 = var21.field491 / 32 - class21.field531.field491 / 32;
                    int var23 = var21.field505 / 32 - class21.field531.field505 / 32;
                    boolean var24 = false;
                    long var25 = var21.field2121.method70(18982);
                    for (int var27 = 0; var27 < class21.field546; var27++) {
                        if (class98.field2340[var27] == var25 && class137.field3272[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class21.field531.field2134 != 0 && var21.field2134 != 0 && class21.field531.field2134 == var21.field2134) {
                        var28 = true;
                    }
                    if (var24) {
                        class127.method1051(arg3, arg2, var22, -116, var23, class118.field2785[3]);
                    } else if (var28) {
                        class127.method1051(arg3, arg2, var22, -108, var23, class118.field2785[4]);
                    } else {
                        class127.method1051(arg3, arg2, var22, -42, var23, class118.field2785[2]);
                    }
                }
            }
            if (class23.field622 != 0 && class155.field3611 % 20 < 10) {
                if (class23.field622 == 1 && class72.field1589 >= 0 && class121.field2843.length > class72.field1589) {
                    class141 var11 = class121.field2843[class72.field1589];
                    if (var11 != null) {
                        int var12 = var11.field491 / 32 - class21.field531.field491 / 32;
                        int var13 = var11.field505 / 32 - class21.field531.field505 / 32;
                        method540(-72, arg3, arg2, var12, var13, class3.field38[1]);
                    }
                }
                if (class23.field622 == 2) {
                    int var14 = (class135.field3176 - class32.field843) * 4 + 2 - class21.field531.field491 / 32;
                    int var15 = (class43.field1023 - class153.field3585) * 4 + 2 - class21.field531.field505 / 32;
                    method540(-12, arg3, arg2, var14, var15, class3.field38[1]);
                }
                if (class23.field622 == 10 && class151.field3533 >= 0 && class18.field425.length > class151.field3533) {
                    class92 var16 = class18.field425[class151.field3533];
                    if (var16 != null) {
                        int var17 = var16.field505 / 32 - class21.field531.field505 / 32;
                        int var18 = var16.field491 / 32 - class21.field531.field491 / 32;
                        method540(-57, arg3, arg2, var18, var17, class3.field38[1]);
                    }
                }
            }
            if (class42.field1012 != 0) {
                int var19 = class42.field1012 * 4 + 2 - class21.field531.field505 / 32;
                int var20 = class84.field1984 * 4 + 2 - class21.field531.field491 / 32;
                class127.method1051(arg3, arg2, var20, -49, var19, class3.field38[0]);
            }
            class33.method304(arg2 + 4 + 93, arg3 + 78, 3, 3, 16777215);
        }
        if (class135.field3230 < 3) {
            class58.field1385.method361(arg2, arg3, 33, 33, 25, 25, class4.field48, 256, class64.field1411, class47.field1155);
        } else {
            class33.method294(arg2, arg3, 0, class64.field1411, class47.field1155);
        }
        if (class73.field1653[arg0]) {
            class93.field2184.method896(arg2, arg3);
        }
        class133.field3114[arg0] = true;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1477 = null;
        field1459 = null;
        field1467 = null;
        field1470 = null;
        field1463 = null;
        field1461 = null;
        field1471 = null;
        if (arg0 != -107) {
            method540(-69, -125, -124, 30, -57, null);
        }
    }
}
