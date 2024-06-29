import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class109 extends class177 {

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "F")
    public static float field1852;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lek;")
    public static class172 field1843;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lbe;")
    public class283 field1836;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
    public int[] field1841;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "[I")
    public int[] field1846;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "[Lt;")
    public class239[] field1850;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "[Lbe;")
    public class283[] field1834;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)V", line = 7)
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1840++;
        int var9 = arg4 - arg5;
        int var10 = arg8 - arg1;
        int var11 = -18 / ((arg6 - 85) / 37);
        int var12 = (arg7 - arg2 << 16) / var10;
        int var13 = (arg3 - arg0 << 16) / var9;
        class66.method423(0, arg8, arg2, arg0, -1864, var13, 0, arg5, arg4, var12, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfe;B)Lbe;", line = 30)
    public static final class283 method723(class229 arg0, byte arg1) {
        if (arg1 == 60) {
            field1851++;
            return class214.method1414((byte) -115, arg0, 32767);
        } else {
            return (class283) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 44)
    public static void method724(byte arg0) {
        field1843 = null;
        if (arg0 < 116) {
            field1843 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)I", line = 56)
    public static final int method725(int arg0, int arg1, int arg2) {
        field1853++;
        int var3 = arg0 + (arg1 * 57);
        if (arg2 != 9491) {
            field1838 = 90;
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)I", line = 98)
    public static final int method726(boolean arg0, int arg1) {
        if (!arg0) {
            field1849 = -88;
        }
        field1845++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILek;)Lgi;", line = 124)
    public static final class204 method727(int arg0, int arg1, class172 arg2) {
        int var3 = -96 % ((-arg0 - 52) / 35);
        field1835++;
        return class246.method1675((byte) 19, arg1, arg2) ? class263.method1782(38) : null;
    }
}
