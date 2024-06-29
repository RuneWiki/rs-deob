import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class class365 implements class215 {

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    private int field5277 = 0;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    private int field5279 = -1;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Lno;")
    public class704 field5262;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Z")
    private boolean field5261;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Llp;")
    public static class393 field5275 = new class393(16);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    private int field5270;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5265;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5271;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "[[Lsca;")
    public static class46[][] field5282;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZBLjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 7)
    public final Buffer method2257(boolean arg0, byte arg1, MapBuffer arg2) {
        field5267++;
        if (arg1 != -54) {
            return null;
        }
        if (this.field5277 == 0) {
            this.method2261((byte) 127);
            if (this.field5279 <= 0) {
                this.field5277 = 2;
                return this.field5265;
            }
            OpenGL.glBindBufferARB(this.field5278, this.field5279);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field5278, this.field5270, null, 0, this.field5261 ? 35040 : 35044);
                if (this.field5280 <= this.field5262.field5517.field9390) {
                    this.field5277 = 1;
                    return this.field5262.field5517;
                }
            }
            if (!arg2.method3625() && arg2.method3627(this.field5278, this.field5280, 35001)) {
                this.field5277 = 2;
                return arg2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 53)
    public final boolean method2258(int arg0, Source arg1, int arg2) {
        field5266++;
        int var4 = 75 / ((arg2 + 46) / 45);
        if (this.field5270 >= arg0) {
            if (this.field5279 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5278, this.field5279);
            OpenGL.glBufferSubDataARBa(this.field5278, 0, this.field5280, arg1.getAddress());
            this.field5262.field5538 += arg0 - this.field5280;
        } else {
            this.method2261((byte) 70);
            if (this.field5279 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5278, this.field5279);
            OpenGL.glBufferDataARBa(this.field5278, arg0, arg1.getAddress(), this.field5261 ? 35040 : 35044);
            this.field5262.field5538 += arg0 - this.field5280;
            this.field5270 = arg0;
        }
        this.field5280 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V", line = 95)
    public void method1284(boolean arg0) {
        if (this.field5279 > 0) {
            this.field5262.method4003(this.field5279, this.field5280, 5888);
            this.field5279 = -1;
        }
        if (arg0) {
            field5269++;
        }
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)J", line = 115)
    public final long method2259(int arg0) {
        field5272++;
        if (arg0 != 0) {
            this.field5261 = false;
        }
        return this.field5279 == 0 ? this.field5265.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V", line = 126)
    public final void method2260(int arg0) {
        field5264++;
        int var2 = 0 % ((-arg0 - 40) / 63);
        if (this.field5262.field9916) {
            OpenGL.glBindBufferARB(this.field5278, this.field5279);
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V", line = 139)
    private final void method2261(byte arg0) {
        field5281++;
        if (this.field5279 >= 0) {
            return;
        }
        if (arg0 < 39) {
            this.method2263(null, false);
        }
        if (this.field5262.field9916) {
            OpenGL.glGenBuffersARB(1, class596.field8447, 0);
            this.field5279 = class596.field8447[0];
            OpenGL.glBindBufferARB(this.field5278, this.field5279);
        } else {
            this.field5279 = 0;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)V", line = 165)
    public static void method2262(boolean arg0) {
        if (arg0) {
            field5282 = null;
            field5275 = null;
            field5271 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "finalize", descriptor = "()V", line = 180)
    protected final void finalize() throws Throwable {
        this.method1284(true);
        field5276++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I", line = 190)
    public int method1292(int arg0) {
        field5274++;
        if (arg0 != 128) {
            this.method1292(-94);
        }
        return this.field5280;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lno;IZ)V", line = 242)
    public class365(class704 arg0, int arg1, boolean arg2) {
        this.field5262 = arg0;
        this.field5261 = arg2;
        this.field5278 = arg1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljaggl/MapBuffer;Z)Z", line = 210)
    public final boolean method2263(MapBuffer arg0, boolean arg1) {
        field5273++;
        boolean var3 = arg1;
        if (this.field5277 != 0) {
            if (this.field5279 > 0) {
                OpenGL.glBindBufferARB(this.field5278, this.field5279);
                if (this.field5277 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5278, 0, this.field5270, this.field5262.field5517.getAddress());
                } else {
                    var3 = arg0.method3626();
                }
            }
            this.field5277 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V", line = 253)
    public void method1458(byte arg0, int arg1) {
        if (this.field5270 < arg1) {
            this.method2261((byte) 99);
            if (this.field5279 > 0) {
                OpenGL.glBindBufferARB(this.field5278, this.field5279);
                OpenGL.glBufferDataARBub(this.field5278, arg1, null, 0, this.field5261 ? 35040 : 35044);
                this.field5262.field5538 += arg1 - this.field5270;
            } else {
                this.field5265 = this.field5262.method2342(arg1, 4194, false);
            }
            this.field5270 = arg1;
        }
        field5268++;
        this.field5280 = arg1;
        if (arg0 != 91) {
            field5275 = null;
        }
    }
}
