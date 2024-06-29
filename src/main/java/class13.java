import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "J")
    public static long field409 = 0L;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lkd;")
    private static class73 field413 = class126.method1070((byte) -66, " million");

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lkd;")
    public static class73 field418 = field413;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[Lkd;")
    public static class73[] field415 = new class73[5];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lkd;")
    public static class73 field408 = class126.method1070((byte) -66, "titlebox");

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[Z")
    public static boolean[] field423 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lkd;")
    public static class73 field407 = class126.method1070((byte) -66, "0(U");

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
    public static int[] field425 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lkd;")
    public static class73 field424 = class126.method1070((byte) -66, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lkd;")
    public static class73 field414 = class126.method1070((byte) -66, "<col=ffb000>");

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lkd;")
    public static class73 field420 = class126.method1070((byte) -66, "Neuer Benutzer");

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lkd;")
    private static class73 field419 = class126.method1070((byte) -66, " from your ignore list first");

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lkd;")
    public static class73 field411 = field419;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[Lld;")
    public static class80[] field417;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method112(int arg0, Component arg1) {
        field416++;
        arg1.addMouseListener(class71.field1795);
        if (arg0 != 6627) {
            method114(null, (byte) 0);
        }
        arg1.addMouseMotionListener(class71.field1795);
        arg1.addFocusListener(class71.field1795);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[Lpb;")
    public static final class106[] method113(int arg0) {
        field412++;
        class106[] var1 = new class106[class5.field182];
        int var2 = 0;
        if (arg0 != 22197) {
            method114(null, (byte) -34);
        }
        while (var2 < class5.field182) {
            class106 var3 = var1[var2] = new class106();
            var3.field2631 = class111.field2723;
            var3.field2628 = class45.field1192;
            var3.field2629 = class22.field641[var2];
            var3.field2630 = class132.field3315[var2];
            var3.field2625 = class72.field1819[var2];
            var3.field2627 = class2.field150[var2];
            int var4 = var3.field2627 * var3.field2625;
            byte[] var5 = class92.field2382[var2];
            var3.field2626 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2626[var6] = class24.field682[class149.method1189(255, var5[var6])];
            }
            var2++;
        }
        class57.method492(-4202);
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lse;B)V")
    public static final void method114(class129 arg0, byte arg1) {
        class54.field1445 = arg0;
        if (arg1 >= -95) {
            field419 = null;
        }
        field421++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method115(boolean arg0) {
        field413 = null;
        field420 = null;
        if (arg0) {
            method115(true);
        }
        field407 = null;
        field408 = null;
        field424 = null;
        field418 = null;
        field423 = null;
        field415 = null;
        field411 = null;
        field419 = null;
        field417 = null;
        field414 = null;
        field425 = null;
    }
}
