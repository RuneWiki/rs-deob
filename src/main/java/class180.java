import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class180 {

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3222 = -1;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
    public static int[] field3205 = new int[50];

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lha;")
    public static class46 field3216 = class271.method1828("mem=", -46);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lha;")
    private static class46 field3217 = class271.method1828(" is already on your ignore list)3", -46);

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lha;")
    public static class46 field3221 = field3217;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "J")
    public static long field3210 = 0L;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lha;")
    public static class46 field3219 = class271.method1828("Lade Sprites )2 ", -46);

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lha;")
    private static class46 field3223 = class271.method1828("Loaded input handler", -46);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lha;")
    public static class46 field3209 = field3223;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lg;")
    public class225 field3206;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lpa;")
    public static class258 field3215;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    public int[] field3207;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[Lha;")
    public class46[] field3208;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1288(byte arg0) {
        field3205 = null;
        field3215 = null;
        field3221 = null;
        field3217 = null;
        field3219 = null;
        field3209 = null;
        field3223 = null;
        field3216 = null;
        if (arg0 >= -15) {
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1289(int arg0) {
        field3214++;
        int var1 = class73.field1297;
        int var2 = class64.field1079;
        int var3 = class29.field565 - var1 - class50.field876;
        int var4 = class236.field4118 - class163.field2895 - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                int var5 = 0;
                Container var6;
                if (class161.field2851 != null) {
                    var6 = class161.field2851;
                } else if (class227.field3983 == null) {
                    var6 = class8.field130.field143;
                } else {
                    var6 = class227.field3983;
                }
                int var7 = 0;
                if (class227.field3983 == var6) {
                    Insets var8 = class227.field3983.getInsets();
                    var5 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var6.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var5, var7, var1, class236.field4118);
                }
                if (var2 > 0) {
                    var9.fillRect(var5, var7, class29.field565, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(var5 + class29.field565 - var3, var7, var3, class236.field4118);
                }
                if (var4 > 0) {
                    var9.fillRect(var5, class236.field4118 + var7 - var4, class29.field565, var4);
                }
            } catch (Exception var11) {
            }
        }
        int var10 = -118 / ((59 - arg0) / 51);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class68.field1184 = arg4;
        class149.field2670 = arg3;
        field3213++;
        class52.field898 = arg0;
        if (arg2 >= -28) {
            method1289(89);
        }
        class160.field2831 = arg5;
        class143.field2605 = arg1;
        if (class160.field2831 >= 100) {
            int var6 = class149.field2670 * 128 + 64;
            int var7 = class143.field2605 * 128 + 64;
            int var8 = class206.method1461(var6, class135.field2450, var7, 4) - class68.field1184;
            int var9 = var8 - class26.field513;
            int var10 = var7 - class161.field2849;
            int var11 = var6 - class134.field2425;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + (var11 * var11)));
            class57.field958 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class10.field178 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class57.field958 < 128) {
                class57.field958 = 128;
            }
            if (class57.field958 > 383) {
                class57.field958 = 383;
            }
        }
        class154.field2735 = 2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Z")
    public static final boolean method1291(int arg0) {
        if (arg0 == 2047) {
            field3212++;
            return class141.field2586;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method1292(int arg0) {
        class174.field3120 = 0;
        field3220++;
        class184.field3290 = 0;
        if (arg0 != 2047) {
            method1288((byte) 84);
        }
        class75.field1376 = 0;
        class8.field126 = null;
        class66.field1126 = 0;
        class71.field1269 = 0;
    }
}
