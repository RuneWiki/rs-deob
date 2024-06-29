import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends class118 {

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lfc;")
    public static class39 field1160 = class90.method774("Offline", -128);

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Laa;")
    public static class2 field1162 = new class2();

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "Lfc;")
    public static class39 field1174 = class90.method774("sich mit einer anderen Welt zu verbinden)3", -105);

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Lfc;")
    public static class39 field1175 = class90.method774("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1", -96);

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "Lfc;")
    private static class39 field1179 = class90.method774("Cancel", -80);

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Lfc;")
    public static class39 field1177 = class90.method774("@cr2@", -121);

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "Lfc;")
    private static class39 field1180 = class90.method774("white:", -84);

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Lfc;")
    public static class39 field1183 = field1180;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
    public static volatile int field1184 = 0;

    @OriginalMember(owner = "client!g", name = "rb", descriptor = "Lfc;")
    public static class39 field1186 = field1180;

    @OriginalMember(owner = "client!g", name = "sb", descriptor = "Lfc;")
    public static class39 field1187 = field1179;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "J")
    public static long field1181;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "Loc;")
    public static class100 field1170;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "Lea;")
    public static class30 field1173;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Lmf;")
    public static class89 field1182;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "[[[B")
    public static byte[][][] field1171;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 7)
    public static final Object method502(boolean arg0, byte[] arg1, byte arg2) {
        field1157++;
        if (arg2 <= 108) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class108.field2716) {
                try {
                    class61 var3 = (class61) Class.forName("t").getDeclaredConstructor().newInstance();
                    var3.method604(89, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class108.field2716 = true;
                }
            }
            return arg0 ? class110.method970(arg1, 0) : arg1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method503(boolean arg0, int arg1) {
        if (arg1 != 1000000) {
            field1175 = null;
        }
        for (int var2 = 0; var2 < class15.field416; var2++) {
            int var3 = (class121.field3176[var2] << 14) + 536870912;
            class121 var4 = class118.field3092[class121.field3176[var2]];
            if (var4 != null && var4.method979(18) && var4.field3163.field2274 == arg0 && var4.field3163.method807((byte) 49)) {
                int var5 = var4.field2916 >> 7;
                int var6 = var4.field2909 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field2918 == 1 && (var4.field2916 & 0x7F) == 64 && (var4.field2909 & 0x7F) == 64) {
                        if (class57.field1422[var5][var6] == class147.field3662) {
                            continue;
                        }
                        class57.field1422[var5][var6] = class147.field3662;
                    }
                    if (!var4.field3163.field2239) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class139.field3503.method52(class24.field661, var4.field2916, var4.field2909, class153.method1225(arg1 - 999872, var4.field2918 * 64 - 64 + var4.field2909, class24.field661, (var4.field2918 - 1) * 64 + var4.field2916), var4.field2918 * 64 + 60 - 64, var4, var4.field2900, var3, var4.field2875);
                }
            }
        }
        field1159++;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V", line = 90)
    public static void method504(byte arg0) {
        field1171 = null;
        field1182 = null;
        field1179 = null;
        field1160 = null;
        field1186 = null;
        if (arg0 < 103) {
            return;
        }
        field1162 = null;
        field1183 = null;
        field1174 = null;
        field1177 = null;
        field1173 = null;
        field1180 = null;
        field1170 = null;
        field1175 = null;
        field1187 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILdc;BIIII)V", line = 121)
    public static final void method505(int arg0, int arg1, class25 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 10) {
            method511(-56, (byte) -109, null, null);
        }
        field1161++;
        if (arg6 < 0 || arg6 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var10 = arg2.method322((byte) -50);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg2.method322((byte) -50);
                    return;
                }
                if (var10 <= 49) {
                    arg2.method322((byte) -50);
                }
            }
        }
        class137.field3424[arg0][arg6][arg7] = 0;
        while (true) {
            int var8 = arg2.method322((byte) -50);
            if (var8 == 0) {
                if (arg0 == 0) {
                    class7.field219[0][arg6][arg7] = -class146.method1178(arg7 + arg1 + 556238, -7008, arg6 + arg4 + 932731) * 8;
                    return;
                } else {
                    class7.field219[arg0][arg6][arg7] = class7.field219[arg0 - 1][arg6][arg7] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg2.method322((byte) -50);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg0 == 0) {
                    class7.field219[0][arg6][arg7] = -var9 * 8;
                    return;
                }
                class7.field219[arg0][arg6][arg7] = class7.field219[arg0 - 1][arg6][arg7] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                field1171[arg0][arg6][arg7] = arg2.method293(arg3 - 120);
                class44.field1199[arg0][arg6][arg7] = (byte) ((var8 - 2) / 4);
                class29.field836[arg0][arg6][arg7] = (byte) class87.method747(3, var8 + arg5 - 2);
            } else if (var8 <= 81) {
                class137.field3424[arg0][arg6][arg7] = (byte) (var8 - 49);
            } else {
                class98.field2331[arg0][arg6][arg7] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lfc;", line = 210)
    public static final class39 method506(int arg0, int arg1) {
        field1164++;
        if (arg0 < 100000) {
            return class86.method734(arg0, 2218);
        } else if (arg0 < 10000000) {
            return class137.method1111(new class39[] { class86.method734(arg0 / 1000, 2218), class1.field23 }, (byte) 117);
        } else {
            if (arg1 != 4) {
                field1187 = null;
            }
            return class137.method1111(new class39[] { class86.method734(arg0 / 1000000, 2218), class137.field3432 }, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILdc;I)V", line = 234)
    private final void method507(int arg0, class25 arg1, int arg2) {
        field1167++;
        if (arg2 == 1) {
            this.field1158 = arg1.method301(-4853);
            this.field1168 = arg1.method322((byte) -50);
            this.field1178 = arg1.method322((byte) -50);
        }
        if (arg0 != -8045) {
            field1160 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLdc;)V", line = 258)
    public final void method508(byte arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method322((byte) -50);
            if (var3 == 0) {
                field1163++;
                if (arg0 <= 68) {
                    method509(-23, null, 83, false);
                    return;
                }
                return;
            }
            this.method507(-8045, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[BIZ)I", line = 281)
    public static final int method509(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field1185++;
        int var4 = -1;
        if (arg3) {
            field1170 = null;
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class45.field1217[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILnf;I)V", line = 304)
    public static final void method510(int arg0, int arg1, int arg2, class96 arg3, int arg4) {
        field1166++;
        if (class126.field3207 >= 400) {
            return;
        }
        if (arg3.field2243 != null) {
            arg3 = arg3.method812(-127);
        }
        if (arg3 == null || !arg3.field2239) {
            return;
        }
        class39 var5 = arg3.field2221;
        if (arg2 != -18341) {
            return;
        }
        if (arg3.field2262 != 0) {
            var5 = class137.method1111(new class39[] { var5, class136.method1101(arg3.field2262, class94.field2197.field3550, false), class126.field3204, class61.field1499, class86.method734(arg3.field2262, 2218), class29.field825 }, (byte) 89);
        }
        if (class92.field2146 == 1) {
            class44.field1215++;
            class92.method786(arg0, 49, arg4, 74, arg1, class137.method1111(new class39[] { class76.field1741, class94.field2201, var5 }, (byte) 83), class50.field1267);
        } else if (!class97.field2313) {
            class39[] var6 = arg3.field2241;
            if (class124.field3192) {
                var6 = class99.method824(var6, (byte) -19);
            }
            class27.field761++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method461(class113.field2969, (byte) 82)) {
                        class134.field3370++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 33;
                        }
                        if (var7 == 1) {
                            var8 = 26;
                        }
                        if (var7 == 2) {
                            var8 = 8;
                        }
                        if (var7 == 3) {
                            var8 = 57;
                        }
                        if (var7 == 4) {
                            var8 = 53;
                        }
                        class92.method786(arg0, var8, arg4, 45, arg1, class137.method1111(new class39[] { class110.field2810, var5 }, (byte) -59), var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method461(class113.field2969, (byte) 82)) {
                        class62.field1530++;
                        short var10 = 0;
                        if (class94.field2197.field3550 < arg3.field2262) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 33;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 26;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 8;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 57;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 53;
                        }
                        class92.method786(arg0, var11, arg4, arg2 + 18384, arg1, class137.method1111(new class39[] { class110.field2810, var5 }, (byte) 87), var6[var9]);
                    }
                }
            }
            class92.method786(arg0, 1004, arg4, arg2 ^ 0xFFFFB874, arg1, class137.method1111(new class39[] { class110.field2810, var5 }, (byte) -72), class42.field1151);
        } else if ((class109.field2790 & 0x2) == 2) {
            class92.method786(arg0, 6, arg4, arg2 ^ 0xFFFFB812, arg1, class137.method1111(new class39[] { class103.field2591, class94.field2201, var5 }, (byte) 83), class96.field2232);
            class39.field1044++;
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB[BLrb;)V", line = 446)
    public static final void method511(int arg0, byte arg1, byte[] arg2, class120 arg3) {
        field1169++;
        class108 var4 = new class108();
        int var5 = 21 % ((-arg1 - 72) / 48);
        var4.field2704 = 0;
        var4.field3619 = arg0;
        var4.field2705 = arg2;
        var4.field2707 = arg3;
        class2 var6 = class7.field214;
        synchronized (class7.field214) {
            class7.field214.method19(var4, 7);
        }
        class58.method585(-1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZLob;IIIII)V", line = 508)
    public static final void method512(int arg0, int arg1, boolean arg2, class99 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            field1180 = null;
        }
        if (class116.field3055) {
            class7.field238 = 32;
        } else {
            class7.field238 = 0;
        }
        field1165++;
        class116.field3055 = false;
        if (arg4 >= arg1 && arg1 + 16 > arg4 && arg5 <= arg0 && arg0 < arg5 + 16) {
            arg3.field2447 -= class101.field2534 * 4;
            if (arg8 == 1) {
                class104.field2638 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                class128.field3242 = true;
            }
        } else if (arg1 <= arg4 && arg4 < arg1 + 16 && arg5 + arg7 - 16 <= arg0 && arg0 < arg5 + arg7) {
            arg3.field2447 += class101.field2534 * 4;
            if (arg8 == 1) {
                class104.field2638 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                class128.field3242 = true;
            }
        } else if (arg1 - class7.field238 <= arg4 && arg4 < class7.field238 + arg1 + 16 && arg5 + 16 <= arg0 && arg5 + arg7 - 16 > arg0 && class101.field2534 > 0) {
            if (arg8 == 2 || arg8 == 3) {
                class128.field3242 = true;
            }
            class116.field3055 = true;
            int var9 = (arg7 - 32) * arg7 / arg6;
            if (arg8 == 1) {
                class104.field2638 = true;
            }
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg7 - var9 - 32;
            int var11 = arg0 - arg5 - var9 / 2 - 16;
            arg3.field2447 = (arg6 - arg7) * var11 / var10;
        }
        if (class68.field1620 == 0) {
            return;
        }
        int var12 = arg3.field2357;
        if (arg8 == -1) {
            var12 = 479;
        }
        if (arg4 < arg1 - var12 || arg0 < arg5 || arg1 + 16 <= arg4 || arg5 + arg7 < arg0) {
            return;
        }
        if (arg8 == 2 || arg8 == 3) {
            class128.field3242 = true;
        }
        if (arg8 == 1) {
            class104.field2638 = true;
        }
        arg3.field2447 += class68.field1620 * 45;
        return;
    }
}
