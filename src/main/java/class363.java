import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class363 {

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public int field4412 = 127;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public int field4416 = 1190717;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public int field4413 = -1;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Z")
    public boolean field4415 = false;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public int field4417 = 512;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public int field4424 = 0;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public int field4423 = 64;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "Z")
    public boolean field4427 = true;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public int field4428 = -1;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public int field4426 = 8;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "Z")
    public boolean field4425 = true;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "Lvg;")
    public class199 field4414;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V", line = 5)
    public final void method2085(byte arg0) {
        field4420++;
        if (arg0 != -89) {
            method2088((byte) 118, -18, -75);
        }
        this.field4426 = this.field4422 | this.field4426 << 8;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method2086(boolean arg0) {
        class3.method9(64, false);
        if (!arg0) {
            return;
        }
        field4429++;
        if (class409.field5431 >= 0 && class409.field5431 != 0) {
            class432.method2483((byte) 76, class409.field5431, false);
            class409.field5431 = -1;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILmc;)V", line = 44)
    public final void method2087(int arg0, class234 arg1) {
        int var3 = -27 % ((arg0 + 74) / 52);
        while (true) {
            int var4 = arg1.method1509(true);
            if (var4 == 0) {
                field4421++;
                return;
            }
            this.method2089(var4, -122, arg1);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BII)Z", line = 66)
    public static final boolean method2088(byte arg0, int arg1, int arg2) {
        if (arg0 > -43) {
            return true;
        } else {
            field4419++;
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILmc;)V", line = 83)
    private final void method2089(int arg0, int arg1, class234 arg2) {
        if (arg0 == 1) {
            this.field4424 = class222.method1445((byte) 10, arg2.method1500((byte) -76));
        } else if (arg0 == 2) {
            this.field4413 = arg2.method1509(true);
        } else if (arg0 == 3) {
            this.field4413 = arg2.method1553((byte) -110);
            if (this.field4413 == 65535) {
                this.field4413 = -1;
            }
        } else if (arg0 == 5) {
            this.field4427 = false;
        } else if (arg0 == 7) {
            this.field4428 = class222.method1445((byte) 116, arg2.method1500((byte) -85));
        } else if (arg0 == 8) {
            this.field4414.field2771 = this.field4422;
        } else if (arg0 == 9) {
            this.field4417 = arg2.method1553((byte) 31) << 2;
        } else if (arg0 == 10) {
            this.field4425 = false;
        } else if (arg0 == 11) {
            this.field4426 = arg2.method1509(true);
        } else if (arg0 == 12) {
            this.field4415 = true;
        } else if (arg0 == 13) {
            this.field4416 = arg2.method1500((byte) -116);
        } else if (arg0 == 14) {
            this.field4423 = arg2.method1509(true) << 2;
        } else if (arg0 == 16) {
            this.field4412 = arg2.method1509(true);
        }
        field4418++;
        int var4 = 14 / ((-arg1 - 79) / 35);
    }
}
