import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class553 extends class245 implements class455 {

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "[[I")
    public static int[][] field7814 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field7817 = -1;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)Z")
    public static final boolean method3140(byte arg0, int arg1, int arg2) {
        if (arg0 > -100) {
            method3142((byte) -47);
        }
        ++field7816;
        return ~(65536 & arg1) != -1;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
    public static void method3141(byte arg0) {
        if (arg0 == 86) {
            field7814 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lhl;IZ[[I)V")
    public class553(class529 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class758.field10567, class594.field8277, arg1 * 6 * arg1, arg2);
        super.field3178.method2148(this, -115);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method1475(arg1, arg3[var5], arg1, 526364520, var5 + 34069);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, this.method1471(0), arg1, arg1, 0, class303.method1814(false, super.field3189), super.field3178.field7193, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)V")
    public static final void method3142(byte arg0) {
        for (int var1 = 0; var1 < class488.field6690; ++var1) {
            int var2 = class144.field1861[var1];
            class215 var3 = ((class706) class681.field9475.method2552((long) var2, -1)).field9890;
            int var4 = class569.field8012.method3428((byte) -106);
            if ((32 & var4) != 0) {
                var4 += class569.field8012.method3428((byte) 20) << 8;
            }
            if ((8192 & var4) != 0) {
                var3.field826 = class569.field8012.method3383(-1498293360);
                var3.field786 = class569.field8012.method3433(128);
                var3.field807 = class569.field8012.method3386((byte) -112);
                var3.field845 = class569.field8012.method3433(128);
                var3.field843 = class569.field8012.method3402((byte) 127) - -class406.field5732;
                var3.field883 = class569.field8012.method3427((byte) -123) + class406.field5732;
                var3.field864 = class569.field8012.method3425((byte) -109);
                var3.field807 += var3.field898[0];
                var3.field845 += var3.field899[0];
                var3.field895 = 1;
                var3.field826 += var3.field898[0];
                var3.field897 = 0;
                var3.field786 += var3.field899[0];
            }
            if ((var4 & 4) != 0) {
                int var5 = class569.field8012.method3425((byte) -121);
                if (var5 > 0) {
                    for (int var6 = 0; var5 > var6; ++var6) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = class569.field8012.method3396(1689622712);
                        if (~var10 == -32768) {
                            var10 = class569.field8012.method3396(1689622712);
                            var8 = class569.field8012.method3396(1689622712);
                            var7 = class569.field8012.method3396(1689622712);
                            var9 = class569.field8012.method3396(1689622712);
                        } else if (var10 != 32766) {
                            var8 = class569.field8012.method3396(1689622712);
                        } else {
                            var10 = -1;
                        }
                        int var11 = class569.field8012.method3396(1689622712);
                        int var12 = class569.field8012.method3428((byte) -128);
                        var3.method546(var12, false, var8, var10, class406.field5732, var9, var11, var7);
                    }
                }
            }
            if (~(16384 & var4) != -1) {
                int var13 = var3.field2589.field3625.length;
                int var14 = 0;
                if (var3.field2589.field3610 != null) {
                    var14 = var3.field2589.field3610.length;
                }
                if (var3.field2589.field3649 != null) {
                    var14 = var3.field2589.field3649.length;
                }
                byte var15 = 0;
                int var16 = class569.field8012.method3429(106);
                if (~(1 & var16) != -2) {
                    int[] var17 = null;
                    if ((2 & var16) == 2) {
                        var17 = new int[var13];
                        for (int var18 = 0; ~var13 < ~var18; ++var18) {
                            var17[var18] = class569.field8012.method3419((byte) -84);
                        }
                    }
                    short[] var19 = null;
                    if ((4 & var16) == 4) {
                        var19 = new short[var14];
                        for (int var20 = 0; var20 < var14; ++var20) {
                            var19[var20] = (short) class569.field8012.method3411(51);
                        }
                    }
                    short[] var21 = null;
                    if (~(8 & var16) == -9) {
                        var21 = new short[var15];
                        for (int var22 = 0; ~var15 < ~var22; ++var22) {
                            var21[var22] = (short) class569.field8012.method3419((byte) 108);
                        }
                    }
                    long var23 = (long) var2 | (long) (var3.field2580++) << 32;
                    new class574(var23, var17, var19, var21);
                }
            }
            if (~(1024 & var4) != -1) {
                int var25 = class569.field8012.method3411(96);
                var3.field847 = class569.field8012.method3425((byte) -114);
                var3.field856 = class569.field8012.method3428((byte) -101);
                var3.field788 = (var25 & 32768) != 0;
                var3.field879 = var25 & 32767;
                var3.field870 = class406.field5732 + var3.field879 - -var3.field847;
            }
            if ((2 & var4) != 0) {
                int var26 = class569.field8012.method3411(65);
                if (~var26 == -65536) {
                    var26 = -1;
                }
                int var27 = class569.field8012.method3448(true);
                int var28 = class569.field8012.method3425((byte) 119);
                int var29 = 7 & var28;
                int var30 = (121 & var28) >> 3;
                if (~var30 == -16) {
                    var30 = -1;
                }
                var3.method541(var30, false, var27, var29, var26, -117);
            }
            if (~(var4 & 8) != -1) {
                var3.field809 = class569.field8012.method3402((byte) 127);
                if (var3.field809 == 65535) {
                    var3.field809 = -1;
                }
            }
            if (~(var4 & 32768) != -1) {
                int var31 = var3.field2589.field3613.length;
                int var32 = 0;
                if (var3.field2589.field3610 != null) {
                    var32 = var3.field2589.field3610.length;
                }
                int var33 = 0;
                if (var3.field2589.field3649 != null) {
                    var33 = var3.field2589.field3649.length;
                }
                int var34 = class569.field8012.method3428((byte) -98);
                if ((var34 & 1) == 1) {
                    var3.field2581 = null;
                } else {
                    int[] var35 = null;
                    if ((var34 & 2) == 2) {
                        var35 = new int[var31];
                        for (int var36 = 0; ~var36 > ~var31; ++var36) {
                            var35[var36] = class569.field8012.method3411(65);
                        }
                    }
                    short[] var37 = null;
                    if (~(var34 & 4) == -5) {
                        var37 = new short[var32];
                        for (int var38 = 0; var32 > var38; ++var38) {
                            var37[var38] = (short) class569.field8012.method3411(85);
                        }
                    }
                    short[] var39 = null;
                    if ((var34 & 8) == 8) {
                        var39 = new short[var33];
                        for (int var40 = 0; var40 < var33; ++var40) {
                            var39[var40] = (short) class569.field8012.method3411(106);
                        }
                    }
                    long var41 = (long) var2 | (long) (var3.field2587++) << 32;
                    var3.field2581 = new class574(var41, var35, var37, var39);
                }
            }
            if ((2048 & var4) != 0) {
                int var43 = class569.field8012.method3435(true);
                int[] var44 = new int[var43];
                int[] var45 = new int[var43];
                for (int var46 = 0; var46 < var43; ++var46) {
                    int var47 = class569.field8012.method3419((byte) 119);
                    if (~(var47 & 49152) == -49153) {
                        int var48 = class569.field8012.method3419((byte) -28);
                        var44[var46] = class344.method2020(var48, var47 << 16);
                    } else {
                        var44[var46] = var47;
                    }
                    var45[var46] = class569.field8012.method3402((byte) 127);
                }
                var3.method547(var45, var44, true);
            }
            if (~(128 & var4) != -1) {
                if (var3.field2589.method1639((byte) 97)) {
                    class638.method3586(var3, -16255);
                }
                var3.method1200(class51.field540.method4084(5, class569.field8012.method3427((byte) -86)), 1);
                var3.method554((byte) 88, var3.field2589.field3619);
                var3.field872 = var3.field2589.field3596 << 3;
                if (var3.field2589.method1639((byte) 44)) {
                    class333.method1978((class83) null, (class685) null, var3.field898[0], 0, 3, var3.field899[0], var3.field2175, var3);
                }
            }
            if (~(16 & var4) != -1) {
                int[] var49 = new int[4];
                for (int var50 = 0; var50 < 4; ++var50) {
                    var49[var50] = class569.field8012.method3411(49);
                    if (~var49[var50] == -65536) {
                        var49[var50] = -1;
                    }
                }
                int var51 = class569.field8012.method3429(-85);
                class340.method2005(var51, var3, 1, var49);
            }
            if ((4096 & var4) != 0) {
                int var52 = class569.field8012.method3435(true);
                int[] var53 = new int[var52];
                int[] var54 = new int[var52];
                int[] var55 = new int[var52];
                for (int var56 = 0; ~var56 > ~var52; ++var56) {
                    int var57 = class569.field8012.method3427((byte) 58);
                    if (var57 == 65535) {
                        var57 = -1;
                    }
                    var53[var56] = var57;
                    var54[var56] = class569.field8012.method3429(-26);
                    var55[var56] = class569.field8012.method3402((byte) 127);
                }
                class69.method518(26256, var54, var55, var3, var53);
            }
            if (~(var4 & 256) != -1) {
                int var58 = class569.field8012.method3411(83);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = class569.field8012.method3418(-2);
                int var60 = class569.field8012.method3425((byte) -106);
                int var61 = var60 & 7;
                int var62 = var60 >> 3 & 15;
                if (~var62 == -16) {
                    var62 = -1;
                }
                var3.method541(var62, true, var59, var61, var58, -96);
            }
            if ((var4 & 64) != 0) {
                var3.field2602 = class569.field8012.method3419((byte) 115);
                var3.field2593 = class569.field8012.method3419((byte) 116);
            }
            if ((var4 & 512) != 0) {
                var3.field861 = class569.field8012.method3390((byte) -19);
                var3.field832 = class569.field8012.method3386((byte) -112);
                var3.field815 = class569.field8012.method3433(128);
                var3.field881 = (byte) class569.field8012.method3435(true);
                var3.field860 = class406.field5732 + class569.field8012.method3419((byte) 96);
                var3.field789 = class406.field5732 - -class569.field8012.method3427((byte) 100);
            }
            if (~(1 & var4) != -1) {
                var3.field822 = class569.field8012.method3403((byte) 84);
                var3.field836 = 100;
            }
        }
        if (arg0 > -35) {
            method3143((byte) -18, -128);
        }
        ++field7815;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
    public static final void method3143(byte arg0, int arg1) {
        ++field7813;
        if (arg0 != 83) {
            method3141((byte) -34);
        }
        class252 var2 = class150.method916(arg1, -23, 9);
        var2.method1497(arg0 + -83);
    }
}
