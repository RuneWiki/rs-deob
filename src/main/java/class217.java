import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class217 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public static int[] field3894 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lah;")
    public static class22 field3900 = new class22(4);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lqj;")
    public static class196 field3901 = class80.method502(")4a=", -48);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
    public static int[] field3902;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[Lwi;")
    public static class233[] field3898;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/util/Random;I)I")
    public static final int method1484(boolean arg0, Random arg1, int arg2) {
        field3899++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class24.method141(127, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            if (!arg0) {
                field3894 = null;
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class24.method139(var4, arg2, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method1485(int arg0) {
        field3898 = null;
        field3900 = null;
        field3902 = null;
        field3901 = null;
        if (arg0 != -14068) {
            field3894 = null;
        }
        field3894 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method1486(boolean arg0) {
        if (arg0) {
            field3902 = null;
        }
        field3897++;
        class247.field4393.method135(42);
        class218.field3903.method135(9);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Ln;")
    public static final class135 method1487(int arg0, int arg1) {
        if (arg1 > -4) {
            field3894 = null;
        }
        field3895++;
        if (arg0 == 0) {
            return new class23();
        } else if (arg0 == 1) {
            return new class84();
        } else if (arg0 == 2) {
            return new class101();
        } else if (arg0 == 3) {
            return new class31();
        } else if (arg0 == 4) {
            return new class193();
        } else if (arg0 == 5) {
            return new class236();
        } else if (arg0 == 6) {
            return new class131();
        } else if (arg0 == 7) {
            return new class76();
        } else if (arg0 == 8) {
            return new class189();
        } else if (arg0 == 9) {
            return new class30();
        } else if (arg0 == 10) {
            return new class78();
        } else if (arg0 == 11) {
            return new class73();
        } else if (arg0 == 12) {
            return new class238();
        } else if (arg0 == 13) {
            return new class176();
        } else if (arg0 == 14) {
            return new class240();
        } else if (arg0 == 15) {
            return new class241();
        } else if (arg0 == 16) {
            return new class198();
        } else if (arg0 == 17) {
            return new class148();
        } else if (arg0 == 18) {
            return new class230();
        } else if (arg0 == 19) {
            return new class171();
        } else if (arg0 == 20) {
            return new class90();
        } else if (arg0 == 21) {
            return new class133();
        } else if (arg0 == 22) {
            return new class48();
        } else if (arg0 == 23) {
            return new class216();
        } else if (arg0 == 24) {
            return new class96();
        } else if (arg0 == 25) {
            return new class180();
        } else if (arg0 == 26) {
            return new class71();
        } else if (arg0 == 27) {
            return new class242();
        } else if (arg0 == 28) {
            return new class18();
        } else if (arg0 == 29) {
            return new class142();
        } else if (arg0 == 30) {
            return new class74();
        } else if (arg0 == 31) {
            return new class53();
        } else if (arg0 == 32) {
            return new class219();
        } else if (arg0 == 33) {
            return new class125();
        } else if (arg0 == 34) {
            return new class86();
        } else if (arg0 == 35) {
            return new class104();
        } else if (arg0 == 36) {
            return new class163();
        } else if (arg0 == 37) {
            return new class65();
        } else if (arg0 == 38) {
            return new class245();
        } else if (arg0 == 39) {
            return new class83();
        } else {
            return null;
        }
    }
}
