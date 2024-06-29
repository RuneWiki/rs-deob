import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LDXKRJQR")
public class class33 extends class31 {

    @OriginalMember(owner = "client!LDXKRJQR", name = "x", descriptor = "B")
    private byte field1043 = 7;

    @OriginalMember(owner = "client!LDXKRJQR", name = "I", descriptor = "Z")
    public boolean field1054 = false;

    @OriginalMember(owner = "client!LDXKRJQR", name = "K", descriptor = "Z")
    private boolean field1056 = true;

    @OriginalMember(owner = "client!LDXKRJQR", name = "B", descriptor = "LCRSWMDQF;")
    private class9 field1047;

    @OriginalMember(owner = "client!LDXKRJQR", name = "E", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!LDXKRJQR", name = "p", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!LDXKRJQR", name = "q", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!LDXKRJQR", name = "r", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!LDXKRJQR", name = "n", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!LDXKRJQR", name = "o", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!LDXKRJQR", name = "y", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!LDXKRJQR", name = "z", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!LDXKRJQR", name = "A", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!LDXKRJQR", name = "s", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!LDXKRJQR", name = "t", descriptor = "D")
    private double field1039;

    @OriginalMember(owner = "client!LDXKRJQR", name = "u", descriptor = "D")
    private double field1040;

    @OriginalMember(owner = "client!LDXKRJQR", name = "v", descriptor = "D")
    private double field1041;

    @OriginalMember(owner = "client!LDXKRJQR", name = "w", descriptor = "D")
    private double field1042;

    @OriginalMember(owner = "client!LDXKRJQR", name = "F", descriptor = "D")
    public double field1051;

    @OriginalMember(owner = "client!LDXKRJQR", name = "G", descriptor = "D")
    public double field1052;

    @OriginalMember(owner = "client!LDXKRJQR", name = "H", descriptor = "D")
    public double field1053;

    @OriginalMember(owner = "client!LDXKRJQR", name = "J", descriptor = "D")
    private double field1055;

    @OriginalMember(owner = "client!LDXKRJQR", name = "l", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!LDXKRJQR", name = "m", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!LDXKRJQR", name = "C", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!LDXKRJQR", name = "D", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!LDXKRJQR", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        this.field1047 = class9.field662[arg8];
        if (arg10) {
            this.field1056 = !this.field1056;
        }
        this.field1050 = arg0;
        this.field1035 = arg9;
        this.field1036 = arg7;
        this.field1037 = arg6;
        this.field1033 = arg11;
        this.field1034 = arg1;
        this.field1044 = arg5;
        this.field1045 = arg2;
        this.field1046 = arg3;
        this.field1038 = arg4;
        this.field1054 = false;
    }

    @OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(II)V")
    public final void method336(int arg0, int arg1) {
        this.field1054 = true;
        this.field1051 += (double) arg0 * this.field1039;
        this.field1052 += (double) arg0 * this.field1040;
        this.field1053 += this.field1055 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1042;
        int var3 = 52 / arg1;
        this.field1042 += (double) arg0 * this.field1055;
        this.field1048 = (int) (Math.atan2(this.field1039, this.field1040) * 325.949D) + 1024 & 0x7FF;
        this.field1049 = (int) (Math.atan2(this.field1042, this.field1041) * 325.949D) & 0x7FF;
        if (this.field1047.field666 == null) {
            return;
        }
        this.field1032 += arg0;
        while (this.field1032 > this.field1047.field666.method507(this.field1031, 196)) {
            this.field1032 -= this.field1047.field666.method507(this.field1031, 196) + 1;
            this.field1031++;
            if (this.field1031 >= this.field1047.field666.field1393) {
                this.field1031 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(IIIBI)V")
    public final void method337(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field1054) {
            double var6 = (double) (arg1 - this.field1035);
            double var8 = (double) (arg2 - this.field1036);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1051 = (double) this.field1045 * var6 / var10 + (double) this.field1035;
            this.field1052 = (double) this.field1045 * var8 / var10 + (double) this.field1036;
            this.field1053 = this.field1037;
        }
        double var12 = (double) (this.field1034 + 1 - arg0);
        this.field1039 = ((double) arg1 - this.field1051) / var12;
        this.field1040 = ((double) arg2 - this.field1052) / var12;
        this.field1041 = Math.sqrt(this.field1040 * this.field1040 + this.field1039 * this.field1039);
        if (!this.field1054) {
            this.field1042 = -this.field1041 * Math.tan((double) this.field1044 * 0.02454369D);
        }
        this.field1055 = ((double) arg4 - this.field1053 - this.field1042 * var12) * 2.0D / (var12 * var12);
        if (arg3 != -127) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        class65 var2 = this.field1047.method299();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        if (this.field1047.field666 != null) {
            var3 = this.field1047.field666.field1394[this.field1031];
        }
        class65 var5 = new class65(class6.method115(this.field1043, var3), (byte) 9, true, false, var2);
        if (var3 != -1) {
            var5.method548((byte) 77);
            var5.method549(true, var3);
            var5.field1627 = null;
            var5.field1626 = null;
        }
        if (this.field1047.field669 != 128 || this.field1047.field670 != 128) {
            var5.method557(0, this.field1047.field670, this.field1047.field669, this.field1047.field669);
        }
        var5.method553(this.field1049, 933);
        var5.method558(this.field1047.field672 + 64, this.field1047.field673 + 850, -30, -50, -30, true);
        return var5;
    }
}
