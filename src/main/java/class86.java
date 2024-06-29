import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class86 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[Z")
    public static boolean[] field1150 = new boolean[5];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lcp;IIII)V", line = 6)
    public static final void method650(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class110.method843(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class590.field8010) {
            class110.method843(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class110.method843(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class151.field1933) {
            class110.method843(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class151.field1933) {
            class110.method843(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class590.field8010 && arg4 <= class151.field1933) {
            class110.method843(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class110.method843(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class590.field8010 && arg4 > 0) {
            class110.method843(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLoa;)V", line = 58)
    public static final void method651(boolean arg0, class43 arg1) {
        field1149++;
        if (arg0 || class451.field5885.method2094((byte) -108) == 0) {
            return;
        }
        if (class364.field4697 == 0) {
            for (class186 var2 = (class186) class451.field5885.method2090(true); var2 != null; var2 = (class186) class451.field5885.method2088(-152)) {
                class232.field3109.method1293(false, var2.field2371, class305.field4015, var2.field2374, 10, var2.field2372, var2.field2375, var2.field2379, arg1, var2.field2373 ? class233.field3130.field2469 : null, false, arg1);
                var2.method2438((byte) 126);
            }
            class211.method1355(-21784);
            return;
        }
        if (class17.field189 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class17.field189 = class43.method333(class650.field9053, 126, var3, class448.field5863, 0, 0);
            class17.field200 = class17.field189.method405(class346.method1992(0, 14278, class483.field6442, class261.field3511), class506.method2731(class90.field1186, class483.field6442, 0), true);
        }
        for (class186 var4 = (class186) class451.field5885.method2090(true); var4 != null; var4 = (class186) class451.field5885.method2088(-152)) {
            class232.field3109.method1293(false, var4.field2371, class17.field200, var4.field2374, 10, var4.field2372, var4.field2375, var4.field2379, class17.field189, var4.field2373 ? class233.field3130.field2469 : null, false, arg1);
            var4.method2438((byte) 1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 122)
    public static void method652(byte arg0) {
        if (arg0 > -36) {
            method652((byte) 123);
        }
        field1150 = null;
    }
}
