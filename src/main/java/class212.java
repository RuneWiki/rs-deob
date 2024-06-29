import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class212 {

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private int field3654 = 128;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Z")
    public boolean field3649 = false;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private int field3646 = 0;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field3653 = 0;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field3657 = -1;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    private int field3658 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field3652 = 128;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Loh;")
    public static class258 field3648 = class153.method1046("Ablegen", 101);

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3647 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Loh;")
    public static class258 field3659 = class153.method1046("Verbindung mit Update)2Server)3)3)3", 119);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
    private short[] field3644;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[S")
    private short[] field3662;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[S")
    private short[] field3664;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lva;I)V", line = 10)
    public final void method1416(class235 arg0, int arg1) {
        if (arg1 != -15795) {
            this.field3664 = (short[]) null;
        }
        field3655++;
        while (true) {
            int var3 = arg0.method1589(127);
            if (var3 == 0) {
                return;
            }
            this.method1421(var3, 95, arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Li;", line = 33)
    public final class305 method1417(byte arg0, int arg1) {
        field3663++;
        if (arg0 != -62) {
            method1419(-106, (class213) null);
        }
        class305 var3 = (class305) class167.field2834.method1159((byte) 124, (long) this.field3645);
        if (var3 == null) {
            class97 var4 = class97.method738(class193.field3418, this.field3661, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3664 != null) {
                for (int var5 = 0; var5 < this.field3664.length; var5++) {
                    var4.method727(this.field3664[var5], this.field3662[var5]);
                }
            }
            if (this.field3651 != null) {
                for (int var6 = 0; var6 < this.field3651.length; var6++) {
                    var4.method736(this.field3651[var6], this.field3644[var6]);
                }
            }
            var3 = var4.method713(this.field3653 + 64, 850 - -this.field3658, -30, -50, -30);
            class167.field2834.method1163(var3, -1, (long) this.field3645);
        }
        class305 var7;
        if (this.field3657 == -1 || arg1 == -1) {
            var7 = var3.method648(true, true);
        } else {
            var7 = class263.method1842(this.field3657, (byte) -114).method8((byte) -37, var3, arg1);
        }
        if (this.field3652 != 128 || this.field3654 != 128) {
            var7.method656(this.field3652, this.field3654, this.field3652);
        }
        if (this.field3646 != 0) {
            if (this.field3646 == 90) {
                var7.method645();
            }
            if (this.field3646 == 180) {
                var7.method654();
            }
            if (this.field3646 == 270) {
                var7.method653();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[B)V", line = 126)
    public static final void method1418(int arg0, byte[] arg1) {
        field3650++;
        class235 var2 = new class235(arg1);
        var2.field4051 = arg1.length - 2;
        class152.field2608 = var2.method1615(-121);
        class37.field497 = new byte[class152.field2608][];
        if (arg0 >= -65) {
            method1420((class228) null, true);
        }
        class85.field1431 = new byte[class152.field2608][];
        class113.field1958 = new int[class152.field2608];
        class280.field4819 = new int[class152.field2608];
        class294.field5056 = new boolean[class152.field2608];
        class301.field5149 = new int[class152.field2608];
        class279.field4795 = new int[class152.field2608];
        var2.field4051 = arg1.length - (class152.field2608 * 8) - 7;
        class108.field1919 = var2.method1615(-118);
        class23.field279 = var2.method1615(108);
        int var3 = (var2.method1589(52) & 0xFF) + 1;
        for (int var4 = 0; var4 < class152.field2608; var4++) {
            class279.field4795[var4] = var2.method1615(123);
        }
        for (int var5 = 0; var5 < class152.field2608; var5++) {
            class280.field4819[var5] = var2.method1615(-123);
        }
        for (int var6 = 0; var6 < class152.field2608; var6++) {
            class113.field1958[var6] = var2.method1615(-128);
        }
        for (int var7 = 0; var7 < class152.field2608; var7++) {
            class301.field5149[var7] = var2.method1615(-17);
        }
        var2.field4051 = arg1.length - (class152.field2608 * 8) - ((var3 - 1) * 3) - 7;
        class121.field2143 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class121.field2143[var8] = var2.method1602(18160);
            if (class121.field2143[var8] == 0) {
                class121.field2143[var8] = 1;
            }
        }
        var2.field4051 = 0;
        for (int var9 = 0; var9 < class152.field2608; var9++) {
            int var10 = class113.field1958[var9];
            int var11 = class301.field5149[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class37.field497[var9] = var14;
            class85.field1431[var9] = var13;
            int var16 = var2.method1589(65);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method1617((byte) -117);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method1617((byte) -117);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var13[var19 + (var10 * var20)] = var2.method1617((byte) -117);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var14[var10 * var18 + var17] = var2.method1617((byte) -117);
                    }
                    var17++;
                }
            }
            class294.field5056[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILgb;)V", line = 301)
    public static final void method1419(int arg0, class213 arg1) {
        class146.field2484 = arg1;
        class164.field2768 = class146.field2484.method1435((byte) -21, arg0);
        field3660++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Llf;Z)V", line = 318)
    public static final void method1420(class228 arg0, boolean arg1) {
        class165.field2781.method82(arg0, (byte) -39);
        while (true) {
            class228 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class228[][] var7;
            class228 var78;
            do {
                class228 var77;
                do {
                    class228 var76;
                    do {
                        class228 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class228) class165.field2781.method88(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3943);
                                            var3 = var2.field3928;
                                            var4 = var2.field3921;
                                            var5 = var2.field3941;
                                            var6 = var2.field3930;
                                            var7 = class178.field3180[var5];
                                            float var8 = 0.0F;
                                            if (class257.field4390) {
                                                if (class201.field3482 == class144.field2424) {
                                                    int var9 = class299.field5116[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class208.field3582 != var10) {
                                                        class208.field3582 = var10;
                                                        class3.method20(-415, var10);
                                                        class304.method2124(class243.method1657((byte) 96));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class159.field2711 != var11) {
                                                        class159.field2711 = var11;
                                                        class159.method1078(5000, var11);
                                                    }
                                                    int var12 = class134.field2317[0][var3 + 1][var4] + class134.field2317[0][var3][var4] + class134.field2317[0][var3][var4 + 1] + class134.field2317[0][var3 + 1][var4 + 1] >> 2;
                                                    class107.method795(3, 58, -var12);
                                                    var8 = 201.5F;
                                                    class257.method1735(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class257.method1735(var8);
                                                }
                                            }
                                            if (!var2.field3927) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class228 var13 = class178.field3180[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3943) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class64.field1134 && var3 > class121.field2144) {
                                                    class228 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3943 && (var14.field3927 || (var2.field3922 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class64.field1134 && var3 < class171.field3009 - 1) {
                                                    class228 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3943 && (var15.field3927 || (var2.field3922 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class145.field2447 && var4 > class30.field360) {
                                                    class228 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3943 && (var16.field3927 || (var2.field3922 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class145.field2447 && var4 < class45.field688 - 1) {
                                                    class228 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3943 && (var17.field3927 || (var2.field3922 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3927 = false;
                                            if (var2.field3937 != null) {
                                                class228 var18 = var2.field3937;
                                                if (class257.field4390) {
                                                    class257.method1735(201.5F - (float) (var18.field3930 + 1) * 50.0F);
                                                }
                                                if (var18.field3945 == null) {
                                                    if (var18.field3933 != null) {
                                                        if (client.method346(0, var3, var4)) {
                                                            class19.method127(var18.field3933, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, true);
                                                        } else {
                                                            class19.method127(var18.field3933, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, false);
                                                        }
                                                    }
                                                } else if (client.method346(0, var3, var4)) {
                                                    class91.method677(var18.field3945, 0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, true);
                                                } else {
                                                    class91.method677(var18.field3945, 0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, false);
                                                }
                                                class23 var19 = var18.field3923;
                                                if (var19 != null) {
                                                    if (class257.field4390) {
                                                        if ((var19.field285 & var2.field3929) == 0) {
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                        } else {
                                                            class267.method1894(var19.field285, class190.field3359, class258.field4463, class289.field4986, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field291.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var19.field283 - class190.field3359, var19.field287 - class258.field4463, var19.field296 - class289.field4986, var19.field298);
                                                }
                                                for (int var20 = 0; var20 < var18.field3950; var20++) {
                                                    class219 var21 = var18.field3932[var20];
                                                    if (var21 != null) {
                                                        if (class257.field4390) {
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                        }
                                                        var21.field3801.method363(var21.field3798, class203.field3516, class52.field841, class244.field4230, class310.field5249, var21.field3787 - class190.field3359, var21.field3805 - class258.field4463, var21.field3803 - class289.field4986, var21.field3795);
                                                    }
                                                }
                                                if (class257.field4390) {
                                                    class257.method1735(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3945 == null) {
                                                if (var2.field3933 != null) {
                                                    if (client.method346(var6, var3, var4)) {
                                                        class19.method127(var2.field3933, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class19.method127(var2.field3933, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, false);
                                                    }
                                                }
                                            } else if (client.method346(var6, var3, var4)) {
                                                class91.method677(var2.field3945, var6, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3945.field311 != 12345678 || class145.field2457 && var5 <= class232.field4018) {
                                                    class91.method677(var2.field3945, var6, class203.field3516, class52.field841, class244.field4230, class310.field5249, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class250 var23 = var2.field3931;
                                                if (var23 != null && (var23.field4306 & 0x80000000L) != 0L) {
                                                    if (class257.field4390 && var23.field4320) {
                                                        class257.method1735(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    var23.field4310.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var23.field4317 - class190.field3359, var23.field4315 - class258.field4463, var23.field4307 - class289.field4986, var23.field4306);
                                                    if (class257.field4390 && var23.field4320) {
                                                        class257.method1735(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class23 var26 = var2.field3923;
                                            class263 var27 = var2.field3939;
                                            if (var26 != null || var27 != null) {
                                                if (class64.field1134 == var3) {
                                                    var24++;
                                                } else if (class64.field1134 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class145.field2447 == var4) {
                                                    var24 += 3;
                                                } else if (class145.field2447 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class145.field2443[var24];
                                                var2.field3929 = class242.field4203[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field285 & class113.field1959[var24]) == 0) {
                                                    var2.field3934 = 0;
                                                } else if (var26.field285 == 16) {
                                                    var2.field3934 = 3;
                                                    var2.field3936 = class179.field3192[var24];
                                                    var2.field3940 = 3 - var2.field3936;
                                                } else if (var26.field285 == 32) {
                                                    var2.field3934 = 6;
                                                    var2.field3936 = class86.field1452[var24];
                                                    var2.field3940 = 6 - var2.field3936;
                                                } else if (var26.field285 == 64) {
                                                    var2.field3934 = 12;
                                                    var2.field3936 = class2.field17[var24];
                                                    var2.field3940 = 12 - var2.field3936;
                                                } else {
                                                    var2.field3934 = 9;
                                                    var2.field3936 = class139.field2364[var24];
                                                    var2.field3940 = 9 - var2.field3936;
                                                }
                                                if ((var26.field285 & var25) != 0 && !class64.method491(var6, var3, var4, var26.field285)) {
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    var26.field291.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var26.field283 - class190.field3359, var26.field287 - class258.field4463, var26.field296 - class289.field4986, var26.field298);
                                                }
                                                if ((var26.field288 & var25) != 0 && !class64.method491(var6, var3, var4, var26.field288)) {
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    var26.field289.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var26.field283 - class190.field3359, var26.field287 - class258.field4463, var26.field296 - class289.field4986, var26.field298);
                                                }
                                            }
                                            if (var27 != null && !class276.method1937(var6, var3, var4, var27.field4566.method361())) {
                                                if (class257.field4390) {
                                                    class257.method1735(var8 - 0.5F);
                                                }
                                                if ((var27.field4571 & var25) != 0) {
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    var27.field4566.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var27.field4570 + var27.field4568 - class190.field3359, var27.field4574 - class258.field4463, var27.field4581 + var27.field4579 - class289.field4986, var27.field4584);
                                                } else if (var27.field4571 == 256) {
                                                    int var28 = var27.field4570 - class190.field3359;
                                                    int var29 = var27.field4574 - class258.field4463;
                                                    int var30 = var27.field4581 - class289.field4986;
                                                    int var31 = var27.field4585;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class257.field4390) {
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                        }
                                                        var27.field4566.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var27.field4568 + var28, var29, var27.field4579 + var30, var27.field4584);
                                                    } else if (var27.field4573 != null) {
                                                        if (class257.field4390) {
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                        }
                                                        var27.field4573.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var28, var29, var30, var27.field4584);
                                                    }
                                                }
                                                if (class257.field4390) {
                                                    class257.method1735(var8);
                                                }
                                            }
                                            if (var22) {
                                                class250 var34 = var2.field3931;
                                                if (var34 != null && (var34.field4306 & 0x80000000L) == 0L) {
                                                    if (class257.field4390 && var34.field4320) {
                                                        class257.method1735(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    var34.field4310.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var34.field4317 - class190.field3359, var34.field4315 - class258.field4463, var34.field4307 - class289.field4986, var34.field4306);
                                                    if (class257.field4390 && var34.field4320) {
                                                        class257.method1735(var8);
                                                    }
                                                }
                                                class90 var35 = var2.field3947;
                                                if (var35 != null && var35.field1581 == 0) {
                                                    if (class257.field4390) {
                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                    }
                                                    if (var35.field1584 != null) {
                                                        var35.field1584.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var35.field1583 - class190.field3359, var35.field1580 - class258.field4463, var35.field1588 - class289.field4986, var35.field1575);
                                                    }
                                                    if (var35.field1573 != null) {
                                                        var35.field1573.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var35.field1583 - class190.field3359, var35.field1580 - class258.field4463, var35.field1588 - class289.field4986, var35.field1575);
                                                    }
                                                    if (var35.field1579 != null) {
                                                        var35.field1579.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var35.field1583 - class190.field3359, var35.field1580 - class258.field4463, var35.field1588 - class289.field4986, var35.field1575);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3922;
                                            if (var36 != 0) {
                                                if (var3 < class64.field1134 && (var36 & 0x4) != 0) {
                                                    class228 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3943) {
                                                        class165.field2781.method82(var37, (byte) -39);
                                                    }
                                                }
                                                if (var4 < class145.field2447 && (var36 & 0x2) != 0) {
                                                    class228 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3943) {
                                                        class165.field2781.method82(var38, (byte) -39);
                                                    }
                                                }
                                                if (var3 > class64.field1134 && (var36 & 0x1) != 0) {
                                                    class228 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3943) {
                                                        class165.field2781.method82(var39, (byte) -39);
                                                    }
                                                }
                                                if (var4 > class145.field2447 && (var36 & 0x8) != 0) {
                                                    class228 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3943) {
                                                        class165.field2781.method82(var40, (byte) -39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3934 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3950; var42++) {
                                                if (class238.field4158 != var2.field3932[var42].field3794 && (var2.field3926[var42] & var2.field3934) == var2.field3936) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class23 var43 = var2.field3923;
                                                if (!class64.method491(var6, var3, var4, var43.field285)) {
                                                    if (class257.field4390) {
                                                        label882: {
                                                            if ((var43.field298 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field283 - class190.field3359;
                                                                int var45 = var43.field296 - class289.field4986;
                                                                int var46 = (int) (var43.field298 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class290.field4995 - 1) {
                                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class23.field277 - 1 && var4 < class290.field4995 - 1) {
                                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class23.field277 - 1 && var4 > 0) {
                                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field291.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var43.field283 - class190.field3359, var43.field287 - class258.field4463, var43.field296 - class289.field4986, var43.field298);
                                                }
                                                var2.field3934 = 0;
                                            }
                                        }
                                        if (!var2.field3938) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3950;
                                            var2.field3938 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class219 var50 = var2.field3932[var49];
                                                if (class238.field4158 != var50.field3794) {
                                                    for (int var51 = var50.field3793; var51 <= var50.field3785; var51++) {
                                                        for (int var52 = var50.field3797; var52 <= var50.field3789; var52++) {
                                                            class228 var53 = var7[var51][var52];
                                                            if (var53.field3927) {
                                                                var2.field3938 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3934 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3793) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3785) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3797) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3789) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3934) == var2.field3940) {
                                                                    var2.field3938 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class110.field1932[var48++] = var50;
                                                    int var55 = class64.field1134 - var50.field3793;
                                                    int var56 = var50.field3785 - class64.field1134;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class145.field2447 - var50.field3797;
                                                    int var58 = var50.field3789 - class145.field2447;
                                                    if (var58 > var57) {
                                                        var50.field3790 = var55 + var58;
                                                    } else {
                                                        var50.field3790 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class219 var62 = class110.field1932[var61];
                                                    if (class238.field4158 != var62.field3794) {
                                                        if (var62.field3790 > var59) {
                                                            var59 = var62.field3790;
                                                            var60 = var61;
                                                        } else if (var62.field3790 == var59) {
                                                            int var63 = var62.field3787 - class190.field3359;
                                                            int var64 = var62.field3803 - class289.field4986;
                                                            int var65 = class110.field1932[var60].field3787 - class190.field3359;
                                                            int var66 = class110.field1932[var60].field3803 - class289.field4986;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class219 var67 = class110.field1932[var60];
                                                var67.field3794 = class238.field4158;
                                                if (!class92.method682(var6, var67.field3793, var67.field3785, var67.field3797, var67.field3789, var67.field3801.method361())) {
                                                    if (class257.field4390) {
                                                        if ((var67.field3795 & 0xFC000L) == 147456L) {
                                                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                                                            int var68 = var67.field3787 - class190.field3359;
                                                            int var69 = var67.field3803 - class289.field4986;
                                                            int var70 = (int) (var67.field3795 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class267.method1896(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class267.method1896(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class267.method1896(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class267.method1896(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class267.method1889(class190.field3359, class258.field4463, class289.field4986, var5, var67.field3793, var67.field3797, var67.field3785, var67.field3789);
                                                        }
                                                    }
                                                    var67.field3801.method363(var67.field3798, class203.field3516, class52.field841, class244.field4230, class310.field5249, var67.field3787 - class190.field3359, var67.field3805 - class258.field4463, var67.field3803 - class289.field4986, var67.field3795);
                                                }
                                                for (int var71 = var67.field3793; var71 <= var67.field3785; var71++) {
                                                    for (int var72 = var67.field3797; var72 <= var67.field3789; var72++) {
                                                        class228 var73 = var7[var71][var72];
                                                        if (var73.field3934 != 0) {
                                                            class165.field2781.method82(var73, (byte) -39);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3943) {
                                                            class165.field2781.method82(var73, (byte) -39);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3938) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3938 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3943);
                            } while (var2.field3934 != 0);
                            if (var3 > class64.field1134 || var3 <= class121.field2144) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3943);
                        if (var3 < class64.field1134 || var3 >= class171.field3009 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3943);
                    if (var4 > class145.field2447 || var4 <= class30.field360) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3943);
                if (var4 < class145.field2447 || var4 >= class45.field688 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3943);
            var2.field3943 = false;
            class50.field784--;
            class90 var79 = var2.field3947;
            if (var79 != null && var79.field1581 != 0) {
                if (class257.field4390) {
                    class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                }
                if (var79.field1584 != null) {
                    var79.field1584.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var79.field1583 - class190.field3359, var79.field1580 - class258.field4463 - var79.field1581, var79.field1588 - class289.field4986, var79.field1575);
                }
                if (var79.field1573 != null) {
                    var79.field1573.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var79.field1583 - class190.field3359, var79.field1580 - class258.field4463 - var79.field1581, var79.field1588 - class289.field4986, var79.field1575);
                }
                if (var79.field1579 != null) {
                    var79.field1579.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var79.field1583 - class190.field3359, var79.field1580 - class258.field4463 - var79.field1581, var79.field1588 - class289.field4986, var79.field1575);
                }
            }
            if (var2.field3929 != 0) {
                class263 var80 = var2.field3939;
                if (var80 != null && !class276.method1937(var6, var3, var4, var80.field4566.method361())) {
                    if ((var80.field4571 & var2.field3929) != 0) {
                        if (class257.field4390) {
                            class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                        }
                        var80.field4566.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var80.field4570 + var80.field4568 - class190.field3359, var80.field4574 - class258.field4463, var80.field4581 + var80.field4579 - class289.field4986, var80.field4584);
                    } else if (var80.field4571 == 256) {
                        int var81 = var80.field4570 - class190.field3359;
                        int var82 = var80.field4574 - class258.field4463;
                        int var83 = var80.field4581 - class289.field4986;
                        int var84 = var80.field4585;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class257.field4390) {
                                class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                            }
                            var80.field4566.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var80.field4568 + var81, var82, var80.field4579 + var83, var80.field4584);
                        } else if (var80.field4573 != null) {
                            if (class257.field4390) {
                                class267.method1891(class190.field3359, class258.field4463, class289.field4986, var5, var3, var4);
                            }
                            var80.field4573.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var81, var82, var83, var80.field4584);
                        }
                    }
                }
                class23 var87 = var2.field3923;
                if (var87 != null) {
                    if ((var87.field288 & var2.field3929) != 0 && !class64.method491(var6, var3, var4, var87.field288)) {
                        if (class257.field4390) {
                            class267.method1894(var87.field288, class190.field3359, class258.field4463, class289.field4986, var6, var3, var4);
                        }
                        var87.field289.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var87.field283 - class190.field3359, var87.field287 - class258.field4463, var87.field296 - class289.field4986, var87.field298);
                    }
                    if ((var87.field285 & var2.field3929) != 0 && !class64.method491(var6, var3, var4, var87.field285)) {
                        if (class257.field4390) {
                            class267.method1894(var87.field285, class190.field3359, class258.field4463, class289.field4986, var6, var3, var4);
                        }
                        var87.field291.method363(0, class203.field3516, class52.field841, class244.field4230, class310.field5249, var87.field283 - class190.field3359, var87.field287 - class258.field4463, var87.field296 - class289.field4986, var87.field298);
                    }
                }
            }
            if (var5 < class300.field5129 - 1) {
                class228 var88 = class178.field3180[var5 + 1][var3][var4];
                if (var88 != null && var88.field3943) {
                    class165.field2781.method82(var88, (byte) -39);
                }
            }
            if (var3 < class64.field1134) {
                class228 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3943) {
                    class165.field2781.method82(var89, (byte) -39);
                }
            }
            if (var4 < class145.field2447) {
                class228 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3943) {
                    class165.field2781.method82(var90, (byte) -39);
                }
            }
            if (var3 > class64.field1134) {
                class228 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3943) {
                    class165.field2781.method82(var91, (byte) -39);
                }
            }
            if (var4 > class145.field2447) {
                class228 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3943) {
                    class165.field2781.method82(var92, (byte) -39);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILva;)V", line = 1313)
    private final void method1421(int arg0, int arg1, class235 arg2) {
        field3656++;
        if (arg1 < 83) {
            return;
        }
        if (arg0 == 1) {
            this.field3661 = arg2.method1615(-128);
        } else if (arg0 == 2) {
            this.field3657 = arg2.method1615(-124);
        } else if (arg0 == 4) {
            this.field3652 = arg2.method1615(-11);
        } else if (arg0 == 5) {
            this.field3654 = arg2.method1615(-34);
        } else if (arg0 == 6) {
            this.field3646 = arg2.method1615(-40);
        } else if (arg0 == 7) {
            this.field3653 = arg2.method1589(122);
        } else if (arg0 == 8) {
            this.field3658 = arg2.method1589(99);
        } else if (arg0 == 9) {
            this.field3649 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1589(101);
            this.field3662 = new short[var6];
            this.field3664 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3664[var7] = (short) arg2.method1615(-8);
                this.field3662[var7] = (short) arg2.method1615(-126);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1589(125);
            this.field3651 = new short[var4];
            this.field3644 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3651[var5] = (short) arg2.method1615(-126);
                this.field3644[var5] = (short) arg2.method1615(25);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 1411)
    public static void method1422(byte arg0) {
        field3659 = null;
        if (arg0 > -75) {
            field3643 = 31;
        }
        field3648 = null;
    }
}
