import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class337 implements class219 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[Lqp;")
    private class279[] field4568 = new class279[9];

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lhd;")
    private class17 field4572;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    private static int[] field4566 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    private static int[] field4571 = new int[1];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field4567;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    private int field4569;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILm;II)V", line = 4)
    private final void method2133(int arg0, class181 arg1, int arg2, int arg3) {
        if (this.field4572.method225() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field4569 & ~var5) == 0) {
            this.field4570 = arg1.field2643;
            this.field4567 = arg1.field2643;
        } else if (this.field4570 != arg1.field2643 || this.field4567 != arg1.field2643) {
            throw new RuntimeException();
        }
        arg1.method1330(field4566[arg0], arg2, arg3);
        this.field4568[arg0] = arg1;
        this.field4569 |= var5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILsr;)V", line = 26)
    public final void method2134(int arg0, class136 arg1) {
        if (this.field4572.method225() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field4569 & ~var3) == 0) {
            this.field4570 = arg1.field1933;
            this.field4567 = arg1.field1937;
        } else if (this.field4570 != arg1.field1933 || this.field4567 != arg1.field1937) {
            throw new RuntimeException();
        }
        arg1.method1078(field4566[arg0]);
        this.field4568[arg0] = arg1;
        this.field4569 |= var3;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()Z", line = 49)
    public final boolean method2135() {
        int var1 = this.field4572.field198.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!gm", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        this.field4572.method97(this.field4565);
        super.finalize();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILhj;II)V", line = 66)
    private final void method2136(int arg0, class106 arg1, int arg2, int arg3) {
        if (this.field4572.method225() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field4569 & ~var5) == 0) {
            this.field4570 = arg1.field1553;
            this.field4567 = arg1.field1554;
        } else if (this.field4570 != arg1.field1553 || this.field4567 != arg1.field1554) {
            throw new RuntimeException();
        }
        arg1.method890(field4566[arg0], arg2, arg3);
        this.field4568[arg0] = arg1;
        this.field4569 |= var5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 90)
    public final void method2137(int arg0) {
        if (this.field4572.method225() != this) {
            throw new RuntimeException();
        }
        this.field4572.field198.glDrawBuffer(field4566[arg0]);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lhd;)V", line = 157)
    public class337(class17 arg0) {
        if (!arg0.field295) {
            throw new IllegalStateException("");
        }
        this.field4572 = arg0;
        this.field4572.field198.glGenFramebuffersEXT(1, field4571, 0);
        this.field4565 = field4571[0];
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 108)
    public final void method2138(int arg0) {
        if (this.field4568[arg0] != null) {
            this.field4568[arg0].method889();
        }
        this.field4569 &= ~(0x1 << arg0);
        this.field4568[arg0] = null;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()I", line = 116)
    public final int method185() {
        return this.field4567;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILhj;I)V", line = 119)
    public final void method2139(int arg0, class106 arg1, int arg2) {
        this.method2136(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILoe;)V", line = 122)
    public final void method2140(int arg0, class231 arg1) {
        this.method2142(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 125)
    public final void method135() {
        this.field4572.field198.glBindFramebufferEXT(36160, this.field4565);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILm;I)V", line = 129)
    public final void method2141(int arg0, class181 arg1, int arg2) {
        this.method2133(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILoe;I)V", line = 132)
    private final void method2142(int arg0, class231 arg1, int arg2) {
        if (this.field4572.method225() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field4569 & ~var4) == 0) {
            this.field4570 = arg1.field3193;
            this.field4567 = arg1.field3192;
        } else if (this.field4570 != arg1.field3193 || this.field4567 != arg1.field3192) {
            throw new RuntimeException();
        }
        arg1.method1546(field4566[arg0], arg2);
        this.field4568[arg0] = arg1;
        this.field4569 |= var4;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 154)
    public final void method94() {
        this.field4572.field198.glBindFramebufferEXT(36160, 0);
    }
}
