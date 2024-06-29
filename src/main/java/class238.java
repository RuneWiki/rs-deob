import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class238 extends class114 {

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    private int field4006 = 0;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    private int field4024 = -32768;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Z")
    public boolean field4018 = false;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    private int field4031 = 0;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lgi;")
    private class294 field4028;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lce;")
    public static class126 field4016 = class206.method1445(-7923, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4013 = 0;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "[I")
    public static int[] field4017 = new int[256];

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4015 = 0;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "F")
    public static float field4030;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lqj;")
    private class211 field4011;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lcc;")
    public static class313 field4012;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()I", line = 4)
    public final int method225() {
        field4019++;
        return this.field4024;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Lwi;", line = 14)
    private final class196 method1638(int arg0) {
        class168 var2 = class173.method1261(false, this.field4007);
        if (arg0 != -1) {
            this.method225();
        }
        field4027++;
        class196 var3;
        if (this.field4018) {
            var3 = var2.method1224((byte) -102, -1);
        } else {
            var3 = var2.method1224((byte) 109, this.field4031);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 46)
    public static void method1639(int arg0) {
        field4016 = null;
        field4012 = null;
        if (arg0 != -1) {
            field4013 = 12;
        }
        field4017 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 58)
    public static final void method1640(Component arg0, byte arg1) {
        field4029++;
        if (arg1 != 31) {
            field4017 = (int[]) null;
        }
        Method var2 = class147.field2724;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class50.field761);
        arg0.addFocusListener(class50.field761);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIIII)V", line = 192)
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4007 = arg0;
        this.field4005 = arg5 + arg6;
        this.field4021 = arg4;
        this.field4020 = arg1;
        this.field4023 = arg3;
        this.field4022 = arg2;
        int var8 = class173.method1261(false, this.field4007).field2976;
        if (var8 == -1) {
            this.field4018 = true;
        } else {
            this.field4018 = false;
            this.field4028 = class110.method721(-127, var8);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 88)
    public final void method1641(int arg0, int arg1) {
        int var3 = 82 / ((-arg0 - 85) / 40);
        field4010++;
        if (this.field4018) {
            return;
        }
        this.field4006 += arg1;
        while (this.field4028.field4905[this.field4031] < this.field4006) {
            this.field4006 -= this.field4028.field4905[this.field4031];
            this.field4031++;
            if (this.field4031 >= this.field4028.field4890.length) {
                this.field4018 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 120)
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4026++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIJILqj;)V", line = 144)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10) {
        class196 var13 = this.method1638(-1);
        field4009++;
        if (var13 != null) {
            var13.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4011);
            this.field4024 = var13.method225();
        }
    }
}
