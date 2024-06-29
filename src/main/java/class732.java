import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class732 {

    @OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
    private int[] field10151 = new int[8191];

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[I")
    private int[] field10147 = new int[1600];

    @OriginalMember(owner = "client!no", name = "s", descriptor = "[[Lvj;")
    private class468[][] field10162 = new class468[1600][64];

    @OriginalMember(owner = "client!no", name = "t", descriptor = "[I")
    private int[] field10163 = new int[64];

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    private int field10149 = 0;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "[[Lvj;")
    private class468[][] field10155 = new class468[64][768];

    @OriginalMember(owner = "client!no", name = "p", descriptor = "Lnc;")
    private class26 field10159;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Lid;")
    private class612 field10154;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Lid;")
    private class612 field10157;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Loh;")
    private class427 field10160;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)Z")
    public static final boolean method4059(boolean arg0, int arg1) {
        if (arg0) {
            field10146++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method4060(int arg0) {
        this.field10154.method2614(487);
        field10156++;
        if (arg0 > -31) {
            this.field10160 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILai;I)V")
    private final void method4061(int arg0, class626 arg1, int arg2) {
        field10152++;
        class662.field9132 = arg1.field8644;
        arg1.method3451((float) arg2, (byte) 92);
        arg1.method3511(arg0 ^ 0xFFFFFFBF);
        arg1.method3489(false, arg0);
        arg1.method3500((byte) -20, false);
        arg1.method3469((byte) -28);
        if (arg0 != 64) {
            this.method4067(null, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method4062(String arg0, int arg1) {
        field10153++;
        return arg1 == 0 ? class369.method2297(arg0, -91, 10, true) : false;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILef;Lai;B)V")
    public final void method4063(int arg0, class515 arg1, class626 arg2, byte arg3) {
        field10145++;
        if (arg2.field8638 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method4061(64, arg2, arg0);
        } else {
            this.method4066((byte) -106, arg2);
        }
        float var5 = arg2.field8638.field10464;
        float var6 = arg2.field8638.field10478;
        float var7 = arg2.field8638.field10456;
        float var8 = arg2.field8638.field10454;
        try {
            int var9 = 0;
            if (arg3 > -75) {
                return;
            }
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class424 var12 = arg1.field7049.field1011;
            for (class424 var13 = var12.field6051; var13 != var12; var13 = var13.field6051) {
                class468 var14 = (class468) var13;
                int var15 = (int) ((float) (var14.field6488 >> 12) * var7 + (float) (var14.field6493 >> 12) * var5 + (float) (var14.field6486 >> 12) * var6 + var8);
                this.field10151[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class485.method2812(9761, var16) + 1 - class456.field6333;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class424 var18 = var12.field6051;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field10149 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field10147[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field10163[var24] = 0;
                }
                while (var12 != var18) {
                    class468 var25 = (class468) var18;
                    if (var22) {
                        var21 = var25.field6498;
                        var20 = var25.field6496;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field6496 != var20 || var25.field6498 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field10151[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field10147[var26] >= 64) {
                            label106: {
                                if (this.field10147[var26] == 64) {
                                    if (this.field10149 == 64) {
                                        break label106;
                                    }
                                    this.field10147[var26] += this.field10149++ + 1;
                                }
                                class468[] var10000 = this.field10155[this.field10147[var26] - 64 - 1];
                                int var10002 = this.field10147[var26] - 65;
                                int var10004 = this.field10163[this.field10147[var26] - 65];
                                this.field10163[var10002] = this.field10163[this.field10147[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        } else {
                            this.field10162[var26][this.field10147[var26]++] = var25;
                        }
                    }
                    var18 = var18.field6051;
                }
                arg2.method3502(false, var20 >= 0 ? var20 : -1, false, (byte) -112);
                if (var21 && class662.field9132 != arg2.field8644) {
                    arg2.method452(class662.field9132);
                } else if (arg2.field8644 != 1.0F) {
                    arg2.method452(1.0F);
                }
                this.method4065(true, arg2, var16);
            }
        } catch (Exception var27) {
        }
        this.method4067(arg2, (byte) 55);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lai;I)V")
    public final void method4064(class626 arg0, int arg1) {
        field10150++;
        this.field10154.method2642(786336, 24, -10760);
        if (arg1 != -1403085716) {
            this.field10155 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLai;I)V")
    private final void method4065(boolean arg0, class626 arg1, int arg2) {
        field10144++;
        int var4 = 0;
        class754 var5 = arg1.method3456(-1690);
        float var6 = var5.field10450;
        float var7 = var5.field10441;
        float var8 = var5.field10479;
        float var9 = var5.field10474;
        float var10 = var5.field10434;
        float var11 = var5.field10439;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field10154.method2646(true, arg0);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method3445(9, var21);
        if (Stream.method3926()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field10147[var23] > 64 ? 64 : this.field10147[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class468 var38 = this.field10162[var23][var25];
                        int var39 = var38.field6497;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6493 >> 12);
                        float var45 = (float) (var38.field6486 >> 12);
                        float var46 = (float) (var38.field6488 >> 12);
                        int var47 = var38.field6487 >> 12;
                        var22.method3930((float) (-var47) * var12 + var44);
                        var22.method3930((float) (-var47) * var13 + var45);
                        var22.method3930((float) (-var47) * var14 + var46);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var40, var41, var42, var43);
                        } else {
                            var22.method3916(var40, var41, var42, var43);
                        }
                        var22.method3930(0.0F);
                        var22.method3930(0.0F);
                        var22.method3930((float) var47 * var15 + var44);
                        var22.method3930((float) var47 * var16 + var45);
                        var22.method3930((float) var47 * var17 + var46);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var40, var41, var42, var43);
                        } else {
                            var22.method3916(var40, var41, var42, var43);
                        }
                        var22.method3930(1.0F);
                        var22.method3930(0.0F);
                        var22.method3930((float) var47 * var12 + var44);
                        var22.method3930((float) var47 * var13 + var45);
                        var22.method3930((float) var47 * var14 + var46);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var40, var41, var42, var43);
                        } else {
                            var22.method3916(var40, var41, var42, var43);
                        }
                        var22.method3930(1.0F);
                        var22.method3930(1.0F);
                        var22.method3930((float) var47 * var18 + var44);
                        var22.method3930((float) var47 * var19 + var45);
                        var22.method3930((float) var47 * var20 + var46);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var40, var41, var42, var43);
                        } else {
                            var22.method3916(var40, var41, var42, var43);
                        }
                        var22.method3930(0.0F);
                        var22.method3930(1.0F);
                        var4++;
                    }
                    if (this.field10147[var23] > 64) {
                        int var26 = this.field10147[var23] - 64 - 1;
                        for (int var27 = this.field10163[var26] - 1; var27 >= 0; var27--) {
                            class468 var28 = this.field10155[var26][var27];
                            int var29 = var28.field6497;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6493 >> 12);
                            float var35 = (float) (var28.field6486 >> 12);
                            float var36 = (float) (var28.field6488 >> 12);
                            int var37 = var28.field6487 >> 12;
                            var22.method3930((float) (-var37) * var12 + var34);
                            var22.method3930((float) (-var37) * var13 + var35);
                            var22.method3930((float) (-var37) * var14 + var36);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var30, var31, var32, var33);
                            } else {
                                var22.method3916(var30, var31, var32, var33);
                            }
                            var22.method3930(0.0F);
                            var22.method3930(0.0F);
                            var22.method3930((float) var37 * var15 + var34);
                            var22.method3930((float) var37 * var16 + var35);
                            var22.method3930((float) var37 * var17 + var36);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var30, var31, var32, var33);
                            } else {
                                var22.method3916(var30, var31, var32, var33);
                            }
                            var22.method3930(1.0F);
                            var22.method3930(0.0F);
                            var22.method3930((float) var37 * var12 + var34);
                            var22.method3930((float) var37 * var13 + var35);
                            var22.method3930((float) var37 * var14 + var36);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var30, var31, var32, var33);
                            } else {
                                var22.method3916(var30, var31, var32, var33);
                            }
                            var22.method3930(1.0F);
                            var22.method3930(1.0F);
                            var22.method3930((float) var37 * var18 + var34);
                            var22.method3930((float) var37 * var19 + var35);
                            var22.method3930((float) var37 * var20 + var36);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var30, var31, var32, var33);
                            } else {
                                var22.method3916(var30, var31, var32, var33);
                            }
                            var22.method3930(0.0F);
                            var4++;
                            var22.method3930(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field10147[var48] <= 64 ? this.field10147[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class468 var63 = this.field10162[var48][var50];
                        int var64 = var63.field6497;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6493 >> 12);
                        float var70 = (float) (var63.field6486 >> 12);
                        float var71 = (float) (var63.field6488 >> 12);
                        int var72 = var63.field6487 >> 12;
                        var22.method3929((float) (-var72) * var12 + var69);
                        var22.method3929((float) (-var72) * var13 + var70);
                        var22.method3929((float) (-var72) * var14 + var71);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var65, var66, var67, var68);
                        } else {
                            var22.method3916(var65, var66, var67, var68);
                        }
                        var22.method3929(0.0F);
                        var22.method3929(0.0F);
                        var22.method3929((float) var72 * var15 + var69);
                        var22.method3929((float) var72 * var16 + var70);
                        var22.method3929((float) var72 * var17 + var71);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var65, var66, var67, var68);
                        } else {
                            var22.method3916(var65, var66, var67, var68);
                        }
                        var22.method3929(1.0F);
                        var22.method3929(0.0F);
                        var22.method3929((float) var72 * var12 + var69);
                        var22.method3929((float) var72 * var13 + var70);
                        var22.method3929((float) var72 * var14 + var71);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var65, var66, var67, var68);
                        } else {
                            var22.method3916(var65, var66, var67, var68);
                        }
                        var22.method3929(1.0F);
                        var22.method3929(1.0F);
                        var22.method3929((float) var72 * var18 + var69);
                        var22.method3929((float) var72 * var19 + var70);
                        var22.method3929((float) var72 * var20 + var71);
                        if (arg1.field8716 == 0) {
                            var22.method3920(var65, var66, var67, var68);
                        } else {
                            var22.method3916(var65, var66, var67, var68);
                        }
                        var22.method3929(0.0F);
                        var4++;
                        var22.method3929(1.0F);
                    }
                    if (this.field10147[var48] > 64) {
                        int var51 = this.field10147[var48] - 65;
                        for (int var52 = this.field10163[var51] - 1; var52 >= 0; var52--) {
                            class468 var53 = this.field10155[var51][var52];
                            int var54 = var53.field6497;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6493 >> 12);
                            float var60 = (float) (var53.field6486 >> 12);
                            float var61 = (float) (var53.field6488 >> 12);
                            int var62 = var53.field6487 >> 12;
                            var22.method3929((float) (-var62) * var12 + var59);
                            var22.method3929((float) (-var62) * var13 + var60);
                            var22.method3929((float) (-var62) * var14 + var61);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var55, var56, var57, var58);
                            } else {
                                var22.method3916(var55, var56, var57, var58);
                            }
                            var22.method3929(0.0F);
                            var22.method3929(0.0F);
                            var22.method3929((float) var62 * var15 + var59);
                            var22.method3929((float) var62 * var16 + var60);
                            var22.method3929((float) var62 * var17 + var61);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var55, var56, var57, var58);
                            } else {
                                var22.method3916(var55, var56, var57, var58);
                            }
                            var22.method3929(1.0F);
                            var22.method3929(0.0F);
                            var22.method3929((float) var62 * var12 + var59);
                            var22.method3929((float) var62 * var13 + var60);
                            var22.method3929((float) var62 * var14 + var61);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var55, var56, var57, var58);
                            } else {
                                var22.method3916(var55, var56, var57, var58);
                            }
                            var22.method3929(1.0F);
                            var22.method3929(1.0F);
                            var22.method3929((float) var62 * var18 + var59);
                            var22.method3929((float) var62 * var19 + var60);
                            var22.method3929((float) var62 * var20 + var61);
                            if (arg1.field8716 == 0) {
                                var22.method3920(var55, var56, var57, var58);
                            } else {
                                var22.method3916(var55, var56, var57, var58);
                            }
                            var22.method3929(0.0F);
                            var22.method3929(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3922();
        if (this.field10154.method2640(10925)) {
            arg1.method883(this.field10154, 0, 60);
            arg1.method883(this.field10157, 1, -90);
            arg1.method913(this.field10159, (byte) -63);
            arg1.method864(var4 * 2, 0, this.field10160, 0, var4 * 4, arg0, class235.field3174);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLai;)V")
    private final void method4066(byte arg0, class626 arg1) {
        int var3 = -69 % ((-arg0 - 44) / 58);
        field10161++;
        class662.field9132 = arg1.field8644;
        arg1.method3493(true);
        arg1.method3489(false, 64);
        arg1.method3500((byte) 124, false);
        arg1.method3469((byte) 11);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lai;B)V")
    private final void method4067(class626 arg0, byte arg1) {
        field10158++;
        arg0.method3500((byte) 122, true);
        arg0.method3489(true, 64);
        if (class662.field9132 != arg0.field8644) {
            arg0.method452(class662.field9132);
        }
        if (arg1 != 55) {
            this.field10147 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lai;)V")
    public class732(class626 arg0) {
        this.field10159 = arg0.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7363, class542.field7365 }), new class357(class542.field7358) }, (byte) -21);
        this.field10154 = arg0.method902(0, true);
        this.field10157 = arg0.method902(0, false);
        this.field10157.method2642(393168, 12, -10760);
        this.field10160 = arg0.method908(-1, false);
        this.field10160.method2615(49146, (byte) -73);
        Buffer var2 = this.field10160.method2613(true, 3754);
        if (var2 != null) {
            Stream var3 = arg0.method3445(9, var2);
            if (Stream.method3926()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3918(var7);
                    var3.method3918(var7 + 1);
                    var3.method3918(var7 + 2);
                    var3.method3918(var7 + 2);
                    var3.method3918(var7 + 3);
                    var3.method3918(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3921(var5);
                    var3.method3921(var5 + 1);
                    var3.method3921(var5 + 2);
                    var3.method3921(var5 + 2);
                    var3.method3921(var5 + 3);
                    var3.method3921(var5);
                }
            }
            var3.method3922();
            this.field10160.method2611(26937);
        }
        Buffer var8 = this.field10157.method2646(true, true);
        if (var8 != null) {
            Stream var9 = arg0.method3445(9, var8);
            if (Stream.method3926()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3930(0.0F);
                    var9.method3930(-1.0F);
                    var9.method3930(0.0F);
                    var9.method3930(0.0F);
                    var9.method3930(-1.0F);
                    var9.method3930(0.0F);
                    var9.method3930(0.0F);
                    var9.method3930(-1.0F);
                    var9.method3930(0.0F);
                    var9.method3930(0.0F);
                    var9.method3930(-1.0F);
                    var9.method3930(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3929(0.0F);
                    var9.method3929(-1.0F);
                    var9.method3929(0.0F);
                    var9.method3929(0.0F);
                    var9.method3929(-1.0F);
                    var9.method3929(0.0F);
                    var9.method3929(0.0F);
                    var9.method3929(-1.0F);
                    var9.method3929(0.0F);
                    var9.method3929(0.0F);
                    var9.method3929(-1.0F);
                    var9.method3929(0.0F);
                }
            }
            var9.method3922();
            this.field10157.method2640(10925);
        }
    }
}
