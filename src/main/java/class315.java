import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class315 extends class381 {

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Z")
    public static boolean field4278 = false;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lnp;")
    public static class207 field4277;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lfp;")
    public static class7 field4275;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[B")
    public static byte[] field4276;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLsb;)V", line = 9)
    public static final void method2006(byte arg0, class362 arg1) {
        field4282++;
        arg1.field4929 = false;
        if (arg1.field4941 != -1) {
            class209 var2 = class288.method1819(arg1.field4941, (byte) 105);
            if (var2 == null || var2.field2915 == null) {
                arg1.field4941 = -1;
                arg1.field4982 = false;
            } else {
                label299: {
                    arg1.field4925++;
                    if (arg1.field4919 < var2.field2915.length && var2.field2894[arg1.field4919] < arg1.field4925) {
                        arg1.field4925 = 1;
                        arg1.field4919++;
                        arg1.field4979++;
                        class232.method1547(13238, var2, arg1.field3167, class95.field1379 == arg1, arg1.field4919, arg1.field3176);
                    }
                    if (arg1.field4919 >= var2.field2915.length) {
                        arg1.field4925 = 0;
                        arg1.field4919 = 0;
                        if (arg1.field4982) {
                            arg1.field4941 = arg1.method2280(76).method2694((byte) -127);
                            if (arg1.field4941 == -1) {
                                arg1.field4982 = false;
                                break label299;
                            }
                            var2 = class288.method1819(arg1.field4941, (byte) 105);
                        }
                        class232.method1547(13238, var2, arg1.field3167, class95.field1379 == arg1, arg1.field4919, arg1.field3176);
                    }
                    arg1.field4979 = arg1.field4919 + 1;
                    if (arg1.field4979 >= var2.field2915.length) {
                        arg1.field4979 = 0;
                    }
                }
            }
        }
        if (arg1.field4974 != -1 && class414.field5793 >= arg1.field4933) {
            class282 var3 = class71.method613(arg1.field4974, (byte) -83);
            int var4 = var3.field3765;
            if (var4 == -1) {
                arg1.field4974 = -1;
            } else {
                label301: {
                    class209 var5 = class288.method1819(var4, (byte) 105);
                    if (var3.field3768) {
                        if (var5.field2912 == 3) {
                            if (arg1.field4999 > 0 && class414.field5793 >= arg1.field4940 && arg1.field4986 < class414.field5793) {
                                arg1.field4974 = -1;
                                break label301;
                            }
                        } else if (var5.field2912 == 1 && arg1.field4999 > 0 && class414.field5793 >= arg1.field4940 && arg1.field4986 < class414.field5793) {
                            arg1.field4933 = class414.field5793 + 1;
                            break label301;
                        }
                    }
                    if (var5 == null || var5.field2915 == null) {
                        arg1.field4974 = -1;
                    } else {
                        if (arg1.field4965 < 0) {
                            arg1.field4965 = 0;
                            class232.method1547(13238, var5, arg1.field3167, class95.field1379 == arg1, 0, arg1.field3176);
                        }
                        arg1.field4971++;
                        if (var5.field2915.length > arg1.field4965 && arg1.field4971 > var5.field2894[arg1.field4965]) {
                            arg1.field4965++;
                            arg1.field4971 = 1;
                            class232.method1547(13238, var5, arg1.field3167, class95.field1379 == arg1, arg1.field4965, arg1.field3176);
                        }
                        if (var5.field2915.length <= arg1.field4965) {
                            if (var3.field3768) {
                                arg1.field4965 -= var5.field2896;
                                arg1.field4945++;
                                if (arg1.field4945 >= var5.field2910) {
                                    arg1.field4974 = -1;
                                } else if (arg1.field4965 >= 0 && arg1.field4965 < var5.field2915.length) {
                                    class232.method1547(13238, var5, arg1.field3167, class95.field1379 == arg1, arg1.field4965, arg1.field3176);
                                } else {
                                    arg1.field4974 = -1;
                                }
                            } else {
                                arg1.field4974 = -1;
                            }
                        }
                        arg1.field4978 = arg1.field4965 + 1;
                        if (var5.field2915.length <= arg1.field4978) {
                            if (var3.field3768) {
                                arg1.field4978 -= var5.field2896;
                                if ((arg1.field4945 + 1) >= var5.field2910) {
                                    arg1.field4978 = -1;
                                } else if (arg1.field4978 < 0 || arg1.field4978 >= var5.field2915.length) {
                                    arg1.field4978 = -1;
                                }
                            } else {
                                arg1.field4978 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4980 != -1 && arg1.field4934 <= 1) {
            class209 var6 = class288.method1819(arg1.field4980, (byte) 105);
            if (var6.field2912 == 3) {
                if (arg1.field4999 > 0 && arg1.field4940 <= class414.field5793 && class414.field5793 > arg1.field4986) {
                    arg1.field4980 = -1;
                }
            } else if (var6.field2912 == 1 && arg1.field4999 > 0 && class414.field5793 >= arg1.field4940 && arg1.field4986 < class414.field5793) {
                arg1.field4934 = 2;
            }
        }
        int var7 = -8 % ((-arg0 - 44) / 53);
        if (arg1.field4980 != -1 && arg1.field4934 == 0) {
            class209 var8 = class288.method1819(arg1.field4980, (byte) 105);
            if (var8 == null || var8.field2915 == null) {
                arg1.field4980 = -1;
            } else {
                arg1.field4985++;
                if (arg1.field4959 < var8.field2915.length && arg1.field4985 > var8.field2894[arg1.field4959]) {
                    arg1.field4985 = 1;
                    arg1.field4959++;
                    class232.method1547(13238, var8, arg1.field3167, class95.field1379 == arg1, arg1.field4959, arg1.field3176);
                }
                if (arg1.field4959 >= var8.field2915.length) {
                    arg1.field4962++;
                    arg1.field4959 -= var8.field2896;
                    if (var8.field2910 <= arg1.field4962) {
                        arg1.field4980 = -1;
                    } else if (arg1.field4959 >= 0 && var8.field2915.length > arg1.field4959) {
                        class232.method1547(13238, var8, arg1.field3167, class95.field1379 == arg1, arg1.field4959, arg1.field3176);
                    } else {
                        arg1.field4980 = -1;
                    }
                }
                arg1.field4993 = arg1.field4959 + 1;
                if (var8.field2915.length <= arg1.field4993) {
                    arg1.field4993 -= var8.field2896;
                    if (var8.field2910 <= arg1.field4962 + 1) {
                        arg1.field4993 = -1;
                    } else if (arg1.field4993 < 0 || var8.field2915.length <= arg1.field4993) {
                        arg1.field4993 = -1;
                    }
                }
                arg1.field4929 = var8.field2913;
            }
        }
        if (arg1.field4934 > 0) {
            arg1.field4934--;
        }
        for (int var9 = 0; var9 < arg1.field4990.length; var9++) {
            class291 var10 = arg1.field4990[var9];
            if (var10 != null) {
                if (var10.field3952 > 0) {
                    var10.field3952--;
                } else {
                    class209 var11 = class288.method1819(var10.field3955, (byte) 105);
                    if (var11 == null || var11.field2915 == null) {
                        arg1.field4990[var9] = null;
                    } else {
                        var10.field3946++;
                        if (var10.field3945 < var11.field2915.length && var10.field3946 > var11.field2894[var10.field3945]) {
                            var10.field3945++;
                            var10.field3946 = 1;
                            class232.method1547(13238, var11, arg1.field3167, class95.field1379 == arg1, var10.field3945, arg1.field3176);
                        }
                        if (var11.field2915.length <= var10.field3945) {
                            var10.field3945 -= var11.field2896;
                            var10.field3951++;
                            if (var10.field3951 >= var11.field2910) {
                                arg1.field4990[var9] = null;
                            } else if (var10.field3945 >= 0 && var10.field3945 < var11.field2915.length) {
                                class232.method1547(13238, var11, arg1.field3167, class95.field1379 == arg1, var10.field3945, arg1.field3176);
                            } else {
                                arg1.field4990[var9] = null;
                            }
                        }
                        var10.field3948 = var10.field3945 + 1;
                        if (var10.field3948 >= var11.field2915.length) {
                            var10.field3948 -= var11.field2896;
                            if (var10.field3951 + 1 >= var11.field2910) {
                                var10.field3948 = -1;
                            } else if (var10.field3948 < 0 || var11.field2915.length <= var10.field3948) {
                                var10.field3948 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 336)
    public static void method2007(boolean arg0) {
        if (arg0) {
            method2007(true);
        }
        field4277 = null;
        field4275 = null;
        field4276 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V", line = 347)
    public class315(int arg0, int arg1) {
        this.field4279 = arg0;
        this.field4280 = arg1;
    }
}
