import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class582 extends class345 {

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
    private boolean field8134 = false;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Z")
    private boolean field8127;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "[Lkk;")
    private class193[] field8143;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Lhg;")
    public static class693 field8133 = new class693(70, 12);

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public static int field8144 = 0;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "Lvh;")
    private class363 field8142;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Liea;")
    public static class481 field8137;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        int var2 = 22 % ((60 - arg0) / 60);
        if (!this.field8134) {
            super.field4357.method2788(770, 5890, false, 0);
        } else {
            if (!this.field8127) {
                super.field4357.method2847(2, false);
                super.field4357.method2850(-102, (class695) null);
            }
            super.field4357.method2847(1, false);
            super.field4357.method2850(119, (class695) null);
            super.field4357.method2847(0, false);
            this.field8142.method2099('\u0001', -120);
            this.field8134 = false;
        }
        ++field8129;
        super.field4357.method2799(-27874, 8448, 8448);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V")
    public final void method34(boolean arg0, byte arg1) {
        if (this.field8142 != null && arg0) {
            if (!this.field8127) {
                super.field4357.method2847(2, false);
                super.field4357.method2850(arg1 ^ 62, super.field4357.field6873);
                super.field4357.method2847(0, false);
            }
            this.field8142.method2099('\u0000', -115);
            this.field8134 = true;
        } else {
            super.field4357.method2788(770, 34168, false, 0);
        }
        if (arg1 == -82) {
            ++field8139;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILvl;B)V")
    public static final void method3312(int arg0, int arg1, int arg2, class13 arg3, byte arg4) {
        ++field8130;
        class738 var5 = arg3.method94((byte) -122);
        if (arg4 < 70) {
            field8144 = -108;
        }
        int var6 = -arg3.field256.field2032 + arg3.field194 & 16383;
        if (arg2 != -1) {
            if (arg3.field221 != -1 && (~var6 <= -10241 || ~var6 >= -2049)) {
                int var7 = class482.field6551[arg1] + -arg3.field256.field2032 & 16383;
                arg3.field239 = false;
                if (arg2 == 2 && ~var5.field10285 != 0) {
                    if (var7 > 2048 && ~var7 >= -6145 && ~var5.field10268 != 0) {
                        arg3.field215 = var5.field10268;
                    } else if (var7 >= 10240 && var7 < 14336 && var5.field10267 != -1) {
                        arg3.field215 = var5.field10267;
                    } else if (~var7 < -6145 && var7 < 10240 && var5.field10286 != -1) {
                        arg3.field215 = var5.field10286;
                    } else {
                        arg3.field215 = var5.field10285;
                    }
                } else if (~arg2 == -1 && ~var5.field10276 != 0) {
                    if (~var7 < -2049 && var7 <= 6144 && var5.field10251 != -1) {
                        arg3.field215 = var5.field10251;
                    } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field10279 != 0) {
                        arg3.field215 = var5.field10279;
                    } else if (var7 > 6144 && var7 < 10240 && ~var5.field10259 != 0) {
                        arg3.field215 = var5.field10259;
                    } else {
                        arg3.field215 = var5.field10276;
                    }
                } else if (var7 > 2048 && ~var7 >= -6145 && var5.field10243 != -1) {
                    arg3.field215 = var5.field10243;
                } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field10284 != -1) {
                    arg3.field215 = var5.field10284;
                } else if (var7 > 6144 && var7 < 10240 && ~var5.field10282 != 0) {
                    arg3.field215 = var5.field10282;
                } else {
                    arg3.field215 = var5.field10256;
                }
            } else if (~var6 == -1 && ~arg3.field181 >= -26) {
                if (~arg2 == -3 && var5.field10285 != -1) {
                    arg3.field215 = var5.field10285;
                } else if (arg2 == 0 && ~var5.field10276 != 0) {
                    arg3.field215 = var5.field10276;
                } else {
                    arg3.field215 = var5.field10256;
                }
                arg3.field239 = false;
            } else {
                arg3.field239 = false;
                if (arg2 == 2 && ~var5.field10285 != 0) {
                    if (~arg0 > -1 && var5.field10257 != -1) {
                        arg3.field215 = var5.field10257;
                    } else if (~arg0 < -1 && ~var5.field10266 != 0) {
                        arg3.field215 = var5.field10266;
                    } else {
                        arg3.field215 = var5.field10285;
                    }
                } else if (~arg2 == -1 && var5.field10276 != -1) {
                    if (arg0 < 0 && var5.field10294 != -1) {
                        arg3.field215 = var5.field10294;
                    } else if (~arg0 < -1 && var5.field10289 != -1) {
                        arg3.field215 = var5.field10289;
                    } else {
                        arg3.field215 = var5.field10276;
                    }
                } else if (arg0 < 0 && var5.field10246 != -1) {
                    arg3.field215 = var5.field10246;
                } else if (arg0 > 0 && ~var5.field10280 != 0) {
                    arg3.field215 = var5.field10280;
                } else {
                    arg3.field215 = var5.field10256;
                }
            }
        } else if (~var6 == -1 && arg3.field181 <= 25) {
            if (!arg3.field239 || !var5.method4111(arg3.field215, (byte) 38)) {
                arg3.field215 = var5.method4108(-8322);
                arg3.field239 = arg3.field215 != -1;
            }
        } else {
            if (~arg0 > -1 && var5.field10264 != -1) {
                arg3.field215 = var5.field10264;
                arg3.field239 = false;
            } else if (~arg0 < -1 && ~var5.field10250 != 0) {
                arg3.field215 = var5.field10250;
            } else {
                arg3.field215 = var5.field10256;
            }
            arg3.field239 = false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lbi;)V")
    public class582(class483 arg0) {
        super(arg0);
        if (arg0.field6914) {
            this.field8127 = arg0.field6890 < 3;
            int var2 = this.field8127 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var13;
                            } else if (~var14 != -3) {
                                if (~var14 == -4) {
                                    var15 = -var12;
                                } else if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
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
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field8143 = new class193[3];
            this.field8143[0] = new class193(super.field4357, 6406, 64, false, var4, 6406);
            this.field8143[1] = new class193(super.field4357, 6406, 64, false, var5, 6406);
            this.field8143[2] = new class193(super.field4357, 6406, 64, false, var3, 6406);
            this.method3319((byte) 87);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLrl;I)V")
    public static final void method3313(boolean arg0, class724 arg1, int arg2) {
        ++field8138;
        if (~class159.field2181 > -401) {
            if (class380.field4847 == arg1) {
                if (class8.field103 && ~(16 & class565.field7935) != -1) {
                    class92.method740(0L, (long) arg1.field189, false, true, class731.field10176 + " -> <col=ffffff>" + class454.field6040.method2547(-67, class243.field3143), -1, class702.field9767, 20, 0, class551.field7704, false, 0, false);
                    ++class640.field8887;
                }
            } else {
                String var3;
                if (~arg1.field10076 != -1) {
                    if (~arg1.field10076 != 0) {
                        var3 = arg1.method4038(false, true) + " (" + class454.field6032.method2547(-79, class243.field3143) + arg1.field10076 + ")";
                    } else {
                        var3 = arg1.method4038(false, true);
                    }
                } else {
                    boolean var4 = true;
                    if (class380.field4847.field10077 != -1 && arg1.field10077 != -1) {
                        int var5 = ~arg1.field10077 >= ~class380.field4847.field10077 ? arg1.field10077 : class380.field4847.field10077;
                        int var6 = -arg1.field10070 + class380.field4847.field10070;
                        if (~var6 > -1) {
                            var6 = -var6;
                        }
                        if (~var6 < ~var5) {
                            var4 = false;
                        }
                    }
                    String var7 = class722.field10048 == class293.field3867 ? class454.field6033.method2547(-69, class243.field3143) : class454.field6031.method2547(-96, class243.field3143);
                    if (~arg1.field10096 < ~arg1.field10070) {
                        var3 = arg1.method4038(false, true) + (var4 ? class448.method2528(class380.field4847.field10070, arg1.field10070, (byte) 127) : "<col=ffffff>") + " (" + var7 + arg1.field10070 + "+" + (-arg1.field10070 + arg1.field10096) + ")";
                    } else {
                        var3 = arg1.method4038(false, true) + (!var4 ? "<col=ffffff>" : class448.method2528(class380.field4847.field10070, arg1.field10070, (byte) 127)) + " (" + var7 + arg1.field10070 + ")";
                    }
                }
                int var8 = 33 % ((arg2 - -6) / 63);
                if (class8.field103 && !arg0 && ~(class565.field7935 & 8) != -1) {
                    ++class473.field6365;
                    class92.method740((long) arg1.field189, (long) arg1.field189, false, true, class731.field10176 + " -> <col=ffffff>" + var3, -1, class702.field9767, 22, 0, class551.field7704, false, 0, false);
                }
                if (!arg0) {
                    for (int var9 = 7; ~var9 <= -1; --var9) {
                        if (class284.field3581[var9] != null) {
                            short var10 = 0;
                            if (class293.field3867 == class211.field2791 && class284.field3581[var9].equalsIgnoreCase(class454.field6026.method2547(-60, class243.field3143))) {
                                if (~arg1.field10070 < ~class380.field4847.field10070) {
                                    var10 = 2000;
                                }
                                if (class380.field4847.field10094 != 0 && arg1.field10094 != 0) {
                                    if (class380.field4847.field10094 == arg1.field10094) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (class594.field8302[var9]) {
                                var10 = 2000;
                            }
                            short var11 = (short) (class118.field1733[var9] + var10);
                            int var12 = class459.field6097[var9] != -1 ? class459.field6097[var9] : class75.field1065;
                            ++class42.field625;
                            class92.method740((long) arg1.field189, (long) arg1.field189, false, true, "<col=ffffff>" + var3, -1, var12, var11, 0, class284.field3581[var9], false, 0, false);
                        }
                    }
                } else {
                    class92.method740(0L, (long) arg1.field189, true, false, "", 0, -1, -1, 0, "<col=cccccc>" + var3, false, 0, false);
                }
                if (!arg0) {
                    for (class277 var13 = (class277) class343.field4334.method3672(-1); var13 != null; var13 = (class277) class343.field4334.method3662(-1)) {
                        if (~var13.field3478 == -14) {
                            var13.field3482 = "<col=ffffff>" + var3;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public static final void method3314(int arg0) {
        if (class665.field9359 <= 0) {
            class482.field6539 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class404.field5114.length; ++var2) {
                if (class404.field5114[var2].indexOf("--> ") != -1) {
                    ++var1;
                    if (class665.field9359 == var1) {
                        class482.field6539 = class404.field5114[var2].substring(class404.field5114[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        if (arg0 != 10749) {
            method3318(false);
        }
        ++field8140;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)V")
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field8141;
        if (this.field8134) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(92, this.field8143[arg2 + -1]);
            super.field4357.method2847(0, false);
        }
        if (!arg0) {
            this.field8143 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lii;Z)Z")
    public static final boolean method3315(class556 arg0, boolean arg1) {
        boolean var2 = class395.field5009 == class195.field2669;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method80(-1);
        if (arg0.field7734 >= 0 && arg0.field7746 >= 0 && arg0.field7741 < class289.field3784 && arg0.field7744 < class463.field6223) {
            short var6 = 0;
            for (int var7 = arg0.field7734; var7 <= arg0.field7741; ++var7) {
                for (int var11 = arg0.field7746; var11 <= arg0.field7744; ++var11) {
                    class14 var12 = class700.method3936(arg0.field5796, var7, var11);
                    if (var12 != null) {
                        class621 var13 = class290.method1740(-15180, arg0);
                        class621 var14 = var12.field289;
                        if (var14 == null) {
                            var12.field289 = var13;
                        } else {
                            while (var14.field8560 != null) {
                                var14 = var14.field8560;
                            }
                            var14.field8560 = var13;
                        }
                        if (var2 && (class498.field7019[var7][var11] & -16777216) != 0) {
                            var3 = class498.field7019[var7][var11];
                            var4 = class197.field2682[var7][var11];
                            var5 = class223.field2984[var7][var11];
                        }
                        if (!arg1 && var12.field279 != null && var12.field279.field1737 > var6) {
                            var6 = var12.field279.field1737;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field7734; var8 <= arg0.field7741; ++var8) {
                    for (int var9 = arg0.field7746; var9 <= arg0.field7744; ++var9) {
                        if ((class498.field7019[var8][var9] & -16777216) == 0) {
                            class498.field7019[var8][var9] = var3;
                            class197.field2682[var8][var9] = var4;
                            class223.field2984[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class541.field7494[class551.field7698++] = arg0;
            } else {
                int var10 = class395.field5009 == class195.field2669 ? 1 : 0;
                if (arg0.method83((byte) -69)) {
                    if (arg0.method85(-111)) {
                        arg0.field5791 = class72.field1005[var10];
                        class72.field1005[var10] = arg0;
                    } else {
                        arg0.field5791 = class730.field10164[var10];
                        class730.field10164[var10] = arg0;
                        class563.field7924 = true;
                    }
                } else {
                    arg0.field5791 = class259.field3278[var10];
                    class259.field3278[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field5800 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
    public static final void method3316(byte arg0) {
        ++field8145;
        int var1 = class748.field10451.field10393.method1631((byte) 121);
        if (var1 != 0) {
            if (var1 == 1) {
                class321.method1885((byte) 0, 16711680);
                class587.method3335(22531, 512);
                if (class305.field4001 != null) {
                    class453.method2544(0);
                }
            } else {
                class321.method1885((byte) (class762.field10618 - 4 & 255), 16711680);
                class587.method3335(22531, 2);
            }
        } else {
            class232.field3052 = null;
            class587.method3335(22531, 0);
        }
        class445.field5923 = class472.field6329;
        if (arg0 != -94) {
            method3316((byte) -26);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
    public final void method40(boolean arg0, int arg1) {
        super.field4357.method2799(arg1 ^ -43362, 8448, 7681);
        if (arg1 == 50560) {
            ++field8131;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        if (arg0 != 50560) {
            this.method37(true, -44, -95);
        }
        ++field8132;
        return true;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILcj;)V")
    public final void method36(int arg0, int arg1, class695 arg2) {
        super.field4357.method2850(85, arg2);
        ++field8136;
        super.field4357.method2800(arg1, 127);
        if (arg0 != 50560) {
            field8137 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method3317(boolean arg0) {
        field8133 = null;
        if (arg0) {
            method3315((class556) null, true);
        }
        field8137 = null;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
    public static final void method3318(boolean arg0) {
        if (class7.field70 != -1) {
            class108.method868(-110, class7.field70, -1, -1, false);
            class7.field70 = -1;
        }
        ++field8135;
        if (!arg0) {
            field8144 = -16;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
    private final void method3319(byte arg0) {
        this.field8142 = new class363(super.field4357, 2);
        ++field8128;
        this.field8142.method2097(0, -91);
        super.field4357.method2847(1, false);
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
        if (this.field8127) {
            super.field4357.method2799(-27874, 260, 7681);
            super.field4357.method2775(5890, (byte) -88, 770, 0);
            super.field4357.method2788(770, 34167, false, 0);
        } else {
            super.field4357.method2799(-27874, 7681, 8448);
            super.field4357.method2775(34168, (byte) -88, 768, 0);
            super.field4357.method2847(2, false);
            super.field4357.method2799(-27874, 260, 7681);
            super.field4357.method2775(34168, (byte) -88, 768, 0);
            super.field4357.method2775(34168, (byte) -88, 770, 1);
            super.field4357.method2788(770, 34167, false, 0);
        }
        super.field4357.method2847(0, false);
        this.field8142.method2100(57);
        this.field8142.method2097(1, -81);
        if (arg0 > 80) {
            super.field4357.method2847(1, false);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field8127) {
                super.field4357.method2799(-27874, 8448, 8448);
                super.field4357.method2775(5890, (byte) -88, 768, 0);
                super.field4357.method2847(2, false);
                super.field4357.method2799(-27874, 8448, 8448);
                super.field4357.method2775(5890, (byte) -88, 768, 0);
                super.field4357.method2775(34168, (byte) -88, 768, 1);
                super.field4357.method2788(770, 5890, false, 0);
            } else {
                super.field4357.method2799(-27874, 8448, 8448);
                super.field4357.method2775(5890, (byte) -88, 768, 0);
                super.field4357.method2788(770, 5890, false, 0);
            }
            super.field4357.method2847(0, false);
            this.field8142.method2100(87);
        }
    }
}
