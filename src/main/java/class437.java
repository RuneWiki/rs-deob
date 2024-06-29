import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class437 implements class66 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[Lqg;")
    private class268[] field6423 = new class268[9];

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Lsq;")
    private class96 field6427;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    private static int[] field6424 = new int[1];

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
    private static int[] field6429 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field6422;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    private int field6426;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    private int field6428;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILrj;I)V", line = 5)
    public final void method2690(int arg0, class352 arg1, int arg2) {
        this.method2697(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 9)
    public final void method2691(int arg0) {
        if (this.field6423[arg0] != null) {
            this.field6423[arg0].method1824();
        }
        this.field6426 &= ~(0x1 << arg0);
        this.field6423[arg0] = null;
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        this.field6427.method595(this.field6425);
        super.finalize();
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V", line = 22)
    public final void method424() {
        this.field6427.field1156.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V", line = 28)
    public final void method423() {
        this.field6427.field1156.glBindFramebufferEXT(36160, this.field6425);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjn;)V", line = 31)
    public final void method2692(int arg0, class425 arg1) {
        if (this.field6427.method611() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field6426 & ~var3) == 0) {
            this.field6422 = arg1.field6274;
            this.field6428 = arg1.field6270;
        } else if (this.field6422 != arg1.field6274 || this.field6428 != arg1.field6270) {
            throw new RuntimeException();
        }
        arg1.method2636(field6429[arg0]);
        this.field6423[arg0] = arg1;
        this.field6426 |= var3;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 58)
    public final void method2693(int arg0) {
        if (this.field6427.method611() != this) {
            throw new RuntimeException();
        }
        this.field6427.field1156.glDrawBuffer(field6429[arg0]);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILai;I)V", line = 64)
    private final void method2694(int arg0, class355 arg1, int arg2) {
        if (this.field6427.method611() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field6426 & ~var4) == 0) {
            this.field6422 = arg1.field5455;
            this.field6428 = arg1.field5456;
        } else if (this.field6422 != arg1.field5455 || this.field6428 != arg1.field5456) {
            throw new RuntimeException();
        }
        arg1.method2311(field6429[arg0], arg2);
        this.field6423[arg0] = arg1;
        this.field6426 |= var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()I", line = 87)
    public final int method422() {
        return this.field6428;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()Z", line = 91)
    public final boolean method2695() {
        int var1 = this.field6427.field1156.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILai;)V", line = 103)
    public final void method2696(int arg0, class355 arg1) {
        this.method2694(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILrj;II)V", line = 106)
    private final void method2697(int arg0, class352 arg1, int arg2, int arg3) {
        if (this.field6427.method611() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field6426 & ~var5) == 0) {
            this.field6422 = arg1.field5430;
            this.field6428 = arg1.field5430;
        } else if (this.field6422 != arg1.field5430 || this.field6428 != arg1.field5430) {
            throw new RuntimeException();
        }
        arg1.method2295(field6429[arg0], arg2, arg3);
        this.field6423[arg0] = arg1;
        this.field6426 |= var5;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lsq;)V", line = 134)
    public class437(class96 arg0) {
        if (!arg0.field1196) {
            throw new IllegalStateException("");
        }
        this.field6427 = arg0;
        this.field6427.field1156.glGenFramebuffersEXT(1, field6424, 0);
        this.field6425 = field6424[0];
    }
}
