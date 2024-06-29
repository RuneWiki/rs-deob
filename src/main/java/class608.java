import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class608 extends class54 {

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8899 = new String[] { method4502(method4501("\u0017:8Lm")), method4502(method4501("\u0017:8Jm")), method4502(method4501("\u0017:8Mm")), method4502(method4501("\u0017:8Km")), method4502(method4501("\u0017:8Nm")), method4502(method4501("\u0017:8Om")), method4502(method4501("\t)zd")), method4502(method4501("\u001cr8&8")), method4502(method4501("\u0017:8Im")) };

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lwq;")
    public static class178 field8892 = new class178(4);

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[[B")
    public static byte[][] field8893;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lffa;BIII)Lgda;", line = 3)
    public static final class61 method4498(class197 arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            ++field8891;
            if (arg1 != -76) {
                method4500(-106);
            }
            if (arg0.field2956 || class40.method269(arg2, 80) && class40.method269(arg4, arg1 ^ -47)) {
                return new class61(arg0, 3553, arg3, arg2, arg4);
            } else {
                return arg0.field2964 ? new class61(arg0, 34037, arg3, arg2, arg4) : new class61(arg0, arg3, arg2, arg4, class12.method83((byte) -1, arg2), class12.method83((byte) -1, arg4));
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8899[8] + (arg0 != null ? field8899[7] : field8899[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 25)
    public final void method115(boolean arg0) {
        try {
            if (super.field593 < 0 && super.field593 > 4) {
                super.field593 = this.method111(false);
            }
            if (!arg0) {
                field8893 = null;
            }
            ++field8897;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8899[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lhia;)V", line = 39)
    public class608(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)I", line = 49)
    public final int method4499(boolean arg0) {
        try {
            ++field8898;
            if (arg0) {
                method4498((class197) null, (byte) 42, -92, 74, -125);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8899[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V", line = 62)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field8895;
            if (arg0 != 0) {
                field8893 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8899[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V", line = 73)
    public static void method4500(int arg0) {
        try {
            int var1 = -60 % ((arg0 - -59) / 62);
            field8893 = null;
            field8892 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8899[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ILhia;)V", line = 84)
    public class608(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)I", line = 88)
    public final int method111(boolean arg0) {
        try {
            ++field8896;
            return super.field589.method662(107).method2136(arg0) > 1 ? 4 : 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8899[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)I", line = 99)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                return 47;
            } else {
                ++field8894;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8899[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4501(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4502(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
