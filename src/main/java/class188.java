import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class188 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    private int field2641 = 0;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field2643 = 0;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lkv;")
    private class14 field2640 = null;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    private int field2647 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lbv;")
    private class282 field2639;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lre;")
    private class222 field2646;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[Laa;")
    private class56[] field2636;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lef;")
    public class133 field2633;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "B")
    public static byte field2644;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZZZ)V")
    public final void method1319(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        boolean var5 = arg1 & this.field2639.method1056();
        field2645++;
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (!arg3) {
            this.field2640 = null;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field2647 != arg0) {
            if (this.field2647 != 0) {
                this.field2636[this.field2647 & Integer.MAX_VALUE].method381(-82);
            }
            if (arg0 != 0) {
                this.field2636[arg0 & Integer.MAX_VALUE].method383(arg2, -91);
                this.field2636[arg0 & Integer.MAX_VALUE].method380(arg2, 74);
            }
            this.field2643 = Integer.MIN_VALUE;
            this.field2641 = Integer.MIN_VALUE;
            this.field2647 = arg0;
            this.field2640 = null;
        } else if (this.field2647 != 0) {
            this.field2636[this.field2647 & Integer.MAX_VALUE].method380(arg2, 127);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1320(String arg0, int arg1) {
        int var2 = 122 / ((arg1 + 55) / 54);
        field2637++;
        return class322.method2093((byte) 0, true, 10, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
    public final boolean method1321(byte arg0, int arg1) {
        if (arg0 >= -52) {
            this.field2641 = 119;
        }
        field2634++;
        return this.field2636[arg1].method377((byte) -52);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)V")
    public final void method1322(int arg0, byte arg1, int arg2) {
        if (arg1 > -83) {
            this.field2636 = null;
        }
        field2638++;
        if (this.field2647 != 0 & (this.field2641 != arg2 | this.field2643 != arg0)) {
            this.field2636[this.field2647 & Integer.MAX_VALUE].method382(arg0, arg2, 0);
            this.field2643 = arg0;
            this.field2641 = arg2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lkv;II)Z")
    public final boolean method1323(class14 arg0, int arg1, int arg2) {
        field2635++;
        if (arg1 <= 62) {
            return true;
        } else if (this.field2647 == 0) {
            return false;
        } else {
            if (this.field2640 != arg0) {
                this.field2636[this.field2647 & Integer.MAX_VALUE].method379(arg2, -105, arg0);
                this.field2640 = arg0;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method1324(int arg0) {
        class354.method2234(68);
        field2642++;
        class300.method1929((byte) -4);
        if (arg0 != -9815) {
            field2644 = -15;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lbv;)V")
    public class188(class282 arg0) {
        this.field2639 = arg0;
        this.field2646 = new class222(arg0);
        this.field2636 = new class56[10];
        this.field2636[1] = new class179(arg0);
        this.field2636[2] = new class203(arg0, this.field2646);
        this.field2636[4] = new class287(arg0, this.field2646);
        this.field2636[5] = new class82(arg0, this.field2646);
        this.field2636[6] = new class295(arg0);
        this.field2636[7] = new class234(arg0);
        this.field2636[3] = this.field2633 = new class133(arg0);
        this.field2636[8] = new class332(arg0, this.field2646);
        this.field2636[9] = new class328(arg0, this.field2646);
        if (!this.field2636[8].method377((byte) -69)) {
            this.field2636[8] = this.field2636[4];
        }
        if (!this.field2636[9].method377((byte) -54)) {
            this.field2636[9] = this.field2636[8];
        }
    }
}
