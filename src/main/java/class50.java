import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QHSYTCMW")
public class class50 extends class35 {

    @OriginalMember(owner = "client!QHSYTCMW", name = "B", descriptor = "Z")
    private boolean field1441 = true;

    @OriginalMember(owner = "client!QHSYTCMW", name = "p", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!QHSYTCMW", name = "q", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!QHSYTCMW", name = "r", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!QHSYTCMW", name = "w", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!QHSYTCMW", name = "x", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!QHSYTCMW", name = "y", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!QHSYTCMW", name = "z", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!QHSYTCMW", name = "s", descriptor = "LKAIFCIAJ;")
    private class27 field1432;

    @OriginalMember(owner = "client!QHSYTCMW", name = "v", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!QHSYTCMW", name = "A", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!QHSYTCMW", name = "n", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!QHSYTCMW", name = "o", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!QHSYTCMW", name = "u", descriptor = "[I")
    public int[] field1434;

    @OriginalMember(owner = "client!QHSYTCMW", name = "t", descriptor = "Lclient;")
    public static client field1433;

    @OriginalMember(owner = "client!QHSYTCMW", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        int var2 = -1;
        if (this.field1432 != null) {
            int var3 = client.field247 - this.field1440;
            if (var3 > 100 && this.field1432.field854 > 0) {
                var3 = 100;
            }
            label53: {
                do {
                    do {
                        if (var3 <= this.field1432.method240((byte) 0, this.field1435)) {
                            break label53;
                        }
                        var3 -= this.field1432.method240((byte) 0, this.field1435);
                        this.field1435++;
                    } while (this.field1435 < this.field1432.field850);
                    this.field1435 -= this.field1432.field854;
                } while (this.field1435 >= 0 && this.field1435 < this.field1432.field850);
                this.field1432 = null;
            }
            this.field1440 = client.field247 - var3;
            if (this.field1432 != null) {
                var2 = this.field1432.field851[this.field1435];
            }
        }
        class39 var4;
        if (this.field1434 == null) {
            var4 = class39.method323(this.field1429);
        } else {
            var4 = this.method429(true);
        }
        if (var4 == null) {
            return null;
        }
        class37 var5 = var4.method328(this.field1430, this.field1431, this.field1436, this.field1437, this.field1438, this.field1439, var2);
        if (arg0 != -12617) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!QHSYTCMW", name = "<init>", descriptor = "(IIIIIIIZZI)V")
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9) {
        this.field1429 = arg9;
        this.field1430 = arg4;
        this.field1431 = arg1;
        this.field1436 = arg5;
        this.field1437 = arg0;
        this.field1438 = arg2;
        this.field1439 = arg3;
        if (arg6 != -1) {
            this.field1432 = class27.field849[arg6];
            this.field1435 = 0;
            this.field1440 = client.field247;
            if (arg8 && this.field1432.field854 != -1) {
                this.field1435 = (int) (Math.random() * (double) this.field1432.field850);
                this.field1440 -= (int) (Math.random() * (double) this.field1432.method240((byte) 0, this.field1435));
            }
        }
        class39 var11 = class39.method323(this.field1429);
        this.field1427 = var11.field1103;
        this.field1428 = var11.field1143;
        if (!arg7) {
            throw new NullPointerException();
        }
        this.field1434 = var11.field1107;
    }

    @OriginalMember(owner = "client!QHSYTCMW", name = "a", descriptor = "(Z)LNNXJFXRX;")
    public final class39 method429(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1427 != -1) {
            class7 var3 = class7.field610[this.field1427];
            int var4 = var3.field612;
            int var5 = var3.field613;
            int var6 = var3.field614;
            int var7 = client.field124[var6 - var5];
            var2 = field1433.field187[var4] >> var5 & var7;
        } else if (this.field1428 != -1) {
            var2 = field1433.field187[this.field1428];
        }
        return var2 < 0 || var2 >= this.field1434.length || this.field1434[var2] == -1 ? null : class39.method323(this.field1434[var2]);
    }
}
