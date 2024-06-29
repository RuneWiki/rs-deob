import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class191 extends Canvas {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field2991;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
    public static int[] field2984 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lnf;")
    public static class162 field2989 = new class162(200);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
    public static int[] field2995;

    @OriginalMember(owner = "client!je", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2994++;
        this.field2991.update(arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
    public static final void method1357(int arg0, boolean arg1) {
        field2985++;
        class69 var2 = class255.method1723((byte) 32, arg0, 8);
        if (arg1) {
            field2984 = null;
        }
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method1358(boolean arg0, String arg1) {
        field2992++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class181.field2843; var2++) {
            if (arg1.equalsIgnoreCase(class64.field1015[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class263.field4168.field2064)) {
            return true;
        } else {
            if (arg0) {
                method1359((byte) -50);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field2984 = null;
        field2989 = null;
        field2995 = null;
        if (arg0 != -64) {
            method1359((byte) 92);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLfa;B)V")
    public static final void method1360(boolean arg0, class267 arg1, byte arg2) {
        field2986++;
        int var3 = 37 / ((arg2 - 31) / 39);
        if (arg0) {
            int var4 = class163.field2449;
            int var5 = var4 * 956 / 503;
            class52.field826.method431((class179.field2816 - var5) / 2, 0, var5, var4);
            class154.field2294.method57(class179.field2816 / 2 - (class154.field2294.field157 / 2), 18);
        }
        arg1.method1808(class152.field2248 == 1 ? class3.field50 : class183.field2884, class179.field2816 / 2, class163.field2449 / 2 - 26, 16777215, -1);
        int var6 = class163.field2449 / 2 - 18;
        class66.method533(class179.field2816 / 2 - 152, var6, 304, 34, 9179409);
        class66.method533(class179.field2816 / 2 - 151, var6 - -1, 302, 32, 0);
        class66.method532(class179.field2816 / 2 - 150, var6 + 2, class79.field1208 * 3, 30, 9179409);
        class66.method532(class179.field2816 / 2 + class79.field1208 * 3 - 150, var6 + 2, 300 - (class79.field1208 * 3), 30, 0);
        arg1.method1808(class116.field1775, class179.field2816 / 2, class163.field2449 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!je", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2991.paint(arg0);
        field2990++;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class191(Component arg0) {
        this.field2991 = arg0;
    }
}
