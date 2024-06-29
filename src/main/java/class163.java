import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class163 extends class435 {

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field2129 = 1401;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "[[I")
    public static int[][] field2120 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lrh;")
    public class175 field2114;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lrd;")
    public class224 field2128;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lvi;")
    public class379 field2136;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ljj;")
    public class77 field2125;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIZ)V")
    public static final void method957(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        class126.field1624 = 0L;
        field2119++;
        int var5 = class423.method2612(2);
        if (arg1 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class343.field4596.method1229()) {
            arg4 = true;
        }
        class164.method961(arg4, var5, arg0, arg3, arg1, (byte) 115);
        if (arg2) {
            method960(null, 12);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final void method958(int arg0) {
        this.field2136 = null;
        this.field2125 = null;
        this.field2128 = null;
        int var2 = -37 % ((-arg0 - 52) / 56);
        this.field2114 = null;
        field2116++;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method959(int arg0) {
        if (arg0 == 0) {
            field2120 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwk;I)V")
    public static final void method960(class96 arg0, int arg1) {
        field2137++;
        if (arg1 != 7) {
            return;
        }
        arg0.field1228 = 0;
        if (arg0.field1216 != -1) {
            class260 var2 = class7.field97.method2951(arg0.field1216, -13765);
            if (var2 == null || var2.field3474 == null) {
                arg0.field1176 = false;
                arg0.field1216 = -1;
            } else {
                label401: {
                    arg0.field1186++;
                    if (var2.field3474.length > arg0.field1159 && var2.field3489[arg0.field1159] < arg0.field1186) {
                        arg0.field1159++;
                        arg0.field1245++;
                        arg0.field1186 = 1;
                        class276.method1678(var2, arg0.field3695, arg0.field3704, (byte) 96, arg0.field3694, class96.field1170 == arg0, arg0.field1159);
                    }
                    if (var2.field3474.length <= arg0.field1159) {
                        arg0.field1159 = 0;
                        arg0.field1186 = 0;
                        if (arg0.field1176) {
                            arg0.field1216 = arg0.method547((byte) 117).method1829(true);
                            if (arg0.field1216 == -1) {
                                arg0.field1176 = false;
                                break label401;
                            }
                            var2 = class7.field97.method2951(arg0.field1216, -13765);
                        }
                        class276.method1678(var2, arg0.field3695, arg0.field3704, (byte) 110, arg0.field3694, class96.field1170 == arg0, arg0.field1159);
                    }
                    arg0.field1245 = arg0.field1159 + 1;
                    if (arg0.field1245 >= var2.field3474.length) {
                        arg0.field1245 = 0;
                    }
                }
            }
        }
        if (arg0.field1210 != -1 && arg0.field1187 <= class532.field7836) {
            class88 var3 = class71.field914.method1608((byte) 82, arg0.field1210);
            int var4 = var3.field1047;
            if (var4 == -1) {
                arg0.field1210 = -1;
            } else {
                label403: {
                    class260 var5 = class7.field97.method2951(var4, -13765);
                    if (var3.field1051) {
                        if (var5.field3483 == 3) {
                            if (arg0.field1257 > 0 && class532.field7836 >= arg0.field1213 && class532.field7836 > arg0.field1163) {
                                arg0.field1210 = -1;
                                break label403;
                            }
                        } else if (var5.field3483 == 1 && arg0.field1257 > 0 && arg0.field1213 <= class532.field7836 && arg0.field1163 < class532.field7836) {
                            arg0.field1187 = class532.field7836 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field3474 == null) {
                        arg0.field1210 = -1;
                    } else {
                        if (arg0.field1174 < 0) {
                            arg0.field1174 = 0;
                            class276.method1678(var5, arg0.field3695, arg0.field3704, (byte) 110, arg0.field3694, class96.field1170 == arg0, 0);
                        }
                        arg0.field1180++;
                        if (arg0.field1174 < var5.field3474.length && var5.field3489[arg0.field1174] < arg0.field1180) {
                            arg0.field1174++;
                            arg0.field1180 = 1;
                            class276.method1678(var5, arg0.field3695, arg0.field3704, (byte) 114, arg0.field3694, class96.field1170 == arg0, arg0.field1174);
                        }
                        if (var5.field3474.length <= arg0.field1174) {
                            if (var3.field1051) {
                                arg0.field1174 -= var5.field3482;
                                arg0.field1206++;
                                if (var5.field3484 <= arg0.field1206) {
                                    arg0.field1210 = -1;
                                } else if (arg0.field1174 >= 0 && var5.field3474.length > arg0.field1174) {
                                    class276.method1678(var5, arg0.field3695, arg0.field3704, (byte) 71, arg0.field3694, class96.field1170 == arg0, arg0.field1174);
                                } else {
                                    arg0.field1210 = -1;
                                }
                            } else {
                                arg0.field1210 = -1;
                            }
                        }
                        arg0.field1232 = arg0.field1174 + 1;
                        if (var5.field3474.length <= arg0.field1232) {
                            if (var3.field1051) {
                                arg0.field1232 -= var5.field3482;
                                if (var5.field3484 <= arg0.field1206 + 1) {
                                    arg0.field1232 = -1;
                                } else if (arg0.field1232 < 0 || arg0.field1232 >= var5.field3474.length) {
                                    arg0.field1232 = -1;
                                }
                            } else {
                                arg0.field1232 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1193 != -1 && arg0.field1208 <= class532.field7836) {
            class88 var6 = class71.field914.method1608((byte) 82, arg0.field1193);
            int var7 = var6.field1047;
            if (var7 == -1) {
                arg0.field1193 = -1;
            } else {
                label406: {
                    class260 var8 = class7.field97.method2951(var7, arg1 ^ 0xFFFFCA3C);
                    if (var6.field1051) {
                        if (var8.field3483 == 3) {
                            if (arg0.field1257 > 0 && arg0.field1213 <= class532.field7836 && class532.field7836 > arg0.field1163) {
                                arg0.field1193 = -1;
                                break label406;
                            }
                        } else if (var8.field3483 == 1 && arg0.field1257 > 0 && arg0.field1213 <= class532.field7836 && class532.field7836 > arg0.field1163) {
                            arg0.field1208 = class532.field7836 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field3474 == null) {
                        arg0.field1193 = -1;
                    } else {
                        if (arg0.field1181 < 0) {
                            arg0.field1181 = 0;
                            class276.method1678(var8, arg0.field3695, arg0.field3704, (byte) 111, arg0.field3694, class96.field1170 == arg0, 0);
                        }
                        arg0.field1240++;
                        if (var8.field3474.length > arg0.field1181 && arg0.field1240 > var8.field3489[arg0.field1181]) {
                            arg0.field1240 = 1;
                            arg0.field1181++;
                            class276.method1678(var8, arg0.field3695, arg0.field3704, (byte) 81, arg0.field3694, class96.field1170 == arg0, arg0.field1181);
                        }
                        if (arg0.field1181 >= var8.field3474.length) {
                            if (var6.field1051) {
                                arg0.field1181 -= var8.field3482;
                                arg0.field1243++;
                                if (var8.field3484 <= arg0.field1243) {
                                    arg0.field1193 = -1;
                                } else if (arg0.field1181 >= 0 && arg0.field1181 < var8.field3474.length) {
                                    class276.method1678(var8, arg0.field3695, arg0.field3704, (byte) 111, arg0.field3694, class96.field1170 == arg0, arg0.field1181);
                                } else {
                                    arg0.field1193 = -1;
                                }
                            } else {
                                arg0.field1193 = -1;
                            }
                        }
                        arg0.field1220 = arg0.field1181 + 1;
                        if (var8.field3474.length <= arg0.field1220) {
                            if (var6.field1051) {
                                arg0.field1220 -= var8.field3482;
                                if (var8.field3484 <= (arg0.field1243 + 1)) {
                                    arg0.field1220 = -1;
                                } else if (arg0.field1220 < 0 || arg0.field1220 >= var8.field3474.length) {
                                    arg0.field1220 = -1;
                                }
                            } else {
                                arg0.field1220 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1196 != -1 && arg0.field1152 <= 1) {
            class260 var9 = class7.field97.method2951(arg0.field1196, -13765);
            if (var9.field3483 == 3) {
                if (arg0.field1257 > 0 && arg0.field1213 <= class532.field7836 && class532.field7836 > arg0.field1163) {
                    arg0.field1196 = -1;
                }
            } else if (var9.field3483 == 1 && arg0.field1257 > 0 && arg0.field1213 <= class532.field7836 && arg0.field1163 < class532.field7836) {
                arg0.field1152 = 2;
            }
        }
        if (arg0.field1196 != -1 && arg0.field1152 == 0) {
            class260 var10 = class7.field97.method2951(arg0.field1196, -13765);
            if (var10 == null || var10.field3474 == null) {
                arg0.field1196 = -1;
            } else {
                arg0.field1197++;
                if (var10.field3474.length > arg0.field1233 && var10.field3489[arg0.field1233] < arg0.field1197) {
                    arg0.field1197 = 1;
                    arg0.field1233++;
                    class276.method1678(var10, arg0.field3695, arg0.field3704, (byte) 75, arg0.field3694, class96.field1170 == arg0, arg0.field1233);
                }
                if (var10.field3474.length <= arg0.field1233) {
                    arg0.field1203++;
                    arg0.field1233 -= var10.field3482;
                    if (arg0.field1203 >= var10.field3484) {
                        arg0.field1196 = -1;
                    } else if (arg0.field1233 >= 0 && arg0.field1233 < var10.field3474.length) {
                        class276.method1678(var10, arg0.field3695, arg0.field3704, (byte) 69, arg0.field3694, class96.field1170 == arg0, arg0.field1233);
                    } else {
                        arg0.field1196 = -1;
                    }
                }
                arg0.field1182 = arg0.field1233 + 1;
                if (var10.field3474.length <= arg0.field1182) {
                    arg0.field1182 -= var10.field3482;
                    if (var10.field3484 <= arg0.field1203 + 1) {
                        arg0.field1182 = -1;
                    } else if (arg0.field1182 < 0 || var10.field3474.length <= arg0.field1182) {
                        arg0.field1182 = -1;
                    }
                }
                arg0.field1228 = var10.field3485;
            }
        }
        if (arg0.field1152 > 0) {
            arg0.field1152--;
        }
        for (int var11 = 0; var11 < arg0.field1218.length; var11++) {
            class533 var12 = arg0.field1218[var11];
            if (var12 != null) {
                if (var12.field7843 > 0) {
                    var12.field7843--;
                } else {
                    class260 var13 = class7.field97.method2951(var12.field7847, arg1 ^ 0xFFFFCA3C);
                    if (var13 == null || var13.field3474 == null) {
                        arg0.field1218[var11] = null;
                    } else {
                        var12.field7842++;
                        if (var13.field3474.length > var12.field7841 && var13.field3489[var12.field7841] < var12.field7842) {
                            var12.field7841++;
                            var12.field7842 = 1;
                            class276.method1678(var13, arg0.field3695, arg0.field3704, (byte) 96, arg0.field3694, class96.field1170 == arg0, var12.field7841);
                        }
                        if (var12.field7841 >= var13.field3474.length) {
                            var12.field7844++;
                            var12.field7841 -= var13.field3482;
                            if (var13.field3484 <= var12.field7844) {
                                arg0.field1218[var11] = null;
                            } else if (var12.field7841 >= 0 && var13.field3474.length > var12.field7841) {
                                class276.method1678(var13, arg0.field3695, arg0.field3704, (byte) 119, arg0.field3694, class96.field1170 == arg0, var12.field7841);
                            } else {
                                arg0.field1218[var11] = null;
                            }
                        }
                        var12.field7845 = var12.field7841 + 1;
                        if (var13.field3474.length <= var12.field7845) {
                            var12.field7845 -= var13.field3482;
                            if (var13.field3484 <= (var12.field7844 + 1)) {
                                var12.field7845 = -1;
                            } else if (var12.field7845 < 0 || var13.field3474.length <= var12.field7845) {
                                var12.field7845 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
