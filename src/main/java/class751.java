import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class751 extends class55 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
    public static int[] field10483 = new int[1024];

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "Lhg;")
    public static class693 field10491 = new class693(48, 3);

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "[C")
    private static char[] field10494 = new char[64];

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "[C")
    public static char[] field10495;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
    public static void method4179(int arg0) {
        field10494 = null;
        field10495 = null;
        field10491 = null;
        if (arg0 != 4434) {
            field10494 = null;
        }
        field10483 = null;
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            method4181(1.3808926F, 1.0923866F, -1.242329F, 0.8309662F, 0.60255367F, 94, -51, -0.6540938F);
        }
        ++field10486;
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
    public static final boolean method4180(int arg0, int arg1, int arg2) {
        ++field10484;
        if (arg1 > -9) {
            field10483 = null;
        }
        return (arg2 & 65536) != 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        super.field759.method2423(false, -46);
        ++field10489;
        if (!arg0) {
            method4179(-36);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lij;)V")
    public class751(class424 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFIIF)F")
    public static final float method4181(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, int arg6, float arg7) {
        ++field10493;
        float var8 = 0.0F;
        float var9 = arg3 - arg7;
        float var10 = arg1 - arg0;
        float var11 = -arg4 + arg2;
        if (arg6 != 55) {
            return 1.1774796F;
        } else {
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;
            while (var8 < 1.1F) {
                float var15 = var8 * var9 + arg7;
                float var16 = var8 * var10 + arg0;
                float var17 = var8 * var11 + arg4;
                int var18 = (int) var15 >> 9;
                int var19 = (int) var17 >> 9;
                if (~var18 < -1 && var19 > 0 && var18 < class409.field5183 && class543.field7597 > var19) {
                    int var20 = class380.field4847.field5796;
                    if (var20 < 3 && (class305.field4001[1][var18][var19] & 2) != 0) {
                        ++var20;
                    }
                    int var21 = class707.field9826[var20].method1676((int) var15, true, (int) var17);
                    if ((float) var21 < var16) {
                        if (~arg5 <= -3) {
                            return var8 - 0.1F + method4181(var13, var16, var17, var15, var14, arg5 + -1, 55, var12) * 0.1F;
                        }
                        return var8;
                    }
                }
                var8 += 0.1F;
                var13 = var16;
                var14 = var17;
                var12 = var15;
            }
            return -1.0F;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        ++field10490;
        if (!arg2) {
            field10492 = 58;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        super.field759.method2396(22357, arg2);
        ++field10485;
        super.field759.method2379(arg0, -15829);
        if (arg1 <= 30) {
            this.method197(true, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        int var3 = 45 % ((-61 - arg1) / 44);
        ++field10488;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        super.field759.method2423(true, -102);
        if (arg0 != 5) {
            field10492 = 1;
        }
        ++field10487;
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field10494[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field10494[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field10494[var2] = (char) (var2 + 48 + -52);
        }
        field10494[63] = '-';
        field10494[62] = '*';
        field10495 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }
}
