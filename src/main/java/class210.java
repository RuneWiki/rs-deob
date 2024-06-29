import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class210 extends class394 {

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field3024;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
    public static boolean field3027 = false;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Z")
    public final boolean method1266(byte arg0) {
        field3025++;
        if (arg0 < 90) {
            method1417(-43, 100);
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZZI)I")
    public static final int method1416(int arg0, boolean arg1, boolean arg2, int arg3) {
        field3023++;
        if (!arg2) {
            return 67;
        }
        class328 var4 = class475.method2847(arg3, arg1, (byte) 125);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field4960.length > arg0) {
            return var4.field4960[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public static final int method1417(int arg0, int arg1) {
        field3028++;
        int var2 = arg1;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 = arg1 + 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvj;Ljava/lang/String;II)Ltq;")
    public static final class442 method1418(class303 arg0, String arg1, int arg2, int arg3) {
        field3026++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class277.field3992, 0);
        if (class277.field3992[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            int var5 = -34 % ((-arg3 - 43) / 32);
            return new class442(arg0, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1267(byte arg0) {
        field3029++;
        return arg0 == -94 ? this.field3024 : null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lue;Ljava/lang/Object;I)V")
    public class210(class154 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3024 = arg1;
    }
}
