import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class137 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "S")
    public static short field2416 = 1;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2417 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    public static int[] field2420 = new int[4];

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lsf;")
    public static class108 field2424 = class140.method973(255, "<)4col>");

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lsf;")
    public static class108 field2425 = class140.method973(255, "Nehmen");

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
    public static boolean field2427 = true;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field2429 = 0;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    public static int[] field2418 = new int[2];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lla;")
    public static class139 field2428;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lii;")
    public static class216 field2419;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 12)
    public static final void method943(int arg0) {
        field2422++;
        if (class202.field3652 < 0) {
            class202.field3652 = 0;
            class25.field382 = -1;
            class301.field5243 = -1;
        }
        if (class202.field3652 > class74.field1113) {
            class202.field3652 = class74.field1113;
            class25.field382 = -1;
            class301.field5243 = -1;
        }
        if (arg0 < ~class126.field2121) {
            class301.field5243 = -1;
            class126.field2121 = 0;
            class25.field382 = -1;
        }
        if (class152.field2757 < class126.field2121) {
            class301.field5243 = -1;
            class126.field2121 = class152.field2757;
            class25.field382 = -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V", line = 67)
    public static final void method944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 32327) {
            return;
        }
        field2426++;
        if (arg1 >= class260.field4593 && arg1 <= class79.field1202) {
            int var5 = class174.method1236(class266.field4677, arg3, class166.field2984, -6219);
            int var6 = class174.method1236(class266.field4677, arg2, class166.field2984, -6219);
            class229.method1535(arg1, var6, var5, (byte) -116, arg4);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 110)
    public static void method945(int arg0) {
        field2424 = null;
        field2418 = null;
        field2420 = null;
        field2428 = null;
        field2419 = null;
        field2425 = null;
        if (arg0 < 88) {
            method943(18);
        }
    }
}
