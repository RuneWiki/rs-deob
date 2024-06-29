import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class56 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Z")
    public boolean field1232 = false;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lkk;")
    public class193 field1243 = null;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field1240 = -1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[S")
    public short[] field1231;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[S")
    public short[] field1241;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[S")
    public short[] field1233;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[S")
    public short[] field1234;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[S")
    public short[] field1239;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[S")
    private static short[] field1236 = new short[500];

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[S")
    private static short[] field1238 = new short[500];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[S")
    private static short[] field1235 = new short[500];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[S")
    private static short[] field1237 = new short[500];

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "[S")
    private static short[] field1242 = new short[500];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public static void method532() {
        field1236 = null;
        field1235 = null;
        field1242 = null;
        field1237 = null;
        field1238 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([BLkk;)V")
    public class56(byte[] arg0, class193 arg1) {
        this.field1243 = arg1;
        class8 var3 = new class8(arg0);
        class8 var4 = new class8(arg0);
        var3.field146 = 2;
        int var5 = var3.method63((byte) 90);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field146 = var3.field146 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1243.field3491[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method63((byte) 108);
            if (var11 > 0) {
                if (this.field1243.field3491[var9] == 0) {
                    var8 = var9;
                }
                field1236[var6] = (short) var9;
                short var12 = 0;
                if (this.field1243.field3491[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1235[var6] = var12;
                } else {
                    field1235[var6] = (short) var4.method82(128);
                }
                if ((var11 & 0x2) == 0) {
                    field1242[var6] = var12;
                } else {
                    field1242[var6] = (short) var4.method82(128);
                }
                if ((var11 & 0x4) == 0) {
                    field1237[var6] = var12;
                } else {
                    field1237[var6] = (short) var4.method82(128);
                }
                if (this.field1243.field3491[var9] == 2) {
                    field1235[var6] = (short) (((field1235[var6] & 0xFF) << 3) + (field1235[var6] >> 8 & 0x7));
                    field1242[var6] = (short) (((field1242[var6] & 0xFF) << 3) + (field1242[var6] >> 8 & 0x7));
                    field1237[var6] = (short) (((field1237[var6] & 0xFF) << 3) + (field1237[var6] >> 8 & 0x7));
                }
                field1238[var6] = -1;
                if (this.field1243.field3491[var9] >= 1 && this.field1243.field3491[var9] <= 3 && var7 > var8) {
                    field1238[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1243.field3491[var9] == 5) {
                    this.field1232 = true;
                }
            }
        }
        if (arg0.length != var4.field146) {
            throw new RuntimeException();
        }
        this.field1240 = var6;
        this.field1231 = new short[var6];
        this.field1241 = new short[var6];
        this.field1233 = new short[var6];
        this.field1234 = new short[var6];
        this.field1239 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1231[var10] = field1236[var10];
            this.field1241[var10] = field1235[var10];
            this.field1233[var10] = field1242[var10];
            this.field1234[var10] = field1237[var10];
            this.field1239[var10] = field1238[var10];
        }
    }
}
