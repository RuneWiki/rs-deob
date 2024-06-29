import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class75 {

    @OriginalMember(owner = "client!l", name = "l", descriptor = "J")
    public long field1055 = 0L;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1054 = -1;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Llh;")
    public static class58 field1056 = new class58();

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1060 = "Close";

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lsk;")
    public class202 field1047;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lsk;")
    public class202 field1057;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lkk;")
    public static class67 field1059;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Z")
    public static boolean field1050;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[Ljc;")
    public static class284[] field1044;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method494(String arg0, int arg1) {
        field1045++;
        if (arg0 == null) {
            return;
        }
        if (!(class43.field643 < 100 || class134.field1846) || class43.field643 >= 200) {
            class89.method573(class233.field3649, (byte) -123);
            return;
        }
        String var2 = class248.method1618((byte) 25, arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 108 % ((-arg1 - 1) / 45);
        for (int var4 = 0; var4 < class43.field643; var4++) {
            String var8 = class248.method1618((byte) 23, class206.field3081[var4]);
            if (var8 != null && var8.equals(var2)) {
                class89.method573(arg0 + class222.field3463, (byte) -116);
                return;
            }
            if (class151.field2095[var4] != null) {
                String var9 = class248.method1618((byte) 38, class151.field2095[var4]);
                if (var9 != null && var9.equals(var2)) {
                    class89.method573(arg0 + class222.field3463, (byte) -121);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class256.field4092; var5++) {
            String var6 = class248.method1618((byte) 127, class195.field2970[var5]);
            if (var6 != null && var6.equals(var2)) {
                class89.method573(class5.field42 + arg0 + class60.field832, (byte) -118);
                return;
            }
            if (class228.field3573[var5] != null) {
                String var7 = class248.method1618((byte) 108, class228.field3573[var5]);
                if (var7 != null && var7.equals(var2)) {
                    class89.method573(class5.field42 + arg0 + class60.field832, (byte) -122);
                    return;
                }
            }
        }
        if (class248.method1618((byte) 44, class250.field3905.field5053).equals(var2)) {
            class89.method573(class263.field4224, (byte) -120);
        } else {
            class231.field3614.method809(93, 0);
            class231.field3614.method1363(class231.method1518(arg0, 114), -115);
            class144.field1968++;
            class231.field3614.method1384(arg0, -595448376);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class257.field4159[arg0][var8][var14] == -class2.field14) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class185.field2812[arg0][arg1][arg3] + arg5;
            if (!class272.method1772(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class272.method1772(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class272.method1772(var9, var11, var13)) {
                return false;
            } else if (class272.method1772(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class57.method358(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class272.method1772(var6 + 1, class185.field2812[arg0][arg1][arg3] + arg5, var7 + 1) && class272.method1772(var6 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class272.method1772(var6 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class272.method1772(var6 + 1, class185.field2812[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method496(boolean arg0) {
        field1060 = null;
        field1056 = null;
        field1044 = null;
        field1059 = null;
        if (arg0) {
            field1050 = true;
        }
    }
}
