import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class647 extends class478 {

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    private int field9128 = 4096;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    private int field9127 = 4096;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    private int field9129 = 4096;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "Lwd;")
    public static class357 field9131 = new class357(9, 0, 4, 1);

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
    public static void method3621(int arg0) {
        field9131 = null;
        if (arg0 != 0) {
            method3622(-90, 53, 86);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field9133;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field6889.method2091(-124, arg1);
            if (super.field6889.field4765) {
                int[][] var4 = this.method2753(0, arg1, (byte) 11);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class436.field6154 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && var13 == var14) {
                        var8[var11] = this.field9127 * var12 >> 12;
                        var9[var11] = this.field9129 * var13 >> 12;
                        var10[var11] = this.field9128 * var14 >> 12;
                    } else {
                        var8[var11] = this.field9127;
                        var9[var11] = this.field9129;
                        var10[var11] = this.field9128;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(III)Z")
    public static final boolean method3622(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method3623((byte) 42, (String) null);
        }
        ++field9124;
        return (arg2 & 52) != 0;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
    public class647() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(BLjava/lang/String;)V")
    public static final void method3623(byte arg0, String arg1) {
        ++field9130;
        if (arg0 <= 124) {
            field9126 = 5;
        }
        if (arg1 != null) {
            if ((~class699.field9804 > -201 || class599.field8435) && ~class699.field9804 > -201) {
                String var3 = class6.method44(arg1, (byte) -83);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class699.field9804; ++var4) {
                        String var9 = class6.method44(class703.field9867[var4], (byte) -83);
                        if (var9 != null && var9.equals(var3)) {
                            class340.method1964(4, arg1 + class198.field2323.method1195((byte) 62, class504.field7267), 97);
                            return;
                        }
                        if (class597.field8405[var4] != null) {
                            String var10 = class6.method44(class597.field8405[var4], (byte) -83);
                            if (var10 != null && var10.equals(var3)) {
                                class340.method1964(4, arg1 + class198.field2323.method1195((byte) 62, class504.field7267), 98);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~var5 > ~class46.field482; ++var5) {
                        String var7 = class6.method44(class319.field3937[var5], (byte) -83);
                        if (var7 != null && var7.equals(var3)) {
                            class340.method1964(4, class198.field2328.method1195((byte) 62, class504.field7267) + arg1 + class198.field2329.method1195((byte) 62, class504.field7267), 120);
                            return;
                        }
                        if (class551.field7876[var5] != null) {
                            String var8 = class6.method44(class551.field7876[var5], (byte) -83);
                            if (var8 != null && var8.equals(var3)) {
                                class340.method1964(4, class198.field2328.method1195((byte) 62, class504.field7267) + arg1 + class198.field2329.method1195((byte) 62, class504.field7267), 99);
                                return;
                            }
                        }
                    }
                    if (class6.method44(class362.field4859.field2893, (byte) -83).equals(var3)) {
                        class340.method1964(4, class198.field2326.method1195((byte) 62, class504.field7267), 122);
                    } else {
                        ++class645.field9108;
                        class653 var6 = class699.method3845((byte) 45, class39.field395, class104.field1122);
                        var6.field9158.method658(class72.method382(2018672392, arg1), (byte) 76);
                        var6.field9158.method672((byte) 93, arg1);
                        class568.method3220(var6, (byte) 63);
                    }
                }
            } else {
                class340.method1964(4, class198.field2295.method1195((byte) 62, class504.field7267), 100);
                String var2 = class198.field2296.method1195((byte) 62, class504.field7267);
                if (var2 != null) {
                    class340.method1964(4, var2, 105);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field9132;
        if (arg0 != 255) {
            field9131 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field9128 = arg1.method643((byte) -77);
                }
            } else {
                this.field9129 = arg1.method643((byte) -77);
            }
        } else {
            this.field9127 = arg1.method643((byte) -77);
        }
    }
}
