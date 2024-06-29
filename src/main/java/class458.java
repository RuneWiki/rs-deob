import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class458 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "J")
    public static volatile long field6410 = 0L;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lbu;")
    public static class21 field6411 = new class21(103, 7);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
    public static int[] field6417 = new int[1];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    public static boolean field6415;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[B")
    public byte[] field6413;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[S")
    public short[] field6407;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[S")
    public short[] field6409;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[S")
    public short[] field6412;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[Luh;")
    public static final class176[] method2727(byte arg0) {
        field6408++;
        if (arg0 != 76) {
            method2727((byte) 38);
        }
        return new class176[] { class473.field6634, class652.field9110, class402.field5507, class661.field9211, class47.field595, class199.field3045, class525.field7511, class9.field89, class167.field2631, class741.field10218, class235.field3529, class752.field10401, class129.field1974, class757.field10436 };
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    public static final void method2728(byte arg0, int arg1) {
        field6414++;
        class313 var2 = class312.method1998((long) arg1, 2, -1);
        var2.method2006(97);
        if (arg0 < 94) {
            method2729((byte) -34);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method2729(byte arg0) {
        field6417 = null;
        field6411 = null;
        if (arg0 != 77) {
            method2727((byte) 49);
        }
    }
}
