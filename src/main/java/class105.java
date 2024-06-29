import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class105 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lcd;")
    public static class23 field2270 = class54.method414("Einloggen", -1);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lcd;")
    private static class23 field2269 = class54.method414("Please use a different world)3", -1);

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lcd;")
    public static class23 field2275 = class54.method414("auf der Hautpseite)3", -1);

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lcd;")
    public static class23 field2281 = field2269;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lcd;")
    public static class23 field2272 = field2269;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lcd;")
    public static class23 field2280 = class54.method414("", -1);

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lcd;")
    public static class23 field2274 = field2280;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Lcd;")
    public static class23 field2284 = field2280;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lcd;")
    public static class23 field2278 = field2280;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lcd;")
    public static class23 field2276 = field2280;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lcd;")
    public static class23 field2271 = field2280;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lcd;")
    public static class23 field2268 = field2280;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    public static int[] field2267;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[Lea;")
    public static class38[] field2282;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcd;IZ)V")
    public static final void method692(class23 arg0, int arg1, boolean arg2) {
        field2279++;
        class23 var3 = arg0.method163(16864);
        short[] var4 = new short[16];
        int var5 = arg1;
        for (int var6 = 0; var6 < class61.field1410; var6++) {
            class63 var13 = class85.method565(var6, (byte) -128);
            if ((!arg2 || var13.field1474) && var13.field1483.method163(16864).method168(0, var3) != -1) {
                if (var5 >= 100) {
                    class153.field3055 = -1;
                    class133.field2750 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var14 = new short[var4.length * 2];
                    for (int var15 = 0; var15 < var5; var15++) {
                        var14[var15] = var4[var15];
                    }
                    var4 = var14;
                }
                var4[var5++] = (short) var6;
            }
        }
        class133.field2750 = var4;
        class153.field3055 = var5;
        class19.field409 = 0;
        int var7 = var5;
        boolean var8;
        do {
            if (var7 <= 0) {
                return;
            }
            var7--;
            var8 = true;
            for (int var9 = 0; var9 < var7; var9++) {
                class63 var10 = class85.method565(var4[var9], (byte) 123);
                class63 var11 = class85.method565(var4[var9 + 1], (byte) -79);
                if (var10.field1483.method141(var11.field1483, true) > 0) {
                    var8 = false;
                    short var12 = var4[var9];
                    var4[var9] = var4[var9 + 1];
                    var4[var9 + 1] = var12;
                }
            }
        } while (!var8);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method693(int arg0, boolean arg1) {
        field2273++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else if (arg1) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method694(boolean arg0) {
        field2280 = null;
        field2276 = null;
        field2284 = null;
        field2274 = null;
        field2275 = null;
        field2278 = null;
        field2271 = null;
        field2267 = null;
        field2270 = null;
        field2269 = null;
        field2281 = null;
        field2268 = null;
        field2282 = null;
        field2272 = null;
        if (!arg0) {
            field2282 = null;
        }
    }
}
