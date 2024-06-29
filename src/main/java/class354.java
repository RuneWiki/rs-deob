import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class354 implements class83 {

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    private int field4716 = 0;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    private int field4709 = -1;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "[Lmd;")
    private class383[] field4726 = new class383[9];

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lur;")
    private class377 field4719;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    private int field4720;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "Lsr;")
    public static class167 field4735 = new class167();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    private int field4713;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    private int field4734;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public final void method459(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field4720);
        field4712++;
        if (arg0 < 47) {
            this.method458(-115);
        }
        this.field4716 |= 0x4;
        this.field4709 = this.method2077(-90);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILkm;I)V")
    private final void method2067(int arg0, int arg1, class238 arg2, int arg3) {
        field4737++;
        if (this.field4709 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if (arg3 != -19618) {
            this.method2069(-69, null, -63, -41, 75);
        }
        if ((this.field4728 & ~var5) == 0) {
            this.field4713 = arg2.field3164;
            this.field4734 = arg2.field3169;
        } else if (this.field4734 != arg2.field3169 || this.field4713 != arg2.field3164) {
            throw new RuntimeException();
        }
        arg2.method1498(class531.field7785[arg0], this.field4709, arg1, (byte) 100);
        this.field4726[arg0] = arg2;
        this.field4728 |= var5;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
    public final void method2068(int arg0, int arg1) {
        if (this.field4726[arg1] != null) {
            this.field4726[arg1].method863((byte) 103);
        }
        field4736++;
        this.field4728 &= ~(arg0 << arg1);
        this.field4726[arg1] = null;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)V")
    public final void method461(int arg0) {
        field4718++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field4716 &= 0xFFFFFFFD;
        this.field4709 = this.method2077(-79);
        if (arg0 != -8741) {
            this.method459(29);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILsa;III)V")
    private final void method2069(int arg0, class139 arg1, int arg2, int arg3, int arg4) {
        field4715++;
        if (this.field4709 == -1) {
            throw new RuntimeException();
        }
        if (arg3 != 1) {
            this.method2077(56);
        }
        int var6 = 0x1 << arg4;
        if ((this.field4728 & ~var6) == 0) {
            this.field4734 = arg1.field1855;
            this.field4713 = arg1.field1855;
        } else if (this.field4734 != arg1.field1855 || this.field4713 != arg1.field1855) {
            throw new RuntimeException();
        }
        arg1.method860(arg2, arg0, class531.field7785[arg4], this.field4709, (byte) 107);
        this.field4726[arg4] = arg1;
        this.field4728 |= var6;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
    public static void method2070(byte arg0) {
        if (arg0 < 105) {
            method2070((byte) 35);
        }
        field4735 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII)I")
    public static final int method2071(byte arg0, int arg1, int arg2) {
        int var3 = -30 % ((24 - arg0) / 35);
        field4724++;
        int var4 = class210.method1338(-124, arg1 - 1, arg2 + -1) + (class210.method1338(-120, arg1 + 1, arg2 + -1) - (-class210.method1338(-117, arg1 - 1, arg2 - -1) - class210.method1338(-125, arg1 + 1, arg2 + 1)));
        int var5 = class210.method1338(-119, arg1 - 1, arg2) - (-class210.method1338(-126, arg1 + 1, arg2) - class210.method1338(-118, arg1, arg2 - 1) - class210.method1338(-119, arg1, arg2 - -1));
        int var6 = class210.method1338(-117, arg1, arg2);
        return var4 / 16 + var5 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILkm;Z)V")
    public final void method2072(int arg0, class238 arg1, boolean arg2) {
        field4731++;
        if (!arg2) {
            this.method2067(-25, 45, null, -107);
        }
        this.method2067(arg0, 0, arg1, -19618);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
    public final void method2073(int arg0, int arg1) {
        int var3 = 73 % ((arg1 - 41) / 42);
        field4708++;
        if (this.field4709 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class531.field7785[arg0]);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lgv;")
    public static final class58 method2074(Component arg0, byte arg1, boolean arg2) {
        if (arg1 < 84) {
            return null;
        } else {
            field4723++;
            return new class289(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)V")
    public final void method2075(int arg0, int arg1) {
        int var3 = -79 % ((arg0 + 18) / 54);
        field4710++;
        if (this.field4709 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class531.field7785[arg1]);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4714++;
        if (arg0 != 29845) {
            this.method462(-60);
        }
        this.field4716 &= 0xFFFFFFFE;
        this.field4709 = this.method2077(arg0 ^ 0xFFFF8B54);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Z")
    public final boolean method2076(byte arg0) {
        if (arg0 == -98) {
            field4730++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4709);
            return var2 == 36053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4719.method2257(20, this.field4720);
        field4732++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)V")
    public final void method462(int arg0) {
        field4721++;
        if (arg0 != 6822) {
            method2074(null, (byte) -29, true);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field4716 &= 0xFFFFFFFB;
        this.field4709 = this.method2077(arg0 ^ 0xFFFFE535);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public final void method457(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field4720);
        if (arg0 != 69) {
            this.method461(53);
        }
        field4727++;
        this.field4716 |= 0x2;
        this.field4709 = this.method2077(-71);
    }

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)I")
    private final int method2077(int arg0) {
        if (arg0 > -52) {
            method2082(33, -43, null, -57, 32, 62, -91);
        }
        field4733++;
        if ((this.field4716 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4716 & 0x2) == 0) {
            return (this.field4716 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILtq;I)V")
    public final void method2078(int arg0, class446 arg1, int arg2) {
        field4717++;
        if (this.field4709 == -1) {
            throw new RuntimeException();
        } else if (arg2 == 36053) {
            int var4 = 0x1 << arg0;
            if ((~var4 & this.field4728) == 0) {
                this.field4713 = arg1.field6494;
                this.field4734 = arg1.field6487;
            } else if (this.field4734 != arg1.field6487 || this.field4713 != arg1.field6494) {
                throw new RuntimeException();
            }
            arg1.method2757(36161, this.field4709, class531.field7785[arg0]);
            this.field4726[arg0] = arg1;
            this.field4728 |= var4;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    public final void method460(int arg0) {
        if (arg0 != -14568) {
            this.field4726 = null;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field4720);
        field4722++;
        this.field4716 |= 0x1;
        this.field4709 = this.method2077(-112);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lii;Lno;)V")
    public static final void method2079(class390 arg0, class498 arg1) {
        if (!arg1.field7267) {
            return;
        }
        short var2 = arg1.field7270;
        short var3 = arg1.field7274;
        byte var4 = arg1.field7269;
        byte var5 = arg1.field7262;
        int var6 = (var2 << class351.field4688) + class123.field1595;
        int var7 = (var3 << class351.field4688) + class123.field1595;
        class498[][] var8 = class186.field2421[var4];
        float var9;
        if (class378.field5470 == class152.field1993) {
            class492.field7216.method1137(class14.field152[0].method216(var6, var7), class246.method1524(var2, var3), class361.method2131(var2, var3), class531.method3156(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class492.field7216.method1140(3000.0F, var9 * 1.5F);
        if (arg1.field7258) {
            if (class262.field3512) {
                if (var4 > 0) {
                    class498 var10 = class186.field2421[var4 - 1][var2][var3];
                    if (var10 != null && var10.field7267) {
                        return;
                    }
                }
                if (var2 <= class151.field1977 && var2 > class259.field3462) {
                    class498 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field7267 && (var11.field7258 || (arg1.field7260 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class151.field1977 && var2 < class410.field5874 - 1) {
                    class498 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field7267 && (var12.field7258 || (arg1.field7260 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class122.field1577 && var3 > class176.field2275) {
                    class498 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field7267 && (var13.field7258 || (arg1.field7260 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class122.field1577 && var3 < class69.field814 - 1) {
                    class498 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field7267 && (var14.field7258 || (arg1.field7260 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class262.field3512 = true;
            }
            arg1.field7258 = false;
            if (arg1.field7276 != null) {
                class498 var15 = arg1.field7276;
                class492.field7216.method1140(3000.0F, (201.5F - (float) (var15.field7262 + 1) * 50.0F) * 1.5F);
                if (!class413.method2524(var15.field7262, var2, var3)) {
                    class152.field1993[var15.field7262].method211(var2, var3);
                }
                class262 var16 = var15.field7264;
                if (var16 != null) {
                    if (class372.field5053) {
                        if ((var16.field3511 & arg1.field7256) == 0) {
                            class338.method1972(arg0, var4, var2, var3);
                        } else {
                            class450.method2793(arg0, var16.field3511, var5, var2, var3);
                        }
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    var16.method50((byte) -112, class492.field7216);
                }
                for (class192 var17 = var15.field7263; var17 != null; var17 = var17.field2469) {
                    class279 var18 = var17.field2466;
                    if (var18 != null) {
                        if (class372.field5053) {
                            class338.method1972(arg0, var4, var2, var3);
                            class492.field7216.method1146(arg0.field5643, arg0.field5642);
                        }
                        var18.method50((byte) -112, class492.field7216);
                    }
                }
                class492.field7216.method1140(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class413.method2524(var5, var2, var3);
            if (var19) {
                class152.field1993[var5].method211(var2, var3);
                class215 var20 = arg1.field7268;
                if (var20 != null && var20.field2941) {
                    if (var20.field2932) {
                        class492.field7216.method1140(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var21 = var20.method50((byte) -112, class492.field7216);
                    if (var21 != null) {
                        var21.field236 = var20;
                        var21.field234 = var4;
                        var21.field228 = var2;
                        var21.field237 = var3;
                        class249.field3320.method286((byte) -47, var21);
                    }
                    if (var20.field2932) {
                        class492.field7216.method1140(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class262 var24 = arg1.field7264;
            class100 var25 = arg1.field7259;
            if (var24 != null || var25 != null) {
                if (class151.field1977 == var2) {
                    var22++;
                } else if (class151.field1977 < var2) {
                    var22 += 2;
                }
                if (class122.field1577 == var3) {
                    var22 += 3;
                } else if (class122.field1577 > var3) {
                    var22 += 6;
                }
                var23 = class152.field1990[var22];
                arg1.field7256 = class472.field7001[var22];
            }
            if (var24 != null) {
                if ((var24.field3511 & class511.field7437[var22]) == 0) {
                    arg1.field7266 = 0;
                } else if (var24.field3511 == 16) {
                    arg1.field7266 = 3;
                    arg1.field7275 = class40.field435[var22];
                    arg1.field7255 = (byte) (3 - arg1.field7275);
                } else if (var24.field3511 == 32) {
                    arg1.field7266 = 6;
                    arg1.field7275 = class292.field3863[var22];
                    arg1.field7255 = (byte) (6 - arg1.field7275);
                } else if (var24.field3511 == 64) {
                    arg1.field7266 = 12;
                    arg1.field7275 = class364.field4973[var22];
                    arg1.field7255 = (byte) (12 - arg1.field7275);
                } else {
                    arg1.field7266 = 9;
                    arg1.field7275 = class95.field1143[var22];
                    arg1.field7255 = (byte) (9 - arg1.field7275);
                }
                if ((var24.field3511 & var23) != 0 && !class26.method161(var5, var2, var3, var24.field3511)) {
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var26 = var24.method50((byte) -112, class492.field7216);
                    if (var26 != null) {
                        var26.field236 = var24;
                        var26.field234 = var4;
                        var26.field228 = var2;
                        var26.field237 = var3;
                        class249.field3320.method286((byte) -35, var26);
                    }
                }
                class262 var27 = arg1.field7257;
                if (var27 != null && (var27.field3511 & var23) != 0 && !class26.method161(var5, var2, var3, var27.field3511)) {
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var28 = var27.method50((byte) -112, class492.field7216);
                    if (var28 != null) {
                        var28.field236 = var27;
                        var28.field234 = var4;
                        var28.field228 = var2;
                        var28.field237 = var3;
                        class249.field3320.method286((byte) -37, var28);
                    }
                }
            }
            if (var25 != null && !class475.method2903(var5, var2, var3, var25.method614(80))) {
                class100 var29 = arg1.field7271;
                class492.field7216.method1140(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field1372 & var23) != 0) {
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var30 = var25.method50((byte) -112, class492.field7216);
                    if (var30 != null) {
                        var30.field236 = var25;
                        var30.field234 = var4;
                        var30.field228 = var2;
                        var30.field237 = var3;
                        class249.field3320.method286((byte) -8, var30);
                    }
                } else if (var25.field1372 == 256) {
                    int var31 = var25.field1366 - class466.field6933;
                    int var32 = var25.field1370 - class14.field153;
                    int var33 = var25.field1369;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    if (var35 < var34) {
                        class23 var36 = var25.method50((byte) -112, class492.field7216);
                        if (var36 != null) {
                            var36.field236 = var25;
                            var36.field234 = var4;
                            var36.field228 = var2;
                            var36.field237 = var3;
                            class249.field3320.method286((byte) -95, var36);
                        }
                    } else if (var29 != null) {
                        class23 var37 = var29.method50((byte) -112, class492.field7216);
                        if (var37 != null) {
                            var37.field236 = var29;
                            var37.field234 = var4;
                            var37.field228 = var2;
                            var37.field237 = var3;
                            class249.field3320.method286((byte) -42, var37);
                        }
                    }
                }
                class492.field7216.method1140(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class215 var38 = arg1.field7268;
                if (var38 != null && !var38.field2941) {
                    if (var38.field2932) {
                        class492.field7216.method1140(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var39 = var38.method50((byte) -112, class492.field7216);
                    if (var39 != null) {
                        var39.field236 = var38;
                        var39.field234 = var4;
                        var39.field228 = var2;
                        var39.field237 = var3;
                        class249.field3320.method286((byte) -128, var39);
                    }
                    if (var38.field2932) {
                        class492.field7216.method1140(3000.0F, var9 * 1.5F);
                    }
                }
                class73 var40 = arg1.field7273;
                if (var40 != null && !var40.field918) {
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var41 = var40.method50((byte) -112, class492.field7216);
                    if (var41 != null) {
                        var41.field236 = var40;
                        var41.field234 = var4;
                        var41.field228 = var2;
                        var41.field237 = var3;
                        class249.field3320.method286((byte) -112, var41);
                    }
                }
            }
            byte var42 = arg1.field7260;
            if (var42 != 0) {
                if (var2 < class151.field1977 && (var42 & 0x4) != 0) {
                    class498 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field7267) {
                        class429.field6242.method204(var43, (byte) 30);
                    }
                }
                if (var3 < class122.field1577 && (var42 & 0x2) != 0) {
                    class498 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field7267) {
                        class429.field6242.method204(var44, (byte) 30);
                    }
                }
                if (var2 > class151.field1977 && (var42 & 0x1) != 0) {
                    class498 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field7267) {
                        class429.field6242.method204(var45, (byte) 30);
                    }
                }
                if (var3 > class122.field1577 && (var42 & 0x8) != 0) {
                    class498 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field7267) {
                        class429.field6242.method204(var46, (byte) 30);
                    }
                }
            }
        }
        if (arg1.field7266 != 0) {
            boolean var47 = true;
            for (class192 var48 = arg1.field7263; var48 != null; var48 = var48.field2469) {
                if (class292.field3861 != var48.field2466.field3692 && (var48.field2467 & arg1.field7266) == arg1.field7275) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class262 var49 = arg1.field7264;
                if (!class26.method161(var5, var2, var3, var49.field3511)) {
                    if (class372.field5053) {
                        label682: {
                            if (var49.field3511 >= 16) {
                                int var50 = var2 - class151.field1977;
                                int var51 = var3 - class122.field1577;
                                if (var49.field3511 == 16) {
                                    int var52 = var50 - class123.field1595;
                                    int var53 = class123.field1595 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class114.field1494) {
                                        class338.method1972(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3511 == 32) {
                                    int var54 = class123.field1595 + var50;
                                    int var55 = class123.field1595 + var51;
                                    if (var55 < -var54 && var2 < class515.field7487 && var3 < class114.field1494) {
                                        class338.method1972(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3511 == 64) {
                                    int var56 = class123.field1595 + var50;
                                    int var57 = var51 - class123.field1595;
                                    if (var57 > var56 && var2 < class515.field7487 && var3 > 0) {
                                        class338.method1972(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field3511 == 128) {
                                    int var58 = var50 - class123.field1595;
                                    int var59 = var51 - class123.field1595;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class338.method1972(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class338.method1972(arg0, var4, var2, var3);
                        }
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var60 = var49.method50((byte) -112, class492.field7216);
                    if (var60 != null) {
                        var60.field236 = var49;
                        var60.field234 = var4;
                        var60.field228 = var2;
                        var60.field237 = var3;
                        class249.field3320.method286((byte) 40, var60);
                    }
                }
                arg1.field7266 = 0;
            }
        }
        if (arg1.field7261) {
            try {
                arg1.field7261 = false;
                int var61 = 0;
                label625: for (class192 var62 = arg1.field7263; var62 != null; var62 = var62.field2469) {
                    class279 var63 = var62.field2466;
                    if (class292.field3861 != var63.field3692) {
                        for (int var64 = var63.field3698; var64 <= var63.field3697; var64++) {
                            for (int var65 = var63.field3688; var65 <= var63.field3691; var65++) {
                                class498 var66 = var8[var64][var65];
                                if (var66.field7258) {
                                    arg1.field7261 = true;
                                    continue label625;
                                }
                                if (var66.field7266 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field3698) {
                                        var67++;
                                    }
                                    if (var64 < var63.field3697) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field3688) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field3691) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field7266) == arg1.field7255) {
                                        arg1.field7261 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class151.field1977 - var63.field3698;
                        int var69 = var63.field3697 - class151.field1977;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class122.field1577 - var63.field3688;
                        int var71 = var63.field3691 - class122.field1577;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field5644[var61] = var63;
                        arg0.field5641[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class279 var75 = arg0.field5644[var74];
                        if (class292.field3861 != var75.field3692) {
                            int var76 = arg0.field5641[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field3704 - class466.field6933;
                                int var78 = var75.field3694 - class14.field153;
                                int var79 = arg0.field5644[var73].field3704 - class466.field6933;
                                int var80 = arg0.field5644[var73].field3694 - class14.field153;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class279 var81 = arg0.field5644[var73];
                    var81.field3692 = class292.field3861;
                    if (!class308.method1837(var5, var81.field3698, var81.field3697, var81.field3688, var81.field3691, var81.method132(-111))) {
                        if (class372.field5053) {
                            if (var81.field3701 == 0) {
                                class147.method891(arg0, var4, var81.field3698, var81.field3688, var81.field3697, var81.field3691);
                            } else {
                                class338.method1972(arg0, var4, var2, var3);
                                int var82 = var2 - class151.field1977;
                                int var83 = var3 - class122.field1577;
                                if (var81.field3701 == 2) {
                                    if (var83 > -var82) {
                                        class253.method1569(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class253.method1569(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class253.method1569(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class253.method1569(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class492.field7216.method1146(arg0.field5643, arg0.field5642);
                        }
                        class23 var84 = var81.method50((byte) -112, class492.field7216);
                        if (var84 != null) {
                            var84.field236 = var81;
                            var84.field234 = var4;
                            var84.field228 = var81.field3698;
                            var84.field237 = var81.field3688;
                            class249.field3320.method286((byte) -74, var84);
                        }
                    }
                    for (int var85 = var81.field3698; var85 <= var81.field3697; var85++) {
                        for (int var86 = var81.field3688; var86 <= var81.field3691; var86++) {
                            class498 var87 = var8[var85][var86];
                            if (var87.field7266 != 0) {
                                class429.field6242.method204(var87, (byte) 30);
                            } else if ((var2 != var85 || var3 != var86) && var87.field7267) {
                                class429.field6242.method204(var87, (byte) 30);
                            }
                        }
                    }
                }
                if (arg1.field7261) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field7261 = false;
            }
        }
        if (arg1.field7265 != null && (byte) (class136.field1818 & 0xFF) == arg1.field7272) {
            class336 var88 = arg1.field7265;
            int var89 = class152.field1993[var4].method217(var2, var3);
            int var90;
            if (var4 < class478.field7065 - 1) {
                var90 = class152.field1993[var4].method217(var2, var3) - class152.field1993[var4 + 1].method217(var2, var3);
            } else {
                var90 = 0x8 << class351.field4688;
            }
            class164.field2145.method737(var6, var89, var7, arg0.field5648);
            int var91 = arg0.field5648[2];
            class164.field2145.method737(var6, var89 - var90, var7, arg0.field5648);
            int var92 = arg0.field5648[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class135.field1794;
            int var96 = class135.field1794 + var94;
            var88.field4457 = var95;
            var88.field4456 = var96;
            var88.field4455 = true;
            class492.field7216.method1131(var88);
        }
        if (!arg1.field7267) {
            return;
        }
        if (arg1.field7266 != 0) {
            return;
        }
        if (var2 <= class151.field1977 && var2 > class259.field3462) {
            class498 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field7267) {
                return;
            }
        }
        if (var2 >= class151.field1977 && var2 < class410.field5874 - 1) {
            class498 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field7267) {
                return;
            }
        }
        if (var3 <= class122.field1577 && var3 > class176.field2275) {
            class498 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field7267) {
                return;
            }
        }
        if (var3 >= class122.field1577 && var3 < class69.field814 - 1) {
            class498 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field7267) {
                return;
            }
        }
        arg1.field7267 = false;
        class258.field3443--;
        class73 var101 = arg1.field7273;
        if (var101 != null && var101.field918) {
            if (class372.field5053) {
                class338.method1972(arg0, var4, var2, var3);
                class492.field7216.method1146(arg0.field5643, arg0.field5642);
            }
            class23 var102 = var101.method50((byte) -112, class492.field7216);
            if (var102 != null) {
                var102.field236 = var101;
                var102.field234 = var4;
                var102.field228 = var2;
                var102.field237 = var3;
                class249.field3320.method286((byte) 124, var102);
            }
        }
        if (arg1.field7256 != 0) {
            class100 var103 = arg1.field7259;
            if (var103 != null && !class475.method2903(var5, var2, var3, var103.method614(66))) {
                if ((var103.field1372 & arg1.field7256) != 0) {
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class23 var104 = var103.method50((byte) -112, class492.field7216);
                    if (var104 != null) {
                        var104.field236 = var103;
                        var104.field234 = var4;
                        var104.field228 = var2;
                        var104.field237 = var3;
                        class249.field3320.method286((byte) 126, var104);
                    }
                } else if (var103.field1372 == 256) {
                    int var105 = var103.field1366 - class466.field6933;
                    int var106 = var103.field1370 - class14.field153;
                    int var107 = var103.field1369;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class372.field5053) {
                        class338.method1972(arg0, var4, var2, var3);
                        class492.field7216.method1146(arg0.field5643, arg0.field5642);
                    }
                    class100 var110 = arg1.field7271;
                    if (var109 > var108) {
                        class23 var111 = var103.method50((byte) -112, class492.field7216);
                        if (var111 != null) {
                            var111.field236 = var103;
                            var111.field234 = var4;
                            var111.field228 = var2;
                            var111.field237 = var3;
                            class249.field3320.method286((byte) 122, var111);
                        }
                    } else if (var110 != null) {
                        class23 var112 = var110.method50((byte) -112, class492.field7216);
                        if (var112 != null) {
                            var112.field236 = var110;
                            var112.field234 = var4;
                            var112.field228 = var2;
                            var112.field237 = var3;
                            class249.field3320.method286((byte) -121, var112);
                        }
                    }
                }
            }
            class262 var113 = arg1.field7264;
            class262 var114 = arg1.field7257;
            if (var114 != null && (var114.field3511 & arg1.field7256) != 0 && !class26.method161(var5, var2, var3, var114.field3511)) {
                if (class372.field5053) {
                    class450.method2793(arg0, var114.field3511, var4, var2, var3);
                    class492.field7216.method1146(arg0.field5643, arg0.field5642);
                }
                class23 var115 = var114.method50((byte) -112, class492.field7216);
                if (var115 != null) {
                    var115.field236 = var114;
                    var115.field234 = var4;
                    var115.field228 = var2;
                    var115.field237 = var3;
                    class249.field3320.method286((byte) 122, var115);
                }
            }
            if (var113 != null && (var113.field3511 & arg1.field7256) != 0 && !class26.method161(var5, var2, var3, var113.field3511)) {
                if (class372.field5053) {
                    class450.method2793(arg0, var113.field3511, var4, var2, var3);
                    class492.field7216.method1146(arg0.field5643, arg0.field5642);
                }
                class23 var116 = var113.method50((byte) -112, class492.field7216);
                if (var116 != null) {
                    var116.field236 = var113;
                    var116.field234 = var4;
                    var116.field228 = var2;
                    var116.field237 = var3;
                    class249.field3320.method286((byte) 124, var116);
                }
            }
        }
        if (var4 < class478.field7065 - 1) {
            class498 var117 = class186.field2421[var4 + 1][var2][var3];
            if (var117 != null && var117.field7267) {
                class429.field6242.method202((byte) 33, var117);
            }
        }
        if (var2 < class151.field1977) {
            class498 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field7267) {
                class429.field6242.method204(var118, (byte) 30);
            }
        }
        if (var3 < class122.field1577) {
            class498 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field7267) {
                class429.field6242.method204(var119, (byte) 30);
            }
        }
        if (var2 > class151.field1977) {
            class498 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field7267) {
                class429.field6242.method204(var120, (byte) 30);
            }
        }
        if (var3 > class122.field1577) {
            class498 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field7267) {
                class429.field6242.method204(var121, (byte) 30);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)I")
    public final int method2080(int arg0) {
        if (arg0 != -10894) {
            this.method462(-81);
        }
        field4711++;
        return this.field4713;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lsa;IIB)V")
    public final void method2081(class139 arg0, int arg1, int arg2, byte arg3) {
        field4725++;
        this.method2069(arg2, arg0, 0, 1, arg1);
        if (arg3 <= 59) {
            this.field4728 = -102;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lur;)V")
    public class354(class377 arg0) {
        if (!arg0.field5417) {
            throw new IllegalStateException("");
        }
        this.field4719 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class257.field3440, 0);
        this.field4720 = class257.field3440[0];
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[FIIII)V")
    public static final void method2082(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field4729++;
        if (arg3 > 0 && !class119.method713(arg3, arg0 - 15866)) {
            throw new IllegalArgumentException("");
        }
        if (arg0 != 15960) {
            field4735 = null;
        }
        if (arg1 > 0 && !class119.method713(arg1, arg0 ^ 0x3E2E)) {
            throw new IllegalArgumentException("");
        }
        int var7 = class62.method372(32841, arg6);
        int var8 = 0;
        int var9 = arg1 > arg3 ? arg3 : arg1;
        int var10 = arg3 >> 1;
        int var11 = arg1 >> 1;
        float[] var12 = arg2;
        float[] var13 = new float[var7 * var11 * var10];
        while (true) {
            OpenGL.glTexImage2Df(arg5, var8, arg4, arg3, arg1, 0, arg6, 5126, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg3 * var7;
            float[] var15 = var13;
            for (int var16 = 0; var16 < var7; var16++) {
                int var17 = var16;
                int var18 = var16;
                int var19 = var16 + var14;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        float var22 = var12[var18];
                        int var23 = var7 + var18;
                        float var24 = var12[var23] + var22;
                        var18 = var7 + var23;
                        float var25 = var12[var19] + var24;
                        int var26 = var7 + var19;
                        float var27 = var12[var26] + var25;
                        var13[var17] = var27 * 0.25F;
                        var19 = var7 + var26;
                        var17 += var7;
                    }
                    var18 += var14;
                    var19 += var14;
                }
            }
            var13 = var12;
            arg3 = var10;
            arg1 = var11;
            var12 = var15;
            var8++;
            var9 >>= 0x1;
            var10 >>= 0x1;
            var11 >>= 0x1;
        }
    }
}
