import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class97 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lop;")
    public static class353 field1326 = new class353(64);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    public static int[] field1329 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[[Z")
    public static boolean[][] field1328 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1330 = "rating: ";

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lse;")
    public static class332 field1331;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
    public int[] field1321;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Z", line = 3)
    public static final boolean method633(boolean arg0, int arg1) {
        field1323++;
        if (arg1 != 47) {
            method635(87, false);
        }
        boolean var2 = class35.field574.method2051();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class35.field574.method2108();
        } else if (!class35.field574.method2176()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class396.field5947 = arg0;
            class423.method2724(class361.field5285, (byte) -7);
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V", line = 46)
    public static final void method635(int arg0, boolean arg1) {
        if (arg1) {
            field1331 = null;
        }
        field1324++;
        class360.field5280.method215(0, arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 65)
    public static void method638(byte arg0) {
        field1330 = null;
        if (arg0 != 21) {
            field1328 = null;
        }
        field1331 = null;
        field1326 = null;
        field1328 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 85)
    public static final void method639(byte arg0) {
        field1322++;
        if (arg0 > -105) {
            method635(-107, false);
        }
        class413.field6182.method2276(false);
        class347.field5148 = null;
        class24.field428 = 1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method634(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public abstract void method636(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method637(Canvas arg0, int arg1);
}
