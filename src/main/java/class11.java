import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class252 {

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    private int field164 = -1;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field167 = 2;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "Ljd;")
    public static class85 field173 = class221.method1499("<col=ffffff>", (byte) -121);

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "Ljd;")
    public static class85 field179 = class221.method1499("Lade Titelbild )2 ", (byte) 118);

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "[[B")
    public static byte[][] field166 = new byte[1000][];

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "F")
    public static float field165;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lge;")
    public static class68 field169;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "[I")
    private int[] field170;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public static void method86(int arg0) {
        field173 = null;
        field169 = null;
        field179 = null;
        if (arg0 == 155670992) {
            field166 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3) {
        class226.field3935 = new class208[arg0][arg1][arg2];
        class225.field3920 = new int[arg0][arg1 + 1][arg2 + 1];
        class253.method1747(false);
        class122.field2140 = arg1;
        class202.field3521 = arg2;
        class76.field1415 = new int[arg0][arg1 + 1][arg2 + 1];
        class160.method1049();
        class271.field4800 = arg3;
        class210.field3683 = new boolean[class271.field4800 + class271.field4800 + 1][class271.field4800 + class271.field4800 + 1];
        class104.field1832 = new boolean[class271.field4800 + class271.field4800 + 2][class271.field4800 + class271.field4800 + 2];
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field176;
        if (arg2 != -99) {
            method87(-3, -71, -4, -29);
        }
        if (arg1 == 0) {
            this.field164 = arg0.method1694((byte) -100);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field177;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338 && this.method92((byte) -73)) {
            int var4 = (class140.field2422 != this.field171 ? this.field171 * arg0 / class140.field2422 : arg0) * this.field163;
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class5.field63 == this.field163) {
                for (int var8 = 0; ~var8 > ~class5.field63; ++var8) {
                    int var9 = this.field170[var4++];
                    var7[var8] = class135.method899(4080, var9 << 4);
                    var5[var8] = class135.method899(var9, 65280) >> 4;
                    var6[var8] = class135.method899(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class5.field63 < ~var10; ++var10) {
                    int var11 = this.field163 * var10 / class5.field63;
                    int var12 = this.field170[var4 + var11];
                    var7[var10] = class135.method899(var12, 255) << 4;
                    var5[var10] = class135.method899(var12 >> 4, 4080);
                    var6[var10] = class135.method899(4080, var12 >> 12);
                }
            }
        }
        if (arg1 != -123) {
            this.method92((byte) -68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
    public static final void method90(int arg0) {
        class124.field2191.method1270((byte) 107);
        ++field175;
        if (arg0 != -25059) {
            method91(true, -109, 2L, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIJB)Ljd;")
    public static final class85 method91(boolean arg0, int arg1, long arg2, byte arg3) {
        ++field174;
        if (arg3 > -51) {
            field181 = -21;
        }
        if (~arg1 <= -3 && ~arg1 >= -37) {
            int var5 = 1;
            for (long var6 = arg2 / (long) arg1; ~var6 != -1L; var6 /= (long) arg1) {
                ++var5;
            }
            int var8 = var5;
            if (~arg2 > -1L || arg0) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg2 >= 0L) {
                if (arg0) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = 0; ~var5 < ~var10; ++var10) {
                int var12 = (int) (arg2 % (long) arg1);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                arg2 /= (long) arg1;
                if (~var12 < -10) {
                    var12 += 39;
                }
                var9[var8 - (var10 + 1)] = (byte) (var12 + 48);
            }
            class85 var11 = new class85();
            var11.field1538 = var8;
            var11.field1548 = var9;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
    private final boolean method92(byte arg0) {
        ++field162;
        if (this.field170 != null) {
            return true;
        } else if (~this.field164 <= -1) {
            int var2 = class5.field63;
            int var3 = class140.field2422;
            int var4 = !class20.field283.method685(true, this.field164) ? 128 : 64;
            this.field170 = class20.field283.method684((byte) -59, this.field164);
            this.field171 = var4;
            this.field163 = var4;
            class140.method920(-72, var2, var3);
            return this.field170 != null;
        } else {
            if (arg0 >= -67) {
                method90(67);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjb;III)V")
    public static final void method93(int arg0, class255 arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 155670992) {
            field166 = null;
        }
        ++field180;
        class21.method145(30868);
        class179.method1216(arg3, arg0, arg3 - -arg1.field4513, arg1.field4482 + arg0);
        if (~class219.field3861 != -3 && ~class219.field3861 != -6 && class245.field4186 != null) {
            int var5 = class64.field1185 + class30.field450 & 2047;
            int var6 = class22.field308.field1042 / 32 + 48;
            int var7 = -(class22.field308.field1027 / 32) + 464;
            ((class266) class245.field4186).method58(arg3, arg0, arg1.field4513, arg1.field4482, var6, var7, var5, class226.field3930 + 256, arg1.field4490, arg1.field4491);
            if (class177.field3023 != null) {
                for (int var8 = 0; ~var8 > ~class177.field3023.field3862; ++var8) {
                    if (class177.field3023.method1495((byte) -63, var8)) {
                        int var9 = (class177.field3023.field3847[var8] + -class244.field4172) * 4 - -2 - class22.field308.field1042 / 32;
                        int var10 = (class177.field3023.field3845[var8] + -class213.field3742) * 4 - class22.field308.field1027 / 32 + 2;
                        int var11 = class173.field2984[var5];
                        int var12 = var11 * 256 / (class226.field3930 - -256);
                        int var13 = class173.field2995[var5];
                        int var14 = var13 * 256 / (class226.field3930 - -256);
                        class10 var15 = class130.field2280;
                        if (~class177.field3023.method1496(var8, 1) == -2) {
                            var15 = class30.field457;
                        }
                        if (~class177.field3023.method1496(var8, 1) == -3) {
                            var15 = class180.field3092;
                        }
                        int var16 = var10 * var14 + -(var9 * var12) >> 16;
                        int var17 = var10 * var12 - -(var9 * var14) >> 16;
                        int var18 = var15.method73(class177.field3023.field3851[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg1.field4513 && ~arg1.field4513 <= ~var19 && -arg1.field4482 <= var16 && ~var16 >= ~arg1.field4482) {
                            int var20 = 16777215;
                            if (class177.field3023.field3842[var8] != -1) {
                                var20 = class177.field3023.field3842[var8];
                            }
                            class179.method1213(arg1.field4490, arg1.field4491);
                            var15.method68(class177.field3023.field3851[var8], arg1.field4513 / 2 + arg3 + var19, arg1.field4482 / 2 + -var16 + arg0, var18, 50, var20, 0, 256, 1, 0, 0);
                            class179.method1219();
                        }
                    }
                }
            }
            for (int var21 = 0; ~var21 > ~class162.field2786; ++var21) {
                int var54 = class178.field3063[var21] * 4 + -(class22.field308.field1042 / 32) + 2;
                int var55 = class234.field4059[var21] * 4 + 2 - class22.field308.field1027 / 32;
                class199 var56 = class110.method753(class117.field2098[var21], (byte) 117);
                if (var56.field3474 != null) {
                    var56 = var56.method1355(-1);
                    if (var56 == null || ~var56.field3470 == 0) {
                        continue;
                    }
                }
                class36.method245(true, arg1, arg0, var54, var55, arg3, class219.field3854[var56.field3470]);
            }
            for (int var22 = 0; ~var22 > -105; ++var22) {
                for (int var50 = 0; var50 < 104; ++var50) {
                    class15 var51 = class191.field3278[class116.field2066][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 - class22.field308.field1042 / 32 + 2;
                        int var53 = var50 * 4 - -2 + -(class22.field308.field1027 / 32);
                        class36.method245(true, arg1, arg0, var52, var53, arg3, class76.field1406[0]);
                    }
                }
            }
            for (int var23 = 0; var23 < class44.field775; ++var23) {
                class17 var46 = class194.field3320[class137.field2380[var23]];
                if (var46 != null && var46.method128(10)) {
                    class263 var47 = var46.field247;
                    if (var47 != null && var47.field4695 != null) {
                        var47 = var47.method1794((byte) 103);
                    }
                    if (var47 != null && var47.field4653 && var47.field4696) {
                        int var48 = var46.field1042 / 32 + -(class22.field308.field1042 / 32);
                        int var49 = var46.field1027 / 32 + -(class22.field308.field1027 / 32);
                        class36.method245(true, arg1, arg0, var48, var49, arg3, class76.field1406[1]);
                    }
                }
            }
            for (int var24 = 0; var24 < class196.field3375; ++var24) {
                class44 var38 = class249.field4291[class151.field2556[var24]];
                if (var38 != null && var38.method128(10)) {
                    int var39 = var38.field1042 / 32 + -(class22.field308.field1042 / 32);
                    boolean var40 = false;
                    int var41 = var38.field1027 / 32 + -(class22.field308.field1027 / 32);
                    long var42 = var38.field762.method624(false);
                    for (int var44 = 0; var44 < class45.field810; ++var44) {
                        if (class28.field428[var44] == var42 && class222.field3890[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (~class22.field308.field786 != -1 && var38.field786 != 0 && class22.field308.field786 == var38.field786) {
                        var45 = true;
                    }
                    if (!var40) {
                        if (!var45) {
                            class36.method245(true, arg1, arg0, var39, var41, arg3, class76.field1406[2]);
                        } else {
                            class36.method245(true, arg1, arg0, var39, var41, arg3, class76.field1406[4]);
                        }
                    } else {
                        class36.method245(true, arg1, arg0, var39, var41, arg3, class76.field1406[3]);
                    }
                }
            }
            class251[] var25 = class7.field87;
            for (int var26 = 0; ~var26 > ~var25.length; ++var26) {
                class251 var29 = var25[var26];
                if (var29 != null && var29.field4321 != 0 && class151.field2555 % 20 < 10) {
                    if (~var29.field4321 == -2 && var29.field4304 >= 0 && ~var29.field4304 > ~class194.field3320.length) {
                        class17 var30 = class194.field3320[var29.field4304];
                        if (var30 != null) {
                            int var31 = var30.field1027 / 32 - class22.field308.field1027 / 32;
                            int var32 = var30.field1042 / 32 + -(class22.field308.field1042 / 32);
                            class220.method1498(var29.field4325, var31, arg2 + -155670888, arg0, arg3, var32, arg1);
                        }
                    }
                    if (~var29.field4321 == -3) {
                        int var33 = (-class244.field4172 + var29.field4306) * 4 + -(class22.field308.field1042 / 32) + 2;
                        int var34 = (-class213.field3742 + var29.field4301) * 4 - -2 + -(class22.field308.field1027 / 32);
                        class220.method1498(var29.field4325, var34, arg2 + -155670867, arg0, arg3, var33, arg1);
                    }
                    if (var29.field4321 == 10 && var29.field4304 >= 0 && class249.field4291.length > var29.field4304) {
                        class44 var35 = class249.field4291[var29.field4304];
                        if (var35 != null) {
                            int var36 = var35.field1027 / 32 - class22.field308.field1027 / 32;
                            int var37 = var35.field1042 / 32 - class22.field308.field1042 / 32;
                            class220.method1498(var29.field4325, var36, 100, arg0, arg3, var37, arg1);
                        }
                    }
                }
            }
            if (class7.field79 != 0) {
                int var27 = class7.field79 * 4 - -2 + -(class22.field308.field1042 / 32);
                int var28 = class18.field259 * 4 + -(class22.field308.field1027 / 32) - -2;
                class36.method245(true, arg1, arg0, var27, var28, arg3, class253.field4365);
            }
            class179.method1222(arg1.field4513 / 2 + (arg3 - 1), arg1.field4482 / 2 + arg0 + -1, 3, 3, 16777215);
        } else {
            class179.method1211(arg3, arg0, 0, arg1.field4490, arg1.field4491);
        }
        class217.field3803[arg4] = true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final void method94(byte arg0) {
        ++field178;
        super.method94(arg0);
        this.field170 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)V")
    public static final void method95(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class34.field522 <= arg2 && class1.field6 >= arg2) {
            int var5 = class144.method945(arg4, class217.field3802, (byte) -116, class83.field1513);
            int var6 = class144.method945(arg0, class217.field3802, (byte) -116, class83.field1513);
            class153.method1009(arg2, 0, var6, arg3, var5);
        }
        ++field168;
        if (arg1 > -120) {
            field169 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)I")
    public final int method96(int arg0) {
        ++field172;
        if (arg0 != 2) {
            this.field170 = null;
        }
        return this.field164;
    }
}
