import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class442 implements class321 {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[Lsh;")
    private class351[] field6430 = new class351[9];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lks;")
    private class173 field6426;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    private int field6428;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[I")
    private static int[] field6423 = new int[1];

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
    private static int[] field6427 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    private int field6424;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field6429;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()I")
    public final int method1147() {
        return this.field6424;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "()Z")
    public final boolean method2709() {
        int var1 = this.field6426.field2253.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
    public final void method1140() {
        this.field6426.field2253.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method2710(int arg0) {
        if (this.field6426.method1155() != this) {
            throw new RuntimeException();
        }
        this.field6426.field2253.glDrawBuffer(field6427[arg0]);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
    public final void method1149() {
        this.field6426.field2253.glBindFramebufferEXT(36160, this.field6428);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public final void method2711(int arg0) {
        if (this.field6430[arg0] != null) {
            this.field6430[arg0].method419();
        }
        this.field6425 &= ~(0x1 << arg0);
        this.field6430[arg0] = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILea;I)V")
    public final void method2712(int arg0, class61 arg1, int arg2) {
        this.method2714(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILqb;)V")
    public final void method2713(int arg0, class89 arg1) {
        this.method2715(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILea;II)V")
    private final void method2714(int arg0, class61 arg1, int arg2, int arg3) {
        if (this.field6426.method1155() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field6425 & ~var5) == 0) {
            this.field6429 = arg1.field812;
            this.field6424 = arg1.field812;
        } else if (this.field6429 != arg1.field812 || this.field6424 != arg1.field812) {
            throw new RuntimeException();
        }
        arg1.method459(field6427[arg0], arg2, arg3);
        this.field6430[arg0] = arg1;
        this.field6425 |= var5;
    }

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6426.method1158(this.field6428);
        super.finalize();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILqb;I)V")
    private final void method2715(int arg0, class89 arg1, int arg2) {
        if (this.field6426.method1155() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field6425 & ~var4) == 0) {
            this.field6429 = arg1.field1094;
            this.field6424 = arg1.field1093;
        } else if (this.field6429 != arg1.field1094 || this.field6424 != arg1.field1093) {
            throw new RuntimeException();
        }
        arg1.method595(field6427[arg0], arg2);
        this.field6430[arg0] = arg1;
        this.field6425 |= var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILq;)V")
    public final void method2716(int arg0, class211 arg1) {
        if (this.field6426.method1155() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field6425 & ~var3) == 0) {
            this.field6429 = arg1.field2974;
            this.field6424 = arg1.field2969;
        } else if (this.field6429 != arg1.field2974 || this.field6424 != arg1.field2969) {
            throw new RuntimeException();
        }
        arg1.method1449(field6427[arg0]);
        this.field6430[arg0] = arg1;
        this.field6425 |= var3;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lks;)V")
    public class442(class173 arg0) {
        if (!arg0.field2311) {
            throw new IllegalStateException("");
        }
        this.field6426 = arg0;
        this.field6426.field2253.glGenFramebuffersEXT(1, field6423, 0);
        this.field6428 = field6423[0];
    }
}
