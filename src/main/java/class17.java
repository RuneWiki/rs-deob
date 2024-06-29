import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class17 extends class371 {

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "I")
    private int field150 = 0;

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "I")
    private int field151 = 4096;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    public static int field147 = -1;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "Lnj;")
    public static class487 field148 = new class487("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!mda", name = "Q", descriptor = "I")
    public static int field155 = -1;

    @OriginalMember(owner = "client!mda", name = "P", descriptor = "Lqc;")
    public static class325 field154 = new class325(8);

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!mda", name = "O", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!mda", name = "R", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)[[I", line = 4)
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            field147 = -119;
        }
        ++field156;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -29, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class41.field455; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field150) {
                    if (var12 <= this.field151) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field151;
                    }
                } else {
                    var8[var11] = this.field150;
                }
                if (var13 >= this.field150) {
                    if (var13 <= this.field151) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field151;
                    }
                } else {
                    var9[var11] = this.field150;
                }
                if (this.field150 <= var14) {
                    if (this.field151 < var14) {
                        var10[var11] = this.field151;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field150;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V", line = 81)
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(BI)[I", line = 90)
    public final int[] method79(byte arg0, int arg1) {
        ++field149;
        if (arg0 > -80) {
            this.field151 = -55;
        }
        int[] var3 = super.field5378.method1451(92, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -78, arg1, 0);
            for (int var5 = 0; ~var5 > ~class41.field455; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field150) {
                    if (this.field151 < var6) {
                        var3[var5] = this.field151;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field150;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)V", line = 145)
    public static final void method80(int arg0) {
        ++field152;
        try {
            if (~class110.field1406 == arg0) {
                int var1 = class240.field3505.method2539(arg0 ^ -2);
                if (~var1 < -1 && class240.field3505.method2547(104)) {
                    int var2 = var1 - class548.field8167;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class240.field3505.method2548(var2, (byte) -106);
                } else {
                    class240.field3505.method2525(arg0 ^ -4);
                    class240.field3505.method2559(-108);
                    class280.field4160 = null;
                    if (class42.field504 == null) {
                        class110.field1406 = 0;
                    } else {
                        class110.field1406 = 2;
                    }
                    class127.field1682 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class240.field3505.method2525(2);
            class42.field504 = null;
            class127.field1682 = null;
            class110.field1406 = 0;
            class280.field4160 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBLps;)V", line = 195)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field5360 = ~arg2.method2561((byte) -76) == -2;
                }
            } else {
                this.field151 = arg2.method2620(27);
            }
        } else {
            this.field150 = arg2.method2620(58);
        }
        int var5 = -39 % ((-15 - arg1) / 39);
        ++field153;
    }

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "(I)V", line = 238)
    public static void method82(int arg0) {
        field154 = null;
        if (arg0 == 0) {
            field148 = null;
        }
    }
}
