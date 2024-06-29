import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class278 extends class242 {

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Z")
    private boolean field4866 = true;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Z")
    private boolean field4869 = true;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lha;")
    public static class30 field4872 = new class30();

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lp;")
    public static class280 field4876 = class18.method140((byte) -125, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "[B")
    public static byte[] field4877;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "Lp;")
    public static class280 field4880;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "Lp;")
    private static class280 field4879;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "Lp;")
    public static class280 field4878;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            this.method49(-62, 51, (class25) null);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4248 = ~arg2.method189((byte) -103) == -2;
                }
            } else {
                this.field4866 = arg2.method189((byte) -103) == 1;
            }
        } else {
            this.field4869 = arg2.method189((byte) -103) == 1;
        }
        ++field4875;
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public static void method1844(int arg0) {
        if (arg0 != -17137) {
            method1844(95);
        }
        field4872 = null;
        field4876 = null;
        field4880 = null;
        field4877 = null;
        field4878 = null;
        field4879 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)V")
    public static final void method1845(byte arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -88 / ((arg0 - -22) / 44);
        while (class236.field4107 > var3) {
            class73 var5 = class38.method306(var3, -2);
            if (var5 != null) {
                int var6 = var5.field1209;
                if (~var6 <= -1 && !class146.field2539.method1444(var6, 22897)) {
                    var6 = -1;
                }
                int var7;
                if (var5.field1198 < 0) {
                    if (var6 >= 0) {
                        var7 = class146.field2554[class169.method1177(true, 96, class146.field2539.method1439(var6, -11728))];
                    } else if (var5.field1203 != -1) {
                        int var8 = var5.field1203;
                        int var9 = (127 & var8) + arg2;
                        if (~var9 <= -1) {
                            if (~var9 < -128) {
                                var9 = 127;
                            }
                        } else {
                            var9 = 0;
                        }
                        int var10 = (64512 & var8 - -arg1) + (var8 & 896) + var9;
                        var7 = class146.field2554[class169.method1177(true, 96, var10)];
                    } else {
                        var7 = -1;
                    }
                } else {
                    int var11 = var5.field1198;
                    int var12 = (var11 & 127) + arg2;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (64512 & arg1 + var11) + (var11 & 896) + var12;
                    var7 = class146.field2554[class169.method1177(true, 96, var13)];
                }
                class116.field2097[var3 - -1] = var7;
            }
            ++var3;
        }
        ++field4870;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[[I)V")
    public static final void method1846(boolean arg0, int[][] arg1) {
        if (!arg0) {
            class91.field1484 = arg1;
            ++field4867;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field4868;
        int var3 = 63 % ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 94, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, !this.field4866 ? arg0 : class29.field540 - arg0, 48);
            if (!this.field4869) {
                class143.method988(var5, 0, var4, 0, class264.field4654);
            } else {
                for (int var6 = 0; ~var6 > ~class264.field4654; ++var6) {
                    var4[var6] = var5[-var6 + class230.field3968];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
    public static final void method1847(int arg0, byte arg1) {
        class157 var2 = class257.method1740(arg0, (byte) -102, 3);
        ++field4865;
        var2.method1121(24223);
        if (arg1 > -110) {
            method1844(-96);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
    public static final void method1848(int arg0, int arg1) {
        class237.field4119.method1478(arg0, arg1 ^ 51);
        class116.field2101.method1478(arg0, 85);
        ++field4871;
        if (arg1 != 127) {
            field4880 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, this.field4866 ? -arg1 + class29.field540 : arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[0];
            if (this.field4869) {
                for (int var11 = 0; ~var11 > ~class264.field4654; ++var11) {
                    var7[var11] = var10[class230.field3968 - var11];
                    var9[var11] = var5[-var11 + class230.field3968];
                    var8[var11] = var6[-var11 + class230.field3968];
                }
            } else {
                for (int var12 = 0; class264.field4654 > var12; ++var12) {
                    var7[var12] = var10[var12];
                    var9[var12] = var5[var12];
                    var8[var12] = var6[var12];
                }
            }
        }
        if (!arg0) {
            method1848(-55, 29);
        }
        ++field4873;
        return var3;
    }

    static {
        int var0 = 0;
        field4877 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field4877[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4880 = class18.method140((byte) -128, "<br>(X");
        field4879 = class18.method140((byte) -127, "Allocated memory");
        field4878 = field4879;
    }
}
