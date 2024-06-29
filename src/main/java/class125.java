import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class125 extends class272 {

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    private int field2250 = 585;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lli;")
    public static class185 field2247 = class245.method1649("(R", -51);

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Lli;")
    public static class185 field2249 = class245.method1649("Choisir une option", 125);

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Llc;")
    public static class138 field2252;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
    public static int[][] field2242;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2242 = null;
        field2252 = null;
        field2249 = null;
        field2247 = null;
        if (arg0 < 48) {
            method906(true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static final void method905(int arg0) {
        ++field2251;
        class116.method808();
        for (int var1 = 0; var1 < 4; ++var1) {
            class165.field3090[var1].method295(5);
        }
        System.gc();
        if (arg0 > -86) {
            method907((byte) 121);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
    public static final void method906(boolean arg0) {
        if (arg0) {
            method906(true);
        }
        class109.field1964.method80(-14113);
        class242.field4325.method80(-14113);
        ++field2243;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2248;
        int[] var3 = super.field4819.method1632(0, arg0);
        if (arg1 != 4421) {
            method907((byte) -58);
        }
        if (super.field4819.field4294) {
            int var4 = class232.field4177[arg0];
            for (int var5 = 0; class246.field4385 > var5; ++var5) {
                int var6 = class38.field598[var5];
                if (this.field2250 < var6 && var6 < -this.field2250 + 4096 && ~var4 < ~(-this.field2250 + 2048) && ~var4 > ~(this.field2250 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2250);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field2250 + 2048 < var6 && ~var6 > ~(2048 - -this.field2250)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field2250;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2250 + 2048);
                } else if (var4 >= this.field2250 && ~(-this.field2250 + 4096) <= ~var4) {
                    if (var6 >= this.field2250 && ~var6 >= ~(4096 - this.field2250)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2250 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field2250;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2250);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2250 = arg0.method827(255);
        }
        ++field2244;
        int var5 = -61 % ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method907(byte arg0) {
        if (class42.field643 != null) {
            class42.field643.method140(16384);
        }
        ++field2245;
        if (class196.field3596 != null) {
            class196.field3596.method140(16384);
        }
        if (arg0 != -21) {
            method907((byte) -97);
        }
    }
}
