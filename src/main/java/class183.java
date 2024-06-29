import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class183 extends class207 {

    @OriginalMember(owner = "client!up", name = "u", descriptor = "Lse;")
    private class282 field2454;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    private int field2457;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[[I")
    private static int[][] field2453 = new int[6][];

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
    private static int[] field2452 = new int[6];

    @OriginalMember(owner = "client!up", name = "B", descriptor = "Lpi;")
    private class141 field2461;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)Lpi;")
    public final class141 method622(byte arg0) {
        if (arg0 <= 118) {
            this.field2458 = -94;
        }
        if (this.field2461 == null) {
            field2452[4] = this.field2456;
            field2452[2] = this.field2455;
            field2452[1] = this.field2460;
            class288 var2 = this.field2454.field4150;
            field2452[5] = this.field2459;
            field2452[0] = this.field2458;
            field2452[3] = this.field2457;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1960(false, field2452[var5])) {
                    return null;
                }
                class3 var6 = var2.method1962(field2452[var5], -11999);
                int var7 = var6.field34 ? 64 : 128;
                if (var6.field43 > 0) {
                    var3 = 1;
                }
                if (var7 > var4) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2453[var8] = var2.method1961(var4, false, field2452[var8], 22881, 1.0F, var4);
            }
            this.field2461 = new class141(this.field2454, 6407, var4, var3 != 0, field2453);
        }
        return this.field2461;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lse;IIIIII)V")
    public class183(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2454 = arg0;
        this.field2460 = arg2;
        this.field2455 = arg3;
        this.field2459 = arg6;
        this.field2457 = arg4;
        this.field2456 = arg5;
        this.field2458 = arg1;
    }
}
