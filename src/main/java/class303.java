import jaggl.OpenGL;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class303 extends OutputStream {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field4274 = new int[250];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ti", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4275++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1905(int arg0) {
        field4274 = null;
        if (arg0 != 250) {
            field4274 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1906(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4278++;
        int var8 = arg1 - arg5;
        int var9 = arg5 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class415.method2491(arg0, arg2, class339.field4800[var10], arg6, -31541);
        }
        if (!arg3) {
            return;
        }
        for (int var11 = arg1; var11 > var8; var11--) {
            class415.method2491(arg0, arg2, class339.field4800[var11], arg6, -31541);
        }
        int var12 = arg0 - arg5;
        int var13 = arg2 + arg5;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class339.field4800[var14];
            class415.method2491(var13, arg2, var15, arg6, -31541);
            class415.method2491(var12, var13, var15, arg4, -31541);
            class415.method2491(arg0, var12, var15, arg6, -31541);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lod;Ljava/lang/String;IB)Ldd;")
    public static final class495 method1907(class349 arg0, String arg1, int arg2, byte arg3) {
        field4276++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class404.field6107, 0);
        if (class404.field6107[0] == -1) {
            int var5 = -123 / ((arg3 - 57) / 39);
            OpenGL.glBindProgramARB(arg2, 0);
            return new class495(arg0, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }
}
