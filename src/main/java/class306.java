import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class306 extends class177 {

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lbe;")
    private static class283 field5254 = class153.method941(-70, "flash1:");

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lbe;")
    public static class283 field5248 = class153.method941(125, "Fertigkeit)2");

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lbe;")
    public static class283 field5235 = field5254;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lbe;")
    public static class283 field5249 = field5254;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lbe;")
    private static class283 field5247 = class153.method941(-28, "Allocating memory");

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "Lbe;")
    public static class283 field5260 = field5247;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "Z")
    public static boolean field5253 = false;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "Lbe;")
    public static class283 field5261 = class153.method941(126, "details");

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lpj;")
    public static class171 field5258 = new class171(0, 0);

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "Z")
    public static boolean field5263 = false;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "Lek;")
    public static class172 field5262;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "[I")
    public int[] field5236;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "[I")
    private int[] field5238;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "[Lbe;")
    private class283[] field5252;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "[[I")
    private int[][] field5259;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lfe;B)V", line = 7)
    public final void method2079(class229 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1535((byte) 88);
            if (var3 == 0) {
                field5257++;
                if (arg1 <= 4) {
                    this.method2086((class229) null, 59, 17);
                }
                return;
            }
            this.method2086(arg0, var3, 60);
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V", line = 28)
    public static void method2080(int arg0) {
        field5260 = null;
        field5235 = null;
        field5249 = null;
        field5258 = null;
        field5261 = null;
        if (arg0 > -102) {
            field5255 = -104;
        }
        field5254 = null;
        field5262 = null;
        field5247 = null;
        field5248 = null;
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)I", line = 52)
    public final int method2081(int arg0) {
        if (arg0 >= -50) {
            return -48;
        } else {
            field5251++;
            return this.field5238 == null ? 0 : this.field5238.length;
        }
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V", line = 67)
    public final void method2082(int arg0) {
        if (arg0 != 32768) {
            method2080(-14);
        }
        field5237++;
        if (this.field5236 != null) {
            for (int var2 = 0; var2 < this.field5236.length; var2++) {
                this.field5236[var2] = class53.method337(this.field5236[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[ILfe;)V", line = 103)
    public final void method2083(int arg0, int[] arg1, class229 arg2) {
        field5250++;
        if (this.field5238 == null) {
            return;
        }
        if (arg0 != -4) {
            this.field5252 = (class283[]) null;
        }
        for (int var4 = 0; this.field5238.length > var4 && var4 < arg1.length; var4++) {
            int var5 = class195.field3325[this.method2089(var4, ~arg0)];
            if (var5 > 0) {
                arg2.method1509((long) arg1[var4], false, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lfe;I)Lbe;", line = 130)
    public final class283 method2084(class229 arg0, int arg1) {
        field5239++;
        class283 var3 = class260.method1756((byte) 117, 80);
        if (arg1 <= 63) {
            return (class283) null;
        }
        if (this.field5238 != null) {
            for (int var4 = 0; var4 < this.field5238.length; var4++) {
                var3.method1907(0, this.field5252[var4]);
                var3.method1907(0, class13.method72(false, this.field5259[var4], this.field5238[var4], arg0.method1556(class144.field2380[this.field5238[var4]], 59)));
            }
        }
        var3.method1907(0, this.field5252[this.field5252.length - 1]);
        return var3.method1900((byte) 126);
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)Lbe;", line = 162)
    public final class283 method2085(int arg0) {
        field5256++;
        if (arg0 != 4) {
            field5254 = (class283) null;
        }
        class283 var2 = class260.method1756((byte) 117, 80);
        if (this.field5252 == null) {
            return class104.field1772;
        }
        var2.method1907(arg0 - 4, this.field5252[0]);
        for (int var3 = 1; var3 < this.field5252.length; var3++) {
            var2.method1907(0, class14.field158);
            var2.method1907(0, this.field5252[var3]);
        }
        return var2.method1900((byte) 100);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lfe;II)V", line = 188)
    private final void method2086(class229 arg0, int arg1, int arg2) {
        field5246++;
        if (arg2 != 60) {
            this.method2086((class229) null, -31, -98);
        }
        if (arg1 == 1) {
            this.field5252 = arg0.method1549(true).method1938((byte) 78, 60);
        } else if (arg1 == 2) {
            int var4 = arg0.method1535((byte) 93);
            this.field5236 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5236[var5] = arg0.method1496(true);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1535((byte) 94);
            this.field5238 = new int[var6];
            this.field5259 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1496(true);
                this.field5238[var7] = var8;
                this.field5259[var7] = new int[class75.field1315[var8]];
                for (int var9 = 0; var9 < class75.field1315[var8]; var9++) {
                    this.field5259[var7][var9] = arg0.method1496(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIZIIIILpk;II)V", line = 258)
    public static final void method2087(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8, int arg9, int arg10) {
        field5243++;
        if (arg3 && !class96.method622((byte) 0) && (class252.field4282[0][arg10][arg7] & 0x2) == 0) {
            if ((class252.field4282[arg4][arg10][arg7] & 0x10) != 0) {
                return;
            }
            if (class269.method1817(25694, arg7, arg4, arg10) != class83.field1405) {
                return;
            }
        }
        if (arg4 < class124.field2068) {
            class124.field2068 = arg4;
        }
        class281 var11 = class254.method1722(0, arg2);
        if (var11.field4731) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field4754;
            var12 = var11.field4727;
        } else {
            var12 = var11.field4754;
            var13 = var11.field4727;
        }
        int var14;
        int var15;
        if (arg10 + var13 <= 104) {
            var14 = arg10 + (var13 >> 1);
            var15 = (var13 + 1 >> 1) + arg10;
        } else {
            var15 = arg10 + 1;
            var14 = arg10;
        }
        int var16;
        int var17;
        if (arg7 + var12 > 104) {
            var16 = arg7 + 1;
            var17 = arg7;
        } else {
            var16 = (var12 + 1 >> 1) + arg7;
            var17 = (var12 >> 1) + arg7;
        }
        int[][] var18 = class65.field890[arg6];
        int var19 = (arg7 << 7) + (var12 << 6);
        int var20 = var18[var14][var16] + var18[var14][var17] + var18[var15][var17] + var18[var15][var16] >> 2;
        int var21 = 0;
        int var22 = (arg10 << 7) + (var13 << 6);
        if (arg6 != 0) {
            int[][] var23 = class65.field890[0];
            var21 = var20 - (var23[var14][var17] + var23[var15][var16] + var23[var15][var17] + var23[var14][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg7 | 0x800000 << 7 | arg10 | arg9 << 14 | arg1 << 20);
        if (arg0) {
            var24 = class1.field12[0];
        } else if (arg6 < 3) {
            var24 = class65.field890[arg6 + 1];
        }
        if (var11.field4690 == 0 || arg0) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field4717 == arg5) {
            var25 |= 0x400000L;
        }
        if (var11.field4743) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg2 << 32;
        if (var11.method1883(true)) {
            class134.method832(arg1, var11, (class191) null, arg7, (class60) null, -4, arg4, arg10);
        }
        boolean var29 = !arg0 & var11.field4755;
        if (arg9 == 22) {
            if (class55.field769 || var11.field4690 != 0 || var11.field4742 == 1 || var11.field4707) {
                class7 var77;
                if (var11.field4738 == -1 && var11.field4752 == null) {
                    class201 var76 = var11.method1891(var29, 22, (byte) 87, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                    if (var29) {
                        class212.method1402(var76.field3431, var22, var21, var19);
                    }
                    var77 = var76.field3441;
                } else {
                    var77 = new class163(arg2, 22, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
                }
                class302.method2044(arg4, arg10, arg7, var20, var77, var27, var11.field4703);
                if (var11.field4742 == 1 && arg8 != null) {
                    arg8.method694(arg7, arg5 + 262143, arg10);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class7 var71;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var70 = var11.method1891(var29, 10, (byte) -99, var24, var20, arg3, var19, (class95) null, var18, arg9 == 11 ? arg1 + 4 : arg1, var22);
                if (var29) {
                    class212.method1402(var70.field3431, var22, var21, var19);
                }
                var71 = var70.field3441;
            } else {
                var71 = new class163(arg2, 10, arg9 == 11 ? arg1 + 4 : arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            if (var71 != null) {
                boolean var72 = class53.method338(arg4, arg10, arg7, var20, var13, var12, var71, 0, var27);
                if (var11.field4695 && var72 && arg3) {
                    int var73 = 15;
                    if (var71 instanceof class289) {
                        var73 = ((class289) var71).method1326() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (var73 > class111.field1877[arg4][arg10 + var74][arg7 + var75]) {
                                class111.field1877[arg4][arg10 + var74][arg7 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method697(var12, arg10, var13, var11.field4758, arg7, false);
            }
        } else if (arg9 >= 12) {
            class7 var31;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var30 = var11.method1891(var29, arg9, (byte) -122, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var30.field3431, var22, var21, var19);
                }
                var31 = var30.field3441;
            } else {
                var31 = new class163(arg2, arg9, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class53.method338(arg4, arg10, arg7, var20, 1, 1, var31, 0, var27);
            if (arg3 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg4 > 0) {
                class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 4);
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method697(var12, arg10, var13, var11.field4758, arg7, false);
            }
        } else if (arg9 == 0) {
            class7 var69;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var68 = var11.method1891(var29, 0, (byte) -84, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var68.field3431, var22, var21, var19);
                }
                var69 = var68.field3441;
            } else {
                var69 = new class163(arg2, 0, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class240.method1618(arg4, arg10, arg7, var20, var69, (class7) null, class135.field2276[arg1], 0, var27);
            if (arg3) {
                if (arg1 == 0) {
                    if (var11.field4695) {
                        class111.field1877[arg4][arg10][arg7] = 50;
                        class111.field1877[arg4][arg10][arg7 + 1] = 50;
                    }
                    if (var11.field4746) {
                        class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field4695) {
                        class111.field1877[arg4][arg10][arg7 + 1] = 50;
                        class111.field1877[arg4][arg10 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4746) {
                        class82.field1398[arg4][arg10][arg7 + 1] = class53.method337(class82.field1398[arg4][arg10][arg7 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field4695) {
                        class111.field1877[arg4][arg10 + 1][arg7] = 50;
                        class111.field1877[arg4][arg10 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4746) {
                        class82.field1398[arg4][arg10 + 1][arg7] = class53.method337(class82.field1398[arg4][arg10 + 1][arg7], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field4695) {
                        class111.field1877[arg4][arg10][arg7] = 50;
                        class111.field1877[arg4][arg10 + 1][arg7] = 50;
                    }
                    if (var11.field4746) {
                        class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 2);
                    }
                }
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method689(arg10, arg5 ^ 0xFFFF8D63, var11.field4758, arg7, arg1, arg9);
            }
            if (var11.field4745 != 16) {
                class5.method29(arg4, arg10, arg7, var11.field4745);
            }
        } else if (arg9 == 1) {
            class7 var67;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var66 = var11.method1891(var29, 1, (byte) 122, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var66.field3431, var22, var21, var19);
                }
                var67 = var66.field3441;
            } else {
                var67 = new class163(arg2, 1, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class240.method1618(arg4, arg10, arg7, var20, var67, (class7) null, class263.field4482[arg1], 0, var27);
            if (var11.field4695 && arg3) {
                if (arg1 == 0) {
                    class111.field1877[arg4][arg10][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    class111.field1877[arg4][arg10 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    class111.field1877[arg4][arg10 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    class111.field1877[arg4][arg10][arg7] = 50;
                }
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method689(arg10, -29342, var11.field4758, arg7, arg1, arg9);
            }
        } else if (arg9 == 2) {
            int var61 = arg1 + 1 & 0x3;
            class7 var63;
            class7 var65;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var62 = var11.method1891(var29, 2, (byte) 90, var24, var20, arg3, var19, (class95) null, var18, arg1 + 4, var22);
                if (var29) {
                    class212.method1402(var62.field3431, var22, var21, var19);
                }
                var63 = var62.field3441;
                class201 var64 = var11.method1891(var29, 2, (byte) 55, var24, var20, arg3, var19, (class95) null, var18, var61, var22);
                if (var29) {
                    class212.method1402(var64.field3431, var22, var21, var19);
                }
                var65 = var64.field3441;
            } else {
                var63 = new class163(arg2, 2, arg1 + 4, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
                var65 = new class163(arg2, 2, var61, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class240.method1618(arg4, arg10, arg7, var20, var63, var65, class135.field2276[arg1], class135.field2276[var61], var27);
            if (var11.field4746 && arg3) {
                if (arg1 == 0) {
                    class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 1);
                    class82.field1398[arg4][arg10][arg7 + 1] = class53.method337(class82.field1398[arg4][arg10][arg7 + 1], 2);
                } else if (arg1 == 1) {
                    class82.field1398[arg4][arg10][arg7 + 1] = class53.method337(class82.field1398[arg4][arg10][arg7 + 1], 2);
                    class82.field1398[arg4][arg10 + 1][arg7] = class53.method337(class82.field1398[arg4][arg10 + 1][arg7], 1);
                } else if (arg1 == 2) {
                    class82.field1398[arg4][arg10 + 1][arg7] = class53.method337(class82.field1398[arg4][arg10 + 1][arg7], 1);
                    class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 2);
                } else if (arg1 == 3) {
                    class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 2);
                    class82.field1398[arg4][arg10][arg7] = class53.method337(class82.field1398[arg4][arg10][arg7], 1);
                }
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method689(arg10, -29342, var11.field4758, arg7, arg1, arg9);
            }
            if (var11.field4745 != 16) {
                class5.method29(arg4, arg10, arg7, var11.field4745);
            }
        } else if (arg9 == 3) {
            class7 var33;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var32 = var11.method1891(var29, 3, (byte) -85, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var32.field3431, var22, var21, var19);
                }
                var33 = var32.field3441;
            } else {
                var33 = new class163(arg2, 3, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class240.method1618(arg4, arg10, arg7, var20, var33, (class7) null, class263.field4482[arg1], 0, var27);
            if (var11.field4695 && arg3) {
                if (arg1 == 0) {
                    class111.field1877[arg4][arg10][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    class111.field1877[arg4][arg10 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    class111.field1877[arg4][arg10 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    class111.field1877[arg4][arg10][arg7] = 50;
                }
            }
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method689(arg10, arg5 - 29343, var11.field4758, arg7, arg1, arg9);
            }
        } else if (arg9 == 9) {
            class7 var35;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var34 = var11.method1891(var29, arg9, (byte) -83, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var34.field3431, var22, var21, var19);
                }
                var35 = var34.field3441;
            } else {
                var35 = new class163(arg2, arg9, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class53.method338(arg4, arg10, arg7, var20, 1, 1, var35, 0, var27);
            if (var11.field4742 != 0 && arg8 != null) {
                arg8.method697(var12, arg10, var13, var11.field4758, arg7, false);
            }
            if (var11.field4745 != 16) {
                class5.method29(arg4, arg10, arg7, var11.field4745);
            }
        } else if (arg9 == 4) {
            class7 var37;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var36 = var11.method1891(var29, 4, (byte) 121, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var36.field3431, var22, var21, var19);
                }
                var37 = var36.field3441;
            } else {
                var37 = new class163(arg2, 4, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class280.method1868(arg4, arg10, arg7, var20, var37, (class7) null, class135.field2276[arg1], 0, 0, 0, var27);
        } else if (arg9 == 5) {
            int var56 = 16;
            long var57 = class288.method1972(arg4, arg10, arg7);
            if (var57 != 0L) {
                var56 = class254.method1722(arg5 - 1, Integer.MAX_VALUE & (int) (var57 >>> 32)).field4745;
            }
            class7 var60;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var59 = var11.method1891(var29, 4, (byte) 122, var24, var20, arg3, var19, (class95) null, var18, arg1, var22);
                if (var29) {
                    class212.method1402(var59.field3431, var22 - (class210.field3581[arg1] * 8), var21, var19 - (class99.field1674[arg1] * 8));
                }
                var60 = var59.field3441;
            } else {
                var60 = new class163(arg2, 4, arg1, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class280.method1868(arg4, arg10, arg7, var20, var60, (class7) null, class135.field2276[arg1], 0, class210.field3581[arg1] * var56, class99.field1674[arg1] * var56, var27);
        } else if (arg9 == 6) {
            int var51 = 8;
            long var52 = class288.method1972(arg4, arg10, arg7);
            if (var52 != 0L) {
                var51 = class254.method1722(0, (int) (var52 >>> 32) & Integer.MAX_VALUE).field4745 / 2;
            }
            class7 var55;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var54 = var11.method1891(var29, 4, (byte) -60, var24, var20, arg3, var19, (class95) null, var18, arg1 + 4, var22);
                if (var29) {
                    class212.method1402(var54.field3431, var22 - (class190.field3241[arg1] * 8), var21, var19 - class283.field4845[arg1] * 8);
                }
                var55 = var54.field3441;
            } else {
                var55 = new class163(arg2, 4, arg1 + 4, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class280.method1868(arg4, arg10, arg7, var20, var55, (class7) null, 256, arg1, class190.field3241[arg1] * var51, class283.field4845[arg1] * var51, var27);
        } else if (arg9 == 7) {
            int var48 = arg1 + 2 & 0x3;
            class7 var50;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                class201 var49 = var11.method1891(var29, 4, (byte) -66, var24, var20, arg3, var19, (class95) null, var18, var48 + 4, var22);
                if (var29) {
                    class212.method1402(var49.field3431, var22, var21, var19);
                }
                var50 = var49.field3441;
            } else {
                var50 = new class163(arg2, 4, var48 + 4, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class280.method1868(arg4, arg10, arg7, var20, var50, (class7) null, 256, var48, 0, 0, var27);
        } else if (arg9 == 8) {
            int var38 = 8;
            long var39 = class288.method1972(arg4, arg10, arg7);
            if (var39 != 0L) {
                var38 = class254.method1722(0, (int) (var39 >>> 32) & Integer.MAX_VALUE).field4745 / 2;
            }
            int var41 = arg1 + 2 & 0x3;
            class7 var45;
            class7 var47;
            if (var11.field4738 == -1 && var11.field4752 == null) {
                int var42 = class190.field3241[arg1] * 8;
                int var43 = class283.field4845[arg1] * 8;
                class201 var44 = var11.method1891(var29, 4, (byte) -122, var24, var20, arg3, var19, (class95) null, var18, arg1 + 4, var22);
                if (var29) {
                    class212.method1402(var44.field3431, var22 - var42, var21, var19 - var43);
                }
                var45 = var44.field3441;
                class201 var46 = var11.method1891(var29, 4, (byte) -80, var24, var20, arg3, var19, (class95) null, var18, var41 + 4, var22);
                if (var29) {
                    class212.method1402(var46.field3431, var22 - var42, var21, var19 - var43);
                }
                var47 = var46.field3441;
            } else {
                var45 = new class163(arg2, 4, arg1 + 4, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
                var47 = new class163(arg2, 4, var41 + 4, arg6, arg10, arg7, var11.field4738, var11.field4718, (class7) null);
            }
            class280.method1868(arg4, arg10, arg7, var20, var45, var47, 256, arg1, class190.field3241[arg1] * var38, class283.field4845[arg1] * var38, var27);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)I", line = 907)
    public final int method2088(int arg0, int arg1, int arg2) {
        field5245++;
        if (this.field5238 == null || arg0 < 0 || this.field5238.length < arg0) {
            return -1;
        } else if (this.field5259[arg0] == null || arg1 < 0 || arg1 > this.field5259[arg0].length) {
            return -1;
        } else {
            if (arg2 != 0) {
                this.field5238 = (int[]) null;
            }
            return this.field5259[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I", line = 938)
    public final int method2089(int arg0, int arg1) {
        if (arg1 == 3) {
            field5240++;
            return this.field5238 == null || arg0 < 0 || arg0 > this.field5238.length ? -1 : this.field5238[arg0];
        } else {
            return 94;
        }
    }
}
