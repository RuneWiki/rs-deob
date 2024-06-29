import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class276 extends class436 {

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    private int field3741 = 4096;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    private int field3740 = 4096;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    private int field3747 = 4096;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3743 = "";

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3742 = "glow3:";

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public static int field3750 = 255;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "[Llf;")
    public static class130[] field3746;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    public static final void method1692(int arg0) {
        ++field3744;
        class357.field5038.method1249(1);
        if (arg0 != 20408) {
            method1693(true, -24, (class383) null);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZILrg;)I")
    public static final int method1693(boolean arg0, int arg1, class383 arg2) {
        if (arg0) {
            field3746 = null;
        }
        ++field3739;
        if (arg2.field5570 != null && arg2.field5570.length > arg1) {
            try {
                int[] var3 = arg2.field5570[arg1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (var7 == 1) {
                        var8 = class407.field5919[var3[var5++]];
                    }
                    if (var7 == 2) {
                        var8 = class149.field2147[var3[var5++]];
                    }
                    if (var7 == 3) {
                        var8 = class398.field5800[var3[var5++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class383 var12 = class290.method1869((byte) 6, var11);
                        int var13 = var3[var5++];
                        if (~var13 != 0 && (!class347.method2222(var13, 18682).field5662 || class293.field4055)) {
                            for (int var14 = 0; ~var14 > ~var12.field5564.length; ++var14) {
                                if (var13 + 1 == var12.field5564[var14]) {
                                    var8 += var12.field5560[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var8 = class447.field6439[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class379.field5395[-1 + class149.field2147[var3[var5++]]];
                    }
                    if (var7 == 7) {
                        var8 = 100 * class447.field6439[var3[var5++]] / 46875;
                    }
                    if (~var7 == -9) {
                        var8 = class307.field4211.field5000;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class22.field289[var15]) {
                                var8 += class149.field2147[var15];
                            }
                        }
                    }
                    if (~var7 == -11) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class383 var18 = class290.method1869((byte) 68, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class347.method2222(var19, 18682).field5662 || class293.field4055)) {
                            for (int var20 = 0; var18.field5564.length > var20; ++var20) {
                                if (var19 + 1 == var18.field5564[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var7 == 11) {
                        var8 = class44.field675;
                    }
                    if (~var7 == -13) {
                        var8 = class8.field126;
                    }
                    if (~var7 == -14) {
                        int var21 = class447.field6439[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = (var21 & 1 << var22) != 0 ? 1 : 0;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var5++];
                        var8 = class315.method2012(21375, var23);
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (~var7 == -17) {
                        var9 = 2;
                    }
                    if (var7 == 18) {
                        var8 = (class307.field4211.field6197 >> 7) + class449.field6509;
                    }
                    if (~var7 == -18) {
                        var9 = 3;
                    }
                    if (var7 == 19) {
                        var8 = (class307.field4211.field6192 >> 7) - -class354.field4981;
                    }
                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }
                    if (var9 != 0) {
                        var6 = var9;
                    } else {
                        if (var6 == 0) {
                            var4 += var8;
                        }
                        if (~var6 == -2) {
                            var4 -= var8;
                        }
                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }
                        if (~var6 == -4) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        ++field3738;
        if (arg0 != -13348) {
            this.field3740 = -119;
        }
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class43.field653 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3741 * var12 >> 12;
                    var9[var11] = this.field3740 * var13 >> 12;
                    var10[var11] = this.field3747 * var14 >> 12;
                } else {
                    var8[var11] = this.field3741;
                    var9[var11] = this.field3740;
                    var10[var11] = this.field3747;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
    public static final void method1694(boolean arg0, byte arg1) {
        if (arg0) {
            if (~class230.field3089 != 0) {
                class192.method1272(class230.field3089, 126);
            }
            for (class432 var2 = (class432) class271.field3700.method1413(30381); var2 != null; var2 = (class432) class271.field3700.method1420((byte) -113)) {
                if (!var2.method2460(103)) {
                    var2 = (class432) class271.field3700.method1413(30381);
                    if (var2 == null) {
                        break;
                    }
                }
                class54.method371(var2, false, true, 0);
            }
            class230.field3089 = -1;
            class271.field3700 = new class223(8);
            class410.method2629((byte) 6);
            class230.field3089 = class142.field2048;
            class279.method1706(0, false);
            class210.method1362(17612);
            class111.method739(class230.field3089);
        }
        ++field3749;
        class243.method1525((byte) -128);
        class247.field3422 = -1;
        class179.method1190(class89.field1363, 3163);
        class307.field4211 = new class354();
        class307.field4211.field6197 = 6656;
        if (arg1 >= 36) {
            class307.field4211.field6192 = 6656;
            class307.field4211.field956[0] = 52;
            class336.field4561 = 0;
            class368.field5158 = 0;
            class307.field4211.field944[0] = 52;
            if (~class123.field1731 == -3) {
                class336.field4561 = class208.field2809 << 7;
                class368.field5158 = class389.field5658 << 7;
            } else {
                class258.method1585(-1);
            }
            class240.method1521(-5001);
            if (~class368.field5158 != -1 && ~class336.field4561 != -1) {
                class157.method1059(-87);
                class312.method1977(28, (byte) 80);
            } else {
                class312.method1977(10, (byte) 46);
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V")
    public static final void method1695(byte arg0) {
        class312.method1977(25, (byte) 47);
        ++field3737;
        class399.method2585(true);
        System.gc();
        int var1 = 73 / ((arg0 - -66) / 57);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3747 = arg2.method2403((byte) 81);
                }
            } else {
                this.field3740 = arg2.method2403((byte) 40);
            }
        } else {
            this.field3741 = arg2.method2403((byte) 90);
        }
        if (arg0 != 34) {
            this.method18(-19, 74, (class371) null);
        }
        ++field3745;
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
    public static void method1696(int arg0) {
        field3746 = null;
        field3743 = null;
        if (arg0 != 6656) {
            method1692(81);
        }
        field3742 = null;
    }
}
