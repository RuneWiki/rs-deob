import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class114 extends class144 {

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    private int field1568 = 12288;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private int field1560 = 8192;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    private int field1559 = 0;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    private int field1570 = 4096;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    private int field1575 = 2048;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    private int field1562 = 2048;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Z")
    public static boolean field1571 = false;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "Z")
    public static volatile boolean field1572 = true;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "[B")
    public static byte[] field1574;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(III)Z")
    private final boolean method733(int arg0, int arg1, int arg2) {
        ++field1567;
        if (arg1 != -1783256628) {
            this.field1559 = 97;
        }
        int var4 = (arg0 + arg2) * this.field1568 >> 12;
        int var5 = class9.field135[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1568;
        int var7 = (var6 << 12) / this.field1560;
        int var8 = this.field1570 * var7 >> 12;
        return -arg2 + arg0 < var8 && ~(arg0 - arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public static final void method734(int arg0) {
        if (arg0 < -76) {
            for (int var1 = -1; var1 < class238.field3432; ++var1) {
                int var2;
                if (var1 != -1) {
                    var2 = class46.field540[var1];
                } else {
                    var2 = 2047;
                }
                class240 var3 = class253.field3656[var2];
                if (var3 != null) {
                    class2.method13(false, var3.method1556(3888), var3);
                }
            }
            ++field1565;
        }
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V")
    public static final void method735(int arg0) {
        ++field1573;
        class243.field3544.method67((byte) -128);
        if (arg0 != 4096) {
            method737(56, 118);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field1560 = 23;
        }
        ++field1564;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = class143.field2045[arg0] - 2048;
            for (int var5 = 0; var5 < class104.field1411; ++var5) {
                int var6 = class87.field1178[var5] + -2048;
                int var7 = this.field1577 + var4;
                int var8 = this.field1562 + var6;
                int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var10 = var7 >= -2048 ? var7 : var7 + 4096;
                int var11 = this.field1559 + var6;
                int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                int var13 = var4 - -this.field1575;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var17 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var18 = ~var10 < -2049 ? var10 + -4096 : var10;
                var3[var5] = !this.method738(class165.method1085(arg1, 129), var18, var17) && !this.method733(var15, -1783256628, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            this.method12(44, 64);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1560 = arg1.method1380(true);
                                }
                            } else {
                                this.field1570 = arg1.method1380(true);
                            }
                        } else {
                            this.field1568 = arg1.method1380(true);
                        }
                    } else {
                        this.field1575 = arg1.method1380(true);
                    }
                } else {
                    this.field1559 = arg1.method1380(true);
                }
            } else {
                this.field1577 = arg1.method1380(true);
            }
        } else {
            this.field1562 = arg1.method1380(true);
        }
        ++field1566;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method736(boolean arg0) {
        field1574 = null;
        if (arg0) {
            field1574 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V")
    public static final void method737(int arg0, int arg1) {
        ++field1561;
        if (class238.method1549((byte) -103, arg0)) {
            class82[] var2 = class123.field1767[arg0];
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class82 var4 = var2[var3];
                if (var4 != null) {
                    var4.field1092 = 1;
                    var4.field1043 = 0;
                    var4.field1088 = 0;
                }
            }
            if (arg1 != 5017) {
                field1574 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(III)Z")
    private final boolean method738(int arg0, int arg1, int arg2) {
        ++field1576;
        int var4 = (-arg2 + arg1) * this.field1568 >> 12;
        int var5 = class9.field135[(1047044 & var4 * 255) >> 12];
        if (arg0 <= 124) {
            method736(false);
        }
        int var6 = (var5 << 12) / this.field1568;
        int var7 = (var6 << 12) / this.field1560;
        int var8 = this.field1570 * var7 >> 12;
        return var8 > arg1 + arg2 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)V")
    public static final void method739(int arg0, int arg1) {
        class215.field2997.method62(-15, arg1);
        ++field1569;
        if (arg0 != 0) {
            field1572 = true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        class175.method1131((byte) -126);
        if (arg0 >= -109) {
            method735(-79);
        }
        ++field1563;
    }
}
