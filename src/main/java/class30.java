import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field418 = -1;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field428 = -1;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
    public boolean field429 = false;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Z")
    public boolean field421 = false;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field438 = -1;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field440 = 5;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public int field446 = 99;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public int field450 = 2;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field448 = -1;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
    public boolean field437 = false;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public int field443 = -1;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Z")
    public boolean field455 = false;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Luc;")
    public static class39 field444 = new class39(16);

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field451 = new String[1000];

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field453 = 2;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lbk;")
    public static class21 field456;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lhc;")
    public static class235 field430;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public int[] field423;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
    public int[] field439;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
    private int[] field442;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[Lch;")
    public static class290[] field422;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[Z")
    public boolean[] field434;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[[I")
    public int[][] field445;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "[[[B")
    public static byte[][][] field441;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[[[B")
    public static byte[][][] field454;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lai;ZI)V")
    private final void method228(class88 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method233(13, true, 89, -102, (class9) null, 20);
        }
        if (arg2 == 1) {
            int var4 = arg0.method645(11596);
            this.field423 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field423[var5] = arg0.method645(11596);
            }
            this.field439 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field439[var6] = arg0.method645(11596);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field439[var7] += arg0.method645(11596) << 16;
            }
        } else if (arg2 == 2) {
            this.field418 = arg0.method645(11596);
        } else if (arg2 == 3) {
            this.field434 = new boolean[256];
            int var8 = arg0.method633(99);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field434[arg0.method633(110)] = true;
            }
        } else if (arg2 == 4) {
            this.field429 = true;
        } else if (arg2 == 5) {
            this.field440 = arg0.method633(64);
        } else if (arg2 == 6) {
            this.field428 = arg0.method645(11596);
        } else if (arg2 == 7) {
            this.field443 = arg0.method645(11596);
        } else if (arg2 == 8) {
            this.field446 = arg0.method633(75);
        } else if (arg2 == 9) {
            this.field448 = arg0.method633(114);
        } else if (arg2 == 10) {
            this.field438 = arg0.method633(67);
        } else if (arg2 == 11) {
            this.field450 = arg0.method633(120);
        } else if (arg2 == 12) {
            int var10 = arg0.method633(84);
            this.field442 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field442[var11] = arg0.method645(11596);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field442[var12] += arg0.method645(11596) << 16;
            }
        } else if (arg2 == 13) {
            int var13 = arg0.method645(11596);
            this.field445 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg0.method633(62);
                if (var15 > 0) {
                    this.field445[var14] = new int[var15];
                    this.field445[var14][0] = arg0.method671(104);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field445[var14][var16] = arg0.method645(11596);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field455 = true;
        } else if (arg2 == 15) {
            this.field421 = true;
        } else if (arg2 == 16) {
            this.field437 = true;
        }
        field447++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        if (this.field438 == -1) {
            if (this.field434 == null) {
                this.field438 = 0;
            } else {
                this.field438 = 2;
            }
        }
        field431++;
        if (this.field448 != arg0) {
            return;
        }
        if (this.field434 == null) {
            this.field448 = 0;
        } else {
            this.field448 = 2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lad;")
    public static final class259 method230(int arg0, int arg1) {
        if (arg1 != -11) {
            field451 = null;
        }
        field433++;
        return (class259) class244.field3974.method285((long) arg0, 13821);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILig;IB)Lig;")
    public final class9 method231(int arg0, int arg1, class9 arg2, int arg3, byte arg4) {
        int var6 = this.field423[arg1];
        field425++;
        int var7 = this.field439[arg1];
        class3 var8 = class261.method1769(var7 >> 16, (byte) -126);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method81(true, true, true);
        }
        class3 var10 = null;
        class3 var11 = null;
        if ((this.field421 || class240.field3909) && arg3 != -1 && this.field439.length > arg3) {
            int var12 = this.field439[arg3];
            var11 = class261.method1769(var12 >> 16, (byte) -102);
            arg3 = var12 & 0xFFFF;
        }
        class3 var13 = null;
        int var14 = 0;
        if (arg4 >= -6) {
            field444 = null;
        }
        int var15 = 0;
        if (this.field442 != null) {
            if (this.field442.length > arg1) {
                var14 = this.field442[arg1];
                if (var14 != 65535) {
                    var10 = class261.method1769(var14 >> 16, (byte) 103);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field421 || class240.field3909) && arg3 != -1 && this.field442.length > arg3) {
                var15 = this.field442[arg3];
                if (var15 != 65535) {
                    var13 = class261.method1769(var15 >> 16, (byte) 85);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method11(var9, (byte) -90);
        boolean var17 = !var8.method10(var9, false);
        if (var10 != null) {
            var16 &= !var10.method11(var14, (byte) 126);
            var17 &= !var10.method10(var14, false);
        }
        if (var11 != null) {
            var16 &= !var11.method11(arg3, (byte) 90);
            var17 &= !var11.method10(arg3, false);
        }
        if (var13 != null) {
            var16 &= !var13.method11(var15, (byte) 65);
            var17 &= !var13.method10(var15, false);
        }
        class9 var18 = arg2.method81(var16, var17, !this.field455);
        var18.method77(var8, var9, var11, arg3, arg0 - 1, var6, this.field455);
        if (var10 != null) {
            var18.method77(var10, var14, var13, var15, arg0 - 1, var6, this.field455);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lig;IIII)Lig;")
    public final class9 method232(class9 arg0, int arg1, int arg2, int arg3, int arg4) {
        field420++;
        int var6 = this.field423[arg4];
        int var7 = this.field439[arg4];
        class3 var8 = class261.method1769(var7 >> 16, (byte) -90);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method72(true, true, true);
        }
        class3 var10 = null;
        if ((this.field421 || class240.field3909) && arg3 != -1 && this.field439.length > arg3) {
            int var11 = this.field439[arg3];
            var10 = class261.method1769(var11 >> 16, (byte) -58);
            arg3 = var11 & 0xFFFF;
        }
        class9 var12;
        if (var10 == null) {
            var12 = arg0.method72(!var8.method11(var9, (byte) -103), !var8.method10(var9, false), !this.field455);
        } else {
            var12 = arg0.method72(!var8.method11(var9, (byte) 101) & !var10.method11(arg3, (byte) 101), !var8.method10(var9, false) & !var10.method10(arg3, false), !this.field455);
        }
        var12.method77(var8, var9, var10, arg3, arg1 + arg2, var6, this.field455);
        return var12;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIILig;I)Lig;")
    public final class9 method233(int arg0, boolean arg1, int arg2, int arg3, class9 arg4, int arg5) {
        int var7 = this.field423[arg5];
        field424++;
        int var8 = this.field439[arg5];
        class3 var9 = class261.method1769(var8 >> 16, (byte) -92);
        int var10 = var8 & 0xFFFF;
        if (!arg1) {
            method237(-75);
        }
        if (var9 == null) {
            return arg4.method83(true, true, true);
        }
        int var11 = arg3 & 0x3;
        class3 var12 = null;
        if ((this.field421 || class240.field3909) && arg0 != -1 && this.field439.length > arg0) {
            int var13 = this.field439[arg0];
            var12 = class261.method1769(var13 >> 16, (byte) -115);
            arg0 = var13 & 0xFFFF;
        }
        class9 var14;
        if (var12 == null) {
            var14 = arg4.method83(!var9.method11(var10, (byte) -89), !var9.method10(var10, false), !this.field455);
        } else {
            var14 = arg4.method83(!var9.method11(var10, (byte) -82) & !var12.method11(arg0, (byte) 101), !var9.method10(var10, false) & !var12.method10(arg0, !arg1), !this.field455);
        }
        if (var11 == 1) {
            var14.method85();
        } else if (var11 == 2) {
            var14.method103();
        } else if (var11 == 3) {
            var14.method76();
        }
        var14.method77(var9, var10, var12, arg0, arg2 - 1, var7, this.field455);
        if (var11 == 1) {
            var14.method76();
        } else if (var11 == 2) {
            var14.method103();
        } else if (var11 == 3) {
            var14.method85();
        }
        return var14;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLre;I)Ljava/lang/String;")
    public static final String method234(byte arg0, class228 arg1, int arg2) {
        field452++;
        if (!client.method1059(arg1).method1832(arg2, 1) && arg1.field3536 == null) {
            return null;
        } else if (arg0 >= -62) {
            return null;
        } else if (arg1.field3576 == null || arg2 >= arg1.field3576.length || arg1.field3576[arg2] == null || arg1.field3576[arg2].trim().length() == 0) {
            return class170.field2647 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field3576[arg2];
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLai;)V")
    public final void method235(boolean arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method633(120);
            if (var3 == 0) {
                field419++;
                if (arg0) {
                    this.field450 = 76;
                    return;
                }
                return;
            }
            this.method228(arg1, !arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZLai;)Lhk;")
    public static final class127 method236(boolean arg0, class88 arg1) {
        if (arg0) {
            field426++;
            return new class127(arg1.method649(-2), arg1.method649(-2), arg1.method649(-2), arg1.method649(-2), arg1.method671(124), arg1.method671(119), arg1.method633(99));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method237(int arg0) {
        field444 = null;
        field441 = null;
        field456 = null;
        field454 = null;
        int var1 = -93 % ((-arg0 - 27) / 33);
        field430 = null;
        field451 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZZIII)V")
    public static final void method238(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field427++;
        if (!arg3 && class219.field3376 == arg0 && class3.field14 == arg2 && class255.field4081 == arg6 || class191.method1284(-97)) {
            return;
        }
        class219.field3376 = arg0;
        class3.field14 = arg2;
        if (arg5 != -1592) {
            field449 = 123;
        }
        class255.field4081 = arg6;
        if (class191.method1284(arg5 + 1468)) {
            class255.field4081 = 0;
        }
        if (arg4) {
            client.method1042(false, 28);
        } else {
            client.method1042(false, 25);
        }
        class206.method1384(true, class139.field2125, 1);
        int var8 = class260.field4162;
        int var9 = class46.field656;
        class46.field656 = (arg0 - 6) * 8;
        class260.field4162 = arg2 * 8 - 48;
        class114.field1857 = class297.method1980(class3.field14 * 8, class219.field3376 * 8, 111);
        int var10 = class260.field4162 - var8;
        class193.field3005 = null;
        int var11 = class46.field656 - var9;
        int var12 = class46.field656;
        int var13 = class260.field4162;
        if (arg4) {
            class70.field1119 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class45 var15 = class255.field4082[var14];
                if (var15 != null) {
                    var15.field2278 -= var10 * 128;
                    var15.field2240 -= var11 * 128;
                    if (var15.field2240 >= 0 && var15.field2240 <= 13184 && var15.field2278 >= 0 && var15.field2278 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field2268[var16] -= var11;
                            var15.field2271[var16] -= var10;
                        }
                        class284.field4506[class70.field1119++] = var14;
                    } else {
                        class255.field4082[var14].method327(arg5 ^ 0x674, (class60) null);
                        class255.field4082[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class45 var33 = class255.field4082[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field2268[var34] -= var11;
                        var33.field2271[var34] -= var10;
                    }
                    var33.field2278 -= var10 * 128;
                    var33.field2240 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class236 var31 = class210.field3267[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field2268[var32] -= var11;
                    var31.field2271[var32] -= var10;
                }
                var31.field2278 -= var10 * 128;
                var31.field2240 -= var11 * 128;
            }
        }
        class240.field3892 = arg6;
        class283.field4473.method1622(arg7, 0, false, arg1);
        byte var19 = 104;
        byte var20 = 0;
        byte var21 = 1;
        byte var22 = 0;
        if (var11 < 0) {
            var20 = 103;
            var21 = -1;
            var19 = -1;
        }
        byte var23 = 104;
        byte var24 = 1;
        if (var10 < 0) {
            var22 = 103;
            var23 = -1;
            var24 = -1;
        }
        for (int var25 = var20; var25 != var19; var25 += var21) {
            for (int var27 = var22; var27 != var23; var27 += var24) {
                int var28 = var11 + var25;
                int var29 = var10 + var27;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class222.field3411[var30][var25][var27] = class222.field3411[var30][var28][var29];
                    } else {
                        class222.field3411[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class111 var26 = (class111) class187.field2892.method1221(119); var26 != null; var26 = (class111) class187.field2892.method1227(-10626)) {
            var26.field1816 -= var10;
            var26.field1824 -= var11;
            if (var26.field1824 < 0 || var26.field1816 < 0 || var26.field1824 >= 104 || var26.field1816 >= 104) {
                var26.method1123(0);
            }
        }
        class206.field3220 = -1;
        class112.field1841 = 0;
        if (class167.field2620 != 0) {
            class167.field2620 -= var11;
            class130.field2057 -= var10;
        }
        if (arg4) {
            class293.field4624 -= var10 * 128;
            class86.field1434 -= var10;
            class219.field3375 -= var11 * 128;
            class293.field4610 -= var11;
            class128.field2019 -= var10;
            class272.field4366 -= var11;
        } else {
            class259.field4130 = 1;
        }
        class104.field1734.method1226(1);
        class240.field3899.method1226(arg5 + 1593);
    }
}
