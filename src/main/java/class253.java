import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class253 {

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3845 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Z")
    public static boolean field3838 = false;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Llc;")
    public static class175 field3839;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Llc;")
    public static class175 field3851;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[B")
    public byte[] field3842;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[B")
    public byte[] field3847;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)Z", line = 6)
    public static final boolean method1839(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class21.field272 * arg0 + class127.field1736 * arg3 >> 16;
        int var6 = class21.field272 * arg3 - class127.field1736 * arg0 >> 16;
        int var7 = class300.field4683 * var6 + class15.field217 * arg1 >> 16;
        int var8 = class300.field4683 * arg1 - class15.field217 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class300.field4683 * var6 + class15.field217 * arg2 >> 16;
        int var12 = class300.field4683 * arg2 - class15.field217 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class295.field4604 && var13 < class295.field4604) {
            return false;
        } else if (var9 > class310.field4792 && var13 > class310.field4792) {
            return false;
        } else if (var10 < class232.field3388 && var14 < class232.field3388) {
            return false;
        } else {
            return var10 <= class72.field918 || var14 <= class72.field918;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1840(boolean arg0) {
        field3845 = null;
        field3839 = null;
        field3851 = null;
        if (arg0) {
            method1842(false);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V", line = 87)
    public static final void method1841(byte arg0, String arg1) {
        if (arg0 != 115) {
            method1840(true);
        }
        field3849++;
        System.out.println("Error: " + class56.method333(0, arg1, "%0a", "\n"));
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 100)
    public static final void method1842(boolean arg0) {
        field3837++;
        if (arg0) {
            field3844 = 87;
        }
        class27.field347.method1241(115);
        class256.field3897.method1241(123);
        class134.field1851.method1241(114);
        client.field4227.method1241(115);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lg;I)V", line = 123)
    public static final void method1843(class170 arg0, int arg1) {
        if (class38.field463 == arg0.field2388 || arg0.field2435 == -1 || arg0.field2365 != 0 || (arg0.field2366 + 1) > class185.method1289(arg0.field2435, (byte) 117).field3746[arg0.field2425]) {
            int var2 = arg0.field2388 - arg0.field2454;
            int var3 = class38.field463 - arg0.field2454;
            int var4 = arg0.field2377 * 128 + arg0.method748(false) * 64;
            int var5 = arg0.field2414 * 128 + arg0.method748(false) * 64;
            int var6 = arg0.field2361 * 128 + arg0.method748(false) * 64;
            int var7 = arg0.field2397 * 128 + (arg0.method748(false) * 64);
            arg0.field2357 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field2392 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        field3848++;
        arg0.field2419 = 0;
        if (arg0.field2427 == 0) {
            arg0.field2387 = 1024;
        }
        if (arg0.field2427 == 1) {
            arg0.field2387 = 1536;
        }
        if (arg0.field2427 == 2) {
            arg0.field2387 = 0;
        }
        if (arg0.field2427 == 3) {
            arg0.field2387 = 512;
        }
        arg0.field2368 = arg0.field2387;
        if (arg1 <= 119) {
            field3844 = 34;
        }
    }
}
