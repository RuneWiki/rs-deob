import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class class343 extends class308 {

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "[Ldb;")
    public static class146[] field5514 = new class146[14];

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field5509 = 2;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field5515 = 0;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field5513 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "F")
    public static float field5517;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)V", line = 5)
    public static final void method2418(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -126) {
            method2424(96, -40);
        }
        field5518++;
        if (class341.field5494 <= arg1 && arg1 <= class196.field3001) {
            int var5 = class34.method288(arg2 ^ 0xFFFFFF81, arg4, class33.field505, class278.field4586);
            int var6 = class34.method288(3, arg0, class33.field505, class278.field4586);
            class153.method1102(arg3, -3911, var5, arg1, var6);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 27)
    public static void method2419(boolean arg0) {
        if (arg0) {
            field5515 = -72;
        }
        field5514 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLnm;)I", line = 37)
    public static final int method2420(byte arg0, class221 arg1) {
        if (arg0 != 109) {
            method2422(108, (byte) -123);
        }
        field5511++;
        int var2 = 0;
        if (arg1.method1519(false, class290.field4819)) {
            var2++;
        }
        if (arg1.method1519(false, class341.field5502)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIBIII)V", line = 59)
    public static final void method2421(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class251.method1789(arg6, (byte) 26);
        field5510++;
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg6;
        int var10 = -var8;
        int var11 = arg6;
        int var12 = var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg1 - var8;
        int[] var16 = class306.field4998[arg4];
        class270.method1906(arg5, var15, arg1 - arg6, var16, 116);
        int var17 = arg1 + var8;
        class270.method1906(arg2, var17, var15, var16, 123);
        class270.method1906(arg5, arg1 + arg6, var17, var16, 122);
        if (arg3 <= 93) {
            method2418(-75, 85, (byte) -65, 56, -39);
        }
        while (var7 < var11) {
            var14 += 2;
            var13 += 2;
            var10 += var14;
            var9 += var13;
            if (var10 >= 0 && var12 >= 1) {
                class216.field3338[var12] = var7;
                var12--;
                var10 -= var12 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var11--;
                if (var8 > var11) {
                    int[] var18 = class306.field4998[arg4 - var11];
                    int var19 = arg1 + var7;
                    int var20 = class216.field3338[var11];
                    int var21 = arg1 - var7;
                    int[] var22 = class306.field4998[arg4 + var11];
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class270.method1906(arg5, var24, var21, var22, 122);
                    class270.method1906(arg2, var23, var24, var22, 123);
                    class270.method1906(arg5, var19, var23, var22, 117);
                    class270.method1906(arg5, var24, var21, var18, 117);
                    class270.method1906(arg2, var23, var24, var18, 124);
                    class270.method1906(arg5, var19, var23, var18, 126);
                } else {
                    int[] var25 = class306.field4998[arg4 + var11];
                    int[] var26 = class306.field4998[arg4 - var11];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class270.method1906(arg5, var27, var28, var25, 121);
                    class270.method1906(arg5, var27, var28, var26, 127);
                }
                var9 -= var11 << 1;
            }
            int[] var29 = class306.field4998[arg4 + var7];
            int[] var30 = class306.field4998[arg4 - var7];
            int var31 = arg1 - var11;
            int var32 = arg1 + var11;
            if (var7 >= var8) {
                class270.method1906(arg5, var32, var31, var29, 124);
                class270.method1906(arg5, var32, var31, var30, 121);
            } else {
                int var33 = var7 <= var12 ? var12 : class216.field3338[var7];
                int var34 = arg1 - var33;
                int var35 = arg1 + var33;
                class270.method1906(arg5, var34, var31, var29, 119);
                class270.method1906(arg2, var35, var34, var29, 119);
                class270.method1906(arg5, var32, var35, var29, 123);
                class270.method1906(arg5, var34, var31, var30, 124);
                class270.method1906(arg2, var35, var34, var30, 119);
                class270.method1906(arg5, var32, var35, var30, 127);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IB)V", line = 192)
    public static final void method2422(int arg0, byte arg1) {
        if (arg1 >= -24) {
            method2418(119, -63, (byte) -38, -61, -33);
        }
        if (arg0 == 37) {
            class88.field1264 = 3.0F;
        } else if (arg0 == 50) {
            class88.field1264 = 4.0F;
        } else if (arg0 == 75) {
            class88.field1264 = 6.0F;
        } else if (arg0 == 100) {
            class88.field1264 = 8.0F;
        } else if (arg0 == 200) {
            class88.field1264 = 16.0F;
        }
        class179.field2785 = -1;
        field5507++;
        class179.field2785 = -1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V", line = 238)
    public static final void method2423(byte arg0, int arg1) {
        field5512++;
        class211 var2 = class17.method115(9, arg1, 4086);
        if (arg0 != 70) {
            field5509 = 7;
        }
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 265)
    public static final void method2424(int arg0, int arg1) {
        if (arg0 != 37) {
            method2424(124, -108);
        }
        field5508++;
        class211 var2 = class17.method115(11, arg1, 4086);
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method328(int arg0);

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)Z")
    public abstract boolean method329(int arg0);
}
