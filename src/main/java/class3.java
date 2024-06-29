import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 implements class73 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lhh;")
    private class184[] field18 = new class184[9];

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lmm;")
    private class357 field20;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    private static int[] field19 = new int[1];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
    private static int[] field22 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfb;)V", line = 4)
    public final void method7(int arg0, class45 arg1) {
        if (this.field20.method2211() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field21 & ~var3) == 0) {
            this.field24 = arg1.field580;
            this.field23 = arg1.field582;
        } else if (this.field24 != arg1.field580 || this.field23 != arg1.field582) {
            throw new RuntimeException();
        }
        arg1.method375(field22[arg0]);
        this.field18[arg0] = arg1;
        this.field21 |= var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfq;II)V", line = 26)
    private final void method8(int arg0, class180 arg1, int arg2, int arg3) {
        if (this.field20.method2211() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field21 & ~var5) == 0) {
            this.field24 = arg1.field2553;
            this.field23 = arg1.field2553;
        } else if (this.field24 != arg1.field2553 || this.field23 != arg1.field2553) {
            throw new RuntimeException();
        }
        arg1.method1268(field22[arg0], arg2, arg3);
        this.field18[arg0] = arg1;
        this.field21 |= var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILhn;)V", line = 50)
    public final void method9(int arg0, class257 arg1) {
        this.method14(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        this.field20.method2144(this.field25);
        super.finalize();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 61)
    public final void method10(int arg0) {
        if (this.field20.method2211() != this) {
            throw new RuntimeException();
        }
        this.field20.field4794.glDrawBuffer(field22[arg0]);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lmm;)V", line = 131)
    public class3(class357 arg0) {
        if (!arg0.field4833) {
            throw new IllegalStateException("");
        }
        this.field20 = arg0;
        this.field20.field4794.glGenFramebuffersEXT(1, field19, 0);
        this.field25 = field19[0];
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()V", line = 72)
    public final void method11() {
        this.field20.field4794.glBindFramebufferEXT(36160, this.field25);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()I", line = 75)
    public final int method12() {
        return this.field23;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 78)
    public final void method13(int arg0) {
        if (this.field18[arg0] != null) {
            this.field18[arg0].method377();
        }
        this.field21 &= ~(0x1 << arg0);
        this.field18[arg0] = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILhn;I)V", line = 85)
    private final void method14(int arg0, class257 arg1, int arg2) {
        if (this.field20.method2211() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field21 & ~var4) == 0) {
            this.field24 = arg1.field3570;
            this.field23 = arg1.field3571;
        } else if (this.field24 != arg1.field3570 || this.field23 != arg1.field3571) {
            throw new RuntimeException();
        }
        arg1.method1660(field22[arg0], arg2);
        this.field18[arg0] = arg1;
        this.field21 |= var4;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()Z", line = 108)
    public final boolean method15() {
        int var1 = this.field20.field4794.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfq;I)V", line = 119)
    public final void method16(int arg0, class180 arg1, int arg2) {
        this.method8(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 127)
    public final void method17() {
        this.field20.field4794.glBindFramebufferEXT(36160, 0);
    }
}
