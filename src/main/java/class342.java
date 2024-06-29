import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class342 extends class232 {

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    private int field5584;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field5586 = new String[] { method2880(method2879("r>X8Y")), method2880(method2879("r>X=Y")), method2880(method2879("r>XE\u0018z'\u0002GY")), method2880(method2879("r>X5Y")), method2880(method2879("r>X?Y")), method2880(method2879("z;\u001a\u0015")), method2880(method2879("o`XW\f")), method2880(method2879("r>X<Y")) };

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "Lvn;")
    public static class330 field5583 = new class330(84, -1);

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
    public static final int method2876(int arg0) {
        try {
            if (arg0 != 84) {
                return 123;
            } else {
                ++field5582;
                class29 var1 = class223.field3499;
                synchronized (class223.field3499) {
                    return class223.field3499.method290(false);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5586[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 == -1) {
                this.field5584 = (arg1.method1645((byte) -71) << 12) / 255;
            }
            ++field5581;
            if (arg0 < 96) {
                field5583 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5586[7] + arg0 + ',' + (arg1 != null ? field5586[6] : field5586[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public static void method2877(int arg0) {
        try {
            if (arg0 != -1) {
                field5583 = null;
            }
            field5583 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5586[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field5580;
            if (arg1 != 123) {
                this.field5584 = 3;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                class405.method3257(var3, 0, class449.field6969, this.field5584);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5586[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(III)V")
    public static final void method2878(int arg0, int arg1, int arg2) {
        try {
            ++field5585;
            class551 var3 = class380.method3113(arg0 ^ 126, (long) arg1 | (long) arg2 << 32, arg0);
            var3.method4089(63);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5586[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
    public class342(int arg0) {
        super(0, true);
        this.field5584 = 4096;
        try {
            this.field5584 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5586[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class342() {
        this(4096);
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2879(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 113);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2880(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
