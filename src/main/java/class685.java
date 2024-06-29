import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class685 extends class103 implements class414 {

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "Ldn;")
    private class544 field9903;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field9912 = new String[] { method4994(method4993("g.i\u001f")), method4994(method4993("ru+]\u0005")), method4994(method4993("o1+O\u0011g2qMP")), method4994(method4993("o1+1P")), method4994(method4993("o1+7P")), method4994(method4993("o1+;P")), method4994(method4993("o1+6P")), method4994(method4993("o1+:P")), method4994(method4993("o1+2P")), method4994(method4993("o1+0P")), method4994(method4993("o1+4P")), method4994(method4993("o1+5P")) };

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Lmp;")
    public static class796 field9909 = new class796(method4994(method4993("@\u0015Q1=]\u001a")), method4994(method4993("f=c\u001a\u001bl")), method4994(method4993("V2k\u0007\u001al/d")), 6);

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method3305(int arg0, boolean arg1) {
        try {
            int var3 = -125 / ((-61 - arg0) / 56);
            ++field9906;
            return super.method978((byte) -21, arg1, super.field1503.field4537);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9912[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method4990(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                return false;
            } else {
                ++field9901;
                return (33 & arg1) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9912[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Ldn;")
    public final class544 method3306(byte arg0) {
        try {
            if (arg0 != -111) {
                field9908 = 124;
            }
            ++field9902;
            return this.field9903;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9912[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)V")
    public static void method4991(byte arg0) {
        try {
            field9909 = null;
            if (arg0 < 94) {
                field9908 = -122;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9912[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method981(int arg0) {
        try {
            if (arg0 != 1328) {
                method4992(52, 102, (byte) -5);
            }
            super.method981(arg0);
            ++field9905;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9912[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
    public final int method975(boolean arg0) {
        try {
            ++field9910;
            return arg0 ? -69 : super.method975(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9912[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
    public final void method980(int arg0, boolean arg1) {
        try {
            super.method980(this.field9903.field7999 * arg0, arg1);
            ++field9907;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9912[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ltia;Ldn;Z)V")
    public class685(class278 arg0, class544 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        try {
            this.field9903 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9912[2] + (arg0 != null ? field9912[1] : field9912[0]) + ',' + (arg1 != null ? field9912[1] : field9912[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
    public static final void method4992(int arg0, int arg1, byte arg2) {
        try {
            ++field9904;
            if (class305.method2622(true)) {
                if (~class222.field3490 != ~arg1) {
                    class748.field11039 = "";
                }
                class42.field477 = arg0;
                class222.field3490 = arg1;
                class302.method2598(6, -3);
                if (arg2 != 36) {
                    field9908 = -49;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9912[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
    public final boolean method3307(int arg0) {
        try {
            if (arg0 <= 113) {
                return false;
            } else {
                ++field9911;
                return super.method977(-100, super.field1503.field4537);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9912[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4993(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 120);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4994(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
