import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class31 extends class30 {

    @OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
    private int field391 = 4096;

    @OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
    private int field390 = 0;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "Lwd;")
    public static class148 field385;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "Lgh;")
    public static class325 field383;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "[[[B")
    public static byte[][][] field382;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V", line = 6)
    public static void method211(byte arg0) {
        int var1 = 82 / ((-5 - arg0) / 62);
        field385 = null;
        field382 = null;
        field383 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIFIIZII)[I", line = 18)
    public static final int[] method212(boolean arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field388;
        int[] var8 = new int[arg6];
        class358 var9 = new class358();
        var9.field5474 = arg1;
        if (!arg5) {
            method211((byte) -57);
        }
        var9.field5473 = arg4;
        var9.field5484 = (int) (arg2 * 4096.0F);
        var9.field5468 = arg3;
        var9.field5483 = arg0;
        var9.field5476 = arg7;
        var9.method111((byte) 125);
        class299.method2017((byte) 47, arg6, 1);
        var9.method2336(19643, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljg;II)V", line = 43)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field384;
        if (arg1 != 6456) {
            method211((byte) -65);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field391 = arg0.method1272((byte) -95);
            }
        } else {
            this.field390 = arg0.method1272((byte) -94);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V", line = 87)
    public class31() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIIII)V", line = 91)
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class58 var5 = (class58) class245.field4023.method253((byte) -6); var5 != null; var5 = (class58) class245.field4023.method247((byte) 81)) {
            class288.method1946(var5, arg2, arg4, arg3, arg1, -6639);
        }
        ++field387;
        for (class58 var6 = (class58) class3.field81.method253((byte) -6); var6 != null; var6 = (class58) class3.field81.method247((byte) 75)) {
            byte var11 = 1;
            class349 var12 = var6.field757.method912(-5);
            if (var6.field757.field1831) {
                var11 = 0;
            } else if (var6.field757.field1851 != var12.field5413 && var6.field757.field1851 != var12.field5370 && var6.field757.field1851 != var12.field5379 && ~var6.field757.field1851 != ~var12.field5391) {
                if (var6.field757.field1851 == var12.field5406 || var6.field757.field1851 == var12.field5362 || var6.field757.field1851 == var12.field5398 || var6.field757.field1851 == var12.field5389) {
                    var11 = 3;
                }
            } else {
                var11 = 2;
            }
            if (~var6.field729 != ~var11) {
                int var13 = class275.method1854(var6.field757, (byte) 87);
                if (var6.field741 != var13) {
                    if (var6.field753 != null) {
                        class82.field1025.method2479(var6.field753);
                        var6.field753 = null;
                    }
                    var6.field741 = var13;
                }
                var6.field729 = var11;
            }
            var6.field740 = var6.field757.field724;
            var6.field737 = var6.field757.field724 + var6.field757.method903(-46) * 64;
            var6.field730 = var6.field757.field722;
            var6.field756 = var6.field757.field722 + 64 * var6.field757.method903(-116);
            class288.method1946(var6, arg2, arg4, arg3, arg1, -6639);
        }
        if (arg0 > 80) {
            for (class58 var7 = (class58) class126.field1939.method1776(true); var7 != null; var7 = (class58) class126.field1939.method1773(-1)) {
                byte var8 = 1;
                class349 var9 = var7.field747.method912(-5);
                if (!var7.field747.field1831) {
                    if (~var7.field747.field1851 != ~var9.field5413 && var7.field747.field1851 != var9.field5370 && var7.field747.field1851 != var9.field5379 && var7.field747.field1851 != var9.field5391) {
                        if (~var7.field747.field1851 == ~var9.field5406 || ~var7.field747.field1851 == ~var9.field5362 || ~var7.field747.field1851 == ~var9.field5398 || var7.field747.field1851 == var9.field5389) {
                            var8 = 3;
                        }
                    } else {
                        var8 = 2;
                    }
                } else {
                    var8 = 0;
                }
                if (var7.field729 != var8) {
                    int var10 = class35.method226(var7.field747, 113);
                    if (~var7.field741 != ~var10) {
                        if (var7.field753 != null) {
                            class82.field1025.method2479(var7.field753);
                            var7.field753 = null;
                        }
                        var7.field741 = var10;
                    }
                    var7.field729 = var8;
                }
                var7.field740 = var7.field747.field724;
                var7.field737 = var7.field747.field724 + 64 * var7.field747.method903(-42);
                var7.field730 = var7.field747.field722;
                var7.field756 = var7.field747.field722 + 64 * var7.field747.method903(-65);
                class288.method1946(var7, arg2, arg4, arg3, arg1, -6639);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)[I", line = 211)
    public final int[] method116(int arg0, byte arg1) {
        ++field386;
        int[] var3 = super.field371.method2367((byte) -79, arg0);
        if (arg1 <= 49) {
            return null;
        } else {
            if (super.field371.field5586) {
                int[] var4 = this.method210((byte) 19, 0, arg0);
                for (int var5 = 0; var5 < class369.field5610; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field390 && var6 <= this.field391 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
