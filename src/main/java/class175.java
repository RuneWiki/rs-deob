import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class175 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[S")
    public static short[] field2599 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2605 = "Starting 3d Library";

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static volatile int field2594 = 0;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "J")
    public long field2596;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lbf;")
    public class205 field2593;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lbf;")
    public class205 field2602;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lbf;")
    public class205 field2606;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1145(byte arg0) {
        field2605 = null;
        int var1 = 62 % ((1 - arg0) / 46);
        field2599 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public static final void method1146(byte arg0) {
        field2597++;
        class16.field263.method1782(101);
        if (arg0 != -78) {
            method1146((byte) 20);
        }
    }
}
