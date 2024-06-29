import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class143 extends class13 {

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    private int field2040 = 2048;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    private int field2053 = 10;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Lkh;")
    public static class11 field2047 = new class11(new byte[5000]);

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "[I")
    public static int[] field2054 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "Lbj;")
    public static class131 field2049 = new class131(64);

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lms;")
    public static class453 field2056 = null;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "[I")
    private int[] field2045;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[I")
    private int[] field2050;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "[[Lms;")
    public static class453[][] field2057;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
    public static final void method981(int arg0, int arg1) {
        ++field2043;
        class239 var2 = class436.method2740(arg1, arg0, arg1 ^ -323285783);
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method982(boolean arg0) {
        field2056 = null;
        field2054 = null;
        field2057 = null;
        field2049 = null;
        field2047 = null;
        if (!arg0) {
            method983(-67, -84, 93);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2048;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            return null;
        } else {
            if (super.field263.field1845) {
                int var4 = class277.field3873[arg1];
                if (this.field2042 != 0) {
                    for (int var5 = 0; class269.field3751 > var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class296.field4148[var5];
                        int var9 = this.field2042;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var4 + -4096 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~this.field2053 < ~var10; ++var10) {
                            if (var6 >= this.field2045[var10] && ~this.field2045[var10 + 1] < ~var6) {
                                if (this.field2050[var10] > var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~this.field2053 < ~var12; ++var12) {
                        if (~this.field2045[var12] >= ~var4 && var4 < this.field2045[var12 + 1]) {
                            if (this.field2050[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class36.method346(var3, 0, class269.field3751, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        int var2 = -111 / ((2 - arg0) / 51);
        this.method985((byte) 46);
        ++field2041;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lms;")
    public static final class453 method983(int arg0, int arg1, int arg2) {
        ++field2051;
        class453 var3 = class442.method2767(arg1, arg0 + -1229996207);
        if (arg0 == arg2) {
            return var3;
        } else {
            return var3 != null && var3.field6382 != null && arg2 < var3.field6382.length ? var3.field6382[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZILjava/lang/String;Ljava/lang/String;ZJIIZ)V")
    public static final void method984(int arg0, int arg1, boolean arg2, int arg3, String arg4, String arg5, boolean arg6, long arg7, int arg8, int arg9, boolean arg10) {
        ++field2044;
        int[] var12 = new int[4];
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class11 var14 = new class11(128);
        var14.method173(10, 255);
        var14.method191((arg10 ? 1 : 0) | (!arg2 ? 0 : 2) | (arg6 ? 4 : 0), -79);
        var14.method165(arg7, (byte) 16);
        var14.method155(15489, var12[0]);
        var14.method160(arg5, false);
        var14.method155(15489, var12[1]);
        var14.method191(class331.field4578, -115);
        var14.method173(arg0, arg1 + 247);
        var14.method173(arg9, arg1 ^ 247);
        var14.method155(15489, var12[2]);
        var14.method191(arg3, -85);
        var14.method191(arg8, arg1 + -106);
        var14.method155(15489, var12[3]);
        var14.method168(class375.field5355, (byte) -95, class191.field2632);
        class11 var15 = new class11(350);
        var15.method160(arg4, false);
        int var16 = 8 - class273.method1782((byte) 25, arg4) % arg1;
        for (int var17 = 0; ~var16 < ~var17; ++var17) {
            var15.method173((int) (255.0D * Math.random()), 255);
        }
        var15.method159(var12, (byte) -123);
        class46.field648.field191 = 0;
        class46.field648.method173(22, 255);
        class46.field648.method191(2 - -var14.field191 + var15.field191, -100);
        class46.field648.method191(567, arg1 + -89);
        class46.field648.method213(var14.field230, arg1 + 119, var14.field191, 0);
        class46.field648.method213(var15.field230, 117, var15.field191, 0);
        class401.field5703 = 0;
        class145.field2063 = 0;
        class438.field6170 = -3;
        class19.field367 = 1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 <= 50) {
            method981(95, -8);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2042 = arg0.method172((byte) 52);
                }
            } else {
                this.field2040 = arg0.method174(255);
            }
        } else {
            this.field2053 = arg0.method172((byte) 52);
        }
        ++field2055;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    private final void method985(byte arg0) {
        if (arg0 != 46) {
            method983(-70, 56, 61);
        }
        ++field2046;
        this.field2045 = new int[this.field2053 + 1];
        this.field2050 = new int[this.field2053 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field2053;
        int var4 = this.field2040 * var3 >> 12;
        for (int var5 = 0; ~this.field2053 < ~var5; ++var5) {
            this.field2045[var5] = var2;
            this.field2050[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2045[this.field2053] = 4096;
        this.field2050[this.field2053] = this.field2050[0] + 4096;
    }
}
