import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class61 extends class98 {

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lf;")
    public class277 field1043;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "Lmb;")
    public static class96 field1047 = class243.method1708("zap", (byte) 108);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "[I")
    public static int[] field1046 = new int[100];

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lmb;")
    public static class96 field1051 = class243.method1708("_", (byte) 119);

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lmb;")
    public static class96 field1050 = class243.method1708("leuchten2:", (byte) 100);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lff;")
    public static class3 field1045;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method437(int arg0, int arg1) {
        if (arg1 == -3064) {
            class213.field3667.method82((byte) -109, arg0);
            field1049++;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static void method438(byte arg0) {
        field1045 = null;
        field1050 = null;
        field1051 = null;
        field1047 = null;
        if (arg0 != -119) {
            method437(88, -100);
        }
        field1046 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lf;)V")
    public class61(class277 arg0) {
        this.field1043 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3) {
        field1044++;
        class43 var4 = class270.method1847(arg0, arg1 ^ 0xFFFFD7DF, arg1);
        var4.method333(55);
        var4.field740 = arg3;
        var4.field732 = arg2;
    }
}
