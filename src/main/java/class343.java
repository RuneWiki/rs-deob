import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class343 extends class601 {

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    private int field4201 = 8192;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    private int field4207 = 0;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    private int field4203 = 12288;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    private int field4200 = 0;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "I")
    private int field4209 = 2048;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    private int field4202 = 4096;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    private int field4213 = 2048;

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "[Lis;")
    public static class350[] field4210 = new class350[14];

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!as", name = "U", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!as", name = "V", descriptor = "I")
    public static int field4215;

    // $FF: synthetic field
    @OriginalMember(owner = "client!as", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field4216;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "[[Luc;")
    public static class133[][] field4206;

    // $FF: synthetic method
    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1996(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 167)
    public class343() {
        super(0, true);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lmc;II)V", line = 14)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4201 = arg0.method1553((byte) -126);
                                }
                            } else {
                                this.field4202 = arg0.method1553((byte) 19);
                            }
                        } else {
                            this.field4203 = arg0.method1553((byte) 8);
                        }
                    } else {
                        this.field4213 = arg0.method1553((byte) -126);
                    }
                } else {
                    this.field4200 = arg0.method1553((byte) 65);
                }
            } else {
                this.field4207 = arg0.method1553((byte) -115);
            }
        } else {
            this.field4209 = arg0.method1553((byte) -118);
        }
        int var5 = -14 % ((arg2 - 40) / 52);
        ++field4214;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)[I", line = 89)
    public final int[] method261(int arg0, byte arg1) {
        ++field4205;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 >= -76) {
            this.method1992(118, -100, -88);
        }
        if (super.field7643.field4364) {
            int var4 = class427.field5623[arg0] - 2048;
            for (int var5 = 0; ~var5 > ~class418.field5518; ++var5) {
                int var6 = class64.field839[var5] + -2048;
                int var7 = this.field4209 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field4207;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field4200 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field4213 + var4;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = !this.method1989(var12, true, var9) && !this.method1992(var18, 32573, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z", line = 141)
    private final boolean method1989(int arg0, boolean arg1, int arg2) {
        ++field4212;
        int var4 = (arg0 - arg2) * this.field4203 >> 12;
        int var5 = class558.field7100[(var4 * 255 & 1047265) >> 12];
        int var6 = (var5 << 12) / this.field4203;
        if (!arg1) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field4201;
            int var8 = this.field4202 * var7 >> 12;
            return ~var8 < ~(arg0 + arg2) && ~(-var8) > ~(arg0 + arg2);
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)V", line = 174)
    public static void method1990(byte arg0) {
        field4206 = null;
        if (arg0 < 74) {
            method1994(-4);
        }
        field4210 = null;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(B)Ldj;", line = 185)
    public static final class735 method1991(byte arg0) {
        ++field4208;
        try {
            return arg0 < 96 ? null : (class735) Class.forName("hi").newInstance();
        } catch (Throwable var1) {
            return new class236();
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(III)Z", line = 207)
    private final boolean method1992(int arg0, int arg1, int arg2) {
        ++field4215;
        if (arg1 != 32573) {
            return true;
        } else {
            int var4 = (arg0 + arg2) * this.field4203 >> 12;
            int var5 = class558.field7100[(1044882 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field4203;
            int var7 = (var6 << 12) / this.field4201;
            int var8 = this.field4202 * var7 >> 12;
            return ~var8 < ~(-arg2 + arg0) && -arg2 + arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "()V", line = 231)
    public static final void method1993() {
        for (int var0 = 0; var0 < class451.field5892; ++var0) {
            if (!class620.field7851[var0]) {
                class739 var1 = class491.field6306[var0];
                class757 var2 = var1.field10006;
                int var3 = var1.field10005;
                int var4 = var2.method4122(68) - class686.field8834;
                int var5 = (var4 * 2 >> class88.field1221) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method4121((byte) -124) - var4 >> class88.field1221;
                int var9 = var2.method4123(22290) - var4 >> class88.field1221;
                int var10 = var2.method4123(22290) + var4 >> class88.field1221;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class559.field7102) {
                    var10 = class559.field7102 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field9997[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class330.field4039) {
                        var16 = class330.field4039 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class620 var19 = class238.method1571(var3, var17, var11, field4216 != null ? field4216 : (field4216 = method1996("hd")));
                        if (var19 != null && var19.field7845 != 0) {
                            if (var19.field7845 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9997[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9997[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9997[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9997[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class620.field7851[var0] = true;
                class116.field1542[var3].method2059(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)I", line = 406)
    public static final int method1994(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class106.field1448 - 1; ++var2) {
            if (arg0 < class45.field507[var2] + class309.field3868[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class106.field1448 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V", line = 427)
    public final void method292(byte arg0) {
        if (arg0 < 44) {
            this.field4202 = -25;
        }
        ++field4204;
        class257.method1651(0);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILha;III)V", line = 442)
    public static final void method1995(int arg0, int arg1, int arg2, class570 arg3, int arg4, int arg5, int arg6) {
        if ((class573.field7256 == null || class444.field5815 == null || class377.field4617 == null) && class172.field2270.method130(-2, class138.field1824) && class172.field2270.method130(-2, class331.field4045) && class172.field2270.method130(-2, class283.field3658)) {
            class388 var7 = class388.method2232(class172.field2270, class331.field4045, 0);
            class444.field5815 = arg3.method977(var7, true);
            var7.method2234();
            class192.field2685 = arg3.method977(var7, true);
            class573.field7256 = arg3.method977(class388.method2232(class172.field2270, class138.field1824, 0), true);
            class388 var8 = class388.method2232(class172.field2270, class283.field3658, 0);
            class377.field4617 = arg3.method977(var8, true);
            var8.method2234();
            class234.field3201 = arg3.method977(var8, true);
        }
        ++field4211;
        if (class573.field7256 != null && class444.field5815 != null && class377.field4617 != null) {
            int var9 = (arg0 - class377.field4617.method620() * 2) / class573.field7256.method620();
            for (int var10 = 0; var9 > var10; ++var10) {
                class573.field7256.method4203(arg1 + (class377.field4617.method620() - -(var10 * class573.field7256.method620())), arg4 + (arg5 - class573.field7256.method612()));
            }
            int var11 = (-class377.field4617.method612() + arg5 + -arg2) / class444.field5815.method612();
            for (int var12 = 0; var12 < var11; ++var12) {
                class444.field5815.method4203(arg1, arg2 + arg4 - -(var12 * class444.field5815.method612()));
                class192.field2685.method4203(arg0 + arg1 - class192.field2685.method620(), class444.field5815.method612() * var12 + arg4 - -arg2);
            }
            class377.field4617.method4203(arg1, -class377.field4617.method612() + arg4 + arg5);
            class234.field3201.method4203(arg0 + (arg1 - class377.field4617.method620()), arg4 - (-arg5 - -class377.field4617.method612()));
        }
        if (arg6 != 0) {
            method1990((byte) -100);
        }
    }
}
