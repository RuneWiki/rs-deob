import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lje;")
    private static class67 field1279 = class85.method592(255, "Sorry invited players only)3");

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
    public static int[] field1290 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lje;")
    public static class67 field1280 = field1279;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lje;")
    private static class67 field1292 = class85.method592(255, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lje;")
    public static class67 field1283 = field1292;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lob;")
    public static class99 field1284 = new class99(260);

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lje;")
    public static class67 field1294 = class85.method592(255, "mapdots");

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lfd;")
    public static class40 field1288;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lkc;")
    public static class72 field1287;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lkd;")
    public static class73 field1281;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lr;")
    public static final class118 method440(Throwable arg0, String arg1) {
        field1285++;
        class118 var2;
        if (arg0 instanceof class118) {
            var2 = (class118) arg0;
            var2.field2654 = var2.field2654 + ' ' + arg1;
        } else {
            var2 = new class118(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIB)Lid;")
    public static final class60 method441(int arg0, int arg1, int arg2, byte arg3) {
        class60 var4 = new class60();
        var4.field1198 = arg1;
        var4.field1201 = arg2;
        class76.field1634.method1115((long) arg0, var4, 1);
        class159.method1232(111, arg2);
        field1286++;
        class19.method132(-121, arg2);
        class72 var5 = class67.method467((byte) -13, arg0);
        if (arg3 <= 51) {
            return null;
        }
        if (var5 != null) {
            class23.method160((byte) -29, var5);
        }
        if (class68.field1384 != null) {
            class23.method160((byte) -29, class68.field1384);
            class68.field1384 = null;
        }
        class12.field222 = false;
        class69.field1419 = 0;
        class115.method930(class3.field25, 122, class58.field1166, class58.field1154, class123.field2740);
        if (class112.field2519 != -1) {
            class91.method636(1, class112.field2519, -7771);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
    public static final boolean method442(int arg0, int arg1) {
        field1291++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class101.field2267[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 != 0) {
            field1281 = null;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lkc;IIIIIII)V")
    public static final void method443(class72 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class56.field1132) {
            class98.field2187 = 32;
        } else {
            class98.field2187 = 0;
        }
        class56.field1132 = false;
        if (arg2 != 1535) {
            method441(-12, -57, 84, (byte) -100);
        }
        if (class130.field2858 != 0) {
            if (arg3 >= arg5 && arg3 < arg5 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
                arg0.field1575 -= 4;
                class23.method160((byte) -29, arg0);
            } else if (arg5 <= arg3 && arg5 + 16 > arg3 && arg1 >= arg7 + arg4 - 16 && arg1 < arg4 + arg7) {
                arg0.field1575 += 4;
                class23.method160((byte) -29, arg0);
            } else if (arg5 - class98.field2187 <= arg3 && class98.field2187 + arg5 + 16 > arg3 && arg4 + 16 <= arg1 && arg4 + arg7 - 16 > arg1) {
                int var8 = (arg7 - 32) * arg7 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - var8 / 2 - arg4 - 16;
                int var10 = arg7 - var8 - 32;
                arg0.field1575 = (arg6 - arg7) * var9 / var10;
                class23.method160((byte) -29, arg0);
                class56.field1132 = true;
            }
        }
        if (class91.field1986 != 0) {
            int var11 = arg0.field1576;
            if (arg3 >= arg5 - var11 && arg1 >= arg4 && arg3 < arg5 + 16 && arg1 <= arg4 + arg7) {
                arg0.field1575 += class91.field1986 * 45;
                class23.method160((byte) -29, arg0);
            }
        }
        field1289++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method444(int arg0) {
        field1279 = null;
        field1283 = null;
        field1280 = null;
        field1288 = null;
        field1287 = null;
        field1290 = null;
        field1292 = null;
        field1284 = null;
        field1281 = null;
        if (arg0 < 2) {
            field1287 = null;
        }
        field1294 = null;
    }
}
