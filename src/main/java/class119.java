import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class119 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[Z")
    public static boolean[] field1671 = new boolean[5];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method769(int arg0, int arg1, int arg2) {
        field1668++;
        if (!class2.field26) {
            return false;
        }
        if (arg0 < 45) {
            field1671 = null;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class365.field5292[var3] == null || class365.field5292[var3][var4] == null) {
            return false;
        }
        class394 var5 = class365.field5292[var3][var4];
        if (arg2 == -1 && var5.field5671 == 0) {
            for (class212 var6 = (class212) class321.field4726.method332(-2130841184); var6 != null; var6 = (class212) class321.field4726.method343((byte) -75)) {
                if (var6.field2836 == 32 || var6.field2836 == 1003 || var6.field2836 == 39 || var6.field2836 == 36 || var6.field2836 == 6) {
                    for (class394 var7 = class196.method1168((byte) -119, var6.field2831); var7 != null; var7 = class352.method2315(var7, false)) {
                        if (var5.field5698 == var7.field5698) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class212 var8 = (class212) class321.field4726.method332(-2130841184); var8 != null; var8 = (class212) class321.field4726.method343((byte) -101)) {
                if (var8.field2837 == arg2 && var5.field5698 == var8.field2831 && (var8.field2836 == 32 || var8.field2836 == 1003 || var8.field2836 == 39 || var8.field2836 == 36 || var8.field2836 == 6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 123)
    public static void method770(byte arg0) {
        field1671 = null;
        if (arg0 < 98) {
            method771((byte) 77, -3);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Len;", line = 151)
    public static final class249 method771(byte arg0, int arg1) {
        field1670++;
        class189 var2 = class182.field2476;
        class249 var3;
        synchronized (class182.field2476) {
            var3 = (class249) class182.field2476.method1137((long) arg1, 2108653711);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg0 <= 92) {
            method769(-8, -8, -50);
        }
        byte[] var4 = class32.field456.method2261(class329.method2188(127, arg1), class282.method1945(192, arg1), 77);
        class249 var5 = new class249();
        var5.field3407 = arg1;
        if (var4 != null) {
            var5.method1502(new class228(var4), -70);
        }
        var5.method1513(115);
        class189 var6 = class182.field2476;
        synchronized (class182.field2476) {
            class182.field2476.method1144((long) arg1, var5, -3480);
            return var5;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLlm;)V", line = 186)
    public static final void method772(byte arg0, class347 arg1) {
        class47.field664 = arg1;
        field1669++;
        if (arg0 >= -34) {
            method772((byte) 32, (class347) null);
        }
    }
}
