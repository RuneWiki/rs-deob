import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class class8 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field80;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public abstract void method44(int arg0);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
    public abstract boolean method45(byte arg0);

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z")
    public abstract boolean method46(int arg0);

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static void method47(int arg0) {
        field80 = null;
        if (arg0 <= 17) {
            field80 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILht;Ljava/lang/String;I)Lmc;")
    public static final class87 method48(int arg0, class410 arg1, String arg2, int arg3) {
        field79++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, arg3, arg2);
        OpenGL.glGetIntegerv(34379, class214.field3044, 0);
        if (class214.field3044[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class87(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        if (arg0 >= -62) {
            method50(null, 61);
        }
        field81++;
        return this.method52(0) || this.method45((byte) -49) || this.method46(0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lem;I)V")
    public static final void method50(class149 arg0, int arg1) {
        int var2 = 10 / ((arg1 + 61) / 34);
        field82++;
        if (!class9.field86) {
            arg0.method2946(-99);
            class370.field5198--;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)Llq;")
    public abstract class386 method51(byte arg0);

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z")
    public abstract boolean method52(int arg0);

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
    public abstract void method53(int arg0);

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)I")
    public abstract int method54(int arg0);

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)I")
    public abstract int method55(byte arg0);
}
