import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class290 implements class91 {

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[F")
    private float[] field4838 = new float[4];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[Z")
    public static boolean[] field4825 = new boolean[5];

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lna;")
    public static class26 field4829 = class69.method505("", (byte) -121);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lna;")
    public static class26 field4827 = class69.method505("Fertigkeit: ", (byte) -128);

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lna;")
    private static class26 field4839 = class69.method505(")4a=", (byte) -120);

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lna;")
    public static class26 field4840 = class69.method505("(U0a )2 non)2existant gosub script)2num: ", (byte) -124);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lve;")
    public static class266 field4830;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2040(byte arg0) {
        field4834++;
        class281.field4687.method1987(3);
        class207.field3216.method1987(3);
        if (arg0 <= -124) {
            class140.field2132.method1987(3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z", line = 42)
    public static final boolean method2041(int arg0, byte arg1) {
        class166 var2 = class294.method2069(97, arg0);
        field4828++;
        if (var2 == null) {
            return false;
        } else if (class156.field2427 == 1 || class156.field2427 == 2 || class229.field3624 == 2) {
            byte[] var3 = var2.field2577.method199(0);
            class11.field149 = new String(var3, 0, var3.length);
            class263.field4309 = var2.field2571;
            if (class229.field3624 != 0) {
                class104.field1661 = class263.field4309 + 40000;
                class319.field5446 = class104.field1661;
                class279.field4656 = class263.field4309 + 50000;
            }
            return true;
        } else {
            class26 var4 = class325.field5636;
            if (class229.field3624 != 0) {
                var4 = class236.method1587(new class26[] { class139.field2122, class149.method1019((byte) 9, var2.field2571 + 7000) }, (byte) -86);
            }
            if (arg1 > -2) {
                return false;
            }
            class26 var5 = class325.field5636;
            if (class211.field3273 != null) {
                var5 = class236.method1587(new class26[] { class314.field5382, class211.field3273 }, (byte) -100);
            }
            class26 var6 = class236.method1587(new class26[] { class64.field1025, var2.field2577, var4, class174.field2727, class149.method1019((byte) 9, class210.field3264), field4839, class149.method1019((byte) 9, class301.field5184), var5, class295.field4911, class277.field4634 ? class42.field695 : class134.field2049, class11.field148, class252.field4140 ? class42.field695 : class134.field2049, class97.field1577, class280.field4670 ? class42.field695 : class134.field2049 }, (byte) -110);
            try {
                class136.field2085.getAppletContext().showDocument(var6.method158(false), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIB)V", line = 93)
    public static final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4832++;
        if (class134.field2046 == 0) {
            int var7 = class218.field3495;
            int var8 = class273.field4571;
            int var9 = class21.field301;
            int var10 = class312.field5336;
            int var11 = (arg5 - arg3) * (var9 - var10) / arg1 + var10;
            int var12 = (arg4 - arg0) * (var7 - var8) / arg2 + var8;
            if (class86.field1420 && (class58.field940 & 0x40) != 0) {
                class297 var13 = class148.method1011((byte) -19, class29.field501, class297.field5087);
                if (var13 == null) {
                    class39.method321((byte) -87);
                } else {
                    class29.method237(class254.field4158, 0L, (byte) -53, class12.field169, var11, (short) 11, class33.field559, var12);
                }
            } else {
                class96.field1566++;
                if (class170.field2670 == 1) {
                    class29.method237(-1, 0L, (byte) -62, class2.field18, var11, (short) 36, class27.field450, var12);
                }
                class29.method237(-1, 0L, (byte) -75, class2.field18, var11, (short) 60, class112.field1771, var12);
            }
        }
        if (arg6 <= 48) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class9.field102; var16++) {
            long var17 = class190.field2979[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x77C3CCF2) >> 29;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var17 >> 7 & 0x7F;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class73.method523(class279.field4651, var19, var22, var17)) {
                    class78 var23 = class104.method750(4, var21);
                    if (var23.field1222 != null) {
                        var23 = var23.method552(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class134.field2046 == 1) {
                        class29.method237(class67.field1059, var17, (byte) -58, class236.method1587(new class26[] { class236.field3764, class281.field4689, var23.field1197 }, (byte) -75), var19, (short) 14, class110.field1755, var22);
                        class215.field3378++;
                    } else if (class86.field1420) {
                        class33 var28 = class299.field5143 == -1 ? null : class32.method252(64, class299.field5143);
                        if ((class58.field940 & 0x4) != 0 && (var28 == null || var23.method558(var28.field545, class299.field5143, (byte) 98) != var28.field545)) {
                            class29.method237(class254.field4158, var17, (byte) -77, class236.method1587(new class26[] { class308.field5303, class281.field4689, var23.field1197 }, (byte) -122), var19, (short) 38, class33.field559, var22);
                            class139.field2129++;
                        }
                    } else {
                        class42.field692++;
                        class26[] var24 = var23.field1192;
                        if (class269.field4441) {
                            var24 = class174.method1194(19406, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class35.field575++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 42;
                                    }
                                    if (var25 == 1) {
                                        var26 = 50;
                                    }
                                    int var27 = -1;
                                    if (var25 == 2) {
                                        var26 = 49;
                                    }
                                    if (var23.field1186 == var25) {
                                        var27 = var23.field1212;
                                    }
                                    if (var25 == 3) {
                                        var26 = 46;
                                    }
                                    if (var23.field1217 == var25) {
                                        var27 = var23.field1220;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1001;
                                    }
                                    class29.method237(var27, var17, (byte) -91, class236.method1587(new class26[] { class312.field5338, var23.field1197 }, (byte) -95), var19, var26, var24[var25], var22);
                                }
                            }
                        }
                        class29.method237(class12.field164, (long) var23.field1226, (byte) -26, class236.method1587(new class26[] { class312.field5338, var23.field1197 }, (byte) -65), var19, (short) 1004, class218.field3477, var22);
                    }
                }
                if (var20 == 1) {
                    class324 var29 = class185.field2877[var21];
                    if ((var29.field5565.field2894 & 0x1) == 0 && (var29.field3962 & 0x7F) == 0 && (var29.field3972 & 0x7F) == 0 || (var29.field5565.field2894 & 0x1) == 1 && (var29.field3962 & 0x7F) == 64 && (var29.field3972 & 0x7F) == 64) {
                        int var30 = var29.field3962 + 64 - var29.field5565.field2894 * 64;
                        int var31 = var29.field3972 - ((var29.field5565.field2894 - 1) * 64);
                        for (int var32 = 0; var32 < class81.field1270; var32++) {
                            class324 var33 = class185.field2877[class316.field5412[var32]];
                            int var34 = var33.field3962 + 64 - (var33.field5565.field2894 * 64);
                            int var35 = var33.field3972 + 64 - (var33.field5565.field2894 * 64);
                            if (var33 != null && var29 != var33 && var34 >= var30 && var29.field5565.field2894 - (var34 - var30 >> 7) >= var33.field5565.field2894 && var31 <= var35 && var33.field5565.field2894 <= var29.field5565.field2894 - (var35 - var31 >> 7)) {
                                class254.method1757(var33.field5565, var19, -126, class316.field5412[var32], var22);
                            }
                        }
                        for (int var36 = 0; var36 < class80.field1261; var36++) {
                            class159 var37 = class268.field4427[class95.field1550[var36]];
                            int var38 = var37.field3962 + 64 - (var37.method1078((byte) 114) * 64);
                            int var39 = var37.field3972 - (var37.method1078((byte) 114) * 64 - 64);
                            if (var37 != null && var38 >= var30 && var37.method1078((byte) 114) <= (var29.field5565.field2894 - (var38 - var30 >> 7)) && var39 >= var31 && var37.method1078((byte) 114) <= var29.field5565.field2894 - (var39 - var31 >> 7)) {
                                class18.method119(class95.field1550[var36], 5, var22, var37, var19);
                            }
                        }
                    }
                    class254.method1757(var29.field5565, var19, -108, var21, var22);
                }
                if (var20 == 0) {
                    class159 var40 = class268.field4427[var21];
                    if ((var40.field3962 & 0x7F) == 64 && (var40.field3972 & 0x7F) == 64) {
                        int var41 = var40.field3962 - ((var40.method1078((byte) 114) - 1) * 64);
                        int var42 = var40.field3972 + 64 - (var40.method1078((byte) 114) * 64);
                        for (int var43 = 0; var43 < class81.field1270; var43++) {
                            class324 var44 = class185.field2877[class316.field5412[var43]];
                            int var45 = var44.field3962 + 64 - (var44.field5565.field2894 * 64);
                            int var46 = var44.field3972 + 64 - var44.field5565.field2894 * 64;
                            if (var44 != null && var45 >= var41 && var44.field5565.field2894 <= var40.method1078((byte) 114) - (var45 - var41 >> 7) && var46 >= var42 && var44.field5565.field2894 <= (var40.method1078((byte) 114) - (var46 - var42 >> 7))) {
                                class254.method1757(var44.field5565, var19, -121, class316.field5412[var43], var22);
                            }
                        }
                        for (int var47 = 0; var47 < class80.field1261; var47++) {
                            class159 var48 = class268.field4427[class95.field1550[var47]];
                            int var49 = var48.field3962 - (var48.method1078((byte) 114) - 1) * 64;
                            int var50 = var48.field3972 - (var48.method1078((byte) 114) * 64 - 64);
                            if (var48 != null && var40 != var48 && var41 <= var49 && var48.method1078((byte) 114) <= var40.method1078((byte) 114) - (var49 - var41 >> 7) && var50 >= var42 && var48.method1078((byte) 114) <= (var40.method1078((byte) 114) - (var50 - var42 >> 7))) {
                                class18.method119(class95.field1550[var47], 9, var22, var48, var19);
                            }
                        }
                    }
                    class18.method119(var21, 31, var22, var40, var19);
                }
                if (var20 == 3) {
                    class32 var51 = class268.field4433[class279.field4651][var19][var22];
                    if (var51 != null) {
                        for (class2 var52 = (class2) var51.method254(2); var52 != null; var52 = (class2) var51.method261(41)) {
                            int var53 = var52.field23.field2155;
                            class217 var54 = class45.method341(var53, (byte) 71);
                            if (class134.field2046 == 1) {
                                class202.field3145++;
                                class29.method237(class67.field1059, (long) var53, (byte) -75, class236.method1587(new class26[] { class236.field3764, class259.field4220, var54.field3422 }, (byte) -104), var19, (short) 33, class110.field1755, var22);
                            } else if (class86.field1420) {
                                class33 var59 = class299.field5143 == -1 ? null : class32.method252(64, class299.field5143);
                                if ((class58.field940 & 0x1) != 0 && (var59 == null || var54.method1465(var59.field545, 100, class299.field5143) != var59.field545)) {
                                    class25.field358++;
                                    class29.method237(class254.field4158, (long) var53, (byte) -70, class236.method1587(new class26[] { class308.field5303, class259.field4220, var54.field3422 }, (byte) -80), var19, (short) 39, class33.field559, var22);
                                }
                            } else {
                                class319.field5457++;
                                class26[] var55 = var54.field3460;
                                if (class269.field4441) {
                                    var55 = class174.method1194(19406, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class71.field1085++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 21;
                                        }
                                        if (var56 == 1) {
                                            var57 = 34;
                                        }
                                        int var58 = -1;
                                        if (var54.field3419 == var56) {
                                            var58 = var54.field3406;
                                        }
                                        if (var56 == 2) {
                                            var57 = 18;
                                        }
                                        if (var54.field3443 == var56) {
                                            var58 = var54.field3400;
                                        }
                                        if (var56 == 3) {
                                            var57 = 20;
                                        }
                                        if (var56 == 4) {
                                            var57 = 24;
                                        }
                                        class29.method237(var58, (long) var53, (byte) -43, class236.method1587(new class26[] { class1.field3, var54.field3422 }, (byte) -66), var19, var57, var55[var56], var22);
                                    }
                                }
                                class29.method237(class12.field164, (long) var53, (byte) -43, class236.method1587(new class26[] { class1.field3, var54.field3422 }, (byte) -70), var19, (short) 1002, class218.field3477, var22);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 469)
    public static final void method2043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class136 var20 = new class136(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class36.field585[var21][arg1][arg2] == null) {
                    class36.field585[var21][arg1][arg2] = new class55(var21, arg1, arg2);
                }
            }
            class36.field585[arg0][arg1][arg2].field896 = var20;
        } else if (arg3 == 1) {
            class136 var22 = new class136(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class36.field585[var23][arg1][arg2] == null) {
                    class36.field585[var23][arg1][arg2] = new class55(var23, arg1, arg2);
                }
            }
            class36.field585[arg0][arg1][arg2].field896 = var22;
        } else {
            class213 var24 = new class213(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class36.field585[var25][arg1][arg2] == null) {
                    class36.field585[var25][arg1][arg2] = new class55(var25, arg1, arg2);
                }
            }
            class36.field585[arg0][arg1][arg2].field882 = var24;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()I", line = 518)
    public final int method18() {
        field4837++;
        return 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 528)
    public final void method16(int arg0) {
        field4833++;
        GL var2 = class255.field4181;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field4838[0] = var5;
            this.field4838[1] = 0.0F;
            this.field4838[2] = 0.0F;
            this.field4838[3] = 0.0F;
        } else {
            this.field4838[2] = var5;
            this.field4838[1] = 0.0F;
            this.field4838[3] = 0.0F;
            this.field4838[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class141.field2159 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class158.field2466 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class92.field1524), (float) (-class4.field50), (float) (-class56.field917));
        var2.glTexGenfv(8192, 9474, this.field4838, 0);
        this.field4838[3] = (float) class255.field4168 * var4;
        this.field4838[0] = 0.0F;
        this.field4838[2] = 0.0F;
        this.field4838[1] = var5;
        var2.glTexGenfv(8193, 9474, this.field4838, 0);
        var2.glPopMatrix();
        if (class49.field775) {
            this.field4838[3] = (float) class255.field4168 * var3;
            this.field4838[1] = 0.0F;
            this.field4838[0] = 0.0F;
            this.field4838[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4838, 0);
        } else {
            int var7 = (int) ((float) class255.field4168 * var3 * 64.0F);
            var2.glBindTexture(3553, class49.field771[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 590)
    public final void method15() {
        GL var1 = class255.field4181;
        field4835++;
        var1.glCallList(this.field4831 + 1);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()V", line = 600)
    public final void method17() {
        field4836++;
        GL var1 = class255.field4181;
        var1.glCallList(this.field4831);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 679)
    public class290() {
        this.method2045(2);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 624)
    public static void method2044(byte arg0) {
        field4829 = null;
        field4830 = null;
        field4825 = null;
        field4840 = null;
        if (arg0 > -112) {
            method2046(-116, 108, 54, -120, 44, 6);
        }
        field4827 = null;
        field4839 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 640)
    private final void method2045(int arg0) {
        GL var2 = class255.field4181;
        field4841++;
        this.field4831 = var2.glGenLists(arg0);
        var2.glNewList(this.field4831, 4864);
        var2.glActiveTexture(33985);
        if (class49.field775) {
            var2.glBindTexture(32879, class49.field777);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4831 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class49.field775) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V", line = 688)
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 66) {
            method2044((byte) -33);
        }
        for (int var6 = arg3; var6 <= arg1; var6++) {
            class76.method543(class45.field710[var6], arg4, 121, arg2, arg5);
        }
        field4826++;
    }
}
