import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class80 implements class107 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[Lrq;")
    private class194[] field939 = new class194[9];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lao;")
    private class157 field935;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    private static int[] field934 = new int[1];

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
    private static int[] field936 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public final void method444() {
        this.field935.field1927.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILrj;)V")
    public final void method445(int arg0, class354 arg1) {
        this.method446(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILrj;I)V")
    private final void method446(int arg0, class354 arg1, int arg2) {
        if (this.field935.method970() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field938 & ~var4) == 0) {
            this.field937 = arg1.field4987;
            this.field940 = arg1.field4986;
        } else if (this.field937 != arg1.field4987 || this.field940 != arg1.field4986) {
            throw new RuntimeException();
        }
        arg1.method2250(field936[arg0], arg2);
        this.field939[arg0] = arg1;
        this.field938 |= var4;
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field935.method945(this.field941);
        super.finalize();
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()Z")
    public final boolean method447() {
        int var1 = this.field935.field1927.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILvk;II)V")
    private final void method448(int arg0, class206 arg1, int arg2, int arg3) {
        if (this.field935.method970() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field938 & ~var5) == 0) {
            this.field937 = arg1.field2934;
            this.field940 = arg1.field2934;
        } else if (this.field937 != arg1.field2934 || this.field940 != arg1.field2934) {
            throw new RuntimeException();
        }
        arg1.method1355(field936[arg0], arg2, arg3);
        this.field939[arg0] = arg1;
        this.field938 |= var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        if (this.field939[arg0] != null) {
            this.field939[arg0].method44();
        }
        this.field938 &= ~(0x1 << arg0);
        this.field939[arg0] = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
    public final void method450() {
        this.field935.field1927.glBindFramebufferEXT(36160, this.field941);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()I")
    public final int method451() {
        return this.field940;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILvk;I)V")
    public final void method452(int arg0, class206 arg1, int arg2) {
        this.method448(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILto;)V")
    public final void method453(int arg0, class6 arg1) {
        if (this.field935.method970() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field938 & ~var3) == 0) {
            this.field937 = arg1.field92;
            this.field940 = arg1.field91;
        } else if (this.field937 != arg1.field92 || this.field940 != arg1.field91) {
            throw new RuntimeException();
        }
        arg1.method46(field936[arg0]);
        this.field939[arg0] = arg1;
        this.field938 |= var3;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method454(int arg0) {
        if (this.field935.method970() != this) {
            throw new RuntimeException();
        }
        this.field935.field1927.glDrawBuffer(field936[arg0]);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lao;)V")
    public class80(class157 arg0) {
        if (!arg0.field2016) {
            throw new IllegalStateException("");
        }
        this.field935 = arg0;
        this.field935.field1927.glGenFramebuffersEXT(1, field934, 0);
        this.field941 = field934[0];
    }
}
