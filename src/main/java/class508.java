import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class508 extends class617 implements class657 {

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    private int field7297 = -1;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    private int field7295 = -1;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public int field7287;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field7294;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Lvj;")
    private class422 field7293;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    private int field7301;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public int field7290;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lcq;")
    public static class110 field7288 = new class110(108, 28);

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "F")
    public static float field7300 = 0.0F;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "[B")
    public static byte[] field7302 = new byte[520];

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "Lau;")
    public static class519 field7303;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 8)
    public final void method459(int arg0) {
        field7292++;
        OpenGL.glFramebufferRenderbufferEXT(this.field7295, this.field7297, 36161, 0);
        if (arg0 == Integer.MIN_VALUE) {
            this.field7295 = -1;
            this.field7297 = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 22)
    public final void method2903(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, arg1, this.field7301);
        field7291++;
        this.field7295 = arg0;
        this.field7297 = arg2;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z", line = 39)
    public static final boolean method2904(int arg0, int arg1, int arg2) {
        field7304++;
        if (arg2 != 0) {
            field7303 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        field7299++;
        this.method2905((byte) 68);
        super.finalize();
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 61)
    public final void method2905(byte arg0) {
        int var2 = 74 / ((12 - arg0) / 50);
        field7298++;
        if (this.field7301 > 0) {
            this.field7293.method2388(this.field7290, this.field7301, -120);
            this.field7301 = 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 78)
    public static void method2906(boolean arg0) {
        field7288 = null;
        if (arg0) {
            field7288 = null;
        }
        field7302 = null;
        field7303 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLsp;)V", line = 92)
    public static final void method2907(boolean arg0, class677 arg1) {
        if (arg1 instanceof class600) {
            class600 var2 = (class600) arg1;
            if (var2.field8461 != null) {
                class80.method429(class362.field4859.field5166 != var2.field5166, var2, (byte) 125);
            }
        } else if (arg1 instanceof class236) {
            class236 var3 = (class236) arg1;
            class600.method3364((byte) 30, var3, class362.field4859.field5166 != var3.field5166);
        }
        field7296++;
        if (!arg0) {
            method2906(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lvj;III)V", line = 135)
    public class508(class422 arg0, int arg1, int arg2, int arg3) {
        this.field7287 = arg2;
        this.field7294 = arg1;
        this.field7289 = arg3;
        this.field7293 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class107.field1159, 0);
        this.field7301 = class107.field1159[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7301);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7294, this.field7287, this.field7289);
        this.field7290 = this.field7289 * this.field7287 * this.field7293.method2417(this.field7294, 3553);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lvj;IIII)V", line = 150)
    public class508(class422 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7293 = arg0;
        this.field7289 = arg3;
        this.field7294 = arg1;
        this.field7287 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class107.field1159, 0);
        this.field7301 = class107.field1159[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7301);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7294, this.field7287, this.field7289);
        this.field7290 = this.field7287 * this.field7289 * this.field7293.method2417(this.field7294, 3553);
    }
}
