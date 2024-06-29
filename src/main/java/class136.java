import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class136 extends class67 {

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Li;")
    public static class88 field2528 = class208.method1425(105, "<col=c0ff00>");

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Li;")
    public static class88 field2531 = class208.method1425(105, "<col=ff9040>");

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field2533 = 2;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "S")
    public static short field2529 = 1;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Lme;")
    public class136 field2530;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lme;")
    public class136 field2532;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static void method905(byte arg0) {
        if (arg0 != -3) {
            method907((byte) -1);
        }
        field2531 = null;
        field2528 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method906(int arg0) {
        int var1 = class54.field1011.method158(class25.field398);
        for (int var2 = 0; var2 < class203.field3864; var2++) {
            int var6 = class54.field1011.method158(class78.method525(var2, true));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        if (arg0 != 32768) {
            method905((byte) -42);
        }
        var1 += 8;
        class237.field4423 = var1;
        field2526++;
        class108.field1960 = true;
        class47.field889 = class203.field3864 * 15 + 22;
        int var3 = class203.field3864 * 15 + 21;
        int var4 = class172.field3341;
        if (var3 + var4 > class145.field2727) {
            var4 = class145.field2727 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class226.field4241 - var1 / 2;
        if (var1 + var5 > class222.field4194) {
            var5 = class222.field4194 - var1;
        }
        class234.field4385 = var4;
        if (var5 < 0) {
            var5 = 0;
        }
        class86.field1549 = var5;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static final void method907(byte arg0) {
        int var1 = class37.field666 >> 7;
        field2525++;
        class207.field3932 &= 0x7FF;
        int var2 = class233.field4368 >> 7;
        int var3 = 0;
        if (arg0 != -51) {
            return;
        }
        if (class64.field1173 < 128) {
            class64.field1173 = 128;
        }
        if (class64.field1173 > 383) {
            class64.field1173 = 383;
        }
        int var4 = class239.method1586(class37.field666, class233.field4368, 2, class149.field2909);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class149.field2909;
                    if (var7 < 3 && (class116.field2100[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class62.field1137[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class71.field1328 < var9) {
            class71.field1328 += (var9 - class71.field1328) / 24;
        } else if (var9 < class71.field1328) {
            class71.field1328 += (var9 - class71.field1328) / 80;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
    public static final void method908(int arg0, boolean arg1) {
        field2534++;
        if (class29.field482 == null || class29.field482.length < arg0) {
            class29.field482 = new int[arg0];
        }
        if (arg1) {
            method905((byte) -34);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method909(int arg0) {
        field2527++;
        if (this.field2532 == null) {
            return;
        }
        this.field2532.field2530 = this.field2530;
        this.field2530.field2532 = this.field2532;
        this.field2530 = null;
        this.field2532 = null;
        if (arg0 != 192) {
            field2529 = -38;
        }
    }
}
