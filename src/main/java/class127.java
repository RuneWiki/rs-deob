import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class127 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lw;")
    public static class38 field2100 = new class38(64);

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lmh;")
    public static class62 field2103 = class201.method1405(true, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lmh;")
    public static class62 field2105 = null;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lr;")
    public static class250 field2102 = new class250();

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lmh;")
    public static class62 field2108 = class201.method1405(true, "Freie Welt");

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Lmh;")
    public static class62 field2107 = class201.method1405(true, "gr-Un:");

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhi;III)Z", line = 15)
    public static final boolean method951(class26 arg0, int arg1, int arg2, int arg3) {
        field2099++;
        byte[] var4 = arg0.method157(arg3, arg1, (byte) 19);
        int var5 = -77 / ((13 - arg2) / 49);
        if (var4 == null) {
            return false;
        } else {
            class54.method354(var4, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 34)
    public static void method952(byte arg0) {
        field2107 = null;
        field2103 = null;
        field2105 = null;
        if (arg0 != -51) {
            field2102 = (class250) null;
        }
        field2100 = null;
        field2102 = null;
        field2108 = null;
    }
}
