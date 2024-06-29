import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class125 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[S")
    public static short[] field2130 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
    public static boolean field2133 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static volatile int field2129 = 0;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "S")
    public static short field2137 = 256;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lth;")
    public static class57 field2136;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z[S)[S", line = 5)
    public static final short[] method975(boolean arg0, short[] arg1) {
        field2140++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            short[] var2 = new short[arg1.length];
            class242.method1845(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (short[]) null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Ljava/lang/String;", line = 27)
    public static final String method976(byte arg0) {
        if (arg0 >= -17) {
            return (String) null;
        }
        field2132++;
        String var1 = "www";
        if (class237.field3922 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class14.field155 != null) {
            var2 = "/p=" + class14.field155;
        }
        return "http://" + var1 + ".runescape.com/l=" + class204.field3223 + "/a=" + class240.field3973 + var2 + "/";
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 51)
    public static void method977(byte arg0) {
        if (arg0 <= 66) {
            method979(17, 118);
        }
        field2130 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I", line = 69)
    public static final int method978(int arg0, int arg1, int arg2) {
        field2135++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return arg0 < 21 ? 120 : (var5 & 0x7FBA34D) >> 19;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 99)
    public static final void method979(int arg0, int arg1) {
        field2131++;
        class17.field196.method2334(4, arg1);
        class348.field5536.method2334(4, arg1);
        if (arg0 >= -34) {
            field2133 = true;
        }
        class230.field3816.method2334(4, arg1);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[B)Leb;", line = 112)
    public static final class6 method980(int arg0, byte[] arg1) {
        field2134++;
        class6 var2 = new class6();
        class227 var3 = new class227(arg1);
        var3.field3760 = var3.field3793.length - 2;
        int var4 = var3.method1765(true);
        int var5 = var3.field3793.length - arg0 - (var4 - -12);
        var3.field3760 = var5;
        int var6 = var3.method1715((byte) 46);
        var2.field56 = var3.method1765(true);
        var2.field57 = var3.method1765(true);
        var2.field49 = var3.method1765(true);
        var2.field59 = var3.method1765(true);
        int var7 = var3.method1720((byte) -89);
        if (var7 > 0) {
            var2.field53 = new class164[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1765(true);
                class164 var10 = new class164(class206.method1575(var9, (byte) 99));
                var2.field53[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1715((byte) 56);
                    int var12 = var3.method1715((byte) 125);
                    var10.method1273(1, (long) var11, new class301(var12));
                }
            }
        }
        var3.field3760 = 0;
        int var13 = 0;
        var2.field58 = var3.method1717((byte) -68);
        var2.field50 = new String[var6];
        var2.field45 = new int[var6];
        var2.field44 = new int[var6];
        while (var5 > var3.field3760) {
            int var14 = var3.method1765(true);
            if (var14 == 3) {
                var2.field50[var13] = var3.method1758((byte) 101).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field44[var13] = var3.method1720((byte) -20);
            } else {
                var2.field44[var13] = var3.method1715((byte) -117);
            }
            var2.field45[var13++] = var14;
        }
        return var2;
    }
}
