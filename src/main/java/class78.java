import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class78 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lec;")
    public static class40 field934 = new class40("K", "T", "K", "K");

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lg;")
    public static class470 field936;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
    public static int[] field933;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[[S")
    public static short[][] field935;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(ILoj;)Lmg;")
    public abstract class451 method19(int arg0, class280 arg1);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static void method391(int arg0) {
        field934 = null;
        field933 = null;
        field936 = null;
        int var1 = 2 % ((58 - arg0) / 61);
        field935 = null;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Z")
    public abstract boolean method33(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILoj;II)Z")
    public abstract boolean method28(int arg0, class280 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIII)V")
    public static final void method392(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field932++;
        if (arg1 >= -28) {
            return;
        }
        float var5 = (float) class429.field6200 / (float) class429.field6212;
        int var6 = arg2;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg4 - var7) / 2;
        int var9 = arg0 - (arg2 - var6) / 2;
        class104.field1260 = -1;
        class325.field4690 = -1;
        class17.field218 = class429.field6200 - (class429.field6200 * var8 / var7);
        class486.field6898 = class429.field6212 * var9 / var6;
        class184.method1003(-85);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBZ)V")
    public static final void method393(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != 84) {
            field936 = null;
        }
        field929++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class345.field4936 = arg1;
        class288.field4309 = arg0;
        class137.field1664 = arg3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public abstract void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public abstract void method32(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method394(int arg0, String arg1, String arg2, int arg3) {
        class85.field1050 = arg2;
        field930++;
        class486.field6896 = arg1;
        class35.field438 = arg0;
        if (class85.field1050.equals("") || class486.field6896.equals("")) {
            class224.field3107 = 3;
        } else if (class232.field3220 == -1) {
            class294.field4364 = 0;
            class135.field1633 = 0;
            class487.field6911 = 1;
            class224.field3107 = -3;
            class179 var4 = new class179(128);
            var4.method909(arg3, -1);
            var4.method897((int) (Math.random() * 9.9999999E7D), arg3 - 119);
            var4.method929((byte) -69, class41.method207(arg3 - 10, class85.field1050));
            var4.method897((int) (Math.random() * 9.9999999E7D), -118);
            var4.method935(class486.field6896, -92);
            var4.method897((int) (Math.random() * 9.9999999E7D), -118);
            var4.method914(arg3 ^ 0x507A7462, class196.field2707, class99.field1211);
            class230.field3185.field2206 = 0;
            class230.field3185.method909(class214.field2956.field4563, -1);
            class230.field3185.method909(var4.field2206 + 2, -1);
            class230.field3185.method884(574, true);
            class230.field3185.method934((byte) -59, var4.field2159, 0, var4.field2206);
        } else {
            class126.method600(128);
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Z")
    public static final boolean method395(int arg0) {
        field931++;
        if (arg0 != -1) {
            field934 = null;
        }
        return class223.field3099 > 0;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(ILoj;)V")
    public abstract void method27(int arg0, class280 arg1);
}
