import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class30 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static volatile int field361 = 0;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field371 = -1;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field370 = 64;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljj;")
    public static class134 field367;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lgh;")
    public static class206 field374;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Ljg;")
    public static class271[] field362;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Lrf;")
    public static final class248 method205(boolean arg0) {
        field366++;
        try {
            if (!arg0) {
                field372 = 3;
            }
            return (class248) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILeb;)Ljava/lang/String;")
    public static final String method206(int arg0, int arg1, class103 arg2) {
        field363++;
        if (!client.method1511(arg2).method198(arg1, arg0 ^ arg0) && arg2.field1570 == null) {
            return null;
        } else if (arg2.field1573 == null || arg2.field1573.length <= arg1 || arg2.field1573[arg1] == null || arg2.field1573[arg1].trim().length() == 0) {
            return class178.field2891 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field1573[arg1];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljj;ILjj;II)Lmc;")
    public static final class163 method207(class134 arg0, int arg1, class134 arg2, int arg3, int arg4) {
        field368++;
        int var5 = 20 / ((arg4 - 1) / 61);
        return class227.method1499((byte) 9, arg0, arg1, arg3) ? class3.method27(arg2.method940((byte) 29, arg3, arg1), 0) : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class18.method125(-24914, arg2, client.field3617, class156.field2507);
        field373++;
        int var7 = class18.method125(-24914, arg1, client.field3617, class156.field2507);
        int var8 = class18.method125(-24914, arg5, class121.field2042, class58.field817);
        int var9 = class18.method125(-24914, arg0, class121.field2042, class58.field817);
        for (int var10 = var6; var10 <= var7; var10++) {
            class168.method1184(128, var9, var8, arg3, class85.field1162[var10]);
        }
        if (arg4 < 67) {
            method208(74, 114, 40, 115, -16, 28);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public static final void method209(int arg0, int arg1, int arg2) {
        class267.field4341 = true;
        class285.field4547 = arg0;
        class108.field1870 = arg1;
        class205.field3285 = arg2;
        class74.field1015 = -1;
        class8.field124 = -1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method210(int arg0, int arg1) {
        field369++;
        class283 var2 = class46.method360(2, -67, arg0);
        var2.method1900(true);
        int var3 = 115 % ((-arg1 - 11) / 43);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method211(int arg0) {
        field374 = null;
        field362 = null;
        field367 = null;
        if (arg0 != 0) {
            method212((byte) -79, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[B)Z")
    public static final boolean method212(byte arg0, byte[] arg1) {
        field364++;
        class264 var2 = new class264(arg1);
        int var3 = var2.method1779(-90);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1779(-50) == 1;
        if (var4) {
            class196.method1326(46, var2);
        }
        class152.method1031(var2, 21806);
        int var5 = 98 / ((arg0 + 80) / 39);
        return true;
    }
}
