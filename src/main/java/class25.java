import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class25 {

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "Llo;")
    public class116 field220;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "Lal;")
    public static class123 field219;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lhe;")
    public static class573 field223;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "[Ls;")
    public static class339[] field221;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "[Ltd;")
    public static class515[] field222;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method106(int arg0, int arg1) {
        if (arg1 < 59) {
            field224 = -105;
        }
        field225++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V", line = 21)
    public static final void method107(int arg0, int arg1, int arg2) {
        boolean var3 = class565.field8185[0][arg1][arg2] != null && class565.field8185[0][arg1][arg2].field5433 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class565.field8185[var4][arg1][arg2] == null) {
                class375 var5 = class565.field8185[var4][arg1][arg2] = new class375(var4);
                if (var3) {
                    var5.field5430++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 44)
    public static void method108(byte arg0) {
        field222 = null;
        field219 = null;
        field223 = null;
        if (arg0 != -78) {
            method106(33, 77);
        }
        field221 = null;
    }
}
