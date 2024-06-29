import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class229 extends OutputStream {

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Loh;")
    public static class258 field3956 = class153.method1046("::wm1", 90);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lmd;")
    public static class114 field3959;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lke;")
    public static class116 field3953;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1526(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class117.field2084; var3++) {
            class226 var4 = class36.field480[var3];
            if (var4.field3871 == 1) {
                int var5 = var4.field3878 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3881 * var5 >> 8) + var4.field3875;
                    int var7 = (var4.field3890 * var5 >> 8) + var4.field3897;
                    int var8 = (var4.field3887 * var5 >> 8) + var4.field3879;
                    int var9 = (var4.field3884 * var5 >> 8) + var4.field3883;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3871 == 2) {
                int var10 = arg0 - var4.field3878;
                if (var10 > 0) {
                    int var11 = (var4.field3881 * var10 >> 8) + var4.field3875;
                    int var12 = (var4.field3890 * var10 >> 8) + var4.field3897;
                    int var13 = (var4.field3887 * var10 >> 8) + var4.field3879;
                    int var14 = (var4.field3884 * var10 >> 8) + var4.field3883;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3871 == 3) {
                int var15 = var4.field3875 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3889 * var15 >> 8) + var4.field3878;
                    int var17 = (var4.field3888 * var15 >> 8) + var4.field3877;
                    int var18 = (var4.field3887 * var15 >> 8) + var4.field3879;
                    int var19 = (var4.field3884 * var15 >> 8) + var4.field3883;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3871 == 4) {
                int var20 = arg2 - var4.field3875;
                if (var20 > 0) {
                    int var21 = (var4.field3889 * var20 >> 8) + var4.field3878;
                    int var22 = (var4.field3888 * var20 >> 8) + var4.field3877;
                    int var23 = (var4.field3887 * var20 >> 8) + var4.field3879;
                    int var24 = (var4.field3884 * var20 >> 8) + var4.field3883;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3871 == 5) {
                int var25 = arg1 - var4.field3879;
                if (var25 > 0) {
                    int var26 = (var4.field3889 * var25 >> 8) + var4.field3878;
                    int var27 = (var4.field3888 * var25 >> 8) + var4.field3877;
                    int var28 = (var4.field3881 * var25 >> 8) + var4.field3875;
                    int var29 = (var4.field3890 * var25 >> 8) + var4.field3897;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "write", descriptor = "(I)V", line = 135)
    public final void write(int arg0) throws IOException {
        field3952++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V", line = 147)
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3958++;
        class238 var5 = (class238) class287.field4943.method986((long) arg2, arg1 ^ arg1);
        if (var5 == null) {
            var5 = new class238();
            class287.field4943.method984((byte) 42, var5, (long) arg2);
        }
        if (arg3 >= var5.field4153.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field4153.length; var8++) {
                var6[var8] = var5.field4153[var8];
                var7[var8] = var5.field4160[var8];
            }
            for (int var9 = var5.field4153.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4153 = var6;
            var5.field4160 = var7;
        }
        var5.field4153[arg3] = arg0;
        var5.field4160[arg3] = arg4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I", line = 203)
    public static final int method1528(byte arg0, int arg1) {
        field3951++;
        if (arg0 != -31) {
            method1530((byte) 94);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I", line = 218)
    public static final int method1529(int arg0, int arg1) {
        field3954++;
        if (arg0 >= -113) {
            method1530((byte) 107);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 236)
    public static void method1530(byte arg0) {
        field3956 = null;
        field3959 = null;
        if (arg0 <= 66) {
            field3959 = (class114) null;
        }
        field3953 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZII)V", line = 248)
    public static final void method1531(boolean arg0, int arg1, int arg2) {
        field3957++;
        class184.field3275++;
        class159.field2710.method885(241, -99);
        class159.field2710.method1619(8316, arg1);
        class159.field2710.method1601(arg2, 1);
        if (!arg0) {
            field3953 = (class116) null;
        }
    }
}
