import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FDWERTGB")
public class class15 extends class3 {

    @OriginalMember(owner = "client!FDWERTGB", name = "n", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!FDWERTGB", name = "o", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!FDWERTGB", name = "p", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!FDWERTGB", name = "w", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!FDWERTGB", name = "x", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!FDWERTGB", name = "y", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!FDWERTGB", name = "z", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!FDWERTGB", name = "v", descriptor = "LXRDQTWLL;")
    private class67 field697;

    @OriginalMember(owner = "client!FDWERTGB", name = "t", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!FDWERTGB", name = "s", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!FDWERTGB", name = "q", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!FDWERTGB", name = "r", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!FDWERTGB", name = "u", descriptor = "[I")
    public int[] field696;

    @OriginalMember(owner = "client!FDWERTGB", name = "m", descriptor = "Lclient;")
    public static client field688;

    @OriginalMember(owner = "client!FDWERTGB", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field697 != null) {
            int var3 = client.field471 - this.field694;
            if (var3 > 100 && this.field697.field1671 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field697.method583(this.field695, (byte) 9)) {
                            break label44;
                        }
                        var3 -= this.field697.method583(this.field695, (byte) 9);
                        this.field695++;
                    } while (this.field695 < this.field697.field1667);
                    this.field695 -= this.field697.field1671;
                } while (this.field695 >= 0 && this.field695 < this.field697.field1667);
                this.field697 = null;
            }
            this.field694 = client.field471 - var3;
            if (this.field697 != null) {
                var2 = this.field697.field1668[this.field695];
            }
        }
        class70 var4;
        if (this.field696 == null) {
            var4 = class70.method596(this.field689);
        } else {
            var4 = this.method255(825);
        }
        return var4 == null ? null : var4.method587(this.field690, this.field691, this.field698, this.field699, this.field700, this.field701, var2);
    }

    @OriginalMember(owner = "client!FDWERTGB", name = "<init>", descriptor = "(IIIIZIIIIZ)V")
    public class15(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field689 = arg6;
        this.field690 = arg5;
        if (arg9) {
            throw new NullPointerException();
        }
        this.field691 = arg1;
        this.field698 = arg0;
        this.field699 = arg3;
        this.field700 = arg2;
        this.field701 = arg7;
        if (arg8 != -1) {
            this.field697 = class67.field1666[arg8];
            this.field695 = 0;
            this.field694 = client.field471;
            if (arg4 && this.field697.field1671 != -1) {
                this.field695 = (int) (Math.random() * (double) this.field697.field1667);
                this.field694 -= (int) (Math.random() * (double) this.field697.method583(this.field695, (byte) 9));
            }
        }
        class70 var11 = class70.method596(this.field689);
        this.field692 = var11.field1701;
        this.field693 = var11.field1725;
        this.field696 = var11.field1734;
    }

    @OriginalMember(owner = "client!FDWERTGB", name = "a", descriptor = "(I)LYJMLCFGC;")
    public final class70 method255(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        if (this.field692 != -1) {
            class47 var3 = class47.field1241[this.field692];
            int var4 = var3.field1243;
            int var5 = var3.field1244;
            int var6 = var3.field1245;
            int var7 = client.field408[var6 - var5];
            var2 = field688.field269[var4] >> var5 & var7;
        } else if (this.field693 != -1) {
            var2 = field688.field269[this.field693];
        }
        return var2 < 0 || var2 >= this.field696.length || this.field696[var2] == -1 ? null : class70.method596(this.field696[var2]);
    }
}
