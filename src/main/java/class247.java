import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class247 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field3333 = 1;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Llm;")
    public static class347 field3329;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Luj;")
    public static class439 field3331;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3332;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3331 = null;
        field3329 = null;
        field3332 = null;
        if (arg0 != 5787) {
            field3331 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lii;IZLwl;ZII)V")
    public static final void method1490(class405 arg0, int arg1, boolean arg2, class273 arg3, boolean arg4, int arg5, int arg6) {
        field3335++;
        if (arg2) {
            class273.field3971.method454((class138.field1907 - class273.field3971.method411()) / 2, (class92.field1294 - class273.field3971.method409()) / 2);
            class267.field3859.method454((class138.field1907 - class267.field3859.method411()) / 2, 18);
        }
        arg3.method1881(class138.field1907 / 2, class71.field1017 == 1 ? class288.field4159 : class278.field4027, class92.field1294 / 2 - 26, -1, arg1, 90);
        int var7 = class92.field1294 / 2 - 18;
        if (!arg4) {
            return;
        }
        arg0.method1731(class138.field1907 / 2 - 152, var7, 304, 34, arg5, 0);
        arg0.method1731(class138.field1907 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg0.method1632(class138.field1907 / 2 - 150, var7 + 2, class451.field6587 * 3, 30, arg6, 0);
        arg0.method1632(class138.field1907 / 2 - (150 - class451.field6587 * 3), var7 + 2, 300 - (class451.field6587 * 3), 30, 0, 0);
        arg3.method1881(class138.field1907 / 2, class89.field1246, class92.field1294 / 2 + 4, -1, arg1, -40);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ln;I)V")
    public static final void method1491(class25 arg0, int arg1) {
        if (arg1 != 29740) {
            return;
        }
        field3328++;
        class365 var2 = (class365) class254.field3522.method384((long) arg0.field4301, true);
        if (var2 == null) {
            class406.method2620(class227.field2981, arg0.field4362[0], 0, 97, arg0.field4360[0], arg0, (class104) null, (class43) null);
        } else {
            var2.method2382((byte) -29);
        }
    }
}
