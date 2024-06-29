import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class158 extends Canvas {

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field2961;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
    public static boolean field2960 = false;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lrd;")
    public static class173 field2966 = class133.method843("::", 38);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lqc;")
    public static class162 field2955;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[I")
    public static int[] field2962;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[[S")
    public static short[][] field2965;

    @OriginalMember(owner = "client!pi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2961.update(arg0);
        field2963++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field2955 = null;
        field2965 = null;
        field2962 = null;
        field2966 = null;
        if (arg0 >= -3) {
            field2955 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field2956++;
        if (arg9 != -111) {
            return;
        }
        if (class194.field3778 <= arg6 && class96.field1766 >= arg6 && class194.field3778 <= arg0 && class96.field1766 >= arg0 && class194.field3778 <= arg7 && class96.field1766 >= arg7 && arg2 >= class194.field3778 && class96.field1766 >= arg2 && class37.field790 <= arg3 && arg3 <= class20.field445 && arg8 >= class37.field790 && arg8 <= class20.field445 && arg1 >= class37.field790 && arg1 <= class20.field445 && class37.field790 <= arg4 && arg4 <= class20.field445) {
            class168.method1082(arg1, arg6, arg8, arg9 ^ 0xFFFFEF91, arg5, arg2, arg4, arg0, arg7, arg3);
        } else {
            class165.method1060(arg8, arg4, arg3, arg6, arg5, arg7, arg2, arg1, arg0, 2009014476);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class158(Component arg0) {
        this.field2961 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static final void method1039(boolean arg0) {
        if (arg0) {
            return;
        }
        field2959++;
        while (true) {
            class145 var1 = class131.field2479;
            class77 var2;
            synchronized (class131.field2479) {
                var2 = (class77) class135.field2551.method919(0);
            }
            if (var2 == null) {
                return;
            }
            var2.field1500.method5((int) var2.field2437, var2.field1502, var2.field1503, false, -124);
        }
    }

    @OriginalMember(owner = "client!pi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2961.paint(arg0);
        field2957++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lbc;B)V")
    public static final void method1040(class14 arg0, byte arg1) {
        field2958++;
        class164.field3032 = arg0;
        if (arg1 >= 77) {
            class164.field3032.method138(4, true);
        }
    }
}
