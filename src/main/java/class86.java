import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class86 implements class47 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[Lnh;")
    private class446[] field967 = new class446[9];

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lpo;")
    private class332 field972;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
    private static int[] field973 = new int[1];

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    private static int[] field971 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public final void method293() {
        this.field972.field4752.glBindFramebufferEXT(36160, this.field969);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (this.field967[arg0] != null) {
            this.field967[arg0].method460();
        }
        this.field970 &= ~(0x1 << arg0);
        this.field967[arg0] = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILfc;)V")
    public final void method467(int arg0, class141 arg1) {
        this.method470(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
    public final void method295() {
        this.field972.field4752.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILvf;)V")
    public final void method468(int arg0, class84 arg1) {
        if (this.field972.method2079() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field970 & ~var3) == 0) {
            this.field966 = arg1.field941;
            this.field968 = arg1.field942;
        } else if (this.field966 != arg1.field941 || this.field968 != arg1.field942) {
            throw new RuntimeException();
        }
        arg1.method458(field971[arg0]);
        this.field967[arg0] = arg1;
        this.field970 |= var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILbc;II)V")
    private final void method469(int arg0, class205 arg1, int arg2, int arg3) {
        if (this.field972.method2079() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field970 & ~var5) == 0) {
            this.field966 = arg1.field2801;
            this.field968 = arg1.field2801;
        } else if (this.field966 != arg1.field2801 || this.field968 != arg1.field2801) {
            throw new RuntimeException();
        }
        arg1.method1303(field971[arg0], arg2, arg3);
        this.field967[arg0] = arg1;
        this.field970 |= var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILfc;I)V")
    private final void method470(int arg0, class141 arg1, int arg2) {
        if (this.field972.method2079() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field970 & ~var4) == 0) {
            this.field966 = arg1.field1990;
            this.field968 = arg1.field1992;
        } else if (this.field966 != arg1.field1990 || this.field968 != arg1.field1992) {
            throw new RuntimeException();
        }
        arg1.method836(field971[arg0], arg2);
        this.field967[arg0] = arg1;
        this.field970 |= var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
    public final int method294() {
        return this.field968;
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field972.method2060(this.field969);
        super.finalize();
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method471(int arg0) {
        if (this.field972.method2079() != this) {
            throw new RuntimeException();
        }
        this.field972.field4752.glDrawBuffer(field971[arg0]);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILbc;I)V")
    public final void method472(int arg0, class205 arg1, int arg2) {
        this.method469(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
    public final boolean method473() {
        int var1 = this.field972.field4752.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lpo;)V")
    public class86(class332 arg0) {
        if (!arg0.field4862) {
            throw new IllegalStateException("");
        }
        this.field972 = arg0;
        this.field972.field4752.glGenFramebuffersEXT(1, field973, 0);
        this.field969 = field973[0];
    }
}
