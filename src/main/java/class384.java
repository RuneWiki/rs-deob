import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class384 extends class184 {

    @OriginalMember(owner = "client!es", name = "o", descriptor = "[I")
    public int[] field5804 = new int[] { -1 };

    @OriginalMember(owner = "client!es", name = "t", descriptor = "[I")
    public int[] field5809 = new int[1];

    @OriginalMember(owner = "client!es", name = "p", descriptor = "[I")
    public static int[] field5805 = new int[4096];

    @OriginalMember(owner = "client!es", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5807 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!es", name = "u", descriptor = "Lmia;")
    public static class63 field5810 = new class63(30, 8);

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLnn;)Z", line = 4)
    public static final boolean method2467(int arg0, byte arg1, class417 arg2) {
        class122.field1656.method767(arg2.field6249[arg0], arg2.field6242[arg0], arg2.field6239[arg0], class640.field8984);
        field5806++;
        int var3 = class640.field8984[2];
        if (var3 < 50) {
            return false;
        }
        arg2.field6247[arg0] = (short) (class640.field8984[0] * class413.field6212 / var3 + class622.field8733);
        arg2.field6240[arg0] = (short) (class640.field8984[1] * class548.field7822 / var3 + class516.field7342);
        int var4 = 115 / ((-arg1 - 50) / 43);
        arg2.field6255[arg0] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZIII)I", line = 24)
    public static final int method2468(boolean arg0, int arg1, int arg2, int arg3) {
        field5802++;
        if (!arg0) {
            method2469(111);
        }
        if (class582.field8287 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class194.field2946 - 1 || class255.field3656 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class60.field847[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class582.field8287[var6].method1786(arg3, (byte) 113, arg1);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 52)
    public static void method2469(int arg0) {
        field5807 = null;
        if (arg0 >= 34) {
            field5805 = null;
            field5810 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([I[IZII)J", line = 67)
    private final long method2470(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        field5811++;
        long[] var6 = class118.field1615;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        if (arg4 != 414064088) {
            method2469(66);
        }
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg0[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg1[var14]) & 0xFFL)];
            }
        }
        return var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 113)
    public static final void method2471(int arg0) {
        field5803++;
        if (arg0 > -126) {
            field5810 = null;
        }
        class122.field1661 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lah;Lha;ILao;IIIIZI)Lka;", line = 134)
    public final class473 method2472(class386 arg0, class60 arg1, int arg2, class288 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field5808++;
        class473 var11 = null;
        int var12 = arg4;
        class264 var13 = null;
        if (arg9 != -1) {
            var13 = class95.field1354.method2828(false, arg9);
        }
        int[] var14 = this.field5804;
        if (var13 != null && var13.field3772 != null) {
            var14 = new int[var13.field3772.length];
            for (int var15 = 0; var15 < var13.field3772.length; var15++) {
                int var16 = var13.field3772[var15];
                if (var16 >= 0 && var16 < this.field5804.length) {
                    var14[var15] = this.field5804[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        int var19 = 72 / ((arg7 + 90) / 35);
        boolean var20 = false;
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class253 var25 = null;
        class253 var26 = null;
        if (arg3 != null) {
            var12 = arg4 | 0x20;
            int var27 = arg3.field4081[arg6];
            int var28 = var27 >>> 16;
            var25 = class742.field10404.method2666(true, var28);
            var22 = var27 & 0xFFFF;
            if (var25 != null) {
                var18 |= var25.method1668(var22, 21665);
                var17 |= var25.method1666(var22, 10963);
                var21 |= var25.method1667(var22, false);
                var20 |= arg3.field4101;
            }
            if ((arg3.field4109 || class358.field5202) && arg5 != -1 && arg3.field4081.length > arg5) {
                int var29 = arg3.field4081[arg5];
                var24 = arg3.field4087[arg6];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class742.field10404.method2666(true, var23 >>> 16);
                }
                if (var26 != null) {
                    var18 |= var26.method1668(var23, 21665);
                    var17 |= var26.method1666(var23, 10963);
                    var21 |= var26.method1667(var23, false);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var20) {
                var12 |= 0x200;
            }
            if (var21) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method2470(var14, arg0 == null ? null : arg0.field5828, arg8, arg9, 414064088);
        if (class59.field838 != null) {
            var11 = (class473) class59.field838.method803(117, var31);
        }
        if (var11 == null || arg1.method491(var11.method255(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method490(var12, var11.method255());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class336.field4876.method2079(var14[var35], (byte) 96).method3345(arg8, 118)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class322[] var36 = new class322[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class336.field4876.method2079(var14[var37], (byte) -100).method3358(125, arg8);
                }
            }
            if (var13 != null && var13.field3730 != null) {
                for (int var38 = 0; var38 < var13.field3730.length; var38++) {
                    if (var13.field3730[var38] != null && var36[var38] != null) {
                        int var39 = var13.field3730[var38][0];
                        int var40 = var13.field3730[var38][1];
                        int var41 = var13.field3730[var38][2];
                        int var42 = var13.field3730[var38][3];
                        int var43 = var13.field3730[var38][4];
                        int var44 = var13.field3730[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method2050(var44, 0, var42, var43);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method2043(var40, (byte) 64, var39, var41);
                        }
                    }
                }
            }
            if (arg0 != null) {
                var33 = var12 | 0x4000;
            }
            class322 var45 = new class322(var36, var36.length);
            var11 = arg1.method418(var45, var33, class273.field3880, 64, 850);
            if (arg0 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class244.field3560.length; var47++) {
                        if (class244.field3560[var47][var46].length > arg0.field5828[var46]) {
                            var11.method259(class639.field8976[var47][var46], class244.field3560[var47][var46][arg0.field5828[var46]]);
                        }
                    }
                }
            }
            if (class59.field838 != null) {
                var11.method271(var12);
                class59.field838.method801(1, var11, var31);
            }
        }
        if (arg3 == null || var25 == null) {
            return var11;
        } else {
            class473 var48 = var11.method251((byte) 1, var12, true);
            var48.method2854(var23, var26, var22, 0, var24, var25, arg3.field4101, arg2 - 1, 0);
            return var48;
        }
    }
}
