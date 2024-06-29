import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class89 extends class43 {

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    private int field1553 = -1;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "Lkg;")
    public static class115 field1564 = new class115(64);

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public static int field1565 = 0;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lkg;")
    public static class115 field1566 = new class115(100);

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field1567 = 127;

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "[Lmb;")
    public static class132[] field1568 = new class132[100];

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "[I")
    public int[] field1554;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
    public int[][] method203(int arg0, int arg1) {
        ++field1561;
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (arg0 != -1893) {
            return null;
        } else {
            if (super.field764.field3960 && this.method555(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int var6 = this.field1562 * (class42.field689 != this.field1555 ? this.field1555 * arg1 / class42.field689 : arg1);
                int[] var7 = var3[2];
                if (class131.field2427 == this.field1562) {
                    for (int var8 = 0; var8 < class131.field2427; ++var8) {
                        int var9 = this.field1554[var6++];
                        var7[var8] = class75.method450(4080, var9 << 4);
                        var5[var8] = class75.method450(65280, var9) >> 4;
                        var4[var8] = class75.method450(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; ~class131.field2427 < ~var10; ++var10) {
                        int var11 = this.field1562 * var10 / class131.field2427;
                        int var12 = this.field1554[var6 + var11];
                        var7[var10] = class75.method450(255, var12) << 4;
                        var5[var10] = class75.method450(4080, var12 >> 4);
                        var4[var10] = class75.method450(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class33.field524 * arg0 + class100.field1885 * arg3 >> 16;
        int var6 = class33.field524 * arg3 - class100.field1885 * arg0 >> 16;
        int var7 = class40.field655 * var6 + class203.field3723 * arg1 >> 16;
        int var8 = class40.field655 * arg1 - class203.field3723 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class40.field655 * var6 + class203.field3723 * arg2 >> 16;
        int var12 = class40.field655 * arg2 - class203.field3723 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class16.field236 && var13 < class16.field236) {
            return false;
        } else if (var9 > class38.field625 && var13 > class38.field625) {
            return false;
        } else if (var10 < class145.field2707 && var14 < class145.field2707) {
            return false;
        } else {
            return var10 <= class158.field2870 || var14 <= class158.field2870;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method295(int arg0) {
        ++field1558;
        super.method295(52);
        this.field1554 = null;
        int var2 = -106 % ((8 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)Z")
    public final boolean method555(boolean arg0) {
        ++field1556;
        if (this.field1554 != null) {
            return true;
        } else if (~this.field1553 <= -1) {
            class18 var2 = class91.method564(class31.field489, (byte) 42, this.field1553);
            var2.method113();
            this.field1562 = var2.field4207;
            this.field1555 = var2.field4204;
            this.field1554 = var2.field263;
            return true;
        } else {
            if (!arg0) {
                field1566 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Lmb;")
    public static final class132 method556(int arg0, int arg1) {
        ++field1563;
        int var2 = 12 / ((21 - arg0) / 39);
        if (~arg1 > -100001) {
            return class187.method1197(new class132[] { class191.field3535, class132.method889(arg1, (byte) 115), class131.field2426 }, -123);
        } else {
            return arg1 < 10000000 ? class187.method1197(new class132[] { class117.field2236, class132.method889(arg1 / 1000, (byte) 110), class243.field4446, class131.field2426 }, -78) : class187.method1197(new class132[] { class43.field763, class132.method889(arg1 / 1000000, (byte) 118), class139.field2603, class131.field2426 }, -91);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field1557;
        if (arg0 == 0) {
            this.field1553 = arg2.method739(-124);
        }
        if (arg1 != -73) {
            this.field1555 = 103;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method557(byte arg0) {
        field1566 = null;
        if (arg0 != -82) {
            field1564 = null;
        }
        field1568 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
    public final int method299(int arg0) {
        ++field1559;
        if (arg0 >= -36) {
            this.field1555 = -72;
        }
        return this.field1553;
    }
}
