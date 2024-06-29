import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class85 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lje;")
    public static class67 field1878 = method592(255, ":duelreq:");

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field1879 = new Object();

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lje;")
    private static class67 field1884 = method592(255, "flash3:");

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lje;")
    public static class67 field1886 = method592(255, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public static int[] field1881 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lje;")
    public static class67 field1887 = field1884;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lje;")
    public static class67 field1889 = method592(255, "M");

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lje;")
    public static class67 field1892 = field1884;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lje;")
    public static class67 field1882 = method592(255, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[Lm;")
    public static class83[] field1885 = new class83[2048];

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lje;")
    public static class67 field1894 = method592(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lec;")
    public static class32 field1876;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lfd;")
    public static class40 field1895;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
    public static int[] field1888;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
    public static int[] field1891;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[Lkd;")
    public static class73[] field1893;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)Lje;")
    public static final class67 method592(int arg0, String arg1) {
        if (arg0 != 255) {
            method597(null, (byte) 39);
        }
        field1890++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class67 var5 = new class67();
        var5.field1324 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field1324[var5.field1307++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field1324[var5.field1307++] = (byte) var6;
            }
        }
        var5.method456((byte) -117);
        return var5.method466(71);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method593(byte arg0, Component arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfd;ILfd;)V")
    public static final void method594(class40 arg0, int arg1, class40 arg2) {
        class107.field2455 = arg0;
        field1883++;
        class127.field2792 = arg2;
        if (arg1 != -5) {
            method597(null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public abstract int method595(int arg0);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method596(boolean arg0) {
        field1894 = null;
        field1885 = null;
        field1879 = null;
        field1892 = null;
        field1881 = null;
        field1878 = null;
        field1888 = null;
        field1882 = null;
        field1887 = null;
        field1886 = null;
        field1876 = null;
        field1893 = null;
        field1889 = null;
        if (arg0) {
            field1891 = null;
            field1895 = null;
            field1884 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ltf;B)V")
    public static final void method597(class138 arg0, byte arg1) {
        field1880++;
        int var2 = 0;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3127 == 0) {
            var5 = class134.field3044.method347(arg0.field3119, arg0.field3111, arg0.field3126);
        }
        if (arg0.field3127 == 1) {
            var5 = class134.field3044.method361(arg0.field3119, arg0.field3111, arg0.field3126);
        }
        if (arg0.field3127 == 2) {
            var5 = class134.field3044.method366(arg0.field3119, arg0.field3111, arg0.field3126);
        }
        if (arg0.field3127 == 3) {
            var5 = class134.field3044.method352(arg0.field3119, arg0.field3111, arg0.field3126);
        }
        if (var5 != 0) {
            var3 = var5 >> 14 & 0x7FFF;
            int var6 = class134.field3044.method371(arg0.field3119, arg0.field3111, arg0.field3126, var5);
            var2 = var6 & 0x1F;
            var4 = var6 >> 6 & 0x3;
        }
        arg0.field3113 = var2;
        arg0.field3122 = var4;
        int var7 = 50 / ((-arg1 - 51) / 40);
        arg0.field3114 = var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method598(int arg0, Component arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILje;III)V")
    public static final void method599(int arg0, class67 arg1, int arg2, int arg3, int arg4) {
        class72 var5 = class106.method836(arg0, arg3, 13);
        field1877++;
        if (var5 == null) {
            return;
        }
        if (var5.field1452 != null) {
            class35 var6 = new class35();
            var6.field632 = arg1;
            var6.field640 = var5;
            var6.field630 = var5.field1452;
            var6.field629 = arg4;
            class71.method513((byte) 93, var6);
        }
        boolean var7 = true;
        if (var5.field1553 > 0) {
            var7 = class105.method833((byte) 62, var5);
        }
        if (!var7 || !class107.method849((byte) 51, class140.method1063(var5, (byte) -101), arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class69.field1399.method285(203, (byte) 64);
            class104.field2385++;
            class69.field1399.method629((byte) 39, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg2 >= -49) {
            method597(null, (byte) 64);
        }
        if (arg4 == 2) {
            class82.field1804++;
            class69.field1399.method285(230, (byte) 64);
            class69.field1399.method629((byte) -85, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 3) {
            class79.field1697++;
            class69.field1399.method285(78, (byte) 64);
            class69.field1399.method629((byte) 73, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 4) {
            class69.field1399.method285(127, (byte) 64);
            class69.field1399.method629((byte) -89, arg3);
            class64.field1255++;
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 5) {
            class69.field1399.method285(88, (byte) 64);
            class19.field352++;
            class69.field1399.method629((byte) 107, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 6) {
            class35.field655++;
            class69.field1399.method285(5, (byte) 64);
            class69.field1399.method629((byte) -89, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 7) {
            class56.field1112++;
            class69.field1399.method285(118, (byte) 64);
            class69.field1399.method629((byte) 123, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 8) {
            class69.field1399.method285(206, (byte) 64);
            class9.field179++;
            class69.field1399.method629((byte) 118, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 9) {
            class158.field3640++;
            class69.field1399.method285(12, (byte) 64);
            class69.field1399.method629((byte) -91, arg3);
            class69.field1399.method666(arg0, -32768);
        }
        if (arg4 == 10) {
            class69.field1399.method285(42, (byte) 64);
            class69.field1399.method629((byte) 78, arg3);
            class92.field2056++;
            class69.field1399.method666(arg0, -32768);
        }
    }
}
