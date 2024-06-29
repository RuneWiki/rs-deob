import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public static int[] field437 = new int[2];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Ltq;")
    public static class441 field436 = new class441();

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field441 = -1;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lao;")
    public static class188 field442 = new class188(46, 0);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lob;")
    public static class516 field445 = new class516("", 10);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lmk;")
    public static class39 field443;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lsd;")
    public static class61 field444;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method208(int arg0, int arg1, int arg2, int arg3) {
        class165 var4 = class36.field545[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class177 var5 = var4.field2482;
        class177 var6 = var4.field2493;
        if (var5 != null) {
            var5.field2686 = var5.field2686 * arg3 / (0x10 << class225.field3278 - 7);
            var5.field2679 = var5.field2679 * arg3 / (0x10 << class225.field3278 - 7);
        }
        if (var6 != null) {
            var6.field2686 = var6.field2686 * arg3 / (0x10 << class225.field3278 - 7);
            var6.field2679 = var6.field2679 * arg3 / (0x10 << class225.field3278 - 7);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 41)
    public static void method209(byte arg0) {
        field445 = null;
        field436 = null;
        field444 = null;
        field437 = null;
        field442 = null;
        if (arg0 != -24) {
            method208(16, -127, -105, -66);
        }
        field443 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBII)V", line = 57)
    public static final void method210(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class322.field4945 = arg0;
        field438++;
        class156.field2366 = arg3;
        class229.field3347 = arg4;
        class145.field2134 = arg1;
        int var5 = -100 % ((82 - arg2) / 41);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[B", line = 80)
    public static final synchronized byte[] method211(int arg0, byte arg1) {
        field440++;
        if (arg1 != -20) {
            return null;
        } else if (arg0 == 100 && class132.field2028 > 0) {
            byte[] var2 = class54.field798[--class132.field2028];
            class54.field798[class132.field2028] = null;
            return var2;
        } else if (arg0 == 5000 && class251.field3631 > 0) {
            byte[] var3 = class342.field5213[--class251.field3631];
            class342.field5213[class251.field3631] = null;
            return var3;
        } else if (arg0 == 30000 && class43.field661 > 0) {
            byte[] var4 = class326.field4989[--class43.field661];
            class326.field4989[class43.field661] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
