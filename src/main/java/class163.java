import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class163 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[Lsd;")
    public static class27[] field2432;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lh;", line = 8)
    public static final class218 method1169(int arg0, int arg1) {
        field2429++;
        class218 var2 = (class218) class175.field2584.method816((long) arg1, (byte) 73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class278.field4267.method1507(class116.method905(255, arg1), (byte) 124, class252.method1752(arg1, (byte) -111));
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1559(-1, new class35(var3));
        }
        class175.field2584.method817(var4, (long) arg1, (byte) -110);
        if (arg0 > -103) {
            method1170((byte) -12, (class111) null, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLpk;Z)V", line = 36)
    public static final void method1170(byte arg0, class111 arg1, boolean arg2) {
        int var3 = arg1.field1750;
        int var4 = (int) arg1.field3418;
        arg1.method1554((byte) -55);
        field2428++;
        if (arg2) {
            class13.method102(-6129, var3);
        }
        class21.method146((byte) -113, var3);
        class184 var5 = class100.method781((byte) 48, var4);
        if (var5 != null) {
            class133.method1007(var5, 96);
        }
        int var6 = class6.field62;
        int var7 = 0;
        if (arg0 < 80) {
            method1169(121, 121);
        }
        while (var6 > var7) {
            if (class218.method1561(106, class326.field5068[var7])) {
                class213.method1537(var7, -1);
            }
            var7++;
        }
        if (class6.field62 == 1) {
            class67.field982 = false;
            class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
        } else {
            class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
            int var8 = class64.field956.method426(class272.field4119);
            for (int var9 = 0; var9 < class6.field62; var9++) {
                int var10 = class64.field956.method426(class189.method1365(false, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class327.field5074 = var8 + 8;
            class62.field936 = class6.field62 * 15 + (class285.field4395 ? 26 : 22);
        }
        if (class319.field4972 != -1) {
            class243.method1685(1, -12359, class319.field4972);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 108)
    public static void method1171(byte arg0) {
        field2432 = null;
        if (arg0 != 29) {
            method1170((byte) 16, (class111) null, true);
        }
    }
}
