import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class class262 implements class623 {

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    private int field3670 = -1;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    private int field3672 = 0;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "Z")
    private boolean field3673;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "Loia;")
    public class97 field3680;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
    private int field3678;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "[I")
    public static int[] field3671 = new int[8];

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field3675 = 0;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "Lkka;")
    public static class329 field3679 = new class329(7500);

    @OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
    public static int field3684 = 999999;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    private int field3667;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!cca", name = "t", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!cca", name = "u", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!cca", name = "v", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!cca", name = "x", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!cca", name = "y", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3663;

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "[Lia;")
    public static class616[] field3687;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)J")
    public final long method1710(byte arg0) {
        if (arg0 != 74) {
            method1715(-93);
        }
        field3674++;
        return this.field3670 == 0 ? this.field3663.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!cca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1543(-21647);
        field3683++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljaggl/MapBuffer;BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1711(MapBuffer arg0, byte arg1, boolean arg2) {
        field3666++;
        if (this.field3672 == 0) {
            this.method1717(126);
            if (this.field3670 <= 0) {
                this.field3672 = 2;
                return this.field3663;
            }
            OpenGL.glBindBufferARB(this.field3678, this.field3670);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field3678, this.field3667, null, 0, this.field3673 ? 35040 : 35044);
                if (this.field3680.field7488.field9656 >= this.field3685) {
                    this.field3672 = 1;
                    return this.field3680.field7488;
                }
            }
            if (!arg0.method3670() && arg0.method3669(this.field3678, this.field3685, 35001)) {
                this.field3672 = 2;
                return arg0;
            }
        }
        int var4 = 9 / ((arg1 - 12) / 61);
        return null;
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)V")
    public static void method1712(int arg0) {
        if (arg0 < 50) {
            method1715(119);
        }
        field3687 = null;
        field3679 = null;
        field3671 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public void method1543(int arg0) {
        if (this.field3670 > 0) {
            this.field3680.method815(93, this.field3685, this.field3670);
            this.field3670 = -1;
        }
        field3664++;
        if (arg0 != -21647) {
            this.method1713(117, null, false);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjaclib/memory/Source;Z)Z")
    public final boolean method1713(int arg0, Source arg1, boolean arg2) {
        if (arg2) {
            return true;
        }
        field3662++;
        if (arg0 > this.field3667) {
            this.method1717(123);
            if (this.field3670 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3678, this.field3670);
            OpenGL.glBufferDataARBa(this.field3678, arg0, arg1.getAddress(), this.field3673 ? 35040 : 35044);
            this.field3680.field7665 += arg0 - this.field3685;
            this.field3667 = arg0;
        } else if (this.field3670 > 0) {
            OpenGL.glBindBufferARB(this.field3678, this.field3670);
            OpenGL.glBufferSubDataARBa(this.field3678, 0, this.field3685, arg1.getAddress());
            this.field3680.field7665 += arg0 - this.field3685;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field3685 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public final void method1714(boolean arg0) {
        if (this.field3680.field1596) {
            OpenGL.glBindBufferARB(this.field3678, this.field3670);
        }
        if (arg0) {
            field3677++;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
    public void method1546(int arg0, int arg1) {
        field3668++;
        if (arg0 > this.field3667) {
            this.method1717(arg1 ^ 0x3575);
            if (this.field3670 > 0) {
                OpenGL.glBindBufferARB(this.field3678, this.field3670);
                OpenGL.glBufferDataARBub(this.field3678, arg0, null, 0, this.field3673 ? 35040 : 35044);
                this.field3680.field7665 += arg0 - this.field3667;
            } else {
                this.field3663 = this.field3680.method3161(true, arg0, false);
            }
            this.field3667 = arg0;
        }
        if (arg1 != -13659) {
            field3669 = 96;
        }
        this.field3685 = arg0;
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)I")
    public static final int method1715(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class360.field4913 - 1; var2++) {
            if (arg0 < class720.field9895[var2] + class324.field4438[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class360.field4913 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljaggl/MapBuffer;B)Z")
    public final boolean method1716(MapBuffer arg0, byte arg1) {
        field3676++;
        boolean var3 = true;
        if (arg1 != -113) {
            this.method1713(-68, null, true);
        }
        if (this.field3672 != 0) {
            if (this.field3670 > 0) {
                OpenGL.glBindBufferARB(this.field3678, this.field3670);
                if (this.field3672 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3678, 0, this.field3667, this.field3680.field7488.getAddress());
                } else {
                    var3 = arg0.method3668();
                }
            }
            this.field3672 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)V")
    private final void method1717(int arg0) {
        field3686++;
        if (this.field3670 >= 0) {
            return;
        }
        int var2 = -52 / ((66 - arg0) / 57);
        if (this.field3680.field1596) {
            OpenGL.glGenBuffersARB(1, class521.field7070, 0);
            this.field3670 = class521.field7070[0];
            OpenGL.glBindBufferARB(this.field3678, this.field3670);
        } else {
            this.field3670 = 0;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)I")
    public int method1638(byte arg0) {
        field3665++;
        int var2 = -63 / ((arg0 - 14) / 43);
        return this.field3685;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Loia;IZ)V")
    public class262(class97 arg0, int arg1, boolean arg2) {
        this.field3673 = arg2;
        this.field3680 = arg0;
        this.field3678 = arg1;
    }
}
