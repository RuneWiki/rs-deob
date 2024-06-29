import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class81 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field1004 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "F")
    public static float field1008;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lja;")
    public static class254 field1010;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    public static int[] field1007;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLr;)V", line = 7)
    public static final void method768(byte arg0, class167 arg1) {
        field1011++;
        if (arg0 <= 112) {
            method768((byte) 124, null);
        }
        class106.field1728 = new class13[class345.field5562.length];
        for (int var2 = 0; var2 < class345.field5562.length; var2++) {
            int var3 = class345.field5562[var2];
            class632 var4 = class597.method3482(32, var3, class499.field7328);
            class418 var5 = arg1.method347(var4, class284.method2028(class290.field4593, var3), true);
            class106.field1728[var2] = new class13(var5, var4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 45)
    public static int method769(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 54)
    public static void method770(byte arg0) {
        field1007 = null;
        if (arg0 == 58) {
            field1010 = null;
            field1004 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)[I", line = 67)
    public static final int[] method771(byte arg0) {
        int var1 = 37 % ((arg0 - 40) / 32);
        field1006++;
        return new int[] { class382.field5923, class666.field9430, class471.field6978 };
    }
}
