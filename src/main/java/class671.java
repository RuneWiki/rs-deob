import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class671 implements class553 {

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field9435 = -1;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    private int field9444 = 0;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    private boolean field9440;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lsb;")
    public class93 field9448;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    private int field9438;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "J")
    public static long field9436 = -1L;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[I")
    public static int[] field9442 = new int[1000];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private int field9433;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    private int field9445;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9447;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ljava/lang/String;")
    public static String field9428;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljaggl/MapBuffer;Z)Z", line = 5)
    public final boolean method3838(MapBuffer arg0, boolean arg1) {
        field9437++;
        boolean var3 = arg1;
        if (this.field9444 != 0) {
            if (this.field9435 > 0) {
                OpenGL.glBindBufferARB(this.field9438, this.field9435);
                if (this.field9444 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field9438, 0, this.field9445, this.field9448.field6765.getAddress());
                } else {
                    var3 = arg0.method3386();
                }
            }
            this.field9444 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)J", line = 37)
    public final long method3839(int arg0) {
        field9431++;
        if (arg0 > -8) {
            return -16L;
        } else if (this.field9435 == 0) {
            return this.field9447.getAddress();
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 52)
    public final void method3840(byte arg0) {
        if (this.field9448.field1359) {
            OpenGL.glBindBufferARB(this.field9438, this.field9435);
        }
        field9430++;
        int var2 = 97 / ((55 - arg0) / 59);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V", line = 65)
    private final void method3841(byte arg0) {
        field9429++;
        if (this.field9435 >= 0) {
            return;
        }
        if (arg0 != -58) {
            this.method3838(null, false);
        }
        if (this.field9448.field1359) {
            OpenGL.glGenBuffersARB(1, class259.field3528, 0);
            this.field9435 = class259.field3528[0];
            OpenGL.glBindBufferARB(this.field9438, this.field9435);
        } else {
            this.field9435 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lsb;IZ)V", line = 278)
    public class671(class93 arg0, int arg1, boolean arg2) {
        this.field9440 = arg2;
        this.field9448 = arg0;
        this.field9438 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(Z)V", line = 93)
    public static void method3842(boolean arg0) {
        field9428 = null;
        field9442 = null;
        if (arg0) {
            method3842(true);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 110)
    public void method1398(boolean arg0) {
        if (arg0) {
            this.field9445 = -47;
        }
        if (this.field9435 > 0) {
            this.field9448.method585(this.field9435, 772, this.field9433);
            this.field9435 = -1;
        }
        field9446++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 130)
    public final boolean method3843(Source arg0, int arg1, int arg2) {
        if (arg2 >= -109) {
            field9436 = -117L;
        }
        field9439++;
        if (arg1 <= this.field9445) {
            if (this.field9435 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field9438, this.field9435);
            OpenGL.glBufferSubDataARBa(this.field9438, 0, this.field9433, arg0.getAddress());
            this.field9448.field6796 += arg1 - this.field9433;
        } else {
            this.method3841((byte) -58);
            if (this.field9435 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field9438, this.field9435);
            OpenGL.glBufferDataARBa(this.field9438, arg1, arg0.getAddress(), this.field9440 ? 35040 : 35044);
            this.field9448.field6796 += arg1 - this.field9433;
            this.field9445 = arg1;
        }
        this.field9433 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)I", line = 172)
    public int method1683(boolean arg0) {
        field9427++;
        if (arg0) {
            field9434 = -98;
        }
        return this.field9433;
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 183)
    protected final void finalize() throws Throwable {
        this.method1398(false);
        field9443++;
        super.finalize();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V", line = 193)
    public void method1399(int arg0, boolean arg1) {
        if (this.field9445 < arg0) {
            this.method3841((byte) -58);
            if (this.field9435 <= 0) {
                this.field9447 = this.field9448.method2924((byte) -60, arg0, false);
            } else {
                OpenGL.glBindBufferARB(this.field9438, this.field9435);
                OpenGL.glBufferDataARBub(this.field9438, arg0, null, 0, this.field9440 ? 35040 : 35044);
                this.field9448.field6796 += arg0 - this.field9445;
            }
            this.field9445 = arg0;
        }
        field9432++;
        if (arg1) {
            this.field9433 = arg0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljaggl/MapBuffer;IZ)Ljaclib/memory/Buffer;", line = 235)
    public final Buffer method3844(MapBuffer arg0, int arg1, boolean arg2) {
        field9441++;
        if (arg1 < 96) {
            this.method3841((byte) 44);
        }
        if (this.field9444 == 0) {
            this.method3841((byte) -58);
            if (this.field9435 <= 0) {
                this.field9444 = 2;
                return this.field9447;
            }
            OpenGL.glBindBufferARB(this.field9438, this.field9435);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field9438, this.field9445, null, 0, this.field9440 ? 35040 : 35044);
                if (this.field9448.field6765.field5828 >= this.field9433) {
                    this.field9444 = 1;
                    return this.field9448.field6765;
                }
            }
            if (!arg0.method3384() && arg0.method3385(this.field9438, this.field9433, 35001)) {
                this.field9444 = 2;
                return arg0;
            }
        }
        return null;
    }
}
