import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class63 implements Runnable {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[Lpg;")
    public volatile class165[] field1225 = new class165[2];

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
    public volatile boolean field1233 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
    public volatile boolean field1217 = false;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Loc;")
    public static class151 field1226 = class137.method873(2, "(Z");

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Loc;")
    public static class151 field1222 = class137.method873(2, "http:)4)4");

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
    public static int[] field1232 = new int[256];

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Loc;")
    public static class151 field1220 = class137.method873(2, " weitere Optionen");

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Loc;")
    private static class151 field1231 = class137.method873(2, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[Z")
    public static boolean[] field1234 = new boolean[100];

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Loc;")
    private static class151 field1237 = class137.method873(2, "Login server offline)3");

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lwd;")
    public static class232 field1227 = null;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Loc;")
    public static class151 field1218 = field1231;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Loc;")
    public static class151 field1238 = field1237;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "[I")
    public static int[] field1235 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lda;")
    public class35 field1239;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[Lcg;")
    public static class30[] field1224;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILbh;ZI)V")
    public static final void method424(int arg0, int arg1, class20 arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method427(35, 69);
        }
        field1229++;
        if (class228.field3975 == arg2 || class117.field2108 >= 400) {
            return;
        }
        class151 var5;
        if (arg2.field428 == 0) {
            var5 = class126.method761(new class151[] { arg2.field416, class65.method434(arg2.field435, class228.field3975.field435, 1), class228.field3982, class190.field3364, class137.method874(arg2.field435, false), class175.field3163 }, 10260);
        } else {
            var5 = class126.method761(new class151[] { arg2.field416, class228.field3982, class163.field2956, class137.method874(arg2.field428, false), class175.field3163 }, 10260);
        }
        if (class166.field3017 == 1) {
            class142.method908(arg4, class126.method761(new class151[] { class29.field613, class25.field536, var5 }, 10260), (short) 46, (long) arg0, class14.field318, -25, arg1);
            class31.field637++;
        } else if (!class159.field2859) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class223.field3882[var6] != null) {
                    boolean var7 = false;
                    short var8 = 0;
                    if (class71.field1385 == 0 && class223.field3882[var6].method995((byte) -22, class208.field3666)) {
                        if (class228.field3975.field435 < arg2.field435) {
                            var8 = 2000;
                        }
                        if (class228.field3975.field444 != 0 && arg2.field444 != 0) {
                            if (class228.field3975.field444 == arg2.field444) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class67.field1305[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class154.field2799[var6];
                    class128.field2306++;
                    short var10 = (short) (var8 + var9);
                    class142.method908(arg4, class126.method761(new class151[] { class31.field643, var5 }, 10260), var10, (long) arg0, class223.field3882[var6], -94, arg1);
                }
            }
        } else if ((class54.field1103 & 0x8) == 8) {
            class208.field3663++;
            class142.method908(arg4, class126.method761(new class151[] { class20.field447, class25.field536, var5 }, 10260), (short) 14, (long) arg0, class95.field1770, -77, arg1);
        }
        for (int var11 = 0; var11 < class117.field2108; var11++) {
            if (class185.field3316[var11] == 42) {
                class225.field3916[var11] = class126.method761(new class151[] { class31.field643, var5 }, 10260);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
    public final void run() {
        this.field1217 = true;
        field1221++;
        try {
            while (!this.field1233) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class165 var2 = this.field1225[var1];
                    if (var2 != null) {
                        var2.method1058(1024);
                    }
                }
                class156.method1027(0, 10L);
                class121.method735(null, this.field1239, 31047);
            }
        } catch (Exception var9) {
            class123.method746(var9, null, -12134);
        } finally {
            Object var6 = null;
            this.field1217 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1235 = null;
        field1238 = null;
        field1231 = null;
        field1234 = null;
        field1220 = null;
        field1232 = null;
        if (arg0 != -7907) {
            field1232 = null;
        }
        field1237 = null;
        field1226 = null;
        field1224 = null;
        field1218 = null;
        field1227 = null;
        field1222 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILwg;Lwg;IIIIJLac;)V")
    public static final void method426(int arg0, int arg1, int arg2, int arg3, class235 arg4, class235 arg5, int arg6, int arg7, int arg8, int arg9, long arg10, class4 arg11) {
        if (arg4 == null) {
            return;
        }
        class213 var13 = new class213();
        var13.field3739 = arg10;
        var13.field3751 = arg1 * 128 + 64;
        var13.field3747 = arg2 * 128 + 64;
        var13.field3737 = arg3;
        var13.field3744 = arg4;
        var13.field3745 = arg5;
        var13.field3746 = arg6;
        var13.field3750 = arg7;
        var13.field3738 = arg8;
        var13.field3741 = arg9;
        for (int var14 = arg0; var14 >= 0; var14--) {
            if (class95.field1776[var14][arg1][arg2] == null) {
                class95.field1776[var14][arg1][arg2] = new class72(var14, arg1, arg2);
            }
        }
        class95.field1776[arg0][arg1][arg2].field1419 = var13;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Loc;")
    public static final class151 method427(int arg0, int arg1) {
        field1230++;
        if (arg1 != -4871) {
            method426(-74, 116, 118, 9, null, null, 75, 9, 17, 8, 110L, null);
        }
        return class126.method761(new class151[] { class137.method874(arg0 >> 24 & 0xFF, false), class58.field1163, class137.method874(arg0 >> 16 & 0xFF, false), class58.field1163, class137.method874(arg0 >> 8 & 0xFF, false), class58.field1163, class137.method874(arg0 & 0xFF, false) }, 10260);
    }
}
