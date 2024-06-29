import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class69 extends class136 {

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "[Lcc;")
    private class512[] field887;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[[I", line = 5)
    public final int[][] method272(byte arg0, int arg1) {
        ++field891;
        int[][] var3 = super.field1952.method3127((byte) -121, arg1);
        if (arg0 < 33) {
            this.field887 = null;
        }
        if (super.field1952.field7770) {
            int var4 = class467.field6889;
            int var5 = class227.field3310;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1952.method3128((byte) 112);
            this.method662(var6, (byte) 2);
            for (int var8 = 0; class227.field3310 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class467.field6889; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class345.method2089(255, var15) << 4;
                    var12[var14] = class345.method2089(65280, var15) >> 4;
                    var11[var14] = class345.method2089(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method82(int arg0, int arg1) {
        ++field888;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 22 / ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            this.method662(super.field1957.method2885(10), (byte) 2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([[IB)V", line = 90)
    private final void method662(int[][] arg0, byte arg1) {
        ++field890;
        if (arg1 == 2) {
            int var3 = class467.field6889;
            int var4 = class227.field3310;
            class74.method702(arg0, (byte) 85);
            class239.method1591(0, class166.field2356, (byte) -65, class519.field7637, 0);
            if (this.field887 != null) {
                for (int var5 = 0; ~this.field887.length < ~var5; ++var5) {
                    class512 var6 = this.field887[var5];
                    int var7 = var6.field7554;
                    int var8 = var6.field7550;
                    if (~var7 > -1) {
                        if (~var8 <= -1) {
                            var6.method1249(24245, var4, var3);
                        }
                    } else if (~var8 <= -1) {
                        var6.method1252(-125, var4, var3);
                    } else {
                        var6.method1251(var4, 4, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfs;ZLya;)V", line = 140)
    public static final void method663(class387 arg0, boolean arg1, class38 arg2) {
        ++field885;
        class218[] var3 = class218.method1497(arg0, class235.field3448, 0);
        class2.field17 = new class16[var3.length];
        if (!arg1) {
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class2.field17[var4] = arg2.method389(var3[var4], true);
            }
            class218[] var5 = class218.method1497(arg0, class231.field3403, 0);
            class147.field2062 = new class16[var5.length];
            for (int var6 = 0; var5.length > var6; ++var6) {
                class147.field2062[var6] = arg2.method389(var5[var6], true);
            }
            class218[] var7 = class218.method1497(arg0, class490.field7192, 0);
            class112.field1582 = new class16[var7.length];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                class112.field1582[var8] = arg2.method389(var7[var8], true);
            }
            class218[] var9 = class218.method1497(arg0, class26.field313, 0);
            class224.field3293 = new class16[var9.length];
            for (int var10 = 0; ~var10 > ~var9.length; ++var10) {
                class224.field3293[var10] = arg2.method389(var9[var10], true);
            }
            class218[] var11 = class218.method1497(arg0, class486.field7135, 0);
            class84.field1153 = new class16[var11.length];
            for (int var12 = 0; var11.length > var12; ++var12) {
                class84.field1153[var12] = arg2.method389(var11[var12], true);
            }
            class218[] var13 = class218.method1497(arg0, class208.field3017, 0);
            class226.field3305 = new class16[var13.length];
            for (int var14 = 0; ~var14 > ~var13.length; ++var14) {
                class226.field3305[var14] = arg2.method389(var13[var14], true);
            }
            class218[] var15 = class218.method1497(arg0, class252.field3712, 0);
            class38.field437 = new class16[var15.length];
            for (int var16 = 0; var16 < var15.length; ++var16) {
                class38.field437[var16] = arg2.method389(var15[var16], true);
            }
            class218[] var17 = class218.method1497(arg0, class318.field4513, 0);
            class47.field522 = new class16[var17.length];
            for (int var18 = 0; var17.length > var18; ++var18) {
                class47.field522[var18] = arg2.method389(var17[var18], true);
            }
            class218[] var19 = class218.method1497(arg0, class364.field5090, 0);
            class173.field2459 = new class16[var19.length];
            for (int var20 = 0; var20 < var19.length; ++var20) {
                class173.field2459[var20] = arg2.method389(var19[var20], true);
            }
            class218[] var21 = class218.method1497(arg0, class269.field3961, 0);
            class477.field7026 = new class16[var21.length];
            for (int var22 = 0; var22 < var21.length; ++var22) {
                class477.field7026[var22] = arg2.method389(var21[var22], true);
            }
            class218[] var23 = class218.method1497(arg0, class471.field6960, 0);
            class12.field139 = new class16[var23.length];
            for (int var24 = 0; ~var24 > ~var23.length; ++var24) {
                class12.field139[var24] = arg2.method389(var23[var24], true);
            }
            class218[] var25 = class218.method1497(arg0, class13.field154, 0);
            class32.field374 = new class16[var25.length];
            for (int var26 = 0; var25.length > var26; ++var26) {
                class32.field374[var26] = arg2.method389(var25[var26], true);
            }
            class161.field2260 = arg2.method389(class218.method1488(arg0, class425.field6278, 0), true);
            class370.field5496 = arg2.method389(class218.method1488(arg0, class112.field1576, 0), true);
            class218[] var27 = class218.method1497(arg0, class455.field6695, 0);
            class523.field7687 = new class16[var27.length];
            for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                class523.field7687[var28] = arg2.method389(var27[var28], true);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILiv;)V", line = 272)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            method664((class387) null, 64);
        }
        ++field886;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1966 = arg2.method577(255) == 1;
                return;
            }
        } else {
            this.field887 = new class512[arg2.method577(255)];
            for (int var4 = 0; ~this.field887.length < ~var4; ++var4) {
                int var5 = arg2.method577(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field887[var4] = class265.method1711(2, arg2);
                            }
                        } else {
                            this.field887[var4] = class159.method1128((byte) 119, arg2);
                        }
                    } else {
                        this.field887[var4] = class61.method548(arg2, (byte) 95);
                    }
                } else {
                    this.field887[var4] = class146.method1066(18002, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfs;I)I", line = 350)
    public static final int method664(class387 arg0, int arg1) {
        ++field884;
        int var2 = 0;
        if (arg1 > -9) {
            field883 = 104;
        }
        if (arg0.method2384(-1, class222.field3259)) {
            ++var2;
        }
        if (arg0.method2384(-1, class443.field6571)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 372)
    public class69() {
        super(0, true);
    }
}
