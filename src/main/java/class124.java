import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class124 extends class393 {

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "S")
    public short field1652;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1654 = new String[200];

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field1656 = 13156520;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "Los;")
    public static class378 field1655;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 5)
    public static void method851(int arg0) {
        field1655 = null;
        if (arg0 <= 85) {
            field1654 = null;
        }
        field1654 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIB)V", line = 16)
    public static final void method852(int arg0, int arg1, byte arg2) {
        if (arg2 != 61) {
            field1651 = -9;
        }
        field1653++;
        class256 var3 = class363.method2385(14, arg1, (byte) 1);
        var3.method1614(0);
        var3.field3756 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V", line = 29)
    public class124() {
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(S)V", line = 33)
    public class124(short arg0) {
        this.field1652 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B[Lqa;)V", line = 41)
    public static final void method853(byte arg0, class243[] arg1) {
        class246.field3430 = arg1.length;
        if (arg0 >= -22) {
            return;
        }
        field1657++;
        class417.field6208 = new class243[class246.field3430 + 10];
        class42.field653 = new int[class246.field3430 + 10];
        class111.method772(arg1, 0, class417.field6208, 0, class246.field3430);
        for (int var2 = 0; var2 < class246.field3430; var2++) {
            class42.field653[var2] = class417.field6208[var2].method1091();
        }
        for (int var3 = class246.field3430; var3 < class417.field6208.length; var3++) {
            class42.field653[var3] = 12;
        }
    }
}
