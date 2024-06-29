import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class491 extends class356 implements class640 {

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    private int field7124 = -1;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    private int field7131 = -1;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private int field7121;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public int field7126;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field7128;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lap;")
    private class435 field7116;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    private int field7122;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    private int field7123;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field7118 = 0;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field7120 = 0;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field7117 = 0;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field7115 = 0;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "F")
    public static float field7132;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Loca;")
    public static class239 field7127;

    @OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field7119++;
        this.method2837(-126);
        super.finalize();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 15)
    public final void method260(byte arg0) {
        field7133++;
        OpenGL.glFramebufferRenderbufferEXT(this.field7131, this.field7124, 36161, 0);
        this.field7131 = -1;
        this.field7124 = -1;
        int var2 = -127 / (-arg0 / 38);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V", line = 39)
    public final void method2834(int arg0, int arg1, int arg2) {
        if (arg1 <= 107) {
            method2835(-30);
        }
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field7122);
        field7130++;
        this.field7124 = arg2;
        this.field7131 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 55)
    public static void method2835(int arg0) {
        field7127 = null;
        if (arg0 != 0) {
            field7117 = 70;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZI)I", line = 71)
    public static final int method2836(int arg0, int arg1, boolean arg2, int arg3) {
        field7129++;
        class472 var4 = class236.method1367(arg0, true, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field6587.length; var6++) {
                if (var4.field6581[var6] == arg1) {
                    var5 += var4.field6587[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lap;III)V", line = 138)
    public class491(class435 arg0, int arg1, int arg2, int arg3) {
        this.field7121 = arg1;
        this.field7126 = arg3;
        this.field7128 = arg2;
        this.field7116 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class658.field9388, 0);
        this.field7122 = class658.field9388[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7122);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7121, this.field7128, this.field7126);
        this.field7123 = this.field7126 * this.field7128 * this.field7116.method2340(this.field7121, false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lap;IIII)V", line = 154)
    public class491(class435 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7116 = arg0;
        this.field7126 = arg3;
        this.field7121 = arg1;
        this.field7128 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class658.field9388, 0);
        this.field7122 = class658.field9388[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7122);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7121, this.field7128, this.field7126);
        this.field7123 = this.field7126 * this.field7128 * this.field7116.method2340(this.field7121, false);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 110)
    public final void method2837(int arg0) {
        if (this.field7122 > 0) {
            this.field7116.method2352(this.field7122, this.field7123, 65280);
            this.field7122 = 0;
        }
        if (arg0 < -32) {
            field7125++;
        }
    }
}
