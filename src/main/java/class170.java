import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class170 extends class297 {

    @OriginalMember(owner = "client!cfa", name = "P", descriptor = "I")
    private int field2663 = 4096;

    @OriginalMember(owner = "client!cfa", name = "Q", descriptor = "Z")
    private boolean field2664 = true;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "[I")
    public static int[] field2656 = new int[1];

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "[I")
    public static int[] field2661 = new int[2];

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "[Lwaa;")
    public static class702[] field2657;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "(II)I", line = 3)
    public static final int method1281(int arg0, int arg1) {
        int var2 = 40 / ((arg0 - 19) / 63);
        ++field2660;
        return ~arg1 == -16711936 ? -1 : class487.method2870(27076, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZB)V", line = 17)
    public static final void method1282(boolean arg0, byte arg1) {
        if (class512.field7137 != null) {
            class512.field7137.method706((byte) 36);
            class512.field7137 = null;
        }
        ++field2662;
        class399.field5899 = 0;
        class340.method2149((byte) 87);
        class390.method2454();
        if (arg1 != 11) {
            field2661 = null;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            class19.field295[var2].method3298(700);
        }
        class587.method3353(-50, false);
        System.gc();
        class498.method2937(2, 22684);
        class737.field9928 = false;
        class277.field3916 = -1;
        class268.method1785(arg1 + 79);
        class81.method758((byte) 99, true);
        class367.field5236 = 0;
        class221.field3177 = 0;
        class59.field1172 = 0;
        class531.field7322 = 0;
        class482.field6727 = 0;
        class648.field8918 = 0;
        for (int var3 = 0; ~class55.field1118.length < ~var3; ++var3) {
            class55.field1118[var3] = null;
        }
        class13.method116((byte) -114);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class49.field1040[var4] = null;
        }
        class738.field9939 = 0;
        class86.field1546.method1466(arg1 ^ 11);
        class77.field1375 = 0;
        class491.field6801.method1466(0);
        class473.method2788(0);
        class106.field1870 = 0;
        class390.field5635.method903((byte) -107);
        class173.method1297(-12648);
        class142.method1127(arg1 + -1636518175);
        class81.field1485 = 0L;
        class107.field1880 = null;
        if (arg0) {
            class215.method1527(2, 12);
        } else {
            class215.method1527(arg1 + -9, 3);
            try {
                class43.method542((byte) 125, class675.field9193, "loggedout");
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lcea;II)V", line = 94)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            method1281(-77, 55);
        }
        ++field2658;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2664 = arg0.method1535(255) == 1;
            }
        } else {
            this.field2663 = arg0.method1478(842397944);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V", line = 138)
    public class170() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "(I)V", line = 141)
    public static void method1283(int arg0) {
        field2656 = null;
        field2661 = null;
        if (arg0 != 0) {
            field2657 = null;
        }
        field2657 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(II)[[I", line = 158)
    public final int[][] method18(int arg0, int arg1) {
        ++field2659;
        int[][] var3 = super.field4166.method2180(-111, arg0);
        if (arg1 != -1564599039) {
            method1281(72, -13);
        }
        if (super.field4166.field4849) {
            int[] var4 = this.method1951(arg0 + -1 & class319.field4394, 633706337, 0);
            int[] var5 = this.method1951(arg0, arg1 + -2096661920, 0);
            int[] var6 = this.method1951(class319.field4394 & arg0 + 1, 633706337, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class525.field7275 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2663;
                int var12 = (var5[var10 + 1 & class677.field9204] - var5[class677.field9204 & var10 + -1]) * this.field2663;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 + -4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field2664) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }
}
