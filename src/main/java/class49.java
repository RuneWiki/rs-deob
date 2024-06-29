import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QQWZAYRQ")
public class class49 extends class67 {

    @OriginalMember(owner = "client!QQWZAYRQ", name = "z", descriptor = "I")
    private int field1435 = -731;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "l", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "m", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "n", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "r", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "s", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "t", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "u", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "o", descriptor = "LJZFUUSFN;")
    private class28 field1424;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "y", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "q", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "w", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "x", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "v", descriptor = "[I")
    public int[] field1431;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "p", descriptor = "Lclient;")
    public static client field1425;

    @OriginalMember(owner = "client!QQWZAYRQ", name = "<init>", descriptor = "(IIIIIIZIII)V")
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field1421 = arg2;
        this.field1422 = arg5;
        this.field1423 = arg4;
        this.field1427 = arg8;
        int var11 = 38 / arg7;
        this.field1428 = arg0;
        this.field1429 = arg3;
        this.field1430 = arg9;
        if (arg1 != -1) {
            this.field1424 = class28.field952[arg1];
            this.field1434 = 0;
            this.field1426 = client.field502;
            if (arg6 && this.field1424.field957 != -1) {
                this.field1434 = (int) (Math.random() * (double) this.field1424.field953);
                this.field1426 -= (int) (Math.random() * (double) this.field1424.method308(6, this.field1434));
            }
        }
        class8 var12 = class8.method203(this.field1421);
        this.field1432 = var12.field657;
        this.field1433 = var12.field669;
        this.field1431 = var12.field638;
    }

    @OriginalMember(owner = "client!QQWZAYRQ", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        int var2 = -1;
        if (this.field1424 != null) {
            int var3 = client.field502 - this.field1426;
            if (var3 > 100 && this.field1424.field957 > 0) {
                var3 = 100;
            }
            label53: {
                do {
                    do {
                        if (var3 <= this.field1424.method308(6, this.field1434)) {
                            break label53;
                        }
                        var3 -= this.field1424.method308(6, this.field1434);
                        this.field1434++;
                    } while (this.field1434 < this.field1424.field953);
                    this.field1434 -= this.field1424.field957;
                } while (this.field1434 >= 0 && this.field1434 < this.field1424.field953);
                this.field1424 = null;
            }
            this.field1426 = client.field502 - var3;
            if (this.field1424 != null) {
                var2 = this.field1424.field954[this.field1434];
            }
        }
        class8 var4;
        if (this.field1431 == null) {
            var4 = class8.method203(this.field1421);
        } else {
            var4 = this.method492(-731);
        }
        if (var4 == null) {
            return null;
        }
        class42 var5 = var4.method205(this.field1422, this.field1423, this.field1427, this.field1428, this.field1429, this.field1430, var2);
        if (arg0 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!QQWZAYRQ", name = "a", descriptor = "(I)LCUIVWWJO;")
    public final class8 method492(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field1432 != -1) {
            class47 var4 = class47.field1405[this.field1432];
            int var5 = var4.field1407;
            int var6 = var4.field1408;
            int var7 = var4.field1409;
            int var8 = client.field421[var7 - var6];
            var3 = field1425.field528[var5] >> var6 & var8;
        } else if (this.field1433 != -1) {
            var3 = field1425.field528[this.field1433];
        }
        return var3 < 0 || var3 >= this.field1431.length || this.field1431[var3] == -1 ? null : class8.method203(this.field1431[var3]);
    }
}
