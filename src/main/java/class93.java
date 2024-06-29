import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class93 implements class172 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "[Lh;")
    private class398[] field1293 = new class398[9];

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Ltb;")
    private class227 field1296;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "[I")
    private static int[] field1298 = new int[1];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "[I")
    private static int[] field1294 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILds;II)V", line = 4)
    private final void method656(int arg0, class10 arg1, int arg2, int arg3) {
        if (this.field1296.method1553() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field1295 & ~var5) == 0) {
            this.field1299 = arg1.field177;
            this.field1297 = arg1.field177;
        } else if (this.field1299 != arg1.field177 || this.field1297 != arg1.field177) {
            throw new RuntimeException();
        }
        arg1.method151(field1294[arg0], arg2, arg3);
        this.field1293[arg0] = arg1;
        this.field1295 |= var5;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILim;I)V", line = 26)
    private final void method657(int arg0, class342 arg1, int arg2) {
        if (this.field1296.method1553() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1295 & ~var4) == 0) {
            this.field1299 = arg1.field4668;
            this.field1297 = arg1.field4667;
        } else if (this.field1299 != arg1.field4668 || this.field1297 != arg1.field4667) {
            throw new RuntimeException();
        }
        arg1.method2171(field1294[arg0], arg2);
        this.field1293[arg0] = arg1;
        this.field1295 |= var4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 53)
    public final void method658(int arg0) {
        if (this.field1296.method1553() != this) {
            throw new RuntimeException();
        }
        this.field1296.field3184.glDrawBuffer(field1294[arg0]);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILwm;)V", line = 60)
    public final void method659(int arg0, class336 arg1) {
        if (this.field1296.method1553() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field1295 & ~var3) == 0) {
            this.field1299 = arg1.field4617;
            this.field1297 = arg1.field4616;
        } else if (this.field1299 != arg1.field4617 || this.field1297 != arg1.field4616) {
            throw new RuntimeException();
        }
        arg1.method2149(field1294[arg0]);
        this.field1293[arg0] = arg1;
        this.field1295 |= var3;
    }

    @OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V", line = 82)
    protected final void finalize() throws Throwable {
        this.field1296.method1507(this.field1292);
        super.finalize();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()I", line = 87)
    public final int method660() {
        return this.field1297;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Ltb;)V", line = 104)
    public class93(class227 arg0) {
        if (!arg0.field3309) {
            throw new IllegalStateException("");
        }
        this.field1296 = arg0;
        this.field1296.field3184.glGenFramebuffersEXT(1, field1298, 0);
        this.field1292 = field1298[0];
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "()V", line = 93)
    public final void method661() {
        this.field1296.field3184.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "()V", line = 97)
    public final void method662() {
        this.field1296.field3184.glBindFramebufferEXT(36160, this.field1292);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILim;)V", line = 101)
    public final void method663(int arg0, class342 arg1) {
        this.method657(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILds;I)V", line = 117)
    public final void method664(int arg0, class10 arg1, int arg2) {
        this.method656(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V", line = 120)
    public final void method665(int arg0) {
        if (this.field1293[arg0] != null) {
            this.field1293[arg0].method152();
        }
        this.field1295 &= ~(0x1 << arg0);
        this.field1293[arg0] = null;
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "()Z", line = 128)
    public final boolean method666() {
        int var1 = this.field1296.field3184.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }
}
