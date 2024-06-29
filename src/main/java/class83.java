import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class83 extends IOException {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
    public static int[] field1155 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Lfc;")
    public static class235 field1156 = new class235(53, 3);

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lsu;")
    public static class192 field1161 = new class192();

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Luc;")
    public static class27 field1162 = new class27(25, 8);

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "[C")
    public static char[] field1163 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)I")
    public static final int method646(int arg0, int arg1, int arg2, int arg3) {
        field1160++;
        if ((class246.field3501[arg0][arg3][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class246.field3501[1][arg3][arg1] & 0x2) == 0) {
            if (arg2 != 9297) {
                field1156 = null;
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class83(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IFFF)F")
    public static final float method647(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 != 3) {
            field1161 = null;
        }
        field1157++;
        return (arg1 - arg3) * arg2 + arg3;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBIII)V")
    public static final void method648(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1158++;
        if (arg1 == arg3) {
            class62.method510(arg0, arg5, arg3, arg4, true);
            return;
        }
        if (class482.field6703 <= (arg0 - arg3) && (arg0 + arg3) <= class144.field2148 && class92.field1219 <= arg4 - arg1 && class631.field8829 >= (arg1 + arg4)) {
            class65.method535(arg3, arg5, arg1, arg0, arg4, (byte) -46);
        } else {
            class515.method2864(arg4, arg0, -24254, arg1, arg3, arg5);
        }
        if (arg2 < 1) {
            field1162 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static void method649(boolean arg0) {
        field1162 = null;
        field1156 = null;
        field1155 = null;
        field1161 = null;
        if (!arg0) {
            method646(-93, -77, -119, 112);
        }
        field1163 = null;
    }
}
