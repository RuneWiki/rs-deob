import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2406 = -1;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lhb;")
    private static class44 field2415 = class102.method810("Connection lost", -28606);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Lhb;")
    public static class44[] field2409 = new class44[100];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lhb;")
    public static class44 field2412 = class102.method810("null", -28606);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lhb;")
    public static class44 field2408 = class102.method810("(Udns", -28606);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lhb;")
    public static class44 field2416 = class102.method810("@gr1@", -28606);

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lhb;")
    public static class44 field2421 = null;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Z")
    public static boolean field2411 = true;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lhb;")
    public static class44 field2419 = field2415;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lhb;")
    public static class44 field2426 = class102.method810("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", -28606);

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lhb;")
    private static class44 field2425 = class102.method810("Connecting to friendserver", -28606);

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lhb;")
    public static class44 field2424 = field2425;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lhb;")
    public static class44 field2427 = class102.method810("Nehmen", -28606);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    public static int[] field2407 = new int[100];

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lhb;")
    public static class44 field2414 = class102.method810("title)3jpg", -28606);

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Lhb;")
    public static class44 field2428 = class102.method810("Duell akzeptieren", -28606);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ldd;")
    public static class23 field2413 = new class23();

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    public static int[] field2410;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILtd;)V", line = 7)
    public static final void method753(int arg0, class116 arg1) {
        class81.field2071 = arg1;
        if (arg0 != -1) {
            field2414 = null;
        }
        field2423++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method754(boolean arg0) {
        if (arg0) {
            method754(true);
        }
        class35.field845.method335((byte) 2);
        field2418++;
        class94.field2390.method335((byte) 91);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 79)
    public static void method755(int arg0) {
        field2408 = null;
        field2421 = null;
        field2407 = null;
        if (arg0 < 66) {
            return;
        }
        field2413 = null;
        field2424 = null;
        field2427 = null;
        field2410 = null;
        field2428 = null;
        field2409 = null;
        field2414 = null;
        field2412 = null;
        field2415 = null;
        field2419 = null;
        field2416 = null;
        field2426 = null;
        field2425 = null;
    }
}
