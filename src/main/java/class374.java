import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class374 extends class243 {

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    private int field5199 = 4096;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[I")
    private int[] field5203 = new int[3];

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    private int field5196 = 409;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    private int field5197 = 4096;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    private int field5206 = 4096;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "Lea;")
    public static class547 field5198 = new class547(68, 3);

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field5204 = 0;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lea;")
    public static class547 field5202 = new class547(77, 2);

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Lwr;")
    public static class459 field5207 = new class459(16);

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field5209 = 0;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V", line = 4)
    public static final void method2198(int arg0, int arg1) {
        ++field5195;
        class8.field55 = 2;
        class381.field5302 = arg0;
        long var2 = 0L;
        if (class692.field9682 != null) {
            class611 var4 = new class611(class171.method994(class375.method2207(class692.field9682, -1), arg1 + 18887));
            long var5 = var4.method3445(-101);
            class394.field5582 = var4.method3445(-90);
            if (arg1 != -6182) {
                field5198 = null;
            }
            class163.method961(true, class543.method3084(-68, var5), 73, "");
        } else {
            class158.method948(35, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLji;)Lpd;", line = 32)
    public static final class260 method2199(boolean arg0, class611 arg1) {
        ++field5205;
        if (arg0) {
            field5204 = 113;
        }
        return new class260(arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3413(arg0), arg1.method3413(false), arg1.method3413(false), arg1.method3385(-124), arg1.method3428((byte) 57));
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[[I", line = 44)
    public final int[][] method2(int arg0, int arg1) {
        ++field5201;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class687.field9628 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5203[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field5196 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5203[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field5196 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field5203[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field5196) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5197 * var12 >> 12;
                            var9[var11] = this.field5199 * var14 >> 12;
                            var10[var11] = this.field5206 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 >= -76) {
            field5198 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z", line = 147)
    public static final boolean method2200(int arg0, byte arg1, int arg2) {
        if (arg1 <= 21) {
            return false;
        } else {
            ++field5200;
            return class257.method1546(arg2, 15849, arg0) || class111.method747(arg0, arg2, -2);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILji;B)V", line = 160)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg1.method3385(-127);
                            this.field5203[0] = class321.method1919(var5, 16711680) << 4;
                            this.field5203[2] = class321.method1919(255, var5) >> 12;
                            this.field5203[1] = class321.method1919(var5, 65280) >> 4;
                        }
                    } else {
                        this.field5197 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field5199 = arg1.method3402((byte) 127);
                }
            } else {
                this.field5206 = arg1.method3402((byte) 127);
            }
        } else {
            this.field5196 = arg1.method3402((byte) 127);
        }
        if (arg2 >= -92) {
            this.field5206 = 115;
        }
        ++field5194;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V", line = 226)
    public static void method2201(byte arg0) {
        field5198 = null;
        field5202 = null;
        field5207 = null;
        if (arg0 != -100) {
            field5204 = -12;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 241)
    public class374() {
        super(1, false);
    }
}
