import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class134 extends class212 {

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "Z")
    private boolean field2255 = true;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "Z")
    public boolean field2258 = false;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "[Lps;")
    public static class97[] field2248;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field2245;
        if (arg0 != 3) {
            this.field2255 = false;
        }
        if (!super.field3004.method2064((byte) -89).method3099(-38)) {
            return 3;
        } else {
            return ~arg1 == -4 && !class355.method2224("jagdx", arg0 ^ 3) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = -50 / ((arg0 - 82) / 35);
        super.field3006 = arg1;
        ++field2251;
        this.field2258 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V")
    public static final void method1095(int arg0, int arg1, int arg2) {
        ++field2247;
        class594 var3 = class692.method3869(0, (byte) 105, 15);
        var3.method3378(-25490);
        var3.field8126 = arg2;
        var3.field8125 = arg1;
        if (arg0 < 57) {
            method1098(5);
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(ZI)V")
    public final void method1096(boolean arg0, int arg1) {
        this.field2255 = arg0;
        ++field2254;
        if (arg1 != -142238264) {
            method1098(20);
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
    public static final void method1097(int arg0) {
        ++field2257;
        if (class646.field8885 == null) {
            class646.field8885 = new int[65536];
            double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
            int var3 = 0;
            if (arg0 == 1415665776) {
                for (int var4 = 0; ~var4 > -513; ++var4) {
                    float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                    for (int var7 = 0; var7 < 128; ++var7) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = (float) (-var13) + var12;
                        float var16 = (-var6 + 1.0F) * var8;
                        float var17 = (1.0F - var6 * var15) * var8;
                        float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (~var14 != -3) {
                                    if (var14 != 3) {
                                        if (var14 != 4) {
                                            if (~var14 == -6) {
                                                var9 = var8;
                                                var10 = var16;
                                                var11 = var17;
                                            }
                                        } else {
                                            var11 = var8;
                                            var10 = var16;
                                            var9 = var18;
                                        }
                                    } else {
                                        var11 = var8;
                                        var10 = var17;
                                        var9 = var16;
                                    }
                                } else {
                                    var11 = var18;
                                    var9 = var16;
                                    var10 = var8;
                                }
                            } else {
                                var10 = var8;
                                var9 = var17;
                                var11 = var16;
                            }
                        } else {
                            var9 = var8;
                            var10 = var18;
                            var11 = var16;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = (var23 << 8) + (var22 << 16) + var24 + -16777216;
                        class646.field8885[var3++] = var25;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        this.field2258 = true;
        ++field2246;
        if (arg0 != 20014) {
            this.field2255 = false;
        }
        return !super.field3004.method2064((byte) -113).method3099(arg0 + -20083) ? 0 : 2;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(ILdh;)V")
    public class134(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ldh;)V")
    public class134(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V")
    public static final void method1098(int arg0) {
        if (arg0 < 20) {
            method1102(47);
        }
        ++field2249;
        class112 var1 = class755.field10551;
        synchronized (class755.field10551) {
            class755.field10551.method999(0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field2253;
        if (!super.field3004.method2064((byte) -106).method3099(-33)) {
            super.field3006 = 0;
        }
        if (arg0) {
            this.method1099(31);
        }
        if (super.field3006 < 0 || super.field3006 > 5) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(I)I")
    public final int method1099(int arg0) {
        ++field2252;
        if (arg0 != -32350) {
            this.field2255 = false;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
    public final boolean method1100(byte arg0) {
        ++field2244;
        if (arg0 >= -93) {
            this.field2255 = false;
        }
        return this.field2255;
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(I)Z")
    public final boolean method1101(int arg0) {
        ++field2250;
        if (arg0 < 85) {
            return true;
        } else {
            return super.field3004.method2064((byte) -124).method3099(-59);
        }
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "(I)V")
    public static void method1102(int arg0) {
        if (arg0 != 1) {
            method1098(33);
        }
        field2248 = null;
    }
}
