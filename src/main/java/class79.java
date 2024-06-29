import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class79 extends class166 {

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[I")
    public static int[] field1318 = new int[1000];

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)[I")
    public final int[] method563(int arg0, int arg1, int arg2) {
        field1319++;
        return arg2 == 3 ? new int[] { this.field1326, this.field1314 + arg1 - this.field1327, this.field1316 - (this.field1325 - arg0) } : null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(III)[I")
    public final int[] method564(int arg0, int arg1, int arg2) {
        if (arg0 != 1000) {
            this.method566(-43, 94, -9);
        }
        field1329++;
        return new int[] { this.field1315, arg1 + this.field1327 - this.field1314, this.field1325 - this.field1316 + arg2 };
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)Lnb;")
    public static final class212 method565(int arg0, int arg1) {
        field1322++;
        class212 var2 = (class212) class33.field494.method1887(arg0 ^ 0x3, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class87.field1461.method1590(arg1, (byte) -25, arg0);
        class212 var4 = new class212();
        if (var3 != null) {
            var4.method1445(new class88(var3), 22710);
        }
        class33.field494.method1886(-99, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(III)Z")
    public final boolean method566(int arg0, int arg1, int arg2) {
        field1324++;
        if (arg1 == 0) {
            return this.field1327 <= arg2 && arg2 <= this.field1321 && this.field1325 <= arg0 && this.field1311 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static void method567(int arg0) {
        if (arg0 != 0) {
            field1318 = null;
        }
        field1318 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(III)Z")
    public final boolean method568(int arg0, int arg1, int arg2) {
        if (arg1 != -1430) {
            this.method564(-108, 81, 26);
        }
        field1317++;
        return arg2 >= this.field1314 && arg2 <= this.field1312 && this.field1316 <= arg0 && this.field1309 >= arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z")
    public final boolean method569(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -72) {
            this.field1309 = -110;
        }
        field1313++;
        return this.field1326 == arg3 && arg2 >= this.field1314 && this.field1312 >= arg2 && this.field1316 <= arg1 && arg1 <= this.field1309;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1321 = arg8;
        this.field1326 = arg0;
        this.field1312 = arg4;
        this.field1327 = arg6;
        this.field1314 = arg2;
        this.field1316 = arg3;
        this.field1315 = arg1;
        this.field1309 = arg5;
        this.field1311 = arg9;
        this.field1325 = arg7;
    }
}
