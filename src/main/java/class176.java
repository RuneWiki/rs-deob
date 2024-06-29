import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class176 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1316(String arg0, int arg1) {
        field2852++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        int var2 = 127 / ((-arg1 - 55) / 32);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I")
    public abstract int method915(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public abstract void method914(int arg0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)V")
    public static final void method1317(boolean arg0, int arg1) {
        field2851++;
        if (!arg0) {
            method1317(true, -92);
        }
        class18.field195.method1548(arg1, 0);
        class150.field2441.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)J")
    public abstract long method912(int arg0);
}
