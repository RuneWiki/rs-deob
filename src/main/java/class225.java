import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class225 extends class273 {

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field3581 = 3216;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    private int field3589 = 3216;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    private int field3591 = 4096;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "[I")
    private int[] field3592 = new int[3];

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "S")
    public static short field3587 = 205;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Lsb;")
    public static class124 field3579;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lsb;")
    public static class124 field3580;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field3594;
        this.method1511(1925974252);
        if (arg0 >= -94) {
            field3579 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            field3579 = null;
        }
        int[] var3 = super.field4359.method387((byte) 119, arg1);
        ++field3584;
        if (super.field4359.field833) {
            int var4 = class232.field3679 * this.field3591 >> 12;
            int[] var5 = this.method1850(arg1 + -1 & class145.field2392, 0, (byte) 119);
            int[] var6 = this.method1850(arg1, 0, (byte) 86);
            int[] var7 = this.method1850(class145.field2392 & arg1 + 1, 0, (byte) -123);
            for (int var8 = 0; ~var8 > ~class26.field458; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[client.field4573 & var8 + -1] + -var6[client.field4573 & var8 + 1]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var10 < -256) {
                    var10 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class58.field1007[((var10 + 1) * var10 >> 1) + var12];
                int var14 = var11 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field3592[0] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field3592[2] * var17 >> 12;
                int var19 = this.field3592[1] * var15 >> 12;
                var3[var8] = var16 + var19 - -var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3590;
        if (arg4 != -31738) {
            method1510(-49);
        }
        if (~arg0 <= ~arg3) {
            class224.method1504(arg1, arg0, arg3, class114.field1841[arg2], 7);
        } else {
            class224.method1504(arg1, arg3, arg0, class114.field1841[arg2], 7);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIBIII)V")
    public static final void method1509(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field3582;
        ++class265.field4236;
        class199.method1352(64);
        if (!arg0) {
            class13.method91(true, 0);
            class47.method408(true, 0, -22469, false);
            if (class134.field2220 == 0) {
                for (int var6 = 1; ~var6 >= -6; ++var6) {
                    class47.method408(false, var6, -22469, false);
                    class47.method408(false, var6, -22469, true);
                    class13.method91(true, var6);
                }
            } else {
                for (int var7 = 1; ~var7 >= -6; ++var7) {
                    class13.method91(true, var7);
                    class47.method408(false, var7, arg2 ^ 22439, false);
                    class47.method408(false, var7, -22469, true);
                }
            }
        } else {
            class47.method408(false, 0, -22469, false);
        }
        if (!arg0) {
            class40.method330((byte) -40);
        }
        class235.method1559(arg2 + 1544);
        if (class184.field3033 != 1) {
            if (class184.field3033 == 5) {
                class2.method5(2, arg3);
            }
        } else {
            int var8 = 2047 & (int) class1.field1 - -class180.field3001;
            int var9 = (int) class161.field2619;
            if (class72.field1198 / 256 > var9) {
                var9 = class72.field1198 / 256;
            }
            if (class269.field4319[4] && ~(class272.field4348[4] + 128) < ~var9) {
                var9 = class272.field4348[4] + 128;
            }
            class274.method1858(class260.field4134, -1, var9, var8, class29.field507, var9 * 3 + 600, -50 + class218.method1450(class48.field878.field2887, class48.field878.field2849, true, class92.field1448), arg3);
        }
        int var10 = class31.field527;
        int var11 = class146.field2408;
        int var12 = class212.field3400;
        int var13 = class150.field2457;
        int var14 = class148.field2434;
        int var15 = 0;
        if (arg2 == -100) {
            while (var15 < 5) {
                if (class269.field4319[var15]) {
                    int var22 = (int) ((double) (-class144.field2366[var15]) + Math.random() * (double) (class144.field2366[var15] * 2 + 1) + Math.sin((double) class270.field4341[var15] / 100.0D * (double) class196.field3209[var15]) * (double) class272.field4348[var15]);
                    if (var15 == 3) {
                        class212.field3400 = 2047 & class212.field3400 + var22;
                    }
                    if (var15 == 2) {
                        class148.field2434 += var22;
                    }
                    if (~var15 == -1) {
                        class31.field527 += var22;
                    }
                    if (~var15 == -2) {
                        class150.field2457 += var22;
                    }
                    if (var15 == 4) {
                        class146.field2408 += var22;
                        if (~class146.field2408 > -129) {
                            class146.field2408 = 128;
                        }
                        if (~class146.field2408 < -384) {
                            class146.field2408 = 383;
                        }
                    }
                }
                ++var15;
            }
            class294.method1972((byte) 109);
            class63.method477(arg1, arg5, arg1 + arg4, arg3 + arg5);
            class95.method713();
            if (class1.field2 >= 0) {
                class121 var16 = class216.method1435(class240.field3781, class142.field2354, class107.field1632, class1.field2, false);
                var16.method880(class180.field2999, arg1, arg5, arg4, arg3, class146.field2408, class212.field3400, 0);
            } else {
                class63.method493(arg1, arg5, arg4, arg3, 0);
            }
            if (!class198.field3226 && ~class251.field3997 <= ~arg1 && ~class251.field3997 > ~(arg1 + arg4) && ~class180.field3002 <= ~arg5 && ~(arg5 - -arg3) < ~class180.field3002) {
                class268.field4293 = true;
                class181.field3007 = 0;
                int var17 = class19.field302;
                int var18 = class144.field2381;
                int var19 = class161.field2625;
                int var20 = class234.field3706;
                class91.field1439 = (-arg5 + class180.field3002) * (-var18 + var20) / arg3 + var18;
                class224.field3575 = (-arg1 + class251.field3997) * (-var17 + var19) / arg4 - -var17;
            } else {
                class268.field4293 = false;
                class181.field3007 = 0;
            }
            class260.method1738(true);
            byte var21 = class52.method434(-1176340616) != 2 ? 1 : (byte) class265.field4236;
            class65.method500(class31.field527, class150.field2457, class148.field2434, class146.field2408, class212.field3400, class229.field3656, class25.field423, class19.field299, class266.field4246, class167.field2752, class281.field4457, class92.field1448 - -1, var21, class48.field878.field2849 >> 7, class48.field878.field2887 >> 7);
            class260.method1738(true);
            class10.method63();
            class31.method273(-128, 256, 256, arg5, arg1, arg4, arg3);
            class245.method1629(256, 256, true, arg1, arg4, arg3, arg5);
            ((class283) class95.field1483).method1902(-8975, class232.field3681);
            class60.method466(arg4, arg1, -123, arg3, arg5);
            class150.field2457 = var13;
            class212.field3400 = var12;
            class146.field2408 = var11;
            class31.field527 = var10;
            class148.field2434 = var14;
            if (class148.field2423 && ~class57.field1002.method1149((byte) 127) == -1) {
                class148.field2423 = false;
            }
            if (class148.field2423) {
                class63.method493(arg1, arg5, arg4, arg3, 0);
                class72.method554(false, class35.field591, (byte) -59);
            }
            if (!arg0 && !class148.field2423 && !class198.field3226 && ~class251.field3997 <= ~arg1 && arg1 - -arg4 > class251.field3997 && ~class180.field3002 <= ~arg5 && class180.field3002 < arg3 + arg5) {
                class66.method509(arg4, arg3, class251.field3997, arg5, class180.field3002, arg1, arg2 + 13);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3580 = null;
        field3579 = null;
        if (arg0 != 256) {
            field3580 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    private final void method1511(int arg0) {
        ++field3593;
        double var2 = Math.cos((double) ((float) this.field3589 / 4096.0F));
        this.field3592[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field3581 / 4096.0F)));
        this.field3592[1] = (int) (var2 * Math.cos((double) ((float) this.field3581 / 4096.0F)) * 4096.0D);
        this.field3592[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3589 / 4096.0F)));
        int var4 = this.field3592[1] * this.field3592[1] >> 12;
        if (arg0 == 1925974252) {
            int var5 = this.field3592[0] * this.field3592[0] >> 12;
            int var6 = this.field3592[2] * this.field3592[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field3592[1] = (this.field3592[1] << 12) / var7;
                this.field3592[0] = (this.field3592[0] << 12) / var7;
                this.field3592[2] = (this.field3592[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.method1511(-126);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3589 = arg0.method996(65280);
                }
            } else {
                this.field3581 = arg0.method996(65280);
            }
        } else {
            this.field3591 = arg0.method996(arg2 + 65275);
        }
        ++field3583;
    }
}
