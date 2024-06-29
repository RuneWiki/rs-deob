import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class129 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lgp;")
    public static class561 field2108;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lod;")
    public static class568 field2111;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lpf;")
    public class586 field2106;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[S")
    public static short[] field2101;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZZ)Ljava/lang/String;", line = 6)
    public static final String method1008(int arg0, boolean arg1, boolean arg2) {
        field2102++;
        if (arg2 && arg0 >= 0) {
            if (arg1) {
                method1009(-17, 27);
            }
            return class352.method2136(10, 48, arg0, arg2);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I", line = 24)
    public static final int method1009(int arg0, int arg1) {
        field2104++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        int var5 = -116 % ((-arg1 - 4) / 61);
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 43)
    public static void method1010(int arg0) {
        field2101 = null;
        field2108 = null;
        if (arg0 != 10) {
            field2108 = null;
        }
        field2111 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILco;I)V", line = 55)
    private final void method1011(int arg0, class268 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2110 = arg1.method1745(32132);
        } else if (arg0 == 2) {
            this.field2099 = arg1.method1738(255);
            this.field2107 = arg1.method1738(255);
        }
        field2105++;
        if (arg2 != -1016289108) {
            method1009(-27, -113);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lfba;", line = 79)
    public final synchronized class518 method1012(int arg0) {
        field2109++;
        class518 var2 = (class518) this.field2106.field8357.method2407(false, (long) this.field2110);
        if (var2 != null) {
            return var2;
        }
        class518 var3 = class518.method2922(this.field2106.field8354, this.field2110, arg0);
        if (var3 != null) {
            this.field2106.field8357.method2408(var3, (long) this.field2110, -127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lco;I)V", line = 101)
    public final void method1013(class268 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                if (arg1 >= -15) {
                    this.method1012(-11);
                }
                field2103++;
                return;
            }
            this.method1011(var3, arg0, -1016289108);
        }
    }
}
