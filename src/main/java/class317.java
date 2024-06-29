import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class317 implements class177 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[Lqg;")
    private class268[] field4364 = new class268[9];

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lhj;")
    private class338 field4365;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field4363;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    private static int[] field4367 = new int[1];

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[I")
    private static int[] field4366 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    private int field4362;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field4368;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()Z", line = 4)
    public final boolean method2016() {
        int var1 = this.field4365.field4607.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()I", line = 15)
    public final int method1181() {
        return this.field4362;
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        this.field4365.method2137(this.field4363);
        super.finalize();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILrq;)V", line = 26)
    public final void method2017(int arg0, class195 arg1) {
        this.method2021(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 29)
    public final void method2018(int arg0) {
        if (this.field4364[arg0] != null) {
            this.field4364[arg0].method333();
        }
        this.field4369 &= ~(0x1 << arg0);
        this.field4364[arg0] = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILih;I)V", line = 37)
    public final void method2019(int arg0, class416 arg1, int arg2) {
        this.method2020(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILih;II)V", line = 40)
    private final void method2020(int arg0, class416 arg1, int arg2, int arg3) {
        if (this.field4365.method2171() != this) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field4369 & ~var5) == 0) {
            this.field4368 = arg1.field6021;
            this.field4362 = arg1.field6021;
        } else if (this.field4368 != arg1.field6021 || this.field4362 != arg1.field6021) {
            throw new RuntimeException();
        }
        arg1.method2656(field4366[arg0], arg2, arg3);
        this.field4364[arg0] = arg1;
        this.field4369 |= var5;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILrq;I)V", line = 63)
    private final void method2021(int arg0, class195 arg1, int arg2) {
        if (this.field4365.method2171() != this) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field4369 & ~var4) == 0) {
            this.field4368 = arg1.field2701;
            this.field4362 = arg1.field2699;
        } else if (this.field4368 != arg1.field2701 || this.field4362 != arg1.field2699) {
            throw new RuntimeException();
        }
        arg1.method1298(field4366[arg0], arg2);
        this.field4364[arg0] = arg1;
        this.field4369 |= var4;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V", line = 86)
    public final void method1182() {
        this.field4365.field4607.glBindFramebufferEXT(36160, 0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 89)
    public final void method1180() {
        this.field4365.field4607.glBindFramebufferEXT(36160, this.field4363);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 101)
    public final void method2022(int arg0) {
        if (this.field4365.method2171() != this) {
            throw new RuntimeException();
        }
        this.field4365.field4607.glDrawBuffer(field4366[arg0]);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lhj;)V", line = 112)
    public class317(class338 arg0) {
        if (!arg0.field4705) {
            throw new IllegalStateException("");
        }
        this.field4365 = arg0;
        this.field4365.field4607.glGenFramebuffersEXT(1, field4367, 0);
        this.field4363 = field4367[0];
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILum;)V", line = 121)
    public final void method2023(int arg0, class306 arg1) {
        if (this.field4365.method2171() != this) {
            throw new RuntimeException();
        }
        int var3 = 0x1 << arg0;
        if ((this.field4369 & ~var3) == 0) {
            this.field4368 = arg1.field4206;
            this.field4362 = arg1.field4203;
        } else if (this.field4368 != arg1.field4206 || this.field4362 != arg1.field4203) {
            throw new RuntimeException();
        }
        arg1.method1951(field4366[arg0]);
        this.field4364[arg0] = arg1;
        this.field4369 |= var3;
    }
}
