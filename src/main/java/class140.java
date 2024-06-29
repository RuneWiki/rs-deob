import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 extends class27 {

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    private int field2731 = 0;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    private int field2733 = 4096;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lkb;")
    private static class93 field2722 = class76.method390("Please try using a different world)3", 0);

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Lkb;")
    private static class93 field2725 = class76.method390("Walk here", 0);

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
    public static boolean field2721 = false;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lkb;")
    public static class93 field2716 = field2725;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Lkb;")
    public static class93 field2729 = field2722;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Lkb;")
    public static class93 field2717 = field2722;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lkb;")
    public static class93 field2734 = field2722;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Lkb;")
    public static class93 field2727 = field2722;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
    public static int[] field2720 = new int[50];

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lkb;")
    public static class93 field2719 = class76.method390("Cabbage", 0);

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lkb;")
    public static class93 field2732 = field2722;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lkb;")
    public static class93 field2726 = field2722;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "[Z")
    public static boolean[] field2730;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field2728;
        if (arg0 <= 106) {
            field2717 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field435 = arg2.method1054(128) == 1;
                }
            } else {
                this.field2733 = arg2.method1071(28101);
            }
        } else {
            this.field2731 = arg2.method1071(28101);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        ++field2724;
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 124, arg0);
            for (int var5 = 0; var5 < class159.field3209; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field2731) {
                    if (~var6 < ~this.field2733) {
                        var3[var5] = this.field2733;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field2731;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static void method874(byte arg0) {
        field2717 = null;
        field2726 = null;
        if (arg0 < 88) {
            field2725 = null;
        }
        field2727 = null;
        field2716 = null;
        field2734 = null;
        field2719 = null;
        field2729 = null;
        field2722 = null;
        field2720 = null;
        field2732 = null;
        field2725 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field2735;
        int[][] var3 = super.field436.method537(0, arg1);
        int var4 = -123 % ((arg0 - 42) / 54);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 90);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var5[2];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class159.field3209 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var9[var12];
                int var15 = var7[var12];
                if (~this.field2731 >= ~var13) {
                    if (~this.field2733 <= ~var13) {
                        var8[var12] = var13;
                    } else {
                        var8[var12] = this.field2733;
                    }
                } else {
                    var8[var12] = this.field2731;
                }
                if (~this.field2731 < ~var15) {
                    var10[var12] = this.field2731;
                } else if (this.field2733 < var15) {
                    var10[var12] = this.field2733;
                } else {
                    var10[var12] = var15;
                }
                if (~this.field2731 >= ~var14) {
                    if (this.field2733 < var14) {
                        var11[var12] = this.field2733;
                    } else {
                        var11[var12] = var14;
                    }
                } else {
                    var11[var12] = this.field2731;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IZ)V")
    public static final void method875(int arg0, boolean arg1) {
        class201.method1316(0);
        if (arg0 > -12) {
            field2722 = null;
        }
        ++field2718;
        ++class14.field242;
        if (~class14.field242 <= -51 || arg1) {
            class14.field242 = 0;
            if (!class18.field300 && class147.field2840 != null) {
                ++class108.field1967;
                class151.field2908.method47(168, 8);
                try {
                    class147.field2840.method6(0, class151.field2908.field3162, class151.field2908.field3153, (byte) -33);
                    class151.field2908.field3153 = 0;
                } catch (IOException var2) {
                    class18.field300 = true;
                }
            }
        }
    }
}
