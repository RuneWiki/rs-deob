import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class184 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Z")
    public boolean field2720 = true;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Luv;")
    public static class2 field2721 = new class2(45, -1);

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lfr;")
    public static class497 field2723 = new class497();

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "C")
    private char field2713;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/String;")
    public String field2714;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[Ll;")
    public static class127[] field2715;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[[B")
    public static byte[][] field2710;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1247(int arg0) {
        field2712++;
        if (arg0 != -116) {
            field2715 = null;
        }
        class405.field6097 = null;
        class147.field2222 = null;
        class174.field2548 = null;
        class265.field3956 = null;
        class276.field4117 = false;
        class352.field5424 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1248(byte arg0) {
        field2721 = null;
        field2715 = null;
        field2723 = null;
        field2710 = null;
        if (arg0 != -67) {
            method1247(68);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method1249(byte arg0) {
        field2711++;
        int var1 = class146.field2203;
        int[] var2 = class457.field6694;
        if (arg0 != -25) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class480 var4 = class83.field1327[var2[var3]];
            if (var4 != null) {
                class31.method272(var4, true, var4.method2419((byte) 112));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BILgk;)V")
    private final void method1250(byte arg0, int arg1, class468 arg2) {
        if (arg0 > -29) {
            this.method1250((byte) -31, 112, null);
        }
        if (arg1 == 1) {
            this.field2713 = class245.method1490(arg2.method2714((byte) -50), -1);
        } else if (arg1 == 2) {
            this.field2717 = arg2.method2722(false);
        } else if (arg1 == 4) {
            this.field2720 = false;
        } else if (arg1 == 5) {
            this.field2714 = arg2.method2770(-20459);
        }
        field2719++;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        field2722++;
        if (arg0 == -1) {
            return this.field2713 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lgk;I)V")
    public final void method1252(class468 arg0, int arg1) {
        field2716++;
        while (true) {
            int var3 = arg0.method2765(85);
            if (var3 == 0) {
                int var4 = -40 / ((arg1 - 14) / 35);
                return;
            }
            this.method1250((byte) -62, var3, arg0);
        }
    }
}
