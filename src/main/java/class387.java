import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 {

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "Lrt;")
    private class151 field5734 = null;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "Z")
    private boolean field5718;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "Loi;")
    private class52 field5729;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field5726 = 0;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "Lok;")
    public static class167 field5733;

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "Lgt;")
    public static class316 field5731;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "[Ljava/lang/Object;")
    private Object[] field5730;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5700;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z", line = 4)
    private final boolean method2356(boolean arg0) {
        field5723++;
        if (this.field5734 == null) {
            this.field5734 = this.field5729.method515((byte) -118);
            if (this.field5734 == null) {
                return false;
            }
            this.field5730 = new Object[this.field5734.field2138];
            this.field5700 = new Object[this.field5734.field2138][];
        }
        if (!arg0) {
            this.method2377(73);
        }
        return true;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)Z", line = 28)
    public final boolean method2357(int arg0, byte arg1, int arg2) {
        if (arg1 != -124) {
            this.method2363(-38, 90, -33);
        }
        field5714++;
        if (!this.method2386((byte) -99, arg2, arg0)) {
            return false;
        } else if (this.field5700[arg2] != null && this.field5700[arg2][arg0] != null) {
            return true;
        } else if (this.field5730[arg2] == null) {
            this.method2378(0, arg2);
            return this.field5730[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 56)
    public final int method2358(String arg0, byte arg1) {
        field5719++;
        if (this.method2356(true)) {
            int var3 = -113 / ((-arg1 - 19) / 57);
            String var4 = arg0.toLowerCase();
            int var5 = this.field5734.field2137.method225(109, class494.method2960(true, var4));
            return this.method2365(var5, -2) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I", line = 91)
    public final int method2359(byte arg0) {
        field5721++;
        if (arg0 == 39) {
            return this.method2356(true) ? this.field5734.field2148.length : -1;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Z", line = 114)
    public final boolean method2360(int arg0, int arg1) {
        field5701++;
        if (!this.method2365(arg0, arg1 ^ 0xFFFFFDD3)) {
            return false;
        } else if (this.field5730[arg0] == null) {
            this.method2378(arg1 ^ arg1, arg0);
            return this.field5730[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 133)
    public final void method2361(byte arg0) {
        if (arg0 <= 122) {
            return;
        }
        if (this.field5730 != null) {
            for (int var2 = 0; var2 < this.field5730.length; var2++) {
                this.field5730[var2] = null;
            }
        }
        field5711++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 155)
    public final boolean method2362(int arg0, String arg1) {
        field5717++;
        if (!this.method2356(true)) {
            return false;
        } else if (arg0 == -1) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field5734.field2137.method225(109, class494.method2960(true, var3));
            return this.method2360(var4, 557);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)[B", line = 175)
    public final byte[] method2363(int arg0, int arg1, int arg2) {
        field5704++;
        if (arg2 <= 83) {
            this.method2368(null, false, null);
        }
        return this.method2380(arg1, arg0, null, (byte) -62);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I", line = 186)
    private final int method2364(int arg0, int arg1) {
        int var3 = 99 % ((arg0 - 59) / 36);
        field5708++;
        if (this.method2365(arg1, -2)) {
            return this.field5730[arg1] == null ? this.field5729.method516(arg1, (byte) 119) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(II)Z", line = 205)
    private final boolean method2365(int arg0, int arg1) {
        field5725++;
        if (arg1 != -2) {
            this.field5729 = null;
        }
        if (!this.method2356(true)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field5734.field2148.length && this.field5734.field2148[arg0] != 0) {
            return true;
        } else if (class407.field6068) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 229)
    public final boolean method2366(String arg0, int arg1) {
        field5715++;
        if (!this.method2356(true)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field5734.field2137.method225(109, class494.method2960(true, var3));
        if (var4 < 0) {
            return false;
        } else {
            if (arg1 != -1) {
                this.method2361((byte) 81);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(II)I", line = 250)
    public final int method2367(int arg0, int arg1) {
        if (arg1 != 28724) {
            this.field5734 = null;
        }
        field5735++;
        return this.method2365(arg0, -2) ? this.field5734.field2148[arg0] : 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B", line = 271)
    public final byte[] method2368(String arg0, boolean arg1, String arg2) {
        field5727++;
        if (!this.method2356(true)) {
            return null;
        }
        if (arg1) {
            this.field5730 = null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field5734.field2137.method225(109, class494.method2960(true, var4));
        if (this.method2365(var6, -2)) {
            int var7 = this.field5734.field2141[var6].method225(109, class494.method2960(true, var5));
            return this.method2363(var7, var6, 125);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 299)
    public static void method2369(int arg0) {
        field5733 = null;
        if (arg0 >= 83) {
            field5731 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)I", line = 312)
    public final int method2370(byte arg0) {
        if (arg0 != -23) {
            return 60;
        }
        field5716++;
        if (!this.method2356(true)) {
            throw new IllegalStateException("");
        }
        return this.field5734.field2136;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)I", line = 327)
    public final int method2371(boolean arg0) {
        if (arg0) {
            return 16;
        }
        field5720++;
        if (!this.method2356(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5730.length; var4++) {
            if (this.field5734.field2126[var4] > 0) {
                var2 += 100;
                var3 += this.method2364(123, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 368)
    public final int method2372(String arg0, byte arg1) {
        field5710++;
        if (!this.method2356(true)) {
            return 0;
        } else if (arg1 == 33) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5734.field2137.method225(109, class494.method2960(true, var3));
            return this.method2364(-79, var4);
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III[I)Z", line = 388)
    private final boolean method2373(int arg0, int arg1, int arg2, int[] arg3) {
        field5722++;
        if (!this.method2365(arg0, -2)) {
            return false;
        } else if (this.field5730[arg0] == null) {
            return false;
        } else {
            int var5 = this.field5734.field2126[arg0];
            int[] var6 = this.field5734.field2133[arg0];
            if (this.field5700[arg0] == null) {
                this.field5700[arg0] = new Object[this.field5734.field2148[arg0]];
            }
            Object[] var7 = this.field5700[arg0];
            boolean var8 = true;
            for (int var9 = arg1; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class186.method1303(false, (byte) 87, this.field5730[arg0]);
            } else {
                var11 = class186.method1303(true, (byte) 114, this.field5730[arg0]);
                class65 var12 = new class65(var11);
                var12.method631(5, var12.field783.length, -65, arg3);
            }
            byte[] var13;
            try {
                var13 = class251.method1633(var11, false);
            } catch (RuntimeException var49) {
                throw class233.method1566(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class24.method202((byte) 37, var11.length, var11) + "," + class24.method202((byte) -95, var11.length - 2, var11) + "," + this.field5734.field2130[arg0] + "," + this.field5734.field2136);
            }
            if (this.field5718) {
                this.field5730[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field5709 == 0) {
                    var7[var48] = class351.method2110((byte) 109, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field5709 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class65 var18 = new class65(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field827 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method616((byte) 80);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg2 == var24) {
                            var19 += var22;
                            var20 = var24;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field827 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method616((byte) 102);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg2 == var31) {
                            class201.method1412(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class65 var35 = new class65(var13);
                int[] var36 = new int[var5];
                var35.field827 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method616((byte) 120);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field827 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method616((byte) 77);
                        class201.method1412(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field5709 == 0) {
                        var7[var47] = class351.method2110((byte) 109, false, var40[var46]);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(II)V", line = 672)
    public final void method2374(int arg0, int arg1) {
        field5698++;
        if (arg0 != -1) {
            this.method2371(false);
        }
        if (this.method2365(arg1, -2) && this.field5700 != null) {
            this.field5700[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z", line = 690)
    public final boolean method2375(int arg0) {
        field5713++;
        if (!this.method2356(true)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field5734.field2135.length; var3++) {
            int var4 = this.field5734.field2135[var3];
            if (this.field5730[var4] == null) {
                this.method2378(0, var4);
                if (this.field5730[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(II)I", line = 725)
    public final int method2376(int arg0, int arg1) {
        field5705++;
        if (!this.method2356(true)) {
            return -1;
        }
        int var3 = this.field5734.field2137.method225(109, arg1);
        if (arg0 != -14943) {
            this.method2377(-55);
        }
        return this.method2365(var3, -2) ? var3 : -1;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 749)
    public final void method2377(int arg0) {
        field5732++;
        if (arg0 == 0 && this.field5700 != null) {
            for (int var2 = 0; var2 < this.field5700.length; var2++) {
                this.field5700[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(II)V", line = 774)
    private final void method2378(int arg0, int arg1) {
        if (this.field5718) {
            this.field5730[arg1] = this.field5729.method517(73, arg1);
        } else {
            this.field5730[arg1] = class351.method2110((byte) 109, false, this.field5729.method517(class429.method2613(arg0, 122), arg1));
        }
        if (arg0 != 0) {
            this.field5734 = null;
        }
        field5737++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V", line = 790)
    private final void method2379(byte arg0, int arg1) {
        field5712++;
        if (arg0 <= 55) {
            this.method2361((byte) 26);
        }
        this.field5729.method513(arg1, 0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II[IB)[B", line = 801)
    public final byte[] method2380(int arg0, int arg1, int[] arg2, byte arg3) {
        field5707++;
        if (!this.method2386((byte) -99, arg0, arg1)) {
            return null;
        }
        if (this.field5700[arg0] == null || this.field5700[arg0][arg1] == null) {
            boolean var5 = this.method2373(arg0, 0, arg1, arg2);
            if (!var5) {
                this.method2378(0, arg0);
                boolean var6 = this.method2373(arg0, 0, arg1, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class186.method1303(false, (byte) 82, this.field5700[arg0][arg1]);
        if (arg3 >= -49) {
            this.field5734 = null;
        }
        if (this.field5709 == 1) {
            this.field5700[arg0][arg1] = null;
            if (this.field5734.field2148[arg0] == 1) {
                this.field5700[arg0] = null;
            }
        } else if (this.field5709 == 2) {
            this.field5700[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "(II)[B", line = 861)
    public final byte[] method2381(int arg0, int arg1) {
        field5724++;
        if (!this.method2356(true)) {
            return null;
        } else if (this.field5734.field2148.length == 1) {
            return this.method2363(arg0, 0, 95);
        } else if (!this.method2365(arg0, arg1 + arg1)) {
            return null;
        } else if (this.field5734.field2148[arg0] == 1) {
            return this.method2363(0, arg0, 94);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 888)
    public final boolean method2382(int arg0, String arg1, String arg2) {
        field5728++;
        if (arg0 != 0) {
            this.method2380(-27, -13, null, (byte) 22);
        }
        if (!this.method2356(true)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field5734.field2137.method225(109, class494.method2960(true, var4));
        if (this.method2365(var6, -2)) {
            int var7 = this.field5734.field2141[var6].method225(109, class494.method2960(true, var5));
            return this.method2357(var7, (byte) -124, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "(II)[I", line = 914)
    public final int[] method2383(int arg0, int arg1) {
        field5736++;
        if (arg0 != 16947) {
            this.method2368(null, false, null);
        }
        if (!this.method2365(arg1, -2)) {
            return null;
        }
        int[] var3 = this.field5734.field2133[arg1];
        if (var3 == null) {
            var3 = new int[this.field5734.field2126[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "(II)Z", line = 944)
    public final boolean method2384(int arg0, int arg1) {
        field5702++;
        if (!this.method2356(true)) {
            return false;
        } else if (arg0 != -1) {
            return true;
        } else if (this.field5734.field2148.length == 1) {
            return this.method2357(arg1, (byte) -124, 0);
        } else if (!this.method2365(arg1, -2)) {
            return false;
        } else if (this.field5734.field2148[arg1] == 1) {
            return this.method2357(0, (byte) -124, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILjava/lang/String;)V", line = 976)
    public final void method2385(int arg0, String arg1) {
        field5699++;
        if (!this.method2356(true)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 100) {
            this.field5729 = null;
        }
        int var4 = this.field5734.field2137.method225(arg0 + 9, class494.method2960(true, var3));
        this.method2379((byte) 115, var4);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)Z", line = 996)
    private final boolean method2386(byte arg0, int arg1, int arg2) {
        field5703++;
        if (!this.method2356(true)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field5734.field2148.length > arg1 && this.field5734.field2148[arg1] > arg2) {
            return arg0 == -99;
        } else if (class407.field6068) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZ)V", line = 1021)
    public final void method2387(boolean arg0, int arg1, boolean arg2) {
        field5706++;
        if (arg1 != 4) {
            this.method2373(116, -55, 0, null);
        }
        if (!this.method2356(true)) {
            return;
        }
        if (arg2) {
            this.field5734.field2134 = null;
            this.field5734.field2141 = null;
        }
        if (arg0) {
            this.field5734.field2142 = null;
            this.field5734.field2137 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Loi;ZI)V", line = 1049)
    public class387(class52 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field5709 = arg2;
        this.field5718 = arg1;
        this.field5729 = arg0;
    }
}
