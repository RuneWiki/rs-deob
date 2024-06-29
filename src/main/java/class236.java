import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class236 extends class13 {

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    private int field3459 = 0;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "Llb;")
    private class224 field3464 = new class224(16);

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Lan;")
    private class337 field3465 = new class337();

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "J")
    private long field3473 = 0L;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Ljg;")
    private class315 field3437;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "Z")
    private boolean field3466;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "Lan;")
    private class337 field3469;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
    private boolean field3472;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lml;")
    private class142 field3441;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "La;")
    private class289 field3456;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Ljg;")
    private class315 field3447;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lba;")
    private class177 field3442;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3436 = "Checking for updates - ";

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Lsm;")
    public static class167 field3463;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Llc;")
    public static class175 field3432;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lbd;")
    private class322 field3439;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "Z")
    private boolean field3470;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[B")
    private byte[] field3440;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 9)
    public static final String method1673(int arg0, int arg1, byte[] arg2, int arg3) {
        field3434++;
        if (arg3 != -2) {
            method1678((byte) -53, -55);
        }
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class128.field1750[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBIIII)V", line = 51)
    public static final void method1674(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field3471++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg6;
        int var12 = arg0 - arg6;
        int var13 = arg2 * arg2;
        int var14 = var11 * var11;
        int var15 = arg0 * arg0;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = arg0 << 1;
        int var21 = (1 - var20) * var13 + var17;
        int var22 = var12 << 1;
        int var23 = var15 - ((var20 - 1) * var18);
        int var24 = var14 << 1;
        int var25 = var16 - ((var22 - 1) * var24);
        int var26 = var15 << 2;
        int var27 = var14 << 2;
        if (arg3 != -102) {
            method1678((byte) 11, 16);
        }
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = (var20 - 3) * var18;
        int var32 = (1 - var22) * var14 + var19;
        int var33 = (var22 - 3) * var24;
        int var34 = (arg0 - 1) * var28;
        int var35 = var19 * 3;
        int var36 = var26;
        int var37 = var29;
        if (class272.field4273 <= arg5 && class248.field3759 >= arg5) {
            int[] var38 = class206.field2886[arg5];
            int var39 = class140.method930(24918, arg7 - arg2, class56.field678, class109.field1494);
            int var40 = class140.method930(24918, arg2 + arg7, class56.field678, class109.field1494);
            int var41 = class140.method930(24918, arg7 - var11, class56.field678, class109.field1494);
            int var42 = class140.method930(24918, arg7 + var11, class56.field678, class109.field1494);
            class279.method1997(var41, -824384948, var39, arg4, var38);
            class279.method1997(var42, arg3 ^ 0x31231DD6, var41, arg1, var38);
            class279.method1997(var40, -824384948, var42, arg4, var38);
        }
        int var43 = (var12 - 1) * var27;
        while (var9 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var23 += var36;
                    var36 += var26;
                    var8++;
                    var21 += var30;
                    var30 += var26;
                }
            }
            if (var23 < 0) {
                var23 += var36;
                var36 += var26;
                var21 += var30;
                var8++;
                var30 += var26;
            }
            var23 += -var31;
            var31 -= var28;
            boolean var44 = var9 <= var12;
            var21 += -var34;
            if (var44) {
                if (var32 < 0) {
                    while (var32 < 0) {
                        var10++;
                        var25 += var37;
                        var37 += var29;
                        var32 += var35;
                        var35 += var29;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var10++;
                    var37 += var29;
                    var32 += var35;
                    var35 += var29;
                }
                var25 += -var33;
                var32 += -var43;
                var43 -= var27;
                var33 -= var27;
            }
            var9--;
            var34 -= var28;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class272.field4273 && var45 <= class248.field3759) {
                int var47 = class140.method930(24918, arg7 + var8, class56.field678, class109.field1494);
                int var48 = class140.method930(arg3 ^ 0xFFFF9ECC, arg7 - var8, class56.field678, class109.field1494);
                if (var44) {
                    int var49 = class140.method930(arg3 ^ 0xFFFF9ECC, arg7 + var10, class56.field678, class109.field1494);
                    int var50 = class140.method930(24918, arg7 - var10, class56.field678, class109.field1494);
                    if (var45 >= class272.field4273) {
                        int[] var51 = class206.field2886[var45];
                        class279.method1997(var50, -824384948, var48, arg4, var51);
                        class279.method1997(var49, -824384948, var50, arg1, var51);
                        class279.method1997(var47, arg3 - 824384846, var49, arg4, var51);
                    }
                    if (class248.field3759 >= var46) {
                        int[] var52 = class206.field2886[var46];
                        class279.method1997(var50, -824384948, var48, arg4, var52);
                        class279.method1997(var49, -824384948, var50, arg1, var52);
                        class279.method1997(var47, arg3 - 824384846, var49, arg4, var52);
                    }
                } else {
                    if (var45 >= class272.field4273) {
                        class279.method1997(var47, -824384948, var48, arg4, class206.field2886[var45]);
                    }
                    if (class248.field3759 >= var46) {
                        class279.method1997(var47, arg3 ^ 0x31231DD6, var48, arg4, class206.field2886[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lbd;", line = 255)
    public final class322 method94(byte arg0) {
        field3461++;
        if (this.field3439 != null) {
            return this.field3439;
        }
        if (this.field3442 == null) {
            if (this.field3441.method940((byte) -73)) {
                return null;
            }
            this.field3442 = this.field3441.method954(255, this.field3460, (byte) -112, true, (byte) 0);
        }
        if (this.field3442.field2578) {
            return null;
        }
        byte[] var2 = this.field3442.method45(125);
        if (this.field3442 instanceof class183) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3439 = new class322(var2, this.field3454);
                if (this.field3439.field4961 != this.field3449) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3439 = null;
                if (this.field3441.method940((byte) -114)) {
                    this.field3442 = null;
                } else {
                    this.field3442 = this.field3441.method954(255, this.field3460, (byte) -112, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3439 = new class322(var2, this.field3454);
            } catch (RuntimeException var6) {
                this.field3441.method952(arg0 + 24);
                this.field3439 = null;
                if (this.field3441.method940((byte) -113)) {
                    this.field3442 = null;
                } else {
                    this.field3442 = this.field3441.method954(255, this.field3460, (byte) -112, true, (byte) 0);
                }
                return null;
            }
            if (this.field3447 != null) {
                this.field3456.method2067(this.field3460, var2, this.field3447, (byte) 39);
            }
        }
        this.field3442 = null;
        if (this.field3437 != null) {
            this.field3459 = 0;
            this.field3440 = new byte[this.field3439.field4944];
        }
        return arg0 == 70 ? this.field3439 : (class322) null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZZII)V", line = 354)
    public static final void method1675(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field3444++;
        if (arg5 < arg1) {
            int var7 = (arg5 + arg1) / 2;
            class163 var8 = class184.field2649[var7];
            int var9 = arg5;
            class184.field2649[var7] = class184.field2649[arg1];
            class184.field2649[arg1] = var8;
            for (int var10 = arg5; var10 < arg1; var10++) {
                if (class30.method180(var8, arg0, arg4, (byte) 127, arg2, arg3, class184.field2649[var10]) <= 0) {
                    class163 var11 = class184.field2649[var10];
                    class184.field2649[var10] = class184.field2649[var9];
                    class184.field2649[var9++] = var11;
                }
            }
            class184.field2649[arg1] = class184.field2649[var9];
            class184.field2649[var9] = var8;
            method1675(arg0, var9 - 1, arg2, arg3, arg4, arg5, 122);
            method1675(arg0, arg1, arg2, arg3, arg4, var9 + 1, 122);
        }
        if (arg6 <= 115) {
            method1675(-52, 6, 93, true, true, -56, -103);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I", line = 398)
    public final int method1676(boolean arg0) {
        field3435++;
        if (this.field3439 == null) {
            return 0;
        } else {
            if (!arg0) {
                this.field3456 = (class289) null;
            }
            return this.field3439.field4943;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 413)
    public static void method1677(int arg0) {
        field3432 = null;
        field3463 = null;
        field3436 = null;
        if (arg0 != 5204) {
            field3463 = (class167) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I", line = 434)
    public final int method88(int arg0, int arg1) {
        class177 var3 = (class177) this.field3464.method1537((long) arg0, -22708);
        field3433++;
        if (var3 == null) {
            int var4 = -76 / ((arg1 - 11) / 58);
            return 0;
        } else {
            return var3.method41(118);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)C", line = 460)
    public static final char method1678(byte arg0, int arg1) {
        field3457++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1 != -1) {
            method1683(-124);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class128.field1750[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V", line = 487)
    public static final void method1679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3443++;
        if (class314.field4848 == 0) {
            int var7 = class310.field4792;
            int var8 = class232.field3388;
            int var9 = class72.field918;
            int var10 = class295.field4604;
            int var11 = (arg2 - arg4) * (var7 - var10) / arg6 + var10;
            int var12 = (var9 - var8) * (arg5 - arg1) / arg0 + var8;
            if (class72.field909 && (class37.field442 & 0x40) != 0) {
                class263 var13 = class176.method1211(1, class225.field3194, class112.field1595);
                if (var13 == null) {
                    class168.method1101(30509);
                } else {
                    class168.method1100(var12, (short) 26, 0L, " ->", var11, -501, class229.field3343, class260.field3943);
                }
            } else {
                class146.field2030++;
                if (class249.field3769 == 1) {
                    class168.method1100(var12, (short) 10, 0L, "", var11, -501, -1, class279.field4328);
                }
                class168.method1100(var12, (short) 5, 0L, "", var11, -501, -1, class267.field4210);
            }
        }
        long var14 = (long) arg3;
        for (int var16 = 0; var16 < class239.field3584; var16++) {
            long var17 = class94.field1234[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FD6) >> 7;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = ((int) var17 & 0x6C2AF79E) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class292.method2079(class138.field1940, var19, var20, var17)) {
                    class238 var23 = class142.method951(var21, 26915);
                    if (var23.field3525 != null) {
                        var23 = var23.method1706(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class314.field4848 == 1) {
                        class168.method1100(var20, (short) 7, var17, class285.field4488 + " -> <col=00ffff>" + var23.field3518, var19, arg3 - 500, class47.field551, class50.field629);
                        class211.field2979++;
                    } else if (class72.field909) {
                        class30 var24 = class161.field2219 == -1 ? null : class343.method2373(arg3 - 45, class161.field2219);
                        if ((class37.field442 & 0x4) != 0 && (var24 == null || var23.method1693(class161.field2219, var24.field377, false) != var24.field377)) {
                            class168.method1100(var20, (short) 22, var17, class255.field3892 + " -> <col=00ffff>" + var23.field3518, var19, -501, class229.field3343, class260.field3943);
                            class88.field1101++;
                        }
                    } else {
                        String[] var25 = var23.field3513;
                        class58.field697++;
                        if (class35.field418) {
                            var25 = class293.method2082(var25, (byte) 58);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class98.field1281++;
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var23.field3521 == var26) {
                                        var28 = var23.field3493;
                                    }
                                    if (var26 == 0) {
                                        var27 = 48;
                                    }
                                    if (var26 == 1) {
                                        var27 = 8;
                                    }
                                    if (var23.field3527 == var26) {
                                        var28 = var23.field3517;
                                    }
                                    if (var26 == 2) {
                                        var27 = 29;
                                    }
                                    if (var26 == 3) {
                                        var27 = 44;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1001;
                                    }
                                    class168.method1100(var20, var27, var17, "<col=00ffff>" + var23.field3518, var19, -501, var28, var25[var26]);
                                }
                            }
                        }
                        class168.method1100(var20, (short) 1003, (long) var23.field3548, "<col=00ffff>" + var23.field3518, var19, -501, class60.field738, class343.field5323);
                    }
                }
                if (var22 == 1) {
                    class184 var29 = class223.field3159[var21];
                    if ((var29.field2657.field4420 & 0x1) == 0 && (var29.field2392 & 0x7F) == 0 && (var29.field2357 & 0x7F) == 0 || (var29.field2657.field4420 & 0x1) == 1 && (var29.field2392 & 0x7F) == 64 && (var29.field2357 & 0x7F) == 64) {
                        int var30 = var29.field2392 - ((var29.field2657.field4420 - 1) * 64);
                        int var31 = var29.field2357 - ((var29.field2657.field4420 - 1) * 64);
                        for (int var32 = 0; var32 < class127.field1735; var32++) {
                            class184 var33 = class223.field3159[class269.field4238[var32]];
                            if (var33 != null && !var33.field2455 && var29 != var33 && var33.field2383) {
                                int var34 = -(var33.field2657.field4420 * 64) - (-var33.field2392 - 64);
                                int var35 = var33.field2357 + 64 - (var33.field2657.field4420 * 64);
                                if (var34 >= var30 && var33.field2657.field4420 <= var29.field2657.field4420 - (var34 - var30 >> 7) && var31 <= var35 && (var29.field2657.field4420 - (var35 - var31 >> 7)) >= var33.field2657.field4420) {
                                    class158.method1051(var33.field2657, var19, -1, var20, class269.field4238[var32]);
                                    var33.field2455 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class204.field2864; var36++) {
                            class109 var37 = class328.field5009[class180.field2612[var36]];
                            if (var37 != null && !var37.field2455 && var37.field2383) {
                                int var38 = var37.field2392 - ((var37.method748(false) - 1) * 64);
                                int var39 = var37.field2357 - ((var37.method748(false) - 1) * 64);
                                if (var30 <= var38 && var37.method748(false) <= (var29.field2657.field4420 - (var38 - var30 >> 7)) && var39 >= var31 && var37.method748(false) <= (var29.field2657.field4420 - (var39 - var31 >> 7))) {
                                    class180.method1245(var37, var20, class180.field2612[var36], (byte) -111, var19);
                                    var37.field2455 = true;
                                }
                            }
                        }
                    }
                    if (var29.field2455) {
                        continue;
                    }
                    class158.method1051(var29.field2657, var19, -1, var20, var21);
                    var29.field2455 = true;
                }
                if (var22 == 0) {
                    class109 var40 = class328.field5009[var21];
                    if ((var40.field2392 & 0x7F) == 64 && (var40.field2357 & 0x7F) == 64) {
                        int var41 = var40.field2392 - (var40.method748(false) - 1) * 64;
                        int var42 = var40.field2357 - ((var40.method748(false) - 1) * 64);
                        for (int var43 = 0; var43 < class127.field1735; var43++) {
                            class184 var44 = class223.field3159[class269.field4238[var43]];
                            if (var44 != null && !var44.field2455 && var44.field2383) {
                                int var45 = var44.field2392 + 64 - var44.field2657.field4420 * 64;
                                int var46 = var44.field2357 + 64 - var44.field2657.field4420 * 64;
                                if (var45 >= var41 && var44.field2657.field4420 <= (var40.method748(false) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field2657.field4420 <= var40.method748(false) - (var46 - var42 >> 7)) {
                                    class158.method1051(var44.field2657, var19, -1, var20, class269.field4238[var43]);
                                    var44.field2455 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class204.field2864; var47++) {
                            class109 var48 = class328.field5009[class180.field2612[var47]];
                            if (var48 != null && !var48.field2455 && var40 != var48 && var48.field2383) {
                                int var49 = var48.field2392 + 64 - (var48.method748(false) * 64);
                                int var50 = var48.field2357 - (var48.method748(false) - 1) * 64;
                                if (var41 <= var49 && var48.method748(false) <= (var40.method748(false) - (var49 - var41 >> 7)) && var42 <= var50 && var48.method748(false) <= (var40.method748(false) - (var50 - var42 >> 7))) {
                                    class180.method1245(var48, var20, class180.field2612[var47], (byte) -103, var19);
                                    var48.field2455 = true;
                                }
                            }
                        }
                    }
                    if (var40.field2455) {
                        continue;
                    }
                    class180.method1245(var40, var20, var21, (byte) 14, var19);
                    var40.field2455 = true;
                }
                if (var22 == 3) {
                    class337 var51 = class269.field4239[class138.field1940][var19][var20];
                    if (var51 != null) {
                        for (class100 var52 = (class100) var51.method2328(~arg3); var52 != null; var52 = (class100) var51.method2321(arg3 ^ 0x7D)) {
                            int var53 = var52.field1313.field2695;
                            class93 var54 = class60.method353(var53, (byte) -83);
                            if (class314.field4848 == 1) {
                                class270.field4256++;
                                class168.method1100(var20, (short) 33, (long) var53, class285.field4488 + " -> <col=ff9040>" + var54.field1167, var19, -501, class47.field551, class50.field629);
                            } else if (class72.field909) {
                                class30 var55 = class161.field2219 == -1 ? null : class343.method2373(-125, class161.field2219);
                                if ((class37.field442 & 0x1) != 0 && (var55 == null || var54.method558(class161.field2219, 0, var55.field377) != var55.field377)) {
                                    class168.method1100(var20, (short) 42, (long) var53, class255.field3892 + " -> <col=ff9040>" + var54.field1167, var19, -501, class229.field3343, class260.field3943);
                                    class335.field5170++;
                                }
                            } else {
                                String[] var56 = var54.field1172;
                                class171.field2474++;
                                if (class35.field418) {
                                    var56 = class293.method2082(var56, (byte) 123);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        byte var58 = 0;
                                        class32.field396++;
                                        if (var57 == 0) {
                                            var58 = 15;
                                        }
                                        if (var57 == 1) {
                                            var58 = 1;
                                        }
                                        if (var57 == 2) {
                                            var58 = 25;
                                        }
                                        int var59 = -1;
                                        if (var54.field1157 == var57) {
                                            var59 = var54.field1150;
                                        }
                                        if (var57 == 3) {
                                            var58 = 59;
                                        }
                                        if (var54.field1159 == var57) {
                                            var59 = var54.field1153;
                                        }
                                        if (var57 == 4) {
                                            var58 = 39;
                                        }
                                        class168.method1100(var20, var58, (long) var53, "<col=ff9040>" + var54.field1167, var19, -501, var59, var56[var57]);
                                    }
                                }
                                class168.method1100(var20, (short) 1006, (long) var53, "<col=ff9040>" + var54.field1167, var19, arg3 - 500, class60.field738, class343.field5323);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I", line = 888)
    public final int method1680(byte arg0) {
        field3455++;
        if (this.field3439 == null) {
            return 0;
        } else if (!this.field3466) {
            return this.field3439.field4943;
        } else if (arg0 <= 97) {
            return -40;
        } else {
            class332 var2 = this.field3469.method2331((byte) 35);
            return var2 == null ? 0 : (int) var2.field5065;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)V", line = 916)
    public final void method91(int arg0, int arg1) {
        field3452++;
        if (this.field3437 == null) {
            return;
        }
        int var3 = -28 / ((47 - arg0) / 46);
        for (class332 var4 = this.field3465.method2331((byte) 119); var4 != null; var4 = this.field3465.method2332(-111)) {
            if ((long) arg1 == var4.field5065) {
                return;
            }
        }
        class332 var5 = new class332();
        var5.field5065 = (long) arg1;
        this.field3465.method2325(var5, (byte) 34);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 955)
    public final void method1681(byte arg0) {
        if (arg0 <= 18) {
            return;
        }
        field3438++;
        if (this.field3469 != null) {
            if (this.method94((byte) 70) == null) {
                return;
            }
            if (this.field3466) {
                boolean var6 = true;
                for (class332 var7 = this.field3469.method2331((byte) 39); var7 != null; var7 = this.field3469.method2332(-119)) {
                    int var8 = (int) var7.field5065;
                    if (this.field3440[var8] == 0) {
                        this.method1687(var8, 1, 91);
                    }
                    if (this.field3440[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method2285(true);
                    }
                }
                while (this.field3439.field4955.length > this.field3468) {
                    if (this.field3439.field4955[this.field3468] == 0) {
                        this.field3468++;
                    } else {
                        if (this.field3456.field4536 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3440[this.field3468] == 0) {
                            this.method1687(this.field3468, 1, 90);
                        }
                        if (this.field3440[this.field3468] == 0) {
                            var6 = false;
                            class332 var9 = new class332();
                            var9.field5065 = (long) this.field3468;
                            this.field3469.method2325(var9, (byte) 34);
                        }
                        this.field3468++;
                    }
                }
                if (var6) {
                    this.field3466 = false;
                    this.field3468 = 0;
                }
            } else if (this.field3470) {
                boolean var2 = true;
                for (class332 var3 = this.field3469.method2331((byte) 6); var3 != null; var3 = this.field3469.method2332(-57)) {
                    int var4 = (int) var3.field5065;
                    if (this.field3440[var4] != 1) {
                        this.method1687(var4, 2, 113);
                    }
                    if (this.field3440[var4] == 1) {
                        var3.method2285(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3468 < this.field3439.field4955.length) {
                    if (this.field3439.field4955[this.field3468] == 0) {
                        this.field3468++;
                    } else {
                        if (this.field3441.method953(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3440[this.field3468] != 1) {
                            this.method1687(this.field3468, 2, -93);
                        }
                        if (this.field3440[this.field3468] != 1) {
                            class332 var5 = new class332();
                            var5.field5065 = (long) this.field3468;
                            this.field3469.method2325(var5, (byte) 34);
                            var2 = false;
                        }
                        this.field3468++;
                    }
                }
                if (var2) {
                    this.field3468 = 0;
                    this.field3470 = false;
                }
            } else {
                this.field3469 = null;
            }
        }
        if (!this.field3472 || this.field3473 > class200.method1375(-16185)) {
            return;
        }
        for (class177 var10 = (class177) this.field3464.method1540(56); var10 != null; var10 = (class177) this.field3464.method1544(24)) {
            if (!var10.field2578) {
                if (var10.field2573) {
                    if (!var10.field2572) {
                        throw new RuntimeException();
                    }
                    var10.method2285(true);
                } else {
                    var10.field2573 = true;
                }
            }
        }
        this.field3473 = class200.method1375(-16185) + 1000L;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)I", line = 1133)
    public final int method1682(boolean arg0) {
        field3450++;
        if (!arg0) {
            this.method1681((byte) 48);
        }
        if (this.method94((byte) 70) == null) {
            return this.field3442 == null ? 0 : this.field3442.method41(109);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z", line = 1153)
    public static final boolean method1683(int arg0) {
        field3453++;
        return class281.field4357 == arg0 ? class195.field2802.method1576((byte) 127) : true;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILjg;Ljg;Lml;La;IIZ)V", line = 1493)
    public class236(int arg0, class315 arg1, class315 arg2, class142 arg3, class289 arg4, int arg5, int arg6, boolean arg7) {
        this.field3437 = arg1;
        this.field3460 = arg0;
        if (this.field3437 == null) {
            this.field3466 = false;
        } else {
            this.field3466 = true;
            this.field3469 = new class337();
        }
        this.field3454 = arg5;
        this.field3472 = arg7;
        this.field3449 = arg6;
        this.field3441 = arg3;
        this.field3456 = arg4;
        this.field3447 = arg2;
        if (this.field3447 != null) {
            this.field3442 = this.field3456.method2064(this.field3460, this.field3447, 1438536492);
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I", line = 1167)
    public final int method1684(int arg0) {
        if (arg0 != -1) {
            method1677(-89);
        }
        field3458++;
        return this.field3459;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[B", line = 1180)
    public final byte[] method89(int arg0, int arg1) {
        field3445++;
        class177 var3 = this.method1687(arg0, arg1, 70);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method45(111);
            var3.method2285(true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V", line = 1196)
    public final void method1685(byte arg0) {
        field3467++;
        if (this.field3437 != null && arg0 == -43) {
            this.field3470 = true;
            if (this.field3469 == null) {
                this.field3469 = new class337();
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V", line = 1217)
    public final void method1686(byte arg0) {
        field3448++;
        if (this.field3469 == null || this.method94((byte) 70) == null || arg0 != 56) {
            return;
        }
        for (class332 var2 = this.field3465.method2331((byte) 13); var2 != null; var2 = this.field3465.method2332(arg0 - 150)) {
            int var3 = (int) var2.field5065;
            if (var3 < 0 || this.field3439.field4944 <= var3 || this.field3439.field4955[var3] == 0) {
                var2.method2285(true);
            } else {
                if (this.field3440[var3] == 0) {
                    this.method1687(var3, 1, -110);
                }
                if (this.field3440[var3] == -1) {
                    this.method1687(var3, 2, 120);
                }
                if (this.field3440[var3] == 1) {
                    var2.method2285(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lba;", line = 1261)
    private final class177 method1687(int arg0, int arg1, int arg2) {
        field3446++;
        int var4 = 84 / ((22 - arg2) / 46);
        class177 var5 = (class177) this.field3464.method1537((long) arg0, -22708);
        if (var5 != null && arg1 == 0 && !var5.field2572 && var5.field2578) {
            var5.method2285(true);
            var5 = null;
        }
        if (var5 == null) {
            if (arg1 == 0) {
                if (this.field3437 == null || this.field3440[arg0] == -1) {
                    if (this.field3441.method940((byte) -106)) {
                        return null;
                    }
                    var5 = this.field3441.method954(this.field3460, arg0, (byte) -112, true, (byte) 2);
                } else {
                    var5 = this.field3456.method2064(arg0, this.field3437, 1438536492);
                }
            } else if (arg1 == 1) {
                if (this.field3437 == null) {
                    throw new RuntimeException();
                }
                var5 = this.field3456.method2063(arg0, 3, this.field3437);
            } else if (arg1 == 2) {
                if (this.field3437 == null) {
                    throw new RuntimeException();
                }
                if (this.field3440[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3441.method953(-21)) {
                    return null;
                }
                var5 = this.field3441.method954(this.field3460, arg0, (byte) -112, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3464.method1541(false, var5, (long) arg0);
        }
        if (var5.field2578) {
            return null;
        }
        byte[] var6 = var5.method45(119);
        if (!var5 instanceof class183) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class243.field3653.reset();
                class243.field3653.update(var6, 0, var6.length - 2);
                int var7 = (int) class243.field3653.getValue();
                if (this.field3439.field4953[arg0] != var7) {
                    throw new RuntimeException();
                }
                this.field3441.field2003 = 0;
                this.field3441.field2002 = 0;
            } catch (RuntimeException var15) {
                this.field3441.method952(76);
                var5.method2285(true);
                if (var5.field2572 && !this.field3441.method940((byte) -75)) {
                    class9 var9 = this.field3441.method954(this.field3460, arg0, (byte) -112, true, (byte) 2);
                    this.field3464.method1541(false, var9, (long) arg0);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3439.field4942[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field3439.field4942[arg0];
            if (this.field3437 != null) {
                this.field3456.method2067(arg0, var6, this.field3437, (byte) 39);
                if (this.field3440[arg0] != 1) {
                    this.field3459++;
                    this.field3440[arg0] = 1;
                }
            }
            if (!var5.field2572) {
                var5.method2285(true);
            }
            return var5;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class243.field3653.reset();
            class243.field3653.update(var6, 0, var6.length - 2);
            int var10 = (int) class243.field3653.getValue();
            if (this.field3439.field4953[arg0] != var10) {
                throw new RuntimeException();
            }
            int var11 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3439.field4942[arg0] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field3440[arg0] != 1) {
                if (this.field3440[arg0] != 0) {
                }
                this.field3459++;
                this.field3440[arg0] = 1;
            }
            if (!var5.field2572) {
                var5.method2285(true);
            }
            return var5;
        } catch (Exception var14) {
            this.field3440[arg0] = -1;
            var5.method2285(true);
            if (var5.field2572 && !this.field3441.method940((byte) -92)) {
                class9 var13 = this.field3441.method954(this.field3460, arg0, (byte) -112, true, (byte) 2);
                this.field3464.method1541(false, var13, (long) arg0);
            }
            return null;
        }
    }
}
