import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class class644 implements class435 {

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    private int field8934 = 0;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    private int field8940 = -1;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    private int field8944;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lpa;")
    public class391 field8946;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Z")
    private boolean field8941;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8935 = 0;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "[J")
    public static long[] field8937 = new long[256];

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    private int field8931;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    private int field8948;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "Lda;")
    public static class66 field8947;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8942;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "Ljava/lang/Thread;")
    public static Thread field8950;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)V")
    public final void method3573(int arg0) {
        field8932++;
        if (this.field8946.field5789) {
            OpenGL.glBindBufferARB(this.field8944, this.field8940);
        }
        if (arg0 < 38) {
            this.method3578(false, null);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)V")
    private final void method3574(int arg0) {
        field8933++;
        if (arg0 != -16351) {
            this.method3579(117);
        }
        if (this.field8940 >= 0) {
            return;
        }
        if (this.field8946.field5789) {
            OpenGL.glGenBuffersARB(1, class87.field1214, 0);
            this.field8940 = class87.field1214[0];
            OpenGL.glBindBufferARB(this.field8944, this.field8940);
        } else {
            this.field8940 = 0;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)I")
    public int method2631(byte arg0) {
        if (arg0 < 81) {
            this.field8940 = 116;
        }
        field8952++;
        return this.field8931;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public void method2614(int arg0) {
        if (this.field8940 > 0) {
            this.field8946.method2478(this.field8940, arg0 + 11272, this.field8931);
            this.field8940 = -1;
        }
        if (arg0 == 487) {
            field8938++;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILjaclib/memory/Source;Z)Z")
    public final boolean method3575(int arg0, Source arg1, boolean arg2) {
        field8951++;
        if (arg2) {
            this.field8948 = 22;
        }
        if (arg0 <= this.field8948) {
            if (this.field8940 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8944, this.field8940);
            OpenGL.glBufferSubDataARBa(this.field8944, 0, this.field8931, arg1.getAddress());
            this.field8946.field8632 += arg0 - this.field8931;
        } else {
            this.method3574(-16351);
            if (this.field8940 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8944, this.field8940);
            OpenGL.glBufferDataARBa(this.field8944, arg0, arg1.getAddress(), this.field8941 ? 35040 : 35044);
            this.field8946.field8632 += arg0 - this.field8931;
            this.field8948 = arg0;
        }
        this.field8931 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
    public static void method3576(byte arg0) {
        if (arg0 != -127) {
            field8935 = -116;
        }
        field8947 = null;
        field8950 = null;
        field8937 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V")
    public void method2615(int arg0, byte arg1) {
        if (arg0 > this.field8948) {
            this.method3574(arg1 - 16278);
            if (this.field8940 <= 0) {
                this.field8942 = this.field8946.method3473(false, 12, arg0);
            } else {
                OpenGL.glBindBufferARB(this.field8944, this.field8940);
                OpenGL.glBufferDataARBub(this.field8944, arg0, null, 0, this.field8941 ? 35040 : 35044);
                this.field8946.field8632 += arg0 - this.field8948;
            }
            this.field8948 = arg0;
        }
        field8943++;
        this.field8931 = arg0;
        if (arg1 != -73) {
            this.method3573(-40);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljaggl/MapBuffer;ZI)Ljaclib/memory/Buffer;")
    public final Buffer method3577(MapBuffer arg0, boolean arg1, int arg2) {
        field8936++;
        if (arg2 != -9) {
            return null;
        }
        if (this.field8934 == 0) {
            this.method3574(-16351);
            if (this.field8940 <= 0) {
                this.field8934 = 2;
                return this.field8942;
            }
            OpenGL.glBindBufferARB(this.field8944, this.field8940);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field8944, this.field8948, null, 0, this.field8941 ? 35040 : 35044);
                if (this.field8946.field8613.field9846 >= this.field8931) {
                    this.field8934 = 1;
                    return this.field8946.field8613;
                }
            }
            if (!arg0.method3638() && arg0.method3640(this.field8944, this.field8931, 35001)) {
                this.field8934 = 2;
                return arg0;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLjaggl/MapBuffer;)Z")
    public final boolean method3578(boolean arg0, MapBuffer arg1) {
        field8945++;
        boolean var3 = true;
        if (this.field8934 != 0) {
            if (this.field8940 > 0) {
                OpenGL.glBindBufferARB(this.field8944, this.field8940);
                if (this.field8934 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8944, 0, this.field8948, this.field8946.field8613.getAddress());
                } else {
                    var3 = arg1.method3639();
                }
            }
            this.field8934 = 0;
        }
        if (arg0) {
            this.field8942 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2614(487);
        field8949++;
        super.finalize();
    }

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)J")
    public final long method3579(int arg0) {
        field8939++;
        if (arg0 <= 113) {
            this.field8948 = 50;
        }
        return this.field8940 == 0 ? this.field8942.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lpa;IZ)V")
    public class644(class391 arg0, int arg1, boolean arg2) {
        this.field8944 = arg1;
        this.field8946 = arg0;
        this.field8941 = arg2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8937[var0] = var1;
        }
    }
}
