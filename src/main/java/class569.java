import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class569 extends class615 {

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    private int field7562 = 4096;

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "Z")
    private boolean field7564 = true;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "Z")
    public static boolean field7560 = false;

    @OriginalMember(owner = "client!raa", name = "L", descriptor = "[[I")
    public static int[][] field7565 = new int[6][];

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!raa", name = "J", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "[Z")
    public static boolean[] field7567;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        ++field7561;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (arg0 != 2) {
            method3131((byte) 91);
        }
        if (super.field8129.field6315) {
            int[] var4 = this.method3366(0, 997, class658.field9107 & arg1 + -1);
            int[] var5 = this.method3366(0, 997, arg1);
            int[] var6 = this.method3366(0, 997, arg1 - -1 & class658.field9107);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class505.field6740; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field7562;
                int var12 = (var5[class313.field4306 & var10 - -1] + -var5[var10 + -1 & class313.field4306]) * this.field7562;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field7564) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(B)V")
    public static void method3131(byte arg0) {
        field7567 = null;
        field7565 = null;
        if (arg0 != 10) {
            field7560 = true;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3132(boolean arg0, String arg1) throws ClassNotFoundException {
        if (!arg0) {
            field7560 = true;
        }
        ++field7563;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 < 44) {
            method3133((byte) 86);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field7564 = ~arg2.method2034(255) == -2;
            }
        } else {
            this.field7562 = arg2.method2001((byte) -83);
        }
        ++field7566;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
    public class569() {
        super(1, false);
    }

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(B)V")
    public static final void method3133(byte arg0) {
        ++field7559;
        if (arg0 != -114) {
            method3131((byte) -115);
        }
        class251.field3460.method422(class127.field2137, !class344.field4718.field5448 ? -1 : class417.field5708 + 256 << 2, 0);
    }
}
