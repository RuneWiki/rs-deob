import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class106 extends class366 {

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public int field1356 = 1;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1363 = null;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "C")
    public char field1357;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[I")
    public static int[] field1365;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method619(int arg0) {
        field1355++;
        class15 var1 = class341.field4926;
        synchronized (class341.field4926) {
            class341.field4926.method98(0);
            if (arg0 != 1) {
                field1353 = 121;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ICB)I")
    public static final int method620(int arg0, char arg1, byte arg2) {
        field1364++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg2 != 79) {
            field1363 = null;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLlf;)V")
    public final void method621(boolean arg0, class130 arg1) {
        field1354++;
        if (!arg0) {
            method626(96, -101, -9, -117, -120, 25, 53, 45);
        }
        while (true) {
            int var3 = arg1.method837(true);
            if (var3 == 0) {
                return;
            }
            this.method622(var3, (byte) 4, arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLlf;)V")
    private final void method622(int arg0, byte arg1, class130 arg2) {
        if (arg1 != 4) {
            field1363 = null;
        }
        field1360++;
        if (arg0 == 1) {
            this.field1357 = class171.method1223(3043, arg2.method823((byte) 117));
        } else if (arg0 == 2) {
            this.field1356 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Canvas;B)Leg;")
    public static final class56 method623(Canvas arg0, byte arg1) {
        field1361++;
        try {
            Class var2 = Class.forName("en");
            class56 var3 = (class56) var2.getDeclaredConstructor().newInstance();
            var3.method365(arg0, false);
            return arg1 == 59 ? var3 : null;
        } catch (Throwable var5) {
            class96 var4 = new class96();
            var4.method365(arg0, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method624(int arg0) {
        field1365 = null;
        field1363 = null;
        if (arg0 != 4) {
            field1363 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I")
    public static final int method625(int arg0, int arg1, int arg2) {
        field1362++;
        if (arg0 > -110) {
            method626(-95, -59, 127, 53, -106, -8, 12, 86);
        }
        return arg2 == 4 || arg2 == 5 ? class59.field795[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class356.method2328(arg1, arg2, arg7, arg4, arg6, 0, arg5 + 2109, arg3, arg0);
        if (arg5 != -2237) {
            field1365 = null;
        }
        field1359++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method627(int arg0, int arg1) {
        field1358++;
        class276 var2 = class264.method1816((byte) -88, arg1, arg0);
        var2.method1870((byte) 126);
    }
}
