import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class110 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[[B")
    public static byte[][] field2274 = new byte[250][];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    public static int[] field2273 = new int[50];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Leh;")
    public static class47 field2275 = class195.method1282((byte) -4, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2284 = -1;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
    public static int[] field2286 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Leh;")
    private static class47 field2289 = class195.method1282((byte) -4, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Leh;")
    public static class47 field2272 = field2289;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "J")
    public long field2283;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lmb;")
    public class110 field2280;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lmb;")
    public class110 field2287;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lvd;")
    public static class193 field2288;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public static int[] field2278;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLgf;)Lgf;")
    public static final class61 method882(byte arg0, class61 arg1) {
        field2285++;
        int var2 = class33.method286(class5.method25(arg1, (byte) 119), true);
        if (var2 == 0) {
            return null;
        }
        int var3 = 0;
        int var4 = 71 / ((arg0 + 22) / 63);
        while (var3 < var2) {
            arg1 = class23.method224(arg1.field1245, 484111152);
            if (arg1 == null) {
                return null;
            }
            var3++;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
    public final boolean method883(boolean arg0) {
        field2281++;
        if (this.field2287 == null) {
            return false;
        } else {
            if (!arg0) {
                field2286 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method884(int arg0) {
        field2278 = null;
        if (arg0 != 1) {
            field2284 = 64;
        }
        field2288 = null;
        field2274 = null;
        field2272 = null;
        field2275 = null;
        field2273 = null;
        field2289 = null;
        field2286 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method885(int arg0) {
        field2277++;
        if (this.field2287 == null) {
            return;
        }
        this.field2287.field2280 = this.field2280;
        if (arg0 != 3) {
            method884(69);
        }
        this.field2280.field2287 = this.field2287;
        this.field2280 = null;
        this.field2287 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIILkb;JLkb;Lkb;)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, class92 arg4, long arg5, class92 arg6, class92 arg7) {
        class64 var9 = new class64();
        var9.field1397 = arg4;
        var9.field1392 = arg1 * 128 + 64;
        var9.field1394 = arg2 * 128 + 64;
        var9.field1404 = arg3;
        var9.field1396 = arg5;
        var9.field1401 = arg6;
        var9.field1410 = arg7;
        short var10 = 0;
        class152 var11 = class173.field3351[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2975; var12++) {
                if ((var11.field2979[var12].field1157 & 0x400000L) == 4194304L && var11.field2979[var12].field1150 instanceof class30) {
                    class30 var13 = (class30) var11.field2979[var12].field1150;
                    var13.method266();
                    if (var13.field1928 < var10) {
                        var10 = var13.field1928;
                    }
                }
            }
        }
        var9.field1409 = -var10;
        if (class173.field3351[arg0][arg1][arg2] == null) {
            class173.field3351[arg0][arg1][arg2] = new class152(arg0, arg1, arg2);
        }
        class173.field3351[arg0][arg1][arg2].field3001 = var9;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
    public static final int method887(int arg0, int arg1, int arg2) {
        if (arg2 != 99) {
            field2275 = null;
        }
        field2282++;
        long var3 = (long) ((arg1 << 16) + arg0);
        return class31.field587 != null && class31.field587.field2283 == var3 ? class52.field1008.field1454 * 99 / (class52.field1008.field1495.length - class31.field587.field588) + 1 : 0;
    }
}
