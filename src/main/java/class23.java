import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class23 extends class145 {

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    private int field239 = 1;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "I")
    private int field244 = 0;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "Lqda;")
    public static class87 field241 = new class87();

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "Log;")
    public static class564 field243;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
    public static void method144(int arg0) {
        field243 = null;
        int var1 = -96 / ((arg0 - -56) / 39);
        field241 = null;
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        class315.method2072((byte) -12);
        int var2 = 73 / ((-46 - arg0) / 45);
        ++field240;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field237;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class647.field9368 > var6; ++var6) {
                int var7 = class601.field8779[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field245 == 0) {
                    var9 = (-var4 + var7) * this.field239;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field239 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field244 != 0) {
                    if (this.field244 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class101.field1202[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "(I)V")
    public static final void method146(int arg0) {
        if (arg0 != 1024) {
            field246 = -74;
        }
        ++field242;
        int var1 = 0;
        if (class595.field8694 != null) {
            var1 = class595.field8694.method2427(111, class81.field908);
        }
        if (~var1 == -3) {
            int var2 = class477.field7037 <= 800 ? class477.field7037 : 800;
            class324.field4678 = (-var2 + class477.field7037) / 2;
            int var3 = ~class434.field6446 < -601 ? 600 : class434.field6446;
            class581.field8366 = var2;
            class298.field4407 = var3;
            class59.field674 = 0;
        } else if (~var1 != -2) {
            class298.field4407 = class434.field6446;
            class59.field674 = 0;
            class581.field8366 = class477.field7037;
            class324.field4678 = 0;
        } else {
            int var4 = ~class477.field7037 >= -1025 ? class477.field7037 : 1024;
            class581.field8366 = var4;
            int var5 = ~class434.field6446 >= -769 ? class434.field6446 : 768;
            class324.field4678 = (-var4 + class477.field7037) / 2;
            class59.field674 = 0;
            class298.field4407 = var5;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field238;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field239 = arg2.method1177(255);
                }
            } else {
                this.field244 = arg2.method1177(255);
            }
        } else {
            this.field245 = arg2.method1177(255);
        }
        if (arg1 >= -67) {
            field246 = 47;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BJ)V")
    public static final void method147(byte arg0, long arg1) {
        ++field236;
        int var3 = class439.field6548.field1764 - -class92.field1083;
        int var4 = class657.field9493 + class439.field6548.field1768;
        if (class325.field4695 - var3 < -2000 || ~(class325.field4695 - var3) < -2001 || ~(-var4 + class620.field8987) > 1999 || class620.field8987 - var4 > 2000) {
            class620.field8987 = var4;
            class325.field4695 = var3;
        }
        if (class325.field4695 != var3) {
            int var5 = -class325.field4695 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (~var5 < ~var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (~var6 < ~var5) {
                var6 = var5;
            }
            class325.field4695 += var6;
        }
        if (!class595.field8694.field6547) {
            class639.field9187 += (float) arg1 * class99.field1159 / 6.0F;
            class388.field5967 += (float) arg1 * class65.field719 / 6.0F;
        }
        if (arg0 != 92) {
            method146(-19);
        }
        if (~class620.field8987 != ~var4) {
            int var7 = -class620.field8987 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (var8 != 0) {
                    if (~var8 > ~var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (~var8 != -1) {
                if (~var7 > ~var8) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class620.field8987 += var8;
        }
        class508.method3029(-2368);
    }
}
