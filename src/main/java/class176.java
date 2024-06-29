import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class176 extends class4 {

    @OriginalMember(owner = "client!di", name = "I", descriptor = "Z")
    public volatile boolean field2781 = true;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lqj;")
    public static class147 field2772;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Lqh;")
    public static class201 field2771;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Z")
    public boolean field2778;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Z")
    public static boolean field2782;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Z")
    public boolean field2783;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[I")
    public static int[] field2776;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field2771 = null;
        field2772 = null;
        field2776 = null;
        if (arg0 != 2047) {
            field2785 = -40;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1201(byte arg0);

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
    public static final void method1202(int arg0) {
        field2770++;
        for (int var1 = -1; var1 < class155.field2514; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class57.field973[var1];
            }
            class33 var6 = class35.field548[var5];
            if (var6 != null && var6.field3403 > 0) {
                var6.field3403--;
                if (var6.field3403 == 0) {
                    var6.field3401 = null;
                }
            }
        }
        if (arg0 < 18) {
            return;
        }
        for (int var2 = 0; var2 < class141.field2287; var2++) {
            int var3 = class221.field3648[var2];
            class15 var4 = class137.field2260[var3];
            if (var4 != null && var4.field3403 > 0) {
                var4.field3403--;
                if (var4.field3403 == 0) {
                    var4.field3401 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)I")
    public abstract int method1203(byte arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1204(String[] arg0, int arg1) {
        field2773++;
        if (arg1 != 5) {
            return null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V")
    public static final void method1205(int arg0) {
        field2777++;
        if (arg0 != 60) {
            field2780 = -67;
        }
        for (class174 var1 = (class174) class162.field2586.method843(-75); var1 != null; var1 = (class174) class162.field2586.method852((byte) 123)) {
            class170 var2 = var1.field2733;
            if (class250.field3980 != var2.field2692 || var2.field2705) {
                var1.method1388(-123);
            } else if (class222.field3682 >= var2.field2714) {
                var2.method1175(class287.field4533, -1989);
                if (var2.field2705) {
                    var1.method1388(-102);
                } else {
                    class270.method1824(var2.field2692, var2.field2716, var2.field2698, var2.field2697, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "i", descriptor = "(I)I")
    public static final int method1206(int arg0) {
        field2784++;
        return arg0 <= 68 ? 28 : class220.field3601;
    }
}
