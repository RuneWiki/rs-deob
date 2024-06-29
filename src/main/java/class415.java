import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class415 implements class378 {

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[Lvq;")
    private class22[] field5980 = new class22[9];

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Lql;")
    private class346 field5979;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[I")
    private static int[] field5981 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "[I")
    private static int[] field5978 = new int[1];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    private int field5976;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "()V", line = 3)
    public final void method2063() {
        this.field5979.field4697.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "()Z", line = 7)
    public final boolean method2573() {
        int var1 = this.field5979.field4697.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()V", line = 21)
    public final void method2073() {
        this.field5979.field4697.glBindFramebufferEXT(36160, this.field5977);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 25)
    public final void method2574(int arg0) {
        if (this.field5979.method2104() != this) {
            throw new RuntimeException();
        }
        this.field5979.field4697.glDrawBuffer(field5981[arg0]);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()I", line = 31)
    public final int method2065() {
        return this.field5976;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILg;I)V", line = 34)
    public final void method2575(int arg0, class433 arg1, int arg2) {
        this.method2576(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILg;II)V", line = 41)
    private final void method2576(int arg0, class433 arg1, int arg2, int arg3) {
        if (this.field5979.method2104() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field5974 & ~var5) == 0) {
            this.field5975 = arg1.field6343;
            this.field5976 = arg1.field6343;
        } else if (this.field5975 != arg1.field6343 || this.field5976 != arg1.field6343) {
            throw new RuntimeException();
        }
        arg1.method2680(field5981[arg0], arg2, arg3);
        this.field5980[arg0] = arg1;
        this.field5974 |= var5;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 64)
    public final void method2577(int arg0) {
        if (this.field5980[arg0] != null) {
            this.field5980[arg0].method119();
        }
        this.field5974 &= ~(0x1 << arg0);
        this.field5980[arg0] = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjo;)V", line = 72)
    public final void method2578(int arg0, class218 arg1) {
        this.method2580(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lql;)V", line = 105)
    public class415(class346 arg0) {
        if (!arg0.field4754) {
            throw new IllegalStateException("");
        }
        this.field5979 = arg0;
        this.field5979.field4697.glGenFramebuffersEXT(1, field5978, 0);
        this.field5977 = field5978[0];
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILvf;)V", line = 84)
    public final void method2579(int arg0, class152 arg1) {
        if (this.field5979.method2104() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field5974 & ~var3) == 0) {
            this.field5975 = arg1.field1926;
            this.field5976 = arg1.field1925;
        } else if (this.field5975 != arg1.field1926 || this.field5976 != arg1.field1925) {
            throw new RuntimeException();
        }
        arg1.method810(field5981[arg0]);
        this.field5980[arg0] = arg1;
        this.field5974 |= var3;
    }

    @OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V", line = 117)
    protected final void finalize() throws Throwable {
        this.field5979.method2050(this.field5977);
        super.finalize();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjo;I)V", line = 121)
    private final void method2580(int arg0, class218 arg1, int arg2) {
        if (this.field5979.method2104() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field5974 & ~var4) == 0) {
            this.field5975 = arg1.field2924;
            this.field5976 = arg1.field2923;
        } else if (this.field5975 != arg1.field2924 || this.field5976 != arg1.field2923) {
            throw new RuntimeException();
        }
        arg1.method1170(field5981[arg0], arg2);
        this.field5980[arg0] = arg1;
        this.field5974 |= var4;
    }
}
