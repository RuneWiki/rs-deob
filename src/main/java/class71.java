import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class71 extends class135 {

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    private int field1010 = 0;

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    private int field1015 = 4096;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Z")
    public static boolean field1004 = true;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lqj;")
    public static class196 field1005 = class80.method502("<col=ffff00>", -48);

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field1008 = 1;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "[I")
    public static int[] field1001 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "[I")
    public static int[] field1009 = new int[5];

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
    public static int[] field1011 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lqj;")
    private static class196 field1014 = class80.method502("Choose Option", -48);

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field1002 = 0;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Lqj;")
    public static class196 field1000 = field1014;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "[[[B")
    public static byte[][][] field1013;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field1012;
        if (arg1) {
            method455((byte) -33);
        }
        int[] var3 = super.field1954.method110(arg0, 103);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-111, 0, arg0);
            for (int var5 = 0; var5 < class131.field1862; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1010 >= ~var6 && this.field1015 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3) {
        class61 var4 = class249.field4410[arg0][arg1][arg2];
        if (var4 != null) {
            class7 var5 = var4.field830;
            if (var5 != null) {
                var5.field74 = var5.field74 * arg3 / 16;
                var5.field66 = var5.field66 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class71() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)Lni;")
    public static final class7 method454(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null ? null : var3.field830;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1015 = arg0.method318(true);
            }
        } else {
            this.field1010 = arg0.method318(true);
        }
        ++field1003;
        if (arg2 != -16231) {
            field1009 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V")
    public static void method455(byte arg0) {
        field1009 = null;
        field1011 = null;
        field1000 = null;
        field1014 = null;
        field1013 = null;
        int var1 = -100 % ((arg0 - 56) / 40);
        field1001 = null;
        field1005 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IZ)I")
    public static final int method456(int arg0, boolean arg1) {
        ++field1007;
        double var2 = (double) ((arg0 & 65392) >> 8) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 255) / 256.0D;
        double var6 = var4;
        if (var4 > var2) {
            var6 = var2;
        }
        double var8 = (double) (255 & arg0) / 256.0D;
        double var10 = var4;
        double var12 = 0.0D;
        if (var2 > var4) {
            var10 = var2;
        }
        if (var8 > var10) {
            var10 = var8;
        }
        if (var6 > var8) {
            var6 = var8;
        }
        if (arg1) {
            method453(-77, -127, -87, -32);
        }
        double var14 = (var6 + var10) / 2.0D;
        double var16 = 0.0D;
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (~var18 < -256) {
            var18 = 255;
        }
        if (var6 != var10) {
            if (var4 == var10) {
                var12 = (-var8 + var2) / (var10 - var6);
            } else if (var2 == var10) {
                var12 = (-var4 + var8) / (var10 - var6) + 2.0D;
            } else if (var8 == var10) {
                var12 = (-var2 + var4) / (-var6 + var10) + 4.0D;
            }
            if (var14 < 0.5D) {
                var16 = (var10 - var6) / (var6 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (-var6 + var10) / (2.0D - var10 - var6);
            }
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var16 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 >= 0) {
            if (var21 > 255) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (var18 > 243) {
            var21 >>= 4;
        } else if (~var18 >= -218) {
            if (var18 > 192) {
                var21 >>= 2;
            } else if (~var18 < -180) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 3;
        }
        return (var18 >> 1) + (var21 >> 5 << 7) + (var22 >> 2 << 10);
    }
}
