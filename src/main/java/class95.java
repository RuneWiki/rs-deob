import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class95 implements class202 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lii;")
    private class330[] field1202 = new class330[9];

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lig;")
    private class132 field1209;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    private static int[] field1203 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    private static int[] field1206 = new int[1];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()V")
    public final void method556() {
        this.field1209.field1918.glBindFramebufferEXT(36160, this.field1207);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhf;I)V")
    private final void method557(int arg0, class225 arg1, int arg2) {
        if (this.field1209.method978() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1208 & ~var4) == 0) {
            this.field1204 = arg1.field3366;
            this.field1205 = arg1.field3367;
        } else if (this.field1204 != arg1.field3366 || this.field1205 != arg1.field3367) {
            throw new RuntimeException();
        }
        arg1.method1578(field1203[arg0], arg2);
        this.field1202[arg0] = arg1;
        this.field1208 |= var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (this.field1202[arg0] != null) {
            this.field1202[arg0].method434();
        }
        this.field1208 &= ~(0x1 << arg0);
        this.field1202[arg0] = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILwl;I)V")
    public final void method559(int arg0, class234 arg1, int arg2) {
        this.method564(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhf;)V")
    public final void method560(int arg0, class225 arg1) {
        this.method557(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    public final void method561() {
        this.field1209.field1918.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILrr;)V")
    public final void method562(int arg0, class203 arg1) {
        if (this.field1209.method978() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field1208 & ~var3) == 0) {
            this.field1204 = arg1.field2866;
            this.field1205 = arg1.field2869;
        } else if (this.field1204 != arg1.field2866 || this.field1205 != arg1.field2869) {
            throw new RuntimeException();
        }
        arg1.method1418(field1203[arg0]);
        this.field1202[arg0] = arg1;
        this.field1208 |= var3;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "()Z")
    public final boolean method563() {
        int var1 = this.field1209.field1918.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILwl;II)V")
    private final void method564(int arg0, class234 arg1, int arg2, int arg3) {
        if (this.field1209.method978() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field1208 & ~var5) == 0) {
            this.field1204 = arg1.field3452;
            this.field1205 = arg1.field3452;
        } else if (this.field1204 != arg1.field3452 || this.field1205 != arg1.field3452) {
            throw new RuntimeException();
        }
        arg1.method1616(field1203[arg0], arg2, arg3);
        this.field1202[arg0] = arg1;
        this.field1208 |= var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public final int method565() {
        return this.field1205;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lig;)V")
    public class95(class132 arg0) {
        if (!arg0.field1969) {
            throw new IllegalStateException("");
        }
        this.field1209 = arg0;
        this.field1209.field1918.glGenFramebuffersEXT(1, field1206, 0);
        this.field1207 = field1206[0];
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method566(int arg0) {
        if (this.field1209.method978() != this) {
            throw new RuntimeException();
        }
        this.field1209.field1918.glDrawBuffer(field1203[arg0]);
    }

    @OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1209.method925(this.field1207);
        super.finalize();
    }
}
