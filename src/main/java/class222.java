import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class222 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3539 = "Loaded defaults";

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ltb;")
    public static class220 field3537 = null;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3541 = "Allocating memory";

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ldb;")
    public static class43 field3540;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 6)
    public static int method1577(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 15)
    public static void method1578(byte arg0) {
        field3540 = null;
        field3539 = null;
        field3537 = null;
        field3541 = null;
        if (arg0 >= -24) {
            field3541 = (String) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lkj;", line = 28)
    public static final class34 method1579(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class34 var4 = var3.field2215;
            var3.field2215 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjava/lang/String;)I", line = 43)
    public static final int method1580(byte arg0, String arg1) {
        field3538++;
        if (class162.field2445 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 != -10) {
            method1580((byte) -66, (String) null);
        }
        for (int var2 = 0; var2 < class162.field2445.field4696; var2++) {
            if (class67.method516(class162.field2445.field4693[var2], " ", "<br>", false).equals(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
