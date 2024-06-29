import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class128 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2283 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljf;")
    public static class229 field2284 = class212.method1457((byte) 116, "Schlie-8en");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Ljf;")
    public static class229 field2287 = class212.method1457((byte) 63, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljf;")
    public static class229 field2289 = class212.method1457((byte) 102, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lek;")
    public static class185 field2291;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
    public static boolean field2292;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILkh;)V", line = 7)
    public final void method902(int arg0, class14 arg1) {
        if (arg0 != 690) {
            field2289 = (class229) null;
        }
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                field2288++;
                return;
            }
            this.method906((byte) 7, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JZ)V", line = 29)
    public static final void method903(long arg0, boolean arg1) {
        field2286++;
        if (arg0 == 0L) {
            return;
        }
        if (class162.field2753 >= 100) {
            class28.method245((byte) -75, 0, class331.field5638, class179.field3099);
            return;
        }
        class229 var3 = class252.method1800(false, arg0).method1606((byte) 124);
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < class162.field2753; var4++) {
            if (class212.field3643[var4] == arg0) {
                class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { var3, class15.field233 }, -59));
                return;
            }
        }
        for (int var5 = 0; var5 < class113.field2044; var5++) {
            if (class31.field536[var5] == arg0) {
                class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { class6.field59, var3, class295.field5042 }, -95));
                return;
            }
        }
        if (var3.method1641((byte) -64, class301.field5124.field621)) {
            class28.method245((byte) -75, 0, class331.field5638, class120.field2132);
            return;
        }
        class212.field3643[class162.field2753] = arg0;
        class234.field4052++;
        class52.field906[class162.field2753++] = class252.method1800(false, arg0);
        class258.field4491 = class6.field70;
        class84.field1608.method1397(140, 0);
        class84.field1608.method118(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIILhg;JLhg;Lhg;)V", line = 98)
    public static final void method904(int arg0, int arg1, int arg2, int arg3, class174 arg4, long arg5, class174 arg6, class174 arg7) {
        class240 var9 = new class240();
        var9.field4240 = arg4;
        var9.field4235 = arg1 * 128 + 64;
        var9.field4236 = arg2 * 128 + 64;
        var9.field4228 = arg3;
        var9.field4233 = arg5;
        var9.field4241 = arg6;
        var9.field4237 = arg7;
        int var10 = 0;
        class125 var11 = class312.field5246[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2201; var12++) {
                class104 var13 = var11.field2204[var12];
                if ((var13.field1814 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1806.method201();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4232 = -var10;
        if (class312.field5246[arg0][arg1][arg2] == null) {
            class312.field5246[arg0][arg1][arg2] = new class125(arg0, arg1, arg2);
        }
        class312.field5246[arg0][arg1][arg2].field2196 = var9;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBIIII)V", line = 144)
    public static final void method905(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class23.field415 == 0) {
            class93.field1675++;
            int var7 = class214.field3688;
            int var8 = class324.field5468;
            int var9 = class165.field2827;
            int var10 = class297.field5079;
            int var11 = (arg6 - arg3) * (var8 - var7) / arg5 + var7;
            int var12 = (var10 - var9) * (arg4 - arg0) / arg1 + var9;
            if (class273.field4677 && (class324.field5471 & 0x40) == 64) {
                class67 var13 = class189.method1305(class157.field2693, 2048, class232.field4035);
                if (var13 == null) {
                    class71.method523(-25);
                } else {
                    class194.method1334(0L, var11, var12, -12158, (short) 8, class228.field3916, class299.field5090);
                }
            } else {
                if (class98.field1739 == 1) {
                    class194.method1334(0L, var11, var12, -12158, (short) 46, class141.field2449, class331.field5638);
                }
                class194.method1334(0L, var11, var12, arg2 - 12204, (short) 28, class144.field2516, class331.field5638);
            }
        }
        field2285++;
        long var14 = -1L;
        if (arg2 != 46) {
            return;
        }
        for (int var16 = 0; var16 < class156.field2653; var16++) {
            long var17 = class45.field832[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = ((int) var17 & 0x3FF0) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class307.method2094(class16.field254, var19, var21, var17)) {
                    class83 var23 = class271.method1909(24, var22);
                    if (var23.field1593 != null) {
                        var23 = var23.method598((byte) 31);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class23.field415 == 1) {
                        class4.field31++;
                        class194.method1334(var17, var19, var21, -12158, (short) 4, class156.field2670, class142.method989(new class229[] { class26.field472, class167.field2863, var23.field1530 }, -64));
                    } else if (!class273.field4677) {
                        class122.field2147++;
                        class229[] var24 = var23.field1588;
                        if (class136.field2374) {
                            var24 = class172.method1168((byte) -93, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class199.field3485++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 57;
                                    }
                                    if (var25 == 1) {
                                        var26 = 30;
                                    }
                                    if (var25 == 2) {
                                        var26 = 35;
                                    }
                                    if (var25 == 3) {
                                        var26 = 24;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class194.method1334(var17, var19, var21, -12158, var26, var24[var25], class142.method989(new class229[] { class48.field880, var23.field1530 }, -31));
                                }
                            }
                        }
                        class194.method1334((long) var23.field1580, var19, var21, -12158, (short) 1006, class44.field792, class142.method989(new class229[] { class48.field880, var23.field1530 }, -39));
                    } else if ((class324.field5471 & 0x4) == 4) {
                        class194.method1334(var17, var19, var21, arg2 - 12204, (short) 7, class228.field3916, class142.method989(new class229[] { class147.field2550, class167.field2863, var23.field1530 }, -29));
                        class70.field1337++;
                    }
                }
                if (var20 == 1) {
                    class331 var27 = class331.field5637[var22];
                    if (var27.field5631.field2952 == 1 && (var27.field1983 & 0x7F) == 64 && (var27.field2028 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class126.field2238; var28++) {
                            class331 var29 = class331.field5637[class283.field4858[var28]];
                            if (var29 != null && var27 != var29 && var29.field5631.field2952 == 1 && var27.field1983 == var29.field1983 && var27.field2028 == var29.field2028) {
                                class100.method681(var29.field5631, class283.field4858[var28], var19, (byte) 103, var21);
                            }
                        }
                        for (int var30 = 0; var30 < class132.field2323; var30++) {
                            class33 var31 = class192.field3334[class90.field1652[var30]];
                            if (var31 != null && var27.field1983 == var31.field1983 && var27.field2028 == var31.field2028) {
                                class256.method1831(var31, class90.field1652[var30], 7, var19, var21);
                            }
                        }
                    }
                    class100.method681(var27.field5631, var22, var19, (byte) 103, var21);
                }
                if (var20 == 0) {
                    class33 var32 = class192.field3334[var22];
                    if ((var32.field1983 & 0x7F) == 64 && (var32.field2028 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class126.field2238; var33++) {
                            class331 var34 = class331.field5637[class283.field4858[var33]];
                            if (var34 != null && var34.field5631.field2952 == 1 && var32.field1983 == var34.field1983 && var32.field2028 == var34.field2028) {
                                class100.method681(var34.field5631, class283.field4858[var33], var19, (byte) 103, var21);
                            }
                        }
                        for (int var35 = 0; var35 < class132.field2323; var35++) {
                            class33 var36 = class192.field3334[class90.field1652[var35]];
                            if (var36 != null && var32 != var36 && var32.field1983 == var36.field1983 && var32.field2028 == var36.field2028) {
                                class256.method1831(var36, class90.field1652[var35], 7, var19, var21);
                            }
                        }
                    }
                    class256.method1831(var32, var22, 7, var19, var21);
                }
                if (var20 == 3) {
                    class303 var37 = class105.field1822[class16.field254][var19][var21];
                    if (var37 != null) {
                        for (class277 var38 = (class277) var37.method2077(-25670); var38 != null; var38 = (class277) var37.method2081(true)) {
                            int var39 = var38.field4764.field894;
                            class313 var40 = class113.method799(var39, (byte) 50);
                            if (class23.field415 == 1) {
                                class194.method1334((long) var39, var19, var21, -12158, (short) 6, class156.field2670, class142.method989(new class229[] { class26.field472, class134.field2346, var40.field5281 }, -111));
                                class256.field4475++;
                            } else if (!class273.field4677) {
                                class261.field4531++;
                                class229[] var41 = var40.field5305;
                                if (class136.field2374) {
                                    var41 = class172.method1168((byte) -93, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class172.field2985++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 37;
                                        }
                                        if (var42 == 1) {
                                            var43 = 34;
                                        }
                                        if (var42 == 2) {
                                            var43 = 29;
                                        }
                                        if (var42 == 3) {
                                            var43 = 60;
                                        }
                                        if (var42 == 4) {
                                            var43 = 9;
                                        }
                                        class194.method1334((long) var39, var19, var21, -12158, var43, var41[var42], class142.method989(new class229[] { class110.field1944, var40.field5281 }, -116));
                                    } else if (var42 == 2) {
                                        class194.method1334((long) var39, var19, var21, -12158, (short) 29, class220.field3757, class142.method989(new class229[] { class110.field1944, var40.field5281 }, -100));
                                        class185.field3239++;
                                    }
                                }
                                class194.method1334((long) var39, var19, var21, -12158, (short) 1001, class44.field792, class142.method989(new class229[] { class110.field1944, var40.field5281 }, -72));
                            } else if ((class324.field5471 & 0x1) == 1) {
                                class201.field3520++;
                                class194.method1334((long) var39, var19, var21, -12158, (short) 50, class228.field3916, class142.method989(new class229[] { class147.field2550, class134.field2346, var40.field5281 }, arg2 - 105));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLkh;I)V", line = 469)
    private final void method906(byte arg0, class14 arg1, int arg2) {
        if (arg2 == 5) {
            this.field2283 = arg1.method116(-1);
        }
        if (arg0 < 6) {
            method905(107, -24, (byte) -42, -60, 112, 62, -50);
        }
        field2282++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILek;)V", line = 501)
    public static final void method907(int arg0, class185 arg1) {
        field2281++;
        if (arg0 == -3) {
            class282.field4829 = arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 512)
    public static void method908(int arg0) {
        field2284 = null;
        field2287 = null;
        if (arg0 != 0) {
            method903(54L, false);
        }
        field2291 = null;
        field2289 = null;
    }
}
