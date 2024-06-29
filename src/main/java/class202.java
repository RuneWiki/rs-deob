import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class202 implements class221 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[Lkk;")
    private class107[] field3077 = new class107[9];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lnm;")
    private class254 field3078;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    private static int[] field3076 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[I")
    private static int[] field3080 = new int[1];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method1372(int arg0) {
        if (this.field3078.method1641() != this) {
            throw new RuntimeException();
        }
        this.field3078.field3648.glDrawBuffer(field3076[arg0]);
    }

    @OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3078.method1668(this.field3081);
        super.finalize();
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()V")
    public final void method1373() {
        this.field3078.field3648.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhi;)V")
    public final void method1374(int arg0, class41 arg1) {
        this.method1378(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILcd;II)V")
    private final void method1375(int arg0, class60 arg1, int arg2, int arg3) {
        if (this.field3078.method1641() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field3075 & ~var5) == 0) {
            this.field3079 = arg1.field832;
            this.field3074 = arg1.field832;
        } else if (this.field3079 != arg1.field832 || this.field3074 != arg1.field832) {
            throw new RuntimeException();
        }
        arg1.method468(field3076[arg0], arg2, arg3);
        this.field3077[arg0] = arg1;
        this.field3075 |= var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILcd;I)V")
    public final void method1376(int arg0, class60 arg1, int arg2) {
        this.method1375(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILkf;)V")
    public final void method1377(int arg0, class195 arg1) {
        if (this.field3078.method1641() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field3075 & ~var3) == 0) {
            this.field3079 = arg1.field2948;
            this.field3074 = arg1.field2949;
        } else if (this.field3079 != arg1.field2948 || this.field3074 != arg1.field2949) {
            throw new RuntimeException();
        }
        arg1.method1336(field3076[arg0]);
        this.field3077[arg0] = arg1;
        this.field3075 |= var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhi;I)V")
    private final void method1378(int arg0, class41 arg1, int arg2) {
        if (this.field3078.method1641() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field3075 & ~var4) == 0) {
            this.field3079 = arg1.field566;
            this.field3074 = arg1.field567;
        } else if (this.field3079 != arg1.field566 || this.field3074 != arg1.field567) {
            throw new RuntimeException();
        }
        arg1.method307(field3076[arg0], arg2);
        this.field3077[arg0] = arg1;
        this.field3075 |= var4;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lnm;)V")
    public class202(class254 arg0) {
        if (!arg0.field3776) {
            throw new IllegalStateException("");
        }
        this.field3078 = arg0;
        this.field3078.field3648.glGenFramebuffersEXT(1, field3080, 0);
        this.field3081 = field3080[0];
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    public final void method1379() {
        this.field3078.field3648.glBindFramebufferEXT(36160, this.field3081);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method1380(int arg0) {
        if (this.field3077[arg0] != null) {
            this.field3077[arg0].method309();
        }
        this.field3075 &= ~(0x1 << arg0);
        this.field3077[arg0] = null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "()Z")
    public final boolean method1381() {
        int var1 = this.field3078.field3648.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public final int method1382() {
        return this.field3074;
    }
}
