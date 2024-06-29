import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class38 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lrd;")
    public static class173 field798 = class133.method843(":clan:", 41);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lrd;")
    public static class173 field799 = class133.method843("<col=00ffff>", 97);

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lrd;")
    public static class173 field800 = class133.method843("Weiter", 48);

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lrd;")
    public static class173 field804 = class133.method843(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -112);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lrd;")
    public static class173 field801 = class133.method843("(Z", 33);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lrd;")
    private static class173 field803 = class133.method843("Checking for updates )2 ", -112);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lrd;")
    public static class173 field806 = class133.method843("(U0a )2 in: ", 27);

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lrd;")
    public static class173 field802 = field803;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "La;")
    public static class1 field805;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public abstract void method283(byte arg0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method284(int arg0) {
        field804 = null;
        field806 = null;
        field803 = null;
        field800 = null;
        field802 = null;
        field798 = null;
        if (arg0 > 82) {
            field801 = null;
            field805 = null;
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Lqf;I)V")
    public static final void method285(int arg0, class165[] arg1, int arg2) {
        int var3 = 0;
        if (arg0 != -4795) {
            method284(-117);
        }
        while (var3 < arg1.length) {
            class165 var4 = arg1[var3];
            if (var4 != null && var4.field3072 == arg2 && (!var4.field3108 || !class82.method507(var4, arg0 ^ 0x12BA))) {
                label101: {
                    if (var4.field3077 == 0) {
                        if (!var4.field3108 && class82.method507(var4, -1) && class96.field1768 != var4) {
                            break label101;
                        }
                        method285(-4795, arg1, var4.field3132);
                        if (var4.field3067 != null) {
                            method285(-4795, var4.field3067, var4.field3132);
                        }
                        class157 var5 = (class157) client.field637.method677(arg0 + 2040, (long) var4.field3132);
                        if (var5 != null) {
                            class13.method98(var5.field2940, (byte) -37);
                        }
                    }
                    if (var4.field3077 == 6) {
                        if (var4.field3155 != -1 || var4.field3054 != -1) {
                            boolean var6 = class220.method1434(28267, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field3054;
                            } else {
                                var7 = var4.field3155;
                            }
                            if (var7 != -1) {
                                class178 var8 = class167.method1080(arg0 ^ 0xFFFFC61F, var7);
                                if (var8 != null) {
                                    var4.field3142 += class171.field3305;
                                    while (var8.field3498[var4.field3084] < var4.field3142) {
                                        var4.field3142 -= var8.field3498[var4.field3084];
                                        var4.field3084++;
                                        if (var8.field3496.length <= var4.field3084) {
                                            var4.field3084 -= var8.field3497;
                                            if (var4.field3084 < 0 || var8.field3496.length <= var4.field3084) {
                                                var4.field3084 = 0;
                                            }
                                        }
                                        class209.method1379(1, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field3055 != 0 && !var4.field3108) {
                            int var9 = var4.field3055 << 16 >> 16;
                            int var10 = var4.field3055 >> 16;
                            int var11 = class171.field3305 * var9;
                            var4.field3115 = var4.field3115 + var11 & 0x7FF;
                            int var12 = class171.field3305 * var10;
                            var4.field3125 = var4.field3125 + var12 & 0x7FF;
                            class209.method1379(1, var4);
                        }
                    }
                }
            }
            var3++;
        }
        field807++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)I")
    public abstract int method286(boolean arg0, int arg1, int arg2);
}
