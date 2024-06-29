import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class116 extends class51 {

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "I")
    private int field2270 = 0;

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "I")
    public static int field2269 = 0;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Ltd;")
    public static class176 field2260 = new class176(200);

    @OriginalMember(owner = "client!mg", name = "qb", descriptor = "I")
    public static volatile int field2276 = 0;

    @OriginalMember(owner = "client!mg", name = "ob", descriptor = "Led;")
    private static class43 field2274 = class191.method1219("Please enter your password)3", false);

    @OriginalMember(owner = "client!mg", name = "rb", descriptor = "I")
    public static int field2277 = 127;

    @OriginalMember(owner = "client!mg", name = "sb", descriptor = "Led;")
    public static class43 field2278 = field2274;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!mg", name = "pb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "Lga;")
    public static class58 field2268;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "[I")
    private int[] field2262;

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "[I")
    private int[] field2272;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "[[I")
    private int[][] field2264;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)[I")
    private final int[] method734(boolean arg0, int arg1) {
        ++field2267;
        if (arg0) {
            return null;
        } else if (arg1 < 0) {
            return this.field2262;
        } else {
            return ~arg1 <= ~this.field2264.length ? this.field2272 : this.field2264[arg1];
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (this.field2264 == null) {
            this.field2264 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2275;
        if (~this.field2264.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 > -83) {
                method737(true);
            }
            if (this.field2270 == 2) {
                this.method739(-1);
            }
            class159.method999((byte) 13);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class116() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method64(110);
        }
        ++field2259;
        if (~arg2 == -1) {
            this.field2270 = arg0.method538((byte) -94);
            this.field2264 = new int[arg0.method538((byte) 80)][2];
            for (int var4 = 0; var4 < this.field2264.length; ++var4) {
                this.field2264[var4][0] = arg0.method555(-1113627096);
                this.field2264[var4][1] = arg0.method555(arg1 + -1113627096);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static void method735(byte arg0) {
        field2268 = null;
        field2260 = null;
        if (arg0 <= -19) {
            field2278 = null;
            field2274 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I")
    public static final int method736(int arg0, int arg1) {
        ++field2273;
        if (arg0 != -15299220) {
            return 89;
        } else {
            int var2 = (1431655765 & arg1) - -((-1431655766 & arg1) >>> 1);
            int var3 = (858993459 & var2) - -(var2 >>> 2 & 1932735283);
            int var4 = var3 - -(var3 >>> 4) & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return 255 & var6;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(Z)V")
    public static final void method737(boolean arg0) {
        for (class137 var1 = (class137) class15.field227.method76(-121); var1 != null; var1 = (class137) class15.field227.method79((byte) 76)) {
            int var2 = var1.field2850;
            if (class54.method335(-758973232, var2)) {
                boolean var3 = true;
                class129[] var4 = class12.field177[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2707;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1353;
                    class129 var7 = class124.method801((byte) -36, var6);
                    if (var7 != null) {
                        class43.method265(false, var7);
                    }
                }
            }
        }
        if (arg0) {
            field2276 = -72;
        }
        ++field2266;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public static final void method738(int arg0) {
        ++field2265;
        if (arg0 >= -40) {
            method738(-120);
        }
        class38.field723.method334(-106);
        int var1 = class38.field723.method330((byte) 58, 1);
        if (var1 != 0) {
            int var2 = class38.field723.method330((byte) 103, 2);
            if (var2 == 0) {
                class67.field1347[class115.field2241++] = 2047;
            } else if (var2 == 1) {
                int var3 = class38.field723.method330((byte) 69, 3);
                class67.field1348.method764(false, var3, 0);
                int var4 = class38.field723.method330((byte) 110, 1);
                if (~var4 == -2) {
                    class67.field1347[class115.field2241++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class38.field723.method330((byte) 52, 3);
                class67.field1348.method764(true, var5, 0);
                int var6 = class38.field723.method330((byte) 123, 3);
                class67.field1348.method764(true, var6, 0);
                int var7 = class38.field723.method330((byte) 48, 1);
                if (~var7 == -2) {
                    class67.field1347[class115.field2241++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class38.field723.method330((byte) 92, 7);
                int var9 = class38.field723.method330((byte) 112, 1);
                if (var9 == 1) {
                    class67.field1347[class115.field2241++] = 2047;
                }
                int var10 = class38.field723.method330((byte) 70, 7);
                int var11 = class38.field723.method330((byte) 109, 1);
                class93.field1839 = class38.field723.method330((byte) 68, 2);
                class67.field1348.method758((byte) 125, var8, var10, var11 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            this.field2272 = null;
        }
        ++field2261;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -38, arg1);
            int var5 = this.field2270;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; var6 < class122.field2442; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field2264.length + -1 > var8 && this.field2264[var8][0] <= var7; ++var8) {
                        }
                        int[] var9 = this.field2264[var8 - 1];
                        int[] var10 = this.field2264[var8];
                        int var11 = (-var9[0] + var7 << 12) / (var10[0] + -var9[0]);
                        int var12 = -class122.field2451[255 & var11 >> 5] + 4096 >> 1;
                        int var13 = 4096 - var12;
                        var3[var6] = var9[1] * var13 + var10[1] * var12 >> 12;
                    }
                } else {
                    for (int var14 = 0; ~var14 > ~class122.field2442; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~var16 > ~(this.field2264.length - 1) && ~var15 <= ~this.field2264[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field2264[var16 + -1];
                        int[] var18 = this.field2264[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] + -var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~var21 > ~class122.field2442; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~(this.field2264.length + -1) < ~var23 && ~var22 <= ~this.field2264[var23][0]; ++var23) {
                    }
                    int[] var24 = this.field2264[var23 + -1];
                    int[] var25 = this.field2264[var23];
                    int var26 = this.method734(false, var23 + -2)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method734(false, var23 - -1)[1];
                    int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                    int var31 = var30 * var30 >> 12;
                    int var32 = -var26 + var28;
                    int var34 = -var28 + var29 + var27 + -var26;
                    int var35 = -var34 + var26 - var27;
                    int var36 = (var30 * var34 >> 12) * var31 >> 12;
                    int var37 = var31 * var35 >> 12;
                    int var38 = var30 * var32 >> 12;
                    var3[var21] = var37 - (-var27 + -var38) + var36;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    private final void method739(int arg0) {
        int[] var2 = this.field2264[1];
        int[] var3 = this.field2264[0];
        ++field2263;
        int[] var4 = this.field2264[this.field2264.length + -2];
        int[] var5 = this.field2264[this.field2264.length + -1];
        this.field2272 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
        this.field2262 = new int[] { var3[0] + -var2[0] + var3[0], var3[1] - (var2[1] + -var3[1]) };
        if (arg0 != -1) {
            field2276 = -105;
        }
    }
}
