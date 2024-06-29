import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class566 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field8036;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    private int field8039;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field8032;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field8034;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field8030;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field8041;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field8031;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    private int field8040;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    private int field8029;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    private int field8033;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "[I")
    public static int[] field8043 = new int[50];

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIB)Z")
    public final boolean method3261(int arg0, int arg1, int arg2, byte arg3) {
        field8035++;
        if (arg2 < this.field8033 || arg2 > this.field8041) {
            return false;
        } else if (arg1 >= this.field8040 && this.field8030 >= arg1) {
            int var5 = -128 / ((arg3 - 2) / 63);
            if (this.field8031 <= arg0 && this.field8029 >= arg0) {
                int var6 = arg2 - this.field8036;
                int var7 = arg0 - this.field8039;
                return this.field8034 > (var6 * var6 + (var7 * var7));
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static final void method3262(String arg0, String arg1, int arg2, boolean arg3, int arg4) {
        field8037++;
        class519 var5 = class648.method3576(-104);
        var5.field7384.method3694(class95.field1123.field6501, -1528071456);
        var5.field7384.method3745(-117, 0);
        int var6 = var5.field7384.field9146;
        var5.field7384.method3745(-114, 633);
        int[] var7 = class143.method1001(9108, var5);
        int var8 = var5.field7384.field9146;
        var5.field7384.method3747((byte) 27, arg0);
        var5.field7384.method3745(-112, class638.field8771);
        var5.field7384.method3747((byte) 27, arg1);
        var5.field7384.method3692((byte) -103, class3.field32);
        var5.field7384.method3694(class549.field7669, -1528071456);
        if (arg4 != 18703) {
            method3265(100, -66);
        }
        var5.field7384.method3694(class633.field8733.field4515, -1528071456);
        class60.method512(var5.field7384, (byte) 111);
        String var9 = class246.field3287;
        var5.field7384.method3694(var9 == null ? 0 : 1, -1528071456);
        if (var9 != null) {
            var5.field7384.method3747((byte) 27, var9);
        }
        var5.field7384.method3694(arg2, -1528071456);
        var5.field7384.method3694(arg3 ? 1 : 0, arg4 - 1528090159);
        var5.field7384.field9146 += 7;
        var5.field7384.method3695(var5.field7384.field9146, var7, 106, var8);
        var5.field7384.method3741(var5.field7384.field9146 - var6, (byte) -87);
        class151.method1027(var5, -125);
        class69.field856 = 1;
        class429.field6123 = 0;
        class689.field9420 = 0;
        class480.field6795 = -3;
        if (arg2 < 13) {
            class225.field3036 = true;
            class401.method2504((byte) -66);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method3263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field8039 = arg10;
        field8038++;
        this.field8034 = arg4 * arg4;
        this.field8036 = arg9;
        this.field8032 = arg0;
        if (arg5 != 633) {
            this.method3261(28, 92, 100, (byte) -44);
        }
        this.field8040 = this.field8032 + arg2;
        this.field8031 = this.field8039 + arg7;
        this.field8041 = this.field8036 + arg3;
        this.field8030 = this.field8032 + arg6;
        this.field8033 = this.field8036 + arg8;
        this.field8029 = this.field8039 + arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method3264(boolean arg0) {
        if (arg0) {
            method3265(117, 37);
        }
        field8043 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field8036 = arg0;
        this.field8039 = arg2;
        this.field8032 = arg1;
        this.field8034 = arg3 * arg3;
        this.field8030 = this.field8032 + arg7;
        this.field8041 = this.field8036 + arg5;
        this.field8031 = this.field8039 + arg8;
        this.field8040 = this.field8032 + arg6;
        this.field8029 = this.field8039 + arg9;
        this.field8033 = this.field8036 + arg4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public static final int method3265(int arg0, int arg1) {
        if (arg0 != 2) {
            return 56;
        }
        field8042++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }
}
