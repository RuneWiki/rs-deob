import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class56 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field1441 = -1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public boolean field1440 = false;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lde;")
    public class27 field1444 = null;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    public int[] field1443;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    public int[] field1436;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public int[] field1439;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
    public int[] field1435;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private static int[] field1437 = new int[500];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    private static int[] field1434 = new int[500];

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    private static int[] field1438 = new int[500];

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private static int[] field1442 = new int[500];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static void method463() {
        field1437 = null;
        field1438 = null;
        field1442 = null;
        field1434 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([BLde;)V")
    public class56(byte[] arg0, class27 arg1) {
        this.field1444 = arg1;
        class57 var3 = new class57(arg0);
        class57 var4 = new class57(arg0);
        var3.field1477 = 2;
        int var5 = var3.method510(-109);
        int var6 = -1;
        int var7 = 0;
        var4.field1477 = var3.field1477 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method510(-109);
            if (var10 > 0) {
                if (this.field1444.field668[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1444.field668[var11] == 0) {
                            field1437[var7] = var11;
                            field1438[var7] = 0;
                            field1442[var7] = 0;
                            field1434[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1437[var7] = var8;
                short var12 = 0;
                if (this.field1444.field668[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1438[var7] = var12;
                } else {
                    field1438[var7] = var4.method499(-11093);
                }
                if ((var10 & 0x2) == 0) {
                    field1442[var7] = var12;
                } else {
                    field1442[var7] = var4.method499(-11093);
                }
                if ((var10 & 0x4) == 0) {
                    field1434[var7] = var12;
                } else {
                    field1434[var7] = var4.method499(-11093);
                }
                var6 = var8;
                var7++;
                if (this.field1444.field668[var8] == 5) {
                    this.field1440 = true;
                }
            }
        }
        if (arg0.length != var4.field1477) {
            throw new RuntimeException();
        }
        this.field1441 = var7;
        this.field1443 = new int[var7];
        this.field1436 = new int[var7];
        this.field1439 = new int[var7];
        this.field1435 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1443[var9] = field1437[var9];
            this.field1436[var9] = field1438[var9];
            this.field1439[var9] = field1442[var9];
            this.field1435[var9] = field1434[var9];
        }
    }
}
