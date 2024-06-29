import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class class626 implements class367 {

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    private int field8874 = 0;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
    private int field8888 = -1;

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "Lnfa;")
    private class621 field8890;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Z")
    private boolean field8872;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    private int field8875;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Ljava/util/Random;")
    public static Random field8884 = new Random();

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "F")
    public static float field8893;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    private int field8881;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    private int field8891;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "Lpe;")
    public static class556 field8889;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8877;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)J", line = 6)
    public final long method3506(int arg0) {
        if (arg0 > -50) {
            return 61L;
        } else {
            field8887++;
            return this.field8888 == 0 ? this.field8877.getAddress() : 0L;
        }
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V", line = 18)
    public final void method3507(int arg0) {
        if (this.field8890.field8820) {
            OpenGL.glBindBufferARB(this.field8875, this.field8888);
        }
        field8879++;
        int var2 = 75 / ((-arg0 - 31) / 50);
    }

    @OriginalMember(owner = "client!jca", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        field8873++;
        this.method166((byte) -78);
        super.finalize();
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 42)
    public Buffer method167(int arg0, boolean arg1) {
        field8883++;
        if (this.field8874 == 0) {
            this.method3511((byte) -72);
            if (this.field8888 <= 0) {
                this.field8874 = 2;
                return this.field8877;
            }
            OpenGL.glBindBufferARB(this.field8875, this.field8888);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field8875, this.field8891, null, 0, this.field8872 ? 35040 : 35044);
                if (this.field8881 <= this.field8890.field6692.field8663) {
                    this.field8874 = 1;
                    return this.field8890.field6692;
                }
            }
            MapBuffer var3 = this.field8890.field8812;
            if (!var3.method3215() && var3.method3214(this.field8875, this.field8881, 35001)) {
                this.field8874 = 2;
                return var3;
            }
        }
        return arg0 == 18829 ? null : null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)I", line = 93)
    public static final int method3508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8876++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg4;
            arg4 = var7;
        }
        if (arg0 > -104) {
            return 72;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return (7 - arg5) + 1 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg4;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V", line = 126)
    public void method166(byte arg0) {
        if (this.field8888 > 0) {
            this.field8890.method3485(this.field8881, (byte) 44, this.field8888);
            this.field8888 = -1;
        }
        field8878++;
        int var2 = 101 % ((arg0 - 3) / 39);
    }

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "(I)V", line = 143)
    public static void method3509(int arg0) {
        field8889 = null;
        if (arg0 != -27809) {
            field8895 = 25;
        }
        field8884 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V", line = 154)
    public void method1024(int arg0, int arg1) {
        field8885++;
        int var3 = -120 % ((arg0 - 63) / 40);
        if (arg1 > this.field8891) {
            this.method3511((byte) 54);
            if (this.field8888 > 0) {
                OpenGL.glBindBufferARB(this.field8875, this.field8888);
                OpenGL.glBufferDataARBub(this.field8875, arg1, null, 0, this.field8872 ? 35040 : 35044);
                this.field8890.field6776 += arg1 - this.field8891;
            } else {
                this.field8877 = this.field8890.method2684((byte) -81, arg1, false);
            }
            this.field8891 = arg1;
        }
        this.field8881 = arg1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIB)Z", line = 183)
    public static final boolean method3510(int arg0, int arg1, byte arg2) {
        field8894++;
        if (arg2 < 29) {
            field8884 = null;
        }
        return class323.method1825(arg1, 16, arg0) & class415.method2245(-117, arg1, arg0);
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V", line = 197)
    private final void method3511(byte arg0) {
        field8882++;
        if (this.field8888 >= 0) {
            return;
        }
        if (this.field8890.field8820) {
            OpenGL.glGenBuffersARB(1, class210.field2551, 0);
            this.field8888 = class210.field2551[0];
            OpenGL.glBindBufferARB(this.field8875, this.field8888);
        } else {
            this.field8888 = 0;
        }
        int var2 = -112 % ((arg0 + 7) / 54);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "()V", line = 224)
    public static final void method3512() {
        for (int var0 = 0; var0 < class474.field6910; var0++) {
            class354 var1 = class304.field3979[var0];
            class393.method2143(var1);
            class304.field3979[var0] = null;
        }
        class474.field6910 = 0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I", line = 241)
    public int method737(byte arg0) {
        int var2 = 4 % ((arg0 + 24) / 50);
        field8871++;
        return this.field8881;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 253)
    public final boolean method3513(Source arg0, int arg1, int arg2) {
        field8870++;
        if (arg2 > this.field8891) {
            this.method3511((byte) 95);
            if (this.field8888 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8875, this.field8888);
            OpenGL.glBufferDataARBa(this.field8875, arg2, arg0.getAddress(), this.field8872 ? 35040 : 35044);
            this.field8890.field6776 += arg2 - this.field8881;
            this.field8891 = arg2;
        } else if (this.field8888 > 0) {
            OpenGL.glBindBufferARB(this.field8875, this.field8888);
            OpenGL.glBufferSubDataARBa(this.field8875, 0, this.field8881, arg0.getAddress());
            this.field8890.field6776 += arg2 - this.field8881;
        } else {
            throw new RuntimeException("ARGH!");
        }
        if (arg1 == 0) {
            this.field8881 = arg2;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 297)
    public static final String[] method3514(int arg0, String[] arg1) {
        field8880++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lnfa;IZ)V", line = 367)
    public class626(class621 arg0, int arg1, boolean arg2) {
        this.field8890 = arg0;
        this.field8872 = arg2;
        this.field8875 = arg1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z", line = 324)
    public boolean method170(int arg0) {
        if (arg0 != 9406) {
            return true;
        }
        field8886++;
        boolean var2 = true;
        if (this.field8874 != 0) {
            if (this.field8888 > 0) {
                OpenGL.glBindBufferARB(this.field8875, this.field8888);
                if (this.field8874 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8875, 0, this.field8891, this.field8890.field6692.getAddress());
                } else {
                    var2 = this.field8890.field8812.method3213();
                }
            }
            this.field8874 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)I", line = 378)
    public static final int method3515(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field8892++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg3 > -87) {
            field8884 = null;
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg1;
        }
    }
}
