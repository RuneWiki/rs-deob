import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SIDDBHEA")
public class class53 extends class2 {

    @OriginalMember(owner = "SIDDBHEA", name = "o", descriptor = "Z")
    private boolean field1496 = false;

    @OriginalMember(owner = "SIDDBHEA", name = "y", descriptor = "I")
    private int field1506 = 5;

    @OriginalMember(owner = "SIDDBHEA", name = "z", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "SIDDBHEA", name = "A", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "SIDDBHEA", name = "B", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "SIDDBHEA", name = "p", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "SIDDBHEA", name = "q", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "SIDDBHEA", name = "r", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "SIDDBHEA", name = "s", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "SIDDBHEA", name = "w", descriptor = "LOXBPHQKK;")
    private class42 field1504;

    @OriginalMember(owner = "SIDDBHEA", name = "v", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "SIDDBHEA", name = "m", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "SIDDBHEA", name = "t", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "SIDDBHEA", name = "u", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "SIDDBHEA", name = "n", descriptor = "[I")
    public int[] field1495;

    @OriginalMember(owner = "SIDDBHEA", name = "x", descriptor = "Lclient;")
    public static client field1505;

    @OriginalMember(owner = "SIDDBHEA", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        int var2 = -1;
        if (this.field1506 != arg0) {
            this.field1496 = !this.field1496;
        }
        if (this.field1504 != null) {
            int var3 = client.field291 - this.field1494;
            if (var3 > 100 && this.field1504.field1319 > 0) {
                var3 = 100;
            }
            label49: {
                do {
                    do {
                        if (var3 <= this.field1504.method457(this.field1503, this.field1496)) {
                            break label49;
                        }
                        var3 -= this.field1504.method457(this.field1503, this.field1496);
                        this.field1503++;
                    } while (this.field1503 < this.field1504.field1315);
                    this.field1503 -= this.field1504.field1319;
                } while (this.field1503 >= 0 && this.field1503 < this.field1504.field1315);
                this.field1504 = null;
            }
            this.field1494 = client.field291 - var3;
            if (this.field1504 != null) {
                var2 = this.field1504.field1316[this.field1503];
            }
        }
        class32 var4;
        if (this.field1495 == null) {
            var4 = class32.method401(this.field1507);
        } else {
            var4 = this.method489(965);
        }
        return var4 == null ? null : var4.method406(this.field1508, this.field1509, this.field1497, this.field1498, this.field1499, this.field1500, var2);
    }

    @OriginalMember(owner = "SIDDBHEA", name = "b", descriptor = "(I)LKZRNPNVL;")
    public final class32 method489(int arg0) {
        int var2 = -1;
        int var3 = 28 / arg0;
        if (this.field1501 != -1) {
            class5 var4 = class5.field36[this.field1501];
            int var5 = var4.field38;
            int var6 = var4.field39;
            int var7 = var4.field40;
            int var8 = client.field156[var7 - var6];
            var2 = field1505.field59[var5] >> var6 & var8;
        } else if (this.field1502 != -1) {
            var2 = field1505.field59[this.field1502];
        }
        return var2 < 0 || var2 >= this.field1495.length || this.field1495[var2] == -1 ? null : class32.method401(this.field1495[var2]);
    }

    @OriginalMember(owner = "SIDDBHEA", name = "<init>", descriptor = "(IIIIIZIIIZ)V")
    public class53(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1507 = arg6;
        if (arg9) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field1508 = arg3;
        this.field1509 = arg4;
        this.field1497 = arg0;
        this.field1498 = arg7;
        this.field1499 = arg8;
        this.field1500 = arg1;
        if (arg2 != -1) {
            this.field1504 = class42.field1314[arg2];
            this.field1503 = 0;
            this.field1494 = client.field291;
            if (arg5 && this.field1504.field1319 != -1) {
                this.field1503 = (int) (Math.random() * (double) this.field1504.field1315);
                this.field1494 -= (int) (Math.random() * (double) this.field1504.method457(this.field1503, this.field1496));
            }
        }
        class32 var12 = class32.method401(this.field1507);
        this.field1501 = var12.field1105;
        this.field1502 = var12.field1092;
        this.field1495 = var12.field1085;
    }
}
