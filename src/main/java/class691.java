import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class691 implements class768 {

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    private int field9402 = 0;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
    private int field9418 = -1;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "Lnv;")
    public class439 field9410;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    private int field9415;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Z")
    private boolean field9411;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field9421 = 0;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "Ldj;")
    public static class362 field9420 = new class362(32);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    private int field9414;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "Lbt;")
    public static class48 field9407;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "Ltl;")
    public static class647 field9417;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9408;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljaggl/MapBuffer;ZI)Ljaclib/memory/Buffer;", line = 8)
    public final Buffer method3857(MapBuffer arg0, boolean arg1, int arg2) {
        field9400++;
        if (this.field9402 == 0) {
            this.method3860(0);
            if (this.field9418 <= 0) {
                this.field9402 = 2;
                return this.field9408;
            }
            OpenGL.glBindBufferARB(this.field9415, this.field9418);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field9415, this.field9414, null, 0, this.field9411 ? 35040 : 35044);
                if (this.field9406 <= this.field9410.field6069.field9883) {
                    this.field9402 = 1;
                    return this.field9410.field6069;
                }
            }
            if (!arg0.method3693() && arg0.method3692(this.field9415, this.field9406, 35001)) {
                this.field9402 = 2;
                return arg0;
            }
        }
        int var4 = 24 % ((-arg2 - 19) / 61);
        return null;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V", line = 54)
    public final void method3858(int arg0) {
        if (this.field9410.field5890) {
            OpenGL.glBindBufferARB(this.field9415, this.field9418);
        }
        field9422++;
        if (arg0 != 35040) {
            this.method3861(-1, 116, null);
        }
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V", line = 69)
    public static void method3859(int arg0) {
        if (arg0 != 2) {
            method3859(44);
        }
        field9407 = null;
        field9420 = null;
        field9417 = null;
    }

    @OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V", line = 83)
    protected final void finalize() throws Throwable {
        field9412++;
        this.method274((byte) -89);
        super.finalize();
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V", line = 93)
    private final void method3860(int arg0) {
        field9409++;
        if (arg0 <= this.field9418) {
            return;
        }
        if (this.field9410.field5890) {
            OpenGL.glGenBuffersARB(1, class571.field7830, 0);
            this.field9418 = class571.field7830[0];
            OpenGL.glBindBufferARB(this.field9415, this.field9418);
        } else {
            this.field9418 = 0;
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)V", line = 119)
    public void method274(byte arg0) {
        int var2 = 27 / ((arg0 + 40) / 36);
        field9413++;
        if (this.field9418 > 0) {
            this.field9410.method2596((byte) 62, this.field9406, this.field9418);
            this.field9418 = -1;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILjaclib/memory/Source;)Z", line = 136)
    public final boolean method3861(int arg0, int arg1, Source arg2) {
        field9416++;
        if (arg0 != 14926) {
            field9417 = null;
        }
        if (arg1 > this.field9414) {
            this.method3860(0);
            if (this.field9418 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field9415, this.field9418);
            OpenGL.glBufferDataARBa(this.field9415, arg1, arg2.getAddress(), this.field9411 ? 35040 : 35044);
            this.field9410.field6217 += arg1 - this.field9406;
            this.field9414 = arg1;
        } else if (this.field9418 > 0) {
            OpenGL.glBindBufferARB(this.field9415, this.field9418);
            OpenGL.glBufferSubDataARBa(this.field9415, 0, this.field9406, arg2.getAddress());
            this.field9410.field6217 += arg1 - this.field9406;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field9406 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lnv;IZ)V", line = 275)
    public class691(class439 arg0, int arg1, boolean arg2) {
        this.field9410 = arg0;
        this.field9415 = arg1;
        this.field9411 = arg2;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V", line = 182)
    public void method2529(int arg0, int arg1) {
        if (arg0 < 79) {
            this.field9410 = null;
        }
        field9404++;
        if (arg1 > this.field9414) {
            this.method3860(0);
            if (this.field9418 <= 0) {
                this.field9408 = this.field9410.method2665(arg1, false, (byte) -46);
            } else {
                OpenGL.glBindBufferARB(this.field9415, this.field9418);
                OpenGL.glBufferDataARBub(this.field9415, arg1, null, 0, this.field9411 ? 35040 : 35044);
                this.field9410.field6217 += arg1 - this.field9414;
            }
            this.field9414 = arg1;
        }
        this.field9406 = arg1;
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)J", line = 213)
    public final long method3862(int arg0) {
        if (arg0 >= -32) {
            return 56L;
        } else {
            field9405++;
            return this.field9418 == 0 ? this.field9408.getAddress() : 0L;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z", line = 224)
    public final boolean method3863(byte arg0, MapBuffer arg1) {
        field9403++;
        if (arg0 > -2) {
            this.field9415 = 11;
        }
        boolean var3 = true;
        if (this.field9402 != 0) {
            if (this.field9418 > 0) {
                OpenGL.glBindBufferARB(this.field9415, this.field9418);
                if (this.field9402 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field9415, 0, this.field9414, this.field9410.field6069.getAddress());
                } else {
                    var3 = arg1.method3694();
                }
            }
            this.field9402 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)I", line = 260)
    public int method276(byte arg0) {
        field9419++;
        int var2 = -105 % ((arg0 - 87) / 35);
        return this.field9406;
    }
}
