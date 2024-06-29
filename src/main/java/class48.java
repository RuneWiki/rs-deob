import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class48 extends class135 {

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field575 = 7759444;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "[I")
    public static int[] field581 = new int[] { 0, -1, 0, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 4, 0, 0, -1, 8, 6, 0, -2, 0, -2, 0, 24, 4, 0, 6, 4, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 0, 0, 0, -2, 5, 0, -1, 0, 0, -2, 0, 0, 10, 0, 4, 0, 6, 6, 0, 8, 0, 4, -1, 7, 0, 0, -1, 0, 0, 0, 0, 0, 0, 10, 0, 0, -1, 6, 8, 0, 12, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 14, 3, 7, -2, 0, 0, -2, 0, 5, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 2, -1, 0, 0, 0, 2, -1, 0, -2, 0, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 6, 5, 20, 0, -2, 0, 1, 0, 15, 0, 3, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 1, 0, 8, 0, 0, 15, 0, 0, 0, 0, 0, 0, 7, 0, 0, 6, -2, 0, 0, 0, 5, 0, 5, 0, 0, 2, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, -2, 4, 0, 6, -1, 0, 10, -2, 6, 0, 4, 0, -1, 0, -2, 0, 0, 0, 5, 0, -1, 0, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "Lqj;")
    public static class196 field585 = class80.method502("Versteckt", -48);

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field572 = 0;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "[S")
    public static short[] field584 = new short[] { 29, 58, 57, 51, 15, 28, 14, 34 };

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            field584 = null;
        }
        ++field576;
        int[] var3 = super.field1954.method110(arg0, 122);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-128, 0, arg0);
            for (int var5 = 0; ~var5 > ~class131.field1862; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static void method256(int arg0) {
        field581 = null;
        if (arg0 != -31931) {
            field581 = null;
        }
        field585 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            method257(30, (class196) null);
        }
        if (~arg1 == -1) {
            super.field1962 = arg0.method367(1) == 1;
        }
        ++field582;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqj;)V")
    public static final void method257(int arg0, class196 arg1) {
        class195.field3420 = arg1;
        int var2 = 52 / ((arg0 - 59) / 42);
        class206.method1405((byte) -99);
        ++field578;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            method258(-107, -97, -15, -23, 33);
        }
        ++field580;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class131.field1862 < ~var11; ++var11) {
                var10[var11] = -var5[var11] + 4096;
                var7[var11] = -var6[var11] + 4096;
                var9[var11] = -var8[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class252.field4463 > -101) {
            class92.method569(111);
        }
        ++field574;
        class55.method296(arg3, arg4, arg0 + arg3, arg2 + arg4);
        if (~class252.field4463 > -101) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg3;
            int var7 = -var5 + arg4 - (-(arg2 / 2) - -18);
            class55.method295(arg3, arg4, arg0, arg2, 0);
            class55.method302(var6 - 152, var7, 304, 34, 9179409);
            class55.method302(var6 - 151, var7 + 1, 302, 32, 0);
            class55.method295(var6 - 150, var7 + 2, class252.field4463 * 3, 30, 9179409);
            class55.method295(var6 - -(class252.field4463 * 3) + -150, var7 - -2, -(class252.field4463 * 3) + 300, 30, 0);
            class23.field292.method1249(class214.field3824, var6, var7 - -var5, 16777215, -1);
        } else {
            class172.field2891 = class126.field1784 - (int) ((double) arg2 / class199.field3530);
            class221.field3991 = -((int) ((double) arg0 / class199.field3530)) + class157.field2537;
            class42.field481 = (int) ((double) (arg0 * 2) / class199.field3530);
            class132.field1885 = (int) ((double) (arg2 * 2) / class199.field3530);
            int var8 = class126.field1784 - (int) ((double) arg2 / class199.field3530);
            int var9 = class157.field2537 - (int) ((double) arg0 / class199.field3530);
            int var10 = (int) ((double) arg0 / class199.field3530) + class157.field2537;
            int var11 = (int) ((double) arg2 / class199.field3530) + class126.field1784;
            class62.method393(var10, var8, -123, var11, arg3 - -arg0, arg3, arg2 + arg4, arg4, var9);
            class144.method890(arg2 + arg4, true, arg4, arg3, var8, var9, arg0 + arg3, var10, var11);
            if (arg1 != 300) {
                method256(26);
            }
            if (class235.field4182 > 0) {
                --class235.field4182;
            }
            if (class135.field1969) {
                int var12 = arg4 + -8 + arg2;
                int var13 = arg3 - 5 + arg0;
                class226.field4045.method1247(class93.method572(arg1 + -361, new class196[] { class120.field1733, class163.method1029(class44.field524, false) }), var13, var12, 16776960, -1);
                int var17 = var12 - 15;
                int var14 = 16776960;
                Runtime var15 = Runtime.getRuntime();
                int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
                if (var16 > 65536) {
                    var14 = 16711680;
                }
                class226.field4045.method1247(class93.method572(-75, new class196[] { class218.field3905, class163.method1029(var16, false), class136.field1991 }), var13, var17, var14, -1);
                var12 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, false);
    }
}
