import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class77 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lis;")
    public class292 field1102 = new class292();

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Z")
    public boolean field1110 = false;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "[B")
    public static byte[] field1106 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1103 = null;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static final void method567(byte arg0) {
        field1109++;
        if (arg0 != 4) {
            method567((byte) -84);
        }
        class388.field5577.method905((byte) 60);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
    public static final void method568(int arg0, int arg1) {
        field1101++;
        class239 var2 = class436.method2740(3, arg0, -323285792);
        if (arg1 != 152) {
            method569(122);
        }
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method569(int arg0) {
        if (arg0 >= 114) {
            field1106 = null;
            field1103 = null;
        }
    }
}
