import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class304 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lkm;III)V", line = 8)
    public static final void method2130(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class263.field4155) {
            class50 var4 = class264.field4230[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field733 != null && var4.field733.field1235.method175()) {
                arg0.method185(var4.field733.field1235, 128, 0, 0, true);
            }
        }
        if (arg3 < class263.field4155) {
            class50 var5 = class264.field4230[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field733 != null && var5.field733.field1235.method175()) {
                arg0.method185(var5.field733.field1235, 0, 0, 128, true);
            }
        }
        if (arg2 < class263.field4155 && arg3 < class163.field2590) {
            class50 var6 = class264.field4230[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field733 != null && var6.field733.field1235.method175()) {
                arg0.method185(var6.field733.field1235, 128, 0, 128, true);
            }
        }
        if (arg2 < class263.field4155 && arg3 > 0) {
            class50 var7 = class264.field4230[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field733 != null && var7.field733.field1235.method175()) {
                arg0.method185(var7.field733.field1235, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V", line = 70)
    public static final void method2131(byte arg0, int arg1, int arg2) {
        class353.field5617[arg2] = arg1;
        field4980++;
        class255 var3 = (class255) class98.field1410.method29((long) arg2, 103);
        if (arg0 != 108) {
            return;
        }
        if (var3 == null) {
            class255 var4 = new class255(4611686018427387905L);
            class98.field1410.method37(false, var4, (long) arg2);
        } else if (var3.field4044 != 4611686018427387905L) {
            var3.field4044 = class19.method122(arg0 - 12277) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZIZIIB)V", line = 97)
    public static final void method2132(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, byte arg7) {
        field4982++;
        if (!arg4 && class50.field749 == arg1 && class328.field5362 == arg5 && class119.field1760 == arg0 || class261.method1836(0)) {
            return;
        }
        class328.field5362 = arg5;
        class119.field1760 = arg0;
        class50.field749 = arg1;
        if (class261.method1836(arg7 + 115)) {
            class119.field1760 = 0;
        }
        if (arg2) {
            class310.method2165(5, 28);
        } else {
            class310.method2165(5, 25);
        }
        class243.method1696(true, (byte) 124, class157.field2525);
        if (arg7 != -115) {
            return;
        }
        int var8 = class215.field3313;
        class215.field3313 = (arg1 - 6) * 8;
        int var9 = class150.field2420;
        class150.field2420 = arg5 * 8 - 48;
        class221.field3400 = class88.method584(class50.field749 * 8, class328.field5362 * 8);
        int var10 = class150.field2420 - var9;
        class322.field5292 = null;
        int var11 = class150.field2420;
        int var12 = class215.field3313 - var8;
        int var13 = class215.field3313;
        if (arg2) {
            class294.field4892 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class233 var18 = class329.field5377[var17];
                if (var18 != null) {
                    var18.field4796 -= var12 * 128;
                    var18.field4783 -= var10 * 128;
                    if (var18.field4796 >= 0 && var18.field4796 <= 13184 && var18.field4783 >= 0 && var18.field4783 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field4762[var19] -= var12;
                            var18.field4757[var19] -= var10;
                        }
                        class243.field3843[class294.field4892++] = var17;
                    } else {
                        class329.field5377[var17].method1610(-14884, (class139) null);
                        class329.field5377[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class233 var15 = class329.field5377[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4762[var16] -= var12;
                        var15.field4757[var16] -= var10;
                    }
                    var15.field4796 -= var12 * 128;
                    var15.field4783 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class39 var21 = class130.field1984[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4762[var22] -= var12;
                    var21.field4757[var22] -= var10;
                }
                var21.field4783 -= var10 * 128;
                var21.field4796 -= var12 * 128;
            }
        }
        byte var23 = 0;
        class120.field1779 = arg0;
        byte var24 = 104;
        class329.field5388.method317(false, 0, arg6, arg3);
        byte var25 = 104;
        byte var26 = 1;
        byte var27 = 0;
        byte var28 = 1;
        if (var10 < 0) {
            var27 = 103;
            var25 = -1;
            var28 = -1;
        }
        if (var12 < 0) {
            var23 = 103;
            var24 = -1;
            var26 = -1;
        }
        for (int var29 = var23; var29 != var24; var29 += var26) {
            for (int var30 = var27; var30 != var25; var30 += var28) {
                int var31 = var12 + var29;
                int var32 = var30 + var10;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class171.field2668[var33][var29][var30] = class171.field2668[var33][var31][var32];
                    } else {
                        class171.field2668[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class177 var34 = (class177) class41.field630.method1081(122); var34 != null; var34 = (class177) class41.field630.method1083((byte) 113)) {
            var34.field2762 -= var12;
            var34.field2772 -= var10;
            if (var34.field2762 < 0 || var34.field2772 < 0 || var34.field2762 >= 104 || var34.field2772 >= 104) {
                var34.method1131(8);
            }
        }
        if (class223.field3439 != 0) {
            class183.field2854 -= var10;
            class223.field3439 -= var12;
        }
        if (arg2) {
            class15.field194 -= var12;
            class41.field625 -= var12 * 128;
            class170.field2662 -= var12;
            class259.field4098 -= var10 * 128;
            class24.field360 -= var10;
            class355.field5629 -= var10;
        } else {
            class269.field4427 = 1;
        }
        class28.field424 = 0;
        if (class245.field3886 && arg2 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class146.method1039(false);
        }
        class105.method698(-91);
        class217.field3344.method1082(64);
        class166.field2615.method1082(64);
        class145.method1023();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lvn;IIII)V", line = 343)
    public static final void method2133(class139 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4981++;
        if (class117.field1701 >= 400) {
            return;
        }
        if (arg1 >= -9) {
            method2132(-56, 107, true, -71, false, 113, -36, (byte) 19);
        }
        if (arg0.field2229 != null) {
            arg0 = arg0.method987(-1);
        }
        if (arg0 == null || !arg0.field2190) {
            return;
        }
        String var5 = arg0.field2188;
        if (arg0.field2199 != 0) {
            String var6 = class179.field2789 == 1 ? class352.field5608 : class138.field2180;
            var5 = var5 + class27.method231(class329.field5388.field591, arg0.field2199, -23750) + " (" + var6 + arg0.field2199 + ")";
        }
        if (class56.field856 == 1) {
            class163.field2585++;
            class322.method2309(class37.field550 + " -> <col=ffff00>" + var5, arg3, (short) 12, false, class210.field3203, class182.field2834, arg4, (long) arg2);
        } else if (class107.field1532) {
            class21 var14 = class41.field628 == -1 ? null : class74.method504(class41.field628, 111);
            if ((class29.field447 & 0x2) != 0 && (var14 == null || arg0.method979(var14.field264, (byte) 127, class41.field628) != var14.field264)) {
                class230.field3666++;
                class322.method2309(class167.field2630 + " -> <col=ffff00>" + var5, arg3, (short) 30, false, class339.field5457, class120.field1776, arg4, (long) arg2);
            }
        } else {
            class52.field789++;
            String[] var7 = arg0.field2193;
            if (class15.field203) {
                var7 = class16.method112(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class179.field2789 != 0 || !var7[var8].equalsIgnoreCase(class273.field4491))) {
                        class297.field4919++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 25;
                        }
                        if (var8 == 1) {
                            var9 = 4;
                        }
                        int var10 = -1;
                        if (arg0.field2187 == var8) {
                            var10 = arg0.field2248;
                        }
                        if (arg0.field2251 == var8) {
                            var10 = arg0.field2244;
                        }
                        if (var8 == 2) {
                            var9 = 21;
                        }
                        if (var8 == 3) {
                            var9 = 9;
                        }
                        if (var8 == 4) {
                            var9 = 60;
                        }
                        class322.method2309("<col=ffff00>" + var5, arg3, var9, false, var10, var7[var8], arg4, (long) arg2);
                    }
                }
            }
            if (class179.field2789 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class273.field4491)) {
                        class89.field1285++;
                        short var12 = 0;
                        short var13 = 0;
                        if (arg0.field2199 > class329.field5388.field591) {
                            var12 = 2000;
                        }
                        if (var11 == 0) {
                            var13 = 25;
                        }
                        if (var11 == 1) {
                            var13 = 4;
                        }
                        if (var11 == 2) {
                            var13 = 21;
                        }
                        if (var11 == 3) {
                            var13 = 9;
                        }
                        if (var11 == 4) {
                            var13 = 60;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class322.method2309("<col=ffff00>" + var5, arg3, var13, false, arg0.field2192, var7[var11], arg4, (long) arg2);
                    }
                }
            }
            class322.method2309("<col=ffff00>" + var5, arg3, (short) 1003, false, class266.field4387, class141.field2276, arg4, (long) arg2);
        }
    }
}
