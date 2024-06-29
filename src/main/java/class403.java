import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class403 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public int field5609 = 64;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public int field5618 = -1;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "Z")
    public boolean field5614 = true;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public int field5617 = 1190717;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public int field5624 = 0;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field5613 = 8;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public int field5619 = 512;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public int field5616 = -1;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public int field5615 = 127;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "Z")
    public boolean field5627 = false;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "Z")
    public boolean field5626 = true;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "Z")
    public static boolean field5625 = false;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "Lmn;")
    public static class371 field5621 = class615.method3358(0);

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "Ljb;")
    public class496 field5623;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLee;)V", line = 5)
    public final void method2369(boolean arg0, class677 arg1) {
        if (arg0) {
            return;
        }
        field5622++;
        while (true) {
            int var3 = arg1.method3821((byte) 83);
            if (var3 == 0) {
                return;
            }
            this.method2372(var3, arg1, -115);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 28)
    public static void method2370(int arg0) {
        if (arg0 != -30914) {
            method2373(-81, -122);
        }
        field5621 = null;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V", line = 40)
    public final void method2371(int arg0) {
        field5620++;
        this.field5613 = this.field5611 | this.field5613 << 8;
        if (arg0 != 1652868904) {
            this.field5614 = true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILee;I)V", line = 53)
    private final void method2372(int arg0, class677 arg1, int arg2) {
        field5610++;
        int var4 = -84 % ((arg2 + 42) / 45);
        if (arg0 == 1) {
            this.field5624 = class725.method4082(arg1.method3833(255), 109);
        } else if (arg0 == 2) {
            this.field5618 = arg1.method3821((byte) 124);
        } else if (arg0 == 3) {
            this.field5618 = arg1.method3807(-1);
            if (this.field5618 == 65535) {
                this.field5618 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field5614 = false;
        } else if (arg0 == 7) {
            this.field5616 = class725.method4082(arg1.method3833(255), 122);
            return;
        } else if (arg0 == 8) {
            this.field5623.field6693 = this.field5611;
            return;
        } else if (arg0 == 9) {
            this.field5619 = arg1.method3807(-1) << 2;
            return;
        } else if (arg0 == 10) {
            this.field5626 = false;
            return;
        } else if (arg0 == 11) {
            this.field5613 = arg1.method3821((byte) 84);
            return;
        } else if (arg0 == 12) {
            this.field5627 = true;
            return;
        } else {
            if (arg0 == 13) {
                this.field5617 = arg1.method3833(255);
            } else if (arg0 == 14) {
                this.field5609 = arg1.method3821((byte) -31) << 2;
                return;
            } else if (arg0 == 16) {
                this.field5615 = arg1.method3821((byte) -56);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V", line = 147)
    public static final void method2373(int arg0, int arg1) {
        field5612++;
        if (arg0 == -25908) {
            class127 var2 = class760.method4231(arg1, arg0 - 874766764, 6);
            var2.method1002(-128);
        }
    }
}
