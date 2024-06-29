import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class161 extends class102 {

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "[I")
    public static int[] field2914 = new int[50];

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "Lqe;")
    private static class179 field2919 = class206.method1380("Please enter your username)3", (byte) -128);

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lqe;")
    public static class179 field2915 = field2919;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "[B")
    public static byte[] field2917;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        ++field2922;
        int var1 = -((int) ((double) class48.field1036.field169 / class150.field2698)) + class164.field2972;
        int var2 = (int) ((double) class48.field1036.field169 / class150.field2698) + class164.field2972;
        int var3 = -((int) ((double) class48.field1036.field73 / class150.field2698)) + class71.field1421;
        int var4 = (int) ((double) class48.field1036.field73 / class150.field2698) + class71.field1421;
        if (~var1 > -1) {
            class139.field2570 = -1;
            class164.field2972 = (int) ((double) class48.field1036.field169 / class150.field2698);
            class131.field2386 = -1;
        }
        if (arg0 != 22704) {
            method1038(-41, (byte) 61, (class52) null);
        }
        if (class146.field2655 < var2) {
            class139.field2570 = -1;
            class131.field2386 = -1;
            class164.field2972 = -((int) ((double) class48.field1036.field169 / class150.field2698)) + class146.field2655;
        }
        if (~var3 > -1) {
            class131.field2386 = -1;
            class139.field2570 = -1;
            class71.field1421 = (int) ((double) class48.field1036.field73 / class150.field2698);
        }
        if (~var4 < ~class202.field3736) {
            class131.field2386 = -1;
            class139.field2570 = -1;
            class71.field1421 = -((int) ((double) class48.field1036.field73 / class150.field2698)) + class202.field3736;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLeh;)[Lgg;")
    public static final class72[] method1038(int arg0, byte arg1, class52 arg2) {
        ++field2920;
        if (arg1 != 5) {
            field2915 = null;
        }
        return !class185.method1205(19263, arg2, arg0) ? null : class108.method710((byte) -124);
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2915 = null;
        int var1 = 79 % ((arg0 - 49) / 63);
        field2919 = null;
        field2914 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2914 = null;
        }
        ++field2916;
        if (arg1 == 0) {
            super.field1957 = arg0.method1243(3) == 1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field2918;
        int[][] var3 = super.field1950.method598((byte) -99, arg0);
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(arg1 ^ 41, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class155.field2796; ++var11) {
                var9[var11] = -var5[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
                var8[var11] = 4096 - var6[var11];
            }
        }
        if (arg1 != 64) {
            field2914 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field2919 = null;
        }
        ++field2921;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            for (int var5 = 0; ~var5 > ~class155.field2796; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, false);
    }

    static {
        int var0 = 0;
        field2917 = new byte[32896];
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field2917[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 - -65535)) / 65535.0F))));
            }
        }
    }
}
