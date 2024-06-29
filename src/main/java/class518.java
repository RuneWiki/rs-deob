import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class518 extends class377 {

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    private int field6548 = 4096;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    private int field6551 = 0;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field6552 = 0;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "[B")
    public static byte[] field6559 = new byte[2048];

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "[Lib;")
    public static class143[] field6555;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)Z")
    public static final boolean method2807(int arg0, int arg1, int arg2) {
        if (arg2 != -23925) {
            return false;
        } else {
            ++field6560;
            return ~(arg0 & 24) != -1 | (arg0 & 544) == 544;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4853 = arg2.method3097((byte) 12) == 1;
                }
            } else {
                this.field6548 = arg2.method3031(-1);
            }
        } else {
            this.field6551 = arg2.method3031(-1);
        }
        int var5 = 86 % ((arg1 - 13) / 55);
        ++field6554;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(III)Z")
    public static final boolean method2808(int arg0, int arg1, int arg2) {
        ++field6550;
        if (arg1 < 95) {
            method2807(-25, -85, 15);
        }
        return ~(33 & arg0) != -1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILpp;)V")
    public static final void method2809(int arg0, class365 arg1) {
        ++field6558;
        if (arg0 > -75) {
            field6552 = -78;
        }
        class112 var2 = (class112) class664.field9022.method3828((long) arg1.field495, (byte) -91);
        if (var2 != null) {
            if (var2.field1396 != null) {
                class314.field3941.method1489(var2.field1396);
                var2.field1396 = null;
            }
            var2.method1566(-73);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
    public class518() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
    public static void method2810(int arg0) {
        field6555 = null;
        field6559 = null;
        if (arg0 != 14282) {
            method2811((String) null, -20);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field6549;
        int[] var3 = super.field4842.method2772(arg0, (byte) -127);
        int var4 = 72 / ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) -125);
            for (int var6 = 0; ~class528.field6661 < ~var6; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field6551) {
                    var3[var6] = this.field6551;
                } else if (this.field6548 >= var7) {
                    var3[var6] = var7;
                } else {
                    var3[var6] = this.field6548;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field6557;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = 2 % ((31 - arg1) / 42);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class528.field6661; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (this.field6551 > var13) {
                    var9[var12] = this.field6551;
                } else if (~this.field6548 <= ~var13) {
                    var9[var12] = var13;
                } else {
                    var9[var12] = this.field6548;
                }
                if (this.field6551 <= var14) {
                    if (~this.field6548 <= ~var14) {
                        var10[var12] = var14;
                    } else {
                        var10[var12] = this.field6548;
                    }
                } else {
                    var10[var12] = this.field6551;
                }
                if (~this.field6551 < ~var15) {
                    var11[var12] = this.field6551;
                } else if (~this.field6548 <= ~var15) {
                    var11[var12] = var15;
                } else {
                    var11[var12] = this.field6548;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2811(String arg0, int arg1) {
        if (arg1 > 86) {
            System.out.println("Error: " + class445.method2441(arg0, "%0a", -1, "\n"));
            ++field6553;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method2812(String arg0, String arg1, String arg2, int arg3, int arg4, String arg5, int arg6, String arg7, int arg8) {
        if (arg6 != 24) {
            method2807(-26, 57, -42);
        }
        ++field6556;
        class247 var9 = class691.field9583[99];
        for (int var10 = 99; ~var10 < -1; --var10) {
            class691.field9583[var10] = class691.field9583[var10 + -1];
        }
        if (var9 == null) {
            var9 = new class247(arg8, arg3, arg2, arg1, arg7, arg5, arg4, arg0);
        } else {
            var9.method1480(arg5, arg4, true, arg8, arg1, arg3, arg0, arg2, arg7);
        }
        ++class461.field5749;
        class242.field3119 = class696.field9643;
        class691.field9583[0] = var9;
    }
}
