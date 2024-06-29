import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class242 extends class224 {

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    private int field3874 = 409;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    private int field3875 = 4096;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    private int field3870 = 4096;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private int field3881 = 4096;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "[I")
    private int[] field3879 = new int[3];

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "Lrb;")
    public static class268 field3873 = class51.method376(-23163);

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field3880 = -1;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3882 = "scroll:";

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIB)V")
    public static final void method1634(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field3868;
        if (~arg2 <= -8001 && ~arg2 >= -48001) {
            class290.field4582 = arg2;
            class245.field3924 = arg1;
            class72.field1013 = arg0;
            int var4 = -40 % ((arg3 - -70) / 49);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        field3882 = null;
        if (arg0 > 78) {
            field3873 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static final void method1636(int arg0) {
        ++field3883;
        if (arg0 != 7822) {
            method1638((class123) null, 66, (byte) 17);
        }
        try {
            if (~class189.field2985 == -2) {
                int var1 = class135.field1965.method1154((byte) -114);
                if (var1 > 0 && class135.field1965.method1156(120)) {
                    int var2 = var1 - class38.field518;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class135.field1965.method1151(var2, (byte) 113);
                } else {
                    class135.field1965.method1164(arg0 ^ 25057);
                    class135.field1965.method1161(128);
                    if (class63.field887 == null) {
                        class189.field2985 = 0;
                    } else {
                        class189.field2985 = 2;
                    }
                    class135.field1961 = null;
                    class103.field1600 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class135.field1965.method1164(32623);
            class63.field887 = null;
            class103.field1600 = null;
            class135.field1961 = null;
            class189.field2985 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            method1634(true, -91, 85, (byte) -118);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method215((byte) 100);
                            this.field3879[2] = class224.method1526(0, var5 >> 12);
                            this.field3879[0] = class224.method1526(16711680, var5) << 4;
                            this.field3879[1] = class224.method1526(65280, var5) >> 4;
                        }
                    } else {
                        this.field3881 = arg0.method190(-3);
                    }
                } else {
                    this.field3875 = arg0.method190(-3);
                }
            } else {
                this.field3870 = arg0.method190(-3);
            }
        } else {
            this.field3874 = arg0.method190(-3);
        }
        ++field3872;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)Ljava/lang/String;")
    public static final String method1637(int arg0, int arg1) {
        ++field3877;
        if (arg0 != 0) {
            field3880 = 1;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() + -3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class270.field4295 + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class33.field425 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field3871;
        if (arg1 != 1) {
            field3880 = 82;
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(arg1 ^ 108, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class78.field1108; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3879[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field3874) {
                    var9[var11] = var12;
                    var8[var11] = var7[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field3879[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field3874 > ~var15) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field3879[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3874) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field3881 * var12 >> 12;
                            var8[var11] = this.field3875 * var14 >> 12;
                            var10[var11] = this.field3870 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ldl;IB)Lkj;")
    public static final class145 method1638(class123 arg0, int arg1, byte arg2) {
        ++field3869;
        if (!class98.method653(arg2 ^ 106, arg1, arg0)) {
            return null;
        } else {
            if (arg2 != -107) {
                field3873 = null;
            }
            return class143.method955(29);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class242() {
        super(1, false);
    }
}
