import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class348 {

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    private int field5108 = -1;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "Z")
    public boolean field5111 = true;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lai;")
    private class626 field5103;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    private int field5112;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "Lnt;")
    private class235 field5110;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    private int field5105;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    private int field5102;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Loh;")
    private class427 field5100;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lec;")
    private class248 field5104;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Ljw;")
    public static class581 field5106 = new class581(107, 4);

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "Lmt;")
    public static class419 field5117 = new class419(15, 0, 1, 0);

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field5120 = 0;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "F")
    public static float field5119;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "[I")
    public static int[] field5114;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILor;II)V", line = 6)
    public static final void method2196(int arg0, class668 arg1, int arg2, int arg3) {
        field5107++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field9222 != null) {
            class12 var4 = new class12();
            var4.field190 = arg1;
            var4.field186 = arg1.field9222;
            class173.method1235(var4);
        }
        class121.field1770 = arg1.field9318;
        class372.field5384 = arg1.field9221;
        class344.field5067 = arg3;
        class167.field2258 = arg1.field9283;
        if (arg2 > -98) {
            return;
        }
        class648.field8998 = arg0;
        class497.field6870 = true;
        class678.field9483 = arg1.field9304;
        class660.field9129 = arg1.field9314;
        class763.method4242(arg1, true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 40)
    private final void method2197(int arg0) {
        field5109++;
        if (!this.field5111) {
            return;
        }
        this.field5111 = false;
        byte[] var2 = this.field5110.field3187;
        int var3 = 0;
        int var4 = this.field5110.field3180;
        int var5 = this.field5110.field3180 * this.field5105 + this.field5112;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field5104 != null && this.field5108 == var3) {
            this.field5111 = false;
            return;
        }
        this.field5108 = var3;
        int var7 = this.field5105 * var4 + this.field5112;
        int var8 = 0;
        if (arg0 != 128) {
            return;
        }
        if (!this.field5103.method863(class250.field3704, -2, class258.field3847)) {
            if (class126.field1897 == null) {
                class126.field1897 = new int[16384];
            }
            int[] var9 = class126.field1897;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field5110.field3180 - 128;
            }
            if (this.field5104 == null) {
                this.field5104 = this.field5103.method3517((byte) -116, 128, 128, false, class126.field1897);
                this.field5104.method1667(false, false, 30135);
            } else {
                this.field5104.method1663(0, (byte) 113, 128, class126.field1897, 128, 128, 0, 0);
            }
            return;
        }
        if (class674.field9469 == null) {
            class674.field9469 = new byte[16384];
        }
        byte[] var13 = class674.field9469;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field5110.field3180 - 128;
        }
        if (this.field5104 == null) {
            this.field5104 = this.field5103.method3462(class674.field9469, 128, 128, (byte) -62, false, class250.field3704);
            this.field5104.method1667(false, false, 30135);
        } else {
            this.field5104.method1669(class250.field3704, 5259, 0, 0, 128, class674.field9469, 0, 128, 128);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lai;Lnt;Lew;IIIII)V", line = 303)
    public class348(class626 arg0, class235 arg1, class520 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5103 = arg0;
        this.field5112 = arg6;
        this.field5110 = arg1;
        this.field5105 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4301 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7119[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field5115 = 0;
            this.field5104 = null;
        } else {
            this.field5101 = Integer.MIN_VALUE;
            this.field5102 = Integer.MAX_VALUE;
            this.field5100 = this.field5103.method908(-1, false);
            this.field5100.method2615(var10, (byte) -73);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field5100.method2613(true, 3754);
                if (var15 != null) {
                    Stream var16 = this.field5103.method3445(9, var15);
                    if (Stream.method3926()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4301 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7119[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field5102 > var22) {
                                            this.field5102 = var22;
                                        }
                                        if (this.field5101 < var22) {
                                            this.field5101 = var22;
                                        }
                                        var16.method3918(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4301 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7119[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field5101) {
                                            this.field5101 = var28;
                                        }
                                        if (var28 < this.field5102) {
                                            this.field5102 = var28;
                                        }
                                        var16.method3921(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3922();
                    if (this.field5100.method2611(26937)) {
                        break;
                    }
                }
            }
            this.field5115 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Loh;ZI)V", line = 221)
    public final void method2198(class427 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field5113++;
        if (arg2 > 0) {
            this.method2197(128);
            this.field5103.method3520(true, this.field5104);
            this.field5103.method864(arg2, 0, arg0, this.field5102, this.field5101 + 1 - this.field5102, true, class235.field3174);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lbba;II)V", line = 239)
    public static final void method2199(class124 arg0, int arg1, int arg2) {
        if (arg0.field1799 != null) {
            int var3 = arg0.field1799[arg1 + 1];
            if (arg0.field1827 != var3) {
                arg0.field1827 = var3;
                arg0.field1888 = arg0.field1883;
                arg0.field1817 = 0;
                arg0.field1795 = 0;
                arg0.field1806 = 0;
                arg0.field1870 = 1;
                if (arg0.field1827 != -1) {
                    class586.method3259(arg0, 0, class6.field65.method1034(arg0.field1827, 0), arg0.field1795);
                }
            }
        }
        field5118++;
        if (arg2 != -25478) {
            field5106 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 270)
    public final void method2200(byte arg0) {
        this.method2198(this.field5100, false, this.field5115);
        if (arg0 != 8) {
            this.field5101 = 107;
        }
        field5116++;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 289)
    public static void method2201(int arg0) {
        field5106 = null;
        field5117 = null;
        if (arg0 != 10090) {
            field5119 = -0.57547975F;
        }
        field5114 = null;
    }
}
