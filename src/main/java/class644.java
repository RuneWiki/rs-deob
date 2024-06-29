import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class644 extends class528 {

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    private int field8635;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    private int field8639;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    private int field8641;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "[Lro;")
    public static class526[] field8642 = new class526[14];

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    private int field8628;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    private int field8630;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    private int field8634;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    private int field8643;

    // $FF: synthetic field
    @OriginalMember(owner = "client!om", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field8644;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Z")
    public static boolean field8627;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "[B")
    private byte[] field8631;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "[[I")
    public static int[][] field8632;

    // $FF: synthetic method
    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3598(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)Z", line = 8)
    public static final boolean method3594(int arg0, int arg1, byte arg2) {
        field8633++;
        if (arg2 == -48) {
            return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 20)
    public static void method3595(int arg0) {
        if (arg0 != 4096) {
            field8642 = null;
        }
        field8642 = null;
        field8632 = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 31)
    public static final void method3596(int arg0) {
        field8626++;
        try {
            Method var1 = (field8644 == null ? (field8644 = method3598("java.lang.Runtime")) : field8644).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class81.field1179 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 425152012) {
            field8632 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIFFF)V", line = 64)
    public class644(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8637 = (int) (arg7 * 4096.0F);
        this.field8635 = (int) (arg6 * 4096.0F);
        this.field8641 = this.field8639 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V", line = 76)
    public final void method3141(int arg0, int arg1, int arg2) {
        field8640++;
        if (arg1 == 0) {
            this.field8643 = this.field8635 - (arg2 < 0 ? -arg2 : arg2);
            this.field8630 = 4096;
            this.field8643 = this.field8643 * this.field8643 >> 12;
            this.field8634 = this.field8643;
        } else {
            this.field8630 = this.field8643 * this.field8637 >> 12;
            if (this.field8630 < 0) {
                this.field8630 = 0;
            } else if (this.field8630 > 4096) {
                this.field8630 = 4096;
            }
            this.field8643 = this.field8635 - (arg2 >= 0 ? arg2 : -arg2);
            this.field8643 = this.field8643 * this.field8643 >> 12;
            this.field8643 = this.field8643 * this.field8630 >> 12;
            this.field8634 += this.field8643 * this.field8641 >> 12;
            this.field8641 = this.field8641 * this.field8639 >> 12;
        }
        if (arg0 != 1) {
            this.field8634 = 109;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Ldw;I)Lam;", line = 110)
    public static final class56 method3597(int arg0, String arg1, class664 arg2, int arg3) {
        field8629++;
        if (arg3 <= 73) {
            field8627 = false;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class598.field8108, 0);
        if (class598.field8108[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class56(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 135)
    public final void method3137(byte arg0) {
        field8636++;
        this.field8634 >>= 0x4;
        this.field8641 = this.field8639;
        if (this.field8634 < 0) {
            this.field8634 = 0;
        } else if (this.field8634 > 255) {
            this.field8634 = 255;
        }
        int var2 = 27 % ((57 - arg0) / 54);
        this.method952((byte) 90, (byte) this.field8634, this.field8628++);
        this.field8634 = 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BBI)V", line = 155)
    public void method952(byte arg0, byte arg1, int arg2) {
        if (arg0 >= 76) {
            field8625++;
            this.field8631[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 168)
    public final void method3135(boolean arg0) {
        if (!arg0) {
            this.field8628 = -15;
        }
        this.field8634 = 0;
        this.field8628 = 0;
        field8638++;
    }
}
