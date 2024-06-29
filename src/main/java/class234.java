import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class234 {

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public int field3758 = -1;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lwg;")
    public static class277 field3763 = new class277();

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "Lwf;")
    public static class306 field3761;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Loe;")
    public class98 field3762;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[I")
    public int[] field3759;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "[I")
    public static int[] field3764;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[Lng;")
    public static class245[] field3765;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "[Lob;")
    public static class58[] field3766;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field3760;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)Ljava/lang/String;", line = 6)
    public static final String method1595(int arg0, int arg1, int arg2) {
        field3755++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 <= 0) {
            if (arg2 != -22543) {
                method1597(35, -83);
            }
            return "<col=ffff00>";
        } else {
            return "<col=c0ff00>";
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method1596(int arg0, boolean arg1) {
        if (arg1) {
            field3761 = (class306) null;
        }
        field3756++;
        class265.field4088.method1287(arg0, 115);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Ljava/lang/String;", line = 59)
    public static final String method1597(int arg0, int arg1) {
        field3754++;
        return arg0 >= class76.field1144[arg1].length() ? class242.field3830[arg1] : class242.field3830[arg1] + class299.field4641 + class76.field1144[arg1];
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 77)
    public static void method1598(byte arg0) {
        field3761 = null;
        int var1 = 54 % ((42 - arg0) / 46);
        field3763 = null;
        field3765 = null;
        field3764 = null;
        field3766 = null;
    }
}
