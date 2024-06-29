import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class667 {

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    private int field245 = 4096;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    private int field242 = 3216;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "[I")
    private int[] field247 = new int[3];

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    private int field252 = 3216;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "Leq;")
    public static class209 field244;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIILka;Lha;IIIIIIIILhn;)Lka;", line = 4)
    public static final class469 method115(int arg0, int arg1, int arg2, class469 arg3, class58 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class718 arg13) {
        ++field249;
        if (arg3 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg13 != null) {
                int var15 = var14 | arg13.method4011(65535, -1, arg7, false);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg12 << 48) + ((long) arg1 << 32) + (long) ((arg0 << 16) + (arg9 << 24) + arg2);
            if (arg11 != 32722) {
                return null;
            } else {
                class510 var18 = class620.field8954;
                class469 var19;
                synchronized (class620.field8954) {
                    var19 = (class469) class620.field8954.method3054((byte) -115, var16);
                }
                if (var19 == null || arg4.method611(var19.method361(), var14) != 0) {
                    if (var19 != null) {
                        var14 = arg4.method614(var14, var19.method361());
                    }
                    byte var20;
                    if (arg2 != 1) {
                        if (arg2 != 2) {
                            if (~arg2 == -4) {
                                var20 = 15;
                            } else if (arg2 != 4) {
                                var20 = 21;
                            } else {
                                var20 = 18;
                            }
                        } else {
                            var20 = 12;
                        }
                    } else {
                        var20 = 9;
                    }
                    byte var21 = 3;
                    int[] var22 = new int[] { 64, 96, 128 };
                    class729 var23 = new class729(1 - -(var20 * var21), var21 * 2 * var20 - var20, 0);
                    int var24 = var23.method4061(0, 0, true, 0);
                    int[][] var25 = new int[var21][var20];
                    for (int var26 = 0; var21 > var26; ++var26) {
                        int var27 = var22[var26];
                        int var28 = var22[var26];
                        for (int var29 = 0; var29 < var20; ++var29) {
                            int var30 = (var29 << 14) / var20;
                            int var31 = class316.field4487[var30] * var27 >> 14;
                            int var32 = class316.field4490[var30] * var28 >> 14;
                            var25[var26][var29] = var23.method4061(var31, 0, true, var32);
                        }
                    }
                    for (int var33 = 0; ~var21 < ~var33; ++var33) {
                        int var34 = (var33 * 256 + 128) / var21;
                        int var35 = 256 - var34;
                        byte var36 = (byte) (arg0 * var35 + arg9 * var34 >> 8);
                        short var37 = (short) (((arg1 & 896) * var35 + (arg12 & 896) * var34 & 229376) + ((127 & arg1) * var35 + (127 & arg12) * var34 & 32512) + (16515072 & (arg1 & 64512) * var35 + (arg12 & 64512) * var34) >> 8);
                        for (int var38 = 0; ~var38 > ~var20; ++var38) {
                            if (~var33 != -1) {
                                var23.method4064(var25[var33][(var38 + 1) % var20], var25[var33 - 1][var38], (short) -1, (byte) -1, var37, var25[var33 + -1][(var38 - -1) % var20], (byte) 1, false, var36);
                                var23.method4064(var25[var33][var38], var25[var33 + -1][var38], (short) -1, (byte) -1, var37, var25[var33][(var38 + 1) % var20], (byte) 1, false, var36);
                            } else {
                                var23.method4064(var25[0][var38], var24, (short) -1, (byte) -1, var37, var25[0][(var38 + 1) % var20], (byte) 1, false, var36);
                            }
                        }
                    }
                    var19 = arg4.method646(var23, var14, class386.field5405, 64, 768);
                    class510 var39 = class620.field8954;
                    synchronized (class620.field8954) {
                        class620.field8954.method3047(false, var19, var16);
                    }
                }
                int var40 = arg3.method327();
                int var41 = arg3.method356();
                int var42 = arg3.method312();
                int var43 = arg3.method362();
                class755 var44 = null;
                if (arg13 != null) {
                    int var45 = arg13.field10053[arg7];
                    var44 = class698.field9806.method856(var45 >> 16, 2);
                    arg7 = var45 & 65535;
                }
                class469 var46;
                if (var44 == null) {
                    var46 = var19.method325((byte) 3, var14, true);
                    var46.method315(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                    var46.method349(var40 + var41 >> 1, 0, var42 - -var43 >> 1);
                } else {
                    var46 = var19.method325((byte) 3, var14, true);
                    var46.method315(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                    var46.method349(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                    var46.method2848(arg11 ^ -32723, var44, arg7);
                }
                if (arg8 != 0) {
                    var46.method344(arg8);
                }
                if (~arg10 != -1) {
                    var46.method310(arg10);
                }
                if (arg6 != 0) {
                    var46.method349(0, arg6, 0);
                }
                return var46;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 179)
    public class19() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lud;II)V", line = 182)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field251;
        if (arg1 != 3) {
            this.field242 = 102;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field252 = arg0.method253(arg1 ^ -13897);
                }
            } else {
                this.field242 = arg0.method253(-13900);
            }
        } else {
            this.field245 = arg0.method253(-13900);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)[I", line = 227)
    public final int[] method117(byte arg0, int arg1) {
        ++field248;
        if (arg0 >= -87) {
            return null;
        } else {
            int[] var3 = super.field9355.method1744(arg1, -2);
            if (super.field9355.field3728) {
                int var4 = class416.field5843 * this.field245 >> 12;
                int[] var5 = this.method3744(class77.field1453 & arg1 - 1, (byte) 5, 0);
                int[] var6 = this.method3744(arg1, (byte) 126, 0);
                int[] var7 = this.method3744(class77.field1453 & arg1 + 1, (byte) -1, 0);
                for (int var8 = 0; ~class77.field1455 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class439.field6131] - var6[class439.field6131 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class456.field6595[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field247[2] * var14 >> 12;
                    int var18 = this.field247[1] * var16 >> 12;
                    int var19 = this.field247[0] * var15 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 301)
    public static void method118(int arg0) {
        if (arg0 <= 83) {
            field244 = null;
        }
        field244 = null;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V", line = 311)
    private final void method119(byte arg0) {
        ++field243;
        if (arg0 == 100) {
            double var2 = Math.cos((double) ((float) this.field252 / 4096.0F));
            this.field247[0] = (int) (Math.sin((double) ((float) this.field242 / 4096.0F)) * var2 * 4096.0D);
            this.field247[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field242 / 4096.0F)));
            this.field247[2] = (int) (4096.0D * Math.sin((double) ((float) this.field252 / 4096.0F)));
            int var4 = this.field247[0] * this.field247[0] >> 12;
            int var5 = this.field247[1] * this.field247[1] >> 12;
            int var6 = this.field247[2] * this.field247[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field247[1] = (this.field247[1] << 12) / var7;
                this.field247[0] = (this.field247[0] << 12) / var7;
                this.field247[2] = (this.field247[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZII)I", line = 343)
    public static final int method120(boolean arg0, int arg1, int arg2) {
        ++field250;
        if (!arg0) {
            method122(119, -11);
        }
        int var3 = 0;
        while (~arg2 < -1) {
            var3 = arg1 & 1 | var3 << 1;
            --arg2;
            arg1 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(Z)V", line = 375)
    public final void method121(boolean arg0) {
        this.method119((byte) 100);
        ++field246;
        if (arg0) {
            this.field245 = 54;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V", line = 392)
    public static final void method122(int arg0, int arg1) {
        ++field253;
        if (class611.field8839 != arg1) {
            if (arg1 == 13) {
                if (class443.field6167 == null) {
                    class396.method2457(class595.field8697, false, class566.field7985, class47.field696);
                } else {
                    class77.method772(-72, class595.field8697);
                }
            }
            if (~arg1 != -14 && class351.field4952 != null) {
                class351.field4952.method67(arg0 + -2);
                class351.field4952 = null;
            }
            if (arg1 == 3) {
                class199.method1395(true, class401.field5610 != class104.field1739);
            }
            if (arg1 == 7) {
                class396.method2456(~class401.field5610 != ~class197.field2834, -1);
            }
            if (~arg1 == -6) {
                if (class443.field6167 == null) {
                    class742.method4130(class47.field696, class566.field7985, 74);
                } else {
                    class439.method2639(-23954);
                }
            } else if (~arg1 != -7) {
                if (~arg1 != -10) {
                    if (arg1 == 12) {
                        if (class443.field6167 != null) {
                            class439.method2639(-23954);
                        } else {
                            class742.method4130(class47.field696, class566.field7985, arg0 + 121);
                        }
                    }
                } else if (class443.field6167 != null) {
                    class77.method772(66, class595.field8697);
                } else {
                    class396.method2457(class595.field8697, false, class566.field7985, class47.field696);
                }
            } else if (class443.field6167 != null) {
                class77.method772(57, class595.field8697);
            } else {
                class396.method2457(class595.field8697, false, class566.field7985, class47.field696);
            }
            if (arg0 != 1) {
                method122(13, 69);
            }
            if (class739.method4116(class611.field8839, -116)) {
                class14.field167.field3022 = 2;
                class372.field5214.field3022 = 2;
                class231.field3293.field3022 = 2;
                class744.field10424.field3022 = 2;
                class136.field2119.field3022 = 2;
                class497.field7079.field3022 = 2;
                class46.field673.field3022 = 2;
            }
            if (class739.method4116(arg1, -127)) {
                class694.field9761 = 0;
                class646.field9155 = 1;
                class271.field3880 = 1;
                class32.field435 = 0;
                class157.field2349 = 0;
                class497.method2990(arg0 ^ 127, true);
                class14.field167.field3022 = 1;
                class372.field5214.field3022 = 1;
                class231.field3293.field3022 = 1;
                class744.field10424.field3022 = 1;
                class136.field2119.field3022 = 1;
                class497.field7079.field3022 = 1;
                class46.field673.field3022 = 1;
            }
            if (~arg1 == -12 || ~arg1 == -4) {
                class667.method3741((byte) 82);
            }
            boolean var2 = arg1 == 2 || class756.method4199(arg1, 0) || class428.method2601(arg1, (byte) -121);
            boolean var3 = class611.field8839 == 2 || class756.method4199(class611.field8839, 0) || class428.method2601(class611.field8839, (byte) -121);
            if (var2 != var3) {
                if (!var2) {
                    class484.method2913(-18443, 2);
                    class612.field8856.method3351(true, -68);
                } else {
                    class122.field1893 = class11.field148;
                    if (class471.field6781.field6670.method3134(27669) != 0) {
                        class395.method2455((byte) -123, 2, 0, class11.field148, false, class471.field6781.field6670.method3134(27669), class351.field4955);
                        class226.method1558(-16032);
                    } else {
                        class484.method2913(-18443, 2);
                    }
                    class612.field8856.method3351(false, arg0 + 123);
                }
            }
            if (class739.method4116(arg1, arg0 + -126) || arg1 == 13) {
                class359.field5046.method567();
            }
            class611.field8839 = arg1;
        }
    }
}
