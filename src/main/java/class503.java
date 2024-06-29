import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class503 implements class326 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    private int field7243 = -1;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    private int field7251 = 0;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    private int field7256;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
    private boolean field7244;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lmr;")
    public class221 field7248;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "J")
    public static long field7245 = -1L;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lub;")
    public static class407 field7241 = new class407(0, 0);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    private int field7250;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    private int field7254;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Ltf;")
    public static class701 field7255;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7262;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field7242;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2887(int arg0, int arg1) {
        class44.field425 = 1000000000L / (long) arg1;
        field7259++;
        if (arg0 != 0) {
            method2887(-80, -67);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 16)
    public final boolean method2888(MapBuffer arg0, int arg1) {
        field7247++;
        boolean var3 = true;
        if (arg1 != -1) {
            this.field7251 = 58;
        }
        if (this.field7251 != 0) {
            if (this.field7243 > 0) {
                OpenGL.glBindBufferARB(this.field7256, this.field7243);
                if (this.field7251 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field7256, 0, this.field7254, this.field7248.field4408.getAddress());
                } else {
                    var3 = arg0.method3542();
                }
            }
            this.field7251 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 46)
    public final boolean method2889(int arg0, Source arg1, int arg2) {
        field7249++;
        int var4 = -64 % ((arg0 - 43) / 33);
        if (arg2 <= this.field7254) {
            if (this.field7243 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field7256, this.field7243);
            OpenGL.glBufferSubDataARBa(this.field7256, 0, this.field7250, arg1.getAddress());
            this.field7248.field4507 += arg2 - this.field7250;
        } else {
            this.method2890(-101);
            if (this.field7243 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field7256, this.field7243);
            OpenGL.glBufferDataARBa(this.field7256, arg2, arg1.getAddress(), this.field7244 ? 35040 : 35044);
            this.field7248.field4507 += arg2 - this.field7250;
            this.field7254 = arg2;
        }
        this.field7250 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 87)
    private final void method2890(int arg0) {
        field7263++;
        if (arg0 > -96) {
            this.method2894((byte) 81);
        }
        if (this.field7243 >= 0) {
            return;
        }
        if (this.field7248.field2738) {
            OpenGL.glGenBuffersARB(1, class257.field3216, 0);
            this.field7243 = class257.field3216[0];
            OpenGL.glBindBufferARB(this.field7256, this.field7243);
        } else {
            this.field7243 = 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V", line = 116)
    public static void method2891(int arg0) {
        field7241 = null;
        field7242 = null;
        field7255 = null;
        if (arg0 != 0) {
            method2891(118);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V", line = 128)
    public void method73(int arg0, byte arg1) {
        field7260++;
        if (this.field7254 < arg0) {
            this.method2890(-113);
            if (this.field7243 <= 0) {
                this.field7262 = this.field7248.method1993(false, -93, arg0);
            } else {
                OpenGL.glBindBufferARB(this.field7256, this.field7243);
                OpenGL.glBufferDataARBub(this.field7256, arg0, null, 0, this.field7244 ? 35040 : 35044);
                this.field7248.field4507 += arg0 - this.field7254;
            }
            this.field7254 = arg0;
        }
        if (arg1 == -55) {
            this.field7250 = arg0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;", line = 158)
    public final Buffer method2892(int arg0, MapBuffer arg1, boolean arg2) {
        field7257++;
        if (this.field7251 == 0) {
            this.method2890(-120);
            if (this.field7243 <= 0) {
                this.field7251 = 2;
                return this.field7262;
            }
            OpenGL.glBindBufferARB(this.field7256, this.field7243);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field7256, this.field7254, null, 0, this.field7244 ? 35040 : 35044);
                if (this.field7250 <= this.field7248.field4408.field8773) {
                    this.field7251 = 1;
                    return this.field7248.field4408;
                }
            }
            if (!arg1.method3541() && arg1.method3543(this.field7256, this.field7250, 35001)) {
                this.field7251 = 2;
                return arg1;
            }
        }
        return arg0 >= -79 ? null : null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lmr;IZ)V", line = 290)
    public class503(class221 arg0, int arg1, boolean arg2) {
        this.field7256 = arg1;
        this.field7244 = arg2;
        this.field7248 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)J", line = 213)
    public final long method2893(byte arg0) {
        if (arg0 < 6) {
            return -40L;
        } else {
            field7258++;
            return this.field7243 == 0 ? this.field7262.getAddress() : 0L;
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V", line = 227)
    public final void method2894(byte arg0) {
        field7246++;
        if (this.field7248.field2738) {
            OpenGL.glBindBufferARB(this.field7256, this.field7243);
        }
        if (arg0 != -111) {
            field7241 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)I", line = 240)
    public int method197(int arg0) {
        field7253++;
        int var2 = -18 / ((arg0 - 27) / 38);
        return this.field7250;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 253)
    public void method74(byte arg0) {
        field7252++;
        if (this.field7243 > 0) {
            this.field7248.method1329(0, this.field7250, this.field7243);
            this.field7243 = -1;
        }
        if (arg0 <= 99) {
            method2891(-70);
        }
    }

    @OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V", line = 277)
    protected final void finalize() throws Throwable {
        this.method74((byte) 126);
        field7261++;
        super.finalize();
    }
}
