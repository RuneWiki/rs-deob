import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class149 extends class326 {

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    private int field2333 = 0;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    private int field2334 = 16;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    private int field2339 = 2000;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    private int field2343 = 4096;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field2331 = -1;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2336 = "Loading config - ";

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Lhg;", line = 5)
    public static final class316 method1092(byte arg0, int arg1) {
        class316 var2 = (class316) class197.field3154.method1351((long) arg1, 63);
        field2341++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field1928.method1813(class343.method2374(arg1, (byte) 120), class258.method1863(arg1, 685159436), true);
        class316 var4 = new class316();
        var4.field4952 = arg1;
        if (var3 != null) {
            var4.method2221(new class6(var3), 86);
        }
        var4.method2215((byte) -80);
        if (var4.field4996 != -1) {
            var4.method2206((byte) 114, method1092((byte) -104, var4.field4958), method1092((byte) -104, var4.field4996));
        }
        if (var4.field4947 != -1) {
            var4.method2207(arg0 ^ 0xFFFF927B, method1092((byte) -104, var4.field4947), method1092((byte) -104, var4.field4956));
        }
        if (!class134.field1971 && var4.field4990) {
            var4.field4984 = 0;
            var4.field4988 = class246.field3856;
            var4.field4978 = false;
            var4.field4968 = class297.field4585;
            var4.field4969 = class329.field5152;
        }
        if (arg0 == -104) {
            class197.field3154.method1347(var4, (long) arg1, (byte) -97);
            return var4;
        } else {
            return (class316) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 48)
    public class149() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I", line = 63)
    public final int[] method103(int arg0, int arg1) {
        field2340++;
        if (arg0 > -25) {
            this.field2337 = 72;
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = this.field2343 >> 1;
            int[][] var5 = this.field5112.method1650((byte) -68);
            Random var6 = new Random((long) this.field2333);
            for (int var7 = 0; var7 < this.field2339; var7++) {
                int var8 = this.field2343 > 0 ? this.field2337 + class207.method1523(this.field2343, -127, var6) - var4 : this.field2337;
                int var9 = class207.method1523(class166.field2731, -120, var6);
                int var10 = (var8 & 0xFFF) >> 4;
                int var11 = class207.method1523(class302.field4637, -103, var6);
                int var12 = var9 + (class282.field4363[var10] * this.field2334 >> 12);
                int var13 = var12 - var9;
                int var14 = (class333.field5184[var10] * this.field2334 >> 12) + var11;
                int var15 = var14 - var11;
                if (var13 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var15 > var13;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        int var20 = var11;
                        var9 = var12;
                        var11 = var14;
                        var14 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var9;
                    int var23 = 2048 / var22;
                    int var24 = var14 - var11;
                    int var25 = -var22 / 2;
                    int var26 = 1024 - (class207.method1523(4096, -107, var6) >> 2);
                    int var27 = var11 >= var14 ? -1 : 1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    for (int var28 = var9; var28 < var12; var28++) {
                        var25 += var24;
                        int var29 = var28 & class215.field3397;
                        int var30 = (var28 - var9) * var23 + var26 + 1024;
                        int var31 = var21 & class29.field427;
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZLvl;)V", line = 195)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field2335++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field2333 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field2339 = arg2.method39((byte) 87);
        } else if (arg0 == 2) {
            this.field2334 = arg2.method58(-288140008);
        } else if (arg0 == 3) {
            this.field2337 = arg2.method39((byte) 100);
        } else if (arg0 == 4) {
            this.field2343 = arg2.method39((byte) 72);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)V", line = 254)
    public static final void method1093(int arg0, byte arg1) {
        field2342++;
        if (arg1 != 11) {
            field2331 = -43;
        }
        for (class287 var2 = class282.field4361.method2174(256); var2 != null; var2 = class282.field4361.method2164((byte) 103)) {
            if (((long) arg0) == (var2.field4430 >> 48 & 0xFFFFL)) {
                var2.method2028(13329);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIBIIIII)V", line = 276)
    public static final void method1094(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2332++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg3 - arg1;
        int var12 = arg0 - arg1;
        int var13 = arg3 * arg3;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var13 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var14 - ((var21 - 1) * var20);
        int var24 = var12 << 1;
        int var25 = (1 - var24) * var15 + var18;
        int var26 = var16 - ((var24 - 1) * var19);
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var21 - 3) * var20;
        int var33 = (var24 - 3) * var19;
        int var34 = var18 * 3;
        int var35 = var29;
        int var36 = var31;
        int var37 = (arg0 - 1) * var27;
        int var38 = (var12 - 1) * var28;
        int[] var39 = class284.field4402[arg7];
        class256.method1853(var39, arg5 - arg3, arg6, arg5 - var11, 0);
        if (arg2 != 97) {
            method1093(86, (byte) 87);
        }
        class256.method1853(var39, arg5 - var11, arg4, arg5 + var11, arg2 + -97);
        class256.method1853(var39, arg5 + var11, arg6, arg3 + arg5, 0);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var10++;
                    var22 += var30;
                    var30 += var29;
                    var23 += var35;
                    var35 += var29;
                }
            }
            if (var23 < 0) {
                var10++;
                var23 += var35;
                var22 += var30;
                var30 += var29;
                var35 += var29;
            }
            var23 += -var32;
            var22 += -var37;
            var32 -= var27;
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var8++;
                        var25 += var34;
                        var26 += var36;
                        var34 += var31;
                        var36 += var31;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var36 += var31;
                    var25 += var34;
                    var34 += var31;
                    var8++;
                }
                var26 += -var33;
                var25 += -var38;
                var38 -= var28;
                var33 -= var28;
            }
            var37 -= var27;
            var9--;
            int var41 = arg7 + var9;
            int var42 = arg5 + var10;
            int var43 = arg7 - var9;
            int var44 = arg5 - var10;
            if (var40) {
                int var45 = arg5 + var8;
                int var46 = arg5 - var8;
                class256.method1853(class284.field4402[var43], var44, arg6, var46, arg2 - 97);
                class256.method1853(class284.field4402[var43], var46, arg4, var45, 0);
                class256.method1853(class284.field4402[var43], var45, arg6, var42, 0);
                class256.method1853(class284.field4402[var41], var44, arg6, var46, 0);
                class256.method1853(class284.field4402[var41], var46, arg4, var45, 0);
                class256.method1853(class284.field4402[var41], var45, arg6, var42, 0);
            } else {
                class256.method1853(class284.field4402[var43], var44, arg6, var42, 0);
                class256.method1853(class284.field4402[var41], var44, arg6, var42, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 446)
    public final void method99(byte arg0) {
        class59.method480(true);
        if (arg0 != 31) {
            method1095((byte) -61);
        }
        field2338++;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)V", line = 475)
    public static void method1095(byte arg0) {
        field2336 = null;
        if (arg0 != 53) {
            method1094(-33, -116, (byte) 85, 91, -114, 55, -124, -41);
        }
    }
}
