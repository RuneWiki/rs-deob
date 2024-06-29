import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class273 extends class546 {

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
    private boolean field4397 = false;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "Z")
    private boolean field4403;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "[Lpfa;")
    private class270[] field4398;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "[[Z")
    public static boolean[][] field4401 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "Lao;")
    public static class262 field4402;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "(I)V")
    public static void method1923(int arg0) {
        field4401 = null;
        if (arg0 == -5182) {
            field4402 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
    public final void method788(boolean arg0, int arg1) {
        if (this.field4398 != null && arg0) {
            super.field7937.method2244(1, -106);
            super.field7937.method163(true, class341.field5524);
            class498 var3 = super.field7937.method2282((byte) 115);
            var3.method521(1024);
            super.field7937.method2291(class163.field2748, 24813);
            if (!this.field4403) {
                super.field7937.method2275(class646.field9074, -93, class406.field6268);
                super.field7937.method2287((byte) -89, 0, class692.field9702);
                super.field7937.method2244(2, -112);
                super.field7937.method2275(class406.field6268, -99, class471.field6979);
                super.field7937.method2287((byte) -70, 0, class692.field9702);
                super.field7937.method185(class692.field9702, 1, false, true, (byte) 106);
                super.field7937.method2304(class24.field409, 0, -125);
                super.field7937.method2271(super.field7937.field5418, 5180);
            } else {
                super.field7937.method2275(class406.field6268, 88, class471.field6979);
                super.field7937.method185(class622.field8779, 0, false, true, (byte) 106);
                super.field7937.method2304(class24.field409, 0, -112);
            }
            super.field7937.method2244(0, -72);
            this.field4397 = true;
        } else {
            super.field7937.method2304(class24.field409, 0, -123);
        }
        if (arg1 != 0) {
            this.field4397 = false;
        }
        ++field4410;
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(B)V")
    public static final void method1924(byte arg0) {
        if (arg0 != 18) {
            field4401 = null;
        }
        ++field4404;
        class335.field5482.method563(0);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method1925(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4407;
        if (~arg3 < -1 && !class416.method2649(arg3, true)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class416.method2649(arg5, true)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class470.method2915(arg4, 117);
            int var8 = 0;
            int var9 = ~arg5 >= ~arg3 ? arg5 : arg3;
            int var10 = arg3 >> 1;
            if (arg6 == 191014433) {
                int var11 = arg5 >> 1;
                byte[] var12 = arg1;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg2, var8, arg0, arg3, arg5, 0, arg4, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg3 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; ~var16 > ~var7; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; ~var21 > ~var10; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                int var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    var12 = var15;
                    arg3 = var10;
                    arg5 = var11;
                    ++var8;
                    var10 >>= 1;
                    var9 >>= 1;
                    var11 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZLwq;)V")
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field4411;
        super.field7937.method2271(arg2, 5180);
        if (arg1) {
            method1925(91, (byte[]) null, 88, 120, -13, 19, 109);
        }
        super.field7937.method2280(2, arg0);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)V")
    public final void method793(int arg0, boolean arg1) {
        if (arg0 < -39) {
            super.field7937.method2275(class406.field6268, -101, class646.field9074);
            ++field4406;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)Z")
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            return true;
        } else {
            ++field4399;
            return true;
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)V")
    public final void method785(int arg0, int arg1, int arg2) {
        ++field4400;
        if (this.field4397) {
            super.field7937.method2244(1, -74);
            super.field7937.method2271(this.field4398[arg1 + -1], 5180);
            super.field7937.method2244(0, -125);
        }
        if (arg0 != 8) {
            field4402 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lrr;)V")
    public class273(class332 arg0) {
        super(arg0);
        if (arg0.field5409) {
            this.field4403 = ~arg0.field5359 > -4;
            int var2 = !this.field4403 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var13;
                            } else if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field4398 = new class270[3];
            this.field4398[0] = super.field7937.method171(false, true, var4, 64);
            this.field4398[1] = super.field7937.method171(false, true, var5, 64);
            this.field4398[2] = super.field7937.method171(false, true, var3, 64);
        }
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(III)V")
    public static final void method1926(int arg0, int arg1, int arg2) {
        ++class330.field5108;
        ++field4405;
        class165 var3 = class271.method1917(class420.field6424, (byte) -83, class364.field5736);
        var3.field2776.method59((byte) -79, arg1);
        var3.field2776.method76(false, arg0);
        if (arg2 <= 95) {
            method1926(27, 112, -15);
        }
        class642.method3726(-684096285, var3);
    }

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "(I)V")
    public final void method783(int arg0) {
        if (arg0 == 255) {
            if (this.field4397) {
                super.field7937.method2244(1, -123);
                super.field7937.method2271((class152) null, 5180);
                super.field7937.method163(true, class328.field5090);
                super.field7937.method2263((byte) 123);
                if (!this.field4403) {
                    super.field7937.method2275(class646.field9074, 117, class646.field9074);
                    super.field7937.method2287((byte) -103, 0, class622.field8779);
                    super.field7937.method2244(2, arg0 + -358);
                    super.field7937.method2275(class646.field9074, arg0 + -377, class646.field9074);
                    super.field7937.method2287((byte) -123, 0, class622.field8779);
                    super.field7937.method2287((byte) -125, 1, class692.field9702);
                    super.field7937.method2304(class622.field8779, 0, -121);
                    super.field7937.method2271((class152) null, arg0 + 4925);
                } else {
                    super.field7937.method2275(class646.field9074, arg0 + -160, class646.field9074);
                    super.field7937.method2287((byte) -89, 0, class622.field8779);
                    super.field7937.method2304(class622.field8779, 0, arg0 + -377);
                }
                super.field7937.method2244(0, -119);
                this.field4397 = false;
            } else {
                super.field7937.method2304(class622.field8779, 0, -126);
            }
            ++field4409;
            super.field7937.method2275(class646.field9074, 109, class646.field9074);
        }
    }
}
