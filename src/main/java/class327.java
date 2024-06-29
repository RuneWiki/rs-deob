import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class327 extends class165 {

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field5048 = 0;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public int field5062 = -1;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Z")
    public static boolean field5053 = false;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[I")
    public static int[] field5050 = new int[5];

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "Lbf;")
    public static class58 field5064;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 5)
    public static final void method2290(int arg0) {
        field5049++;
        class25.field337.method702((byte) 124);
        if (arg0 != 37) {
            method2293(-28);
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 22)
    public static void method2291(byte arg0) {
        if (arg0 != 54) {
            method2292(-29);
        }
        field5050 = null;
        field5064 = null;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)I", line = 53)
    public static final int method2292(int arg0) {
        field5054++;
        if ((double) class43.field543 == 3.0D) {
            return 37;
        } else if (arg0 != 200) {
            return 11;
        } else if ((double) class43.field543 == 4.0D) {
            return 50;
        } else if ((double) class43.field543 == 6.0D) {
            return 75;
        } else if ((double) class43.field543 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 92)
    public static final void method2293(int arg0) {
        class192.field3138 = 0;
        class24.field330 = 0;
        class285.method2045(2);
        field5057++;
        class193.method1427(arg0);
        class182.method1363(-16467);
        for (int var1 = 0; var1 < class24.field330; var1++) {
            int var2 = class117.field1773[var1];
            if (class240.field3818 != class99.field1445[var2].field4204) {
                if (class99.field1445[var2].field3752.method1841(false)) {
                    class189.method1401(~arg0, class99.field1445[var2]);
                }
                class99.field1445[var2].method1697(3734, (class256) null);
                class99.field1445[var2] = null;
            }
        }
        if (class219.field3540 != class247.field3898.field586) {
            throw new RuntimeException("gnp1 pos:" + class247.field3898.field586 + " psize:" + class219.field3540);
        }
        for (int var3 = arg0; var3 < class233.field3736; var3++) {
            if (class99.field1445[class142.field2225[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class233.field3736);
            }
        }
    }
}
