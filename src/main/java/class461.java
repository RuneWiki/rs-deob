import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class461 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field6447 = -1;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Ljn;")
    public static class134 field6452 = new class134(49, 10);

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6454 = null;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lri;")
    public class461 field6446;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lri;")
    public class461 field6448;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lqf;")
    public static class783 field6453;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 3)
    public final void method2773(int arg0) {
        if (arg0 <= 4) {
            return;
        }
        field6445++;
        if (this.field6446 != null) {
            this.field6446.field6448 = this.field6448;
            this.field6448.field6446 = this.field6446;
            this.field6446 = null;
            this.field6448 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V", line = 21)
    public static void method2774(boolean arg0) {
        if (!arg0) {
            method2774(true);
        }
        field6454 = null;
        field6453 = null;
        field6452 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZIIIIIII)Z", line = 39)
    public static final boolean method2775(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6451++;
        int var9 = class724.field10031.field9219[0];
        int var10 = class724.field10031.field9214[0];
        if (var9 < 0 || var9 >= class741.field10208 || var10 < 0 || class525.field7224 <= var10) {
            return false;
        } else if (arg8 >= 0 && class741.field10208 > arg8 && arg5 >= 0 && arg5 < class525.field7224) {
            int var11 = class400.method2460(var9, arg5, arg2, class468.field6495, var10, class724.field10031.method3744(~arg0), arg7, arg3, arg8, arg4, client.field1305[class724.field10031.field3467], arg1, -122, arg6, class194.field2596);
            if (arg0 < ~var11) {
                return false;
            }
            class683.field9568 = class194.field2596[var11 - 1];
            field6447 = class468.field6495[var11 - 1];
            class773.field10654 = false;
            class313.method2014(-128);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V", line = 69)
    public static final void method2776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6443++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class542.field7490 + ((class183.field2294 - class542.field7490) * var8 / 100);
        int var10 = arg7 * var9 >> 8;
        class775.field10662 = class775.field10669 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class448.field6265[var11] * -var10 >> 14;
            var15 = class448.field6270[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class448.field6265[var12] * var15 >> 14;
            var15 = class448.field6270[var12] * var15 >> 14;
        }
        class497.field6818 = arg0 - var13;
        class412.field5779 = arg4 - var15;
        class326.field4589 = arg1;
        class480.field6657 = 0;
        if (arg3 == -23064) {
            class472.field6537 = arg2;
            class479.field6645 = arg6 - var14;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLha;)V", line = 129)
    public static final void method2777(byte arg0, class473 arg1) {
        if (arg0 <= 42) {
            method2776(62, 35, 104, 6, 120, -39, -93, 55);
        }
        for (class388 var2 = (class388) class361.field5207.method3103((byte) 72); var2 != null; var2 = (class388) class361.field5207.method3104(-10964)) {
            if (var2.field5538) {
                var2.method2411(arg1);
            }
        }
        field6444++;
    }
}
