import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class267 extends class273 {

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    private int field4709 = 4096;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Z")
    private boolean field4710 = true;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "J")
    public static long field4716 = 0L;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field4712 = -1;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Lhj;")
    public static class70 field4708 = new class70();

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "Ljd;")
    public static class86 field4717 = class122.method868("<col=40ff00>", true);

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "[I")
    public static int[] field4707;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "[I")
    public static int[] field4714;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field4713;
        int[][] var3 = super.field4787.method1657(arg0, (byte) -122);
        int var4 = 5 / ((12 - arg1) / 58);
        if (super.field4787.field4355) {
            int[] var5 = this.method1863(-95, 0, arg0 - 1 & class274.field4808);
            int[] var6 = this.method1863(-116, 0, arg0);
            int[] var7 = this.method1863(-93, 0, arg0 + 1 & class274.field4808);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class176.field3200 > var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field4709;
                int var13 = var12 >> 12;
                int var14 = (var6[var11 + 1 & class90.field1844] + -var6[class90.field1844 & var11 + -1]) * this.field4709;
                int var15 = var14 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = var13 * var13 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 - -var17 + 4096) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (var18 != 0) {
                    var19 = var12 / var18;
                    var20 = 16777216 / var18;
                    var21 = var14 / var18;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                }
                if (this.field4710) {
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var19;
                var10[var11] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class267() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4710 = arg1.method1408((byte) -108) == 1;
            }
        } else {
            this.field4709 = arg1.method1410(-104);
        }
        ++field4711;
        if (arg2 > -16) {
            this.field4710 = false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method1837(boolean arg0) {
        field4717 = null;
        field4707 = null;
        field4708 = null;
        if (!arg0) {
            field4717 = null;
        }
        field4714 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lvg;I)V")
    public static final void method1838(class72 arg0, int arg1) {
        if (arg1 < -70) {
            ++field4715;
            class181.field3254 = arg0;
        }
    }
}
