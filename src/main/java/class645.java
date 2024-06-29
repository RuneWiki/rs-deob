import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class645 {

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "Lwk;")
    public class154 field8920 = new class154();

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
    public static int field8917 = 0;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!jia", name = "q", descriptor = "Lwk;")
    private class154 field8923;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)Lwk;", line = 4)
    public final class154 method3584(int arg0) {
        field8907++;
        class154 var2 = this.field8920.field2524;
        if (arg0 != 23287) {
            method3598(82, 84, null);
        }
        if (this.field8920 == var2) {
            return null;
        } else {
            var2.method1207(90);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Ljia;ILwk;)V", line = 31)
    private final void method3585(class645 arg0, int arg1, class154 arg2) {
        field8916++;
        if (arg1 != -22165) {
            field8917 = 34;
        }
        class154 var4 = this.field8920.field2527;
        this.field8920.field2527 = arg2.field2527;
        arg2.field2527.field2524 = this.field8920;
        if (this.field8920 != arg2) {
            arg2.field2527 = arg0.field8920.field2527;
            arg2.field2527.field2524 = arg2;
            arg0.field8920.field2527 = var4;
            var4.field2524 = arg0.field8920;
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z", line = 55)
    public final boolean method3586(int arg0) {
        if (arg0 != 0) {
            field8917 = 67;
        }
        field8909++;
        return this.field8920.field2524 == this.field8920;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILwk;)V", line = 70)
    public final void method3587(int arg0, class154 arg1) {
        if (arg0 != 0) {
            this.field8920 = null;
        }
        if (arg1.field2527 != null) {
            arg1.method1207(116);
        }
        field8918++;
        arg1.field2524 = this.field8920.field2524;
        arg1.field2527 = this.field8920;
        arg1.field2527.field2524 = arg1;
        arg1.field2524.field2527 = arg1;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)Lwk;", line = 95)
    public final class154 method3588(byte arg0) {
        field8919++;
        class154 var2 = this.field8920.field2527;
        if (this.field8920 == var2) {
            this.field8923 = null;
            return null;
        }
        this.field8923 = var2.field2527;
        if (arg0 >= -24) {
            method3593((byte) 89, 20, -51);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)Lwk;", line = 116)
    public final class154 method3589(byte arg0) {
        field8922++;
        if (arg0 >= -126) {
            this.method3595((byte) -72);
        }
        class154 var2 = this.field8920.field2524;
        if (this.field8920 == var2) {
            this.field8923 = null;
            return null;
        } else {
            this.field8923 = var2.field2524;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)V", line = 138)
    public final void method3590(byte arg0) {
        field8912++;
        while (true) {
            class154 var2 = this.field8920.field2524;
            if (this.field8920 == var2) {
                this.field8923 = null;
                int var3 = -41 % ((arg0 + 57) / 55);
                return;
            }
            var2.method1207(116);
        }
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)Lwk;", line = 160)
    public final class154 method3591(int arg0) {
        if (arg0 != 0) {
            this.method3591(82);
        }
        field8911++;
        class154 var2 = this.field8923;
        if (this.field8920 == var2) {
            this.field8923 = null;
            return null;
        } else {
            this.field8923 = var2.field2524;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "(I)Lwk;", line = 181)
    public final class154 method3592(int arg0) {
        field8924++;
        class154 var2 = this.field8923;
        if (this.field8920 == var2) {
            this.field8923 = null;
            return null;
        } else {
            this.field8923 = var2.field2527;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BII)Z", line = 201)
    public static final boolean method3593(byte arg0, int arg1, int arg2) {
        if (arg0 <= 31) {
            field8917 = -66;
        }
        field8915++;
        return class637.method3558(arg1, (byte) 78, arg2) & class678.method3822(arg2, arg1, 2048);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLwk;)V", line = 212)
    public final void method3594(byte arg0, class154 arg1) {
        field8910++;
        if (arg1.field2527 != null) {
            arg1.method1207(94);
        }
        int var3 = 21 / ((arg0 - 37) / 61);
        arg1.field2524 = this.field8920;
        arg1.field2527 = this.field8920.field2527;
        arg1.field2527.field2524 = arg1;
        arg1.field2524.field2527 = arg1;
    }

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "(B)I", line = 229)
    public final int method3595(byte arg0) {
        field8914++;
        int var2 = 0;
        class154 var3 = this.field8920.field2524;
        if (arg0 >= -115) {
            return 11;
        }
        while (this.field8920 != var3) {
            var3 = var3.field2524;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILjia;)V", line = 254)
    public final void method3596(int arg0, class645 arg1) {
        this.method3585(arg1, -22165, this.field8920.field2524);
        field8921++;
        int var3 = 125 % ((48 - arg0) / 45);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "([FIB)[F", line = 266)
    public static final float[] method3597(float[] arg0, int arg1, byte arg2) {
        field8913++;
        float[] var3 = new float[arg1];
        class275.method1773(arg0, 0, var3, 0, arg1);
        return arg2 >= -83 ? null : var3;
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V", line = 297)
    public class645() {
        this.field8920.field2524 = this.field8920;
        this.field8920.field2527 = this.field8920;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[B)[B", line = 287)
    public static final byte[] method3598(int arg0, int arg1, byte[] arg2) {
        field8908++;
        byte[] var3 = new byte[arg0];
        class275.method1771(arg2, arg1, var3, 0, arg0);
        return var3;
    }
}
