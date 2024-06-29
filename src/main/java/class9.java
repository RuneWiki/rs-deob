import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class9 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field157 = new int[25];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
    public static boolean field158 = true;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field154;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lgd;", line = 10)
    public static final class180 method53(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2407; var4++) {
            class180 var5 = var3.field2406[var4];
            if ((var5.field2585 >> 29 & 0x3L) == 2L && var5.field2590 == arg1 && var5.field2580 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZII)I", line = 31)
    public static final int method54(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field160++;
        if (var4 == 0) {
            return arg3;
        }
        if (!arg1) {
            method56((byte) -38, -103);
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 57)
    public static void method55(int arg0) {
        field157 = null;
        field154 = null;
        if (arg0 != -1) {
            field156 = -61;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V", line = 72)
    public static final void method56(byte arg0, int arg1) {
        if (class170.field2456 == null) {
            class170.field2456 = new byte[4][104][104];
        }
        if (arg1 != -25773) {
            field156 = 12;
        }
        field159++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class170.field2456[var2][var3][var4] = arg0;
                }
            }
        }
    }
}
