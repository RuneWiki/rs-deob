import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class382 extends class261 {

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "Z")
    private boolean field5911 = false;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Z")
    private boolean field5901;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "[Lhg;")
    private class358[] field5903;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Lnk;")
    public static class326 field5897 = new class326(69, 7);

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Lcs;")
    private class426 field5899;

    static {
        new class306("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new class306("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        new class306((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)[[[B", line = 3)
    public static final byte[][][] method2410(int arg0, byte arg1) {
        ++field5904;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            for (int var132 = 0; ~var132 > ~var3; ++var132) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var131 = 0; var4 > var131; ++var131) {
                if (~var10 <= ~var131) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; --var16) {
            for (int var129 = 0; var129 < var3; ++var129) {
                if (~var129 <= ~var16) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 + -1; ~var19 <= -1; --var19) {
            for (int var128 = 0; ~var3 < ~var128; ++var128) {
                if (~(var19 >> 1) <= ~var128) {
                    var17[var18] = -1;
                }
                ++var18;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var4 > var22; ++var22) {
            for (int var127 = 0; ~var3 < ~var127; ++var127) {
                if (var21 >= 0 && ~var20.length < ~var21) {
                    if (~var127 <= ~(var22 << 1)) {
                        var20[var21] = -1;
                    }
                    ++var21;
                } else {
                    ++var21;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var4 > var25; ++var25) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (var25 >> 1 >= var126) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 + -1; var28 >= 0; --var28) {
            for (int var125 = var3 + -1; ~var125 <= -1; --var125) {
                if (~var125 <= ~(var28 << 1)) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var124 = var3 - 1; var124 >= 0; --var124) {
                if (~var124 >= ~(var31 >> 1)) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; ~var34 <= -1; --var34) {
            for (int var123 = 0; ~var123 > ~var3; ++var123) {
                if (var34 << 1 <= var123) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; ++var37) {
            for (int var122 = 0; ~var122 > ~var3; ++var122) {
                if (var122 <= var37 >> 1) {
                    var35[var36] = -1;
                }
                ++var36;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; ~var4 < ~var40; ++var40) {
            for (int var121 = var3 + -1; var121 >= 0; --var121) {
                if (var40 << 1 <= var121) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
            for (int var120 = 0; ~var3 < ~var120; ++var120) {
                if (~var120 <= ~(var43 >> 1)) {
                    var42[var41] = -1;
                }
                ++var41;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; ~var4 < ~var46; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (~var119 >= ~(var46 << 1)) {
                    var44[var45] = -1;
                }
                ++var45;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var4 > var49; ++var49) {
            for (int var118 = var3 + -1; ~var118 <= -1; --var118) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 + -1; ~var52 <= -1; --var52) {
            for (int var117 = var3 + -1; var117 >= 0; --var117) {
                if (~var117 >= ~(var52 << 1)) {
                    var50[var51] = -1;
                }
                ++var51;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 + -1; ~var55 <= -1; --var55) {
            for (int var116 = var3 + -1; var116 >= 0; --var116) {
                if (~(var55 >> 1) >= ~var116) {
                    var53[var54] = -1;
                }
                ++var54;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 + -1; ~var58 <= -1; --var58) {
            for (int var115 = 0; var115 < var3; ++var115) {
                if (var115 <= var58 << 1) {
                    var57[var56] = -1;
                }
                ++var56;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; ~var4 < ~var61; ++var61) {
            for (int var114 = 0; var3 > var114; ++var114) {
                if (var114 >= var61 >> 1) {
                    var59[var60] = -1;
                }
                ++var60;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var4 > var64; ++var64) {
            for (int var113 = var3 - 1; var113 >= 0; --var113) {
                if (~(var64 << 1) <= ~var113) {
                    var63[var62] = -1;
                }
                ++var62;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var4 > var67; ++var67) {
            for (int var112 = 0; ~var3 < ~var112; ++var112) {
                if (~var112 >= ~(var3 / 2)) {
                    var65[var66] = -1;
                }
                ++var66;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; ++var70) {
            for (int var111 = 0; ~var3 < ~var111; ++var111) {
                if (~var70 >= ~(var4 / 2)) {
                    var68[var69] = -1;
                }
                ++var69;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; ~var73 > ~var4; ++var73) {
            for (int var110 = 0; ~var3 < ~var110; ++var110) {
                if (~var110 <= ~(var3 / 2)) {
                    var71[var72] = -1;
                }
                ++var72;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; ~var76 > ~var4; ++var76) {
            for (int var109 = 0; ~var109 > ~var3; ++var109) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                ++var75;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; ~var79 > ~var4; ++var79) {
            for (int var108 = 0; ~var108 > ~var3; ++var108) {
                if (var108 <= -(var4 / 2) + var79) {
                    var78[var77] = -1;
                }
                ++var77;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 + -1; var82 >= 0; --var82) {
            for (int var107 = 0; ~var3 < ~var107; ++var107) {
                if (var107 <= -(var4 / 2) + var82) {
                    var80[var81] = -1;
                }
                ++var81;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; ~var85 <= -1; --var85) {
            for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                if (~var106 >= ~(-(var4 / 2) + var85)) {
                    var83[var84] = -1;
                }
                ++var84;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        if (arg1 <= 70) {
            method2410(-110, (byte) -53);
        }
        for (int var88 = 0; ~var88 > ~var4; ++var88) {
            for (int var105 = var3 + -1; ~var105 <= -1; --var105) {
                if (~var105 >= ~(var88 - var4 / 2)) {
                    var86[var87] = -1;
                }
                ++var87;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var4 > var91; ++var91) {
            for (int var104 = 0; var3 > var104; ++var104) {
                if (var104 >= var91 - var4 / 2) {
                    var90[var89] = -1;
                }
                ++var89;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 + -1; ~var94 <= -1; --var94) {
            for (int var103 = 0; ~var3 < ~var103; ++var103) {
                if (var103 >= var94 - var4 / 2) {
                    var93[var92] = -1;
                }
                ++var92;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; --var97) {
            for (int var102 = var3 + -1; var102 >= 0; --var102) {
                if (~var102 <= ~(var97 - var4 / 2)) {
                    var96[var95] = -1;
                }
                ++var95;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; ~var4 < ~var100; ++var100) {
            for (int var101 = var3 + -1; var101 >= 0; --var101) {
                if (~(-(var4 / 2) + var100) >= ~var101) {
                    var98[var99] = -1;
                }
                ++var99;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V", line = 783)
    public final void method1023(int arg0) {
        if (!this.field5911) {
            super.field4358.method1484(5890, 0, 770, 34184);
        } else {
            if (!this.field5901) {
                super.field4358.method1440(2, 0);
                super.field4358.method1471(true, (class179) null);
            }
            super.field4358.method1440(1, arg0 ^ 5000);
            super.field4358.method1471(true, (class179) null);
            super.field4358.method1440(0, 0);
            this.field5899.method2603('\u0001', arg0 + -22213);
            this.field5911 = false;
        }
        if (arg0 == 5000) {
            ++field5900;
            super.field4358.method1482(8448, arg0 ^ 12424, 8448);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILkk;)V", line = 812)
    public final void method1024(int arg0, int arg1, class179 arg2) {
        ++field5906;
        super.field4358.method1471(true, arg2);
        super.field4358.method1410(arg0, 7681);
        int var4 = -111 % ((21 - arg1) / 36);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)V", line = 827)
    public static final void method2411(int arg0, byte arg1) {
        if (class432.field6464 == 0) {
            class509.field7398.method2360(32001, arg0);
        } else {
            class375.field5837 = arg0;
        }
        ++field5898;
        if (arg1 >= -2) {
            method2414(-69);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[S)[S", line = 846)
    public static final short[] method2412(int arg0, short[] arg1) {
        ++field5910;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class85.method609(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;)V", line = 861)
    public class382(class214 arg0) {
        super(arg0);
        if (arg0.field3633) {
            this.field5901 = arg0.field3722 < 3;
            int var2 = this.field5901 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 == -3) {
                                var15 = var13;
                            } else if (~var14 == -4) {
                                var15 = -var13;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field5903 = new class358[3];
            this.field5903[0] = new class358(super.field4358, 6406, 64, false, var4, 6406);
            this.field5903[1] = new class358(super.field4358, 6406, 64, false, var5, 6406);
            this.field5903[2] = new class358(super.field4358, 6406, 64, false, var3, 6406);
            this.method2413((byte) 126);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V", line = 973)
    public final void method1020(boolean arg0, byte arg1) {
        ++field5908;
        if (this.field5899 != null && arg0) {
            if (!this.field5901) {
                super.field4358.method1440(2, 0);
                super.field4358.method1471(true, super.field4358.field3696);
                super.field4358.method1440(0, 0);
            }
            this.field5899.method2603('\u0000', -17213);
            this.field5911 = true;
        } else {
            super.field4358.method1484(34168, 0, 770, 34184);
        }
        if (arg1 < 23) {
            this.field5899 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V", line = 998)
    public final void method1022(int arg0, boolean arg1) {
        super.field4358.method1482(8448, 8960, 7681);
        ++field5902;
        int var3 = 60 % ((87 - arg0) / 37);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Z", line = 1014)
    public final boolean method1026(int arg0) {
        ++field5905;
        if (arg0 < 69) {
            this.method1024(51, -110, (class179) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 1026)
    private final void method2413(byte arg0) {
        this.field5899 = new class426(super.field4358, 2);
        ++field5907;
        this.field5899.method2604(14, 0);
        int var2 = 92 % ((arg0 - 46) / 55);
        super.field4358.method1440(1, 0);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field5901) {
            super.field4358.method1482(260, 8960, 7681);
            super.field4358.method1474(0, 5890, -5000, 770);
            super.field4358.method1484(34167, 0, 770, 34184);
        } else {
            super.field4358.method1482(7681, 8960, 8448);
            super.field4358.method1474(0, 34168, -5000, 768);
            super.field4358.method1440(2, 0);
            super.field4358.method1482(260, 8960, 7681);
            super.field4358.method1474(0, 34168, -5000, 768);
            super.field4358.method1474(1, 34168, -5000, 770);
            super.field4358.method1484(34167, 0, 770, 34184);
        }
        super.field4358.method1440(0, 0);
        this.field5899.method2601((byte) 122);
        this.field5899.method2604(14, 1);
        super.field4358.method1440(1, 0);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field5901) {
            super.field4358.method1482(8448, 8960, 8448);
            super.field4358.method1474(0, 5890, -5000, 768);
            super.field4358.method1484(5890, 0, 770, 34184);
        } else {
            super.field4358.method1482(8448, 8960, 8448);
            super.field4358.method1474(0, 5890, -5000, 768);
            super.field4358.method1440(2, 0);
            super.field4358.method1482(8448, 8960, 8448);
            super.field4358.method1474(0, 5890, -5000, 768);
            super.field4358.method1474(1, 34168, -5000, 768);
            super.field4358.method1484(5890, 0, 770, 34184);
        }
        super.field4358.method1440(0, 0);
        this.field5899.method2601((byte) 122);
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V", line = 1105)
    public static void method2414(int arg0) {
        if (arg0 != 2) {
            method2411(71, (byte) 65);
        }
        field5897 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V", line = 1117)
    public final void method1021(int arg0, int arg1, int arg2) {
        int var4 = -118 / ((82 - arg1) / 41);
        ++field5909;
        if (this.field5911) {
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, this.field5903[arg2 + -1]);
            super.field4358.method1440(0, 0);
        }
    }
}
