import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class231 extends class102 {

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "Lqe;")
    public static class179 field4258 = class206.method1380("Zugewiesener Speicher)3", (byte) -28);

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Lqe;")
    public static class179 field4260 = class206.method1380("k", (byte) -126);

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (!arg0) {
            field4260 = null;
        }
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            int[] var5 = this.method679(arg1, 1, (byte) -109);
            int[] var6 = this.method679(arg1, 2, (byte) -109);
            for (int var7 = 0; class155.field2796 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        ++field4261;
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class231() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1512(true, (class52) null);
        }
        ++field4257;
        if (arg1 == 0) {
            super.field1957 = ~arg0.method1243(3) == -2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field4260 = null;
        if (arg0 != 0) {
            method1513(81);
        }
        field4258 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLeh;)V")
    public static final void method1512(boolean arg0, class52 arg1) {
        ++field4262;
        if (arg0) {
            method1512(true, (class52) null);
        }
        class50.field1075 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        ++field4256;
        for (int var1 = 0; ~class202.field3742 < ~var1; ++var1) {
            int var2 = class74.field1449[var1];
            class115 var3 = class23.field554[var2];
            int var4 = class36.field789.method1243(3);
            if ((var4 & 128) != 0) {
                var4 += class36.field789.method1243(3) << 8;
            }
            class176.method1115(-127, var4, var2, var3);
        }
        if (arg0 != -20023) {
            field4260 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4255;
        int[][] var3 = super.field1950.method598((byte) -72, arg0);
        if (super.field1950.field1724) {
            int[] var4 = this.method679(arg0, 2, (byte) -109);
            int[][] var5 = this.method677(arg1 + 9, arg0, 0);
            int[][] var6 = this.method677(124, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class155.field2796; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var7[var16] = var14[var16];
                        var8[var16] = var13[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg1 != 64) {
            field4260 = null;
        }
        return var3;
    }
}
