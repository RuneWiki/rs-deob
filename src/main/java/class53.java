import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ltc;")
    public class115 field1353 = null;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
    public boolean field1358 = false;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field1354 = -1;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public int[] field1349;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
    public int[] field1359;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
    public int[] field1357;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[I")
    private static int[] field1351 = new int[500];

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
    private static int[] field1355 = new int[500];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    private static int[] field1350 = new int[500];

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    private static int[] field1356 = new int[500];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 10)
    public static void method413() {
        field1350 = null;
        field1355 = null;
        field1351 = null;
        field1356 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([BLtc;)V", line = 42)
    public class53(byte[] arg0, class115 arg1) {
        this.field1353 = arg1;
        class64 var3 = new class64(arg0);
        class64 var4 = new class64(arg0);
        var3.field1617 = 2;
        int var5 = var3.method520(-118);
        int var6 = -1;
        int var7 = 0;
        var4.field1617 = var3.field1617 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method520(-111);
            if (var10 > 0) {
                if (this.field1353.field2804[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1353.field2804[var11] == 0) {
                            field1350[var7] = var11;
                            field1355[var7] = 0;
                            field1351[var7] = 0;
                            field1356[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1350[var7] = var8;
                short var12 = 0;
                if (this.field1353.field2804[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1355[var7] = var12;
                } else {
                    field1355[var7] = var4.method495((byte) 127);
                }
                if ((var10 & 0x2) == 0) {
                    field1351[var7] = var12;
                } else {
                    field1351[var7] = var4.method495((byte) 127);
                }
                if ((var10 & 0x4) == 0) {
                    field1356[var7] = var12;
                } else {
                    field1356[var7] = var4.method495((byte) 126);
                }
                var6 = var8;
                var7++;
                if (this.field1353.field2804[var8] == 5) {
                    this.field1358 = true;
                }
            }
        }
        if (arg0.length != var4.field1617) {
            throw new RuntimeException();
        }
        this.field1354 = var7;
        this.field1349 = new int[var7];
        this.field1359 = new int[var7];
        this.field1352 = new int[var7];
        this.field1357 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1349[var9] = field1350[var9];
            this.field1359[var9] = field1355[var9];
            this.field1352[var9] = field1351[var9];
            this.field1357[var9] = field1356[var9];
        }
    }
}
