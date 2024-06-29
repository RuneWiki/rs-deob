import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class194 extends class152 {

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    private int field3300 = 20;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    private int field3310 = 1365;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    private int field3309 = 0;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    private int field3313 = 0;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field3302 = 100;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Lce;")
    public static class126 field3303 = class206.method1445(-7923, " (X");

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "[J")
    public static long[] field3304 = new long[500];

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "S")
    public static short field3307 = 256;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lce;")
    public static class126 field3308 = class206.method1445(-7923, " <col=ffff00>");

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Lwh;")
    public static class58 field3306;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 176)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)[I", line = 11)
    public final int[] method6(boolean arg0, int arg1) {
        field3312++;
        if (!arg0) {
            method1375(false);
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            for (int var4 = 0; var4 < class244.field4133; var4++) {
                int var5 = (class122.field2038[arg1] << 12) / this.field3310 + this.field3309;
                int var6 = (class29.field406[var4] << 12) / this.field3310 + this.field3313;
                int var7 = var6;
                int var8 = var6;
                int var9 = var6 * var6 >> 12;
                int var10 = var5;
                int var11 = var5;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var9 + var12 < 16384 && this.field3300 > var13) {
                    var13++;
                    var10 = (var8 * var10 >> 12) * 2 + var11;
                    var8 = var7 + var9 - var12;
                    var9 = var8 * var8 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field3300 - 1 <= var13 ? 0 : (var13 << 12) / this.field3300;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V", line = 70)
    public static void method1375(boolean arg0) {
        field3303 = null;
        field3304 = null;
        if (!arg0) {
            method1375(false);
        }
        field3308 = null;
        field3306 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILbb;)V", line = 99)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field3311++;
        if (arg0 != 8) {
            this.method6(false, -47);
        }
        if (arg1 == 0) {
            this.field3310 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field3300 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field3313 = arg2.method942(true);
        } else if (arg1 == 3) {
            this.field3309 = arg2.method942(true);
        }
    }
}
