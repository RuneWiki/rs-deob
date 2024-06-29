import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class484 extends class299 {

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7349 = new String[] { method3690(method3689("0zhQI")), method3690(method3689("0zhPI")), method3690(method3689("0zhWI")), method3690(method3689("0zhUI")), method3690(method3689("0zhRI")), method3690(method3689("0zhSI")), method3690(method3689("0zhVI")) };

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "[[Z")
    public static boolean[][] field7345 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Lvn;")
    public static class330 field7339 = new class330(87, -1);

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Lwh;")
    public static class155 field7347 = new class155(3, 2);

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "[I")
    public static int[] field7348 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILes;)V", line = 3)
    public class484(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V", line = 9)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (arg1) {
                field7348 = null;
            }
            ++field7344;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7349[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I", line = 20)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return 64;
            } else {
                ++field7340;
                return 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7349[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V", line = 34)
    public static void method3686(int arg0) {
        try {
            if (arg0 == 14336) {
                field7345 = null;
                field7348 = null;
                field7339 = null;
                field7347 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7349[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)I", line = 47)
    public final int method3687(boolean arg0) {
        try {
            if (!arg0) {
                return 86;
            } else {
                ++field7343;
                return super.field4849;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7349[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 58)
    public final void method848(int arg0) {
        try {
            ++field7346;
            if (super.field4850.field6379.method4133(true) && !class752.method5455(125, super.field4850.field6379.method4132(true))) {
                super.field4849 = 0;
            }
            if (super.field4849 < 0 || super.field4849 > 2) {
                super.field4849 = this.method847(0);
            }
            if (arg0 != -20456) {
                field7348 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7349[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Z", line = 75)
    public final boolean method3688(int arg0) {
        try {
            if (arg0 != 3) {
                this.method846(-9, false);
            }
            ++field7342;
            return class752.method5455(126, super.field4850.field6379.method4132(true));
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7349[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Les;)V", line = 91)
    public class484(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I", line = 99)
    public final int method852(int arg0, int arg1) {
        try {
            ++field7341;
            if (arg0 != 1) {
                return 96;
            } else {
                return !class752.method5455(126, super.field4850.field6379.method4132(true)) ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7349[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3689(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3690(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
