import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class265 extends class49 implements class720 {

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    private int field3857 = -1;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    private int field3865 = -1;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Lpq;")
    private class194 field3854;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[F")
    public static float[] field3855 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "D")
    public static double field3864;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "F")
    public static float field3861;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1735(-93);
        field3853++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
    public static void method1734(int arg0) {
        field3855 = null;
        if (arg0 != 36161) {
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V")
    public final void method1735(int arg0) {
        field3852++;
        if (arg0 <= -29 && this.field3860 > 0) {
            this.field3854.method1213((byte) 41, this.field3862, this.field3860);
            this.field3860 = 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)V")
    public final void method1736(int arg0, byte arg1, int arg2) {
        field3851++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field3860);
        if (arg1 <= 99) {
            this.method1737(100);
        }
        this.field3865 = arg0;
        this.field3857 = arg2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method1737(int arg0) {
        field3859++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3865, this.field3857, 36161, arg0);
        this.field3857 = -1;
        this.field3865 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lpq;III)V")
    public class265(class194 arg0, int arg1, int arg2, int arg3) {
        this.field3854 = arg0;
        this.field3858 = arg3;
        this.field3856 = arg2;
        this.field3863 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class173.field2190, 0);
        this.field3860 = class173.field2190[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3860);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3863, this.field3856, this.field3858);
        this.field3862 = this.field3858 * this.field3856 * this.field3854.method1257((byte) -71, this.field3863);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lpq;IIII)V")
    public class265(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3854 = arg0;
        this.field3856 = arg2;
        this.field3863 = arg1;
        this.field3858 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class173.field2190, 0);
        this.field3860 = class173.field2190[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3860);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3863, this.field3856, this.field3858);
        this.field3862 = this.field3858 * this.field3856 * this.field3854.method1257((byte) -111, this.field3863);
    }
}
