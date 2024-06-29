import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class163 extends class273 {

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    private int field2648 = 4;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "Z")
    private boolean field2655 = true;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    private int field2645 = 4;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field2646 = 4;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    private int field2651 = 1638;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    private int field2661 = 0;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "[B")
    private byte[] field2644 = new byte[512];

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "Lsb;")
    public static class124 field2663;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field2664;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "[S")
    private short[] field2650;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "[S")
    private short[] field2657;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1172(int arg0, int arg1, int arg2, int arg3) {
        if (!class279.method1873(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class285.method1912(var4 + 1, class21.field327[arg0][arg1][arg2] + arg3, var5 + 1) && class285.method1912(var4 + 128 - 1, class21.field327[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class285.method1912(var4 + 128 - 1, class21.field327[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class285.method1912(var4 + 1, class21.field327[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method1173(int arg0, int arg1) {
        class281.field4457 = new int[arg0];
        class266.field4246 = new int[arg0];
        class19.field299 = new int[arg0];
        class167.field2752 = new int[arg0];
        ++field2647;
        class25.field423 = new int[arg0];
        if (arg1 <= 42) {
            field2663 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field2662;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2645 = arg0.method1012(arg2 ^ 1);
                                }
                            } else {
                                this.field2646 = arg0.method1012(4);
                            }
                        } else {
                            this.field2661 = arg0.method1012(4);
                        }
                    } else {
                        this.field2646 = this.field2645 = arg0.method1012(arg2 + -1);
                    }
                } else {
                    this.field2651 = arg0.method1027((byte) 64);
                    if (this.field2651 < 0) {
                        this.field2650 = new short[this.field2648];
                        for (int var5 = 0; ~this.field2648 < ~var5; ++var5) {
                            this.field2650[var5] = (short) arg0.method1027((byte) 64);
                        }
                    }
                }
            } else {
                this.field2648 = arg0.method1012(4);
            }
        } else {
            this.field2655 = ~arg0.method1012(4) == -2;
        }
        if (arg2 != 5) {
            this.field2650 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V")
    private final void method1174(boolean arg0) {
        ++field2649;
        if (arg0) {
            this.method2((class136) null, -4, -100);
        }
        if (~this.field2651 < -1) {
            this.field2650 = new short[this.field2648];
            this.field2657 = new short[this.field2648];
            for (int var2 = 0; ~var2 > ~this.field2648; ++var2) {
                this.field2650[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2651 / 4096.0F), (double) var2)));
                this.field2657[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2650 != null && ~this.field2650.length == ~this.field2648) {
            this.field2657 = new short[this.field2648];
            for (int var3 = 0; ~this.field2648 < ~var3; ++var3) {
                this.field2657[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(Z)V")
    public static void method1175(boolean arg0) {
        if (!arg0) {
            field2663 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)I")
    private final int method1176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2659;
        int var8 = arg4 - 4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 4095;
        int var11 = var10 - 4096;
        int var12 = var9 + 1;
        if (arg2 > -77) {
            field2643 = -65;
        }
        int var13 = var9 & 255;
        int var14 = this.field2644[arg6 + var13] & 3;
        int var15 = class9.field104[var10];
        int var16;
        if (~var14 >= -2) {
            var16 = ~var14 == -1 ? var10 - -arg4 : -var10 + arg4;
        } else {
            var16 = var14 == 2 ? -arg4 + var10 : -arg4 + -var10;
        }
        if (var12 >= arg5) {
            var12 = 0;
        }
        int var17 = var12 & 255;
        int var18 = this.field2644[var17 - -arg6] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg4 + -var11 : -arg4 + var11;
        } else {
            var19 = var18 == 0 ? arg4 + var11 : arg4 - var11;
        }
        int var20 = this.field2644[arg1 + var13] & 3;
        int var21 = ((-var16 + var19) * var15 >> 12) + var16;
        int var22;
        if (~var20 >= -2) {
            var22 = var20 != 0 ? -var10 + var8 : var8 + var10;
        } else {
            var22 = ~var20 != -3 ? -var8 + -var10 : -var8 + var10;
        }
        int var23 = this.field2644[arg1 + var17] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var8 + var11 : -var11 + var8;
        } else {
            var24 = ~var23 != -3 ? -var8 + -var11 : -var8 + var11;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
    public static final void method1177(byte arg0) {
        ++field2658;
        try {
            Method var1 = (field2664 != null ? field2664 : (field2664 = method1180("java.lang.Runtime"))).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class269.field4324 = 1 + (int) (var3 / 1048576L);
                } catch (Throwable var4) {
                }
            }
            if (arg0 >= -115) {
                method1175(false);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIII)V")
    public static final void method1178(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2660;
        class224.method1504(arg1, arg4 - -arg2, arg4 - arg2, class114.field1841[arg3], arg0 + 57);
        if (arg0 == -50) {
            int var5 = 0;
            int var6 = arg2;
            int var7 = -1;
            int var8 = -arg2;
            while (~var6 < ~var5) {
                ++var5;
                var7 += 2;
                var8 += var7;
                if (~var8 <= -1) {
                    --var6;
                    var8 -= var6 << 1;
                    int[] var9 = class114.field1841[arg3 + var6];
                    int[] var10 = class114.field1841[-var6 + arg3];
                    int var11 = arg4 + var5;
                    int var12 = -var5 + arg4;
                    class224.method1504(arg1, var11, var12, var9, 7);
                    class224.method1504(arg1, var11, var12, var10, arg0 + 57);
                }
                int var13 = arg4 + var6;
                int var14 = -var6 + arg4;
                int[] var15 = class114.field1841[-var5 + arg3];
                int[] var16 = class114.field1841[arg3 - -var5];
                class224.method1504(arg1, var13, var14, var16, 7);
                class224.method1504(arg1, var13, var14, var15, 7);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field2653;
        if (arg0) {
            this.field2651 = -64;
        }
        int[] var3 = super.field4359.method387((byte) -75, arg1);
        if (super.field4359.field833) {
            this.method1179(-15952, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[II)V")
    private final void method1179(int arg0, int[] arg1, int arg2) {
        ++field2654;
        int var4 = class255.field4068[arg2] * this.field2645;
        if (arg0 == -15952) {
            if (~this.field2648 == -2) {
                int var5 = this.field2657[0] << 12;
                short var6 = this.field2650[0];
                int var7 = this.field2645 * var5 >> 12;
                int var8 = this.field2646 * var5 >> 12;
                int var9 = var4 * var5 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                if (~var7 >= ~var11) {
                    var11 = 0;
                }
                int var12 = this.field2644[255 & var11] & 255;
                int var13 = 255 & this.field2644[var10 & 255];
                int var14 = var9 & 4095;
                int var15 = class9.field104[var14];
                if (!this.field2655) {
                    for (int var16 = 0; class26.field458 > var16; ++var16) {
                        int var17 = class265.field4234[var16] * this.field2646;
                        int var18 = this.method1176(var5 * var17 >> 12, var12, -128, var15, var14, var8, var13);
                        arg1[var16] = var6 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; ~var19 > ~class26.field458; ++var19) {
                        int var20 = class265.field4234[var19] * this.field2646;
                        int var21 = this.method1176(var5 * var20 >> 12, var12, arg0 + 15844, var15, var14, var8, var13);
                        int var22 = var6 * var21 >> 12;
                        arg1[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field2650[0];
                if (var23 > 8 || ~var23 > 7) {
                    int var24 = this.field2657[0] << 12;
                    int var25 = this.field2645 * var24 >> 12;
                    int var26 = this.field2646 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var28 - -1;
                    if (var25 <= var29) {
                        var29 = 0;
                    }
                    int var30 = 255 & this.field2644[255 & var29];
                    int var31 = this.field2644[255 & var28] & 255;
                    int var32 = var27 & 4095;
                    int var33 = class9.field104[var32];
                    for (int var34 = 0; class26.field458 > var34; ++var34) {
                        int var54 = class265.field4234[var34] * this.field2646;
                        int var55 = this.method1176(var24 * var54 >> 12, var30, arg0 + 15832, var33, var32, var26, var31);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; var35 < this.field2648; ++var35) {
                    short var36 = this.field2650[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field2657[var35] << 12;
                        int var38 = this.field2646 * var37 >> 12;
                        int var39 = this.field2645 * var37 >> 12;
                        int var40 = var4 * var37 >> 12;
                        int var41 = var40 >> 12;
                        int var42 = 255 & this.field2644[255 & var41];
                        int var43 = var41 - -1;
                        int var44 = var40 & 4095;
                        int var45 = class9.field104[var44];
                        if (var43 >= var39) {
                            var43 = 0;
                        }
                        int var46 = this.field2644[255 & var43] & 255;
                        if (this.field2655 && this.field2648 - 1 == var35) {
                            for (int var47 = 0; ~var47 > ~class26.field458; ++var47) {
                                int var48 = class265.field4234[var47] * this.field2646;
                                int var49 = this.method1176(var37 * var48 >> 12, var46, -78, var45, var44, var38, var42);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; var51 < class26.field458; ++var51) {
                                int var52 = class265.field4234[var51] * this.field2646;
                                int var53 = this.method1176(var37 * var52 >> 12, var46, -96, var45, var44, var38, var42);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.field2644 = class154.method1113(85, this.field2661);
        this.method1174(false);
        for (int var2 = this.field2648 + -1; var2 >= 1; --var2) {
            short var3 = this.field2650[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field2648;
        }
        if (arg0 > -94) {
            method1175(false);
        }
        ++field2652;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1180(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
