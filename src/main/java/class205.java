import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class205 {

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lwm;")
    private class399 field3283 = new class399(64);

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Lph;")
    private class459 field3279;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "Ldc;")
    public static class5 field3273 = new class5(16);

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field3284 = -1;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 3)
    public static void method1396(byte arg0) {
        field3273 = null;
        if (arg0 != 44) {
            method1396((byte) -86);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method1397(int arg0, int arg1, int arg2) {
        if (arg0 != -26108) {
            method1396((byte) -109);
        }
        field3278++;
        return class172.method1194((byte) 125, arg1, arg2) & class188.method1279(arg2, false, arg1);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 25)
    public final void method1398(int arg0) {
        if (arg0 != 16) {
            field3273 = null;
        }
        class399 var2 = this.field3283;
        synchronized (this.field3283) {
            this.field3283.method2475((byte) 67);
        }
        field3281++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1399(int arg0, int arg1) {
        return class281.field4248 == null ? 0 : class281.field4248[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)Lf;", line = 44)
    public final class534 method1400(byte arg0, int arg1) {
        field3275++;
        class399 var3 = this.field3283;
        class534 var4;
        synchronized (this.field3283) {
            var4 = (class534) this.field3283.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field3279;
        byte[] var6;
        synchronized (this.field3279) {
            var6 = this.field3279.method2757(16, arg1, (byte) -123);
        }
        class534 var7 = new class534();
        if (var6 != null) {
            var7.method3154(new class289(var6), (byte) 123);
        }
        class399 var8 = this.field3283;
        synchronized (this.field3283) {
            this.field3283.method2472(110, var7, (long) arg1);
            if (arg0 != -44) {
                this.field3276 = 52;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLza;)V", line = 76)
    public static final void method1401(byte arg0, class288 arg1) {
        field3274++;
        int var2 = class229.field3561;
        int var3 = class280.field4218;
        int var4 = class383.field5601;
        int var5 = class186.field2991 - 3;
        byte var6 = 20;
        if (class87.field1783 == null || class129.field2198 == null) {
            if (class455.field6758.method2739(class204.field3267, 71) && class455.field6758.method2739(class3.field70, 61)) {
                class87.field1783 = arg1.method374(class340.method2139(class455.field6758, class204.field3267, 0), true);
                class340 var7 = class340.method2139(class455.field6758, class3.field70, 0);
                class129.field2198 = arg1.method374(var7, true);
                var7.method2148();
                class45.field956 = arg1.method374(var7, true);
            } else {
                arg1.method327(var2, var3, var4, var6, 255 - class177.field2872 << 24 | class362.field5297, 1);
            }
        }
        if (class87.field1783 != null && class129.field2198 != null) {
            int var8 = (var4 - class129.field2198.method157() * 2) / class87.field1783.method157();
            for (int var9 = 0; var9 < var8; var9++) {
                class87.field1783.method159(var2 + (class129.field2198.method157() + (class87.field1783.method157() * var9)), var3);
            }
            class129.field2198.method159(var2, var3);
            class45.field956.method159(var4 + var2 - class45.field956.method157(), var3);
        }
        class356.field5232.method2017(var2 + 3, class276.field4171 | 0xFF000000, -1, (byte) -74, var3 + 14, class265.field4034.method1977(class146.field2452, 101));
        arg1.method327(var2, var3 + var6, var4, var5 - var6, -class177.field2872 + 255 << 24 | class362.field5297, 1);
        int var10 = class393.field5991.method132(8);
        int var11 = class393.field5991.method139(-117);
        int var12 = 0;
        for (class328 var13 = (class328) class373.field5469.method1892(122); var13 != null; var13 = (class328) class373.field5469.method1893((byte) -2)) {
            int var32 = (class332.field5041 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var10 > var2 && (var2 + var4) > var10 && (var32 - 13) < var11 && (var32 + 4) > var11 && var13.field4978) {
                arg1.method327(var2, var32 - 12, var4, 16, 255 - class460.field6848 << 24 | class274.field4158, 1);
            }
        }
        int var14 = 42 % ((-arg0 - 11) / 59);
        if ((class347.field5168 == null || class265.field4035 == null || class198.field3195 == null) && class455.field6758.method2739(class190.field3062, 75) && class455.field6758.method2739(class175.field2851, -104) && class455.field6758.method2739(class498.field7313, -99)) {
            class340 var15 = class340.method2139(class455.field6758, class175.field2851, 0);
            class265.field4035 = arg1.method374(var15, true);
            var15.method2148();
            class51.field1073 = arg1.method374(var15, true);
            class347.field5168 = arg1.method374(class340.method2139(class455.field6758, class190.field3062, 0), true);
            class340 var16 = class340.method2139(class455.field6758, class498.field7313, 0);
            class198.field3195 = arg1.method374(var16, true);
            var16.method2148();
            class171.field2773 = arg1.method374(var16, true);
        }
        if (class347.field5168 != null && class265.field4035 != null && class198.field3195 != null) {
            int var17 = (var4 - (class198.field3195.method157() * 2)) / class347.field5168.method157();
            for (int var18 = 0; var18 < var17; var18++) {
                class347.field5168.method159(var2 + (class198.field3195.method157() + (var18 * class347.field5168.method157())), var3 + var5 - class347.field5168.method154());
            }
            int var19 = (var5 - var6 - class198.field3195.method154()) / class265.field4035.method154();
            for (int var20 = 0; var20 < var19; var20++) {
                class265.field4035.method159(var2, var20 * class265.field4035.method154() + (var3 + var6));
                class51.field1073.method159(var2 + var4 - class51.field1073.method157(), class265.field4035.method154() * var20 + var3 + var6);
            }
            class198.field3195.method159(var2, var5 + (var3 - class198.field3195.method154()));
            class171.field2773.method159(var2 + var4 - class198.field3195.method157(), -class198.field3195.method154() + var5 + var3);
        }
        int var21 = 0;
        for (class328 var22 = (class328) class373.field5469.method1892(103); var22 != null; var22 = (class328) class373.field5469.method1893((byte) -2)) {
            int var23 = var3 + var6 + ((class332.field5041 - (1 - -var21)) * 16) + 13;
            int var24 = class276.field4171 | 0xFF000000;
            if (var10 > var2 && var10 < (var2 + var4) && var11 > (var23 - 13) && var11 < (var23 + 4) && var22.field4978) {
                var24 = class383.field5599 | 0xFF000000;
            }
            int[] var25 = null;
            if (class40.method251(var22.field4972, -7010)) {
                var25 = class135.field2271.method1636((int) var22.field4981, -110).field196;
            } else if (var22.field4973 != -1) {
                var25 = class135.field2271.method1636(var22.field4973, -125).field196;
            } else if (class470.method2810(-99, var22.field4972)) {
                class435 var26 = (class435) class209.field3337.method1622((long) ((int) var22.field4981), 125);
                if (var26 != null) {
                    class163 var27 = var26.field6471;
                    class51 var28 = var27.field2613;
                    if (var28.field1038 != null) {
                        var28 = var28.method475(class402.field6080, -1);
                    }
                    if (var28 != null) {
                        var25 = var28.field1053;
                    }
                }
            } else if (class473.method2826(43, var22.field4972)) {
                Object var29 = null;
                class306 var30;
                if (var22.field4972 == 1003) {
                    var30 = class123.field2142.method1530((byte) -61, (int) var22.field4981);
                } else {
                    var30 = class123.field2142.method1530((byte) -123, (int) (var22.field4981 >>> 32 & 0x7FFFFFFFL));
                }
                if (var30.field4593 != null) {
                    var30 = var30.method1951(class402.field6080, 0);
                }
                if (var30 != null) {
                    var25 = var30.field4644;
                }
            }
            String var31 = class477.method2850(52, var22);
            if (var25 != null) {
                var31 = var31 + class444.method2658(var25, -22);
            }
            class356.field5232.method2007(0, class365.field5333, var31, 1, var24, var23, var2 + 3, client.field3219);
            if (var22.field4974) {
                class271.field4119.method159(class272.field4126.method2808(var31, -90) + var2 + 5, var23 + -12);
            }
            var21++;
        }
        class140.method1049(class383.field5601, class280.field4218, 11, class229.field3561, class186.field2991);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 283)
    public final void method1402(int arg0) {
        if (arg0 != -16777216) {
            return;
        }
        field3282++;
        class399 var2 = this.field3283;
        synchronized (this.field3283) {
            this.field3283.method2477(124);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 355)
    public class205(class341 arg0, int arg1, class459 arg2) {
        this.field3279 = arg2;
        if (this.field3279 == null) {
            this.field3276 = 0;
        } else {
            this.field3276 = this.field3279.method2763(16, -3);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)V", line = 301)
    public static final void method1403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class108.field1986; var5++) {
            Rectangle var6 = class31.field498[var5];
            if ((var6.x + var6.width) > arg4 && var6.x < (arg1 + arg4) && arg2 < (var6.y + var6.height) && var6.y < (arg2 + arg3)) {
                class486.field7167[var5] = true;
            }
        }
        field3277++;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V", line = 321)
    public static final void method1404(int arg0) {
        class110.field2001 = arg0;
        for (int var1 = 0; var1 < class493.field7231; var1++) {
            for (int var2 = 0; var2 < class220.field3464; var2++) {
                if (class518.field7511[arg0][var1][var2] == null) {
                    class518.field7511[arg0][var1][var2] = new class234(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V", line = 343)
    public final void method1405(int arg0, int arg1) {
        class399 var3 = this.field3283;
        synchronized (this.field3283) {
            this.field3283.method2471((byte) 98, arg1);
        }
        if (arg0 != 0) {
            method1399(64, -52);
        }
        field3280++;
    }
}
