import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class303 extends class41 {

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "Lgp;")
    public static class53 field3614 = new class53();

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    public static int field3619 = 0;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "Z")
    public static boolean field3620 = false;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field3618 = -1;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "Ltja;")
    public static class288 field3617 = new class288(4);

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "J")
    private long field3613;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V", line = 4)
    public static final void method1759(byte arg0) {
        class150.field1870 = new class121(8);
        field3621++;
        int var1 = -72 % ((59 - arg0) / 56);
        class43.field592 = 0;
        for (class766 var2 = (class766) class148.field1836.method2447(-112); var2 != null; var2 = (class766) class148.field1836.method2439(-102)) {
            var2.method4251();
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Loga;I)V", line = 25)
    public final void method331(class500 arg0, int arg1) {
        if (arg1 != 55) {
            method1760((byte) 24);
        }
        field3611++;
        arg0.method2965((byte) 68, this.field3615, this.field3613);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILes;)V", line = 43)
    public final void method329(int arg0, class403 arg1) {
        this.field3615 = arg1.method2381((byte) 72);
        if (arg0 != -3999) {
            this.field3613 = -63L;
        }
        field3612++;
        this.field3613 = arg1.method2361(45);
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(B)V", line = 70)
    public static void method1760(byte arg0) {
        field3614 = null;
        if (arg0 > 81) {
            field3617 = null;
        }
    }
}
