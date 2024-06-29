import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class113 extends class259 {

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    private int field2252 = 585;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Z")
    public static boolean field2240 = true;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "[S")
    public static short[] field2242 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[I")
    public static int[] field2241 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!la", name = "X", descriptor = "Lsg;")
    public static class30 field2245 = class167.method1221((byte) 33, "Fps:");

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "Lsg;")
    public static class30 field2248 = class167.method1221((byte) 33, ")2");

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field2251 = 0;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lmc;")
    public static class151 field2243;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "Lmc;")
    public static class151 field2249;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "Lgh;")
    public static class190 field2247;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
    public static void method885(boolean arg0) {
        field2249 = null;
        field2242 = null;
        field2247 = null;
        field2245 = null;
        if (arg0) {
            method885(false);
        }
        field2241 = null;
        field2248 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field2246;
        if (arg1) {
            field2241 = null;
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = class154.field2910[arg0];
            for (int var5 = 0; class223.field3999 > var5; ++var5) {
                int var6 = class29.field558[var5];
                if (var6 > this.field2252 && -this.field2252 + 4096 > var6 && -this.field2252 + 2048 < var4 && this.field2252 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2252 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field2252) && this.field2252 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2252;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2252 + 2048);
                } else if (var4 >= this.field2252 && ~(-this.field2252 + 4096) <= ~var4) {
                    if (var6 >= this.field2252 && ~(-this.field2252 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2252 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2252;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2252);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method4(48, 89, (class8) null);
        }
        if (arg0 == 0) {
            this.field2252 = arg2.method65((byte) 119);
        }
        ++field2250;
    }
}
