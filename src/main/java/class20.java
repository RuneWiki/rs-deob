import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
    public boolean field478 = false;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field483 = -1;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lgb;")
    public class45 field479 = null;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    public int[] field484;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    public int[] field477;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
    public int[] field486;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[I")
    public int[] field487;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
    private static int[] field482 = new int[500];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    private static int[] field480 = new int[500];

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
    private static int[] field485 = new int[500];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    private static int[] field481 = new int[500];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static void method161() {
        field480 = null;
        field485 = null;
        field481 = null;
        field482 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([BLgb;)V")
    public class20(byte[] arg0, class45 arg1) {
        this.field479 = arg1;
        class103 var3 = new class103(arg0);
        class103 var4 = new class103(arg0);
        var3.field2501 = 2;
        int var5 = var3.method829((byte) -95);
        int var6 = -1;
        int var7 = 0;
        var4.field2501 = var3.field2501 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method829((byte) 127);
            if (var10 > 0) {
                if (this.field479.field1187[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field479.field1187[var11] == 0) {
                            field480[var7] = var11;
                            field485[var7] = 0;
                            field481[var7] = 0;
                            field482[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field480[var7] = var8;
                short var12 = 0;
                if (this.field479.field1187[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field485[var7] = var12;
                } else {
                    field485[var7] = var4.method817(false);
                }
                if ((var10 & 0x2) == 0) {
                    field481[var7] = var12;
                } else {
                    field481[var7] = var4.method817(false);
                }
                if ((var10 & 0x4) == 0) {
                    field482[var7] = var12;
                } else {
                    field482[var7] = var4.method817(false);
                }
                var6 = var8;
                var7++;
                if (this.field479.field1187[var8] == 5) {
                    this.field478 = true;
                }
            }
        }
        if (arg0.length != var4.field2501) {
            throw new RuntimeException();
        }
        this.field483 = var7;
        this.field484 = new int[var7];
        this.field477 = new int[var7];
        this.field486 = new int[var7];
        this.field487 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field484[var9] = field480[var9];
            this.field477[var9] = field485[var9];
            this.field486[var9] = field481[var9];
            this.field487[var9] = field482[var9];
        }
    }
}
