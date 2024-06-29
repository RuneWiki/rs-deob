import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class333 extends class366 {

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "Lpe;")
    private class430 field5116;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Llp;")
    private class266 field5106;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "Lao;")
    public static class188 field5115 = new class188(62, 5);

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public static int field5117 = 0;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public static int field5120 = 0;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field5119 = 0;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Lgf;")
    public static class180 field5118 = new class180("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "Z")
    public static boolean field5121 = false;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Lcn;")
    private class356 field5109;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILgo;B)V")
    public final void method6(int arg0, class440 arg1, byte arg2) {
        int var4 = 33 / ((31 - arg2) / 59);
        ++field5104;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZZ)V")
    public final void method7(boolean arg0, boolean arg1) {
        ++field5107;
        super.field5494.method2070(94, 8448, 260);
        if (!arg0) {
            method2196((class210) null, (class42) null, 8, (class162) null);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)V")
    public final void method8(int arg0, int arg1, byte arg2) {
        if (arg2 >= 18) {
            ++field5111;
            if ((1 & arg1) == 1) {
                if (!this.field5116.field6264) {
                    int var4 = super.field5494.field4781 % 4000 * 16 / 4000;
                    super.field5494.method2042(this.field5116.field6266[var4], 0);
                } else {
                    super.field5494.method2042(this.field5116.field6260, 0);
                    class529.field7804[3] = (float) (super.field5494.field4781 % 4000) / 4000.0F;
                    class529.field7804[1] = 0.0F;
                    class529.field7804[0] = 0.0F;
                    class529.field7804[2] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class529.field7804, 0);
                }
            } else if (!this.field5116.field6264) {
                super.field5494.method2042(this.field5116.field6266[0], 0);
            } else {
                super.field5494.method2042(this.field5116.field6260, 0);
                class529.field7804[3] = 0.0F;
                class529.field7804[0] = 0.0F;
                class529.field7804[1] = 0.0F;
                class529.field7804[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class529.field7804, 0);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ltp;Z)Z")
    public static final boolean method2194(class370 arg0, boolean arg1) {
        boolean var2 = class62.field1063 == class529.field7807;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method188((byte) 76);
        if (arg0.field5532 >= 0 && arg0.field5535 >= 0 && arg0.field5542 < class246.field3560 && arg0.field5540 < class254.field3675) {
            for (int var6 = arg0.field5532; var6 <= arg0.field5542; ++var6) {
                for (int var9 = arg0.field5535; var9 <= arg0.field5540; ++var9) {
                    class165 var10 = class524.method3094(arg0.field5538, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field5532) {
                            ++var11;
                        }
                        if (var6 < arg0.field5542) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field5535) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field5540) {
                            var11 += 2;
                        }
                        class525 var12 = class518.method3063(520, var11, arg0);
                        class525 var13 = var10.field2490;
                        if (var13 == null) {
                            var10.field2490 = var12;
                        } else {
                            while (var13.field7716 != null) {
                                var13 = var13.field7716;
                            }
                            var13.field7716 = var12;
                        }
                        var10.field2485 = (byte) (var10.field2485 | var11);
                        if (var2 && (class436.field6338[var6][var9] & -16777216) != 0) {
                            var3 = class436.field6338[var6][var9];
                            var4 = class273.field3951[var6][var9];
                            var5 = class214.field3090[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field5532; var7 <= arg0.field5542; ++var7) {
                    for (int var8 = arg0.field5535; var8 <= arg0.field5540; ++var8) {
                        if ((class436.field6338[var7][var8] & -16777216) == 0) {
                            class436.field6338[var7][var8] = var3;
                            class273.field3951[var7][var8] = var4;
                            class214.field3090[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class381.field5681[class288.field4149++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public final void method1(int arg0) {
        this.field5109.method2298('\u0001', 0);
        ++field5105;
        if (arg0 >= 2) {
            if (~super.field5494.field4808 < -1) {
                super.field5494.method2030(1, (byte) -23);
                super.field5494.method2042((class440) null, 0);
                super.field5494.method2010(0.0F, -122, 1.0F);
                super.field5494.method2030(0, (byte) -6);
            }
            super.field5494.method2070(121, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V")
    public static void method2195(byte arg0) {
        field5115 = null;
        if (arg0 >= 69) {
            field5118 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ldb;Lda;ILqa;)V")
    public static final void method2196(class210 arg0, class42 arg1, int arg2, class162 arg3) {
        ++field5113;
        class528 var4 = arg0.method1402(arg3, 69);
        if (var4 != null) {
            int var5 = var4.method137();
            if (var4.method139() > var5) {
                var5 = var4.method139();
            }
            byte var6 = 10;
            int var7 = arg1.field645;
            int var8 = arg1.field650;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field3039 != null) {
                var9 = class469.field6896.method106(class283.field4111, (class528[]) null, arg0.field3039, (int[]) null, false);
                for (int var12 = 0; ~var12 > ~var9; ++var12) {
                    String var13 = class283.field4111[var12];
                    if (~(var9 + -1) < ~var12) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class246.field3569.method961(var13);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                }
                var11 = class246.field3569.method960() * var9 + class246.field3569.method959() / 2;
            }
            int var15 = arg1.field645 - -(var5 / 2);
            int var16 = arg1.field650;
            if (var7 < class2.field49 + var5) {
                var15 = var10 / 2 + var5 / 2 + class2.field49 + var6 + 5;
                var7 = class2.field49;
            } else if (~var7 < ~(-var5 + class2.field33)) {
                var7 = -var5 + class2.field33;
                var15 = -var6 + class2.field33 + -(var5 / 2) + -(var10 / 2) + -5;
            }
            if (var8 < class2.field46 + var5) {
                var8 = class2.field46;
                var16 = var5 / 2 + class2.field46 + var6;
            } else if (~var8 < ~(-var5 + class2.field48)) {
                var8 = -var5 + class2.field48;
                var16 = -var6 + class2.field48 + -var11 - var5 / 2;
            }
            int var17 = (int) (32767.0D * (Math.atan2((double) (-arg1.field645 + var7), (double) (-arg1.field650 + var8)) / 3.141592653589793D)) & 65535;
            var4.method3130((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            if (arg2 != -28178) {
                method2196((class210) null, (class42) null, 21, (class162) null);
            }
            int var21 = -2;
            if (arg0.field3039 != null) {
                var19 = var16;
                var18 = -(var10 / 2) + var15 - 5;
                var21 = var16 + 3 - -(var9 * class246.field3569.method960());
                var20 = var10 + var18 + 10;
                if (~arg0.field3053 != -1) {
                    arg3.method1175(var20 - var18, arg2 + 28186, var18, arg0.field3053, var21 - var16, var16);
                }
                if (arg0.field3024 != 0) {
                    arg3.method1176(-var16 + var21, var18, 1, -var18 + var20, arg0.field3024, var16);
                }
                for (int var22 = 0; var22 < var9; ++var22) {
                    String var23 = class283.field4111[var22];
                    if (~(var9 - 1) < ~var22) {
                        var23 = var23.substring(0, var23.length() + -4);
                    }
                    class246.field3569.method958(arg3, var23, var15, var16, arg0.field3020, true);
                    var16 += class246.field3569.method960();
                }
            }
            if (~arg0.field3042 != 0 || arg0.field3039 != null) {
                int var24 = var5 >> 1;
                class469 var25 = new class469(arg1);
                var25.field6898 = var8 - var24;
                var25.field6900 = var8 + var24;
                var25.field6906 = var7 + var24;
                var25.field6905 = var20;
                var25.field6897 = var19;
                var25.field6895 = var21;
                var25.field6904 = var18;
                var25.field6903 = var7 - var24;
                class282.field4093.method2270(0, var25);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
    public final boolean method9(int arg0) {
        ++field5110;
        if (arg0 <= 21) {
            field5120 = 3;
        }
        return true;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(B)V")
    private final void method2197(byte arg0) {
        ++field5114;
        this.field5109 = new class356(super.field5494, 2);
        this.field5109.method2295(0, (byte) 118);
        super.field5494.method2030(1, (byte) -128);
        super.field5494.method2070(96, 260, 7681);
        if (arg0 > -36) {
            field5119 = 26;
        }
        super.field5494.method2053(-116, 0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5494.method2030(0, (byte) 1);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5116.field6264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5109.method2296(122);
        this.field5109.method2295(1, (byte) 121);
        super.field5494.method2030(1, (byte) 1);
        super.field5494.method2070(75, 8448, 8448);
        super.field5494.method2053(-105, 0, 5890, 768);
        OpenGL.glDisable(3168);
        super.field5494.method2030(0, (byte) -122);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5116.field6264) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5109.method2296(-115);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZI)V")
    public final void method5(boolean arg0, int arg1) {
        if (~super.field5494.field4808 < -1) {
            float var3 = -0.5F / (float) super.field5494.field4808;
            super.field5494.method2030(1, (byte) -126);
            class529.field7804[2] = var3;
            class529.field7804[3] = super.field5494.field4855 * var3 + 0.25F;
            class529.field7804[0] = 0.0F;
            class529.field7804[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class529.field7804, 0);
            OpenGL.glPopMatrix();
            super.field5494.method2010((float) super.field5494.field4808, 63, 0.5F);
            super.field5494.method2042(this.field5106, 0);
            super.field5494.method2030(0, (byte) -122);
        }
        ++field5108;
        this.field5109.method2298('\u0000', 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        int var4 = 98 / ((10 - arg1) / 48);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lqg;Lpe;)V")
    public class333(class321 arg0, class430 arg1) {
        super(arg0);
        this.field5116 = arg1;
        this.method2197((byte) -98);
        this.field5106 = new class266(super.field5494, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5106.method1705(false, 126);
    }
}
