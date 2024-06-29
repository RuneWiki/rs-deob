import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class73 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Z")
    public boolean field1348 = false;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field1354 = -1;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Lde;")
    public class58 field1356 = null;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[S")
    public short[] field1357;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[S")
    public short[] field1355;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "[S")
    public short[] field1358;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "[S")
    public short[] field1352;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[S")
    public short[] field1351;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[S")
    private static short[] field1350 = new short[500];

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[S")
    private static short[] field1347 = new short[500];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[S")
    private static short[] field1346 = new short[500];

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[S")
    private static short[] field1353 = new short[500];

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[S")
    private static short[] field1349 = new short[500];

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([BLde;)V", line = 48)
    public class73(byte[] arg0, class58 arg1) {
        this.field1356 = arg1;
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        var3.field3380 = 2;
        int var5 = var3.method1325(7627);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3380 = var3.field3380 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1356.field1107[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1325(7627);
            if (var10 > 0) {
                if (this.field1356.field1107[var9] == 0) {
                    var8 = var9;
                }
                field1353[var6] = (short) var9;
                short var11 = 0;
                if (this.field1356.field1107[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1349[var6] = var11;
                } else {
                    field1349[var6] = (short) var4.method1317(128);
                }
                if ((var10 & 0x2) == 0) {
                    field1346[var6] = var11;
                } else {
                    field1346[var6] = (short) var4.method1317(128);
                }
                if ((var10 & 0x4) == 0) {
                    field1350[var6] = var11;
                } else {
                    field1350[var6] = (short) var4.method1317(128);
                }
                if (this.field1356.field1107[var9] == 2) {
                    field1349[var6] = (short) (((field1349[var6] & 0xFF) << 3) + (field1349[var6] >> 8 & 0x7));
                    field1346[var6] = (short) (((field1346[var6] & 0xFF) << 3) + (field1346[var6] >> 8 & 0x7));
                    field1350[var6] = (short) (((field1350[var6] & 0xFF) << 3) + (field1350[var6] >> 8 & 0x7));
                }
                field1347[var6] = -1;
                if (this.field1356.field1107[var9] >= 1 && this.field1356.field1107[var9] <= 3 && var7 > var8) {
                    field1347[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1356.field1107[var9] == 5) {
                    this.field1348 = true;
                }
            }
        }
        if (arg0.length != var4.field3380) {
            throw new RuntimeException();
        }
        this.field1354 = var6;
        this.field1357 = new short[var6];
        this.field1355 = new short[var6];
        this.field1358 = new short[var6];
        this.field1352 = new short[var6];
        this.field1351 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field1357[var12] = field1353[var12];
            this.field1355[var12] = field1349[var12];
            this.field1358[var12] = field1346[var12];
            this.field1352[var12] = field1350[var12];
            this.field1351[var12] = field1347[var12];
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V", line = 37)
    public static void method483() {
        field1353 = null;
        field1349 = null;
        field1346 = null;
        field1350 = null;
        field1347 = null;
    }
}
