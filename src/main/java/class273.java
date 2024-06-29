import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class273 implements class397 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "[Ljp;")
    private class271[] field3779 = new class271[9];

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lqi;")
    private class458 field3780;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "[I")
    private static int[] field3782 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[I")
    private static int[] field3783 = new int[1];

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILai;I)V", line = 3)
    private final void method1709(int arg0, class201 arg1, int arg2) {
        if (this.field3780.method2685() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field3784 & ~var4) == 0) {
            this.field3785 = arg1.field2882;
            this.field3781 = arg1.field2881;
        } else if (this.field3785 != arg1.field2882 || this.field3781 != arg1.field2881) {
            throw new RuntimeException();
        }
        arg1.method1276(field3782[arg0], arg2);
        this.field3779[arg0] = arg1;
        this.field3784 |= var4;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "()V", line = 25)
    public final void method1710() {
        this.field3780.field6330.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()V", line = 31)
    public final void method1711() {
        this.field3780.field6330.glBindFramebufferEXT(36160, this.field3786);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lqi;)V", line = 134)
    public class273(class458 arg0) {
        if (!arg0.field6405) {
            throw new IllegalStateException("");
        }
        this.field3780 = arg0;
        this.field3780.field6330.glGenFramebuffersEXT(1, field3783, 0);
        this.field3786 = field3783[0];
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 39)
    public final void method1712(int arg0) {
        if (this.field3779[arg0] != null) {
            this.field3779[arg0].method1050();
        }
        this.field3784 &= ~(0x1 << arg0);
        this.field3779[arg0] = null;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "()I", line = 47)
    public final int method1713() {
        return this.field3781;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 52)
    public final void method1714(int arg0) {
        if (this.field3780.method2685() != this) {
            throw new RuntimeException();
        }
        this.field3780.field6330.glDrawBuffer(field3782[arg0]);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILai;)V", line = 58)
    public final void method1715(int arg0, class201 arg1) {
        this.method1709(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILmn;)V", line = 64)
    public final void method1716(int arg0, class264 arg1) {
        if (this.field3780.method2685() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field3784 & ~var3) == 0) {
            this.field3785 = arg1.field3684;
            this.field3781 = arg1.field3681;
        } else if (this.field3785 != arg1.field3684 || this.field3781 != arg1.field3681) {
            throw new RuntimeException();
        }
        arg1.method1668(field3782[arg0]);
        this.field3779[arg0] = arg1;
        this.field3784 |= var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILqh;II)V", line = 87)
    private final void method1717(int arg0, class452 arg1, int arg2, int arg3) {
        if (this.field3780.method2685() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field3784 & ~var5) == 0) {
            this.field3785 = arg1.field6250;
            this.field3781 = arg1.field6250;
        } else if (this.field3785 != arg1.field6250 || this.field3781 != arg1.field6250) {
            throw new RuntimeException();
        }
        arg1.method2613(field3782[arg0], arg2, arg3);
        this.field3779[arg0] = arg1;
        this.field3784 |= var5;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILqh;I)V", line = 109)
    public final void method1718(int arg0, class452 arg1, int arg2) {
        this.method1717(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "()Z", line = 115)
    public final boolean method1719() {
        int var1 = this.field3780.field6330.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V", line = 126)
    protected final void finalize() throws Throwable {
        this.field3780.method2695(this.field3786);
        super.finalize();
    }
}
