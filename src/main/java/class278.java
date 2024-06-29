import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class278 extends class206 {

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[[I")
    public static int[][] field4767 = new int[104][104];

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "Lmh;")
    public static class62 field4773 = class201.method1405(true, "(U4");

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "Lmh;")
    private static class62 field4776 = class201.method1405(true, "wave2:");

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lmh;")
    public static class62 field4769 = class201.method1405(true, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field4777 = 0;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "Z")
    public static boolean field4779 = false;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lmh;")
    public static class62 field4768 = field4776;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "Lmh;")
    private static class62 field4781 = class201.method1405(true, "Loaded interfaces");

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Lmh;")
    public static class62 field4771 = field4776;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "Lmh;")
    public static class62 field4782 = field4781;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "Z")
    public static boolean field4785 = true;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "F")
    public static float field4761;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V", line = 10)
    public static final void method1896(byte arg0) {
        field4762++;
        int[] var1 = new int[class262.field4404];
        int var2 = 0;
        if (arg0 <= 13) {
            method1902(-81);
        }
        for (int var3 = 0; var3 < class262.field4404; var3++) {
            class37 var4 = class189.method1320(0, var3);
            if (var4.field564 >= 0 || var4.field521 >= 0) {
                var1[var2++] = var3;
            }
        }
        class54.field800 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class54.field800[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I", line = 55)
    public static final int method1897(int arg0, int arg1) {
        if (arg1 != 675) {
            method1900(57, true, 91, -94, -59, -71, (class26) null);
        }
        field4780++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 85)
    public static final void method1898(int arg0, Component arg1) {
        arg1.removeKeyListener(class111.field1810);
        arg1.removeFocusListener(class111.field1810);
        field4778++;
        class243.field4138 = -1;
        int var2 = -60 % ((-arg0 - 28) / 32);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Lik;", line = 100)
    public static final class309 method1899(int arg0) {
        if (arg0 != -6930) {
            return (class309) null;
        }
        field4765++;
        try {
            return (class309) Class.forName("rc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class196();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIIIILhi;)V", line = 117)
    public static final void method1900(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class26 arg6) {
        class15.field122 = arg4;
        class148.field2348 = arg5;
        class24.field273 = arg1;
        class246.field4180 = arg0;
        if (arg2 != 0) {
            method1900(63, true, 103, -68, 127, -101, (class26) null);
        }
        field4763++;
        class237.field4064 = arg3;
        class289.field4925 = arg6;
        class60.field876 = 1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)Z", line = 153)
    public final boolean method1901(byte arg0, int arg1, int arg2) {
        if (arg0 > -118) {
            method1899(99);
        }
        field4775++;
        return this.field4766 <= arg1 && this.field4783 >= arg1 && this.field4764 <= arg2 && arg2 <= this.field4784;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 180)
    public static void method1902(int arg0) {
        field4776 = null;
        field4768 = null;
        field4773 = null;
        if (arg0 != 104) {
            return;
        }
        field4782 = null;
        field4781 = null;
        field4769 = null;
        field4771 = null;
        field4767 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIII)V", line = 196)
    public class278(int arg0, int arg1, int arg2, int arg3) {
        this.field4766 = arg0;
        this.field4783 = arg2;
        this.field4764 = arg1;
        this.field4784 = arg3;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 208)
    public static final void method1903(int arg0) {
        field4774++;
        class170.field2772.method1693(155, false);
        class170.field2772.method717(1, client.method2050((byte) 82));
        class115.field1924++;
        class170.field2772.method738((byte) -88, class306.field5258);
        if (arg0 <= -2) {
            class170.field2772.method738((byte) -87, class60.field878);
            class271.field4617 = 0L;
        }
    }
}
