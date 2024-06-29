import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 implements class409 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[Ljr;")
    private class231[] field1056 = new class231[9];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lnf;")
    private class256 field1055;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[I")
    private static int[] field1057 = new int[1];

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
    private static int[] field1062 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()I")
    public final int method541() {
        return this.field1061;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILvm;II)V")
    private final void method542(int arg0, class322 arg1, int arg2, int arg3) {
        if (this.field1055.method1655() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field1060 & ~var5) == 0) {
            this.field1058 = arg1.field4735;
            this.field1061 = arg1.field4735;
        } else if (this.field1058 != arg1.field4735 || this.field1061 != arg1.field4735) {
            throw new RuntimeException();
        }
        arg1.method2167(field1062[arg0], arg2, arg3);
        this.field1056[arg0] = arg1;
        this.field1060 |= var5;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()Z")
    public final boolean method543() {
        int var1 = this.field1055.field3634.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1055.method1656(this.field1059);
        super.finalize();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method544(int arg0) {
        if (this.field1055.method1655() != this) {
            throw new RuntimeException();
        }
        this.field1055.field3634.glDrawBuffer(field1062[arg0]);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILir;I)V")
    private final void method545(int arg0, class216 arg1, int arg2) {
        if (this.field1055.method1655() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1060 & ~var4) == 0) {
            this.field1058 = arg1.field2874;
            this.field1061 = arg1.field2876;
        } else if (this.field1058 != arg1.field2874 || this.field1061 != arg1.field2876) {
            throw new RuntimeException();
        }
        arg1.method1269(field1062[arg0], arg2);
        this.field1056[arg0] = arg1;
        this.field1060 |= var4;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method546(int arg0) {
        if (this.field1056[arg0] != null) {
            this.field1056[arg0].method93();
        }
        this.field1060 &= ~(0x1 << arg0);
        this.field1056[arg0] = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILvm;I)V")
    public final void method547(int arg0, class322 arg1, int arg2) {
        this.method542(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
    public final void method548() {
        this.field1055.field3634.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILtm;)V")
    public final void method549(int arg0, class187 arg1) {
        if (this.field1055.method1655() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field1060 & ~var3) == 0) {
            this.field1058 = arg1.field2518;
            this.field1061 = arg1.field2520;
        } else if (this.field1058 != arg1.field2518 || this.field1061 != arg1.field2520) {
            throw new RuntimeException();
        }
        arg1.method1129(field1062[arg0]);
        this.field1056[arg0] = arg1;
        this.field1060 |= var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
    public final void method550() {
        this.field1055.field3634.glBindFramebufferEXT(36160, this.field1059);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lnf;)V")
    public class74(class256 arg0) {
        if (!arg0.field3718) {
            throw new IllegalStateException("");
        }
        this.field1055 = arg0;
        this.field1055.field3634.glGenFramebuffersEXT(1, field1057, 0);
        this.field1059 = field1057[0];
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILir;)V")
    public final void method551(int arg0, class216 arg1) {
        this.method545(arg0, arg1, 0);
    }
}
