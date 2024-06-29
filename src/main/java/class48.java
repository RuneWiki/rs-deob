import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class48 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
    private int[][] field1205;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    public static int[] field1209 = new int[2000];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lba;")
    public static class7 field1199 = new class7(64);

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lgd;")
    private static class40 field1215 = class14.method90(false, "Username: ");

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lgd;")
    public static class40 field1217 = class14.method90(false, "redstone1");

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lgd;")
    public static class40 field1219 = class14.method90(false, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Lgd;")
    private static class40 field1224 = class14.method90(false, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lgd;")
    private static class40 field1223 = class14.method90(false, "wishes to duel with you)3");

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lgd;")
    private static class40 field1225 = class14.method90(false, "Drop");

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Lgd;")
    public static class40 field1227 = field1224;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lgd;")
    public static class40 field1220 = field1223;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lgd;")
    public static class40 field1230 = class14.method90(false, "blaugr-Un:");

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lgd;")
    public static class40 field1216 = field1215;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Lgd;")
    public static class40 field1226 = class14.method90(false, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Lgd;")
    public static class40 field1232 = field1225;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[Lhd;")
    public static class46[] field1228;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z[B)[B", line = 3)
    public final byte[] method368(boolean arg0, byte[] arg1) {
        if (this.field1205 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1207 / (long) this.field1212) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1205[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1207 + var6;
                int var14 = var13 / this.field1212;
                var6 = var13 - this.field1212 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0) {
            field1203++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)Lgd;", line = 80)
    public static final class40 method369(int arg0, boolean arg1) {
        if (!arg1) {
            field1217 = null;
        }
        field1229++;
        class40 var2 = new class40();
        var2.field948 = new byte[arg0];
        var2.field950 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 97)
    public static final void method370(byte arg0) {
        class128.method1011(0);
        field1200++;
        if (arg0 <= 90) {
            method372(14, 96, 40);
        }
        if (class115.field2769 != 10) {
            return;
        }
        int var1 = class132.field3191 - 202;
        int var2 = class80.field1841;
        int var3 = class90.field2041 - 171;
        if (class79.field1808 == 0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var2 == 1 && var1 >= var4 - 75 && var1 <= var4 + 75 && var5 - 20 <= var3 && var5 + 20 >= var3) {
                class79.field1808 = 3;
                class34.field856 = 0;
            }
            short var6 = 260;
            if (var2 == 1 && var1 >= var6 - 75 && var1 <= var6 + 75 && var3 >= var5 - 20 && var3 <= var5 + 20) {
                class79.field1808 = 2;
                class34.field856 = 0;
                class92.field2107 = class130.field3144;
                class92.field2112 = class128.field3072;
                class92.field2095 = class130.field3164;
            }
        } else if (class79.field1808 == 2) {
            byte var7 = 60;
            int var15 = var7 + 30;
            if (var2 == 1 && var15 - 15 <= var3 && var15 > var3) {
                class34.field856 = 0;
            }
            byte var8 = 100;
            var15 += 15;
            if (var2 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class34.field856 = 1;
            }
            var15 += 15;
            short var9 = 150;
            if (var2 == 1 && var8 - 75 <= var1 && var1 <= var8 + 75 && var3 >= var9 - 20 && var3 <= var9 + 20) {
                class92.field2097 = class92.field2097.method262((byte) 99).method244(0);
                class93.method625(class79.field1811, class130.field3160, (byte) -89, class130.field3165);
                class106.method822(true, 20);
            } else {
                short var10 = 260;
                if (var2 == 1 && var10 - 75 <= var1 && var10 + 75 >= var1 && var9 - 20 <= var3 && var9 + 20 >= var3) {
                    class92.field2117 = class92.field2101;
                    class79.field1808 = 0;
                    class92.field2097 = class92.field2101;
                }
                while (true) {
                    boolean var11;
                    label141: do {
                        while (class24.method143(507)) {
                            var11 = false;
                            for (int var12 = 0; var12 < class110.field2669.method255(-10); var12++) {
                                if (class14.field400 == class110.field2669.method249((byte) -71, var12)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class34.field856 != 0) {
                                continue label141;
                            }
                            if (class137.field3334 == 85 && class92.field2097.method255(-10) > 0) {
                                class92.field2097 = class92.field2097.method242(0, -12448, class92.field2097.method255(-10) - 1);
                            }
                            if (class137.field3334 == 84 || class137.field3334 == 80) {
                                class34.field856 = 1;
                            }
                            if (var11 && class92.field2097.method255(-10) < 12) {
                                class92.field2097 = class92.field2097.method275(class14.field400, (byte) -125);
                            }
                        }
                        return;
                    } while (class34.field856 != 1);
                    if (class137.field3334 == 85 && class92.field2117.method255(-10) > 0) {
                        class92.field2117 = class92.field2117.method242(0, -12448, class92.field2117.method255(-10) - 1);
                    }
                    if (class137.field3334 == 84 || class137.field3334 == 80) {
                        class34.field856 = 0;
                    }
                    if (var11 && class92.field2117.method255(-10) < 20) {
                        class92.field2117 = class92.field2117.method275(class14.field400, (byte) -104);
                    }
                }
            }
        } else if (class79.field1808 == 3) {
            short var13 = 180;
            short var14 = 150;
            if (var2 == 1 && var13 - 75 <= var1 && var1 <= var13 + 75 && var14 - 20 <= var3 && var3 <= var14 + 20) {
                class79.field1808 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[IZBI)V", line = 245)
    public static final void method371(int arg0, int[] arg1, boolean arg2, byte arg3, int arg4) {
        class10.field255.method561((byte) -74);
        field1208++;
        class120.field2843.method497(0, 0);
        if (arg2) {
            if (arg1[arg4] != -1) {
                if (arg4 == 0) {
                    class41.field1018.method497(22, 10);
                }
                if (arg4 == 1) {
                    class85.field1902.method497(54, 8);
                }
                if (arg4 == 2) {
                    class85.field1902.method497(82, 8);
                }
                if (arg4 == 3) {
                    class44.field1096.method497(110, 8);
                }
                if (arg4 == 4) {
                    class41.field1031.method497(153, 8);
                }
                if (arg4 == 5) {
                    class41.field1031.method497(181, 8);
                }
                if (arg4 == 6) {
                    class8.field213.method497(209, 9);
                }
            }
            if (arg1[0] != -1 && arg0 != 0) {
                class65.field1599[0].method497(29, 13);
            }
            if (arg1[1] != -1 && arg0 != 1) {
                class65.field1599[1].method497(53, 11);
            }
            if (arg1[2] != -1 && arg0 != 2) {
                class65.field1599[2].method497(82, 11);
            }
            if (arg1[3] != -1 && arg0 != 3) {
                class65.field1599[3].method497(115, 12);
            }
            if (arg1[4] != -1 && arg0 != 4) {
                class65.field1599[4].method497(153, 13);
            }
            if (arg1[5] != -1 && arg0 != 5) {
                class65.field1599[5].method497(180, 11);
            }
            if (arg1[6] != -1 && arg0 != 6) {
                class65.field1599[6].method497(208, 13);
            }
        }
        class91.field2058.method561((byte) -74);
        class122.field2864.method497(0, 0);
        if (arg2) {
            if (arg1[arg4] != -1) {
                if (arg4 == 7) {
                    class130.field3140.method497(42, 0);
                }
                if (arg4 == 8) {
                    class113.field2728.method497(74, 0);
                }
                if (arg4 == 9) {
                    class113.field2728.method497(102, 0);
                }
                if (arg4 == 10) {
                    class59.field1488.method497(130, 1);
                }
                if (arg4 == 11) {
                    class45.field1137.method497(173, 0);
                }
                if (arg4 == 12) {
                    class45.field1137.method497(201, 0);
                }
                if (arg4 == 13) {
                    class49.field1249.method497(229, 0);
                }
            }
            if (arg1[8] != -1 && arg0 != 8) {
                class65.field1599[7].method497(74, 2);
            }
            if (arg1[9] != -1 && arg0 != 9) {
                class65.field1599[8].method497(102, 3);
            }
            if (arg1[10] != -1 && arg0 != 10) {
                class65.field1599[9].method497(137, 4);
            }
            if (arg1[11] != -1 && arg0 != 11) {
                class65.field1599[10].method497(174, 2);
            }
            if (arg1[12] != -1 && arg0 != 12) {
                class65.field1599[11].method497(201, 2);
            }
            if (arg1[13] != -1 && arg0 != 13) {
                class65.field1599[12].method497(226, 2);
            }
        }
        if (arg3 >= -125) {
            return;
        }
        try {
            Graphics var5 = class30.field761.getGraphics();
            class10.field255.method465(-98, 160, var5, 516);
            class91.field2058.method465(-83, 466, var5, 496);
        } catch (Exception var6) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V", line = 394)
    public static final void method372(int arg0, int arg1, int arg2) {
        if (arg2 < 53) {
            method370((byte) 59);
        }
        class106.field2594++;
        class92.field2094.method290((byte) 0, 114);
        field1201++;
        class92.field2094.method771((byte) 121, arg1);
        class92.field2094.method790(-18058, arg0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I", line = 408)
    public final int method373(int arg0, byte arg1) {
        field1213++;
        if (arg1 != -15) {
            this.method368(true, null);
        }
        if (this.field1205 != null) {
            arg0 = (int) ((long) this.field1207 * (long) arg0 / (long) this.field1212) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lve;", line = 422)
    public static final class131 method374(int arg0, int arg1) {
        class131 var2 = (class131) class8.field216.method39(-19, (long) arg1);
        field1211++;
        if (arg0 != -20328) {
            method377(null, (byte) -101);
        }
        if (var2 != null) {
            return var2;
        }
        class131 var3 = class49.method384(class23.field544, arg0 ^ 0xFFFFB098, false, class85.field1897, arg1);
        if (var3 != null) {
            class8.field216.method38(var3, (long) arg1, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I", line = 447)
    public final int method375(boolean arg0, int arg1) {
        field1210++;
        if (arg0) {
            return 59;
        } else {
            if (this.field1205 != null) {
                arg1 = (int) ((long) this.field1207 * (long) arg1 / (long) this.field1212);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 462)
    public static void method376(byte arg0) {
        field1227 = null;
        field1220 = null;
        field1232 = null;
        field1216 = null;
        field1225 = null;
        field1219 = null;
        field1217 = null;
        field1224 = null;
        field1199 = null;
        field1223 = null;
        if (arg0 >= -13) {
            return;
        }
        field1209 = null;
        field1226 = null;
        field1215 = null;
        field1230 = null;
        field1228 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrb;B)V", line = 486)
    public static final void method377(class103 arg0, byte arg1) {
        field1214++;
        if (arg1 < 1) {
            method374(-66, -79);
        }
        class134.field3273 = arg0;
        class87.field1956 = class134.field3273.method729(1, 16);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I", line = 501)
    public static final int method378(int arg0, byte arg1, int arg2, int arg3) {
        field1206++;
        if (arg1 != -99) {
            field1226 = null;
        }
        if (arg3 > 179) {
            arg2 /= 2;
        }
        if (arg3 > 192) {
            arg2 /= 2;
        }
        if (arg3 > 217) {
            arg2 /= 2;
        }
        if (arg3 > 243) {
            arg2 /= 2;
        }
        return arg3 / 2 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V", line = 528)
    public class48(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class89.method581((byte) 91, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1207 = var4;
            this.field1212 = var5;
            this.field1205 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1205[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
