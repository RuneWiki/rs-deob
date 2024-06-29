import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class117 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lba;")
    public static class8 field2920 = new class8(new byte[5000]);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2924 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "La;")
    private static class1 field2929 = class113.method934(-11538, "Hidden");

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "La;")
    public static class1 field2930 = class113.method934(-11538, "backbase1");

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
    public static int[] field2928 = new int[500];

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "La;")
    private static class1 field2926 = class113.method934(-11538, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "La;")
    public static class1 field2931 = field2929;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "La;")
    public static class1 field2934 = field2926;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[J")
    public static long[] field2932 = new long[200];

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lre;")
    public static class107 field2927 = new class107();

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Le;")
    public static class25 field2922;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
    public static int[] field2933;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "[[Lqd;")
    public static class100[][] field2925;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 10)
    public static final void method963(int arg0) {
        field2919++;
        if (class70.field1753 > 0) {
            class98.method850(-7225);
            return;
        }
        class34.method400(40, 99);
        class67.field1695 = class57.field1453;
        class57.field1453 = null;
        if (arg0 != 2578) {
            field2930 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 35)
    public static final void method964(int arg0) {
        field2916++;
        int var1 = 70 / ((62 - arg0) / 55);
        class3.field116 = true;
        class93.field2335 = true;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 56)
    public static final void method965(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2915++;
        if (class9.field312 == null) {
            return;
        }
        if (class122.field3033 >= 0) {
            if (class62.field1551 > 0) {
                class81.field2049 += class8.field303;
                class9.field312.method303((byte) -97, class122.field3033, class81.field2049);
                class62.field1551--;
                if (class62.field1551 == 0) {
                    class9.field312.method306((byte) -96);
                    class122.field3033 = -1;
                    class62.field1551 = 20;
                }
            }
        } else if (class62.field1551 > 0) {
            class62.field1551--;
            if (class62.field1551 == 0) {
                if (class2.field79 == null) {
                    class9.field312.method305(256, 0);
                } else {
                    class9.field312.method305(class36.field976, arg0);
                    class122.field3033 = class36.field976;
                    class9.field312.method308(class2.field79, class67.field1665, -15910, class36.field976);
                    class2.field79 = null;
                }
                class81.field2049 = 0;
            }
        }
        class9.field312.method309(0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 123)
    public static void method966(byte arg0) {
        field2920 = null;
        int var1 = 84 / ((arg0 + 74) / 47);
        field2925 = null;
        field2933 = null;
        field2929 = null;
        field2922 = null;
        field2934 = null;
        field2932 = null;
        field2930 = null;
        field2927 = null;
        field2926 = null;
        field2931 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)I", line = 143)
    public static final int method967(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method967(-73, 123, 115, 98);
        }
        field2917++;
        if ((class34.field899[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class34.field899[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }
}
