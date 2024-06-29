import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class255 extends class141 {

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "Lhi;")
    public class82 field4395;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Lhi;")
    public static class82 field4384 = null;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field4382 = -1;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Lhi;")
    public static class82 field4391 = class95.method664((byte) -41, "Mem:");

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field4390 = 2;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[[[B")
    public static byte[][][] field4389;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLum;)V", line = 18)
    public static final void method1823(byte arg0, class222 arg1) {
        field4392++;
        class296.field5049 = arg1;
        if (arg0 >= -16) {
            field4386 = -98;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Le;", line = 36)
    public static final class227 method1824(int arg0) {
        field4388++;
        class227 var1 = (class227) class200.field3439.method803((byte) 97);
        if (var1 != null) {
            var1.method961((byte) 84);
            var1.method358((byte) 52);
            return var1;
        }
        if (arg0 != 0) {
            field4384 = (class82) null;
        }
        class227 var2;
        do {
            var2 = (class227) class221.field3822.method803((byte) 97);
            if (var2 == null) {
                return null;
            }
            if (var2.method1621(1914033952) > class57.method391(arg0 + 19211)) {
                return null;
            }
            var2.method961((byte) 61);
            var2.method358((byte) 52);
        } while ((Long.MIN_VALUE & var2.field824) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 77)
    public static void method1825(boolean arg0) {
        field4391 = null;
        field4389 = (byte[][][]) null;
        if (!arg0) {
            field4391 = (class82) null;
        }
        field4384 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I", line = 91)
    public static final int method1826(int arg0, int arg1) {
        if (arg1 != -1) {
            field4386 = 90;
        }
        field4387++;
        return arg0 == 16711935 ? -1 : class40.method311(256, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILum;ZI)[Ljf;", line = 110)
    public static final class86[] method1827(int arg0, class222 arg1, boolean arg2, int arg3) {
        field4383++;
        if (!arg2) {
            method1823((byte) -7, (class222) null);
        }
        return client.method866(arg3, arg0, (byte) 49, arg1) ? class308.method2124(110) : null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 133)
    public class255() {
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lhi;)V", line = 144)
    public class255(class82 arg0) {
        this.field4395 = arg0;
    }
}
