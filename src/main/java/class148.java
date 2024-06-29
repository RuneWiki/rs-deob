import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class148 implements class81 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[Lko;")
    private class203[] field2029 = new class203[9];

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lfu;")
    private class42 field2030;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[I")
    private static int[] field2026 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    private static int[] field2033 = new int[1];

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    private int field2027;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILuo;I)V", line = 3)
    private final void method1047(int arg0, class429 arg1, int arg2) {
        if (this.field2030.method305() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field2027 & ~var4) == 0) {
            this.field2028 = arg1.field5978;
            this.field2031 = arg1.field5977;
        } else if (this.field2028 != arg1.field5978 || this.field2031 != arg1.field5977) {
            throw new RuntimeException();
        }
        arg1.method2563(field2026[arg0], arg2);
        this.field2029[arg0] = arg1;
        this.field2027 |= var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILkd;)V", line = 28)
    public final void method1048(int arg0, class488 arg1) {
        if (this.field2030.method305() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field2027 & ~var3) == 0) {
            this.field2028 = arg1.field6896;
            this.field2031 = arg1.field6901;
        } else if (this.field2028 != arg1.field6896 || this.field2031 != arg1.field6901) {
            throw new RuntimeException();
        }
        arg1.method2870(field2026[arg0]);
        this.field2029[arg0] = arg1;
        this.field2027 |= var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V", line = 52)
    public final void method426() {
        this.field2030.field557.glBindFramebufferEXT(36160, this.field2032);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()I", line = 56)
    public final int method354() {
        return this.field2031;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILbl;I)V", line = 59)
    public final void method1049(int arg0, class240 arg1, int arg2) {
        this.method1052(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 63)
    public final void method1050(int arg0) {
        if (this.field2029[arg0] != null) {
            this.field2029[arg0].method88();
        }
        this.field2027 &= ~(0x1 << arg0);
        this.field2029[arg0] = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILuo;)V", line = 70)
    public final void method1051(int arg0, class429 arg1) {
        this.method1047(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V", line = 73)
    public final void method358() {
        this.field2030.field557.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILbl;II)V", line = 77)
    private final void method1052(int arg0, class240 arg1, int arg2, int arg3) {
        if (this.field2030.method305() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field2027 & ~var5) == 0) {
            this.field2028 = arg1.field3509;
            this.field2031 = arg1.field3509;
        } else if (this.field2028 != arg1.field3509 || this.field2031 != arg1.field3509) {
            throw new RuntimeException();
        }
        arg1.method1673(field2026[arg0], arg2, arg3);
        this.field2029[arg0] = arg1;
        this.field2027 |= var5;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()Z", line = 101)
    public final boolean method1053() {
        int var1 = this.field2030.field557.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lfu;)V", line = 131)
    public class148(class42 arg0) {
        if (!arg0.field693) {
            throw new IllegalStateException("");
        }
        this.field2030 = arg0;
        this.field2030.field557.glGenFramebuffersEXT(1, field2033, 0);
        this.field2032 = field2033[0];
    }

    @OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V", line = 117)
    protected final void finalize() throws Throwable {
        this.field2030.method418(this.field2032);
        super.finalize();
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 121)
    public final void method1054(int arg0) {
        if (this.field2030.method305() != this) {
            throw new RuntimeException();
        }
        this.field2030.field557.glDrawBuffer(field2026[arg0]);
    }
}
