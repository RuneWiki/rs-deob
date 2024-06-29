import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class70 extends class1 {

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Z")
    public boolean field1099 = true;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "[S")
    public static short[] field1110 = new short[256];

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Z")
    public static boolean field1114 = false;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "[I")
    private int[] field1104;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "[I")
    public int[] field1111;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field1102;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "[[I")
    private int[][] field1119;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[[[B")
    public static byte[][][] field1108;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
    public static final int method462(byte arg0, int arg1) {
        field1106++;
        if (class44.field706 != null) {
            class44.field706.method955((byte) -111);
            class44.field706 = null;
        }
        if (arg0 >= -66) {
            field1110 = null;
        }
        class285.field4274++;
        if (class285.field4274 > 4) {
            class285.field4274 = 0;
            class20.field229 = 0;
            return arg1;
        }
        if (class220.field3313 == class154.field2325) {
            class154.field2325 = class141.field2058;
        } else {
            class154.field2325 = class220.field3313;
        }
        class20.field229 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([ILfl;B)V")
    public final void method463(int[] arg0, class248 arg1, byte arg2) {
        field1101++;
        if (this.field1104 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 >= -111) {
            return;
        }
        while (this.field1104.length > var4) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = class100.field1586[this.method475(var4, 29961)];
            if (var5 > 0) {
                arg1.method1585((long) arg0[var4], var5, 0);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static final void method464(boolean arg0) {
        class189.method1186((byte) 50);
        field1105++;
        class96.method625((byte) 118);
        class295.method1978(20);
        class25.method161(true);
        class247.method1554(86);
        class185.method1149(true);
        class252.method1657(-98);
        class129.method806(arg0);
        class65.method440(256);
        class72.method492((byte) -59);
        class187.method1164(5);
        class258.method1736((byte) 5);
        class43.method284(121);
        class3.method12(arg0);
        class144.method882(5);
        class203.method1293((byte) 90);
        class265.method1763(0);
        class20.method133((byte) 65);
        class124.method786((byte) 110);
        class212.method1356((byte) 127);
        class93.field1475.method1782(0);
        class246.field3681.method1782(0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILfk;IIIIB)Lfk;")
    public static final class14 method465(int arg0, class14 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1116++;
        long var7 = (long) arg4;
        class14 var9 = (class14) class219.field3299.method1777(var7, (byte) 112);
        if (var9 == null) {
            class208 var10 = class208.method1332(class192.field2959, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1315(64, 768, -50, -10, -50);
            class219.field3299.method1784(var7, var9, 0);
        }
        int var11 = arg1.method99();
        if (arg6 < 67) {
            method474((byte) 120, (class153) null);
        }
        int var12 = arg1.method108();
        int var13 = arg1.method104();
        int var14 = arg1.method86();
        class14 var15 = var9.method83(true, true, true);
        if (arg5 != 0) {
            var15.method89(arg5);
        }
        class29 var16 = (class29) var15;
        if (class183.method1139(class99.field1557, arg2 + var13, arg3 + var11, (byte) 117) != arg0 || arg0 != class183.method1139(class99.field1557, arg2 + var14, arg3 + var12, (byte) 117)) {
            for (int var17 = 0; var17 < var16.field348; var17++) {
                var16.field358[var17] += class183.method1139(class99.field1557, var16.field386[var17] + arg2, var16.field356[var17] - -arg3, (byte) 117) - arg0;
            }
            var16.field347 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)I")
    public final int method466(byte arg0) {
        field1107++;
        if (arg0 == -66) {
            return this.field1104 == null ? 0 : this.field1104.length;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLfl;)V")
    public final void method467(byte arg0, class248 arg1) {
        if (arg0 > -35) {
            method469(-49);
        }
        field1118++;
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method473(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
    public static final void method468(int arg0, int arg1, byte arg2) {
        field1115++;
        if (arg2 >= -35) {
            method469(-111);
        }
        class23 var3 = class276.method1827((byte) 68, arg0);
        int var4 = var3.field272;
        int var5 = var3.field281;
        int var6 = var3.field274;
        int var7 = class66.field1052[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class4.method17(7298, var8 & arg1 << var6 | ~var8 & class186.field2823[var4], var4);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static final void method469(int arg0) {
        class100.field1580.method1102(-2836);
        field1100++;
        int var1 = class100.field1580.method1098(8, (byte) 113);
        if (var1 < class24.field295) {
            for (int var2 = var1; var2 < class24.field295; var2++) {
                class72.field1157[class204.field3070++] = class169.field2586[var2];
            }
        }
        if (class24.field295 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class24.field295 = 0;
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class169.field2586[var3];
            class61 var5 = class18.field220[var4];
            int var6 = class100.field1580.method1098(1, (byte) 84);
            if (var6 == 0) {
                class169.field2586[class24.field295++] = var4;
                var5.field2278 = class270.field4058;
            } else {
                int var7 = class100.field1580.method1098(2, (byte) 100);
                if (var7 == 0) {
                    class169.field2586[class24.field295++] = var4;
                    var5.field2278 = class270.field4058;
                    class113.field1736[class118.field1781++] = var4;
                } else if (var7 == 1) {
                    class169.field2586[class24.field295++] = var4;
                    var5.field2278 = class270.field4058;
                    int var8 = class100.field1580.method1098(3, (byte) -4);
                    var5.method926(var8, 1, -1);
                    int var9 = class100.field1580.method1098(1, (byte) 2);
                    if (var9 == 1) {
                        class113.field1736[class118.field1781++] = var4;
                    }
                } else if (var7 == 2) {
                    class169.field2586[class24.field295++] = var4;
                    var5.field2278 = class270.field4058;
                    if (class100.field1580.method1098(1, (byte) 125) == 1) {
                        int var11 = class100.field1580.method1098(3, (byte) 104);
                        var5.method926(var11, 2, -1);
                        int var12 = class100.field1580.method1098(3, (byte) -101);
                        var5.method926(var12, 2, -1);
                    } else {
                        int var10 = class100.field1580.method1098(3, (byte) -25);
                        var5.method926(var10, 0, -1);
                    }
                    int var13 = class100.field1580.method1098(1, (byte) 99);
                    if (var13 == 1) {
                        class113.field1736[class118.field1781++] = var4;
                    }
                } else if (var7 == 3) {
                    class72.field1157[class204.field3070++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static void method470(boolean arg0) {
        field1108 = null;
        field1110 = null;
        if (arg0) {
            method469(-61);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    public final int method471(int arg0, int arg1, int arg2) {
        field1113++;
        if (this.field1104 == null || arg1 < 0 || this.field1104.length < arg1) {
            return -1;
        } else if (this.field1119[arg1] == null || arg0 < 0 || arg0 > this.field1119[arg1].length) {
            return -1;
        } else {
            if (arg2 != 8360) {
                this.method471(73, 36, 3);
            }
            return this.field1119[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method472(int arg0) {
        field1112++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1102 == null) {
            return "";
        }
        var2.append(this.field1102[0]);
        for (int var3 = 1; var3 < this.field1102.length; var3++) {
            var2.append("...");
            var2.append(this.field1102[var3]);
        }
        int var4 = 121 % ((-arg0 - 40) / 47);
        return var2.toString();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILfl;I)V")
    private final void method473(int arg0, class248 arg1, int arg2) {
        if (arg2 != 0) {
            this.method467((byte) -44, (class248) null);
        }
        if (arg0 == 1) {
            this.field1102 = class96.method622(0, arg1.method1597((byte) 125), '<');
        } else if (arg0 == 2) {
            int var8 = arg1.method1593((byte) 27);
            this.field1111 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1111[var9] = arg1.method1575(false);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1593((byte) 27);
            this.field1104 = new int[var4];
            this.field1119 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1575(false);
                this.field1104[var5] = var6;
                this.field1119[var5] = new int[class129.field1924[var6]];
                for (int var7 = 0; var7 < class129.field1924[var6]; var7++) {
                    this.field1119[var5][var7] = arg1.method1575(false);
                }
            }
        } else if (arg0 == 4) {
            this.field1099 = false;
        }
        field1103++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLqa;)V")
    public static final void method474(byte arg0, class153 arg1) {
        class158 var2 = arg1.method928(24840);
        field1122++;
        arg1.field2303 = var2.field2414;
        if (arg1.field2277 == 0) {
            arg1.field2219 = 0;
        } else {
            if (arg1.field2260 != -1 && arg1.field2204 == 0) {
                class215 var3 = class276.method1829(arg1.field2260, 29223);
                if (arg1.field2246 > 0 && var3.field3242 == 0) {
                    arg1.field2219++;
                    return;
                }
                if (arg1.field2246 <= 0 && var3.field3228 == 0) {
                    arg1.field2219++;
                    return;
                }
            }
            if (arg1.field2230 != -1 && class270.field4058 >= arg1.field2280) {
                class21 var4 = class236.method1498((byte) -106, arg1.field2230);
                if (var4.field256 && var4.field249 != -1) {
                    class215 var5 = class276.method1829(var4.field249, 29223);
                    if (arg1.field2246 > 0 && var5.field3242 == 0) {
                        arg1.field2219++;
                        return;
                    }
                    if (arg1.field2246 <= 0 && var5.field3228 == 0) {
                        arg1.field2219++;
                        return;
                    }
                }
            }
            int var6 = arg1.field2234;
            int var7 = arg1.field2251;
            int var8 = arg1.field2297[arg1.field2277 - 1] * 128 + (arg1.method676(-30217) * 64);
            int var9 = arg1.field2275[arg1.field2277 - 1] * 128 + arg1.method676(-30217) * 64;
            if ((var8 - var7) > 256 || var8 - var7 < -256 || (var9 - var6) > 256 || var9 - var6 < -256) {
                arg1.field2234 = var9;
                arg1.field2251 = var8;
                return;
            }
            if (var8 > var7) {
                if (var6 < var9) {
                    arg1.field2233 = 1280;
                } else if (var9 >= var6) {
                    arg1.field2233 = 1536;
                } else {
                    arg1.field2233 = 1792;
                }
            } else if (var7 > var8) {
                if (var9 > var6) {
                    arg1.field2233 = 768;
                } else if (var6 > var9) {
                    arg1.field2233 = 256;
                } else {
                    arg1.field2233 = 512;
                }
            } else if (var9 > var6) {
                arg1.field2233 = 1024;
            } else if (var6 > var9) {
                arg1.field2233 = 0;
            }
            int var10 = var2.field2402;
            int var11 = arg1.field2233 - arg1.field2273 & 0x7FF;
            int var12 = 4;
            if (var11 > 1024) {
                var11 -= 2048;
            }
            if (var11 >= -256 && var11 <= 256) {
                var10 = var2.field2403;
            } else if (var11 >= 256 && var11 < 768) {
                var10 = var2.field2401;
            } else if (var11 >= -768 && var11 <= -256) {
                var10 = var2.field2416;
            }
            byte var13 = 1;
            if (var10 == -1) {
                var10 = var2.field2403;
            }
            boolean var14 = true;
            arg1.field2303 = var10;
            if (arg1 instanceof class61) {
                var14 = ((class61) arg1).field959.field1141;
            }
            if (var14) {
                if (arg1.field2273 != arg1.field2233 && arg1.field2283 == -1 && arg1.field2269 != 0) {
                    var12 = 2;
                }
                if (arg1.field2277 > 2) {
                    var12 = 6;
                }
                if (arg1.field2277 > 3) {
                    var12 = 8;
                }
                if (arg1.field2219 > 0 && arg1.field2277 > 1) {
                    var12 = 8;
                    arg1.field2219--;
                }
            } else {
                if (arg1.field2277 > 1) {
                    var12 = 6;
                }
                if (arg1.field2277 > 2) {
                    var12 = 8;
                }
                if (arg1.field2219 > 0 && arg1.field2277 > 1) {
                    var12 = 8;
                    arg1.field2219--;
                }
            }
            if (arg1.field2292[arg1.field2277 - 1] == 2) {
                var12 <<= 0x1;
                var13 = 2;
            } else if (arg1.field2292[arg1.field2277 - 1] == 0) {
                var12 >>= 0x1;
                var13 = 0;
            }
            if (var12 < 8 || var2.field2430 == -1) {
                if (var2.field2411 != -1 && var13 == 0) {
                    if (arg1.field2303 == var2.field2402 && var2.field2419 != -1) {
                        arg1.field2303 = var2.field2419;
                    } else if (arg1.field2303 == var2.field2416 && var2.field2420 != -1) {
                        arg1.field2303 = var2.field2420;
                    } else if (arg1.field2303 == var2.field2401 && var2.field2415 != -1) {
                        arg1.field2303 = var2.field2415;
                    } else {
                        arg1.field2303 = var2.field2411;
                    }
                }
            } else if (arg1.field2303 == var2.field2402 && var2.field2406 != -1) {
                arg1.field2303 = var2.field2406;
            } else if (arg1.field2303 == var2.field2416 && var2.field2409 != -1) {
                arg1.field2303 = var2.field2409;
            } else if (arg1.field2303 == var2.field2401 && var2.field2397 != -1) {
                arg1.field2303 = var2.field2397;
            } else {
                arg1.field2303 = var2.field2430;
            }
            if (var2.field2418 != -1) {
                int var15 = var12 << 7;
                if (arg1.field2277 == 1) {
                    int var16 = arg1.field2250 * arg1.field2250;
                    int var17 = (var8 >= arg1.field2251 ? var8 - arg1.field2251 : -var8 + arg1.field2251) << 7;
                    int var18 = (arg1.field2234 <= var9 ? var9 - arg1.field2234 : -var9 + arg1.field2234) << 7;
                    int var19 = var18 >= var17 ? var18 : var17;
                    int var20 = var2.field2418 * var19 * 2;
                    if (var20 < var16) {
                        arg1.field2250 /= 2;
                    } else if (var19 < var16 / 2) {
                        arg1.field2250 -= var2.field2418;
                        if (arg1.field2250 < 0) {
                            arg1.field2250 = 0;
                        }
                    } else if (var15 > arg1.field2250) {
                        arg1.field2250 += var2.field2418;
                        if (var15 < arg1.field2250) {
                            arg1.field2250 = var15;
                        }
                    }
                } else if (var15 > arg1.field2250) {
                    arg1.field2250 += var2.field2418;
                    if (arg1.field2250 > var15) {
                        arg1.field2250 = var15;
                    }
                } else if (arg1.field2250 > 0) {
                    arg1.field2250 -= var2.field2418;
                    if (arg1.field2250 < 0) {
                        arg1.field2250 = 0;
                    }
                }
                var12 = arg1.field2250 >> 7;
                if (var12 < 1) {
                    var12 = 1;
                }
            }
            if (var9 > var6) {
                arg1.field2234 += var12;
                if (var9 < arg1.field2234) {
                    arg1.field2234 = var9;
                }
            } else if (var9 < var6) {
                arg1.field2234 -= var12;
                if (var9 > arg1.field2234) {
                    arg1.field2234 = var9;
                }
            }
            if (var8 > var7) {
                arg1.field2251 += var12;
                if (var8 < arg1.field2251) {
                    arg1.field2251 = var8;
                }
            } else if (var8 < var7) {
                arg1.field2251 -= var12;
                if (var8 > arg1.field2251) {
                    arg1.field2251 = var8;
                }
            }
            if (arg1.field2251 == var8 && arg1.field2234 == var9) {
                arg1.field2277--;
                if (arg1.field2246 > 0) {
                    arg1.field2246--;
                }
            }
        }
        int var21 = 57 % ((arg0 - 28) / 47);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public final int method475(int arg0, int arg1) {
        if (arg1 != 29961) {
            field1110 = null;
        }
        field1121++;
        return this.field1104 == null || arg0 < 0 || this.field1104.length < arg0 ? -1 : this.field1104[arg0];
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
    public final void method476(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1098++;
        if (this.field1111 != null) {
            for (int var2 = 0; var2 < this.field1111.length; var2++) {
                this.field1111[var2] = class63.method428(this.field1111[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lfl;I)Ljava/lang/String;")
    public final String method477(class248 arg0, int arg1) {
        field1109++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 != 0) {
            field1117 = 112;
        }
        if (this.field1104 != null) {
            for (int var4 = 0; var4 < this.field1104.length; var4++) {
                var3.append(this.field1102[var4]);
                var3.append(class115.method742(this.field1119[var4], arg0.method1619(class59.field926[this.field1104[var4]], (byte) 83), this.field1104[var4], arg1 + 25132));
            }
        }
        var3.append(this.field1102[this.field1102.length - 1]);
        return var3.toString();
    }
}
