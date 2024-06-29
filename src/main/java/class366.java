import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class366 implements class231 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[Ldg;")
    private class10[] field5375 = new class10[9];

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lcg;")
    private class393 field5376;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    private int field5370;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    private static int[] field5372 = new int[1];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    private static int[] field5373 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private int field5374;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    private int field5377;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()Z")
    public final boolean method2196() {
        int var1 = this.field5376.field5783.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5376.method2476(this.field5370);
        super.finalize();
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
    public final void method1400() {
        this.field5376.field5783.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILgm;II)V")
    private final void method2197(int arg0, class92 arg1, int arg2, int arg3) {
        if (this.field5376.method2468() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field5374 & ~var5) == 0) {
            this.field5371 = arg1.field1294;
            this.field5377 = arg1.field1294;
        } else if (this.field5371 != arg1.field1294 || this.field5377 != arg1.field1294) {
            throw new RuntimeException();
        }
        arg1.method600(field5373[arg0], arg2, arg3);
        this.field5375[arg0] = arg1;
        this.field5374 |= var5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILpq;)V")
    public final void method2198(int arg0, class46 arg1) {
        this.method2199(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILpq;I)V")
    private final void method2199(int arg0, class46 arg1, int arg2) {
        if (this.field5376.method2468() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field5374 & ~var4) == 0) {
            this.field5371 = arg1.field569;
            this.field5377 = arg1.field567;
        } else if (this.field5371 != arg1.field569 || this.field5377 != arg1.field567) {
            throw new RuntimeException();
        }
        arg1.method262(field5373[arg0], arg2);
        this.field5375[arg0] = arg1;
        this.field5374 |= var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public final void method1399() {
        this.field5376.field5783.glBindFramebufferEXT(36160, this.field5370);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method2200(int arg0) {
        if (this.field5375[arg0] != null) {
            this.field5375[arg0].method70();
        }
        this.field5374 &= ~(0x1 << arg0);
        this.field5375[arg0] = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILue;)V")
    public final void method2201(int arg0, class329 arg1) {
        if (this.field5376.method2468() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field5374 & ~var3) == 0) {
            this.field5371 = arg1.field4932;
            this.field5377 = arg1.field4939;
        } else if (this.field5371 != arg1.field4932 || this.field5377 != arg1.field4939) {
            throw new RuntimeException();
        }
        arg1.method2026(field5373[arg0]);
        this.field5375[arg0] = arg1;
        this.field5374 |= var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILgm;I)V")
    public final void method2202(int arg0, class92 arg1, int arg2) {
        this.method2197(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
    public final int method1401() {
        return this.field5377;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lcg;)V")
    public class366(class393 arg0) {
        if (!arg0.field5895) {
            throw new IllegalStateException("");
        }
        this.field5376 = arg0;
        this.field5376.field5783.glGenFramebuffersEXT(1, field5372, 0);
        this.field5370 = field5372[0];
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public final void method2203(int arg0) {
        if (this.field5376.method2468() != this) {
            throw new RuntimeException();
        }
        this.field5376.field5783.glDrawBuffer(field5373[arg0]);
    }
}
