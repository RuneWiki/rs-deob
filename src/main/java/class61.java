import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class61 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1488 = -1;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lpa;")
    public class90 field1487 = null;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public boolean field1490 = false;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public int[] field1491;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
    public int[] field1493;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
    public int[] field1496;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[I")
    public int[] field1489;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[I")
    private static int[] field1486 = new int[500];

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    private static int[] field1492 = new int[500];

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
    private static int[] field1495 = new int[500];

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    private static int[] field1494 = new int[500];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V", line = 4)
    public static void method460() {
        field1486 = null;
        field1492 = null;
        field1495 = null;
        field1494 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([BLpa;)V", line = 42)
    public class61(byte[] arg0, class90 arg1) {
        this.field1487 = arg1;
        class122 var3 = new class122(arg0);
        class122 var4 = new class122(arg0);
        var3.field3047 = 2;
        int var5 = var3.method943(-1025);
        int var6 = -1;
        int var7 = 0;
        var4.field3047 = var3.field3047 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method943(-1025);
            if (var10 > 0) {
                if (this.field1487.field2327[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1487.field2327[var11] == 0) {
                            field1486[var7] = var11;
                            field1492[var7] = 0;
                            field1495[var7] = 0;
                            field1494[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1486[var7] = var8;
                short var12 = 0;
                if (this.field1487.field2327[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1492[var7] = var12;
                } else {
                    field1492[var7] = var4.method960(60);
                }
                if ((var10 & 0x2) == 0) {
                    field1495[var7] = var12;
                } else {
                    field1495[var7] = var4.method960(75);
                }
                if ((var10 & 0x4) == 0) {
                    field1494[var7] = var12;
                } else {
                    field1494[var7] = var4.method960(58);
                }
                var6 = var8;
                var7++;
                if (this.field1487.field2327[var8] == 5) {
                    this.field1490 = true;
                }
            }
        }
        if (arg0.length != var4.field3047) {
            throw new RuntimeException();
        }
        this.field1488 = var7;
        this.field1491 = new int[var7];
        this.field1493 = new int[var7];
        this.field1496 = new int[var7];
        this.field1489 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1491[var9] = field1486[var9];
            this.field1493[var9] = field1492[var9];
            this.field1496[var9] = field1495[var9];
            this.field1489[var9] = field1494[var9];
        }
    }
}
