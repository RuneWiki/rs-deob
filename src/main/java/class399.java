import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class399 extends class454 implements class200 {

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    private int field5497 = -1;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    private int field5500 = -1;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    private int field5501;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Llea;")
    private class573 field5507;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public int field5506;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    private int field5505;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    private int field5493;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field5494 = 328;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lgga;")
    public static class513 field5495;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "[I")
    public static int[] field5504;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILgga;ILjava/awt/Canvas;ILd;)Lha;")
    public static final class475 method2369(int arg0, class513 arg1, int arg2, Canvas arg3, int arg4, class103 arg5) {
        field5492++;
        int var6 = 0;
        int var7 = 0;
        int var8 = 97 / ((arg0 + 45) / 53);
        if (arg3 != null) {
            Dimension var9 = arg3.getSize();
            var6 = var9.width;
            var7 = var9.height;
        }
        return class475.method2776(arg4, var7, (byte) -105, arg2, arg3, arg5, arg1, var6);
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5502++;
        this.method2371(11600);
        super.finalize();
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
    public static void method2370(int arg0) {
        field5495 = null;
        field5504 = null;
        int var1 = 30 / ((arg0 + 61) / 34);
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
    public final void method2371(int arg0) {
        if (arg0 != 11600) {
            this.field5503 = 79;
        }
        if (this.field5505 > 0) {
            this.field5507.method3362(this.field5505, arg0 - 11479, this.field5493);
            this.field5505 = 0;
        }
        field5498++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public final void method1359(int arg0) {
        if (arg0 != 3314) {
            this.field5506 = 43;
        }
        field5496++;
        OpenGL.glFramebufferRenderbufferEXT(this.field5497, this.field5500, 36161, 0);
        this.field5497 = -1;
        this.field5500 = -1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)V")
    public final void method2372(byte arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field5505);
        field5499++;
        if (arg0 <= 64) {
            method2369(118, null, -17, null, -73, null);
        }
        this.field5500 = arg2;
        this.field5497 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Llea;III)V")
    public class399(class573 arg0, int arg1, int arg2, int arg3) {
        this.field5501 = arg1;
        this.field5503 = arg3;
        this.field5507 = arg0;
        this.field5506 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class382.field5355, 0);
        this.field5505 = class382.field5355[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5505);
        OpenGL.glRenderbufferStorageEXT(36161, this.field5501, this.field5506, this.field5503);
        this.field5493 = this.field5506 * this.field5503 * this.field5507.method3315(this.field5501, 30626);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Llea;IIII)V")
    public class399(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5507 = arg0;
        this.field5506 = arg2;
        this.field5501 = arg1;
        this.field5503 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class382.field5355, 0);
        this.field5505 = class382.field5355[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5505);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5501, this.field5506, this.field5503);
        this.field5493 = this.field5506 * this.field5503 * this.field5507.method3315(this.field5501, 30626);
    }
}
