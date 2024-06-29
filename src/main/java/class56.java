import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class56 {

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "[I")
    public static int[] field569 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "Lwb;")
    public static class329 field565;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "Loh;")
    public static class404 field567;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "Lfh;")
    public static class649 field568;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
    public static void method307(boolean arg0) {
        if (!arg0) {
            field567 = null;
        }
        field569 = null;
        field568 = null;
        field567 = null;
        field565 = null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
    public static final void method308(int arg0) {
        field566++;
        class752 var1 = (class752) class572.field8135.method1719(65280);
        if (arg0 != 0) {
            method308(-6);
        }
        while (var1 != null) {
            if (var1.field10518 == -1) {
                var1.field10509 = 0;
                if (var1.field10512 >= 0 && var1.field10517 >= 0 && var1.field10512 < class489.field6976 && class153.field1677 > var1.field10517) {
                    class211.method1251(false, var1);
                }
            } else {
                var1.method864(12983);
            }
            var1 = (class752) class572.field8135.method1723(-20665);
        }
    }
}
