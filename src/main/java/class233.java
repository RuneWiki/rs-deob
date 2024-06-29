import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class233 {

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lht;")
    public class410 field3227;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
    private boolean field3219;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Luf;")
    public static class310 field3225 = new class310(2, 8);

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3232 = 2;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lwo;")
    public static class522 field3230 = new class522();

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lff;")
    public static class9 field3234 = new class9(64);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "F")
    public static float field3233;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "[Lf;")
    public static class529[] field3228;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1357(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3225 = null;
        }
        field3224++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BI)V", line = 15)
    public final void method1358(int arg0, byte[] arg1, int arg2) {
        if (arg0 != -4) {
            method1361(84);
        }
        field3221++;
        this.method1360(-4335);
        if (this.field3222 >= arg2) {
            OpenGL.glBufferSubDataARB(this.field3220, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field3220, arg2, arg1, 0, this.field3219 ? 35040 : 35044);
            this.field3227.field5876 += arg2 - this.field3222;
            this.field3222 = arg2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)I", line = 39)
    public static final int method1359(byte arg0, int arg1) {
        field3229++;
        if (arg0 != -45) {
            field3232 = 97;
        }
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V", line = 92)
    protected final void finalize() throws Throwable {
        field3218++;
        this.field3227.method2384(this.field3223, true, this.field3222);
        super.finalize();
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 110)
    public static void method1361(int arg0) {
        field3225 = null;
        if (arg0 <= -64) {
            field3234 = null;
            field3228 = null;
            field3230 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lht;I[BIZ)V", line = 125)
    public class233(class410 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3227 = arg0;
        this.field3219 = arg4;
        this.field3220 = arg1;
        this.field3222 = arg3;
        OpenGL.glGenBuffersARB(1, class158.field2262, 0);
        this.field3223 = class158.field2262[0];
        this.method1360(-4335);
        OpenGL.glBufferDataARBub(arg1, this.field3222, arg2, 0, this.field3219 ? 35040 : 35044);
        this.field3227.field5876 += this.field3222;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lht;ILjaggl/memory/NativeBuffer;IZ)V", line = 144)
    public class233(class410 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field3222 = arg3;
        this.field3227 = arg0;
        this.field3220 = arg1;
        this.field3219 = arg4;
        OpenGL.glGenBuffersARB(1, class158.field2262, 0);
        this.field3223 = class158.field2262[0];
        this.method1360(-4335);
        OpenGL.glBufferDataARBa(arg1, this.field3222, arg2.method2619(), this.field3219 ? 35040 : 35044);
        this.field3227.field5876 += this.field3222;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILvh;)V", line = 165)
    public static final void method1362(int arg0, class240 arg1) {
        field3226++;
        class289.field3888 = arg1;
        int var2 = -81 % ((24 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public abstract void method1360(int arg0);
}
