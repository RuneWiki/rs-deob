import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class177 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lke;")
    private static class256 field3124 = class316.method2202("Loading )2 please wait)3", 27626);

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3129 = -1;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[[I")
    public static int[][] field3134 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lke;")
    public static class256 field3128 = class316.method2202("<col=ffffff>", 27626);

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lke;")
    public static class256 field3127 = field3124;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lke;")
    public static class256 field3138;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/awt/Component;II)Lml;", line = 4)
    public static final class159 method1280(int arg0, Component arg1, int arg2, int arg3) {
        field3133++;
        try {
            Class var4 = Class.forName("sb");
            if (arg3 != 8) {
                method1285((class138) null, (class138) null, true, (byte) 72);
            }
            class159 var5 = (class159) var4.getDeclaredConstructor().newInstance();
            var5.method450((byte) -91, arg0, arg1, arg2);
            return var5;
        } catch (Throwable var8) {
            class57 var7 = new class57();
            var7.method450((byte) -91, arg0, arg1, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILla;IIII)V", line = 29)
    public static final void method1281(int arg0, int arg1, int arg2, class188 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class5.field81) {
            class181.field3195 = 32;
        } else {
            class181.field3195 = 0;
        }
        class5.field81 = false;
        if (class287.field4978 != 0) {
            if (arg2 >= arg7 && arg2 < arg7 + 16 && arg6 >= arg0 && (arg0 + 16) > arg6) {
                arg3.field3463 -= 4;
                class64.method500(arg3, (byte) -117);
            } else if (arg7 <= arg2 && arg7 + 16 > arg2 && arg0 + arg1 - 16 <= arg6 && arg6 < arg0 + arg1) {
                arg3.field3463 += 4;
                class64.method500(arg3, (byte) -117);
            } else if (arg7 - class181.field3195 <= arg2 && arg7 - (-class181.field3195 - 16) > arg2 && arg6 >= (arg0 + 16) && (arg0 + arg1 - 16) > arg6) {
                int var8 = (arg1 - 32) * arg1 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - arg0 - (var8 / 2) - 16;
                int var10 = arg1 - var8 - 32;
                arg3.field3463 = (arg5 - arg1) * var9 / var10;
                class64.method500(arg3, (byte) -117);
                class5.field81 = true;
            }
        }
        field3131++;
        if (arg4 < 17) {
            method1282((byte) 100);
        }
        if (class157.field2795 == 0) {
            return;
        }
        int var11 = arg3.field3391;
        if (arg7 - var11 <= arg2 && arg0 <= arg6 && arg2 < (arg7 + 16) && arg6 <= arg0 + arg1) {
            arg3.field3463 += class157.field2795 * 45;
            class64.method500(arg3, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I", line = 99)
    public static final int method1282(byte arg0) {
        if (arg0 >= -57) {
            method1284(112, -92, 75, -10);
        }
        class50.field906 = 0;
        field3132++;
        return class27.method182(31860);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 111)
    public static final void method1283(int arg0) {
        field3125++;
        int var1 = -103 / ((arg0 + 2) / 63);
        class294.field5107.method2084(-116);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V", line = 143)
    public static final void method1284(int arg0, int arg1, int arg2, int arg3) {
        field3137++;
        class77 var4 = class156.method1158(9, false, arg0);
        var4.method584(22992);
        var4.field1459 = arg3;
        if (arg2 > -9) {
            field3124 = (class256) null;
        }
        var4.field1455 = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lng;Lng;ZB)V", line = 173)
    public static final void method1285(class138 arg0, class138 arg1, boolean arg2, byte arg3) {
        if (arg3 > 24) {
            field3135++;
            class154.field2749 = arg0;
            class99.field1769 = arg1;
            class316.field5450 = arg2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V", line = 188)
    public static void method1286(byte arg0) {
        field3128 = null;
        field3134 = (int[][]) null;
        field3124 = null;
        field3138 = null;
        if (arg0 > -4) {
            field3127 = (class256) null;
        }
        field3127 = null;
    }
}
