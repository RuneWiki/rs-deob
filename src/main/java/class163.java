import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class163 extends class223 {

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[[S")
    public static short[][] field2880 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "Luh;")
    public static class100 field2886;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "Llk;")
    public class81 field2873;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "[B")
    public byte[] field2887;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "[I")
    public static int[] field2884;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "[S")
    public static short[] field2883;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "[[[B")
    public static byte[][][] field2875;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "[[[I")
    public static int[][][] field2881;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BZ)V")
    public static final void method1178(byte arg0, boolean arg1) {
        class72.field1327 = null;
        class173.field3066 = null;
        class75.field1388 = null;
        if (arg1 && class1.field5 != null) {
            class52.field1000 = class1.field5.field4557;
        } else {
            class52.field1000 = null;
        }
        ++field2885;
        class170.field3018 = null;
        class281.field4945 = null;
        class204.field3593 = null;
        class161.field2854 = null;
        class127.field2221 = null;
        class236.field4351 = null;
        class134.field2325 = 0;
        class1.field5 = null;
        class231.field4240 = null;
        class14.field234.method924(-30865);
        if (arg0 < -106) {
            class98.field1740 = null;
            class267.field4726 = null;
            class106.field1881 = null;
            class248.field4495 = null;
            class164.field2904 = null;
            field2886 = null;
            class102.field1842 = null;
            class48.field950 = -1;
            class62.field1137 = -1;
            class57.field1052 = null;
            class255.field4566 = null;
            class159.field2815 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
    public static final void method1179(int arg0, int arg1) {
        if (arg1 != -19353) {
            field2883 = null;
        }
        if (~class221.field4065 == -1) {
            class195.field3437.method188(arg0, (byte) -69);
        } else {
            class288.field5147 = arg0;
        }
        ++field2878;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)[B")
    public final byte[] method1180(byte arg0) {
        ++field2874;
        if (arg0 != 39) {
            return null;
        } else if (super.field4084) {
            throw new RuntimeException();
        } else {
            return this.field2887;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)I")
    public final int method1181(int arg0) {
        ++field2877;
        if (arg0 != 7595) {
            field2886 = null;
        }
        return super.field4084 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field2880 = null;
        int var1 = 69 % ((50 - arg0) / 44);
        field2884 = null;
        field2886 = null;
        field2875 = null;
        field2883 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    public static final void method1183(int arg0) {
        ++field2888;
        class150.field2637.method258(2047);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class215.field3825[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 == -33) {
            while (var2 < 32) {
                class250.field4518[var2] = 0L;
                ++var2;
            }
            class97.field1716 = 0;
        }
    }
}
