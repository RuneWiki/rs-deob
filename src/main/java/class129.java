import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class129 extends class88 {

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[B")
    public byte[] field2067;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2074 = "slide:";

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "Z")
    public static boolean field2065;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "[I")
    public static int[] field2072;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "[Lib;")
    public static class56[] field2066;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLwb;)V")
    public static final void method875(byte arg0, class123 arg1) {
        if (arg0 == -21) {
            if (class74.field929 == arg1.field1898) {
                class21.field279[arg1.field1903] = true;
            }
            field2070++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class209.field3336.field497; var9++) {
            if (class209.field3336.method220((byte) 92, var9)) {
                int[] var10 = class238.field3928.method1020(class209.field3336.field494[var9] & 0x3FFF, (byte) 63, class209.field3336.field494[var9] >> 28 & 0x3, (class209.field3336.field494[var9] & 0xFFFFFBB) >> 14);
                if (var10 != null) {
                    int var11 = var10[1] - class105.field1413;
                    int var12 = arg2 + ((var11 - arg1) * (arg0 - arg2) / (arg6 - arg1));
                    class38 var13 = null;
                    int var14 = 16777215;
                    int var15 = class42.field524 + class7.field88 - var10[2] - 1;
                    int var16 = class209.field3336.method216(var9, -7010);
                    int var17 = arg4 + ((arg3 - arg4) * (var15 - arg7) / (arg8 - arg7));
                    if (var16 == 0) {
                        if ((double) class250.field4084 == 3.0D) {
                            var13 = class124.field1934;
                        }
                        if ((double) class250.field4084 == 4.0D) {
                            var13 = class24.field343;
                        }
                        if ((double) class250.field4084 == 6.0D) {
                            var13 = class247.field4072;
                        }
                        if ((double) class250.field4084 >= 8.0D) {
                            var13 = class296.field4688;
                        }
                    }
                    if (var16 == 1) {
                        if ((double) class250.field4084 == 3.0D) {
                            var13 = class247.field4072;
                        }
                        if ((double) class250.field4084 == 4.0D) {
                            var13 = class296.field4688;
                        }
                        if ((double) class250.field4084 == 6.0D) {
                            var13 = class51.field672;
                        }
                        if ((double) class250.field4084 >= 8.0D) {
                            var13 = class209.field3332;
                        }
                    }
                    if (var16 == 2) {
                        if ((double) class250.field4084 == 3.0D) {
                            var13 = class51.field672;
                        }
                        if ((double) class250.field4084 == 4.0D) {
                            var13 = class209.field3332;
                        }
                        var14 = 16755200;
                        if ((double) class250.field4084 == 6.0D) {
                            var13 = class92.field1159;
                        }
                        if ((double) class250.field4084 >= 8.0D) {
                            var13 = class134.field2121;
                        }
                    }
                    if (class209.field3336.field491[var9] != -1) {
                        var14 = class209.field3336.field491[var9];
                    }
                    if (var13 != null) {
                        int var18 = class5.field84.method684(class209.field3336.field492[var9], (int[]) null, class110.field1557);
                        int var19 = var17 - var13.method200() * (var18 - 1) / 2;
                        int var20 = var19 + var13.method208() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class110.field1557[var21];
                            if (var18 - 1 > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var13.method203(var22, var12, var20, var14, true);
                            var20 += var13.method200();
                        }
                    }
                }
            }
        }
        if (!arg5) {
            field2075++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)I")
    public static final int method877(byte arg0) {
        if (arg0 == -25) {
            field2076++;
            return class44.field570 && class36.field467[81] && class34.field437 > 2 ? class187.field2989[class34.field437 - 2] : class187.field2989[class34.field437 - 1];
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Lwj;")
    public static final class149 method878(int arg0) {
        field2063++;
        class149 var1 = new class149(class286.field4562, class245.field4018, class40.field493[0], field2072[0], class103.field1387[0], class172.field2726[0], class293.field4645[0], class172.field2729);
        class24.method135(-112);
        if (arg0 != 25860) {
            field2068 = 77;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)V")
    public static final void method879(long arg0, int arg1) {
        field2064++;
        if (arg0 == 0L || arg1 != -1) {
            return;
        }
        for (int var3 = 0; var3 < class88.field1091; var3++) {
            if (class251.field4108[var3] == arg0) {
                class55.field703++;
                class88.field1091--;
                for (int var4 = var3; var4 < class88.field1091; var4++) {
                    class143.field2256[var4] = class143.field2256[var4 + 1];
                    class188.field3055[var4] = class188.field3055[var4 + 1];
                    class34.field443[var4] = class34.field443[var4 + 1];
                    class251.field4108[var4] = class251.field4108[var4 + 1];
                    client.field1605[var4] = client.field1605[var4 + 1];
                    class219.field3503[var4] = class219.field3503[var4 + 1];
                }
                class68.field856 = class162.field2582;
                class4.field57.method1932(false, 2);
                class4.field57.method590(arg0, 1027669520);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Leh;I)Z")
    public static final boolean method880(class137 arg0, int arg1) {
        if (arg1 != 3) {
            field2074 = null;
        }
        field2062++;
        return arg0.method938(class117.field1655, 843075268);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method881(int arg0, int arg1) {
        field2073++;
        if (arg1 != 1000000) {
            field2065 = true;
        }
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class83.field1027 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class55.field704 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
    public static final void method882(byte arg0, int arg1) {
        field2077++;
        int var2 = -84 % ((-arg0 - 50) / 35);
        class233 var3 = class114.method746(arg1, 1228126432, 10);
        var3.method1653(false);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([B)V")
    public class129(byte[] arg0) {
        this.field2067 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    public static void method883(int arg0) {
        if (arg0 >= -29) {
            field2066 = null;
        }
        field2074 = null;
        field2072 = null;
        field2066 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILlb;II)V")
    public static final void method884(int arg0, int arg1, int arg2, class210 arg3, int arg4, int arg5) {
        field2071++;
        if (arg3.field3376 == -1 && arg3.field3370 == null || arg0 <= 97) {
            return;
        }
        int var6 = class63.field818 * arg3.field3352 >> 8;
        int var7 = 0;
        if (arg3.field3379 < arg2) {
            var7 += arg2 - arg3.field3379;
        } else if (arg3.field3366 > arg2) {
            var7 += arg3.field3366 - arg2;
        }
        if (arg1 > arg3.field3371) {
            var7 += arg1 - arg3.field3371;
        } else if (arg1 < arg3.field3362) {
            var7 += arg3.field3362 - arg1;
        }
        if (arg3.field3369 == 0 || (var7 - 64) > arg3.field3369 || class63.field818 == 0 || arg3.field3364 != arg5) {
            if (arg3.field3353 != null) {
                class191.field3082.method1951(arg3.field3353);
                arg3.field3353 = null;
            }
            if (arg3.field3377 != null) {
                class191.field3082.method1951(arg3.field3377);
                arg3.field3377 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg3.field3369 - var7) * var6 / arg3.field3369;
        if (arg3.field3353 != null) {
            arg3.field3353.method1364(var8);
        } else if (arg3.field3376 >= 0) {
            class169 var9 = class169.method1158(class219.field3511, arg3.field3376, 0);
            if (var9 != null) {
                class29 var10 = var9.method1156().method167(class294.field4662);
                class193 var11 = class193.method1337(var10, 100, var8);
                var11.method1336(-1);
                class191.field3082.method1954(var11);
                arg3.field3353 = var11;
            }
        }
        if (arg3.field3377 != null) {
            arg3.field3377.method1364(var8);
            if (arg3.field3377.method1674(-55)) {
                return;
            }
            arg3.field3377 = null;
        } else if (arg3.field3370 != null && (arg3.field3357 -= arg4) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field3370.length);
            class169 var13 = class169.method1158(class219.field3511, arg3.field3370[var12], 0);
            if (var13 != null) {
                class29 var14 = var13.method1156().method167(class294.field4662);
                class193 var15 = class193.method1337(var14, 100, var8);
                var15.method1336(0);
                class191.field3082.method1954(var15);
                arg3.field3357 = (int) ((double) (arg3.field3367 - arg3.field3363) * Math.random()) + arg3.field3363;
                arg3.field3377 = var15;
                return;
            }
        }
    }
}
