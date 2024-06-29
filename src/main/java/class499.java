import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class499 extends class741 {

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Lvja;")
    public static class342 field6836 = new class342();

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "[I")
    public static int[] field6840 = new int[14];

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "[[B")
    public static byte[][] field6847 = new byte[250][];

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "Ljn;")
    public static class134 field6844;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "Lag;")
    public static class459 field6843;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "Luia;")
    public static class589 field6841;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZILjava/lang/String;I)I")
    public static final int method2930(boolean arg0, int arg1, String arg2, int arg3) {
        ++field6845;
        if (arg3 >= 2 && arg3 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~arg3 >= ~var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 - -var11;
                if (var10 / arg3 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (arg1 != 43) {
                field6840 = null;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 == -1) {
            super.field10209.method1492(arg2, 2);
            ++field6839;
            super.field10209.method1509(4, arg1);
        }
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        ++field6846;
        int var2 = 98 / ((arg0 - 10) / 44);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        ++field6837;
        if (arg0 <= 96) {
            this.method430(-39, true);
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Llba;)V")
    public class499(class223 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        if (arg0 >= -37) {
            field6844 = null;
        }
        ++field6835;
        return false;
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V")
    public static void method2931(int arg0) {
        field6836 = null;
        field6841 = null;
        field6844 = null;
        if (arg0 == 250) {
            field6840 = null;
            field6847 = null;
            field6843 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        ++field6838;
        if (arg0 < 15) {
            field6844 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        int var4 = -110 / ((-18 - arg2) / 51);
        ++field6842;
    }
}
