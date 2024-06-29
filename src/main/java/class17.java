import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class17 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lcc;")
    public static class327 field205 = new class327(16);

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
    public static boolean field209 = false;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lfh;")
    public static class140 field213;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "[[S")
    public static short[][] field211;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B", line = 6)
    public static final synchronized byte[] method121(int arg0, int arg1) {
        field206++;
        if (arg1 == 100 && class227.field3258 > 0) {
            byte[] var2 = class313.field4597[--class227.field3258];
            class313.field4597[class227.field3258] = null;
            return var2;
        }
        if (arg0 < 88) {
            method122(-126);
        }
        if (arg1 == 5000 && class311.field4571 > 0) {
            byte[] var3 = class48.field640[--class311.field4571];
            class48.field640[class311.field4571] = null;
            return var3;
        } else if (arg1 == 30000 && class67.field861 > 0) {
            byte[] var4 = class341.field5320[--class67.field861];
            class341.field5320[class67.field861] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 47)
    public static void method122(int arg0) {
        field211 = (short[][]) null;
        field213 = null;
        if (arg0 == 30000) {
            field205 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V", line = 69)
    public static final void method123(int arg0, int arg1) {
        field207++;
        if (arg0 != 2260) {
            field210 = 84;
        }
        class255.field3729.method2264((byte) 68, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIII)V", line = 91)
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg3 - arg7;
        int var10 = arg3;
        int var11 = 0;
        int var12 = arg6 - arg7;
        int var13 = arg6 * arg6;
        field212++;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = var9 * var9;
        int var18 = var13 << 1;
        int var19 = var17 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var9 << 1;
        int var23 = (1 - var21) * var13 + var16;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var13 << 2;
        if (arg5 != -10391) {
            return;
        }
        int var27 = var17 - ((var22 - 1) * var20);
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = var19 * 3;
        int var33 = (var21 - 3) * var18;
        int var34 = var28;
        int var35 = (var22 - 3) * var20;
        int var36 = (arg3 - 1) * var26;
        int var37 = var30;
        int var38 = (var9 - 1) * var29;
        if (arg4 >= class207.field2937 && class25.field292 >= arg4) {
            int[] var39 = class331.field4902[arg4];
            int var40 = class289.method1984(class245.field3574, arg2 - arg6, arg5 ^ 0xFFFFD768, class321.field4722);
            int var41 = class289.method1984(class245.field3574, arg2 + arg6, 1, class321.field4722);
            int var42 = class289.method1984(class245.field3574, arg2 - var12, 1, class321.field4722);
            int var43 = class289.method1984(class245.field3574, arg2 + var12, arg5 ^ 0xFFFFD768, class321.field4722);
            class96.method697((byte) 115, var39, arg1, var40, var42);
            class96.method697((byte) 115, var39, arg0, var42, var43);
            class96.method697((byte) 115, var39, arg1, var43, var41);
        }
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var24 += var34;
                    var34 += var28;
                }
            }
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var31 += var28;
                var24 += var34;
                var34 += var28;
            }
            boolean var44 = var9 >= var10;
            var24 += -var33;
            var10--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var27 += var37;
                        var32 += var30;
                        var37 += var30;
                        var11++;
                    }
                }
                if (var27 < 0) {
                    var25 += var32;
                    var32 += var30;
                    var27 += var37;
                    var37 += var30;
                    var11++;
                }
                var27 += -var35;
                var35 -= var29;
                var25 += -var38;
                var38 -= var29;
            }
            var23 += -var36;
            int var45 = arg4 + var10;
            int var46 = arg4 - var10;
            var36 -= var26;
            var33 -= var26;
            if (var45 >= class207.field2937 && class25.field292 >= var46) {
                int var47 = class289.method1984(class245.field3574, arg2 + var8, 1, class321.field4722);
                int var48 = class289.method1984(class245.field3574, arg2 - var8, 1, class321.field4722);
                if (var44) {
                    int var49 = class289.method1984(class245.field3574, arg2 + var11, 1, class321.field4722);
                    int var50 = class289.method1984(class245.field3574, arg2 - var11, 1, class321.field4722);
                    if (class207.field2937 <= var46) {
                        int[] var51 = class331.field4902[var46];
                        class96.method697((byte) 115, var51, arg1, var48, var50);
                        class96.method697((byte) 115, var51, arg0, var50, var49);
                        class96.method697((byte) 115, var51, arg1, var49, var47);
                    }
                    if (class25.field292 >= var45) {
                        int[] var52 = class331.field4902[var45];
                        class96.method697((byte) 115, var52, arg1, var48, var50);
                        class96.method697((byte) 115, var52, arg0, var50, var49);
                        class96.method697((byte) 115, var52, arg1, var49, var47);
                    }
                } else {
                    if (var46 >= class207.field2937) {
                        class96.method697((byte) 115, class331.field4902[var46], arg1, var48, var47);
                    }
                    if (class25.field292 >= var45) {
                        class96.method697((byte) 115, class331.field4902[var45], arg1, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZII)V", line = 294)
    public static final void method125(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method121(-15, -78);
        }
        field208++;
        if ((arg4 - arg0) >= class245.field3574 && class321.field4722 >= arg0 + arg4 && arg3 - arg0 >= class207.field2937 && (arg0 + arg3) <= class25.field292) {
            class8.method42(arg3, false, arg4, arg0, arg1);
        } else {
            class296.method2027(arg3, arg4, arg0, arg1, -127);
        }
    }
}
