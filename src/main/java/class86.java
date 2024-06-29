import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class86 {

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "Lqr;")
    private class65 field1037 = new class65(64);

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "Lqr;")
    private class65 field1039 = new class65(100);

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "Lwu;")
    private class376 field1036;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "Lnha;")
    public static class326 field1038 = new class326(14, 0);

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "Lnha;")
    public static class326 field1041 = new class326(15, 4);

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "Lnha;")
    public static class326 field1042 = new class326(16, -2);

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "Lnha;")
    public static class326 field1043 = new class326(17, 0);

    @OriginalMember(owner = "client!vga", name = "n", descriptor = "Lnha;")
    public static class326 field1044 = new class326(18, -2);

    @OriginalMember(owner = "client!vga", name = "o", descriptor = "Lnha;")
    public static class326 field1045 = new class326(19, -2);

    @OriginalMember(owner = "client!vga", name = "p", descriptor = "Lnha;")
    public static class326 field1046 = new class326(22, -2);

    @OriginalMember(owner = "client!vga", name = "q", descriptor = "Lnha;")
    public static class326 field1047 = new class326(23, 4);

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "Lnha;")
    public static class326 field1048 = new class326(24, -1);

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "Lnha;")
    public static class326 field1049 = new class326(26, 0);

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "Lnha;")
    public static class326 field1050 = new class326(27, 0);

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "Lnha;")
    public static class326 field1051 = new class326(28, -2);

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "[Lnha;")
    private static class326[] field1052 = new class326[32];

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
    public static int field1040;

    static {
        class326[] var0 = class194.method1328(1376312589);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1052[var0[var1].field4660] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V", line = 5)
    public final void method657(int arg0, int arg1) {
        class65 var3 = this.field1037;
        synchronized (this.field1037) {
            this.field1037.method553(arg0, -15782);
        }
        field1035++;
        class65 var4 = this.field1039;
        synchronized (this.field1039) {
            this.field1039.method553(arg0, arg1 - 6075);
        }
        if (arg1 != -9707) {
            this.method663((byte) 125, 120);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lha;III)V", line = 23)
    public static final void method658(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -284797828) {
            method658(null, -118, 11, -79);
        }
        field1031++;
        if (arg2 < 0 || arg1 < 0 || class87.field1055 == 0 || class307.field4419 == 0) {
            return;
        }
        class333 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class24.field412) {
            class365.method2160(false, 4734);
            var4 = arg0.method474();
            int[] var5 = arg0.method469();
            var6 = var5[1];
            var7 = var5[2];
            var8 = var5[3];
            var9 = var5[0];
            var10 = arg2 + class146.method1104(-1, false);
            var11 = arg1 + class183.method1267(false, false);
        } else {
            arg0.method445(class687.field9582, class668.field9126, class87.field1055, class307.field4419);
            var6 = class668.field9126;
            var9 = class687.field9582;
            var8 = class307.field4419;
            var7 = class87.field1055;
            arg0.method419(class517.field6906, class117.field1892, class87.field1055, class307.field4419);
            var4 = arg0.method421();
            var4.method1715(class88.field1076, class193.field2907, class727.field10095, class26.field426, class642.field8541, class299.field4250);
            var10 = arg2;
            var11 = arg1;
            arg0.method481(var4);
        }
        class394.method2328(true, (byte) -49);
        if (var8 == 0) {
            var8 = 1;
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (class113.field1866 != null && (!class142.field2268 || (class575.field7557 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg0.method424();
            int var15 = arg0.method402();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class540.field7159) {
                var17 = var16 = (var10 - var9) * class100.field1358 / var7;
                var19 = var18 = (var11 - var6) * class100.field1358 / var8;
            } else {
                var19 = (var11 - var6) * var14 / var8;
                var18 = (var11 - var6) * var15 / var8;
                var16 = (var10 - var9) * var15 / var7;
                var17 = (var10 - var9) * var14 / var7;
            }
            int[] var20 = new int[] { var17, var19, var14 };
            var4.method1709(var20);
            int[] var21 = new int[] { var16, var18, var15 };
            var4.method1709(var21);
            float var22 = class614.method3344((float) var21[0], 4, (float) var20[2], (float) var21[2], (float) var21[1], (float) var20[0], (float) var20[1], 0);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class472.field6475.method2256(-1) - 1 << 8) >> 9;
                var13 = var26 + (class472.field6475.method2256(-1) - 1 << 8) >> 9;
                byte var27 = class472.field6475.field3508;
                if (var27 < 3 && (class184.field2782[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class142.field2268 && (class575.field7557 & 0x40) != 0) {
                    class672 var28 = class239.method1503(class649.field8631, class136.field2168, 0);
                    if (var28 == null) {
                        class617.method3377((byte) 101);
                    } else {
                        class586.method3203(true, (long) (var12 << 0 | var13), 0L, true, var13, 21, false, -1, class414.field5733, class719.field10008, (byte) 87, " ->", var12);
                    }
                } else {
                    if (class635.field8451) {
                        class586.method3203(true, (long) (var13 | var12 << 0), 0L, true, var13, 2, false, -1, -1, class517.field6867.method2877(class713.field9854, (byte) -108), (byte) 87, "", var12);
                    }
                    class586.method3203(true, (long) (var13 | var12 << 0), 0L, true, var13, 45, false, -1, class721.field10041, class643.field8558, (byte) 87, "", var12);
                    class418.field5765++;
                }
            }
        }
        if (class24.field412) {
            class423.method2450(false);
        }
        for (int var29 = 0; var29 < (class24.field412 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class689 var31 = var30 ? class277.field3864 : class273.field3803;
            int var32 = arg2;
            int var33 = arg1;
            if (class24.field412) {
                class365.method2160(var30, arg3 ^ 0xEF064602);
                var32 = arg2 + class146.method1104(-1, var30);
                var33 = arg1 + class183.method1267(var30, false);
            }
            class687 var34 = var31.field9586;
            for (class733 var35 = (class733) var34.method3874((byte) 23); var35 != null; var35 = (class733) var34.method3868(-24951)) {
                if ((class613.field8161 || class472.field6475.field3508 == var35.field10152.field3508) && var35.method4101(-73, var32, arg0, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field10152 instanceof class675) {
                        var38 = ((class675) var35.field10152).field9354;
                        var39 = ((class675) var35.field10152).field9367;
                    } else {
                        var38 = var35.field10152.field3502 >> 9;
                        var39 = var35.field10152.field3505 >> 9;
                    }
                    if (var35.field10152 instanceof class383) {
                        class383 var40 = (class383) var35.field10152;
                        int var41 = var40.method2256(arg3 ^ 0x10F9AB83);
                        if ((var41 & 0x1) == 0 && (var40.field3505 & 0x1FF) == 0 && (var40.field3502 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field3505 & 0x1FF) == 256 && (var40.field3502 & 0x1FF) == 256) {
                            int var42 = var40.field3505 - (var40.method2256(-1) - 1 << 8);
                            int var43 = var40.field3502 - (var40.method2256(-1) - 1 << 8);
                            for (int var44 = 0; var44 < class306.field4404; var44++) {
                                class134 var51 = (class134) class390.field5470.method2135((long) class628.field8351[var44], (byte) 31);
                                if (var51 != null) {
                                    class556 var52 = var51.field2154;
                                    if (class29.field474 != var52.field10221 && var52.field10252) {
                                        int var53 = var52.field3505 - (var52.field7328.field2544 - 1 << 8);
                                        int var54 = var52.field3502 - (var52.field7328.field2544 - 1 << 8);
                                        if (var53 >= var42 && var52.field7328.field2544 <= var40.method2256(arg3 + 284797827) - (var53 - var42 >> 9) && var43 <= var54 && var52.field7328.field2544 <= var40.method2256(-1) - (var54 - var43 >> 9)) {
                                            class603.method3281(true, var52, class472.field6475.field3508 != var35.field10152.field3508);
                                            var52.field10221 = class29.field474;
                                        }
                                    }
                                }
                            }
                            int var45 = class586.field7665;
                            int[] var46 = class20.field351;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class383 var48 = class248.field3438[var46[var47]];
                                if (var48 != null && class29.field474 != var48.field10221 && var40 != var48 && var48.field10252) {
                                    int var49 = var48.field3505 - (var48.method2256(-1) - 1 << 8);
                                    int var50 = var48.field3502 - (var48.method2256(arg3 ^ 0x10F9AB83) - 1 << 8);
                                    if (var49 >= var42 && var48.method2256(-1) <= (var40.method2256(-1) - (var49 - var42 >> 9)) && var50 >= var43 && var48.method2256(arg3 ^ 0x10F9AB83) <= (var40.method2256(-1) - (var50 - var43 >> 9))) {
                                        class512.method2860(var48, 0, class472.field6475.field3508 != var35.field10152.field3508);
                                        var48.field10221 = class29.field474;
                                    }
                                }
                            }
                        }
                        if (class29.field474 == var40.field10221) {
                            continue;
                        }
                        class512.method2860(var40, 0, class472.field6475.field3508 != var35.field10152.field3508);
                        var40.field10221 = class29.field474;
                    }
                    if (var35.field10152 instanceof class556) {
                        class556 var55 = (class556) var35.field10152;
                        if (var55.field7328 != null) {
                            if ((var55.field7328.field2544 & 0x1) == 0 && (var55.field3505 & 0x1FF) == 0 && (var55.field3502 & 0x1FF) == 0 || (var55.field7328.field2544 & 0x1) == 1 && (var55.field3505 & 0x1FF) == 256 && (var55.field3502 & 0x1FF) == 256) {
                                int var56 = var55.field3505 - (var55.field7328.field2544 - 1 << 8);
                                int var57 = var55.field3502 - (var55.field7328.field2544 - 1 << 8);
                                for (int var58 = 0; var58 < class306.field4404; var58++) {
                                    class134 var65 = (class134) class390.field5470.method2135((long) class628.field8351[var58], (byte) 31);
                                    if (var65 != null) {
                                        class556 var66 = var65.field2154;
                                        if (class29.field474 != var66.field10221 && var55 != var66 && var66.field10252) {
                                            int var67 = var66.field3505 - (var66.field7328.field2544 - 1 << 8);
                                            int var68 = var66.field3502 - (var66.field7328.field2544 - 1 << 8);
                                            if (var67 >= var56 && (var55.field7328.field2544 - (var67 - var56 >> 9)) >= var66.field7328.field2544 && var57 <= var68 && (var55.field7328.field2544 - (var68 - var57 >> 9)) >= var66.field7328.field2544) {
                                                class603.method3281(true, var66, class472.field6475.field3508 != var35.field10152.field3508);
                                                var66.field10221 = class29.field474;
                                            }
                                        }
                                    }
                                }
                                int var59 = class586.field7665;
                                int[] var60 = class20.field351;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class383 var62 = class248.field3438[var60[var61]];
                                    if (var62 != null && class29.field474 != var62.field10221 && var62.field10252) {
                                        int var63 = var62.field3505 - (var62.method2256(-1) - 1 << 8);
                                        int var64 = var62.field3502 - (var62.method2256(arg3 + 284797827) - 1 << 8);
                                        if (var56 <= var63 && var62.method2256(-1) <= var55.field7328.field2544 - (var63 - var56 >> 9) && var64 >= var57 && var62.method2256(-1) <= var55.field7328.field2544 - (var64 - var57 >> 9)) {
                                            class512.method2860(var62, 0, class472.field6475.field3508 != var35.field10152.field3508);
                                            var62.field10221 = class29.field474;
                                        }
                                    }
                                }
                            }
                            if (class29.field474 == var55.field10221) {
                                continue;
                            }
                            class603.method3281(true, var55, class472.field6475.field3508 != var35.field10152.field3508);
                            var55.field10221 = class29.field474;
                        }
                    }
                    if (var35.field10152 instanceof class227) {
                        int var69 = class503.field6752 + var39;
                        int var70 = var38 + class334.field4757;
                        class635 var71 = (class635) class649.field8627.method2135((long) (var69 | var35.field10152.field3508 << 28 | var70 << 14), (byte) 31);
                        if (var71 != null) {
                            int var72 = 0;
                            class11 var73 = (class11) var71.field8446.method12(0);
                            while (var73 != null) {
                                class597 var74 = class77.field948.method1165((byte) 81, var73.field179);
                                if (class142.field2268 && class472.field6475.field3508 == var35.field10152.field3508) {
                                    class62 var75 = class495.field6680 == -1 ? null : class505.field6754.method4149(-6119, class495.field6680);
                                    if ((class575.field7557 & 0x1) != 0 && (var75 == null || var74.method3259(var75.field761, -1, class495.field6680) != var75.field761)) {
                                        class392.field5474++;
                                        class586.method3203(true, (long) var72, (long) var73.field179, false, var38, 44, false, -1, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> <col=ff9040>" + var74.field7763, var39);
                                    }
                                }
                                if (class472.field6475.field3508 == var35.field10152.field3508) {
                                    String[] var76 = var74.field7765;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 19;
                                            }
                                            int var79 = class456.field6235;
                                            if (var77 == 1) {
                                                var78 = 15;
                                            }
                                            if (var77 == 2) {
                                                var78 = 57;
                                            }
                                            if (var77 == 3) {
                                                var78 = 50;
                                            }
                                            if (var74.field7789 == var77) {
                                                var79 = var74.field7795;
                                            }
                                            if (var77 == 4) {
                                                var78 = 12;
                                            }
                                            if (var74.field7759 == var77) {
                                                var79 = var74.field7764;
                                            }
                                            class423.field5832++;
                                            class586.method3203(true, (long) var72, (long) var73.field179, false, var38, var78, false, -1, var79, var76[var77], (byte) 87, "<col=ff9040>" + var74.field7763, var39);
                                        }
                                    }
                                }
                                class586.method3203(true, (long) var72, (long) var73.field179, false, var38, 1011, class472.field6475.field3508 != var35.field10152.field3508, -1, class339.field4797, class517.field6862.method2877(class713.field9854, (byte) -108), (byte) 87, "<col=ff9040>" + var74.field7763, var39);
                                class698.field9709++;
                                var73 = (class11) var71.field8446.method22(arg3 + 284815661);
                                var72++;
                            }
                        }
                    }
                    if (var35.field10152 instanceof class624) {
                        class624 var80 = (class624) var35.field10152;
                        class100 var81 = class462.field6333.method2008((byte) -74, var80.method1759((byte) 74));
                        if (var81.field1307 != null) {
                            var81 = var81.method748(class74.field901, arg3 ^ 0xEF065407);
                        }
                        if (var81 != null) {
                            if (class142.field2268 && class472.field6475.field3508 == var35.field10152.field3508) {
                                class62 var82 = class495.field6680 == -1 ? null : class505.field6754.method4149(-6119, class495.field6680);
                                if ((class575.field7557 & 0x4) != 0 && (var82 == null || var81.method740(-112, var82.field761, class495.field6680) != var82.field761)) {
                                    class59.field712++;
                                    class586.method3203(true, (long) var80.hashCode(), class637.method3493(var80, var38, 778239700, var39), false, var38, 46, false, -1, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> <col=00ffff>" + var81.field1273, var39);
                                }
                            }
                            if (class472.field6475.field3508 == var35.field10152.field3508) {
                                String[] var83 = var81.field1333;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            int var86 = class456.field6235;
                                            if (var84 == 0) {
                                                var85 = 16;
                                            }
                                            if (var84 == 1) {
                                                var85 = 4;
                                            }
                                            if (var84 == 2) {
                                                var85 = 49;
                                            }
                                            if (var84 == 3) {
                                                var85 = 10;
                                            }
                                            if (var81.field1347 == var84) {
                                                var86 = var81.field1360;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1008;
                                            }
                                            if (var81.field1317 == var84) {
                                                var86 = var81.field1329;
                                            }
                                            class513.field6811++;
                                            class586.method3203(true, (long) var80.hashCode(), class637.method3493(var80, var38, 778239700, var39), false, var38, var85, false, -1, var86, var83[var84], (byte) 87, "<col=00ffff>" + var81.field1273, var39);
                                        }
                                    }
                                }
                                class746.field10379++;
                                class586.method3203(true, (long) var80.hashCode(), (long) var81.field1301, false, var38, 1009, class472.field6475.field3508 != var35.field10152.field3508, -1, class339.field4797, class517.field6862.method2877(class713.field9854, (byte) -108), (byte) 87, "<col=00ffff>" + var81.field1273, var39);
                            }
                        }
                    }
                }
            }
            if (class24.field412) {
                class423.method2450(false);
            }
        }
        class394.method2328(false, (byte) 126);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 574)
    public static void method659(byte arg0) {
        field1042 = null;
        field1047 = null;
        if (arg0 != -90) {
            method659((byte) 23);
        }
        field1051 = null;
        field1043 = null;
        field1046 = null;
        field1044 = null;
        field1048 = null;
        field1052 = null;
        field1041 = null;
        field1049 = null;
        field1050 = null;
        field1045 = null;
        field1038 = null;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V", line = 596)
    public final void method660(boolean arg0) {
        field1040++;
        if (arg0) {
            method659((byte) 56);
        }
        class65 var2 = this.field1037;
        synchronized (this.field1037) {
            this.field1037.method558(0);
        }
        class65 var3 = this.field1039;
        synchronized (this.field1039) {
            this.field1039.method558(0);
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Lbe;", line = 615)
    public final class37 method661(int arg0, int arg1) {
        field1034++;
        class65 var3 = this.field1039;
        synchronized (this.field1039) {
            class37 var4 = (class37) this.field1039.method552(4, (long) arg1);
            if (var4 == null) {
                var4 = new class37(arg1);
                this.field1039.method556((byte) 0, (long) arg1, var4);
            }
            if (arg0 >= -18) {
                return null;
            } else if (var4.method297(0)) {
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 642)
    public final void method662(int arg0) {
        class65 var2 = this.field1037;
        synchronized (this.field1037) {
            this.field1037.method561((byte) -78);
        }
        if (arg0 != -1) {
            this.field1036 = null;
        }
        field1032++;
        class65 var3 = this.field1039;
        synchronized (this.field1039) {
            this.field1039.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BI)Lla;", line = 659)
    public final class456 method663(byte arg0, int arg1) {
        field1033++;
        class65 var3 = this.field1037;
        class456 var4;
        synchronized (this.field1037) {
            var4 = (class456) this.field1037.method552(arg0 + 94, (long) arg1);
            if (arg0 != -90) {
                method659((byte) -50);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field1036;
        byte[] var6;
        synchronized (this.field1036) {
            var6 = this.field1036.method2218((byte) 116, class724.method4078(7600775, arg1), class571.method3148((byte) 37, arg1));
        }
        class456 var7 = new class456();
        var7.field6236 = this;
        var7.field6232 = arg1;
        if (var6 != null) {
            var7.method2592(new class677(var6), arg0 + 90);
        }
        var7.method2593((byte) 72);
        class65 var8 = this.field1037;
        synchronized (this.field1037) {
            this.field1037.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lms;ILwu;Lwu;Lwu;)V", line = 704)
    public class86(class763 arg0, int arg1, class376 arg2, class376 arg3, class376 arg4) {
        this.field1036 = arg2;
        if (this.field1036 != null) {
            int var6 = this.field1036.method2198(0) - 1;
            this.field1036.method2195(var6, 0);
        }
        class75.method609((byte) 94, 2, arg4, arg3);
    }
}
