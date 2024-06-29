import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class120 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lbd;")
    public static class162 field2187 = class17.method142(0, " <col=ffff00>");

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lbd;")
    public static class162[] field2184 = new class162[1000];

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    private static int field2186 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lbd;")
    public static class162 field2183 = class17.method142(0, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lbd;")
    public static class162 field2191 = class17.method142(0, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lbd;")
    private static class162 field2192 = class17.method142(0, "Connected to update server");

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lbd;")
    public static class162 field2185 = field2192;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[Z")
    public static boolean[] field2194;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)[B", line = 10)
    public static final synchronized byte[] method976(int arg0, boolean arg1) {
        field2193++;
        if (arg0 == 100 && class201.field3413 > 0) {
            byte[] var2 = class27.field451[--class201.field3413];
            class27.field451[class201.field3413] = null;
            return var2;
        } else if (arg0 == 5000 && field2186 > 0) {
            byte[] var3 = class12.field191[--field2186];
            class12.field191[field2186] = null;
            return var3;
        } else {
            if (!arg1) {
                field2183 = (class162) null;
            }
            if (arg0 == 30000 && class78.field1314 > 0) {
                byte[] var4 = class317.field5339[--class78.field1314];
                class317.field5339[class78.field1314] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)[Lpm;", line = 55)
    public static final class99[] method977(int arg0) {
        field2188++;
        class99[] var1 = new class99[class129.field2334];
        int var2 = 75 % ((arg0 + 61) / 62);
        for (int var3 = 0; var3 < class129.field2334; var3++) {
            var1[var3] = new class99(class238.field3962, class277.field4637, class127.field2312[var3], class40.field646[var3], class190.field3253[var3], class260.field4333[var3], class317.field5350[var3], class306.field5152);
        }
        class247.method1738(86);
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILda;)[Lgg;", line = 85)
    public static final class34[] method978(int arg0, byte arg1, int arg2, class143 arg3) {
        if (arg1 < 18) {
            field2184 = (class162[]) null;
        }
        field2195++;
        return class94.method757(arg3, arg2, -1908303920, arg0) ? class153.method1194(2000) : null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[Lbd;II)Lbd;", line = 104)
    public static final class162 method979(int arg0, class162[] arg1, int arg2, int arg3) {
        field2190++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = class45.field725;
            }
            var4 += arg1[arg3 + var5].field2865;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg0 != 30000) {
            method979(81, (class162[]) null, 11, -108);
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            class162 var9 = arg1[arg3 + var8];
            class161.method1231(var9.field2817, 0, var6, var7, var9.field2865);
            var7 += var9.field2865;
        }
        class162 var10 = new class162();
        var10.field2865 = var4;
        var10.field2817 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 158)
    public static void method980(int arg0) {
        field2192 = null;
        field2191 = null;
        field2183 = null;
        field2184 = null;
        field2194 = null;
        field2187 = null;
        field2185 = null;
        if (arg0 != -569) {
            method976(-72, true);
        }
    }
}
