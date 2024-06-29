import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lc;")
    private class15 field926 = new class15(256);

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lc;")
    private class15 field940 = new class15(256);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lmd;")
    private class87 field931;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lmd;")
    private class87 field928;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ltd;")
    public static class136 field927 = class145.method1172("Hierhin gehen", 45);

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Ltd;")
    public static class136 field932 = class145.method1172("(U4", 45);

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public static boolean field933 = false;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    public static int[] field939 = new int[200];

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ltd;")
    private static class136 field942 = class145.method1172("You need a members account to login to this world)3", 45);

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Ltd;")
    public static class136 field929 = field942;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[Lnb;")
    public static class92[] field934;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[[[B")
    public static byte[][][] field941;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method334(int arg0) {
        field934 = null;
        field942 = null;
        if (arg0 != 29416) {
            method334(41);
        }
        field932 = null;
        field927 = null;
        field941 = null;
        field939 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[III)Lgf;")
    private final class48 method335(int arg0, int[] arg1, int arg2, int arg3) {
        field924++;
        int var5 = arg2 ^ (arg3 << 4 & 0xFFF6 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class48 var9 = (class48) this.field940.method109(arg0 + 10651, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class34 var10 = (class34) this.field926.method109(arg0 + 10675, var7);
            if (var10 == null) {
                var10 = class34.method298(this.field928, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field926.method112(var10, (byte) 3, var7);
            }
            class48 var11 = var10.method296(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method674(32);
                this.field940.method112(var11, (byte) 3, var7);
                return arg0 == -10566 ? var11 : null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lja;")
    public static final class63 method336(Throwable arg0, String arg1) {
        field930++;
        class63 var2;
        if (arg0 instanceof class63) {
            var2 = (class63) arg0;
            var2.field1336 = var2.field1336 + ' ' + arg1;
        } else {
            var2 = new class63(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[I)Lgf;")
    public final class48 method337(int arg0, int arg1, int[] arg2) {
        if (arg1 <= 21) {
            field939 = null;
        }
        field935++;
        if (this.field928.method671((byte) 84) == 1) {
            return this.method335(-10566, arg2, arg0, 0);
        } else if (this.field928.method666(0, arg0) == 1) {
            return this.method335(-10566, arg2, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[II)Lgf;")
    private final class48 method338(int arg0, int arg1, int[] arg2, int arg3) {
        field936++;
        int var5 = arg3 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF1);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class48 var9 = (class48) this.field940.method109(39, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class117 var10 = class117.method925(this.field931, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class48 var11 = var10.method926();
            if (arg1 != -5541) {
                this.field931 = null;
            }
            this.field940.method112(var11, (byte) 3, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field1092.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([III)Lgf;")
    public final class48 method339(int[] arg0, int arg1, int arg2) {
        field925++;
        if (this.field931.method671((byte) 120) == 1) {
            return this.method338(0, -5541, arg0, arg1);
        } else if (arg2 == ~this.field931.method666(0, arg1)) {
            return this.method338(arg1, -5541, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lmd;Lmd;)V")
    public class40(class87 arg0, class87 arg1) {
        this.field931 = arg0;
        this.field928 = arg1;
    }
}
