import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class183 extends class236 {

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lsg;")
    private static class30 field3357 = class167.method1221((byte) 33, "Loaded fonts");

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lsg;")
    public static class30 field3361 = field3357;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Lsg;")
    public static class30 field3366 = class167.method1221((byte) 33, " <col=ffffff>");

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3372 = 0;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lib;")
    public static class76 field3356 = new class76(0, 0);

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3375 = Calendar.getInstance();

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public static int[] field3378 = new int[2048];

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lsg;")
    public static class30 field3377 = class167.method1221((byte) 33, "Sprites geladen)3");

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Lsg;")
    public class30 field3367;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Ldl;")
    public class31 field3369;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Ldl;")
    public class31 field3374;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Z")
    public boolean field3358;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[Ljava/lang/Object;")
    public Object[] field3363;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lvg;")
    public static final class219 method1317(int arg0, int arg1) {
        field3353++;
        if (arg1 < 5) {
            field3366 = null;
        }
        class219 var2 = (class219) class49.field1111.method1644((byte) -43, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class219 var3 = class221.method1597(14448, false, arg0, class106.field2132, class30.field596);
        if (var3 != null) {
            class49.field1111.method1646((long) arg0, var3, -114);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3377 = null;
        field3356 = null;
        field3361 = null;
        field3375 = null;
        if (arg0 < 2) {
            field3361 = null;
        }
        field3378 = null;
        field3366 = null;
        field3357 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsg;I)Lgi;")
    public static final class179 method1319(class30 arg0, int arg1) {
        if (arg1 != 2048) {
            return null;
        }
        field3360++;
        for (class179 var2 = (class179) class204.field3659.method478(arg1 - 2048); var2 != null; var2 = (class179) class204.field3659.method476((byte) 13)) {
            if (var2.field3306.method267(arg1 ^ 0xFFFFF7CC, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
    public static final void method1320(byte arg0, int arg1, int arg2) {
        if (arg0 <= -29) {
            class68 var3 = class103.method830(arg1, 4, 6);
            field3364++;
            var3.method608(false);
            var3.field1484 = arg2;
        }
    }
}
