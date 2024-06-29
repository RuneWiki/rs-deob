import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class288 implements class183 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[Laq;")
    private class101[] field4201 = new class101[9];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lmi;")
    private class315 field4203;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
    private static int[] field4197 = new int[1];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    private static int[] field4199 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public final void method1138() {
        this.field4203.field4445.glBindFramebufferEXT(36160, this.field4196);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()V")
    public final void method1140() {
        this.field4203.field4445.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final int method1139() {
        return this.field4202;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILkh;I)V")
    private final void method1798(int arg0, class13 arg1, int arg2) {
        if (this.field4203.method2011() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field4200 & ~var4) == 0) {
            this.field4198 = arg1.field146;
            this.field4202 = arg1.field145;
        } else if (this.field4198 != arg1.field146 || this.field4202 != arg1.field145) {
            throw new RuntimeException();
        }
        arg1.method97(field4199[arg0], arg2);
        this.field4201[arg0] = arg1;
        this.field4200 |= var4;
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4203.method1981(this.field4196);
        super.finalize();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILkh;)V")
    public final void method1799(int arg0, class13 arg1) {
        this.method1798(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method1800(int arg0) {
        if (this.field4203.method2011() != this) {
            throw new RuntimeException();
        }
        this.field4203.field4445.glDrawBuffer(field4199[arg0]);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILnq;II)V")
    private final void method1801(int arg0, class294 arg1, int arg2, int arg3) {
        if (this.field4203.method2011() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field4200 & ~var5) == 0) {
            this.field4198 = arg1.field4258;
            this.field4202 = arg1.field4258;
        } else if (this.field4198 != arg1.field4258 || this.field4202 != arg1.field4258) {
            throw new RuntimeException();
        }
        arg1.method1828(field4199[arg0], arg2, arg3);
        this.field4201[arg0] = arg1;
        this.field4200 |= var5;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILnq;I)V")
    public final void method1802(int arg0, class294 arg1, int arg2) {
        this.method1801(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILhb;)V")
    public final void method1803(int arg0, class471 arg1) {
        if (this.field4203.method2011() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field4200 & ~var3) == 0) {
            this.field4198 = arg1.field6631;
            this.field4202 = arg1.field6630;
        } else if (this.field4198 != arg1.field6631 || this.field4202 != arg1.field6630) {
            throw new RuntimeException();
        }
        arg1.method2774(field4199[arg0]);
        this.field4201[arg0] = arg1;
        this.field4200 |= var3;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()Z")
    public final boolean method1804() {
        int var1 = this.field4203.field4445.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public final void method1805(int arg0) {
        if (this.field4201[arg0] != null) {
            this.field4201[arg0].method95();
        }
        this.field4200 &= ~(0x1 << arg0);
        this.field4201[arg0] = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lmi;)V")
    public class288(class315 arg0) {
        if (!arg0.field4579) {
            throw new IllegalStateException("");
        }
        this.field4203 = arg0;
        this.field4203.field4445.glGenFramebuffersEXT(1, field4197, 0);
        this.field4196 = field4197[0];
    }
}
