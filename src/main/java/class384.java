import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class384 implements class278 {

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    private int field5556 = 0;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    private int field5557 = -1;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lmba;")
    public class643 field5548;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "Z")
    private boolean field5553;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "Lda;")
    public static class400 field5560;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5552;

    @OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        this.method175(-97);
        field5547++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZILjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 20)
    public final Buffer method2366(boolean arg0, int arg1, MapBuffer arg2) {
        if (arg1 != -6633) {
            return null;
        }
        field5561++;
        if (this.field5556 == 0) {
            this.method2369(0);
            if (this.field5557 <= 0) {
                this.field5556 = 2;
                return this.field5552;
            }
            OpenGL.glBindBufferARB(this.field5549, this.field5557);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field5549, this.field5562, null, 0, this.field5553 ? 35040 : 35044);
                if (this.field5548.field373.field6006 >= this.field5559) {
                    this.field5556 = 1;
                    return this.field5548.field373;
                }
            }
            if (!arg2.method3371() && arg2.method3373(this.field5549, this.field5559, 35001)) {
                this.field5556 = 2;
                return arg2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLjaclib/memory/Source;I)Z", line = 64)
    public final boolean method2367(byte arg0, Source arg1, int arg2) {
        if (arg0 != 97) {
            return false;
        }
        field5563++;
        if (arg2 > this.field5562) {
            this.method2369(0);
            if (this.field5557 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5549, this.field5557);
            OpenGL.glBufferDataARBa(this.field5549, arg2, arg1.getAddress(), this.field5553 ? 35040 : 35044);
            this.field5548.field518 += arg2 - this.field5559;
            this.field5562 = arg2;
        } else if (this.field5557 > 0) {
            OpenGL.glBindBufferARB(this.field5549, this.field5557);
            OpenGL.glBufferSubDataARBa(this.field5549, 0, this.field5559, arg1.getAddress());
            this.field5548.field518 += arg2 - this.field5559;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field5559 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V", line = 105)
    public final void method2368(byte arg0) {
        field5546++;
        if (this.field5548.field9256) {
            OpenGL.glBindBufferARB(this.field5549, this.field5557);
        }
        if (arg0 >= -56) {
            this.method2371(-102, null);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)V", line = 118)
    private final void method2369(int arg0) {
        field5554++;
        if (this.field5557 >= 0) {
            return;
        }
        if (this.field5548.field9256) {
            OpenGL.glGenBuffersARB(1, class411.field5866, 0);
            this.field5557 = class411.field5866[0];
            OpenGL.glBindBufferARB(this.field5549, this.field5557);
        } else {
            this.field5557 = 0;
        }
        if (arg0 != 0) {
            this.method2371(-70, null);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I", line = 145)
    public int method1105(boolean arg0) {
        field5550++;
        if (arg0) {
            this.method2366(true, 115, null);
        }
        return this.field5559;
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V", line = 158)
    public static void method2370(int arg0) {
        field5560 = null;
        if (arg0 != 9291) {
            field5560 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)V", line = 171)
    public void method174(int arg0, byte arg1) {
        if (arg0 > this.field5562) {
            this.method2369(0);
            if (this.field5557 <= 0) {
                this.field5552 = this.field5548.method351(false, arg0, 114);
            } else {
                OpenGL.glBindBufferARB(this.field5549, this.field5557);
                OpenGL.glBufferDataARBub(this.field5549, arg0, null, 0, this.field5553 ? 35040 : 35044);
                this.field5548.field518 += arg0 - this.field5562;
            }
            this.field5562 = arg0;
        }
        if (arg1 == 39) {
            field5564++;
            this.field5559 = arg0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lmba;IZ)V", line = 269)
    public class384(class643 arg0, int arg1, boolean arg2) {
        this.field5549 = arg1;
        this.field5548 = arg0;
        this.field5553 = arg2;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 203)
    public void method175(int arg0) {
        if (this.field5557 > 0) {
            this.field5548.method3711(this.field5559, true, this.field5557);
            this.field5557 = -1;
        }
        field5558++;
        int var2 = 28 / ((arg0 + 17) / 40);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z", line = 222)
    public final boolean method2371(int arg0, MapBuffer arg1) {
        field5555++;
        boolean var3 = true;
        if (arg0 != -31668) {
            this.method2366(true, -52, null);
        }
        if (this.field5556 != 0) {
            if (this.field5557 > 0) {
                OpenGL.glBindBufferARB(this.field5549, this.field5557);
                if (this.field5556 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5549, 0, this.field5562, this.field5548.field373.getAddress());
                } else {
                    var3 = arg1.method3372();
                }
            }
            this.field5556 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)J", line = 255)
    public final long method2372(int arg0) {
        field5551++;
        if (arg0 == 11235) {
            return this.field5557 == 0 ? this.field5552.getAddress() : 0L;
        } else {
            return -115L;
        }
    }
}
