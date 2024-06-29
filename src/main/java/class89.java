import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class89 implements class418 {

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "[Lur;")
    private class92[] field1242 = new class92[9];

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lih;")
    private class330 field1236;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    private static int[] field1237 = new int[1];

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
    private static int[] field1240 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V", line = 4)
    public final void method549() {
        this.field1236.field4741.glBindFramebufferEXT(36160, this.field1238);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V", line = 7)
    public final void method550() {
        this.field1236.field4741.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 11)
    public final void method551(int arg0) {
        if (this.field1242[arg0] != null) {
            this.field1242[arg0].method570();
        }
        this.field1235 &= ~(0x1 << arg0);
        this.field1242[arg0] = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 20)
    public final void method552(int arg0) {
        if (this.field1236.method2046() != this) {
            throw new RuntimeException();
        }
        this.field1236.field4741.glDrawBuffer(field1240[arg0]);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILwk;)V", line = 26)
    public final void method553(int arg0, class428 arg1) {
        if (this.field1236.method2046() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field1235 & ~var3) == 0) {
            this.field1239 = arg1.field6339;
            this.field1241 = arg1.field6340;
        } else if (this.field1239 != arg1.field6339 || this.field1241 != arg1.field6340) {
            throw new RuntimeException();
        }
        arg1.method2737(field1240[arg0]);
        this.field1242[arg0] = arg1;
        this.field1235 |= var3;
    }

    @OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        this.field1236.method2090(this.field1238);
        super.finalize();
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()I", line = 53)
    public final int method554() {
        return this.field1241;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILsg;I)V", line = 56)
    public final void method555(int arg0, class266 arg1, int arg2) {
        this.method558(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILeq;I)V", line = 60)
    private final void method556(int arg0, class140 arg1, int arg2) {
        if (this.field1236.method2046() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1235 & ~var4) == 0) {
            this.field1239 = arg1.field1864;
            this.field1241 = arg1.field1863;
        } else if (this.field1239 != arg1.field1864 || this.field1241 != arg1.field1863) {
            throw new RuntimeException();
        }
        arg1.method942(field1240[arg0], arg2);
        this.field1242[arg0] = arg1;
        this.field1235 |= var4;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()Z", line = 83)
    public final boolean method557() {
        int var1 = this.field1236.field4741.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILsg;II)V", line = 94)
    private final void method558(int arg0, class266 arg1, int arg2, int arg3) {
        if (this.field1236.method2046() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field1235 & ~var5) == 0) {
            this.field1239 = arg1.field3921;
            this.field1241 = arg1.field3921;
        } else if (this.field1239 != arg1.field3921 || this.field1241 != arg1.field3921) {
            throw new RuntimeException();
        }
        arg1.method1724(field1240[arg0], arg2, arg3);
        this.field1242[arg0] = arg1;
        this.field1235 |= var5;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILeq;)V", line = 123)
    public final void method559(int arg0, class140 arg1) {
        this.method556(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lih;)V", line = 134)
    public class89(class330 arg0) {
        if (!arg0.field4791) {
            throw new IllegalStateException("");
        }
        this.field1236 = arg0;
        this.field1236.field4741.glGenFramebuffersEXT(1, field1237, 0);
        this.field1238 = field1237[0];
    }
}
