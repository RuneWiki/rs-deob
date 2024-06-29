import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class344 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field5393 = new int[4096];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
    public static int[] field5391 = new int[200];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
    public static int[] field5392 = new int[2];

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
    public static int[] field5395;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILof;Lbp;I)V")
    public static final void method2201(int arg0, int arg1, class321 arg2, class322 arg3, int arg4) {
        field5396++;
        if ((arg4 & 0x400) != 0) {
            int var5 = arg2.method631(10494);
            arg3.field5271 = arg2.method608(false);
            arg3.field5324 = arg2.method618((byte) 100);
            arg3.field5274 = (var5 & 0x8000) != 0;
            arg3.field5275 = var5 & 0x7FFF;
            arg3.field5283 = class405.field6116 + arg3.field5271 + arg3.field5275;
        }
        byte var6 = -1;
        if ((arg4 & 0x10) != 0) {
            arg3.field4934 = arg2.method631(10494);
            if (arg3.field5343 == 0) {
                arg3.method2173((byte) 90, arg3.field4934);
                arg3.field4934 = -1;
            }
        }
        if ((arg4 & 0x8) != 0) {
            int var7 = arg2.method634(103);
            if (var7 == 65535) {
                var7 = -1;
            }
            arg3.field5257 = var7;
        }
        if ((arg4 & 0x1000) != 0) {
            arg3.field5315 = arg2.method619((byte) -23);
            arg3.field5331 = arg2.method619((byte) -23);
            arg3.field5262 = arg2.method619((byte) -23);
            arg3.field5270 = arg2.method630(30814);
            arg3.field5285 = arg2.method606((byte) -55) + class405.field6116;
            arg3.field5264 = arg2.method610(1312572200) + class405.field6116;
            arg3.field5298 = arg2.method618((byte) 100);
            if (arg3.field4949) {
                arg3.field5331 += arg3.field4945;
                arg3.field5315 += arg3.field4963;
                arg3.field5270 += arg3.field4945;
                arg3.field5262 += arg3.field4963;
                arg3.field5343 = 0;
            } else {
                arg3.field5331 += arg3.field5344[0];
                arg3.field5315 += arg3.field5339[0];
                arg3.field5262 += arg3.field5339[0];
                arg3.field5343 = 1;
                arg3.field5270 += arg3.field5344[0];
            }
            arg3.field5338 = 0;
        }
        if ((arg4 & 0x40) != 0) {
            int var8 = arg2.method631(10494);
            int var9 = arg2.method636(-2);
            int var10 = arg2.method583(false);
            int var11 = arg2.field1292;
            boolean var12 = (var8 & 0x8000) != 0;
            if (arg3.field4947 != null && arg3.field4943 != null) {
                boolean var13 = false;
                if (var9 <= 1) {
                    if (!var12 && (class123.field1760 && !class482.field7026 || class422.field6304)) {
                        var13 = true;
                    } else if (class145.method968(arg3.field4947, false)) {
                        var13 = true;
                    }
                }
                if (!var13 && class398.field6065 == 0) {
                    class216.field2998.field1292 = 0;
                    arg2.method617(0, var10, false, class216.field2998.field1277);
                    class216.field2998.field1292 = 0;
                    int var14 = -1;
                    String var16;
                    if (var12) {
                        var8 &= 0x7FFF;
                        class495 var15 = class63.method429(class216.field2998, 17094);
                        var14 = var15.field7235;
                        var16 = var15.field7237.method368(false, class216.field2998);
                    } else {
                        var16 = class227.method1562(class275.method1745(-20, class216.field2998), 100);
                    }
                    arg3.field5327 = var16.trim();
                    arg3.field5328 = var8 & 0xFF;
                    arg3.field5318 = 150;
                    arg3.field5272 = var8 >> 8;
                    int var17;
                    if (var9 == 1 || var9 == 2) {
                        var17 = var12 ? 17 : 1;
                    } else {
                        var17 = var12 ? 17 : 2;
                    }
                    if (var9 == 2) {
                        class395.method2433(var16, var14, 0, "<img=1>" + arg3.method2090(0, false), "<img=1>" + arg3.method2087(120, true), null, (byte) 67, var17);
                    } else if (var9 == 1) {
                        class395.method2433(var16, var14, 0, "<img=0>" + arg3.method2090(0, false), "<img=0>" + arg3.method2087(116, true), null, (byte) 67, var17);
                    } else {
                        class395.method2433(var16, var14, 0, arg3.method2090(0, false), arg3.method2087(122, true), null, (byte) 67, var17);
                    }
                }
            }
            arg2.field1292 = var10 + var11;
        }
        if ((arg4 & 0x80) != 0) {
            int var18 = arg2.method598(false);
            int var19 = arg2.method583(false);
            arg3.method2182(var18, 0, var19, class405.field6116);
            arg3.field5303 = class405.field6116 + 300;
            arg3.field5268 = arg2.method618((byte) 100);
        }
        if ((arg4 & 0x4) != 0) {
            class363.field5624[arg0] = arg2.method633(104);
        }
        if ((arg4 & 0x20) != 0) {
            int var20 = arg2.method631(10494);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = arg2.method636(-2);
            class340.method2193(var21, var20, -41, arg3);
        }
        if ((arg4 & 0x1) != 0) {
            int var22 = arg2.method608(false);
            byte[] var23 = new byte[var22];
            class91 var24 = new class91(var23);
            arg2.method605(0, 1, var23, var22);
            class289.field4303[arg0] = var24;
            arg3.method2098(var24, (byte) -80);
        }
        if ((arg4 & 0x4000) != 0) {
            var6 = arg2.method630(30814);
        }
        if ((arg4 & 0x10000) != 0) {
            arg3.field5241 = arg2.method633(87);
            arg3.field5267 = arg2.method620(32131);
            arg3.field5299 = arg2.method619((byte) -23);
            arg3.field5252 = (byte) arg2.method608(false);
            arg3.field5250 = class405.field6116 + arg2.method634(101);
            arg3.field5297 = class405.field6116 + arg2.method610(1312572200);
        }
        if ((arg4 & 0x8000) != 0) {
            int var25 = arg2.method634(119);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg2.method591((byte) -119);
            int var27 = arg2.method608(false);
            arg3.method2176(var26, var27, var25, false, 0);
        }
        if ((arg4 & 0x40000) != 0) {
            int var28 = arg2.method631(10494);
            int var29 = arg2.method591((byte) 83);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var30 = arg2.method608(false);
            arg3.method2176(var29, var30, var28, true, 0);
        }
        if ((arg4 & 0x100) != 0) {
            arg3.field5327 = arg2.method621(2029169511);
            if (arg3.field5327.charAt(0) == '~') {
                arg3.field5327 = arg3.field5327.substring(1);
                class268.method1712(arg3.field5327, arg3.method2090(0, false), 2, 0, arg3.method2087(127, true), (byte) 114);
            } else if (class339.field5365 == arg3) {
                class268.method1712(arg3.field5327, arg3.method2090(0, false), 2, 0, arg3.method2087(26, true), (byte) 126);
            }
            arg3.field5318 = 150;
            arg3.field5328 = 0;
            arg3.field5272 = 0;
        }
        if ((arg4 & 0x800) != 0) {
            int var31 = class405.field6116;
            int var32 = arg2.method598(false);
            int var33 = arg2.method608(false);
            arg3.method2182(var32, 0, var33, var31);
        }
        if ((arg4 & 0x2000) != 0) {
            arg3.field4978 = arg2.method608(false) == 1;
        }
        if ((arg4 & 0x20000) != 0) {
            int var34 = arg2.method583(false);
            int[] var35 = new int[var34];
            int[] var36 = new int[var34];
            int[] var37 = new int[var34];
            for (int var38 = 0; var38 < var34; var38++) {
                int var39 = arg2.method606((byte) -55);
                if (var39 == 65535) {
                    var39 = -1;
                }
                var35[var38] = var39;
                var36[var38] = arg2.method636(-2);
                var37[var38] = arg2.method631(10494);
            }
            class470.method2819(31820, var36, var35, arg3, var37);
        }
        if (arg3.field4949) {
            if (var6 == 127) {
                arg3.method2097(50, arg3.field4963, arg3.field4945);
            } else {
                byte var40;
                if (var6 == -1) {
                    var40 = class363.field5624[arg0];
                } else {
                    var40 = var6;
                }
                arg3.method2095(var40, arg3.field4945, -11539, arg3.field4963);
            }
        }
        int var41 = -24 / ((arg1 + 1) / 42);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method2202(byte arg0) {
        field5395 = null;
        field5393 = null;
        if (arg0 != -36) {
            method2202((byte) -99);
        }
        field5391 = null;
        field5392 = null;
    }
}
