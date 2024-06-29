import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class69 extends class512 {

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    private int field1186 = 0;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    private int field1191 = 0;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    private int field1200 = 0;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "[[S")
    public static short[][] field1195;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    private int field1202;

    static {
        new class306((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field1195 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method278(int arg0, int arg1) {
        ++field1185;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 61 % ((arg0 - -40) / 47);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 95, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class402.field6113; ++var12) {
                this.method490(var8[var12], var6[var12], var7[var12], 29);
                this.field1192 += this.field1200;
                this.field1202 += this.field1186;
                this.field1188 += this.field1191;
                while (this.field1192 < 0) {
                    this.field1192 += 4096;
                }
                while (~this.field1192 < -4097) {
                    this.field1192 -= 4096;
                }
                if (this.field1202 < 0) {
                    this.field1202 = 0;
                }
                if (this.field1188 < 0) {
                    this.field1188 = 0;
                }
                if (~this.field1202 < -4097) {
                    this.field1202 = 4096;
                }
                if (this.field1188 > 4096) {
                    this.field1188 = 4096;
                }
                this.method486(this.field1202, this.field1188, -121, this.field1192);
                var9[var12] = this.field1201;
                var10[var12] = this.field1194;
                var11[var12] = this.field1190;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)Lnp;", line = 74)
    public static final class115 method485(int arg0, int arg1) {
        ++field1196;
        class115 var2 = (class115) class512.field7505.method1593((byte) 111, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class127.field2190.method2926(arg0, -119, 1);
            class115 var4 = new class115();
            var4.field2029 = arg0;
            if (var3 != null) {
                var4.method922(false, new class23(var3));
            }
            var4.method925(-1);
            int var5 = 11 % ((arg1 - 82) / 38);
            if (~var4.field2041 == -3 && class220.field3798.method2516((long) arg0, -1) == null) {
                class220.field3798.method2517(new class22(class306.field4885), (long) arg0, (byte) 22);
                class123.field2158[class306.field4885++] = var4;
            }
            class512.field7505.method1595(var4, (long) arg0, (byte) -121);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIII)V", line = 119)
    private final void method486(int arg0, int arg1, int arg2, int arg3) {
        ++field1199;
        int var5 = ~arg1 >= -2049 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 + -(arg0 * arg1 >> 12);
        if (~var5 < -1) {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field1190 = var15;
                                    this.field1194 = var7;
                                    this.field1201 = var5;
                                }
                            } else {
                                this.field1201 = var14;
                                this.field1190 = var5;
                                this.field1194 = var7;
                            }
                        } else {
                            this.field1190 = var5;
                            this.field1201 = var7;
                            this.field1194 = var15;
                        }
                    } else {
                        this.field1190 = var14;
                        this.field1194 = var5;
                        this.field1201 = var7;
                    }
                } else {
                    this.field1194 = var5;
                    this.field1201 = var15;
                    this.field1190 = var7;
                }
            } else {
                this.field1190 = var7;
                this.field1194 = var14;
                this.field1201 = var5;
            }
        } else {
            this.field1201 = this.field1194 = this.field1190 = arg1;
        }
        if (arg2 >= -120) {
            this.field1186 = 42;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 233)
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZILia;)V", line = 237)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field1187;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1191 = (arg2.method167(-2) << 12) / 100;
                }
            } else {
                this.field1186 = (arg2.method167(-2) << 12) / 100;
            }
        } else {
            this.field1200 = arg2.method170(492756037);
        }
        if (!arg0) {
            this.method71(false, 60, (class23) null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(III)Lql;", line = 282)
    public static final class129 method487(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class129 var4 = var3.field6909;
            var3.field6909 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V", line = 295)
    public static void method488(boolean arg0) {
        field1195 = null;
        if (!arg0) {
            field1197 = -66;
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)V", line = 310)
    public static final void method489(int arg0, int arg1) {
        if (arg1 != 0) {
            method487(54, -6, -118);
        }
        class432.method2627((byte) 126);
        ++field1198;
        int var2 = class338.field5296.method2580(arg0, -16).field4801;
        if (~var2 != -1) {
            int var3 = class327.field5160.field4822[arg0];
            if (~var2 == -6) {
                class199.field3176 = var3;
            }
            if (var2 == 6) {
                class290.field4729 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(IIII)V", line = 335)
    private final void method490(int arg0, int arg1, int arg2, int arg3) {
        ++field1193;
        int var5 = arg2 < arg1 ? arg1 : arg2;
        if (arg3 < 7) {
            this.field1200 = 67;
        }
        int var6 = ~arg1 <= ~arg2 ? arg2 : arg1;
        int var7 = ~var5 <= ~arg0 ? var5 : arg0;
        int var8 = var6 <= arg0 ? var6 : arg0;
        int var9 = var7 - var8;
        this.field1188 = (var7 + var8) / 2;
        if (var9 > 0) {
            int var10 = (-arg1 + var7 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            int var12 = (var7 - arg0 << 12) / var9;
            if (~arg1 == ~var7) {
                this.field1192 = ~arg2 == ~var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg2 == var7) {
                this.field1192 = ~arg0 == ~var8 ? var10 + 4096 : 12288 - var12;
            } else {
                this.field1192 = ~arg1 == ~var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field1192 /= 6;
        } else {
            this.field1192 = 0;
        }
        if (~this.field1188 < -1 && ~this.field1188 > -4097) {
            this.field1202 = (var9 << 12) / (~this.field1188 < -2049 ? -(this.field1188 * 2) + 8192 : this.field1188 * 2);
        } else {
            this.field1202 = 0;
        }
    }
}
