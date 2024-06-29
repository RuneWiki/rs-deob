import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class145 extends class89 {

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Lda;")
    public static class275 field2533 = class255.method1672(101, "hitmarks");

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Lda;")
    public static class275 field2536 = class255.method1672(120, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Lda;")
    public static class275 field2539 = class255.method1672(100, "Texturen geladen)3");

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "[Lhc;")
    private class110[] field2534;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    public static void method1033(int arg0) {
        field2536 = null;
        field2533 = null;
        if (arg0 > -33) {
            method1038(false);
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V")
    public static final void method1034(byte arg0, int arg1) {
        ++field2542;
        int var2 = -20 / ((arg0 - 22) / 55);
        if (class267.method1755(0, arg1)) {
            class199.method1306((byte) -88, class173.field3005[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            method1034((byte) -89, 4);
        }
        ++field2535;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int var4 = class65.field1070;
            int var5 = class16.field242;
            int[][][] var6 = super.field1512.method833((byte) 119);
            int[][] var7 = new int[var5][var4];
            this.method1035(-128, var7);
            for (int var8 = 0; var8 < class16.field242; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; ~class65.field1070 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class19.method98(4080, var15 << 4);
                    var11[var14] = class19.method98(4080, var15 >> 4);
                    var13[var14] = class19.method98(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[[I)V")
    private final void method1035(int arg0, int[][] arg1) {
        if (arg0 <= -42) {
            int var3 = class16.field242;
            ++field2547;
            int var4 = class65.field1070;
            class256.method1678(arg1, (byte) 27);
            class211.method1362(0, 0, class1.field11, (byte) -100, class277.field4837);
            if (this.field2534 != null) {
                for (int var5 = 0; ~var5 > ~this.field2534.length; ++var5) {
                    class110 var6 = this.field2534[var5];
                    int var7 = var6.field1951;
                    int var8 = var6.field1942;
                    if (~var7 <= -1) {
                        if (~var8 > -1) {
                            var6.method165(var4, var3, (byte) -53);
                        } else {
                            var6.method164(var4, var3, 32768);
                        }
                    } else if (var8 >= 0) {
                        var6.method162((byte) -62, var4, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2538;
        int[] var3 = super.field1503.method229(arg0, (byte) -60);
        if (arg1) {
            this.method49(38, (class85) null, -100);
        }
        if (super.field1503.field664) {
            this.method1035(-107, super.field1503.method226((byte) -81));
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            field2541 = 24;
        }
        if (arg2 == 0) {
            this.field2534 = new class110[arg1.method564((byte) 102)];
            for (int var4 = 0; var4 < this.field2534.length; ++var4) {
                int var5 = arg1.method564((byte) 103);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field2534[var4] = class14.method67((byte) -63, arg1);
                            }
                        } else {
                            this.field2534[var4] = class237.method1537(0, arg1);
                        }
                    } else {
                        this.field2534[var4] = class173.method1175((byte) 117, arg1);
                    }
                } else {
                    this.field2534[var4] = class210.method1355(-4113, arg1);
                }
            }
        } else if (~arg2 == -2) {
            super.field1508 = arg1.method564((byte) 55) == 1;
        }
        ++field2543;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIII)Z")
    public static final boolean method1036(int arg0, int arg1, int arg2, int arg3) {
        if (!class231.method1498(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class92.field1575[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class123.field2205) {
                        if (!class34.method205(var4, var6, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class34.method205(var4, var7, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class34.method205(var4, var8, var5)) {
                        return false;
                    }
                    if (!class34.method205(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class265.field4617) {
                        if (!class34.method205(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class34.method205(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class34.method205(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class34.method205(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class123.field2205) {
                        if (!class34.method205(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class34.method205(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class34.method205(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class34.method205(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class265.field4617) {
                        if (!class34.method205(var4, var6, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class34.method205(var4, var7, var5)) {
                            return false;
                        }
                        if (!class34.method205(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class34.method205(var4, var8, var5)) {
                        return false;
                    }
                    if (!class34.method205(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class34.method205(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class34.method205(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class34.method205(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class34.method205(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class34.method205(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lma;II)Lwb;")
    public static final class179 method1037(class105 arg0, int arg1, int arg2) {
        if (arg1 != -21861) {
            method1039(-40, (class165) null);
        }
        ++field2537;
        return !class181.method1213((byte) 122, arg0, arg2) ? null : class174.method1181(arg1 + 21861);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static final void method1038(boolean arg0) {
        class173.method1176();
        ++field2540;
        if (arg0) {
            field2536 = null;
        }
        for (int var1 = 0; var1 < 4; ++var1) {
            class173.field3003[var1].method868(21744);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILgd;)V")
    public static final void method1039(int arg0, class165 arg1) {
        if (arg0 != 0) {
            method1039(-75, (class165) null);
        }
        ++field2545;
        for (class249 var2 = (class249) class135.field2387.method550(-32); var2 != null; var2 = (class249) class135.field2387.method545(104)) {
            if (var2.field4384 == arg1) {
                if (var2.field4380 != null) {
                    class258.field4522.method1426(var2.field4380);
                    var2.field4380 = null;
                }
                var2.method741(3);
                return;
            }
        }
    }
}
