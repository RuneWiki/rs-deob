import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class72 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    public static boolean field1193 = false;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lhf;")
    public static class263 field1195;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[[[I")
    public static int[][][] field1196;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method554(boolean arg0, String arg1, byte arg2) {
        field1199++;
        byte var3 = 4;
        int var4 = class106.field1617.method574(arg1, 250);
        int var5 = class106.field1617.method575(arg1, 250) * 13;
        int var6 = var3 + 6;
        int var7 = var3 + 6;
        class63.method493(var7 - var3, -var3 + var6, var4 - (-var3 - var3), var3 + var3 + var5, 0);
        class63.method492(var7 - var3, var6 - var3, var3 + var4 + var3, var3 + var3 + var5, 16777215);
        class106.field1617.method569(arg1, var7, var6, var4, var5, 16777215, -1, 1, 1, 0);
        class3.method19((byte) 111, var3 + var4 + var3, -var3 + var6, var3 + var5 + var3, var7 - var3);
        if (arg2 != -59) {
            method558((class132) null, 24, -26, -3, -88, 56);
        }
        if (!arg0) {
            class180.method1271(var4, var5, var6, var7, arg2 ^ 0xFFFFFFC5);
            return;
        }
        try {
            Graphics var8 = class22.field340.getGraphics();
            class263.field4173.method744(1152, 0, var8, 0);
        } catch (Exception var9) {
            class22.field340.repaint();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method555(int arg0) {
        if (arg0 == 0) {
            field1195 = null;
            field1196 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILkj;)V")
    public static final void method556(int arg0, class114 arg1) {
        if (class268.field4292 == arg1.field1926) {
            class118.field1991[arg1.field1874] = true;
        }
        field1194++;
        if (arg0 != 0) {
            field1196 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Z")
    public static final boolean method557(byte arg0, int arg1) {
        field1192++;
        if (arg1 >= 0 && class157.field2555.length > arg1) {
            return arg0 == -96 ? class157.field2555[arg1] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvb;IIIII)V")
    public static final void method558(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1200++;
        if (arg0.field2210 == -1 && arg0.field2206 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg0.field2212) {
            var6 += arg1 - arg0.field2212;
        } else if (arg1 < arg0.field2197) {
            var6 += arg0.field2197 - arg1;
        }
        if (arg4 > arg0.field2213) {
            var6 += arg4 - arg0.field2213;
        } else if (arg4 < arg0.field2204) {
            var6 += arg0.field2204 - arg4;
        }
        int var7 = class111.field1719 * arg0.field2196 >> 8;
        if (arg0.field2203 == 0 || var6 - 64 > arg0.field2203 || class111.field1719 == 0 || arg0.field2211 != arg5) {
            if (arg0.field2205 != null) {
                class145.field2394.method1242(arg0.field2205);
                arg0.field2205 = null;
            }
            if (arg0.field2199 != null) {
                class145.field2394.method1242(arg0.field2199);
                arg0.field2199 = null;
            }
        } else if (arg3 >= 53) {
            var6 -= 64;
            if (var6 < 0) {
                var6 = 0;
            }
            int var8 = (arg0.field2203 - var6) * var7 / arg0.field2203;
            if (arg0.field2205 != null) {
                arg0.field2205.method1474(var8);
            } else if (arg0.field2210 >= 0) {
                class280 var9 = class280.method1881(class205.field3300, arg0.field2210, 0);
                if (var9 != null) {
                    class86 var10 = var9.method1883().method680(class137.field2310);
                    class221 var11 = class221.method1479(var10, 100, var8);
                    var11.method1485(-1);
                    class145.field2394.method1240(var11);
                    arg0.field2205 = var11;
                }
            }
            if (arg0.field2199 != null) {
                arg0.field2199.method1474(var8);
                if (arg0.field2199.method1075(false)) {
                    return;
                }
                arg0.field2199 = null;
            } else if (arg0.field2206 != null && (arg0.field2189 -= arg2) <= 0) {
                int var12 = (int) ((double) arg0.field2206.length * Math.random());
                class280 var13 = class280.method1881(class205.field3300, arg0.field2206[var12], 0);
                if (var13 != null) {
                    class86 var14 = var13.method1883().method680(class137.field2310);
                    class221 var15 = class221.method1479(var14, 100, var8);
                    var15.method1485(0);
                    class145.field2394.method1240(var15);
                    arg0.field2189 = (int) (Math.random() * (double) (arg0.field2198 - arg0.field2201)) + arg0.field2201;
                    arg0.field2199 = var15;
                    return;
                }
            }
        }
    }
}
