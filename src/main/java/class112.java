import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class112 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lrf;")
    private static class163 field2364 = class53.method392(101, "Attack");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lrf;")
    public static class163 field2363 = field2364;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lrf;")
    private static class163 field2373 = class53.method392(123, "Loaded title screen");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lrf;")
    public static class163 field2368 = field2373;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lrf;")
    public static class163 field2370 = class53.method392(93, "Neuer Benutzer");

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lfc;")
    public static class54 field2372 = new class54(30);

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lrf;")
    public static class163 field2375 = class53.method392(61, "(U2");

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lu;")
    public static class184 field2366;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[S")
    public static short[] field2365;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method772(int arg0) {
        field2372 = null;
        field2375 = null;
        field2373 = null;
        field2364 = null;
        field2368 = null;
        field2366 = null;
        if (arg0 == 255) {
            field2365 = null;
            field2363 = null;
            field2370 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        field2371++;
        if (class114.method781(arg1, (byte) -125)) {
            class105.method718(class84.field1798[arg1], arg0, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLqh;)V")
    public static final void method774(byte arg0, class156 arg1) {
        arg1.field3218 = false;
        if (arg1.field3220 != null) {
            arg1.field3220.field3222 = 0;
        }
        field2374++;
        for (class156 var2 = arg1.method276(); var2 != null; var2 = arg1.method278()) {
            method774((byte) 66, var2);
        }
        if (arg0 != 66) {
            field2363 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lue;II)V")
    public static final void method775(class189 arg0, int arg1, int arg2) {
        field2367++;
        if (class129.field2690 != null) {
            class129.field2690.field1033 = arg1 * 8 + 5;
            int var3 = class129.field2690.method383(39);
            int var4 = class129.field2690.method383(102);
            arg0.method1275((byte) -72, var4, var3);
            return;
        }
        class92.method648(255, 255, (byte) 0, 1203347792, true, null, 0);
        if (arg2 < 112) {
            field2368 = null;
        }
        class111.field2337[arg1] = arg0;
    }
}
