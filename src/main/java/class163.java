import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class163 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2638 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lsa;")
    public static class260 field2639 = null;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2643 = "wave2:";

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
    public static boolean field2641 = false;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2644 = "glow1:";

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[C")
    public static char[] field2647 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field2645 = new int[4096];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILwd;)Ldj;")
    public static final class90 method1169(int arg0, class162 arg1) {
        field2640++;
        return arg0 == -25047 ? new class90(arg1.method1146(2), arg1.method1146(2), arg1.method1146(arg0 ^ 0xFFFF9E2B), arg1.method1146(2), arg1.method1137(arg0 + 56202), arg1.method1137(31155), arg1.method1133((byte) 53)) : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1170(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class82.field1374 <= arg4 - arg3 && class259.field4188 >= (arg3 + arg4) && (arg0 - arg3) >= class85.field1409 && class234.field3774 >= (arg0 + arg3)) {
            class132.method935(arg5, -32, arg2, arg6, arg0, arg4, arg3);
        } else {
            class62.method423(-34, arg3, arg4, arg0, arg5, arg6, arg2);
        }
        int var7 = -73 / ((arg1 + 57) / 44);
        field2632++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2644 = null;
        field2643 = null;
        field2645 = null;
        field2638 = null;
        if (arg0 == 33) {
            field2647 = null;
            field2639 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lli;")
    public static final class230 method1172(byte arg0, int arg1) {
        class230 var2 = (class230) class115.field1845.method1261(0, (long) arg1);
        field2636++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2338.method1680(arg1, 33, -100);
        class230 var4 = new class230();
        if (var3 != null) {
            var4.method1555(arg1, -122, new class162(var3));
        }
        if (arg0 != -122) {
            method1171(109);
        }
        class115.field1845.method1264(-1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        if (arg0 <= 42) {
            method1169(-97, (class162) null);
        }
        class6.field63.method1257(126);
        field2633++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILrm;)V")
    public static final void method1174(int arg0, class45 arg1) {
        field2637++;
        class77.field1289 = 3;
        class210 var2 = null;
        class207.method1448(true, false);
        class66.field1101 = true;
        class34.field518 = 0;
        class247.field3931 = true;
        class188.field3051 = 2;
        class100.field1624 = true;
        class86.field1419 = true;
        class100.field1609 = true;
        class206.field3282 = 0;
        class1.field15 = true;
        class123.field1959 = 0;
        class42.field610 = true;
        class239.field3831 = true;
        class214.field3548 = 255;
        class32.field481 = 127;
        class262.field4210 = true;
        class183.field3011 = 127;
        class126.field1996 = true;
        class165.field2656 = true;
        class265.field4273 = 0;
        if (class313.field4991 >= arg0) {
            class171.method1243(2);
        } else {
            class171.method1243(0);
        }
        class145.field2293 = 0;
        class144.field2281 = false;
        class312.field4979 = 0;
        class47.field786 = true;
        class51.field858 = false;
        class294.field4713 = false;
        class229.field3704 = 0;
        try {
            class172 var3 = arg1.method313("runescape", (byte) -78);
            while (var3.field2814 == 0) {
                class262.method1758(1L, 29552);
            }
            if (var3.field2814 == 1) {
                var2 = (class210) var3.field2817;
                byte[] var4 = new byte[(int) var2.method1463(1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1464(false, var4, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class311.method2081(new class162(var4), 7);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1462((byte) 99);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldk;B)V")
    public static final void method1175(class251 arg0, byte arg1) {
        class229.field3697 = arg0;
        class137.field2176 = class229.field3697.method1678((byte) -110, 16);
        field2635++;
        if (arg1 != -52) {
            field2644 = null;
        }
    }
}
