import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class59 extends class199 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Z")
    public boolean field954 = true;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Z")
    public static boolean field962 = true;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "[I")
    public int[] field947;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "[I")
    private int[] field950;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "[Ljava/lang/String;")
    private String[] field961;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "[[I")
    private int[][] field948;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)I", line = 4)
    public final int method460(int arg0, byte arg1, int arg2) {
        field960++;
        if (arg1 != -23) {
            return 64;
        } else if (this.field950 == null || arg2 < 0 || this.field950.length < arg2) {
            return -1;
        } else if (this.field948[arg2] == null || arg0 < 0 || this.field948[arg2].length < arg0) {
            return -1;
        } else {
            return this.field948[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 24)
    public static final void method461(boolean arg0) {
        field959++;
        class43.field689.method2176((byte) 114);
        class276.field4260.method2176((byte) 113);
        if (arg0) {
            method467((float[]) null, 26);
        }
        class165.field2477.method2176((byte) -79);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[ILkh;)V", line = 44)
    public final void method462(int arg0, int[] arg1, class166 arg2) {
        field951++;
        if (this.field950 == null) {
            return;
        }
        int var4 = 116 / ((arg0 - 48) / 42);
        for (int var5 = 0; this.field950.length > var5 && var5 < arg1.length; var5++) {
            int var6 = class141.field2185[this.method472(true, var5)];
            if (var6 > 0) {
                arg2.method1157(var6, -92, (long) arg1[var5]);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V", line = 69)
    public static final void method463(int arg0) {
        if (class331.field5160 != -1) {
            class12.method93(class331.field5160, true);
        }
        for (int var1 = 0; var1 < class169.field2560; var1++) {
            if (class34.field510[var1]) {
                class240.field3831[var1] = true;
            }
            class345.field5352[var1] = class34.field510[var1];
            class34.field510[var1] = false;
        }
        field964++;
        class276.field4263 = -1;
        class202.field3037 = null;
        if (class94.field1516) {
            class230.field3650 = true;
        }
        class141.field2182 = -1;
        class282.field4348 = class227.field3618;
        if (class331.field5160 != -1) {
            class169.field2560 = 0;
            class258.method1771(20371);
        }
        int var2 = -102 % ((arg0 + 11) / 40);
        if (class94.field1516) {
            class167.method1191();
        } else {
            class109.method804();
        }
        class34.field518 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V", line = 119)
    public final void method464(int arg0) {
        if (this.field947 != null) {
            for (int var2 = 0; var2 < this.field947.length; var2++) {
                this.field947[var2] = class222.method1577(this.field947[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field947 = (int[]) null;
        }
        field955++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Ljava/lang/String;", line = 140)
    public final String method465(byte arg0) {
        field949++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 >= -5) {
            this.method464(119);
        }
        if (this.field961 == null) {
            return "";
        }
        var2.append(this.field961[0]);
        for (int var3 = 1; var3 < this.field961.length; var3++) {
            var2.append("...");
            var2.append(this.field961[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lkh;B)Ljava/lang/String;", line = 170)
    public final String method466(class166 arg0, byte arg1) {
        field952++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field950 != null) {
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3.append(this.field961[var4]);
                var3.append(class200.method1423(-16430, this.field948[var4], arg0.method1167(false, class203.field3044[this.field950[var4]]), this.field950[var4]));
            }
        }
        if (arg1 > -8) {
            this.field961 = (String[]) null;
        }
        var3.append(this.field961[this.field961.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([FI)[F", line = 202)
    public static final float[] method467(float[] arg0, int arg1) {
        field958++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class343.method2375(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lkh;IB)V", line = 217)
    private final void method468(class166 arg0, int arg1, byte arg2) {
        if (arg2 > -15) {
            return;
        }
        field956++;
        if (arg1 == 1) {
            this.field961 = class208.method1479((byte) 125, arg0.method1179((byte) -77), '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method1178(0);
            this.field947 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field947[var5] = arg0.method1151(-120);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1178(0);
            this.field950 = new int[var6];
            this.field948 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1151(-56);
                this.field950[var7] = var8;
                this.field948[var7] = new int[class63.field1000[var8]];
                for (int var9 = 0; var9 < class63.field1000[var8]; var9++) {
                    this.field948[var7][var9] = arg0.method1151(-95);
                }
            }
        } else if (arg1 == 4) {
            this.field954 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)Lga;", line = 282)
    public static final class31 method469(int arg0, byte arg1) {
        field965++;
        class31 var2 = (class31) class187.field2800.method443(-2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class31.field451.method980(5, arg0, arg1 ^ 0xFFFFFFFB);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method262(new class166(var3), -89);
        }
        if (arg1 != -2) {
            method461(false);
        }
        class187.field2800.method439(var4, (long) arg0, (byte) 18);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)I", line = 312)
    public final int method470(int arg0) {
        field953++;
        if (this.field950 == null) {
            return 0;
        } else if (arg0 == 26750) {
            return this.field950.length;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lkh;I)V", line = 340)
    public final void method471(class166 arg0, int arg1) {
        field945++;
        while (true) {
            int var3 = arg0.method1178(0);
            if (var3 == 0) {
                int var4 = -75 % ((-arg1 - 41) / 33);
                return;
            }
            this.method468(arg0, var3, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)I", line = 366)
    public final int method472(boolean arg0, int arg1) {
        field957++;
        if (!arg0) {
            this.field961 = (String[]) null;
        }
        return this.field950 == null || arg1 < 0 || this.field950.length < arg1 ? -1 : this.field950[arg1];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIIIII)V", line = 385)
    public static final void method473(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class294.field4556++;
        field963++;
        class233.method1641(arg4 + 64);
        if (arg0) {
            class149.method1032(false, 0, false, (byte) 121);
        } else {
            class175.method1255(0, -2);
            class149.method1032(true, 0, false, (byte) 123);
            if (class81.field1277 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class149.method1032(false, var7, false, (byte) 127);
                    class149.method1032(false, var7, true, (byte) 118);
                    class175.method1255(var7, -2);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class175.method1255(var6, -2);
                    class149.method1032(false, var6, false, (byte) 114);
                    class149.method1032(false, var6, true, (byte) 123);
                }
            }
        }
        if (!arg0) {
            class137.method991((byte) -72);
        }
        class125.method904((byte) -91);
        if (class94.field1516) {
            class253.method1748(arg2, 1, arg5, arg3, arg1, true);
            arg5 = class52.field880;
            arg1 = class260.field4081;
            arg2 = class256.field4006;
            arg3 = class212.field3234;
        }
        if (class178.field2692 == 1) {
            int var8 = (int) class30.field443;
            if ((class182.field2743 / 256) > var8) {
                var8 = class182.field2743 / 256;
            }
            if (class267.field4166[4] && (class220.field3514[4] + 128) > var8) {
                var8 = class220.field3514[4] + 128;
            }
            int var9 = (int) class259.field4063 + class77.field1243 & 0x7FF;
            class226.method1600(-19326, (var8 * 3) + 600, var9, class320.method2181(class98.field1566.field1905, class98.field1566.field1868, -68, class205.field3101) - 50, class106.field1647, class239.field3807, var8, arg2);
        } else if (class178.field2692 == 5) {
            class112.method833(arg2, 2048);
        }
        int var10 = class258.field4052;
        int var11 = class337.field5278;
        int var12 = class265.field4116;
        int var13 = class194.field2897;
        int var14 = class218.field3323;
        for (int var15 = arg4; var15 < 5; var15++) {
            if (class267.field4166[var15]) {
                int var16 = (int) ((double) (-class92.field1466[var15]) + Math.random() * (double) (class92.field1466[var15] * 2 + 1) + Math.sin((double) class214.field3258[var15] / 100.0D * (double) class336.field5254[var15]) * (double) class220.field3514[var15]);
                if (var15 == 3) {
                    class218.field3323 = class218.field3323 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class194.field2897 += var16;
                    if (class194.field2897 < 128) {
                        class194.field2897 = 128;
                    }
                    if (class194.field2897 > 383) {
                        class194.field2897 = 383;
                    }
                }
                if (var15 == 1) {
                    class258.field4052 += var16;
                }
                if (var15 == 2) {
                    class265.field4116 += var16;
                }
                if (var15 == 0) {
                    class337.field5278 += var16;
                }
            }
        }
        class220.method1563((byte) -41);
        if (class94.field1516) {
            class167.method1187(arg3, arg5, arg1 + arg3, arg5 - -arg2);
            boolean var17 = false;
            float var18 = (float) class194.field2897 * 0.17578125F;
            float var19 = (float) class218.field3323 * 0.17578125F;
            if (class178.field2692 == 3) {
                var18 = class78.field1258 * 360.0F / 6.2831855F;
                var19 = class75.field1214 * 360.0F / 6.2831855F;
            }
            int var20;
            if (class131.field2052 == 10) {
                var20 = class132.method947(class289.field4507, class34.field518, class265.field4116 >> 10, class337.field5278 >> 10, (byte) 47);
            } else {
                var20 = class132.method947(class289.field4507, class34.field518, class98.field1566.field1938[0] >> 3, class98.field1566.field1910[0] >> 3, (byte) -102);
            }
            if (class30.field440 >= 0) {
                class94.method706();
                class45 var21 = class339.method2359(class30.field440, class341.field5318, class163.field2451, arg4 + 12637, class117.field1791);
                var21.method401(class278.field4282, arg3, arg5, arg1, arg2, class194.field2897, class218.field3323, var20);
            } else {
                class94.method705(var20);
            }
            class94.method691(arg3, arg5, arg1, arg2, arg1 / 2 + arg3, arg2 / 2 + arg5, var18, var19, class73.field1196, class73.field1196);
            class318.method2162(false, -27838);
            class94.method692();
            class94.method696(true);
            class94.method693(true);
        } else {
            class109.method806(arg3, arg5, arg1 + arg3, arg2 + arg5);
            class15.method121();
            if (class30.field440 < 0) {
                class109.method812(arg3, arg5, arg1, arg2, 0);
            } else {
                class45 var22 = class339.method2359(class30.field440, class341.field5318, class163.field2451, arg4 + 12637, class117.field1791);
                var22.method398(class278.field4282, arg3, arg5, arg1, arg2, class194.field2897, class218.field3323, 0);
            }
        }
        if (class339.field5305 || class227.field3616 < arg3 || arg1 + arg3 <= class227.field3616 || arg5 > class22.field348 || arg2 + arg5 <= class22.field348) {
            class315.field4903 = 0;
            class232.field3668 = false;
        } else {
            int var23 = class5.field50;
            int var24 = class325.field5062;
            class232.field3668 = true;
            class179.field2700 = (var23 - var24) * (class227.field3616 - arg3) / arg1 + var24;
            class315.field4903 = 0;
            int var25 = class53.field899;
            int var26 = class91.field1445;
            class111.field1728 = (class22.field348 - arg5) * (var25 - var26) / arg2 + var26;
        }
        class170.method1225((byte) -97);
        byte var27 = class258.method1769(80) == 2 ? (byte) class294.field4556 : 1;
        if (class94.field1516) {
            class183.method1311(class227.field3618, !class274.field4244);
            class105.method766(class194.field2897, (byte) 126, class337.field5278, class265.field4116, class218.field3323, class258.field4052);
            class94.field1499 = class227.field3618;
            class141.method1013(class337.field5278, class258.field4052, class265.field4116, class194.field2897, class218.field3323, class294.field4555, class299.field4660, class85.field1382, class73.field1204, class270.field4199, class257.field4028, class205.field3101 + 1, var27, class98.field1566.field1905 >> 7, class98.field1566.field1868 >> 7);
            class230.field3650 = true;
            class183.method1318();
            class105.method766(0, (byte) 127, 0, 0, 0, 0);
            class170.method1225((byte) -97);
            class92.method658(-125, class73.field1196, arg1, arg2, arg3, class73.field1196, arg5);
            class67.method517(class73.field1196, (byte) 99, arg1, arg2, arg5, class73.field1196, arg3);
            class29.method250();
        } else {
            class141.method1013(class337.field5278, class258.field4052, class265.field4116, class194.field2897, class218.field3323, class294.field4555, class299.field4660, class85.field1382, class73.field1204, class270.field4199, class257.field4028, class205.field3101 + 1, var27, class98.field1566.field1905 >> 7, class98.field1566.field1868 >> 7);
            class170.method1225((byte) -97);
            class29.method250();
            class92.method658(-125, 256, arg1, arg2, arg3, 256, arg5);
            class67.method517(256, (byte) 106, arg1, arg2, arg5, 256, arg3);
        }
        ((class315) class15.field207).method2144(class34.field518, false);
        class331.method2299(arg1, arg3, arg2, (byte) 121, arg5);
        class337.field5278 = var11;
        class265.field4116 = var12;
        class258.field4052 = var10;
        class194.field2897 = var13;
        class218.field3323 = var14;
        if (class298.field4600 && class339.field5299.method24(-31645) == 0) {
            class298.field4600 = false;
        }
        if (class298.field4600) {
            if (class94.field1516) {
                class167.method1186(arg3, arg5, arg1, arg2, 0);
            } else {
                class109.method812(arg3, arg5, arg1, arg2, 0);
            }
            class173.method1244(class156.field2334, 17, false);
        }
        if (!arg0 && !class298.field4600 && !class339.field5305 && class227.field3616 >= arg3 && class227.field3616 < (arg1 + arg3) && arg5 <= class22.field348 && class22.field348 < arg2 + arg5) {
            class218.method1536(class227.field3616, arg2, arg1, 123, class22.field348, arg5, arg3);
        }
    }
}
