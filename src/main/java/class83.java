import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class83 {

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lem;")
    public class289 field1370 = null;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Z")
    public boolean field1366 = false;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field1371 = -1;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[S")
    public short[] field1372;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[S")
    public short[] field1374;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[S")
    public short[] field1368;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
    public short[] field1365;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[S")
    public short[] field1364;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[S")
    private static short[] field1369 = new short[500];

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[S")
    private static short[] field1367 = new short[500];

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[S")
    private static short[] field1373 = new short[500];

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[S")
    private static short[] field1375 = new short[500];

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[S")
    private static short[] field1376 = new short[500];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 12)
    public static void method646() {
        field1375 = null;
        field1367 = null;
        field1369 = null;
        field1373 = null;
        field1376 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([BLem;)V", line = 48)
    public class83(byte[] arg0, class289 arg1) {
        this.field1370 = arg1;
        class92 var3 = new class92(arg0);
        class92 var4 = new class92(arg0);
        var3.field1476 = 2;
        int var5 = var3.method702(-1);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1476 = var3.field1476 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1370.field4921[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method702(-1);
            if (var10 > 0) {
                if (this.field1370.field4921[var9] == 0) {
                    var8 = var9;
                }
                field1375[var6] = (short) var9;
                short var11 = 0;
                if (this.field1370.field4921[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1367[var6] = var11;
                } else {
                    field1367[var6] = (short) var4.method725(-97);
                }
                if ((var10 & 0x2) == 0) {
                    field1369[var6] = var11;
                } else {
                    field1369[var6] = (short) var4.method725(122);
                }
                if ((var10 & 0x4) == 0) {
                    field1373[var6] = var11;
                } else {
                    field1373[var6] = (short) var4.method725(68);
                }
                if (this.field1370.field4921[var9] == 2) {
                    field1367[var6] = (short) (((field1367[var6] & 0xFF) << 3) + (field1367[var6] >> 8 & 0x7));
                    field1369[var6] = (short) (((field1369[var6] & 0xFF) << 3) + (field1369[var6] >> 8 & 0x7));
                    field1373[var6] = (short) (((field1373[var6] & 0xFF) << 3) + (field1373[var6] >> 8 & 0x7));
                }
                field1376[var6] = -1;
                if (this.field1370.field4921[var9] >= 1 && this.field1370.field4921[var9] <= 3 && var7 > var8) {
                    field1376[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1370.field4921[var9] == 5) {
                    this.field1366 = true;
                }
            }
        }
        if (arg0.length != var4.field1476) {
            throw new RuntimeException();
        }
        this.field1371 = var6;
        this.field1372 = new short[var6];
        this.field1374 = new short[var6];
        this.field1368 = new short[var6];
        this.field1365 = new short[var6];
        this.field1364 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field1372[var12] = field1375[var12];
            this.field1374[var12] = field1367[var12];
            this.field1368[var12] = field1369[var12];
            this.field1365[var12] = field1373[var12];
            this.field1364[var12] = field1376[var12];
        }
    }
}
