import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class141 {

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
    public static boolean field2060 = false;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lof;")
    public static class274 field2074;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lgg;")
    public static final class197 method866(int arg0, int arg1) {
        field2077++;
        class197 var2 = (class197) class75.field1215.method122((long) arg0, (byte) 105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class112.field1728.method1973(1, 26, arg0);
        class197 var4 = new class197();
        if (var3 != null) {
            var4.method1237(-77, new class248(var3));
        }
        class75.field1215.method119((long) arg0, var4, 0);
        if (arg1 != -2631) {
            method866(-109, -32);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public static final void method867(int arg0, int arg1) {
        class244.field3653.method1780(arg0, true);
        if (arg1 != 8128) {
            method867(11, 17);
        }
        field2065++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method868(boolean arg0, boolean arg1, String arg2) {
        short[] var3 = new short[16];
        String var4 = arg2.toLowerCase();
        field2063++;
        int var5 = 0;
        for (int var6 = 0; var6 < class62.field977; var6++) {
            class43 var9 = class160.method999(var6, 0);
            if ((!arg1 || var9.field646) && var9.field643 == -1 && var9.field666 == -1 && var9.field628 == 0 && var9.field626.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class221.field3322 = null;
                    class162.field2484 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class195.field2972 = 0;
        class162.field2484 = var5;
        String[] var7 = new String[class162.field2484];
        class221.field3322 = var3;
        if (!arg0) {
            field2062 = 36;
        }
        for (int var8 = 0; var8 < class162.field2484; var8++) {
            var7[var8] = class160.method999(var3[var8], 0).field626;
        }
        class225.method1435((byte) 126, var7, class221.field3322);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method869(byte arg0) {
        if (arg0 != 96) {
            field2060 = true;
        }
        field2074 = null;
    }
}
