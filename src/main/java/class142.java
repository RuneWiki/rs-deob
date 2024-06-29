import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class142 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[B")
    public static byte[][] field2915 = new byte[1000][];

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2918 = -1;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lrf;")
    private static class163 field2921 = class53.method392(41, "Close");

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2910 = -1;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lrf;")
    public static class163 field2932 = field2921;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lge;")
    public static class65 field2926;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method925(byte[] arg0, int arg1) {
        field2913++;
        class52 var2 = new class52(arg0);
        int var3 = var2.method344(255);
        int var4 = var2.method383(9);
        if (arg1 > var4 || class72.field1510 != 0 && class72.field1510 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method351(var7, 413058320, var4, 0);
            return var7;
        } else {
            int var5 = var2.method383(arg1 + 109);
            if (var5 < 0 || class72.field1510 != 0 && var5 > class72.field1510) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class18.method112(var6, var5, arg0, var4, 9);
            } else {
                class84.field1832.method844(var6, var2, -16228);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2921 = null;
        field2932 = null;
        if (arg0 == -25631) {
            field2915 = null;
            field2926 = null;
        }
    }
}
