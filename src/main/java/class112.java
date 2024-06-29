import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class112 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
    public boolean field2462 = false;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field2470 = -1;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Laf;")
    public class7 field2471 = null;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[S")
    public short[] field2467;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    public short[] field2466;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[S")
    public short[] field2472;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
    public short[] field2469;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[S")
    public short[] field2468;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[S")
    private static short[] field2463 = new short[500];

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[S")
    private static short[] field2465 = new short[500];

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    private static short[] field2464 = new short[500];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[S")
    private static short[] field2460 = new short[500];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[S")
    private static short[] field2461 = new short[500];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static void method818() {
        field2463 = null;
        field2464 = null;
        field2461 = null;
        field2465 = null;
        field2460 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLaf;)V")
    public class112(byte[] arg0, class7 arg1) {
        this.field2471 = arg1;
        class26 var3 = new class26(arg0);
        class26 var4 = new class26(arg0);
        var3.field527 = 2;
        int var5 = var3.method221(-125);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field527 = var3.field527 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2471.field102[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method221(-101);
            if (var11 > 0) {
                if (this.field2471.field102[var9] == 0) {
                    var8 = var9;
                }
                field2463[var6] = (short) var9;
                short var12 = 0;
                if (this.field2471.field102[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2464[var6] = var12;
                } else {
                    field2464[var6] = (short) var4.method222(96);
                }
                if ((var11 & 0x2) == 0) {
                    field2461[var6] = var12;
                } else {
                    field2461[var6] = (short) var4.method222(81);
                }
                if ((var11 & 0x4) == 0) {
                    field2465[var6] = var12;
                } else {
                    field2465[var6] = (short) var4.method222(47);
                }
                if (this.field2471.field102[var9] == 2) {
                    field2464[var6] = (short) (((field2464[var6] & 0xFF) << 3) + (field2464[var6] >> 8 & 0x7));
                    field2461[var6] = (short) (((field2461[var6] & 0xFF) << 3) + (field2461[var6] >> 8 & 0x7));
                    field2465[var6] = (short) (((field2465[var6] & 0xFF) << 3) + (field2465[var6] >> 8 & 0x7));
                }
                field2460[var6] = -1;
                if (this.field2471.field102[var9] >= 1 && this.field2471.field102[var9] <= 3 && var7 > var8) {
                    field2460[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2471.field102[var9] == 5) {
                    this.field2462 = true;
                }
            }
        }
        if (arg0.length != var4.field527) {
            throw new RuntimeException();
        }
        this.field2470 = var6;
        this.field2467 = new short[var6];
        this.field2466 = new short[var6];
        this.field2472 = new short[var6];
        this.field2469 = new short[var6];
        this.field2468 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2467[var10] = field2463[var10];
            this.field2466[var10] = field2464[var10];
            this.field2472[var10] = field2461[var10];
            this.field2469[var10] = field2465[var10];
            this.field2468[var10] = field2460[var10];
        }
    }
}
