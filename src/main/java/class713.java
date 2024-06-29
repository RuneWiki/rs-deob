import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class713 extends class70 {

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "I")
    public int field9809;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    public int field9814;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9815 = new Rectangle[100];

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "Lbe;")
    public static class41 field9818;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "Lgj;")
    public static class662 field9816;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "Lgj;")
    public static class662 field9819;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B[IIII[[[BII[I[IIZ[IIB[IIZ)V")
    public static final void method3966(byte arg0, int[] arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10, boolean arg11, int[] arg12, int arg13, byte arg14, int[] arg15, int arg16, boolean arg17) {
        field9810++;
        if (class278.field3847 == -1) {
            return;
        }
        int[] var18 = class369.field5000.method496();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class278.field3847 == 1) {
            var24 = (int) ((double) class747.field10318 * (double) var22 / (double) class663.field9209);
            var23 = (int) ((double) class747.field10318 * (double) var21 / (double) class663.field9209);
        }
        if (!class180.field2828) {
            if (class278.field3847 == 1) {
                class473.method2722((byte) -45);
            }
            int var25 = arg16 - class250.field3519;
            int var26 = arg2 - class536.field7292;
            int var27 = arg13 - class695.field9616;
            int var28 = (int) (((double) var27 * class759.field10459 + (double) var25 * class87.field1204 + (double) var26 * class787.field10797) * (double) var23 / (double) arg7);
            int var29 = (int) (((double) var27 * class37.field633 + (double) var25 * class7.field157 + (double) var26 * class662.field9202) * (double) var24 / (double) arg7);
            double var30 = (double) var27 * class668.field9292 + (double) var25 * class189.field2915 + (double) var26 * class648.field8967;
            int var32 = class466.field6317 + var28 - class311.field4237;
            int var33 = class537.field7300 + var29 - class217.field3202;
            int var34 = class547.field7439 + var32;
            int var35 = class747.field10318 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class256.field3597 || class663.field9209 < var35) || class278.field3847 == 2) {
                class112.field2110 = var32;
                if (class278.field3847 == 2) {
                    class268.field3764 = -var30;
                }
                class361.field4925 = var33;
            } else if (var34 > 0 && var35 > 0 && class256.field3597 > var32 && class663.field9209 > var33) {
                int var36 = var32 - class466.field6317;
                int var37 = var33 - class537.field7300;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class278.field3847 == 0) {
                    var42 = class268.field3764 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class278.field3847 == 1) {
                    var40 = var36 / class658.field9108;
                    var41 = var37 / class471.field6394;
                    var38 = class658.field9108 * var40;
                    var39 = class471.field6394 * var41;
                    var42 = (class268.field3764 + var30) * (double) (var36 * var38 + (var37 * var39)) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = class256.field3597 - var38;
                    var53 = 0;
                    var54 = var52;
                    if (class278.field3847 == 1) {
                        var50 = var40;
                        var48 = class262.field3681 - var40;
                    }
                    var55 = var38;
                } else {
                    var53 = -var38;
                    var52 = class256.field3597 + var38;
                    var54 = 0;
                    if (class278.field3847 == 1) {
                        var48 = 0;
                        var50 = -var40;
                    }
                    var55 = var53;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = 0;
                    var57 = class663.field9209 + var39;
                    var58 = -var39;
                    var59 = var58;
                    var60 = var57;
                    if (class278.field3847 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var51 = class317.field4324 + var41;
                        var49 = var47;
                    }
                    var61 = var58;
                } else {
                    var58 = 0;
                    var57 = class663.field9209 - var39;
                    var61 = 0;
                    if (class278.field3847 == 1) {
                        var47 = var41;
                        var49 = 0;
                        var46 = class317.field4324 - var41;
                        var51 = var46;
                    }
                    var59 = var39;
                    var56 = var57;
                    var60 = var57;
                }
                class239 var62 = class313.field4273.field5078;
                for (class186 var63 = (class186) var62.method1597((byte) -56); var63 != null; var63 = (class186) var62.method1601(124)) {
                    class144[] var69 = var63.field2877;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class144 var72 = var69[var71];
                        int var73 = var72.field2433;
                        int var74 = var72.field2430;
                        int var75 = var72.field2429;
                        int var76 = var72.field2431;
                        int var77;
                        var72.field2431 = var77 = var76 - var39;
                        int var78;
                        var72.field2430 = var78 = var74 - var39;
                        int var79;
                        var72.field2429 = var79 = var75 - var38;
                        int var80;
                        var72.field2433 = var80 = var73 - var38;
                        int var81 = var72.field2432;
                        if (var70) {
                            int var82 = (var79 <= var80 ? var79 : var80) - var81;
                            if (class256.field3597 >= var82) {
                                int var83 = (var77 <= var78 ? var77 : var78) - var81;
                                if (var83 <= class663.field9209) {
                                    int var84 = var81 + (var79 > var80 ? var79 : var80);
                                    if (var84 >= 0) {
                                        int var85 = (var78 < var77 ? var77 : var78) + var81;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method731((byte) 39);
                        class287.method1839(var63, 8792);
                    }
                }
                if (class278.field3847 == 0) {
                    class369.field5000.method527(class290.field4002);
                }
                class369.field5000.method547(-var38, -var39);
                class369.field5000.method530(var53, var58, var52, var57, var44);
                class546.method3069(class268.field3764 + var44, (byte) -12);
                class27.field513 = class268.field3764 + var44;
                if (class278.field3847 == 1) {
                    class5.field107 = var20 - var39 - class217.field3202;
                    class389.field5346 = var24;
                    class264.field3719 = var19 - var38 - class311.field4237;
                    class383.field5200 = var23;
                    class369.field5000.method521(class264.field3719, class5.field107, class383.field5200, class389.field5346);
                } else {
                    class5.field107 = var20 + class537.field7300 - class217.field3202 - var39;
                    class383.field5200 = var23;
                    class264.field3719 = var19 + class466.field6317 - class311.field4237 - var38;
                    class389.field5346 = var24;
                    class369.field5000.method521(class264.field3719, class5.field107, class383.field5200, class389.field5346);
                }
                class517.method2949(class313.field4273);
                if (var59 > 0) {
                    class369.field5000.method512(0, var56, class256.field3597, var56 + var59);
                    class369.field5000.method494();
                    class369.field5000.method536(class745.field10277);
                    class715.method3981(arg3, arg16, arg2, arg13, arg5, arg12, arg8, arg1, arg15, arg9, arg6, arg14, arg10, arg4, arg17, arg11, arg7, 1, false);
                }
                if (var55 > 0) {
                    class369.field5000.method512(var54, var61, var54 + var55, var60 + var61);
                    class369.field5000.method494();
                    class369.field5000.method536(class745.field10277);
                    class715.method3981(arg3, arg16, arg2, arg13, arg5, arg12, arg8, arg1, arg15, arg9, arg6, arg14, arg10, arg4, arg17, arg11, arg7, 1, false);
                }
                class369.field5000.method575();
                class622.method3509();
                if (class278.field3847 == 0) {
                    class369.field5000.method506();
                }
                class268.field3764 += var44;
                class217.field3202 += var39;
                class311.field4237 += var38;
                class112.field2110 = var28 + class466.field6317 - class311.field4237;
                class361.field4925 = class537.field7300 + var29 - class217.field3202;
                if (class278.field3847 == 1) {
                    class567.field8014 += var41;
                    class615.field8571 += var40;
                    for (int var64 = 0; var64 < class317.field4324; var64++) {
                        int var65 = class361.method2217(38348543, var64 + class567.field8014, class317.field4324) * class262.field3681;
                        for (int var66 = 0; var66 < class262.field3681; var66++) {
                            int var67 = var65 + class361.method2217(38348543, class615.field8571 + var66, class262.field3681);
                            boolean var68 = var64 >= var46 && var46 + var47 > var64 || var64 >= var49 && (var49 + var51) > var64 && var66 >= var48 && var66 < (var48 + var50);
                            class687.field9555[var67].method2768(class658.field9108 * var66, class471.field6394 * var64, class658.field9108, class471.field6394, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class180.field2828 = true;
            }
        }
        if (class180.field2828) {
            class311.field4237 = 0;
            class112.field2110 = class466.field6317;
            class217.field3202 = 0;
            class536.field7292 = arg2;
            class695.field9616 = arg13;
            class250.field3519 = arg16;
            class268.field3764 = 0.0D;
            class361.field4925 = class537.field7300;
            if (class278.field3847 == 0) {
                class369.field5000.method527(class290.field4002);
            }
            class369.field5000.method575();
            class369.field5000.method494();
            class369.field5000.method536(class745.field10277);
            class282.field3918.method1882(class250.field3519, class536.field7292, class695.field9616, class678.field9440, class666.field9267, class335.field4519);
            class369.field5000.method503(class282.field3918);
            if (class278.field3847 == 1) {
                class389.field5346 = var24;
                class383.field5200 = var23;
                class264.field3719 = var19;
                class5.field107 = var20;
                class369.field5000.method521(class264.field3719, class5.field107, class383.field5200, class389.field5346);
            } else {
                class264.field3719 = class466.field6317 + var19;
                class389.field5346 = var24;
                class383.field5200 = var23;
                class5.field107 = class537.field7300 + var20;
                class369.field5000.method521(class264.field3719, class5.field107, class383.field5200, class389.field5346);
            }
            class27.field513 = 0.0D;
            class313.field4273.method2272(45);
            class517.method2949(class313.field4273);
            class715.method3981(arg3, arg16, arg2, arg13, arg5, arg12, arg8, arg1, arg15, arg9, arg6, arg14, arg10, arg4, arg17, arg11, arg7, 1, false);
            class622.method3509();
            class180.field2828 = false;
            if (class278.field3847 == 0) {
                class369.field5000.method506();
            }
            if (class278.field3847 == 1) {
                class400.method2400((byte) -128);
            }
        }
        if (class278.field3847 == 0) {
            class290.field4002.method2769(class112.field2110, class361.field4925, class547.field7439, class747.field10318, 0, 0, true, true);
        }
        class599.field8386++;
        class546.method3069(class268.field3764, (byte) -60);
        class714.field9825 = class268.field3764;
        if (class278.field3847 == 0 || class278.field3847 == 2) {
            if (class278.field3847 == 2) {
                class369.field5000.method536(class745.field10277);
                class369.field5000.method494();
            }
            class614.field8560 = var24;
            class456.field6212 = class466.field6317 + var19 - class311.field4237 - class112.field2110;
            class691.field9595 = class537.field7300 + var20 - class217.field3202 - class361.field4925;
            class53.field766 = var23;
            class369.field5000.method521(class456.field6212, class691.field9595, class53.field766, class614.field8560);
        } else if (class278.field3847 == 1) {
            class53.field766 = var23;
            class614.field8560 = var24;
            class691.field9595 = var20 - class217.field3202;
            class456.field6212 = var19 - class311.field4237;
            class369.field5000.method521(class456.field6212, class691.field9595, class53.field766, class614.field8560);
            class369.field5000.method512(class112.field2110, class361.field4925, class547.field7439 + class112.field2110, class747.field10318 + class361.field4925);
        }
        class715.method3981(arg3, arg16, arg2, arg13, arg5, arg12, arg8, arg1, arg15, arg9, arg6, arg14, arg10, arg4, arg17, arg11, arg7, class278.field3847 == 2 ? 0 : 2, class278.field3847 == 1);
        class369.field5000.method575();
        class369.field5000.method521(var19, var20, var21, var22);
        if (arg0 > -90) {
            method3969(-52);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLkh;)V")
    public static final void method3967(byte arg0, class17 arg1) {
        field9807++;
        if (!class675.field9384) {
            return;
        }
        class620.field8624++;
        if (arg1.field306 != null) {
            class17 var2 = class326.method2066(class657.field9100, class342.field4609, 74);
            if (var2 != null) {
                class255 var3 = new class255();
                var3.field3583 = arg1;
                var3.field3586 = arg1.field306;
                var3.field3582 = var2;
                class76.method644(var3);
            }
        }
        if (arg0 != -122) {
            return;
        }
        class537 var4 = class476.method2729(class586.field8291, (byte) -46, class551.field7498);
        var4.field7295.method759(arg1.field372, 121);
        var4.field7295.method791(-550441944, class783.field10758);
        var4.field7295.method791(-550441944, class657.field9100);
        var4.field7295.method776(-18, class342.field4609);
        var4.field7295.method745(arg1.field282, arg0 ^ 0x78);
        var4.field7295.method790(arg1.field355, arg0 + 65402);
        class173.method1314(false, var4);
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
    public static final void method3968(int arg0) {
        if (class365.field4956 == null || class551.field7540 == null) {
            class365.field4956 = new int[256];
            class551.field7540 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class365.field4956[var1] = (int) (Math.sin(var2) * 4096.0D);
                class551.field7540[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 == 0) {
            field9813++;
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
    public static void method3969(int arg0) {
        if (arg0 > -85) {
            method3966((byte) -41, null, 114, -11, -121, null, 107, -85, null, null, -12, true, null, 38, (byte) -69, null, 110, false);
        }
        field9816 = null;
        field9818 = null;
        field9819 = null;
        field9815 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Laca;")
    public final class758 method228(int arg0) {
        field9808++;
        return arg0 == 1 ? class538.field7311 : null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILha;III)V")
    public static final void method3970(int arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 242) {
            return;
        }
        if ((class753.field10387 == null || class609.field8504 == null || class119.field2181 == null) && class346.field4664.method3737(class727.field9990, false) && class346.field4664.method3737(class491.field6699, false) && class346.field4664.method3737(class320.field4372, false)) {
            class49 var7 = class49.method366(class346.field4664, class491.field6699, 0);
            class609.field8504 = arg3.method498(var7, true);
            var7.method363();
            class523.field7115 = arg3.method498(var7, true);
            class753.field10387 = arg3.method498(class49.method366(class346.field4664, class727.field9990, 0), true);
            class49 var8 = class49.method366(class346.field4664, class320.field4372, 0);
            class119.field2181 = arg3.method498(var8, true);
            var8.method363();
            class681.field9485 = arg3.method498(var8, true);
        }
        field9811++;
        if (class753.field10387 == null || class609.field8504 == null || class119.field2181 == null) {
            return;
        }
        int var9 = (arg6 - (class119.field2181.method220() * 2)) / class753.field10387.method220();
        for (int var10 = 0; var10 < var9; var10++) {
            class753.field10387.method3430(arg1 + class119.field2181.method220() + (class753.field10387.method220() * var10), arg5 - -arg2 - class753.field10387.method214());
        }
        int var11 = (arg2 - class119.field2181.method214() - arg4) / class609.field8504.method214();
        for (int var12 = 0; var12 < var11; var12++) {
            class609.field8504.method3430(arg1, arg4 + arg5 + var12 * class609.field8504.method214());
            class523.field7115.method3430(arg1 + arg6 - class523.field7115.method220(), arg4 + (arg5 - -(var12 * class609.field8504.method214())));
        }
        class119.field2181.method3430(arg1, arg2 + arg5 - class119.field2181.method214());
        class681.field9485.method3430(arg1 + arg6 - class119.field2181.method220(), -class119.field2181.method214() + arg5 + arg2);
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Leaa;Lcq;IIIIIIIII)V")
    public class713(class528 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9809 = arg9;
        this.field9814 = arg10;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lpt;")
    public static final class558 method3971(byte arg0) {
        if (arg0 > -69) {
            field9816 = null;
        }
        field9812++;
        return class500.field6844;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9815[var0] = new Rectangle();
        }
        field9817 = 0;
    }
}
