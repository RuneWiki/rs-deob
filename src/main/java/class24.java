import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class18 {

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "[I")
    public static int[] field683 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "Lkd;")
    public static class73 field694 = class126.method1070((byte) -66, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "Lkd;")
    private static class73 field688 = class126.method1070((byte) -66, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Lkd;")
    public static class73 field684 = field688;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "Lkd;")
    public static class73 field695 = null;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
    public static int field691 = -1;

    @OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lkd;")
    public static class73 field698 = class126.method1070((byte) -66, "AUS");

    @OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
    public static int field699 = 0;

    @OriginalMember(owner = "client!db", name = "Gb", descriptor = "I")
    public static int field700 = -1;

    @OriginalMember(owner = "client!db", name = "Hb", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
    public static int field702 = -1;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
    public static int[] field682;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        field696++;
        int var1 = class58.field1553.method357(class39.field1060);
        if (arg0 != -84) {
            field686 = 31;
        }
        for (int var2 = 0; var2 < class129.field3262; var2++) {
            int var12 = class58.field1553.method357(class54.field1440[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class129.field3262 * 15 + 21;
        if (class81.field2033 != -1) {
            class50.field1333 = 0;
            class15.field459 = true;
            int var4 = class42.field1134;
            int var5 = class103.field2570 - var1 / 2;
            if (var1 + var5 > 765) {
                var5 = 765 - var1;
            }
            class126.field3183 = var1;
            if (var5 < 0) {
                var5 = 0;
            }
            if (var3 + var4 > 503) {
                var4 = 503 - var3;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class143.field3556 = class129.field3262 * 15 + 22;
            class39.field1059 = var5;
            class103.field2568 = var4;
        } else if (class103.field2570 > 4 && class42.field1134 > 4 && class103.field2570 < 516 && class42.field1134 < 338) {
            class126.field3183 = var1;
            int var6 = class103.field2570 - var1 / 2 - 4;
            int var7 = class42.field1134 - 4;
            if (var1 + var6 > 512) {
                var6 = 512 - var1;
            }
            class15.field459 = true;
            class50.field1333 = 0;
            if (var3 + var7 > 334) {
                var7 = 334 - var3;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            class39.field1059 = var6;
            class143.field3556 = class129.field3262 * 15 + 22;
            if (var7 < 0) {
                var7 = 0;
            }
            class103.field2568 = var7;
        } else if (class103.field2570 > 553 && class42.field1134 > 205 && class103.field2570 < 743 && class42.field1134 < 466) {
            class50.field1333 = 1;
            class143.field3556 = class129.field3262 * 15 + 22;
            class126.field3183 = var1;
            class15.field459 = true;
            int var8 = class103.field2570 - var1 / 2 - 553;
            if (var8 < 0) {
                var8 = 0;
            } else if (var1 + var8 > 190) {
                var8 = 190 - var1;
            }
            int var9 = class42.field1134 - 205;
            class39.field1059 = var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var3 + var9 > 261) {
                var9 = 261 - var3;
            }
            class103.field2568 = var9;
        } else if (class103.field2570 > 17 && class42.field1134 > 357 && class103.field2570 < 496 && class42.field1134 < 453) {
            class15.field459 = true;
            int var10 = class103.field2570 - var1 / 2 - 17;
            class126.field3183 = var1;
            if (var10 < 0) {
                var10 = 0;
            } else if (var1 + var10 > 479) {
                var10 = 479 - var1;
            }
            class50.field1333 = 2;
            class143.field3556 = class129.field3262 * 15 + 22;
            int var11 = class42.field1134 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var3 + var11 > 96) {
                var11 = 96 - var3;
            }
            class39.field1059 = var10;
            class103.field2568 = var11;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
    public static final void method195(byte arg0) {
        class110.field2712 = 0;
        class58.field1547 = 0;
        class34.method275(121);
        class41.method312(arg0 ^ 0xFFFFFFEA);
        class77.method667(122);
        class55.method441(3293);
        field685++;
        for (int var1 = 0; var1 < class58.field1547; var1++) {
            int var3 = class89.field2246[var1];
            if (class49.field1308 != class42.field1141[var3].field2270) {
                class42.field1141[var3] = null;
            }
        }
        if (arg0 != -10) {
            field688 = null;
        }
        if (class81.field2039 != class89.field2235.field2816) {
            throw new RuntimeException("gpp1 pos:" + class89.field2235.field2816 + " psize:" + class81.field2039);
        }
        for (int var2 = 0; var2 < class63.field1661; var2++) {
            if (class42.field1141[class14.field435[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class63.field1661);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I[IIII[Lwc;)V")
    public static final void method196(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, class151[] arg5) {
        if (arg2 > arg3) {
            int var6 = arg3 - 1;
            int var7 = arg2 + 1;
            int var8 = (arg2 + arg3) / 2;
            class151 var9 = arg5[var8];
            arg5[var8] = arg5[arg3];
            arg5[arg3] = var9;
            while (var6 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg1[var11] == 2) {
                            var12 = var9.field3739;
                            var13 = arg5[var7].field3739;
                        } else if (arg1[var11] == 1) {
                            var12 = var9.field3732;
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = arg5[var7].field3732;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg1[var11] == 3) {
                            var13 = arg5[var7].field3734 ? 1 : 0;
                            var12 = var9.field3734 ? 1 : 0;
                        } else {
                            var12 = var9.field3738;
                            var13 = arg5[var7].field3738;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var13 <= var12) && (arg0[var11] != 0 || var13 >= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg1[var15] == 2) {
                            var16 = arg5[var6].field3739;
                            var17 = var9.field3739;
                        } else if (arg1[var15] == 1) {
                            var16 = arg5[var6].field3732;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = var9.field3732;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg1[var15] == 3) {
                            var17 = var9.field3734 ? 1 : 0;
                            var16 = arg5[var6].field3734 ? 1 : 0;
                        } else {
                            var17 = var9.field3738;
                            var16 = arg5[var6].field3738;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var16 >= var17) && (arg0[var15] != 0 || var16 <= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 > var6) {
                    class151 var18 = arg5[var6];
                    arg5[var6] = arg5[var7];
                    arg5[var7] = var18;
                }
            }
            method196(arg0, arg1, var7, arg3, 74, arg5);
            method196(arg0, arg1, arg2, var7 + 1, 95, arg5);
        }
        if (arg4 >= 11) {
            field697++;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        field689++;
        if (arg0 != 11800) {
            field702 = -42;
        }
        return class9.method86(this.field692, (byte) 91).method1071(this.field687, arg0 ^ 0x2E42);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static final void method197(boolean arg0) {
        field693++;
        if (arg0) {
            method197(true);
        }
        class110.field2693.method534((byte) -111);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method198(int arg0) {
        field683 = null;
        field694 = null;
        if (arg0 != -1) {
            field683 = null;
        }
        field695 = null;
        field688 = null;
        field698 = null;
        field682 = null;
        field684 = null;
    }
}
