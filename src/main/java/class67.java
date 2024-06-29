import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.FocusListener;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class67 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field1030 = -1;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field1029 = new String[8];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lho;")
    public static class215 field1026;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field1028;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 21)
    public static void method658(int arg0) {
        field1029 = null;
        field1028 = null;
        if (arg0 <= 54) {
            field1028 = (Frame) null;
        }
        field1026 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/util/Random;Z)I", line = 38)
    public static final int method659(int arg0, Random arg1, boolean arg2) {
        if (!arg2) {
            return 115;
        }
        field1023++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class199.method1499(arg0, (byte) -119)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class321.method2268((byte) 107, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILsd;II)V", line = 102)
    public static final void method660(int arg0, class244 arg1, int arg2, int arg3) {
        field1025++;
        if (arg2 != 2948) {
            method660(40, (class244) null, -15, 69);
        }
        if (arg1.field1343 == arg3 && arg3 != -1) {
            class93 var4 = class126.method1091((byte) 13, arg3);
            int var5 = var4.field1405;
            if (var5 == 1) {
                arg1.field1369 = 0;
                arg1.field1329 = 0;
                arg1.field1332 = 0;
                arg1.field1302 = arg0;
                arg1.field1310 = 1;
                class335.method2358(arg1.field1359, arg1.field1329, var4, false, arg1.field1286, true);
            }
            if (var5 == 2) {
                arg1.field1332 = 0;
            }
        } else if (arg3 == -1 || arg1.field1343 == -1 || class126.method1091((byte) 88, arg3).field1423 >= class126.method1091((byte) 9, arg1.field1343).field1423) {
            arg1.field1343 = arg3;
            arg1.field1302 = arg0;
            arg1.field1310 = 1;
            arg1.field1329 = 0;
            arg1.field1369 = 0;
            arg1.field1332 = 0;
            arg1.field1294 = arg1.field1321;
            if (arg1.field1343 != -1) {
                class335.method2358(arg1.field1359, arg1.field1329, class126.method1091((byte) 77, arg1.field1343), false, arg1.field1286, true);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILrn;B)[Lho;", line = 173)
    public static final class215[] method661(int arg0, int arg1, class18 arg2, byte arg3) {
        field1033++;
        if (class282.method2056(arg0, 0, arg2, arg1)) {
            return arg3 == 95 ? class91.method822(true) : (class215[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 196)
    public static final void method662(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field1021++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class61.field939 : class104.field1575) + var6;
        if (arg0 > -42) {
            method663(-115, 108, 3, true, -13, 23, 30, -92);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class119 var9 = class359.method2520(var8, (byte) 99);
            if (var9.field1825 && var9.method1018(100).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class123.field1970 = null;
                    class29.field468 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class81.field1177 = 0;
        class29.field468 = var5;
        String[] var12 = new String[class29.field468];
        class123.field1970 = var4;
        for (int var13 = 0; var13 < class29.field468; var13++) {
            var12[var13] = class359.method2520(var4[var13], (byte) -125).method1018(65);
        }
        class233.method1748(var12, (byte) 101, class123.field1970);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZIIII)V", line = 271)
    public static final void method663(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0;
        field1032++;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5 - arg4;
        int var12 = arg0 - arg4;
        int var13 = arg5 * arg5;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var16 << 1;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = arg0 << 1;
        int var21 = (1 - var20) * var13 + var18;
        int var22 = var12 << 1;
        int var23 = var13 << 1;
        int var24 = (1 - var22) * var15 + var17;
        if (!arg3) {
            return;
        }
        int var25 = var14 - ((var20 - 1) * var23);
        int var26 = var13 << 2;
        int var27 = var15 << 2;
        int var28 = var16 - ((var22 - 1) * var19);
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = (var20 - 3) * var23;
        int var32 = var18 * 3;
        int var33 = var17 * 3;
        int var34 = var29;
        int var35 = (arg0 - 1) * var26;
        int var36 = var30;
        int var37 = (var22 - 3) * var19;
        if (class328.field5042 <= arg7 && arg7 <= class284.field4385) {
            int[] var38 = class133.field2235[arg7];
            int var39 = class268.method1965(arg2 - arg5, class128.field2130, class43.field693, -67);
            int var40 = class268.method1965(arg2 + arg5, class128.field2130, class43.field693, -71);
            int var41 = class268.method1965(arg2 - var11, class128.field2130, class43.field693, -81);
            int var42 = class268.method1965(arg2 + var11, class128.field2130, class43.field693, -128);
            class283.method2059(arg1, var38, (byte) 109, var41, var39);
            class283.method2059(arg6, var38, (byte) 102, var42, var41);
            class283.method2059(arg1, var38, (byte) 121, var40, var42);
        }
        int var43 = (var12 - 1) * var27;
        while (var8 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var10++;
                    var21 += var32;
                    var32 += var29;
                    var25 += var34;
                    var34 += var29;
                }
            }
            if (var25 < 0) {
                var10++;
                var25 += var34;
                var21 += var32;
                var32 += var29;
                var34 += var29;
            }
            var21 += -var35;
            var25 += -var31;
            var31 -= var26;
            var35 -= var26;
            boolean var44 = var8 <= var12;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var28 += var36;
                        var9++;
                        var36 += var30;
                        var24 += var33;
                        var33 += var30;
                    }
                }
                if (var28 < 0) {
                    var9++;
                    var28 += var36;
                    var24 += var33;
                    var36 += var30;
                    var33 += var30;
                }
                var28 += -var37;
                var24 += -var43;
                var37 -= var27;
                var43 -= var27;
            }
            var8--;
            int var45 = arg7 - var8;
            int var46 = arg7 + var8;
            if (var46 >= class328.field5042 && var45 <= class284.field4385) {
                int var47 = class268.method1965(arg2 + var10, class128.field2130, class43.field693, -79);
                int var48 = class268.method1965(arg2 - var10, class128.field2130, class43.field693, -52);
                if (var44) {
                    int var49 = class268.method1965(arg2 + var9, class128.field2130, class43.field693, -110);
                    int var50 = class268.method1965(arg2 - var9, class128.field2130, class43.field693, -81);
                    if (var45 >= class328.field5042) {
                        int[] var51 = class133.field2235[var45];
                        class283.method2059(arg1, var51, (byte) 90, var50, var48);
                        class283.method2059(arg6, var51, (byte) 121, var49, var50);
                        class283.method2059(arg1, var51, (byte) 89, var47, var49);
                    }
                    if (var46 <= class284.field4385) {
                        int[] var52 = class133.field2235[var46];
                        class283.method2059(arg1, var52, (byte) 113, var50, var48);
                        class283.method2059(arg6, var52, (byte) 115, var49, var50);
                        class283.method2059(arg1, var52, (byte) 124, var47, var49);
                    }
                } else {
                    if (var45 >= class328.field5042) {
                        class283.method2059(arg1, class133.field2235[var45], (byte) 88, var47, var48);
                    }
                    if (class284.field4385 >= var46) {
                        class283.method2059(arg1, class133.field2235[var46], (byte) 125, var47, var48);
                    }
                }
            }
        }
    }
}
