import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class152 extends class139 {

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Lrf;")
    private static class163 field3116 = class53.method392(107, "Login server offline)3");

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lrf;")
    private static class163 field3117 = class53.method392(-70, "Error connecting to server)3");

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "Lrf;")
    public static class163 field3126 = field3116;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lrf;")
    public static class163 field3128 = field3117;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "Lrf;")
    public static class163 field3129 = class53.method392(55, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "Lrf;")
    private static class163 field3130 = class53.method392(-51, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Lrf;")
    public static class163 field3120 = field3130;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lrf;")
    private static class163 field3131 = class53.method392(79, "slide:");

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "Lrf;")
    public static class163 field3119 = field3131;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lrf;")
    public static class163 field3125 = field3131;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field3127;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field3132;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field3133;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field3134;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field3135;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field3136;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field3137;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field3138;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field3139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field3140;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field3141;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field3142;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field3143;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "Ljava/lang/Class;")
    public static Class field3144;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field3145;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field3146;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field3147;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field3148;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field3149;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Bb", descriptor = "Ljava/lang/Class;")
    public static Class field3150;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Cb", descriptor = "Ljava/lang/Class;")
    public static Class field3151;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Db", descriptor = "Ljava/lang/Class;")
    public static Class field3152;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Eb", descriptor = "Ljava/lang/Class;")
    public static Class field3153;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Fb", descriptor = "Ljava/lang/Class;")
    public static Class field3154;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Gb", descriptor = "Ljava/lang/Class;")
    public static Class field3155;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Hb", descriptor = "Ljava/lang/Class;")
    public static Class field3156;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Ib", descriptor = "Ljava/lang/Class;")
    public static Class field3157;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Jb", descriptor = "Ljava/lang/Class;")
    public static Class field3158;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Kb", descriptor = "Ljava/lang/Class;")
    public static Class field3159;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Lb", descriptor = "Ljava/lang/Class;")
    public static Class field3160;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Mb", descriptor = "Ljava/lang/Class;")
    public static Class field3161;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Nb", descriptor = "Ljava/lang/Class;")
    public static Class field3162;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Ob", descriptor = "Ljava/lang/Class;")
    public static Class field3163;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Pb", descriptor = "Ljava/lang/Class;")
    public static Class field3164;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Qb", descriptor = "Ljava/lang/Class;")
    public static Class field3165;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Rb", descriptor = "Ljava/lang/Class;")
    public static Class field3166;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Sb", descriptor = "Ljava/lang/Class;")
    public static Class field3167;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Tb", descriptor = "Ljava/lang/Class;")
    public static Class field3168;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Ub", descriptor = "Ljava/lang/Class;")
    public static Class field3169;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Vb", descriptor = "Ljava/lang/Class;")
    public static Class field3170;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Wb", descriptor = "Ljava/lang/Class;")
    public static Class field3171;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)V")
    public static void method976(byte arg0) {
        field3129 = null;
        field3131 = null;
        field3128 = null;
        field3116 = null;
        field3126 = null;
        field3120 = null;
        field3117 = null;
        field3130 = null;
        field3125 = null;
        field3119 = null;
        int var1 = 39 / ((38 - arg0) / 58);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)Ljava/lang/Class;")
    public static final Class method977(int arg0, int arg1) {
        if (arg0 != 4) {
            return null;
        } else {
            ++field3122;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 != -7) {
                                        if (arg1 != 7) {
                                            if (~arg1 != -9) {
                                                if (~arg1 != -10) {
                                                    if (arg1 != 10) {
                                                        if (arg1 != 11) {
                                                            if (~arg1 != -13) {
                                                                if (~arg1 != -14) {
                                                                    if (arg1 != 14) {
                                                                        if (~arg1 != -16) {
                                                                            if (arg1 != 16) {
                                                                                if (~arg1 != -18) {
                                                                                    if (arg1 != 18) {
                                                                                        if (~arg1 != -20) {
                                                                                            if (arg1 != 20) {
                                                                                                if (arg1 != 21) {
                                                                                                    if (arg1 != 22) {
                                                                                                        if (~arg1 != -24) {
                                                                                                            if (~arg1 != -25) {
                                                                                                                if (arg1 != 25) {
                                                                                                                    if (arg1 != 26) {
                                                                                                                        if (arg1 != 27) {
                                                                                                                            if (~arg1 != -29) {
                                                                                                                                if (arg1 != 29) {
                                                                                                                                    if (~arg1 != -31) {
                                                                                                                                        if (arg1 != 31) {
                                                                                                                                            if (~arg1 != -33) {
                                                                                                                                                if (arg1 != 33) {
                                                                                                                                                    if (arg1 != 34) {
                                                                                                                                                        if (arg1 != 35) {
                                                                                                                                                            if (~arg1 != -37) {
                                                                                                                                                                if (arg1 != 37) {
                                                                                                                                                                    if (arg1 != 38) {
                                                                                                                                                                        if (arg1 == 39) {
                                                                                                                                                                            return field3171 != null ? field3171 : (field3171 = method981("of"));
                                                                                                                                                                        } else {
                                                                                                                                                                            return null;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        return field3170 != null ? field3170 : (field3170 = method981("t"));
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return field3169 != null ? field3169 : (field3169 = method981("bi"));
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return field3168 != null ? field3168 : (field3168 = method981("pa"));
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return field3167 != null ? field3167 : (field3167 = method981("bc"));
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return field3166 != null ? field3166 : (field3166 = method981("nc"));
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return field3165 != null ? field3165 : (field3165 = method981("ca"));
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return field3164 != null ? field3164 : (field3164 = method981("tb"));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return field3163 != null ? field3163 : (field3163 = method981("sf"));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return field3162 != null ? field3162 : (field3162 = method981("te"));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return field3161 != null ? field3161 : (field3161 = method981("gb"));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return field3160 != null ? field3160 : (field3160 = method981("hf"));
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return field3159 != null ? field3159 : (field3159 = method981("di"));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return field3158 != null ? field3158 : (field3158 = method981("dc"));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return field3157 != null ? field3157 : (field3157 = method981("mb"));
                                                                                                                }
                                                                                                            } else {
                                                                                                                return field3156 != null ? field3156 : (field3156 = method981("jc"));
                                                                                                            }
                                                                                                        } else {
                                                                                                            return field3155 != null ? field3155 : (field3155 = method981("ai"));
                                                                                                        }
                                                                                                    } else {
                                                                                                        return field3154 != null ? field3154 : (field3154 = method981("kh"));
                                                                                                    }
                                                                                                } else {
                                                                                                    return field3153 != null ? field3153 : (field3153 = method981("ba"));
                                                                                                }
                                                                                            } else {
                                                                                                return field3152 != null ? field3152 : (field3152 = method981("o"));
                                                                                            }
                                                                                        } else {
                                                                                            return field3151 != null ? field3151 : (field3151 = method981("cd"));
                                                                                        }
                                                                                    } else {
                                                                                        return field3150 != null ? field3150 : (field3150 = method981("ch"));
                                                                                    }
                                                                                } else {
                                                                                    return field3149 != null ? field3149 : (field3149 = method981("kb"));
                                                                                }
                                                                            } else {
                                                                                return field3148 != null ? field3148 : (field3148 = method981("va"));
                                                                            }
                                                                        } else {
                                                                            return field3147 != null ? field3147 : (field3147 = method981("pg"));
                                                                        }
                                                                    } else {
                                                                        return field3146 != null ? field3146 : (field3146 = method981("db"));
                                                                    }
                                                                } else {
                                                                    return field3145 != null ? field3145 : (field3145 = method981("qd"));
                                                                }
                                                            } else {
                                                                return field3144 != null ? field3144 : (field3144 = method981("la"));
                                                            }
                                                        } else {
                                                            return field3143 != null ? field3143 : (field3143 = method981("v"));
                                                        }
                                                    } else {
                                                        return field3142 != null ? field3142 : (field3142 = method981("da"));
                                                    }
                                                } else {
                                                    return field3141 != null ? field3141 : (field3141 = method981("jg"));
                                                }
                                            } else {
                                                return field3140 != null ? field3140 : (field3140 = method981("ce"));
                                            }
                                        } else {
                                            return field3139 != null ? field3139 : (field3139 = method981("kf"));
                                        }
                                    } else {
                                        return field3138 != null ? field3138 : (field3138 = method981("fg"));
                                    }
                                } else {
                                    return field3137 != null ? field3137 : (field3137 = method981("ih"));
                                }
                            } else {
                                return field3136 != null ? field3136 : (field3136 = method981("qb"));
                            }
                        } else {
                            return field3135 != null ? field3135 : (field3135 = method981("od"));
                        }
                    } else {
                        return field3134 != null ? field3134 : (field3134 = method981("ra"));
                    }
                } else {
                    return field3133 != null ? field3133 : (field3133 = method981("uc"));
                }
            } else {
                return field3132 != null ? field3132 : (field3132 = method981("af"));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3118;
        if (arg1 != 7451) {
            field3125 = null;
        }
        int[] var3 = super.field2859.method1319(arg1 ^ -7551, arg0);
        if (super.field2859.field3966) {
            int var4 = class180.field3607[arg0];
            for (int var5 = 0; class23.field402 > var5; ++var5) {
                var3[var5] = this.method978(arg1 + -7473, var4, class189.field3772[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)I")
    private final int method978(int arg0, int arg1, int arg2) {
        ++field3121;
        int var4 = arg1 * 57 + arg2;
        int var5 = 30 / ((arg0 - 49) / 48);
        int var6 = var4 ^ var4 << 1;
        return -(((var6 * 15731 * var6 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static final void method979(int arg0) {
        for (class62 var1 = (class62) class140.field2888.method46(arg0 ^ -123); var1 != null; var1 = (class62) class140.field2888.method53(7759444)) {
            if (var1.field1305 != null) {
                class113.field2378.method281(var1.field1305);
                var1.field1305 = null;
            }
            if (var1.field1311 != null) {
                class113.field2378.method281(var1.field1311);
                var1.field1311 = null;
            }
        }
        if (arg0 != -29) {
            method980((Throwable) null, (String) null, false);
        }
        class140.field2888.method54((byte) 98);
        ++field3123;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
    public static final void method980(Throwable arg0, String arg1, boolean arg2) {
        ++field3127;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class114.method780(arg0, -20755);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            if (arg2) {
                String var4 = var3.replace(':', '.');
                String var5 = var4.replace('@', '_');
                String var6 = var5.replace('&', '_');
                String var7 = var6.replace('#', '_');
                if (class71.field1497.field1414 != null) {
                    class42 var8 = class71.field1497.method474(new URL(class71.field1497.field1414.getCodeBase(), "clienterror.ws?c=" + class52.field1078 + "&u=" + class97.field2081 + "&v1=" + class67.field1411 + "&v2=" + class67.field1421 + "&e=" + var7), -101);
                    while (~var8.field855 == -1) {
                        class25.method151(1L, (byte) 0);
                    }
                    if (var8.field855 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field854;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method981(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
