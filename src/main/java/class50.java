import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SBGQSXPV")
public class class50 extends class44 {

    @OriginalMember(owner = "client!SBGQSXPV", name = "v", descriptor = "I")
    private int field1477 = 8;

    @OriginalMember(owner = "client!SBGQSXPV", name = "z", descriptor = "I")
    private int field1481 = 939;

    @OriginalMember(owner = "client!SBGQSXPV", name = "B", descriptor = "I")
    private int field1483 = 939;

    @OriginalMember(owner = "client!SBGQSXPV", name = "w", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client!SBGQSXPV", name = "x", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client!SBGQSXPV", name = "y", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!SBGQSXPV", name = "o", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!SBGQSXPV", name = "p", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!SBGQSXPV", name = "q", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!SBGQSXPV", name = "r", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!SBGQSXPV", name = "D", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!SBGQSXPV", name = "s", descriptor = "LJZQVOFSF;")
    private class29 field1474;

    @OriginalMember(owner = "client!SBGQSXPV", name = "E", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!SBGQSXPV", name = "n", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!SBGQSXPV", name = "t", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!SBGQSXPV", name = "u", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!SBGQSXPV", name = "A", descriptor = "[I")
    public int[] field1482;

    @OriginalMember(owner = "client!SBGQSXPV", name = "C", descriptor = "Lclient;")
    public static client field1484;

    @OriginalMember(owner = "client!SBGQSXPV", name = "a", descriptor = "(I)LRUROEYEG;")
    public final class48 method504(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1475 != -1) {
            class12 var4 = class12.field653[this.field1475];
            int var5 = var4.field655;
            int var6 = var4.field656;
            int var7 = var4.field657;
            int var8 = client.field304[var7 - var6];
            var2 = field1484.field205[var5] >> var6 & var8;
        } else if (this.field1476 != -1) {
            var2 = field1484.field205[this.field1476];
        }
        return var2 < 0 || var2 >= this.field1482.length || this.field1482[var2] == -1 ? null : class48.method494(this.field1482[var2]);
    }

    @OriginalMember(owner = "client!SBGQSXPV", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        int var2 = -1;
        if (arg0 != 3) {
            this.field1485 = -452;
        }
        if (this.field1474 != null) {
            int var3 = client.field396 - this.field1469;
            if (var3 > 100 && this.field1474.field892 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field1474.method342(this.field1486, this.field1477)) {
                            break label44;
                        }
                        var3 -= this.field1474.method342(this.field1486, this.field1477);
                        this.field1486++;
                    } while (this.field1486 < this.field1474.field888);
                    this.field1486 -= this.field1474.field892;
                } while (this.field1486 >= 0 && this.field1486 < this.field1474.field888);
                this.field1474 = null;
            }
            this.field1469 = client.field396 - var3;
            if (this.field1474 != null) {
                var2 = this.field1474.field889[this.field1486];
            }
        }
        class48 var4;
        if (this.field1482 == null) {
            var4 = class48.method494(this.field1478);
        } else {
            var4 = this.method504(this.field1483);
        }
        return var4 == null ? null : var4.method492(this.field1479, this.field1480, this.field1470, this.field1471, this.field1472, this.field1473, var2);
    }

    @OriginalMember(owner = "client!SBGQSXPV", name = "<init>", descriptor = "(IIIIIZBIII)V")
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7, int arg8, int arg9) {
        this.field1478 = arg2;
        this.field1479 = arg3;
        this.field1480 = arg1;
        this.field1470 = arg9;
        this.field1471 = arg8;
        this.field1472 = arg0;
        this.field1473 = arg7;
        if (arg6 != -21) {
            this.field1485 = 243;
        }
        if (arg4 != -1) {
            this.field1474 = class29.field887[arg4];
            this.field1486 = 0;
            this.field1469 = client.field396 - 1;
            if (arg5 && this.field1474.field892 != -1) {
                this.field1486 = (int) (Math.random() * (double) this.field1474.field888);
                this.field1469 -= (int) (Math.random() * (double) this.field1474.method342(this.field1486, this.field1477));
            }
        }
        class48 var11 = class48.method494(this.field1478);
        this.field1475 = var11.field1439;
        this.field1476 = var11.field1434;
        this.field1482 = var11.field1436;
    }
}
