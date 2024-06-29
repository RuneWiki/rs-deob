import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class121 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Luf;")
    public static class168 field1881 = class148.method1019(-1720, "hitbar_default");

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Luf;")
    private static class168 field1884 = class148.method1019(-1720, "M");

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Luf;")
    public static class168 field1879 = field1884;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
    public static boolean field1888 = false;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Luf;")
    public static class168 field1885 = field1884;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field1883;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 9)
    public static void method866(boolean arg0) {
        field1883 = null;
        field1881 = null;
        field1885 = null;
        field1879 = null;
        if (arg0) {
            method866(true);
        }
        field1884 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 27)
    public static final void method867(int arg0, int arg1) {
        field1886++;
        if (arg1 != 3961) {
            field1882 = -10;
        }
        class58.field761.method1428(arg0, 29946);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III[[III)I", line = 41)
    public static final int method868(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        field1887++;
        int var6 = (128 - arg1) * arg3[arg5][arg0] + (arg3[arg5 + 1][arg0] * arg1) >> 7;
        if (arg4 != 0) {
            method866(false);
        }
        int var7 = (128 - arg1) * arg3[arg5][arg0 + 1] + (arg3[arg5 + 1][arg0 + 1] * arg1) >> 7;
        return (128 - arg2) * var6 + arg2 * var7 >> 7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)[Lgk;", line = 67)
    public static final class265[] method870(int arg0) {
        field1880++;
        if (arg0 != 10472) {
            method867(58, 127);
        }
        class265[] var1 = new class265[class201.field3305];
        for (int var2 = 0; var2 < class201.field3305; var2++) {
            var1[var2] = new class265(class56.field724, class206.field3381, class154.field2430[var2], class254.field4341[var2], class205.field3374[var2], class214.field3490[var2], class236.field3779[var2], class123.field1905);
        }
        class244.method1679(-14642);
        return var1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLbl;)Lbl;")
    public abstract class141 method869(boolean arg0, class141 arg1);
}
