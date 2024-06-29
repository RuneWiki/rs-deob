import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class106 {

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Z")
    public boolean field1750 = true;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lwk;")
    public static class186 field1735 = null;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1736 = "";

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "S")
    public static short field1737 = 320;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
    public static boolean field1748 = false;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lpk;")
    public static class120 field1747;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIII)I", line = 9)
    public static final int method847(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg5;
            arg5 = var8;
        }
        field1743++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg6;
        } else if (arg0 <= 72) {
            return 105;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return (7 - arg6) + 1 - arg5;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V", line = 41)
    public static final void method848(int arg0, byte arg1, int arg2) {
        field1740++;
        if (arg1 != -105) {
            method851((String) null, -49);
        }
        class170 var3 = class221.method1613(6, arg0, -8410);
        var3.method1269(false);
        var3.field2730 = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 64)
    public static final void method849(int arg0) {
        field1742++;
        int var1 = 24 % ((arg0 + 20) / 42);
        class113.field1822.method2282((byte) -126);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)Z", line = 75)
    public static final boolean method850(char arg0, int arg1) {
        if (arg1 >= -101) {
            method853(15);
        }
        field1733++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 100)
    public static final long method851(String arg0, int arg1) {
        field1749++;
        long var2 = 0L;
        if (arg1 >= -12) {
            method853(80);
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I", line = 150)
    public static final int method852(int arg0, int arg1, int arg2) {
        field1739++;
        class307 var3 = (class307) class340.field5253.method79((long) arg0, (byte) 0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = arg1;
            for (int var5 = 0; var5 < var3.field4867.length; var5++) {
                if (var3.field4871[var5] == arg2) {
                    var4 += var3.field4867[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIZ)V", line = 197)
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1750 = arg6;
        this.field1746 = arg5;
        this.field1752 = arg4;
        this.field1738 = arg0;
        this.field1741 = arg1;
        this.field1744 = arg2;
        this.field1751 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 213)
    public static void method853(int arg0) {
        int var1 = -39 / ((54 - arg0) / 33);
        field1736 = null;
        field1747 = null;
        field1735 = null;
    }
}
