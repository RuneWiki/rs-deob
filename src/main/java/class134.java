import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class134 extends class286 {

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2246 = 0;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Lbe;")
    public static class283 field2249 = class153.method941(27, "<col=ff7000>");

    @OriginalMember(owner = "client!d", name = "W", descriptor = "Ltf;")
    public static class242 field2251 = new class242(100);

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            field2242 = -89;
        }
        field2244++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            int[] var5 = this.method1963(arg1, 1, -1);
            int[] var6 = this.method1963(arg1, 2, -1);
            for (int var7 = 0; var7 < class27.field410; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V", line = 62)
    public static final void method830(int arg0) {
        int var1 = class192.field3296 * 128 + 64;
        field2243++;
        int var2 = class252.field4283 * 128 + 64;
        int var3 = class42.method254(class61.field850, var1, var2, -20341) - class57.field788;
        if (arg0 != 7515) {
            field2242 = 73;
        }
        if (class111.field1883 < 100) {
            if (class63.field876 < var3) {
                class63.field876 += (var3 - class63.field876) * class111.field1883 / 1000 + class170.field2872;
                if (var3 < class63.field876) {
                    class63.field876 = var3;
                }
            }
            if (class135.field2273 < var1) {
                class135.field2273 += (var1 - class135.field2273) * class111.field1883 / 1000 + class170.field2872;
                if (var1 < class135.field2273) {
                    class135.field2273 = var1;
                }
            }
            if (var3 < class63.field876) {
                class63.field876 -= (class63.field876 - var3) * class111.field1883 / 1000 + class170.field2872;
                if (class63.field876 < var3) {
                    class63.field876 = var3;
                }
            }
            if (var1 < class135.field2273) {
                class135.field2273 -= (class135.field2273 - var1) * class111.field1883 / 1000 + class170.field2872;
                if (class135.field2273 < var1) {
                    class135.field2273 = var1;
                }
            }
            if (var2 > class116.field1976) {
                class116.field1976 += (var2 - class116.field1976) * class111.field1883 / 1000 + class170.field2872;
                if (class116.field1976 > var2) {
                    class116.field1976 = var2;
                }
            }
            if (class116.field1976 > var2) {
                class116.field1976 -= (class116.field1976 - var2) * class111.field1883 / 1000 + class170.field2872;
                if (var2 > class116.field1976) {
                    class116.field1976 = var2;
                }
            }
        } else {
            class135.field2273 = class192.field3296 * 128 + 64;
            class116.field1976 = class252.field4283 * 128 + 64;
            class63.field876 = class42.method254(class61.field850, class135.field2273, class116.field1976, arg0 - 27856) - class57.field788;
        }
        int var4 = class187.field3205 * 128 + 64;
        int var5 = class119.field2001 * 128 + 64;
        int var6 = class42.method254(class61.field850, var5, var4, -20341) - class12.field102;
        int var7 = var4 - class116.field1976;
        int var8 = var6 - class63.field876;
        int var9 = var5 - class135.field2273;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class295.field5011;
        if (class150.field2450 < var11) {
            class150.field2450 += class272.field4576 + ((var11 - class150.field2450) * class288.field4902 / 1000);
            if (class150.field2450 > var11) {
                class150.field2450 = var11;
            }
        }
        if (class150.field2450 > var11) {
            class150.field2450 -= (class150.field2450 - var11) * class288.field4902 / 1000 + class272.field4576;
            if (var11 > class150.field2450) {
                class150.field2450 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class295.field5011 += class288.field4902 * var13 / 1000 + class272.field4576;
            class295.field5011 &= 0x7FF;
        }
        if (var13 < 0) {
            class295.field5011 -= -var13 * class288.field4902 / 1000 + class272.field4576;
            class295.field5011 &= 0x7FF;
        }
        int var14 = var12 - class295.field5011;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class295.field5011 = var12;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lfe;ZI)V", line = 224)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field4876 = arg0.method1535((byte) 88) == 1;
        }
        if (!arg1) {
            field2248++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 241)
    public static final void method831() {
        class164.field2713 = 0;
        label194: for (int var0 = 0; var0 < class46.field637; var0++) {
            class116 var1 = class12.field120[var0];
            if (class259.field4403 != null) {
                for (int var2 = 0; var2 < class259.field4403.length; var2++) {
                    if (class259.field4403[var2] != -1000000 && (var1.field1954 <= class259.field4403[var2] || var1.field1953 <= class259.field4403[var2]) && (var1.field1955 <= class61.field847[var2] || var1.field1960 <= class61.field847[var2]) && (var1.field1955 >= class10.field89[var2] || var1.field1960 >= class10.field89[var2]) && (var1.field1956 <= class302.field5113[var2] || var1.field1973 <= class302.field5113[var2]) && (var1.field1956 >= class67.field948[var2] || var1.field1973 >= class67.field948[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1961 == 1) {
                int var3 = var1.field1970 + class241.field4064 - class61.field844;
                if (var3 >= 0 && var3 <= class241.field4064 + class241.field4064) {
                    int var4 = var1.field1975 + class241.field4064 - class125.field2078;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1951 + class241.field4064 - class125.field2078;
                    if (var5 > class241.field4064 + class241.field4064) {
                        var5 = class241.field4064 + class241.field4064;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class217.field3675[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class231.field3926 - var1.field1955;
                        if (var7 > 32) {
                            var1.field1972 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1972 = 2;
                            var7 = -var7;
                        }
                        var1.field1965 = (var1.field1956 - class160.field2635 << 8) / var7;
                        var1.field1958 = (var1.field1973 - class160.field2635 << 8) / var7;
                        var1.field1971 = (var1.field1954 - class232.field3930 << 8) / var7;
                        var1.field1966 = (var1.field1953 - class232.field3930 << 8) / var7;
                        class77.field1350[class164.field2713++] = var1;
                    }
                }
            } else if (var1.field1961 == 2) {
                int var8 = var1.field1975 + class241.field4064 - class125.field2078;
                if (var8 >= 0 && var8 <= class241.field4064 + class241.field4064) {
                    int var9 = var1.field1970 + class241.field4064 - class61.field844;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1959 + class241.field4064 - class61.field844;
                    if (var10 > class241.field4064 + class241.field4064) {
                        var10 = class241.field4064 + class241.field4064;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class217.field3675[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class160.field2635 - var1.field1956;
                        if (var12 > 32) {
                            var1.field1972 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1972 = 4;
                            var12 = -var12;
                        }
                        var1.field1952 = (var1.field1955 - class231.field3926 << 8) / var12;
                        var1.field1964 = (var1.field1960 - class231.field3926 << 8) / var12;
                        var1.field1971 = (var1.field1954 - class232.field3930 << 8) / var12;
                        var1.field1966 = (var1.field1953 - class232.field3930 << 8) / var12;
                        class77.field1350[class164.field2713++] = var1;
                    }
                }
            } else if (var1.field1961 == 4) {
                int var13 = var1.field1954 - class232.field3930;
                if (var13 > 128) {
                    int var14 = var1.field1975 + class241.field4064 - class125.field2078;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1951 + class241.field4064 - class125.field2078;
                    if (var15 > class241.field4064 + class241.field4064) {
                        var15 = class241.field4064 + class241.field4064;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1970 + class241.field4064 - class61.field844;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1959 + class241.field4064 - class61.field844;
                        if (var17 > class241.field4064 + class241.field4064) {
                            var17 = class241.field4064 + class241.field4064;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class217.field3675[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1972 = 5;
                            var1.field1952 = (var1.field1955 - class231.field3926 << 8) / var13;
                            var1.field1964 = (var1.field1960 - class231.field3926 << 8) / var13;
                            var1.field1965 = (var1.field1956 - class160.field2635 << 8) / var13;
                            var1.field1958 = (var1.field1973 - class160.field2635 << 8) / var13;
                            class77.field1350[class164.field2713++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILl;Lea;ILja;III)V", line = 489)
    public static final void method832(int arg0, class281 arg1, class191 arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -4) {
            method834((class70) null, (byte) -14);
        }
        class183 var8 = new class183();
        field2253++;
        var8.field3144 = arg6;
        var8.field3149 = arg3 * 128;
        var8.field3138 = arg7 * 128;
        if (arg1 != null) {
            int var10 = arg1.field4727;
            var8.field3151 = arg1.field4729;
            var8.field3136 = arg1.field4708 * 128;
            var8.field3140 = arg1.field4689;
            var8.field3143 = arg1.field4750;
            int var11 = arg1.field4754;
            var8.field3148 = arg1;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg1.field4727;
                var10 = arg1.field4754;
            }
            var8.field3133 = (arg7 + var10) * 128;
            var8.field3150 = arg1.field4723;
            var8.field3152 = (arg3 + var11) * 128;
            if (arg1.field4752 != null) {
                var8.field3145 = true;
                var8.method1208(arg5 ^ 0x60AE);
            }
            if (var8.field3143 != null) {
                var8.field3134 = (int) (Math.random() * (double) (var8.field3151 - var8.field3150)) + var8.field3150;
            }
            class58.field797.method1809(var8, (byte) -121);
        } else if (arg4 != null) {
            class129 var9 = arg4.field822;
            var8.field3153 = arg4;
            if (var9.field2193 != null) {
                var8.field3145 = true;
                var9 = var9.method806((byte) 30);
            }
            if (var9 != null) {
                var8.field3152 = (var9.field2157 + arg3) * 128;
                var8.field3133 = (var9.field2157 + arg7) * 128;
                var8.field3140 = class252.method1714(0, arg4);
                var8.field3136 = var9.field2182 * 128;
            }
            class259.field4397.method1809(var8, (byte) -119);
        } else if (arg2 != null) {
            var8.field3137 = arg2;
            var8.field3133 = (arg2.method460((byte) -21) + arg7) * 128;
            var8.field3152 = (arg3 + arg2.method460((byte) 123)) * 128;
            var8.field3140 = class267.method1800(arg2, (byte) 62);
            var8.field3136 = arg2.field3282 * 128;
            class172.field2899.method1611(var8, arg5 + 3, arg2.field3274.method1929((byte) -24));
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 574)
    public class134() {
        super(3, false);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILek;II)Lgi;", line = 578)
    public static final class204 method833(int arg0, class172 arg1, int arg2, int arg3) {
        field2247++;
        if (arg2 < 14) {
            field2254 = 50;
        }
        return class26.method183(true, arg1, arg0, arg3) ? class254.method1720(-110) : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkd;B)V", line = 601)
    public static final void method834(class70 arg0, byte arg1) {
        field2250++;
        if (class75.field1309 == arg0.field1156 || arg0.field1192 == -1 || arg0.field1200 != 0 || arg0.field1182 + 1 > class132.method821(128, arg0.field1192).field2568[arg0.field1220]) {
            int var2 = arg0.field1156 - arg0.field1166;
            int var3 = class75.field1309 - arg0.field1166;
            int var4 = arg0.field1185 * 128 + (arg0.method460((byte) 119) * 64);
            int var5 = arg0.field1198 * 128 + arg0.method460((byte) -27) * 64;
            int var6 = arg0.field1197 * 128 + (arg0.method460((byte) 112) * 64);
            int var7 = arg0.field1208 * 128 + arg0.method460((byte) 120) * 64;
            arg0.field1210 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field1193 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
        }
        if (arg0.field1177 == 0) {
            arg0.field1153 = 1024;
        }
        if (arg0.field1177 == 1) {
            arg0.field1153 = 1536;
        }
        arg0.field1173 = 0;
        if (arg0.field1177 == 2) {
            arg0.field1153 = 0;
        }
        int var8 = 105 / ((arg1 - 19) / 46);
        if (arg0.field1177 == 3) {
            arg0.field1153 = 512;
        }
        arg0.field1160 = arg0.field1153;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[[I", line = 651)
    public final int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            method832(53, (class281) null, (class191) null, -71, (class60) null, -32, 111, 114);
        }
        field2252++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[] var4 = this.method1963(arg0, 2, -1);
            int[][] var5 = this.method1964(arg0, 0, false);
            int[][] var6 = this.method1964(arg0, 1, false);
            int[] var7 = var3[2];
            int[] var8 = var5[0];
            int[] var9 = var5[1];
            int[] var10 = var3[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var3[1];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class27.field410; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var8[var16];
                    var13[var16] = var9[var16];
                    var7[var16] = var11[var16];
                } else if (var17 == 0) {
                    var10[var16] = var12[var16];
                    var13[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var8[var16] * var17 + var12[var16] * var18 >> 12;
                    var13[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "i", descriptor = "(I)V", line = 729)
    public static void method835(int arg0) {
        field2249 = null;
        field2251 = null;
        if (arg0 != 4) {
            field2249 = (class283) null;
        }
    }
}
