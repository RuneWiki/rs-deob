import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HALGFRSE")
public class class23 extends class20 {

    @OriginalMember(owner = "HALGFRSE", name = "s", descriptor = "Z")
    private boolean field757 = false;

    @OriginalMember(owner = "HALGFRSE", name = "z", descriptor = "I")
    private int field764 = 6;

    @OriginalMember(owner = "HALGFRSE", name = "A", descriptor = "Z")
    private boolean field765 = false;

    @OriginalMember(owner = "HALGFRSE", name = "n", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "HALGFRSE", name = "o", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "HALGFRSE", name = "p", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "HALGFRSE", name = "t", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "HALGFRSE", name = "u", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "HALGFRSE", name = "v", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "HALGFRSE", name = "w", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "HALGFRSE", name = "l", descriptor = "LLCRVYGCP;")
    private class36 field750;

    @OriginalMember(owner = "HALGFRSE", name = "r", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "HALGFRSE", name = "B", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "HALGFRSE", name = "x", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "HALGFRSE", name = "y", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "HALGFRSE", name = "m", descriptor = "[I")
    public int[] field751;

    @OriginalMember(owner = "HALGFRSE", name = "q", descriptor = "Lclient;")
    public static client field755;

    @OriginalMember(owner = "HALGFRSE", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        int var2 = -1;
        if (this.field750 != null) {
            int var3 = client.field271 - this.field766;
            if (var3 > 100 && this.field750.field958 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field750.method361(this.field764, this.field756)) {
                            break label45;
                        }
                        var3 -= this.field750.method361(this.field764, this.field756);
                        this.field756++;
                    } while (this.field756 < this.field750.field954);
                    this.field756 -= this.field750.field958;
                } while (this.field756 >= 0 && this.field756 < this.field750.field954);
                this.field750 = null;
            }
            this.field766 = client.field271 - var3;
            if (this.field750 != null) {
                var2 = this.field750.field955[this.field756];
            }
        }
        class61 var4;
        if (this.field751 == null) {
            var4 = class61.method491(this.field752);
        } else {
            var4 = this.method285(false);
        }
        if (var4 == null) {
            return null;
        }
        class59 var5 = var4.method486(this.field753, this.field754, this.field758, this.field759, this.field760, this.field761, var2);
        if (arg0 >= 0) {
            this.field764 = 425;
        }
        return var5;
    }

    @OriginalMember(owner = "HALGFRSE", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field752 = arg3;
        this.field753 = arg0;
        this.field754 = arg1;
        this.field758 = arg9;
        this.field759 = arg2;
        this.field760 = arg7;
        this.field761 = arg6;
        if (arg5 != -1) {
            this.field750 = class36.field953[arg5];
            this.field756 = 0;
            this.field766 = client.field271;
            if (arg8 && this.field750.field958 != -1) {
                this.field756 = (int) (Math.random() * (double) this.field750.field954);
                this.field766 -= (int) (Math.random() * (double) this.field750.method361(this.field764, this.field756));
            }
        }
        class61 var11 = class61.method491(this.field752);
        this.field762 = var11.field1433;
        this.field763 = var11.field1414;
        this.field751 = var11.field1395;
        if (arg4 >= 0) {
            this.field765 = !this.field765;
        }
    }

    @OriginalMember(owner = "HALGFRSE", name = "a", descriptor = "(Z)LSYTHBZWG;")
    public final class61 method285(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field762 != -1) {
            class2 var3 = class2.field6[this.field762];
            int var4 = var3.field8;
            int var5 = var3.field9;
            int var6 = var3.field10;
            int var7 = client.field567[var6 - var5];
            var2 = field755.field478[var4] >> var5 & var7;
        } else if (this.field763 != -1) {
            var2 = field755.field478[this.field763];
        }
        return var2 < 0 || var2 >= this.field751.length || this.field751[var2] == -1 ? null : class61.method491(this.field751[var2]);
    }
}
