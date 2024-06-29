import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class107 extends class59 {

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    private int field2081 = 1;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    private int field2088 = 204;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    private int field2085 = 1;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "Lsd;")
    public static class166 field2084 = class135.method935("Sie haben gerade eine andere Welt verlassen)3", 0);

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "Lsd;")
    public static class166 field2082 = class135.method935("0(U", 0);

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lsd;")
    public static class166 field2089 = class135.method935("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field2091 = -1;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "[I")
    public static int[] field2083;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -123);
        if (arg1 >= -124) {
            this.field2085 = 101;
        }
        ++field2087;
        if (super.field1219.field1816) {
            for (int var4 = 0; ~var4 > ~class98.field1879; ++var4) {
                int var5 = class187.field3569[var4];
                int var6 = class136.field2657[arg0];
                int var7 = this.field2085 * var6 >> 12;
                int var8 = this.field2081 * var5 >> 12;
                int var9 = var6 % (4096 / this.field2085) * this.field2085;
                int var10 = var5 % (4096 / this.field2081) * this.field2081;
                if (this.field2088 > var9) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field2088) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2088 > var10) {
                    int var11;
                    for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 >= 18) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field2088 = arg0.method405(2);
                    }
                } else {
                    this.field2085 = arg0.method400(255);
                }
            } else {
                this.field2081 = arg0.method400(255);
            }
            ++field2086;
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method790(int arg0) {
        field2082 = null;
        field2084 = null;
        int var1 = 97 / ((-45 - arg0) / 49);
        field2089 = null;
        field2083 = null;
    }
}
