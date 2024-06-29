import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class565 extends class28 implements class241 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    private int field7370 = -1;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    private int field7382 = -1;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public int field7380;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "Lji;")
    private class622 field7383;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    private int field7373;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public int field7374;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    private int field7377;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Lffa;")
    public static class562 field7385 = new class562();

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field7386 = 4;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "[I")
    public static int[] field7387 = new int[200];

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 6)
    public final void method1502(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field7382, this.field7370, 36161, 0);
        field7378++;
        this.field7382 = -1;
        this.field7370 = -1;
        if (arg0 < 33) {
            this.field7377 = -9;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 19)
    public static void method3018(int arg0) {
        if (arg0 != 24071) {
            field7387 = null;
        }
        field7387 = null;
        field7385 = null;
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V", line = 31)
    public final void method3019(int arg0) {
        field7372++;
        if (this.field7377 > 0) {
            this.field7383.method3429(this.field7377, false, this.field7375);
            this.field7377 = 0;
        }
        if (arg0 != -14494) {
            field7387 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILjava/io/File;)[B", line = 48)
    public static final byte[] method3020(byte arg0, int arg1, File arg2) {
        if (arg0 != 70) {
            field7387 = null;
        }
        field7376++;
        try {
            byte[] var3 = new byte[arg1];
            class363.method2079(var3, arg0 + 54, arg2, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V", line = 72)
    public final void method3021(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field7377);
        field7371++;
        this.field7370 = arg0;
        this.field7382 = arg2;
        if (arg1 != 6810) {
            field7385 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lji;III)V", line = 133)
    public class565(class622 arg0, int arg1, int arg2, int arg3) {
        this.field7380 = arg3;
        this.field7383 = arg0;
        this.field7373 = arg1;
        this.field7374 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class1.field1, 0);
        this.field7377 = class1.field1[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7377);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7373, this.field7374, this.field7380);
        this.field7375 = this.field7374 * this.field7380 * this.field7383.method3401(this.field7373, 6);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lji;IIII)V", line = 150)
    public class565(class622 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7380 = arg3;
        this.field7373 = arg1;
        this.field7374 = arg2;
        this.field7383 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class1.field1, 0);
        this.field7377 = class1.field1[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7377);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7373, this.field7374, this.field7380);
        this.field7375 = this.field7380 * this.field7374 * this.field7383.method3401(this.field7373, 6);
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V", line = 90)
    public static final void method3022(int arg0) {
        if (arg0 != 1) {
            field7387 = null;
        }
        field7381++;
        if (class91.field1204 == null) {
            return;
        }
        if (class91.field1204.field7108 == 1) {
            class91.field1204 = null;
            return;
        }
        if (class91.field1204.field7108 == 2) {
            class472.method2614(2, class361.field4671, class567.field7404, arg0 ^ 0x7B68);
            class91.field1204 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V", line = 120)
    protected final void finalize() throws Throwable {
        field7384++;
        this.method3019(-14494);
        super.finalize();
    }
}
