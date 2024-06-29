import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class185 extends class122 {

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "Lqd;")
    public static class40 field2973 = class147.method1106("Ladevorgang )2 bitte warten Sie)3", (byte) -64);

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "J")
    public static long field2974 = 0L;

    @OriginalMember(owner = "client!cm", name = "eb", descriptor = "Lqd;")
    public static class40 field2987 = class147.method1106("Konfig geladen)3", (byte) -128);

    @OriginalMember(owner = "client!cm", name = "cb", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!cm", name = "Y", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!cm", name = "ab", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!cm", name = "bb", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!cm", name = "db", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cm", name = "fb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "Lcm;")
    public static class185 field2970;

    @OriginalMember(owner = "client!cm", name = "gb", descriptor = "Lce;")
    public static class239 field2989;

    @OriginalMember(owner = "client!cm", name = "Z", descriptor = "[[[I")
    public static int[][][] field2982;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V", line = 19)
    public static final void method1337(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2974 = 4L;
        }
        field2978++;
        class282 var3 = class51.field983[class160.field2671][arg2][arg1];
        if (var3 == null) {
            class238.method1644(class160.field2671, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class229 var5 = null;
        for (class229 var6 = (class229) var3.method1971(100); var6 != null; var6 = (class229) var3.method1967(100)) {
            class277 var7 = class165.method1243(-75, var6.field3786.field2423);
            int var8 = var7.field4677;
            if (var7.field4637 == 1) {
                var8 = (var6.field3786.field2427 + 1) * var8;
            }
            if (var4 < var8) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class238.method1644(class160.field2671, arg2, arg1);
            return;
        }
        var3.method1973(var5, (byte) -38);
        class229 var9 = (class229) var3.method1971(100);
        class146 var10 = null;
        class146 var11 = null;
        while (var9 != null) {
            class146 var12 = var9.field3786;
            if (var5.field3786.field2423 != var12.field2423) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field2423 != var12.field2423 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class229) var3.method1967(100);
        }
        long var13 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class301.method2054(class160.field2671, arg2, arg1, class293.method2012(class160.field2671, arg1 * 128 + 64, 0, arg2 * 128 + 64), var5.field3786, var13, var11, var10);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lpi;IIZII)V", line = 103)
    public static final void method1338(class300 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2986++;
        if (class227.field3747 >= 50 || arg0.field5014 == null || arg5 >= arg0.field5014.length || arg0.field5014[arg5] == null) {
            return;
        }
        int var6 = arg0.field5014[arg5][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (arg0.field5014[arg5].length > 1) {
            int var10 = (int) ((double) arg0.field5014[arg5].length * Math.random());
            if (var10 > 0) {
                var9 = arg0.field5014[arg5][var10];
            }
        }
        if (var8 == 0) {
            if (arg3) {
                class128.method956(var7, (byte) 114, 0, var9);
            }
        } else if (class105.field1854 != 0) {
            class78.field1324[class227.field3747] = var9;
            class59.field1129[class227.field3747] = var7;
            int var11 = (arg4 - 64) / 128;
            class307.field5146[class227.field3747] = 0;
            class162.field2693[class227.field3747] = null;
            int var12 = (arg1 - 64) / 128;
            if (arg2 != -31987) {
                field2973 = (class40) null;
            }
            class116.field1990[class227.field3747] = (var11 << 8) + (var12 << 16) + var8;
            class227.field3747++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(II)Lma;", line = 168)
    public static final class276 method1339(int arg0, int arg1) {
        field2972++;
        class276 var2 = (class276) class285.field4795.method1345((long) arg1, 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class119.field2010.method1651(class297.method2028(arg1, (byte) -122), class42.method388(arg1, false), -1);
        class276 var4 = new class276();
        var4.field4615 = arg1;
        if (arg0 != -454810365) {
            method1343(-10, 103, (byte) 109, -83);
        }
        if (var3 != null) {
            var4.method1924(new class26(var3), (byte) -100);
        }
        class285.field4795.method1350(var4, (long) arg1, 83);
        return var4;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V", line = 197)
    public static final void method1340(int arg0) {
        field2979++;
        class228.field3768.method1349(true);
        class156.field2616.method1349(true);
        int var1 = 70 % ((arg0 + 87) / 33);
        class28.field604.method1349(true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V", line = 216)
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2975++;
        int var6 = this.field2971 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field2980 << 3;
        if (arg2 == 808464132) {
            int var9 = (arg3 << 4) + (var8 & 0xF);
            this.method739(var6, var8, var7, var9, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIII)V", line = 239)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2984++;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg5 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg5 * arg5;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        if (arg7 != 743906408) {
            return;
        }
        int var19 = var11 * var11;
        int var20 = var19 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var16;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var19 + var17;
        int var26 = var15 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var19 << 2;
        int var29 = var14 << 2;
        int var30 = var16 * 3;
        int var31 = var15 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = var29;
        int var34 = var17 * 3;
        int var35 = (var22 - 3) * var20;
        int var36 = var31;
        int var37 = (var12 - 1) * var28;
        int[] var38 = class37.field694[arg0];
        int var39 = (arg5 - 1) * var27;
        class150.method1124(arg3 - var11, arg3 - arg2, arg6, true, var38);
        class150.method1124(arg3 + var11, -var11 + arg3, arg1, true, var38);
        class150.method1124(arg2 + arg3, arg3 + var11, arg6, true, var38);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var8++;
                    var30 += var29;
                    var24 += var33;
                    var33 += var29;
                }
            }
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var34;
                        var34 += var31;
                        var26 += var36;
                        var36 += var31;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var25 += var34;
                    var26 += var36;
                    var36 += var31;
                    var34 += var31;
                }
                var26 += -var35;
                var25 += -var37;
                var37 -= var28;
                var35 -= var28;
            }
            if (var24 < 0) {
                var23 += var30;
                var8++;
                var30 += var29;
                var24 += var33;
                var33 += var29;
            }
            int var41 = arg3 + var8;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var23 += -var39;
            var39 -= var27;
            int var42 = arg0 + var9;
            int var43 = arg3 - var8;
            int var44 = arg0 - var9;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class150.method1124(var46, var43, arg6, true, class37.field694[var44]);
                class150.method1124(var45, var46, arg1, true, class37.field694[var44]);
                class150.method1124(var41, var45, arg6, true, class37.field694[var44]);
                class150.method1124(var46, var43, arg6, true, class37.field694[var42]);
                class150.method1124(var45, var46, arg1, true, class37.field694[var42]);
                class150.method1124(var41, var45, arg6, true, class37.field694[var42]);
            } else {
                class150.method1124(var41, var43, arg6, true, class37.field694[var44]);
                class150.method1124(var41, var43, arg6, true, class37.field694[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIBI)V", line = 412)
    public static final void method1343(int arg0, int arg1, byte arg2, int arg3) {
        field2988++;
        class213 var4 = class211.method1483(arg0, arg3, arg2 - 18096);
        if (var4 != null && var4.field3524 != null) {
            class109 var5 = new class109();
            var5.field1908 = var4.field3524;
            var5.field1910 = var4;
            class121.method912(var5, 59);
        }
        if (arg2 != 126) {
            return;
        }
        class83.field1440 = arg3;
        class306.field5130 = arg1;
        class235.field3856 = arg0;
        class274.field4549 = true;
        class25.method188(arg2 ^ 0x7E, var4);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 438)
    public static void method1344(byte arg0) {
        field2989 = null;
        if (arg0 == 53) {
            field2970 = null;
            field2987 = null;
            field2973 = null;
            field2982 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V")
    public abstract void method743(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)V")
    public abstract void method734(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)V")
    public abstract void method744(int arg0, int arg1);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII)V")
    public abstract void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIIII)V")
    public abstract void method733(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(II)V")
    public abstract void method735(int arg0, int arg1);
}
