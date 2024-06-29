import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class621 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    public static int[] field8772 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field8769;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field8773;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Ljfa;")
    public class264[] field8774;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3600(int arg0, int arg1, int arg2) {
        field8775++;
        if (arg2 != -1) {
            method3602(1L, (byte) 3, null, 51, -25, 24, -21, 65, null);
        }
        return class121.method1078(30518, arg0, arg1) | (arg1 & 0x70000) != 0 || class403.method2586(arg0, arg1, 115);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLie;)V", line = 16)
    public final void method3601(boolean arg0, class6 arg1) {
        this.field8773 = arg1.method86(-34);
        field8768++;
        this.field8769 = arg1.method67(12021);
        if (arg0) {
            this.field8773 = 114;
        }
        this.field8774 = new class264[arg1.method70(-9059)];
        class444[] var3 = class260.method1854(120);
        for (int var4 = 0; var4 < this.field8774.length; var4++) {
            this.field8774[var4] = this.method3603(arg1, 0, var3[arg1.method70(-9059)]);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(JBLpca;IIIIILua;)V", line = 42)
    public static final void method3602(long arg0, byte arg1, class665 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class617 arg8) {
        field8776++;
        int var10 = arg3 * arg3 + arg6 * arg6;
        int var11 = 107 % ((-arg1 - 31) / 52);
        if (arg0 < (long) var10) {
            return;
        }
        int var12 = Math.min(arg2.field9411 / 2, arg2.field9282 / 2);
        if (var10 <= var12 * var12) {
            class418.method2671(arg8, arg6, arg5, arg4, true, arg2, arg3, class234.field3719[arg7]);
            return;
        }
        var12 -= 10;
        int var13;
        if (class126.field2062 == 4) {
            var13 = (int) class37.field514 & 0x3FFF;
        } else {
            var13 = (int) class37.field514 + class44.field616 & 0x3FFF;
        }
        int var14 = class567.field8139[var13];
        int var15 = class567.field8138[var13];
        if (class126.field2062 != 4) {
            var15 = var15 * 256 / (class64.field820 + 256);
            var14 = var14 * 256 / (class64.field820 + 256);
        }
        int var16 = arg3 * var14 + arg6 * var15 >> 14;
        int var17 = arg3 * var15 - (arg6 * var14) >> 14;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) ((double) var12 * Math.sin(var18));
        int var21 = (int) ((double) var12 * Math.cos(var18));
        class597.field8469[arg7].method3963((float) arg2.field9411 / 2.0F + (float) arg5 + (float) var20, (float) arg2.field9282 / 2.0F + (float) arg4 + (float) (-var21), 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lie;ILeu;)Ljfa;", line = 95)
    private final class264 method3603(class6 arg0, int arg1, class444 arg2) {
        field8771++;
        if (class24.field379 == arg2) {
            return class310.method2126((byte) 123, arg0);
        }
        if (arg1 != 0) {
            method3600(34, 97, -112);
        }
        if (class89.field1075 == arg2) {
            return class164.method1327(8966, arg0);
        } else if (class673.field9482 == arg2) {
            return class41.method522(1, arg0);
        } else if (class524.field7646 == arg2) {
            return class131.method1142(arg0, -3);
        } else if (class677.field9527 == arg2) {
            return class459.method2878(-111, arg0);
        } else if (class355.field5664 == arg2) {
            return class160.method1316(arg0, true);
        } else if (class412.field6320 == arg2) {
            return class136.method1171(arg0, -29951);
        } else if (class147.field2460 == arg2) {
            return class333.method2307(arg0, -103);
        } else if (class609.field8651 == arg2) {
            return class598.method3495(arg0, arg1 - 120);
        } else if (class683.field9584 == arg2) {
            return method3605(arg0, (byte) -115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 140)
    public static void method3604(int arg0) {
        if (arg0 == -27530) {
            field8772 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lie;B)Lbl;", line = 155)
    private static final class602 method3605(class6 arg0, byte arg1) {
        field8770++;
        class272 var2 = class136.method1171(arg0, -29951);
        int var3 = arg0.method45(-8652);
        return arg1 > -22 ? null : new class602(var2.field7323, var2.field7322, var2.field7318, var2.field7314, var2.field7317, var2.field7316, var2.field7319, var2.field7324, var2.field7321, var2.field4387, var2.field4391, var2.field4389, var2.field4394, var2.field4392, var2.field4384, var3);
    }
}
