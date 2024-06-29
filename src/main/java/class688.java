import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class688 extends class497 {

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9640 = new String[] { method4923(method4922("\u001dmh\u0012xX")), method4923(method4922("\u001dmh\u0012yX")), method4923(method4922("\u001dmh\u0012\u007fX")), method4923(method4922("\u001dmh\u0012{X")), method4923(method4922("\u000b!'\u0012A")), method4923(method4922("\u001dmh\u0012}X")), method4923(method4922("\u001ezeP")), method4923(method4922("\u001dmh\u0012~X")) };

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                field9635 = -49;
            }
            ++field9637;
            return 3;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9640[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(ILpp;)V")
    public class688(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lpp;)V")
    public class688(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "([ILqo;IZI)V")
    public static final void method4920(int[] arg0, class170 arg1, int arg2, boolean arg3, int arg4) {
        try {
            if (arg1.field2194 != null) {
                boolean var5 = true;
                for (int var6 = 0; var6 < arg1.field2194.length; ++var6) {
                    if (~arg1.field2194[var6] != ~arg0[var6]) {
                        var5 = false;
                        break;
                    }
                }
                class84 var7 = arg1.field2228;
                if (var5 && var7.method835(false)) {
                    class437 var8 = arg1.field2228.method846(12763);
                    int var9 = var8.field6439;
                    if (var9 == 1) {
                        var7.method823(arg2, ~arg4);
                    }
                    if (var9 == 2) {
                        var7.method839(arg4 + -10538);
                    }
                }
            }
            ++field9639;
            boolean var10 = true;
            if (arg4 != 1) {
                method4920((int[]) null, (class170) null, -85, false, 13);
            }
            for (int var11 = 0; var11 < arg0.length; ++var11) {
                if (arg0[var11] != -1) {
                    var10 = false;
                }
                if (arg1.field2194 == null || arg1.field2194[var11] == -1 || class10.field132.method1889(arg0[var11], true).field6442 >= class10.field132.method1889(arg1.field2194[var11], true).field6442) {
                    arg1.field2194 = arg0;
                    arg1.field2228.method842(arg2, false);
                    if (arg3) {
                        arg1.field2258 = arg1.field2257;
                    }
                }
            }
            if (var10) {
                arg1.field2194 = arg0;
                arg1.field2228.method842(arg2, false);
                if (arg3) {
                    arg1.field2258 = arg1.field2257;
                    return;
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field9640[5] + (arg0 != null ? field9640[4] : field9640[6]) + ',' + (arg1 != null ? field9640[4] : field9640[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 > -70) {
                this.method1032(37);
            }
            super.field7292 = this.method1032(-106);
            ++field9633;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9640[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field9634;
            if (arg0 >= -101) {
                return 64;
            } else {
                return super.field7293.method4677(44) ? 1 : 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9640[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                field9635 = 51;
            }
            super.field7292 = arg1;
            ++field9638;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9640[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)I")
    public final int method4921(int arg0) {
        try {
            if (arg0 != 3) {
                field9635 = -49;
            }
            ++field9636;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9640[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4922(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4923(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
