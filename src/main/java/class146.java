import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class146 extends class130 {

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lsd;")
    public static class166 field2875 = class135.method935("<col=ffb000>", 0);

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lsd;")
    public static class166 field2877 = class135.method935("(U1", 0);

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lsd;")
    private static class166 field2882 = class135.method935("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2884 = -1;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lsd;")
    public static class166 field2880 = field2882;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILf;Z)Z")
    public static final boolean method1003(int arg0, int arg1, class47 arg2, boolean arg3) {
        field2879++;
        byte[] var4 = arg2.method353(arg0, arg1, -55);
        if (var4 == null) {
            return false;
        }
        class125.method894(-1, var4);
        if (arg3) {
            field2875 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lre;")
    public static final class158 method1004(int arg0) {
        field2876++;
        class158 var1 = new class158();
        var1.field3012 = class41.field723[0];
        var1.field3015 = class82.field1664[0];
        var1.field3016 = class161.field3083[0];
        var1.field3011 = class98.field1870;
        int var2 = var1.field3016 * var1.field3012;
        var1.field3010 = class47.field884[0];
        byte[] var3 = class137.field2669[0];
        var1.field3014 = new int[var2];
        var1.field3013 = class63.field1315;
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field3014[var4] = class9.field176[class22.method151(var3[var4], 255)];
        }
        int var5 = -83 % ((arg0 + 20) / 62);
        class102.method773(87);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
    public class146(int arg0, int arg1) {
        this.field2874 = arg0;
        this.field2872 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1005(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2881++;
        int var7 = arg6 & 0x3;
        if (arg5 != 64) {
            method1005(19, -92, 41, -48, -107, (byte) 17, -22);
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2877 = null;
        field2880 = null;
        if (arg0 != 0) {
            method1004(-44);
        }
        field2882 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        class156.field2989.method705(197, (byte) 9);
        class30.field566++;
        class156.field2989.method428(0L, (byte) 81);
        field2883++;
        if (arg0 != -31953) {
            field2884 = 122;
        }
    }
}
