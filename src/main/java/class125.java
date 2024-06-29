import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class125 extends class223 {

    @OriginalMember(owner = "client!op", name = "x", descriptor = "Lqt;")
    public static class449 field1832 = null;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "J")
    public static long field1826 = -1L;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lpk;")
    public static class133 field1824 = new class133();

    @OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
    public static int[] field1836 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "[I")
    public static int[] field1838 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Lqk;")
    public static class14 field1822;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Luu;")
    public class188 field1825;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Luu;")
    public class188 field1830;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Ljava/lang/String;")
    public String field1821;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public boolean field1820;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field1833;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIBIZI)V")
    public static final void method985(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        field1823++;
        if (class149.field2112 != null && (arg0 != 3 || class478.field7044.field3324 != arg3 || class478.field7044.field3351 != arg5)) {
            class280.method1795(class498.field7404, (byte) -62, class149.field2112);
            class149.field2112 = null;
        }
        if (arg0 == 3 && class149.field2112 == null) {
            class149.field2112 = class480.method2895(arg3, -8390, class498.field7404, arg5, 0, 0);
            if (class149.field2112 != null) {
                class478.field7044.field3324 = arg3;
                class478.field7044.field3351 = arg5;
                class478.field7044.method2067(class498.field7404, (byte) 59);
            }
        }
        if (arg0 == 3 && class149.field2112 == null) {
            method985(class478.field7044.field3347, arg1, (byte) -45, -1, true, -1);
            return;
        }
        Container var6;
        if (class149.field2112 != null) {
            class333.field4630 = arg5;
            var6 = class149.field2112;
            class248.field3674 = arg3;
        } else if (class245.field3611 == null) {
            var6 = class498.field7404.field6180;
            class248.field3674 = var6.getSize().width;
            class333.field4630 = var6.getSize().height;
        } else {
            Insets var7 = class245.field3611.getInsets();
            class248.field3674 = class245.field3611.getSize().width - var7.left - var7.right;
            int var10001 = -var7.top;
            class333.field4630 = class245.field3611.getSize().height + var10001 - var7.bottom;
            var6 = class245.field3611;
        }
        if (arg0 == 1) {
            class513.field7566 = 0;
            class410.field6100 = class86.field1178;
            class385.field5663 = (class248.field3674 - class128.field1862) / 2;
            class94.field1278 = class128.field1862;
        } else if (class352.field4882 < 96 && class65.field802 == 0) {
            int var8 = class248.field3674 > 1024 ? 1024 : class248.field3674;
            int var9 = class333.field4630 > 768 ? 768 : class333.field4630;
            class385.field5663 = (class248.field3674 - var8) / 2;
            class94.field1278 = var8;
            class410.field6100 = var9;
            class513.field7566 = 0;
        } else {
            class94.field1278 = class248.field3674;
            class513.field7566 = 0;
            class410.field6100 = class333.field4630;
            class385.field5663 = 0;
        }
        if (class365.field5281 != class297.field4260) {
            boolean var10000;
            if (class94.field1278 < 1024 && class410.field6100 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class2.method14(arg2 ^ 0x46);
        } else {
            class148.field2081.setSize(class94.field1278, class410.field6100);
            class225.field3300.method338(class148.field2081);
            if (class245.field3611 == var6) {
                Insets var10 = class245.field3611.getInsets();
                class148.field2081.setLocation(class385.field5663 + var10.left, var10.top - -class513.field7566);
            } else {
                class148.field2081.setLocation(class385.field5663, class513.field7566);
            }
        }
        if (arg0 >= 2) {
            class200.field2937 = true;
        } else {
            class200.field2937 = false;
        }
        if (class64.field761 != -1) {
            class351.method2116((byte) -101, true);
        }
        if (class383.field5635 != null && (class113.field1589 == 30 || class113.field1589 == 25)) {
            class435.method2639((byte) 93);
        }
        int var11 = 0;
        if (arg2 != -45) {
            field1824 = null;
        }
        while (var11 < 100) {
            class342.field4736[var11] = true;
            var11++;
        }
        class487.field7145 = true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method986(int arg0) {
        field1838 = null;
        field1822 = null;
        field1824 = null;
        if (arg0 == -1) {
            field1832 = null;
            field1836 = null;
        }
    }
}
