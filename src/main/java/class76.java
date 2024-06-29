import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class76 extends RuntimeException {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/lang/String;")
    public String field1073;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1070;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lkc;")
    public static class157 field1072 = new class157("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Z")
    public static boolean[] field1077 = new boolean[100];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Llp;")
    public static class153 field1075;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1078;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method592(byte arg0, int arg1) {
        int var2 = 67 % ((-arg0 - 71) / 33);
        field1074++;
        class314 var3 = class177.method1213(false, 6, arg1);
        var3.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 17)
    public static final void method593(byte arg0) {
        class133.field2022.method2774((byte) -47);
        field1071++;
        class445.field6549.method2774((byte) 103);
        class121.field1882.method2774((byte) -64);
        class399.field5721.method2774((byte) 115);
        class365.field5248.method2774((byte) 110);
        if (arg0 != -1) {
            method594(-99);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 33)
    public static void method594(int arg0) {
        field1075 = null;
        if (arg0 != 0) {
            method594(87);
        }
        field1072 = null;
        field1078 = null;
        field1077 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 46)
    public static final int method595(int arg0, int arg1) {
        return class92.field1512 == null ? 0 : class92.field1512[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 52)
    public class76(Throwable arg0, String arg1) {
        this.field1073 = arg1;
        this.field1070 = arg0;
    }
}
