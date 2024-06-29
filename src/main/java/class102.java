import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class102 extends class423 {

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public int field1604 = (int) (class254.method1522((byte) -51) / 1000L);

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "S")
    public short field1601;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Ljava/lang/String;")
    public String field1600;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "[S")
    public static short[] field1603 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Lkc;")
    public static class157 field1599 = new class157("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "Z")
    public static boolean field1605 = true;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1606 = 0;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "Lhi;")
    public static class45 field1607 = new class45(2, 7);

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "Lkc;")
    public static class157 field1608 = new class157("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)B", line = 8)
    public static final byte method792(int arg0, int arg1, int arg2) {
        field1602++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == arg2 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 25)
    public static void method793(int arg0) {
        int var1 = -116 / ((-arg0 - 57) / 56);
        field1608 = null;
        field1599 = null;
        field1607 = null;
        field1603 = null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class102(String arg0, int arg1) {
        this.field1601 = (short) arg1;
        this.field1600 = arg0;
    }
}
