import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class72 extends class12 {

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    private int field1346 = 1;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    private int field1351 = 1;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    private int field1353 = 204;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Ltg;")
    private static class184 field1347 = class135.method812("skill)2", 3);

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "[J")
    public static long[] field1345 = new long[500];

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "[I")
    public static int[] field1349 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "[I")
    public static int[] field1348 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Ltg;")
    private static class184 field1355 = class135.method812("Free world", 3);

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Ltg;")
    public static class184 field1352 = field1355;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Ltg;")
    public static class184 field1354 = field1347;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) -77, arg0);
        if (super.field224.field53) {
            for (int var4 = 0; ~var4 > ~class201.field3889; ++var4) {
                int var5 = class131.field2381[var4];
                int var6 = class37.field698[arg0];
                int var7 = this.field1346 * var5 >> 12;
                int var8 = this.field1351 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1346) * this.field1346;
                int var10 = var6 % (4096 / this.field1351) * this.field1351;
                if (this.field1353 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1353 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1353) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 17) {
            return null;
        } else {
            ++field1350;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static void method425(byte arg0) {
        field1348 = null;
        field1352 = null;
        int var1 = -6 / ((65 - arg0) / 42);
        field1349 = null;
        field1355 = null;
        field1345 = null;
        field1347 = null;
        field1354 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field1356;
        if (!arg2) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1353 = arg0.method611(arg2);
                    }
                } else {
                    this.field1351 = arg0.method588((byte) -128);
                }
            } else {
                this.field1346 = arg0.method588((byte) -90);
            }
        }
    }
}
