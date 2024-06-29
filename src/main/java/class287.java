import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class287 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lki;")
    private class321 field3593 = new class321();

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[S")
    private static short[] field3585 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[S")
    private static short[] field3582 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[[I")
    public static int[][] field3583 = new int[6][];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[S")
    private static short[] field3590 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[S")
    private static short[] field3587 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field3588 = new int[4];

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[[S")
    public static short[][] field3594 = new short[][] { field3590, field3585, field3582, field3587 };

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lki;")
    private class321 field3597;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Lki;", line = 3)
    public final class321 method1665(int arg0) {
        field3598++;
        if (arg0 != -10300) {
            return null;
        }
        class321 var2 = this.field3593.field3948;
        if (this.field3593 == var2) {
            return null;
        } else {
            var2.method1821(arg0 + 10385);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 22)
    public final void method1666(byte arg0) {
        if (arg0 != 71) {
            this.method1670((byte) -10, null);
        }
        while (true) {
            class321 var2 = this.field3593.field3948;
            if (this.field3593 == var2) {
                field3595++;
                this.field3597 = null;
                return;
            }
            var2.method1821(126);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lki;", line = 46)
    public final class321 method1667(int arg0) {
        if (arg0 != 20814) {
            this.method1665(-39);
        }
        field3596++;
        class321 var2 = this.field3593.field3946;
        if (this.field3593 == var2) {
            this.field3597 = null;
            return null;
        } else {
            this.field3597 = var2.field3946;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 68)
    public static void method1668(byte arg0) {
        if (arg0 != -67) {
            return;
        }
        field3587 = null;
        field3590 = null;
        field3594 = null;
        field3585 = null;
        field3588 = null;
        field3582 = null;
        field3583 = null;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Lki;", line = 96)
    public final class321 method1669(int arg0) {
        field3592++;
        class321 var2 = this.field3597;
        if (this.field3593 == var2) {
            this.field3597 = null;
            return null;
        }
        if (arg0 != -2747) {
            this.method1672((byte) 66);
        }
        this.field3597 = var2.field3948;
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLki;)V", line = 118)
    public final void method1670(byte arg0, class321 arg1) {
        if (arg1.field3946 != null) {
            arg1.method1821(104);
        }
        field3581++;
        arg1.field3946 = this.field3593.field3946;
        if (arg0 < -5) {
            arg1.field3948 = this.field3593;
            arg1.field3946.field3948 = arg1;
            arg1.field3948.field3946 = arg1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Z", line = 142)
    public final boolean method1671(byte arg0) {
        if (arg0 == -115) {
            field3591++;
            return this.field3593.field3948 == this.field3593;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)Lki;", line = 160)
    public final class321 method1672(byte arg0) {
        field3586++;
        class321 var2 = this.field3593.field3948;
        if (arg0 <= 67) {
            method1668((byte) -96);
        }
        if (this.field3593 == var2) {
            this.field3597 = null;
            return null;
        } else {
            this.field3597 = var2.field3948;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)I", line = 193)
    public final int method1673(int arg0) {
        if (arg0 != 20423) {
            return 14;
        }
        field3584++;
        int var2 = 0;
        class321 var3 = this.field3593.field3948;
        while (this.field3593 != var3) {
            var3 = var3.field3948;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 221)
    public class287() {
        this.field3593.field3948 = this.field3593;
        this.field3593.field3946 = this.field3593;
    }
}
