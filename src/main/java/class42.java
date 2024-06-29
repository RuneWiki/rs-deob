import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class42 extends class213 {

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "J")
    public static long field526 = 0L;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "[[I")
    public static int[][] field529 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Ljava/lang/String;")
    public static String field530 = null;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "[I")
    public static int[] field533 = new int[500];

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Ljava/lang/String;")
    public String field539;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "[I")
    public static int[] field524;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I", line = 8)
    public final int method302(int arg0) {
        field535++;
        return arg0 == 255 ? (int) (this.field304 >>> 32 & 0xFFL) : -2;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I", line = 22)
    public final int method303(int arg0) {
        if (arg0 != -30960) {
            method304(6);
        }
        field534++;
        return (int) this.field304;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V", line = 33)
    public static void method304(int arg0) {
        field530 = null;
        if (arg0 <= 30) {
            method304(106);
        }
        field529 = (int[][]) null;
        field533 = null;
        field524 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V", line = 46)
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -65) {
            return;
        }
        field538++;
        if (class339.field5304 == 0) {
            int var7 = class7.field71;
            int var8 = class237.field3432;
            int var9 = class124.field1652;
            int var10 = (arg1 - arg3) * (var8 - var7) / arg4 + var7;
            int var11 = class40.field499;
            int var12 = (arg6 - arg2) * (var11 - var9) / arg0 + var9;
            if (class276.field3954 && (class119.field1579 & 0x40) != 0) {
                class333 var13 = class283.method1926(class315.field4649, (byte) 82, class71.field936);
                if (var13 == null) {
                    class26.method174((byte) 126);
                } else {
                    class148.method1140(0L, var10, var12, " ->", class351.field5485, (short) 19, class274.field3932, (byte) -123);
                }
            } else {
                class289.field4185++;
                if (class299.field4362 == 1) {
                    class148.method1140(0L, var10, var12, "", class357.field5589, (short) 47, -1, (byte) -100);
                }
                class148.method1140(0L, var10, var12, "", class169.field2346, (short) 26, -1, (byte) 67);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class66.field835; var16++) {
            long var17 = class302.field4429[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = (int) var17 >> 29 & 0x3;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class236.method1684(class56.field724, var19, var20, var17)) {
                    class219 var23 = class345.method2392(var21, 0);
                    if (var23.field3125 != null) {
                        var23 = var23.method1589(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class339.field5304 == 1) {
                        class148.method1140(var17, var19, var20, class99.field1301 + " -> <col=00ffff>" + var23.field3121, class160.field2293, (short) 16, class343.field5342, (byte) -90);
                        class356.field5570++;
                    } else if (class276.field3954) {
                        class321 var24 = class25.field283 == -1 ? null : class89.method646(class25.field283, (byte) -114);
                        if ((class119.field1579 & 0x4) != 0 && (var24 == null || var23.method1587((byte) 75, var24.field4714, class25.field283) != var24.field4714)) {
                            class30.field341++;
                            class148.method1140(var17, var19, var20, class339.field5277 + " -> <col=00ffff>" + var23.field3121, class351.field5485, (short) 4, class274.field3932, (byte) -116);
                        }
                    } else {
                        class118.field1544++;
                        String[] var25 = var23.field3122;
                        if (class307.field4500) {
                            var25 = class305.method2137(-6, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class35.field425++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 41;
                                    }
                                    if (var26 == 1) {
                                        var27 = 37;
                                    }
                                    if (var26 == 2) {
                                        var27 = 32;
                                    }
                                    if (var26 == 3) {
                                        var27 = 40;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1005;
                                    }
                                    int var28 = -1;
                                    if (var23.field3093 == var26) {
                                        var28 = var23.field3154;
                                    }
                                    if (var23.field3119 == var26) {
                                        var28 = var23.field3113;
                                    }
                                    class148.method1140(var17, var19, var20, "<col=00ffff>" + var23.field3121, var25[var26], var27, var28, (byte) 25);
                                }
                            }
                        }
                        class148.method1140((long) var23.field3157, var19, var20, "<col=00ffff>" + var23.field3121, class62.field778, (short) 1007, class251.field3685, (byte) 81);
                    }
                }
                if (var22 == 1) {
                    class169 var29 = class251.field3688[var21];
                    if ((var29.field2345.field2224 & 0x1) == 0 && (var29.field4855 & 0x7F) == 0 && (var29.field4893 & 0x7F) == 0 || (var29.field2345.field2224 & 0x1) == 1 && (var29.field4855 & 0x7F) == 64 && (var29.field4893 & 0x7F) == 64) {
                        int var30 = var29.field4855 - ((var29.field2345.field2224 - 1) * 64);
                        int var31 = -(var29.field2345.field2224 * 64) - (-var29.field4893 - 64);
                        for (int var32 = 0; var32 < class257.field3747; var32++) {
                            class169 var33 = class251.field3688[class305.field4455[var32]];
                            if (var33 != null && !var33.field4876 && var29 != var33 && var33.field4884) {
                                int var34 = var33.field4855 - ((var33.field2345.field2224 - 1) * 64);
                                int var35 = var33.field4893 - (var33.field2345.field2224 - 1) * 64;
                                if (var34 >= var30 && var33.field2345.field2224 <= var29.field2345.field2224 - (var34 - var30 >> 7) && var35 >= var31 && (var29.field2345.field2224 - (var35 - var31 >> 7)) >= var33.field2345.field2224) {
                                    class261.method1798(var33.field2345, 106, var20, class305.field4455[var32], var19);
                                    var33.field4876 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class112.field1441; var36++) {
                            class239 var37 = class311.field4574[class288.field4157[var36]];
                            if (var37 != null && !var37.field4876 && var37.field4884) {
                                int var38 = var37.field4855 - (var37.method1699(-1) - 1) * 64;
                                int var39 = var37.field4893 - ((var37.method1699(-1) - 1) * 64);
                                if (var38 >= var30 && var37.method1699(-1) <= var29.field2345.field2224 - (var38 - var30 >> 7) && var31 <= var39 && var37.method1699(-1) <= (var29.field2345.field2224 - (var39 - var31 >> 7))) {
                                    class25.method164(50, var20, class288.field4157[var36], var37, var19);
                                    var37.field4876 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4876) {
                        continue;
                    }
                    class261.method1798(var29.field2345, 120, var20, var21, var19);
                    var29.field4876 = true;
                }
                if (var22 == 0) {
                    class239 var40 = class311.field4574[var21];
                    if ((var40.field4855 & 0x7F) == 64 && (var40.field4893 & 0x7F) == 64) {
                        int var41 = var40.field4855 - (var40.method1699(-1) - 1) * 64;
                        int var42 = var40.field4893 - ((var40.method1699(-1) - 1) * 64);
                        for (int var43 = 0; var43 < class257.field3747; var43++) {
                            class169 var44 = class251.field3688[class305.field4455[var43]];
                            if (var44 != null && !var44.field4876 && var44.field4884) {
                                int var45 = var44.field4855 - ((var44.field2345.field2224 - 1) * 64);
                                int var46 = var44.field4893 - ((var44.field2345.field2224 - 1) * 64);
                                if (var41 <= var45 && var44.field2345.field2224 <= (var40.method1699(-1) - (var45 - var41 >> 7)) && var42 <= var46 && var44.field2345.field2224 <= (var40.method1699(-1) - (var46 - var42 >> 7))) {
                                    class261.method1798(var44.field2345, 108, var20, class305.field4455[var43], var19);
                                    var44.field4876 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class112.field1441; var47++) {
                            class239 var48 = class311.field4574[class288.field4157[var47]];
                            if (var48 != null && !var48.field4876 && var40 != var48 && var48.field4884) {
                                int var49 = var48.field4855 - (var48.method1699(-1) - 1) * 64;
                                int var50 = var48.field4893 + 64 - (var48.method1699(-1) * 64);
                                if (var49 >= var41 && var48.method1699(-1) <= (var40.method1699(-1) - (var49 - var41 >> 7)) && var42 <= var50 && var48.method1699(-1) <= var40.method1699(-1) - (var50 - var42 >> 7)) {
                                    class25.method164(50, var20, class288.field4157[var47], var48, var19);
                                    var48.field4876 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4876) {
                        continue;
                    }
                    class25.method164(50, var20, var21, var40, var19);
                    var40.field4876 = true;
                }
                if (var22 == 3) {
                    class54 var51 = class20.field221[class56.field724][var19][var20];
                    if (var51 != null) {
                        for (class248 var52 = (class248) var51.method416((byte) 92); var52 != null; var52 = (class248) var51.method418(false)) {
                            int var53 = var52.field3610.field1813;
                            class362 var54 = class172.method1265(var53, (byte) 56);
                            if (class339.field5304 == 1) {
                                class148.method1140((long) var53, var19, var20, class99.field1301 + " -> <col=ff9040>" + var54.field5674, class160.field2293, (short) 28, class343.field5342, (byte) -94);
                                client.field1640++;
                            } else if (class276.field3954) {
                                class321 var55 = class25.field283 == -1 ? null : class89.method646(class25.field283, (byte) -71);
                                if ((class119.field1579 & 0x1) != 0 && (var55 == null || var54.method2526(class25.field283, 0, var55.field4714) != var55.field4714)) {
                                    class261.field3780++;
                                    class148.method1140((long) var53, var19, var20, class339.field5277 + " -> <col=ff9040>" + var54.field5674, class351.field5485, (short) 48, class274.field3932, (byte) -88);
                                }
                            } else {
                                class86.field1104++;
                                String[] var56 = var54.field5716;
                                if (class307.field4500) {
                                    var56 = class305.method2137(-6, var56);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        int var58 = -1;
                                        if (var54.field5698 == var57) {
                                            var58 = var54.field5680;
                                        }
                                        if (var54.field5646 == var57) {
                                            var58 = var54.field5665;
                                        }
                                        class316.field4659++;
                                        byte var59 = 0;
                                        if (var57 == 0) {
                                            var59 = 45;
                                        }
                                        if (var57 == 1) {
                                            var59 = 46;
                                        }
                                        if (var57 == 2) {
                                            var59 = 38;
                                        }
                                        if (var57 == 3) {
                                            var59 = 6;
                                        }
                                        if (var57 == 4) {
                                            var59 = 44;
                                        }
                                        class148.method1140((long) var53, var19, var20, "<col=ff9040>" + var54.field5674, var56[var57], var59, var58, (byte) -90);
                                    }
                                }
                                class148.method1140((long) var53, var19, var20, "<col=ff9040>" + var54.field5674, class62.field778, (short) 1004, class251.field3685, (byte) 61);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V", line = 464)
    public final void method306(byte arg0) {
        this.field3011 = class6.method37(10828) + 500L | this.field3011 & Long.MIN_VALUE;
        if (arg0 != -104) {
            field529 = (int[][]) ((int[][]) null);
        }
        class315.field4641.method740(56, this);
        field522++;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V", line = 476)
    public final void method307(byte arg0) {
        if (arg0 >= -79) {
            method310((class140) null, (byte) 48, 106, 110);
        }
        field537++;
        this.field3011 |= Long.MIN_VALUE;
        if (this.method309(-122) == 0L) {
            class276.field3959.method740(104, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLfh;Lai;Lfh;)V", line = 492)
    public static final void method308(byte arg0, class140 arg1, class76 arg2, class140 arg3) {
        if (arg0 != -40) {
            method305(-41, -28, -105, 42, -120, 70, -114);
        }
        class161.field2300 = arg3;
        class52.field680 = arg1;
        class115.field1486 = arg2;
        if (class161.field2300 != null) {
            class245.field3585 = class161.field2300.method1088(1, 1);
        }
        field532++;
        if (class52.field680 != null) {
            class99.field1295 = class52.field680.method1088(1, 1);
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)J", line = 525)
    public final long method309(int arg0) {
        field527++;
        if (arg0 > -71) {
            this.field536 = 125;
        }
        return this.field3011 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V", line = 537)
    public class42(int arg0, int arg1) {
        this.field304 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lfh;BII)[Lfe;", line = 549)
    public static final class153[] method310(class140 arg0, byte arg1, int arg2, int arg3) {
        field528++;
        if (class134.method1020(1, arg0, arg3, arg2)) {
            return arg1 <= 109 ? (class153[]) null : class88.method642(123);
        } else {
            return null;
        }
    }
}
