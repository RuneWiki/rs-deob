import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class223 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ll;")
    public static class328 field3682 = new class328(512);

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "J")
    public static long field3688 = 0L;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lsf;")
    public static class124 field3687 = new class124(64);

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lsf;")
    public static class124 field3691 = new class124(4);

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
    public static boolean field3695 = false;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
    public static int[] field3694 = new int[8];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lml;")
    public class152 field3681;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lka;")
    public class211 field3689;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    public static int[] field3690;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1558(int arg0) {
        field3687 = null;
        if (arg0 == 3932) {
            field3690 = null;
            field3691 = null;
            field3694 = null;
            field3682 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lgb;", line = 19)
    public static final class191 method1559(int arg0) {
        class101.field1849 = 0;
        if (arg0 != 4) {
            field3691 = (class124) null;
        }
        field3679++;
        return class129.method919(84);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZB)Ljava/lang/String;", line = 32)
    public static final String method1560(int arg0, int arg1, boolean arg2, byte arg3) {
        field3680++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            if (arg3 != 113) {
                field3694 = (int[]) null;
            }
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[B", line = 81)
    public static final byte[] method1561(int arg0, int arg1) {
        class58 var2 = (class58) class111.field2031.method487(88, (long) arg1);
        if (arg0 != 15844) {
            method1560(-78, -29, true, (byte) 22);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class91.method696(var4, var7, 77);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class58(var3);
            class111.field2031.method491((long) arg1, arg0 - 15845, var2);
        }
        field3686++;
        return var2.field1149;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 136)
    public static final void method1562(int arg0) {
        class287.field4695.method895(128);
        field3684++;
        class140.field2375.method895(arg0 + arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIII)V", line = 151)
    public static final void method1563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3683++;
        if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
            class266.field4355 = -1;
            class104.field1907 = -1;
            return;
        }
        int var9 = class21.method189((byte) -81, arg6, arg0, class276.field4506) - arg1;
        int var10 = arg6 - class16.field462;
        int var11 = class305.field4957[class18.field500];
        int var12 = class305.field4957[class298.field4847];
        int var13 = var9 - class141.field2380;
        int var14 = class305.field4959[class18.field500];
        int var15 = class305.field4959[class298.field4847];
        int var16 = arg0 - field3693;
        if (arg8 != -13663) {
            method1558(-118);
        }
        int var17 = var10 * var14 + var11 * var16 >> 16;
        int var18 = var10 * var11 - (var14 * var16) >> 16;
        int var20 = var12 * var13 - (var15 * var18) >> 16;
        int var21 = arg5 + var17;
        int var22 = var12 * var18 + var13 * var15 >> 16;
        if (var22 < 50) {
            class266.field4355 = -1;
            class104.field1907 = -1;
        } else if (class241.field4016) {
            int var24 = arg2 * 512 >> 8;
            class104.field1907 = var21 * var24 / var22 + arg3;
            int var25 = arg7 * 512 >> 8;
            class266.field4355 = var20 * var25 / var22 + arg4;
        } else {
            class266.field4355 = arg4 + ((var20 << 9) / var22);
            class104.field1907 = (var21 << 9) / var22 + arg3;
        }
    }
}
