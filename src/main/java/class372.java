import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class372 implements class218 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    private int field5002 = -1;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    private int field5007 = 0;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
    private boolean field5001;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Ldda;")
    public class349 field5016;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    public static int[] field5014 = new int[2];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    private int field5004;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5003;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/io/File;Z)[B")
    public static final byte[] method2165(File arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field5006++;
            return class329.method1911(arg0, -71, (int) arg0.length());
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public final void method2166(int arg0) {
        if (arg0 >= -4) {
            this.method11((byte) 54);
        }
        field4998++;
        if (this.field5016.field4669) {
            OpenGL.glBindBufferARB(this.field5005, this.field5002);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjaclib/memory/Source;)Z")
    public final boolean method2167(int arg0, int arg1, Source arg2) {
        if (arg1 != -10020) {
            this.field5008 = 49;
        }
        field5013++;
        if (arg0 > this.field5004) {
            this.method2173((byte) 106);
            if (this.field5002 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5005, this.field5002);
            OpenGL.glBufferDataARBa(this.field5005, arg0, arg2.getAddress(), this.field5001 ? 35040 : 35044);
            this.field5016.field5425 += arg0 - this.field5008;
            this.field5004 = arg0;
        } else if (this.field5002 > 0) {
            OpenGL.glBindBufferARB(this.field5005, this.field5002);
            OpenGL.glBufferSubDataARBa(this.field5005, 0, this.field5008, arg2.getAddress());
            this.field5016.field5425 += arg0 - this.field5008;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field5008 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method2168(byte arg0) {
        if (arg0 >= 38) {
            field5014 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
    public void method13(int arg0, int arg1) {
        if (this.field5004 < arg0) {
            this.method2173((byte) 106);
            if (this.field5002 <= 0) {
                this.field5003 = this.field5016.method2376(arg0, false, true);
            } else {
                OpenGL.glBindBufferARB(this.field5005, this.field5002);
                OpenGL.glBufferDataARBub(this.field5005, arg0, null, 0, this.field5001 ? 35040 : 35044);
                this.field5016.field5425 += arg0 - this.field5004;
            }
            this.field5004 = arg0;
        }
        field5010++;
        if (arg1 != -6482) {
            this.field5001 = false;
        }
        this.field5008 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5011++;
        this.method11((byte) -124);
        super.finalize();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
    public static final void method2169(boolean arg0) {
        class364.field4900.method2776(false);
        if (arg0) {
            field5018++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public void method11(byte arg0) {
        int var2 = 20 % ((arg0 + 86) / 37);
        if (this.field5002 > 0) {
            this.field5016.method1986(this.field5002, (byte) -94, this.field5008);
            this.field5002 = -1;
        }
        field5012++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;")
    public final Buffer method2170(int arg0, MapBuffer arg1, boolean arg2) {
        field4999++;
        if (this.field5007 == 0) {
            this.method2173((byte) 92);
            if (this.field5002 <= 0) {
                this.field5007 = 2;
                return this.field5003;
            }
            OpenGL.glBindBufferARB(this.field5005, this.field5002);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field5005, this.field5004, null, 0, this.field5001 ? 35040 : 35044);
                if (this.field5008 <= this.field5016.field5278.field8957) {
                    this.field5007 = 1;
                    return this.field5016.field5278;
                }
            }
            if (!arg1.method3372() && arg1.method3373(this.field5005, this.field5008, 35001)) {
                this.field5007 = 2;
                return arg1;
            }
        }
        return arg0 == -28650 ? null : null;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)J")
    public final long method2171(int arg0) {
        field5009++;
        if (arg0 == 15457) {
            return this.field5002 == 0 ? this.field5003.getAddress() : 0L;
        } else {
            return 25L;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method2172(MapBuffer arg0, int arg1) {
        field5017++;
        boolean var3 = true;
        if (this.field5007 != 0) {
            if (this.field5002 > 0) {
                OpenGL.glBindBufferARB(this.field5005, this.field5002);
                if (this.field5007 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5005, 0, this.field5004, this.field5016.field5278.getAddress());
                } else {
                    var3 = arg0.method3374();
                }
            }
            this.field5007 = 0;
        }
        if (arg1 <= 18) {
            field5014 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
    public int method16(int arg0) {
        if (arg0 == 34962) {
            field5000++;
            return this.field5008;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ldda;IZ)V")
    public class372(class349 arg0, int arg1, boolean arg2) {
        this.field5001 = arg2;
        this.field5005 = arg1;
        this.field5016 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    private final void method2173(byte arg0) {
        field5015++;
        if (arg0 <= 87) {
            method2165(null, false);
        }
        if (this.field5002 >= 0) {
            return;
        }
        if (this.field5016.field4669) {
            OpenGL.glGenBuffersARB(1, class230.field2998, 0);
            this.field5002 = class230.field2998[0];
            OpenGL.glBindBufferARB(this.field5005, this.field5002);
        } else {
            this.field5002 = 0;
        }
    }
}
