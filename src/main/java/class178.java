import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class178 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "J")
    public static long field3099 = 0L;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[[S")
    public static short[][] field3103 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lwk;")
    public static class273 field3102 = new class273(4);

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Loa;")
    public static class99 field3106 = class221.method1463(2844, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Loa;")
    public static class99 field3107 = class221.method1463(2844, "Benutzen");

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V")
    public abstract void method1186(int arg0, byte arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method1187(byte arg0) {
        field3107 = null;
        field3103 = null;
        field3102 = null;
        int var1 = 108 % ((arg0 - 68) / 44);
        field3106 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)I")
    public abstract int method1188(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lv;")
    public abstract class150 method1189(int arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1190(int arg0, int arg1);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)I")
    public static final int method1191(int arg0) {
        class107.field1907 = 0;
        field3104++;
        if (arg0 > -22) {
            method1193(42, (byte) 13);
        }
        return class100.method709((byte) 83);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILtg;)Lde;")
    public static final class109 method1192(int arg0, int arg1, int arg2, class182 arg3) {
        field3105++;
        if (arg1 != 10446) {
            field3102 = null;
        }
        return class153.method1016(arg0, 21451, arg3, arg2) ? class290.method1944(true) : null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IB)V")
    public static final void method1193(int arg0, byte arg1) {
        class97.field1628 = 50;
        class240.field4146 = arg0;
        if (arg1 != 18) {
            field3103 = null;
        }
        field3100++;
    }
}
