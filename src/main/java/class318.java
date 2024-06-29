import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class318 extends class285 {

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lgi;")
    public static class109 field4944 = new class109(64);

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field4950 = "slide:";

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Ltm;")
    public static class127 field4947;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "[I")
    public static int[] field4948;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[B)Z", line = 4)
    public static final boolean method2237(byte arg0, byte[] arg1) {
        field4943++;
        if (arg0 != 32) {
            return true;
        }
        class44 var2 = new class44(arg1);
        int var3 = var2.method286((byte) -86);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method286((byte) -123) == 1;
        if (var4) {
            class287.method2062(13859, var2);
        }
        class297.method2121((byte) 74, var2);
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V", line = 30)
    public static void method2238(byte arg0) {
        if (arg0 != 79) {
            method2241(123, (class263) null);
        }
        field4950 = null;
        field4947 = null;
        field4948 = null;
        field4944 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I", line = 44)
    public static final int method2239(int arg0, int arg1) {
        field4937++;
        if (arg1 != -1) {
            method2239(-118, -122);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[[I", line = 64)
    public final int[][] method62(byte arg0, int arg1) {
        field4939++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = this.method2048(2, (byte) 127, arg1);
            int[][] var5 = this.method2053((byte) 106, 0, arg1);
            int[][] var6 = this.method2053((byte) -111, 1, arg1);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class287.field4599; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var9[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg0 <= 121) {
            method2241(-125, (class263) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLjj;I)V", line = 137)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            method2240(false, (class339) null, 13, (class339) null, false, -69, 56);
        }
        field4938++;
        if (arg2 == 0) {
            this.field4572 = arg1.method286((byte) -98) == 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLt;ILt;ZII)I", line = 157)
    public static final int method2240(boolean arg0, class339 arg1, int arg2, class339 arg3, boolean arg4, int arg5, int arg6) {
        field4941++;
        int var7 = class43.method216(arg5, arg4, arg3, arg1, (byte) -104);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = 29 % ((-arg6 - 13) / 49);
            int var9 = class43.method216(arg2, arg0, arg3, arg1, (byte) -104);
            return arg0 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILrf;)V", line = 187)
    public static final void method2241(int arg0, class263 arg1) {
        int var2 = 86 % ((arg0 - 24) / 46);
        arg1.field4247 = false;
        field4942++;
        if (arg1.field4232 != -1) {
            class202 var3 = class325.method2274(arg1.field4232, -104);
            if (var3 == null || var3.field3293 == null) {
                arg1.field4232 = -1;
            } else {
                arg1.field4195++;
                if (var3.field3293.length > arg1.field4212 && var3.field3290[arg1.field4212] < arg1.field4195) {
                    arg1.field4195 = 1;
                    arg1.field4191++;
                    arg1.field4212++;
                    class190.method1411(31, class191.field3129 == arg1, var3, arg1.field4264, arg1.field4212, arg1.field4255);
                }
                if (arg1.field4212 >= var3.field3293.length) {
                    arg1.field4212 = 0;
                    arg1.field4195 = 0;
                    class190.method1411(31, class191.field3129 == arg1, var3, arg1.field4264, arg1.field4212, arg1.field4255);
                }
                arg1.field4191 = arg1.field4212 + 1;
                if (var3.field3293.length <= arg1.field4191) {
                    arg1.field4191 = 0;
                }
            }
        }
        if (arg1.field4278 != -1 && arg1.field4236 <= class240.field3818) {
            class323 var4 = class215.method1545(arg1.field4278, 1);
            int var5 = var4.field5011;
            if (var5 == -1) {
                arg1.field4278 = -1;
            } else {
                label307: {
                    class202 var6 = class325.method2274(var5, -122);
                    if (var4.field5008) {
                        if (var6.field3305 == 3) {
                            if (arg1.field4279 > 0 && class240.field3818 >= arg1.field4200 && arg1.field4252 < class240.field3818) {
                                arg1.field4278 = -1;
                                break label307;
                            }
                        } else if (var6.field3305 == 1 && arg1.field4279 > 0 && class240.field3818 >= arg1.field4200 && class240.field3818 > arg1.field4252) {
                            arg1.field4236 = class240.field3818 + 1;
                            break label307;
                        }
                    }
                    if (var6 == null || var6.field3293 == null) {
                        arg1.field4278 = -1;
                    } else {
                        if (arg1.field4276 < 0) {
                            arg1.field4276 = 0;
                            class190.method1411(31, class191.field3129 == arg1, var6, arg1.field4264, 0, arg1.field4255);
                        }
                        arg1.field4211++;
                        if (arg1.field4276 < var6.field3293.length && var6.field3290[arg1.field4276] < arg1.field4211) {
                            arg1.field4276++;
                            arg1.field4211 = 1;
                            class190.method1411(31, class191.field3129 == arg1, var6, arg1.field4264, arg1.field4276, arg1.field4255);
                        }
                        if (arg1.field4276 >= var6.field3293.length) {
                            if (var4.field5008) {
                                arg1.field4276 -= var6.field3301;
                                arg1.field4226++;
                                if (var6.field3295 <= arg1.field4226) {
                                    arg1.field4278 = -1;
                                } else if (arg1.field4276 >= 0 && arg1.field4276 < var6.field3293.length) {
                                    class190.method1411(31, class191.field3129 == arg1, var6, arg1.field4264, arg1.field4276, arg1.field4255);
                                } else {
                                    arg1.field4278 = -1;
                                }
                            } else {
                                arg1.field4278 = -1;
                            }
                        }
                        arg1.field4267 = arg1.field4276 + 1;
                        if (arg1.field4267 >= var6.field3293.length) {
                            if (var4.field5008) {
                                arg1.field4267 -= var6.field3301;
                                if ((arg1.field4226 + 1) >= var6.field3295) {
                                    arg1.field4267 = -1;
                                } else if (arg1.field4267 < 0 || arg1.field4267 >= var6.field3293.length) {
                                    arg1.field4267 = -1;
                                }
                            } else {
                                arg1.field4267 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4268 != -1 && arg1.field4190 <= 1) {
            class202 var7 = class325.method2274(arg1.field4268, -107);
            if (var7.field3305 == 3) {
                if (arg1.field4279 > 0 && class240.field3818 >= arg1.field4200 && class240.field3818 > arg1.field4252) {
                    arg1.field4268 = -1;
                }
            } else if (var7.field3305 == 1 && arg1.field4279 > 0 && class240.field3818 >= arg1.field4200 && arg1.field4252 < class240.field3818) {
                arg1.field4190 = 1;
            }
        }
        if (arg1.field4268 != -1 && arg1.field4190 == 0) {
            class202 var8 = class325.method2274(arg1.field4268, -65);
            if (var8 == null || var8.field3293 == null) {
                arg1.field4268 = -1;
            } else {
                arg1.field4201++;
                if (arg1.field4265 < var8.field3293.length && arg1.field4201 > var8.field3290[arg1.field4265]) {
                    arg1.field4265++;
                    arg1.field4201 = 1;
                    class190.method1411(31, class191.field3129 == arg1, var8, arg1.field4264, arg1.field4265, arg1.field4255);
                }
                if (arg1.field4265 >= var8.field3293.length) {
                    arg1.field4265 -= var8.field3301;
                    arg1.field4250++;
                    if (var8.field3295 <= arg1.field4250) {
                        arg1.field4268 = -1;
                    } else if (arg1.field4265 >= 0 && arg1.field4265 < var8.field3293.length) {
                        class190.method1411(31, class191.field3129 == arg1, var8, arg1.field4264, arg1.field4265, arg1.field4255);
                    } else {
                        arg1.field4268 = -1;
                    }
                }
                arg1.field4237 = arg1.field4265 + 1;
                if (arg1.field4237 >= var8.field3293.length) {
                    arg1.field4237 -= var8.field3301;
                    if (var8.field3295 <= arg1.field4250 + 1) {
                        arg1.field4237 = -1;
                    } else if (arg1.field4237 < 0 || arg1.field4237 >= var8.field3293.length) {
                        arg1.field4237 = -1;
                    }
                }
                arg1.field4247 = var8.field3294;
            }
        }
        if (arg1.field4190 > 0) {
            arg1.field4190--;
        }
        for (int var9 = 0; var9 < arg1.field4274.length; var9++) {
            class240 var10 = arg1.field4274[var9];
            if (var10 != null) {
                if (var10.field3808 > 0) {
                    var10.field3808--;
                } else {
                    class202 var11 = class325.method2274(var10.field3812, -120);
                    if (var11 == null || var11.field3293 == null) {
                        arg1.field4274[var9] = null;
                    } else {
                        var10.field3807++;
                        if (var10.field3816 < var11.field3293.length && var11.field3290[var10.field3816] < var10.field3807) {
                            var10.field3816++;
                            var10.field3807 = 1;
                            class190.method1411(31, class191.field3129 == arg1, var11, arg1.field4264, var10.field3816, arg1.field4255);
                        }
                        if (var10.field3816 >= var11.field3293.length) {
                            var10.field3810++;
                            var10.field3816 -= var11.field3301;
                            if (var10.field3810 >= var11.field3295) {
                                arg1.field4274[var9] = null;
                            } else if (var10.field3816 >= 0 && var10.field3816 < var11.field3293.length) {
                                class190.method1411(31, class191.field3129 == arg1, var11, arg1.field4264, var10.field3816, arg1.field4255);
                            } else {
                                arg1.field4274[var9] = null;
                            }
                        }
                        var10.field3811 = var10.field3816 + 1;
                        if (var11.field3293.length <= var10.field3811) {
                            var10.field3811 -= var11.field3301;
                            if (var11.field3295 <= var10.field3810 + 1) {
                                var10.field3811 = -1;
                            } else if (var10.field3811 < 0 || var10.field3811 >= var11.field3293.length) {
                                var10.field3811 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 484)
    public class318() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)[I", line = 502)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            field4947 = (class127) null;
        }
        field4940++;
        int[] var3 = this.field4573.method1116(112, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 124, arg1);
            int[] var5 = this.method2048(1, (byte) 127, arg1);
            int[] var6 = this.method2048(2, (byte) 125, arg1);
            for (int var7 = 0; var7 < class287.field4599; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
