import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class115 extends class296 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1753 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field1758 = 2;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field1761 = -2;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lpf;")
    public static class294 field1757;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Ljava/awt/Font;")
    public static Font field1751;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[S")
    public static short[] field1756;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
    public static final int method739(byte arg0, int arg1) {
        int var2 = arg1 * 6 - 61440;
        field1759++;
        if (arg0 != 115) {
            field1756 = null;
        }
        int var3 = (arg1 * var2 >> 12) + 40960;
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lue;")
    public static final class90 method740(int arg0, int arg1) {
        field1755++;
        class90 var2 = (class90) class139.field2039.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        int var3 = -7 / ((arg0 - 43) / 56);
        byte[] var4 = class197.field2994.method1973(1, 3, arg1);
        class90 var5 = new class90();
        if (var4 != null) {
            var5.method577(new class248(var4), -44);
        }
        class139.field2039.method1784((long) arg1, var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public static void method741(byte arg0) {
        field1753 = null;
        field1757 = null;
        if (arg0 != -84) {
            method739((byte) 107, 3);
        }
        field1751 = null;
        field1756 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IJII)Ljava/lang/String;")
    public static final String method742(int[] arg0, long arg1, int arg2, int arg3) {
        field1754++;
        if (class246.field3679 != null) {
            String var5 = class246.field3679.method660(arg0, arg1, arg2, (byte) 75);
            if (var5 != null) {
                return var5;
            }
        }
        return arg3 == 25132 ? Long.toString(arg1) : null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method743(byte[] arg0, int arg1, int arg2, int arg3) {
        field1752++;
        int var4 = 0;
        char[] var5 = new char[arg1];
        int var6 = 0;
        if (arg2 != 255) {
            field1761 = 70;
        }
        while (arg1 > var6) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class166.field2544[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
            var6++;
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)I")
    public static final int method744(boolean arg0, int arg1) {
        field1760++;
        if (!arg0) {
            method740(-58, 23);
        }
        return arg1 >>> 8;
    }
}
