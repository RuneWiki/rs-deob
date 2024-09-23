import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TUJJLJTQ")
public class class57 extends class66 {

    @OriginalMember(owner = "TUJJLJTQ", name = "s", descriptor = "I")
    private int field1392 = 31;

    @OriginalMember(owner = "TUJJLJTQ", name = "w", descriptor = "Z")
    private boolean field1396 = true;

    @OriginalMember(owner = "TUJJLJTQ", name = "k", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "TUJJLJTQ", name = "l", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "TUJJLJTQ", name = "m", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "TUJJLJTQ", name = "o", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "TUJJLJTQ", name = "p", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "TUJJLJTQ", name = "q", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "TUJJLJTQ", name = "r", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "TUJJLJTQ", name = "t", descriptor = "LODMBIHRM;")
    private class41 field1393;

    @OriginalMember(owner = "TUJJLJTQ", name = "x", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "TUJJLJTQ", name = "n", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "TUJJLJTQ", name = "y", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "TUJJLJTQ", name = "z", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "TUJJLJTQ", name = "u", descriptor = "[I")
    public int[] field1394;

    @OriginalMember(owner = "TUJJLJTQ", name = "v", descriptor = "Lclient;")
    public static client field1395;

    @OriginalMember(owner = "TUJJLJTQ", name = "<init>", descriptor = "(IIIIIZIIBI)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9) {
        this.field1384 = arg0;
        this.field1385 = arg1;
        this.field1386 = arg6;
        this.field1388 = arg9;
        this.field1389 = arg2;
        this.field1390 = arg7;
        this.field1391 = arg4;
        if (arg8 != -59) {
            this.field1396 = !this.field1396;
        }
        if (arg3 != -1) {
            this.field1393 = class41.field1184[arg3];
            this.field1397 = 0;
            this.field1387 = client.field553;
            if (arg5 && this.field1393.field1189 != -1) {
                this.field1397 = (int) (Math.random() * (double) this.field1393.field1185);
                this.field1387 -= (int) (Math.random() * (double) this.field1393.method413(this.field1397, false));
            }
        }
        class14 var11 = class14.method192(this.field1384);
        this.field1398 = var11.field732;
        this.field1399 = var11.field709;
        this.field1394 = var11.field726;
    }

    @OriginalMember(owner = "TUJJLJTQ", name = "b", descriptor = "(I)LDQLJXYPC;")
    public final class14 method462(int arg0) {
        int var2 = 54 / arg0;
        int var3 = -1;
        if (this.field1398 != -1) {
            class51 var4 = class51.field1328[this.field1398];
            int var5 = var4.field1330;
            int var6 = var4.field1331;
            int var7 = var4.field1332;
            int var8 = client.field528[var7 - var6];
            var3 = field1395.field643[var5] >> var6 & var8;
        } else if (this.field1399 != -1) {
            var3 = field1395.field643[this.field1399];
        }
        return var3 < 0 || var3 >= this.field1394.length || this.field1394[var3] == -1 ? null : class14.method192(this.field1394[var3]);
    }

    @OriginalMember(owner = "TUJJLJTQ", name = "a", descriptor = "(I)LKBEXSZSN;")
    public final class31 method28(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1393 != null) {
            int var3 = client.field553 - this.field1387;
            if (var3 > 100 && this.field1393.field1189 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field1393.method413(this.field1397, false)) {
                            break label44;
                        }
                        var3 -= this.field1393.method413(this.field1397, false);
                        this.field1397++;
                    } while (this.field1397 < this.field1393.field1185);
                    this.field1397 -= this.field1393.field1189;
                } while (this.field1397 >= 0 && this.field1397 < this.field1393.field1185);
                this.field1393 = null;
            }
            this.field1387 = client.field553 - var3;
            if (this.field1393 != null) {
                var2 = this.field1393.field1186[this.field1397];
            }
        }
        class14 var4;
        if (this.field1394 == null) {
            var4 = class14.method192(this.field1384);
        } else {
            var4 = this.method462(this.field1392);
        }
        return var4 == null ? null : var4.method189(this.field1385, this.field1386, this.field1388, this.field1389, this.field1390, this.field1391, var2);
    }
}
