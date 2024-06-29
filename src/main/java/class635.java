import jaggl.OpenGL;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class635 extends class36 implements class350 {

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    private int field9127 = -1;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    private int field9123 = -1;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public int field9134;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field9119;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Lad;")
    private class362 field9131;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    private int field9122;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    private int field9120;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    private int field9137;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Lea;")
    public static class474 field9126 = new class474("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Lqu;")
    public static class82 field9129 = new class82();

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "S")
    public static short field9133 = 320;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Ljava/applet/Applet;")
    public static Applet field9135;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "[I")
    public static int[] field9136;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpt;IIII)V")
    public static final void method3621(class460 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class430.method2677(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class588.field8441) {
            class430.method2677(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class430.method2677(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class91.field1047) {
            class430.method2677(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class91.field1047) {
            class430.method2677(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class588.field8441 && arg4 <= class91.field1047) {
            class430.method2677(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class430.method2677(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class588.field8441 && arg4 > 0) {
            class430.method2677(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method3622(byte arg0) {
        field9125++;
        class191.field2507 = null;
        class600.field8763 = -1;
        if (arg0 > -4) {
            method3625(9, -93, -76, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method592(int arg0) {
        field9130++;
        OpenGL.glFramebufferRenderbufferEXT(this.field9123, this.field9127, 36161, arg0);
        this.field9123 = -1;
        this.field9127 = -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V")
    public final void method3623(int arg0, byte arg1, int arg2) {
        field9132++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field9120);
        int var4 = 13 / ((arg1 + 87) / 34);
        this.field9127 = arg2;
        this.field9123 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3626((byte) -114);
        field9128++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public static void method3624(int arg0) {
        if (arg0 == 0) {
            field9129 = null;
            field9126 = null;
            field9136 = null;
            field9135 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIB)V")
    public static final void method3625(int arg0, int arg1, int arg2, byte arg3) {
        field9121++;
        class467 var4 = class541.method3144(arg0, (byte) -108, 11);
        var4.method2851(true);
        if (arg3 >= 0) {
            field9135 = null;
        }
        var4.field6926 = arg1;
        var4.field6930 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public final void method3626(byte arg0) {
        field9124++;
        if (arg0 != -114) {
            this.field9122 = 29;
        }
        if (this.field9120 > 0) {
            this.field9131.method2325(32, this.field9137, this.field9120);
            this.field9120 = 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lad;III)V")
    public class635(class362 arg0, int arg1, int arg2, int arg3) {
        this.field9134 = arg2;
        this.field9119 = arg3;
        this.field9131 = arg0;
        this.field9122 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class239.field3402, 0);
        this.field9120 = class239.field3402[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9120);
        OpenGL.glRenderbufferStorageEXT(36161, this.field9122, this.field9134, this.field9119);
        this.field9137 = this.field9119 * this.field9134 * this.field9131.method2283(3, this.field9122);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lad;IIII)V")
    public class635(class362 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9131 = arg0;
        this.field9122 = arg1;
        this.field9119 = arg3;
        this.field9134 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class239.field3402, 0);
        this.field9120 = class239.field3402[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9120);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field9122, this.field9134, this.field9119);
        this.field9137 = this.field9119 * this.field9134 * this.field9131.method2283(3, this.field9122);
    }
}
