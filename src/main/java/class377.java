import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class377 extends class631 {

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lrc;")
    private class538 field5288;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Lup;")
    private class274 field5287;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Z")
    public static boolean field5290 = true;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Lpca;")
    public static class714 field5286 = new class714(8);

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "[I")
    public static int[] field5296 = new int[25];

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    public static int field5297 = 0;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
    public final void method1512(int arg0, int arg1, int arg2) {
        ++field5295;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 24) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (128 & arg0) != 0;
        super.field8722.method884(1, true);
        if (var7) {
            class114.field1375[2] = 0.0F;
            class114.field1375[1] = 0.0F;
            class114.field1375[3] = 0.0F;
            class114.field1375[0] = var6;
        } else {
            class114.field1375[0] = 0.0F;
            class114.field1375[2] = var6;
            class114.field1375[1] = 0.0F;
            class114.field1375[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class114.field1375, 0);
        if (arg1 > 72) {
            class114.field1375[3] = (float) super.field8722.field1790 * var4 % 1.0F;
            class114.field1375[0] = 0.0F;
            class114.field1375[2] = 0.0F;
            class114.field1375[1] = var6;
            OpenGL.glTexGenfv(8193, 9474, class114.field1375, 0);
            if (this.field5288.field7545) {
                class114.field1375[3] = (float) super.field8722.field1790 * var5 % 1.0F;
                class114.field1375[2] = 0.0F;
                class114.field1375[1] = 0.0F;
                class114.field1375[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class114.field1375, 0);
            } else {
                int var8 = (int) ((float) super.field8722.field1790 * var5 * 16.0F);
                super.field8722.method926(this.field5288.field7543[var8 % 16], 119);
            }
            super.field8722.method884(0, true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILta;)V")
    public final void method1508(int arg0, int arg1, class210 arg2) {
        super.field8722.method926(arg2, 53);
        ++field5292;
        int var4 = 8 / ((52 - arg1) / 62);
        super.field8722.method891(arg0, (byte) 17);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZ)V")
    public final void method1509(boolean arg0, boolean arg1) {
        ++field5289;
        if (!arg0) {
            this.method1508(-21, 5, (class210) null);
        }
        this.field5287.method1783(-17, '\u0000');
        if (this.field5288.field7545) {
            super.field8722.method884(1, true);
            super.field8722.method926(this.field5288.field7547, 77);
            super.field8722.method884(0, true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static void method2365(boolean arg0) {
        field5296 = null;
        field5286 = null;
        if (!arg0) {
            field5297 = 91;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public final void method1513(int arg0) {
        this.field5287.method1783(-38, '\u0001');
        ++field5285;
        super.field8722.method884(1, true);
        super.field8722.method926((class210) null, 37);
        super.field8722.method884(0, true);
        if (arg0 <= 74) {
            this.method1512(76, -114, -16);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Leea;Lrc;)V")
    public class377(class131 arg0, class538 arg1) {
        super(arg0);
        this.field5288 = arg1;
        this.field5287 = new class274(arg0, 2);
        this.field5287.method1785(0, 102);
        super.field8722.method884(1, true);
        if (this.field5288.field7545) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field8722.method884(0, true);
        this.field5287.method1784(-50135600);
        this.field5287.method1785(1, 119);
        super.field8722.method884(1, true);
        if (this.field5288.field7545) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field8722.method884(0, true);
        this.field5287.method1784(-50135600);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)Z")
    public final boolean method1507(byte arg0) {
        int var2 = 105 % ((arg0 - -9) / 53);
        ++field5294;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([I[IILvaa;[I)V")
    public static final void method2366(int[] arg0, int[] arg1, int arg2, class468 arg3, int[] arg4) {
        ++field5293;
        if (arg2 != -1) {
            method2366((int[]) null, (int[]) null, 50, (class468) null, (int[]) null);
        }
        for (int var5 = 0; ~arg4.length < ~var5; ++var5) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; ~var7 != -1 && var9 < arg3.field7981.length; ++var9) {
                if ((1 & var7) != 0) {
                    if (var6 != -1) {
                        class709 var10 = class343.field4785.method3525(var6, (byte) -64);
                        int var11 = var10.field9848;
                        class132 var12 = arg3.field7981[var9];
                        if (var12 != null) {
                            if (~var12.field1944 != ~var6) {
                                if (~var10.field9824 <= ~class343.field4785.method3525(var12.field1944, (byte) -75).field9824) {
                                    var12 = arg3.field7981[var9] = null;
                                }
                            } else if (~var11 == -1) {
                                var12 = arg3.field7981[var9] = null;
                            } else if (var11 == 1) {
                                var12.field1940 = 1;
                                var12.field1946 = var8;
                                var12.field1942 = 0;
                                var12.field1941 = 0;
                                var12.field1947 = 0;
                                if (!arg3.field7970) {
                                    class346.method2239(arg2 + -701644943, 0, arg3, var10);
                                }
                            } else if (~var11 == -3) {
                                var12.field1941 = 0;
                            }
                        }
                        if (var12 == null) {
                            class132 var13 = arg3.field7981[var9] = new class132();
                            var13.field1941 = 0;
                            var13.field1946 = var8;
                            var13.field1940 = 1;
                            var13.field1947 = 0;
                            var13.field1944 = var6;
                            var13.field1942 = 0;
                            if (!arg3.field7970) {
                                class346.method2239(-701644944, 0, arg3, var10);
                            }
                        }
                    } else {
                        arg3.field7981[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
    public final void method1506(int arg0, boolean arg1) {
        ++field5291;
        if (arg0 != 17660) {
            this.method1513(7);
        }
    }
}
