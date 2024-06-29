import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DWRVLVYL")
public class class13 {

    @OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "client!DWRVLVYL", name = "j", descriptor = "[I")
    private int[] field715 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "k", descriptor = "[I")
    private int[] field716 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "l", descriptor = "[I")
    private int[] field717 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "n", descriptor = "I")
    private int field719 = 100;

    @OriginalMember(owner = "client!DWRVLVYL", name = "q", descriptor = "I")
    public int field722 = 500;

    @OriginalMember(owner = "client!DWRVLVYL", name = "v", descriptor = "[I")
    private static int[] field727 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "w", descriptor = "[I")
    private static int[] field728 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "x", descriptor = "[I")
    private static int[] field729 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "y", descriptor = "[I")
    private static int[] field730 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "z", descriptor = "[I")
    private static int[] field731 = new int[5];

    @OriginalMember(owner = "client!DWRVLVYL", name = "m", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "client!DWRVLVYL", name = "r", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!DWRVLVYL", name = "o", descriptor = "LEWUYFKZT;")
    private class16 field720;

    @OriginalMember(owner = "client!DWRVLVYL", name = "b", descriptor = "LVRTTZTTM;")
    private class63 field707;

    @OriginalMember(owner = "client!DWRVLVYL", name = "c", descriptor = "LVRTTZTTM;")
    private class63 field708;

    @OriginalMember(owner = "client!DWRVLVYL", name = "d", descriptor = "LVRTTZTTM;")
    private class63 field709;

    @OriginalMember(owner = "client!DWRVLVYL", name = "e", descriptor = "LVRTTZTTM;")
    private class63 field710;

    @OriginalMember(owner = "client!DWRVLVYL", name = "f", descriptor = "LVRTTZTTM;")
    private class63 field711;

    @OriginalMember(owner = "client!DWRVLVYL", name = "g", descriptor = "LVRTTZTTM;")
    private class63 field712;

    @OriginalMember(owner = "client!DWRVLVYL", name = "h", descriptor = "LVRTTZTTM;")
    private class63 field713;

    @OriginalMember(owner = "client!DWRVLVYL", name = "i", descriptor = "LVRTTZTTM;")
    private class63 field714;

    @OriginalMember(owner = "client!DWRVLVYL", name = "p", descriptor = "LVRTTZTTM;")
    private class63 field721;

    @OriginalMember(owner = "client!DWRVLVYL", name = "s", descriptor = "[I")
    private static int[] field724;

    @OriginalMember(owner = "client!DWRVLVYL", name = "t", descriptor = "[I")
    private static int[] field725;

    @OriginalMember(owner = "client!DWRVLVYL", name = "u", descriptor = "[I")
    private static int[] field726;

    @OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "()V")
    public static final void method188() {
        field725 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field725[var0] = 1;
            } else {
                field725[var0] = -1;
            }
        }
        field726 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field726[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field724 = new int[220500];
    }

    @OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field724[var3] = 0;
        }
        if (arg1 < 10) {
            return field724;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field707.method584(406);
        this.field708.method584(406);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field709 != null) {
            this.field709.method584(406);
            this.field710.method584(406);
            var6 = (int) ((double) (this.field709.field1638 - this.field709.field1637) * 32.768D / var4);
            var7 = (int) ((double) this.field709.field1637 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field711 != null) {
            this.field711.method584(406);
            this.field712.method584(406);
            var9 = (int) ((double) (this.field711.field1638 - this.field711.field1637) * 32.768D / var4);
            var10 = (int) ((double) this.field711.field1637 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field715[var12] != 0) {
                field727[var12] = 0;
                field728[var12] = (int) ((double) this.field717[var12] * var4);
                field729[var12] = (this.field715[var12] << 14) / 100;
                field730[var12] = (int) ((double) (this.field707.field1638 - this.field707.field1637) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field716[var12]) / var4);
                field731[var12] = (int) ((double) this.field707.field1637 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field707.method585(arg0, true);
            int var42 = this.field708.method585(arg0, true);
            if (this.field709 != null) {
                int var43 = this.field709.method585(arg0, true);
                int var44 = this.field710.method585(arg0, true);
                var41 += this.method190(this.field709.field1639, var44, false, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field711 != null) {
                int var45 = this.field711.method585(arg0, true);
                int var46 = this.field712.method585(arg0, true);
                var42 = var42 * ((this.method190(this.field711.field1639, var46, false, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field715[var47] != 0) {
                    int var48 = field728[var47] + var13;
                    if (var48 < arg0) {
                        field724[var48] += this.method190(this.field707.field1639, field729[var47] * var42 >> 15, false, field727[var47]);
                        field727[var47] += (field730[var47] * var41 >> 16) + field731[var47];
                    }
                }
            }
        }
        if (this.field713 != null) {
            this.field713.method584(406);
            this.field714.method584(406);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field713.method585(arg0, true);
                int var19 = this.field714.method585(arg0, true);
                int var20;
                if (var16) {
                    var20 = ((this.field713.field1638 - this.field713.field1637) * var18 >> 8) + this.field713.field1637;
                } else {
                    var20 = ((this.field713.field1638 - this.field713.field1637) * var19 >> 8) + this.field713.field1637;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field724[var17] = 0;
                }
            }
        }
        if (this.field718 > 0 && this.field719 > 0) {
            int var21 = (int) ((double) this.field718 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field724[var22] += field724[var22 - var21] * this.field719 / 100;
            }
        }
        if (this.field720.field751[0] > 0 || this.field720.field751[1] > 0) {
            this.field721.method584(406);
            int var23 = this.field721.method585(arg0 + 1, true);
            int var24 = this.field720.method195(-1766, 0, (float) var23 / 65536.0F);
            int var25 = this.field720.method195(-1766, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field724[var24 + var26] * (long) class16.field758 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field724[var24 + var26 - var38 - 1] * (long) class16.field756[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field724[var26 - var39 - 1] * (long) class16.field756[1][var39] >> 16);
                    }
                    field724[var26] = var37;
                    var23 = this.field721.method585(arg0 + 1, true);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field724[var24 + var26] * (long) class16.field758 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field724[var24 + var26 - var35 - 1] * (long) class16.field756[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field724[var26 - var36 - 1] * (long) class16.field756[1][var36] >> 16);
                        }
                        field724[var26] = var34;
                        var23 = this.field721.method585(arg0 + 1, true);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field724[var24 + var26 - var31 - 1] * (long) class16.field756[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field724[var26 - var32 - 1] * (long) class16.field756[1][var32] >> 16);
                            }
                            field724[var26] = var30;
                            this.field721.method585(arg0 + 1, true);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field720.method195(-1766, 0, (float) var23 / 65536.0F);
                    var25 = this.field720.method195(-1766, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field724[var40] < -32768) {
                field724[var40] = -32768;
            }
            if (field724[var40] > 32767) {
                field724[var40] = 32767;
            }
        }
        return field724;
    }

    @OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(IIZI)I")
    private final int method190(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field706 = !this.field706;
        }
        if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field726[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field725[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public final void method191(class59 arg0, byte arg1) {
        this.field707 = new class63();
        this.field707.method582(arg0, (byte) 4);
        this.field708 = new class63();
        this.field708.method582(arg0, (byte) 4);
        int var3 = arg0.method529();
        if (var3 != 0) {
            arg0.field1589--;
            this.field709 = new class63();
            this.field709.method582(arg0, (byte) 4);
            this.field710 = new class63();
            this.field710.method582(arg0, (byte) 4);
        }
        int var4 = arg0.method529();
        if (arg1 != 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 != 0) {
            arg0.field1589--;
            this.field711 = new class63();
            this.field711.method582(arg0, (byte) 4);
            this.field712 = new class63();
            this.field712.method582(arg0, (byte) 4);
        }
        int var6 = arg0.method529();
        if (var6 != 0) {
            arg0.field1589--;
            this.field713 = new class63();
            this.field713.method582(arg0, (byte) 4);
            this.field714 = new class63();
            this.field714.method582(arg0, (byte) 4);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg0.method543();
            if (var8 == 0) {
                break;
            }
            this.field715[var7] = var8;
            this.field716[var7] = arg0.method542();
            this.field717[var7] = arg0.method543();
        }
        this.field718 = arg0.method543();
        this.field719 = arg0.method543();
        this.field722 = arg0.method531();
        this.field723 = arg0.method531();
        this.field720 = new class16();
        this.field721 = new class63();
        this.field720.method196(arg0, 0, this.field721);
    }
}
