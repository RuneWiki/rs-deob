import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class110 implements class616 {

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    private int field1443 = -1;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    private int field1439 = 0;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Llm;")
    public class337 field1448;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Z")
    private boolean field1442;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1449;

    @OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method323(-21271);
        field1441++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public void method323(int arg0) {
        if (arg0 != -21271) {
            return;
        }
        field1446++;
        if (this.field1443 > 0) {
            this.field1448.method1898(this.field1447, this.field1443, (byte) 2);
            this.field1443 = -1;
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public final void method615(int arg0) {
        field1455++;
        if (this.field1448.field4377) {
            OpenGL.glBindBufferARB(this.field1452, this.field1443);
        }
        if (arg0 != 35001) {
            this.field1448 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZBLjaggl/MapBuffer;)Ljaclib/memory/Buffer;")
    public final Buffer method616(boolean arg0, byte arg1, MapBuffer arg2) {
        if (arg1 <= 34) {
            this.method621(null, -51);
        }
        field1445++;
        if (this.field1439 == 0) {
            this.method618(122);
            if (this.field1443 <= 0) {
                this.field1439 = 2;
                return this.field1449;
            }
            OpenGL.glBindBufferARB(this.field1452, this.field1443);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field1452, this.field1456, null, 0, this.field1442 ? 35040 : 35044);
                if (this.field1447 <= this.field1448.field6224.field8718) {
                    this.field1439 = 1;
                    return this.field1448.field6224;
                }
            }
            if (!arg2.method3546() && arg2.method3544(this.field1452, this.field1447, 35001)) {
                this.field1439 = 2;
                return arg2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)J")
    public final long method617(int arg0) {
        field1453++;
        if (arg0 == 0) {
            return this.field1443 == 0 ? this.field1449.getAddress() : 0L;
        } else {
            return 57L;
        }
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
    private final void method618(int arg0) {
        if (arg0 <= 113) {
            return;
        }
        field1450++;
        if (this.field1443 >= 0) {
            return;
        }
        if (this.field1448.field4377) {
            OpenGL.glGenBuffersARB(1, class512.field6957, 0);
            this.field1443 = class512.field6957[0];
            OpenGL.glBindBufferARB(this.field1452, this.field1443);
        } else {
            this.field1443 = 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public void method619(int arg0, int arg1) {
        if (this.field1456 < arg1) {
            this.method618(arg0 - 27095);
            if (this.field1443 > 0) {
                OpenGL.glBindBufferARB(this.field1452, this.field1443);
                OpenGL.glBufferDataARBub(this.field1452, arg1, null, 0, this.field1442 ? 35040 : 35044);
                this.field1448.field6231 += arg1 - this.field1456;
            } else {
                this.field1449 = this.field1448.method2542(arg1, (byte) 112, false);
            }
            this.field1456 = arg1;
        }
        if (arg0 != 27209) {
            this.field1452 = -53;
        }
        field1451++;
        this.field1447 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z")
    public final boolean method620(int arg0, Source arg1, byte arg2) {
        field1440++;
        if (arg2 <= 101) {
            this.field1448 = null;
        }
        if (arg0 <= this.field1456) {
            if (this.field1443 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1452, this.field1443);
            OpenGL.glBufferSubDataARBa(this.field1452, 0, this.field1447, arg1.getAddress());
            this.field1448.field6231 += arg0 - this.field1447;
        } else {
            this.method618(119);
            if (this.field1443 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1452, this.field1443);
            OpenGL.glBufferDataARBa(this.field1452, arg0, arg1.getAddress(), this.field1442 ? 35040 : 35044);
            this.field1448.field6231 += arg0 - this.field1447;
            this.field1456 = arg0;
        }
        this.field1447 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method621(MapBuffer arg0, int arg1) {
        field1454++;
        boolean var3 = true;
        if (arg1 != 35040) {
            this.method618(-42);
        }
        if (this.field1439 != 0) {
            if (this.field1443 > 0) {
                OpenGL.glBindBufferARB(this.field1452, this.field1443);
                if (this.field1439 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field1452, 0, this.field1456, this.field1448.field6224.getAddress());
                } else {
                    var3 = arg0.method3545();
                }
            }
            this.field1439 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
    public int method330(byte arg0) {
        field1444++;
        return arg0 < 11 ? -47 : this.field1447;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Llm;IZ)V")
    public class110(class337 arg0, int arg1, boolean arg2) {
        this.field1452 = arg1;
        this.field1448 = arg0;
        this.field1442 = arg2;
    }
}
