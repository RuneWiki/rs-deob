import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AZNRLUAT")
public class class5 extends class30 {

    @OriginalMember(owner = "AZNRLUAT", name = "r", descriptor = "B")
    private byte field48 = 3;

    @OriginalMember(owner = "AZNRLUAT", name = "A", descriptor = "Z")
    private boolean field57 = true;

    @OriginalMember(owner = "AZNRLUAT", name = "t", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "AZNRLUAT", name = "u", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "AZNRLUAT", name = "v", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "AZNRLUAT", name = "w", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "AZNRLUAT", name = "x", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "AZNRLUAT", name = "y", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "AZNRLUAT", name = "z", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "AZNRLUAT", name = "l", descriptor = "LMJVHTYCA;")
    private class45 field42;

    @OriginalMember(owner = "AZNRLUAT", name = "m", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "AZNRLUAT", name = "n", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "AZNRLUAT", name = "o", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "AZNRLUAT", name = "p", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "AZNRLUAT", name = "q", descriptor = "[I")
    public int[] field47;

    @OriginalMember(owner = "AZNRLUAT", name = "s", descriptor = "Lclient;")
    public static client field49;

    @OriginalMember(owner = "AZNRLUAT", name = "a", descriptor = "(Z)LBMWIVHMF;")
    public final class8 method12(boolean arg0) {
        if (!arg0) {
            this.field57 = !this.field57;
        }
        int var2 = -1;
        if (this.field45 != -1) {
            class23 var3 = class23.field884[this.field45];
            int var4 = var3.field886;
            int var5 = var3.field887;
            int var6 = var3.field888;
            int var7 = client.field385[var6 - var5];
            var2 = field49.field320[var4] >> var5 & var7;
        } else if (this.field46 != -1) {
            var2 = field49.field320[this.field46];
        }
        return var2 < 0 || var2 >= this.field47.length || this.field47[var2] == -1 ? null : class8.method30(this.field47[var2]);
    }

    @OriginalMember(owner = "AZNRLUAT", name = "a", descriptor = "(I)LVYUQHOMO;")
    public final class66 method13(int arg0) {
        int var2 = -1;
        if (this.field42 != null) {
            int var3 = client.field572 - this.field44;
            if (var3 > 100 && this.field42.field1192 > 0) {
                var3 = 100;
            }
            label41: {
                do {
                    do {
                        if (var3 <= this.field42.method319(this.field43, this.field48)) {
                            break label41;
                        }
                        var3 -= this.field42.method319(this.field43, this.field48);
                        this.field43++;
                    } while (this.field43 < this.field42.field1188);
                    this.field43 -= this.field42.field1192;
                } while (this.field43 >= 0 && this.field43 < this.field42.field1188);
                this.field42 = null;
            }
            this.field44 = client.field572 - var3;
            if (this.field42 != null) {
                var2 = this.field42.field1189[this.field43];
            }
        }
        class8 var4;
        if (this.field47 == null) {
            var4 = class8.method30(this.field50);
        } else {
            var4 = this.method12(true);
        }
        if (var4 == null) {
            return null;
        } else {
            class66 var5 = var4.method27(this.field51, this.field52, this.field53, this.field54, this.field55, this.field56, var2);
            int var6 = 24 / arg0;
            return var5;
        }
    }

    @OriginalMember(owner = "AZNRLUAT", name = "<init>", descriptor = "(IIIIZIIIII)V")
    public class5(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field50 = arg2;
        this.field51 = arg5;
        this.field52 = arg7;
        this.field53 = arg1;
        this.field54 = arg3;
        this.field55 = arg0;
        this.field56 = arg9;
        if (arg8 != -1) {
            this.field42 = class45.field1187[arg8];
            this.field43 = 0;
            this.field44 = client.field572;
            if (arg4 && this.field42.field1192 != -1) {
                this.field43 = (int) (Math.random() * (double) this.field42.field1188);
                this.field44 -= (int) (Math.random() * (double) this.field42.method319(this.field43, this.field48));
            }
        }
        class8 var11 = class8.method30(this.field50);
        this.field45 = var11.field135;
        this.field46 = var11.field138;
        if (arg6 != 0) {
            throw new NullPointerException();
        }
        this.field47 = var11.field90;
    }
}
