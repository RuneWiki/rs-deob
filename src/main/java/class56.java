import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TGBMMCBD")
public class class56 extends class6 {

    @OriginalMember(owner = "TGBMMCBD", name = "x", descriptor = "I")
    private int field1468 = 5;

    @OriginalMember(owner = "TGBMMCBD", name = "m", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "TGBMMCBD", name = "n", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "TGBMMCBD", name = "o", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "TGBMMCBD", name = "p", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "TGBMMCBD", name = "q", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "TGBMMCBD", name = "r", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "TGBMMCBD", name = "s", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "TGBMMCBD", name = "y", descriptor = "LEJHGNUGE;")
    private class9 field1469;

    @OriginalMember(owner = "TGBMMCBD", name = "z", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "TGBMMCBD", name = "l", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "TGBMMCBD", name = "v", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "TGBMMCBD", name = "w", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "TGBMMCBD", name = "t", descriptor = "[I")
    public int[] field1464;

    @OriginalMember(owner = "TGBMMCBD", name = "u", descriptor = "Lclient;")
    public static client field1465;

    @OriginalMember(owner = "TGBMMCBD", name = "<init>", descriptor = "(IIIIIIZIBI)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte arg8, int arg9) {
        this.field1457 = arg0;
        this.field1458 = arg1;
        this.field1459 = arg7;
        this.field1460 = arg2;
        if (arg8 != 6) {
            throw new NullPointerException();
        }
        boolean var11 = false;
        this.field1461 = arg5;
        this.field1462 = arg4;
        this.field1463 = arg3;
        if (arg9 != -1) {
            this.field1469 = class9.field682[arg9];
            this.field1470 = 0;
            this.field1456 = client.field464;
            if (arg6 && this.field1469.field687 != -1) {
                this.field1470 = (int) (Math.random() * (double) this.field1469.field683);
                this.field1456 -= (int) (Math.random() * (double) this.field1469.method241(true, this.field1470));
            }
        }
        class50 var12 = class50.method512(this.field1457);
        this.field1466 = var12.field1328;
        this.field1467 = var12.field1337;
        this.field1464 = var12.field1352;
    }

    @OriginalMember(owner = "TGBMMCBD", name = "a", descriptor = "(I)LRUJAIVBH;")
    public final class50 method552(int arg0) {
        int var2 = -1;
        if (arg0 != -45828) {
            this.field1468 = 86;
        }
        if (this.field1466 != -1) {
            class16 var3 = class16.field792[this.field1466];
            int var4 = var3.field794;
            int var5 = var3.field795;
            int var6 = var3.field796;
            int var7 = client.field528[var6 - var5];
            var2 = field1465.field286[var4] >> var5 & var7;
        } else if (this.field1467 != -1) {
            var2 = field1465.field286[this.field1467];
        }
        return var2 < 0 || var2 >= this.field1464.length || this.field1464[var2] == -1 ? null : class50.method512(this.field1464[var2]);
    }

    @OriginalMember(owner = "TGBMMCBD", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        if (arg0 != -43) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field1469 != null) {
            int var4 = client.field464 - this.field1456;
            if (var4 > 100 && this.field1469.field687 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field1469.method241(true, this.field1470)) {
                            break label46;
                        }
                        var4 -= this.field1469.method241(true, this.field1470);
                        this.field1470++;
                    } while (this.field1470 < this.field1469.field683);
                    this.field1470 -= this.field1469.field687;
                } while (this.field1470 >= 0 && this.field1470 < this.field1469.field683);
                this.field1469 = null;
            }
            this.field1456 = client.field464 - var4;
            if (this.field1469 != null) {
                var3 = this.field1469.field684[this.field1470];
            }
        }
        class50 var5;
        if (this.field1464 == null) {
            var5 = class50.method512(this.field1457);
        } else {
            var5 = this.method552(-45828);
        }
        return var5 == null ? null : var5.method505(this.field1458, this.field1459, this.field1460, this.field1461, this.field1462, this.field1463, var3);
    }
}
