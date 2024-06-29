import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class176 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Lta;")
    public static class201 field2066;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
    public static int[] field2067;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILoa;J)V")
    public static final void method1051(int arg0, class650 arg1, long arg2) {
        class72.field929 = 0;
        field2065++;
        class537.field6769 = class561.field7018;
        class167.field1958 = 0;
        class561.field7018 = arg0;
        long var4 = class321.method1854(-45);
        for (class18 var6 = (class18) class171.field2002.method1715((byte) 122); var6 != null; var6 = (class18) class171.field2002.method1712((byte) 127)) {
            if (var6.method106(arg1, arg2)) {
                class167.field1958++;
            }
        }
        if (class325.field4066 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class171.field2002.method1718(0) + ", running: " + class167.field1958);
            System.out.println("Emitters: " + class72.field929 + " Particles: " + class561.field7018 + ". Time taken: " + (class321.method1854(arg0 ^ 0xFFFFFFC6) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public static void method1052(byte arg0) {
        if (arg0 == 86) {
            field2067 = null;
            field2066 = null;
        }
    }
}
