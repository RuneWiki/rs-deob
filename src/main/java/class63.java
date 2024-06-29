import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 extends class96 {

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Lbh;")
    public class272 field1001;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Lna;")
    private static class26 field999 = class69.method505("Loading config )2 ", (byte) -122);

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Lna;")
    private static class26 field997 = class69.method505("yellow:", (byte) -124);

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Lna;")
    public static class26 field1000 = field997;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "Lna;")
    public static class26 field1002 = field999;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Lna;")
    public static class26 field1004 = class69.method505("Speicher wird zugewiesen)3", (byte) -128);

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "Lna;")
    public static class26 field1006 = field997;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 5)
    public static void method477(int arg0) {
        field1002 = null;
        field1006 = null;
        field999 = null;
        int var1 = 101 % ((-arg0 - 29) / 45);
        field1000 = null;
        field1004 = null;
        field997 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V", line = 23)
    public static final void method478(byte arg0, int arg1) {
        field1003++;
        class73.field1124[0] = (float) class4.method23(255, arg1 >> 16) / 255.0F;
        class73.field1124[1] = (float) class4.method23(arg1 >> 8, 255) / 255.0F;
        class73.field1124[2] = (float) class4.method23(255, arg1) / 255.0F;
        class188.method1288(-32584, 3);
        class188.method1288(-32584, 4);
        if (arg0 != 56) {
            method478((byte) 127, 99);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLwa;)Lre;", line = 39)
    public static final class276 method479(byte arg0, class82 arg1) {
        if (arg0 != 54) {
            method477(117);
        }
        field1005++;
        return new class276(arg1.method626((byte) 25), arg1.method626((byte) 73), arg1.method626((byte) 114), arg1.method626((byte) 33), arg1.method626((byte) 78), arg1.method626((byte) 91), arg1.method626((byte) 120), arg1.method626((byte) 113), arg1.method633((byte) 115), arg1.method642((byte) -64));
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lbh;)V", line = 56)
    public class63(class272 arg0) {
        this.field1001 = arg0;
    }
}
