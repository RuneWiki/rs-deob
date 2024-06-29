import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
    public static int[] field66 = new int[2048];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static volatile int field67 = 0;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lec;")
    public static class28 field68 = class28.method210(-46, "Select");

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lec;")
    private static class28 field69 = class28.method210(-46, "Drop");

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lec;")
    public static class28 field62 = class28.method210(-46, "redstone3");

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lec;")
    public static class28 field64 = field69;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lec;")
    public static class28 field63 = class28.method210(-46, "backvmid3");

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Z")
    public static boolean field73 = false;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lec;")
    public static class28 field70 = class28.method210(-46, "Enter message to send to ");

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[Lqa;")
    public static class96[] field74 = new class96[12];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "J")
    public static long field65;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lbb;")
    public static class9 field61;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lbb;B)V")
    public static final void method22(class9 arg0, byte arg1) {
        field60++;
        class105 var2 = new class105();
        var2.field2222 = 2;
        var2.field2215 = arg0;
        int var3 = 86 % ((39 - arg1) / 61);
        class42 var4 = class114.field2426;
        synchronized (class114.field2426) {
            class114.field2426.method337(25563, var2);
        }
        class94.method676(false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method23(int arg0) {
        field63 = null;
        field70 = null;
        field68 = null;
        field74 = null;
        if (arg0 != 22984) {
            return;
        }
        field64 = null;
        field61 = null;
        field69 = null;
        field62 = null;
        field66 = null;
    }
}
