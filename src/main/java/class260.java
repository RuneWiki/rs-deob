import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class260 implements class81 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "[Lwq;")
    private class248[] field3350 = new class248[9];

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Lh;")
    private class327 field3354;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    private static int[] field3347 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
    private static int[] field3348 = new int[1];

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field3349;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private int field3353;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILbj;)V")
    public final void method1640(int arg0, class313 arg1) {
        this.method1642(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3354.method2087(this.field3352);
        super.finalize();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILoh;)V")
    public final void method1641(int arg0, class385 arg1) {
        if (this.field3354.method2084() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field3349 & ~var3) == 0) {
            this.field3351 = arg1.field5263;
            this.field3353 = arg1.field5270;
        } else if (this.field3351 != arg1.field5263 || this.field3353 != arg1.field5270) {
            throw new RuntimeException();
        }
        arg1.method2398(field3347[arg0]);
        this.field3350[arg0] = arg1;
        this.field3349 |= var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILbj;I)V")
    private final void method1642(int arg0, class313 arg1, int arg2) {
        if (this.field3354.method2084() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field3349 & ~var4) == 0) {
            this.field3351 = arg1.field4216;
            this.field3353 = arg1.field4218;
        } else if (this.field3351 != arg1.field4216 || this.field3353 != arg1.field4218) {
            throw new RuntimeException();
        }
        arg1.method1974(field3347[arg0], arg2);
        this.field3350[arg0] = arg1;
        this.field3349 |= var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final void method1643(int arg0) {
        if (this.field3350[arg0] != null) {
            this.field3350[arg0].method878();
        }
        this.field3349 &= ~(0x1 << arg0);
        this.field3350[arg0] = null;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()Z")
    public final boolean method1644() {
        int var1 = this.field3354.field4363.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILhp;I)V")
    public final void method1645(int arg0, class254 arg1, int arg2) {
        this.method1647(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
    public final void method512() {
        this.field3354.field4363.glBindFramebufferEXT(36160, this.field3352);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
    public final int method511() {
        return this.field3353;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method1646(int arg0) {
        if (this.field3354.method2084() != this) {
            throw new RuntimeException();
        }
        this.field3354.field4363.glDrawBuffer(field3347[arg0]);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lh;)V")
    public class260(class327 arg0) {
        if (!arg0.field4405) {
            throw new IllegalStateException("");
        }
        this.field3354 = arg0;
        this.field3354.field4363.glGenFramebuffersEXT(1, field3348, 0);
        this.field3352 = field3348[0];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
    public final void method510() {
        this.field3354.field4363.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILhp;II)V")
    private final void method1647(int arg0, class254 arg1, int arg2, int arg3) {
        if (this.field3354.method2084() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field3349 & ~var5) == 0) {
            this.field3351 = arg1.field3308;
            this.field3353 = arg1.field3308;
        } else if (this.field3351 != arg1.field3308 || this.field3353 != arg1.field3308) {
            throw new RuntimeException();
        }
        arg1.method1627(field3347[arg0], arg2, arg3);
        this.field3350[arg0] = arg1;
        this.field3349 |= var5;
    }
}
