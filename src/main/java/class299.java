import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class299 implements class341 {

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    private int field3956 = -1;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    private int field3963 = 0;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Z")
    private boolean field3962;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "Lqi;")
    public class510 field3965;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3960 = "";

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3958;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z")
    public final boolean method1754(int arg0, MapBuffer arg1) {
        field3957++;
        boolean var3 = true;
        if (this.field3963 != arg0) {
            if (this.field3956 > 0) {
                OpenGL.glBindBufferARB(this.field3954, this.field3956);
                if (this.field3963 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3954, 0, this.field3961, this.field3965.field9133.getAddress());
                } else {
                    var3 = arg1.method3494();
                }
            }
            this.field3963 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public int method1755(int arg0) {
        if (arg0 == 16383) {
            field3955++;
            return this.field3949;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljaclib/memory/Source;BI)Z")
    public final boolean method1756(Source arg0, byte arg1, int arg2) {
        field3964++;
        if (arg1 != -21) {
            this.field3958 = null;
        }
        if (arg2 <= this.field3961) {
            if (this.field3956 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3954, this.field3956);
            OpenGL.glBufferSubDataARBa(this.field3954, 0, this.field3949, arg0.getAddress());
            this.field3965.field9167 += arg2 - this.field3949;
        } else {
            this.method1760(true);
            if (this.field3956 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3954, this.field3956);
            OpenGL.glBufferDataARBa(this.field3954, arg2, arg0.getAddress(), this.field3962 ? 35040 : 35044);
            this.field3965.field9167 += arg2 - this.field3949;
            this.field3961 = arg2;
        }
        this.field3949 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method1757(int arg0) {
        if (this.field3965.field7130) {
            OpenGL.glBindBufferARB(this.field3954, this.field3956);
        }
        field3948++;
        if (arg0 > -60) {
            this.field3958 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public void method1758(byte arg0) {
        int var2 = -47 / ((arg0 - 67) / 38);
        field3946++;
        if (this.field3956 > 0) {
            this.field3965.method2897(this.field3956, this.field3949, 1);
            this.field3956 = -1;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)I")
    public static final int method1759(int arg0, byte arg1) {
        if (arg1 < 11) {
            method1764((byte) -59, 97, 92);
        }
        field3952++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
    private final void method1760(boolean arg0) {
        field3959++;
        if (this.field3956 >= 0) {
            return;
        }
        if (!arg0) {
            this.field3962 = true;
        }
        if (this.field3965.field7130) {
            OpenGL.glGenBuffersARB(1, class545.field7453, 0);
            this.field3956 = class545.field7453[0];
            OpenGL.glBindBufferARB(this.field3954, this.field3956);
        } else {
            this.field3956 = 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)J")
    public final long method1761(boolean arg0) {
        field3945++;
        if (!arg0) {
            this.field3949 = -43;
        }
        return this.field3956 == 0 ? this.field3958.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljaggl/MapBuffer;ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1762(MapBuffer arg0, boolean arg1, int arg2) {
        field3950++;
        if (this.field3963 == 0) {
            this.method1760(true);
            if (this.field3956 <= 0) {
                this.field3963 = 2;
                return this.field3958;
            }
            OpenGL.glBindBufferARB(this.field3954, this.field3956);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field3954, this.field3961, null, 0, this.field3962 ? 35040 : 35044);
                if (this.field3965.field9133.field8606 >= this.field3949) {
                    this.field3963 = 1;
                    return this.field3965.field9133;
                }
            }
            if (!arg0.method3493() && arg0.method3495(this.field3954, this.field3949, 35001)) {
                this.field3963 = 2;
                return arg0;
            }
        }
        if (arg2 != 10176) {
            this.field3949 = 23;
        }
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3947++;
        this.method1758((byte) 111);
        super.finalize();
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field3960 = null;
        int var1 = -98 % ((-arg0 - 42) / 54);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Z")
    public static final boolean method1764(byte arg0, int arg1, int arg2) {
        if (arg0 > -115) {
            method1763((byte) -39);
        }
        field3951++;
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public void method1765(int arg0, int arg1) {
        if (arg0 > this.field3961) {
            this.method1760(true);
            if (this.field3956 > 0) {
                OpenGL.glBindBufferARB(this.field3954, this.field3956);
                OpenGL.glBufferDataARBub(this.field3954, arg0, null, 0, this.field3962 ? 35040 : 35044);
                this.field3965.field9167 += arg0 - this.field3961;
            } else {
                this.field3958 = this.field3965.method3623(false, arg1 ^ 0x78DE, arg0);
            }
            this.field3961 = arg0;
        }
        field3953++;
        this.field3949 = arg0;
        if (arg1 != 30907) {
            this.field3956 = -103;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lqi;IZ)V")
    public class299(class510 arg0, int arg1, boolean arg2) {
        this.field3962 = arg2;
        this.field3954 = arg1;
        this.field3965 = arg0;
    }
}
