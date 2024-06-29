import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lpe;")
    public static class109 field3132 = class141.method1120("va", 0);

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field3145 = 0;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lpe;")
    public static class109 field3134 = class141.method1120("Versteckt", 0);

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lpe;")
    public static class109 field3146 = class141.method1120("T", 0);

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[S")
    public static short[] field3149 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lbc;")
    public static class11 field3133 = new class11(50);

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "[I")
    public static int[] field3153 = new int[2000];

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[Lpe;")
    public static class109[] field3155 = new class109[100];

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lpe;")
    private static class109 field3154 = class141.method1120("Loading sprites )2 ", 0);

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lpe;")
    public static class109 field3152 = field3154;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[B")
    public byte[] field3131;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[B")
    public byte[] field3138;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method1129(int arg0, int arg1) {
        for (class158 var2 = (class158) class100.field2095.method508(arg0 - 12299); var2 != null; var2 = (class158) class100.field2095.method506((byte) 127)) {
            if ((var2.field267 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method101((byte) 117);
            }
        }
        if (arg0 != 12192) {
            field3154 = null;
        }
        field3130++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method1130(byte arg0) {
        if (class115.field2562 != null) {
            class72 var1 = class115.field2562;
            synchronized (class115.field2562) {
                class115.field2562 = null;
            }
        }
        if (arg0 > -4) {
            method1133((byte) 124);
        }
        field3142++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        class81.field1682 = true;
        int var1 = 99 % ((-arg0 - 52) / 34);
        class62.field1269 = true;
        field3144++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lpe;")
    public static final class109 method1132(int arg0, int arg1) {
        if (arg1 <= 78) {
            return null;
        } else {
            field3151++;
            return class83.method709(10, arg0, false, 18303);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        field3132 = null;
        field3133 = null;
        field3154 = null;
        field3152 = null;
        field3155 = null;
        field3134 = null;
        field3146 = null;
        field3153 = null;
        field3149 = null;
        if (arg0 != 47) {
            field3132 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lna;Lna;ILna;Lna;)V")
    public static final void method1134(class91 arg0, class91 arg1, int arg2, class91 arg3, class91 arg4) {
        class27.field625 = arg1;
        if (arg2 != 10) {
            method1134(null, null, 45, null, null);
        }
        class19.field485 = arg0;
        field3136++;
        class108.field2263 = arg3;
        class15.field389 = arg4;
        class114.field2525 = new class154[class108.field2263.method757((byte) -90)][];
        class47.field981 = new boolean[class108.field2263.method757((byte) -34)];
    }
}
