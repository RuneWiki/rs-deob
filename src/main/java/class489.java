import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class489 {

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6489 = null;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lra;")
    public static class361 field6493 = new class361(32, 6);

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[[I")
    public static int[][] field6494 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method2676(boolean arg0) {
        field6489 = null;
        if (arg0) {
            method2679(38, 52, -54, 42, 117, 41, -126);
        }
        field6493 = null;
        field6494 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(CB)Z")
    public static final boolean method2677(char arg0, byte arg1) {
        field6492++;
        if (arg1 != -92) {
            method2679(-86, -125, -87, -33, -72, 13, -105);
        }
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILwk;)V")
    public static final void method2678(int arg0, class227 arg1) {
        field6495++;
        arg1.field2954 = 0;
        if (arg1.field3025 != -1) {
            class348 var2 = class552.field7163.method3031(arg0 ^ 0xFFFFFFA0, arg1.field3025);
            if (var2 == null || var2.field4463 == null) {
                arg1.field2976 = false;
                arg1.field3025 = -1;
            } else {
                label397: {
                    arg1.field2990++;
                    if (arg1.field2941 < var2.field4463.length && arg1.field2990 > var2.field4453[arg1.field2941]) {
                        arg1.field2974++;
                        arg1.field2941++;
                        arg1.field2990 = 1;
                        class451.method2548(var2, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field2941);
                    }
                    if (var2.field4463.length <= arg1.field2941) {
                        arg1.field2990 = 0;
                        arg1.field2941 = 0;
                        if (arg1.field2976) {
                            arg1.field3025 = arg1.method1435((byte) 120).method2710(-84);
                            if (arg1.field3025 == -1) {
                                arg1.field2976 = false;
                                break label397;
                            }
                            var2 = class552.field7163.method3031(98, arg1.field3025);
                        }
                        class451.method2548(var2, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field2941);
                    }
                    arg1.field2974 = arg1.field2941 + 1;
                    if (var2.field4463.length <= arg1.field2974) {
                        arg1.field2974 = 0;
                    }
                }
            }
        }
        if (arg1.field2984 != -1 && class424.field5503 >= arg1.field2975) {
            class322 var3 = class91.field1202.method986(arg1.field2984, false);
            int var4 = var3.field4173;
            if (var4 == -1) {
                arg1.field2984 = -1;
            } else {
                label399: {
                    class348 var5 = class552.field7163.method3031(114, var4);
                    if (var3.field4166) {
                        if (var5.field4446 == 3) {
                            if (arg1.field3037 > 0 && arg1.field2973 <= class424.field5503 && class424.field5503 > arg1.field3000) {
                                arg1.field2984 = -1;
                                break label399;
                            }
                        } else if (var5.field4446 == 1 && arg1.field3037 > 0 && class424.field5503 >= arg1.field2973 && arg1.field3000 < class424.field5503) {
                            arg1.field2975 = class424.field5503 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field4463 == null) {
                        arg1.field2984 = -1;
                    } else {
                        if (arg1.field2949 < 0) {
                            arg1.field2949 = 0;
                            class451.method2548(var5, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, 0);
                        }
                        arg1.field2952++;
                        if (var5.field4463.length > arg1.field2949 && var5.field4453[arg1.field2949] < arg1.field2952) {
                            arg1.field2949++;
                            arg1.field2952 = 1;
                            class451.method2548(var5, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field2949);
                        }
                        if (var5.field4463.length <= arg1.field2949) {
                            if (var3.field4166) {
                                arg1.field2986++;
                                arg1.field2949 -= var5.field4443;
                                if (arg1.field2986 >= var5.field4437) {
                                    arg1.field2984 = -1;
                                } else if (arg1.field2949 >= 0 && var5.field4463.length > arg1.field2949) {
                                    class451.method2548(var5, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field2949);
                                } else {
                                    arg1.field2984 = -1;
                                }
                            } else {
                                arg1.field2984 = -1;
                            }
                        }
                        arg1.field2987 = arg1.field2949 + 1;
                        if (var5.field4463.length <= arg1.field2987) {
                            if (var3.field4166) {
                                arg1.field2987 -= var5.field4443;
                                if ((arg1.field2986 + 1) >= var5.field4437) {
                                    arg1.field2987 = -1;
                                } else if (arg1.field2987 < 0 || arg1.field2987 >= var5.field4463.length) {
                                    arg1.field2987 = -1;
                                }
                            } else {
                                arg1.field2987 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3006 != -1 && class424.field5503 >= arg1.field3019) {
            class322 var6 = class91.field1202.method986(arg1.field3006, false);
            int var7 = var6.field4173;
            if (var7 == -1) {
                arg1.field3006 = -1;
            } else {
                label402: {
                    class348 var8 = class552.field7163.method3031(70, var7);
                    if (var6.field4166) {
                        if (var8.field4446 == 3) {
                            if (arg1.field3037 > 0 && class424.field5503 >= arg1.field2973 && class424.field5503 > arg1.field3000) {
                                arg1.field3006 = -1;
                                break label402;
                            }
                        } else if (var8.field4446 == 1 && arg1.field3037 > 0 && class424.field5503 >= arg1.field2973 && class424.field5503 > arg1.field3000) {
                            arg1.field3019 = class424.field5503 + 1;
                            break label402;
                        }
                    }
                    if (var8 == null || var8.field4463 == null) {
                        arg1.field3006 = -1;
                    } else {
                        if (arg1.field3026 < 0) {
                            arg1.field3026 = 0;
                            class451.method2548(var8, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, 0);
                        }
                        arg1.field2969++;
                        if (arg1.field3026 < var8.field4463.length && arg1.field2969 > var8.field4453[arg1.field3026]) {
                            arg1.field3026++;
                            arg1.field2969 = 1;
                            class451.method2548(var8, arg1.field508, arg1.field503, arg1.field506, arg0 ^ 0xFFFFFF00, class233.field3130 == arg1, arg1.field3026);
                        }
                        if (arg1.field3026 >= var8.field4463.length) {
                            if (var6.field4166) {
                                arg1.field3026 -= var8.field4443;
                                arg1.field2980++;
                                if (var8.field4437 <= arg1.field2980) {
                                    arg1.field3006 = -1;
                                } else if (arg1.field3026 >= 0 && arg1.field3026 < var8.field4463.length) {
                                    class451.method2548(var8, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field3026);
                                } else {
                                    arg1.field3006 = -1;
                                }
                            } else {
                                arg1.field3006 = -1;
                            }
                        }
                        arg1.field3023 = arg1.field3026 + 1;
                        if (var8.field4463.length <= arg1.field3023) {
                            if (var6.field4166) {
                                arg1.field3023 -= var8.field4443;
                                if (var8.field4437 <= arg1.field2980 + 1) {
                                    arg1.field3023 = -1;
                                } else if (arg1.field3023 < 0 || var8.field4463.length <= arg1.field3023) {
                                    arg1.field3023 = -1;
                                }
                            } else {
                                arg1.field3023 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3021 != -1 && arg1.field2939 <= 1) {
            class348 var9 = class552.field7163.method3031(arg0 ^ 0xFFFFFFC1, arg1.field3021);
            if (var9.field4446 == 3) {
                if (arg1.field3037 > 0 && arg1.field2973 <= class424.field5503 && arg1.field3000 < class424.field5503) {
                    arg1.field3021 = -1;
                    arg1.field2979 = null;
                }
            } else if (var9.field4446 == 1 && arg1.field3037 > 0 && arg1.field2973 <= class424.field5503 && class424.field5503 > arg1.field3000) {
                arg1.field2939 = 2;
            }
        }
        if (arg1.field3021 != arg0 && arg1.field2939 == 0) {
            class348 var10 = class552.field7163.method3031(77, arg1.field3021);
            if (var10 == null || var10.field4463 == null) {
                arg1.field2979 = null;
                arg1.field3021 = -1;
            } else {
                arg1.field2943++;
                if (var10.field4463.length > arg1.field3015 && arg1.field2943 > var10.field4453[arg1.field3015]) {
                    arg1.field2943 = 1;
                    arg1.field3015++;
                    class451.method2548(var10, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field3015);
                }
                if (var10.field4463.length <= arg1.field3015) {
                    arg1.field2944++;
                    arg1.field3015 -= var10.field4443;
                    if (var10.field4437 <= arg1.field2944) {
                        arg1.field2979 = null;
                        arg1.field3021 = -1;
                    } else if (arg1.field3015 >= 0 && arg1.field3015 < var10.field4463.length) {
                        class451.method2548(var10, arg1.field508, arg1.field503, arg1.field506, 255, class233.field3130 == arg1, arg1.field3015);
                    } else {
                        arg1.field3021 = -1;
                        arg1.field2979 = null;
                    }
                }
                arg1.field2972 = arg1.field3015 + 1;
                if (var10.field4463.length <= arg1.field2972) {
                    arg1.field2972 -= var10.field4443;
                    if ((arg1.field2944 + 1) >= var10.field4437) {
                        arg1.field2972 = -1;
                    } else if (arg1.field2972 < 0 || var10.field4463.length <= arg1.field2972) {
                        arg1.field2972 = -1;
                    }
                }
                arg1.field2954 = var10.field4460;
            }
        }
        if (arg1.field2939 > 0) {
            arg1.field2939--;
        }
        for (int var11 = 0; var11 < arg1.field2991.length; var11++) {
            class71 var12 = arg1.field2991[var11];
            if (var12 != null) {
                if (var12.field967 > 0) {
                    var12.field967--;
                } else {
                    class348 var13 = class552.field7163.method3031(-75, var12.field968);
                    if (var13 == null || var13.field4463 == null) {
                        arg1.field2991[var11] = null;
                    } else {
                        var12.field969++;
                        if (var13.field4463.length > var12.field962 && var12.field969 > var13.field4453[var12.field962]) {
                            var12.field962++;
                            var12.field969 = 1;
                            class451.method2548(var13, arg1.field508, arg1.field503, arg1.field506, arg0 ^ 0xFFFFFF00, class233.field3130 == arg1, var12.field962);
                        }
                        if (var13.field4463.length <= var12.field962) {
                            var12.field962 -= var13.field4443;
                            var12.field964++;
                            if (var13.field4437 <= var12.field964) {
                                arg1.field2991[var11] = null;
                            } else if (var12.field962 >= 0 && var13.field4463.length > var12.field962) {
                                class451.method2548(var13, arg1.field508, arg1.field503, arg1.field506, arg0 + 256, class233.field3130 == arg1, var12.field962);
                            } else {
                                arg1.field2991[var11] = null;
                            }
                        }
                        var12.field960 = var12.field962 + 1;
                        if (var12.field960 >= var13.field4463.length) {
                            var12.field960 -= var13.field4443;
                            if (var12.field964 + 1 >= var13.field4437) {
                                var12.field960 = -1;
                            } else if (var12.field960 < 0 || var12.field960 >= var13.field4463.length) {
                                var12.field960 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class586 var7 = (class586) class686.field9407.method2101(260); var7 != null; var7 = (class586) class686.field9407.method2098((byte) 57)) {
            if (var7.field7943 <= class424.field5503) {
                var7.method2227(32);
            } else {
                class259.method1618(arg5 >> 1, arg6, arg1 >> 1, (var7.field7949 << 9) + 256, -115, var7.field7942, arg4, var7.field7946 * 2, (var7.field7950 << 9) + 256);
                class456.field5983.method3249((byte) 110, var7.field7941 | 0xFF000000, class483.field6441[1] + arg2, var7.field7948, class483.field6441[0] + arg3, 0);
            }
        }
        if (arg0 <= 92) {
            field6489 = null;
        }
        field6491++;
    }
}
