import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SLPOTSAU")
public class class54 extends class62 {

    @OriginalMember(owner = "SLPOTSAU", name = "r", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "SLPOTSAU", name = "l", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "SLPOTSAU", name = "s", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "SLPOTSAU", name = "t", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "SLPOTSAU", name = "m", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "SLPOTSAU", name = "n", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "SLPOTSAU", name = "o", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "SLPOTSAU", name = "p", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "SLPOTSAU", name = "z", descriptor = "LDWUJPTWU;")
    private class14 field1415;

    @OriginalMember(owner = "SLPOTSAU", name = "x", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "SLPOTSAU", name = "q", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "SLPOTSAU", name = "u", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "SLPOTSAU", name = "v", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "SLPOTSAU", name = "w", descriptor = "[I")
    public int[] field1412;

    @OriginalMember(owner = "SLPOTSAU", name = "y", descriptor = "Lclient;")
    public static client field1414;

    @OriginalMember(owner = "SLPOTSAU", name = "b", descriptor = "(I)LLWJTLDAE;")
    public final class33 method475(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        if (this.field1410 != -1) {
            class4 var3 = class4.field27[this.field1410];
            int var4 = var3.field29;
            int var5 = var3.field30;
            int var6 = var3.field31;
            int var7 = client.field204[var6 - var5];
            var2 = field1414.field188[var4] >> var5 & var7;
        } else if (this.field1411 != -1) {
            var2 = field1414.field188[this.field1411];
        }
        return var2 < 0 || var2 >= this.field1412.length || this.field1412[var2] == -1 ? null : class33.method290(this.field1412[var2]);
    }

    @OriginalMember(owner = "SLPOTSAU", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        int var2 = -1;
        if (arg0 != 27243) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1415 != null) {
            int var4 = client.field525 - this.field1406;
            if (var4 > 100 && this.field1415.field661 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field1415.method215(this.field1413, 0)) {
                            break label46;
                        }
                        var4 -= this.field1415.method215(this.field1413, 0);
                        this.field1413++;
                    } while (this.field1413 < this.field1415.field657);
                    this.field1413 -= this.field1415.field661;
                } while (this.field1413 >= 0 && this.field1413 < this.field1415.field657);
                this.field1415 = null;
            }
            this.field1406 = client.field525 - var4;
            if (this.field1415 != null) {
                var2 = this.field1415.field658[this.field1413];
            }
        }
        class33 var5;
        if (this.field1412 == null) {
            var5 = class33.method290(this.field1407);
        } else {
            var5 = this.method475(748);
        }
        return var5 == null ? null : var5.method295(this.field1408, this.field1409, this.field1402, this.field1403, this.field1404, this.field1405, var2);
    }

    @OriginalMember(owner = "SLPOTSAU", name = "<init>", descriptor = "(IIZIIIIIII)V")
    public class54(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1407 = arg0;
        if (arg4 < 9 || arg4 > 9) {
            this.field1401 = 100;
        }
        this.field1408 = arg7;
        this.field1409 = arg1;
        this.field1402 = arg5;
        this.field1403 = arg6;
        this.field1404 = arg3;
        this.field1405 = arg8;
        if (arg9 != -1) {
            this.field1415 = class14.field656[arg9];
            this.field1413 = 0;
            this.field1406 = client.field525;
            if (arg2 && this.field1415.field661 != -1) {
                this.field1413 = (int) (Math.random() * (double) this.field1415.field657);
                this.field1406 -= (int) (Math.random() * (double) this.field1415.method215(this.field1413, 0));
            }
        }
        class33 var11 = class33.method290(this.field1407);
        this.field1410 = var11.field1006;
        this.field1411 = var11.field1012;
        this.field1412 = var11.field1000;
    }
}
