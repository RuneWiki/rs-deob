import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RFQAJLME")
public class class43 extends class71 {

    @OriginalMember(owner = "RFQAJLME", name = "t", descriptor = "Z")
    public boolean field1390 = false;

    @OriginalMember(owner = "RFQAJLME", name = "n", descriptor = "LBYUDODIR;")
    private class3 field1384;

    @OriginalMember(owner = "RFQAJLME", name = "o", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "RFQAJLME", name = "p", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "RFQAJLME", name = "q", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "RFQAJLME", name = "r", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "RFQAJLME", name = "s", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "RFQAJLME", name = "l", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "RFQAJLME", name = "m", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "RFQAJLME", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        class35 var2 = this.field1384.method18();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1384.field45.field1562[this.field1382];
        class35 var4 = new class35(class68.method582(var3, 0), var2, -575, false, true);
        if (!this.field1390) {
            var4.method398(0);
            var4.method399(-230, var3);
            var4.field1238 = null;
            var4.field1237 = null;
        }
        if (this.field1384.field48 != 128 || this.field1384.field49 != 128) {
            var4.method407(this.field1384.field49, this.field1384.field48, false, this.field1384.field48);
        }
        if (this.field1384.field50 != 0) {
            if (this.field1384.field50 == 90) {
                var4.method402(717);
            }
            if (this.field1384.field50 == 180) {
                var4.method402(717);
                var4.method402(717);
            }
            if (this.field1384.field50 == 270) {
                var4.method402(717);
                var4.method402(717);
                var4.method402(717);
            }
        }
        var4.method408(this.field1384.field51 + 64, this.field1384.field52 + 850, -30, -50, -30, true);
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var4;
    }

    @OriginalMember(owner = "RFQAJLME", name = "<init>", descriptor = "(IIIIIIII)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1384 = class3.field41[arg5];
        this.field1385 = arg0;
        this.field1386 = arg6;
        this.field1387 = arg2;
        this.field1388 = arg3;
        this.field1389 = arg1 + arg4;
        if (arg7 != -14763) {
            throw new NullPointerException();
        }
        this.field1390 = false;
    }

    @OriginalMember(owner = "RFQAJLME", name = "a", descriptor = "(IZ)V")
    public final void method469(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.field1383 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1383 <= this.field1384.field45.method525(0, this.field1382)) {
                        return;
                    }
                    this.field1383 -= this.field1384.field45.method525(0, this.field1382) + 1;
                    this.field1382++;
                } while (this.field1382 < this.field1384.field45.field1561);
            } while (this.field1382 >= 0 && this.field1382 < this.field1384.field45.field1561);
            this.field1382 = 0;
            this.field1390 = true;
        }
    }
}
