import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class265 implements class136 {

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    private int field3457 = -1;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Lkd;")
    public class700 field3469;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
    private boolean field3467;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3464;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)I", line = 3)
    public int method963(boolean arg0) {
        field3454++;
        if (arg0) {
            this.field3464 = null;
        }
        return this.field3459;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 17)
    public final boolean method1588(MapBuffer arg0, int arg1) {
        if (arg1 < 108) {
            this.method1590(-85);
        }
        field3470++;
        boolean var3 = true;
        if (this.field3468 != 0) {
            if (this.field3457 > 0) {
                OpenGL.glBindBufferARB(this.field3458, this.field3457);
                if (this.field3468 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3458, 0, this.field3463, this.field3469.field7614.getAddress());
                } else {
                    var3 = arg0.method164();
                }
            }
            this.field3468 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 49)
    private final void method1589(int arg0) {
        field3465++;
        if (this.field3457 >= 0) {
            return;
        }
        if (this.field3469.field9951) {
            OpenGL.glGenBuffersARB(1, class96.field1480, 0);
            this.field3457 = class96.field1480[0];
            OpenGL.glBindBufferARB(this.field3458, this.field3457);
        } else {
            this.field3457 = 0;
        }
        if (arg0 != 12636) {
            this.field3468 = -68;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lkd;IZ)V", line = 302)
    public class265(class700 arg0, int arg1, boolean arg2) {
        this.field3469 = arg0;
        this.field3458 = arg1;
        this.field3467 = arg2;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 79)
    public void method987(int arg0) {
        int var2 = 91 / ((-arg0 - 81) / 33);
        if (this.field3457 > 0) {
            this.field3469.method3932(this.field3459, this.field3457, (byte) -2);
            this.field3457 = -1;
        }
        field3473++;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)J", line = 103)
    public final long method1590(int arg0) {
        field3472++;
        int var2 = -126 % ((arg0 - 45) / 62);
        return this.field3457 == 0 ? this.field3464.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 115)
    public final void method1591(byte arg0) {
        if (arg0 != -31) {
            this.method1594(null, -107, true);
        }
        field3456++;
        if (this.field3469.field9951) {
            OpenGL.glBindBufferARB(this.field3458, this.field3457);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V", line = 129)
    public static final void method1592(byte arg0, int arg1) {
        class425.field6217 = -1;
        class519.field7277 = -1;
        class108.field1617 = arg1;
        if (arg0 < 27) {
            field3474 = 33;
        }
        field3466++;
        class103.method734((byte) 23);
    }

    @OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V", line = 145)
    protected final void finalize() throws Throwable {
        this.method987(-118);
        field3471++;
        super.finalize();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljaggl/MapBuffer;ZB)Ljaclib/memory/Buffer;", line = 158)
    public final Buffer method1593(MapBuffer arg0, boolean arg1, byte arg2) {
        field3460++;
        if (this.field3468 == 0) {
            this.method1589(12636);
            if (this.field3457 <= 0) {
                this.field3468 = 2;
                return this.field3464;
            }
            OpenGL.glBindBufferARB(this.field3458, this.field3457);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field3458, this.field3463, null, 0, this.field3467 ? 35040 : 35044);
                if (this.field3469.field7614.field4891 >= this.field3459) {
                    this.field3468 = 1;
                    return this.field3469.field7614;
                }
            }
            if (!arg0.method165() && arg0.method162(this.field3458, this.field3459, 35001)) {
                this.field3468 = 2;
                return arg0;
            }
        }
        if (arg2 != -37) {
            this.method1591((byte) 58);
        }
        return null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V", line = 203)
    public void method984(int arg0, int arg1) {
        if (arg1 <= 119) {
            return;
        }
        field3462++;
        if (this.field3463 < arg0) {
            this.method1589(12636);
            if (this.field3457 <= 0) {
                this.field3464 = this.field3469.method2996(false, arg0, 23);
            } else {
                OpenGL.glBindBufferARB(this.field3458, this.field3457);
                OpenGL.glBufferDataARBub(this.field3458, arg0, null, 0, this.field3467 ? 35040 : 35044);
                this.field3469.field7668 += arg0 - this.field3463;
            }
            this.field3463 = arg0;
        }
        this.field3459 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljaclib/memory/Source;IZ)Z", line = 236)
    public final boolean method1594(Source arg0, int arg1, boolean arg2) {
        field3461++;
        if (arg2) {
            this.method1593(null, true, (byte) 19);
        }
        if (this.field3463 < arg1) {
            this.method1589(12636);
            if (this.field3457 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3458, this.field3457);
            OpenGL.glBufferDataARBa(this.field3458, arg1, arg0.getAddress(), this.field3467 ? 35040 : 35044);
            this.field3469.field7668 += arg1 - this.field3459;
            this.field3463 = arg1;
        } else if (this.field3457 > 0) {
            OpenGL.glBindBufferARB(this.field3458, this.field3457);
            OpenGL.glBufferSubDataARBa(this.field3458, 0, this.field3459, arg0.getAddress());
            this.field3469.field7668 += arg1 - this.field3459;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field3459 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILmq;)I", line = 277)
    public static final int method1595(int arg0, class71 arg1) {
        field3455++;
        int var2 = arg1.field1113;
        class589 var3 = arg1.method2957(true);
        if (~arg1.field7334 == arg0 || arg1.field7404) {
            var2 = arg1.field1127;
        } else if (arg1.field7334 == var3.field8562 || arg1.field7334 == var3.field8572 || arg1.field7334 == var3.field8579 || arg1.field7334 == var3.field8575) {
            var2 = arg1.field1134;
        } else if (arg1.field7334 == var3.field8543 || arg1.field7334 == var3.field8554 || arg1.field7334 == var3.field8557 || arg1.field7334 == var3.field8539) {
            var2 = arg1.field1110;
        }
        return var2;
    }
}
