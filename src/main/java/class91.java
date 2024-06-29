import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class91 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lvg;")
    public static class22 field1132 = new class22();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Z")
    public static boolean field1137 = false;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method496(boolean arg0) {
        if (arg0) {
            field1135 = -121;
        }
        field1131++;
        for (class130 var1 = (class130) class272.field4346.method1802(43); var1 != null; var1 = (class130) class272.field4346.method1815(0)) {
            class71 var2 = var1.field2086;
            if (class244.field4011 != var2.field887 || var2.field881) {
                var1.method1673(14510);
            } else if (var2.field900 <= class73.field924) {
                var2.method400(class32.field427, 50);
                if (var2.field881) {
                    var1.method1673(14510);
                } else {
                    class28.method165(var2.field887, var2.field886, var2.field898, var2.field880, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method497(byte arg0) {
        field1132 = null;
        if (arg0 > -93) {
            field1135 = -13;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method498(int arg0, int arg1) {
        field1134++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class44.field556 + " (" + var2 + ")</col>";
        } else {
            if (arg1 != 8) {
                method496(false);
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class40.field503 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lnl;")
    public static final class216 method499(int arg0) {
        if (arg0 == 0) {
            field1133++;
            return class273.field4371 < class79.field989.length ? class79.field989[class273.field4371++] : null;
        } else {
            return null;
        }
    }
}
