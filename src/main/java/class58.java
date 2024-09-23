import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UYLEXXVQ")
public class class58 extends class1 {

    @OriginalMember(owner = "UYLEXXVQ", name = "l", descriptor = "Z")
    private boolean field1372 = true;

    @OriginalMember(owner = "UYLEXXVQ", name = "z", descriptor = "I")
    private int field1386 = -723;

    @OriginalMember(owner = "UYLEXXVQ", name = "v", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "UYLEXXVQ", name = "w", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "UYLEXXVQ", name = "x", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "UYLEXXVQ", name = "m", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "UYLEXXVQ", name = "n", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "UYLEXXVQ", name = "o", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "UYLEXXVQ", name = "p", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "UYLEXXVQ", name = "t", descriptor = "LJFYFSKVR;")
    private class22 field1380;

    @OriginalMember(owner = "UYLEXXVQ", name = "s", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "UYLEXXVQ", name = "u", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "UYLEXXVQ", name = "q", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "UYLEXXVQ", name = "r", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "UYLEXXVQ", name = "k", descriptor = "[I")
    public int[] field1371;

    @OriginalMember(owner = "UYLEXXVQ", name = "y", descriptor = "Lclient;")
    public static client field1385;

    @OriginalMember(owner = "UYLEXXVQ", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1382 = arg4;
        this.field1383 = arg9;
        this.field1384 = arg6;
        this.field1373 = arg7;
        this.field1374 = arg0;
        if (arg2 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field1375 = arg5;
        this.field1376 = arg1;
        if (arg3 != -1) {
            this.field1380 = class22.field761[arg3];
            this.field1379 = 0;
            this.field1381 = client.field369;
            if (arg8 && this.field1380.field766 != -1) {
                this.field1379 = (int) (Math.random() * (double) this.field1380.field762);
                this.field1381 -= (int) (Math.random() * (double) this.field1380.method251(this.field1386, this.field1379));
            }
        }
        class72 var12 = class72.method588(this.field1382);
        this.field1377 = var12.field1703;
        this.field1378 = var12.field1721;
        this.field1371 = var12.field1689;
    }

    @OriginalMember(owner = "UYLEXXVQ", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        int var2 = -1;
        if (this.field1380 != null) {
            int var3 = client.field369 - this.field1381;
            if (var3 > 100 && this.field1380.field766 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field1380.method251(this.field1386, this.field1379)) {
                            break label45;
                        }
                        var3 -= this.field1380.method251(this.field1386, this.field1379);
                        this.field1379++;
                    } while (this.field1379 < this.field1380.field762);
                    this.field1379 -= this.field1380.field766;
                } while (this.field1379 >= 0 && this.field1379 < this.field1380.field762);
                this.field1380 = null;
            }
            this.field1381 = client.field369 - var3;
            if (this.field1380 != null) {
                var2 = this.field1380.field763[this.field1379];
            }
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        class72 var4;
        if (this.field1371 == null) {
            var4 = class72.method588(this.field1382);
        } else {
            var4 = this.method506(-612);
        }
        return var4 == null ? null : var4.method586(this.field1383, this.field1384, this.field1373, this.field1374, this.field1375, this.field1376, var2);
    }

    @OriginalMember(owner = "UYLEXXVQ", name = "a", descriptor = "(I)LZXOFSHYE;")
    public final class72 method506(int arg0) {
        if (arg0 >= 0) {
            this.field1372 = !this.field1372;
        }
        int var2 = -1;
        if (this.field1377 != -1) {
            class9 var3 = class9.field626[this.field1377];
            int var4 = var3.field628;
            int var5 = var3.field629;
            int var6 = var3.field630;
            int var7 = client.field283[var6 - var5];
            var2 = field1385.field232[var4] >> var5 & var7;
        } else if (this.field1378 != -1) {
            var2 = field1385.field232[this.field1378];
        }
        return var2 < 0 || var2 >= this.field1371.length || this.field1371[var2] == -1 ? null : class72.method588(this.field1371[var2]);
    }
}
