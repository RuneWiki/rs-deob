import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class469 {

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "Luaa;")
    private class395 field6751 = new class395(64);

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "Lgp;")
    private class561 field6750;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lel;")
    public static class173 field6760;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "Lpt;")
    public static class372 field6754;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "[I")
    public static int[] field6758;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
    public static final void method2721(byte arg0) {
        field6753++;
        class609.field8653++;
        class624.method3537(arg0 - 196, class433.field6373);
        if (arg0 != 73) {
            field6760 = null;
        }
        class127.field2088.method1710(0, 125);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIII)V")
    public static final void method2722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6755++;
        class21 var5 = class601.method3413(arg1, arg2, (byte) 88);
        var5.method230(arg2 ^ 0x47A0);
        var5.field308 = arg3;
        var5.field304 = arg0;
        var5.field302 = arg4;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public final void method2723(int arg0) {
        class395 var2 = this.field6751;
        synchronized (this.field6751) {
            this.field6751.method2404((byte) -118);
        }
        field6749++;
        if (arg0 != -29969) {
            this.method2725(20, 28);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BI)Lsi;")
    public final class136 method2724(byte arg0, int arg1) {
        field6747++;
        class395 var3 = this.field6751;
        class136 var4;
        synchronized (this.field6751) {
            var4 = (class136) this.field6751.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field6750;
        byte[] var6;
        synchronized (this.field6750) {
            var6 = this.field6750.method3175(arg1, (byte) -53, 31);
        }
        class136 var7 = new class136();
        int var8 = -62 % ((arg0 - 33) / 47);
        if (var6 != null) {
            var7.method1039(new class268(var6), (byte) -40);
        }
        class395 var9 = this.field6751;
        synchronized (this.field6751) {
            this.field6751.method2408(var7, (long) arg1, -119);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    public final void method2725(int arg0, int arg1) {
        field6748++;
        if (arg0 != 0) {
            method2729(127);
        }
        class395 var3 = this.field6751;
        synchronized (this.field6751) {
            this.field6751.method2397(arg1, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
    public final void method2726(int arg0) {
        if (arg0 >= -126) {
            return;
        }
        class395 var2 = this.field6751;
        synchronized (this.field6751) {
            this.field6751.method2406(-119);
        }
        field6757++;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIIII)V")
    public static final void method2727(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -28701) {
            method2721((byte) -118);
        }
        field6759++;
        float var5 = (float) class212.field3116 / (float) class212.field3121;
        int var6 = arg3;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg2 - (arg1 - var7) / 2;
        int var9 = arg0 - (arg3 - var6) / 2;
        field6762 = -1;
        class274.field4008 = class212.field3121 * var9 / var6;
        class119.field1915 = class212.field3116 - (class212.field3116 * var8 / var7);
        class378.field5562 = -1;
        class173.method1192(588394986);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLui;)I")
    public static final int method2728(byte arg0, class587 arg1) {
        field6752++;
        if (arg0 >= -61) {
            field6762 = -96;
        }
        String var2 = class215.method1459(-103, arg1);
        int[] var3 = null;
        if (class458.method2682(arg1.field8359, true)) {
            var3 = class611.field8684.method1621((byte) -58, (int) arg1.field8365).field5666;
        } else if (arg1.field8368 != -1) {
            var3 = class611.field8684.method1621((byte) -111, arg1.field8368).field5666;
        } else if (class393.method2383(-23131, arg1.field8359)) {
            class181 var4 = (class181) class432.field6368.method740(0, (long) ((int) arg1.field8365));
            if (var4 != null) {
                class170 var5 = var4.field2623;
                class432 var6 = var5.field2492;
                if (var6.field6304 != null) {
                    var6 = var6.method2582(0, class401.field6001);
                }
                if (var6 != null) {
                    var3 = var6.field6342;
                }
            }
        } else if (class36.method315(48, arg1.field8359)) {
            Object var7 = null;
            class370 var8;
            if (arg1.field8359 == 1004) {
                var8 = class552.field7819.method2890(0, (int) arg1.field8365);
            } else {
                var8 = class552.field7819.method2890(0, (int) (arg1.field8365 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field5272 != null) {
                var8 = var8.method2238((byte) 102, class401.field6001);
            }
            if (var8 != null) {
                var3 = var8.field5301;
            }
        }
        if (var3 != null) {
            var2 = var2 + class347.method2106(var3, -79);
        }
        int var9 = class26.field358.method3654(class144.field2231, var2, -2);
        if (arg1.field8358) {
            var9 += class202.field2849.method962() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class469(class584 arg0, int arg1, class561 arg2) {
        this.field6750 = arg2;
        this.field6750.method3164(31, true);
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V")
    public static void method2729(int arg0) {
        field6760 = null;
        field6754 = null;
        if (arg0 != -1) {
            field6758 = null;
        }
        field6758 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILqa;)V")
    public static final void method2730(int arg0, class167 arg1) {
        field6756++;
        int var2 = class270.field3975;
        int var3 = class6.field49;
        int var4 = class526.field7324;
        int var5 = class354.field5064 - 3;
        byte var6 = 20;
        if (class430.field6278 == null || class524.field7283 == null) {
            if (class325.field4675.method3186((byte) 57, class242.field3515) && class325.field4675.method3186((byte) 57, class146.field2248)) {
                class430.field6278 = arg1.method548(class518.method2922(class325.field4675, class242.field3515, 0), true);
                class518 var7 = class518.method2922(class325.field4675, class146.field2248, 0);
                class524.field7283 = arg1.method548(var7, true);
                var7.method2926();
                class66.field1011 = arg1.method548(var7, true);
            } else {
                arg1.method653(var2, var3, var4, var6, class304.field4389 | 255 - class519.field7204 << 24, 1);
            }
        }
        if (class430.field6278 != null && class524.field7283 != null) {
            int var8 = (var4 - (class524.field7283.method962() * 2)) / class430.field6278.method962();
            for (int var9 = 0; var9 < var8; var9++) {
                class430.field6278.method953(var2 + class524.field7283.method962() + (var9 * class430.field6278.method962()), var3);
            }
            class524.field7283.method953(var2, var3);
            class66.field1011.method953(var2 + var4 - class66.field1011.method962(), var3);
        }
        class273.field3996.method1642(-1, (byte) 79, var2 + 3, var3 + 14, class291.field4210.method3220(false, class538.field7500), class629.field8847 | 0xFF000000);
        arg1.method653(var2, var3 + var6, var4, var5 - var6, -class519.field7204 + 255 << 24 | class304.field4389, 1);
        int var10 = class619.field8735.method1614((byte) -46);
        int var11 = class619.field8735.method1607((byte) -78);
        int var12 = 0;
        for (class587 var13 = (class587) class432.field6356.method427(true); var13 != null; var13 = (class587) class432.field6356.method420(false)) {
            int var31 = (class480.field6825 - var12 - 1) * 16 + (var3 - (-var6 - 13));
            if (var2 < var10 && var10 < var2 + var4 && (var31 - 13) < var11 && var11 < var31 + 4 && var13.field8362) {
                arg1.method653(var2, var31 - 12, var4, 16, 255 - class35.field474 << 24 | class399.field5942, 1);
            }
            var12++;
        }
        if ((class631.field8866 == null || class78.field1416 == null || class98.field1706 == null) && class325.field4675.method3186((byte) 57, class141.field2209) && class325.field4675.method3186((byte) 57, class392.field5856) && class325.field4675.method3186((byte) 57, class112.field1865)) {
            class518 var14 = class518.method2922(class325.field4675, class392.field5856, 0);
            class78.field1416 = arg1.method548(var14, true);
            var14.method2926();
            class574.field8177 = arg1.method548(var14, true);
            class631.field8866 = arg1.method548(class518.method2922(class325.field4675, class141.field2209, 0), true);
            class518 var15 = class518.method2922(class325.field4675, class112.field1865, 0);
            class98.field1706 = arg1.method548(var15, true);
            var15.method2926();
            class544.field7579 = arg1.method548(var15, true);
        }
        if (class631.field8866 != null && class78.field1416 != null && class98.field1706 != null) {
            int var16 = (var4 - (class98.field1706.method962() * 2)) / class631.field8866.method962();
            for (int var17 = 0; var17 < var16; var17++) {
                class631.field8866.method953(var2 + class98.field1706.method962() + (var17 * class631.field8866.method962()), -class631.field8866.method968() + var3 + var5);
            }
            int var18 = (var5 - (var6 + class98.field1706.method968())) / class78.field1416.method968();
            for (int var19 = 0; var19 < var18; var19++) {
                class78.field1416.method953(var2, class78.field1416.method968() * var19 + var6 + var3);
                class574.field8177.method953(var2 + var4 - class574.field8177.method962(), var3 - -var6 + class78.field1416.method968() * var19);
            }
            class98.field1706.method953(var2, var5 + var3 - class98.field1706.method968());
            class544.field7579.method953(var2 + var4 - class98.field1706.method962(), var5 + (var3 - class98.field1706.method968()));
        }
        int var20 = 0;
        for (class587 var21 = (class587) class432.field6356.method427(true); var21 != null; var21 = (class587) class432.field6356.method420(false)) {
            int var22 = (class480.field6825 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class629.field8847 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && (var22 - 13) < var11 && (var22 + 4) > var11 && var21.field8362) {
                var23 = class168.field2452 | 0xFF000000;
            }
            int[] var24 = null;
            if (class458.method2682(var21.field8359, true)) {
                var24 = class611.field8684.method1621((byte) -89, (int) var21.field8365).field5666;
            } else if (var21.field8368 != -1) {
                var24 = class611.field8684.method1621((byte) 99, var21.field8368).field5666;
            } else if (class393.method2383(-23131, var21.field8359)) {
                class181 var25 = (class181) class432.field6368.method740(arg0 ^ 0xFFFF87D6, (long) ((int) var21.field8365));
                if (var25 != null) {
                    class170 var26 = var25.field2623;
                    class432 var27 = var26.field2492;
                    if (var27.field6304 != null) {
                        var27 = var27.method2582(arg0 + 30762, class401.field6001);
                    }
                    if (var27 != null) {
                        var24 = var27.field6342;
                    }
                }
            } else if (class36.method315(48, var21.field8359)) {
                Object var28 = null;
                class370 var29;
                if (var21.field8359 == 1004) {
                    var29 = class552.field7819.method2890(0, (int) var21.field8365);
                } else {
                    var29 = class552.field7819.method2890(0, (int) (var21.field8365 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field5272 != null) {
                    var29 = var29.method2238((byte) 38, class401.field6001);
                }
                if (var29 != null) {
                    var24 = var29.field5301;
                }
            }
            String var30 = class215.method1459(-82, var21);
            if (var24 != null) {
                var30 = var30 + class347.method2106(var24, arg0 ^ 0x7865);
            }
            class273.field3996.method1637(class144.field2231, class158.field2366, var30, (byte) 121, var23, 0, var2 + 3, var22);
            if (var21.field8358) {
                class202.field2849.method953(class26.field358.method3651(-10408, var30) + var2 + 5, var22 - 12);
            }
            var20++;
        }
        if (arg0 != -30762) {
            method2721((byte) 81);
        }
        class235.method1525(class270.field3975, class6.field49, class354.field5064, (byte) -121, class526.field7324);
    }

    static {
        new class567("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6762 = -1;
        field6761 = 1;
    }
}
