import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public abstract class class616 implements class138 {

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    private int field8360 = 0;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
    private int field8366 = -1;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "Lel;")
    private class513 field8362;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    private int field8368;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
    private boolean field8363;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Z")
    public static boolean field8364 = false;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    private int field8359;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    private int field8365;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lta;")
    public static class201 field8348;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8354;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    private final void method3436(int arg0) {
        field8355++;
        if (arg0 <= this.field8366) {
            return;
        }
        if (this.field8362.field6525) {
            OpenGL.glGenBuffersARB(1, class77.field1001, 0);
            this.field8366 = class77.field1001[0];
            OpenGL.glBindBufferARB(this.field8368, this.field8366);
        } else {
            this.field8366 = 0;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z")
    public final boolean method3437(int arg0, Source arg1, int arg2) {
        field8351++;
        if (arg2 >= -88) {
            this.method3439(-111);
        }
        if (this.field8365 < arg0) {
            this.method3436(0);
            if (this.field8366 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8368, this.field8366);
            OpenGL.glBufferDataARBa(this.field8368, arg0, arg1.getAddress(), this.field8363 ? 35040 : 35044);
            this.field8362.field2768 += arg0 - this.field8359;
            this.field8365 = arg0;
        } else if (this.field8366 > 0) {
            OpenGL.glBindBufferARB(this.field8368, this.field8366);
            OpenGL.glBufferSubDataARBa(this.field8368, 0, this.field8359, arg1.getAddress());
            this.field8362.field2768 += arg0 - this.field8359;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field8359 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
    public final void method3438(byte arg0) {
        if (this.field8362.field6525) {
            OpenGL.glBindBufferARB(this.field8368, this.field8366);
        }
        if (arg0 != 46) {
            field8364 = true;
        }
        field8358++;
    }

    @OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8350++;
        this.method60(5634);
        super.finalize();
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public void method60(int arg0) {
        field8357++;
        if (this.field8366 > 0) {
            this.field8362.method2791(this.field8359, this.field8366, arg0 - 5516);
            this.field8366 = -1;
        }
        if (arg0 != 5634) {
            this.field8363 = true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
    public void method59(int arg0, int arg1) {
        field8356++;
        if (this.field8365 < arg1) {
            this.method3436(arg0 ^ 0xFFFF8CA7);
            if (this.field8366 > 0) {
                OpenGL.glBindBufferARB(this.field8368, this.field8366);
                OpenGL.glBufferDataARBub(this.field8368, arg1, null, 0, this.field8363 ? 35040 : 35044);
                this.field8362.field2768 += arg1 - this.field8365;
            } else {
                this.field8354 = this.field8362.method1288(false, arg1, -118);
            }
            this.field8365 = arg1;
        }
        this.field8359 = arg1;
        if (arg0 != -29529) {
            field8364 = true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)I")
    public int method503(int arg0) {
        field8352++;
        return arg0 == -3267 ? this.field8359 : 44;
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)J")
    public final long method3439(int arg0) {
        if (arg0 == -1) {
            field8353++;
            return this.field8366 == 0 ? this.field8354.getAddress() : 0L;
        } else {
            return 92L;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Z")
    public boolean method61(byte arg0) {
        if (arg0 != 96) {
            this.method60(0);
        }
        field8361++;
        boolean var2 = true;
        if (this.field8360 != 0) {
            if (this.field8366 > 0) {
                OpenGL.glBindBufferARB(this.field8368, this.field8366);
                if (this.field8360 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8368, 0, this.field8365, this.field8362.field2670.getAddress());
                } else {
                    var2 = this.field8362.field6523.method3241();
                }
            }
            this.field8360 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public Buffer method62(boolean arg0, boolean arg1) {
        field8367++;
        if (!arg0) {
            this.method3436(5);
        }
        if (this.field8360 == 0) {
            this.method3436(0);
            if (this.field8366 <= 0) {
                this.field8360 = 2;
                return this.field8354;
            }
            OpenGL.glBindBufferARB(this.field8368, this.field8366);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field8368, this.field8365, null, 0, this.field8363 ? 35040 : 35044);
                if (this.field8359 <= this.field8362.field2670.field8538) {
                    this.field8360 = 1;
                    return this.field8362.field2670;
                }
            }
            MapBuffer var3 = this.field8362.field6523;
            if (!var3.method3240() && var3.method3239(this.field8368, this.field8359, 35001)) {
                this.field8360 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(B)V")
    public static void method3440(byte arg0) {
        field8348 = null;
        if (arg0 != 26) {
            field8364 = true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lel;IZ)V")
    public class616(class513 arg0, int arg1, boolean arg2) {
        this.field8362 = arg0;
        this.field8368 = arg1;
        this.field8363 = arg2;
    }
}
