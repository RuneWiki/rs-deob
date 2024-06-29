import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class444 extends class220 {

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "Z")
    private boolean field6476 = true;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    private int field6477 = 4096;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "Ljava/lang/String;")
    public static String field6467 = "cyan:";

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "Z")
    public static boolean field6471 = true;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class444() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field6475;
            int[][] var3 = super.field3135.method1774(arg0, arg1 + -2);
            if (super.field3135.field4087) {
                int[] var4 = this.method1366(0, (byte) -40, class315.field4510 & arg0 + -1);
                int[] var5 = this.method1366(0, (byte) -40, arg0);
                int[] var6 = this.method1366(0, (byte) -40, arg0 + 1 & class315.field4510);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~var10 > ~class344.field5043; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field6477;
                    int var12 = (var5[class392.field5887 & var10 + 1] + -var5[var10 - 1 & class392.field5887]) * this.field6477;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    } else {
                        var18 = 0;
                        var20 = 0;
                        var19 = 0;
                    }
                    if (this.field6476) {
                        var19 = (var19 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                        var18 = (var18 >> 1) + 2048;
                    }
                    var7[var10] = var20;
                    var8[var10] = var18;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public static final void method2796(int arg0) {
        ++field6469;
        if (class164.field2134) {
            class164.field2134 = false;
            class252.field3658 = null;
            if (arg0 == 16777216) {
                class39.field629 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
    public static final void method2797(int arg0, byte arg1) {
        ++field6474;
        class24 var2 = class353.field5183;
        synchronized (class353.field5183) {
            class353.field5183.method215(0, arg0);
        }
        class24 var3 = class280.field4116;
        synchronized (class280.field4116) {
            class280.field4116.method215(0, arg0);
            if (arg1 != 50) {
                field6470 = -17;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field6468;
        if (arg1 == -49) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field6476 = arg2.method1697(-48) == 1;
                }
            } else {
                this.field6477 = arg2.method1685(8104);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
    public static void method2798(int arg0) {
        field6467 = null;
        if (arg0 > -32) {
            method2796(122);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfg;Lfg;IIIIIIII)V")
    public static final void method2799(class18 arg0, class18 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6472;
        int var10 = arg1.method142((byte) 115);
        if (var10 != -1) {
            Object var11 = null;
            class243 var12 = (class243) class142.field1869.method209(118, (long) var10);
            if (var12 == null) {
                class25[] var13 = class25.method222(class247.field3446, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class35.field574.method2166(var13[0], true);
                class142.field1869.method202(true, var12, (long) var10);
            }
            class374.method2475(arg5, 31496, arg9 >> 1, arg0.field5298, arg0.field5284, arg3 >> 1, 64 * arg0.method130((byte) -107), 0, arg6);
            int var14 = class82.field1161[0] + arg2 - arg7;
            int var15 = arg4 / 4 * 18 + var14;
            int var16 = class82.field1161[1] + arg8 + -70;
            int var17 = arg4 % 4 * 18 + var16;
            var12.method1499(var15, var17);
            if (arg0 == arg1) {
                class35.field574.method2774(18, var15 + -1, 18, false, var17 + -1, -256);
            }
            class160 var18 = class432.method2742(106);
            var18.field2090 = arg1;
            var18.field2094 = var17 + 16;
            var18.field2100 = var15;
            var18.field2098 = var15 + 16;
            var18.field2097 = var17;
            class374.field5634.method974(var18, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
    public static final String method2800(int arg0, String[] arg1, int arg2, byte arg3) {
        ++field6473;
        if (~arg2 == -1) {
            return "";
        } else {
            if (arg3 != 124) {
                method2796(60);
            }
            if (arg2 == 1) {
                String var4 = arg1[arg0];
                return var4 != null ? var4.toString() : "null";
            } else {
                int var5 = arg0 + arg2;
                int var6 = 0;
                for (int var7 = arg0; var5 > var7; ++var7) {
                    String var11 = arg1[var7];
                    if (var11 == null) {
                        var6 += 4;
                    } else {
                        var6 += var11.length();
                    }
                }
                StringBuffer var8 = new StringBuffer(var6);
                for (int var9 = arg0; ~var9 > ~var5; ++var9) {
                    String var10 = arg1[var9];
                    if (var10 != null) {
                        var8.append(var10);
                    } else {
                        var8.append("null");
                    }
                }
                return var8.toString();
            }
        }
    }
}
