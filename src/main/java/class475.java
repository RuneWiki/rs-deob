import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class475 extends class54 {

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6897 = new String[] { method3612(method3611("T]~_m\t")), method3612(method3611("T]~_k\t")), method3612(method3611("T]~_i\t")), method3612(method3611("T]~_n\t")), method3612(method3611("T]~_h\t")), method3612(method3611("OLs\u001d")), method3612(method3611("Z\u00171_Q")), method3612(method3611("T]~_d\t")), method3612(method3611("T]~_a\t")), method3612(method3611("T]~_o\t")), method3612(method3611("T]~_j\t")) };

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "[I")
    public static int[] field6885 = new int[1];

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
    public static int field6888 = 0;

    @OriginalMember(owner = "client!uda", name = "w", descriptor = "I")
    public static int field6890 = -60;

    @OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!uda", name = "s", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!uda", name = "v", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!uda", name = "t", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!uda", name = "x", descriptor = "Llq;")
    public static class578 field6895;

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(ILhia;)V", line = 4)
    public class475(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V", line = 20)
    public final void method113(int arg0, int arg1) {
        try {
            ++field6896;
            super.field593 = arg1;
            if (arg0 != 0) {
                field6890 = -52;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6897[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V", line = 32)
    public final void method115(boolean arg0) {
        try {
            ++field6889;
            if (super.field589.method656(arg0)) {
                super.field593 = 0;
            }
            if (super.field593 < 0 && ~super.field593 < -3) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6897[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIBI)V", line = 49)
    public static final void method3606(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        try {
            if (~class381.field5786 <= ~arg1 && ~arg2 <= ~class676.field9807) {
                boolean var6;
                if (~arg3 > ~class200.field3119) {
                    var6 = false;
                    arg3 = class200.field3119;
                } else if (class676.field9797 < arg3) {
                    var6 = false;
                    arg3 = class676.field9797;
                } else {
                    var6 = true;
                }
                boolean var7;
                if (arg0 < class200.field3119) {
                    arg0 = class200.field3119;
                    var7 = false;
                } else if (class676.field9797 >= arg0) {
                    var7 = true;
                } else {
                    var7 = false;
                    arg0 = class676.field9797;
                }
                if (class676.field9807 <= arg1) {
                    class319.method2702(class243.field3731[arg1++], arg3, arg0, true, arg5);
                } else {
                    arg1 = class676.field9807;
                }
                if (~arg2 >= ~class381.field5786) {
                    class319.method2702(class243.field3731[arg2--], arg3, arg0, true, arg5);
                } else {
                    arg2 = class381.field5786;
                }
                if (var6 && var7) {
                    for (int var10 = arg1; ~arg2 <= ~var10; ++var10) {
                        int[] var11 = class243.field3731[var10];
                        var11[arg3] = var11[arg0] = arg5;
                    }
                } else if (var6) {
                    for (int var8 = arg1; ~var8 >= ~arg2; ++var8) {
                        class243.field3731[var8][arg3] = arg5;
                    }
                } else if (var7) {
                    for (int var9 = arg1; ~arg2 <= ~var9; ++var9) {
                        class243.field3731[var9][arg0] = arg5;
                    }
                }
            }
            if (arg4 != 7) {
                field6885 = null;
            }
            ++field6886;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6897[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLib;)Luca;", line = 155)
    public static final class538 method3607(byte arg0, class163 arg1) {
        try {
            ++field6893;
            String var2 = arg1.method1423(104);
            class613 var3 = class325.method2758(113)[arg1.method1455((byte) 62)];
            class288 var4 = class349.method2869((byte) -68)[arg1.method1455((byte) 62)];
            int var5 = arg1.method1442(65280);
            int var6 = arg1.method1442(65280);
            int var7 = arg1.method1455((byte) 62);
            if (arg0 > -59) {
                method3607((byte) 40, (class163) null);
            }
            int var8 = arg1.method1455((byte) 62);
            int var9 = arg1.method1455((byte) 62);
            int var10 = arg1.method1445((byte) 116);
            int var11 = arg1.method1445((byte) 103);
            int var12 = arg1.method1453((byte) 90);
            int var13 = arg1.method1453((byte) 109);
            int var14 = arg1.method1453((byte) 85);
            return new class538(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field6897[7] + arg0 + ',' + (arg1 != null ? field6897[6] : field6897[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(IB)I", line = 192)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field6887;
            if (arg1 >= -106) {
                this.method109(-66, (byte) 32);
            }
            if (super.field589.method656(true)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field589.field806.method5516(false) != -2 ? 2 : 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6897[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(Z)I", line = 211)
    public final int method3608(boolean arg0) {
        try {
            if (arg0) {
                this.method113(-116, -54);
            }
            ++field6891;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6897[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "(I)Z", line = 224)
    public final boolean method3609(int arg0) {
        try {
            ++field6894;
            if (arg0 != -10243) {
                method3610(-95);
            }
            return !super.field589.method656(true);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6897[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lhia;)V", line = 242)
    public class475(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(Z)I", line = 246)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return 32;
            } else {
                ++field6892;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6897[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V", line = 258)
    public static void method3610(int arg0) {
        try {
            field6885 = null;
            field6895 = null;
            if (arg0 != -3) {
                method3607((byte) 106, (class163) null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6897[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3611(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3612(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
