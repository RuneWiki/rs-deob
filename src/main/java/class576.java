import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class576 implements class316 {

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    private int field8105 = -1;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    private int field8103 = 0;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Z")
    private boolean field8097;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    private int field8091;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Loaa;")
    public class556 field8086;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field8099 = 0;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    private int field8092;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "Lqa;")
    public static class747 field8094;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8090;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z")
    public final boolean method3369(int arg0, Source arg1, int arg2) {
        field8098++;
        if (arg0 > this.field8100) {
            this.method3375(arg2 - 35044);
            if (this.field8105 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8091, this.field8105);
            OpenGL.glBufferDataARBa(this.field8091, arg0, arg1.getAddress(), this.field8097 ? 35040 : 35044);
            this.field8086.field3276 += arg0 - this.field8092;
            this.field8100 = arg0;
        } else if (this.field8105 > 0) {
            OpenGL.glBindBufferARB(this.field8091, this.field8105);
            OpenGL.glBufferSubDataARBa(this.field8091, 0, this.field8092, arg1.getAddress());
            this.field8086.field3276 += arg0 - this.field8092;
        } else {
            throw new RuntimeException("ARGH!");
        }
        if (arg2 != 35044) {
            this.field8105 = -78;
        }
        this.field8092 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method3370(MapBuffer arg0, int arg1) {
        field8093++;
        if (arg1 != 0) {
            this.field8105 = 76;
        }
        boolean var3 = true;
        if (this.field8103 != 0) {
            if (this.field8105 > 0) {
                OpenGL.glBindBufferARB(this.field8091, this.field8105);
                if (this.field8103 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8091, 0, this.field8100, this.field8086.field3133.getAddress());
                } else {
                    var3 = arg0.method122();
                }
            }
            this.field8103 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)V")
    public static void method3371(int arg0) {
        if (arg0 < 2) {
            method3371(38);
        }
        field8094 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
    public int method1124(int arg0) {
        field8096++;
        if (arg0 != 22913) {
            this.field8091 = -60;
        }
        return this.field8092;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjaggl/MapBuffer;I)Ljaclib/memory/Buffer;")
    public final Buffer method3372(boolean arg0, MapBuffer arg1, int arg2) {
        field8089++;
        if (this.field8103 == 0) {
            this.method3375(arg2 - 2);
            if (this.field8105 <= 0) {
                this.field8103 = 2;
                return this.field8090;
            }
            OpenGL.glBindBufferARB(this.field8091, this.field8105);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field8091, this.field8100, null, 0, this.field8097 ? 35040 : 35044);
                if (this.field8086.field3133.field5375 >= this.field8092) {
                    this.field8103 = 1;
                    return this.field8086.field3133;
                }
            }
            if (!arg1.method123() && arg1.method121(this.field8091, this.field8092, 35001)) {
                this.field8103 = 2;
                return arg1;
            }
        }
        if (arg2 != 2) {
            this.method1119(21, -120);
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
    public void method1119(int arg0, int arg1) {
        if (this.field8100 < arg0) {
            this.method3375(0);
            if (this.field8105 <= 0) {
                this.field8090 = this.field8086.method1381(-56, false, arg0);
            } else {
                OpenGL.glBindBufferARB(this.field8091, this.field8105);
                OpenGL.glBufferDataARBub(this.field8091, arg0, null, 0, this.field8097 ? 35040 : 35044);
                this.field8086.field3276 += arg0 - this.field8100;
            }
            this.field8100 = arg0;
        }
        if (arg1 != -27671) {
            method3371(-26);
        }
        field8088++;
        this.field8092 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)J")
    public final long method3373(byte arg0) {
        field8087++;
        if (arg0 >= -113) {
            return 17L;
        } else if (this.field8105 == 0) {
            return this.field8090.getAddress();
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)V")
    public static final void method3374(byte arg0, int arg1) {
        if (arg0 == 87) {
            field8095++;
            class17 var2 = class245.method1634(1, (long) arg1, 4);
            var2.method69(13);
        }
    }

    @OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1125(93);
        field8102++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public void method1125(int arg0) {
        field8101++;
        if (arg0 <= 18) {
            this.field8097 = false;
        }
        if (this.field8105 > 0) {
            this.field8086.method3272(this.field8105, false, this.field8092);
            this.field8105 = -1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
    private final void method3375(int arg0) {
        field8104++;
        if (this.field8105 >= arg0) {
            return;
        }
        if (this.field8086.field7813) {
            OpenGL.glGenBuffersARB(1, class546.field7593, 0);
            this.field8105 = class546.field7593[0];
            OpenGL.glBindBufferARB(this.field8091, this.field8105);
        } else {
            this.field8105 = 0;
        }
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
    public final void method3376(int arg0) {
        field8106++;
        if (arg0 != -32022) {
            this.method3370(null, 115);
        }
        if (this.field8086.field7813) {
            OpenGL.glBindBufferARB(this.field8091, this.field8105);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Loaa;IZ)V")
    public class576(class556 arg0, int arg1, boolean arg2) {
        this.field8097 = arg2;
        this.field8091 = arg1;
        this.field8086 = arg0;
    }
}
