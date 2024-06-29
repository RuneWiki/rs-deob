import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class322 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
    private boolean field4921;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    private int field4923;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lvj;")
    public class303 field4917;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Liv;")
    public static class64 field4919;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lpi;")
    public static class342 field4922;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[[B")
    public static byte[][] field4920;

    static {
        new class342("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field4919 = new class64(51, -2);
        field4922 = new class342("glow3:", "leuchten3:", "brillant3:", "brilho3:");
    }

    @OriginalMember(owner = "client!bg", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field4917.method1913(this.field4923, this.field4914, 2);
        field4915++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V", line = 23)
    public static void method2096(byte arg0) {
        if (arg0 != -44) {
            field4920 = null;
        }
        field4922 = null;
        field4920 = null;
        field4919 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BII)V", line = 45)
    public final void method2097(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 35040) {
            field4920 = null;
        }
        field4916++;
        this.method1282(false);
        if (arg1 <= this.field4923) {
            OpenGL.glBufferSubDataARB(this.field4918, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field4918, arg1, arg0, 0, this.field4921 ? 35040 : 35044);
            this.field4917.field4507 += arg1 - this.field4923;
            this.field4923 = arg1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lvj;I[BIZ)V", line = 78)
    public class322(class303 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4921 = arg4;
        this.field4923 = arg3;
        this.field4918 = arg1;
        this.field4917 = arg0;
        OpenGL.glGenBuffersARB(1, class93.field1581, 0);
        this.field4914 = class93.field1581[0];
        this.method1282(false);
        OpenGL.glBufferDataARBub(arg1, this.field4923, arg2, 0, this.field4921 ? 35040 : 35044);
        this.field4917.field4507 += this.field4923;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lvj;ILjaggl/memory/NativeBuffer;IZ)V", line = 97)
    public class322(class303 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field4917 = arg0;
        this.field4921 = arg4;
        this.field4918 = arg1;
        this.field4923 = arg3;
        OpenGL.glGenBuffersARB(1, class93.field1581, 0);
        this.field4914 = class93.field1581[0];
        this.method1282(false);
        OpenGL.glBufferDataARBa(arg1, this.field4923, arg2.method2628(), this.field4921 ? 35040 : 35044);
        this.field4917.field4507 += this.field4923;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public abstract void method1282(boolean arg0);
}
