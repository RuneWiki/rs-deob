import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class282 {

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lvd;")
    private class23 field4642;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lte;")
    private class293 field4636;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lnd;")
    private class256 field4633;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4631 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lfh;")
    private class313 field4644;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[Lsj;")
    private class213[] field4639;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfh;)V", line = 7)
    public static final void method1995(int arg0, class313 arg1) {
        int var2 = class88.field1265 >> 2 << 10;
        field4637++;
        int var3 = class88.field1257 >> 1;
        byte[][] var4 = new byte[class88.field1263][class88.field1262];
        while (arg1.field5137 < arg1.field5124.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method2224(-125) == 1) {
                var5 = true;
                var6 = arg1.method2224(-123);
                var7 = arg1.method2224(arg0 ^ 0x67E6);
            }
            int var8 = arg1.method2224(-119);
            int var9 = arg1.method2224(arg0 + 26403);
            int var10 = class88.field1262 + class88.field1256 - var9 * 64 - 1;
            int var11 = var8 * 64 - class88.field1261;
            if (var11 >= 0 && var10 - 63 >= 0 && var11 + 63 < class88.field1263 && var10 < class88.field1262) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || (var6 * 8) <= var12 && (var6 * 8 + 8) > var12 && var7 * 8 <= var14 && var7 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg1.method2200(50);
                        }
                    }
                }
            } else if (var5) {
                arg1.field5137 += 64;
            } else {
                arg1.field5137 += 4096;
            }
        }
        int var15 = class88.field1263;
        int var16 = class88.field1262;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        if (arg0 != -26522) {
            method1997(84, 28, 76, -53, 125, 49, 39, -95);
        }
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            if ((var22 & 0x1FF) == 0) {
                class28.method238(-7, true);
            }
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class324 var26 = class78.method533(1, var25 - 1);
                        var17[var23] += var26.field5317;
                        var18[var23] += var26.field5313;
                        var19[var23] += var26.field5320;
                        var20[var23] += var26.field5316;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class324 var29 = class78.method533(1, var28 - 1);
                        var17[var23] -= var29.field5317;
                        var18[var23] -= var29.field5313;
                        var19[var23] -= var29.field5320;
                        var20[var23] -= var29.field5316;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class88.field1266[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var16 > var37) {
                        var35 += var21[var37];
                        var34 += var20[var37];
                        var32 += var18[var37];
                        var31 += var17[var37];
                        var33 += var19[var37];
                    }
                    if (var38 >= 0) {
                        var34 -= var20[var38];
                        var33 -= var19[var38];
                        var32 -= var18[var38];
                        var31 -= var17[var38];
                        var35 -= var21[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class312.method2178(-58, var32 / var35, var33 / var35, var31 * 256 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class235.method1623(var22, 63) + class235.method1623(var36 << 6, 4032)] = class272.field4474[class77.method528((byte) 52, var42, 96)];
                        } else if (var39 != null) {
                            var39[class235.method1623(63, var22) + (class235.method1623(var36, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z", line = 239)
    public final boolean method1996(int arg0) {
        field4638++;
        if (this.field4644 != null) {
            return true;
        }
        if (this.field4633 == null) {
            if (this.field4636.method2081(20)) {
                return false;
            }
            this.field4633 = this.field4636.method2073((byte) -104, 255, 255, (byte) 0, true);
        }
        if (this.field4633.field1513) {
            return false;
        }
        this.field4644 = new class313(this.field4633.method697(-27));
        this.field4639 = new class213[(this.field4644.field5124.length - 5) / 8];
        if (arg0 != 63) {
            this.field4639 = (class213[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V", line = 275)
    public static final void method1997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4632++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6 - arg2;
        int var11 = arg3 - arg2;
        int var12 = arg3 * arg3;
        int var13 = arg6;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var10 * var10;
        int var17 = var12 << 1;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        if (arg4 < 31) {
            method2002(-55);
        }
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var14 - (var21 - 1) * var17;
        int var23 = var10 << 1;
        int var24 = var16 - (var23 - 1) * var20;
        int var25 = (1 - var21) * var12 + var19;
        int var26 = (1 - var23) * var15 + var18;
        int var27 = var14 << 2;
        int var28 = var16 << 2;
        int var29 = var12 << 2;
        int var30 = var15 << 2;
        int var31 = var19 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = (var23 - 3) * var20;
        int var34 = var18 * 3;
        int var35 = var27;
        int var36 = (arg6 - 1) * var29;
        if (class33.field505 <= arg1 && arg1 <= class278.field4586) {
            int[] var37 = class306.field4998[arg1];
            int var38 = class34.method288(3, arg5 - arg3, class341.field5494, class196.field3001);
            int var39 = class34.method288(3, arg3 + arg5, class341.field5494, class196.field3001);
            int var40 = class34.method288(3, arg5 - var11, class341.field5494, class196.field3001);
            int var41 = class34.method288(3, arg5 + var11, class341.field5494, class196.field3001);
            class270.method1906(arg0, var40, var38, var37, 118);
            class270.method1906(arg7, var41, var40, var37, 125);
            class270.method1906(arg0, var39, var41, var37, 117);
        }
        int var42 = var28;
        int var43 = (var10 - 1) * var30;
        while (var13 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var22 += var35;
                    var25 += var31;
                    var8++;
                    var31 += var27;
                    var35 += var27;
                }
            }
            if (var22 < 0) {
                var8++;
                var22 += var35;
                var35 += var27;
                var25 += var31;
                var31 += var27;
            }
            var22 += -var32;
            var32 -= var29;
            boolean var44 = var10 >= var13;
            var13--;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var24 += var42;
                        var26 += var34;
                        var34 += var28;
                        var9++;
                        var42 += var28;
                    }
                }
                if (var24 < 0) {
                    var26 += var34;
                    var34 += var28;
                    var9++;
                    var24 += var42;
                    var42 += var28;
                }
                var26 += -var43;
                var43 -= var30;
                var24 += -var33;
                var33 -= var30;
            }
            int var45 = arg1 + var13;
            var25 += -var36;
            var36 -= var29;
            int var46 = arg1 - var13;
            if (class33.field505 <= var45 && class278.field4586 >= var46) {
                int var47 = class34.method288(3, arg5 + var8, class341.field5494, class196.field3001);
                int var48 = class34.method288(3, arg5 - var8, class341.field5494, class196.field3001);
                if (var44) {
                    int var49 = class34.method288(3, arg5 + var9, class341.field5494, class196.field3001);
                    int var50 = class34.method288(3, arg5 - var9, class341.field5494, class196.field3001);
                    if (class33.field505 <= var46) {
                        int[] var51 = class306.field4998[var46];
                        class270.method1906(arg0, var50, var48, var51, 121);
                        class270.method1906(arg7, var49, var50, var51, 117);
                        class270.method1906(arg0, var47, var49, var51, 121);
                    }
                    if (var45 <= class278.field4586) {
                        int[] var52 = class306.field4998[var45];
                        class270.method1906(arg0, var50, var48, var52, 120);
                        class270.method1906(arg7, var49, var50, var52, 124);
                        class270.method1906(arg0, var47, var49, var52, 122);
                    }
                } else {
                    if (class33.field505 <= var46) {
                        class270.method1906(arg0, var47, var48, class306.field4998[var46], 119);
                    }
                    if (var45 <= class278.field4586) {
                        class270.method1906(arg0, var47, var48, class306.field4998[var45], 118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqe;ILqe;I)Lsj;", line = 481)
    public final class213 method1998(class218 arg0, int arg1, class218 arg2, int arg3) {
        field4641++;
        return arg3 == 4793 ? this.method1999(-123, true, arg1, arg2, arg0) : (class213) null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZILqe;Lqe;)Lsj;", line = 493)
    private final class213 method1999(int arg0, boolean arg1, int arg2, class218 arg3, class218 arg4) {
        field4640++;
        if (arg0 > -7) {
            this.field4633 = (class256) null;
        }
        if (this.field4644 == null) {
            throw new RuntimeException();
        }
        this.field4644.field5137 = arg2 * 8 + 5;
        if (this.field4644.field5137 >= this.field4644.field5124.length) {
            throw new RuntimeException();
        } else if (this.field4639[arg2] == null) {
            int var6 = this.field4644.method2231((byte) -123);
            int var7 = this.field4644.method2231((byte) -125);
            class213 var8 = new class213(arg2, arg3, arg4, this.field4636, this.field4642, var6, var7, arg1);
            this.field4639[arg2] = var8;
            return var8;
        } else {
            return this.field4639[arg2];
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZII)V", line = 535)
    public static final void method2000(int arg0, boolean arg1, int arg2, int arg3) {
        field4634++;
        class211 var4 = class17.method115(11, arg2, 4086);
        if (!arg1) {
            var4.method1433(true);
            var4.field3210 = arg3;
            var4.field3209 = arg0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 551)
    public final void method2001(int arg0) {
        field4635++;
        if (this.field4639 == null || arg0 != -21690) {
            return;
        }
        for (int var2 = 0; var2 < this.field4639.length; var2++) {
            if (this.field4639[var2] != null) {
                this.field4639[var2].method1450((byte) -73);
            }
        }
        for (int var3 = 0; var3 < this.field4639.length; var3++) {
            if (this.field4639[var3] != null) {
                this.field4639[var3].method1444(78);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 594)
    public static final void method2002(int arg0) {
        class154.field2492.method644((byte) -84);
        if (arg0 > -96) {
            method2000(-116, false, -99, 26);
        }
        field4643++;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lte;Lvd;)V", line = 609)
    public class282(class293 arg0, class23 arg1) {
        this.field4642 = arg1;
        this.field4636 = arg0;
        if (!this.field4636.method2081(20)) {
            this.field4633 = this.field4636.method2073((byte) -109, 255, 255, (byte) 0, true);
        }
    }
}
