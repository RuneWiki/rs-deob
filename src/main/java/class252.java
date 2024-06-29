import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class252 extends class708 {

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lpu;")
    public static class559 field3597 = new class559(10, 8);

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Lfv;")
    public static class121 field3594;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)V")
    public static final void method1710(boolean arg0, int arg1) {
        for (class626 var2 = class563.field7972.method4209(arg0); var2 != null; var2 = class563.field7972.method4207(9356)) {
            if ((long) arg1 == (var2.field8991 >> 48 & 65535L)) {
                var2.method3617(1);
            }
        }
        ++field3595;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;BIZLjava/lang/String;)V")
    public static final void method1711(String arg0, byte arg1, int arg2, boolean arg3, String arg4) {
        ++field3599;
        class135 var5 = class59.method663(127);
        var5.field2109.method263((byte) 81, class433.field6062.field4035);
        var5.field2109.method223(1493807496, 0);
        int var6 = var5.field2109.field469;
        var5.field2109.method223(1493807496, 629);
        int[] var7 = class307.method1993(var5, arg1 + 47);
        int var8 = var5.field2109.field469;
        var5.field2109.method287((byte) 0, arg0);
        var5.field2109.method223(arg1 ^ 1493807549, class66.field1197);
        var5.field2109.method287((byte) 0, arg4);
        var5.field2109.method240(false, class229.field3268);
        var5.field2109.method263((byte) 111, class744.field10426);
        var5.field2109.method263((byte) 100, class649.field9170.field2572);
        class58.method642((byte) -127, var5.field2109);
        String var9 = class205.field2942;
        var5.field2109.method263((byte) 74, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field2109.method287((byte) 0, var9);
        }
        var5.field2109.method263((byte) 68, arg2);
        var5.field2109.method263((byte) -79, arg3 ? 1 : 0);
        var5.field2109.field469 += 7;
        var5.field2109.method261(var5.field2109.field469, (byte) 87, var7, var8);
        if (arg1 != 53) {
            field3594 = null;
        }
        var5.field2109.method231(var5.field2109.field469 - var6, (byte) 110);
        class539.method3178(var5, -18925);
        class120.field1873 = 0;
        class582.field8223 = -3;
        class229.field3272 = 0;
        class611.field8842 = 1;
        if (arg2 < 13) {
            class247.field3472 = true;
            class96.method872((byte) -94);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
    public static final int method1712(byte arg0) {
        ++field3593;
        if (arg0 != 37) {
            return 33;
        } else {
            return ~class435.field6079 == -2 ? class269.field3879 : 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field3596;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178 && this.method3962(125)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field9899 * super.field9899;
            for (int var8 = 0; var8 < class77.field1455; ++var8) {
                int var9 = super.field9909[var8 % super.field9902 + var7];
                var6[var8] = class555.method3246(var9 << 4, 4080);
                var5[var8] = class555.method3246(65280, var9) >> 4;
                var4[var8] = class555.method3246(4080, var9 >> 12);
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
    public static void method1713(byte arg0) {
        field3597 = null;
        if (arg0 == -88) {
            field3594 = null;
        }
    }
}
