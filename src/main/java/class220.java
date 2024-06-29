import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class220 extends class99 {

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3768 = 0;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3771 = -1;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lr;")
    public static class66 field3772 = class93.method641(43, "null");

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[Lbh;")
    private class50[] field3775;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field3773;
        if (!arg1) {
            this.method10((byte) -45, 77);
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) 89);
        if (super.field1946.field2297) {
            int var4 = class199.field3432;
            int var5 = class16.field223;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1946.method824((byte) 123);
            this.method1409(var6, 23891);
            for (int var8 = 0; ~class16.field223 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class199.field3432; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class115.method767(var15 << 4, 4080);
                    var12[var14] = class115.method767(65280, var15) >> 4;
                    var11[var14] = class115.method767(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field3776;
        if (~arg1 == arg2) {
            this.field3775 = new class50[arg0.method1677(-6677)];
            for (int var4 = 0; this.field3775.length > var4; ++var4) {
                int var5 = arg0.method1677(-6677);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field3775[var4] = class66.method468(-20084, arg0);
                            }
                        } else {
                            this.field3775[var4] = class82.method564((byte) 121, arg0);
                        }
                    } else {
                        this.field3775[var4] = class216.method1395((byte) 116, arg0);
                    }
                } else {
                    this.field3775[var4] = class127.method878(3, arg0);
                }
            }
        } else if (~arg1 == -2) {
            super.field1938 = arg0.method1677(-6677) == 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public static void method1408(int arg0) {
        field3772 = null;
        if (arg0 > -62) {
            method1408(-27);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([[II)V")
    private final void method1409(int[][] arg0, int arg1) {
        ++field3769;
        int var3 = class199.field3432;
        if (arg1 == 23891) {
            int var4 = class16.field223;
            class202.method1307(128, arg0);
            class43.method290(class45.field833, 0, 0, 20685, class98.field1914);
            if (this.field3775 != null) {
                for (int var5 = 0; ~var5 > ~this.field3775.length; ++var5) {
                    class50 var6 = this.field3775[var5];
                    int var7 = var6.field893;
                    int var8 = var6.field889;
                    if (~var8 > -1) {
                        if (var7 >= 0) {
                            var6.method79(true, var3, var4);
                        }
                    } else if (var7 < 0) {
                        var6.method75(var4, 103, var3);
                    } else {
                        var6.method80(var3, 23700, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public static final void method1410(int arg0) {
        if (arg0 == 0) {
            ++field3774;
            for (class14 var1 = (class14) class180.field3146.method873((byte) 76); var1 != null; var1 = (class14) class180.field3146.method870((byte) 104)) {
                if (var1.field179 > 0) {
                    --var1.field179;
                }
                if (~var1.field179 != -1) {
                    if (var1.field178 > 0) {
                        --var1.field178;
                    }
                    if (~var1.field178 == -1 && var1.field175 >= 1 && var1.field168 >= 1 && var1.field175 <= 102 && ~var1.field168 >= -103 && (~var1.field181 > -1 || class201.method1306(var1.field181, var1.field174, 28446))) {
                        class165.method1116(arg0, var1.field170, var1.field181, var1.field175, var1.field173, var1.field174, var1.field171, var1.field168);
                        var1.field178 = -1;
                        if (~var1.field181 == ~var1.field172 && var1.field172 == -1) {
                            var1.method560(-17554);
                        } else if (~var1.field181 == ~var1.field172 && var1.field177 == var1.field171 && ~var1.field174 == ~var1.field167) {
                            var1.method560(-17554);
                        }
                    }
                } else if (var1.field172 < 0 || class201.method1306(var1.field172, var1.field167, 28446)) {
                    class165.method1116(0, var1.field170, var1.field172, var1.field175, var1.field173, var1.field167, var1.field177, var1.field168);
                    var1.method560(-17554);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            field3772 = null;
        }
        ++field3770;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            this.method1409(super.field1943.method748(arg0 ^ 32023), 23891);
        }
        return var3;
    }
}
