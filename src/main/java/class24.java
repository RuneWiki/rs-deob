import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class123 {

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
    public static int[] field568 = new int[5];

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lvc;")
    public static class137 field569 = class45.method325("Ausw-=hlen", -46);

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Z")
    public static boolean field572 = false;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field566 = Calendar.getInstance();

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "[I")
    public static int[] field584 = new int[99];

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Lvc;")
    public static class137 field581 = class45.method325("Lade Freunde)2Liste)3)3)3", -46);

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static volatile int field582 = 0;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "Lvc;")
    private static class137 field590;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "Lvc;")
    public static class137 field588;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Lvc;")
    public static class137 field589;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "Lvc;")
    public static class137 field587;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Lvc;")
    public static class137 field591;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "Lqe;")
    public static class109 field580;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
    public int[] field570;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "[Lvc;")
    public class137[] field571;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
    public static final void method208(int arg0, byte arg1) {
        field567++;
        class122.method915(0, 0, arg0, false, null);
        if (arg1 < 91) {
            method208(-61, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static void method209(boolean arg0) {
        field589 = null;
        field591 = null;
        field566 = null;
        field569 = null;
        field581 = null;
        field584 = null;
        field590 = null;
        if (arg0) {
            field588 = null;
            field587 = null;
            field580 = null;
            field568 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lcf;Lfc;II)V")
    public static final void method210(class21 arg0, class39 arg1, int arg2, int arg3) {
        field574++;
        class98 var4 = new class98();
        var4.field2490 = arg3;
        var4.field2295 = arg0;
        var4.field2280 = 1;
        var4.field2279 = arg1;
        class100 var5 = class106.field2471;
        synchronized (class106.field2471) {
            class106.field2471.method730(arg2 - 8489, var4);
        }
        if (arg2 != 8956) {
            method208(-74, (byte) 41);
        }
        class7.method48((byte) 89);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field584[var1] = var0 / 4;
        }
        field585 = 0;
        field586 = 0;
        field590 = class45.method325("This world is full)3", -46);
        field588 = field590;
        field589 = class45.method325("Fehler bei der Verbindung zum Server)3", -46);
        field587 = class45.method325("Lade Texturen )2 ", -46);
        field591 = class45.method325("Diese Betatest)2Welt ist nur f-Ur eingeladene", -46);
    }
}
