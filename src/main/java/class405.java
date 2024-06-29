import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class405 extends class642 {

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "Z")
    private boolean field6058 = true;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "Z")
    private boolean field6059 = true;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "[Leh;")
    public static class203[] field6060;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 != 1) {
            method2495((byte) 67, -29);
        }
        field6060 = null;
    }

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "(I)V")
    public static final void method2494(int arg0) {
        class408.field6085 = 0;
        class454.field6557 = 0;
        class372.field5506 = 0;
        class1.field4 = 0;
        ++field6056;
        if (arg0 != 15774) {
            method2495((byte) -7, 2);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field6063;
        if (arg0 != 21402) {
            return null;
        } else {
            int[][] var3 = super.field9211.method1068(0, arg1);
            if (super.field9211.field2131) {
                int[][] var4 = this.method3657(!this.field6058 ? arg1 : -arg1 + class553.field8133, true, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field6059) {
                    for (int var11 = 0; ~var11 > ~class338.field4909; ++var11) {
                        var8[var11] = var5[-var11 + class412.field6121];
                        var9[var11] = var6[-var11 + class412.field6121];
                        var10[var11] = var7[-var11 + class412.field6121];
                    }
                } else {
                    for (int var12 = 0; class338.field4909 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
    public class405() {
        super(1, false);
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field6061;
        int[] var3 = super.field9216.method1185(arg0, -120);
        if (arg1 != -9) {
            this.field6058 = true;
        }
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 124, this.field6058 ? -arg0 + class553.field8133 : arg0, 0);
            if (this.field6059) {
                for (int var5 = 0; ~var5 > ~class338.field4909; ++var5) {
                    var3[var5] = var4[-var5 + class412.field6121];
                }
            } else {
                class667.method3740(var4, 0, var3, 0, class338.field4909);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)V")
    public static final void method2495(byte arg0, int arg1) {
        if (arg0 == -78) {
            ++field6055;
            class587.field8521 = arg1;
            class642.field9200.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(II)I")
    public static final int method2496(int arg0, int arg1) {
        ++field6062;
        if (arg0 != 1023) {
            method2495((byte) 40, 103);
        }
        return 1023 & arg1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lhg;)V")
    public static final void method2497(class471 arg0) {
        if (class291.field4276 < 65535) {
            class334 var1 = arg0.field6773;
            class324.field4707[class291.field4276] = arg0;
            class638.field9172[class291.field4276] = false;
            ++class291.field4276;
            int var2 = arg0.field6775;
            if (arg0.field6777) {
                var2 = 0;
            }
            int var3 = arg0.field6775;
            if (arg0.field6778) {
                var3 = class555.field8157 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2046(true) - var1.method2051(-520326527) + class41.field615 >> class125.field1831;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2046(true) + var1.method2051(-520326527) - class41.field615 >> class125.field1831;
                if (var7 >= class575.field8372) {
                    var7 = class575.field8372 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field6767[var5++];
                    int var10 = (var1.method2050((byte) -31) - var1.method2051(-520326527) + class41.field615 >> class125.field1831) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class91.field1390) {
                        var11 = class91.field1390 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class267.field3487[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class267.field3487[var4][var12][var8] = var13 | (long) class291.field4276;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class267.field3487[var4][var12][var8] = var13 | (long) class291.field4276 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class267.field3487[var4][var12][var8] = var13 | (long) class291.field4276 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class267.field3487[var4][var12][var8] = var13 | (long) class291.field4276 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 >= 29) {
            ++field6064;
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field9207 = ~arg1.method3115(29871) == -2;
                    }
                } else {
                    this.field6058 = ~arg1.method3115(29871) == -2;
                }
            } else {
                this.field6059 = arg1.method3115(29871) == 1;
            }
        }
    }
}
