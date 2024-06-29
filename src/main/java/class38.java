import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class38 extends class209 {

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "Z")
    private boolean field581;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "[Lsk;")
    private class415[] field571;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "Lcn;")
    private class21 field583;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLjq;Lqa;II)V")
    public static final void method222(boolean arg0, class447 arg1, class167 arg2, int arg3, int arg4) {
        ++field573;
        if (arg0) {
            class594 var5 = arg1.method2608(-104, arg2);
            if (var5 != null) {
                arg2.method977(arg3, arg4, arg1.field6330 + arg3, arg1.field6218 + arg4);
                if (~class598.field8638 != -3 && class598.field8638 != 5 && class179.field2313 != null) {
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    if (class621.field8952 != 4) {
                        var6 = class147.field1899.field6362;
                        var7 = 16383 & (int) (-class521.field7250) + class374.field5212;
                        var8 = class147.field1899.field6368;
                        var9 = -(class54.field728 * 16) + 4096;
                    } else {
                        var7 = (int) (-class521.field7250) & 16383;
                        var6 = class626.field9074;
                        var8 = class20.field292;
                        var9 = 4096;
                    }
                    int var10 = var6 / 128 + -((class139.field1760 + -104) * 2) + 48;
                    int var11 = 48 - ((class369.field5135 + -104) * 2 + var8 / 128 + -(class369.field5135 * 4));
                    class179.field2313.method624((float) arg1.field6330 / 2.0F + (float) arg3, (float) arg1.field6218 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var7 << 2, var5, arg3, arg4);
                    for (class147 var12 = (class147) class344.field4774.method3188((byte) -100); var12 != null; var12 = (class147) class344.field4774.method3182((byte) -80)) {
                        int var58 = var12.field1902;
                        int var59 = ((268428566 & class438.field5988.field1374[var58]) >> 14) + -class525.field7310;
                        int var60 = (class438.field5988.field1374[var58] & 16383) + -class58.field786;
                        int var61 = var59 * 4 - (var6 / 128 + -2);
                        int var62 = var60 * 4 - -2 + -(var8 / 128);
                        class292.method1793(class438.field5988.field1373[var58], arg1, var61, -24929, var5, arg2, arg4, arg3, var62);
                    }
                    for (int var13 = 0; var13 < class541.field7568; ++var13) {
                        int var55 = class130.field1607[var13] * 4 + 2 - var6 / 128;
                        int var56 = class207.field2694[var13] * 4 + -(var8 / 128) - -2;
                        class137 var57 = class626.field9084.method1093(0, class199.field2604[var13]);
                        if (var57.field1719 != null) {
                            var57 = var57.method722(class257.field3191, -1);
                            if (var57 == null || var57.field1699 == -1) {
                                continue;
                            }
                        }
                        class292.method1793(var57.field1699, arg1, var55, -24929, var5, arg2, arg4, arg3, var56);
                    }
                    for (class247 var14 = (class247) class241.field3066.method3473(-27089); var14 != null; var14 = (class247) class241.field3066.method3478((byte) 5)) {
                        int var50 = (int) (3L & var14.field1401 >> 28);
                        if (~class308.field3942 == ~var50) {
                            int var51 = (int) (var14.field1401 & 16383L) + -class525.field7310;
                            int var52 = (int) (16383L & var14.field1401 >> 14) - class58.field786;
                            int var53 = var51 * 4 + 2 + -(var6 / 128);
                            int var54 = var52 * 4 + -(var8 / 128) + 2;
                            class310.method1865(arg4, 122, var53, var54, var5, arg3, class526.field7325[0], arg1);
                        }
                    }
                    for (int var15 = 0; ~var15 > ~class551.field7652; ++var15) {
                        class480 var45 = (class480) class131.field1619.method3476((long) class286.field3739[var15], (byte) 28);
                        if (var45 != null) {
                            class585 var46 = var45.field6729;
                            if (var46.method3375(54) && class147.field1899.field6358 == var46.field6358) {
                                class626 var47 = var46.field8478;
                                if (var47 != null && var47.field9085 != null) {
                                    var47 = var47.method3607(false, class257.field3191);
                                }
                                if (var47 != null && var47.field9082 && var47.field9078) {
                                    int var48 = var46.field6362 / 128 + -(var6 / 128);
                                    int var49 = var46.field6368 / 128 + -(var8 / 128);
                                    if (~var47.field9056 == 0) {
                                        class310.method1865(arg4, 116, var48, var49, var5, arg3, class526.field7325[1], arg1);
                                    } else {
                                        class292.method1793(var47.field9056, arg1, var48, -24929, var5, arg2, arg4, arg3, var49);
                                    }
                                }
                            }
                        }
                    }
                    int var16 = class512.field7133;
                    int[] var17 = class514.field7144;
                    for (int var18 = 0; ~var18 > ~var16; ++var18) {
                        class20 var37 = class364.field5092[var17[var18]];
                        if (var37 != null && var37.method114(-124) && class147.field1899 != var37 && ~class147.field1899.field6358 == ~var37.field6358) {
                            int var38 = var37.field6362 / 128 + -(var6 / 128);
                            int var39 = var37.field6368 / 128 - var8 / 128;
                            boolean var40 = false;
                            for (int var41 = 0; ~var41 > ~class447.field6284; ++var41) {
                                if (var37.field257.equals(class395.field5457[var41]) && ~class337.field4722[var41] != -1) {
                                    var40 = true;
                                    break;
                                }
                            }
                            boolean var42 = false;
                            for (int var43 = 0; ~class323.field4445 < ~var43; ++var43) {
                                if (var37.field257.equals(class633.field9207[var43].field7328)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            boolean var44 = false;
                            if (~class147.field1899.field252 != -1 && ~var37.field252 != -1 && class147.field1899.field252 == var37.field252) {
                                var44 = true;
                            }
                            if (!var37.field271) {
                                if (!var40) {
                                    if (!var42) {
                                        if (!var44) {
                                            class310.method1865(arg4, 121, var38, var39, var5, arg3, class526.field7325[2], arg1);
                                        } else {
                                            class310.method1865(arg4, 126, var38, var39, var5, arg3, class526.field7325[4], arg1);
                                        }
                                    } else {
                                        class310.method1865(arg4, 122, var38, var39, var5, arg3, class526.field7325[5], arg1);
                                    }
                                } else {
                                    class310.method1865(arg4, 117, var38, var39, var5, arg3, class526.field7325[3], arg1);
                                }
                            } else {
                                class310.method1865(arg4, 116, var38, var39, var5, arg3, class526.field7325[6], arg1);
                            }
                        }
                    }
                    class617[] var19 = class610.field8771;
                    for (int var20 = 0; var19.length > var20; ++var20) {
                        class617 var23 = var19[var20];
                        if (var23 != null && ~var23.field8891 != -1 && class7.field61 % 20 < 10) {
                            if (var23.field8891 == 1) {
                                class480 var24 = (class480) class131.field1619.method3476((long) var23.field8889, (byte) 28);
                                if (var24 != null) {
                                    class585 var25 = var24.field6729;
                                    int var26 = var25.field6362 / 128 + -(var6 / 128);
                                    int var27 = var25.field6368 / 128 + -(var8 / 128);
                                    class621.method3564(var26, arg4, arg1, var5, var23.field8888, var27, 256, 360000L, arg3);
                                }
                            }
                            if (var23.field8891 == 2) {
                                int var28 = var23.field8884 / 128 - var6 / 128;
                                int var29 = var23.field8890 / 128 + -(var8 / 128);
                                long var30 = (long) (var23.field8883 << 7);
                                long var32 = var30 * var30;
                                class621.method3564(var28, arg4, arg1, var5, var23.field8888, var29, 256, var32, arg3);
                            }
                            if (var23.field8891 == 10 && ~var23.field8889 <= -1 && var23.field8889 < class364.field5092.length) {
                                class20 var34 = class364.field5092[var23.field8889];
                                if (var34 != null) {
                                    int var35 = var34.field6362 / 128 + -(var6 / 128);
                                    int var36 = var34.field6368 / 128 - var8 / 128;
                                    class621.method3564(var35, arg4, arg1, var5, var23.field8888, var36, 256, 360000L, arg3);
                                }
                            }
                        }
                    }
                    if (~class621.field8952 != -5) {
                        if (class281.field3673 != 0) {
                            int var21 = -(var6 / 128) + 2 + class281.field3673 * 4 + (class147.field1899.method104((byte) -92) - 1) * 2;
                            int var22 = class64.field868 * 4 - -2 - var8 / 128 - -(2 * (-1 + class147.field1899.method104((byte) -92)));
                            class310.method1865(arg4, 122, var21, var22, var5, arg3, class644.field9337[class457.field6527 ? 1 : 0], arg1);
                        }
                        arg2.method974(-1, 1, 3, arg1.field6330 / 2 + arg3 + -1, 3, arg1.field6218 / 2 + arg4 + -1);
                    }
                } else {
                    arg2.method930(-16777216, var5, arg3, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field580;
        if (!this.field572) {
            super.field2710.method1947(34162, 5890, 0, 770);
        } else {
            if (!this.field581) {
                super.field2710.method1966(arg0 ^ -3001, 2);
                super.field2710.method1884((class148) null, -2);
            }
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, -2);
            super.field2710.method1966(3000, 0);
            this.field583.method118('\u0001', 0);
            this.field572 = false;
        }
        super.field2710.method1887(-56, 8448, 8448);
        if (arg0 != -1) {
            this.method45(11, -68, -77);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        if (arg1 < 88) {
            this.method225(false);
        }
        ++field578;
        if (this.field583 != null && arg0) {
            if (!this.field581) {
                super.field2710.method1966(3000, 2);
                super.field2710.method1884(super.field2710.field4328, -2);
                super.field2710.method1966(3000, 0);
            }
            this.field583.method118('\u0000', 0);
            this.field572 = true;
        } else {
            super.field2710.method1947(34162, 34168, 0, 770);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        ++field575;
        super.field2710.method1887(123, 8448, 7681);
        if (arg1 <= 122) {
            this.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            this.field583 = null;
        }
        ++field574;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IC)Z")
    public static final boolean method223(int arg0, char arg1) {
        ++field569;
        if (arg0 != 2) {
            method224(57, 35);
        }
        return ~arg1 == -161 || ~arg1 == -33 || arg1 == '_' || ~arg1 == -46;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Lvk;")
    public static final class414 method224(int arg0, int arg1) {
        ++field579;
        if (arg0 <= 102) {
            method223(70, 'D');
        }
        class414[] var2 = class228.method1445(0);
        for (int var3 = 0; var2.length > var3; ++var3) {
            class414 var4 = var2[var3];
            if (~var4.field5693 == ~arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
    private final void method225(boolean arg0) {
        ++field570;
        this.field583 = new class21(super.field2710, 2);
        this.field583.method120((byte) -125, 0);
        super.field2710.method1966(3000, 1);
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
        if (!this.field581) {
            super.field2710.method1887(-56, 7681, 8448);
            super.field2710.method1933(-114, 768, 0, 34168);
            super.field2710.method1966(3000, 2);
            super.field2710.method1887(66, 260, 7681);
            super.field2710.method1933(-113, 768, 0, 34168);
            super.field2710.method1933(-91, 770, 1, 34168);
            super.field2710.method1947(34162, 34167, 0, 770);
        } else {
            super.field2710.method1887(-75, 260, 7681);
            super.field2710.method1933(-93, 770, 0, 5890);
            super.field2710.method1947(34162, 34167, 0, 770);
        }
        super.field2710.method1966(3000, 0);
        this.field583.method123(4864);
        this.field583.method120((byte) 116, 1);
        super.field2710.method1966(3000, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        if (arg0) {
            this.field571 = null;
        }
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field581) {
            super.field2710.method1887(-93, 8448, 8448);
            super.field2710.method1933(-92, 768, 0, 5890);
            super.field2710.method1947(34162, 5890, 0, 770);
        } else {
            super.field2710.method1887(-55, 8448, 8448);
            super.field2710.method1933(-73, 768, 0, 5890);
            super.field2710.method1966(3000, 2);
            super.field2710.method1887(80, 8448, 8448);
            super.field2710.method1933(-106, 768, 0, 5890);
            super.field2710.method1933(-124, 768, 1, 34168);
            super.field2710.method1947(34162, 5890, 0, 770);
        }
        super.field2710.method1966(3000, 0);
        this.field583.method123(4864);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Luq;)V")
    public class38(class313 arg0) {
        super(arg0);
        if (arg0.field4245) {
            this.field581 = arg0.field4237 < 3;
            int var2 = this.field581 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var13;
                            } else if (~var14 != -4) {
                                if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var13;
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
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
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
            this.field571 = new class415[3];
            this.field571[0] = new class415(super.field2710, 6406, 64, false, var4, 6406);
            this.field571[1] = new class415(super.field2710, 6406, 64, false, var5, 6406);
            this.field571[2] = new class415(super.field2710, 6406, 64, false, var3, 6406);
            this.method225(false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLjc;B)V")
    public static final void method226(boolean arg0, class585 arg1, byte arg2) {
        ++field576;
        if (class50.field673 < 400) {
            class626 var3 = arg1.field8478;
            if (var3.field9085 != null) {
                var3 = var3.method3607(false, class257.field3191);
                if (var3 == null) {
                    return;
                }
            }
            if (arg2 != -59) {
                method222(true, (class447) null, (class167) null, 57, -100);
            }
            if (var3.field9078) {
                String var4 = var3.field9119;
                if (~var3.field9072 != -1) {
                    String var5 = class532.field7433 != class26.field453 ? class428.field5841.method2157(class245.field3103, 4074) : class601.field8693.method2157(class245.field3103, 4074);
                    var4 = var4 + class552.method3098(arg2 ^ -87, class147.field1899.field254, var3.field9072) + " (" + var5 + var3.field9072 + ")";
                }
                if (class280.field3669 && !arg0) {
                    class360 var6 = class354.field4957 == -1 ? null : class132.field1621.method151(class354.field4957, -91);
                    if (~(class59.field809 & 2) != -1 && (var6 == null || var3.method3617(arg2 ^ -15958, class354.field4957, var6.field5020) != var6.field5020)) {
                        class431.method2520((long) arg1.field366, 0, class126.field1571 + " -> <col=ffff00>" + var4, 0, 8, 2, class88.field1171, -1, true, false, class497.field6936);
                        ++class492.field6876;
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field9103;
                    if (class618.field8919) {
                        var7 = class52.method283(var7, arg2 ^ 58);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (~var3.field9061 == -1 || !var7[var8].equalsIgnoreCase(class123.field1536.method2157(class245.field3103, 4074)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 20;
                                }
                                int var10 = class261.field3264;
                                if (var8 == 1) {
                                    var9 = 9;
                                }
                                if (~var8 == -3) {
                                    var9 = 16;
                                }
                                if (var8 == 3) {
                                    var9 = 21;
                                }
                                if (var3.field9052 == var8) {
                                    var10 = var3.field9070;
                                }
                                if (var8 == 4) {
                                    var9 = 6;
                                }
                                if (var3.field9066 == var8) {
                                    var10 = var3.field9083;
                                }
                                ++class566.field7921;
                                class431.method2520((long) arg1.field366, 0, "<col=ffff00>" + var4, 0, var9, 2, var7[var8], -1, true, false, !var7[var8].equalsIgnoreCase(class123.field1536.method2157(class245.field3103, 4074)) ? var10 : var3.field9095);
                            }
                        }
                    }
                    if (~var3.field9061 == -2 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class123.field1536.method2157(class245.field3103, 4074))) {
                                short var12 = 0;
                                if (var3.field9072 > class147.field1899.field254) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 20;
                                }
                                if (~var11 == -2) {
                                    var13 = 9;
                                }
                                if (var11 == 2) {
                                    var13 = 16;
                                }
                                if (~var11 == -4) {
                                    var13 = 21;
                                }
                                if (~var11 == -5) {
                                    var13 = 6;
                                }
                                if (var13 != 0) {
                                    var13 += var12;
                                }
                                class431.method2520((long) arg1.field366, 0, "<col=ffff00>" + var4, 0, var13, 2, var7[var11], -1, true, false, var3.field9095);
                                ++class368.field5128;
                            }
                        }
                    }
                }
                ++class301.field3917;
                class431.method2520((long) arg1.field366, 0, "<col=ffff00>" + var4, 0, 1006, 2, class527.field7331.method2157(class245.field3103, 4074), -1, true, arg0, class45.field645);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        super.field2710.method1884(arg0, -2);
        ++field577;
        if (!arg2) {
            this.method42(false);
        }
        super.field2710.method1909(-102, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (this.field572) {
            super.field2710.method1966(3000, 1);
            super.field2710.method1884(this.field571[arg0 + -1], -2);
            super.field2710.method1966(3000, 0);
        }
        ++field582;
        if (arg2 >= -75) {
            this.field581 = true;
        }
    }
}
