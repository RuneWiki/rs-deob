import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class110 extends class77 {

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1593 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field1594 = -1;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1590 = "Loaded defaults";

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field1600 = -1;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field1613 = -1;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "Lph;")
    public static class361 field1611;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "Ljava/lang/String;")
    public String field1612;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
    public int[] field1596;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "[I")
    public int[] field1606;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "[Ls;")
    public class196[] field1592;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "[Ljava/lang/String;")
    public String[] field1610;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[[S")
    public static short[][] field1591;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)Z", line = 9)
    public static final boolean method841(int arg0, byte arg1, int arg2) {
        field1602++;
        if (!class15.field246) {
            return false;
        }
        int var3 = 56 % ((-arg1 - 26) / 47);
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        if (class119.field1677[var4] == null || class119.field1677[var4][var5] == null) {
            return false;
        }
        class359 var6 = class119.field1677[var4][var5];
        if (arg2 == -1 && var6.field5554 == 0) {
            for (int var7 = 0; var7 < class264.field4043; var7++) {
                if (class216.field3186[var7] == 49 || class216.field3186[var7] == 1004 || class216.field3186[var7] == 37 || class216.field3186[var7] == 19 || class216.field3186[var7] == 47) {
                    for (class359 var8 = class231.method1719(class172.field2489[var7], 107); var8 != null; var8 = class257.method1891(var8, 2)) {
                        if (var6.field5521 == var8.field5521) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < class264.field4043; var9++) {
                if (class286.field4313[var9] == arg2 && class172.field2489[var9] == var6.field5521 && (class216.field3186[var9] == 49 || class216.field3186[var9] == 1004 || class216.field3186[var9] == 37 || class216.field3186[var9] == 19 || class216.field3186[var9] == 47)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V", line = 82)
    public static void method842(int arg0) {
        field1611 = null;
        field1593 = null;
        field1591 = (short[][]) null;
        field1590 = null;
        if (arg0 >= -66) {
            field1595 = 41;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V", line = 105)
    public static final void method843(byte arg0) {
        field1601++;
        int var1 = 0;
        if (arg0 > -2) {
            method844(-123);
        }
        while (class95.field1336 > var1) {
            int var2 = class5.field125[var1];
            class228 var3 = class343.field5312[var2];
            int var4 = class83.field1194.method1319(255);
            if ((var4 & 0x10) != 0) {
                var4 += class83.field1194.method1319(255) << 8;
            }
            class240.method1769(var4, (byte) -112, var3, var2);
            var1++;
        }
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V", line = 139)
    public static final void method844(int arg0) {
        class247.field3664 = true;
        field1599++;
        if (arg0 != 6242) {
            field1590 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)Lin;", line = 164)
    public static final class177 method845(byte arg0) {
        field1609++;
        int var1 = class59.field871[0] * class225.field3397[0];
        int[] var2 = new int[var1];
        byte[] var3 = class225.field3385[0];
        if (arg0 > -58) {
            return (class177) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class206.field3015[class287.method2076(var3[var4], 255)];
        }
        class177 var5;
        if (class141.field2031) {
            var5 = new class325(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], var2);
        } else {
            var5 = new class118(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], var2);
        }
        class321.method2235(-2182);
        return var5;
    }
}
