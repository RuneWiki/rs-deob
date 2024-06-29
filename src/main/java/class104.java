import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class104 {

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Z")
    public boolean field1720 = true;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field1726 = -1;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Loi;")
    private class57 field1718;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Lkfa;")
    private class382 field1727;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lmn;")
    private class212 field1711;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lkca;")
    private class372 field1709;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Lil;")
    private class586 field1725;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[[Z")
    public static boolean[][] field1717 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "F")
    public static float field1710;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lcn;")
    public static class556 field1715;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final void method872(byte arg0) {
        this.method874(this.field1711, this.field1722, 0);
        if (arg0 != -2) {
            this.method872((byte) -3);
        }
        field1721++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIII)Lvo;")
    public static final class345 method873(boolean arg0, int arg1, int arg2, int arg3) {
        field1712++;
        if (arg2 != -10371) {
            return null;
        }
        class195 var4 = null;
        if (class11.field133 != null) {
            var4 = new class195(arg3, class11.field133, class600.field8657[arg3], 1000000);
        }
        class53.field688[arg3] = class454.field6530.method1900(arg3, 106, var4, class682.field9715);
        class53.field688[arg3].method1320((byte) -1);
        return new class345(class53.field688[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lmn;II)V")
    private final void method874(class212 arg0, int arg1, int arg2) {
        field1728++;
        if (arg1 != 0) {
            this.method875((byte) 120);
            this.field1727.method2295((byte) 70, this.field1725);
            this.field1727.method2320(4, false, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    private final void method875(byte arg0) {
        field1714++;
        if (!this.field1720) {
            return;
        }
        this.field1720 = false;
        byte[] var2 = this.field1718.field842;
        byte[] var3 = this.field1727.field5609;
        int var4 = 0;
        int var5 = this.field1718.field849;
        int var6 = this.field1718.field849 * this.field1719 + this.field1713;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1725 != null && this.field1726 == var4) {
            this.field1720 = false;
            return;
        }
        this.field1726 = var4;
        if (arg0 <= 77) {
            return;
        }
        int var8 = this.field1719 * var5 + this.field1713;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field1718.field849 - 128;
        }
        if (this.field1725 == null) {
            this.field1725 = new class586(this.field1727, 3553, 6406, 128, 128, false, this.field1727.field5609, 6406, false);
            this.field1725.method3379((byte) 102, false, false);
            this.field1725.method2001(540800, true);
        } else {
            this.field1725.method3384(128, false, this.field1727.field5609, 0, 0, 0, 0, 128, 0, 6406);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[BI)V")
    public final void method876(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 32768) {
            this.method875((byte) 12);
        }
        field1724++;
        this.field1709.method1449(arg2, this.field1727.method2298(arg0, (byte) -127) * arg3, arg0, -17605);
        this.method874(this.field1709, arg3, 0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLufa;)I")
    public static final int method877(boolean arg0, class141 arg1) {
        field1716++;
        if (arg1.field2426 == 0) {
            return 0;
        }
        if (arg1.field2434 != -1) {
            class141 var2 = null;
            if (arg1.field2434 < 32768) {
                class6 var3 = (class6) class314.field4359.method2818(-22803, (long) arg1.field2434);
                if (var3 != null) {
                    var2 = var3.field49;
                }
            } else if (arg1.field2434 >= 32768) {
                var2 = class76.field1186[arg1.field2434 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field3155 - var2.field3155;
                int var5 = arg1.field3154 - var2.field3154;
                if (var4 != 0 || var5 != 0) {
                    arg1.method1097(1, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (!arg0) {
            method878(46, 55, 51, null);
        }
        if (arg1 instanceof class270) {
            class270 var6 = (class270) arg1;
            if (var6.field3884 != -1 && (var6.field2452 == 0 || var6.field2460 > 0)) {
                var6.method1097(1, var6.field3884);
                var6.field3884 = -1;
            }
        } else if (arg1 instanceof class88) {
            class88 var7 = (class88) arg1;
            if (var7.field1317 != -1 && (var7.field2452 == 0 || var7.field2460 > 0)) {
                int var8 = var7.field3155 - ((var7.field1317 - class143.field2474 - class143.field2474) * 256);
                int var9 = var7.field3154 - ((var7.field1313 - class63.field917 - class63.field917) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method1097(1, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field1317 = -1;
            }
        }
        return arg1.method1094(3);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILis;)V")
    public static final void method878(int arg0, int arg1, int arg2, class101 arg3) {
        if (arg3.field1531 == 0) {
            arg3.field1589 = arg3.field1541;
        } else if (arg3.field1531 == 1) {
            arg3.field1589 = (arg0 - arg3.field1651) / 2 + arg3.field1541;
        } else if (arg3.field1531 == 2) {
            arg3.field1589 = arg0 - arg3.field1651 - arg3.field1541;
        } else if (arg3.field1531 == 3) {
            arg3.field1589 = arg3.field1541 * arg0 >> 14;
        } else if (arg3.field1531 == 4) {
            arg3.field1589 = (arg3.field1541 * arg0 >> 14) + (arg0 - arg3.field1651) / 2;
        } else {
            arg3.field1589 = arg0 - arg3.field1651 - (arg3.field1541 * arg0 >> 14);
        }
        field1723++;
        if (arg3.field1536 == 0) {
            arg3.field1583 = arg3.field1627;
        } else if (arg3.field1536 == 1) {
            arg3.field1583 = (arg1 - arg3.field1604) / 2 + arg3.field1627;
        } else if (arg3.field1536 == 2) {
            arg3.field1583 = arg1 - arg3.field1604 - arg3.field1627;
        } else if (arg3.field1536 == 3) {
            arg3.field1583 = arg3.field1627 * arg1 >> 14;
        } else if (arg3.field1536 == 4) {
            arg3.field1583 = (arg3.field1627 * arg1 >> 14) + (arg1 - arg3.field1604) / 2;
        } else {
            arg3.field1583 = arg1 - arg3.field1604 - (arg3.field1627 * arg1 >> 14);
        }
        if (class88.field1324 && (client.method707(arg3).field4572 != 0 || arg3.field1584 == 0)) {
            if (arg3.field1583 < 0) {
                arg3.field1583 = 0;
            } else if (arg3.field1604 + arg3.field1583 > arg1) {
                arg3.field1583 = arg1 - arg3.field1604;
            }
            if (arg3.field1589 < 0) {
                arg3.field1589 = 0;
            } else if ((arg3.field1651 + arg3.field1589) > arg0) {
                arg3.field1589 = arg0 - arg3.field1651;
            }
        }
        if (arg2 > -9) {
            method879(-126);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        field1717 = null;
        field1715 = null;
        if (arg0 < 112) {
            method878(-76, -120, -16, null);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lkfa;Loi;Lfw;IIIII)V")
    public class104(class382 arg0, class57 arg1, class636 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1713 = arg6;
        this.field1719 = arg7;
        this.field1718 = arg1;
        this.field1727 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field9706 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field9026[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1722 = var10;
        if (var10 <= 0) {
            this.field1725 = null;
        } else {
            class465 var14 = new class465(var10 * 2);
            if (this.field1727.field5558) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field9706 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field9026[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2739((byte) -86, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field9706 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field9026[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2742(var23[var24] & 0xFFFF, -1557853240);
                            }
                        }
                    }
                }
            }
            this.field1711 = this.field1727.method2296(var14.field6710, 5123, false, (byte) 85, var14.field6719);
            this.field1709 = new class372(this.field1727, 5123, null, 1);
        }
    }
}
