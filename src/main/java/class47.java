import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[[I")
    public int[][] field1249;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lkd;")
    private static class73 field1253 = class126.method1070((byte) -66, "Message");

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[J")
    public static long[] field1239 = new long[32];

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lkd;")
    public static class73 field1248 = field1253;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lkd;")
    private static class73 field1258 = class126.method1070((byte) -66, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[Z")
    public static boolean[] field1265 = new boolean[5];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[J")
    private static long[] field1240 = new long[100];

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lkd;")
    public static class73 field1260 = field1258;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Lkd;")
    public static class73 field1266 = class126.method1070((byte) -66, "Mem:");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    public static int[] field1236;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[[I")
    public static int[][] field1245;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method364(int arg0) {
        field1236 = null;
        field1260 = null;
        field1266 = null;
        field1265 = null;
        field1248 = null;
        if (arg0 != -8069) {
            return;
        }
        field1245 = null;
        field1240 = null;
        field1258 = null;
        field1253 = null;
        field1239 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIII)V")
    public final void method365(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1243++;
        int var7 = arg3 - this.field1255;
        int var8 = arg2 - this.field1237;
        if (~arg5 == arg4) {
            if (arg1 == 0) {
                this.method373(var7, 128, var8, false);
                this.method373(var7 - 1, 8, var8, false);
            }
            if (arg1 == 1) {
                this.method373(var7, 2, var8, false);
                this.method373(var7, 32, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method373(var7, 8, var8, false);
                this.method373(var7 + 1, 128, var8, false);
            }
            if (arg1 == 3) {
                this.method373(var7, 32, var8, false);
                this.method373(var7, 2, var8 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method373(var7, 1, var8, false);
                this.method373(var7 - 1, 16, var8 + 1, false);
            }
            if (arg1 == 1) {
                this.method373(var7, 4, var8, false);
                this.method373(var7 + 1, 64, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method373(var7, 16, var8, false);
                this.method373(var7 + 1, 1, var8 - 1, false);
            }
            if (arg1 == 3) {
                this.method373(var7, 64, var8, false);
                this.method373(var7 - 1, 4, var8 - 1, false);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method373(var7, 130, var8, false);
                this.method373(var7 - 1, 8, var8, false);
                this.method373(var7, 32, var8 + 1, false);
            }
            if (arg1 == 1) {
                this.method373(var7, 10, var8, false);
                this.method373(var7, 32, var8 + 1, false);
                this.method373(var7 + 1, 128, var8, false);
            }
            if (arg1 == 2) {
                this.method373(var7, 40, var8, false);
                this.method373(var7 + 1, 128, var8, false);
                this.method373(var7, 2, var8 - 1, false);
            }
            if (arg1 == 3) {
                this.method373(var7, 160, var8, false);
                this.method373(var7, 2, var8 - 1, false);
                this.method373(var7 - 1, 8, var8, false);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method373(var7, 65536, var8, false);
                this.method373(var7 - 1, 4096, var8, false);
            }
            if (arg1 == 1) {
                this.method373(var7, 1024, var8, false);
                this.method373(var7, 16384, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method373(var7, 4096, var8, false);
                this.method373(var7 + 1, 65536, var8, false);
            }
            if (arg1 == 3) {
                this.method373(var7, 16384, var8, false);
                this.method373(var7, 1024, var8 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method373(var7, 512, var8, false);
                this.method373(var7 - 1, 8192, var8 + 1, false);
            }
            if (arg1 == 1) {
                this.method373(var7, 2048, var8, false);
                this.method373(var7 + 1, 32768, var8 + 1, false);
            }
            if (arg1 == 2) {
                this.method373(var7, 8192, var8, false);
                this.method373(var7 + 1, 512, var8 - 1, false);
            }
            if (arg1 == 3) {
                this.method373(var7, 32768, var8, false);
                this.method373(var7 - 1, 2048, var8 - 1, false);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method373(var7, 66560, var8, false);
            this.method373(var7 - 1, 4096, var8, false);
            this.method373(var7, 16384, var8 + 1, false);
        }
        if (arg1 == 1) {
            this.method373(var7, 5120, var8, false);
            this.method373(var7, 16384, var8 + 1, false);
            this.method373(var7 + 1, 65536, var8, false);
        }
        if (arg1 == 2) {
            this.method373(var7, 20480, var8, false);
            this.method373(var7 + 1, 65536, var8, false);
            this.method373(var7, 1024, var8 - 1, false);
        }
        if (arg1 == 3) {
            this.method373(var7, 81920, var8, false);
            this.method373(var7, 1024, var8 - 1, false);
            this.method373(var7 - 1, 4096, var8, false);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
    public static final boolean method366(boolean arg0) {
        field1234++;
        if (class31.field862 == null) {
            return false;
        }
        try {
            int var1 = class31.field862.method1136(0);
            if (var1 == 0) {
                return false;
            }
            if (class142.field3535 == -1) {
                var1--;
                class31.field862.method1137(0, class89.field2235.field2880, !arg0, 1);
                class89.field2235.field2816 = 0;
                class142.field3535 = class89.field2235.method1213(74);
                class81.field2039 = class62.field1638[class142.field3535];
            }
            if (class81.field2039 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class31.field862.method1137(0, class89.field2235.field2880, !arg0, 1);
                class81.field2039 = class89.field2235.field2880[0] & 0xFF;
            }
            if (class81.field2039 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class31.field862.method1137(0, class89.field2235.field2880, false, 2);
                var1 -= 2;
                class89.field2235.field2816 = 0;
                class81.field2039 = class89.field2235.method944((byte) 122);
            }
            if (var1 < class81.field2039) {
                return false;
            }
            class89.field2235.field2816 = 0;
            class31.field862.method1137(0, class89.field2235.field2880, false, class81.field2039);
            class61.field1604 = client.field616;
            client.field616 = class123.field3131;
            class123.field3131 = class142.field3535;
            class143.field3573 = 0;
            if (class142.field3535 == 194) {
                class38.field1028 = true;
                int var2 = class89.field2235.method973(-119);
                int var3 = class89.field2235.method944((byte) 113);
                class1 var4;
                if (var2 < 0) {
                    var4 = null;
                } else {
                    var4 = class45.method335(var2, -118);
                }
                if (var2 < -70000) {
                    var3 += 32768;
                }
                if (var4 != null) {
                    for (int var5 = 0; var5 < var4.field6.length; var5++) {
                        var4.field6[var5] = 0;
                        var4.field92[var5] = 0;
                    }
                }
                class86.method719((byte) -24, var3);
                int var6 = class89.field2235.method944((byte) 116);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = class89.field2235.method944((byte) 127);
                    int var9 = class89.field2235.method962(false);
                    if (var9 == 255) {
                        var9 = class89.field2235.method973(-127);
                    }
                    if (var4 != null && var4.field6.length > var7) {
                        var4.field6[var7] = var8;
                        var4.field92[var7] = var9;
                    }
                    class18.method152((byte) 114, var7, var9, var8 - 1, var3);
                }
                class19.field536 = class49.field1308;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 253) {
                class19.field531 = class89.field2235.method959(128);
                class84.field2149 = class89.field2235.method959(128);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 247) {
                class133.field3342 = class89.field2235.method957((byte) 96);
                class25.field711 = class89.field2235.method957((byte) 26);
                class13.field410 = class89.field2235.method957((byte) 36);
                class74.field1913 = true;
                class132.field3304 = true;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 93) {
                class141.field3523 = class89.field2235.method957((byte) 72);
                class149.field3666 = true;
                class38.field1028 = true;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 179) {
                class89.field2235.method973(-127);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 185) {
                int var10 = class89.field2235.method962(!arg0);
                class73 var11 = class89.field2235.method927((byte) 122);
                int var12 = class89.field2235.method938(-128);
                if (var12 >= 1 && var12 <= 5) {
                    if (var11.method615(class18.field525, 60)) {
                        var11 = null;
                    }
                    class13.field415[var12 - 1] = var11;
                    class119.field3051[var12 - 1] = var10 == 0;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 47) {
                int var13 = class89.field2235.method934((byte) -9);
                if (var13 == 65535) {
                    var13 = -1;
                }
                class153.method1221(var13, -43);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 63) {
                int var14 = class89.field2235.method933(-111);
                int var15 = class89.field2235.method944((byte) 120);
                if (var15 == 65535) {
                    var15 = -1;
                }
                class53.method427(var14, 0, var15);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 81) {
                for (int var16 = 0; var16 < class42.field1141.length; var16++) {
                    if (class42.field1141[var16] != null) {
                        class42.field1141[var16].field2284 = -1;
                    }
                }
                for (int var17 = 0; var17 < class133.field3345.length; var17++) {
                    if (class133.field3345[var17] != null) {
                        class133.field3345[var17].field2284 = -1;
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 100) {
                class103.method829(true, (byte) 95);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 220) {
                class53.field1424 = class89.field2235.method958((byte) -110) * 30;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 46) {
                class153.field3759 = class89.field2235.method962(false);
                class142.field3535 = -1;
                if (class153.field3759 == class141.field3523) {
                    if (class153.field3759 == 3) {
                        class141.field3523 = 1;
                    } else {
                        class141.field3523 = 3;
                    }
                    class38.field1028 = true;
                }
                return true;
            }
            if (class142.field3535 == 148) {
                class126.field3231 = class81.field2039 / 8;
                for (int var18 = 0; var18 < class126.field3231; var18++) {
                    class102.field2558[var18] = class89.field2235.method970(-29916);
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 107) {
                int var19 = class89.field2235.method945(arg0);
                if (class11.field364 != var19) {
                    class53.method425(class11.field364, (byte) -126);
                    class11.field364 = var19;
                }
                class132.field3304 = true;
                class151.method1219((byte) -77, class11.field364);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 210) {
                int var20 = class89.field2235.method946(0);
                boolean var21 = class89.field2235.method959(128) == 1;
                class1 var22 = class45.method335(var20, -64);
                var22.field23 = var21;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 153) {
                long var23 = class89.field2235.method970(-29916);
                class73 var25 = class46.method346(class116.method1002(class89.field2235, (byte) 18).method625((byte) 16));
                class74.method647((byte) 125, class84.method708(var23, 117).method610(125), var25, 6);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 72) {
                long var26 = class89.field2235.method970(-29916);
                long var28 = (long) class89.field2235.method944((byte) 111);
                long var30 = (long) class89.field2235.method933(-68);
                boolean var32 = false;
                long var33 = (var28 << 32) + var30;
                int var35 = class89.field2235.method957((byte) 78);
                for (int var36 = 0; var36 < 100; var36++) {
                    if (field1240[var36] == var33) {
                        var32 = true;
                        break;
                    }
                }
                if (var35 <= 1) {
                    for (int var37 = 0; var37 < class126.field3231; var37++) {
                        if (class102.field2558[var37] == var26) {
                            var32 = true;
                            break;
                        }
                    }
                }
                if (!var32 && class32.field894 == 0) {
                    field1240[class41.field1089] = var33;
                    class41.field1089 = (class41.field1089 + 1) % 100;
                    class73 var38 = class46.method346(class116.method1002(class89.field2235, (byte) 104).method625((byte) 16));
                    if (var35 == 2 || var35 == 3) {
                        class74.method647((byte) -23, class32.method258(-121, new class73[] { class42.field1122, class84.method708(var26, 113).method610(127) }), var38, 7);
                    } else if (var35 == 1) {
                        class74.method647((byte) -82, class32.method258(-126, new class73[] { class131.field3284, class84.method708(var26, 106).method610(-121) }), var38, 7);
                    } else {
                        class74.method647((byte) 125, class84.method708(var26, 110).method610(-83), var38, 3);
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 186) {
                class89.field2235.method958((byte) -111);
                class89.field2235.method954(false);
                class89.field2235.method962(false);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 9) {
                int var39 = class89.field2235.method958((byte) -105);
                int var40 = class89.field2235.method929(31165);
                int var41 = class89.field2235.method973(-127);
                class1 var42 = class45.method335(var41, -105);
                class142.field3535 = -1;
                var42.field26 = (var40 << 16) + var39;
                return true;
            }
            if (class142.field3535 == 252) {
                for (int var43 = 0; var43 < class48.field1299.length; var43++) {
                    if (class54.field1432[var43] != class48.field1299[var43]) {
                        class48.field1299[var43] = class54.field1432[var43];
                        class25.method201(15529, var43);
                        class38.field1028 = true;
                    }
                }
                class142.field3535 = -1;
                class112.field2807 = class49.field1308;
                return true;
            }
            if (class142.field3535 == 213) {
                class132.field3303 = class89.field2235.method957((byte) 43);
                class38.field1028 = true;
                class112.field2807 = class49.field1308;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 108) {
                int var44 = class89.field2235.method944((byte) 118);
                int var45 = class89.field2235.method954(false);
                class1 var46 = class45.method335(var45, -124);
                var46.field95 = 1;
                class142.field3535 = -1;
                var46.field39 = var44;
                return true;
            }
            if (class142.field3535 == 251) {
                int var47 = class89.field2235.method962(false);
                int var48 = class89.field2235.method962(false);
                int var49 = class89.field2235.method959(128);
                class11.field320 = var48 >> 1;
                class73.field1901.method747(961, var49, var47, (var48 & 0x1) == 1);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 25) {
                int var50 = class89.field2235.method925(99);
                class1 var51 = class45.method335(var50, -61);
                for (int var52 = 0; var52 < var51.field6.length; var52++) {
                    var51.field6[var52] = -1;
                    var51.field6[var52] = 0;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 238) {
                int var53 = class89.field2235.method934((byte) -9);
                byte var54 = class89.field2235.method966((byte) 61);
                class54.field1432[var53] = var54;
                if (class48.field1299[var53] != var54) {
                    class48.field1299[var53] = var54;
                    class25.method201(15529, var53);
                    class38.field1028 = true;
                    if (class11.field364 != -1) {
                        class132.field3304 = true;
                    }
                }
                class112.field2807 = class49.field1308;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 135) {
                int var55 = class89.field2235.method944((byte) 120);
                int var56 = class89.field2235.method957((byte) 123);
                int var57 = class89.field2235.method944((byte) 120);
                class74.method649(var55, var56, var57, -107);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 34) {
                class84.field2149 = class89.field2235.method938(-128);
                class19.field531 = class89.field2235.method962(!arg0);
                while (class81.field2039 > class89.field2235.field2816) {
                    class142.field3535 = class89.field2235.method957((byte) 21);
                    class103.method828(true);
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 132) {
                long var58 = class89.field2235.method970(-29916);
                byte var60 = class89.field2235.method966((byte) 101);
                boolean var61 = false;
                long var62 = class89.field2235.method970(-29916);
                long var64 = (long) class89.field2235.method944((byte) 109);
                long var66 = (long) class89.field2235.method933(-112);
                long var68 = (var64 << 32) + var66;
                int var70 = class89.field2235.method957((byte) 119);
                for (int var71 = 0; var71 < 100; var71++) {
                    if (field1240[var71] == var68) {
                        var61 = true;
                        break;
                    }
                }
                if (var70 <= 1) {
                    for (int var72 = 0; var72 < class126.field3231; var72++) {
                        if (class102.field2558[var72] == var58) {
                            var61 = true;
                            break;
                        }
                    }
                }
                if (!var61 && class32.field894 == 0) {
                    field1240[class41.field1089] = var68;
                    class41.field1089 = (class41.field1089 + 1) % 100;
                    class73 var73 = class46.method346(class116.method1002(class89.field2235, (byte) 35).method625((byte) 16));
                    class73 var74 = class32.method258(-59, new class73[] { class142.field3543, class84.method708(var62, 106), class129.field3260, class78.method676(var60, -41), class94.field2391 });
                    if (var70 == 2 || var70 == 3) {
                        class74.method647((byte) -117, class32.method258(-66, new class73[] { var74, class42.field1122, class84.method708(var58, 115).method610(125) }), var73, 7);
                    } else if (var70 == 1) {
                        class74.method647((byte) -73, class32.method258(-85, new class73[] { var74, class131.field3284, class84.method708(var58, 93).method610(127) }), var73, 7);
                    } else {
                        class74.method647((byte) 124, class32.method258(-74, new class73[] { var74, class84.method708(var58, 96).method610(125) }), var73, 3);
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 240) {
                long var75 = class89.field2235.method970(-29916);
                int var77 = class89.field2235.method944((byte) 126);
                int var78 = class89.field2235.method957((byte) 68);
                class73 var79 = class84.method708(var75, 127).method610(126);
                for (int var80 = 0; var80 < class14.field431; var80++) {
                    if (class49.field1305[var80] == var75) {
                        if (class16.field497[var80] != var77) {
                            class16.field497[var80] = var77;
                            class38.field1028 = true;
                            if (var77 > 0) {
                                class74.method647((byte) 11, class9.field298, class32.method258(-126, new class73[] { var79, class142.field3539 }), 5);
                            }
                            if (var77 == 0) {
                                class74.method647((byte) 127, class9.field298, class32.method258(-62, new class73[] { var79, class55.field1485 }), 5);
                            }
                        }
                        var79 = null;
                        class102.field2549[var80] = var78;
                        break;
                    }
                }
                if (var79 != null && class14.field431 < 200) {
                    class49.field1305[class14.field431] = var75;
                    class137.field3424[class14.field431] = var79;
                    class16.field497[class14.field431] = var77;
                    class102.field2549[class14.field431] = var78;
                    class14.field431++;
                    class38.field1028 = true;
                    class112.field2807 = class49.field1308;
                }
                boolean var81 = false;
                int var82 = class14.field431;
                while (var82 > 0) {
                    var82--;
                    boolean var83 = true;
                    for (int var84 = 0; var84 < var82; var84++) {
                        if (class16.field497[var84] != class115.field2906 && class16.field497[var84 + 1] == class115.field2906 || class16.field497[var84] == 0 && class16.field497[var84 + 1] != 0) {
                            int var85 = class16.field497[var84];
                            class16.field497[var84] = class16.field497[var84 + 1];
                            class16.field497[var84 + 1] = var85;
                            var83 = false;
                            class73 var86 = class137.field3424[var84];
                            class137.field3424[var84] = class137.field3424[var84 + 1];
                            class137.field3424[var84 + 1] = var86;
                            long var87 = class49.field1305[var84];
                            class49.field1305[var84] = class49.field1305[var84 + 1];
                            class49.field1305[var84 + 1] = var87;
                            int var89 = class102.field2549[var84];
                            class102.field2549[var84] = class102.field2549[var84 + 1];
                            class102.field2549[var84 + 1] = var89;
                            class38.field1028 = true;
                        }
                    }
                    if (var83) {
                        break;
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 225) {
                class53.field1420 = class89.field2235.method957((byte) 70);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 214) {
                class31.method254(class81.field2039, class107.field2637, class89.field2235, true);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 160) {
                if (class141.field3523 == 12) {
                    class38.field1028 = true;
                }
                class5.field184 = class89.field2235.method945(arg0);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 193) {
                int var90 = class89.field2235.method929(31165);
                int var91 = class89.field2235.method946(0);
                class1 var92 = class45.method335(var91, -121);
                var92.field95 = 2;
                var92.field39 = var90;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 202) {
                int var93 = class89.field2235.method957((byte) 73);
                int var94 = class89.field2235.method957((byte) 13);
                int var95 = class89.field2235.method957((byte) 16);
                int var96 = class89.field2235.method957((byte) 123);
                field1265[var93] = true;
                class1.field79[var93] = var94;
                class140.field3483[var93] = var95;
                class141.field3509[var93] = var96;
                class61.field1614[var93] = 0;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 21) {
                int var97 = class89.field2235.method934((byte) -9);
                class37.method294((byte) -79, var97);
                class142.field3535 = -1;
                class19.field536 = class49.field1308;
                return true;
            }
            if (class142.field3535 == 95) {
                class26.method207(-111);
                class142.field3535 = -1;
                return false;
            }
            if (class142.field3535 == 87) {
                class52.field1387 = class89.field2235.method957((byte) 68);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 11) {
                int var98 = class89.field2235.method958((byte) -114);
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var99 = class89.field2235.method962(false);
                if (class24.field683[var99] == var98) {
                    class125.method1055(class24.field683[var99], 8494);
                } else {
                    class53.method425(class24.field683[var99], (byte) 41);
                    class24.field683[var99] = var98;
                }
                class149.field3666 = true;
                class38.field1028 = true;
                class151.method1219((byte) -77, class24.field683[var99]);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 188) {
                int var100 = class89.field2235.method973(-123);
                class1 var101 = class45.method335(var100, -74);
                var101.field95 = 3;
                var101.field39 = class73.field1901.field3014.method430((byte) -52);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 242) {
                int var102 = class89.field2235.method946(0);
                int var103 = class89.field2235.method944((byte) 122);
                int var104 = class89.field2235.method946(0);
                if (var103 == 65535) {
                    var103 = -1;
                }
                long var105 = ((long) var102 << 32) + (long) var103;
                class141 var107 = class52.field1382.method1099(104, var105);
                if (var107 != null) {
                    var107.method1147((byte) -31);
                }
                class52.field1382.method1093((byte) -109, new class77(var104), var105);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 180) {
                int var108 = class89.field2235.method942(-113);
                int var109 = class89.field2235.method954(!arg0);
                int var110 = class89.field2235.method930(-1);
                class1 var111 = class45.method335(var109, -118);
                var111.field60 = var111.field104 + var108;
                class142.field3535 = -1;
                var111.field115 = var111.field124 + var110;
                return true;
            }
            if (class142.field3535 == 20) {
                int var112 = class89.field2235.method946(0);
                class140.field3471 = class107.field2637.method1184(-1, var112);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 196) {
                class112.field2807 = class49.field1308;
                long var113 = class89.field2235.method970(-29916);
                if (var113 == 0L) {
                    class13.field417 = null;
                    class51.field1370 = 0;
                    class142.field3535 = -1;
                    class89.field2298 = null;
                    return true;
                }
                class89.field2298 = class84.method708(var113, 127);
                int var115 = class89.field2235.method957((byte) 125);
                if (var115 == 255) {
                    class142.field3535 = -1;
                    return true;
                }
                class51.field1370 = var115;
                class80[] var116 = new class80[100];
                for (int var117 = 0; var117 < class51.field1370; var117++) {
                    var116[var117] = new class80();
                    var116[var117].field3522 = class89.field2235.method970(-29916);
                    var116[var117].field2015 = class84.method708(var116[var117].field3522, 90);
                    var116[var117].field2018 = class89.field2235.method944((byte) 111);
                }
                boolean var118 = false;
                int var119 = class51.field1370;
                while (var119 > 0) {
                    var119--;
                    boolean var120 = true;
                    for (int var121 = 0; var121 < var119; var121++) {
                        if (var116[var121].field2015.method637(var116[var121 + 1].field2015, (byte) 53) > 0) {
                            class80 var122 = var116[var121];
                            var116[var121] = var116[var121 + 1];
                            var116[var121 + 1] = var122;
                            var120 = false;
                        }
                    }
                    if (var120) {
                        break;
                    }
                }
                class142.field3535 = -1;
                class13.field417 = var116;
                return true;
            }
            if (class142.field3535 == 163) {
                int var123 = class89.field2235.method958((byte) -122);
                int var124 = class89.field2235.method973(-118);
                class1 var125 = class45.method335(var124, -79);
                class142.field3535 = -1;
                if (var125 != null && var125.field81 == 0) {
                    if (var123 > var125.field93 - var125.field63) {
                        var123 = var125.field93 - var125.field63;
                    }
                    if (var123 < 0) {
                        var123 = 0;
                    }
                    var125.field86 = var123;
                }
                return true;
            }
            if (class142.field3535 == 155) {
                int var126 = class89.field2235.method934((byte) -9);
                int var127 = class89.field2235.method954(false);
                class54.field1432[var126] = var127;
                if (class48.field1299[var126] != var127) {
                    class48.field1299[var126] = var127;
                    class25.method201(15529, var126);
                    if (class11.field364 != -1) {
                        class132.field3304 = true;
                    }
                    class38.field1028 = true;
                }
                class142.field3535 = -1;
                class112.field2807 = class49.field1308;
                return true;
            }
            if (class142.field3535 == 67) {
                class24.method195((byte) -10);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 59) {
                class31.field873 = true;
                class3.field159 = class89.field2235.method957((byte) 112);
                class58.field1556 = class89.field2235.method957((byte) 59);
                class70.field1776 = class89.field2235.method944((byte) 122);
                class92.field2384 = class89.field2235.method957((byte) 4);
                class64.field1687 = class89.field2235.method957((byte) 90);
                if (class64.field1687 >= 100) {
                    class30.field857 = class3.field159 * 128 + 64;
                    class70.field1785 = class58.field1556 * 128 + 64;
                    class23.field664 = class70.method585(class11.field320, class30.field857, class70.field1785, (byte) 69) - class70.field1776;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 82) {
                for (int var128 = 0; var128 < class23.field666; var128++) {
                    class51 var129 = class50.method409(16, var128);
                    if (var129 != null && var129.field1376 == 0) {
                        class54.field1432[var128] = 0;
                        class48.field1299[var128] = 0;
                    }
                }
                class112.field2807 = class49.field1308;
                if (class11.field364 != -1) {
                    class132.field3304 = true;
                }
                class142.field3535 = -1;
                class38.field1028 = true;
                return true;
            }
            if (class142.field3535 == 241) {
                class86.field2169 = class89.field2235.method934((byte) -9);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 55) {
                class89.field2235.method944((byte) 125);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 172) {
                class103.method829(false, (byte) 116);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 218) {
                int var130 = class89.field2235.method925(56);
                int var131 = class89.field2235.method945(true);
                class1 var132 = class45.method335(var130, -89);
                class142.field3535 = -1;
                if (var132.field51 != var131 || var131 == -1) {
                    var132.field72 = 0;
                    var132.field51 = var131;
                    var132.field91 = 0;
                }
                return true;
            }
            if (class142.field3535 == 54 || class142.field3535 == 57 || class142.field3535 == 199 || class142.field3535 == 114 || class142.field3535 == 27 || class142.field3535 == 147 || class142.field3535 == 24 || class142.field3535 == 123 || class142.field3535 == 136 || class142.field3535 == 31 || class142.field3535 == 190) {
                class103.method828(true);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 149) {
                int var133 = class89.field2235.method973(-121);
                int var134 = class89.field2235.method934((byte) -9);
                int var135 = var134 & 0x1F;
                int var136 = var134 >> 5 & 0x1F;
                int var137 = var134 >> 10 & 0x1F;
                class1 var138 = class45.method335(var133, -75);
                class142.field3535 = -1;
                var138.field111 = (var135 << 3) + (var136 << 11) + (var137 << 19);
                return true;
            }
            if (class142.field3535 == 16) {
                int var139 = class89.field2235.method944((byte) 121);
                int var140 = class89.field2235.method934((byte) -9);
                class116.method1011((byte) 59, var140);
                if (var139 != -1) {
                    class116.method1011((byte) 59, var139);
                }
                if (class52.field1393 != -1) {
                    class53.method425(class52.field1393, (byte) 75);
                    class52.field1393 = -1;
                }
                if (class105.field2624 != -1) {
                    class53.method425(class105.field2624, (byte) 41);
                    class105.field2624 = -1;
                }
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) 101);
                    class129.field3246 = -1;
                }
                if (class81.field2033 == var140) {
                    class125.method1055(class81.field2033, 8494);
                } else {
                    class53.method425(class81.field2033, (byte) -97);
                    class81.field2033 = var140;
                    class45.method337(35, (byte) -115);
                }
                if (class18.field528 == var140) {
                    class125.method1055(class18.field528, 8494);
                } else {
                    class53.method425(class18.field528, (byte) 59);
                    class18.field528 = var139;
                }
                class2.field146 = 0;
                class143.field3574 = -1;
                class151.method1219((byte) -77, class81.field2033);
                class151.method1219((byte) -77, class18.field528);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 243) {
                class142.field3535 = -1;
                class38.field1037 = 0;
                return true;
            }
            if (class142.field3535 == 84) {
                if (class105.field2624 != -1) {
                    class53.method425(class105.field2624, (byte) 103);
                    class149.field3666 = true;
                    class105.field2624 = -1;
                    class38.field1028 = true;
                }
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) -66);
                    class132.field3304 = true;
                    class129.field3246 = -1;
                }
                if (class81.field2033 != -1) {
                    class53.method425(class81.field2033, (byte) 65);
                    class81.field2033 = -1;
                    class45.method337(30, (byte) -73);
                }
                if (class18.field528 != -1) {
                    class53.method425(class18.field528, (byte) -91);
                    class18.field528 = -1;
                }
                if (class52.field1393 != -1) {
                    class53.method425(class52.field1393, (byte) 64);
                    class52.field1393 = -1;
                }
                class142.field3535 = -1;
                if (class2.field146 != 0) {
                    class2.field146 = 0;
                    class132.field3304 = true;
                }
                class143.field3574 = -1;
                return true;
            }
            if (class142.field3535 == 74) {
                int var141 = class89.field2235.method934((byte) -9);
                int var142 = class89.field2235.method929(31165);
                int var143 = class89.field2235.method929(31165);
                int var144 = class89.field2235.method973(-128);
                class1 var145 = class45.method335(var144, -88);
                var145.field19 = var141;
                var145.field77 = var143;
                class142.field3535 = -1;
                var145.field78 = var142;
                return true;
            }
            if (class142.field3535 == 83) {
                class38.field1028 = true;
                int var146 = class89.field2235.method957((byte) 48);
                int var147 = class89.field2235.method925(50);
                int var148 = class89.field2235.method938(-128);
                class110.field2711[var146] = var147;
                class1.field28[var146] = var148;
                class39.field1062[var146] = 1;
                for (int var149 = 0; var149 < 98; var149++) {
                    if (class86.field2166[var149] <= var147) {
                        class39.field1062[var146] = var149 + 2;
                    }
                }
                class116.field2976 = class49.field1308;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 106) {
                int var150 = class89.field2235.method929(31165);
                class116.method1011((byte) 59, var150);
                if (class105.field2624 != -1) {
                    class53.method425(class105.field2624, (byte) -60);
                    class105.field2624 = -1;
                    class38.field1028 = true;
                    class149.field3666 = true;
                }
                if (class81.field2033 != -1) {
                    class53.method425(class81.field2033, (byte) 66);
                    class81.field2033 = -1;
                    class45.method337(30, (byte) -106);
                }
                if (class18.field528 != -1) {
                    class53.method425(class18.field528, (byte) -87);
                    class18.field528 = -1;
                }
                if (class52.field1393 != -1) {
                    class53.method425(class52.field1393, (byte) 87);
                    class52.field1393 = -1;
                }
                if (class129.field3246 == var150) {
                    class125.method1055(class129.field3246, 8494);
                } else {
                    class53.method425(class129.field3246, (byte) 45);
                    class129.field3246 = var150;
                }
                class143.field3574 = -1;
                class151.method1219((byte) -77, class129.field3246);
                class132.field3304 = true;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 158) {
                class31.field873 = true;
                class118.field3010 = class89.field2235.method957((byte) 59);
                class5.field188 = class89.field2235.method957((byte) 29);
                class87.field2205 = class89.field2235.method944((byte) 121);
                class24.field686 = class89.field2235.method957((byte) 26);
                class129.field3257 = class89.field2235.method957((byte) 15);
                if (class129.field3257 >= 100) {
                    int var151 = class118.field3010 * 128 + 64;
                    int var152 = class5.field188 * 128 + 64;
                    int var153 = class70.method585(class11.field320, var151, var152, (byte) -33) - class87.field2205;
                    int var154 = var151 - class30.field857;
                    int var155 = var152 - class70.field1785;
                    int var156 = var153 - class23.field664;
                    int var157 = (int) Math.sqrt((double) (var154 * var154 + var155 * var155));
                    class122.field3118 = (int) (Math.atan2((double) var156, (double) var157) * 325.949D) & 0x7FF;
                    class42.field1128 = (int) (-325.949D * Math.atan2((double) var154, (double) var155)) & 0x7FF;
                    if (class122.field3118 < 128) {
                        class122.field3118 = 128;
                    }
                    if (class122.field3118 > 383) {
                        class122.field3118 = 383;
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 207) {
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) 118);
                    class129.field3246 = -1;
                }
                class9.field296 = class9.field298;
                class2.field146 = 2;
                class142.field3535 = -1;
                class132.field3304 = true;
                class104.field2603 = false;
                return true;
            }
            if (class142.field3535 == 211) {
                int var158 = class89.field2235.method958((byte) -117);
                if (var158 == 65535) {
                    var158 = -1;
                }
                int var159 = class89.field2235.method973(-127);
                int var160 = class89.field2235.method946(0);
                class1 var161 = class45.method335(var159, -116);
                if (var161.field98) {
                    var161.field90 = var158;
                    var161.field3 = var160;
                    class126 var162 = class9.method86(var158, (byte) 112);
                    var161.field40 = var162.field3215;
                    var161.field78 = var162.field3219;
                    var161.field19 = var162.field3196;
                    var161.field121 = var162.field3208;
                    var161.field42 = var162.field3224;
                    var161.field77 = var162.field3199;
                    if (var161.field96 > 0) {
                        var161.field77 = var161.field77 * 32 / var161.field96;
                    }
                    class1.method14(var161, 1856980336);
                } else if (var158 == -1) {
                    class142.field3535 = -1;
                    var161.field95 = 0;
                    return true;
                } else {
                    class126 var163 = class9.method86(var158, (byte) 115);
                    var161.field95 = 4;
                    var161.field77 = var163.field3199 * 100 / var160;
                    var161.field19 = var163.field3196;
                    var161.field39 = var158;
                    var161.field78 = var163.field3219;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 182) {
                int var164 = class89.field2235.method942(-31);
                if (var164 >= 0) {
                    class116.method1011((byte) 59, var164);
                }
                if (class1.field80 != var164) {
                    class53.method425(class1.field80, (byte) 108);
                    class1.field80 = var164;
                }
                class151.method1219((byte) -77, class1.field80);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 217) {
                class64.field1685 = class89.field2235.method957((byte) 40);
                if (class64.field1685 == 1) {
                    class118.field3006 = class89.field2235.method944((byte) 122);
                }
                if (class64.field1685 >= 2 && class64.field1685 <= 6) {
                    if (class64.field1685 == 2) {
                        class62.field1630 = 64;
                        class20.field566 = 64;
                    }
                    if (class64.field1685 == 3) {
                        class20.field566 = 64;
                        class62.field1630 = 0;
                    }
                    if (class64.field1685 == 4) {
                        class20.field566 = 64;
                        class62.field1630 = 128;
                    }
                    if (class64.field1685 == 5) {
                        class20.field566 = 0;
                        class62.field1630 = 64;
                    }
                    if (class64.field1685 == 6) {
                        class62.field1630 = 64;
                        class20.field566 = 128;
                    }
                    class64.field1685 = 2;
                    class78.field1995 = class89.field2235.method944((byte) 116);
                    class44.field1173 = class89.field2235.method944((byte) 119);
                    class42.field1124 = class89.field2235.method957((byte) 44);
                }
                if (class64.field1685 == 10) {
                    class132.field3317 = class89.field2235.method944((byte) 116);
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 239) {
                class38.field1028 = true;
                int var165 = class89.field2235.method973(-121);
                int var166 = class89.field2235.method944((byte) 126);
                if (var165 < -70000) {
                    var166 += 32768;
                }
                class1 var167;
                if (var165 >= 0) {
                    var167 = class45.method335(var165, -97);
                } else {
                    var167 = null;
                }
                while (class89.field2235.field2816 < class81.field2039) {
                    int var168 = class89.field2235.method963((byte) -116);
                    int var169 = 0;
                    int var170 = class89.field2235.method944((byte) 109);
                    if (var170 != 0) {
                        var169 = class89.field2235.method957((byte) 8);
                        if (var169 == 255) {
                            var169 = class89.field2235.method973(-122);
                        }
                    }
                    if (var167 != null && var168 >= 0 && var167.field6.length > var168) {
                        var167.field6[var168] = var170;
                        var167.field92[var168] = var169;
                    }
                    class18.method152((byte) 114, var168, var169, var170 - 1, var166);
                }
                class142.field3535 = -1;
                class19.field536 = class49.field1308;
                return true;
            }
            if (class142.field3535 == 175) {
                class9.field315 = class89.field2235.method927((byte) 122);
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) -103);
                    class129.field3246 = -1;
                }
                class9.field296 = class9.field298;
                class142.field3535 = -1;
                class104.field2603 = false;
                class2.field146 = 4;
                class132.field3304 = true;
                return true;
            }
            if (class142.field3535 == 166) {
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) -73);
                    class129.field3246 = -1;
                }
                class104.field2603 = false;
                class132.field3304 = true;
                class2.field146 = 1;
                class142.field3535 = -1;
                class9.field296 = class9.field298;
                return true;
            }
            if (class142.field3535 == 141) {
                class84.field2149 = class89.field2235.method938(-128);
                class19.field531 = class89.field2235.method938(-128);
                for (int var171 = class84.field2149; var171 < class84.field2149 + 8; var171++) {
                    for (int var172 = class19.field531; var172 < class19.field531 + 8; var172++) {
                        if (class118.field3019[class11.field320][var171][var172] != null) {
                            class118.field3019[class11.field320][var171][var172] = null;
                            class36.method285(var171, var172, true);
                        }
                    }
                }
                for (class132 var173 = (class132) class112.field2790.method514((byte) -79); var173 != null; var173 = (class132) class112.field2790.method517(-60)) {
                    if (class84.field2149 <= var173.field3314 && var173.field3314 < class84.field2149 + 8 && class19.field531 <= var173.field3301 && var173.field3301 < class19.field531 + 8 && class11.field320 == var173.field3311) {
                        var173.field3312 = 0;
                    }
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 70) {
                class73 var174 = class89.field2235.method927((byte) 122);
                Object[] var175 = new Object[var174.method632((byte) -61) + 1];
                for (int var176 = var174.method632((byte) -62) - 1; var176 >= 0; var176--) {
                    if (var174.method624(var176, false) == 115) {
                        var175[var176 + 1] = class89.field2235.method927((byte) 122);
                    } else {
                        var175[var176 + 1] = Integer.valueOf(class89.field2235.method973(-124));
                    }
                }
                var175[0] = Integer.valueOf(class89.field2235.method973(-121));
                class57.method490(var175, 0, (byte) 78, null, 0, null, 0);
                class142.field3535 = -1;
                return true;
            }
            if (!arg0) {
                return false;
            }
            if (class142.field3535 == 255) {
                class21.method170(-78);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 130) {
                if (class141.field3523 == 12) {
                    class38.field1028 = true;
                }
                class94.field2389 = class89.field2235.method957((byte) 115);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 71) {
                long var177 = class89.field2235.method970(-29916);
                int var179 = class89.field2235.method944((byte) 123);
                class89.field2235.method966((byte) 54);
                boolean var180 = false;
                if ((var177 & Long.MIN_VALUE) != 0L) {
                    var180 = true;
                }
                if (var180) {
                    if (class51.field1370 == 0) {
                        class142.field3535 = -1;
                        return true;
                    }
                    long var181 = var177 & Long.MAX_VALUE;
                    boolean var183 = false;
                    int var184;
                    for (var184 = 0; class51.field1370 > var184 && (class13.field417[var184].field3522 != var181 || class13.field417[var184].field2018 != var179); var184++) {
                    }
                    if (class51.field1370 > var184) {
                        while (var184 < class51.field1370 - 1) {
                            class13.field417[var184] = class13.field417[var184 + 1];
                            var184++;
                        }
                        class13.field417[class51.field1370] = null;
                        class51.field1370--;
                    }
                } else if (class51.field1370 < 100) {
                    class80 var185 = new class80();
                    var185.field3522 = var177;
                    var185.field2015 = class84.method708(var185.field3522, 109);
                    var185.field2018 = var179;
                    int var186;
                    for (var186 = class51.field1370 - 1; var186 >= 0; var186--) {
                        int var187 = class13.field417[var186].field2015.method637(var185.field2015, (byte) 53);
                        System.out.println("co=" + var187);
                        if (var187 == 0) {
                            class142.field3535 = -1;
                            return true;
                        }
                        if (var187 < 0) {
                            break;
                        }
                        class13.field417[var186 + 1] = class13.field417[var186];
                    }
                    class13.field417[var186 + 1] = var185;
                    class51.field1370++;
                } else {
                    class142.field3535 = -1;
                    return true;
                }
                class112.field2807 = class49.field1308;
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 113) {
                int var188 = class89.field2235.method929(31165);
                class116.method1011((byte) 59, var188);
                if (class105.field2624 != -1) {
                    class53.method425(class105.field2624, (byte) 101);
                    class38.field1028 = true;
                    class149.field3666 = true;
                    class105.field2624 = -1;
                }
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) 111);
                    class132.field3304 = true;
                    class129.field3246 = -1;
                }
                if (class81.field2033 != -1) {
                    class53.method425(class81.field2033, (byte) -121);
                    class81.field2033 = -1;
                    class45.method337(30, (byte) -86);
                }
                if (class18.field528 != -1) {
                    class53.method425(class18.field528, (byte) 68);
                    class18.field528 = -1;
                }
                if (class52.field1393 == var188) {
                    class125.method1055(class52.field1393, 8494);
                } else {
                    class53.method425(class52.field1393, (byte) 78);
                    class52.field1393 = var188;
                }
                class143.field3574 = -1;
                if (class2.field146 != 0) {
                    class132.field3304 = true;
                    class2.field146 = 0;
                }
                class151.method1219((byte) -77, class52.field1393);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 144) {
                int var189 = class89.field2235.method958((byte) -103);
                class116.method1011((byte) 59, var189);
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) -119);
                    class129.field3246 = -1;
                    class132.field3304 = true;
                }
                if (class81.field2033 != -1) {
                    class53.method425(class81.field2033, (byte) -110);
                    class81.field2033 = -1;
                    class45.method337(30, (byte) -97);
                }
                if (class18.field528 != -1) {
                    class53.method425(class18.field528, (byte) -123);
                    class18.field528 = -1;
                }
                if (class52.field1393 != -1) {
                    class53.method425(class52.field1393, (byte) -106);
                    class52.field1393 = -1;
                }
                if (class105.field2624 == var189) {
                    class125.method1055(class105.field2624, 8494);
                } else {
                    class53.method425(class105.field2624, (byte) 89);
                    class105.field2624 = var189;
                }
                class149.field3666 = true;
                class143.field3574 = -1;
                class38.field1028 = true;
                if (class2.field146 != 0) {
                    class132.field3304 = true;
                    class2.field146 = 0;
                }
                class151.method1219((byte) -77, class105.field2624);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 162) {
                int var190 = class89.field2235.method946(0);
                class73 var191 = class89.field2235.method927((byte) 122);
                class1 var192 = class45.method335(var190, -74);
                var192.field29 = var191;
                if (var190 >> 16 == class24.field683[class141.field3523]) {
                    class38.field1028 = true;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 61) {
                class31.field873 = false;
                for (int var193 = 0; var193 < 5; var193++) {
                    field1265[var193] = false;
                }
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 30) {
                int var194 = class89.field2235.method958((byte) -122);
                int var195 = class89.field2235.method944((byte) 113);
                if (class129.field3246 != -1) {
                    class53.method425(class129.field3246, (byte) -76);
                    class129.field3246 = -1;
                    class132.field3304 = true;
                }
                if (class81.field2033 != -1) {
                    class53.method425(class81.field2033, (byte) -68);
                    class81.field2033 = -1;
                    class45.method337(30, (byte) -63);
                }
                if (class18.field528 != -1) {
                    class53.method425(class18.field528, (byte) -76);
                    class18.field528 = -1;
                }
                if (class52.field1393 == var194) {
                    class125.method1055(class52.field1393, 8494);
                } else {
                    class53.method425(class52.field1393, (byte) 95);
                    class52.field1393 = var194;
                }
                if (class105.field2624 == var195) {
                    class125.method1055(class105.field2624, 8494);
                } else {
                    class53.method425(class105.field2624, (byte) -97);
                    class105.field2624 = var195;
                }
                class143.field3574 = -1;
                class149.field3666 = true;
                if (class2.field146 != 0) {
                    class2.field146 = 0;
                    class132.field3304 = true;
                }
                class38.field1028 = true;
                class151.method1219((byte) -77, class52.field1393);
                class151.method1219((byte) -77, class105.field2624);
                class142.field3535 = -1;
                return true;
            }
            if (class142.field3535 == 18) {
                class73 var196 = class89.field2235.method927((byte) 122);
                if (var196.method627(2858, class102.field2541)) {
                    class73 var197 = var196.method630(var196.method623(-1893532698, class48.field1279), 0, -24023);
                    long var198 = var197.method643(255);
                    boolean var200 = false;
                    for (int var201 = 0; var201 < class126.field3231; var201++) {
                        if (class102.field2558[var201] == var198) {
                            var200 = true;
                            break;
                        }
                    }
                    if (!var200 && class32.field894 == 0) {
                        class74.method647((byte) 126, var197, class110.field2709, 4);
                    }
                } else if (var196.method627(2858, class82.field2075)) {
                    class73 var202 = var196.method630(var196.method623(-1893532698, class48.field1279), 0, -24023);
                    long var203 = var202.method643(255);
                    boolean var205 = false;
                    for (int var206 = 0; var206 < class126.field3231; var206++) {
                        if (class102.field2558[var206] == var203) {
                            var205 = true;
                            break;
                        }
                    }
                    if (!var205 && class32.field894 == 0) {
                        class74.method647((byte) 127, var202, class14.field432, 8);
                    }
                } else if (var196.method627(2858, class123.field3143)) {
                    class73 var207 = var196.method630(var196.method623(-1893532698, class48.field1279), 0, -24023);
                    long var208 = var207.method643(255);
                    boolean var210 = false;
                    for (int var211 = 0; var211 < class126.field3231; var211++) {
                        if (class102.field2558[var211] == var208) {
                            var210 = true;
                            break;
                        }
                    }
                    if (!var210 && class32.field894 == 0) {
                        class73 var212 = var196.method630(var196.method632((byte) -107) - 9, var196.method623(-1893532698, class48.field1279) + 1, -24023);
                        class74.method647((byte) 125, var207, var212, 8);
                    }
                } else {
                    class74.method647((byte) 126, class9.field298, var196, 0);
                }
                class142.field3535 = -1;
                return true;
            }
            class111.method894("T1 - " + class142.field3535 + "," + client.field616 + "," + class61.field1604 + " - " + class81.field2039, null, (byte) 2);
            class26.method207(123);
        } catch (IOException var216) {
            class76.method656(0);
        } catch (Exception var217) {
            String var214 = "T2 - " + class142.field3535 + "," + client.field616 + "," + class61.field1604 + " - " + class81.field2039 + "," + (class73.field1901.field2304[0] + class80.field2029) + "," + (class73.field1901.field2280[0] + class121.field3093) + " - ";
            for (int var215 = 0; var215 < class81.field2039 && var215 < 50; var215++) {
                var214 = var214 + class89.field2235.field2880[var215] + ",";
            }
            class111.method894(var214, var217, (byte) 2);
            class26.method207(-116);
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1257++;
        if (arg0 == arg5 && arg1 == arg6) {
            return true;
        }
        if (arg3 != 9313) {
            this.method375(12, -80, -76, 80, 68, 69, 66, 70);
        }
        int var8 = arg0 - this.field1255;
        int var9 = arg1 - this.field1237;
        int var10 = arg5 - this.field1255;
        int var11 = arg6 - this.field1237;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lq;Ljava/awt/Component;I)V")
    public static final void method368(class111 arg0, Component arg1, int arg2) {
        field1262++;
        if (class54.field1431) {
            return;
        }
        class45.field1184 = class119.method1027(class105.field2612, arg0, class87.field2200, 0);
        class80.field2019 = class119.method1027(class105.field2612, arg0, class34.field916, 0);
        int var3 = 108 % ((arg2 + 24) / 49);
        class79.field2010 = class119.method1027(class105.field2612, arg0, class86.field2186, 0);
        class142.field3536 = class119.method1027(class105.field2612, arg0, class66.field1712, 0);
        class151.field3749 = class119.method1027(class105.field2612, arg0, class32.field892, 0);
        class84.field2138 = class119.method1027(class105.field2612, arg0, class139.field3464, 0);
        class92.field2379 = class72.method600(arg1, 479, 96, -30723);
        class80.field2019.method208(0, 0);
        class136.field3399 = class72.method600(arg1, 172, 156, -30723);
        class17.method140();
        class79.field2010.method208(0, 0);
        class142.field3542 = class72.method600(arg1, 190, 261, -30723);
        class45.field1184.method208(0, 0);
        class89.field2294 = class72.method600(arg1, 512, 334, -30723);
        class17.method140();
        class103.field2565 = class72.method600(arg1, 496, 50, -30723);
        class151.field3747 = class72.method600(arg1, 269, 37, -30723);
        class92.field2377 = class72.method600(arg1, 249, 45, -30723);
        class106 var4 = class76.method662(arg0, class105.field2612, 7, class87.field2192);
        class23.field679 = class72.method600(arg1, var4.field2625, var4.field2627, -30723);
        var4.method841(0, 0);
        class106 var5 = class76.method662(arg0, class105.field2612, 7, class31.field861);
        class26.field770 = class72.method600(arg1, var5.field2625, var5.field2627, -30723);
        var5.method841(0, 0);
        class106 var6 = class76.method662(arg0, class105.field2612, 7, class87.field2199);
        class51.field1365 = class72.method600(arg1, var6.field2625, var6.field2627, -30723);
        var6.method841(0, 0);
        class106 var7 = class76.method662(arg0, class105.field2612, 7, class49.field1306);
        class22.field625 = class72.method600(arg1, var7.field2625, var7.field2627, -30723);
        var7.method841(0, 0);
        class106 var8 = class76.method662(arg0, class105.field2612, 7, class102.field2531);
        class48.field1287 = class72.method600(arg1, var8.field2625, var8.field2627, -30723);
        var8.method841(0, 0);
        class106 var9 = class76.method662(arg0, class105.field2612, 7, class89.field2240);
        class55.field1488 = class72.method600(arg1, var9.field2625, var9.field2627, -30723);
        var9.method841(0, 0);
        class106 var10 = class76.method662(arg0, class105.field2612, 7, class107.field2646);
        class36.field982 = class72.method600(arg1, var10.field2625, var10.field2627, -30723);
        var10.method841(0, 0);
        class106 var11 = class76.method662(arg0, class105.field2612, 7, class43.field1154);
        class38.field1030 = class72.method600(arg1, var11.field2625, var11.field2627, -30723);
        var11.method841(0, 0);
        class106 var12 = class76.method662(arg0, class105.field2612, 7, class76.field1956);
        class139.field3462 = class72.method600(arg1, var12.field2625, var12.field2627, -30723);
        var12.method841(0, 0);
        class22.field635 = class119.method1027(class105.field2612, arg0, class15.field456, 0);
        class116.field2978 = class119.method1027(class105.field2612, arg0, class146.field3599, 0);
        class89.field2252 = class119.method1027(class105.field2612, arg0, class146.field3612, 0);
        class81.field2038 = class22.field635.method209();
        class81.field2038.method212();
        class39.field1064 = class116.field2978.method209();
        class39.field1064.method212();
        class55.field1480 = class22.field635.method209();
        class55.field1480.method211();
        class86.field2184 = class116.field2978.method209();
        class86.field2184.method211();
        class38.field1045 = class89.field2252.method209();
        class38.field1045.method211();
        class99.field2491 = class22.field635.method209();
        class99.field2491.method212();
        class99.field2491.method211();
        class115.field2887 = class116.field2978.method209();
        class115.field2887.method212();
        class115.field2887.method211();
        class11.field358 = class3.method20(40, arg0, class57.field1513, class105.field2612);
        class22.field642 = new int[33];
        client.field607 = new int[151];
        class142.field3531 = new int[151];
        class114.field2817 = new int[33];
        for (int var13 = 0; var13 < 33; var13++) {
            int var18 = 999;
            int var19 = 0;
            for (int var20 = 0; var20 < 34; var20++) {
                if (class79.field2010.field771[class79.field2010.field772 * var13 + var20] == 0) {
                    if (var18 == 999) {
                        var18 = var20;
                    }
                } else if (var18 != 999) {
                    var19 = var20;
                    break;
                }
            }
            class22.field642[var13] = var18;
            class114.field2817[var13] = var19 - var18;
        }
        for (int var14 = 5; var14 < 156; var14++) {
            int var15 = 999;
            int var16 = 0;
            for (int var17 = 25; var17 < 172; var17++) {
                if (class79.field2010.field771[class79.field2010.field772 * var14 + var17] == 0 && (var17 > 34 || var14 > 34)) {
                    if (var15 == 999) {
                        var15 = var17;
                    }
                } else if (var15 != 999) {
                    var16 = var17;
                    break;
                }
            }
            class142.field3531[var14 - 5] = var15 - 25;
            client.field607[var14 - 5] = var16 - var15;
        }
        class54.field1431 = true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method369(byte arg0) {
        field1246++;
        class16.field489.method534((byte) 16);
        if (arg0 != 15) {
            field1260 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method370(int arg0) {
        for (int var2 = 0; var2 < this.field1261; var2++) {
            for (int var4 = 0; var4 < this.field1250; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1261 - 1 == var2 || this.field1250 - 1 == var4) {
                    this.field1249[var2][var4] = 16777215;
                } else {
                    this.field1249[var2][var4] = 16777216;
                }
            }
        }
        int var3 = -52 / ((arg0 - 24) / 55);
        field1233++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIIZI)V")
    public final void method371(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1241++;
        int var7 = arg5 - this.field1237;
        int var8 = arg2 - this.field1255;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method379(var7, false, var8, 128);
                this.method379(var7, false, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method379(var7, false, var8, 2);
                this.method379(var7 + 1, false, var8, 32);
            }
            if (arg3 == 2) {
                this.method379(var7, false, var8, 8);
                this.method379(var7, false, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method379(var7, false, var8, 32);
                this.method379(var7 - 1, false, var8, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method379(var7, false, var8, 1);
                this.method379(var7 + 1, false, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method379(var7, false, var8, 4);
                this.method379(var7 + 1, false, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method379(var7, false, var8, 16);
                this.method379(var7 - 1, false, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method379(var7, false, var8, 64);
                this.method379(var7 - 1, false, var8 - 1, 4);
            }
        }
        if (arg1 <= 118) {
            this.method365(false, -11, -25, -56, 56, -1);
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method379(var7, false, var8, 130);
                this.method379(var7, false, var8 - 1, 8);
                this.method379(var7 + 1, false, var8, 32);
            }
            if (arg3 == 1) {
                this.method379(var7, false, var8, 10);
                this.method379(var7 + 1, false, var8, 32);
                this.method379(var7, false, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method379(var7, false, var8, 40);
                this.method379(var7, false, var8 + 1, 128);
                this.method379(var7 - 1, false, var8, 2);
            }
            if (arg3 == 3) {
                this.method379(var7, false, var8, 160);
                this.method379(var7 - 1, false, var8, 2);
                this.method379(var7, false, var8 - 1, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method379(var7, false, var8, 65536);
                this.method379(var7, false, var8 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method379(var7, false, var8, 1024);
                this.method379(var7 + 1, false, var8, 16384);
            }
            if (arg3 == 2) {
                this.method379(var7, false, var8, 4096);
                this.method379(var7, false, var8 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method379(var7, false, var8, 16384);
                this.method379(var7 - 1, false, var8, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method379(var7, false, var8, 512);
                this.method379(var7 + 1, false, var8 - 1, 8192);
            }
            if (arg3 == 1) {
                this.method379(var7, false, var8, 2048);
                this.method379(var7 + 1, false, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method379(var7, false, var8, 8192);
                this.method379(var7 - 1, false, var8 + 1, 512);
            }
            if (arg3 == 3) {
                this.method379(var7, false, var8, 32768);
                this.method379(var7 - 1, false, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method379(var7, false, var8, 66560);
            this.method379(var7, false, var8 - 1, 4096);
            this.method379(var7 + 1, false, var8, 16384);
        }
        if (arg3 == 1) {
            this.method379(var7, false, var8, 5120);
            this.method379(var7 + 1, false, var8, 16384);
            this.method379(var7, false, var8 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method379(var7, false, var8, 20480);
            this.method379(var7, false, var8 + 1, 65536);
            this.method379(var7 - 1, false, var8, 1024);
        }
        if (arg3 == 3) {
            this.method379(var7, false, var8, 81920);
            this.method379(var7 - 1, false, var8, 1024);
            this.method379(var7, false, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIZI)V")
    public final void method372(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1254++;
        int var8 = arg1 - this.field1255;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg3;
            arg3 = arg4;
            arg4 = var9;
        }
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        int var11 = arg0 - this.field1237;
        if (arg6 != -1) {
            return;
        }
        for (int var12 = var8; var12 < arg3 + var8; var12++) {
            if (var12 >= 0 && this.field1261 > var12) {
                for (int var13 = var11; var13 < arg4 + var11; var13++) {
                    if (var13 >= 0 && this.field1250 > var13) {
                        this.method379(var13, false, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZ)V")
    private final void method373(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method379(-50, false, -86, 113);
        }
        field1259++;
        this.field1249[arg0][arg2] = class149.method1189(this.field1249[arg0][arg2], ~arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII[La;I)Z")
    public static final boolean method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class1[] arg8, int arg9) {
        class17.method143(arg9, arg1, arg6, arg2);
        boolean var10 = true;
        field1252++;
        for (int var11 = 0; var11 < arg8.length; var11++) {
            class1 var12 = arg8[var11];
            if (var12 != null && (var12.field101 == arg5 || arg5 == -1412584499 && class74.field1917 == var12)) {
                if (var12.field84 > 0) {
                    class64.method533(var12, 150);
                }
                int var13 = var12.field60 + arg9 - arg0;
                int var14 = var12.field89;
                int var15 = var12.field115 + arg1 - arg4;
                if (class74.field1917 == var12) {
                    if (arg5 != -1412584499 && !var12.field64) {
                        class120.field3067 = arg4 - arg1;
                        class84.field2150 = arg0 - arg9;
                        class54.field1446 = arg8;
                        continue;
                    }
                    class1 var16 = class15.method122((byte) 124, var12);
                    if (var16 == null) {
                        class74.field1917 = null;
                    } else {
                        int var17 = class31.field869;
                        int var18 = class3.field161;
                        if (class1.field27 == 0) {
                            var17 -= 4;
                            var18 -= 4;
                        }
                        if (class1.field27 == 1) {
                            var18 -= 205;
                            var17 -= 553;
                        }
                        if (class1.field27 == 2) {
                            var17 -= 17;
                            var18 -= 357;
                        }
                        int var19 = var17 - class26.field768;
                        int var20 = var18 - class19.field544;
                        int[] var21 = class94.method781(var16, 126);
                        if (var21[0] > var19) {
                            var19 = var21[0];
                        }
                        class1 var22 = class120.field3066[var12.field45 >> 16][var12.field101 & 0xFFFF];
                        if (var20 < var21[1]) {
                            var20 = var21[1];
                        }
                        if (var21[1] + var16.field63 < var20 - -var12.field63) {
                            var20 = var21[1] + var16.field63 - var12.field63;
                        }
                        if (var12.field96 + var19 > var21[0] + var16.field96) {
                            var19 = var21[0] + var16.field96 - var12.field96;
                        }
                        int[] var23 = class94.method781(var22, arg7 ^ 0xFFFFC488);
                        int var24 = var20 + var22.field86 - var23[1];
                        int var25 = var19 + var22.field73 - var23[0];
                        if (!var12.field64) {
                            var14 = 128;
                        }
                        int var26 = var24 - var12.field115;
                        int var27 = var25 - var12.field60;
                        if (var27 <= var12.field41 && -var12.field41 <= var27 && var26 <= var12.field41 && var26 >= -var12.field41 && !class104.field2598) {
                            var27 = 0;
                            var26 = 0;
                        } else if (var12.field38 >= class15.field461 && !class104.field2598) {
                            var26 = 0;
                            var27 = 0;
                        }
                        var13 += var27;
                        var15 += var26;
                    }
                }
                if ((!var12.field98 || var13 <= class17.field507 && var15 <= class17.field501 && var12.field96 + var13 >= class17.field502 && var12.field63 + var15 >= class17.field504) && (!var12.field98 || !class112.method910(var12, -2667))) {
                    if (var12.field81 == 0) {
                        if (!var12.field98 && class112.method910(var12, -2667) && !class92.method772(arg3, (byte) -128, var11)) {
                            continue;
                        }
                        if (!var12.field98) {
                            if (var12.field93 - var12.field63 < var12.field86) {
                                var12.field86 = var12.field93 - var12.field63;
                            }
                            if (var12.field86 < 0) {
                                var12.field86 = 0;
                            }
                        }
                        var10 &= method374(var12.field73, var15, var12.field63 + var15, arg3, var12.field86, var12.field45, var12.field96 + var13, arg7, arg8, var13);
                        if (var12.field126 != null) {
                            var10 &= method374(var12.field73, var15, var12.field63 + var15, arg3, var12.field86, var12.field45, var12.field96 + var13, -15113, var12.field126, var13);
                        }
                        class17.method143(arg9, arg1, arg6, arg2);
                        if (var12.field93 > var12.field63 && !var12.field98) {
                            class28.method227(var15, (byte) 21, var12.field86, var12.field93, var12.field63, var13 + var12.field96);
                        }
                    }
                    if (var12.field81 != 1) {
                        if (var12.field81 == 2) {
                            int var28 = 0;
                            for (int var29 = 0; var29 < var12.field63; var29++) {
                                for (int var30 = 0; var30 < var12.field96; var30++) {
                                    int var31 = (var12.field59 + 32) * var30 + var13;
                                    int var32 = (var12.field16 + 32) * var29 + var15;
                                    if (var28 < 20) {
                                        var31 += var12.field71[var28];
                                        var32 += var12.field61[var28];
                                    }
                                    if (var12.field6[var28] > 0) {
                                        boolean var34 = false;
                                        boolean var35 = false;
                                        int var36 = var12.field6[var28] - 1;
                                        if (class17.field502 - 32 < var31 && class17.field507 > var31 && class17.field504 - 32 < var32 && var32 < class17.field501 || class87.field2198 != 0 && class63.field1663 == var28) {
                                            class106 var37;
                                            if (class103.field2567 == 1 && class57.field1525 == var28 && class70.field1775 == var12.field45) {
                                                var37 = class137.method1127(var12.field92[var28], -125, 2, 0, false, var36);
                                            } else {
                                                var37 = class137.method1127(var12.field92[var28], -107, 1, 3153952, false, var36);
                                            }
                                            if (var37 == null) {
                                                var10 = false;
                                            } else if (class87.field2198 != 0 && class63.field1663 == var28 && class115.field2907 == var12.field45) {
                                                int var38 = class31.field869 - class73.field1892;
                                                if (var38 < 5 && var38 > -5) {
                                                    var38 = 0;
                                                }
                                                int var39 = class3.field161 - class9.field291;
                                                if (var39 < 5 && var39 > -5) {
                                                    var39 = 0;
                                                }
                                                if (class34.field934 < 5) {
                                                    var38 = 0;
                                                    var39 = 0;
                                                }
                                                var37.method855(var31 + var38, var32 - -var39, 128);
                                                if (arg5 != -1) {
                                                    class1 var40 = arg8[arg5 & 0xFFFF];
                                                    if (class17.field504 > var32 + var39 && var40.field86 > 0) {
                                                        int var41 = (class17.field504 - var32 - var39) * class125.field3166 / 3;
                                                        if (class125.field3166 * 10 < var41) {
                                                            var41 = class125.field3166 * 10;
                                                        }
                                                        if (var41 > var40.field86) {
                                                            var41 = var40.field86;
                                                        }
                                                        var40.field86 -= var41;
                                                        class9.field291 += var41;
                                                    }
                                                    if (var39 + var32 + 32 > class17.field501 && var40.field86 < var40.field93 - var40.field63) {
                                                        int var42 = (var32 + var39 + 32 - class17.field501) * class125.field3166 / 3;
                                                        if (class125.field3166 * 10 < var42) {
                                                            var42 = class125.field3166 * 10;
                                                        }
                                                        if (var42 > var40.field93 - var40.field86 - var40.field63) {
                                                            var42 = var40.field93 - var40.field86 - var40.field63;
                                                        }
                                                        var40.field86 += var42;
                                                        class9.field291 -= var42;
                                                    }
                                                }
                                            } else if (class105.field2607 != 0 && class132.field3309 == var28 && class89.field2225 == var12.field45) {
                                                var37.method855(var31, var32, 128);
                                            } else {
                                                var37.method860(var31, var32);
                                            }
                                        }
                                    } else if (var12.field122 != null && var28 < 20) {
                                        class106 var33 = var12.method6(var28, true);
                                        if (var33 != null) {
                                            var33.method860(var31, var32);
                                        } else if (class71.field1797) {
                                            var10 = false;
                                        }
                                    }
                                    var28++;
                                }
                            }
                        } else if (var12.field81 == 3) {
                            int var43;
                            if (class115.method979(true, var12)) {
                                var43 = var12.field4;
                                if (class92.method772(arg3, (byte) -103, var11) && var12.field65 != 0) {
                                    var43 = var12.field65;
                                }
                            } else {
                                var43 = var12.field111;
                                if (class92.method772(arg3, (byte) -110, var11) && var12.field114 != 0) {
                                    var43 = var12.field114;
                                }
                            }
                            if (var14 == 0) {
                                if (var12.field32) {
                                    class17.method133(var13, var15, var12.field96, var12.field63, var43);
                                } else {
                                    class17.method134(var13, var15, var12.field96, var12.field63, var43);
                                }
                            } else if (var12.field32) {
                                class17.method146(var13, var15, var12.field96, var12.field63, var43, 256 - (var14 & 0xFF));
                            } else {
                                class17.method142(var13, var15, var12.field96, var12.field63, var43, 256 - (var14 & 0xFF));
                            }
                        } else if (var12.field81 == 4) {
                            class46 var44 = var12.method12(true);
                            if (var44 != null) {
                                class73 var45 = var12.field29;
                                int var46;
                                if (class115.method979(true, var12)) {
                                    var46 = var12.field4;
                                    if (class92.method772(arg3, (byte) -86, var11) && var12.field65 != 0) {
                                        var46 = var12.field65;
                                    }
                                    if (var12.field128.method632((byte) -65) > 0) {
                                        var45 = var12.field128;
                                    }
                                } else {
                                    var46 = var12.field111;
                                    if (class92.method772(arg3, (byte) -104, var11) && var12.field114 != 0) {
                                        var46 = var12.field114;
                                    }
                                }
                                if (var12.field98 && var12.field90 != -1) {
                                    class126 var47 = class9.method86(var12.field90, (byte) 81);
                                    var45 = var47.field3220;
                                    if (var45 == null) {
                                        var45 = class18.field525;
                                    }
                                    if ((var47.field3238 == 1 || var12.field3 != 1) && var12.field3 != -1) {
                                        var45 = class32.method258(-79, new class73[] { var45, class62.field1631, class33.method261(var12.field3, true) });
                                    }
                                }
                                if (class143.field3574 == var12.field45 && class53.field1422 == var12.field1) {
                                    var46 = var12.field111;
                                    var45 = class71.field1788;
                                }
                                if (class17.field503 == 479) {
                                    if (var46 == 16776960) {
                                        var46 = 255;
                                    }
                                    if (var46 == 49152) {
                                        var46 = 16777215;
                                    }
                                }
                                class73 var48 = class71.method594((byte) -122, var45, var12);
                                var44.method362(var48, var13, var15, var12.field96, var12.field63, var46, var12.field94 ? 0 : -1, var12.field22, var12.field127, var12.field21);
                            } else if (class71.field1797) {
                                var10 = false;
                            }
                        } else if (var12.field81 == 5) {
                            if (var12.field98) {
                                class106 var50;
                                if (var12.field90 == -1) {
                                    var50 = var12.method11(false, (byte) 6);
                                } else {
                                    var50 = class137.method1127(var12.field3, -118, var12.field33, var12.field103, false, var12.field90);
                                }
                                if (var50 != null) {
                                    int var51 = var50.field2628;
                                    int var52 = var50.field2631;
                                    if (var12.field123) {
                                        int[] var54 = new int[4];
                                        class17.method145(var54);
                                        int var55 = var13;
                                        if (var13 < var54[0]) {
                                            var55 = var54[0];
                                        }
                                        int var56 = var15;
                                        if (var54[1] > var15) {
                                            var56 = var54[1];
                                        }
                                        int var57 = var12.field63 + var15;
                                        int var58 = var12.field96 + var13;
                                        if (var54[2] < var58) {
                                            var58 = var54[2];
                                        }
                                        if (var57 > var54[3]) {
                                            var57 = var54[3];
                                        }
                                        class17.method143(var55, var56, var58, var57);
                                        int var59 = (var12.field96 + var51 - 1) / var51;
                                        int var60 = (var12.field63 + var52 - 1) / var52;
                                        for (int var61 = 0; var61 < var59; var61++) {
                                            for (int var62 = 0; var62 < var60; var62++) {
                                                if (var12.field119 != 0) {
                                                    var50.method854(var51 / 2 + var13 + var51 * var61, var52 / 2 + var52 * var62 + var15, var12.field119, 4096);
                                                } else if (var14 == 0) {
                                                    var50.method860(var13 + var51 * var61, var52 * var62 + var15);
                                                } else {
                                                    var50.method855(var51 * var61 + var13, var52 * var62 + var15, 256 - (var14 & 0xFF));
                                                }
                                            }
                                        }
                                        class17.method137(var54);
                                    } else {
                                        int var53 = var12.field96 * 4096 / var51;
                                        if (var12.field119 != 0) {
                                            var50.method854(var12.field96 / 2 + var13, var12.field63 / 2 + var15, var12.field119, var53);
                                        } else if (var14 != 0) {
                                            var50.method851(var13, var15, var12.field96, var12.field63, 256 - (var14 & 0xFF));
                                        } else if (var12.field96 == var51 && var12.field63 == var52) {
                                            var50.method860(var13, var15);
                                        } else {
                                            var50.method865(var13, var15, var12.field96, var12.field63);
                                        }
                                    }
                                } else if (class71.field1797) {
                                    var10 = false;
                                }
                            } else {
                                class106 var49 = var12.method11(class115.method979(true, var12), (byte) 6);
                                if (var49 != null) {
                                    var49.method860(var13, var15);
                                } else if (class71.field1797) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field81 == 6) {
                            boolean var63 = class115.method979(true, var12);
                            int var64;
                            if (var63) {
                                var64 = var12.field130;
                            } else {
                                var64 = var12.field51;
                            }
                            class91 var65 = null;
                            int var66 = 0;
                            if (var12.field90 != -1) {
                                class126 var68 = class9.method86(var12.field90, (byte) 90);
                                if (var68 != null) {
                                    class126 var69 = var68.method1068((byte) -65, var12.field3);
                                    var65 = var69.method1071(1, 98);
                                    if (var65 == null) {
                                        var10 = false;
                                    } else {
                                        var65.method755();
                                        var66 = var65.field514 / 2;
                                    }
                                }
                            } else if (var12.field95 == 5) {
                                if (var12.field39 == 0) {
                                    var65 = class131.field3294.method434(-1, -111, -1, null, null);
                                } else {
                                    var65 = class73.field1901.method90(arg7 + 26913);
                                }
                            } else if (var64 == -1) {
                                var65 = var12.method2(class73.field1901.field3014, (byte) 33, var63, -1, null);
                                if (var65 == null && class71.field1797) {
                                    var10 = false;
                                }
                            } else {
                                class36 var67 = class94.method782(-24669, var64);
                                var65 = var12.method2(class73.field1901.field3014, (byte) 33, var63, var12.field91, var67);
                                if (var65 == null && class71.field1797) {
                                    var10 = false;
                                }
                            }
                            class29.method230(var12.field96 / 2 + var13, var12.field63 / 2 + var15);
                            int var70 = class29.field833[var12.field19] * var12.field77 >> 16;
                            int var71 = class29.field848[var12.field19] * var12.field77 >> 16;
                            if (var65 != null) {
                                if (var12.field98) {
                                    var65.method755();
                                    if (var12.field129) {
                                        var65.method750(0, var12.field78, var12.field40, var12.field19, var12.field121, var66 + var70 + var12.field42, var12.field42 + var71, var12.field77);
                                    } else {
                                        var65.method762(0, var12.field78, var12.field40, var12.field19, var12.field121, var66 + var70 + var12.field42, var12.field42 + var71);
                                    }
                                } else {
                                    var65.method762(0, var12.field78, 0, var12.field19, 0, var70, var71);
                                }
                            }
                            class29.method238();
                        } else {
                            if (var12.field81 == 7) {
                                class46 var72 = var12.method12(true);
                                if (var72 == null) {
                                    if (class71.field1797) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var73 = 0;
                                for (int var74 = 0; var74 < var12.field63; var74++) {
                                    for (int var75 = 0; var75 < var12.field96; var75++) {
                                        if (var12.field6[var73] > 0) {
                                            class126 var76 = class9.method86(var12.field6[var73] - 1, (byte) -103);
                                            class73 var77 = var76.field3220;
                                            if (var77 == null) {
                                                var77 = class18.field525;
                                            }
                                            if (var76.field3238 == 1 || var12.field92[var73] != 1) {
                                                var77 = class32.method258(-121, new class73[] { var77, class62.field1631, class33.method261(var12.field92[var73], true) });
                                            }
                                            int var78 = (var12.field59 + 115) * var75 + var13;
                                            int var79 = (var12.field16 + 12) * var74 + var15;
                                            if (var12.field22 == 0) {
                                                var72.method355(var77, var78, var79, var12.field111, var12.field94 ? 0 : -1);
                                            } else if (var12.field22 == 1) {
                                                var72.method343(var77, var12.field96 / 2 + var78, var79, var12.field111, var12.field94 ? 0 : -1);
                                            } else {
                                                var72.method361(var77, var78 + var12.field96 - 1, var79, var12.field111, var12.field94 ? 0 : -1);
                                            }
                                        }
                                        var73++;
                                    }
                                }
                            }
                            if (var12.field81 == 8 && class32.method255((byte) -109, var11, arg3) && class28.field781 == class18.field522) {
                                class46 var80 = class109.field2688;
                                int var81 = 0;
                                int var82 = 0;
                                class73 var83 = var12.field29;
                                class73 var84 = class71.method594((byte) -122, var83, var12);
                                while (var84.method632((byte) -61) > 0) {
                                    int var92 = var84.method623(-1893532698, class140.field3493);
                                    class73 var93;
                                    if (var92 == -1) {
                                        var93 = var84;
                                        var84 = class9.field298;
                                    } else {
                                        var93 = var84.method630(var92, 0, -24023);
                                        var84 = var84.method638(var92 + 4, arg7 ^ 0xFFFFC488);
                                    }
                                    int var94 = var80.method357(var93);
                                    var82 += var80.field1201 + 1;
                                    if (var81 < var94) {
                                        var81 = var94;
                                    }
                                }
                                var81 += 6;
                                int var85 = var12.field96 + var13 - var81 - 5;
                                var82 += 7;
                                if (var85 < var13 + 5) {
                                    var85 = var13 + 5;
                                }
                                if (var81 + var85 > arg6) {
                                    var85 = arg6 - var81;
                                }
                                int var86 = var12.field63 + var15 + 5;
                                if (arg2 < var82 + var86) {
                                    var86 = arg2 - var82;
                                }
                                class17.method133(var85, var86, var81, var82, 16777120);
                                class17.method134(var85, var86, var81, var82, 0);
                                int var87 = var80.field1201 + var86 + 2;
                                class73 var88 = var12.field29;
                                class73 var89 = class71.method594((byte) -112, var88, var12);
                                while (var89.method632((byte) -104) > 0) {
                                    int var90 = var89.method623(-1893532698, class140.field3493);
                                    class73 var91;
                                    if (var90 == -1) {
                                        var91 = var89;
                                        var89 = class9.field298;
                                    } else {
                                        var91 = var89.method630(var90, 0, arg7 ^ 0x66DE);
                                        var89 = var89.method638(var90 + 4, 125);
                                    }
                                    var80.method355(var91, var85 + 3, var87, 0, -1);
                                    var87 += var80.field1201 + 1;
                                }
                            }
                            if (var12.field81 == 9) {
                                if (var12.field53 == 1) {
                                    class17.method144(var13, var15, var12.field96 + var13, var15 - -var12.field63, var12.field111);
                                } else {
                                    int var95 = var12.field96 >= 0 ? var12.field96 : -var12.field96;
                                    int var96 = var12.field63 < 0 ? -var12.field63 : var12.field63;
                                    int var97 = var95;
                                    if (var96 > var95) {
                                        var97 = var96;
                                    }
                                    if (var97 != 0) {
                                        int var98 = (var12.field96 << 16) / var97;
                                        int var99 = (var12.field63 << 16) / var97;
                                        if (var98 >= var99) {
                                            var98 = -var98;
                                        } else {
                                            var99 = -var99;
                                        }
                                        int var100 = var12.field53 * var99 >> 17;
                                        int var101 = var12.field53 * var98 >> 17;
                                        int var102 = var12.field53 * var99 + 1 >> 17;
                                        int var103 = var12.field53 * var98 + 1 >> 17;
                                        int var104 = var13 + var100;
                                        int var105 = var13 - var102;
                                        int var106 = var13 + var12.field96 - var102;
                                        int var107 = var12.field96 + var13 + var100;
                                        int var108 = var15 + var101;
                                        int var109 = var12.field63 + var15 - var103;
                                        int var110 = var15 - var103;
                                        int var111 = var12.field63 + var15 + var101;
                                        class29.method240(var104, var105, var106);
                                        class29.method242(var108, var110, var109, var104, var105, var106, var12.field111);
                                        class29.method240(var104, var106, var107);
                                        class29.method242(var108, var109, var111, var104, var106, var107, var12.field111);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg7 != -15113) {
            field1253 = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg7 + arg5 - 1;
        int var10 = arg6 + arg1 - 1;
        field1242++;
        if (arg3 != -24381) {
            return false;
        } else if (arg0 >= arg7 && arg0 <= var9 && arg2 >= arg1 && var10 >= arg2) {
            return true;
        } else if (arg7 - 1 == arg0 && arg1 <= arg2 && var10 >= arg2 && (this.field1249[arg0 - this.field1255][arg2 - this.field1237] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg2 >= arg1 && var10 >= arg2 && (this.field1249[arg0 - this.field1255][arg2 - this.field1237] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg2 && arg7 <= arg0 && var9 >= arg0 && (this.field1249[arg0 - this.field1255][arg2 - this.field1237] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg7 <= arg0 && var9 >= arg0 && (this.field1249[arg0 - this.field1255][arg2 - this.field1237] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public final void method376(int arg0, int arg1, int arg2) {
        int var4 = 12 / ((9 - arg1) / 45);
        int var5 = arg2 - this.field1237;
        int var6 = arg0 - this.field1255;
        field1244++;
        this.field1249[var6][var5] = class149.method1189(this.field1249[var6][var5], -262145);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1237;
        int var5 = arg2 - this.field1255;
        field1247++;
        this.field1249[var5][var4] = class84.method713(this.field1249[var5][var4], 262144);
        int var6 = 121 / ((arg1 - 32) / 58);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
    public static final int method378(int arg0) {
        field1256++;
        int var1 = 3;
        if (arg0 != 19661064) {
            method368(null, null, 29);
        }
        if (class122.field3118 < 310) {
            int var2 = class30.field857 >> 7;
            int var3 = class70.field1785 >> 7;
            if ((class55.field1482[class11.field320][var2][var3] & 0x4) != 0) {
                var1 = class11.field320;
            }
            int var4 = class73.field1901.field2277 >> 7;
            int var5;
            if (var2 < var4) {
                var5 = var4 - var2;
            } else {
                var5 = var2 - var4;
            }
            int var6 = class73.field1901.field2264 >> 7;
            int var7;
            if (var6 <= var3) {
                var7 = var3 - var6;
            } else {
                var7 = var6 - var3;
            }
            if (var7 >= var5) {
                int var8 = var5 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var6) {
                    var9 += var8;
                    if (var3 < var6) {
                        var3++;
                    } else if (var6 < var3) {
                        var3--;
                    }
                    if ((class55.field1482[class11.field320][var2][var3] & 0x4) != 0) {
                        var1 = class11.field320;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class55.field1482[class11.field320][var2][var3] & 0x4) != 0) {
                            var1 = class11.field320;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var5;
                while (var2 != var4) {
                    var10 += var11;
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class55.field1482[class11.field320][var2][var3] & 0x4) != 0) {
                        var1 = class11.field320;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var6 > var3) {
                            var3++;
                        } else if (var6 < var3) {
                            var3--;
                        }
                        if ((class55.field1482[class11.field320][var2][var3] & 0x4) != 0) {
                            var1 = class11.field320;
                        }
                    }
                }
            }
        }
        if ((class55.field1482[class11.field320][class73.field1901.field2277 >> 7][class73.field1901.field2264 >> 7] & 0x4) != 0) {
            var1 = class11.field320;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZII)V")
    private final void method379(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field1249[arg2][arg0] = class84.method713(this.field1249[arg2][arg0], arg3);
            field1251++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field1237;
        field1238++;
        int var9 = arg0 - this.field1255;
        int var10 = 256;
        if (arg6) {
            var10 += 131072;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1261) {
                for (int var13 = var8; var13 < arg1 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1250) {
                        this.method373(var12, var10, var13, false);
                    }
                }
            }
        }
        if (arg4 != -1) {
            field1258 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V")
    public final void method381(int arg0, int arg1, byte arg2) {
        field1263++;
        if (arg2 < 13) {
            field1239 = null;
        }
        int var4 = arg1 - this.field1237;
        int var5 = arg0 - this.field1255;
        this.field1249[var5][var4] = class84.method713(this.field1249[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 12283) {
            return false;
        }
        field1264++;
        if (arg3 == arg4 && arg2 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field1255;
        int var9 = arg6 - this.field1237;
        int var10 = arg4 - this.field1255;
        int var11 = arg2 - this.field1237;
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field1249[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field1249[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field1249[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
    public class47(int arg0, int arg1) {
        this.field1250 = arg1;
        this.field1261 = arg0;
        this.field1249 = new int[this.field1261][this.field1250];
        this.field1255 = 0;
        this.field1237 = 0;
        this.method370(125);
    }
}
