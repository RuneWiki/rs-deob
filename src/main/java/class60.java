import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class60 extends class188 {

    @OriginalMember(owner = "client!we", name = "z", descriptor = "Ljava/lang/String;")
    public static String field711 = "Walk here";

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field703 = -1;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lnk;")
    public static class16 field698;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Lnk;")
    public static class16 field714;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BIZI)Ljava/lang/String;", line = 15)
    public static final String method365(byte arg0, int arg1, boolean arg2, int arg3) {
        field696++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            if (arg0 > -52) {
                method365((byte) -112, -109, true, 123);
            }
            int var4 = 2;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - arg1 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 66)
    public static final void method366(byte arg0) {
        class282.field4499.method301(-26380);
        field699++;
        int var1 = class282.field4499.method307(1, true);
        if (var1 == 0) {
            return;
        }
        int var2 = class282.field4499.method307(2, true);
        if (var2 == 0) {
            class127.field1864[class218.field3280++] = 2047;
        } else if (var2 == 1) {
            int var3 = class282.field4499.method307(3, true);
            class11.field113.method1710(var3, 1, (byte) -102);
            int var4 = class282.field4499.method307(1, true);
            if (var4 == 1) {
                class127.field1864[class218.field3280++] = 2047;
            }
        } else {
            if (arg0 != -17) {
                field714 = (class16) null;
            }
            if (var2 == 2) {
                if (class282.field4499.method307(1, true) == 1) {
                    int var5 = class282.field4499.method307(3, true);
                    class11.field113.method1710(var5, 2, (byte) -102);
                    int var6 = class282.field4499.method307(3, true);
                    class11.field113.method1710(var6, 2, (byte) -102);
                } else {
                    int var7 = class282.field4499.method307(3, true);
                    class11.field113.method1710(var7, 0, (byte) -102);
                }
                int var8 = class282.field4499.method307(1, true);
                if (var8 == 1) {
                    class127.field1864[class218.field3280++] = 2047;
                }
            } else if (var2 == 3) {
                class219.field3290 = class282.field4499.method307(2, true);
                int var9 = class282.field4499.method307(1, true);
                if (var9 == 1) {
                    class127.field1864[class218.field3280++] = 2047;
                }
                int var10 = class282.field4499.method307(7, true);
                int var11 = class282.field4499.method307(7, true);
                int var12 = class282.field4499.method307(1, true);
                class11.field113.method407(var10, var11, var12 == 1, arg0 ^ 0xFFFFFFEF);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnk;Lnk;B)V", line = 153)
    public static final void method367(class16 arg0, class16 arg1, byte arg2) {
        field713++;
        class334.field5335 = arg0;
        if (arg2 <= 64) {
            field703 = -119;
        }
        field698 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 166)
    public static int method368(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 184)
    public static final String[] method369(char arg0, int arg1, String arg2) {
        field710++;
        if (arg1 != 1) {
            field711 = (String) null;
        }
        int var3 = class28.method208(arg0, arg2, 21945);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 220)
    public static void method370(boolean arg0) {
        field711 = null;
        field698 = null;
        field714 = null;
        if (!arg0) {
            method370(false);
        }
    }
}
