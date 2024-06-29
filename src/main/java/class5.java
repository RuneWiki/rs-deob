import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class8 {

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "S")
    public static short field64 = 205;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "Lrk;")
    public static class270 field62 = new class270(64);

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "[Lqi;")
    public static class129[] field66 = new class129[14];

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "[I")
    public static int[] field67 = new int[2];

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Lsg;")
    public static class163 field68;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Lwf;")
    public static class1 field69;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[[[B")
    public static byte[][][] field60;

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -55 / ((arg3 - -44) / 51);
        ++field59;
        int var8 = class51.method393(arg5, 0, class161.field2561, class51.field896);
        int var9 = class51.method393(arg2, 0, class161.field2561, class51.field896);
        int var10 = class51.method393(arg1, 0, class255.field4055, class9.field128);
        int var11 = class51.method393(arg4, 0, class255.field4055, class9.field128);
        int var12 = class51.method393(arg0 + arg5, 0, class161.field2561, class51.field896);
        int var13 = class51.method393(arg2 - arg0, 0, class161.field2561, class51.field896);
        for (int var14 = var8; ~var14 > ~var12; ++var14) {
            class56.method420(class29.field452[var14], arg6, -7, var10, var11);
        }
        for (int var15 = var9; ~var15 < ~var13; --var15) {
            class56.method420(class29.field452[var15], arg6, -7, var10, var11);
        }
        int var16 = class51.method393(arg0 + arg1, 0, class255.field4055, class9.field128);
        int var17 = class51.method393(-arg0 + arg4, 0, class255.field4055, class9.field128);
        for (int var18 = var12; ~var13 <= ~var18; ++var18) {
            int[] var19 = class29.field452[var18];
            class56.method420(var19, arg6, -7, var10, var16);
            class56.method420(var19, arg6, -7, var17, var11);
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public static void method43(int arg0) {
        field68 = null;
        field60 = null;
        field66 = null;
        field62 = null;
        field67 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field69 = null;
        }
        field69 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            return null;
        } else {
            ++field58;
            int[] var3 = super.field110.method1585(0, arg1);
            if (super.field110.field3734) {
                int var4 = class182.field2864[arg1];
                for (int var5 = 0; ~class231.field3798 < ~var5; ++var5) {
                    var3[var5] = this.method45(class176.field2776[var5], (byte) -111, var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)I")
    private final int method45(int arg0, byte arg1, int arg2) {
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        ++field63;
        if (arg1 >= -55) {
            method42(-25, 89, 33, -73, 74, 48, 63);
        }
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
