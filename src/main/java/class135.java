import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class135 extends class12 {

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
    public static boolean field2620 = false;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "[[I")
    public static int[][] field2616 = new int[5][5000];

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "Lkb;")
    public static class93 field2626 = class76.method390("(U2", 0);

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lkb;")
    private static class93 field2618 = class76.method390("flash3:", 0);

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field2625 = 5063219;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lkb;")
    public static class93 field2629 = class76.method390("lila:", 0);

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "[I")
    public static int[] field2628 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Lkb;")
    public static class93 field2627 = field2618;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Lkb;")
    public static class93 field2621 = field2618;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lrd;ZI)V")
    private final void method852(class158 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2630 = -101;
        }
        field2619++;
        if (arg2 == 1) {
            this.field2617 = arg0.method1071(28101);
            this.field2622 = arg0.method1054(128);
            this.field2630 = arg0.method1054(128);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static final void method853(int arg0) {
        class59.field942.method41(false);
        field2624++;
        int var1 = class59.field942.method42(1, -98);
        if (var1 == 0) {
            return;
        }
        int var2 = class59.field942.method42(arg0, -119);
        if (var2 == 0) {
            class14.field243[class124.field2313++] = 2047;
        } else if (var2 == 1) {
            int var3 = class59.field942.method42(3, arg0 ^ 0xFFFFFFCA);
            class106.field1940.method604(false, true, var3);
            int var4 = class59.field942.method42(1, arg0 - 102);
            if (var4 == 1) {
                class14.field243[class124.field2313++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class59.field942.method42(3, -125);
            class106.field1940.method604(true, true, var5);
            int var6 = class59.field942.method42(3, -104);
            class106.field1940.method604(true, true, var6);
            int var7 = class59.field942.method42(1, -97);
            if (var7 == 1) {
                class14.field243[class124.field2313++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class59.field942.method42(7, arg0 - 96);
            int var9 = class59.field942.method42(1, -56);
            class114.field2145 = class59.field942.method42(2, -81);
            int var10 = class59.field942.method42(1, arg0 - 57);
            if (var10 == 1) {
                class14.field243[class124.field2313++] = 2047;
            }
            int var11 = class59.field942.method42(7, -61);
            class106.field1940.method609(var9 == 1, (byte) -122, var11, var8);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method854(Component arg0, int arg1) {
        field2623++;
        Method var2 = class149.field2869;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class203.field3915);
        if (arg1 <= -53) {
            arg0.addFocusListener(class203.field3915);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static void method855(int arg0) {
        field2627 = null;
        field2626 = null;
        field2616 = null;
        field2628 = null;
        field2621 = null;
        field2629 = null;
        if (arg0 != -1) {
            method854(null, 76);
        }
        field2618 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILrd;)V")
    public final void method856(int arg0, class158 arg1) {
        while (true) {
            int var3 = arg1.method1054(128);
            if (var3 == 0) {
                field2631++;
                if (arg0 != -1) {
                    method853(8);
                    return;
                }
                return;
            }
            this.method852(arg1, false, var3);
        }
    }
}
