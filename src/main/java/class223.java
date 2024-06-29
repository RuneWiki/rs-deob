import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class223 extends class418 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Luc;")
    public static class51 field3073 = new class51(64);

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1454(int arg0) {
        if (arg0 != -3010) {
            method1454(48);
        }
        field3073 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIZZ)V")
    public static final void method1455(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class108.field1421 = arg1;
        class186.field2554 = arg2;
        class251.field3687 = arg3;
        class189.field2597 = new class77[arg0][class108.field1421][class186.field2554];
        class142.field1804 = new class193[4];
        if (arg4) {
            class197.field2727 = new class77[1][class108.field1421][class186.field2554];
            class50.field777 = new int[class108.field1421][class186.field2554];
            class370.field5469 = new class193[1];
        } else {
            class197.field2727 = null;
            class50.field777 = null;
            class370.field5469 = null;
        }
        if (arg5) {
            class131.field1714 = new int[arg0][arg1][arg2];
            class280.field4131 = new class64[255];
            class116.field1511 = new boolean[255];
            class197.field2720 = 0;
        } else {
            class131.field1714 = null;
            class280.field4131 = null;
            class116.field1511 = null;
            class197.field2720 = 0;
        }
        class325.method2128(false);
        class114.field1489 = new class321[500];
        class199.field2754 = 0;
        class242.field3396 = new class321[500];
        class379.field5552 = 0;
        class301.field4539 = new int[arg0][class108.field1421 + 1][class186.field2554 + 1];
        class13.field211 = new class407[5000];
        class355.field5261 = 0;
        class277.field4069 = new boolean[class251.field3687 + class251.field3687 + 1][class251.field3687 + class251.field3687 + 1];
        class349.field5191 = new boolean[class251.field3687 + class251.field3687 + 2][class251.field3687 + class251.field3687 + 2];
        class395.field5742 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
    public class223(int arg0, int arg1) {
        this.field3072 = arg0;
        this.field3069 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public static final void method1456(int arg0, int arg1) {
        field3076++;
        class440 var2 = class186.method1241(arg0, 5, (byte) 56);
        var2.method2749(13828096);
        if (arg1 != -13734) {
            field3073 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1457(Component arg0, int arg1) {
        arg0.addMouseListener(class410.field5954);
        field3075++;
        int var2 = 67 / ((-arg1 - 47) / 44);
        arg0.addMouseMotionListener(class410.field5954);
        arg0.addFocusListener(class410.field5954);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Lhb;")
    public static final class72 method1458(int arg0) {
        field3070++;
        if (arg0 != 2) {
            return null;
        }
        try {
            return (class72) Class.forName("vg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public static final void method1459(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1063 != null) {
            var3.field1063 = null;
        }
        if (var3.field1076 != null) {
            var3.field1076 = null;
        }
    }
}
