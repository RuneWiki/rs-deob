import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class657 implements class317 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
    private boolean field9207 = false;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "Z")
    private boolean field9222;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public int field9208;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    private int field9220;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lok;")
    public class228 field9210;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public int field9226;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public int field9223;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
    public static volatile boolean field9209 = true;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "[I")
    public static int[] field9216 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "Lut;")
    public static class109 field9221 = new class109();

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "Lmf;")
    public static class382 field9227 = new class382(8);

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field9228 = 1339;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Z")
    public static boolean field9211;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    private final void method3614(byte arg0) {
        if (arg0 != 3) {
            this.method3615(31);
        }
        this.field9210.method1505(-2, this);
        field9215++;
        if (this.field9207) {
            OpenGL.glTexParameteri(this.field9226, 10241, this.field9222 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9226, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9226, 10241, this.field9222 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9226, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I")
    public final int method3615(int arg0) {
        field9212++;
        if (arg0 != -10615) {
            this.method3622(false, -1);
        }
        return this.field9223;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public final void method3616(int arg0) {
        if (this.field9223 > 0) {
            this.field9210.method1506(arg0 - 34803, this.method3620(false), this.field9223);
            this.field9223 = 0;
        }
        if (arg0 != 2867) {
            field9228 = -9;
        }
        field9217++;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BZ)V")
    public final void method3617(byte arg0, boolean arg1) {
        if (arg0 != 41) {
            return;
        }
        field9224++;
        if (this.field9207 != arg1) {
            this.field9207 = arg1;
            this.method3614((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    private final void method3618(int arg0, int arg1) {
        if (arg0 < 102) {
            method3619((byte) -64);
        }
        field9213++;
        this.field9210.field3420 -= arg1;
        this.field9210.field3420 += this.method3620(false);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
    public static void method3619(byte arg0) {
        field9216 = null;
        field9221 = null;
        field9227 = null;
        if (arg0 != 75) {
            field9209 = true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9218++;
        this.method3616(2867);
        super.finalize();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)I")
    private final int method3620(boolean arg0) {
        field9225++;
        if (arg0) {
            return -48;
        } else {
            int var2 = this.field9210.method1514(this.field9208, -15) * this.field9220;
            return this.field9222 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z")
    public final boolean method3621(int arg0) {
        if (arg0 != 1) {
            this.method3621(22);
        }
        field9219++;
        if (!this.field9210.field3515) {
            return false;
        }
        int var2 = this.method3620(false);
        this.field9210.method1505(-2, this);
        OpenGL.glGenerateMipmapEXT(this.field9226);
        this.field9222 = true;
        this.method3614((byte) 3);
        this.method3618(121, var2);
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
    public final void method3622(boolean arg0, int arg1) {
        field9214++;
        if (arg1 != 9728) {
            field9227 = null;
        }
        if (this.field9222 != arg0) {
            int var3 = this.method3620(false);
            this.field9222 = true;
            this.method3614((byte) 3);
            this.method3618(arg1 - 9603, var3);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lok;IIIZ)V")
    public class657(class228 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9222 = arg4;
        this.field9208 = arg2;
        this.field9220 = arg3;
        this.field9210 = arg0;
        this.field9226 = arg1;
        OpenGL.glGenTextures(1, class382.field5404, 0);
        this.field9223 = class382.field5404[0];
        this.method3618(123, 0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public abstract void method226(int arg0);
}
