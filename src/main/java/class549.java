import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class549 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "B")
    public byte field7459;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lrq;")
    public class372 field7472;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Ltc;")
    public class373 field7462;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Ltc;")
    public class373 field7463;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Llg;")
    public class436 field7471;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lva;")
    public class524 field7464;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Lva;")
    public class524 field7467;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lni;")
    public class549 field7465;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Ldm;")
    public class58 field7466;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "S")
    public short field7460;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "S")
    public short field7461;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "S")
    public short field7468;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "S")
    public short field7470;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIB)V", line = 8)
    public static final void method3082(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7456++;
        int var5 = 0;
        if (arg4 > -103) {
            method3084(-49, 53, -98, 19, 120, 2, -41, -21, 58, 46);
        }
        int var6 = arg3;
        int var7 = -arg3;
        class679.method3826(class298.field4105[arg2], arg0 + arg3, 11, arg0 - arg3, arg1);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class298.field4105[arg2 + var6];
                int[] var10 = class298.field4105[arg2 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class679.method3826(var9, var11, 11, var12, arg1);
                class679.method3826(var10, var11, 11, var12, arg1);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class298.field4105[arg2 + var5];
            int[] var16 = class298.field4105[arg2 - var5];
            class679.method3826(var15, var13, 11, var14, arg1);
            class679.method3826(var16, var13, 11, var14, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 61)
    public final void method3083(byte arg0) {
        while (this.field7466 != null) {
            class58 var3 = this.field7466.field811;
            this.field7466.method410((byte) 33);
            this.field7466 = var3;
        }
        int var2 = 60 / ((arg0 + 39) / 60);
        field7455++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIII)V", line = 79)
    public static final void method3084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7458++;
        if (arg8 < 512 || arg3 < 512 || arg8 > ((class483.field6515 - 2) * 512) || ((class65.field926 - 2) * 512) < arg3) {
            class538.field7307[0] = class538.field7307[1] = -1;
            return;
        }
        int var10 = class309.method1973(15356, arg8, arg3, arg5) - arg1;
        if (class618.field8597) {
            class479.method2742(-1, true);
        } else {
            class417.field5701.method1860(arg6, 0, 0);
            class95.field1472.method503(class417.field5701);
        }
        int var11 = 8 / ((arg4 + 67) / 36);
        if (class507.field6967) {
            class95.field1472.method488(arg8, var10, arg3, class90.field1369, class538.field7307);
        } else {
            class95.field1472.method515(arg8, var10, arg3, class538.field7307);
        }
        if (class618.field8597) {
            class187.method1382(43);
        } else {
            class417.field5701.method1860(-arg6, 0, 0);
            class95.field1472.method503(class417.field5701);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 118)
    public class549(int arg0) {
        this.field7459 = (byte) arg0;
    }
}
