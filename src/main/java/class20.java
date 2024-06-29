import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field490 = 1;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "B")
    public static byte field495 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Loc;")
    private static class99 field492 = class48.method402((byte) -104, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Loc;")
    public static class99 field493 = field492;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Loc;")
    public static class99 field489 = class48.method402((byte) -104, "backbase2");

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lrd;")
    public static class119 field488 = new class119(4096);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Loc;")
    public static class99 field499 = class48.method402((byte) -104, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Loe;")
    public static class102 field484;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[[[B")
    public static byte[][][] field486;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method187(int arg0) {
        field492 = null;
        field488 = null;
        if (arg0 != -3) {
            return;
        }
        field493 = null;
        field486 = null;
        field499 = null;
        field489 = null;
        field484 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lhe;I)I")
    public static final int method188(class54 arg0, int arg1) {
        class73 var2 = (class73) class109.field2668.method1001(((long) arg0.field1293 << arg1) + ((long) arg0.field1390), (byte) -62);
        field496++;
        return var2 == null ? arg0.field1352 : var2.field1841;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([Loc;I)Loc;")
    public static final class99 method189(class99[] arg0, int arg1) {
        field498++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 <= 5) {
            method187(86);
        }
        return class1.method4(arg0.length, false, 0, arg0);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static final void method190(int arg0) {
        if (class39.field978 != null) {
            class125 var1 = class39.field978;
            synchronized (class39.field978) {
                class39.field978 = null;
            }
        }
        if (arg0 != 1321) {
            field488 = null;
        }
        field483++;
    }
}
