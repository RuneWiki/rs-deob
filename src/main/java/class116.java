import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class116 extends class132 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Ltg;")
    public static class184 field2096 = class135.method812("(U4", 3);

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Ltg;")
    public static class184 field2101 = class135.method812("::gc", 3);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
    public static int[] field2102 = new int[128];

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Ltg;")
    private static class184 field2098 = class135.method812("button near the top of that page)3", 3);

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Ltg;")
    public static class184 field2094 = field2098;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Ltg;")
    public static class184 field2099 = class135.method812("<col=ffff00>", 3);

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Ltg;")
    public static class184 field2097 = class135.method812("sl_back", 3);

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
    public static int[] field2105 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class194 var8 = new class194();
        var8.field3758 = arg2 / 128;
        var8.field3766 = arg3 / 128;
        var8.field3756 = arg4 / 128;
        var8.field3773 = arg5 / 128;
        var8.field3775 = arg1;
        var8.field3772 = arg2;
        var8.field3762 = arg3;
        var8.field3771 = arg4;
        var8.field3749 = arg5;
        var8.field3752 = arg6;
        var8.field3768 = arg7;
        class19.field358[arg0][class19.field371[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method709(int arg0) {
        field2094 = null;
        field2102 = null;
        int var1 = -115 / ((-arg0 - 8) / 45);
        field2098 = null;
        field2097 = null;
        field2101 = null;
        field2099 = null;
        field2096 = null;
        field2105 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static final int method710(int arg0, int arg1) {
        if (arg0 != 0) {
            method708(-24, 59, 55, 34, -89, -56, -15, -68);
        }
        field2095++;
        class21 var2 = class50.method278(arg1, arg0 ^ 0xFFFFFFB4);
        int var3 = var2.field399;
        int var4 = var2.field403;
        int var5 = class17.field326[var3 - var4];
        int var6 = var2.field395;
        return var5 & class94.field1710[var6] >> var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
    public static final void method711(byte arg0, int arg1, int arg2) {
        field2104++;
        class21 var3 = class50.method278(arg1, -116);
        int var4 = var3.field395;
        int var5 = var3.field403;
        int var6 = var3.field399;
        int var7 = class17.field326[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        if (arg0 > -101) {
            field2097 = null;
        }
        int var8 = var7 << var5;
        class94.field1710[var4] = class123.method748(class10.method61(~var8, class94.field1710[var4]), class10.method61(arg2 << var5, var8));
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
    public class116(int arg0, int arg1) {
        this.field2100 = arg0;
        this.field2106 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLjava/util/Random;)I")
    public static final int method712(int arg0, boolean arg1, Random arg2) {
        field2103++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class111.method683(arg0, arg1)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class99.method619(105, arg0, var4);
        }
    }
}
