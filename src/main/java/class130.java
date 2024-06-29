import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class130 implements class146 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[Laq;")
    private class232[] field2115 = new class232[9];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lge;")
    private class104 field2119;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private static int[] field2116 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
    private static int[] field2118 = new int[1];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILca;II)V")
    private final void method1091(int arg0, class414 arg1, int arg2, int arg3) {
        if (this.field2119.method859() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field2117 & ~var5) == 0) {
            this.field2113 = arg1.field6003;
            this.field2112 = arg1.field6003;
        } else if (this.field2113 != arg1.field6003 || this.field2112 != arg1.field6003) {
            throw new RuntimeException();
        }
        arg1.method2595(field2116[arg0], arg2, arg3);
        this.field2115[arg0] = arg1;
        this.field2117 |= var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method1092(int arg0) {
        if (this.field2115[arg0] != null) {
            this.field2115[arg0].method658();
        }
        this.field2117 &= ~(0x1 << arg0);
        this.field2115[arg0] = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V")
    public final void method904() {
        this.field2119.field1604.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public final int method898() {
        return this.field2112;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILca;I)V")
    public final void method1093(int arg0, class414 arg1, int arg2) {
        this.method1091(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILcl;)V")
    public final void method1094(int arg0, class313 arg1) {
        if (this.field2119.method859() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field2117 & ~var3) == 0) {
            this.field2113 = arg1.field4581;
            this.field2112 = arg1.field4582;
        } else if (this.field2113 != arg1.field4581 || this.field2112 != arg1.field4582) {
            throw new RuntimeException();
        }
        arg1.method2125(field2116[arg0]);
        this.field2115[arg0] = arg1;
        this.field2117 |= var3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public final void method1095(int arg0) {
        if (this.field2119.method859() != this) {
            throw new RuntimeException();
        }
        this.field2119.field1604.glDrawBuffer(field2116[arg0]);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()Z")
    public final boolean method1096() {
        int var1 = this.field2119.field1604.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2119.method893(this.field2114);
        super.finalize();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILlb;I)V")
    private final void method1097(int arg0, class208 arg1, int arg2) {
        if (this.field2119.method859() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field2117 & ~var4) == 0) {
            this.field2113 = arg1.field3038;
            this.field2112 = arg1.field3039;
        } else if (this.field2113 != arg1.field3038 || this.field2112 != arg1.field3039) {
            throw new RuntimeException();
        }
        arg1.method1573(field2116[arg0], arg2);
        this.field2115[arg0] = arg1;
        this.field2117 |= var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public final void method860() {
        this.field2119.field1604.glBindFramebufferEXT(36160, this.field2114);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILlb;)V")
    public final void method1098(int arg0, class208 arg1) {
        this.method1097(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lge;)V")
    public class130(class104 arg0) {
        if (!arg0.field1635) {
            throw new IllegalStateException("");
        }
        this.field2119 = arg0;
        this.field2119.field1604.glGenFramebuffersEXT(1, field2118, 0);
        this.field2114 = field2118[0];
    }
}
