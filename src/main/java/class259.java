import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class259 extends class384 {

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Z")
    private boolean field3169 = false;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
    private boolean field3160;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[Lvq;")
    private class460[] field3166;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBIIII)V", line = 4)
    public static final void method1549(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class654.field9334.field9828.method1500(-123) != 0 && ~arg2 != -1 && ~class306.field3815 > -51 && ~arg3 != 0) {
            class313.field3888[class306.field3815++] = new class590((byte) 1, arg3, arg2, arg5, arg4, 0, arg0, (class361) null);
        }
        if (arg1 != -46) {
            method1549(-44, (byte) -38, 112, 88, -80, -84);
        }
        ++field3163;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lke;BI)V", line = 24)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        ++field3165;
        super.field5349.method2207((byte) -61, arg0);
        super.field5349.method2255(arg2, 15818);
        if (arg1 != 123) {
            this.field3169 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V", line = 36)
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (this.field3169) {
            super.field5349.method2217(1, 80);
            super.field5349.method2207((byte) -61, this.field3166[arg0 + -1]);
            super.field5349.method2217(0, 34);
        }
        if (!arg2) {
            this.method30(false, (byte) -8);
        }
        ++field3161;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z", line = 54)
    public final boolean method26(int arg0) {
        ++field3167;
        return arg0 != 13326 ? true : true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZB)V", line = 73)
    public final void method30(boolean arg0, byte arg1) {
        ++field3170;
        super.field5349.method2242(-72, class94.field989, class372.field4752);
        if (arg1 <= 78) {
            this.method24(false, 102);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 84)
    public final void method31(byte arg0) {
        if (!this.field3169) {
            super.field5349.method2268(0, 118, class424.field6157);
        } else {
            super.field5349.method2217(1, 68);
            super.field5349.method2207((byte) -61, (class596) null);
            super.field5349.method2211(-13095, class451.field6502);
            super.field5349.method2248((byte) -107);
            if (this.field3160) {
                super.field5349.method2242(-54, class372.field4752, class372.field4752);
                super.field5349.method2264(0, class424.field6157, (byte) 60);
                super.field5349.method2268(0, 63, class424.field6157);
            } else {
                super.field5349.method2242(-104, class372.field4752, class372.field4752);
                super.field5349.method2264(0, class424.field6157, (byte) 60);
                super.field5349.method2217(2, 6);
                super.field5349.method2242(-51, class372.field4752, class372.field4752);
                super.field5349.method2264(0, class424.field6157, (byte) 60);
                super.field5349.method2264(1, class324.field4136, (byte) 60);
                super.field5349.method2268(0, 6, class424.field6157);
                super.field5349.method2207((byte) -61, (class596) null);
            }
            super.field5349.method2217(0, 22);
            this.field3169 = false;
        }
        if (arg0 >= -18) {
            this.field3169 = false;
        }
        ++field3168;
        super.field5349.method2242(-75, class372.field4752, class372.field4752);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V", line = 127)
    public final void method24(boolean arg0, int arg1) {
        if (arg1 == -1) {
            ++field3162;
            if (this.field3166 != null && arg0) {
                super.field5349.method2217(1, 66);
                super.field5349.method2211(-13095, class156.field1717);
                class427 var3 = super.field5349.method2224((byte) 23);
                var3.method1022(1024);
                super.field5349.method2226(class235.field2799, arg1 + -113);
                if (this.field3160) {
                    super.field5349.method2242(-95, class94.field989, class360.field4624);
                    super.field5349.method2318((byte) 64, false, true, 0, class424.field6157);
                    super.field5349.method2268(0, 62, class169.field1881);
                } else {
                    super.field5349.method2242(-51, class372.field4752, class94.field989);
                    super.field5349.method2264(0, class324.field4136, (byte) 60);
                    super.field5349.method2217(2, 25);
                    super.field5349.method2242(-119, class94.field989, class360.field4624);
                    super.field5349.method2264(0, class324.field4136, (byte) 60);
                    super.field5349.method2318((byte) 97, false, true, 1, class324.field4136);
                    super.field5349.method2268(0, 70, class169.field1881);
                    super.field5349.method2207((byte) -61, super.field5349.field5149);
                }
                super.field5349.method2217(0, 119);
                this.field3169 = true;
            } else {
                super.field5349.method2268(0, 86, class169.field1881);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lln;)V", line = 172)
    public class259(class377 arg0) {
        super(arg0);
        if (arg0.field5113) {
            this.field3160 = ~arg0.field5073 > -4;
            int var2 = this.field3160 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 != 2) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
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
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field3166 = new class460[3];
            this.field3166[0] = super.field5349.method2216(64, false, (byte) -122, var4);
            this.field3166[1] = super.field5349.method2216(64, false, (byte) -127, var5);
            this.field3166[2] = super.field5349.method2216(64, false, (byte) -57, var3);
        }
    }
}
