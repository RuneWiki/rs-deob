import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 extends class205 {

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "[B")
    private byte[] field380 = new byte[512];

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "Z")
    private boolean field378 = true;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    private int field384 = 0;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    private int field389 = 4;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    private int field383 = 4;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    private int field382 = 1638;

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
    private int field397 = 4;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "[[I")
    public static int[][] field381 = new int[104][104];

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Lvd;")
    private static class222 field379 = class212.method1357("white:", 10731);

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lvd;")
    public static class222 field392 = field379;

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "Lvd;")
    public static class222 field398 = class212.method1357("mapdots", 10731);

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lvd;")
    public static class222 field399 = field379;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lvd;")
    private static class222 field400 = class212.method1357("Loading sprites )2 ", 10731);

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lvd;")
    public static class222 field390 = field400;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "[S")
    private short[] field394;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "[S")
    private short[] field395;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "[[[I")
    public static int[][][] field391;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIBLjava/awt/Component;)Lwb;")
    public static final class230 method120(int arg0, int arg1, byte arg2, Component arg3) {
        ++field385;
        try {
            Class var4 = Class.forName("ch");
            class230 var5 = (class230) var4.newInstance();
            if (arg2 >= -29) {
                method124((class109) null, 65, -86, 35, -94, -14, 106, 123);
            }
            var5.method252(arg1, -1, arg3, arg0);
            return var5;
        } catch (Throwable var7) {
            class122 var6 = new class122();
            var6.method252(arg1, -1, arg3, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BJ)V")
    public static final void method121(byte arg0, long arg1) {
        ++field388;
        if (~arg1 != -1L) {
            if ((~class86.field1630 > -101 || class105.field1947 == 1) && class86.field1630 < 200) {
                class222 var3 = class204.method1317((byte) -74, arg1).method1409(-7899);
                for (int var4 = 0; var4 < class86.field1630; ++var4) {
                    if (class116.field2210[var4] == arg1) {
                        class160.method1007(false, class234.method1531(new class222[] { var3, class134.field2587 }, arg0 ^ -10915), class29.field646, 0);
                        return;
                    }
                }
                for (int var5 = 0; var5 < class113.field2131; ++var5) {
                    if (~class64.field1173[var5] == ~arg1) {
                        class160.method1007(false, class234.method1531(new class222[] { class140.field2698, var3, class173.field3257 }, -10949), class29.field646, 0);
                        return;
                    }
                }
                if (arg0 != 102) {
                    field379 = null;
                }
                if (var3.method1454(class17.field432.field853, true)) {
                    class160.method1007(false, class107.field1968, class29.field646, 0);
                } else {
                    class31.field657[class86.field1630] = var3;
                    ++class202.field3702;
                    class116.field2210[class86.field1630] = arg1;
                    class36.field784[class86.field1630] = 0;
                    class120.field2270[class86.field1630] = class29.field646;
                    class190.field3504[class86.field1630] = 0;
                    ++class86.field1630;
                    class68.field1283 = class28.field616;
                    class42.field895.method1347((byte) -58, 143);
                    class42.field895.method668(arg1, arg0 + -94);
                }
            } else {
                class160.method1007(false, class234.field4375, class29.field646, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field401;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field3810.field1635) {
                int var4 = class218.field4051[arg1] * this.field389;
                if (this.field397 == 1) {
                    int var5 = this.field395[0] << 12;
                    int var6 = var4 * var5 >> 12;
                    int var7 = var6 >> 12;
                    short var8 = this.field394[0];
                    int var9 = this.field383 * var5 >> 12;
                    int var10 = this.field389 * var5 >> 12;
                    int var11 = var6 & 4095;
                    int var12 = var7 - -1;
                    int var13 = class106.field1960[var11];
                    if (~var12 <= ~var10) {
                        var12 = 0;
                    }
                    int var14 = this.field380[var12 & 255] & 255;
                    int var15 = 255 & this.field380[255 & var7];
                    if (!this.field378) {
                        for (int var16 = 0; var16 < class118.field2245; ++var16) {
                            int var17 = class230.field4319[var16] * this.field383;
                            int var18 = this.method125(var11, var5 * var17 >> 12, var13, var14, var9, var15, false);
                            var3[var16] = var8 * var18 >> 12;
                        }
                    } else {
                        for (int var19 = 0; var19 < class118.field2245; ++var19) {
                            int var20 = class230.field4319[var19] * this.field383;
                            int var21 = this.method125(var11, var5 * var20 >> 12, var13, var14, var9, var15, false);
                            int var22 = var8 * var21 >> 12;
                            var3[var19] = (var22 >> 1) + 2048;
                        }
                    }
                } else {
                    short var23 = this.field394[0];
                    if (var23 > 8 || ~var23 > 7) {
                        int var24 = this.field395[0] << 12;
                        int var25 = this.field389 * var24 >> 12;
                        int var26 = this.field383 * var24 >> 12;
                        int var27 = var4 * var24 >> 12;
                        int var28 = var27 >> 12;
                        int var29 = this.field380[var28 & 255] & 255;
                        int var30 = var28 + 1;
                        int var31 = var27 & 4095;
                        int var32 = class106.field1960[var31];
                        if (var25 <= var30) {
                            var30 = 0;
                        }
                        int var33 = 255 & this.field380[var30 & 255];
                        for (int var34 = 0; var34 < class118.field2245; ++var34) {
                            int var54 = class230.field4319[var34] * this.field383;
                            int var55 = this.method125(var31, var24 * var54 >> 12, var32, var33, var26, var29, false);
                            var3[var34] = var23 * var55 >> 12;
                        }
                    }
                    for (int var35 = 1; var35 < this.field397; ++var35) {
                        short var36 = this.field394[var35];
                        if (~var36 < -9 || var36 < -8) {
                            int var37 = this.field395[var35] << 12;
                            int var38 = this.field389 * var37 >> 12;
                            int var39 = var4 * var37 >> 12;
                            int var40 = this.field383 * var37 >> 12;
                            int var41 = var39 >> 12;
                            int var42 = var41 + 1;
                            int var43 = this.field380[var41 & 255] & 255;
                            int var44 = var39 & 4095;
                            if (var38 <= var42) {
                                var42 = 0;
                            }
                            int var45 = 255 & this.field380[var42 & 255];
                            int var46 = class106.field1960[var44];
                            if (this.field378 && this.field397 + -1 == var35) {
                                for (int var47 = 0; var47 < class118.field2245; ++var47) {
                                    int var48 = class230.field4319[var47] * this.field383;
                                    int var49 = this.method125(var44, var37 * var48 >> 12, var46, var45, var40, var43, false);
                                    int var50 = (var36 * var49 >> 12) + var3[var47];
                                    var3[var47] = (var50 >> 1) + 2048;
                                }
                            } else {
                                for (int var51 = 0; var51 < class118.field2245; ++var51) {
                                    int var52 = class230.field4319[var51] * this.field383;
                                    int var53 = this.method125(var44, var37 * var52 >> 12, var46, var45, var40, var43, false);
                                    var3[var51] += var36 * var53 >> 12;
                                }
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static void method122(boolean arg0) {
        field399 = null;
        field400 = null;
        field379 = null;
        field381 = null;
        field398 = null;
        field390 = null;
        if (!arg0) {
            field391 = null;
            field392 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
    private final void method123(int arg0) {
        ++field387;
        if (arg0 != 380) {
            field381 = null;
        }
        if (~this.field382 >= -1) {
            if (this.field394 != null && this.field394.length == this.field397) {
                this.field395 = new short[this.field397];
                for (int var2 = 0; ~this.field397 < ~var2; ++var2) {
                    this.field395[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field394 = new short[this.field397];
            this.field395 = new short[this.field397];
            for (int var3 = 0; var3 < this.field397; ++var3) {
                this.field394[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field382 / 4096.0F), (double) var3)));
                this.field395[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lka;IIIIIII)V")
    public static final void method124(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field405;
        if (~arg2 <= -1 && arg2 < 104 && arg3 >= 0 && ~arg3 > -105) {
            class161.field3074[arg7][arg2][arg3] = 0;
            while (true) {
                int var8 = arg0.method662((byte) -118);
                if (var8 == 0) {
                    if (arg7 != 0) {
                        class176.field3295[arg7][arg2][arg3] = class176.field3295[arg7 + -1][arg2][arg3] + -240;
                    } else {
                        class176.field3295[0][arg2][arg3] = 8 * -class26.method225(arg3 + 556238 + arg6, arg5 + 932731 + arg2, -91923);
                    }
                    break;
                }
                if (~var8 == -2) {
                    int var9 = arg0.method662((byte) -87);
                    if (~var9 == -2) {
                        var9 = 0;
                    }
                    if (arg7 != 0) {
                        class176.field3295[arg7][arg2][arg3] = class176.field3295[arg7 + -1][arg2][arg3] - var9 * 8;
                    } else {
                        class176.field3295[0][arg2][arg3] = -var9 * 8;
                    }
                    break;
                }
                if (~var8 >= -50) {
                    class96.field1794[arg7][arg2][arg3] = arg0.method661(255);
                    class208.field3871[arg7][arg2][arg3] = (byte) ((var8 + -2) / 4);
                    class113.field2120[arg7][arg2][arg3] = (byte) class139.method876(3, var8 + -2 + arg1);
                } else if (~var8 >= -82) {
                    class161.field3074[arg7][arg2][arg3] = (byte) (var8 + -49);
                } else {
                    class216.field4014[arg7][arg2][arg3] = (byte) (var8 + -81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method662((byte) -119);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method662((byte) -119);
                    break;
                }
                if (~var10 >= -50) {
                    arg0.method662((byte) -118);
                }
            }
        }
        if (arg4 >= -43) {
            method124((class109) null, -117, 91, -117, -27, 9, 87, 107);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIZ)I")
    private final int method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field396;
        int var8 = arg0 + -4096;
        int var9 = arg1 >> 12;
        int var10 = var9 + 1;
        int var11 = arg1 & 4095;
        int var12 = var9 & 255;
        if (~arg4 >= ~var10) {
            var10 = 0;
        }
        int var13 = 3 & this.field380[arg5 + var12];
        int var14 = var10 & 255;
        int var15 = class106.field1960[var11];
        int var16;
        if (var13 > 1) {
            var16 = var13 != 2 ? -var11 - arg0 : var11 - arg0;
        } else {
            var16 = ~var13 != -1 ? -var11 + arg0 : arg0 + var11;
        }
        if (arg6) {
            return 82;
        } else {
            int var17 = var11 + -4096;
            int var18 = this.field380[arg5 + var14] & 3;
            int var19;
            if (var18 > 1) {
                var19 = ~var18 == -3 ? -arg0 + var17 : -arg0 + -var17;
            } else {
                var19 = ~var18 == -1 ? arg0 + var17 : -var17 + arg0;
            }
            int var20 = this.field380[var12 - -arg3] & 3;
            int var21 = var16 - -((var19 - var16) * var15 >> 12);
            int var22;
            if (var20 > 1) {
                var22 = var20 != 2 ? -var8 + -var11 : -var8 + var11;
            } else {
                var22 = ~var20 == -1 ? var11 - -var8 : -var11 + var8;
            }
            int var23 = 3 & this.field380[arg3 + var14];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 != -1 ? var8 - var17 : var17 - -var8;
            } else {
                var24 = var23 != 2 ? -var8 + -var17 : -var8 + var17;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var21 + var25) * arg2 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field386;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field389 = arg0.method662((byte) -111);
                                }
                            } else {
                                this.field383 = arg0.method662((byte) -123);
                            }
                        } else {
                            this.field384 = arg0.method662((byte) -117);
                        }
                    } else {
                        this.field383 = this.field389 = arg0.method662((byte) -86);
                    }
                } else {
                    this.field382 = arg0.method700((byte) 64);
                    if (this.field382 < 0) {
                        this.field394 = new short[this.field397];
                        for (int var5 = 0; ~var5 > ~this.field397; ++var5) {
                            this.field394[var5] = (short) arg0.method700((byte) 64);
                        }
                    }
                }
            } else {
                this.field397 = arg0.method662((byte) -115);
            }
        } else {
            this.field378 = arg0.method662((byte) -90) == 1;
        }
        int var6 = -64 / ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (!arg0) {
            ++field403;
            this.field380 = class3.method25(this.field384, 511);
            this.method123(380);
            for (int var2 = this.field397 + -1; var2 >= 1; --var2) {
                short var3 = this.field394[var2];
                if (var3 > 8 || var3 < -8) {
                    return;
                }
                --this.field397;
            }
        }
    }
}
