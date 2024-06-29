import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class111 extends class165 {

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "[I")
    public int[] field1644 = new int[] { -1 };

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "[I")
    public int[] field1643 = new int[] { 0 };

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1645 = new CRC32();

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Lcm;")
    public static class45 field1647 = new class45(0, 0);

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "[I")
    public static int[] field1651 = new int[50];

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "[I")
    public static int[] field1649 = new int[14];

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "[I")
    public static int[] field1652 = new int[64];

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field1653 = -1;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1654 = 128;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Lun;")
    public static class121 field1646;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V", line = 5)
    public static void method764(byte arg0) {
        if (arg0 != 37) {
            field1645 = (CRC32) null;
        }
        field1651 = null;
        field1647 = null;
        field1649 = null;
        field1652 = null;
        field1646 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILjava/lang/String;)V", line = 24)
    public static final void method765(int arg0, int arg1, String arg2) {
        field1648++;
        if (arg1 < -91) {
            class344 var3 = class110.method759(2, arg0, false);
            var3.method2390((byte) -109);
            var3.field5352 = arg2;
        }
    }
}
