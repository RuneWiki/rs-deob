import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DGIXCFDO")
public class class10 extends class16 {

    @OriginalMember(owner = "client!DGIXCFDO", name = "v", descriptor = "B")
    private byte field625 = -28;

    @OriginalMember(owner = "client!DGIXCFDO", name = "w", descriptor = "Z")
    private boolean field626 = true;

    @OriginalMember(owner = "client!DGIXCFDO", name = "J", descriptor = "Z")
    public boolean field639 = false;

    @OriginalMember(owner = "client!DGIXCFDO", name = "K", descriptor = "B")
    private byte field640 = -119;

    @OriginalMember(owner = "client!DGIXCFDO", name = "E", descriptor = "LTGYZPJQJ;")
    private class55 field634;

    @OriginalMember(owner = "client!DGIXCFDO", name = "I", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!DGIXCFDO", name = "m", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!DGIXCFDO", name = "n", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!DGIXCFDO", name = "o", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!DGIXCFDO", name = "t", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!DGIXCFDO", name = "u", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!DGIXCFDO", name = "F", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!DGIXCFDO", name = "N", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!DGIXCFDO", name = "G", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!DGIXCFDO", name = "H", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!DGIXCFDO", name = "p", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!DGIXCFDO", name = "l", descriptor = "D")
    private double field615;

    @OriginalMember(owner = "client!DGIXCFDO", name = "q", descriptor = "D")
    public double field620;

    @OriginalMember(owner = "client!DGIXCFDO", name = "r", descriptor = "D")
    public double field621;

    @OriginalMember(owner = "client!DGIXCFDO", name = "s", descriptor = "D")
    public double field622;

    @OriginalMember(owner = "client!DGIXCFDO", name = "x", descriptor = "D")
    private double field627;

    @OriginalMember(owner = "client!DGIXCFDO", name = "y", descriptor = "D")
    private double field628;

    @OriginalMember(owner = "client!DGIXCFDO", name = "z", descriptor = "D")
    private double field629;

    @OriginalMember(owner = "client!DGIXCFDO", name = "A", descriptor = "D")
    private double field630;

    @OriginalMember(owner = "client!DGIXCFDO", name = "B", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!DGIXCFDO", name = "C", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!DGIXCFDO", name = "D", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!DGIXCFDO", name = "L", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!DGIXCFDO", name = "M", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        class61 var2 = this.field634.method444();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field634.field1325 != null) {
            var3 = this.field634.field1325.field965[this.field632];
        }
        class61 var4 = new class61(var2, true, false, class44.method338(var3, (byte) 6), (byte) 0);
        if (arg0) {
            throw new NullPointerException();
        }
        if (var3 != -1) {
            var4.method473(39018);
            var4.method474(false, var3);
            var4.field1478 = null;
            var4.field1477 = null;
        }
        if (this.field634.field1328 != 128 || this.field634.field1329 != 128) {
            var4.method482(this.field626, this.field634.field1328, this.field634.field1328, this.field634.field1329);
        }
        var4.method478(this.field642, this.field625);
        var4.method483(this.field634.field1331 + 64, this.field634.field1332 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!DGIXCFDO", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field634 = class55.field1321[arg11];
        this.field638 = arg8;
        this.field616 = arg4;
        this.field617 = arg5;
        this.field618 = arg9;
        this.field623 = arg2;
        this.field624 = arg0;
        this.field635 = arg10;
        if (arg3 != 0) {
            this.field643 = 5;
        }
        this.field636 = arg1;
        this.field637 = arg6;
        this.field619 = arg7;
        this.field639 = false;
    }

    @OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(ZI)V")
    public final void method175(boolean arg0, int arg1) {
        this.field639 = true;
        this.field620 += (double) arg1 * this.field627;
        if (arg0) {
            return;
        }
        this.field621 += (double) arg1 * this.field628;
        this.field622 += this.field615 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field630;
        this.field630 += (double) arg1 * this.field615;
        this.field641 = (int) (Math.atan2(this.field627, this.field628) * 325.949D) + 1024 & 0x7FF;
        this.field642 = (int) (Math.atan2(this.field630, this.field629) * 325.949D) & 0x7FF;
        if (this.field634.field1325 == null) {
            return;
        }
        this.field633 += arg1;
        while (this.field633 > this.field634.field1325.method301(this.field632, this.field631)) {
            this.field633 -= this.field634.field1325.method301(this.field632, this.field631) + 1;
            this.field632++;
            if (this.field632 >= this.field634.field1325.field964) {
                this.field632 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(BIIII)V")
    public final void method176(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field640 != arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!this.field639) {
            double var7 = (double) (arg2 - this.field616);
            double var9 = (double) (arg1 - this.field617);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field620 = (double) this.field636 * var7 / var11 + (double) this.field616;
            this.field621 = (double) this.field636 * var9 / var11 + (double) this.field617;
            this.field622 = this.field618;
        }
        double var13 = (double) (this.field624 + 1 - arg4);
        this.field627 = ((double) arg2 - this.field620) / var13;
        this.field628 = ((double) arg1 - this.field621) / var13;
        this.field629 = Math.sqrt(this.field628 * this.field628 + this.field627 * this.field627);
        if (!this.field639) {
            this.field630 = -this.field629 * Math.tan((double) this.field635 * 0.02454369D);
        }
        this.field615 = ((double) arg3 - this.field622 - this.field630 * var13) * 2.0D / (var13 * var13);
    }
}
