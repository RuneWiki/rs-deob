import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class408 implements class13 {

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    private int field5780 = 0;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    private int field5773 = -1;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
    private boolean field5774;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lsha;")
    public class757 field5769;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    private int field5771;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lqj;")
    public static class535 field5772 = new class535(4);

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Lmw;")
    public static class517 field5777 = new class517(36, 7);

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Lmw;")
    public static class517 field5781 = new class517(45, 0);

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field5784 = -1;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Ltq;")
    public static class654 field5783 = new class654("", 16);

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field5785 = 0;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Z")
    public static boolean field5786 = false;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[I")
    public static int[] field5787 = new int[25];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field5760;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private int field5767;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5763;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
    public static boolean field5764;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[Z")
    public static boolean[] field5782;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[[Z")
    public static boolean[][] field5778;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 4)
    public void method850(int arg0, int arg1) {
        if (arg0 != -8165) {
            field5783 = null;
        }
        if (this.field5760 < arg1) {
            this.method2452((byte) -109);
            if (this.field5773 <= 0) {
                this.field5763 = this.field5769.method3835(false, 0, arg1);
            } else {
                OpenGL.glBindBufferARB(this.field5771, this.field5773);
                OpenGL.glBufferDataARBub(this.field5771, arg1, null, 0, this.field5774 ? 35040 : 35044);
                this.field5769.field9495 += arg1 - this.field5760;
            }
            this.field5760 = arg1;
        }
        field5768++;
        this.field5767 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 32)
    public final void method2449(int arg0) {
        field5775++;
        if (this.field5769.field10335) {
            OpenGL.glBindBufferARB(this.field5771, this.field5773);
        }
        if (arg0 != 0) {
            this.method2450((byte) -3, null, true);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I", line = 51)
    public int method84(int arg0) {
        if (arg0 >= -80) {
            this.method2455(null, -83, 3);
        }
        field5776++;
        return this.field5767;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;", line = 64)
    public final Buffer method2450(byte arg0, MapBuffer arg1, boolean arg2) {
        field5759++;
        if (this.field5780 == 0) {
            this.method2452((byte) -109);
            if (this.field5773 <= 0) {
                this.field5780 = 2;
                return this.field5763;
            }
            OpenGL.glBindBufferARB(this.field5771, this.field5773);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field5771, this.field5760, null, 0, this.field5774 ? 35040 : 35044);
                if (this.field5769.field9351.field9259 >= this.field5767) {
                    this.field5780 = 1;
                    return this.field5769.field9351;
                }
            }
            if (!arg1.method3614() && arg1.method3612(this.field5771, this.field5767, 35001)) {
                this.field5780 = 2;
                return arg1;
            }
        }
        return arg0 <= 36 ? null : null;
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 109)
    protected final void finalize() throws Throwable {
        this.method851(-21765);
        field5779++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 125)
    public static final void method2451(String arg0, int arg1) {
        System.out.println("Error: " + class640.method3522("\n", "%0a", (byte) 22, arg0));
        field5761++;
        int var2 = 79 % ((arg1 + 11) / 56);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 137)
    private final void method2452(byte arg0) {
        field5766++;
        if (arg0 != -109 || this.field5773 >= 0) {
            return;
        }
        if (this.field5769.field10335) {
            OpenGL.glGenBuffersARB(1, class158.field2133, 0);
            this.field5773 = class158.field2133[0];
            OpenGL.glBindBufferARB(this.field5771, this.field5773);
        } else {
            this.field5773 = 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 164)
    public void method851(int arg0) {
        if (this.field5773 > 0) {
            this.field5769.method4149(this.field5767, 12246, this.field5773);
            this.field5773 = -1;
        }
        if (arg0 != -21765) {
            field5764 = false;
        }
        field5765++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)J", line = 180)
    public final long method2453(boolean arg0) {
        if (arg0) {
            this.method2450((byte) 7, null, false);
        }
        field5758++;
        return this.field5773 == 0 ? this.field5763.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljaggl/MapBuffer;Z)Z", line = 194)
    public final boolean method2454(MapBuffer arg0, boolean arg1) {
        field5770++;
        boolean var3 = arg1;
        if (this.field5780 != 0) {
            if (this.field5773 > 0) {
                OpenGL.glBindBufferARB(this.field5771, this.field5773);
                if (this.field5780 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5771, 0, this.field5760, this.field5769.field9351.getAddress());
                } else {
                    var3 = arg0.method3613();
                }
            }
            this.field5780 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 225)
    public final boolean method2455(Source arg0, int arg1, int arg2) {
        int var4 = 115 / ((arg1 - 58) / 61);
        field5762++;
        if (arg2 > this.field5760) {
            this.method2452((byte) -109);
            if (this.field5773 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5771, this.field5773);
            OpenGL.glBufferDataARBa(this.field5771, arg2, arg0.getAddress(), this.field5774 ? 35040 : 35044);
            this.field5769.field9495 += arg2 - this.field5767;
            this.field5760 = arg2;
        } else if (this.field5773 > 0) {
            OpenGL.glBindBufferARB(this.field5771, this.field5773);
            OpenGL.glBufferSubDataARBa(this.field5771, 0, this.field5767, arg0.getAddress());
            this.field5769.field9495 += arg2 - this.field5767;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field5767 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V", line = 267)
    public static void method2456(byte arg0) {
        if (arg0 <= 121) {
            field5772 = null;
        }
        field5787 = null;
        field5783 = null;
        field5778 = null;
        field5781 = null;
        field5772 = null;
        field5777 = null;
        field5782 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lsha;IZ)V", line = 292)
    public class408(class757 arg0, int arg1, boolean arg2) {
        this.field5774 = arg2;
        this.field5769 = arg0;
        this.field5771 = arg1;
    }
}
