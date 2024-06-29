import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class595 {

    @OriginalMember(owner = "client!on", name = "x", descriptor = "B")
    public byte field8483;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field8465;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field8481;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public int field8471;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    private int field8482;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lon;")
    public class595 field8473;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Z")
    public static boolean field8469 = false;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Z")
    public static boolean field8466 = false;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "F")
    public static float field8463;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public int field8460;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public int field8461;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public int field8462;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public int field8470;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field8472;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public int field8475;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public int field8477;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public int field8478;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public int field8479;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Lts;")
    public static class53 field8464;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLqa;IILoh;)V", line = 4)
    public static final void method3396(byte arg0, class167 arg1, int arg2, int arg3, class549 arg4) {
        field8474++;
        class593 var5 = arg4.method3086(arg1, 100);
        if (var5 == null) {
            return;
        }
        if (arg0 >= -73) {
            method3396((byte) -126, null, -128, 90, null);
        }
        arg1.method615(arg2, arg3, arg2 + arg4.field7678, arg4.field7776 + arg3);
        if (class473.field6783 == 2 || class473.field6783 == 5 || class531.field7382 == null) {
            arg1.method592(-16777216, var5, arg2, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class377.field5547 == 4) {
            var6 = class56.field807;
            var7 = (int) (-class523.field7256) & 0x3FFF;
            var8 = class69.field1304;
            var9 = 4096;
        } else {
            var9 = 4096 - (class353.field5042 * 16);
            var6 = class644.field9367.field5109;
            var8 = class644.field9367.field5108;
            var7 = (int) (-class523.field7256) + class495.field6941 & 0x3FFF;
        }
        int var10 = var8 / 32 + 48 - ((class146.field2247 + -104) * 2);
        int var11 = class66.field990 * 4 + (208 - class66.field990 * 2) + 48 - (var6 / 32);
        class531.field7382.method957((float) arg4.field7678 / 2.0F + (float) arg2, (float) arg4.field7776 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var7 << 2, var5, arg2, arg3);
        for (class264 var12 = (class264) class593.field8421.method427(true); var12 != null; var12 = (class264) class593.field8421.method420(false)) {
            int var58 = var12.field3841;
            int var59 = ((class254.field3704.field4566[var58] & 0xFFFD21D) >> 14) - class382.field5687;
            int var60 = (class254.field3704.field4566[var58] & 0x3FFF) - class597.field8500;
            int var61 = var59 * 4 + 2 - (var8 / 32);
            int var62 = var60 * 4 + 2 - (var6 / 32);
            class128.method1004(arg4, -10087, var62, var61, arg2, class254.field3704.field4563[var58], arg3, arg1, var5);
        }
        for (int var13 = 0; var13 < class141.field2211; var13++) {
            int var55 = class616.field8721[var13] * 4 + 2 - (var8 / 32);
            int var56 = class521.field7241[var13] * 4 + 2 - var6 / 32;
            class370 var57 = class552.field7819.method2890(0, class633.field9205[var13]);
            if (var57.field5272 != null) {
                var57 = var57.method2238((byte) 71, class401.field6001);
                if (var57 == null || var57.field5328 == -1) {
                    continue;
                }
            }
            class128.method1004(arg4, -10087, var56, var55, arg2, var57.field5328, arg3, arg1, var5);
        }
        for (class51 var14 = (class51) class573.field8163.method734(0); var14 != null; var14 = (class51) class573.field8163.method736(-1)) {
            int var50 = (int) (var14.field1798 >> 28 & 0x3L);
            if (class555.field7857 == var50) {
                int var51 = (int) (var14.field1798 & 0x3FFFL) - class382.field5687;
                int var52 = (int) (var14.field1798 >> 14 & 0x3FFFL) - class597.field8500;
                int var53 = var51 * 4 + 2 - var8 / 32;
                int var54 = var52 * 4 + 2 - (var6 / 32);
                class638.method3684(var53, arg4, false, var54, var5, class402.field6012[0], arg2, arg3);
            }
        }
        for (int var15 = 0; var15 < class128.field2098; var15++) {
            class181 var45 = (class181) class432.field6368.method740(0, (long) class591.field8401[var15]);
            if (var45 != null) {
                class170 var46 = var45.field2623;
                if (var46.method1184(-127) && class644.field9367.field5116 == var46.field5116) {
                    class432 var47 = var46.field2492;
                    if (var47 != null && var47.field6304 != null) {
                        var47 = var47.method2582(0, class401.field6001);
                    }
                    if (var47 != null && var47.field6296 && var47.field6357) {
                        int var48 = var46.field5108 / 32 - (var8 / 32);
                        int var49 = var46.field5109 / 32 - (var6 / 32);
                        if (var47.field6306 == -1) {
                            class638.method3684(var48, arg4, false, var49, var5, class402.field6012[1], arg2, arg3);
                        } else {
                            class128.method1004(arg4, -10087, var49, var48, arg2, var47.field6306, arg3, arg1, var5);
                        }
                    }
                }
            }
        }
        int var16 = class43.field586;
        int[] var17 = class343.field4927;
        for (int var18 = 0; var18 < var16; var18++) {
            class400 var37 = class39.field536[var17[var18]];
            if (var37 != null && var37.method2442(-117) && class644.field9367 != var37 && class644.field9367.field5116 == var37.field5116) {
                int var38 = var37.field5108 / 32 - (var8 / 32);
                int var39 = var37.field5109 / 32 - (var6 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class404.field6020; var41++) {
                    if (var37.field5958.equals(class534.field7454[var41]) && class41.field572[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class619.field8734; var43++) {
                    if (var37.field5958.equals(class10.field115[var43].field1382)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class644.field9367.field5951 != 0 && var37.field5951 != 0 && class644.field9367.field5951 == var37.field5951) {
                    var44 = true;
                }
                if (var37.field5977) {
                    class638.method3684(var38, arg4, false, var39, var5, class402.field6012[6], arg2, arg3);
                } else if (var40) {
                    class638.method3684(var38, arg4, false, var39, var5, class402.field6012[3], arg2, arg3);
                } else if (var42) {
                    class638.method3684(var38, arg4, false, var39, var5, class402.field6012[5], arg2, arg3);
                } else if (var44) {
                    class638.method3684(var38, arg4, false, var39, var5, class402.field6012[4], arg2, arg3);
                } else {
                    class638.method3684(var38, arg4, false, var39, var5, class402.field6012[2], arg2, arg3);
                }
            }
        }
        class371[] var19 = class451.field6552;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class371 var23 = var19[var20];
            if (var23 != null && var23.field5361 != 0 && class310.field4553 % 20 < 10) {
                if (var23.field5361 == 1) {
                    class181 var24 = (class181) class432.field6368.method740(0, (long) var23.field5357);
                    if (var24 != null) {
                        class170 var25 = var24.field2623;
                        int var26 = var25.field5108 / 32 - var8 / 32;
                        int var27 = var25.field5109 / 32 - (var6 / 32);
                        class294.method1854(arg2, 77, arg3, var23.field5360, arg4, 360000L, var5, var27, var26);
                    }
                }
                if (var23.field5361 == 2) {
                    int var28 = var23.field5364 / 32 - (var8 / 32);
                    int var29 = var23.field5356 / 32 - (var6 / 32);
                    long var30 = (long) (var23.field5366 << 5);
                    long var32 = var30 * var30;
                    class294.method1854(arg2, 50, arg3, var23.field5360, arg4, var32, var5, var29, var28);
                }
                if (var23.field5361 == 10 && var23.field5357 >= 0 && var23.field5357 < class39.field536.length) {
                    class400 var34 = class39.field536[var23.field5357];
                    if (var34 != null) {
                        int var35 = var34.field5108 / 32 - (var8 / 32);
                        int var36 = var34.field5109 / 32 - (var6 / 32);
                        class294.method1854(arg2, 6, arg3, var23.field5360, arg4, 360000L, var5, var36, var35);
                    }
                }
            }
        }
        if (class377.field5547 == 4) {
            return;
        }
        if (class476.field6810 != 0) {
            int var21 = class476.field6810 * 4 + (class644.field9367.method781((byte) 83) * 2) + 2 - (var8 / 32) - 2;
            int var22 = class439.field6391 * 4 + 2 - (var6 / 32 + -(class644.field9367.method781((byte) -126) * 2) + 2);
            class638.method3684(var21, arg4, false, var22, var5, class449.field6543[class624.field8810 ? 1 : 0], arg2, arg3);
        }
        arg1.method1159(-1, 3, arg4.field7776 / 2 + arg3 - 1, arg4.field7678 / 2 + arg2 + -1, (byte) -122, 3);
        return;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLjava/lang/String;)V", line = 322)
    public static final void method3397(byte arg0, String arg1) {
        if (class555.field7859 == null) {
            class128.method1007(1);
        }
        field8476++;
        String[] var2 = class580.method3325((byte) 118, '\n', arg1);
        if (arg0 <= 107) {
            field8463 = -0.8884784F;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class308.field4466; var4 > 0; var4--) {
                class555.field7859[var4] = class555.field7859[var4 - 1];
            }
            class555.field7859[0] = var2[var3];
            if ((class555.field7859.length - 1) > class308.field4466) {
                if (class637.field9254 > 0) {
                    class637.field9254++;
                }
                class308.field4466++;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 364)
    public static void method3398(boolean arg0) {
        field8464 = null;
        if (!arg0) {
            method3397((byte) -23, null);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z", line = 394)
    public static final boolean method3399(int arg0, int arg1, int arg2) {
        field8468++;
        if (arg1 == 0) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Leg;", line = 405)
    public final class48 method3400(int arg0) {
        if (arg0 != 30847) {
            this.field8460 = 78;
        }
        field8480++;
        return class111.method922(this.field8482, (byte) -103);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)Lon;", line = 416)
    public final class595 method3401(int arg0, int arg1, int arg2, int arg3) {
        field8467++;
        if (arg3 >= -53) {
            field8464 = null;
        }
        return new class595(this.field8482, arg2, arg1, arg0, this.field8483);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIB)V", line = 427)
    public class595(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8483 = arg4;
        this.field8465 = arg2;
        this.field8481 = arg3;
        this.field8471 = arg1;
        this.field8482 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lon;I)V", line = 438)
    public class595(class595 arg0, int arg1) {
        this.field8473 = arg0;
        this.field8483 = this.field8473.field8483;
        this.field8482 = this.field8473.field8482;
        this.field8465 = this.field8473.field8465 + arg1;
        this.field8471 = this.field8473.field8471 + arg1;
        this.field8481 = this.field8473.field8481 + arg1;
    }
}
