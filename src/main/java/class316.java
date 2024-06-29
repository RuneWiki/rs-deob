import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class316 extends class269 {

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
    public boolean field4781 = false;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
    public boolean field4784 = false;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Ljg;")
    public static class241 field4776 = new class241(30);

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Liq;")
    public static class134 field4786;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static final void method1927(byte arg0) {
        if (class280.field4293 == null || class47.field582 == null) {
            class280.field4293 = new int[256];
            class47.field582 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class280.field4293[var1] = (int) (Math.sin(var2) * 4096.0D);
                class47.field582[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field4777++;
        if (arg0 < 77) {
            method1929(false, 26);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        field4786 = null;
        field4776 = null;
        if (arg0 != -92) {
            field4786 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)V")
    public static final void method1929(boolean arg0, int arg1) {
        field4782++;
        if (class19.field263 == arg1) {
            return;
        }
        if (class19.field263 == 0) {
            class240.method1474(-20561);
        }
        if (arg1 == 40) {
            class292.method1812(-80);
        }
        if (arg1 != 40 && class187.field2805 != null) {
            class187.field2805.method2163(true);
            class187.field2805 = null;
        }
        if (arg0) {
            field4786 = null;
        }
        if (class19.field263 == 25 || class19.field263 == 28) {
            class296.field4494.field1767 = 2;
            class296.field4496.field1767 = 2;
            class261.field3978.field1767 = 2;
            class253.field3862.field1767 = 2;
            class81.field1079.field1767 = 2;
            class458.field6792.field1767 = 2;
            class133.field1727.field1767 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class302.field4548 = 0;
            class168.field2415 = 0;
            class360.field5319 = 0;
            class408.field6078 = 1;
            class429.field6311 = 1;
            class302.method1860(42, true);
            class296.field4494.field1767 = 1;
            class296.field4496.field1767 = 1;
            class261.field3978.field1767 = 1;
            class253.field3862.field1767 = 1;
            class81.field1079.field1767 = 1;
            class458.field6792.field1767 = 1;
            class133.field1727.field1767 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class21.method140(-3);
        }
        if (arg1 == 5) {
            class6.method51((byte) -80, class427.field6274, class196.field2965);
        } else {
            class15.method85(120);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class19.field263 == 5 || class19.field263 == 10 || class19.field263 == 28;
        if (var3 != var2) {
            if (var2) {
                class195.field2944 = class244.field3653;
                if (class438.field6450 == 0) {
                    class119.method711(2, (byte) -33);
                } else {
                    class310.method1889(2, class298.field4505, false, 255, 18667, 0, class244.field3653);
                }
                class8.field92.method302((byte) -118, false);
            } else {
                class119.method711(2, (byte) -64);
                class8.field92.method302((byte) -118, true);
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class196.field2965.method374();
        }
        class19.field263 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)V")
    public static final void method1930(long arg0, int arg1) {
        field4783++;
        if (class277.field4216 != null) {
            if (class80.field1054 == 1 || class80.field1054 == 5) {
                class284.method1749(arg0, false);
            } else if (class80.field1054 == 4) {
                class371.method2235(0, arg0);
            }
        }
        class67.method457((long) class26.field332, (byte) 127, class196.field2965);
        if (class6.field69 != -1) {
            class114.method692((byte) 54, class6.field69);
        }
        for (int var3 = 0; var3 < class174.field2662; var3++) {
            if (class6.field71[var3]) {
                class71.field931[var3] = true;
            }
            class71.field914[var3] = class6.field71[var3];
            class6.field71[var3] = false;
        }
        class426.field6267 = class26.field332;
        if (class196.field2965.method398()) {
            class174.field2665 = true;
        }
        if (class6.field69 != -1) {
            class174.field2662 = 0;
            class6.method55((byte) -62);
        }
        class196.field2965.method433();
        class416.method2597(class196.field2965, (byte) -122);
        int var4 = class455.method2831((byte) -119);
        if (var4 == -1) {
            var4 = class57.field764;
        }
        class56.method322(0, var4);
        class196.method1172(class113.field1500.field1900, class113.field1500.field1902, class342.field5118, class113.field1500.field1892, true);
        class342.field5118 = 0;
        if (arg1 != -2939) {
            method1928((byte) 44);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIZZ)V")
    public class316(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4780 = arg1;
        this.field4784 = arg4;
        this.field4781 = arg3;
        this.field4778 = arg0;
        this.field4785 = arg2;
    }

    static {
        new class151("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
