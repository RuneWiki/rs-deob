import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class104 extends RuntimeException {

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
    public String field2411;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2420;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lvc;")
    public static class137 field2406 = class45.method325("auf einer freien Welt zu spielen)3", -46);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lvc;")
    public static class137 field2409 = class45.method325("logo", -46);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lvc;")
    private static class137 field2407 = class45.method325("From", -46);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lvc;")
    public static class137 field2413 = field2407;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lvc;")
    public static class137 field2415 = class45.method325("Der Anmelde)2Server ist offline)3", -46);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public static boolean field2408 = false;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lvc;")
    public static class137 field2416 = class45.method325("Ung-Ultiger Benutzername", -46);

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lvc;")
    public static class137 field2417 = class45.method325("backtop1", -46);

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lvc;")
    private static class137 field2414 = class45.method325("Your ignore list is full)3 Max of 100 hit", -46);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lvc;")
    public static class137 field2419 = field2414;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lvc;")
    private static class137 field2424 = class45.method325("Loading title screen )2 ", -46);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lvc;")
    private static class137 field2405 = class45.method325("Select", -46);

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lvc;")
    public static class137 field2422 = field2405;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lvc;")
    public static class137 field2410 = field2424;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ltc;")
    public static class125 field2412;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method755(byte arg0) {
        field2412 = null;
        field2413 = null;
        if (arg0 != 0) {
            field2413 = null;
        }
        field2419 = null;
        field2407 = null;
        field2406 = null;
        field2416 = null;
        field2424 = null;
        field2422 = null;
        field2414 = null;
        field2410 = null;
        field2409 = null;
        field2405 = null;
        field2417 = null;
        field2415 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)V")
    public static final void method756(long arg0, byte arg1) {
        if (arg1 < 92) {
            method756(-37L, (byte) -4);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field2418++;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class104(Throwable arg0, String arg1) {
        this.field2411 = arg1;
        this.field2420 = arg0;
    }
}
