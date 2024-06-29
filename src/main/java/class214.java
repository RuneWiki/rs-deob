import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class214 extends class33 {

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    private int field4162 = 6;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Lrd;")
    public static class173 field4151 = class133.method843("<col=ff9040>", 55);

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lrd;")
    public static class173 field4158 = class133.method843("Der Server wird gerade aktualisiert)3", 125);

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Lsa;")
    public static class180 field4156;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class214() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)I")
    private final int method1405(byte arg0, int arg1, int arg2) {
        ++field4164;
        if (arg0 <= 18) {
            return -22;
        } else {
            int var4 = this.field4162;
            if (var4 != 1) {
                if (var4 != 2) {
                    if (~var4 != -4) {
                        if (~var4 != -5) {
                            if (var4 != 5) {
                                if (~var4 != -7) {
                                    if (var4 != 7) {
                                        if (~var4 != -9) {
                                            if (var4 != 9) {
                                                if (var4 != 10) {
                                                    if (var4 != 11) {
                                                        return ~var4 == -13 ? -(arg1 * arg2 >> 11) + arg1 + arg2 : arg2;
                                                    } else {
                                                        return ~arg2 >= ~arg1 ? -arg2 + arg1 : arg2 - arg1;
                                                    }
                                                } else {
                                                    return ~arg2 < ~arg1 ? arg2 : arg1;
                                                }
                                            } else {
                                                return ~arg2 > ~arg1 ? arg2 : arg1;
                                            }
                                        } else {
                                            return ~arg2 == -1 ? 0 : -((4096 - arg1 << 12) / arg2) + 4096;
                                        }
                                    } else {
                                        return arg2 == 4096 ? 4096 : (arg1 << 12) / (-arg2 + 4096);
                                    }
                                } else {
                                    return arg1 >= 2048 ? 4096 - ((4096 - arg1) * (-arg2 + 4096) >> 11) : arg1 * arg2 >> 11;
                                }
                            } else {
                                return -((-arg1 + 4096) * (-arg2 + 4096) >> 12) + 4096;
                            }
                        } else {
                            return arg1 != 0 ? (arg2 << 12) / arg1 : 4096;
                        }
                    } else {
                        return arg1 * arg2 >> 12;
                    }
                } else {
                    return -arg1 + arg2;
                }
            } else {
                return arg1 + arg2;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 >= -99) {
            field4160 = -124;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field729 = ~arg2.method751((byte) 117) == -2;
            }
        } else {
            this.field4162 = arg2.method751((byte) 117);
        }
        ++field4157;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field4156 = null;
        if (arg0 == 0) {
            field4158 = null;
            field4151 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)I")
    public static final int method1407(int arg0, int arg1) {
        if (arg1 != -27987512) {
            field4155 = 33;
        }
        ++field4163;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int[] var3 = super.field718.method514(arg0, -95);
        int var4 = 61 / ((arg1 - -65) / 60);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -127, 0);
            int[] var6 = this.method262(arg0, -124, 1);
            for (int var7 = 0; ~var7 > ~class117.field2173; ++var7) {
                var3[var7] = this.method1405((byte) 76, var6[var7], var5[var7]);
            }
        }
        ++field4153;
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field4161;
        int[][] var3 = super.field731.method1340(34, arg1);
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[][] var5 = this.method259(1, -9, arg1);
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var3[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~var15 > ~class117.field2173; ++var15) {
                var10[var15] = this.method1405((byte) 72, var12[var15], var7[var15]);
                var6[var15] = this.method1405((byte) 118, var13[var15], var9[var15]);
                var8[var15] = this.method1405((byte) 51, var14[var15], var11[var15]);
            }
        }
        if (arg0 <= 112) {
            this.method175(-63, (byte) -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    public static final void method1408(byte arg0) {
        ++field4152;
        if (arg0 <= -10) {
            class21.field467.method99((byte) -127);
            class12.field192 = null;
            class55.field1097 = 1;
        }
    }
}
