import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class166 extends class288 {

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    private int field2703 = 4096;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2702 = "Loading sprites - ";

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2706 = null;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lfh;")
    public static class178 field2709 = new class178(5000);

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Ljj;")
    public static class134 field2714;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2703 = arg0.method1777(arg1 ^ 63);
        }
        if (arg1 != -19) {
            method1162((class134) null, 29, (byte) 112);
        }
        ++field2711;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field2710;
        if (arg0 != 0) {
            method1159(112, 118);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -121, 0, arg1 - 1 & class144.field2332);
            int[] var5 = this.method1931((byte) -126, 0, arg1);
            int[] var6 = this.method1931((byte) -117, 0, class144.field2332 & arg1 + 1);
            for (int var7 = 0; ~class186.field2986 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2703;
                int var9 = (var5[class34.field422 & var7 + 1] + -var5[class34.field422 & var7 + -1]) * this.field2703;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 - -var13 + 4096) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        ++field2712;
        for (int var1 = -1; ~class70.field969 < ~var1; ++var1) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class51.field721[var1];
            }
            class235 var4 = class260.field4141[var3];
            if (var4 != null) {
                class267.method1809(var4, var4.method385((byte) -86), (byte) 123);
            }
        }
        int var2 = -107 % ((arg0 - -81) / 43);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Lch;")
    public static final class125 method1159(int arg0, int arg1) {
        ++field2708;
        if (arg0 >= -112) {
            field2702 = null;
        }
        return (class125) class102.field1538.method457((long) arg1, (byte) -115);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILhi;)V")
    public static final void method1160(int arg0, class264 arg1) {
        ++field2705;
        int var2 = 117 % ((arg0 - -72) / 38);
        while (true) {
            while (arg1.field4195 < arg1.field4198.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (~arg1.method1779(-90) == -2) {
                    var3 = true;
                    var4 = arg1.method1779(-86);
                    var5 = arg1.method1779(-76);
                }
                int var6 = arg1.method1779(-59);
                int var7 = arg1.method1779(-84);
                int var8 = var6 * 64 - class129.field2149;
                int var9 = class225.field3569 - (-class73.field1002 + 1) - var7 * 64;
                if (var8 >= 0 && ~(var9 + -63) <= -1 && var8 - -63 < class183.field2927 && ~class225.field3569 < ~var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; ~var12 > -65; ++var12) {
                        for (int var13 = 0; var13 < 64; ++var13) {
                            if (!var3 || var4 * 8 <= var12 && var4 * 8 + 8 > var12 && ~var13 <= ~(var5 * 8) && var13 < var5 * 8 + 8) {
                                int var14 = arg1.method1779(-79);
                                if (var14 != 0) {
                                    if (~(var14 & 1) == -2) {
                                        int var15 = arg1.method1779(-73);
                                        if (class233.field3701[var10][var11] == null) {
                                            class233.field3701[var10][var11] = new byte[4096];
                                        }
                                        class233.field3701[var10][var11][(-var13 + 63 << 6) + var12] = (byte) var15;
                                    }
                                    if ((2 & var14) == 2) {
                                        int var16 = arg1.method1732(-101);
                                        if (class46.field559[var10][var11] == null) {
                                            class46.field559[var10][var11] = new int[4096];
                                        }
                                        class46.field559[var10][var11][(-var13 + 63 << 6) - -var12] = var16;
                                    }
                                    if ((var14 & 4) == 4) {
                                        int var17 = arg1.method1732(121);
                                        if (class22.field279[var10][var11] == null) {
                                            class22.field279[var10][var11] = new int[4096];
                                        }
                                        --var17;
                                        class94 var18 = class119.method842(127, var17);
                                        if (var18.field1345 != null) {
                                            var18 = var18.method658(3834);
                                            if (var18 == null || var18.field1337 == -1) {
                                                continue;
                                            }
                                        }
                                        class22.field279[var10][var11][(-var13 + 63 << 6) + var12] = var18.field1388 + 1;
                                        class22 var19 = new class22();
                                        var19.field278 = var8;
                                        var19.field273 = var9;
                                        var19.field275 = var18.field1337;
                                        class295.field4666.method363(-119, var19);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; ~var20 > ~(!var3 ? 4096 : 64); ++var20) {
                        int var21 = arg1.method1779(-107);
                        if (var21 != 0) {
                            if (~(var21 & 1) == -2) {
                                ++arg1.field4195;
                            }
                            if (~(var21 & 2) == -3) {
                                arg1.field4195 += 2;
                            }
                            if (~(var21 & 4) == -5) {
                                arg1.field4195 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method1161(int arg0) {
        if (arg0 != 63) {
            method1161(-50);
        }
        field2709 = null;
        field2706 = null;
        field2714 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljj;IB)Ljg;")
    public static final class271 method1162(class134 arg0, int arg1, byte arg2) {
        ++field2704;
        if (!class72.method555((byte) 98, arg1, arg0)) {
            return null;
        } else {
            if (arg2 != 103) {
                method1159(74, -92);
            }
            return class3.method24(-1140);
        }
    }
}
