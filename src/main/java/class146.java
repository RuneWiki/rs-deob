import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class class146 implements class697 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private int field2303 = -1;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    private int field2314 = 0;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
    private boolean field2304;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Llaa;")
    public class122 field2318;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2313;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
    public int method590(int arg0) {
        if (arg0 == -1) {
            field2310++;
            return this.field2307;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z")
    public final boolean method1101(int arg0, MapBuffer arg1) {
        field2306++;
        boolean var3 = true;
        int var4 = 8 % ((arg0 - 45) / 58);
        if (this.field2314 != 0) {
            if (this.field2303 > 0) {
                OpenGL.glBindBufferARB(this.field2309, this.field2303);
                if (this.field2314 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field2309, 0, this.field2319, this.field2318.field1634.getAddress());
                } else {
                    var3 = arg1.method3441();
                }
            }
            this.field2314 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)J")
    public final long method1102(byte arg0) {
        if (arg0 == -110) {
            field2317++;
            return this.field2303 == 0 ? this.field2313.getAddress() : 0L;
        } else {
            return 3L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljaggl/MapBuffer;BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1103(MapBuffer arg0, byte arg1, boolean arg2) {
        if (arg1 >= -64) {
            this.field2307 = 23;
        }
        field2315++;
        if (this.field2314 == 0) {
            this.method1105(-30906);
            if (this.field2303 <= 0) {
                this.field2314 = 2;
                return this.field2313;
            }
            OpenGL.glBindBufferARB(this.field2309, this.field2303);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field2309, this.field2319, null, 0, this.field2304 ? 35040 : 35044);
                if (this.field2318.field1634.field9334 >= this.field2307) {
                    this.field2314 = 1;
                    return this.field2318.field1634;
                }
            }
            if (!arg0.method3442() && arg0.method3440(this.field2309, this.field2307, 35001)) {
                this.field2314 = 2;
                return arg0;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IZ)I")
    public static final int method1104(int arg0, boolean arg1) {
        field2316++;
        if (arg0 != -1) {
            return 4;
        }
        int var2 = class410.field5681;
        if (var2 == 0) {
            return arg1 ? 0 : class186.field2817;
        } else if (var2 == 1) {
            return class186.field2817;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    private final void method1105(int arg0) {
        field2308++;
        if (this.field2303 >= 0) {
            return;
        }
        if (this.field2318.field2047) {
            OpenGL.glGenBuffersARB(1, class62.field758, 0);
            this.field2303 = class62.field758[0];
            OpenGL.glBindBufferARB(this.field2309, this.field2303);
        } else {
            this.field2303 = 0;
        }
        if (arg0 != -30906) {
            this.field2307 = -107;
        }
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2312++;
        this.method588(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
    public final void method1106(byte arg0) {
        if (arg0 == -67) {
            field2311++;
            if (this.field2318.field2047) {
                OpenGL.glBindBufferARB(this.field2309, this.field2303);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
    public void method585(int arg0, byte arg1) {
        if (this.field2319 < arg0) {
            this.method1105(-30906);
            if (this.field2303 <= 0) {
                this.field2313 = this.field2318.method829(arg0, false, (byte) -35);
            } else {
                OpenGL.glBindBufferARB(this.field2309, this.field2303);
                OpenGL.glBufferDataARBub(this.field2309, arg0, null, 0, this.field2304 ? 35040 : 35044);
                this.field2318.field1715 += arg0 - this.field2319;
            }
            this.field2319 = arg0;
        }
        if (arg1 == 102) {
            field2320++;
            this.field2307 = arg0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public void method588(boolean arg0) {
        field2321++;
        if (this.field2303 > 0) {
            this.field2318.method979(this.field2303, this.field2307, 0);
            this.field2303 = -1;
        }
        if (arg0) {
            this.field2304 = false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z")
    public final boolean method1107(int arg0, Source arg1, byte arg2) {
        field2305++;
        if (arg2 != 31) {
            this.field2313 = null;
        }
        if (arg0 <= this.field2319) {
            if (this.field2303 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field2309, this.field2303);
            OpenGL.glBufferSubDataARBa(this.field2309, 0, this.field2307, arg1.getAddress());
            this.field2318.field1715 += arg0 - this.field2307;
        } else {
            this.method1105(-30906);
            if (this.field2303 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field2309, this.field2303);
            OpenGL.glBufferDataARBa(this.field2309, arg0, arg1.getAddress(), this.field2304 ? 35040 : 35044);
            this.field2318.field1715 += arg0 - this.field2307;
            this.field2319 = arg0;
        }
        this.field2307 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Llaa;IZ)V")
    public class146(class122 arg0, int arg1, boolean arg2) {
        this.field2309 = arg1;
        this.field2304 = arg2;
        this.field2318 = arg0;
    }
}
