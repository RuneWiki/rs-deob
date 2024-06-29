import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class414 extends class30 {

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    private int field6118 = 4096;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    private int field6120 = 4096;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    private int field6124 = 4096;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "[I")
    public static int[] field6126 = new int[2];

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "[[I")
    public static int[][] field6127 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "Lgl;")
    public static class356 field6117;

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class414() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field6123;
        if (arg0 != -93) {
            return null;
        } else {
            int[][] var3 = super.field360.method2803(arg1, true);
            if (super.field360.field6566) {
                int[][] var4 = this.method206(arg1, 2, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class369.field5610 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && ~var13 == ~var14) {
                        var8[var11] = this.field6124 * var12 >> 12;
                        var9[var11] = this.field6120 * var13 >> 12;
                        var10[var11] = this.field6118 * var14 >> 12;
                    } else {
                        var8[var11] = this.field6124;
                        var9[var11] = this.field6120;
                        var10[var11] = this.field6118;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZBIIZIII)V")
    public static final void method2589(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field6129;
        if (arg4 || ~class418.field6195 != ~arg3 || class222.field3698 != arg7 || ~class81.field1007 != ~arg2 && !class117.method852(true)) {
            class81.field1007 = arg2;
            if (arg1 >= -45) {
                field6125 = -43;
            }
            class222.field3698 = arg7;
            class418.field6195 = arg3;
            if (class117.method852(true)) {
                class81.field1007 = 0;
            }
            if (!arg0) {
                class128.method953(16205, 25);
            } else {
                class128.method953(16205, 28);
            }
            class136.method996(class330.field5168, true, (byte) -84, class435.field6411);
            int var8 = class409.field6048;
            int var9 = class444.field6481;
            class409.field6048 = (-(class80.field1003 >> 4) + class418.field6195) * 8;
            class444.field6481 = (-(class380.field5751 >> 4) + class222.field3698) * 8;
            class336.field5228 = class400.method2521(class418.field6195 * 8, class222.field3698 * 8);
            class396.field5932 = null;
            int var10 = class409.field6048 - var8;
            int var11 = -var9 + class444.field6481;
            if (arg0) {
                class397.field5940 = 0;
                int var12 = (class80.field1003 + -1) * 128;
                int var13 = (class380.field5751 + -1) * 128;
                for (int var14 = 0; var14 < 32768; ++var14) {
                    class50 var15 = class39.field499[var14];
                    if (var15 != null) {
                        var15.field722 -= var11 * 128;
                        var15.field724 -= var10 * 128;
                        if (~var15.field724 <= -1 && ~var12 <= ~var15.field724 && ~var15.field722 <= -1 && var15.field722 <= var13) {
                            boolean var16 = true;
                            for (int var17 = 0; var17 < 10; ++var17) {
                                var15.field1906[var17] -= var10;
                                var15.field1916[var17] -= var11;
                                if (var15.field1906[var17] < 0 || ~var15.field1906[var17] <= ~class80.field1003 || var15.field1916[var17] < 0 || ~class380.field5751 >= ~var15.field1916[var17]) {
                                    var16 = false;
                                }
                            }
                            if (var16) {
                                class423.field6253[class397.field5940++] = var14;
                            } else {
                                class39.field499[var14].method316((class226) null, 0);
                                class39.field499[var14] = null;
                            }
                        } else {
                            class39.field499[var14].method316((class226) null, 0);
                            class39.field499[var14] = null;
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < 32768; ++var18) {
                    class50 var23 = class39.field499[var18];
                    if (var23 != null) {
                        for (int var24 = 0; ~var24 > -11; ++var24) {
                            var23.field1906[var24] -= var10;
                            var23.field1916[var24] -= var11;
                        }
                        var23.field724 -= var10 * 128;
                        var23.field722 -= var11 * 128;
                    }
                }
            }
            for (int var19 = 0; var19 < 2048; ++var19) {
                class219 var21 = class216.field3517[var19];
                if (var21 != null) {
                    for (int var22 = 0; ~var22 > -11; ++var22) {
                        var21.field1906[var22] -= var10;
                        var21.field1916[var22] -= var11;
                    }
                    var21.field724 -= var10 * 128;
                    var21.field722 -= var11 * 128;
                }
            }
            class266.field4286 = arg2;
            class261.field4201.method1569(arg5, false, 14160, arg6, class266.field4286);
            class450.method2799((byte) 125, var10, var11);
            for (class359 var20 = (class359) class235.field3928.method253((byte) -6); var20 != null; var20 = (class359) class235.field3928.method247((byte) 116)) {
                var20.field5490 -= var10;
                var20.field5498 -= var11;
                if (~var20.field5490 > -1 || ~var20.field5498 > -1 || var20.field5490 >= class80.field1003 || var20.field5498 >= class380.field5751) {
                    var20.method1120(63);
                }
            }
            if (~class19.field254 != -1) {
                class132.field2062 -= var11;
                class19.field254 -= var10;
            }
            class297.field4719 = 0;
            if (!arg0) {
                if (class13.field194 == 4) {
                    class144.field2269 -= var10 * 128;
                    class290.field4639 -= var11 * 128;
                    class217.field3555 -= var10 * 128;
                    class163.field2551 -= var11 * 128;
                } else {
                    class13.field194 = 1;
                }
            } else {
                class326.field5116 -= var11;
                class290.field4631 -= var11 * 128;
                class427.field6301 -= var10 * 128;
                class364.field5541 -= var10;
                class136.field2123 -= var11;
                class196.field3175 -= var10;
                if (~Math.abs(var10) < ~class80.field1003 || Math.abs(var11) > class380.field5751) {
                    class410.method2574(-1);
                }
            }
            class73.method471((byte) 93);
            class257.method1780(true);
            class236.field3946.method255(-20994);
            class282.field4527.method255(-20994);
            class139.field2161.method2439(-120);
            class345.method2258(8);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
    public static void method2590(boolean arg0) {
        field6126 = null;
        if (arg0) {
            field6125 = 13;
        }
        field6127 = null;
        field6117 = null;
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
    public static final void method2591(int arg0) {
        ++field6130;
        int[] var1 = new int[class308.field4880];
        int var2 = 0;
        for (int var3 = 0; ~class308.field4880 < ~var3; ++var3) {
            class97 var5 = class155.method1092(true, var3);
            if (var5.field1342 >= 0 || ~var5.field1368 <= -1) {
                var1[var2++] = var3;
            }
        }
        if (arg0 != -7702) {
            method2591(35);
        }
        class369.field5596 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class369.field5596[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 == 6456) {
            ++field6119;
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field6118 = arg0.method1272((byte) -97);
                    }
                } else {
                    this.field6120 = arg0.method1272((byte) -123);
                }
            } else {
                this.field6124 = arg0.method1272((byte) -82);
            }
        }
    }
}
