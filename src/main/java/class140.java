import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class140 {

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public int field2329 = -1;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    private int field2349 = 128;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    private int field2350 = 0;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    private int field2343 = 128;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    private int field2323 = 0;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "Z")
    public boolean field2356 = false;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lok;")
    public static class146 field2324 = class235.method1724(-12908, ")4p=");

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[J")
    public static long[] field2334 = new long[1000];

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static volatile int field2326 = -1;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "Lok;")
    public static class146 field2338 = class235.method1724(-12908, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field2341 = -1;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "Lok;")
    public static class146 field2345 = class235.method1724(-12908, "titlebg");

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[Lwe;")
    public static class47[] field2339 = new class47[2048];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "[S")
    private short[] field2322;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "[S")
    private short[] field2330;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[S")
    private short[] field2346;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[S")
    private short[] field2357;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBII)Lva;", line = 10)
    public static final class142 method1023(int arg0, byte arg1, int arg2, int arg3) {
        field2353++;
        class142 var4 = new class142();
        var4.field2370 = arg3;
        var4.field2367 = arg0;
        class135.field2266.method805(var4, (long) arg2, 104);
        class297.method2108(1, arg3);
        class264 var5 = class98.method680(arg2, false);
        if (var5 != null) {
            class164.method1280(false, var5);
        }
        if (class31.field575 != null) {
            class164.method1280(false, class31.field575);
            class31.field575 = null;
        }
        int var6 = class45.field763;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class198.method1523((byte) 1, class224.field3739[var7])) {
                class211.method1582(-8264, var7);
            }
        }
        if (arg1 >= -16) {
            method1033(98, 81, -114);
        }
        if (class45.field763 == 1) {
            class295.field4998 = false;
            class112.method759(class171.field2889, class116.field1864, 8, class283.field4851, class113.field1821);
        } else {
            class112.method759(class171.field2889, class116.field1864, 8, class283.field4851, class113.field1821);
            int var8 = class39.field695.method207(class261.field4334);
            for (int var9 = 0; var9 < class45.field763; var9++) {
                int var10 = class39.field695.method207(class45.method311(var9, (byte) 110));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class171.field2889 = class45.field763 * 15 + (class177.field3003 ? 26 : 22);
            class283.field4851 = var8 + 8;
        }
        if (var5 != null) {
            class183.method1444(25096, false, var5);
        }
        class168.method1297((byte) 40, arg3);
        if (class236.field3943 != -1) {
            class35.method254((byte) 90, class236.field3943, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILok;)Z", line = 86)
    public static final boolean method1024(int arg0, class146 arg1) {
        if (arg0 != 39) {
            return false;
        }
        field2332++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class102.field1653; var2++) {
            if (arg1.method1106(class73.field1184[var2], arg0 ^ 0x1A)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILr;)V", line = 116)
    public static final void method1025(int arg0, class264 arg1) {
        field2331++;
        int var2 = arg1.field4470;
        if (var2 == 324) {
            if (class228.field3799 == -1) {
                class228.field3799 = arg1.field4392;
                class272.field4671 = arg1.field4387;
            }
            if (class40.field718.field1526) {
                arg1.field4392 = class228.field3799;
            } else {
                arg1.field4392 = class272.field4671;
            }
        } else if (var2 == 325) {
            if (class228.field3799 == -1) {
                class228.field3799 = arg1.field4392;
                class272.field4671 = arg1.field4387;
            }
            if (class40.field718.field1526) {
                arg1.field4392 = class272.field4671;
            } else {
                arg1.field4392 = class228.field3799;
            }
        } else {
            if (arg0 != 0) {
                field2324 = (class146) null;
            }
            if (var2 == 327) {
                arg1.field4410 = 150;
                arg1.field4514 = (int) (Math.sin((double) class203.field3385 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4384 = 5;
                arg1.field4544 = -1;
            } else if (var2 == 328) {
                if (class102.field1639.field3891 == null) {
                    arg1.field4544 = 0;
                } else {
                    arg1.field4410 = 150;
                    arg1.field4514 = (int) (Math.sin((double) class203.field3385 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field4384 = 5;
                    arg1.field4544 = ((int) class102.field1639.field3891.method1123(arg0 - 13726) << 11) + 2047;
                    arg1.field4378 = class102.field1639.field5429;
                    arg1.field4474 = class102.field1639.field5422;
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V", line = 192)
    public static final void method1026(boolean arg0, int arg1) {
        if (!arg0) {
            field2333++;
            class9.field177.method794(-17435, arg1);
            class226.field3775.method794(-17435, arg1);
            class207.field3460.method794(-17435, arg1);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwe;BI)V", line = 209)
    private final void method1027(class47 arg0, byte arg1, int arg2) {
        field2351++;
        if (arg1 != 97) {
            return;
        }
        if (arg2 == 1) {
            this.field2354 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field2329 = arg0.method379(arg1 ^ 0xFFFFFF9F);
        } else if (arg2 == 4) {
            this.field2343 = arg0.method379(-2);
        } else if (arg2 == 5) {
            this.field2349 = arg0.method379(arg1 ^ 0xFFFFFF9F);
        } else if (arg2 == 6) {
            this.field2337 = arg0.method379(arg1 ^ 0xFFFFFF9F);
        } else if (arg2 == 7) {
            this.field2323 = arg0.method368(arg1 ^ 0xFFFFFFF4);
        } else if (arg2 == 8) {
            this.field2350 = arg0.method368(80);
        } else if (arg2 == 9) {
            this.field2356 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method368(40);
            this.field2330 = new short[var4];
            this.field2346 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2346[var5] = (short) arg0.method379(-2);
                this.field2330[var5] = (short) arg0.method379(class35.method255(arg1, -97));
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method368(77);
            this.field2357 = new short[var6];
            this.field2322 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2357[var7] = (short) arg0.method379(-2);
                this.field2322[var7] = (short) arg0.method379(arg1 - 99);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 300)
    public static void method1028(int arg0) {
        if (arg0 != -20) {
            field2338 = (class146) null;
        }
        field2339 = null;
        field2345 = null;
        field2334 = null;
        field2324 = null;
        field2338 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lok;I)I", line = 314)
    public static final int method1029(class146 arg0, int arg1) {
        field2336++;
        if (class135.field2255 == null || arg0.method1094((byte) -43) == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg1 <= 38) {
            method1034(-34, false, 102, -20, -9, (byte[]) null, (class144[]) null, 21);
        }
        while (class135.field2255.field4796 > var2) {
            if (class135.field2255.field4805[var2].method1126(-42, class264.field4522, class166.field2811).method1100((byte) 106, arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(JZII)Lok;", line = 342)
    public static final class146 method1030(long arg0, boolean arg1, int arg2, int arg3) {
        field2342++;
        if (arg2 > arg3 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg0 % (long) arg3);
            arg0 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class146 var12 = new class146();
        var12.field2461 = var8;
        var12.field2462 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwe;I)V", line = 407)
    public final void method1031(class47 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method368(50);
            if (var3 == 0) {
                field2344++;
                if (arg1 != 0) {
                    method1034(-73, true, -78, 45, 33, (byte[]) null, (class144[]) null, 58);
                }
                return;
            }
            this.method1027(arg0, (byte) 97, var3);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 424)
    public static final void method1032(int arg0, int arg1) {
        class22.field414.method794(-17435, arg1);
        int var2 = 23 % ((-arg0 - 36) / 61);
        field2340++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V", line = 440)
    public static final void method1033(int arg0, int arg1, int arg2) {
        if (~arg1 == arg2 && !class117.field1888) {
            arg1 = 2;
            arg0 = 2;
        }
        field2348++;
        if (class107.field1732 != arg1) {
            if (class212.field3508) {
                return;
            }
            if (class107.field1732 != 0) {
                class200.field3348[class107.field1732].method514();
            }
            if (arg1 != 0) {
                class188 var3 = class200.field3348[arg1];
                var3.method509();
                var3.method512(arg0);
            }
            class107.field1732 = arg1;
            class295.field5000 = arg0;
        } else if (arg1 != 0 && class295.field5000 != arg0) {
            class200.field3348[arg1].method512(arg0);
            class295.field5000 = arg0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIII[B[Lqf;I)V", line = 488)
    public static final void method1034(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5, class144[] arg6, int arg7) {
        field2328++;
        if (!arg1) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg7 + var9 > 0 && (arg7 + var9) < 103 && arg0 + var10 > 0 && (arg0 + var10) < 103) {
                            arg6[var8].field2392[arg7 + var9][arg0 + var10] = class82.method582(arg6[var8].field2392[arg7 + var9][arg0 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg1) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class47 var12 = new class47(arg5);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class259.method1879(0, arg1, var12, arg2, 8, var13, var14 + arg7, arg4, var15 + arg0);
                }
            }
        }
        boolean var16 = false;
        int var17 = 98 / ((29 - arg3) / 49);
        while (var12.field857 < var12.field860.length) {
            int var18 = var12.method368(-125);
            if (var18 != 129) {
                var12.field857--;
                break;
            }
            var16 = true;
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var12.method352(255);
                if (var20 == 0) {
                    int var30 = arg0;
                    int var31 = arg0 + 64;
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg7;
                    if (arg0 < 0) {
                        var30 = 0;
                    } else if (arg0 >= 104) {
                        var30 = 104;
                    }
                    if (arg7 < 0) {
                        var32 = 0;
                    } else if (arg7 >= 104) {
                        var32 = 104;
                    }
                    int var33 = arg7 + 64;
                    if (var33 < 0) {
                        var33 = 0;
                    } else if (var33 >= 104) {
                        var33 = 104;
                    }
                    while (var32 < var33) {
                        while (var31 > var30) {
                            class283.field4846[var19][var32][var30] = 0;
                            var30++;
                        }
                        var32++;
                    }
                } else if (var20 == 1) {
                    for (int var21 = 0; var21 < 64; var21 += 4) {
                        for (int var22 = 0; var22 < 64; var22 += 4) {
                            byte var23 = var12.method352(255);
                            for (int var24 = var21 + arg7; var24 < arg7 + var21 + 4; var24++) {
                                for (int var25 = arg0 + var22; var25 < var22 + arg0 + 4; var25++) {
                                    if (var24 >= 0 && var24 < 104 && var25 >= 0 && var25 < 104) {
                                        class283.field4846[var19][var24][var25] = var23;
                                    }
                                }
                            }
                        }
                    }
                } else if (var20 == 2 && var19 > 0) {
                    int var26 = arg7;
                    if (arg7 < 0) {
                        var26 = 0;
                    } else if (arg7 >= 104) {
                        var26 = 104;
                    }
                    int var27 = arg7 + 64;
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg0;
                    int var29 = arg0 + 64;
                    if (arg0 < 0) {
                        var28 = 0;
                    } else if (arg0 >= 104) {
                        var28 = 104;
                    }
                    if (var29 < 0) {
                        var29 = 0;
                    } else if (var29 >= 104) {
                        var29 = 104;
                    }
                    while (var27 > var26) {
                        while (var29 > var28) {
                            class283.field4846[var19][var26][var28] = class283.field4846[var19 - 1][var26][var28];
                            var28++;
                        }
                        var26++;
                    }
                }
            }
        }
        if (class271.field4640 && !arg1) {
            class175 var34 = null;
            label267: while (true) {
                int var36;
                label260: do {
                    while (var12.field857 < var12.field860.length) {
                        int var35 = var12.method368(-126);
                        if (var35 != 0) {
                            if (var35 != 1) {
                                throw new IllegalStateException();
                            }
                            var36 = var12.method368(116);
                            continue label260;
                        }
                        var34 = new class175(var12);
                    }
                    if (var34 == null) {
                        var34 = new class175();
                    }
                    for (int var41 = 0; var41 < 8; var41++) {
                        for (int var42 = 0; var42 < 8; var42++) {
                            int var43 = (arg7 >> 3) + var41;
                            int var44 = (arg0 >> 3) + var42;
                            if (var43 >= 0 && var43 < 13 && var44 >= 0 && var44 < 13) {
                                class95.field1529[var43][var44] = var34;
                            }
                        }
                    }
                    break label267;
                } while (var36 <= 0);
                for (int var37 = 0; var37 < var36; var37++) {
                    class266 var38 = new class266(var12);
                    var38.field4583 += arg7 << 7;
                    var38.field4578 += arg0 << 7;
                    int var39 = var38.field4583 >> 7;
                    int var40 = var38.field4578 >> 7;
                    if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                        var38.field4594 = (class46.field775[1][var39][var40] & 0x2) != 0;
                        var38.field4589 = class174.field2914[var38.field4568][var39][var40] - var38.field4589;
                        class53.method440(var38);
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        for (int var45 = 0; var45 < 4; var45++) {
            for (int var46 = 0; var46 < 16; var46++) {
                for (int var47 = 0; var47 < 16; var47++) {
                    int var48 = (arg7 >> 2) + var46;
                    int var49 = (arg0 >> 2) + var47;
                    if (var48 >= 0 && var48 < 26 && var49 >= 0 && var49 < 26) {
                        class283.field4846[var45][var48][var49] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)Lfg;", line = 877)
    public final class208 method1035(int arg0, byte arg1) {
        field2347++;
        if (arg1 != -42) {
            method1023(-55, (byte) -59, -91, -53);
        }
        class208 var3 = (class208) class187.field3108.method799((byte) 52, (long) this.field2352);
        if (var3 == null) {
            class130 var4 = class130.method957(class226.field3778, this.field2354, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2346 != null) {
                for (int var5 = 0; var5 < this.field2346.length; var5++) {
                    var4.method938(this.field2346[var5], this.field2330[var5]);
                }
            }
            if (this.field2357 != null) {
                for (int var6 = 0; var6 < this.field2357.length; var6++) {
                    var4.method934(this.field2357[var6], this.field2322[var6]);
                }
            }
            var3 = var4.method961(this.field2323 + 64, this.field2350 + 850, -30, -50, -30);
            class187.field3108.method797(var3, 0, (long) this.field2352);
        }
        class208 var7;
        if (this.field2329 == -1 || arg0 == -1) {
            var7 = var3.method1367(true, true);
        } else {
            var7 = class306.method2156(arg1 ^ 0xFFFFFFAA, this.field2329).method2067(var3, arg0, (byte) -88);
        }
        if (this.field2343 != 128 || this.field2349 != 128) {
            var7.method1357(this.field2343, this.field2349, this.field2343);
        }
        if (this.field2337 != 0) {
            if (this.field2337 == 90) {
                var7.method1386();
            }
            if (this.field2337 == 180) {
                var7.method1356();
            }
            if (this.field2337 == 270) {
                var7.method1349();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 960)
    public static final void method1036(int arg0) {
        field2325++;
        int var1 = class116.field1864;
        int var2 = class113.field1821;
        int var3 = class171.field2889;
        int var4 = class283.field4851;
        if (class276.field4737 == null || class88.field1394 == null) {
            if (class196.field3273.method117(-32236, class306.field5230) && class196.field3273.method117(-32236, class228.field3810)) {
                class276.field4737 = class258.method1876(class306.field5230, -124, class196.field3273, 0);
                class88.field1394 = class258.method1876(class228.field3810, -120, class196.field3273, 0);
                if (class271.field4640) {
                    if ((class276.field4737 instanceof class233)) {
                        class276.field4737 = new class10((class307) class276.field4737);
                    } else {
                        class276.field4737 = new class8((class307) class276.field4737);
                    }
                    if ((class88.field1394 instanceof class233)) {
                        class88.field1394 = new class10((class307) class88.field1394);
                    } else {
                        class88.field1394 = new class8((class307) class88.field1394);
                    }
                }
            } else if (class271.field4640) {
                class131.method974(var2, var1, var4, 20, class192.field3183, 256 - class262.field4367);
            } else {
                class181.method1428(var2, var1, var4, 20, class192.field3183, 256 - class262.field4367);
            }
        }
        if (class276.field4737 != null && class88.field1394 != null) {
            int var5 = var4 / class276.field4737.field1145;
            for (int var6 = 0; var6 < var5; var6++) {
                class276.field4737.method47(var2 + (class276.field4737.field1145 * var6), var1);
            }
            class88.field1394.method47(var2, var1);
            class88.field1394.method46(var2 + var4 - class88.field1394.field1145, var1);
        }
        class39.field695.method210(class261.field4334, var2 + 3, var1 + 14, class55.field986, -1);
        if (class271.field4640) {
            class131.method974(var2, var1 + 20, var4, var3 - 20, class192.field3183, 256 - class262.field4367);
        } else {
            class181.method1428(var2, var1 + 20, var4, var3 - 20, class192.field3183, 256 - class262.field4367);
        }
        int var7 = class232.field3875;
        int var8 = class316.field5368;
        for (int var9 = 0; var9 < class45.field763; var9++) {
            int var10 = (class45.field763 - var9 - 1) * 15 + var1 + 35;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                if (class271.field4640) {
                    class131.method974(var2, var10 - 13, var4, 16, class72.field1176, 256 - class266.field4577);
                } else {
                    class181.method1428(var2, var10 - 13, var4, 16, class72.field1176, 256 - class266.field4577);
                }
            }
        }
        if ((class305.field5225 == null || class139.field2311 == null || class41.field727 == null) && class196.field3273.method117(-32236, class98.field1589) && class196.field3273.method117(-32236, class217.field3581) && class196.field3273.method117(-32236, class232.field3880)) {
            class305.field5225 = class258.method1876(class98.field1589, -124, class196.field3273, 0);
            class139.field2311 = class258.method1876(class217.field3581, -125, class196.field3273, 0);
            class41.field727 = class258.method1876(class232.field3880, -126, class196.field3273, 0);
            if (class271.field4640) {
                if (class305.field5225 instanceof class233) {
                    class305.field5225 = new class10((class307) class305.field5225);
                } else {
                    class305.field5225 = new class8((class307) class305.field5225);
                }
                if (class139.field2311 instanceof class233) {
                    class139.field2311 = new class10((class307) class139.field2311);
                } else {
                    class139.field2311 = new class8((class307) class139.field2311);
                }
                if ((class41.field727 instanceof class233)) {
                    class41.field727 = new class10((class307) class41.field727);
                } else {
                    class41.field727 = new class8((class307) class41.field727);
                }
            }
        }
        if (class305.field5225 != null && class139.field2311 != null && class41.field727 != null) {
            int var11 = var4 / class305.field5225.field1145;
            for (int var12 = 0; var12 < var11; var12++) {
                class305.field5225.method47(class305.field5225.field1145 * var12 + var2, var1 + var3 - class305.field5225.field1155);
            }
            int var13 = (var3 - 20) / class139.field2311.field1155;
            for (int var14 = 0; var14 < var13; var14++) {
                class139.field2311.method47(var2, var1 - (-(class139.field2311.field1155 * var14) - 20));
                class139.field2311.method46(var4 + var2 - class139.field2311.field1145, class139.field2311.field1155 * var14 + var1 - -20);
            }
            class41.field727.method47(var2, var1 + var3 - class41.field727.field1155);
            class41.field727.method46(var2 + var4 - class41.field727.field1145, var1 + var3 + -class41.field727.field1155);
        }
        for (int var15 = 0; var15 < class45.field763; var15++) {
            int var16 = var1 - (-((class45.field763 - var15 - 1) * 15) - 35);
            int var17 = class55.field986;
            if (var7 > var2 && var2 + var4 > var7 && (var16 - 13) < var8 && var8 < var16 + 3) {
                var17 = class281.field4824;
            }
            class39.field695.method210(class45.method311(var15, (byte) 110), var2 + 3, var16, var17, 0);
        }
        if (arg0 > -13) {
            field2341 = 108;
        }
        class133.method984(class171.field2889, class116.field1864, -122, class283.field4851, class113.field1821);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 1143)
    public static final void method1037(int arg0) {
        int var1 = client.field4080.method1659(8, false);
        field2327++;
        if (var1 < class158.field2670) {
            for (int var2 = var1; var2 < class158.field2670; var2++) {
                class190.field3140[class81.field1293++] = class112.field1791[var2];
            }
        }
        if (class158.field2670 < var1) {
            throw new RuntimeException("gppov1");
        }
        class158.field2670 = 0;
        if (arg0 != 19710) {
            method1025(-120, (class264) null);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class112.field1791[var3];
            class234 var5 = class75.field1215[var4];
            int var6 = client.field4080.method1659(1, false);
            if (var6 == 0) {
                class112.field1791[class158.field2670++] = var4;
                var5.field5440 = class203.field3385;
            } else {
                int var7 = client.field4080.method1659(2, false);
                if (var7 == 0) {
                    class112.field1791[class158.field2670++] = var4;
                    var5.field5440 = class203.field3385;
                    class228.field3809[class182.field3045++] = var4;
                } else if (var7 == 1) {
                    class112.field1791[class158.field2670++] = var4;
                    var5.field5440 = class203.field3385;
                    int var11 = client.field4080.method1659(3, false);
                    var5.method2218(false, -123, var11);
                    int var12 = client.field4080.method1659(1, false);
                    if (var12 == 1) {
                        class228.field3809[class182.field3045++] = var4;
                    }
                } else if (var7 == 2) {
                    class112.field1791[class158.field2670++] = var4;
                    var5.field5440 = class203.field3385;
                    int var8 = client.field4080.method1659(3, false);
                    var5.method2218(true, -94, var8);
                    int var9 = client.field4080.method1659(3, false);
                    var5.method2218(true, -101, var9);
                    int var10 = client.field4080.method1659(1, false);
                    if (var10 == 1) {
                        class228.field3809[class182.field3045++] = var4;
                    }
                } else if (var7 == 3) {
                    class190.field3140[class81.field1293++] = var4;
                }
            }
        }
    }
}
