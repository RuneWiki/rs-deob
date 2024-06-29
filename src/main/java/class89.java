import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 extends class129 {

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public int field2282 = 99;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public int field2283 = -1;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public int field2281 = -1;

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "Z")
    public boolean field2292 = false;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public int field2280 = -1;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    public int field2286 = -1;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public int field2268 = 2;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public int field2273 = 5;

    @OriginalMember(owner = "client!oe", name = "tb", descriptor = "I")
    public int field2296 = -1;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lv;")
    public static class122 field2285 = class55.method425(-84, "");

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "[Lkd;")
    public static class64[] field2291 = new class64[2048];

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Lv;")
    public static class122 field2270 = class55.method425(-95, "@whi@");

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lv;")
    public static class122 field2288 = class55.method425(-63, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!oe", name = "rb", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!oe", name = "sb", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!oe", name = "ub", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!oe", name = "vb", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!oe", name = "yb", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[I")
    public static int[] field2271;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[I")
    public static int[] field2274;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "[I")
    private int[] field2275;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "[I")
    public int[] field2287;

    @OriginalMember(owner = "client!oe", name = "wb", descriptor = "[I")
    public int[] field2299;

    @OriginalMember(owner = "client!oe", name = "xb", descriptor = "[I")
    private int[] field2300;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLkd;)V", line = 5)
    public final void method698(byte arg0, class64 arg1) {
        field2294++;
        while (true) {
            int var3 = arg1.method520(-106);
            if (var3 == 0) {
                if (arg0 == 25) {
                    return;
                } else {
                    this.method698((byte) -29, null);
                    return;
                }
            }
            this.method703(arg1, (byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZLlb;)Llb;", line = 27)
    public final class68 method699(int arg0, int arg1, boolean arg2, class68 arg3) {
        int var5 = this.field2299[arg0];
        field2284++;
        class118 var6 = class30.method281(var5 >> 16, (byte) -34);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method545(true);
        }
        int var8 = arg1 & 0x3;
        class68 var9 = arg3.method545(!var6.method902(var7, (byte) -118));
        if (var8 == 1) {
            var9.method566();
        } else if (var8 == 2) {
            var9.method561();
        } else if (var8 == 3) {
            var9.method555();
        }
        var9.method539(var6, var7);
        if (arg2) {
            return null;
        }
        if (var8 == 1) {
            var9.method555();
        } else if (var8 == 2) {
            var9.method561();
        } else if (var8 == 3) {
            var9.method566();
        }
        return var9;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I", line = 80)
    public static final int method700(int arg0, int arg1, int arg2) {
        int var3 = 34 / ((64 - arg0) / 35);
        field2298++;
        int var4 = class127.method1003(arg2 + 45365, 38, 4, arg1 + 91923) + (class127.method1003(arg2 + 10294, 118, 2, arg1 + 37821) + -128 >> 1) + (class127.method1003(arg2, 117, 1, arg1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llb;II)Llb;", line = 108)
    public final class68 method701(class68 arg0, int arg1, int arg2) {
        field2289++;
        if (arg2 > -127) {
            method700(33, 14, -106);
        }
        int var4 = this.field2299[arg1];
        class118 var5 = class30.method281(var4 >> 16, (byte) -34);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method546(true);
        } else {
            class68 var7 = arg0.method546(!var5.method902(var6, (byte) 119));
            var7.method539(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 138)
    public static final void method702(byte arg0) {
        class1.field31 = true;
        class109.field2703 = true;
        field2297++;
        if (arg0 > -65) {
            field2270 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lkd;BI)V", line = 154)
    private final void method703(class64 arg0, byte arg1, int arg2) {
        if (arg1 != -51) {
            method709(35, 8, 118, 45, -34, 37);
        }
        if (arg2 == 1) {
            int var9 = arg0.method520(arg1 - 75);
            this.field2287 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2287[var10] = arg0.method506((byte) -90);
            }
            this.field2299 = new int[var9];
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2299[var11] = arg0.method506((byte) -90);
            }
            for (int var12 = 0; var12 < var9; var12++) {
                this.field2299[var12] = (arg0.method506((byte) -90) << 16) + this.field2299[var12];
            }
        } else if (arg2 == 2) {
            this.field2283 = arg0.method506((byte) -90);
        } else if (arg2 == 3) {
            int var7 = arg0.method520(arg1 - 62);
            this.field2300 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2300[var8] = arg0.method520(-123);
            }
            this.field2300[var7] = 9999999;
        } else if (arg2 == 4) {
            this.field2292 = true;
        } else if (arg2 == 5) {
            this.field2273 = arg0.method520(arg1 ^ 0x48);
        } else if (arg2 == 6) {
            this.field2280 = arg0.method506((byte) -90);
        } else if (arg2 == 7) {
            this.field2296 = arg0.method506((byte) -90);
        } else if (arg2 == 8) {
            this.field2282 = arg0.method520(arg1 ^ 0x43);
        } else if (arg2 == 9) {
            this.field2286 = arg0.method520(arg1 - 70);
        } else if (arg2 == 10) {
            this.field2281 = arg0.method520(arg1 - 55);
        } else if (arg2 == 11) {
            this.field2268 = arg0.method520(-114);
        } else if (arg2 == 12) {
            int var4 = arg0.method520(arg1 ^ 0x47);
            this.field2275 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2275[var5] = arg0.method506((byte) -90);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2275[var6] = (arg0.method506((byte) -90) << 16) + this.field2275[var6];
            }
        }
        field2293++;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 286)
    public static final void method704(int arg0) {
        if (arg0 == 2) {
            field2272++;
            class81.field2103.method434((byte) -76);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llb;IB)Llb;", line = 322)
    public final class68 method705(class68 arg0, int arg1, byte arg2) {
        int var4 = this.field2299[arg1];
        field2301++;
        class118 var5 = class30.method281(var4 >> 16, (byte) -34);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method545(true);
        }
        class118 var7 = null;
        int var8 = 0;
        if (this.field2275 != null && this.field2275.length > arg1) {
            int var9 = this.field2275[arg1];
            var7 = class30.method281(var9 >> 16, (byte) -34);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class68 var12 = arg0.method545(!var5.method902(var6, (byte) -63));
            var12.method539(var5, var6);
            return var12;
        }
        class68 var10 = arg0.method545(!var5.method902(var6, (byte) 119) & !var7.method902(var8, (byte) 127));
        var10.method539(var5, var6);
        int var11 = 80 / ((arg2 - 53) / 34);
        var10.method539(var7, var8);
        return var10;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V", line = 367)
    public final void method706(int arg0) {
        field2295++;
        if (this.field2281 == -1) {
            if (this.field2300 == null) {
                this.field2281 = 0;
            } else {
                this.field2281 = 2;
            }
        }
        if (this.field2286 == -1) {
            if (this.field2300 == null) {
                this.field2286 = 0;
            } else {
                this.field2286 = 2;
            }
        }
        if (arg0 != 1230520976) {
            this.field2292 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILoe;Llb;I)Llb;", line = 399)
    public final class68 method707(int arg0, int arg1, class89 arg2, class68 arg3, int arg4) {
        field2276++;
        int var6 = this.field2299[arg0];
        class118 var7 = class30.method281(var6 >> 16, (byte) -34);
        int var8 = var6 & 0xFFFF;
        if (arg4 != 9149) {
            this.method703(null, (byte) 13, 22);
        }
        if (var7 == null) {
            return arg2.method710(arg3, (byte) 77, arg1);
        }
        int var9 = arg2.field2299[arg1];
        class118 var10 = class30.method281(var9 >> 16, (byte) -34);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class68 var12 = arg3.method545(!var7.method902(var8, (byte) 119));
            var12.method539(var7, var8);
            return var12;
        } else {
            class68 var13 = arg3.method545(!var7.method902(var8, (byte) 123) & !var10.method902(var11, (byte) -118));
            var13.method547(var7, var8, var10, var11, this.field2300);
            return var13;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 438)
    public static final void method708(boolean arg0) {
        if (!arg0) {
            field2271 = null;
        }
        field2279++;
        if (class103.field2543 != null) {
            class103.field2543.method229();
            class103.field2543 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V", line = 464)
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -5461) {
            return;
        }
        field2290++;
        int var6 = class90.field2306.method47(arg0, arg1, arg3);
        if (var6 != 0) {
            int var7 = class90.field2306.method22(arg0, arg1, arg3, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int var10 = arg4;
            if (var6 > 0) {
                var10 = arg5;
            }
            int[] var11 = class119.field2886.field3023;
            int var12 = (52736 - arg3 * 512) * 4 + arg1 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class42 var14 = class14.method124((byte) 52, var13);
            if (var14.field1085 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 1024 + 3] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class3 var15 = class119.field2901[var14.field1085];
                if (var15 != null) {
                    int var16 = (var14.field1080 * 4 - var15.field93) / 2;
                    int var17 = (var14.field1090 * 4 - var15.field99) / 2;
                    var15.method63(arg1 * 4 + var17 + 48, 48 - -((-var14.field1080 + -arg3 + 104) * 4) + var16);
                }
            }
        }
        int var18 = class90.field2306.method26(arg0, arg1, arg3);
        if (var18 != 0) {
            int var19 = class90.field2306.method22(arg0, arg1, arg3, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class42 var23 = class14.method124((byte) 52, var22);
            if (var23.field1085 != -1) {
                class3 var27 = class119.field2901[var23.field1085];
                if (var27 != null) {
                    int var28 = (var23.field1090 * 4 - var27.field99) / 2;
                    int var29 = (var23.field1080 * 4 - var27.field93) / 2;
                    var27.method63(arg1 * 4 + var28 + 48, (-arg3 + 104 + -var23.field1080) * 4 + var29 + 48);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var25 = class119.field2886.field3023;
                int var26 = (103 - arg3) * 2048 + arg1 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1025] = var24;
                    var25[var26 + 2 + 512] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 512 + 1] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 1536 + 3] = var24;
                }
            }
        }
        int var30 = class90.field2306.method3(arg0, arg1, arg3);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class42 var32 = class14.method124((byte) 52, var31);
        if (var32.field1085 == -1) {
            return;
        }
        class3 var33 = class119.field2901[var32.field1085];
        if (var33 != null) {
            int var34 = (var32.field1090 * 4 - var33.field99) / 2;
            int var35 = (var32.field1080 * 4 - var33.field93) / 2;
            var33.method63(arg1 * 4 + var34 + 48, (-arg3 + 104 + -var32.field1080) * 4 + var35 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llb;BI)Llb;", line = 724)
    public final class68 method710(class68 arg0, byte arg1, int arg2) {
        field2278++;
        int var4 = -42 / ((arg1 + 45) / 32);
        int var5 = this.field2299[arg2];
        class118 var6 = class30.method281(var5 >> 16, (byte) -34);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method545(true);
        } else {
            class68 var8 = arg0.method545(!var6.method902(var7, (byte) -82));
            var8.method539(var6, var7);
            return var8;
        }
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V", line = 747)
    public static void method711(int arg0) {
        field2270 = null;
        field2288 = null;
        field2271 = null;
        field2285 = null;
        field2291 = null;
        field2274 = null;
        int var1 = 61 / ((arg0 + 74) / 45);
    }
}
