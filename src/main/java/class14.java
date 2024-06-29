import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class14 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public static int[] field176 = new int[32768];

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Z")
    public static boolean field174 = true;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public static int[] field177 = new int[14];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lvg;")
    public static class31 field178;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[Lwj;")
    public static class130[] field180;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        int var1 = 124 % ((arg0 + 77) / 38);
        field176 = null;
        field178 = null;
        field177 = null;
        field180 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method85(int arg0) {
        class38.field464.method67((byte) -122);
        if (arg0 > 64) {
            field171++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field173++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = 125 / ((-arg0 - 54) / 50);
        int var12 = var9 << 1;
        int var13 = var8 << 2;
        int var14 = ((arg5 << 1) - 3) * var10;
        int var15 = arg5 << 1;
        int var16 = var9 - ((var15 - 1) * var10);
        int var17 = (1 - var15) * var8 + var12;
        int var18 = var9 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = ((var6 << 1) + 3) * var12;
        int var21 = (arg5 - 1) * var13;
        if (arg2 >= class286.field4431 && class230.field3302 >= arg2) {
            int var22 = class22.method134(class177.field2514, 14949, arg1 + arg3, class279.field4238);
            int var23 = class22.method134(class177.field2514, 14949, arg1 - arg3, class279.field4238);
            class76.method463(var23, 0, arg4, var22, class268.field3919[arg2]);
        }
        while (var7 > 0) {
            var7--;
            int var24 = arg2 - var7;
            if (var17 < 0) {
                while (var17 < 0) {
                    var17 += var20;
                    var16 += var19;
                    var19 += var18;
                    var20 += var18;
                    var6++;
                }
            }
            if (var16 < 0) {
                var17 += var20;
                var20 += var18;
                var16 += var19;
                var6++;
                var19 += var18;
            }
            var16 += -var14;
            var17 += -var21;
            var14 -= var13;
            int var25 = arg2 + var7;
            var21 -= var13;
            if (class286.field4431 <= var25 && class230.field3302 >= var24) {
                int var26 = class22.method134(class177.field2514, 14949, arg1 + var6, class279.field4238);
                int var27 = class22.method134(class177.field2514, 14949, arg1 - var6, class279.field4238);
                if (var24 >= class286.field4431) {
                    class76.method463(var27, 0, arg4, var26, class268.field3919[var24]);
                }
                if (class230.field3302 >= var25) {
                    class76.method463(var27, 0, arg4, var26, class268.field3919[var25]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[Lwj;")
    public static final class130[] method87(boolean arg0) {
        class130[] var1 = new class130[class133.field1921];
        field179++;
        for (int var2 = 0; var2 < class133.field1921; var2++) {
            int var3 = class91.field1236[var2] * class296.field4677[var2];
            byte[] var4 = class277.field4210[var2];
            if (class151.field2192[var2]) {
                byte[] var7 = class255.field3682[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class220.method1432(class5.method26(255, var7[var9]) << 24, class165.field2367[class5.method26(255, var4[var9])]);
                }
                var1[var2] = new class201(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class165.field2367[class5.method26(255, var4[var6])];
                }
                var1[var2] = new class187(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], var5);
            }
        }
        class294.method1965(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLlc;)V")
    public static final void method88(byte arg0, class290 arg1) {
        arg1.field4593 = false;
        field181++;
        if (arg1.field4579 != -1) {
            class274 var2 = class27.method165(arg1.field4579, (byte) -109);
            if (var2 == null || var2.field4072 == null) {
                arg1.field4579 = -1;
            } else {
                arg1.field4581++;
                if (var2.field4072.length > arg1.field4568 && arg1.field4581 > var2.field4081[arg1.field4568]) {
                    arg1.field4568++;
                    arg1.field4520++;
                    arg1.field4581 = 1;
                    class270.method1730(arg1.field4568, arg1.field4563, arg1.field4553, (byte) -122, var2, class177.field2507 == arg1);
                }
                if (arg1.field4568 >= var2.field4072.length) {
                    arg1.field4581 = 0;
                    arg1.field4568 = 0;
                    class270.method1730(arg1.field4568, arg1.field4563, arg1.field4553, (byte) 64, var2, class177.field2507 == arg1);
                }
                arg1.field4520 = arg1.field4568 + 1;
                if (arg1.field4520 >= var2.field4072.length) {
                    arg1.field4520 = 0;
                }
            }
        }
        if (arg1.field4590 != -1 && class198.field2819 >= arg1.field4507) {
            class101 var3 = class189.method1246(arg1.field4590, (byte) -119);
            int var4 = var3.field1382;
            if (var4 == -1) {
                arg1.field4590 = -1;
            } else {
                label293: {
                    class274 var5 = class27.method165(var4, (byte) 33);
                    if (var3.field1381) {
                        if (var5.field4078 == 3) {
                            if (arg1.field4554 > 0 && class198.field2819 >= arg1.field4564 && arg1.field4515 < class198.field2819) {
                                arg1.field4590 = -1;
                                break label293;
                            }
                        } else if (var5.field4078 == 1 && arg1.field4554 > 0 && class198.field2819 >= arg1.field4564 && arg1.field4515 < class198.field2819) {
                            arg1.field4507 = class198.field2819 + 1;
                            break label293;
                        }
                    }
                    if (var5 == null || var5.field4072 == null) {
                        arg1.field4590 = -1;
                    } else {
                        if (arg1.field4578 < 0) {
                            arg1.field4578 = 0;
                            class270.method1730(0, arg1.field4563, arg1.field4553, (byte) -122, var5, class177.field2507 == arg1);
                        }
                        arg1.field4556++;
                        if (var5.field4072.length > arg1.field4578 && var5.field4081[arg1.field4578] < arg1.field4556) {
                            arg1.field4578++;
                            arg1.field4556 = 1;
                            class270.method1730(arg1.field4578, arg1.field4563, arg1.field4553, (byte) 68, var5, class177.field2507 == arg1);
                        }
                        if (arg1.field4578 >= var5.field4072.length) {
                            if (var3.field1381) {
                                arg1.field4506++;
                                arg1.field4578 -= var5.field4068;
                                if (arg1.field4506 >= var5.field4070) {
                                    arg1.field4590 = -1;
                                } else if (arg1.field4578 >= 0 && arg1.field4578 < var5.field4072.length) {
                                    class270.method1730(arg1.field4578, arg1.field4563, arg1.field4553, (byte) -121, var5, class177.field2507 == arg1);
                                } else {
                                    arg1.field4590 = -1;
                                }
                            } else {
                                arg1.field4590 = -1;
                            }
                        }
                        arg1.field4542 = arg1.field4578 + 1;
                        if (var5.field4072.length <= arg1.field4542) {
                            if (var3.field1381) {
                                arg1.field4542 -= var5.field4068;
                                if ((arg1.field4506 + 1) >= var5.field4070) {
                                    arg1.field4542 = -1;
                                } else if (arg1.field4542 < 0 || arg1.field4542 >= var5.field4072.length) {
                                    arg1.field4542 = -1;
                                }
                            } else {
                                arg1.field4542 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4592 != -1 && arg1.field4518 <= 1) {
            class274 var6 = class27.method165(arg1.field4592, (byte) -126);
            if (var6.field4078 == 3) {
                if (arg1.field4554 > 0 && arg1.field4564 <= class198.field2819 && class198.field2819 > arg1.field4515) {
                    arg1.field4592 = -1;
                }
            } else if (var6.field4078 == 1 && arg1.field4554 > 0 && arg1.field4564 <= class198.field2819 && class198.field2819 > arg1.field4515) {
                arg1.field4518 = 1;
            }
        }
        if (arg1.field4592 != -1 && arg1.field4518 == 0) {
            class274 var7 = class27.method165(arg1.field4592, (byte) 125);
            if (var7 == null || var7.field4072 == null) {
                arg1.field4592 = -1;
            } else {
                arg1.field4503++;
                if (var7.field4072.length > arg1.field4567 && arg1.field4503 > var7.field4081[arg1.field4567]) {
                    arg1.field4503 = 1;
                    arg1.field4567++;
                    class270.method1730(arg1.field4567, arg1.field4563, arg1.field4553, (byte) -127, var7, class177.field2507 == arg1);
                }
                if (var7.field4072.length <= arg1.field4567) {
                    arg1.field4565++;
                    arg1.field4567 -= var7.field4068;
                    if (var7.field4070 <= arg1.field4565) {
                        arg1.field4592 = -1;
                    } else if (arg1.field4567 >= 0 && arg1.field4567 < var7.field4072.length) {
                        class270.method1730(arg1.field4567, arg1.field4563, arg1.field4553, (byte) 124, var7, class177.field2507 == arg1);
                    } else {
                        arg1.field4592 = -1;
                    }
                }
                arg1.field4580 = arg1.field4567 + 1;
                if (var7.field4072.length <= arg1.field4580) {
                    arg1.field4580 -= var7.field4068;
                    if (arg1.field4565 + 1 >= var7.field4070) {
                        arg1.field4580 = -1;
                    } else if (arg1.field4580 < 0 || var7.field4072.length <= arg1.field4580) {
                        arg1.field4580 = -1;
                    }
                }
                arg1.field4593 = var7.field4096;
            }
        }
        if (arg1.field4518 > 0) {
            arg1.field4518--;
        }
        int var8 = 0;
        int var9 = 54 / ((arg0 + 43) / 40);
        while (arg1.field4540.length > var8) {
            class214 var10 = arg1.field4540[var8];
            if (var10 != null) {
                if (var10.field2991 > 0) {
                    var10.field2991--;
                } else {
                    class274 var11 = class27.method165(var10.field2988, (byte) 18);
                    if (var11 == null || var11.field4072 == null) {
                        arg1.field4540[var8] = null;
                    } else {
                        var10.field2992++;
                        if (var10.field2994 < var11.field4072.length && var11.field4081[var10.field2994] < var10.field2992) {
                            var10.field2994++;
                            var10.field2992 = 1;
                            class270.method1730(var10.field2994, arg1.field4563, arg1.field4553, (byte) 37, var11, class177.field2507 == arg1);
                        }
                        if (var11.field4072.length <= var10.field2994) {
                            var10.field2987++;
                            var10.field2994 -= var11.field4068;
                            if (var11.field4070 <= var10.field2987) {
                                arg1.field4540[var8] = null;
                            } else if (var10.field2994 >= 0 && var11.field4072.length > var10.field2994) {
                                class270.method1730(var10.field2994, arg1.field4563, arg1.field4553, (byte) -114, var11, class177.field2507 == arg1);
                            } else {
                                arg1.field4540[var8] = null;
                            }
                        }
                        var10.field2995 = var10.field2994 + 1;
                        if (var11.field4072.length <= var10.field2995) {
                            var10.field2995 -= var11.field4068;
                            if (var11.field4070 <= var10.field2987 + 1) {
                                var10.field2995 = -1;
                            } else if (var10.field2995 < 0 || var11.field4072.length <= var10.field2995) {
                                var10.field2995 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLmc;ILmc;ZII)I")
    public static final int method89(boolean arg0, class176 arg1, int arg2, class176 arg3, boolean arg4, int arg5, int arg6) {
        field172++;
        int var7 = class19.method115(arg1, true, arg3, arg0, arg5);
        if (arg2 != var7) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class19.method115(arg1, true, arg3, arg4, arg6);
            return arg4 ? -var8 : var8;
        }
    }
}
