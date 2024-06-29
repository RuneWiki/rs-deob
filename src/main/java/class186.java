import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class186 extends class198 {

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    private int field2885 = 4096;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "[I")
    public static int[] field2884 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2888 = 2;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lfa;")
    public static class273 field2883;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public static void method1267(int arg0) {
        if (arg0 != 1) {
            field2884 = null;
        }
        field2884 = null;
        field2883 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field2889;
        if (!arg0) {
            field2884 = null;
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1 + -1 & class52.field704);
            int[] var5 = this.method1367((byte) -79, 0, arg1);
            int[] var6 = this.method1367((byte) -79, 0, arg1 + 1 & class52.field704);
            for (int var7 = 0; var7 < class42.field590; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2885;
                int var9 = (var5[var7 + 1 & class227.field3594] + -var5[class227.field3594 & var7 + -1]) * this.field2885;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)J")
    public static final long method1268(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2431; ++var4) {
                class114 var5 = var3.field2418[var4];
                if ((var5.field1712 >> 29 & 3L) == 2L && var5.field1724 == arg1 && var5.field1719 == arg2) {
                    return var5.field1712;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2885 = arg1.method1419(100);
        }
        ++field2890;
        int var4 = 72 / ((arg0 - 60) / 61);
    }
}
