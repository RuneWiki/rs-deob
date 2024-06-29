import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class524 extends class543 {

    @OriginalMember(owner = "client!va", name = "z", descriptor = "S")
    public short field7120;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "S")
    public short field7125;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lfja;")
    public static class783 field7119 = new class783(114, 7);

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Lcja;")
    public static class46 field7128 = new class46(4);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "F")
    public static float field7126;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "[I")
    public static int[] field7130;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([Lbq;Z)I", line = 8)
    public final int method2262(class307[] arg0, boolean arg1) {
        ++field7124;
        if (arg1) {
            this.field7125 = -29;
        }
        return this.method3065(super.field7398 >> class654.field9055, -102, super.field7396 >> class654.field9055, arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lha;Lcn;IIBZI)V", line = 19)
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 > 41) {
            ++field7121;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 34)
    public final void method905(int arg0) {
        ++field7118;
        if (arg0 != -16665) {
            field7128 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILtc;Ltc;)V", line = 48)
    public static final void method2983(int arg0, int arg1, int arg2, class373 arg3, class373 arg4) {
        class549 var5 = class663.method3754(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7462 = arg3;
            var5.field7463 = arg4;
            int var6 = class745.field10286 == class178.field2805 ? 1 : 0;
            if (arg3.method902(0)) {
                if (arg3.method910(false)) {
                    arg3.field7407 = class684.field9523[var6];
                    class684.field9523[var6] = arg3;
                } else {
                    arg3.field7407 = class451.field6179[var6];
                    class451.field6179[var6] = arg3;
                    class180.field2828 = true;
                }
            } else {
                arg3.field7407 = class265.field3738[var6];
                class265.field3738[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method902(0)) {
                    if (arg4.method910(false)) {
                        arg4.field7407 = class684.field9523[var6];
                        class684.field9523[var6] = arg4;
                        return;
                    }
                    arg4.field7407 = class451.field6179[var6];
                    class451.field6179[var6] = arg4;
                    class180.field2828 = true;
                    return;
                }
                arg4.field7407 = class265.field3738[var6];
                class265.field3738[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Z", line = 105)
    public final boolean method2263(int arg0) {
        if (arg0 != -2) {
            this.field7120 = -8;
        }
        ++field7129;
        return class641.field8883[(super.field7396 >> class654.field9055) - class434.field5912 - -class389.field5342][(super.field7398 >> class654.field9055) + -class111.field1920 + class389.field5342];
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIIII)V", line = 117)
    public class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7120 = (short) arg6;
        super.field7405 = arg1;
        super.field7398 = arg2;
        super.field7404 = (byte) arg4;
        super.field7391 = (byte) arg3;
        this.field7125 = (short) arg5;
        super.field7396 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "k", descriptor = "(I)Z", line = 131)
    public static final boolean method2984(int arg0) {
        class398.field5501 = true;
        ++field7127;
        ++class27.field510;
        int var1 = -56 % ((33 - arg0) / 35);
        return true;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V", line = 145)
    public static void method2985(byte arg0) {
        if (arg0 != -36) {
            field7126 = -1.0823597F;
        }
        field7128 = null;
        field7130 = null;
        field7119 = null;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)Z", line = 157)
    public final boolean method904(int arg0) {
        ++field7123;
        if (arg0 != 0) {
            field7130 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILha;)Z", line = 168)
    public final boolean method2261(int arg0, class66 arg1) {
        ++field7122;
        int var3 = -73 % ((arg0 - 21) / 48);
        return class658.method3699(this.method907(-20425), -22727, super.field7404, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
    }
}
