import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class421 extends class348 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Z")
    public static boolean field6387 = false;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
    public static int[] field6390 = new int[2];

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "[I")
    public static int[] field6391;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6390 = null;
        if (arg0 != 2) {
            method2687(94);
        }
        field6391 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        ++field6386;
        if (arg1 >= -30) {
            method2687(88);
        }
        super.field5398.method1496(true, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2688(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class316.field4934 = arg4;
        ++field6383;
        class54.field785 = arg3;
        class274.field4359 = arg5;
        if (arg1 >= -4) {
            field6391 = null;
        }
        class7.field80 = arg6;
        class384.field5881 = arg2;
        class304.field4789 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        int var3 = 14 / ((-23 - arg1) / 41);
        ++field6388;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field6385;
        int var4 = 113 % ((-49 - arg1) / 44);
        super.field5398.method1540(56, arg2);
        super.field5398.method1494(arg0, -25951);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lna;)V")
    public class421(class211 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2689(String arg0, String arg1, String arg2, byte arg3) {
        ++field6389;
        int var4 = arg1.indexOf(arg2);
        int var5 = -103 / ((63 - arg3) / 50);
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(arg2.length() + var4);
            var4 = arg1.indexOf(arg2, arg0.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field6393;
        if (arg2 >= -51) {
            field6387 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            return false;
        } else {
            ++field6384;
            return true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        int var2 = -13 % ((61 - arg0) / 63);
        ++field6392;
        super.field5398.method1496(false, 0);
    }

    static {
        new class213("From", "Von:", "De", "De");
    }
}
