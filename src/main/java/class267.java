import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class267 extends class409 {

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field4243;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
    public static boolean field4246 = false;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lpn;")
    public static class49 field4244 = new class49(3, 16);

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "[I")
    public static int[] field4257 = new int[5];

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lmo;")
    public static class271 field4256 = new class271(1, 2);

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[I")
    public static int[] field4251;

    static {
        new class179("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class232.field3493 <= ~arg3 && class487.field7124 <= arg4) {
            boolean var6;
            if (arg5 < class232.field3492) {
                arg5 = class232.field3492;
                var6 = false;
            } else if (arg5 <= class36.field453) {
                var6 = true;
            } else {
                arg5 = class36.field453;
                var6 = false;
            }
            boolean var7;
            if (~class232.field3492 < ~arg1) {
                arg1 = class232.field3492;
                var7 = false;
            } else if (class36.field453 >= arg1) {
                var7 = true;
            } else {
                arg1 = class36.field453;
                var7 = false;
            }
            if (class487.field7124 <= arg3) {
                class262.method1831(arg1, class402.field5946[arg3++], (byte) 43, arg2, arg5);
            } else {
                arg3 = class487.field7124;
            }
            if (~arg4 < ~class232.field3493) {
                arg4 = class232.field3493;
            } else {
                class262.method1831(arg1, class402.field5946[arg4--], (byte) 43, arg2, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg3; ~var8 >= ~arg4; ++var8) {
                    int[] var9 = class402.field5946[var8];
                    var9[arg5] = var9[arg1] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg4; ++var10) {
                    class402.field5946[var10][arg5] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg3; ~var11 >= ~arg4; ++var11) {
                    class402.field5946[var11][arg1] = arg2;
                }
            }
        }
        ++field4252;
        if (arg0 != 85916620) {
            method1851((byte) -29);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V", line = 109)
    public final void method1850(int arg0, int arg1, int arg2) {
        ++field4245;
        int var4 = this.field4243 * arg1 >> 12;
        int var5 = this.field4250 * arg1 >> 12;
        int var6 = this.field4255 * arg0 >> 12;
        if (arg2 < 120) {
            this.method1850(-103, 86, -55);
        }
        int var7 = this.field4254 * arg0 >> 12;
        class13.method74(super.field6042, var7, var6, super.field6043, var5, var4, 23084, super.field6044);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 129)
    public static void method1851(byte arg0) {
        field4256 = null;
        field4257 = null;
        field4244 = null;
        if (arg0 >= 73) {
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IBI)V", line = 150)
    public final void method1852(int arg0, byte arg1, int arg2) {
        ++field4247;
        int var4 = this.field4243 * arg2 >> 12;
        int var5 = this.field4250 * arg2 >> 12;
        int var6 = this.field4255 * arg0 >> 12;
        if (arg1 == 88) {
            int var7 = this.field4254 * arg0 >> 12;
            class139.method1014(var4, var6, var5, var7, super.field6044, arg1 + 5631);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBIIII)V", line = 170)
    public static final void method1853(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4249;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = -arg2 + arg4;
        int var12 = -arg2 + arg1;
        int var13 = arg4 * arg4;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = -((var22 - 1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        if (arg3 != -6) {
            field4244 = null;
        }
        int var36 = (arg1 + -1) * var27;
        int var37 = var30;
        if (arg6 >= class487.field7124 && ~class232.field3493 <= ~arg6) {
            int[] var38 = class402.field5946[arg6];
            int var39 = class306.method2023(5, class232.field3492, -arg4 + arg7, class36.field453);
            int var40 = class306.method2023(5, class232.field3492, arg4 + arg7, class36.field453);
            int var41 = class306.method2023(~arg3, class232.field3492, -var11 + arg7, class36.field453);
            int var42 = class306.method2023(5, class232.field3492, arg7 + var11, class36.field453);
            class262.method1831(var41, var38, (byte) 43, arg5, var39);
            class262.method1831(var42, var38, (byte) 43, arg0, var41);
            class262.method1831(var40, var38, (byte) 43, arg5, var42);
        }
        int var43 = (var12 + -1) * var29;
        while (~var9 < -1) {
            boolean var44 = ~var12 <= ~var9;
            if (var44) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    ++var10;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class487.field7124 <= var46 && var45 <= class232.field3493) {
                int var47 = class306.method2023(arg3 + 11, class232.field3492, arg7 + var8, class36.field453);
                int var48 = class306.method2023(arg3 + 11, class232.field3492, -var8 + arg7, class36.field453);
                if (!var44) {
                    if (~var45 <= ~class487.field7124) {
                        class262.method1831(var47, class402.field5946[var45], (byte) 43, arg5, var48);
                    }
                    if (~var46 >= ~class232.field3493) {
                        class262.method1831(var47, class402.field5946[var46], (byte) 43, arg5, var48);
                    }
                } else {
                    int var49 = class306.method2023(5, class232.field3492, arg7 - -var10, class36.field453);
                    int var50 = class306.method2023(arg3 + 11, class232.field3492, -var10 + arg7, class36.field453);
                    if (var45 >= class487.field7124) {
                        int[] var51 = class402.field5946[var45];
                        class262.method1831(var50, var51, (byte) 43, arg5, var48);
                        class262.method1831(var49, var51, (byte) 43, arg0, var50);
                        class262.method1831(var47, var51, (byte) 43, arg5, var49);
                    }
                    if (class232.field3493 >= var46) {
                        int[] var52 = class402.field5946[var46];
                        class262.method1831(var50, var52, (byte) 43, arg5, var48);
                        class262.method1831(var49, var52, (byte) 43, arg0, var50);
                        class262.method1831(var47, var52, (byte) 43, arg5, var49);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIII)V", line = 380)
    public class267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4255 = arg1;
        this.field4243 = arg0;
        this.field4250 = arg2;
        this.field4254 = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 399)
    public static final void method1854(int arg0) {
        class105.method837(125, (long) class446.field6625, class376.field5542);
        ++field4248;
        if (~class134.field2010 != 0) {
            class175.method1244(class134.field2010, (byte) -109);
        }
        for (int var1 = 0; class500.field7273 > var1; ++var1) {
            if (class434.field6439[var1]) {
                class327.field4946[var1] = true;
            }
            class147.field2184[var1] = class434.field6439[var1];
            class434.field6439[var1] = false;
        }
        class525.field7697 = class446.field6625;
        if (class376.field5542.method522()) {
            class336.field5067 = true;
        }
        if (~class134.field2010 != 0) {
            class500.field7273 = 0;
            class508.method3022(105);
        }
        class376.field5542.method577();
        class244.method1660(-108, class376.field5542);
        int var2 = class437.method2709(-25310);
        if (~var2 == 0) {
            var2 = class282.field4402;
        }
        if (~var2 == 0) {
            var2 = class33.field400;
        }
        class240.method1613(var2, true);
        int var3 = -75 / ((-46 - arg0) / 57);
        class124.field1851 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBI)V", line = 452)
    public final void method1855(int arg0, byte arg1, int arg2) {
        ++field4253;
        if (arg1 > -8) {
            this.method1850(114, 36, -71);
        }
    }
}
