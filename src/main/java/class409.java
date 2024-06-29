import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class409 extends class54 {

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6064 = new String[] { method3199(method3198("\u0015-\u0014\u0001`")), method3199(method3198("\u0015-\u0014\u000e`")), method3199(method3198("\u0015-\u0014\r`")), method3199(method3198("\u0015-\u0014\b`")), method3199(method3198("\u0015-\u0014\u000b`")), method3199(method3198("\u0015-\u0014\n`")), method3199(method3198("\u0015-\u0014\u000f`")), method3199(method3198("\u0015-\u0014\u0004`")), method3199(method3198("\u0015-\u0014\t`")) };

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Lel;")
    public static class573 field6061 = new class573(18, -1);

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Z")
    public static boolean field6058;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method3193(byte arg0) {
        try {
            if (arg0 == -64) {
                field6061 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6064[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field6059;
            if (arg0 != 0) {
                field6061 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6064[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (!arg0) {
                this.method3196(41);
            }
            if (super.field589.method656(arg0)) {
                super.field593 = 2;
            }
            ++field6054;
            if (super.field593 < 0 || ~super.field593 < -3) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6064[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILhia;)V")
    public class409(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lhia;)V")
    public class409(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field6057;
            if (arg1 >= -106) {
                field6058 = true;
            }
            return super.field589.method656(true) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6064[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)[I")
    public static final int[] method3194(int arg0, int arg1) {
        try {
            ++field6062;
            class693.method5066(class578.method4323(arg0, 29630), true);
            int[] var2 = new int[3];
            if (arg1 != -14030) {
                return null;
            } else {
                var2[0] = class555.field8270.get(5);
                var2[1] = class555.field8270.get(2);
                var2[2] = class555.field8270.get(1);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6064[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)I")
    public final int method3195(boolean arg0) {
        try {
            if (arg0) {
                field6061 = null;
            }
            ++field6056;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6064[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z")
    public final boolean method3196(int arg0) {
        try {
            ++field6060;
            if (arg0 != -10243) {
                return true;
            } else {
                return !super.field589.method656(true);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6064[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                method3197(13);
            }
            ++field6055;
            if (super.field589.method656(true)) {
                return 2;
            } else {
                return super.field589.field812.method1612(false) && class253.method2140(super.field589.field812.method1610(false), (byte) -82) ? 1 : 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6064[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)[Lkia;")
    public static final class646[] method3197(int arg0) {
        try {
            if (arg0 != 2) {
                method3193((byte) 90);
            }
            ++field6053;
            return new class646[] { class31.field364, class338.field5264, class779.field11332, class524.field7652, class3.field17, class439.field6482, class593.field8704 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6064[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3198(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3199(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
