import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class483 {

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    private int field6752 = -1;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
    public boolean field6760 = true;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lre;")
    private class582 field6755;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    private int field6751;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    private int field6758;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lla;")
    private class374 field6747;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lgq;")
    private class305 field6744;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    private int field6750;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lbd;")
    private class180 field6753;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field6746 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field6754 = -50;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lim;")
    public static class353 field6745 = new class353(58, 12);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "F")
    public static float field6759;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method2728(int arg0) {
        field6745 = null;
        int var1 = 121 / ((10 - arg0) / 48);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[Ljq;I)V")
    public static final void method2729(boolean arg0, class447[] arg1, int arg2) {
        if (arg0) {
            field6745 = null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class447 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6336 == 0) {
                    if (var4.field6194 != null) {
                        method2729(arg0, var4.field6194, arg2);
                    }
                    class496 var5 = (class496) class523.field7289.method3476((long) var4.field6229, (byte) 28);
                    if (var5 != null) {
                        class562.method3154((byte) 125, arg2, var5.field6914);
                    }
                }
                if (arg2 == 0 && var4.field6293 != null) {
                    class9 var6 = new class9();
                    var6.field77 = var4;
                    var6.field81 = var4.field6293;
                    class218.method1408(var6);
                }
                if (arg2 == 1 && var4.field6303 != null) {
                    if (var4.field6317 >= 0) {
                        class447 var7 = class609.method3486(var4.field6229, 983030160);
                        if (var7 == null || var7.field6194 == null || var4.field6317 >= var7.field6194.length || var7.field6194[var4.field6317] != var4) {
                            continue;
                        }
                    }
                    class9 var8 = new class9();
                    var8.field81 = var4.field6303;
                    var8.field77 = var4;
                    class218.method1408(var8);
                }
            }
        }
        field6749++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBI)I")
    public static final int method2730(int arg0, int arg1, byte arg2, int arg3) {
        field6741++;
        if (class345.field4777 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        if (arg2 <= 99) {
            return 107;
        }
        int var6 = arg0 - class614.field8850;
        int var7 = arg3 - class614.field8848;
        for (class625 var8 = (class625) class614.field8834.method3188((byte) -100); var8 != null; var8 = (class625) class614.field8834.method3182((byte) -75)) {
            if (var8.field9044 == arg1) {
                int var9 = var8.field9038;
                int var10 = var8.field9039;
                int var11 = class614.field8848 + var10 | class614.field8850 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    private final void method2731(boolean arg0) {
        field6748++;
        if (!this.field6760) {
            return;
        }
        if (!arg0) {
            this.field6750 = -85;
        }
        this.field6760 = false;
        byte[] var2 = this.field6747.field5209;
        int var3 = 0;
        int var4 = this.field6747.field5218;
        int var5 = this.field6747.field5218 * this.field6751 + this.field6758;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field6744 != null && this.field6752 == var3) {
            this.field6760 = false;
            return;
        }
        this.field6752 = var3;
        int var7 = 0;
        int var8 = this.field6751 * var4 + this.field6758;
        if (!this.field6755.method1214(class280.field3663, class33.field495, 46)) {
            if (class54.field722 == null) {
                class54.field722 = new int[16384];
            }
            int[] var13 = class54.field722;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field6747.field5218 - 128;
            }
            if (this.field6744 == null) {
                this.field6744 = this.field6755.method3349(-111, 128, false, 128, class54.field722);
                this.field6744.method1052(false, -25920, false);
            } else {
                this.field6744.method1055(0, 30519, 128, class54.field722, 0, 128, 128, 0);
            }
            return;
        }
        if (class190.field2463 == null) {
            class190.field2463 = new byte[16384];
        }
        byte[] var9 = class190.field2463;
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
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var8 + var4] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field6747.field5218 - 128;
        }
        if (this.field6744 == null) {
            this.field6744 = this.field6755.method3350(class33.field495, (byte) -51, class190.field2463, false, 128, 128);
            this.field6744.method1052(false, -25920, false);
        } else {
            this.field6744.method1054(0, 128, class190.field2463, 128, (byte) -21, class33.field495, 0, 128, 0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lbd;IB)V")
    public final void method2732(class180 arg0, int arg1, byte arg2) {
        if (arg1 > 0) {
            this.method2731(true);
            this.field6755.method3344(29639, this.field6744);
            this.field6755.method1212(class546.field7613, arg0, this.field6757 + 1 - this.field6750, -60, this.field6750, arg1, 0);
        }
        field6742++;
        if (arg2 <= 16) {
            this.method2733(-110);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public final void method2733(int arg0) {
        field6762++;
        if (arg0 >= -9) {
            method2728(44);
        }
        this.method2732(this.field6753, this.field6743, (byte) 100);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)I")
    public static final int method2734(boolean arg0, int arg1) {
        if (arg0) {
            field6761++;
            return arg1 & 0x3FF;
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lre;Lla;Luo;IIIII)V")
    public class483(class582 arg0, class374 arg1, class171 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6755 = arg0;
        this.field6751 = arg7;
        this.field6758 = arg6;
        this.field6747 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field7581 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2199[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field6743 = 0;
            this.field6744 = null;
        } else {
            this.field6750 = Integer.MAX_VALUE;
            this.field6757 = Integer.MIN_VALUE;
            this.field6753 = this.field6755.method1188((byte) 104, false);
            this.field6753.method292(false, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field6753.method297((byte) 52, true);
                if (var15 != null) {
                    Stream var16 = this.field6755.method3287(-1, var15);
                    if (Stream.method3209()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field7581 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2199[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field6750) {
                                            this.field6750 = var22;
                                        }
                                        if (this.field6757 < var22) {
                                            this.field6757 = var22;
                                        }
                                        var16.method3198(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field7581 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2199[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field6750) {
                                            this.field6750 = var28;
                                        }
                                        if (this.field6757 < var28) {
                                            this.field6757 = var28;
                                        }
                                        var16.method3203(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3207();
                    if (this.field6753.method290(22526)) {
                        break;
                    }
                }
            }
            this.field6743 = var10 / 3;
        }
    }
}
