import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class640 extends class665 {

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[B")
    public byte[] field9032;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "[I")
    public static int[] field9036 = new int[4];

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Ldg;")
    public static class376 field9030 = new class376(9, 3);

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "[I")
    public static int[] field9039 = new int[14];

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
    public static float field9038;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;BILft;)Lpga;", line = 7)
    public static final class494 method3562(String arg0, byte arg1, int arg2, class4 arg3) {
        field9033++;
        if (arg2 == 0) {
            return arg3.method13(arg0, arg1 ^ 0xFFFFFFE2);
        } else if (arg1 != -14) {
            return null;
        } else if (arg2 == 1) {
            try {
                class556.method3149(class421.field6129, "openjs", new Object[] { (new URL(class421.field6129.getCodeBase(), arg0)).toString() }, (byte) -42);
                class494 var4 = new class494();
                var4.field7024 = 1;
                return var4;
            } catch (Throwable var10) {
                class494 var5 = new class494();
                var5.field7024 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class421.field6129.getAppletContext().showDocument(new URL(class421.field6129.getCodeBase(), arg0), "_blank");
                class494 var6 = new class494();
                var6.field7024 = 1;
                return var6;
            } catch (Exception var11) {
                class494 var7 = new class494();
                var7.field7024 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class556.method3150(-21295, class421.field6129, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class421.field6129.getAppletContext().showDocument(new URL(class421.field6129.getCodeBase(), arg0), "_top");
                class494 var8 = new class494();
                var8.field7024 = 1;
                return var8;
            } catch (Exception var12) {
                class494 var9 = new class494();
                var9.field7024 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 84)
    public static void method3563(int arg0) {
        field9036 = null;
        int var1 = 108 % (arg0 / 34);
        field9039 = null;
        field9030 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLmo;)Lci;", line = 95)
    public static final class413 method3564(byte arg0, class695 arg1) {
        field9031++;
        class31 var2 = class533.method3036(arg1, (byte) 90);
        int var3 = arg1.method3880(8);
        int var4 = arg1.method3880(8);
        if (arg0 >= -11) {
            method3564((byte) 100, null);
        }
        int var5 = arg1.method3847((byte) 118);
        return new class413(var2.field485, var2.field479, var2.field489, var2.field481, var2.field487, var2.field480, var2.field482, var2.field484, var2.field477, var3, var4, var5);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIII)V", line = 114)
    public static final void method3565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg4 && arg2 == arg7 && arg3 == arg8 && arg5 == arg6) {
            class14.method77(arg5, arg7, arg3, arg1, true, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg7;
            int var12 = arg1 * 3;
            int var13 = arg7 * 3;
            int var14 = arg4 * 3;
            int var15 = arg2 * 3;
            int var16 = arg8 * 3;
            int var17 = arg6 * 3;
            int var18 = arg3 + var14 - var16 - arg1;
            int var19 = arg5 - (arg7 - var15) - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg1;
                int var34 = arg7 + (var30 + var32 + var28 >> 12);
                class14.method77(var34, var11, var33, var10, true, arg9);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 != 15) {
            field9037 = 41;
        }
        field9034++;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 189)
    public static final void method3566(int arg0) {
        field9035++;
        if (arg0 != 3) {
            method3564((byte) 74, null);
        }
        class191 var1 = class6.method38(15, -98, 0);
        var1.method1284((byte) -112);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([B)V", line = 201)
    public class640(byte[] arg0) {
        this.field9032 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I", line = 213)
    public static final int method3567(int arg0, int arg1) {
        return class252.field3889 == null ? 0 : class252.field3889[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V", line = 221)
    public static final void method3568(int arg0, int arg1) {
        class40 var2 = class153.field2210[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class40 var4 = class153.field2210[var3][arg0][arg1] = class153.field2210[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class106 var5 = var4.field671; var5 != null; var5 = var5.field1641) {
                    class454 var6 = var5.field1638;
                    if (var6.field6524 == arg0 && var6.field6521 == arg1) {
                        var6.field3019--;
                    }
                }
                if (var4.field663 != null) {
                    var4.field663.field3019--;
                }
                if (var4.field658 != null) {
                    var4.field658.field3019--;
                }
                if (var4.field669 != null) {
                    var4.field669.field3019--;
                }
                if (var4.field665 != null) {
                    var4.field665.field3019--;
                }
                if (var4.field662 != null) {
                    var4.field662.field3019--;
                }
            }
        }
        if (class153.field2210[0][arg0][arg1] == null) {
            class153.field2210[0][arg0][arg1] = new class40(0);
            class153.field2210[0][arg0][arg1].field672 = 1;
        }
        class153.field2210[0][arg0][arg1].field668 = var2;
        class153.field2210[3][arg0][arg1] = null;
    }
}
