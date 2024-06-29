import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class251 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3595 = "yellow:";

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
    public static volatile long field3598 = 0L;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3602 = "Cancel";

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lqc;")
    public static class99 field3600 = new class99(50);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[S")
    public static short[] field3604;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "[[[Lpi;")
    public static class202[][][] field3605;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1708(byte arg0, int arg1) {
        field3597++;
        if (arg0 != 116) {
            return;
        }
        for (class183 var2 = class13.field150.method110(arg0 - 116); var2 != null; var2 = class13.field150.method115(arg0 ^ 0x74)) {
            if (((long) arg1) == (var2.field2522 >> 48 & 0xFFFFL)) {
                var2.method1274((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 64)
    public static void method1709(int arg0) {
        if (arg0 <= 87) {
            return;
        }
        field3605 = (class202[][][]) null;
        field3604 = null;
        field3602 = null;
        field3600 = null;
        field3595 = null;
    }
}
