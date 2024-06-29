import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class513 extends class693 {

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "S")
    public short field7592;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field7598 = new String[] { method3856(method3855("\u0013C\u001fY")), method3856(method3855("\u0011R\u0012\u001b&U")), method3856(method3855("\u0006\u0018]\u001b\u0016")), method3856(method3855("\u0011R\u0012\u001bW\u0014X\u001aAUU")), method3856(method3855("\u0011R\u0012\u001b/U")), method3856(method3855("\u0011R\u0012\u001b)U")), method3856(method3855("\u0011R\u0012\u001b(U")), method3856(method3855("\u0011R\u0012\u001b.U")), method3856(method3855("\u0011R\u0012\u001b*U")) };

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "[[Z")
    public static boolean[][] field7590 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "Lmj;")
    public static class683 field7591 = null;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "[Lhk;")
    public static class107[] field7596;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([Lih;Z)I", line = 3)
    public final int method1739(class731[] arg0, boolean arg1) {
        try {
            ++field7597;
            return arg1 ? -68 : this.method5034(true, arg0, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7598[4] + (arg0 != null ? field7598[2] : field7598[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method1737(int arg0) {
        try {
            ++field7594;
            if (arg0 > -19) {
                field7591 = null;
            }
            return class441.field6890[(super.field9985 >> class165.field2688) + -class54.field689 + class297.field4835][(super.field9983 >> class165.field2688) - (class316.field5137 - class297.field4835)];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7598[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(ILha;)Z", line = 26)
    public final boolean method1738(int arg0, class63 arg1) {
        try {
            ++field7589;
            if (arg0 != 1) {
                field7591 = null;
            }
            return class527.method3934(43, super.field9985 >> class165.field2688, super.field9974, super.field9983 >> class165.field2688);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7598[7] + arg0 + ',' + (arg1 != null ? field7598[2] : field7598[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "(I)V", line = 39)
    public static void method3852(int arg0) {
        try {
            if (arg0 < 86) {
                method3854(false);
            }
            field7591 = null;
            field7590 = null;
            field7596 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7598[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(CILjava/lang/String;)I", line = 53)
    public static final int method3853(char arg0, int arg1, String arg2) {
        try {
            ++field7588;
            int var3 = 0;
            int var4 = arg2.length();
            for (int var5 = arg1; var5 < var4; ++var5) {
                if (~arg0 == ~arg2.charAt(var5)) {
                    ++var3;
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7598[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7598[2] : field7598[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V", line = 82)
    public static final void method3854(boolean arg0) {
        try {
            ++field7593;
            if (class543.field7992 != null) {
                class543.field7992.method668(-4369);
                class382.field6141 = null;
                class543.field7992 = null;
            }
            if (!arg0) {
                method3852(-24);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7598[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(IIIIII)V", line = 100)
    public class513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field9975 = (byte) arg3;
            super.field9974 = (byte) arg4;
            this.field7592 = (short) arg5;
            super.field9985 = arg0;
            super.field9972 = arg1;
            super.field9983 = arg2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7598[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3855(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3856(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
