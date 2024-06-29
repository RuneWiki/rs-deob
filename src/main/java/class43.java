import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class43 extends class326 {

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    private int field599 = -1;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field587 = "shake:";

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[S")
    public static short[] field584 = new short[256];

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field586 = -2;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "[I")
    private int[] field597;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 5)
    public static void method346(int arg0) {
        field584 = null;
        field587 = null;
        if (arg0 != -4) {
            method347((long[]) null, (Object[]) null, 44);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 19)
    public static final void method347(long[] arg0, Object[] arg1, int arg2) {
        class311.method2162(arg0.length - 1, arg2 + -9406, arg1, arg0, 0);
        if (arg2 == 9406) {
            field593++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z", line = 30)
    private final boolean method348(boolean arg0) {
        if (arg0) {
            this.field599 = -98;
        }
        field595++;
        if (this.field597 != null) {
            return true;
        } else if (this.field599 < 0) {
            return false;
        } else {
            int var2 = class302.field4637;
            int var3 = class166.field2731;
            int var4 = class281.field4330.method1806(18160, this.field599).field2831 ? 64 : 128;
            this.field597 = class281.field4330.method1807(false, this.field599, 1.0F, var4, var4, (byte) 40);
            this.field592 = var4;
            this.field585 = var4;
            class121.method874(var3, var2, true);
            return this.field597 != null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I", line = 66)
    public final int[][] method253(int arg0, byte arg1) {
        field589++;
        int[][] var3 = this.field5104.method2365((byte) 15, arg0);
        if (this.field5104.field5325 && this.method348(false)) {
            int[] var4 = var3[0];
            int var5 = (class302.field4637 == this.field592 ? arg0 : this.field592 * arg0 / class302.field4637) * this.field585;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class166.field2731 == this.field585) {
                for (int var11 = 0; var11 < class166.field2731; var11++) {
                    int var12 = this.field597[var5++];
                    var7[var11] = class333.method2319(255, var12) << 4;
                    var6[var11] = class333.method2319(4080, var12 >> 4);
                    var4[var11] = class333.method2319(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class166.field2731; var8++) {
                    int var9 = this.field585 * var8 / class166.field2731;
                    int var10 = this.field597[var5 + var9];
                    var7[var8] = class333.method2319(var10 << 4, 4080);
                    var6[var8] = class333.method2319(65280, var10) >> 4;
                    var4[var8] = class333.method2319(16711680, var10) >> 12;
                }
            }
        }
        int var13 = 0 % ((60 - arg1) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZBII)V", line = 129)
    public static final void method349(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field596++;
        class301.field4629++;
        class337.method2342(80);
        if (arg2) {
            class133.method979(24715, false, false, 0);
        } else {
            class126.method918(125, 0);
            class133.method979(24715, true, false, 0);
            if (class200.field3202 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class133.method979(24715, false, false, var7);
                    class133.method979(24715, false, true, var7);
                    class126.method918(-18, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class126.method918(-83, var6);
                    class133.method979(24715, false, false, var6);
                    class133.method979(24715, false, true, var6);
                }
            }
        }
        if (!arg2) {
            class124.method907(97);
        }
        class183.method1345((byte) -88);
        if (class109.field1458) {
            class123.method899(0, arg4, arg0, true, arg1, arg5);
            arg5 = class72.field1005;
            arg1 = class305.field4771;
            arg0 = class69.field964;
            arg4 = class270.field4194;
        }
        if (class166.field2715 == 1) {
            int var8 = (int) class6.field114;
            if ((class121.field1704 / 256) > var8) {
                var8 = class121.field1704 / 256;
            }
            int var9 = (int) class45.field604 + class232.field3613 & 0x7FF;
            if (class130.field1918[4] && var8 < class57.field790[4] + 128) {
                var8 = class57.field790[4] + 128;
            }
            class282.method1999(class320.method2245((byte) -119, class146.field2310.field4731, class154.field2392, class146.field2310.field4698) - 50, var8, var8 * 3 + 600, arg4, (byte) 55, var9, class225.field3561, class2.field19);
        } else if (class166.field2715 == 5) {
            class278.method1955(arg4, (byte) 96);
        }
        int var10 = class295.field4572;
        int var11 = field588;
        int var12 = -6 / ((63 - arg3) / 38);
        int var13 = class317.field5018;
        int var14 = class185.field2999;
        int var15 = class293.field4536;
        for (int var16 = 0; var16 < 5; var16++) {
            if (class130.field1918[var16]) {
                int var17 = (int) (Math.random() * (double) (class72.field1003[var16] * 2 + 1) + Math.sin((double) class11.field205[var16] / 100.0D * (double) class311.field4856[var16]) * (double) class57.field790[var16] - (double) class72.field1003[var16]);
                if (var16 == 1) {
                    field588 += var17;
                }
                if (var16 == 3) {
                    class185.field2999 = class185.field2999 + var17 & 0x7FF;
                }
                if (var16 == 4) {
                    class293.field4536 += var17;
                    if (class293.field4536 < 128) {
                        class293.field4536 = 128;
                    }
                    if (class293.field4536 > 383) {
                        class293.field4536 = 383;
                    }
                }
                if (var16 == 0) {
                    class295.field4572 += var17;
                }
                if (var16 == 2) {
                    class317.field5018 += var17;
                }
            }
        }
        class211.method1540((byte) -75);
        if (class109.field1458) {
            class122.method885(arg0, arg1, arg0 + arg5, arg1 + arg4);
            float var19 = (float) class293.field4536 * 0.17578125F;
            float var20 = (float) class185.field2999 * 0.17578125F;
            if (class166.field2715 == 3) {
                var19 = class204.field3239 * 360.0F / 6.2831855F;
                var20 = class294.field4562 * 360.0F / 6.2831855F;
            }
            boolean var21 = false;
            int var22;
            if (class105.field1388 == 10) {
                var22 = class315.method2201(class317.field5018 >> 10, class326.field5123, class153.field2373, (byte) 118, class295.field4572 >> 10);
            } else {
                var22 = class315.method2201(class146.field2310.field4675[0] >> 3, class326.field5123, class153.field2373, (byte) 118, class146.field2310.field4708[0] >> 3);
            }
            if (class34.field507 < 0) {
                class109.method757(var22);
            } else {
                class109.method755();
                class299 var23 = client.method947((byte) -117, class216.field3404, class34.field507, class184.field2981, class84.field1150);
                var23.method2081(class318.field5037, arg0, arg1, arg5, arg4, class293.field4536, class185.field2999, var22);
            }
            class109.method750(arg0, arg1, arg5, arg4, arg5 / 2 + arg0, arg4 / 2 + arg1, var19, var20, class222.field3513, class222.field3513);
            class276.method1938(false, (byte) 104);
            class109.method751();
            class109.method753(true);
            class109.method740(true);
        } else {
            class280.method1978(arg0, arg1, arg0 + arg5, arg1 - -arg4);
            class31.method277();
            if (class34.field507 >= 0) {
                class299 var18 = client.method947((byte) -82, class216.field3404, class34.field507, class184.field2981, class84.field1150);
                var18.method2079(class318.field5037, arg0, arg1, arg5, arg4, class293.field4536, class185.field2999, 0);
            } else {
                class280.method1971(arg0, arg1, arg5, arg4, 0);
            }
        }
        if (class238.field3729 || class215.field3387 < arg0 || (arg0 + arg5) <= class215.field3387 || arg1 > class57.field812 || arg1 + arg4 <= class57.field812) {
            class193.field3072 = 0;
            class66.field945 = false;
        } else {
            int var24 = class11.field206;
            class193.field3072 = 0;
            class66.field945 = true;
            int var25 = class306.field4781;
            int var26 = class259.field4074;
            class336.field5239 = (class215.field3387 - arg0) * (var26 - var24) / arg5 + var24;
            int var27 = class249.field3925;
            class238.field3728 = (class57.field812 - arg1) * (var27 - var25) / arg4 + var25;
        }
        class50.method373((byte) 101);
        byte var28 = class162.method1207(true) == 2 ? (byte) class301.field4629 : 1;
        if (class109.field1458) {
            class176.method1298(class229.field3595, !class47.field622);
            class107.method733(field588, class295.field4572, class293.field4536, class185.field2999, 103, class317.field5018);
            class109.field1472 = class229.field3595;
            class223.method1631(class295.field4572, field588, class317.field5018, class293.field4536, class185.field2999, class214.field3376, class341.field5305, class282.field4366, class335.field5220, class42.field570, class259.field4078, class154.field2392 + 1, var28, class146.field2310.field4698 >> 7, class146.field2310.field4731 >> 7);
            class230.field3601 = true;
            class176.method1305();
            class107.method733(0, 0, 0, 0, 110, 0);
            class50.method373((byte) 124);
            class206.method1519(class222.field3513, (byte) -73, class222.field3513, arg0, arg1, arg4, arg5);
            class196.method1456(arg4, class222.field3513, arg1, (byte) -106, arg0, class222.field3513, arg5);
            class329.method2304();
        } else {
            class223.method1631(class295.field4572, field588, class317.field5018, class293.field4536, class185.field2999, class214.field3376, class341.field5305, class282.field4366, class335.field5220, class42.field570, class259.field4078, class154.field2392 + 1, var28, class146.field2310.field4698 >> 7, class146.field2310.field4731 >> 7);
            class50.method373((byte) 105);
            class329.method2304();
            class206.method1519(256, (byte) -57, 256, arg0, arg1, arg4, arg5);
            class196.method1456(arg4, 256, arg1, (byte) -68, arg0, 256, arg5);
        }
        ((class57) class31.field466).method460(121, class153.field2373);
        class174.method1285(arg0, (byte) 87, arg4, arg1, arg5);
        class317.field5018 = var13;
        field588 = var11;
        class185.field2999 = var14;
        class293.field4536 = var15;
        class295.field4572 = var10;
        if (class171.field2823 && class147.field2322.method2140(4) == 0) {
            class171.field2823 = false;
        }
        if (class171.field2823) {
            if (class109.field1458) {
                class122.method897(arg0, arg1, arg5, arg4, 0);
            } else {
                class280.method1971(arg0, arg1, arg5, arg4, 0);
            }
            class36.method312((byte) 27, false, class126.field1819);
        }
        if (!arg2 && !class171.field2823 && !class238.field3729 && class215.field3387 >= arg0 && (arg0 + arg5) > class215.field3387 && arg1 <= class57.field812 && (arg1 + arg4) > class57.field812) {
            class224.method1638(class215.field3387, class57.field812, arg4, arg1, arg5, arg0, -83);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V", line = 395)
    public final void method350(byte arg0) {
        super.method350(arg0);
        this.field597 = null;
        field594++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZLvl;)V", line = 404)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field598++;
        if (!arg1 && arg0 == 0) {
            this.field599 = arg2.method39((byte) 56);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 419)
    public class43() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I", line = 442)
    public final int method351(int arg0) {
        field590++;
        if (arg0 != -32489) {
            this.method348(true);
        }
        return this.field599;
    }
}
