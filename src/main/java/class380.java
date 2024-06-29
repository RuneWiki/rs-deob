import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class380 extends class694 {

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "Luc;")
    public static class27 field5351 = new class27(56, 4);

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "Lfc;")
    public static class235 field5353 = new class235(6, 3);

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "[Lus;")
    private class1[] field5350;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static void method2198(byte arg0) {
        if (arg0 == 9) {
            field5351 = null;
            field5353 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[[I)V")
    private final void method2199(int arg0, int[][] arg1) {
        ++field5345;
        int var3 = class465.field6544;
        int var4 = -30 / ((-2 - arg0) / 35);
        int var5 = class250.field3529;
        class600.method3325(arg1, true);
        class620.method3462(class384.field5383, (byte) -46, 0, class168.field2537, 0);
        if (this.field5350 != null) {
            for (int var6 = 0; ~this.field5350.length < ~var6; ++var6) {
                class1 var7 = this.field5350[var6];
                int var8 = var7.field7;
                int var9 = var7.field4;
                if (~var8 > -1) {
                    if (var9 >= 0) {
                        var7.method8(var5, var3, false);
                    }
                } else if (var9 < 0) {
                    var7.method2(var3, true, var5);
                } else {
                    var7.method6(-110, var3, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILva;)V")
    public static final void method2200(int arg0, class457 arg1) {
        if (arg0 != -1) {
            field5351 = null;
        }
        ++field5349;
        if (arg1 instanceof class225) {
            class225 var2 = (class225) arg1;
            if (var2.field3245 != null) {
                class46.method253(class253.field3576.field520 != var2.field520, var2, true);
                return;
            }
        } else {
            if (!(arg1 instanceof class286)) {
                return;
            }
            class286 var3 = (class286) arg1;
            class150.method1057(-1, class253.field3576.field520 != var3.field520, var3);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)V")
    public static final void method2201(int arg0, boolean arg1) {
        ++field5352;
        if (!arg1) {
            class675.field9543 = -1;
            class480.field6695 = arg0;
            class675.field9543 = -1;
            class299.method1863((byte) -102);
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field5347;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int var4 = class465.field6544;
            int var5 = class250.field3529;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field9740.method3482((byte) -94);
            this.method2199(arg0 ^ 22226, var6);
            for (int var8 = 0; ~var8 > ~class250.field3529; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class465.field6544; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class249.method1537(4080, var15 << 4);
                    var12[var14] = class249.method1537(var15 >> 4, 4080);
                    var11[var14] = class249.method1537(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 != -22151) {
            this.method15(50, -8);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(III)I")
    public static final int method2202(int arg0, int arg1, int arg2) {
        ++field5348;
        if (arg1 != 4 && ~arg1 != -6) {
            if (arg0 != 29496) {
                method2200(-27, (class457) null);
            }
            return 256;
        } else {
            return class234.field3318[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
    public class380() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field5350 = new class1[arg1.method718(114)];
            for (int var4 = 0; var4 < this.field5350.length; ++var4) {
                int var5 = arg1.method718(-64);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field5350[var4] = class482.method2726(arg1, -102);
                            }
                        } else {
                            this.field5350[var4] = class326.method1971((byte) 99, arg1);
                        }
                    } else {
                        this.field5350[var4] = class154.method1080(-1, arg1);
                    }
                } else {
                    this.field5350[var4] = class247.method1525(arg1, (byte) 46);
                }
            }
        } else if (arg0 == 1) {
            super.field9744 = ~arg1.method718(-55) == -2;
        }
        int var7 = -27 / ((arg2 - 58) / 63);
        ++field5344;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field5346;
        if (arg0 < 112) {
            method2198((byte) 40);
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            this.method2199(-92, super.field9751.method2717(0));
        }
        return var3;
    }
}
