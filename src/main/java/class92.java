import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class92 extends class238 {

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "[Z")
    public boolean[] field1169;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "[I")
    public int[] field1159;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "[I")
    public int[] field1170;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "[[I")
    public int[][] field1168;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
    public static int[] field1160 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Lwf;")
    public static class79 field1162 = new class79(28, -1);

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "[I")
    public static int[] field1173 = new int[6];

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "Loh;")
    public static class256 field1166;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "[[B")
    public static byte[][] field1171;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public static void method525(byte arg0) {
        field1173 = null;
        field1171 = null;
        field1160 = null;
        if (arg0 != 93) {
            method526((byte) -78);
        }
        field1166 = null;
        field1162 = null;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
    public static final void method526(byte arg0) {
        field1167++;
        for (int var1 = 0; var1 < class94.field1202; var1++) {
            int var3 = class420.field5870[var1];
            class216 var4 = class139.field1851[var3];
            int var5 = class345.field5016.method1701(-23121);
            if ((var5 & 0x2) != 0) {
                var5 += class345.field5016.method1701(-23121) << 8;
            }
            if ((var5 & 0x80) != 0) {
                int var6 = class345.field5016.method1712(-1);
                int var7 = class345.field5016.method1735(80);
                var4.method913(class353.field5090, var6, var7, 0);
                var4.field2149 = class353.field5090 + 300;
                var4.field2138 = class345.field5016.method1746(17037);
            }
            if ((var5 & 0x10) != 0) {
                var4.field2125 = class345.field5016.method1749((byte) -75);
                if (var4.field2125 == 65535) {
                    var4.field2125 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                int var8 = class345.field5016.method1712(-1);
                int var9 = class345.field5016.method1735(52);
                var4.method913(class353.field5090, var8, var9, 0);
            }
            if ((var5 & 0x8) != 0) {
                int var10 = class345.field5016.method1749((byte) -75);
                int var11 = class345.field5016.method1688(20402);
                if (var10 == 65535) {
                    var10 = -1;
                }
                boolean var12 = true;
                if (var10 != -1 && var4.field2147 != -1) {
                    if (var4.field2147 == var10) {
                        class327 var13 = class324.field4674.method1279(var10, -2);
                        if (var13.field4728 && var13.field4714 != -1) {
                            class153 var14 = class64.field836.method2081(var13.field4714, 0);
                            int var15 = var14.field2260;
                            if (var15 == 0) {
                                var12 = false;
                            } else if (var15 == 1) {
                                var12 = true;
                            } else if (var15 == 2) {
                                var12 = false;
                                var4.field2081 = 0;
                            }
                        }
                    } else {
                        class327 var16 = class324.field4674.method1279(var10, -2);
                        class327 var17 = class324.field4674.method1279(var4.field2147, -2);
                        if (var16.field4714 != -1 && var17.field4714 != -1) {
                            class153 var18 = class64.field836.method2081(var16.field4714, 0);
                            class153 var19 = class64.field836.method2081(var17.field4714, 0);
                            if (var18.field2289 < var19.field2289) {
                                var12 = false;
                            }
                        }
                    }
                }
                if (var12) {
                    var4.field2096 = (var11 & 0xFFFF) + class353.field5090;
                    var4.field2129 = 0;
                    var4.field2115 = 1;
                    var4.field2147 = var10;
                    var4.field2101 = var11 >> 16;
                    var4.field2139 = 0;
                    if (var4.field2096 > class353.field5090) {
                        var4.field2129 = -1;
                    }
                    if (var4.field2147 != -1 && class353.field5090 == var4.field2096) {
                        int var20 = class324.field4674.method1279(var4.field2147, -2).field4714;
                        if (var20 != -1) {
                            class153 var21 = class64.field836.method2081(var20, 0);
                            if (var21 != null && var21.field2254 != null) {
                                class237.method1508(var4.field4319, (byte) 42, var4.field4331, 0, var21, var4.field4317, false);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x20) != 0) {
                int var22 = class345.field5016.method1740((byte) -41);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class345.field5016.method1746(17037);
                class41.method283(var23, (byte) -104, var22, var4);
            }
            if ((var5 & 0x400) != 0) {
                int var24 = class345.field5016.method1735(63);
                int[] var25 = new int[var24];
                int[] var26 = new int[var24];
                int[] var27 = new int[var24];
                for (int var28 = 0; var28 < var24; var28++) {
                    int var29 = class345.field5016.method1749((byte) -75);
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    var25[var28] = var29;
                    var26[var28] = class345.field5016.method1701(-23121);
                    var27[var28] = class345.field5016.method1709(255);
                }
                class136.method865(var4, var25, var26, -67, var27);
            }
            if ((var5 & 0x4) != 0) {
                if (var4.field3232.method2744(114)) {
                    class451.method2631(1721537889, var4);
                }
                var4.method1386(-18479, class265.field3859.method2800(class345.field5016.method1740((byte) 95), (byte) 32));
                var4.method920((byte) 115, var4.field3232.field6573);
                var4.field2123 = var4.field3232.field6509 << 3;
                if (var4.field3232.method2744(85)) {
                    class401.method2392(var4.field2159[0], 0, (class452) null, var4.field4319, var4, (byte) 8, var4.field2163[0], (class453) null);
                }
            }
            if ((var5 & 0x200) != 0) {
                int var30 = class345.field5016.method1740((byte) -57);
                var4.field2090 = class345.field5016.method1735(116);
                var4.field2126 = class345.field5016.method1735(101);
                var4.field2098 = var30 & 0x7FFF;
                var4.field2099 = (var30 & 0x8000) != 0;
                var4.field2140 = class353.field5090 + var4.field2098 + var4.field2090;
            }
            if ((var5 & 0x40) != 0) {
                var4.field2113 = class345.field5016.method1750(97);
                var4.field2084 = 100;
            }
            if ((var5 & 0x100) != 0) {
                var4.field3246 = class345.field5016.method1740((byte) 73);
                var4.field3235 = class345.field5016.method1749((byte) -75);
            }
        }
        int var2 = 82 / ((arg0 + 20) / 53);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I[B)V")
    public class92(int arg0, byte[] arg1) {
        this.field1164 = arg0;
        class276 var3 = new class276(arg1);
        this.field1161 = var3.method1701(-23121);
        this.field1169 = new boolean[this.field1161];
        this.field1159 = new int[this.field1161];
        this.field1170 = new int[this.field1161];
        this.field1168 = new int[this.field1161][];
        for (int var4 = 0; var4 < this.field1161; var4++) {
            this.field1159[var4] = var3.method1701(-23121);
        }
        for (int var5 = 0; var5 < this.field1161; var5++) {
            this.field1169[var5] = var3.method1701(-23121) == 1;
        }
        for (int var6 = 0; var6 < this.field1161; var6++) {
            this.field1170[var6] = var3.method1729(65280);
        }
        for (int var7 = 0; var7 < this.field1161; var7++) {
            this.field1168[var7] = new int[var3.method1701(-23121)];
        }
        for (int var8 = 0; var8 < this.field1161; var8++) {
            for (int var9 = 0; var9 < this.field1168[var8].length; var9++) {
                this.field1168[var8][var9] = var3.method1701(-23121);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Loa;IBI)V")
    public static final void method527(class452 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -84) {
            method526((byte) -67);
        }
        if (arg0.field2080 == arg3 && arg3 != -1) {
            class153 var4 = class64.field836.method2081(arg3, 0);
            int var5 = var4.field2260;
            if (var5 == 1) {
                arg0.field2081 = 0;
                arg0.field2094 = arg1;
                arg0.field2141 = 0;
                arg0.field2134 = 0;
                arg0.field2083 = 1;
                class237.method1508(arg0.field4319, (byte) 122, arg0.field4331, arg0.field2134, var4, arg0.field4317, class492.field6935 == arg0);
            }
            if (var5 == 2) {
                arg0.field2081 = 0;
            }
        } else if (arg3 == -1 || arg0.field2080 == -1 || class64.field836.method2081(arg3, 0).field2289 >= class64.field836.method2081(arg0.field2080, 0).field2289) {
            arg0.field2080 = arg3;
            arg0.field2094 = arg1;
            arg0.field2134 = 0;
            arg0.field2081 = 0;
            arg0.field2160 = arg0.field2168;
            arg0.field2141 = 0;
            arg0.field2083 = 1;
            if (arg0.field2080 != -1) {
                class237.method1508(arg0.field4319, (byte) -33, arg0.field4331, arg0.field2134, class64.field836.method2081(arg0.field2080, 0), arg0.field4317, class492.field6935 == arg0);
            }
        }
        field1163++;
    }
}
