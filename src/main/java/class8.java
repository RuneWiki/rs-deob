import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class8 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
    public static boolean field120 = false;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public static boolean field122 = true;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[[[B")
    public static byte[][][] field123;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lcn;", line = 13)
    public static final class300 method54(byte arg0, int arg1) {
        field125++;
        if (arg0 != -114) {
            method59(-112);
        }
        class357[] var2 = class327.field4463;
        synchronized (class327.field4463) {
            class300 var3;
            if (class327.field4463.length <= arg1 || class327.field4463[arg1].method2304((byte) 15)) {
                var3 = new class300();
                var3.field4152 = new class38[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4152[var4] = new class38();
                }
            } else {
                var3 = (class300) class327.field4463[arg1].method2312(arg0 - 28614);
                var3.method2552(arg0 + 113);
                int var10002 = class180.field2519[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lab;", line = 46)
    public static final class399 method55(int arg0) {
        field130++;
        class399 var1 = (class399) class103.field1556.method1527((byte) 84);
        if (var1 != null) {
            var1.method2459(198);
            var1.method2788((byte) -118);
            return var1;
        }
        if (arg0 < 47) {
            method54((byte) -125, -110);
        }
        class399 var2;
        do {
            var2 = (class399) class61.field879.method1527((byte) 84);
            if (var2 == null) {
                return null;
            }
            if (var2.method2579((byte) -89) > class224.method1425(-26805)) {
                return null;
            }
            var2.method2459(198);
            var2.method2788((byte) -89);
        } while ((var2.field6446 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 90)
    public static void method56(boolean arg0) {
        field123 = null;
        if (arg0) {
            method56(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 100)
    public static final void method57(int arg0, Component arg1) {
        field128++;
        if (arg0 < 64) {
            method56(true);
        }
        arg1.removeKeyListener(class237.field3228);
        arg1.removeFocusListener(class237.field3228);
        class146.field2122 = -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V", line = 113)
    public static final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field119++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg0;
        int var12 = arg7 - arg0;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        if (arg4 != 1656556993) {
            return;
        }
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        if (class300.field4164 <= arg1 && arg1 <= class398.field5827) {
            int[] var38 = class84.field1286[arg1];
            int var39 = class231.method1452(106, class43.field659, arg6 - arg2, class379.field5397);
            int var40 = class231.method1452(125, class43.field659, arg2 + arg6, class379.field5397);
            int var41 = class231.method1452(86, class43.field659, arg6 - var11, class379.field5397);
            int var42 = class231.method1452(95, class43.field659, arg6 + var11, class379.field5397);
            class73.method486(var39, var38, arg3, 110, var41);
            class73.method486(var41, var38, arg5, 42, var42);
            class73.method486(var42, var38, arg3, 12, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class300.field4164 <= var46 && var45 <= class398.field5827) {
                int var47 = class231.method1452(101, class43.field659, arg6 + var8, class379.field5397);
                int var48 = class231.method1452(92, class43.field659, arg6 - var8, class379.field5397);
                if (var44) {
                    int var49 = class231.method1452(126, class43.field659, arg6 + var10, class379.field5397);
                    int var50 = class231.method1452(94, class43.field659, arg6 - var10, class379.field5397);
                    if (class300.field4164 <= var45) {
                        int[] var51 = class84.field1286[var45];
                        class73.method486(var48, var51, arg3, 75, var50);
                        class73.method486(var50, var51, arg5, -9, var49);
                        class73.method486(var49, var51, arg3, 102, var47);
                    }
                    if (var46 <= class398.field5827) {
                        int[] var52 = class84.field1286[var46];
                        class73.method486(var48, var52, arg3, 77, var50);
                        class73.method486(var50, var52, arg5, -116, var49);
                        class73.method486(var49, var52, arg3, arg4 ^ 0x9D42F246, var47);
                    }
                } else {
                    if (var45 >= class300.field4164) {
                        class73.method486(var48, class84.field1286[var45], arg3, -93, var47);
                    }
                    if (class398.field5827 >= var46) {
                        class73.method486(var48, class84.field1286[var46], arg3, -110, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Z", line = 321)
    public static final boolean method59(int arg0) {
        if (arg0 == 23191) {
            field132++;
            return class67.field1043 != 0 || class204.field2771 >= 2;
        } else {
            return false;
        }
    }
}
