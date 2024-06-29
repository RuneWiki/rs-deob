import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class23 extends class154 {

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    private int field293 = 5;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    private int field299 = 2;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    private int field297 = 1;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    private int field298 = 5;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "[B")
    private byte[] field304 = new byte[512];

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "I")
    private int field307 = 2048;

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "I")
    private int field309 = 0;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "[S")
    private short[] field306 = new short[512];

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Leg;")
    public static class37 field295 = class174.method1167("Lade Schrifts-=tze )2 ", 98);

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field300 = 2;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "Leg;")
    public static class37 field296 = class174.method1167(")2", -63);

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    private final void method138(int arg0) {
        Random var2 = new Random((long) this.field309);
        this.field306 = new short[512];
        if (~this.field307 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field306[var3] = (short) class46.method304(var2, this.field307, -7486);
            }
        }
        ++field294;
        if (arg0 != 0) {
            this.field309 = 116;
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static void method139(int arg0) {
        if (arg0 < 12) {
            method141(10, 124, -109);
        }
        field295 = null;
        field296 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field303;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5 - arg4;
        int var11 = -arg4 + arg3;
        int var12 = arg3;
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var10 * var10;
        int var16 = var13 << 1;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var11 * var11;
        int var20 = arg3 << 1;
        int var21 = var11 << 1;
        int var22 = var19 << 1;
        if (arg6 > -21) {
            field296 = null;
        }
        int var23 = (1 - var20) * var13 + var17;
        int var24 = -((var20 + -1) * var16) + var14;
        int var25 = var19 - (var21 + -1) * var18;
        int var26 = (1 - var21) * var15 + var22;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var19 << 2;
        int var31 = var22 * 3;
        int var32 = (var20 + -3) * var16;
        int var33 = var17 * 3;
        int var34 = (var21 + -3) * var18;
        int var35 = var28;
        int var36 = (arg3 + -1) * var27;
        if (~class286.field5050 >= ~arg7 && arg7 <= class96.field1507) {
            int[] var37 = class210.field3617[arg7];
            int var38 = class139.method975(class178.field2972, true, -arg5 + arg2, class217.field3741);
            int var39 = class139.method975(class178.field2972, true, arg2 + arg5, class217.field3741);
            int var40 = class139.method975(class178.field2972, true, arg2 - var10, class217.field3741);
            int var41 = class139.method975(class178.field2972, true, arg2 + var10, class217.field3741);
            class145.method1010(var40, var38, -25086, arg1, var37);
            class145.method1010(var41, var40, -25086, arg0, var37);
            class145.method1010(var39, var41, -25086, arg1, var37);
        }
        int var42 = (var11 + -1) * var29;
        int var43 = var30;
        while (~var12 < -1) {
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var23 += var33;
                    ++var8;
                    var24 += var35;
                    var33 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                ++var8;
                var24 += var35;
                var23 += var33;
                var35 += var28;
                var33 += var28;
            }
            boolean var44 = ~var11 <= ~var12;
            --var12;
            var23 += -var36;
            int var45 = arg7 - var12;
            var36 -= var27;
            if (var44) {
                if (~var26 > -1) {
                    while (~var26 > -1) {
                        var25 += var43;
                        var26 += var31;
                        var43 += var30;
                        ++var9;
                        var31 += var30;
                    }
                }
                if (var25 < 0) {
                    var26 += var31;
                    var25 += var43;
                    var43 += var30;
                    ++var9;
                    var31 += var30;
                }
                var26 += -var42;
                var25 += -var34;
                var42 -= var29;
                var34 -= var29;
            }
            var24 += -var32;
            var32 -= var27;
            int var46 = arg7 + var12;
            if (~class286.field5050 >= ~var46 && ~var45 >= ~class96.field1507) {
                int var47 = class139.method975(class178.field2972, true, arg2 + var8, class217.field3741);
                int var48 = class139.method975(class178.field2972, true, arg2 - var8, class217.field3741);
                if (var44) {
                    int var49 = class139.method975(class178.field2972, true, arg2 + var9, class217.field3741);
                    int var50 = class139.method975(class178.field2972, true, -var9 + arg2, class217.field3741);
                    if (var45 >= class286.field5050) {
                        int[] var51 = class210.field3617[var45];
                        class145.method1010(var50, var48, -25086, arg1, var51);
                        class145.method1010(var49, var50, -25086, arg0, var51);
                        class145.method1010(var47, var49, -25086, arg1, var51);
                    }
                    if (var46 <= class96.field1507) {
                        int[] var52 = class210.field3617[var46];
                        class145.method1010(var50, var48, -25086, arg1, var52);
                        class145.method1010(var49, var50, -25086, arg0, var52);
                        class145.method1010(var47, var49, -25086, arg1, var52);
                    }
                } else {
                    if (~class286.field5050 >= ~var45) {
                        class145.method1010(var47, var48, -25086, arg1, class210.field3617[var45]);
                    }
                    if (~class96.field1507 <= ~var46) {
                        class145.method1010(var47, var48, -25086, arg1, class210.field3617[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)J")
    public static final long method141(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        return var3 != null && var3.field1868 != null ? var3.field1868.field1222 : 0L;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field308;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field293 = arg0.method1268(255);
                                }
                            } else {
                                this.field298 = arg0.method1268(255);
                            }
                        } else {
                            this.field297 = arg0.method1268(255);
                        }
                    } else {
                        this.field299 = arg0.method1268(255);
                    }
                } else {
                    this.field307 = arg0.method1244(false);
                }
            } else {
                this.field309 = arg0.method1268(arg1 ^ -13890);
            }
        } else {
            this.field298 = this.field293 = arg0.method1268(255);
        }
        if (arg1 != -14015) {
            method141(24, -67, 99);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (arg1 != 1075962732) {
            method140(-78, -112, 70, -34, -109, 94, (byte) 50, 71);
        }
        if (super.field2574.field536) {
            int var4 = 2048 - -(class62.field1029[arg0] * this.field293);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; class227.field3898 > var7; ++var7) {
                class89.field1423 = Integer.MAX_VALUE;
                class240.field4270 = Integer.MAX_VALUE;
                class69.field1099 = Integer.MAX_VALUE;
                class259.field4583 = Integer.MAX_VALUE;
                int var8 = class239.field4263[var7] * this.field298 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field304[(var11 >= this.field293 ? -this.field293 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (255 & this.field304[255 & (var14 >= this.field298 ? -this.field298 + var14 : var14) + var13]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field306[var15] + (var14 << 12));
                        int var17 = -(var11 << 12) + var4 + -this.field306[var27];
                        int var18 = this.field297;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class259.field4583) {
                            class89.field1423 = class240.field4270;
                            class240.field4270 = class69.field1099;
                            class69.field1099 = class259.field4583;
                            class259.field4583 = var19;
                        } else if (~class69.field1099 >= ~var19) {
                            if (class240.field4270 > var19) {
                                class89.field1423 = class240.field4270;
                                class240.field4270 = var19;
                            } else if (class89.field1423 > var19) {
                                class89.field1423 = var19;
                            }
                        } else {
                            class89.field1423 = class240.field4270;
                            class240.field4270 = class69.field1099;
                            class69.field1099 = var19;
                        }
                    }
                }
                int var12 = this.field299;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class69.field1099 - class259.field4583;
                                }
                            } else {
                                var3[var7] = class89.field1423;
                            }
                        } else {
                            var3[var7] = class240.field4270;
                        }
                    } else {
                        var3[var7] = class69.field1099;
                    }
                } else {
                    var3[var7] = class259.field4583;
                }
            }
        }
        ++field302;
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field304 = class4.method31((byte) 86, this.field309);
        if (arg0 == -9) {
            this.method138(0);
            ++field305;
        }
    }
}
