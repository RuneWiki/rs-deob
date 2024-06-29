import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class324 extends class328 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
    public static int[] field4982 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
    public static int[] field4985 = new int[100];

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
    public static int[] field4989 = new int[1000];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[Lho;")
    public static class215[] field4983;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class6.method42(arg4, arg3 ^ 0xFFFF8C6E);
        field4984++;
        int var7 = 0;
        int var8 = arg4 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = -var8;
        int var12 = var8;
        if (arg3 != -29588) {
            method2298((class317) null, -120, (byte) -113, -15);
        }
        int var13 = -1;
        if (class328.field5042 <= arg5 && arg5 <= class284.field4385) {
            int[] var14 = class133.field2235[arg5];
            int var15 = class268.method1965(arg0 - arg4, class128.field2130, class43.field693, -91);
            int var16 = class268.method1965(arg0 + arg4, class128.field2130, class43.field693, -52);
            int var17 = class268.method1965(arg0 - var8, class128.field2130, class43.field693, -100);
            int var18 = class268.method1965(arg0 + var8, class128.field2130, class43.field693, arg3 + 29520);
            class283.method2059(arg1, var14, (byte) 116, var17, var15);
            class283.method2059(arg2, var14, (byte) 102, var18, var17);
            class283.method2059(arg1, var14, (byte) 112, var16, var18);
        }
        int var19 = -1;
        while (var7 < var10) {
            var19 += 2;
            var13 += 2;
            var11 += var19;
            var9 += var13;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                var11 -= var12 << 1;
                class104.field1571[var12] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var20 = arg5 - var10;
                int var21 = arg5 + var10;
                if (var21 >= class328.field5042 && var20 <= class284.field4385) {
                    if (var8 <= var10) {
                        int var22 = class268.method1965(arg0 + var7, class128.field2130, class43.field693, -93);
                        int var23 = class268.method1965(arg0 - var7, class128.field2130, class43.field693, -97);
                        if (class284.field4385 >= var21) {
                            class283.method2059(arg1, class133.field2235[var21], (byte) 113, var22, var23);
                        }
                        if (class328.field5042 <= var20) {
                            class283.method2059(arg1, class133.field2235[var20], (byte) 127, var22, var23);
                        }
                    } else {
                        int var24 = class104.field1571[var10];
                        int var25 = class268.method1965(arg0 + var7, class128.field2130, class43.field693, -111);
                        int var26 = class268.method1965(arg0 - var7, class128.field2130, class43.field693, -120);
                        int var27 = class268.method1965(arg0 + var24, class128.field2130, class43.field693, arg3 ^ 0x73E9);
                        int var28 = class268.method1965(arg0 - var24, class128.field2130, class43.field693, -68);
                        if (var21 <= class284.field4385) {
                            int[] var29 = class133.field2235[var21];
                            class283.method2059(arg1, var29, (byte) 101, var28, var26);
                            class283.method2059(arg2, var29, (byte) 118, var27, var28);
                            class283.method2059(arg1, var29, (byte) 118, var25, var27);
                        }
                        if (class328.field5042 <= var20) {
                            int[] var30 = class133.field2235[var20];
                            class283.method2059(arg1, var30, (byte) 123, var28, var26);
                            class283.method2059(arg2, var30, (byte) 95, var27, var28);
                            class283.method2059(arg1, var30, (byte) 107, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class328.field5042 <= var32 && var31 <= class284.field4385) {
                int var33 = arg0 + var10;
                int var34 = arg0 - var10;
                if (class43.field693 <= var33 && var34 <= class128.field2130) {
                    int var35 = class268.method1965(var33, class128.field2130, class43.field693, -74);
                    int var36 = class268.method1965(var34, class128.field2130, class43.field693, -89);
                    if (var8 <= var7) {
                        if (var32 <= class284.field4385) {
                            class283.method2059(arg1, class133.field2235[var32], (byte) 121, var35, var36);
                        }
                        if (var31 >= class328.field5042) {
                            class283.method2059(arg1, class133.field2235[var31], (byte) 120, var35, var36);
                        }
                    } else {
                        int var37 = var12 >= var7 ? var12 : class104.field1571[var7];
                        int var38 = class268.method1965(arg0 + var37, class128.field2130, class43.field693, -102);
                        int var39 = class268.method1965(arg0 - var37, class128.field2130, class43.field693, -103);
                        if (class284.field4385 >= var32) {
                            int[] var40 = class133.field2235[var32];
                            class283.method2059(arg1, var40, (byte) 97, var39, var36);
                            class283.method2059(arg2, var40, (byte) 123, var38, var39);
                            class283.method2059(arg1, var40, (byte) 113, var35, var38);
                        }
                        if (var31 >= class328.field5042) {
                            int[] var41 = class133.field2235[var31];
                            class283.method2059(arg1, var41, (byte) 102, var39, var36);
                            class283.method2059(arg2, var41, (byte) 95, var38, var39);
                            class283.method2059(arg1, var41, (byte) 101, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 200)
    public static void method2296(int arg0) {
        field4989 = null;
        field4982 = null;
        field4983 = null;
        field4985 = null;
        if (arg0 != -1) {
            field4982 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 220)
    public static final void method2297(int arg0, boolean arg1) {
        if (arg1) {
            field4988++;
            class138 var2 = class149.method1242(arg0, 0, 2);
            var2.method1152(127);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lfk;IBI)V", line = 240)
    public static final void method2298(class317 arg0, int arg1, byte arg2, int arg3) {
        class128.field2131.method2233(-107);
        field4986++;
        if (class334.field5111) {
            return;
        }
        if (arg2 <= 35) {
            method2297(-22, true);
        }
        for (class22 var4 = (class22) arg0.method2244((byte) -128); var4 != null; var4 = (class22) arg0.method2241(-1)) {
            class181 var5 = class334.method2351(var4.field349, (byte) -44);
            if (class78.method719(8, var5)) {
                class221.method1657(arg1, arg3, var4, var5, -118);
                if (var4.field347) {
                    class87.method784(1, var5, var4);
                }
            }
        }
    }
}
