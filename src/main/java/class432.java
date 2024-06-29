import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class432 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[B")
    private byte[] field6352;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    private int[] field6342;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
    private int[] field6344;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field6347 = new int[14];

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lgk;")
    public static class331 field6348 = new class331("K", "T", "K", "K");

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field6353 = 0;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field6355 = 0;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lbg;")
    public static class324 field6354 = new class324(16, -1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    public static final void method2619(byte arg0, int arg1) {
        field6350++;
        if (class113.field1589 == arg1) {
            return;
        }
        if (class113.field1589 == 0) {
            class96.method828(false);
        }
        if (arg1 == 40) {
            class95.method826(1);
        }
        if (arg1 != 40 && class60.field697 != null) {
            class60.field697.method646(false);
            class60.field697 = null;
        }
        if (class113.field1589 == 25 || class113.field1589 == 28) {
            class3.field44.field5709 = 2;
            class126.field1843.field5709 = 2;
            class305.field4337.field5709 = 2;
            class193.field2807.field5709 = 2;
            class192.field2806.field5709 = 2;
            class8.field94.field5709 = 2;
            class355.field4952.field5709 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class287.field4145 = 0;
            class29.field352 = 1;
            class488.field7181 = 0;
            class487.field7157 = 0;
            class270.field3997 = 1;
            class75.method709(4095, true);
            class3.field44.field5709 = 1;
            class126.field1843.field5709 = 1;
            class305.field4337.field5709 = 1;
            class193.field2807.field5709 = 1;
            class192.field2806.field5709 = 1;
            class8.field94.field5709 = 1;
            class355.field4952.field5709 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class74.method699((byte) 62);
        }
        if (arg1 == 5) {
            class325.method2009(class225.field3300, (byte) 103, class240.field3533);
        } else {
            class230.method1546(64);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class113.field1589 == 5 || class113.field1589 == 10 || class113.field1589 == 28;
        if (var2 != var3) {
            if (var2) {
                class398.field5850 = class244.field3586;
                if (class478.field7044.field3334 == 0) {
                    class470.method2845(2, (byte) 35);
                } else {
                    class404.method2477(class478.field7044.field3334, class512.field7556, 2, 0, (byte) -57, false, class244.field3586);
                }
                class405.field6029.method1420(false, (byte) 87);
            } else {
                class470.method2845(2, (byte) 35);
                class405.field6029.method1420(true, (byte) 18);
            }
        }
        int var4 = -35 % ((-arg0 - 63) / 52);
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class225.field3300.method350();
        }
        class113.field1589 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BI[BIII)I")
    public final int method2620(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6341++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg5;
        if (arg3 != -1) {
            method2621(67, 23, -35, 65, -5);
        }
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var11;
            if ((var11 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var12;
            if ((var12 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var12);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var13;
            if ((var13 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var14;
            if ((var14 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var15;
            if ((var15 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var16;
            if ((var16 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var17;
            if ((var17 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6344[var8];
            }
            int var18;
            if ((var18 = this.field6344[var8]) < 0) {
                arg2[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public static final void method2621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class478.field7044.field3349 != 0 && arg2 != 0 && class388.field5740 < 50 && arg0 != -1) {
            class476.field7011[class388.field5740++] = new class114((byte) 1, arg0, arg2, arg4, arg3, 0);
        }
        if (arg1 == 0) {
            field6345++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BIBI[BI)I")
    public final int method2622(byte[] arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field6351++;
        if (arg2 != 40) {
            return -81;
        }
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg1 << 3;
        while (arg3 < var8) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field6342[var10];
            byte var12 = this.field6352[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class244.method1606(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method2623(int arg0) {
        field6348 = null;
        field6354 = null;
        if (arg0 == 0) {
            field6347 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Laq;")
    public static final class111 method2624(int arg0) {
        field6346++;
        if (class399.field5903 == null || class411.field6105 == null) {
            return null;
        }
        for (class111 var1 = (class111) class411.field6105.method1082((byte) 123); var1 != null; var1 = (class111) class411.field6105.method1082((byte) 85)) {
            class405 var2 = class399.field5891.method837(var1.field1567, (byte) -41);
            if (var2 != null && var2.field5984 && var2.method2481(-11247, class399.field5894)) {
                return var1;
            }
        }
        if (arg0 == -2) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field6349++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg0;
        } else {
            if (arg4 != 15993) {
                field6348 = null;
            }
            return 1 - (arg2 - (7 - arg3));
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
    public class432(byte[] arg0) {
        int var2 = arg0.length;
        this.field6352 = arg0;
        this.field6342 = new int[var2];
        this.field6344 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6342[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class244.method1606(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field6344[var14] == 0) {
                            this.field6344[var14] = var4;
                        }
                        var14 = this.field6344[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6344.length <= var14) {
                        int[] var18 = new int[this.field6344.length * 2];
                        for (int var19 = 0; var19 < this.field6344.length; var19++) {
                            var18[var19] = this.field6344[var19];
                        }
                        this.field6344 = var18;
                    }
                }
                this.field6344[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
