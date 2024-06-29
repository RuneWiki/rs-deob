import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class98 extends class165 {

    @OriginalMember(owner = "client!uaa", name = "S", descriptor = "Lej;")
    public static class104 field1501 = new class104("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!uaa", name = "V", descriptor = "[[I")
    public static int[][] field1504;

    @OriginalMember(owner = "client!uaa", name = "X", descriptor = "[I")
    public static int[] field1506;

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!uaa", name = "O", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!uaa", name = "P", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!uaa", name = "Q", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!uaa", name = "R", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!uaa", name = "U", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "Laea;")
    private class45 field1491;

    @OriginalMember(owner = "client!uaa", name = "W", descriptor = "Laea;")
    private class45 field1505;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "Liu;")
    private class496 field1487;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "Liu;")
    private class496 field1488;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "Liu;")
    private class496 field1493;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "Liu;")
    private class496 field1494;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lob;")
    private class629 field1486;

    @OriginalMember(owner = "client!uaa", name = "M", descriptor = "Lob;")
    private class629 field1495;

    @OriginalMember(owner = "client!uaa", name = "T", descriptor = "[Lob;")
    private class629[] field1502;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lob;IILob;)V")
    public final void method693(class629 arg0, int arg1, int arg2, class629 arg3) {
        ++field1499;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1502 == null) {
            super.field2374.method3358(arg2 + 20790, arg0);
            super.field2374.method3350(-2438, this.field1505);
            this.field1505.method453(arg2 + -12003, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1487.field6934;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class323.field4361, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1484, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1484, (float) this.field1492);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1492);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field2374.method3350(-2438, this.field1491);
            int var7 = class327.method2020(-1594581311, this.field1484);
            int var8 = class327.method2020(-1594581311, this.field1492);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1491.method435(0, this.field1502[var9], 0);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (var9 != 0) {
                    super.field2374.method3358(arg2 + 20790, this.field1502[var9 + -1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field2374.method3358(32886, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1484, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1484, (float) this.field1492);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1492);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field2374.method3395(this.field1491, 14032);
            super.field2374.method3358(32886, this.field1502[var9 + -1]);
            super.field2374.method3350(-2438, this.field1505);
            this.field1505.method453(89, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1493.field6934;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class323.field4361, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1505.method453(arg2 + -11993, 1);
        super.field2374.method3358(arg2 ^ 44854, this.field1486);
        long var12 = this.field1488.field6934;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field1505.method453(arg2 + -11979, 0);
        super.field2374.method3358(arg2 ^ 44854, this.field1495);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        if (arg2 != 12096) {
            this.field1502 = null;
        }
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field2374.method3395(this.field1505, 14032);
        long var14 = this.field1494.field6934;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class58.field1048, class604.field8709, 0.0F);
        super.field2374.method3398(-69, 1);
        super.field2374.method3358(32886, this.field1486);
        super.field2374.method3398(arg2 ^ -12142, 0);
        super.field2374.method3358(32886, arg0);
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
    public final int method694(int arg0) {
        if (arg0 >= -124) {
            return -121;
        } else {
            ++field1500;
            return 1;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method695(String arg0, int arg1) {
        ++field1497;
        int var2 = arg0.length();
        if (arg1 != -10310) {
            field1504 = null;
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > 0 && var5 < 128 || ~var5 <= -161 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 == 8364) {
                var3[var4] = -128;
            } else if (~var5 == -8219) {
                var3[var4] = -126;
            } else if (~var5 == -403) {
                var3[var4] = -125;
            } else if (var5 == 8222) {
                var3[var4] = -124;
            } else if (~var5 != -8231) {
                if (~var5 != -8225) {
                    if (~var5 != -8226) {
                        if (~var5 != -711) {
                            if (var5 != 8240) {
                                if (var5 == 352) {
                                    var3[var4] = -118;
                                } else if (var5 == 8249) {
                                    var3[var4] = -117;
                                } else if (~var5 == -339) {
                                    var3[var4] = -116;
                                } else if (var5 != 381) {
                                    if (~var5 == -8217) {
                                        var3[var4] = -111;
                                    } else if (~var5 != -8218) {
                                        if (var5 != 8220) {
                                            if (var5 != 8221) {
                                                if (~var5 == -8227) {
                                                    var3[var4] = -107;
                                                } else if (~var5 == -8212) {
                                                    var3[var4] = -106;
                                                } else if (~var5 == -8213) {
                                                    var3[var4] = -105;
                                                } else if (var5 == 732) {
                                                    var3[var4] = -104;
                                                } else if (var5 != 8482) {
                                                    if (var5 == 353) {
                                                        var3[var4] = -102;
                                                    } else if (~var5 != -8251) {
                                                        if (~var5 == -340) {
                                                            var3[var4] = -100;
                                                        } else if (~var5 == -383) {
                                                            var3[var4] = -98;
                                                        } else if (~var5 == -377) {
                                                            var3[var4] = -97;
                                                        } else {
                                                            var3[var4] = 63;
                                                        }
                                                    } else {
                                                        var3[var4] = -101;
                                                    }
                                                } else {
                                                    var3[var4] = -103;
                                                }
                                            } else {
                                                var3[var4] = -108;
                                            }
                                        } else {
                                            var3[var4] = -109;
                                        }
                                    } else {
                                        var3[var4] = -110;
                                    }
                                } else {
                                    var3[var4] = -114;
                                }
                            } else {
                                var3[var4] = -119;
                            }
                        } else {
                            var3[var4] = -120;
                        }
                    } else {
                        var3[var4] = -121;
                    }
                } else {
                    var3[var4] = -122;
                }
            } else {
                var3[var4] = -123;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public final void method696(int arg0) {
        ++field1498;
        this.field1487 = null;
        this.field1486 = null;
        this.field1488 = null;
        if (arg0 != 27659) {
            method701(127);
        }
        this.field1491 = null;
        this.field1494 = null;
        this.field1505 = null;
        this.field1502 = null;
        this.field1493 = null;
        this.field1495 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        ++field1503;
        if (arg0 != -26304) {
            this.field1502 = null;
        }
        return super.field2374.field8306 && super.field2374.field8297 && super.field2374.field8285;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
    public final void method698(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB((long) arg1);
        ++field1480;
        super.field2374.method3398(-44, 1);
        super.field2374.method3358(arg1 ^ 32886, (class418) null);
        super.field2374.method3398(-70, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBIIILld;IIIII)Z")
    public static final boolean method699(int arg0, byte arg1, int arg2, int arg3, int arg4, class145 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1482;
        int var11 = arg6;
        int var12 = arg7;
        int var13 = -83 / ((arg1 - 18) / 53);
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg6 - var14;
        class418.field5895[var14][var15] = 99;
        int var17 = -var15 + arg7;
        class546.field7558[var14][var15] = 0;
        byte var18 = 0;
        class335.field4466[var18] = arg6;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class3.field37[var10001] = arg7;
        int[][] var20 = arg5.field2253;
        while (var27 != var19) {
            var12 = class3.field37[var19];
            var11 = class335.field4466[var19];
            var19 = 4095 & var19 + 1;
            int var21 = -var17 + var12;
            int var22 = -var16 + var11;
            int var23 = -arg5.field2243 + var11;
            int var24 = -arg5.field2244 + var12;
            if (arg9 != -4) {
                if (arg9 != -3) {
                    if (~arg9 != 1) {
                        if (~arg9 != 0) {
                            if (~arg9 != -1 && ~arg9 != -2 && arg9 != 2 && ~arg9 != -4 && arg9 != 9) {
                                if (arg5.method963(671744, var12, arg9, arg3, 2, arg2, var11, arg8)) {
                                    class29.field485 = var12;
                                    class640.field9315 = var11;
                                    return true;
                                }
                            } else if (arg5.method957(arg3, arg8, var11, arg2, false, arg9, var12, 2)) {
                                class640.field9315 = var11;
                                class29.field485 = var12;
                                return true;
                            }
                        } else if (arg5.method965(arg3, var11, arg8, (byte) 38, arg0, 2, arg10, arg4, var12)) {
                            class29.field485 = var12;
                            class640.field9315 = var11;
                            return true;
                        }
                    } else if (arg5.method969(2, arg4, (byte) 107, arg8, var11, var12, 2, arg3, arg0, arg10)) {
                        class29.field485 = var12;
                        class640.field9315 = var11;
                        return true;
                    }
                } else if (class120.method839(var11, arg0, (byte) -12, var12, 2, arg8, arg10, 2, arg3)) {
                    class29.field485 = var12;
                    class640.field9315 = var11;
                    return true;
                }
            } else if (~arg8 == ~var11 && arg3 == var12) {
                class29.field485 = var12;
                class640.field9315 = var11;
                return true;
            }
            int var26 = class546.field7558[var22][var21] + 1;
            if (var22 > 0 && class418.field5895[var22 + -1][var21] == 0 && (1134821376 & var20[var23 - 1][var24]) == 0 && ~(var20[var23 + -1][var24 - -1] & 1310982144) == -1) {
                class335.field4466[var27] = var11 + -1;
                class3.field37[var27] = var12;
                class418.field5895[var22 + -1][var21] = 2;
                var27 = 4095 & var27 + 1;
                class546.field7558[var22 + -1][var21] = var26;
            }
            if (~var22 > -127 && class418.field5895[var22 + 1][var21] == 0 && (var20[var23 + 2][var24] & 1625554944) == 0 && (2015625216 & var20[var23 + 2][var24 - -1]) == 0) {
                class335.field4466[var27] = var11 + 1;
                class3.field37[var27] = var12;
                var27 = 4095 & var27 - -1;
                class418.field5895[var22 + 1][var21] = 8;
                class546.field7558[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class418.field5895[var22][var21 + -1] == 0 && (var20[var23][var24 + -1] & 1134821376) == 0 && ~(1625554944 & var20[var23 + 1][var24 + -1]) == -1) {
                class335.field4466[var27] = var11;
                class3.field37[var27] = var12 + -1;
                class418.field5895[var22][var21 + -1] = 1;
                var27 = 4095 & var27 + 1;
                class546.field7558[var22][var21 - 1] = var26;
            }
            if (~var21 > -127 && class418.field5895[var22][var21 + 1] == 0 && ~(var20[var23][var24 - -2] & 1310982144) == -1 && (var20[var23 + 1][var24 + 2] & 2015625216) == 0) {
                class335.field4466[var27] = var11;
                class3.field37[var27] = var12 + 1;
                var27 = 4095 & var27 + 1;
                class418.field5895[var22][var21 - -1] = 4;
                class546.field7558[var22][var21 - -1] = var26;
            }
            if (var22 > 0 && var21 > 0 && ~class418.field5895[var22 + -1][var21 - 1] == -1 && ~(1336147968 & var20[var23 + -1][var24]) == -1 && ~(var20[var23 - 1][var24 + -1] & 1134821376) == -1 && ~(var20[var23][var24 - 1] & 1675886592) == -1) {
                class335.field4466[var27] = var11 + -1;
                class3.field37[var27] = var12 + -1;
                var27 = var27 + 1 & 4095;
                class418.field5895[var22 - 1][var21 - 1] = 3;
                class546.field7558[var22 + -1][var21 + -1] = var26;
            }
            if (var22 < 126 && ~var21 < -1 && ~class418.field5895[var22 + 1][var21 + -1] == -1 && ~(var20[var23 + 1][var24 - 1] & 1675886592) == -1 && ~(var20[var23 + 2][var24 + -1] & 1625554944) == -1 && (2028208128 & var20[var23 + 2][var24]) == 0) {
                class335.field4466[var27] = var11 + 1;
                class3.field37[var27] = var12 + -1;
                class418.field5895[var22 + 1][var21 - 1] = 9;
                var27 = var27 - -1 & 4095;
                class546.field7558[var22 - -1][var21 + -1] = var26;
            }
            if (var22 > 0 && ~var21 > -127 && class418.field5895[var22 + -1][var21 + 1] == 0 && (1336147968 & var20[var23 + -1][var24 + 1]) == 0 && (var20[var23 + -1][var24 + 2] & 1310982144) == 0 && ~(2116288512 & var20[var23][var24 + 2]) == -1) {
                class335.field4466[var27] = var11 + -1;
                class3.field37[var27] = var12 + 1;
                var27 = var27 + 1 & 4095;
                class418.field5895[var22 + -1][var21 + 1] = 6;
                class546.field7558[var22 - 1][var21 + 1] = var26;
            }
            if (~var22 > -127 && ~var21 > -127 && ~class418.field5895[var22 + 1][var21 - -1] == -1 && ~(var20[var23 + 1][var24 + 2] & 2116288512) == -1 && (2015625216 & var20[var23 + 2][var24 + 2]) == 0 && ~(2028208128 & var20[var23 + 2][var24 - -1]) == -1) {
                class335.field4466[var27] = var11 + 1;
                class3.field37[var27] = var12 + 1;
                var27 = var27 + 1 & 4095;
                class418.field5895[var22 + 1][var21 - -1] = 12;
                class546.field7558[var22 + 1][var21 + 1] = var26;
            }
        }
        class29.field485 = var12;
        class640.field9315 = var11;
        return false;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lgi;)V")
    public class98(class583 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)Z")
    public final boolean method700(int arg0) {
        if (arg0 != 256) {
            this.field1495 = null;
        }
        ++field1490;
        if (super.field2374.field8306 && super.field2374.field8297 && super.field2374.field8285) {
            this.field1505 = new class45(super.field2374);
            this.field1486 = new class629(super.field2374, 3553, 34842, 256, 256);
            this.field1486.method3666(arg0 ^ 306, false, false);
            this.field1495 = new class629(super.field2374, 3553, 34842, 256, 256);
            this.field1495.method3666(78, false, false);
            super.field2374.method3350(arg0 ^ -2182, this.field1505);
            this.field1505.method435(0, this.field1486, 0);
            this.field1505.method435(0, this.field1495, 1);
            this.field1505.method453(43, 0);
            if (!this.field1505.method448(-89)) {
                super.field2374.method3395(this.field1505, arg0 + 13776);
                return false;
            } else {
                super.field2374.method3395(this.field1505, arg0 + 13776);
                this.field1487 = class209.method1377(new class40[] { client.method1550(35632, false, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2374) }, super.field2374, 26013);
                this.field1493 = class209.method1377(new class40[] { client.method1550(35632, false, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2374) }, super.field2374, arg0 ^ 25757);
                this.field1494 = class209.method1377(new class40[] { client.method1550(35632, false, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field2374) }, super.field2374, 26013);
                this.field1488 = class209.method1377(new class40[] { client.method1550(35632, false, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field2374) }, super.field2374, arg0 ^ 25757);
                return this.field1493 != null && this.field1487 != null && this.field1494 != null && this.field1488 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1501 = null;
        if (arg0 != 7) {
            field1501 = null;
        }
        field1506 = null;
        field1504 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(III)V")
    public final void method702(int arg0, int arg1, int arg2) {
        ++field1485;
        this.field1484 = arg0;
        if (arg1 == -257) {
            this.field1492 = arg2;
            int var4 = class327.method2020(-1594581311, this.field1484);
            int var5 = class327.method2020(-1594581311, this.field1492);
            if (this.field1483 != var4 || this.field1481 != var5) {
                if (this.field1502 != null) {
                    for (int var6 = 0; ~var6 > ~this.field1502.length; ++var6) {
                        this.field1502[var6].method2506((byte) 17);
                    }
                    this.field1502 = null;
                }
                if (~var4 >= -257 && ~var5 >= -257) {
                    this.field1491 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field1491 == null) {
                        this.field1491 = new class45(super.field2374);
                    }
                    label57: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            int var10 = var4;
                            int var11 = var5;
                            this.field1502 = new class629[var9];
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label57;
                                }
                                this.field1502[var12++] = new class629(super.field2374, 3553, 34842, var10, var11);
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (var8 > 256) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field1481 = var5;
                this.field1483 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)I")
    public static final int method703(int arg0, int arg1) {
        ++field1489;
        int var2 = arg1;
        if (~arg0 > -1 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 = arg1 + 16;
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            ++var2;
            arg0 >>>= 1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Z")
    public final boolean method704(byte arg0) {
        ++field1496;
        int var2 = 48 / ((arg0 - 9) / 32);
        return this.field1505 != null;
    }

    static {
        new class104("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field1504 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
        field1506 = new int[25];
    }
}
