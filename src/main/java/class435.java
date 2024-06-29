import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class435 implements class264 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Laq;")
    private class101[] field5910 = new class101[9];

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lbf;")
    private class344 field5915;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    private static int[] field5911 = new int[1];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    private static int[] field5914 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    private int field5908;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    private int field5909;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    private int field5912;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILal;)V")
    public final void method2561(int arg0, class58 arg1) {
        this.method2564(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILqd;II)V")
    private final void method2562(int arg0, class286 arg1, int arg2, int arg3) {
        if (this.field5915.method2049() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field5912 & ~var5) == 0) {
            this.field5909 = arg1.field3873;
            this.field5908 = arg1.field3873;
        } else if (this.field5909 != arg1.field3873 || this.field5908 != arg1.field3873) {
            throw new RuntimeException();
        }
        arg1.method1618(field5914[arg0], arg2, arg3);
        this.field5910[arg0] = arg1;
        this.field5912 |= var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method2563(int arg0) {
        if (this.field5915.method2049() != this) {
            throw new RuntimeException();
        }
        this.field5915.field4604.glDrawBuffer(field5914[arg0]);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILal;I)V")
    private final void method2564(int arg0, class58 arg1, int arg2) {
        if (this.field5915.method2049() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field5912 & ~var4) == 0) {
            this.field5909 = arg1.field782;
            this.field5908 = arg1.field783;
        } else if (this.field5909 != arg1.field782 || this.field5908 != arg1.field783) {
            throw new RuntimeException();
        }
        arg1.method416(field5914[arg0], arg2);
        this.field5910[arg0] = arg1;
        this.field5912 |= var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public final void method1495() {
        this.field5915.field4604.glBindFramebufferEXT(36160, this.field5913);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public final void method1496() {
        this.field5915.field4604.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method2565(int arg0) {
        if (this.field5910[arg0] != null) {
            this.field5910[arg0].method411();
        }
        this.field5912 &= ~(0x1 << arg0);
        this.field5910[arg0] = null;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()Z")
    public final boolean method2566() {
        int var1 = this.field5915.field4604.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5915.method2053(this.field5913);
        super.finalize();
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()I")
    public final int method1497() {
        return this.field5908;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILpq;)V")
    public final void method2567(int arg0, class116 arg1) {
        if (this.field5915.method2049() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field5912 & ~var3) == 0) {
            this.field5909 = arg1.field1725;
            this.field5908 = arg1.field1722;
        } else if (this.field5909 != arg1.field1725 || this.field5908 != arg1.field1722) {
            throw new RuntimeException();
        }
        arg1.method733(field5914[arg0]);
        this.field5910[arg0] = arg1;
        this.field5912 |= var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lbf;)V")
    public class435(class344 arg0) {
        if (!arg0.field4656) {
            throw new IllegalStateException("");
        }
        this.field5915 = arg0;
        this.field5915.field4604.glGenFramebuffersEXT(1, field5911, 0);
        this.field5913 = field5911[0];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILqd;I)V")
    public final void method2568(int arg0, class286 arg1, int arg2) {
        this.method2562(arg0, arg1, 0, arg2);
    }
}
