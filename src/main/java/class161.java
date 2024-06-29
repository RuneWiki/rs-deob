import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class161 implements class7 {

    @OriginalMember(owner = "client!js", name = "h", descriptor = "[Lwg;")
    private class306[] field1937 = new class306[9];

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Lic;")
    private class246 field1931;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "[I")
    private static int[] field1932 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!js", name = "d", descriptor = "[I")
    private static int[] field1933 = new int[1];

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    private int field1935;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public final void method774(int arg0) {
        if (this.field1937[arg0] != null) {
            this.field1937[arg0].method47();
        }
        this.field1934 &= ~(0x1 << arg0);
        this.field1937[arg0] = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILsn;)V")
    public final void method775(int arg0, class488 arg1) {
        if (this.field1931.method1356() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field1934 & ~var3) == 0) {
            this.field1936 = arg1.field6920;
            this.field1935 = arg1.field6917;
        } else if (this.field1936 != arg1.field6920 || this.field1935 != arg1.field6917) {
            throw new RuntimeException();
        }
        arg1.method2882(field1932[arg0]);
        this.field1937[arg0] = arg1;
        this.field1934 |= var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILnb;II)V")
    private final void method776(int arg0, class359 arg1, int arg2, int arg3) {
        if (this.field1931.method1356() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field1934 & ~var5) == 0) {
            this.field1936 = arg1.field5175;
            this.field1935 = arg1.field5175;
        } else if (this.field1936 != arg1.field5175 || this.field1935 != arg1.field5175) {
            throw new RuntimeException();
        }
        arg1.method2191(field1932[arg0], arg2, arg3);
        this.field1937[arg0] = arg1;
        this.field1934 |= var5;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILtr;I)V")
    private final void method777(int arg0, class151 arg1, int arg2) {
        if (this.field1931.method1356() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1934 & ~var4) == 0) {
            this.field1936 = arg1.field1826;
            this.field1935 = arg1.field1825;
        } else if (this.field1936 != arg1.field1826 || this.field1935 != arg1.field1825) {
            throw new RuntimeException();
        }
        arg1.method730(field1932[arg0], arg2);
        this.field1937[arg0] = arg1;
        this.field1934 |= var4;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "()Z")
    public final boolean method778() {
        int var1 = this.field1931.field3342.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "()V")
    public final void method48() {
        this.field1931.field3342.glBindFramebufferEXT(36160, this.field1930);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILtr;)V")
    public final void method779(int arg0, class151 arg1) {
        this.method777(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public final void method780(int arg0) {
        if (this.field1931.method1356() != this) {
            throw new RuntimeException();
        }
        this.field1931.field3342.glDrawBuffer(field1932[arg0]);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "()V")
    public final void method50() {
        this.field1931.field3342.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "()I")
    public final int method49() {
        return this.field1935;
    }

    @OriginalMember(owner = "client!js", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1931.method1414(this.field1930);
        super.finalize();
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILnb;I)V")
    public final void method781(int arg0, class359 arg1, int arg2) {
        this.method776(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lic;)V")
    public class161(class246 arg0) {
        if (!arg0.field3428) {
            throw new IllegalStateException("");
        }
        this.field1931 = arg0;
        this.field1931.field3342.glGenFramebuffersEXT(1, field1933, 0);
        this.field1930 = field1933[0];
    }
}
