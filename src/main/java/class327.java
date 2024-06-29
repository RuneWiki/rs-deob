import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class327 extends class56 {

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    private int field4049 = 0;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    private int field4053 = 4096;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field4046 = 0;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Z")
    public static boolean field4052 = true;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lar;Z)V")
    public static final void method1946(class712 arg0, boolean arg1) {
        for (int var2 = arg0.field9994; var2 <= arg0.field9991; ++var2) {
            for (int var3 = arg0.field9997; var3 <= arg0.field9990; ++var3) {
                class727 var4 = class107.field1351[arg0.field808][var2][var3];
                if (var4 != null) {
                    class10 var5 = var4.field10174;
                    class10 var6 = null;
                    while (var5 != null) {
                        if (var5.field187 == arg0) {
                            if (var6 != null) {
                                var6.field186 = var5.field186;
                            } else {
                                var4.field10174 = var5.field186;
                            }
                            var5.method170(27);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field186;
                    }
                }
            }
        }
        if (!arg1) {
            class502.method3001(arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class327() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field4048;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            this.method145(-68, -43);
        }
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 109);
            for (int var5 = 0; class642.field8759 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field4049 >= ~var6) {
                    if (~var6 >= ~this.field4053) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field4053;
                    }
                } else {
                    var3[var5] = this.field4049;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            this.method187((byte) 65, -43);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field762 = ~arg2.method2396((byte) -93) == -2;
                }
            } else {
                this.field4053 = arg2.method2390((byte) 34);
            }
        } else {
            this.field4049 = arg2.method2390((byte) -125);
        }
        ++field4050;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field4051;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[][] var4 = this.method495(70, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class642.field8759; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field4049) {
                    if (~this.field4053 > ~var12) {
                        var8[var11] = this.field4053;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4049;
                }
                if (~this.field4049 >= ~var13) {
                    if (this.field4053 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field4053;
                    }
                } else {
                    var9[var11] = this.field4049;
                }
                if (this.field4049 <= var14) {
                    if (var14 > this.field4053) {
                        var10[var11] = this.field4053;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field4049;
                }
            }
        }
        if (arg0 <= 35) {
            this.field4053 = 47;
        }
        return var3;
    }
}
