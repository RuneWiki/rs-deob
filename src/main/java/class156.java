import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class156 extends class117 implements class463 {

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    private int field2370 = -1;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    private int field2373 = -1;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Lqg;")
    private class321 field2372;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "J")
    public static long field2365 = 0L;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field2366 = 100;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lcv;")
    public static class398 field2367 = new class398(32);

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Lsv;")
    public static class467 field2380 = new class467(2, 4, 4, 0);

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V")
    public final void method1125(boolean arg0) {
        if (this.field2368 > 0) {
            this.field2372.method2075(arg0, this.field2379, this.field2368);
            this.field2368 = 0;
        }
        if (arg0) {
            this.field2372 = null;
        }
        field2376++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public final void method1126(int arg0, int arg1, int arg2) {
        field2369++;
        if (arg2 != 0) {
            method1128(-11, -128, 40, -66);
        }
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field2368);
        this.field2373 = arg1;
        this.field2370 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        field2380 = null;
        if (arg0 <= -58) {
            field2367 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1128(int arg0, int arg1, int arg2, int arg3) {
        if (class170.method1208(arg0, arg1, arg2)) {
            int var4 = arg1 << class225.field3278;
            int var5 = arg2 << class225.field3278;
            return class475.method2842(var4 + 1, class529.field7807[arg0].method271(arg1, arg2) + arg3, var5 + 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1 + 1, arg2) + arg3, var5 + 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1 + 1, arg2 + 1) + arg3, class427.field6246 + var5 - 1) && class475.method2842(var4 + 1, class529.field7807[arg0].method271(arg1, arg2 + 1) + arg3, class427.field6246 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field2373, this.field2370, 36161, 0);
        field2375++;
        this.field2370 = -1;
        this.field2373 = -1;
        if (!arg0) {
            this.method329(true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2374++;
        this.method1125(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqg;III)V")
    public class156(class321 arg0, int arg1, int arg2, int arg3) {
        this.field2371 = arg3;
        this.field2381 = arg2;
        this.field2372 = arg0;
        this.field2377 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class79.field1311, 0);
        this.field2368 = class79.field1311[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2368);
        OpenGL.glRenderbufferStorageEXT(36161, this.field2377, this.field2381, this.field2371);
        this.field2379 = this.field2381 * this.field2371 * this.field2372.method2025(this.field2377, 1);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqg;IIII)V")
    public class156(class321 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2377 = arg1;
        this.field2381 = arg2;
        this.field2372 = arg0;
        this.field2371 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class79.field1311, 0);
        this.field2368 = class79.field1311[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2368);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field2377, this.field2381, this.field2371);
        this.field2379 = this.field2381 * this.field2371 * this.field2372.method2025(this.field2377, 1);
    }
}
