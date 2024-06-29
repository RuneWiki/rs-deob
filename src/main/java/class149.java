import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class149 {

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "J")
    public static volatile long field2654 = 0L;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lpj;")
    public static class237 field2642 = class33.method353("event_opbase", 72);

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Lpj;")
    private static class237 field2658 = class33.method353("Ok", 61);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2643 = 50;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "[Lpj;")
    public static class237[] field2656 = new class237[field2643];

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
    public static int[] field2653 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "[I")
    public static int[] field2660 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[I")
    public static int[] field2657 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[I")
    public static int[] field2649 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
    public static int[] field2646 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[I")
    public static int[] field2661 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lpj;")
    public static class237 field2652 = field2658;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[I")
    public static int[] field2648 = new int[field2643];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lw;")
    public static class141 field2645;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[[[B")
    public static byte[][][] field2647;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method1006(byte[] arg0, byte arg1, boolean arg2) {
        field2659++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class224.field3845) {
            try {
                class73 var3 = (class73) Class.forName("ei").getDeclaredConstructor().newInstance();
                var3.method576(arg0, arg1 ^ 0xFFFFFFC5);
                return var3;
            } catch (Throwable var4) {
                class224.field3845 = true;
            }
        }
        if (arg1 != 79) {
            field2658 = null;
        }
        return arg2 ? class10.method112(arg0, -1) : arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2653 = null;
        field2647 = null;
        field2661 = null;
        field2660 = null;
        field2642 = null;
        if (arg0 != 5886) {
            method1008(-125L, 8);
        }
        field2656 = null;
        field2652 = null;
        field2657 = null;
        field2645 = null;
        field2646 = null;
        field2648 = null;
        field2649 = null;
        field2658 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
    public static final void method1008(long arg0, int arg1) {
        field2650++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class221.field3810 < 100 || class260.field4457) || class221.field3810 >= 200) {
            class175.method1212(class233.field4026, class239.field4202, (byte) 125, 0);
            return;
        }
        class237 var3 = class146.method995(270, arg0).method1581((byte) -104);
        for (int var4 = arg1; var4 < class221.field3810; var4++) {
            if (class144.field2601[var4] == arg0) {
                class175.method1212(class238.method1626(new class237[] { var3, class118.field2066 }, -42), class239.field4202, (byte) 106, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class179.field3143; var5++) {
            if (class17.field289[var5] == arg0) {
                class175.method1212(class238.method1626(new class237[] { class176.field3081, var3, class186.field3262 }, -122), class239.field4202, (byte) 103, 0);
                return;
            }
        }
        if (var3.method1585((byte) 8, class229.field3911.field4655)) {
            class175.method1212(class29.field590, class239.field4202, (byte) 107, 0);
            return;
        }
        class275.field4825++;
        class152.field2694[class221.field3810] = var3;
        class144.field2601[class221.field3810] = arg0;
        class71.field1399[class221.field3810] = 0;
        class13.field213[class221.field3810] = class239.field4202;
        class195.field3402[class221.field3810] = 0;
        class180.field3163[class221.field3810] = false;
        class221.field3810++;
        class20.field381 = class3.field31;
        class223.field3830.method368(-123, 241);
        class223.field3830.method292(-88, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method1009(int arg0, int arg1) {
        field2651++;
        class273.field4730.method939(arg1, arg0 - 240);
        if (arg0 != 241) {
            method1009(15, 14);
        }
    }
}
