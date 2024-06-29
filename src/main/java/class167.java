import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class167 extends class59 {

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[S")
    private short[] field2723 = new short[257];

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    private int field2740 = 0;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lph;")
    private static class229 field2717 = class266.method1858("Select", 0);

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lph;")
    public static class229 field2741 = class266.method1858("Choisir une option", 0);

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "Lph;")
    public static class229 field2730 = class266.method1858("Cach-B", 0);

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Lph;")
    public static class229 field2718 = field2717;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[I")
    private int[] field2722;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "[I")
    private int[] field2735;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "[Lki;")
    public static class152[] field2720;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "[[I")
    private int[][] field2737;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLsi;)Lcc;", line = 6)
    public static final class220 method1220(int arg0, byte arg1, class66 arg2) {
        field2724++;
        if (arg1 >= -40) {
            method1220(17, (byte) -52, (class66) null);
        }
        return class45.method333(0, arg2, arg0) ? class190.method1328((byte) -24) : null;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 21)
    public final void method65(int arg0) {
        field2715++;
        if (this.field2737 == null) {
            this.field2737 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field2737.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else if (arg0 >= 110) {
            if (this.field2740 == 2) {
                this.method1227(1);
            }
            class189.method1320(4096);
            this.method1223(107);
        }
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V", line = 49)
    public static void method1221(int arg0) {
        field2730 = null;
        field2741 = null;
        field2718 = null;
        field2720 = null;
        field2717 = null;
        if (arg0 != 829444428) {
            method1228(38, 90, 77, (byte) -43, -40, 82, 113, 111, -95, 102, 91);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)[I", line = 74)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            method1220(9, (byte) 111, (class66) null);
        }
        field2716++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) -88);
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2723[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 395)
    public class167() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBIII)V", line = 130)
    public static final void method1222(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        int var7 = 64 / ((arg2 + 5) / 57);
        while (var6 <= arg5) {
            class193.method1354((byte) -37, arg0, arg1, arg3, class202.field3337[var6]);
            var6++;
        }
        field2733++;
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)V", line = 146)
    private final void method1223(int arg0) {
        if (arg0 <= 94) {
            this.method1227(-102);
        }
        field2726++;
        int var2 = this.field2740;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field2737.length - 1 && var4 >= this.field2737[var5][0]; var5++) {
                }
                int[] var6 = this.field2737[var5];
                int[] var7 = this.field2737[var5 - 1];
                int var8 = this.method1226(12335, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1226(12335, var5 + 1)[1];
                int var12 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var9 - var8;
                int var16 = var10 + var11 - var8 - var9;
                int var17 = var12 * var14 >> 12;
                int var18 = (var12 * var16 >> 12) * var13 >> 12;
                int var19 = var8 - var10 - var16;
                int var20 = var13 * var19 >> 12;
                int var21 = var18 + var20 + var10 + var17;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field2723[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; this.field2737.length - 1 > var24 && this.field2737[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field2737[var24 - 1];
                int[] var26 = this.field2737[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class51.field730[(var27 & 0x1FE4) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field2723[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; var33 < this.field2737.length - 1 && this.field2737[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field2737[var33];
                int[] var35 = this.field2737[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2723[var31] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)Lri;", line = 336)
    public static final class301 method1224(int arg0, int arg1, int arg2) {
        class301 var3 = class206.method1440(arg2, (byte) -68);
        field2734++;
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 < 99) {
                method1221(63);
            }
            return var3 == null || var3.field4955 == null || var3.field4955.length <= arg0 ? null : var3.field4955[arg0];
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V", line = 356)
    public static final void method1225(int arg0, int arg1) {
        class285 var2 = (class285) class243.field4004.method713(3365, (long) arg1);
        field2728++;
        if (var2 != null) {
            var2.method598(76);
            int var3 = 72 / ((64 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[I", line = 372)
    private final int[] method1226(int arg0, int arg1) {
        if (arg0 != 12335) {
            return (int[]) null;
        }
        field2729++;
        if (arg1 >= 0) {
            return arg1 < this.field2737.length ? this.field2737[arg1] : this.field2722;
        } else {
            return this.field2735;
        }
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "(I)V", line = 400)
    private final void method1227(int arg0) {
        int[] var2 = this.field2737[0];
        field2719++;
        int[] var3 = this.field2737[1];
        int[] var4 = this.field2737[this.field2737.length - 2];
        int[] var5 = this.field2737[this.field2737.length - 1];
        this.field2735 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field2722 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + var4[1] - var5[arg0] };
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILhb;)V", line = 432)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field2738++;
        if (arg0 != 115) {
            this.method67((byte) -48, 41, (class164) null);
        }
        if (arg1 != 0) {
            return;
        }
        this.field2740 = arg2.method1178(arg0 ^ 0x7B);
        this.field2737 = new int[arg2.method1178(arg0 - 107)][2];
        for (int var4 = 0; var4 < this.field2737.length; var4++) {
            this.field2737[var4][0] = arg2.method1161(true);
            this.field2737[var4][1] = arg2.method1161(true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIBIIIIIII)V", line = 464)
    public static final void method1228(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg4 - arg5;
        if (arg3 != -66) {
            method1228(-104, 55, -81, (byte) 95, -32, -26, 42, 103, -46, -78, 7);
        }
        int var12 = arg0 - arg9;
        field2742++;
        boolean var13;
        if (class214.field3527 > 0 && (class214.field3527 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg6;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = (var16 + 1) * arg2 + arg8 >> 16;
            int var18 = arg2 * var16 + arg8 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var10000 = arg10 + var17;
                int var21 = arg10 + var18;
                int var22 = var16 + arg5 >> 6;
                if (var22 >= 0 && class68.field1096.length - 1 >= var22) {
                    int[][] var23 = class68.field1096[var22];
                    for (int var24 = -var15; var24 < (var12 + var15); var24++) {
                        int var25 = (var24 + 1) * arg6 + arg1 >> 16;
                        int var26 = arg1 + (arg6 * var24) >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            var10000 = arg7 + var25;
                            int var29 = arg7 + var26;
                            int var30 = var24 + arg9 >> 6;
                            if (var30 >= 0 && var23.length - 1 >= var30 && var23[var30] != null) {
                                int var31 = (arg9 + var24 & 0x3F << 6) + (arg5 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class83 var33 = class260.method1807(false, var32 - 1);
                                    if (!class328.field5596[var33.field1392]) {
                                        if (var13 && class48.field696 == var33.field1392) {
                                            class129 var34 = new class129();
                                            var34.field2120 = var29;
                                            var34.field2119 = var33.field1392;
                                            var34.field2126 = var21;
                                            class124.field2072.method1582(var34, 4);
                                        } else {
                                            class214.field3530[var33.field1392].method653(var21 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class129 var35 = (class129) class124.field2072.method1580((byte) -39); var35 != null; var35 = (class129) class124.field2072.method1579((byte) 28)) {
            class214.field3530[var35.field2119].method653(var35.field2126 - 7, var35.field2120 - 7);
            class210.method1480(var35.field2126, var35.field2120, 15, 16776960, 128);
            class210.method1480(var35.field2126, var35.field2120, 7, 16777215, 256);
        }
        class124.field2072.method1573((byte) -48);
    }
}
