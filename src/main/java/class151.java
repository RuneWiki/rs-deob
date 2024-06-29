import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class151 extends class76 {

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    private int field2591 = 3216;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    private int field2596 = 4096;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
    private int field2606 = 3216;

    @OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
    private int[] field2611 = new int[3];

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lia;")
    public static class257 field2590 = class28.method234(-63, "overlay2)3dat");

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    public static int field2598 = 1;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "Lia;")
    public static class257 field2607 = class28.method234(-61, ")4g");

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "Lie;")
    public static class117 field2593 = new class117(64);

    @OriginalMember(owner = "client!ta", name = "vb", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!ta", name = "ub", descriptor = "Lia;")
    public static class257 field2612 = class28.method234(79, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ta", name = "wb", descriptor = "[S")
    public static short[] field2614 = new short[256];

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ta", name = "qb", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ta", name = "rb", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lmb;")
    public static class178 field2605;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "Lba;")
    public static class211 field2595;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1012(boolean arg0) {
        for (int var1 = -1; ~var1 > ~class231.field3880; ++var1) {
            int var5;
            if (var1 != -1) {
                var5 = class132.field2362[var1];
            } else {
                var5 = 2047;
            }
            class180 var6 = class55.field1180[var5];
            if (var6 != null && ~var6.field4138 < -1) {
                --var6.field4138;
                if (var6.field4138 == 0) {
                    var6.field4168 = null;
                }
            }
        }
        for (int var2 = 0; ~var2 > ~class140.field2487; ++var2) {
            int var3 = class199.field3412[var2];
            class197 var4 = class92.field1758[var3];
            if (var4 != null && ~var4.field4138 < -1) {
                --var4.field4138;
                if (var4.field4138 == 0) {
                    var4.field4168 = null;
                }
            }
        }
        if (!arg0) {
            field2590 = null;
        }
        ++field2600;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class151() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBI)V")
    public static final void method1013(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 122 / ((arg3 - -15) / 41);
        if (arg1 >= class40.field834 && ~arg1 >= ~class255.field4371) {
            int var6 = class34.method290(class145.field2540, arg0, class123.field2211, -256);
            int var7 = class34.method290(class145.field2540, arg4, class123.field2211, -256);
            class56.method435(79, var6, arg1, arg2, var7);
        }
        ++field2597;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2599;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            return null;
        } else {
            if (super.field1467.field2980) {
                int var4 = class160.field2804 * this.field2596 >> 12;
                int[] var5 = this.method562(class105.field1950 & arg1 + -1, 0, (byte) -104);
                int[] var6 = this.method562(arg1, 0, (byte) -104);
                int[] var7 = this.method562(arg1 + 1 & class105.field1950, 0, (byte) -104);
                for (int var8 = 0; ~class96.field1807 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = var9 >> 4;
                    if (~var10 > -1) {
                        var10 = -var10;
                    }
                    if (var10 > 255) {
                        var10 = 255;
                    }
                    int var11 = (var6[class157.field2753 & var8 + -1] - var6[var8 + 1 & class157.field2753]) * var4 >> 12;
                    int var12 = var11 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = class12.field219[((var10 + 1) * var10 >> 1) + var12] & 255;
                    int var14 = var9 * var13 >> 8;
                    int var15 = this.field2611[1] * var14 >> 12;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field2611[2] * var16 >> 12;
                    int var18 = var11 * var13 >> 8;
                    int var19 = this.field2611[0] * var18 >> 12;
                    var3[var8] = var17 + var19 - -var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    private final void method1014(boolean arg0) {
        ++field2610;
        if (arg0) {
            double var2 = Math.cos((double) ((float) this.field2606 / 4096.0F));
            this.field2611[0] = (int) (var2 * Math.sin((double) ((float) this.field2591 / 4096.0F)) * 4096.0D);
            this.field2611[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2591 / 4096.0F)));
            this.field2611[2] = (int) (Math.sin((double) ((float) this.field2606 / 4096.0F)) * 4096.0D);
            int var4 = this.field2611[2] * this.field2611[2] >> 12;
            int var5 = this.field2611[1] * this.field2611[1] >> 12;
            int var6 = this.field2611[0] * this.field2611[0] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var5 - -var4 + var6 >> 12)));
            if (var7 != 0) {
                this.field2611[2] = (this.field2611[2] << 12) / var7;
                this.field2611[0] = (this.field2611[0] << 12) / var7;
                this.field2611[1] = (this.field2611[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2606 = arg0.method1063(-17162);
                }
            } else {
                this.field2591 = arg0.method1063(-17162);
            }
        } else {
            this.field2596 = arg0.method1063(-17162);
        }
        ++field2601;
        if (arg1 >= -86) {
            method1013(-19, 9, -80, (byte) 67, 109);
        }
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field2590 = null;
        field2614 = null;
        field2605 = null;
        field2607 = null;
        field2612 = null;
        field2593 = null;
        if (arg0 != 10474) {
            field2603 = 37;
        }
        field2595 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        this.method1014(true);
        ++field2609;
        if (arg0 != 111) {
            this.method1014(false);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[B)I")
    public static final int method1016(int arg0, int arg1, byte[] arg2) {
        if (arg0 != -27001) {
            return 69;
        } else {
            ++field2602;
            return class85.method640(arg1, true, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLmb;Lmb;)V")
    public static final void method1017(byte arg0, class178 arg1, class178 arg2) {
        int var3 = -1 % ((arg0 - 18) / 50);
        class19.field409 = arg1;
        ++field2592;
        class10.field194 = arg2;
    }
}
