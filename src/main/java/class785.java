import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class785 extends class766 {

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "Lmfa;")
    private class217 field10741;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "Lal;")
    private class195 field10732;

    @OriginalMember(owner = "client!eia", name = "M", descriptor = "Llea;")
    private class573 field10754;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    private int field10729;

    @OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
    private int field10735;

    @OriginalMember(owner = "client!eia", name = "C", descriptor = "I")
    private int field10744;

    @OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
    private int field10742;

    @OriginalMember(owner = "client!eia", name = "s", descriptor = "[[F")
    private float[][] field10734;

    @OriginalMember(owner = "client!eia", name = "D", descriptor = "[[F")
    private float[][] field10745;

    @OriginalMember(owner = "client!eia", name = "w", descriptor = "[[F")
    private float[][] field10738;

    @OriginalMember(owner = "client!eia", name = "r", descriptor = "I")
    private int field10733;

    @OriginalMember(owner = "client!eia", name = "G", descriptor = "Lol;")
    private class431 field10748;

    @OriginalMember(owner = "client!eia", name = "E", descriptor = "Lbca;")
    private class501 field10746;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "Lsi;")
    private class769 field10731;

    @OriginalMember(owner = "client!eia", name = "F", descriptor = "Ltj;")
    private class690 field10747;

    @OriginalMember(owner = "client!eia", name = "L", descriptor = "Lcq;")
    private class305 field10753;

    @OriginalMember(owner = "client!eia", name = "v", descriptor = "Lpc;")
    private class282 field10737;

    @OriginalMember(owner = "client!eia", name = "K", descriptor = "Lpc;")
    private class282 field10752;

    @OriginalMember(owner = "client!eia", name = "N", descriptor = "Lvt;")
    public static class768 field10755 = new class768();

    @OriginalMember(owner = "client!eia", name = "O", descriptor = "I")
    public static int field10756 = 0;

    @OriginalMember(owner = "client!eia", name = "P", descriptor = "Lin;")
    public static class380 field10757 = new class380(0, 3);

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!eia", name = "u", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!eia", name = "x", descriptor = "I")
    private int field10739;

    @OriginalMember(owner = "client!eia", name = "y", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!eia", name = "B", descriptor = "I")
    public static int field10743;

    @OriginalMember(owner = "client!eia", name = "H", descriptor = "I")
    public static int field10749;

    @OriginalMember(owner = "client!eia", name = "I", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!eia", name = "J", descriptor = "I")
    public static int field10751;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)Z", line = 6)
    public static final boolean method4299(byte arg0) {
        if (arg0 < 29) {
            method4299((byte) 107);
        }
        field10750++;
        if (class781.field10717) {
            try {
                if ((Boolean) class154.method1204(class343.field4881, "showingVideoAd", 22458)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIB[[Z)V", line = 30)
    public final void method4300(int arg0, int arg1, int arg2, byte arg3, boolean[][] arg4) {
        field10740++;
        if (this.field10747 == null || this.field10729 > arg1 + arg2 || this.field10735 < arg1 - arg2 || this.field10744 > arg0 + arg2 || this.field10742 < arg0 - arg2) {
            return;
        }
        for (int var6 = this.field10744; var6 <= this.field10742; var6++) {
            for (int var7 = this.field10729; var7 <= this.field10735; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (var8 > (-arg2) && var8 < arg2 && var9 > -arg2 && var9 < arg2 && arg4[arg2 + var8][arg2 + var9]) {
                    this.field10754.method3343((int) (this.field10741.method1488(false) * 255.0F) << 24, 20710);
                    this.field10754.method3344(null, this.field10737, this.field10752, null, (byte) 107);
                    this.field10754.method3339(arg3 ^ 0x60, this.field10733, 0, this.field10747, 4);
                    return;
                }
            }
        }
        if (arg3 != -17) {
            this.field10738 = null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(B)V", line = 88)
    public static void method4301(byte arg0) {
        field10757 = null;
        field10755 = null;
        if (arg0 >= -99) {
            method4306(-38, -40, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(BD)V", line = 100)
    public static final void method4302(byte arg0, double arg1) {
        field10743++;
        if (arg0 > -32 || class68.field1116 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class594.field8498[var3] = var4 > 255 ? 255 : var4;
        }
        class68.field1116 = arg1;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIIBI)V", line = 126)
    private final void method4303(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field10736++;
        long var8 = -1L;
        int var10 = (arg0 << this.field10732.field5807) + arg6;
        int var11 = (arg4 << this.field10732.field5807) + arg3;
        int var12 = this.field10732.method2478(true, var11, var10);
        if ((arg6 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class766 var13 = this.field10731.method4253(var8, arg5 ^ 0xFFFFFFD7);
            if (var13 != null) {
                this.method4304(((class654) var13).field9255, 255);
                return;
            }
        }
        if (arg5 != 40) {
            return;
        }
        short var14 = (short) (this.field10739++);
        if (var8 != -1L) {
            this.field10731.method4252(false, new class654(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg3 == 0) {
            var15 = this.field10734[arg1][arg2];
            var16 = this.field10738[arg1][arg2];
            var17 = this.field10745[arg1][arg2];
        } else if (this.field10732.field5805 == arg6 && arg3 == 0) {
            var16 = this.field10738[arg1 + 1][arg2];
            var15 = this.field10734[arg1 + 1][arg2];
            var17 = this.field10745[arg1 + 1][arg2];
        } else if (this.field10732.field5805 == arg6 && this.field10732.field5805 == arg3) {
            var16 = this.field10738[arg1 + 1][arg2 + 1];
            var17 = this.field10745[arg1 + 1][arg2 + 1];
            var15 = this.field10734[arg1 + 1][arg2 + 1];
        } else if (arg6 == 0 && this.field10732.field5805 == arg3) {
            var17 = this.field10745[arg1][arg2 + 1];
            var16 = this.field10738[arg1][arg2 + 1];
            var15 = this.field10734[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field10732.field5805;
            float var19 = (float) arg3 / (float) this.field10732.field5805;
            float var20 = this.field10734[arg1][arg2];
            float var21 = this.field10745[arg1][arg2];
            float var22 = this.field10738[arg1][arg2];
            float var23 = this.field10734[arg1 + 1][arg2];
            float var24 = this.field10745[arg1 + 1][arg2];
            float var25 = this.field10738[arg1 + 1][arg2];
            float var26 = (this.field10734[arg1][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field10745[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var28 = (this.field10745[arg1][arg2 + 1] - var21) * var18 + var21;
            float var29 = (this.field10734[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var30 = (this.field10738[arg1][arg2 + 1] - var22) * var18 + var22;
            var17 = (var27 - var28) * var19 + var28;
            var15 = (var29 - var26) * var19 + var26;
            float var31 = (this.field10738[arg1 + 1][arg2 + 1] - var25) * var18 + var25;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field10741.method1495(false) - var10);
        float var33 = (float) (this.field10741.method1494(false) - var12);
        float var34 = (float) (this.field10741.method1490((byte) -126) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field10741.method1491(0);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field10741.method1489((byte) -127);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field10754.field8231) {
            this.field10746.method2926((byte) 58, (float) var10);
            this.field10746.method2926((byte) 68, (float) var12);
            this.field10746.method2926((byte) 102, (float) var11);
        } else {
            this.field10746.method2925((float) var10, true);
            this.field10746.method2925((float) var12, true);
            this.field10746.method2925((float) var11, true);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field10746.method2524(false, var45);
        this.field10746.method2524(false, var46);
        this.field10746.method2524(false, var47);
        this.field10746.method2524(false, 255);
        this.method4304(var14, arg5 + 215);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(SI)V", line = 295)
    private final void method4304(short arg0, int arg1) {
        field10751++;
        if (arg1 != 255) {
            field10756 = 0;
        }
        if (this.field10754.field8231) {
            this.field10748.method2546(true, arg0);
        } else {
            this.field10748.method2582((byte) -105, arg0);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 310)
    public static final void method4305(int arg0) {
        class172.method1268(class766.field10586, -101);
        field10730++;
        class435.field6063++;
        if (class302.field4344 && class466.field6363) {
            int var1 = 0;
            int var2 = 0;
            if (class593.field8489) {
                var1 = class45.method342(false);
                var2 = class87.method771(-2);
            }
            int var3 = class754.field10496.method3065(-28062) + var1;
            int var4 = class754.field10496.method3066(72) + var2;
            int var5 = var3 - class286.field4209;
            int var6 = var4 - class591.field8482;
            if (var5 < class47.field639) {
                var5 = class47.field639;
            }
            if (class445.field6150 > var6) {
                var6 = class445.field6150;
            }
            if ((class47.field639 + class6.field86.field7128) < (class766.field10586.field7128 + var5)) {
                var5 = class6.field86.field7128 + class47.field639 - class766.field10586.field7128;
            }
            if (class445.field6150 + class6.field86.field7255 < class766.field10586.field7255 + var6) {
                var6 = class6.field86.field7255 + class445.field6150 - class766.field10586.field7255;
            }
            int var7 = class6.field86.field7145 + var5 - class47.field639;
            int var8 = var6 + class6.field86.field7244 - class445.field6150;
            if (class754.field10496.method3071(72)) {
                if (class766.field10586.field7209 < class435.field6063) {
                    int var10 = var5 - class507.field6968;
                    int var11 = var6 - class58.field885;
                    if (class766.field10586.field7144 < var10 || -class766.field10586.field7144 > var10 || var11 > class766.field10586.field7144 || var11 < (-class766.field10586.field7144)) {
                        class752.field10459 = true;
                    }
                }
                if (class766.field10586.field7143 != null && class752.field10459) {
                    class511 var12 = new class511();
                    var12.field7021 = class766.field10586.field7143;
                    var12.field7029 = var7;
                    var12.field7023 = class766.field10586;
                    var12.field7019 = var8;
                    class46.method357(var12);
                }
            } else {
                if (class752.field10459) {
                    class558.method3253(-79);
                    if (class766.field10586.field7150 != null) {
                        class511 var9 = new class511();
                        var9.field7019 = var8;
                        var9.field7021 = class766.field10586.field7150;
                        var9.field7026 = class600.field8556;
                        var9.field7023 = class766.field10586;
                        var9.field7029 = var7;
                        class46.method357(var9);
                    }
                    if (class600.field8556 != null && client.method886(class766.field10586) != null) {
                        class588.method3447((byte) -118, class766.field10586, class600.field8556);
                    }
                } else if ((class194.field2907 == 1 || class278.method1775((byte) -108)) && class624.field8863 > 2) {
                    class410.method2415(class591.field8482 + class58.field885, class507.field6968 + class286.field4209, 6406);
                } else if (class433.method2592(-1)) {
                    class410.method2415(class591.field8482 + class58.field885, class507.field6968 + class286.field4209, 6406);
                }
                class766.field10586 = null;
            }
            if (arg0 > -54) {
                field10756 = -51;
            }
        } else if (class435.field6063 > 1) {
            class766.field10586 = null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Llea;Lal;Lmfa;[I)V", line = 456)
    public class785(class573 arg0, class195 arg1, class217 arg2, int[] arg3) {
        this.field10741 = arg2;
        this.field10732 = arg1;
        this.field10754 = arg0;
        int var5 = this.field10741.method1491(0) - (arg1.field5805 >> 1);
        this.field10729 = this.field10741.method1495(false) - var5 >> arg1.field5807;
        this.field10735 = var5 + this.field10741.method1495(false) >> arg1.field5807;
        this.field10744 = this.field10741.method1490((byte) -126) - var5 >> arg1.field5807;
        this.field10742 = var5 + this.field10741.method1490((byte) -126) >> arg1.field5807;
        int var6 = this.field10735 + 1 - this.field10729;
        int var7 = this.field10742 + 1 - this.field10744;
        this.field10734 = new float[var6 + 1][var7 + 1];
        this.field10745 = new float[var6 + 1][var7 + 1];
        this.field10738 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field10744 + var8;
            if (var25 > 0 && this.field10732.field5809 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field10729;
                    if (var27 > 0 && this.field10732.field5808 - 1 > var27) {
                        int var28 = arg1.method2476(var25, var27 + 1, -1) - arg1.method2476(var25, var27 - 1, -1);
                        int var29 = arg1.method2476(var25 + 1, var27, -1) - arg1.method2476(var25 - 1, var27, -1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field10734[var26][var8] = (float) var28 * var30;
                        this.field10745[var26][var8] = var30 * -256.0F;
                        this.field10738[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field10744; var10 <= this.field10742; var10++) {
            if (var10 >= 0 && arg1.field5809 > var10) {
                for (int var21 = this.field10729; var21 <= this.field10735; var21++) {
                    if (var21 >= 0 && arg1.field5808 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field2936[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field10733 += 3;
                                    }
                                }
                            } else {
                                this.field10733 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field10735 - this.field10729;
            }
        }
        if (this.field10733 > 0) {
            this.field10748 = new class431(this.field10733 * 2);
            this.field10746 = new class501(this.field10733 * 16);
            this.field10731 = new class769(class661.method3706(this.field10733, true));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field10744; var13 <= this.field10742; var13++) {
                if (var13 >= 0 && var13 < arg1.field5809) {
                    int var14 = 0;
                    for (int var15 = this.field10729; var15 <= this.field10735; var15++) {
                        if (var15 >= 0 && arg1.field5808 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field2936[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field2944[var15][var13];
                                    int[] var19 = arg1.field2917[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method4303(var15, var14, var12, var19[var20], var13, (byte) 40, var18[var20]);
                                                var20++;
                                                this.method4303(var15, var14, var12, var19[var20], var13, (byte) 40, var18[var20]);
                                                var20++;
                                                this.method4303(var15, var14, var12, var19[var20], var13, (byte) 40, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, 0);
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, arg1.field5805);
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, 0);
                                } else if (var16 == 2) {
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, arg1.field5805);
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, arg1.field5805);
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, 0);
                                } else if (var16 == 5) {
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, arg1.field5805);
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, 0);
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, arg1.field5805);
                                } else if (var16 == 4) {
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, 0);
                                    this.method4303(var15, var14, var12, 0, var13, (byte) 40, 0);
                                    this.method4303(var15, var14, var12, arg1.field5805, var13, (byte) 40, arg1.field5805);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field10735 - this.field10729;
                }
                var12++;
            }
            this.field10747 = this.field10754.method3333(this.field10748.field6002, false, (byte) 35, 5123, this.field10748.field5983);
            this.field10753 = this.field10754.method3336(this.field10746.field6002, 16, this.field10746.field5983, (byte) 95, false);
            this.field10737 = new class282(this.field10753, 5126, 3, 0);
            this.field10752 = new class282(this.field10753, 5121, 4, 12);
        } else {
            this.field10752 = null;
            this.field10737 = null;
            this.field10747 = null;
            this.field10753 = null;
        }
        this.field10748 = null;
        this.field10731 = null;
        this.field10734 = this.field10745 = this.field10738 = null;
        this.field10746 = null;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIB)V", line = 702)
    public static final void method4306(int arg0, int arg1, byte arg2) {
        if (arg2 <= 116) {
            field10757 = null;
        }
        field10749++;
        class371 var3 = class490.method2867((byte) -114, 16, (long) arg1);
        var3.method2212(-91);
        var3.field5233 = arg0;
    }
}
