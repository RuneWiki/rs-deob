import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class180 extends class210 {

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "Z")
    private boolean field2547 = true;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "Z")
    private boolean field2548 = true;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "Lvq;")
    public static class24 field2549 = new class24(66, -2);

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2554 = null;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "Lvq;")
    public static class24 field2551 = new class24(42, 9);

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "[[S")
    public static short[][] field2550;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method361(int arg0, byte arg1) {
        ++field2552;
        if (arg1 != -38) {
            this.method56(-76, -79, (class256) null);
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(this.field2548 ? -arg0 + class139.field1911 : arg0, -122, 0);
            if (!this.field2547) {
                class224.method1541(var4, 0, var3, 0, class202.field2852);
            } else {
                for (int var5 = 0; class202.field2852 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class437.field6373];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILat;)V", line = 45)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 == -11941) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field2956 = ~arg2.method1738((byte) -45) == -2;
                    }
                } else {
                    this.field2548 = ~arg2.method1738((byte) -34) == -2;
                }
            } else {
                this.field2547 = arg2.method1738((byte) -86) == 1;
            }
            ++field2545;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V", line = 90)
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V", line = 93)
    public static void method1247(int arg0) {
        field2549 = null;
        field2551 = null;
        field2550 = null;
        field2554 = null;
        if (arg0 != 2) {
            field2550 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[[I", line = 118)
    public final int[][] method58(int arg0, int arg1) {
        if (arg1 < 94) {
            method1247(-68);
        }
        ++field2546;
        int[][] var3 = super.field2967.method1572(121, arg0);
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, this.field2548 ? class139.field1911 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2547) {
                for (int var11 = 0; ~class202.field2852 < ~var11; ++var11) {
                    var8[var11] = var5[class437.field6373 - var11];
                    var9[var11] = var6[-var11 + class437.field6373];
                    var10[var11] = var7[-var11 + class437.field6373];
                }
            } else {
                for (int var12 = 0; class202.field2852 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V", line = 188)
    public static final void method1248(int arg0) {
        class363 var1 = class227.field3408;
        synchronized (class227.field3408) {
            class227.field3408.method2313(123);
            if (arg0 != -338) {
                method1247(-84);
            }
        }
        ++field2555;
    }
}
