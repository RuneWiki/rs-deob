import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class39 extends class132 {

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field599 = 0;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lsc;")
    public static class181 field600 = class149.method967(255, "showingVideoAd");

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[Led;")
    public static class116[] field602 = new class116[2048];

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lsc;")
    public static class181 field604 = class149.method967(255, "<col=ffff00>");

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lsc;")
    public static class181 field598 = class149.method967(255, "hint_mapmarkers");

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Ljb;")
    public static class11 field601;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
    public static final boolean method282(int arg0, int arg1) {
        int var2 = 115 % ((arg0 - 8) / 37);
        field597++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method283(int arg0) {
        field600 = null;
        field601 = null;
        field598 = null;
        field604 = null;
        if (arg0 != -130) {
            method283(64);
        }
        field602 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZI)I")
    public static final int method284(int arg0, int arg1, boolean arg2, int arg3) {
        field603++;
        class196 var4 = (class196) class254.field4435.method1424(true, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3420.length; var6++) {
            if (var4.field3420[var6] >= 0 && var4.field3420[var6] < class188.field3325) {
                class99 var7 = class237.method1620(-29539, var4.field3420[var6]);
                if (var7.field1605 != null) {
                    class124 var8 = (class124) var7.field1605.method1424(true, (long) arg3);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field3418[var6] * var8.field2029;
                        } else {
                            var5 += var8.field2029;
                        }
                    }
                }
            }
        }
        if (arg0 >= -34) {
            field600 = null;
        }
        return var5;
    }
}
