import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class18 implements class70 {

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[Lgg;")
    private class5[] field287 = new class5[9];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lse;")
    private class282 field283;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[I")
    private static int[] field282 = new int[1];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    private static int[] field286 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 4)
    public final void method131(int arg0) {
        if (this.field287[arg0] != null) {
            this.field287[arg0].method28();
        }
        this.field281 &= ~(0x1 << arg0);
        this.field287[arg0] = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnc;II)V", line = 12)
    private final void method132(int arg0, class75 arg1, int arg2, int arg3) {
        if (this.field283.method1909() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field281 & ~var5) == 0) {
            this.field285 = arg1.field1047;
            this.field284 = arg1.field1045;
        } else if (this.field285 != arg1.field1047 || this.field284 != arg1.field1045) {
            throw new RuntimeException();
        }
        arg1.method603(field286[arg0], arg2, arg3);
        this.field287[arg0] = arg1;
        this.field281 |= var5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILoa;I)V", line = 34)
    private final void method133(int arg0, class121 arg1, int arg2) {
        if (this.field283.method1909() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field281 & ~var4) == 0) {
            this.field285 = arg1.field1570;
            this.field284 = arg1.field1568;
        } else if (this.field285 != arg1.field1570 || this.field284 != arg1.field1568) {
            throw new RuntimeException();
        }
        arg1.method871(field286[arg0], arg2);
        this.field287[arg0] = arg1;
        this.field281 |= var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILpi;II)V", line = 58)
    private final void method134(int arg0, class141 arg1, int arg2, int arg3) {
        if (this.field283.method1909() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field281 & ~var5) == 0) {
            this.field285 = arg1.field1801;
            this.field284 = arg1.field1801;
        } else if (this.field285 != arg1.field1801 || this.field284 != arg1.field1801) {
            throw new RuntimeException();
        }
        arg1.method982(field286[arg0], arg2, arg3);
        this.field287[arg0] = arg1;
        this.field281 |= var5;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 82)
    public final void method135(int arg0) {
        if (this.field283.method1909() != this) {
            throw new RuntimeException();
        }
        this.field283.field4140.glDrawBuffer(field286[arg0]);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()V", line = 88)
    public final void method136() {
        this.field283.field4140.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILpi;I)V", line = 92)
    public final void method137(int arg0, class141 arg1, int arg2) {
        this.method134(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILij;)V", line = 95)
    public final void method138(int arg0, class152 arg1) {
        if (this.field283.method1909() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field281 & ~var3) == 0) {
            this.field285 = arg1.field1916;
            this.field284 = arg1.field1914;
        } else if (this.field285 != arg1.field1916 || this.field284 != arg1.field1914) {
            throw new RuntimeException();
        }
        arg1.method1034(field286[arg0]);
        this.field287[arg0] = arg1;
        this.field281 |= var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILoa;)V", line = 117)
    public final void method139(int arg0, class121 arg1) {
        this.method133(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I", line = 120)
    public final int method140() {
        return this.field284;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()V", line = 124)
    public final void method141() {
        this.field283.field4140.glBindFramebufferEXT(36160, this.field288);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z", line = 131)
    public final boolean method142() {
        int var1 = this.field283.field4140.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lse;)V", line = 157)
    public class18(class282 arg0) {
        if (!arg0.field4212) {
            throw new IllegalStateException("");
        }
        this.field283 = arg0;
        this.field283.field4140.glGenFramebuffersEXT(1, field282, 0);
        this.field288 = field282[0];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnc;I)V", line = 151)
    public final void method143(int arg0, class75 arg1, int arg2) {
        this.method132(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V", line = 154)
    protected final void finalize() throws Throwable {
        this.field283.method1921(this.field288);
        super.finalize();
    }
}
