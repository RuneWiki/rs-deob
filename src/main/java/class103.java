import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class103 extends class137 {

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lhh;")
    public static class163 field1974 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lhh;")
    public static class163 field1982 = class137.method1065("event_opbase", 17);

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field1978 = 5063219;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Ldk;")
    public static class147 field1973 = new class147(0, 0);

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lv;")
    public class22 field1970;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lvg;")
    public class262 field1976;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[B")
    public byte[] field1981;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public static final void method818(byte arg0, int arg1) {
        class237.field4217.method112(arg1, 118);
        field1972++;
        if (arg0 > -8) {
            field1975 = -44;
        }
        class32.field493.method112(arg1, 117);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)Lqi;")
    public static final class132 method819(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2741; var4++) {
            class132 var5 = var3.field2746[var4];
            if ((var5.field2568 >> 29 & 0x3L) == 2L && var5.field2555 == arg1 && var5.field2550 == arg2) {
                class125.method995(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BB)[B")
    public static final byte[] method820(byte[] arg0, byte arg1) {
        field1980++;
        if (arg1 >= -99) {
            field1973 = null;
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class241.method1667(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method821(int arg0) {
        field1973 = null;
        field1982 = null;
        int var1 = -72 / ((-arg0 - 11) / 60);
        field1974 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
    public static final void method822(boolean arg0, byte arg1) {
        field1977++;
        byte var2 = 4;
        byte[][] var3 = class160.field2943;
        if (arg1 > -110) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class229.method1593(-128);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class170.field3108[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFC36F) >> 14;
                            int var12 = (var8 & 0x3FFB) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class199.field3572.length; var14++) {
                                if (class199.field3572[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class85.method679(var3[var14], var9, (var11 & 0x7) * 8, arg0, var6 * 8, var5 * 8, var4, (var12 & 0x7) * 8, -16964, class140.field2670, var10);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class172.method1283(8, var5 * 8, 8, var6 * 8, -69, var4);
                    }
                }
            }
        }
    }
}
