import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class37 extends class324 {

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field408 = new String[200];

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "[[I")
    public static int[][] field406 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Lig;")
    public static class206 field407 = new class206(18, -1);

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method201(byte arg0, int arg1) {
        field405++;
        if (arg0 != -122) {
            method202(null, -13, true, -121);
        }
        if (class616.field8962 == arg1) {
            return;
        }
        class90.field1032 = class30.field349 = class283.field3935[arg1];
        class616.method3554(32768);
        class305.field4479 = new int[4][class90.field1032 >> 3][class30.field349 >> 3];
        class524.field7604 = new int[class90.field1032][class30.field349];
        class72.field775 = new int[class90.field1032][class30.field349];
        for (int var2 = 0; var2 < 4; var2++) {
            class14.field120[var2] = class31.method182(class90.field1032, 29317, class30.field349);
        }
        class399.field6056 = new byte[4][class90.field1032][class30.field349];
        class227.method1475(4, class30.field349, 0, class90.field1032);
        class56.method417(class90.field1032 >> 3, class413.field6264, class30.field349 >> 3, 5);
        class616.field8962 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BIZI)[B", line = 41)
    public static final byte[] method202(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field409++;
        if (!arg2) {
            field406 = null;
        }
        byte[] var4 = new byte[arg1];
        class210.method1330(arg0, arg3, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 63)
    public static void method203(byte arg0) {
        field407 = null;
        field408 = null;
        int var1 = 126 / ((65 - arg0) / 32);
        field406 = null;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V", line = 75)
    public class37(int arg0, int arg1) {
        this.field410 = arg1;
        this.field404 = arg0;
    }
}
