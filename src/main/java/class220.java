import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class220 extends Canvas {

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2685;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Lrga;")
    public static class280 field2689 = new class280(34, 3);

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "Lrga;")
    public static class280 field2690 = new class280(47, 3);

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "Lwp;")
    public static class453 field2691 = new class453(80, 0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Lr;")
    public static class566 field2692;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([Laf;Lqj;I)Llaa;")
    public static final class633 method1300(class165[] arg0, class548 arg1, int arg2) {
        field2684++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field2175 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field2175);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class603.field8493, 0);
        if (class603.field8493[0] == arg2) {
            if (class603.field8493[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class603.field8493, 1);
            if (class603.field8493[1] > 1) {
                byte[] var7 = new byte[class603.field8493[1]];
                OpenGL.glGetInfoLogARB(var4, class603.field8493[1], class603.field8493, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class603.field8493[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field2175);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class633(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class220(Component arg0) {
        this.field2685 = arg0;
    }

    @OriginalMember(owner = "client!kea", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2685.update(arg0);
        field2687++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZBIII)V")
    public static final void method1301(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        class86.field1210 = 0L;
        field2686++;
        int var5 = class193.method1167(arg1 ^ 0x13);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class32.field452.method1076()) {
            arg0 = true;
        }
        class1.method5(var5, arg3, arg0, -101, arg2, arg4);
        if (arg1 != 126) {
            field2692 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2685.paint(arg0);
        field2688++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public static void method1302(int arg0) {
        if (arg0 == 0) {
            field2690 = null;
            field2692 = null;
            field2691 = null;
            field2689 = null;
        }
    }
}
