import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 extends class30 {

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    private int field173 = 0;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    private int field172 = 10;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    private int field180 = 2048;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field169 = "Discard";

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field165 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lwg;")
    public static class244 field168 = null;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field178 = -1;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
    private int[] field175;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "[I")
    private int[] field177;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "[[[B")
    public static byte[][][] field176;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 > 90) {
            this.method113((byte) 91);
            ++field166;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V")
    public static void method112(int arg0) {
        field168 = null;
        if (arg0 != -3) {
            field169 = null;
        }
        field169 = null;
        field176 = null;
        field165 = null;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V")
    private final void method113(byte arg0) {
        ++field164;
        int var2 = 0;
        this.field175 = new int[this.field172 - -1];
        this.field177 = new int[this.field172 + 1];
        if (arg0 != 91) {
            this.field180 = -47;
        }
        int var3 = 4096 / this.field172;
        int var4 = this.field180 * var3 >> 12;
        for (int var5 = 0; var5 < this.field172; ++var5) {
            this.field177[var5] = var2;
            this.field175[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field177[this.field172] = 4096;
        this.field175[this.field172] = 4096 - -this.field175[0];
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I")
    public static final int method114(int arg0, int arg1, int arg2) {
        if (arg2 > -99) {
            return 27;
        } else {
            ++field171;
            return arg0 != 4 && ~arg0 != -6 ? 256 : class369.field5597[3 & arg1];
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 == 6456) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field173 = arg0.method1322(false);
                    }
                } else {
                    this.field180 = arg0.method1272((byte) -94);
                }
            } else {
                this.field172 = arg0.method1322(false);
            }
            ++field181;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field174;
        if (arg1 < 49) {
            method120(20, -71, 72, 73, 22, 115, 6, 107, (class312) null, -98, (byte[][][]) null, true, -123);
        }
        int[] var3 = super.field371.method2367((byte) -92, arg0);
        if (super.field371.field5586) {
            int var4 = class132.field2064[arg0];
            if (~this.field173 != -1) {
                for (int var5 = 0; var5 < class369.field5610; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class79.field995[var5];
                    int var9 = this.field173;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field172; ++var10) {
                        if (var6 >= this.field177[var10] && ~var6 > ~this.field177[var10 - -1]) {
                            if (~var6 > ~this.field175[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field172; ++var12) {
                    if (~this.field177[var12] >= ~var4 && ~this.field177[var12 + 1] < ~var4) {
                        if (~this.field175[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class408.method2558(var3, 0, class369.field5610, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILjava/lang/Class;)Ljr;")
    public static final class57 method117(int arg0, int arg1, int arg2, Class arg3) {
        class232 var4 = class423.field6252[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class247 var5 = var4.field3866; var5 != null; var5 = var5.field4054) {
                class57 var6 = var5.field4052;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field726 == arg1 && var6.field720 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)V")
    public static final void method118(byte arg0) {
        ++field170;
        if (!class255.field4136) {
            if (arg0 >= -15) {
                field168 = null;
            }
            class313.method2097(class309.field4886, 0);
            if (class179.field2923 != null) {
                class313.method2097(class179.field2923, 0);
            }
            class255.field4136 = true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
    public static final void method119(int arg0, int arg1, boolean arg2) {
        ++field179;
        if (arg2) {
            field176 = null;
        }
        class211 var3 = class281.method1921(1, arg0, (byte) -93);
        var3.method1490((byte) 117);
        var3.field3379 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIILe;I[[[BZI)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class312 arg8, int arg9, byte[][][] arg10, boolean arg11, int arg12) {
        ++field167;
        if (~arg9 != -1 && ~arg6 != -1) {
            if (arg9 == 9) {
                arg12 = arg12 - -1 & 3;
                arg9 = 1;
            }
            if (~arg9 == -11) {
                arg9 = 1;
                arg12 = arg12 - -3 & 3;
            }
            if (~arg9 == -12) {
                arg9 = 8;
                arg12 = 3 & arg12 - -3;
            }
            arg8.method705(arg7, arg2, arg0, arg4, arg3, arg5, arg10[arg9 + -1][arg12], arg6, arg1);
            if (!arg11) {
                method114(-13, 102, -108);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class12() {
        super(0, true);
    }
}
