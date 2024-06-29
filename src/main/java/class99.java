import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field2271 = -1;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
    public boolean field2273 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lvb;")
    public class128 field2278 = null;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
    public int[] field2281;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
    public int[] field2276;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    public int[] field2280;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public int[] field2277;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    private static int[] field2272 = new int[500];

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    private static int[] field2275 = new int[500];

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
    private static int[] field2279 = new int[500];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    private static int[] field2274 = new int[500];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 6)
    public static void method806() {
        field2279 = null;
        field2274 = null;
        field2272 = null;
        field2275 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([BLvb;)V", line = 42)
    public class99(byte[] arg0, class128 arg1) {
        this.field2278 = arg1;
        class7 var3 = new class7(arg0);
        class7 var4 = new class7(arg0);
        var3.field143 = 2;
        int var5 = var3.method96(27023);
        int var6 = -1;
        int var7 = 0;
        var4.field143 = var3.field143 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method96(27023);
            if (var10 > 0) {
                if (this.field2278.field3110[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2278.field3110[var11] == 0) {
                            field2279[var7] = var11;
                            field2274[var7] = 0;
                            field2272[var7] = 0;
                            field2275[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2279[var7] = var8;
                short var12 = 0;
                if (this.field2278.field3110[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2274[var7] = var12;
                } else {
                    field2274[var7] = var4.method93(-128);
                }
                if ((var10 & 0x2) == 0) {
                    field2272[var7] = var12;
                } else {
                    field2272[var7] = var4.method93(-107);
                }
                if ((var10 & 0x4) == 0) {
                    field2275[var7] = var12;
                } else {
                    field2275[var7] = var4.method93(-88);
                }
                var6 = var8;
                var7++;
                if (this.field2278.field3110[var8] == 5) {
                    this.field2273 = true;
                }
            }
        }
        if (arg0.length != var4.field143) {
            throw new RuntimeException();
        }
        this.field2271 = var7;
        this.field2281 = new int[var7];
        this.field2276 = new int[var7];
        this.field2280 = new int[var7];
        this.field2277 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2281[var9] = field2279[var9];
            this.field2276[var9] = field2274[var9];
            this.field2280[var9] = field2272[var9];
            this.field2277[var9] = field2275[var9];
        }
    }
}
