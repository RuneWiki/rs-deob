import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class41 extends class264 {

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    private int field538 = 2048;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    private int field540 = 4096;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    private int field536 = 8192;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    private int field541 = 2048;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    private int field546 = 12288;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field544 = 0;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    private int field547 = 0;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field542 = new String[100];

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "Lrc;")
    public static class108 field539 = new class108(72, 6);

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "I")
    public static int field549 = 205;

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "[Lmh;")
    public static class94[] field554 = new class94[6];

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[I")
    public static int[] field551 = new int[64];

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field552;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "[I")
    public static int[] field550;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method90(int arg0, int arg1) {
        ++field548;
        if (arg1 != 21034) {
            this.field541 = -54;
        }
        int[] var3 = super.field3808.method958((byte) 116, arg0);
        if (super.field3808.field1732) {
            int var4 = class379.field5216[arg0] + -2048;
            for (int var5 = 0; ~class478.field6792 < ~var5; ++var5) {
                int var6 = class151.field2084[var5] + -2048;
                int var7 = this.field541 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 - 4096;
                int var10 = this.field544 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field547 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field538 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method286(var9, var12, (byte) -60) && !this.method285(var18, class134.method993(arg1, -958), var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z", line = 55)
    private final boolean method285(int arg0, int arg1, int arg2) {
        ++field543;
        int var4 = (arg0 - -arg2) * this.field546 >> 12;
        int var5 = field550[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field546;
        int var7 = (var6 << 12) / this.field536;
        if (arg1 != -20888) {
            return false;
        } else {
            int var8 = this.field540 * var7 >> 12;
            return ~var8 < ~(arg0 - arg2) && ~(-arg2 + arg0) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIB)Z", line = 73)
    private final boolean method286(int arg0, int arg1, byte arg2) {
        ++field535;
        int var4 = (-arg0 + arg1) * this.field546 >> 12;
        int var5 = field550[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field546;
        int var7 = (var6 << 12) / this.field536;
        int var8 = this.field540 * var7 >> 12;
        int var9 = -37 % ((42 - arg2) / 58);
        return ~var8 < ~(arg0 - -arg1) && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "(I)V", line = 90)
    public static void method287(int arg0) {
        if (arg0 != -30722) {
            method288(29);
        }
        field554 = null;
        field542 = null;
        field552 = null;
        field550 = null;
        field539 = null;
        field551 = null;
    }

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "(I)V", line = 106)
    public static final void method288(int arg0) {
        class305.field4337.method165(126, 5);
        ++field545;
        class110.field1541.method1933(22464, 5);
        class353.field4854.method2228(-8, 5);
        class468.field6599.method501(0, 5);
        class363.field5001.method1999(5, false);
        class373.field5128.method1653((byte) 104, 5);
        class386.field5289.method1860(5, (byte) 127);
        class371.field5108.method1660(5, 1);
        class97.field1365.method2332(5, 0);
        class31.field332.method2457(5, false);
        class382.field5247.method1774(-92, 5);
        class53.field788.method2316((byte) 126, 5);
        class449.field6390.method846(5, -91);
        class422.field5847.method1638((byte) 105, 5);
        class93.field1312.method1972(5, false);
        class97.field1377.method697(5, (byte) -100);
        class39.field534.method1507(5, true);
        if (arg0 != 255) {
            method287(-4);
        }
        class84.field1213.method2445(5, (byte) 126);
        class82.field1180.method2672(2, 5);
        class407.field5577.method178((byte) -106, 5);
        class8.method47((byte) -125, 5);
        class200.method1393(2, 50);
        class490.method2876((byte) -114, 5);
        class281.method1873((byte) 125, 5);
        class365.field5015.method2120((byte) 53, 5);
        class285.field4079.method2120((byte) -65, 5);
        class239.field3506.method2120((byte) 97, 5);
        class424.field5869.method2120((byte) 50, 5);
        class457.field6467.method2120((byte) -96, 5);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 270)
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V", line = 151)
    public final void method95(int arg0) {
        class163.method1206((byte) -114);
        if (arg0 == -8) {
            ++field553;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLkk;I)V", line = 168)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field537;
        if (arg0 < 31) {
            this.method95(22);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field536 = arg1.method1134(-16848);
                                }
                            } else {
                                this.field540 = arg1.method1134(-16848);
                            }
                        } else {
                            this.field546 = arg1.method1134(-16848);
                        }
                    } else {
                        this.field538 = arg1.method1134(-16848);
                    }
                } else {
                    this.field547 = arg1.method1134(-16848);
                }
            } else {
                this.field544 = arg1.method1134(-16848);
            }
        } else {
            this.field541 = arg1.method1134(-16848);
        }
    }
}
