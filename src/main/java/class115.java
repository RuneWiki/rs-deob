import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class115 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Llu;")
    public static class610 field1614 = new class610(46, 7);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lada;")
    public static class144 field1621 = new class144(99, 7);

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lh;")
    public static class572 field1623 = new class572(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "J")
    public static long field1611;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
    public boolean field1612;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lr;IIII)Lpl;")
    public static final class558 method826(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1613++;
        if (arg0 == null) {
            return null;
        } else {
            if (arg2 != 21979) {
                method826(null, 113, -103, 63, 98);
            }
            return new class558(arg1, arg4, arg3, arg0.method62(), arg0.method85(), arg0.method58(), arg0.method86(), arg0.method88(), arg0.method81(), arg0.method68());
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
    public static final void method827(int arg0, boolean arg1) {
        if (arg0 != 15141) {
            field1623 = null;
        }
        while (class632.field9278.method3423(8, class333.field4615) >= 15) {
            int var2 = class632.field9278.method3417(15, (byte) -86);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class505 var4 = (class505) class510.field7260.method2799((long) var2, true);
            if (var4 == null) {
                class571 var5 = new class571();
                var5.field1904 = var2;
                var4 = new class505(var5);
                class510.field7260.method2797(-4234, var4, (long) var2);
                class57.field718[class599.field8840++] = var4;
                var3 = true;
            }
            class571 var6 = var4.field7148;
            class634.field9290[class527.field7717++] = var2;
            var6.field1897 = class617.field9123;
            if (var6.field8405 != null && var6.field8405.method650(128)) {
                class396.method2353(var6, 1840068472);
            }
            int var7 = class632.field9278.method3417(3, (byte) -86) + 4 << 11 & 0x3EE1;
            int var8 = class632.field9278.method3417(1, (byte) -86);
            if (var8 == 1) {
                class444.field5987[class427.field5745++] = var2;
            }
            int var9;
            if (arg1) {
                var9 = class632.field9278.method3417(8, (byte) -86);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class632.field9278.method3417(5, (byte) -86);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = class632.field9278.method3417(2, (byte) -86);
            int var11;
            if (arg1) {
                var11 = class632.field9278.method3417(8, (byte) -86);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = class632.field9278.method3417(5, (byte) -86);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            var6.method3405(class64.field797.method1177(class632.field9278.method3417(14, (byte) -86), false), 44);
            int var12 = class632.field9278.method3417(1, (byte) -86);
            var6.method958(4, var6.field8405.field1237);
            var6.field1851 = var6.field8405.field1247 << 3;
            if (var3) {
                var6.method941(true, var7, (byte) 66);
            }
            var6.method3404(arg0 ^ 0x3B46, class541.field8119.field1955[0] + var11, var6.method940(-1), var12 == 1, var10, class541.field8119.field1957[0] + var9);
            if (var6.field8405.method650(128)) {
                class300.method1836((byte) 50, var6, null, var6.field8501, null, var6.field1957[0], var6.field1955[0], 0);
            }
        }
        field1620++;
        class632.field9278.method3421(124);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field1623 = null;
        field1621 = null;
        if (arg0 == 22) {
            field1614 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method829(class208 arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class193.field2864 = arg0;
        class190.field2820 = arg1;
        class130.field1800 = arg3;
        class330.field4555 = class193.field2864.method513() > 0;
        class297.field4092 = arg4 >> field1626;
        class18.field169 = arg6 >> field1626;
        class103.field1488 = arg4;
        class311.field4288 = arg6;
        class85.field1215 = arg5;
        class583.field8555 = class297.field4092 - class504.field7141;
        if (class583.field8555 < 0) {
            class477.field6774 = -class583.field8555;
            class583.field8555 = 0;
        } else {
            class477.field6774 = 0;
        }
        class334.field4628 = class18.field169 - class504.field7141;
        if (class334.field4628 < 0) {
            class365.field5035 = -class334.field4628;
            class334.field4628 = 0;
        } else {
            class365.field5035 = 0;
        }
        class162.field2557 = class504.field7141 + class297.field4092;
        if (class162.field2557 > class145.field2083) {
            class162.field2557 = class145.field2083;
        }
        class140.field1987 = class504.field7141 + class18.field169;
        if (class140.field1987 > class384.field5282) {
            class140.field1987 = class384.field5282;
        }
        for (int var18 = 0; var18 < class504.field7141 + class504.field7141 + 2; var18++) {
            for (int var23 = 0; var23 < class504.field7141 + class504.field7141 + 2; var23++) {
                int var24 = class297.field4092 + var18 - class504.field7141;
                int var25 = class18.field169 + var23 - class504.field7141;
                if (var24 >= 0 && var25 >= 0 && var24 < class145.field2083 && var25 < class384.field5282) {
                    int var26 = var24 << field1626;
                    int var27 = var25 << field1626;
                    int var28 = class207.field3077[class207.field3077.length - 1].method1239(var24, var25) - (0x3E8 << field1626 - 7);
                    int var29 = class114.field1609 == null ? class207.field3077[0].method1239(var24, var25) + class96.field1409 : class114.field1609[0].method1239(var24, var25) + class96.field1409;
                    class25.field245[var18][var23] = class193.field2864.method496(var26, var28, var27, var26, var29, var27);
                } else {
                    class25.field245[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class504.field7141 + class504.field7141 + 1; var19++) {
            for (int var22 = 0; var22 < class504.field7141 + class504.field7141 + 1; var22++) {
                class222.field3230[var19][var22] = class25.field245[var19][var22] || class25.field245[var19 + 1][var22] || class25.field245[var19][var22 + 1] || class25.field245[var19 + 1][var22 + 1];
            }
        }
        class449.field6303 = arg8;
        class638.field9314 = arg9;
        class358.field4871 = arg10;
        class584.field8591 = arg11;
        client.field3621 = arg12;
        class234.method1494();
        class452.method2746(true, class193.field2864);
        for (class77 var20 = (class77) class42.field491.method2233(true); var20 != null; var20 = (class77) class42.field491.method2240(16772)) {
            var20.method1783((byte) -26);
            class121.method865(var20, 0);
        }
        if (class330.field4555) {
            for (int var21 = 0; var21 < class495.field7041; var21++) {
                class148.field2163[var21].method2475(arg1, -94124895, arg17);
            }
        }
        if (arg2 > 1) {
            class193.field2864.method461(0);
            if (class451.field6356 == null || class451.field6356 instanceof class476) {
                class451.field6356 = new class135();
            }
        } else if (class451.field6356 == null || class451.field6356 instanceof class135) {
            class451.field6356 = new class476();
        }
        class451.field6356.method931(-86, arg2);
        class451.field6356.method938(5126);
        if (class297.field4081 != null) {
            class626.method3663(true);
            class451.field6356.method937(23354, 22);
            class228.method1459(arg2, null, 0, (byte) 0, arg15, arg16);
            class451.field6356.method938(5126);
            class451.field6356.method937(23354, 23);
            class626.method3663(false);
        }
        class228.method1459(arg2, arg7, arg13, arg14, arg15, arg16);
        class451.field6356.method938(5126);
        class451.field6356.method939(119);
        class451.field6356.method938(5126);
        if (arg2 > 1) {
            class193.field2864.method459(0);
        }
        class193.field2864.method429(0, null);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method830(int arg0) {
        if (class465.field6534 >= 0) {
            long var1 = class598.method3538(true);
            class465.field6534 = (int) ((long) class465.field6534 - (var1 - class378.field5212));
            if (class465.field6534 > 0) {
                int var3 = (class465.field6534 << 8) / class585.field8596;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class451.field6369 = ((class387.field5318 & 0xFF00FF) * var3 + ((class583.field8568.field3733 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class387.field5318 & 0xFF00) * var3 + (class583.field8568.field3733 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class198.field2924 = (class583.field8568.field3738 - class403.field5516) * var6 + class403.field5516;
                class149.field2211 = ((class306.field4206 & 0xFF00) * var3 + ((class583.field8568.field3724 & 0xFF00) * var4) & 0xFF0000) + ((class306.field4206 & 0xFF00FF) * var3 + (class583.field8568.field3724 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class644.field9377 = (class583.field8568.field3728 - class227.field3314) * var6 + class227.field3314;
                class138.field1966 = (class583.field8568.field3729 - class234.field3385) * var6 + class234.field3385;
                class630.field9259 = (class583.field8568.field3727 - class11.field107) * var6 + class11.field107;
                field1625 = class113.field1593 * var3 + class583.field8568.field3737 * var4 >> 8;
                class377.field5205 = (class583.field8568.field3736 - class253.field3655) * var6 + class253.field3655;
                class168.field2630 = (class583.field8568.field3722 - class484.field6900) * var6 + class484.field6900;
                if (class216.field3176 != class583.field8568.field3726) {
                    class584.field8576 = class58.field738.method439(class216.field3176, class583.field8568.field3726, var6, class584.field8576);
                }
            } else {
                class465.field6534 = -1;
                field1625 = class583.field8568.field3737;
                class198.field2924 = class583.field8568.field3738;
                class644.field9377 = class583.field8568.field3728;
                class451.field6369 = class583.field8568.field3733;
                class377.field5205 = class583.field8568.field3736;
                class168.field2630 = class583.field8568.field3722;
                class138.field1966 = class583.field8568.field3729;
                class630.field9259 = class583.field8568.field3727;
                class584.field8576 = class583.field8568.field3726;
                class149.field2211 = class583.field8568.field3724;
            }
            class378.field5212 = var1;
        }
        field1619++;
        if (arg0 != 7) {
            method828((byte) -40);
        }
    }
}
