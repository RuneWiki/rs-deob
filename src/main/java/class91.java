import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class91 extends class23 {

    @OriginalMember(owner = "client!id", name = "N", descriptor = "[I")
    private int[] field1559 = new int[3];

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    private int field1564 = 4096;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field1563 = 409;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    private int field1558 = 4096;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    private int field1567 = 4096;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Ldc;")
    public static class37 field1568 = class185.method1233((byte) 86, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Lqf;")
    public static class180 field1561 = new class180(0, 0);

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "[B")
    public static byte[] field1570 = new byte[32896];

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "[[B")
    public static byte[][] field1572;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
    public static final void method598(byte arg0) {
        ++field1569;
        int var1 = 95 / ((arg0 - -32) / 58);
        class95.field1673.method93(0);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([SB[Ldc;)V")
    public static final void method599(short[] arg0, byte arg1, class37[] arg2) {
        if (arg1 == -9) {
            ++field1557;
            class73.method516(0, false, arg2, arg2.length + -1, arg0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field1565;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method225(120);
                            this.field1559[1] = class58.method449(var5 >> 4, 4080);
                            this.field1559[2] = class58.method449(255, var5) >> 12;
                            this.field1559[0] = class58.method449(var5 << 4, 267386880);
                        }
                    } else {
                        this.field1558 = arg0.method230((byte) -118);
                    }
                } else {
                    this.field1567 = arg0.method230((byte) -128);
                }
            } else {
                this.field1564 = arg0.method230((byte) -103);
            }
        } else {
            this.field1563 = arg0.method230((byte) -106);
        }
        if (arg2 != 1000) {
            field1570 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        if (arg1 != 9) {
            method601(-53, -32, -13);
        }
        ++field1560;
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -111, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class199.field3705 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field1559[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field1563) {
                    var8[var11] = var12;
                    var9[var11] = var7[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field1559[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1563 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field1559[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field1563) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1558 * var12 >> 12;
                            var9[var11] = this.field1567 * var14 >> 12;
                            var10[var11] = this.field1564 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1572 = null;
        field1570 = null;
        field1568 = null;
        field1561 = null;
        if (arg0 < 12) {
            field1572 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)I")
    public static final int method601(int arg0, int arg1, int arg2) {
        int var3 = arg1 >> 31 & arg2 - arg0;
        ++field1566;
        return ((arg1 >>> 31) + arg1) % arg2 - -var3;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
    public static final void method602(int arg0, int arg1) {
        class209.field3919 = -1;
        class105.field1820 = 1;
        if (arg0 == -257) {
            class17.field261 = arg1;
            ++field1562;
            class51.field1025 = 0;
            class197.field3690 = null;
            class127.field2360 = -1;
            class41.field852 = false;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field1570[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1571 = 0;
        field1572 = new byte[50][];
    }
}
