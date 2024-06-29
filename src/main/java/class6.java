import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lvd;")
    public static class222 field91 = class212.method1357("Texturen geladen)3", 10731);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[J")
    public static long[] field92 = new long[256];

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Z")
    public static boolean[] field98 = new boolean[112];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field93 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lvd;")
    public static class222 field96 = class212.method1357(")1j", 10731);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static volatile int field100;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lvd;")
    public static class222 field101;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lve;")
    public static class223 field94;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Z")
    public static boolean field99;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
    public static final boolean method54(int arg0, int arg1, int arg2) {
        if (arg1 != 112) {
            method55(-82);
        }
        class65 var3 = class174.method1102(arg2, 0);
        field95++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method449(65535, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method55(int arg0) {
        field96 = null;
        if (arg0 != 3302) {
            field100 = -38;
        }
        field94 = null;
        field92 = null;
        field98 = null;
        field101 = null;
        field91 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method56(byte arg0) {
        field97++;
        if (arg0 != -30) {
            field94 = null;
        }
        if (class173.field3242 != null || class182.field3369 != null) {
            return;
        }
        int var1 = class222.field4168;
        if (class38.field834) {
            if (var1 != 1) {
                int var2 = class94.field1769;
                int var3 = class137.field2651;
                if (var2 < class217.field4034 - 10 || class217.field4034 + class192.field3543 + 10 < var2 || class222.field4140 - 10 > var3 || class34.field735 + class222.field4140 + 10 < var3) {
                    class38.field834 = false;
                    class77.method512(class217.field4034, class34.field735, arg0 + 30, class192.field3543, class222.field4140);
                }
            }
            if (var1 == 1) {
                int var4 = class217.field4034;
                int var5 = class192.field3543;
                int var6 = class222.field4140;
                int var7 = class153.field2938;
                int var8 = class64.field1168;
                int var9 = -1;
                for (int var10 = 0; var10 < class172.field3227; var10++) {
                    int var11 = (class172.field3227 - var10 - 1) * 15 + var6 + 31;
                    if (var4 < var8 && var4 + var5 > var8 && var7 > var11 - 13 && var11 + 3 > var7) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class71.method485(2, var9);
                }
                class38.field834 = false;
                class77.method512(class217.field4034, class34.field735, 0, class192.field3543, class222.field4140);
                return;
            }
            return;
        }
        if (var1 == 1 && class172.field3227 > 0) {
            short var12 = class131.field2535[class172.field3227 - 1];
            if (var12 == 22 || var12 == 2 || var12 == 31 || var12 == 3 || var12 == 14 || var12 == 42 || var12 == 13 || var12 == 40 || var12 == 26 || var12 == 15 || var12 == 49 || var12 == 1001) {
                int var13 = class130.field2525[class172.field3227 - 1];
                int var14 = class209.field3891[class172.field3227 - 1];
                class13 var15 = class10.method92(923, var14);
                if (class80.method526((byte) -107, class221.method1405(var15, (byte) -102)) || class221.method1406(class221.method1405(var15, (byte) -89), (byte) -94)) {
                    class205.field3827 = false;
                    class103.field1910 = 0;
                    if (class173.field3242 != null) {
                        class80.method527(class173.field3242, 31702);
                    }
                    class173.field3242 = class10.method92(923, var14);
                    class128.field2489 = class64.field1168;
                    class159.field3036 = var13;
                    class120.field2276 = class153.field2938;
                    class80.method527(class173.field3242, 31702);
                    return;
                }
            }
        }
        if (var1 == 1 && (class155.field2952 == 1 && class172.field3227 > 2 || class155.method991(class172.field3227 - 1, 2))) {
            var1 = 2;
        }
        if (var1 == 1 && class172.field3227 > 0) {
            class71.method485(2, class172.field3227 - 1);
        }
        if (var1 != 2 || class172.field3227 <= 0) {
            return;
        }
        class21.method205((byte) -52);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIILe;IJZ)Z")
    public static final boolean method57(int arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class121.method774(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field92[var0] = var1;
        }
        field100 = 0;
        field101 = class212.method1357("Bitte warten Sie)3)3)3", 10731);
    }
}
