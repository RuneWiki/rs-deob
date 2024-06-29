import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class600 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field7626 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lrn;")
    public static class633 field7625 = new class633(37, 16);

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Luw;")
    public static class208 field7628 = new class208(120, 4);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7630 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lfca;")
    public static class661 field7629 = new class661();

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
    public static int[] field7632 = new int[5];

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Luw;")
    public static class208 field7631 = new class208(6, 0);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public static int[] field7627;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILmc;)Laf;")
    public static final class14 method3240(int arg0, class234 arg1) {
        field7623++;
        class759 var2 = class166.method1061(0)[arg1.method1509(true)];
        class20 var3 = class549.method2972(-2)[arg1.method1509(true)];
        int var4 = arg1.method1542(27067);
        int var5 = arg1.method1542(arg0 ^ 0xFFFFB63D);
        if (arg0 != -8314) {
            return null;
        }
        int var6 = arg1.method1553((byte) 67);
        int var7 = arg1.method1553((byte) 76);
        int var8 = arg1.method1542(27067);
        int var9 = arg1.method1497((byte) 94);
        int var10 = arg1.method1497((byte) 34);
        return new class14(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method3241(int arg0) {
        for (class720 var1 = (class720) class479.field6198.method2610((byte) -83); var1 != null; var1 = (class720) class479.field6198.method2620(0)) {
            if (var1.field9464.method592((byte) -31)) {
                class595.method3210(var1.field9459, true);
            } else {
                var1.field9464.method4298(false);
                try {
                    var1.field9464.method581((byte) -65);
                } catch (Exception var5) {
                    class416.method2401(1, var5, "TV: " + var1.field9459);
                    class595.method3210(var1.field9459, true);
                }
                if (!var1.field9458 && !var1.field9460) {
                    class435 var3 = var1.field9464.method591((byte) -119);
                    if (var3 != null) {
                        class338 var4 = var3.method2494(31077);
                        if (var4 != null) {
                            var4.method1948(var1.field9461, -2444);
                            class1.field10.method41(var4);
                            var1.field9458 = true;
                        }
                    }
                }
            }
        }
        field7624++;
        if (arg0 < 12) {
            method3241(-5);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method3242(byte arg0) {
        field7628 = null;
        field7625 = null;
        field7629 = null;
        field7631 = null;
        field7630 = null;
        if (arg0 != 35) {
            field7626 = 27;
        }
        field7632 = null;
        field7627 = null;
    }
}
