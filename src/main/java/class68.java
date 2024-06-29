import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lac;")
    public class4 field1695 = null;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
    public boolean field1702 = false;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field1705 = -1;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public int[] field1701;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
    public int[] field1697;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    public int[] field1703;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    private static int[] field1698 = new int[500];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    private static int[] field1696 = new int[500];

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[I")
    private static int[] field1700 = new int[500];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    private static int[] field1704 = new int[500];

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BLac;)V", line = 42)
    public class68(byte[] arg0, class4 arg1) {
        this.field1695 = arg1;
        class131 var3 = new class131(arg0);
        class131 var4 = new class131(arg0);
        var3.field3182 = 2;
        int var5 = var3.method971(true);
        int var6 = -1;
        int var7 = 0;
        var4.field3182 = var3.field3182 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method971(true);
            if (var10 > 0) {
                if (this.field1695.field91[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1695.field91[var11] == 0) {
                            field1704[var7] = var11;
                            field1698[var7] = 0;
                            field1696[var7] = 0;
                            field1700[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1704[var7] = var8;
                short var12 = 0;
                if (this.field1695.field91[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1698[var7] = var12;
                } else {
                    field1698[var7] = var4.method996(255);
                }
                if ((var10 & 0x2) == 0) {
                    field1696[var7] = var12;
                } else {
                    field1696[var7] = var4.method996(255);
                }
                if ((var10 & 0x4) == 0) {
                    field1700[var7] = var12;
                } else {
                    field1700[var7] = var4.method996(255);
                }
                var6 = var8;
                var7++;
                if (this.field1695.field91[var8] == 5) {
                    this.field1702 = true;
                }
            }
        }
        if (arg0.length != var4.field3182) {
            throw new RuntimeException();
        }
        this.field1705 = var7;
        this.field1701 = new int[var7];
        this.field1697 = new int[var7];
        this.field1703 = new int[var7];
        this.field1699 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1701[var9] = field1704[var9];
            this.field1697[var9] = field1698[var9];
            this.field1703[var9] = field1696[var9];
            this.field1699[var9] = field1700[var9];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 15)
    public static void method591() {
        field1704 = null;
        field1698 = null;
        field1696 = null;
        field1700 = null;
    }
}
