import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class596 extends class270 {

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public int field8464;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    private int field8462;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field8470;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public int field8465;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    private int field8469;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    private int field8459;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    private int field8457;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    private int field8468;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field8460;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIII)V")
    public final void method3334(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = this.field8470 + arg2 - this.field8462;
        field8461++;
        arg0[0] = 0;
        arg0[1] = arg1 + this.field8465 - this.field8469;
        if (arg3 != -30702) {
            this.method3340(95, 56, 89, 118);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)Z")
    public final boolean method3335(int arg0, int arg1, int arg2) {
        field8456++;
        if (arg1 != 1) {
            this.field8457 = -4;
        }
        return arg2 >= this.field8469 && arg2 <= this.field8468 && arg0 >= this.field8462 && this.field8457 >= arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static final void method3336(int arg0) {
        class377.field4897 = -1;
        field8463++;
        if (arg0 > -56) {
            field8455 = 91;
        }
        class319.field4130 = -1;
        class550.field7847 = 0;
        class644.field9114 = -1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3337(boolean arg0, int arg1) {
        field8453++;
        if (arg0) {
            method3336(-116);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z")
    public final boolean method3338(byte arg0, int arg1, int arg2) {
        field8458++;
        if (arg0 >= -14) {
            this.method3339(53, null, -25, 69);
        }
        return arg1 >= this.field8465 && arg1 <= this.field8460 && arg2 >= this.field8470 && arg2 <= this.field8464;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[III)V")
    public final void method3339(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field8462 + arg0 - this.field8470;
        arg1[1] = this.field8469 + arg2 - this.field8465;
        arg1[0] = this.field8459;
        if (arg3 == -4984) {
            field8467++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)Z")
    public final boolean method3340(int arg0, int arg1, int arg2, int arg3) {
        field8466++;
        if (arg1 != -1) {
            this.field8462 = -52;
        }
        return this.field8459 == arg2 && this.field8469 <= arg3 && arg3 <= this.field8468 && arg0 >= this.field8462 && arg0 <= this.field8457;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Ldl;Lap;)Llj;")
    public static final class555 method3341(int arg0, class58[] arg1, class435 arg2) {
        field8454++;
        int var3 = 0;
        int var4 = 120 % ((-arg0 - 16) / 42);
        while (var3 < arg1.length) {
            if (arg1[var3] == null || arg1[var3].field606 <= 0L) {
                return null;
            }
            var3++;
        }
        long var5 = OpenGL.glCreateProgramObjectARB();
        for (int var7 = 0; var7 < arg1.length; var7++) {
            OpenGL.glAttachObjectARB(var5, arg1[var7].field606);
        }
        OpenGL.glLinkProgramARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35714, class649.field9275, 0);
        if (class649.field9275[0] == 0) {
            if (class649.field9275[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class649.field9275, 1);
            if (class649.field9275[1] > 1) {
                byte[] var8 = new byte[class649.field9275[1]];
                OpenGL.glGetInfoLogARB(var5, class649.field9275[1], class649.field9275, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class649.field9275[0] == 0) {
                for (int var9 = 0; var9 < arg1.length; var9++) {
                    OpenGL.glDetachObjectARB(var5, arg1[var9].field606);
                }
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class555(arg2, var5, arg1);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8464 = arg8;
        this.field8462 = arg2;
        this.field8470 = arg6;
        this.field8465 = arg5;
        this.field8469 = arg1;
        this.field8459 = arg0;
        this.field8457 = arg4;
        this.field8468 = arg3;
        this.field8460 = arg7;
    }
}
