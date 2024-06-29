import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class205 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public static int[] field2964 = new int[200];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Z")
    public static boolean field2961 = false;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2968;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII[IZI[IIIIIIILbi;)I", line = 5)
    public static final int method1291(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class138 arg14) {
        field2954++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                client.field3689[var15][var35] = 0;
                class293.field4243[var15][var35] = 99999999;
            }
        }
        if (arg6 != -12757) {
            return -104;
        }
        boolean var16;
        if (arg9 == 1) {
            var16 = class84.method523(arg11, arg14, arg3, arg0, arg10, arg13, arg12, arg2, arg8, arg1, (byte) 101);
        } else if (arg9 == 2) {
            var16 = class265.method1714(arg12, arg14, arg11, arg2, 1, arg0, arg1, arg8, arg13, arg10, arg3);
        } else {
            var16 = class116.method811(arg13, arg9, arg8, arg10, arg3, arg11, arg0, arg1, arg12, arg2, -1, arg14);
        }
        int var17 = arg2 - 64;
        int var18 = arg0 - 64;
        int var19 = class93.field1280;
        int var20 = class88.field1225;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= (arg12 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class293.field4243[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg12 > var24) {
                            var28 = arg12 - var24;
                        } else if (arg12 + arg13 - 1 < var24) {
                            var28 = var24 + 1 - arg13 - arg12;
                        }
                        int var29 = 0;
                        if (arg10 > var25) {
                            var29 = arg10 - var25;
                        } else if ((arg10 - (1 - arg8)) < var25) {
                            var29 = var25 + 1 - arg8 - arg10;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class293.field4243[var26][var27] < var22) {
                            var20 = var25;
                            var22 = class293.field4243[var26][var27];
                            var19 = var24;
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg2 == var19 && arg0 == var20) {
            return 0;
        }
        byte var31 = 0;
        class449.field6563[var31] = var19;
        int var37 = var31 + 1;
        class180.field2371[var31] = var20;
        int var32;
        int var33 = var32 = client.field3689[var19 - var17][var20 - var18];
        while (arg2 != var19 || arg0 != var20) {
            if (var32 != var33) {
                class449.field6563[var37] = var19;
                var32 = var33;
                class180.field2371[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = client.field3689[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg4[var34] = class449.field6563[var37];
            arg7[var34++] = class180.field2371[var37];
            if (var34 >= arg4.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 184)
    public static void method1292(boolean arg0) {
        field2964 = null;
        if (arg0) {
            method1296(-57, (Random) null, -34);
        }
        field2968 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Ln;", line = 195)
    public final class25 method1293(boolean arg0) {
        field2960++;
        if (arg0) {
            method1292(false);
        }
        class25 var2 = (class25) class327.field4700.method209(127, (long) this.field2963);
        if (var2 != null) {
            return var2;
        }
        class25 var3 = class25.method225(class95.field1318, this.field2963, 0);
        if (var3 != null) {
            class327.field4700.method202(true, var3, (long) this.field2963);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLil;)V", line = 218)
    public final void method1294(int arg0, boolean arg1, class265 arg2) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1697(71);
            if (var4 == 0) {
                field2958++;
                return;
            }
            this.method1299(arg2, var4, !arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V", line = 239)
    public static final void method1295(int arg0, int arg1, int arg2, int arg3) {
        class10 var4 = class343.field5032[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class164 var5 = var4.field123;
        class164 var6 = var4.field102;
        if (var5 != null) {
            var5.field2133 = var5.field2133 * arg3 / 16;
            var5.field2127 = var5.field2127 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field2133 = var6.field2133 * arg3 / 16;
            var6.field2127 = var6.field2127 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 261)
    public static final int method1296(int arg0, Random arg1, int arg2) {
        field2965++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class167.method1040(false, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else if (arg0 == 2044605728) {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class363.method2379((byte) 21, arg2, var4);
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 296)
    public static final void method1297(int arg0) {
        class52.field762.method212(-128);
        if (arg0 != 0) {
            method1301((byte) 16);
        }
        field2957++;
        class220.field3136.method212(-118);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 308)
    public static final void method1298(int arg0) {
        if (arg0 <= 9) {
            field2966 = -53;
        }
        field2956++;
        class24 var1 = class353.field5183;
        synchronized (class353.field5183) {
            class353.field5183.method212(-79);
        }
        class24 var2 = class280.field4116;
        synchronized (class280.field4116) {
            class280.field4116.method212(-123);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lil;IZI)V", line = 324)
    private final void method1299(class265 arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 == 1) {
            this.field2963 = arg0.method1685(8104);
        } else if (arg1 == 2) {
            this.field2969 = arg0.method1697(63);
            this.field2967 = arg0.method1697(77);
        }
        if (arg2) {
            method1298(-115);
        }
        field2959++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIII)V", line = 348)
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2955++;
        int var10 = 10 % ((-arg1 - 32) / 55);
        if (class126.method864((byte) -92, arg9)) {
            client.method1576(class119.field1607[arg9], -1, arg3, arg0, arg7, arg5, arg4, arg2, arg8, arg6);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 371)
    public static final void method1301(byte arg0) {
        int var1 = -117 % ((74 - arg0) / 45);
        field2962++;
        class232.field3271.method204((byte) 56);
    }
}
