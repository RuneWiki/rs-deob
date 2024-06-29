import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field3 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field25 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lo;")
    public static class84 field12 = class15.method124(" has logged out)3", 255);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
    public static volatile boolean field5 = true;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "J")
    public static long field19 = 0L;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lo;")
    public static class84 field22 = class15.method124("redstone1", 255);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Z")
    public static boolean field23 = false;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lo;")
    public static class84 field15 = class15.method124("Enter message to send to ", 255);

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lo;")
    public static class84 field26 = class15.method124(": ", 255);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljd;")
    public class58 field9;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lp;")
    public static class89 field27;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    public static int[] field1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lo;", line = 16)
    public static final class84 method1(byte arg0, int arg1) {
        field17++;
        if (arg1 > class105.field2232 + 10) {
            return class19.field349;
        }
        long var2 = ((long) arg1 + 11745L) * 86400000L;
        Calendar var4 = Calendar.getInstance();
        var4.setTime(new Date(var2));
        int var5 = var4.get(5);
        if (arg0 >= -52) {
            return null;
        } else {
            int var6 = var4.get(2);
            int var7 = var4.get(1);
            class84[] var8 = new class84[] { class117.field2562, class116.field2530, class63.field1318, class113.field2457, class45.field950, class27.field538, class12.field241, class118.field2581, class122.field2734, class113.field2451, class49.field1049, class41.field848 };
            return class97.method746(0, new class84[] { class62.method489(var5, (byte) -126), class64.field1360, var8[var6], class64.field1360, class62.method489(var7, (byte) -128) });
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z", line = 43)
    public static final boolean method2(int arg0, int arg1) {
        field7++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg0 == -123) {
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 99)
    public static final void method3(int arg0) {
        if (arg0 >= -28) {
            return;
        }
        class114 var1 = (class114) class115.field2491.method695((byte) -123);
        field10++;
        while (var1 != null) {
            if (field11 != var1.field2480 || var1.field2464) {
                var1.method333(0);
            } else if (class128.field2837 >= var1.field2476) {
                var1.method881(class54.field1126, true);
                if (var1.field2464) {
                    var1.method333(0);
                } else {
                    class112.field2427.method811(var1.field2480, var1.field2477, var1.field2472, var1.field2461, 60, var1, 0, -1, false);
                }
            }
            var1 = (class114) class115.field2491.method702(0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lke;Z)V", line = 140)
    public static final void method4(class65 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (class128.field2837 == arg0.field1411 || arg0.field1423 == -1 || arg0.field1429 != 0 || arg0.field1370 + 1 > class74.method554(arg0.field1423, 4867).field628[arg0.field1432]) {
            int var2 = arg0.field1411 - arg0.field1383;
            int var3 = class128.field2837 - arg0.field1383;
            int var4 = arg0.field1438 * 128 + arg0.field1384 * 64;
            int var5 = arg0.field1427 * 128 + arg0.field1384 * 64;
            int var6 = arg0.field1393 * 128 + arg0.field1384 * 64;
            int var7 = arg0.field1433 * 128 + arg0.field1384 * 64;
            arg0.field1380 = ((var2 - var3) * var7 + var3 * var5) / var2;
            arg0.field1391 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        field18++;
        arg0.field1389 = 0;
        if (arg0.field1430 == 0) {
            arg0.field1390 = 1024;
        }
        if (arg0.field1430 == 1) {
            arg0.field1390 = 1536;
        }
        if (arg0.field1430 == 2) {
            arg0.field1390 = 0;
        }
        if (arg0.field1430 == 3) {
            arg0.field1390 = 512;
        }
        arg0.field1421 = arg0.field1390;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 192)
    public static void method5(int arg0) {
        if (arg0 <= 48) {
            field27 = null;
        }
        field22 = null;
        field15 = null;
        field27 = null;
        field1 = null;
        field26 = null;
        field12 = null;
    }
}
