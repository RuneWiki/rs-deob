import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class202 extends class728 {

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
    public static int[] field3143 = new int[4096];

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "F")
    private float field3146;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "F")
    private float field3158;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    private int field3147;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Ljava/lang/String;")
    private String field3141;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Ljava/lang/String;")
    private String field3151;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Ljava/lang/String;")
    private String field3155;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)F")
    public final float method1409(byte arg0) {
        if (arg0 < 117) {
            this.field3158 = -1.3336171F;
        }
        ++field3156;
        return this.field3158;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)I")
    public static final int method1410(int arg0, boolean arg1) {
        if (!arg1) {
            return 6;
        } else {
            ++field3140;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class202(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IC)Z")
    public static final boolean method1411(int arg0, char arg1) {
        ++field3144;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class140.method1012(arg1, 99)) {
            return true;
        } else if (arg0 != 18581) {
            return false;
        } else {
            char[] var2 = class765.field10531;
            for (int var3 = 0; var3 < var2.length; ++var3) {
                char var7 = var2[var3];
                if (~arg1 == ~var7) {
                    return true;
                }
            }
            char[] var4 = class416.field5694;
            for (int var5 = 0; var5 < var4.length; ++var5) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1412(int arg0) {
        if (arg0 != 15979) {
            field3143 = null;
        }
        field3143 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)F")
    public final float method1413(boolean arg0) {
        if (!arg0) {
            method1411(117, 'G');
        }
        ++field3152;
        return this.field3146;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V")
    public static final void method1414(boolean arg0) {
        for (int var1 = 0; ~var1 > ~class45.field566; ++var1) {
            int var2 = class304.field4388[var1];
            class665 var3 = ((class205) class645.field9014.method2242((long) var2, -1)).field3181;
            int var4 = class110.field1640.method2964((byte) 41);
            if ((2 & var4) != 0) {
                var4 += class110.field1640.method2964((byte) 38) << 8;
            }
            if ((var4 & 1024) != 0) {
                var4 += class110.field1640.method2964((byte) 93) << 16;
            }
            if ((65536 & var4) != 0) {
                int var5 = var3.field9240.field1620.length;
                int var6 = 0;
                if (var3.field9240.field1619 != null) {
                    var6 = var3.field9240.field1619.length;
                }
                byte var7 = 0;
                if (var3.field9240.field1676 != null) {
                    var6 = var3.field9240.field1676.length;
                }
                int var8 = class110.field1640.method2964((byte) 116);
                if (~(1 & var8) != -2) {
                    int[] var9 = null;
                    if ((var8 & 2) == 2) {
                        var9 = new int[var5];
                        for (int var10 = 0; var10 < var5; ++var10) {
                            var9[var10] = class110.field1640.method2982(-1);
                        }
                    }
                    short[] var11 = null;
                    if (~(4 & var8) == -5) {
                        var11 = new short[var6];
                        for (int var12 = 0; ~var12 > ~var6; ++var12) {
                            var11[var12] = (short) class110.field1640.method2938((byte) -67);
                        }
                    }
                    short[] var13 = null;
                    if ((8 & var8) == 8) {
                        var13 = new short[var7];
                        for (int var14 = 0; var7 > var14; ++var14) {
                            var13[var14] = (short) class110.field1640.method2974((byte) -94);
                        }
                    }
                    long var15 = (long) var2 | (long) (var3.field9250++) << 32;
                    new class688(var15, var9, var11, var13);
                }
            }
            if (~(8192 & var4) != -1) {
                int var17 = class110.field1640.method2986(-20802);
                int[] var18 = new int[var17];
                int[] var19 = new int[var17];
                int[] var20 = new int[var17];
                for (int var21 = 0; var21 < var17; ++var21) {
                    int var22 = class110.field1640.method2982(-1);
                    if (~var22 == -65536) {
                        var22 = -1;
                    }
                    var18[var21] = var22;
                    var19[var21] = class110.field1640.method2944((byte) 4);
                    var20[var21] = class110.field1640.method2938((byte) -67);
                }
                class222.method1513(var18, var3, var20, var19, 0);
            }
            if ((64 & var4) != 0) {
                int[] var23 = new int[4];
                for (int var24 = 0; ~var24 > -5; ++var24) {
                    var23[var24] = class110.field1640.method2974((byte) -123);
                    if (var23[var24] == 65535) {
                        var23[var24] = -1;
                    }
                }
                int var25 = class110.field1640.method2944((byte) 4);
                class741.method4127(var3, var25, var23, 90);
            }
            if ((var4 & 4) != 0) {
                if (var3.field9240.method838(20710)) {
                    class674.method3835(var3, (byte) -124);
                }
                var3.method3783(class575.field8103.method2439((byte) 73, class110.field1640.method2998(true)), 127);
                var3.method2095(var3.field9240.field1635, 0);
                var3.field4619 = var3.field9240.field1634 << 3;
                if (var3.field9240.method838(20710)) {
                    class303.method1961((class282) null, var3, (class702) null, var3.field4672[0], var3.field4670[0], 120, 0, var3.field5755);
                }
            }
            if ((16 & var4) != 0) {
                int var26 = class110.field1640.method2944((byte) 4);
                if (~var26 < -1) {
                    for (int var27 = 0; var27 < var26; ++var27) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = class110.field1640.method2993(-118);
                        int var31 = -1;
                        if (~var30 == -32768) {
                            var30 = class110.field1640.method2993(66);
                            var29 = class110.field1640.method2993(-109);
                            var28 = class110.field1640.method2993(-96);
                            var31 = class110.field1640.method2993(-96);
                        } else if (var30 != 32766) {
                            var29 = class110.field1640.method2993(-118);
                        } else {
                            var30 = -1;
                        }
                        int var32 = class110.field1640.method2993(-100);
                        int var33 = class110.field1640.method2940((byte) -124);
                        var3.method2108(var29, var32, var30, var31, var33, true, class192.field2961, var28);
                    }
                }
            }
            if ((var4 & 16384) != 0) {
                int var34 = class110.field1640.method2974((byte) -113);
                var3.field4596 = class110.field1640.method2940((byte) 95);
                var3.field4590 = class110.field1640.method2986(-20802);
                var3.field4637 = ~(32768 & var34) != -1;
                var3.field4581 = 32767 & var34;
                var3.field4660 = var3.field4581 - -var3.field4596 + class192.field2961;
            }
            if ((32 & var4) != 0) {
                int var35 = class110.field1640.method2982(-1);
                if (~var35 == -65536) {
                    var35 = -1;
                }
                int var36 = class110.field1640.method2962(0);
                int var37 = class110.field1640.method2944((byte) 4);
                int var38 = var37 & 7;
                int var39 = 15 & var37 >> 3;
                if (var39 == 15) {
                    var39 = -1;
                }
                var3.method2109(var35, -106, var36, var38, var39, 0);
            }
            if (~(var4 & 524288) != -1) {
                var3.field9243 = class110.field1640.method2996(105);
                if ("".equals(var3.field9243) || var3.field9243.equals(var3.field9240.field1630)) {
                    var3.field9243 = var3.field9240.field1630;
                }
            }
            if ((var4 & 8) != 0) {
                var3.field4635 = class110.field1640.method2996(118);
                var3.field4592 = 100;
            }
            if ((32768 & var4) != 0) {
                int var40 = var3.field9240.field1689.length;
                int var41 = 0;
                if (var3.field9240.field1619 != null) {
                    var41 = var3.field9240.field1619.length;
                }
                int var42 = 0;
                if (var3.field9240.field1676 != null) {
                    var42 = var3.field9240.field1676.length;
                }
                int var43 = class110.field1640.method2944((byte) 4);
                if ((var43 & 1) == 1) {
                    var3.field9252 = null;
                } else {
                    int[] var44 = null;
                    if (~(var43 & 2) == -3) {
                        var44 = new int[var40];
                        for (int var45 = 0; ~var45 > ~var40; ++var45) {
                            var44[var45] = class110.field1640.method2938((byte) -67);
                        }
                    }
                    short[] var46 = null;
                    if ((var43 & 4) == 4) {
                        var46 = new short[var41];
                        for (int var47 = 0; var41 > var47; ++var47) {
                            var46[var47] = (short) class110.field1640.method2938((byte) -67);
                        }
                    }
                    short[] var48 = null;
                    if ((8 & var43) == 8) {
                        var48 = new short[var42];
                        for (int var49 = 0; ~var49 > ~var42; ++var49) {
                            var48[var49] = (short) class110.field1640.method2998(true);
                        }
                    }
                    long var50 = (long) var2 | (long) (var3.field9262++) << 32;
                    var3.field9252 = new class688(var50, var44, var46, var48);
                }
            }
            if ((512 & var4) != 0) {
                var3.field4582 = class110.field1640.method3004(true);
                var3.field4579 = class110.field1640.method2975(false);
                var3.field4665 = class110.field1640.method3004(true);
                var3.field4662 = (byte) class110.field1640.method2964((byte) 78);
                var3.field4663 = class192.field2961 - -class110.field1640.method2938((byte) -67);
                var3.field4627 = class192.field2961 - -class110.field1640.method2982(-1);
            }
            if ((128 & var4) != 0) {
                var3.field9255 = class110.field1640.method2998(true);
                var3.field9261 = class110.field1640.method2974((byte) -71);
            }
            if (~(var4 & 1) != -1) {
                var3.field4584 = class110.field1640.method2938((byte) -67);
                if (var3.field4584 == 65535) {
                    var3.field4584 = -1;
                }
            }
            if ((262144 & var4) != 0) {
                int var52 = class110.field1640.method2982(-1);
                int var53 = class110.field1640.method2976(-127);
                if (var52 == 65535) {
                    var52 = -1;
                }
                int var54 = class110.field1640.method2964((byte) 101);
                int var55 = var54 & 7;
                int var56 = (var54 & 124) >> 3;
                if (var56 == 15) {
                    var56 = -1;
                }
                var3.method2109(var52, -117, var53, var55, var56, 2);
            }
            if ((var4 & 2048) != 0) {
                int var57 = class110.field1640.method2944((byte) 4);
                int[] var58 = new int[var57];
                int[] var59 = new int[var57];
                for (int var60 = 0; var60 < var57; ++var60) {
                    int var61 = class110.field1640.method2938((byte) -67);
                    if (~(49152 & var61) != -49153) {
                        var58[var60] = var61;
                    } else {
                        int var62 = class110.field1640.method2998(true);
                        var58[var60] = class746.method4158(var61 << 16, var62);
                    }
                    var59[var60] = class110.field1640.method2938((byte) -67);
                }
                var3.method2100((byte) -47, var58, var59);
            }
            if ((var4 & 4096) != 0) {
                int var63 = class110.field1640.method2938((byte) -67);
                int var64 = class110.field1640.method2962(0);
                if (~var63 == -65536) {
                    var63 = -1;
                }
                int var65 = class110.field1640.method2986(-20802);
                int var66 = 7 & var65;
                int var67 = 15 & var65 >> 3;
                if (var67 == 15) {
                    var67 = -1;
                }
                var3.method2109(var63, -112, var64, var66, var67, 1);
            }
            if ((var4 & 131072) != 0) {
                var3.field9248 = class110.field1640.method2982(-1);
                if (var3.field9248 == 65535) {
                    var3.field9248 = var3.field9240.field1664;
                }
            }
            if (~(var4 & 256) != -1) {
                var3.field4586 = class110.field1640.method2975(false);
                var3.field4591 = class110.field1640.method3004(!arg0);
                var3.field4655 = class110.field1640.method2943((byte) 16);
                var3.field4602 = class110.field1640.method2978(true);
                var3.field4629 = class110.field1640.method2998(true) + class192.field2961;
                var3.field4658 = class110.field1640.method2998(true) - -class192.field2961;
                var3.field4594 = class110.field1640.method2944((byte) 4);
                var3.field4655 += var3.field4670[0];
                var3.field4591 += var3.field4672[0];
                var3.field4668 = 1;
                var3.field4675 = 0;
                var3.field4602 += var3.field4672[0];
                var3.field4586 += var3.field4670[0];
            }
        }
        if (!arg0) {
            ++field3142;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public static final void method1415(int arg0) {
        ++field3149;
        int var1 = 0;
        if (arg0 != 24828) {
            method1414(true);
        }
        while (var1 < 5) {
            class310.field4432[var1] = false;
            ++var1;
        }
        class488.field6904 = 0;
        class733.field10150 = -1;
        class276.field4014 = -1;
        class375.field5176 = -1;
        class429.field5830 = -1;
        class416.field5704 = 1;
        class591.field8329 = 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method1416(int arg0) {
        ++field3148;
        if (arg0 != -12054) {
            this.field3157 = 41;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1417(OggPacket arg0, int arg1) {
        int var3 = -70 % ((arg1 - 34) / 54);
        ++field3139;
        if (~super.field10052 >= -1 || "SUB".equals(this.field3141)) {
            class494 var4 = new class494(arg0.getData());
            int var5 = var4.method2964((byte) 56);
            if (super.field10052 <= 8) {
                if ((var5 | 128) == 0) {
                    throw new IllegalStateException();
                }
                if (~super.field10052 != -1) {
                    return;
                }
                var4.field7042 += 23;
                this.field3147 = var4.method2980((byte) -91);
                this.field3157 = var4.method2980((byte) -53);
                if (this.field3147 == 0 || ~this.field3157 == -1) {
                    throw new IllegalStateException();
                }
                class494 var13 = new class494(16);
                var4.method2958(true, var13.field7050, 0, 16);
                this.field3155 = var13.method2996(127);
                var13.field7042 = 0;
                var4.method2958(true, var13.field7050, 0, 16);
                this.field3141 = var13.method2996(105);
            } else {
                if (var5 == 0) {
                    long var6 = var4.method2983(1474935456);
                    long var8 = var4.method2983(1474935456);
                    long var10 = var4.method2983(1474935456);
                    if (~var6 > -1L || ~var8 > -1L || ~var10 > -1L || var10 > var6) {
                        throw new IllegalStateException();
                    }
                    this.field3158 = (float) ((long) this.field3157 * var6) / (float) this.field3147;
                    this.field3146 = (float) ((var6 - -var8) * (long) this.field3157) / (float) this.field3147;
                    int var12 = var4.method2980((byte) -118);
                    if (var12 < 0 || ~var12 < ~(var4.field7050.length - var4.field7042)) {
                        throw new IllegalStateException();
                    }
                    this.field3151 = class528.method3188((byte) 44, var12, var4.field7050, var4.field7042);
                }
                if (~(128 | var5) != -1) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method1418(byte arg0) {
        ++field3153;
        if (arg0 != -67) {
            field3143 = null;
        }
        return this.field3151;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method1419(int arg0) {
        ++field3145;
        if (arg0 < 69) {
            this.method1418((byte) 39);
        }
        return this.field3155;
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field3143[var0] = class40.method306(var0, false);
        }
    }
}
