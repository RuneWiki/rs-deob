import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class158 {

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Ll;")
    private class107 field3224 = new class107(256);

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Ll;")
    private class107 field3227 = new class107(256);

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lag;")
    private class8 field3220;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lag;")
    private class8 field3208;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ldd;")
    private static class35 field3211 = class180.method1196((byte) 126, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Ldd;")
    public static class35 field3217 = field3211;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "J")
    public static long field3212 = 0L;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Ldd;")
    public static class35 field3213 = class180.method1196((byte) -36, "jlv");

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field3214 = 0;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Ldd;")
    public static class35 field3226 = class180.method1196((byte) 126, "huffman");

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ldd;")
    public static class35 field3218 = class180.method1196((byte) 126, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[Z")
    public static boolean[] field3228 = new boolean[100];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Ljf;")
    public static class95 field3210 = new class95();

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B[II)Lai;")
    public final class10 method1053(byte arg0, int[] arg1, int arg2) {
        field3223++;
        if (this.field3220.method44(-113) == 1) {
            return this.method1055(arg1, 0, (byte) 122, arg2);
        } else if (this.field3220.method56((byte) 31, arg2) == 1) {
            return this.method1055(arg1, arg2, (byte) 107, 0);
        } else {
            if (arg0 <= 4) {
                field3225 = -82;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[II)Lai;")
    public final class10 method1054(int arg0, int[] arg1, int arg2) {
        field3221++;
        if (this.field3208.method44(-112) == 1) {
            return this.method1057(arg1, true, arg2, 0);
        } else if (this.field3208.method56((byte) 31, arg2) == 1) {
            return this.method1057(arg1, true, 0, arg2);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIBI)Lai;")
    private final class10 method1055(int[] arg0, int arg1, byte arg2, int arg3) {
        field3215++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class10 var9 = (class10) this.field3227.method796(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg2 <= 86) {
                method1059(83, (byte) 6, 35, null);
            }
            class189 var10 = class189.method1247(this.field3220, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class10 var11 = var10.method1249();
            this.field3227.method789(var11, true, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field193.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)Ldd;")
    public static final class35 method1056(int arg0, int arg1, boolean arg2) {
        if (arg1 == 10) {
            field3216++;
            return class96.method732((byte) 96, 10, arg0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IZII)Lai;")
    private final class10 method1057(int[] arg0, boolean arg1, int arg2, int arg3) {
        field3222++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF7) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class10 var9 = (class10) this.field3227.method796(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class104 var10 = (class104) this.field3224.method796(arg1, var7);
            if (var10 == null) {
                var10 = class104.method771(this.field3208, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3224.method789(var10, true, var7);
            }
            class10 var11 = var10.method775(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method799(-24265);
                this.field3227.method789(var11, arg1, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1058(int arg0) {
        field3217 = null;
        field3228 = null;
        field3218 = null;
        if (arg0 != 1) {
            field3218 = null;
        }
        field3213 = null;
        field3210 = null;
        field3226 = null;
        field3211 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBILfd;)V")
    public static final void method1059(int arg0, byte arg1, int arg2, class55 arg3) {
        field3219++;
        if (class181.field3694 != null || class52.field1166 || (arg3 == null || class190.method1254((byte) 42, arg3) == null)) {
            return;
        }
        class181.field3694 = arg3;
        if (arg1 != 36) {
            method1059(95, (byte) 82, 14, null);
        }
        class95.field2101 = class190.method1254((byte) 42, arg3);
        class166.field3354 = arg2;
        class178.field3662 = 0;
        class161.field3280 = arg0;
        class15.field277 = false;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lag;Lag;)V")
    public class158(class8 arg0, class8 arg1) {
        this.field3220 = arg0;
        this.field3208 = arg1;
    }
}
