import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class158 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "J")
    public long field2354 = 0L;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[I")
    public static int[] field2356 = new int[256];

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2364 = "rating: ";

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Ljf;")
    public static class216 field2349 = new class216(64);

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lsc;")
    public class248 field2365;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2356 = null;
        field2349 = null;
        field2364 = null;
        if (arg0 != 0) {
            method1091(43, true, -92, 72);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZII)Lsb;")
    public static final class104 method1091(int arg0, boolean arg1, int arg2, int arg3) {
        class104 var4 = new class104();
        var4.field1511 = arg3;
        field2358++;
        var4.field1517 = arg2;
        class115.field1674.method1054(-3510, var4, (long) arg0);
        class181.method1287((byte) 111, arg3);
        class231 var5 = class201.method1398(arg0, 0);
        if (var5 != null) {
            class247.method1761(var5, (byte) -87);
        }
        if (class137.field1969 != null) {
            class247.method1761(class137.field1969, (byte) -116);
            class137.field1969 = null;
        }
        int var6 = class173.field2721;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class107.method717(class192.field3056[var7], false)) {
                class111.method741((byte) -10, var7);
            }
        }
        if (class173.field2721 == 1) {
            class311.field4995 = false;
            class277.method1912(class89.field1332, -30901, class45.field548, class206.field3229, class249.field4040);
        } else {
            class277.method1912(class89.field1332, -30901, class45.field548, class206.field3229, class249.field4040);
            int var8 = class306.field4885.method1491(class177.field2783);
            for (int var9 = 0; var9 < class173.field2721; var9++) {
                int var10 = class306.field4885.method1491(class211.method1463(-124, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class89.field1332 = var8 + 8;
            class249.field4040 = class173.field2721 * 15 + (class298.field4758 ? 26 : 22);
        }
        if (arg1) {
            return null;
        }
        if (var5 != null) {
            class130.method831((byte) 85, var5, false);
        }
        class303.method2033(-3, arg3);
        if (class238.field3824 != -1) {
            class290.method1969(1, class238.field3824, 6404);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lpj;IZIIII)Lnj;")
    public static final class215 method1092(class172 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -16523) {
            field2372 = -35;
        }
        int var7 = (arg1 << 17) + (arg6 << 19) + arg3 + (arg2 ? 65536 : 0);
        field2350++;
        long var9 = (long) arg4 * 3147483667L + ((long) var7 * 3849834839L);
        class215 var11 = (class215) class36.field438.method1517(var9, (byte) 122);
        if (var11 != null) {
            return var11;
        }
        class221.field3471 = false;
        class215 var12 = class95.method649(arg3, false, arg1, -47, arg0, arg2, arg6, arg4, false);
        if (var12 != null && !class221.field3471) {
            class36.field438.method1518(var12, var9, (byte) 75);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static final void method1093(boolean arg0) {
        class281.field4581.method1510(10283);
        field2367++;
        if (arg0) {
            method1093(false);
        }
    }
}
