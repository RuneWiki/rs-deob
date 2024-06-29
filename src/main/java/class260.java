import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class260 extends OutputStream {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static volatile int field4619 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lud;")
    public static class279 field4617 = class130.method1024(",Mcran)2titre ouvert", 255);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lud;")
    public static class279 field4622 = class130.method1024("details", 255);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lud;")
    public static class279 field4632 = class130.method1024("ondulation2:", 255);

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lud;")
    public static class279 field4629 = class130.method1024("jaune:", 255);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Lul;", line = 6)
    public static final class43 method1858(byte arg0) {
        if (arg0 > -85) {
            method1858((byte) 55);
        }
        field4633++;
        return class85.field1609;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1859(boolean arg0) {
        field4622 = null;
        if (!arg0) {
            field4629 = null;
            field4632 = null;
            field4617 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIILgf;)V", line = 46)
    public static final void method1860(int arg0, int arg1, int arg2, int arg3, class8 arg4) {
        field4624++;
        class35.method309((byte) 75);
        if (class97.field1824) {
            class256.method1830(arg3, arg0, arg4.field220 + arg3, arg4.field297 + arg0);
        } else {
            class146.method1127(arg3, arg0, arg4.field220 + arg3, arg4.field297 + arg0);
        }
        if (client.field4470 != 2 && client.field4470 != 5 && class155.field2805 != null) {
            int var5 = class126.field2349 + class212.field3714 & 0x7FF;
            int var6 = 464 - (class72.field1420.field79 / 32);
            int var7 = class72.field1420.field86 / 32 + 48;
            if (class97.field1824) {
                ((class203) class155.field2805).method1502(arg3, arg0, arg4.field220, arg4.field297, var7, var6, var5, class5.field122 + 256, (class203) arg4.method61(-10823, false));
            } else {
                ((class66) class155.field2805).method588(arg3, arg0, arg4.field220, arg4.field297, var7, var6, var5, class5.field122 + 256, arg4.field251, arg4.field200);
            }
            if (class310.field5503 != null) {
                for (int var8 = 0; var8 < class310.field5503.field2429; var8++) {
                    if (class310.field5503.method1047(var8, -89)) {
                        int var9 = (class310.field5503.field2423[var8] - class112.field2058) * 4 + 2 - (class72.field1420.field86 / 32);
                        int var10 = (class310.field5503.field2436[var8] - class12.field396) * 4 + 2 - (class72.field1420.field79 / 32);
                        int var11 = class27.field654[var5];
                        int var12 = var11 * 256 / (class5.field122 + 256);
                        int var13 = class27.field642[var5];
                        int var14 = var13 * 256 / (class5.field122 + 256);
                        int var15 = var10 * var14 - (var9 * var12) >> 16;
                        class49 var16 = class109.field2015;
                        int var17 = var9 * var14 + var10 * var12 >> 16;
                        if (class310.field5503.method1040(var8, (byte) 76) == 1) {
                            var16 = class133.field2428;
                        }
                        if (class310.field5503.method1040(var8, (byte) 88) == 2) {
                            var16 = class292.field5210;
                        }
                        int var18 = var16.method405(class310.field5503.field2438[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if ((-arg4.field220) <= var19 && arg4.field220 >= var19 && (-arg4.field297) <= var15 && arg4.field297 >= var15) {
                            int var20 = 16777215;
                            if (class310.field5503.field2439[var8] != -1) {
                                var20 = class310.field5503.field2439[var8];
                            }
                            if (class97.field1824) {
                                class256.method1825((class203) arg4.method61(arg1 + 563, false));
                            } else {
                                class146.method1111(arg4.field251, arg4.field200);
                            }
                            var16.method416(class310.field5503.field2438[var8], arg4.field220 / 2 + var19 + arg3, arg4.field297 / 2 + arg0 - var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class97.field1824) {
                                class256.method1826();
                            } else {
                                class146.method1108();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class45.field954; var21++) {
                int var22 = class306.field5435[var21] * 4 + 2 - (class72.field1420.field86 / 32);
                int var23 = class52.field1100[var21] * 4 + 2 - (class72.field1420.field79 / 32);
                class264 var24 = class252.method1808(class130.field2378[var21], (byte) 4);
                if (var24.field4760 != null) {
                    var24 = var24.method1896(37);
                    if (var24 == null || var24.field4722 == -1) {
                        continue;
                    }
                }
                class69.method605(arg0, arg4, arg1 ^ 0xFFFFD384, var22, var23, arg3, class195.field3511[var24.field4722]);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class317 var27 = class276.field4890[class287.field5134][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + (2 - class72.field1420.field86 / 32);
                        int var29 = var26 * 4 + 2 - (class72.field1420.field79 / 32);
                        class69.method605(arg0, arg4, 2, var28, var29, arg3, class287.field5128[0]);
                    }
                }
            }
            for (int var30 = 0; var30 < class26.field626; var30++) {
                class102 var31 = class122.field2196[class200.field3579[var30]];
                if (var31 != null && var31.method2(27121)) {
                    class125 var32 = var31.field1921;
                    if (var32 != null && var32.field2321 != null) {
                        var32 = var32.method999(arg1 ^ 0xFFFFE0A8);
                    }
                    if (var32 != null && var32.field2297 && var32.field2334) {
                        int var33 = var31.field79 / 32 - (class72.field1420.field79 / 32);
                        int var34 = var31.field86 / 32 - (class72.field1420.field86 / 32);
                        if (var32.field2268 == -1) {
                            class69.method605(arg0, arg4, 2, var34, var33, arg3, class287.field5128[1]);
                        } else {
                            class69.method605(arg0, arg4, 2, var34, var33, arg3, class195.field3511[var32.field2268]);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class103.field1931; var35++) {
                class239 var36 = class96.field1780[class252.field4503[var35]];
                if (var36 != null && var36.method2(27121)) {
                    int var37 = var36.field79 / 32 - (class72.field1420.field79 / 32);
                    int var38 = var36.field86 / 32 - (class72.field1420.field86 / 32);
                    boolean var39 = false;
                    long var40 = var36.field4197.method2013(90);
                    for (int var42 = 0; var42 < class167.field3011; var42++) {
                        if (class287.field5123[var42] == var40 && class247.field4383[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class59.field1243; var44++) {
                        if (class306.field5437[var44].field5539 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class72.field1420.field4185 != 0 && var36.field4185 != 0 && class72.field1420.field4185 == var36.field4185) {
                        var45 = true;
                    }
                    if (var39) {
                        class69.method605(arg0, arg4, arg1 + 11388, var38, var37, arg3, class287.field5128[3]);
                    } else if (var43) {
                        class69.method605(arg0, arg4, 2, var38, var37, arg3, class287.field5128[5]);
                    } else if (var45) {
                        class69.method605(arg0, arg4, 2, var38, var37, arg3, class287.field5128[4]);
                    } else {
                        class69.method605(arg0, arg4, 2, var38, var37, arg3, class287.field5128[2]);
                    }
                }
            }
            class130[] var46 = class268.field4807;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class130 var48 = var46[var47];
                if (var48 != null && var48.field2365 != 0 && (class8.field279 % 20) < 10) {
                    if (var48.field2365 == 1 && var48.field2374 >= 0 && var48.field2374 < class122.field2196.length) {
                        class102 var49 = class122.field2196[var48.field2374];
                        if (var49 != null) {
                            int var50 = var49.field86 / 32 - (class72.field1420.field86 / 32);
                            int var51 = var49.field79 / 32 - (class72.field1420.field79 / 32);
                            class125.method1005(var48.field2380, var50, arg4, (byte) 92, arg0, arg3, var51);
                        }
                    }
                    if (var48.field2365 == 2) {
                        int var52 = (var48.field2371 - class112.field2058) * 4 + 2 - class72.field1420.field86 / 32;
                        int var53 = (var48.field2370 - class12.field396) * 4 - ((class72.field1420.field79 / 32) - 2);
                        class125.method1005(var48.field2380, var52, arg4, (byte) 92, arg0, arg3, var53);
                    }
                    if (var48.field2365 == 10 && var48.field2374 >= 0 && var48.field2374 < class96.field1780.length) {
                        class239 var54 = class96.field1780[var48.field2374];
                        if (var54 != null) {
                            int var55 = var54.field86 / 32 - (class72.field1420.field86 / 32);
                            int var56 = var54.field79 / 32 - (class72.field1420.field79 / 32);
                            class125.method1005(var48.field2380, var55, arg4, (byte) 92, arg0, arg3, var56);
                        }
                    }
                }
            }
            if (class100.field1882 != 0) {
                int var57 = class100.field1882 * 4 + 2 - (class72.field1420.field86 / 32);
                int var58 = class72.field1415 * 4 + 2 - (class72.field1420.field79 / 32);
                class69.method605(arg0, arg4, 2, var57, var58, arg3, class257.field4561);
            }
            if (class97.field1824) {
                class256.method1827(arg3 + (arg4.field220 / 2) - 1, arg4.field297 / 2 + -1 + arg0, 3, 3, 16777215);
            } else {
                class146.method1110(arg4.field220 / 2 + arg3 - 1, arg4.field297 / 2 + -1 + arg0, 3, 3, 16777215);
            }
        } else if (class97.field1824) {
            class70 var59 = arg4.method61(-10823, false);
            if (var59 != null) {
                var59.method584(arg3, arg0);
            }
        } else {
            class146.method1123(arg3, arg0, 0, arg4.field251, arg4.field200);
        }
        class249.field4446[arg2] = true;
        if (arg1 != -11386) {
            field4619 = -106;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILvh;)V", line = 390)
    public static final void method1861(int arg0, class53 arg1) {
        if (arg0 >= -125) {
            return;
        }
        while (true) {
            while (arg1.field1168.length > arg1.field1142) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method483(-127) == 1) {
                    var3 = true;
                    var2 = arg1.method483(-125);
                    var4 = arg1.method483(-102);
                }
                int var5 = arg1.method483(-126);
                int var6 = arg1.method483(-113);
                int var7 = var5 * 64 - class245.field4356;
                int var8 = class166.field3007 + class34.field777 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class121.field2180 && var8 < class166.field3007) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && (var2 * 8 + 8) > var11 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method494(false);
                                if (var13 != 0) {
                                    if (class318.field5580[var9][var10] == null) {
                                        class318.field5580[var9][var10] = new byte[4096];
                                    }
                                    class318.field5580[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method494(false);
                                    if (class247.field4397[var9][var10] == null) {
                                        class247.field4397[var9][var10] = new byte[4096];
                                    }
                                    class247.field4397[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method494(false);
                        if (var16 != 0) {
                            arg1.field1142++;
                        }
                    }
                }
            }
            field4618++;
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 493)
    public static final void method1862(byte arg0) {
        for (class261 var1 = (class261) class268.field4806.method2248(116); var1 != null; var1 = (class261) class268.field4806.method2240(1138)) {
            if (var1.field4660 > 0) {
                var1.field4660--;
            }
            if (var1.field4660 != 0) {
                if (var1.field4661 > 0) {
                    var1.field4661--;
                }
                if (var1.field4661 == 0 && var1.field4646 >= 1 && var1.field4644 >= 1 && var1.field4646 <= 102 && var1.field4644 <= 102 && (var1.field4658 < 0 || class293.method2084(var1.field4658, -123, var1.field4655))) {
                    class67.method594(var1.field4655, var1.field4641, var1.field4644, var1.field4658, 0, var1.field4645, var1.field4646, var1.field4650);
                    var1.field4661 = -1;
                    if (var1.field4658 == var1.field4643 && var1.field4643 == -1) {
                        var1.method2221(true);
                    } else if (var1.field4658 == var1.field4643 && var1.field4647 == var1.field4645 && var1.field4655 == var1.field4648) {
                        var1.method2221(true);
                    }
                }
            } else if (var1.field4643 < 0 || class293.method2084(var1.field4643, -112, var1.field4648)) {
                class67.method594(var1.field4648, var1.field4641, var1.field4644, var1.field4643, arg0 - 76, var1.field4647, var1.field4646, var1.field4650);
                var1.method2221(true);
            }
        }
        field4625++;
        if (arg0 != 76) {
            method1863((class305) null, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!wi", name = "write", descriptor = "(I)V", line = 552)
    public final void write(int arg0) throws IOException {
        field4631++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lbd;B)[Lof;", line = 569)
    public static final class236[] method1863(class305 arg0, byte arg1) {
        field4616++;
        if (!arg0.method2168(15)) {
            return new class236[0];
        }
        class206 var2 = arg0.method2174(24317);
        while (var2.field3655 == 0) {
            class204.method1510(10L, 1);
        }
        if (var2.field3655 == 2) {
            return new class236[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field3657);
        class236[] var4 = new class236[var3.length >> 2];
        if (arg1 < 121) {
            field4632 = (class279) null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class236 var6 = new class236();
            var4[var5] = var6;
            var6.field4112 = var3[var5 << 2];
            var6.field4117 = var3[(var5 << 2) + 1];
            var6.field4113 = var3[(var5 << 2) + 2];
            var6.field4114 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZIIIIII)V", line = 613)
    public static final void method1864(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4626++;
        if (arg4 < 128 || arg0 < 128 || arg4 > 13056 || arg0 > 13056) {
            class209.field3679 = -1;
            class12.field385 = -1;
            return;
        }
        int var8 = class130.method1025(arg4, 1008652135, class287.field5134, arg0) - arg6;
        int var9 = arg4 - class21.field589;
        int var10 = class27.field654[class62.field1278];
        int var11 = class27.field642[class62.field1278];
        int var12 = class27.field654[class5.field124];
        int var13 = arg0 - class92.field1747;
        int var14 = class27.field642[class5.field124];
        int var15 = var9 * var14 + var12 * var13 >> 16;
        int var16 = var13 * var14 - (var9 * var12) >> 16;
        if (!arg1) {
            field4632 = (class279) null;
        }
        int var18 = var8 - class306.field5438;
        int var19 = var11 * var18 - var10 * var16 >> 16;
        int var20 = var10 * var18 + var11 * var16 >> 16;
        if (var20 < 50) {
            class12.field385 = -1;
            class209.field3679 = -1;
        } else if (class97.field1824) {
            int var22 = arg3 * 512 >> 8;
            class209.field3679 = arg7 + (var15 * var22 / var20);
            int var23 = arg2 * 512 >> 8;
            class12.field385 = arg5 + (var19 * var23 / var20);
        } else {
            class209.field3679 = arg7 + ((var15 << 9) / var20);
            class12.field385 = (var19 << 9) / var20 + arg5;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)Lke;", line = 675)
    public static final class113 method1865(int arg0, byte arg1) {
        field4623++;
        class113 var2 = (class113) class101.field1887.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class307.field5456.method1192(0, 31, arg0);
        class113 var4 = new class113();
        if (arg1 >= -123) {
            return (class113) null;
        }
        if (var3 != null) {
            var4.method917(arg0, (byte) -9, new class53(var3));
        }
        class101.field1887.method1331(var4, 30237, (long) arg0);
        return var4;
    }
}
