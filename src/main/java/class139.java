import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class139 extends class330 {

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    private int field1776 = 4096;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Z")
    private boolean field1774 = true;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field1772 = 50;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1779 = new String[field1772];

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "[I")
    public static int[] field1778 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "[F")
    public static float[] field1780 = new float[4];

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "[I")
    public static int[] field1783 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
    public static int[] field1782 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "[I")
    public static int[] field1771 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "[I")
    public static int[] field1784 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "[I")
    public static int[] field1777 = new int[field1772];

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "Lha;")
    public static class473 field1781;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
    public static void method926(byte arg0) {
        field1782 = null;
        field1783 = null;
        field1771 = null;
        field1779 = null;
        field1777 = null;
        field1780 = null;
        field1778 = null;
        if (arg0 >= -2) {
            method927(-39, (byte) 86, -83);
        }
        field1784 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field1775;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int[] var4 = this.method2084(0, class385.field5505 & arg1 + -1, (byte) 95);
            int[] var5 = this.method2084(0, arg1, (byte) -118);
            int[] var6 = this.method2084(0, class385.field5505 & arg1 - -1, (byte) 70);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class80.field901 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1776;
                int var12 = (var5[class639.field8988 & var10 + 1] + -var5[class639.field8988 & var10 - 1]) * this.field1776;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 + -4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field1774) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        if (arg0 != 0) {
            this.method537(-91, -23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)V")
    public static final void method927(int arg0, byte arg1, int arg2) {
        ++field1773;
        class17 var3 = class245.method1634(1, (long) arg0, 1);
        var3.method66((byte) -102);
        var3.field107 = arg2;
        if (arg1 > -17) {
            method926((byte) -55);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field1770;
        int var4 = -80 / ((arg2 - -41) / 42);
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1774 = ~arg0.method3013(-7) == -2;
            }
        } else {
            this.field1776 = arg0.method3002(-1);
        }
    }
}
