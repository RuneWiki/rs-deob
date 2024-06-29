import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class401 implements class302 {

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    private int field5265 = -1;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    private int field5278 = 0;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
    private boolean field5272;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Ltm;")
    private class327 field5264;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field5268 = 999999;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    private int field5275;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5261;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 4)
    private final void method2293(int arg0) {
        field5266++;
        if (arg0 >= -17) {
            this.method441(105);
        }
        if (this.field5265 >= 0) {
            return;
        }
        if (this.field5264.field4263) {
            OpenGL.glGenBuffersARB(1, class315.field4015, 0);
            this.field5265 = class315.field4015[0];
            OpenGL.glBindBufferARB(this.field5274, this.field5265);
        } else {
            this.field5265 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 35)
    public void method644(int arg0, int arg1) {
        if (this.field5275 < arg1) {
            this.method2293(-26);
            if (this.field5265 > 0) {
                OpenGL.glBindBufferARB(this.field5274, this.field5265);
                OpenGL.glBufferDataARBub(this.field5274, arg1, null, 0, this.field5272 ? 35040 : 35044);
                this.field5264.field5689 += arg1 - this.field5275;
            } else {
                this.field5261 = this.field5264.method2451(false, arg1, true);
            }
            this.field5275 = arg1;
        }
        int var3 = -44 % ((arg0 + 49) / 60);
        field5280++;
        this.field5276 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 68)
    public final void method2294(boolean arg0) {
        if (this.field5264.field4263) {
            OpenGL.glBindBufferARB(this.field5274, this.field5265);
        }
        field5262++;
        if (!arg0) {
            this.field5278 = -78;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 82)
    public void method443(int arg0) {
        field5267++;
        if (arg0 != 23678) {
            this.method644(12, 9);
        }
        if (this.field5265 > 0) {
            this.field5264.method1842(this.field5276, (byte) -115, this.field5265);
            this.field5265 = -1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)J", line = 102)
    public final long method2295(int arg0) {
        if (arg0 != -1) {
            this.method2293(-113);
        }
        field5271++;
        return this.field5265 == 0 ? this.field5261.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ltm;IZ)V", line = 288)
    public class401(class327 arg0, int arg1, boolean arg2) {
        this.field5274 = arg1;
        this.field5272 = arg2;
        this.field5264 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 116)
    public int method441(int arg0) {
        field5273++;
        if (arg0 != 16304) {
            this.field5276 = 29;
        }
        return this.field5276;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 128)
    public final boolean method2296(Source arg0, int arg1, int arg2) {
        if (arg2 < 15) {
            this.method2293(-30);
        }
        field5269++;
        if (this.field5275 >= arg1) {
            if (this.field5265 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5274, this.field5265);
            OpenGL.glBufferSubDataARBa(this.field5274, 0, this.field5276, arg0.getAddress());
            this.field5264.field5689 += arg1 - this.field5276;
        } else {
            this.method2293(-119);
            if (this.field5265 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5274, this.field5265);
            OpenGL.glBufferDataARBa(this.field5274, arg1, arg0.getAddress(), this.field5272 ? 35040 : 35044);
            this.field5264.field5689 += arg1 - this.field5276;
            this.field5275 = arg1;
        }
        this.field5276 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lmh;ILjava/lang/String;I)Lnb;", line = 171)
    public static final class250 method2297(class537 arg0, int arg1, String arg2, int arg3) {
        field5277++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class561.field8248, arg3);
        if (class561.field8248[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class250(arg0, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 194)
    public Buffer method440(int arg0, boolean arg1) {
        field5270++;
        if (this.field5278 == 0) {
            this.method2293(-67);
            if (this.field5265 <= 0) {
                this.field5278 = 2;
                return this.field5261;
            }
            OpenGL.glBindBufferARB(this.field5274, this.field5265);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field5274, this.field5275, null, 0, this.field5272 ? 35040 : 35044);
                if (this.field5264.field5677.field8401 >= this.field5276) {
                    this.field5278 = 1;
                    return this.field5264.field5677;
                }
            }
            MapBuffer var3 = this.field5264.field4255;
            if (!var3.method3027() && var3.method3025(this.field5274, this.field5276, 35001)) {
                this.field5278 = 2;
                return var3;
            }
        }
        return arg0 > -97 ? null : null;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)Z", line = 242)
    public boolean method442(int arg0) {
        field5279++;
        boolean var2 = true;
        int var3 = -61 / (arg0 / 63);
        if (this.field5278 != 0) {
            if (this.field5265 > 0) {
                OpenGL.glBindBufferARB(this.field5274, this.field5265);
                if (this.field5278 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5274, 0, this.field5275, this.field5264.field5677.getAddress());
                } else {
                    var2 = this.field5264.field4255.method3026();
                }
            }
            this.field5278 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 276)
    protected final void finalize() throws Throwable {
        this.method443(23678);
        field5263++;
        super.finalize();
    }
}
