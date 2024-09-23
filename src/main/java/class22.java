import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HZQUFYDK")
public class class22 extends class28 {

    @OriginalMember(owner = "HZQUFYDK", name = "w", descriptor = "I")
    private int field796 = 49110;

    @OriginalMember(owner = "HZQUFYDK", name = "B", descriptor = "B")
    private byte field801 = 39;

    @OriginalMember(owner = "HZQUFYDK", name = "n", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "HZQUFYDK", name = "o", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "HZQUFYDK", name = "p", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "HZQUFYDK", name = "x", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "HZQUFYDK", name = "y", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "HZQUFYDK", name = "z", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "HZQUFYDK", name = "A", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "HZQUFYDK", name = "q", descriptor = "LTLXFHCOO;")
    private class58 field790;

    @OriginalMember(owner = "HZQUFYDK", name = "s", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "HZQUFYDK", name = "r", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "HZQUFYDK", name = "t", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "HZQUFYDK", name = "u", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "HZQUFYDK", name = "C", descriptor = "[I")
    public int[] field802;

    @OriginalMember(owner = "HZQUFYDK", name = "v", descriptor = "Lclient;")
    public static client field795;

    @OriginalMember(owner = "HZQUFYDK", name = "b", descriptor = "(I)LPFIKHQJO;")
    public final class42 method244(int arg0) {
        if (arg0 <= 0) {
            this.field796 = 70;
        }
        int var2 = -1;
        if (this.field793 != -1) {
            class18 var3 = class18.field741[this.field793];
            int var4 = var3.field743;
            int var5 = var3.field744;
            int var6 = var3.field745;
            int var7 = client.field136[var6 - var5];
            var2 = field795.field268[var4] >> var5 & var7;
        } else if (this.field794 != -1) {
            var2 = field795.field268[this.field794];
        }
        return var2 < 0 || var2 >= this.field802.length || this.field802[var2] == -1 ? null : class42.method405(this.field802[var2]);
    }

    @OriginalMember(owner = "HZQUFYDK", name = "<init>", descriptor = "(IIIIIIZIBI)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte arg8, int arg9) {
        this.field787 = arg9;
        this.field788 = arg3;
        this.field789 = arg5;
        if (this.field801 != arg8) {
            throw new NullPointerException();
        }
        this.field797 = arg7;
        this.field798 = arg2;
        this.field799 = arg4;
        this.field800 = arg1;
        if (arg0 != -1) {
            this.field790 = class58.field1453[arg0];
            this.field792 = 0;
            this.field791 = client.field237;
            if (arg6 && this.field790.field1458 != -1) {
                this.field792 = (int) (Math.random() * (double) this.field790.field1454);
                this.field791 -= (int) (Math.random() * (double) this.field790.method493(this.field792, (byte) 2));
            }
        }
        class42 var11 = class42.method405(this.field787);
        this.field793 = var11.field1168;
        this.field794 = var11.field1159;
        this.field802 = var11.field1133;
    }

    @OriginalMember(owner = "HZQUFYDK", name = "a", descriptor = "(I)LNJPATAFL;")
    public final class35 method206(int arg0) {
        int var2 = -1;
        if (this.field790 != null) {
            int var3 = client.field237 - this.field791;
            if (var3 > 100 && this.field790.field1458 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field790.method493(this.field792, (byte) 2)) {
                            break label45;
                        }
                        var3 -= this.field790.method493(this.field792, (byte) 2);
                        this.field792++;
                    } while (this.field792 < this.field790.field1454);
                    this.field792 -= this.field790.field1458;
                } while (this.field792 >= 0 && this.field792 < this.field790.field1454);
                this.field790 = null;
            }
            this.field791 = client.field237 - var3;
            if (this.field790 != null) {
                var2 = this.field790.field1455[this.field792];
            }
        }
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        class42 var4;
        if (this.field802 == null) {
            var4 = class42.method405(this.field787);
        } else {
            var4 = this.method244(174);
        }
        return var4 == null ? null : var4.method406(this.field788, this.field789, this.field797, this.field798, this.field799, this.field800, var2);
    }
}
