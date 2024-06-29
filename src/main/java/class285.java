import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class285 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Z")
    public boolean field4061 = true;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field4062 = -1;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public int field4070 = 128;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Lgn;")
    public static class475 field4072;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "[I")
    public static int[] field4075;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
    public static int[] field4076;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lhe;")
    public static class239 field4074;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "[[B")
    public static byte[][] field4068;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "[[I")
    public static int[][] field4073;

    static {
        new class194("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4072 = new class475(65, 2);
        field4075 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
        field4076 = new int[200];
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lae;I)V", line = 3)
    public final void method1725(class156 arg0, int arg1) {
        if (arg1 != 65488) {
            return;
        }
        field4066++;
        while (true) {
            int var3 = arg0.method941((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method1729(arg0, (byte) 39, var3);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V", line = 25)
    private final void method1726(int arg0, int arg1) {
        field4063++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFD0) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = (double) arg1;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field4065 = (int) (var15 * 256.0D);
        this.field4069 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field4067 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4067 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4065 < 0) {
            this.field4065 = 0;
        } else if (this.field4065 > 255) {
            this.field4065 = 255;
        }
        if (this.field4069 < 0) {
            this.field4069 = 0;
        } else if (this.field4069 > 255) {
            this.field4069 = 255;
        }
        if (this.field4067 < 1) {
            this.field4067 = 1;
        }
        this.field4060 = (int) ((double) this.field4067 * var19);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILrl;II)Loc;", line = 117)
    public static final class129 method1727(int arg0, int arg1, int arg2, class487 arg3, int arg4, int arg5) {
        field4058++;
        if (arg4 != 34037) {
            field4075 = null;
        }
        if (!arg3.field7454 && (!class403.method2418(arg2, (byte) 86) || !class403.method2418(arg0, (byte) 100))) {
            return arg3.field7459 ? new class129(arg3, 34037, arg5, arg1, arg2, arg0, true) : new class129(arg3, arg5, arg1, arg2, arg0, class340.method2064(arg4 - 34008, arg2), class340.method2064(-122, arg0), true);
        } else {
            return new class129(arg3, 3553, arg5, arg1, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 136)
    public static void method1728(byte arg0) {
        field4075 = null;
        field4074 = null;
        field4068 = null;
        field4072 = null;
        field4076 = null;
        field4073 = null;
        if (arg0 != -5) {
            field4074 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lae;BI)V", line = 164)
    private final void method1729(class156 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4059 = arg0.method943(1295851312);
            this.method1726(this.field4059, 0);
        } else if (arg2 == 2) {
            this.field4062 = arg0.method993((byte) -33);
            if (this.field4062 == 65535) {
                this.field4062 = -1;
            }
        } else if (arg2 == 3) {
            this.field4070 = arg0.method993((byte) -96) << 0;
        } else if (arg2 == 4) {
            this.field4061 = false;
        }
        if (arg1 != 39) {
            method1728((byte) 107);
        }
        field4064++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZIZ)V", line = 226)
    public static final void method1730(boolean arg0, int arg1, boolean arg2) {
        field4071++;
        class220 var3 = class224.method1384(arg0, arg2, arg1);
        if (var3 != null) {
            var3.method536(false);
        }
    }
}
