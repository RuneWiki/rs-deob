import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class362 extends class312 {

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "Lvb;")
    private class180 field5375;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Lbr;")
    private class363 field5383;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field5373 = -1;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5384 = "";

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "Lln;")
    public static class349 field5378;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Lqda;")
    private class89 field5386;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        int var2 = -52 % ((arg0 - 25) / 57);
        ++field5382;
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field5379;
        if (arg1 >= -78) {
            field5378 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        ++field5381;
        this.field5386.method871(false, '\u0001');
        if (super.field4632.field254 > 0) {
            super.field4632.method125(1, -59);
            super.field4632.method5(3845, (class487) null);
            super.field4632.method100(1.0F, (byte) -92, 0.0F);
            super.field4632.method125(0, arg0 ^ 3);
        }
        if (arg0 == -123) {
            super.field4632.method148(8448, 8448, (byte) -126);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    private final void method2306(int arg0) {
        ++field5385;
        this.field5386 = new class89(super.field4632, 2);
        this.field5386.method874(0, arg0 ^ -98);
        super.field4632.method125(1, 96);
        super.field4632.method148(260, 7681, (byte) -97);
        super.field4632.method10(0, 768, 34168, arg0 + 34192);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field4632.method125(arg0, -91);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5375.field2912) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5386.method869((byte) -126);
        this.field5386.method874(1, arg0 ^ -104);
        super.field4632.method125(1, -63);
        super.field4632.method148(8448, 8448, (byte) -103);
        super.field4632.method10(0, 768, 5890, 34192);
        OpenGL.glDisable(3168);
        super.field4632.method125(0, 90);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5375.field2912) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5386.method869((byte) -104);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        super.field4632.method148(8448, 260, (byte) -99);
        if (arg1 >= 102) {
            ++field5374;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        if (~(1 & arg1) == -2) {
            if (this.field5375.field2912) {
                super.field4632.method5(3845, this.field5375.field2917);
                class350.field5266[3] = (float) (super.field4632.field215 % 4000) / 4000.0F;
                class350.field5266[1] = 0.0F;
                class350.field5266[0] = 0.0F;
                class350.field5266[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class350.field5266, 0);
            } else {
                int var4 = super.field4632.field215 % 4000 * 16 / 4000;
                super.field4632.method5(3845, this.field5375.field2916[var4]);
            }
        } else if (!this.field5375.field2912) {
            super.field4632.method5(3845, this.field5375.field2916[0]);
        } else {
            super.field4632.method5(3845, this.field5375.field2917);
            class350.field5266[3] = 0.0F;
            class350.field5266[2] = 0.0F;
            class350.field5266[1] = 0.0F;
            class350.field5266[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class350.field5266, 0);
        }
        ++field5380;
        int var5 = 3 % ((arg2 - 74) / 45);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lus;Lvb;)V")
    public class362(class1 arg0, class180 arg1) {
        super(arg0);
        this.field5375 = arg1;
        this.method2306(0);
        this.field5383 = new class363(super.field4632, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5383.method2310(false, 10242);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field5377;
        if (super.field4632.field254 > 0) {
            float var3 = -0.5F / (float) super.field4632.field254;
            super.field4632.method125(1, 87);
            class350.field5266[1] = 0.0F;
            class350.field5266[2] = var3;
            class350.field5266[0] = 0.0F;
            class350.field5266[3] = super.field4632.field302 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class350.field5266, 0);
            OpenGL.glPopMatrix();
            super.field4632.method100(0.5F, (byte) -72, (float) super.field4632.field254);
            super.field4632.method5(3845, this.field5383);
            super.field4632.method125(0, -111);
        }
        this.field5386.method871(arg1, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public static void method2307(int arg0) {
        field5378 = null;
        int var1 = -107 % ((-46 - arg0) / 62);
        field5384 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lqh;Ln;II)V")
    public static final void method2308(class61 arg0, class17 arg1, int arg2, int arg3) {
        ++field5372;
        class485 var4 = new class485();
        var4.field6942 = arg0.method732(-559537960);
        var4.field6945 = arg0.method730(108);
        var4.field6943 = new byte[var4.field6942][][];
        var4.field6936 = new int[var4.field6942];
        var4.field6937 = new int[var4.field6942];
        var4.field6933 = new class456[var4.field6942];
        var4.field6938 = new int[var4.field6942];
        var4.field6932 = new class456[var4.field6942];
        for (int var5 = 0; var4.field6942 > var5; ++var5) {
            try {
                int var6 = arg0.method732(-559537960);
                if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                    if (var6 == 3 || var6 == 4) {
                        String var10 = arg0.method747(14598);
                        String var11 = arg0.method747(14598);
                        int var12 = arg0.method732(-559537960);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = arg0.method747(14598);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; var16 < var12; ++var16) {
                                int var17 = arg0.method730(-97);
                                var15[var16] = new byte[var17];
                                arg0.method704(0, var17, var15[var16], 0);
                            }
                        }
                        var4.field6937[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; ~var19 > ~var12; ++var19) {
                            var18[var19] = class254.method1691(-34, var13[var19]);
                        }
                        var4.field6932[var5] = arg1.method404(126, var11, class254.method1691(-51, var10), var18);
                        var4.field6943[var5] = var15;
                    }
                } else {
                    String var7 = arg0.method747(14598);
                    String var8 = arg0.method747(14598);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg0.method730(-67);
                    }
                    var4.field6937[var5] = var6;
                    var4.field6936[var5] = var9;
                    var4.field6933[var5] = arg1.method410(var8, class254.method1691(-63, var7), 58);
                }
            } catch (ClassNotFoundException var20) {
                var4.field6938[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6938[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6938[var5] = -3;
            } catch (Exception var23) {
                var4.field6938[var5] = -4;
            } catch (Throwable var24) {
                var4.field6938[var5] = -5;
            }
        }
        class576.field8367.method1229(var4, (byte) 120);
        if (arg2 <= 106) {
            method2308((class61) null, (class17) null, 63, 58);
        }
    }
}
