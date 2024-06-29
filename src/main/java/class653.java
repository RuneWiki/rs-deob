import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class653 {

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ldfa;")
    public class168 field9083 = new class168();

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lkg;")
    public static class275 field9080 = new class275(97, 0);

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field9089 = new Random();

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lkg;")
    public static class275 field9091 = new class275(111, 3);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Ldfa;")
    private class168 field9092;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldfa;Lfh;I)V")
    private final void method3657(class168 arg0, class653 arg1, int arg2) {
        field9081++;
        class168 var4 = this.field9083.field2332;
        this.field9083.field2332 = arg0.field2332;
        arg0.field2332.field2336 = this.field9083;
        if (this.field9083 != arg0) {
            arg0.field2332 = arg1.field9083.field2332;
            arg0.field2332.field2336 = arg0;
            var4.field2336 = arg1.field9083;
            arg1.field9083.field2332 = var4;
        }
        if (arg2 != 1) {
            this.method3670((byte) -29);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Ldfa;")
    public final class168 method3658(int arg0) {
        field9078++;
        class168 var2 = this.field9083.field2332;
        if (arg0 != -8718) {
            return null;
        } else if (this.field9083 == var2) {
            this.field9092 = null;
            return null;
        } else {
            this.field9092 = var2.field2332;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLdfa;)V")
    public final void method3659(boolean arg0, class168 arg1) {
        field9077++;
        if (arg0) {
            this.field9083 = null;
        }
        if (arg1.field2332 != null) {
            arg1.method1175(-2);
        }
        arg1.field2336 = this.field9083.field2336;
        arg1.field2332 = this.field9083;
        arg1.field2332.field2336 = arg1;
        arg1.field2336.field2332 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLfh;)V")
    public final void method3660(boolean arg0, class653 arg1) {
        field9090++;
        if (arg0) {
            field9091 = null;
        }
        this.method3657(this.field9083.field2336, arg1, 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[ILlga;)Llq;")
    public static final class555 method3661(int arg0, int arg1, int[] arg2, class714 arg3) {
        field9075++;
        int[] var4 = null;
        int[] var5 = null;
        if (arg0 != -3) {
            field9080 = null;
        }
        int[] var6 = null;
        float[][] var7 = null;
        if (arg3.field9951 != null) {
            int var8 = arg3.field9929;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var4 = new int[var8];
            var5 = new int[var8];
            var7 = new float[var8][];
            var6 = new int[var8];
            for (int var16 = 0; var16 < arg1; var16++) {
                int var23 = arg2[var16];
                if (arg3.field9951[var23] != -1) {
                    int var24 = arg3.field9951[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field9919[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field9945[var23];
                        } else {
                            var26 = arg3.field9932[var23];
                        }
                        int var27 = arg3.field9923[var26];
                        int var28 = arg3.field9950[var26];
                        int var29 = arg3.field9917[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field9936[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg3.field9949[var17];
                        var20 = 64.0F / (float) arg3.field9959[var17];
                        if (var19 == 0) {
                            var21 = 1.0F;
                            var22 = 1.0F;
                        } else if (var19 <= 0) {
                            var22 = 1.0F;
                            var21 = (float) (-var19) / 1024.0F;
                        } else {
                            var21 = 1.0F;
                            var22 = (float) var19 / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var20 = 64.0F / (float) arg3.field9959[var17];
                        var22 = 64.0F / (float) arg3.field9926[var17];
                        var21 = 64.0F / (float) arg3.field9949[var17];
                    } else {
                        var20 = (float) arg3.field9959[var17] / 1024.0F;
                        var21 = (float) arg3.field9949[var17] / 1024.0F;
                        var22 = (float) arg3.field9926[var17] / 1024.0F;
                    }
                    var7[var17] = class685.method3850(var22, var20, arg3.field9947[var17], arg3.field9915[var17], arg3.field9938[var17], var21, class702.method3949(arg3.field9920[var17], 255), true);
                }
            }
        }
        return new class555(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Ldfa;")
    public final class168 method3662(int arg0) {
        field9087++;
        class168 var2 = this.field9092;
        if (this.field9083 == var2) {
            this.field9092 = null;
            return null;
        }
        if (arg0 != -1) {
            this.method3671(null, false);
        }
        this.field9092 = var2.field2336;
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILha;Lria;)V")
    public static final void method3663(int arg0, class60 arg1, class288 arg2) {
        if (arg0 != -3002) {
            field9089 = null;
        }
        field9079++;
        boolean var3 = class21.field381.method1586(arg2.field3700, arg1, arg2.field3726 ? class380.field4847.field10081 : null, arg2.field3643, arg2.field3769 | 0xFF000000, arg2.field3634, arg2.field3651, arg0 + 3374) == null;
        if (var3) {
            class503.field7104.method3671(new class167(arg2.field3700, arg2.field3643, arg2.field3651, arg2.field3769 | 0xFF000000, arg2.field3634, arg2.field3726), false);
            class207.method1332((byte) -115, arg2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method3664(int arg0) {
        field9089 = null;
        field9091 = null;
        field9080 = null;
        if (arg0 != 0) {
            method3663(127, null, null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)Ldfa;")
    public final class168 method3665(int arg0) {
        field9076++;
        if (arg0 != 23290) {
            this.field9083 = null;
        }
        class168 var2 = this.field9083.field2336;
        if (this.field9083 == var2) {
            return null;
        } else {
            var2.method1175(arg0 ^ 0xFFFFA504);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
    public final int method3666(int arg0) {
        field9074++;
        int var2 = arg0;
        class168 var3 = this.field9083.field2336;
        while (this.field9083 != var3) {
            var3 = var3.field2336;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
    public final boolean method3667(byte arg0) {
        if (arg0 == -45) {
            field9073++;
            return this.field9083.field2336 == this.field9083;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public final void method3668(int arg0) {
        field9084++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class168 var2 = this.field9083.field2336;
            if (this.field9083 == var2) {
                this.field9092 = null;
                return;
            }
            var2.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lvl;I)V")
    public static final void method3669(class13 arg0, int arg1) {
        field9082++;
        if (arg0.field215 != -1) {
            class56 var2 = class66.field941.method1299((byte) -95, arg0.field215);
            if (var2 == null || var2.field771 == null) {
                arg0.field215 = -1;
                arg0.field239 = false;
            } else {
                label361: {
                    arg0.field216++;
                    if (arg0.field168 < var2.field771.length && arg0.field216 > var2.field773[arg0.field168]) {
                        arg0.field168++;
                        arg0.field251++;
                        arg0.field216 = 1;
                        if (!arg0.field206) {
                            class758.method4218(arg0.field168, arg0, arg1, var2);
                        }
                    }
                    if (var2.field771.length <= arg0.field168) {
                        arg0.field168 = 0;
                        arg0.field216 = 0;
                        if (arg0.field239) {
                            arg0.field215 = arg0.method94((byte) -121).method4108(-8322);
                            if (arg0.field215 == -1) {
                                arg0.field239 = false;
                                break label361;
                            }
                            var2 = class66.field941.method1299((byte) -116, arg0.field215);
                        }
                        if (!arg0.field206) {
                            class758.method4218(arg0.field168, arg0, 0, var2);
                        }
                    }
                    arg0.field251 = arg0.field168 + 1;
                    if (var2.field771 == null) {
                        arg0.field215 = -1;
                        arg0.field239 = false;
                    } else if (arg0.field251 >= var2.field771.length) {
                        arg0.field251 = 0;
                    }
                }
            }
        }
        if (arg0.field160 != -1 && arg0.field229 <= class463.field6224) {
            class164 var3 = class234.field3057.method2095(arg0.field160, (byte) -128);
            int var4 = var3.field2276;
            if (var4 == -1) {
                arg0.field160 = -1;
            } else {
                label362: {
                    class56 var5 = class66.field941.method1299((byte) -106, var4);
                    if (var3.field2267) {
                        if (var5.field780 == 3) {
                            if (arg0.field266 > 0 && arg0.field238 <= class463.field6224 && class463.field6224 > arg0.field176) {
                                arg0.field160 = -1;
                                break label362;
                            }
                        } else if (var5.field780 == 1 && arg0.field266 > 0 && arg0.field238 <= class463.field6224 && arg0.field176 < class463.field6224) {
                            arg0.field229 = class463.field6224 + 1;
                            break label362;
                        }
                    }
                    if (var5 == null || var5.field771 == null) {
                        arg0.field160 = -1;
                    } else {
                        if (arg0.field220 < 0) {
                            arg0.field220 = 0;
                            if (!arg0.field206) {
                                class758.method4218(0, arg0, 0, var5);
                            }
                        }
                        arg0.field255++;
                        if (var5.field771.length > arg0.field220 && var5.field773[arg0.field220] < arg0.field255) {
                            arg0.field255 = 1;
                            arg0.field220++;
                            if (!arg0.field206) {
                                class758.method4218(arg0.field220, arg0, 0, var5);
                            }
                        }
                        if (var5.field771.length <= arg0.field220) {
                            if (var3.field2267) {
                                arg0.field220 -= var5.field791;
                                arg0.field234++;
                                if (var5.field785 <= arg0.field234) {
                                    arg0.field160 = -1;
                                } else if (arg0.field220 < 0 || arg0.field220 >= var5.field771.length) {
                                    arg0.field160 = -1;
                                } else if (!arg0.field206) {
                                    class758.method4218(arg0.field220, arg0, 0, var5);
                                }
                            } else {
                                arg0.field160 = -1;
                            }
                        }
                        arg0.field178 = arg0.field220 + 1;
                        if (var5.field771.length <= arg0.field178) {
                            if (var3.field2267) {
                                arg0.field178 -= var5.field791;
                                if ((arg0.field234 + 1) >= var5.field785) {
                                    arg0.field178 = -1;
                                } else if (arg0.field178 < 0 || arg0.field178 >= var5.field771.length) {
                                    arg0.field178 = -1;
                                }
                            } else {
                                arg0.field178 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field199 != -1 && class463.field6224 >= arg0.field204) {
            class164 var6 = class234.field3057.method2095(arg0.field199, (byte) 99);
            int var7 = var6.field2276;
            if (var7 == -1) {
                arg0.field199 = -1;
            } else {
                label365: {
                    class56 var8 = class66.field941.method1299((byte) -111, var7);
                    if (var6.field2267) {
                        if (var8.field780 == 3) {
                            if (arg0.field266 > 0 && arg0.field238 <= class463.field6224 && arg0.field176 < class463.field6224) {
                                arg0.field199 = -1;
                                break label365;
                            }
                        } else if (var8.field780 == 1 && arg0.field266 > 0 && class463.field6224 >= arg0.field238 && class463.field6224 > arg0.field176) {
                            arg0.field204 = class463.field6224 + 1;
                            break label365;
                        }
                    }
                    if (var8 == null || var8.field771 == null) {
                        arg0.field199 = -1;
                    } else {
                        if (arg0.field167 < 0) {
                            arg0.field167 = 0;
                            if (!arg0.field206) {
                                class758.method4218(0, arg0, 0, var8);
                            }
                        }
                        arg0.field193++;
                        if (arg0.field167 < var8.field771.length && arg0.field193 > var8.field773[arg0.field167]) {
                            arg0.field193 = 1;
                            arg0.field167++;
                            if (!arg0.field206) {
                                class758.method4218(arg0.field167, arg0, arg1, var8);
                            }
                        }
                        if (var8.field771.length <= arg0.field167) {
                            if (var6.field2267) {
                                arg0.field177++;
                                arg0.field167 -= var8.field791;
                                if (arg0.field177 >= var8.field785) {
                                    arg0.field199 = -1;
                                } else if (arg0.field167 < 0 || var8.field771.length <= arg0.field167) {
                                    arg0.field199 = -1;
                                } else if (!arg0.field206) {
                                    class758.method4218(arg0.field167, arg0, 0, var8);
                                }
                            } else {
                                arg0.field199 = -1;
                            }
                        }
                        arg0.field252 = arg0.field167 + 1;
                        if (arg0.field252 >= var8.field771.length) {
                            if (var6.field2267) {
                                arg0.field252 -= var8.field791;
                                if (var8.field785 <= arg0.field177 + 1) {
                                    arg0.field252 = -1;
                                } else if (arg0.field252 < 0 || var8.field771.length <= arg0.field252) {
                                    arg0.field252 = -1;
                                }
                            } else {
                                arg0.field252 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field153 != -1 && arg0.field171 <= 1) {
            class56 var9 = class66.field941.method1299((byte) -90, arg0.field153);
            if (var9.field780 == 3) {
                if (arg0.field266 > 0 && class463.field6224 >= arg0.field238 && arg0.field176 < class463.field6224) {
                    arg0.field153 = -1;
                    arg0.field165 = null;
                }
            } else if (var9.field780 == 1 && arg0.field266 > 0 && class463.field6224 >= arg0.field238 && arg0.field176 < class463.field6224) {
                arg0.field171 = 2;
            }
        }
        if (arg0.field153 != -1 && arg0.field171 == 0) {
            class56 var10 = class66.field941.method1299((byte) -86, arg0.field153);
            if (var10 == null || var10.field771 == null) {
                arg0.field165 = null;
                arg0.field153 = -1;
            } else {
                arg0.field202++;
                if (arg0.field198 < var10.field771.length && arg0.field202 > var10.field773[arg0.field198]) {
                    arg0.field198++;
                    arg0.field202 = 1;
                    if (!arg0.field206) {
                        class758.method4218(arg0.field198, arg0, 0, var10);
                    }
                }
                if (var10.field771.length <= arg0.field198) {
                    arg0.field198 -= var10.field791;
                    arg0.field172++;
                    if (var10.field785 <= arg0.field172) {
                        arg0.field165 = null;
                        arg0.field153 = -1;
                    } else if (arg0.field198 < 0 || arg0.field198 >= var10.field771.length) {
                        arg0.field153 = -1;
                        arg0.field165 = null;
                    } else if (!arg0.field206) {
                        class758.method4218(arg0.field198, arg0, 0, var10);
                    }
                }
                arg0.field243 = arg0.field198 + 1;
                if (var10.field771.length <= arg0.field243) {
                    arg0.field243 -= var10.field791;
                    if (var10.field785 <= arg0.field172 + 1) {
                        arg0.field243 = -1;
                    } else if (arg0.field243 < 0 || arg0.field243 >= var10.field771.length) {
                        arg0.field243 = -1;
                    }
                }
            }
        }
        if (arg0.field171 > 0) {
            arg0.field171--;
        }
        for (int var11 = arg1; var11 < arg0.field248.length; var11++) {
            class571 var12 = arg0.field248[var11];
            if (var12 != null) {
                if (var12.field8038 > 0) {
                    var12.field8038--;
                } else {
                    class56 var13 = class66.field941.method1299((byte) -89, var12.field8035);
                    if (var13 == null || var13.field771 == null) {
                        arg0.field248[var11] = null;
                    } else {
                        var12.field8036++;
                        if (var12.field8041 < var13.field771.length && var12.field8036 > var13.field773[var12.field8041]) {
                            var12.field8036 = 1;
                            var12.field8041++;
                            if (!arg0.field206) {
                                class758.method4218(var12.field8041, arg0, 0, var13);
                            }
                        }
                        if (var12.field8041 >= var13.field771.length) {
                            var12.field8030++;
                            var12.field8041 -= var13.field791;
                            if (var13.field785 <= var12.field8030) {
                                arg0.field248[var11] = null;
                            } else if (var12.field8041 < 0 || var12.field8041 >= var13.field771.length) {
                                arg0.field248[var11] = null;
                            } else if (!arg0.field206) {
                                class758.method4218(var12.field8041, arg0, 0, var13);
                            }
                        }
                        var12.field8034 = var12.field8041 + 1;
                        if (var13.field771.length <= var12.field8034) {
                            var12.field8034 -= var13.field791;
                            if (var12.field8030 + 1 >= var13.field785) {
                                var12.field8034 = -1;
                            } else if (var12.field8034 < 0 || var13.field771.length <= var12.field8034) {
                                var12.field8034 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Ldfa;")
    public final class168 method3670(byte arg0) {
        int var2 = -77 / ((arg0 - 12) / 34);
        field9086++;
        class168 var3 = this.field9092;
        if (this.field9083 == var3) {
            this.field9092 = null;
            return null;
        } else {
            this.field9092 = var3.field2332;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldfa;Z)V")
    public final void method3671(class168 arg0, boolean arg1) {
        field9088++;
        if (arg1) {
            field9091 = null;
        }
        if (arg0.field2332 != null) {
            arg0.method1175(-2);
        }
        arg0.field2336 = this.field9083;
        arg0.field2332 = this.field9083.field2332;
        arg0.field2332.field2336 = arg0;
        arg0.field2336.field2332 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Ldfa;")
    public final class168 method3672(int arg0) {
        field9085++;
        if (arg0 != -1) {
            method3669(null, 126);
        }
        class168 var2 = this.field9083.field2336;
        if (this.field9083 == var2) {
            this.field9092 = null;
            return null;
        } else {
            this.field9092 = var2.field2336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class653() {
        this.field9083.field2336 = this.field9083;
        this.field9083.field2332 = this.field9083;
    }
}
