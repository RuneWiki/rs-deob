import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class790 {

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "Loo;")
    private class652 field10838 = new class652(64);

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "Loo;")
    public class652 field10842 = new class652(64);

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "Lwia;")
    private class791 field10841;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "Lwia;")
    public class791 field10839;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field10831 = 1401;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10834;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field10836;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    public final void method4320(byte arg0) {
        field10840++;
        class652 var2 = this.field10838;
        synchronized (this.field10838) {
            this.field10838.method3743(8);
        }
        class652 var3 = this.field10842;
        synchronized (this.field10842) {
            this.field10842.method3743(8);
            int var4 = 44 / ((55 - arg0) / 56);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V")
    public final void method4321(int arg0, int arg1, int arg2) {
        field10837++;
        this.field10838 = new class652(arg1);
        if (arg0 != 1) {
            this.field10841 = null;
        }
        this.field10842 = new class652(arg2);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
    public static final void method4322(byte arg0) {
        if (class640.field8968 >= 0) {
            long var1 = class459.method2731(118);
            class640.field8968 = (int) ((long) class640.field8968 - (var1 - class619.field8647));
            if (class640.field8968 <= 0) {
                class670.field9310 = class772.field10604.field1730;
                class720.field9970 = class772.field10604.field1745;
                class585.field8271 = class772.field10604.field1741;
                class277.field4036 = class772.field10604.field1732;
                class276.field3998 = class772.field10604.field1735;
                class439.field5915 = class772.field10604.field1740;
                class650.field9076 = class772.field10604.field1742;
                class445.field6062 = class772.field10604.field1731;
                class603.field8445 = class772.field10604.field1743;
                class640.field8968 = -1;
                class472.field6627 = class772.field10604.field1739;
            } else {
                int var3 = (class640.field8968 << 8) / class776.field10669;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class603.field8445 = ((class27.field404 & 0xFF00) * var3 + (class772.field10604.field1743 & 0xFF00) * var4 & 0xFF0000) + ((class27.field404 & 0xFF00FF) * var3 + (class772.field10604.field1743 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class445.field6062 = ((class569.field8031 & 0xFF00FF) * var3 + (class772.field10604.field1731 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class569.field8031 & 0xFF00) * var3 + (class772.field10604.field1731 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class650.field9076 = (class772.field10604.field1742 - class762.field10496) * var6 + class762.field10496;
                class472.field6627 = (class772.field10604.field1739 - class310.field4430) * var6 + class310.field4430;
                class277.field4036 = (class772.field10604.field1732 - class419.field5732) * var6 + class419.field5732;
                class670.field9310 = (class772.field10604.field1730 - class439.field5931) * var6 + class439.field5931;
                class276.field3998 = class254.field3732 * var3 + class772.field10604.field1735 * var4 >> 8;
                class439.field5915 = (class772.field10604.field1740 - class718.field9952) * var6 + class718.field9952;
                class585.field8271 = (class772.field10604.field1741 - class157.field2523) * var6 + class157.field2523;
                if (class630.field8830 != class772.field10604.field1745) {
                    class720.field9970 = class274.field3951.method470(class630.field8830, class772.field10604.field1745, var6, class720.field9970);
                }
            }
            class619.field8647 = var1;
        }
        if (arg0 > 54) {
            field10833++;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static final void method4323(int arg0) {
        class474.field6644.method3735(2);
        field10830++;
        if (arg0 != 12923) {
            method4323(71);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
    public final void method4324(int arg0) {
        field10835++;
        class652 var2 = this.field10838;
        synchronized (this.field10838) {
            this.field10838.method3735(2);
        }
        class652 var3 = this.field10842;
        synchronized (this.field10842) {
            this.field10842.method3735(2);
            if (arg0 != -1) {
                method4322((byte) -95);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
    public final void method4325(int arg0, int arg1) {
        field10834++;
        int var3 = 111 / ((arg1 + 24) / 36);
        class652 var4 = this.field10838;
        synchronized (this.field10838) {
            this.field10838.method3741(arg0, 0);
        }
        class652 var5 = this.field10842;
        synchronized (this.field10842) {
            this.field10842.method3741(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Llr;")
    public final class784 method4326(int arg0, int arg1) {
        field10832++;
        class652 var3 = this.field10838;
        class784 var4;
        synchronized (this.field10838) {
            var4 = (class784) this.field10838.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field10841;
        byte[] var6;
        synchronized (this.field10841) {
            var6 = this.field10841.method4339(arg1, 0, arg0);
        }
        class784 var7 = new class784();
        var7.field10768 = this;
        if (var6 != null) {
            var7.method4295(1047, new class494(var6));
        }
        class652 var8 = this.field10838;
        synchronized (this.field10838) {
            this.field10838.method3739((long) arg1, (byte) 88, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILha;II)V")
    public static final void method4327(int arg0, class65 arg1, int arg2, int arg3) {
        field10836++;
        if (arg3 < 0 || arg2 < 0 || class329.field4573 == 0 || class394.field5430 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class326 var8;
        int var9;
        int var10;
        if (class195.field2997) {
            class626.method3602(false, 0);
            var8 = arg1.method440();
            int[] var11 = arg1.method510();
            var6 = var11[1];
            var5 = var11[3];
            var7 = var11[2];
            var4 = var11[0];
            var9 = arg3 + class478.method2852(102, false);
            var10 = class647.method3710(false, 0) + arg2;
        } else {
            arg1.method503(class789.field10829, class328.field4569, class329.field4573, class394.field5430);
            var4 = class789.field10829;
            var5 = class394.field5430;
            var6 = class328.field4569;
            var7 = class329.field4573;
            arg1.method434(class377.field5199, class298.field4321, class329.field4573, class394.field5430);
            var8 = arg1.method505();
            var8.method1870(class459.field6418, class620.field8725, class445.field6057, class787.field10808, class88.field991, class142.field2102);
            var9 = arg3;
            arg1.method550(var8);
            var10 = arg2;
        }
        class740.method4120(1, true);
        if (var5 == 0) {
            var5 = 1;
        }
        int var12 = -21 / ((arg0 + 8) / 63);
        if (var7 == 0) {
            var7 = 1;
        }
        if (class411.field5572 != null && (!class691.field9660 || (class197.field3008 & 0x40) != 0)) {
            int var13 = -1;
            int var14 = -1;
            int var15 = arg1.method457();
            int var16 = arg1.method513();
            int var17;
            int var18;
            int var19;
            int var20;
            if (class576.field8120) {
                var20 = var17 = (var9 - var4) * class740.field10205 / var7;
                var18 = var19 = (var10 - var6) * class740.field10205 / var5;
            } else {
                var17 = (var9 - var4) * var16 / var7;
                var18 = (var10 - var6) * var15 / var5;
                var19 = (var10 - var6) * var16 / var5;
                var20 = (var9 - var4) * var15 / var7;
            }
            int[] var21 = new int[] { var20, var18, var15 };
            var8.method1896(var21);
            int[] var22 = new int[] { var17, var19, var16 };
            var8.method1896(var22);
            float var23 = class296.method1928((float) var21[1], 4, -20504, (float) var22[2], (float) var21[2], (float) var22[0], (float) var21[0], (float) var22[1]);
            if (var23 > 0.0F) {
                int var24 = var22[0] - var21[0];
                int var25 = var22[2] - var21[2];
                int var26 = (int) ((float) var24 * var23 + (float) var21[0]);
                int var27 = (int) ((float) var25 * var23 + (float) var21[2]);
                var13 = (class210.field3250.method2102(true) - 1 << 8) + var26 >> 9;
                var14 = var27 + (class210.field3250.method2102(true) - 1 << 8) >> 9;
                byte var28 = class210.field3250.field5755;
                if (var28 < 3 && (class190.field2932[1][var26 >> 9][var27 >> 9] & 0x2) != 0) {
                    int var88 = var28 + 1;
                }
            }
            if (var13 != -1 && var14 != -1) {
                if (class691.field9660 && (class197.field3008 & 0x40) != 0) {
                    class451 var29 = class63.method422(class714.field9898, 17492, class497.field7084);
                    if (var29 == null) {
                        class337.method2136(-161);
                    } else {
                        class105.method738(0L, -1, true, " ->", false, class169.field2646, true, var13, (long) (var14 | var13 << 0), var14, (byte) -42, class572.field8070, 51);
                    }
                } else {
                    if (class652.field9117) {
                        class105.method738(0L, -1, true, "", false, -1, true, var13, (long) (var13 << 0 | var14), var14, (byte) -42, class620.field8688.method3580(class140.field2081, 12), 20);
                    }
                    class424.field5794++;
                    class105.method738(0L, -1, true, "", false, class342.field4763, true, var13, (long) (var14 | var13 << 0), var14, (byte) -42, class80.field895, 23);
                }
            }
        }
        if (class195.field2997) {
            class128.method958((byte) 73);
        }
        for (int var30 = 0; var30 < (class195.field2997 ? 2 : 1); var30++) {
            boolean var31 = var30 == 0;
            class397 var32 = var31 ? class510.field7211 : class266.field3875;
            int var33 = arg3;
            int var34 = arg2;
            if (class195.field2997) {
                class626.method3602(var31, 0);
                var33 = arg3 + class478.method2852(109, var31);
                var34 = arg2 + class647.method3710(var31, 0);
            }
            class343 var35 = var32.field5452;
            for (class495 var36 = (class495) var35.method2170(false); var36 != null; var36 = (class495) var35.method2176(-17754)) {
                if ((class127.field1955 || class210.field3250.field5755 == var36.field7063.field5755) && var36.method3006(var34, 56, arg1, var33)) {
                    boolean var37 = false;
                    boolean var38 = false;
                    int var39;
                    int var40;
                    if (var36.field7063 instanceof class672) {
                        var39 = ((class672) var36.field7063).field9364;
                        var40 = ((class672) var36.field7063).field9368;
                    } else {
                        var39 = var36.field7063.field5746 >> 9;
                        var40 = var36.field7063.field5742 >> 9;
                    }
                    if (var36.field7063 instanceof class702) {
                        class702 var41 = (class702) var36.field7063;
                        int var42 = var41.method2102(true);
                        if ((var42 & 0x1) == 0 && (var41.field5742 & 0x1FF) == 0 && (var41.field5746 & 0x1FF) == 0 || (var42 & 0x1) == 1 && (var41.field5742 & 0x1FF) == 256 && (var41.field5746 & 0x1FF) == 256) {
                            int var43 = var41.field5742 - (var41.method2102(true) - 1 << 8);
                            int var44 = var41.field5746 - (var41.method2102(true) - 1 << 8);
                            for (int var45 = 0; var45 < class235.field3545; var45++) {
                                class205 var52 = (class205) class645.field9014.method2242((long) class216.field3356[var45], -1);
                                if (var52 != null) {
                                    class665 var53 = var52.field3181;
                                    if (class192.field2961 != var53.field4601 && var53.field4577) {
                                        int var54 = var53.field5742 - (var53.field9240.field1635 - 1 << 8);
                                        int var55 = var53.field5746 - (var53.field9240.field1635 - 1 << 8);
                                        if (var54 >= var43 && var53.field9240.field1635 <= var41.method2102(true) - (var54 - var43 >> 9) && var55 >= var44 && var53.field9240.field1635 <= (var41.method2102(true) - (var55 - var44 >> 9))) {
                                            class242.method1616(var53, class210.field3250.field5755 != var36.field7063.field5755, 116);
                                            var53.field4601 = class192.field2961;
                                        }
                                    }
                                }
                            }
                            int var46 = class514.field7278;
                            int[] var47 = class522.field7381;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class702 var49 = class767.field10560[var47[var48]];
                                if (var49 != null && class192.field2961 != var49.field4601 && var41 != var49 && var49.field4577) {
                                    int var50 = var49.field5742 - (var49.method2102(true) - 1 << 8);
                                    int var51 = var49.field5746 - (var49.method2102(true) - 1 << 8);
                                    if (var50 >= var43 && var49.method2102(true) <= var41.method2102(true) - (var50 - var43 >> 9) && var44 <= var51 && var49.method2102(true) <= (var41.method2102(true) - (var51 - var44 >> 9))) {
                                        class34.method280(class210.field3250.field5755 != var36.field7063.field5755, (byte) -70, var49);
                                        var49.field4601 = class192.field2961;
                                    }
                                }
                            }
                        }
                        if (class192.field2961 == var41.field4601) {
                            continue;
                        }
                        class34.method280(class210.field3250.field5755 != var36.field7063.field5755, (byte) 109, var41);
                        var41.field4601 = class192.field2961;
                    }
                    if (var36.field7063 instanceof class665) {
                        class665 var56 = (class665) var36.field7063;
                        if (var56.field9240 != null) {
                            if ((var56.field9240.field1635 & 0x1) == 0 && (var56.field5742 & 0x1FF) == 0 && (var56.field5746 & 0x1FF) == 0 || (var56.field9240.field1635 & 0x1) == 1 && (var56.field5742 & 0x1FF) == 256 && (var56.field5746 & 0x1FF) == 256) {
                                int var57 = var56.field5742 - (var56.field9240.field1635 - 1 << 8);
                                int var58 = var56.field5746 - (var56.field9240.field1635 - 1 << 8);
                                for (int var59 = 0; var59 < class235.field3545; var59++) {
                                    class205 var66 = (class205) class645.field9014.method2242((long) class216.field3356[var59], -1);
                                    if (var66 != null) {
                                        class665 var67 = var66.field3181;
                                        if (class192.field2961 != var67.field4601 && var56 != var67 && var67.field4577) {
                                            int var68 = var67.field5742 - (var67.field9240.field1635 - 1 << 8);
                                            int var69 = var67.field5746 - (var67.field9240.field1635 - 1 << 8);
                                            if (var57 <= var68 && (var56.field9240.field1635 - (var68 - var57 >> 9)) >= var67.field9240.field1635 && var58 <= var69 && (var56.field9240.field1635 - (var69 - var58 >> 9)) >= var67.field9240.field1635) {
                                                class242.method1616(var67, class210.field3250.field5755 != var36.field7063.field5755, 59);
                                                var67.field4601 = class192.field2961;
                                            }
                                        }
                                    }
                                }
                                int var60 = class514.field7278;
                                int[] var61 = class522.field7381;
                                for (int var62 = 0; var62 < var60; var62++) {
                                    class702 var63 = class767.field10560[var61[var62]];
                                    if (var63 != null && class192.field2961 != var63.field4601 && var63.field4577) {
                                        int var64 = var63.field5742 - (var63.method2102(true) - 1 << 8);
                                        int var65 = var63.field5746 - (var63.method2102(true) - 1 << 8);
                                        if (var64 >= var57 && var63.method2102(true) <= (var56.field9240.field1635 - (var64 - var57 >> 9)) && var65 >= var58 && var63.method2102(true) <= (var56.field9240.field1635 - (var65 - var58 >> 9))) {
                                            class34.method280(class210.field3250.field5755 != var36.field7063.field5755, (byte) -52, var63);
                                            var63.field4601 = class192.field2961;
                                        }
                                    }
                                }
                            }
                            if (class192.field2961 == var56.field4601) {
                                continue;
                            }
                            class242.method1616(var56, class210.field3250.field5755 != var36.field7063.field5755, 127);
                            var56.field4601 = class192.field2961;
                        }
                    }
                    if (var36.field7063 instanceof class785) {
                        int var70 = class124.field1922 + var40;
                        int var71 = class88.field999 + var39;
                        class102 var72 = (class102) class250.field3692.method2242((long) (var71 << 14 | var36.field7063.field5755 << 28 | var70), -1);
                        if (var72 != null) {
                            int var73 = 0;
                            for (class669 var74 = (class669) var72.field1182.method1733((byte) 87); var74 != null; var74 = (class669) var72.field1182.method1732(false)) {
                                class689 var75 = class313.field4456.method1681(var74.field9305, 115);
                                if (class691.field9660 && class210.field3250.field5755 == var36.field7063.field5755) {
                                    class645 var76 = class474.field6636 == -1 ? null : class184.field2832.method4117((byte) 49, class474.field6636);
                                    if ((class197.field3008 & 0x1) != 0 && (var76 == null || var75.method3883(class474.field6636, (byte) 120, var76.field9011) != var76.field9011)) {
                                        class105.method738((long) var74.field9305, -1, true, class714.field9904 + " -> <col=ff9040>" + var75.field9565, false, class169.field2646, false, var40, (long) var73, var39, (byte) -42, class572.field8070, 48);
                                        class437.field5894++;
                                    }
                                }
                                if (class210.field3250.field5755 == var36.field7063.field5755) {
                                    String[] var77 = var75.field9648;
                                    for (int var78 = 4; var78 >= 0; var78--) {
                                        if (var77 != null && var77[var78] != null) {
                                            byte var79 = 0;
                                            int var80 = class450.field6165;
                                            if (var78 == 0) {
                                                var79 = 46;
                                            }
                                            if (var78 == 1) {
                                                var79 = 60;
                                            }
                                            if (var78 == 2) {
                                                var79 = 50;
                                            }
                                            if (var78 == 3) {
                                                var79 = 53;
                                            }
                                            if (var78 == 4) {
                                                var79 = 22;
                                            }
                                            if (var75.field9570 == var78) {
                                                var80 = var75.field9582;
                                            }
                                            if (var75.field9564 == var78) {
                                                var80 = var75.field9614;
                                            }
                                            class105.method738((long) var74.field9305, -1, true, "<col=ff9040>" + var75.field9565, false, var80, false, var40, (long) var73, var39, (byte) -42, var77[var78], var79);
                                            class409.field5561++;
                                        }
                                    }
                                }
                                class665.field9259++;
                                class105.method738((long) var74.field9305, -1, true, "<col=ff9040>" + var75.field9565, class210.field3250.field5755 != var36.field7063.field5755, class547.field7869, false, var40, (long) var73, var39, (byte) -42, class620.field8683.method3580(class140.field2081, 12), 1001);
                                var73++;
                            }
                        }
                    }
                    if (var36.field7063 instanceof class484) {
                        class484 var81 = (class484) var36.field7063;
                        class282 var82 = class277.field4038.method3919(true, var81.method1483(24853));
                        if (var82.field4117 != null) {
                            var82 = var82.method1826(class537.field7727, 120);
                        }
                        if (var82 != null) {
                            if (class691.field9660 && class210.field3250.field5755 == var36.field7063.field5755) {
                                class645 var83 = class474.field6636 == -1 ? null : class184.field2832.method4117((byte) 49, class474.field6636);
                                if ((class197.field3008 & 0x4) != 0 && (var83 == null || var82.method1835(var83.field9011, class474.field6636, (byte) 94) != var83.field9011)) {
                                    class712.field9879++;
                                    class105.method738(class97.method704(var40, var81, var39, 29731), -1, true, class714.field9904 + " -> <col=00ffff>" + var82.field4099, false, class169.field2646, false, var40, (long) var81.hashCode(), var39, (byte) -42, class572.field8070, 9);
                                }
                            }
                            if (class210.field3250.field5755 == var36.field7063.field5755) {
                                String[] var84 = var82.field4104;
                                if (var84 != null) {
                                    for (int var85 = 4; var85 >= 0; var85--) {
                                        if (var84[var85] != null) {
                                            short var86 = 0;
                                            int var87 = class450.field6165;
                                            if (var85 == 0) {
                                                var86 = 19;
                                            }
                                            if (var85 == 1) {
                                                var86 = 2;
                                            }
                                            if (var85 == 2) {
                                                var86 = 59;
                                            }
                                            if (var85 == 3) {
                                                var86 = 57;
                                            }
                                            if (var82.field4116 == var85) {
                                                var87 = var82.field4158;
                                            }
                                            if (var85 == 4) {
                                                var86 = 1011;
                                            }
                                            if (var82.field4131 == var85) {
                                                var87 = var82.field4163;
                                            }
                                            class252.field3714++;
                                            class105.method738(class97.method704(var40, var81, var39, 29731), -1, true, "<col=00ffff>" + var82.field4099, false, var87, false, var40, (long) var81.hashCode(), var39, (byte) -42, var84[var85], var86);
                                        }
                                    }
                                }
                                class116.field1775++;
                                class105.method738((long) var82.field4100, -1, true, "<col=00ffff>" + var82.field4099, class210.field3250.field5755 != var36.field7063.field5755, class547.field7869, false, var40, (long) var81.hashCode(), var39, (byte) -42, class620.field8683.method3580(class140.field2081, 12), 1010);
                            }
                        }
                    }
                }
            }
            if (class195.field2997) {
                class128.method958((byte) 94);
            }
        }
        class740.method4120(1, false);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V")
    public class790(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field10841 = arg2;
        this.field10839 = arg3;
        this.field10841.method4353(34, true);
    }
}
