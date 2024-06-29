import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class77 extends class134 {

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Ljava/lang/String;")
    public String field1180;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[I")
    public static int[] field1178 = new int[5];

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lub;")
    public static class92 field1176;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method603(int arg0) {
        field1176 = null;
        field1178 = null;
        if (arg0 > -86) {
            method604(-56, -8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    public static final int method604(int arg0, int arg1) {
        if (arg1 <= 113) {
            return 76;
        } else {
            field1182++;
            return arg0 == 16711935 ? -1 : class301.method2015(arg0, -4357);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)Lcc;")
    public static final class222 method605(int arg0, int arg1, byte arg2) {
        field1181++;
        class222 var3 = class169.method1217(arg1, 12180);
        if (arg0 == -1) {
            return var3;
        } else if (arg2 == -32) {
            return var3 == null || var3.field3526 == null || var3.field3526.length <= arg0 ? null : var3.field3526[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public static final int method606(int arg0) {
        field1184++;
        return arg0 == 0 ? class160.field2408 : -9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)V")
    public static final void method607(byte arg0, long arg1) {
        class240.field3826.field541 = 0;
        class240.field3826.method305(21, true);
        field1185++;
        class240.field3826.method313(-6968, arg1);
        class37.field632 = 0;
        if (arg0 <= 85) {
            method605(19, 101, (byte) -45);
        }
        class163.field2463 = 0;
        class231.field3667 = -3;
        class128.field1918 = 1;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class77() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class77(String arg0, int arg1) {
        this.field1180 = arg0;
    }
}
