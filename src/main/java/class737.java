import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class737 extends class187 {

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Lol;")
    private class301 field10183;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ldha;")
    private class85 field10170;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
    public static int[] field10175 = new int[2];

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lpja;")
    public static class43 field10182 = new class43(4);

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Lcga;")
    private class509 field10179;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfe;Z)Z", line = 5)
    public static final boolean method4088(class597 arg0, boolean arg1) {
        boolean var2 = class745.field10286 == class178.field2805;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1283((byte) -115);
        if (arg0.field8368 >= 0 && arg0.field8369 >= 0 && arg0.field8372 < class441.field5980 && arg0.field8365 < class375.field5083) {
            short var6 = 0;
            for (int var7 = arg0.field8368; var7 <= arg0.field8372; ++var7) {
                for (int var11 = arg0.field8369; var11 <= arg0.field8365; ++var11) {
                    class549 var12 = class663.method3754(arg0.field7391, var7, var11);
                    if (var12 != null) {
                        class58 var13 = class625.method3520(arg0, false);
                        class58 var14 = var12.field7466;
                        if (var14 == null) {
                            var12.field7466 = var13;
                        } else {
                            while (var14.field811 != null) {
                                var14 = var14.field811;
                            }
                            var14.field811 = var13;
                        }
                        if (var2 && (class625.field8717[var7][var11] & -16777216) != 0) {
                            var3 = class625.field8717[var7][var11];
                            var4 = class240.field3420[var7][var11];
                            var5 = class603.field8438[var7][var11];
                        }
                        if (!arg1 && var12.field7471 != null && var12.field7471.field5931 > var6) {
                            var6 = var12.field7471.field5931;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field8368; var8 <= arg0.field8372; ++var8) {
                    for (int var9 = arg0.field8369; var9 <= arg0.field8365; ++var9) {
                        if ((class625.field8717[var8][var9] & -16777216) == 0) {
                            class625.field8717[var8][var9] = var3;
                            class240.field3420[var8][var9] = var4;
                            class603.field8438[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class22.field466[class171.field2726++] = arg0;
            } else {
                int var10 = class745.field10286 == class178.field2805 ? 1 : 0;
                if (arg0.method902(0)) {
                    if (arg0.method910(false)) {
                        arg0.field7407 = class684.field9523[var10];
                        class684.field9523[var10] = arg0;
                    } else {
                        arg0.field7407 = class451.field6179[var10];
                        class451.field6179[var10] = arg0;
                        class180.field2828 = true;
                    }
                } else {
                    arg0.field7407 = class265.field3738[var10];
                    class265.field3738[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field7405 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 134)
    public static final void method4089(byte arg0) {
        ++field10172;
        int var1 = class152.field2496 * 512 + 256;
        int var2 = class113.field2114 * 512 - -256;
        int var3 = class309.method1973(15356, var1, var2, class282.field3917) + -class741.field10224;
        if (class761.field10481 >= 100) {
            class450.field6172 = class113.field2114 * 512 + 256;
            class733.field10131 = class152.field2496 * 512 - -256;
            class605.field8452 = class309.method1973(15356, class733.field10131, class450.field6172, class282.field3917) - class741.field10224;
        } else {
            if (class733.field10131 < var1) {
                class733.field10131 += (-class733.field10131 + var1) * class761.field10481 / 1000 + class100.field1625;
                if (~var1 > ~class733.field10131) {
                    class733.field10131 = var1;
                }
            }
            if (~var1 > ~class733.field10131) {
                class733.field10131 -= (-var1 + class733.field10131) * class761.field10481 / 1000 + class100.field1625;
                if (~var1 < ~class733.field10131) {
                    class733.field10131 = var1;
                }
            }
            if (var3 > class605.field8452) {
                class605.field8452 += class100.field1625 - -((var3 - class605.field8452) * class761.field10481 / 1000);
                if (~class605.field8452 < ~var3) {
                    class605.field8452 = var3;
                }
            }
            if (~var2 < ~class450.field6172) {
                class450.field6172 += class100.field1625 - -((-class450.field6172 + var2) * class761.field10481 / 1000);
                if (class450.field6172 > var2) {
                    class450.field6172 = var2;
                }
            }
            if (~var3 > ~class605.field8452) {
                class605.field8452 -= (-var3 + class605.field8452) * class761.field10481 / 1000 + class100.field1625;
                if (~var3 < ~class605.field8452) {
                    class605.field8452 = var3;
                }
            }
            if (var2 < class450.field6172) {
                class450.field6172 -= (-var2 + class450.field6172) * class761.field10481 / 1000 + class100.field1625;
                if (class450.field6172 < var2) {
                    class450.field6172 = var2;
                }
            }
        }
        int var4 = class326.field4453 * 512 + 256;
        int var5 = class619.field8609 * 512 - -256;
        int var6 = class309.method1973(15356, var5, var4, class282.field3917) + -class518.field7039;
        int var7 = var5 - class733.field10131;
        int var8 = -class605.field8452 + var6;
        int var9 = -class450.field6172 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 16383;
        if (~var11 > -1025) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (var11 > class255.field3585) {
            class255.field3585 += (-class255.field3585 + var11 >> 3) * class657.field9101 / 1000 + class355.field4849 << 3;
            if (~var11 > ~class255.field3585) {
                class255.field3585 = var11;
            }
        }
        if (~var11 > ~class255.field3585) {
            class255.field3585 -= (class255.field3585 - var11 >> 3) * class657.field9101 / 1000 + class355.field4849 << 3;
            if (var11 > class255.field3585) {
                class255.field3585 = var11;
            }
        }
        int var13 = -class460.field6249 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (~var14 < -1) {
            class460.field6249 += class355.field4849 - -(class657.field9101 * var14 / 1000) << 3;
            class460.field6249 &= 16383;
        }
        if (arg0 == 15) {
            if (var14 < 0) {
                class460.field6249 -= -var14 * class657.field9101 / 1000 + class355.field4849 << 3;
                class460.field6249 &= 16383;
            }
            int var15 = -class460.field6249 + var12;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (~var15 > 8191) {
                var15 += 16384;
            }
            if (var15 < 0 && ~var14 < -1 || var15 > 0 && var14 < 0) {
                class460.field6249 = var12;
            }
            class463.field6307 = 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI)V", line = 299)
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (~(arg0 & 1) != -2) {
                if (!this.field10183.field4146) {
                    super.field2885.method939(this.field10183.field4139[0], 8448);
                } else {
                    super.field2885.method939(this.field10183.field4142, 8448);
                    class626.field8723[2] = 0.0F;
                    class626.field8723[3] = 0.0F;
                    class626.field8723[1] = 0.0F;
                    class626.field8723[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class626.field8723, 0);
                }
            } else if (!this.field10183.field4146) {
                int var4 = super.field2885.field1938 % 4000 * 16 / 4000;
                super.field2885.method939(this.field10183.field4139[var4], 8448);
            } else {
                super.field2885.method939(this.field10183.field4142, 8448);
                class626.field8723[2] = 0.0F;
                class626.field8723[1] = 0.0F;
                class626.field8723[0] = 0.0F;
                class626.field8723[3] = (float) (super.field2885.field1938 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, class626.field8723, 0);
            }
            ++field10171;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z", line = 344)
    public final boolean method171(int arg0) {
        ++field10173;
        if (arg0 != 20220) {
            this.method171(-115);
        }
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 356)
    public final void method169(boolean arg0) {
        ++field10174;
        this.field10179.method2906('\u0001', 102);
        if (~super.field2885.field2015 < -1) {
            super.field2885.method1002(1, -5172);
            super.field2885.method939((class18) null, 8448);
            super.field2885.method943(0.0F, (byte) 101, 1.0F);
            super.field2885.method1002(0, -5172);
        }
        if (!arg0) {
            field10175 = null;
        }
        super.field2885.method990(8448, 8448, -29641);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V", line = 379)
    public final void method172(int arg0, boolean arg1) {
        ++field10176;
        if (arg0 > 56) {
            super.field2885.method990(260, 8448, -29641);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 391)
    private final void method4090(int arg0) {
        ++field10178;
        this.field10179 = new class509(super.field2885, 2);
        this.field10179.method2902(0, 4864);
        super.field2885.method1002(1, -5172);
        super.field2885.method990(7681, 260, -29641);
        super.field2885.method988(34168, 6, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2885.method1002(0, -5172);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field10183.field4146) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field10179.method2901(4);
        int var2 = 48 % ((-69 - arg0) / 45);
        this.field10179.method2902(1, 4864);
        super.field2885.method1002(1, -5172);
        super.field2885.method990(8448, 8448, -29641);
        super.field2885.method988(5890, 6, 0, 768);
        OpenGL.glDisable(3168);
        super.field2885.method1002(0, -5172);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field10183.field4146) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field10179.method2901(4);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V", line = 436)
    public static void method4091(int arg0) {
        field10182 = null;
        if (arg0 > -73) {
            method4091(-51);
        }
        field10175 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V", line = 448)
    public final void method168(boolean arg0, byte arg1) {
        if (super.field2885.field2015 > 0) {
            float var3 = -0.5F / (float) super.field2885.field2015;
            super.field2885.method1002(1, -5172);
            class626.field8723[1] = 0.0F;
            class626.field8723[2] = var3;
            class626.field8723[3] = super.field2885.field2034 * var3 + 0.25F;
            class626.field8723[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class626.field8723, 0);
            OpenGL.glPopMatrix();
            super.field2885.method943((float) super.field2885.field2015, (byte) 66, 0.5F);
            super.field2885.method939(this.field10170, 8448);
            super.field2885.method1002(0, -5172);
        }
        ++field10180;
        this.field10179.method2906('\u0000', 122);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        int var4 = 13 / ((arg1 - 36) / 48);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lhk;Lol;)V", line = 486)
    public class737(class111 arg0, class301 arg1) {
        super(arg0);
        this.field10183 = arg1;
        this.method4090(32);
        this.field10170 = new class85(super.field2885, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field10170.method683(false, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBLqk;)V", line = 497)
    public final void method167(int arg0, byte arg1, class18 arg2) {
        ++field10177;
        if (arg1 != -126) {
            this.field10170 = null;
        }
    }
}
