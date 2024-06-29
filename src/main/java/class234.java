import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class234 extends class335 {

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    private int field3735 = -1;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Lgh;")
    public static class223 field3736 = new class223(0, 0);

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!qn", name = "Z", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "[I")
    public static int[] field3729;

    @OriginalMember(owner = "client!qn", name = "Y", descriptor = "[I")
    public int[] field3742;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "[Lmb;")
    public static class187[] field3739;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILl;Z)Lgm;", line = 5)
    public static final class249 method1646(int arg0, int arg1, class133 arg2, boolean arg3) {
        field3731++;
        if (class181.method1296(arg3, arg2, arg0, arg1)) {
            return arg3 ? (class249) null : class186.method1334((byte) -119);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[[I", line = 21)
    public int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        field3734++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446 && this.method1647(false)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = this.field3741 * (class75.field1213 == this.field3743 ? arg0 : this.field3743 * arg0 / class75.field1213);
            if (class105.field1630 == this.field3741) {
                for (int var11 = 0; var11 < class105.field1630; var11++) {
                    int var12 = this.field3742[var7++];
                    var5[var11] = class270.method1860(var12 << 4, 4080);
                    var4[var11] = class270.method1860(4080, var12 >> 4);
                    var6[var11] = class270.method1860(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class105.field1630; var8++) {
                    int var9 = this.field3741 * var8 / class105.field1630;
                    int var10 = this.field3742[var7 + var9];
                    var5[var8] = class270.method1860(var10 << 4, 4080);
                    var4[var8] = class270.method1860(var10 >> 4, 4080);
                    var6[var8] = class270.method1860(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)Z", line = 93)
    public final boolean method1647(boolean arg0) {
        field3732++;
        if (this.field3742 != null) {
            return true;
        }
        if (arg0) {
            this.field3741 = 111;
        }
        if (this.field3735 < 0) {
            return false;
        }
        class249 var2 = class20.field265 < 0 ? class43.method374(class188.field2819, 3, this.field3735) : method1646(class20.field265, this.field3735, class188.field2819, false);
        var2.method1711();
        this.field3743 = var2.field4207;
        this.field3741 = var2.field4202;
        this.field3742 = var2.field3942;
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 119)
    public static void method1648(int arg0) {
        if (arg0 == 16711680) {
            field3736 = null;
            field3729 = null;
            field3739 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 134)
    public class234() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 139)
    public final void method1649(int arg0) {
        int var2 = 45 % ((-arg0 - 79) / 34);
        field3738++;
        super.method1649(-117);
        this.field3742 = null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)I", line = 158)
    public final int method1650(boolean arg0) {
        if (!arg0) {
            field3739 = (class187[]) null;
        }
        field3733++;
        return this.field3735;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILkh;I)V", line = 170)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3735 = arg1.method1151(-71);
        }
        if (arg2 >= 51) {
            field3737++;
        }
    }
}
