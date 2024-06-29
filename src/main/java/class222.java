import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class222 extends class160 {

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3406 = "Face here";

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lng;")
    public static class78 field3412;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "[Led;")
    public static class186[] field3405;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "[Lee;")
    private class288[] field3415;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "[[[Lam;")
    public static class180[][][] field3411;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([[II)V")
    private final void method1495(int[][] arg0, int arg1) {
        ++field3409;
        int var3 = class240.field3896;
        int var4 = class79.field1328;
        class111.method787(arg0, arg1 ^ -83);
        class295.method1965((byte) -126, class53.field811, class189.field2929, 0, 0);
        if (this.field3415 != null) {
            for (int var5 = 0; ~var5 > ~this.field3415.length; ++var5) {
                class288 var6 = this.field3415[var5];
                int var7 = var6.field4567;
                int var8 = var6.field4559;
                if (var8 < 0) {
                    if (~var7 <= -1) {
                        var6.method106(1429, var3, var4);
                    }
                } else if (var7 < 0) {
                    var6.method104(-85, var4, var3);
                } else {
                    var6.method105(var3, var4, -17);
                }
            }
        }
        if (arg1 != -1) {
            field3406 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (super.field2488.field42) {
            this.method1495(super.field2488.method17(-1), -1);
        }
        if (arg1 != 57) {
            return null;
        } else {
            ++field3413;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 <= 11) {
            method1497((byte) -61);
        }
        ++field3414;
        if (arg2 == 0) {
            this.field3415 = new class288[arg0.method633(124)];
            for (int var4 = 0; ~this.field3415.length < ~var4; ++var4) {
                int var5 = arg0.method633(85);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field3415[var4] = class105.method754(arg0, 0);
                            }
                        } else {
                            this.field3415[var4] = class30.method236(true, arg0);
                        }
                    } else {
                        this.field3415[var4] = class286.method1920(arg0, (byte) 122);
                    }
                } else {
                    this.field3415[var4] = class191.method1282(28580, arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field2494 = ~arg0.method633(55) == -2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field3408;
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (!arg1) {
            this.method2((class88) null, 121, -60);
        }
        if (super.field2476.field1950) {
            int var4 = class240.field3896;
            int var5 = class79.field1328;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2476.method841(!arg1);
            this.method1495(var6, -1);
            for (int var8 = 0; class79.field1328 > var8; ++var8) {
                int[][] var9 = var7[var8];
                int[] var10 = var9[0];
                int[] var11 = var6[var8];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class240.field3896; ++var14) {
                    int var15 = var11[var14];
                    var13[var14] = class55.method420(var15, 255) << 4;
                    var12[var14] = class55.method420(4080, var15 >> 4);
                    var10[var14] = class55.method420(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1496(class235 arg0, int arg1) {
        if (arg1 > 0) {
            class56.field922 = arg0;
            ++field3410;
        }
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        field3405 = null;
        field3411 = null;
        field3412 = null;
        if (arg0 != 51) {
            method1497((byte) -99);
        }
        field3406 = null;
    }
}
