import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class194 extends class438 implements class3 {

    @OriginalMember(owner = "client!qga", name = "M", descriptor = "S")
    private short field3075;

    @OriginalMember(owner = "client!qga", name = "O", descriptor = "B")
    private byte field3067;

    @OriginalMember(owner = "client!qga", name = "fb", descriptor = "B")
    private byte field3072;

    @OriginalMember(owner = "client!qga", name = "db", descriptor = "Z")
    private boolean field3057;

    @OriginalMember(owner = "client!qga", name = "jb", descriptor = "Z")
    private boolean field3061;

    @OriginalMember(owner = "client!qga", name = "ib", descriptor = "Z")
    private boolean field3069;

    @OriginalMember(owner = "client!qga", name = "nb", descriptor = "Lr;")
    private class192 field3063;

    @OriginalMember(owner = "client!qga", name = "kb", descriptor = "Lka;")
    private class499 field3051;

    @OriginalMember(owner = "client!qga", name = "ob", descriptor = "[Ljava/lang/String;")
    private static final String[] field3078 = new String[] { method1798(method1797("\"~,6`\u00121")), method1798(method1797("=l!t")), method1798(method1797("\"~,6n{")), method1798(method1797("(7c6^")), method1798(method1797("\"~,6e{")), method1798(method1797("\"~,6r{")), method1798(method1797("\"~,6j{")), method1798(method1797("\"~,6`{")), method1798(method1797("\"~,6a\u00121")), method1798(method1797("\u0016k?wQi9")), method1798(method1797("v),")), method1798(method1797("\"~,6b{")), method1798(method1797("\"~,6o{")), method1798(method1797("\"~,6d{")), method1798(method1797("\"~,6h{")), method1798(method1797("\"~,6u{")), method1798(method1797("\"~,6k{")), method1798(method1797("\"~,6m{")), method1798(method1797("\"~,6b\u00121")), method1798(method1797("\"~,6i{")), method1798(method1797("\"~,6g\u00121")), method1798(method1797("\"~,6\u001f:w$l\u001d{")), method1798(method1797("\"~,6f\u00121")) };

    @OriginalMember(owner = "client!qga", name = "lb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!qga", name = "S", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!qga", name = "cb", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!qga", name = "Q", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!qga", name = "V", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!qga", name = "U", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!qga", name = "R", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!qga", name = "P", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!qga", name = "W", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!qga", name = "eb", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!qga", name = "X", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!qga", name = "hb", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!qga", name = "mb", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!qga", name = "Y", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!qga", name = "gb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!qga", name = "T", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!qga", name = "Z", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!qga", name = "N", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!qga", name = "bb", descriptor = "Lrga;")
    private class250 field3074;

    @OriginalMember(owner = "client!qga", name = "ab", descriptor = "[I")
    public static int[] field3055;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public final void method30(int arg0) {
        try {
            ++field3062;
            if (arg0 == 20235) {
                if (this.field3051 != null) {
                    this.field3051.method428();
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            if (arg0 == -108) {
                ++field3070;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3078[8] + arg0 + ',' + (arg1 != null ? field3078[3] : field3078[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            ++field3060;
            if (this.field3074 == null) {
                this.field3074 = class198.method1814(this.method1793(0, arg0, (byte) -15), 34069, super.field9985, super.field9983, super.field9972);
            }
            if (arg1 != -118) {
                this.method46(81, -62, -82, (class63) null);
            }
            return this.field3074;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3078[20] + (arg0 != null ? field3078[3] : field3078[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            if (arg0 >= -112) {
                this.method43(-48);
            }
            ++field3054;
            return this.field3051 == null ? 0 : this.field3051.method390();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            if (arg0 <= 54) {
                this.method43(21);
            }
            ++field3071;
            if (this.field3051 != null) {
                return !this.field3051.method409();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            if (arg0 != -32768) {
                return false;
            } else {
                ++field3077;
                return this.field3051 != null ? this.field3051.method407() : false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.method43(-73);
            }
            ++field3076;
            return this.field3051 != null ? this.field3051.method438() : 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        try {
            if (arg0 != -55) {
                return 71;
            } else {
                ++field3058;
                return this.field3072;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIIII)V")
    public class194(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            this.field3075 = (short) arg1.field5855;
            this.field3067 = (byte) arg10;
            this.field3072 = (byte) arg11;
            this.field3057 = ~arg1.field5843 != -1 && !arg7;
            super.field9983 = arg6;
            super.field9985 = arg4;
            this.field3061 = arg7;
            this.field3069 = arg0.method158() && arg1.field5875 && !this.field3061 && ~class623.field8996.field6381.method2920(true) != -1;
            class379 var13 = this.method1794(-17136, arg0, 2048, this.field3069);
            if (var13 != null) {
                this.field3063 = var13.field6115;
                this.field3051 = var13.field6116;
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field3078[21] + (arg0 != null ? field3078[3] : field3078[1]) + ',' + (arg1 != null ? field3078[3] : field3078[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)I")
    public final int method32(byte arg0) {
        try {
            if (arg0 != -95) {
                this.field3051 = null;
            }
            ++field3065;
            return this.field3075 & 65535;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field3056;
            class499 var5 = this.method1793(arg0, arg3, (byte) -88);
            if (var5 != null) {
                class486 var6 = arg3.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                return !class200.field3163 ? var5.method425(arg2, arg1, var6, false, 0) : var5.method429(arg2, arg1, var6, false, 0, class547.field8042);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3078[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3078[3] : field3078[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field3053;
            if (this.field3051 == null) {
                return null;
            } else {
                class486 var3 = arg0.method251();
                if (arg1 != 122) {
                    method1795((String) null, -86);
                }
                var3.method2465(super.field6840 + super.field9985, super.field9972, super.field6839 + super.field9983);
                class281 var4 = class349.method2910(this.field3057, 1, (byte) -124);
                if (!class200.field3163) {
                    this.field3051.method426(var3, var4.field4578[0], 0);
                } else {
                    this.field3051.method423(var3, var4.field4578[0], class547.field8042, 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3078[22] + (arg0 != null ? field3078[3] : field3078[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        try {
            ++field3073;
            if (arg0 != 16388) {
                this.field3063 = null;
            }
            return this.field3067;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        try {
            ++field3059;
            if (arg0 != -12) {
                this.field3075 = 122;
            }
            return this.field3069;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3078[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILha;B)Lka;")
    private final class499 method1793(int arg0, class63 arg1, byte arg2) {
        try {
            ++field3066;
            if (this.field3051 != null && ~arg1.method151(this.field3051.method433(), arg0) == -1) {
                return this.field3051;
            } else {
                if (arg2 > 0) {
                    this.method47((class63) null, (byte) -54);
                }
                class379 var4 = this.method1794(-17136, arg1, arg0, false);
                return var4 == null ? null : var4.field6116;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3078[11] + arg0 + ',' + (arg1 != null ? field3078[3] : field3078[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lha;I)V")
    public final void method29(class63 arg0, int arg1) {
        try {
            int var3 = -83 % ((arg1 - 22) / 60);
            ++field3052;
            Object var4 = null;
            class192 var6;
            if (this.field3063 == null && this.field3069) {
                class379 var5 = this.method1794(-17136, arg0, 262144, true);
                var6 = var5 == null ? null : var5.field6115;
            } else {
                var6 = this.field3063;
                this.field3063 = null;
            }
            if (var6 != null) {
                class28.method283(var6, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3078[16] + (arg0 != null ? field3078[3] : field3078[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILha;IZ)Lvh;")
    private final class379 method1794(int arg0, class63 arg1, int arg2, boolean arg3) {
        try {
            ++field3050;
            class362 var5 = class370.field5999.method4002(122, this.field3075 & 65535);
            if (arg0 != -17136) {
                return null;
            } else {
                class293 var6;
                class293 var7;
                if (!this.field3061) {
                    var6 = class493.field7420[super.field9974];
                    if (~super.field9974 <= -4) {
                        var7 = null;
                    } else {
                        var7 = class493.field7420[super.field9974 - -1];
                    }
                } else {
                    var7 = class493.field7420[0];
                    var6 = class757.field11125[super.field9974];
                }
                return var5.method3003((byte) 88, (class729) null, this.field3067, super.field9983, arg1, this.field3072, var7, var6, super.field9985, arg3, arg2, super.field9972);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3078[2] + arg0 + ',' + (arg1 != null ? field3078[3] : field3078[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1795(String arg0, int arg1) {
        if (arg1 == 262144) {
            System.out.println(field3078[9] + class423.method3363(arg0, "\n", -106, field3078[10]));
            ++field3068;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILha;)V")
    public final void method31(int arg0, class63 arg1) {
        try {
            if (arg0 != -27998) {
                this.field3067 = 1;
            }
            ++field3064;
            Object var3 = null;
            class192 var4;
            if (this.field3063 == null && this.field3069) {
                class379 var5 = this.method1794(-17136, arg1, 262144, true);
                var4 = var5 != null ? var5.field6115 : null;
            } else {
                var4 = this.field3063;
                this.field3063 = null;
            }
            if (var4 != null) {
                class681.method4962(var4, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3078[13] + arg0 + ',' + (arg1 != null ? field3078[3] : field3078[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(Z)V")
    public static void method1796(boolean arg0) {
        try {
            field3055 = null;
            if (arg0) {
                field3055 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3078[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1797(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1798(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
