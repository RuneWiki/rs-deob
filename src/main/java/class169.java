import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class169 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2402 = -1;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
    public static boolean field2408 = false;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2407 = 0;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "[[S")
    public static short[][] field2410 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lek;")
    public class294 field2405;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Lqj;")
    public static class296 field2411;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lqj;")
    public static class296 field2412;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lhc;")
    public class75 field2401;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method1140(int arg0) {
        field2412 = null;
        field2411 = null;
        if (arg0 != 3346) {
            method1141((class378) null, 65, -97, -98);
        }
        field2410 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljk;III)V")
    public static final void method1141(class378 arg0, int arg1, int arg2, int arg3) {
        int var4 = class36.field551[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field5386 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field5391[arg0.field5386++] = class84.field1302[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field5386; var7 < 4; var7++) {
            arg0.field5391[var7] = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method1142(int arg0) {
        field2403++;
        for (int var1 = 0; var1 < class54.field795; var1++) {
            int var2 = class243.field3364[var1];
            class437 var3 = class445.field6422[var2];
            int var4 = class393.field5747.method2429(0);
            if ((var4 & 0x8) != 0) {
                var4 += class393.field5747.method2429(0) << 8;
            }
            if ((var4 & 0x2) != 0) {
                var3.field915 = class393.field5747.method2389(49);
                if (var3.field915 == 65535) {
                    var3.field915 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class393.field5747.method2382(false);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class393.field5747.method2403((byte) 68);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class393.field5747.method2400((byte) 123);
                    var8[var9] = class393.field5747.method2389(72);
                }
                class123.method821(var6, var7, var8, var3, 0);
            }
            if ((var4 & 0x400) != 0) {
                int var11 = class393.field5747.method2435((byte) 106);
                var3.field888 = class393.field5747.method2388((byte) 115);
                var3.field918 = class393.field5747.method2400((byte) 123);
                var3.field926 = var11 & 0x7FFF;
                var3.field907 = (var11 & 0x8000) != 0;
                var3.field857 = class35.field541 + var3.field926 + var3.field888;
            }
            if ((var4 & 0x20) != 0) {
                int var12 = class393.field5747.method2433(-124);
                int var13 = class393.field5747.method2400((byte) 123);
                var3.method415(class35.field541, var13, var12, (byte) -33);
                var3.field868 = class35.field541 + 300;
                var3.field913 = class393.field5747.method2388((byte) 79);
            }
            if ((var4 & 0x80) != 0) {
                int var14 = class393.field5747.method2433(-83);
                int var15 = class393.field5747.method2382(false);
                var3.method415(class35.field541, var15, var14, (byte) -116);
            }
            if ((var4 & 0x10) != 0) {
                var3.field909 = class393.field5747.method2422(-1);
                var3.field891 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field919 = class393.field5747.method2435((byte) 104);
                var3.field854 = class393.field5747.method2432((byte) 121);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field6290.method1404((byte) 108)) {
                    class346.method2217(var3, (byte) -52);
                }
                var3.method2733(class393.method2556(class393.field5747.method2435((byte) 96), 4), -57);
                var3.method399(var3.field6290.field2958, 16383);
                var3.field878 = var3.field6290.field2907 << 3;
                if (var3.field6290.method1404((byte) 61)) {
                    class386.method2523(var3.field944[0], -30107, var3, class265.field3617, 0, (class369) null, var3.field956[0], (class354) null);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var16 = class393.field5747.method2403((byte) 83);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class393.field5747.method2429(0);
                class57.method377(-1, var3, var17, var16);
            }
            if ((var4 & 0x4) != 0) {
                int var18 = class393.field5747.method2435((byte) 95);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class393.field5747.method2413((byte) -30);
                boolean var20 = true;
                if (var18 != -1 && var3.field877 != -1) {
                    if (var3.field877 == var18) {
                        class69 var25 = class221.method1405(var18, -35);
                        if (var25.field1086 && var25.field1076 != -1) {
                            class449 var26 = class86.method599(false, var25.field1076);
                            int var27 = var26.field6516;
                            if (var27 == 0) {
                                var20 = false;
                            } else if (var27 == 1) {
                                var20 = true;
                            } else if (var27 == 2) {
                                var3.field864 = 0;
                                var20 = false;
                            }
                        }
                    } else {
                        class69 var21 = class221.method1405(var18, 119);
                        class69 var22 = class221.method1405(var3.field877, -85);
                        if (var21.field1076 != -1 && var22.field1076 != -1) {
                            class449 var23 = class86.method599(false, var21.field1076);
                            class449 var24 = class86.method599(false, var22.field1076);
                            if (var23.field6504 < var24.field6504) {
                                var20 = false;
                            }
                        }
                    }
                }
                if (var20) {
                    var3.field930 = 0;
                    var3.field877 = var18;
                    var3.field908 = var19 >> 16;
                    var3.field897 = (var19 & 0xFFFF) + class35.field541;
                    var3.field924 = 1;
                    var3.field934 = 0;
                    if (class35.field541 < var3.field897) {
                        var3.field934 = -1;
                    }
                    if (var3.field877 != -1 && class35.field541 == var3.field897) {
                        int var28 = class221.method1405(var3.field877, -117).field1076;
                        if (var28 != -1) {
                            class449 var29 = class86.method599(false, var28);
                            if (var29 != null && var29.field6521 != null) {
                                class27.method218(false, (byte) -91, var29, 0, var3.field6192, var3.field6197);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= 0) {
            field2402 = -70;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static final void method1143(byte arg0) {
        if (class107.field1586 != 0) {
            class266.field3637 -= class107.field1586 * 5;
            if (class356.field5021 <= class266.field3637) {
                class266.field3637 = class356.field5021 - 1;
            } else if (class266.field3637 < 0) {
                class266.field3637 = 0;
            }
            class107.field1586 = 0;
        }
        field2409++;
        if (class60.field848 < 102) {
            class60.field848 += 6;
        }
        int var1 = -39 % ((-arg0 - 61) / 50);
        for (int var2 = 0; var2 < class327.field4459; var2++) {
            int var3 = class123.field1724[var2];
            char var4 = (char) class327.field4471[var2];
            if (var3 == 84) {
                class362.method2333((byte) -16);
            } else if (class293.field4056[82] && var3 == 66) {
                if (class261.field3576 != null) {
                    String var9 = "";
                    for (int var10 = class173.field2458.length - 1; var10 >= 0; var10--) {
                        if (class173.field2458[var10] != null && class173.field2458[var10].length() > 0) {
                            var9 = var9 + class173.field2458[var10] + '\n';
                        }
                    }
                    class261.field3576.setContents(new StringSelection(var9), (ClipboardOwner) null);
                }
            } else if (class293.field4056[82] && var3 == 67) {
                if (class261.field3576 != null) {
                    Transferable var5 = class261.field3576.getContents((Object) null);
                    if (var5 != null) {
                        try {
                            String var6 = (String) var5.getTransferData(DataFlavor.stringFlavor);
                            if (var6 != null) {
                                String[] var7 = class65.method449((byte) -102, var6, '\n');
                                if (var7.length > 1) {
                                    for (int var8 = 0; var8 < var7.length; var8++) {
                                        class60.field844 = var7[var8];
                                        class362.method2333((byte) 112);
                                    }
                                } else {
                                    class60.field844 = class60.field844 + var6;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class275.field3735 > 0) {
                class60.field844 = class60.field844.substring(0, class275.field3735 - 1) + class60.field844.substring(class275.field3735);
                class275.field3735--;
            } else if (var3 == 101 && class275.field3735 < class60.field844.length()) {
                class60.field844 = class60.field844.substring(0, class275.field3735) + class60.field844.substring(class275.field3735 + 1);
            } else if (var3 == 96 && class275.field3735 > 0) {
                class275.field3735--;
            } else if (var3 == 97 && class275.field3735 < class60.field844.length()) {
                class275.field3735++;
            } else if (var3 == 102) {
                class275.field3735 = 0;
            } else if (var3 == 103) {
                class275.field3735 = class60.field844.length();
            } else if (var3 == 104 && class173.field2458.length > class275.field3728) {
                class275.field3728++;
                class249.method1550((byte) 26);
                class275.field3735 = class60.field844.length();
            } else if (var3 == 105 && class275.field3728 > 0) {
                class275.field3728--;
                class249.method1550((byte) 26);
                class275.field3735 = class60.field844.length();
            } else if (class141.method963(var4, false) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+') {
                class60.field844 = class60.field844.substring(0, class275.field3735) + (char) class327.field4471[var2] + class60.field844.substring(class275.field3735);
                class275.field3735++;
            }
        }
        class327.field4459 = 0;
        for (int var11 = 0; var11 < 100; var11++) {
            int var10002;
            if (class309.field4241[var11]) {
                var10002 = class184.field2570[var11]++;
                if (class184.field2570[var11] > 102) {
                    class309.field4241[var11] = false;
                }
            } else {
                var10002 = class184.field2570[var11]--;
                if (class184.field2570[var11] < 0) {
                    class247.field3423[var11] = (int) (Math.random() * (double) class194.field2696);
                    class294.field4059[var11] = (int) (Math.random() * 350.0D);
                    class184.field2570[var11] = 0;
                    class309.field4241[var11] = true;
                }
            }
        }
        class210.method1362(17612);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
    public static final void method1144(byte arg0) {
        field2404++;
        class253 var1 = null;
        try {
            if (arg0 <= 66) {
                field2407 = 86;
            }
            class295 var2 = class204.field2772.method2238(119);
            while (var2.field4068 == 0) {
                class4.method28(1L, 98);
            }
            if (var2.field4068 == 1) {
                var1 = (class253) var2.field4070;
                byte[] var3 = new byte[(int) var1.method1559(-6067)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1561(var3, var4, 58, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class308.method1956(new class371(var3), false);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1562(-8060);
            }
        } catch (Exception var6) {
        }
    }
}
