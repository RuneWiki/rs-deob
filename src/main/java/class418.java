import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class418 extends class337 {

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "Lon;")
    private class220 field6274;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "Lod;")
    private class349 field6273;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "[I")
    private int[] field6283;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public int field6286;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "F")
    public float field6281;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Ltj;")
    private class131 field6268;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "Lki;")
    public static class498 field6279 = new class498(55, -1);

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "Z")
    public static boolean field6285 = true;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field6282 = 1;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lbg;")
    private class323 field6267;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6264;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field6277;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
    public final void method2504(byte arg0, int arg1) {
        if (arg0 > -111) {
            this.method2508(37, -50, -47, -84);
        }
        field6275++;
        this.field6264 = this.field6273.field5230.method2646(arg1 * 4);
        this.field6277 = new NativeStream(this.field6264);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(FZ)F")
    public static final float method2505(float arg0, boolean arg1) {
        field6265++;
        return arg1 ? arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) : 1.6194967F;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
    public final void method2506(int arg0, int arg1) {
        this.field6277.method2637();
        field6271++;
        class21 var3 = this.field6273.method2132(arg0 * 4, false, this.field6264, 0, 4);
        this.field6267 = new class323(var3, 5121, 4, 0);
        if (arg1 != 18600) {
            this.method2504((byte) 32, -84);
        }
        this.field6277 = null;
        this.field6264 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIFII)V")
    public final void method2507(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field6284 != -1) {
            class321 var6 = this.field6273.field2379.method838(true, this.field6284);
            int var7 = var6.field4604 & 0xFF;
            if (var7 != 0 && var6.field4585 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4594 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF00A4) + ((var13 & 0xFF00) + (var14 >> 8));
            }
        }
        field6270++;
        this.field6277.method2640(arg1 * 4);
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            int var20 = (int) ((float) var17 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field6277.method2639((byte) (arg3 >> 16));
        this.field6277.method2639((byte) (arg3 >> 8));
        if (arg4 != 255) {
            method2510(35);
        }
        this.field6277.method2639((byte) arg3);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V")
    public final void method2508(int arg0, int arg1, int arg2, int arg3) {
        this.field6283[this.field6274.field370 * arg2 + arg3] = class18.method119(this.field6283[this.field6274.field370 * arg2 + arg3], arg0 << arg1);
        field6280++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method2509(int arg0) {
        field6279 = null;
        int var1 = 7 % ((arg0 - 36) / 32);
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)Lcn;")
    public static final class355 method2510(int arg0) {
        if (arg0 != 16711935) {
            method2509(-77);
        }
        field6266++;
        if (class460.field6814 == null || class398.field5965 == null) {
            return null;
        }
        for (class355 var1 = (class355) class398.field5965.method1843(125); var1 != null; var1 = (class355) class398.field5965.method1843(127)) {
            class158 var2 = class460.field6804.method539(var1.field5459, (byte) 60);
            if (var2 != null && var2.field2312 && var2.method1011(117, class460.field6798)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)V")
    public final void method2511(int arg0, byte arg1) {
        this.field6277.method2640(arg0 * 4 + 3);
        field6276++;
        this.field6277.method2639(-1);
        if (arg1 != 32) {
            this.field6273 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[II)V")
    public final void method2512(int arg0, int[] arg1, int arg2) {
        field6278++;
        int var4 = 0;
        if (arg0 != -31424) {
            method2505(0.20807745F, true);
        }
        class209 var5 = class415.field6228;
        var5.field3037 = 0;
        if (this.field6273.field5313) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field6283[var13];
                short[] var15 = this.field6274.field3251[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1413(-125, var15[var17++] & 0xFFFF);
                            var5.method1413(-124, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1413(-124, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field6274.field3251[var7];
                int var9 = this.field6283[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1453((byte) -72, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1453((byte) -81, var8[var11++] & 0xFFFF);
                            var5.method1453((byte) -74, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6268.method883((byte) -80, var5.field3037, var5.field3036, 5123);
        this.field6273.method2173((byte) 122, this.field6274.field3274, this.field6267, this.field6274.field3269, this.field6274.field3272);
        this.field6273.method2160(1029, this.field6284, (this.field6274.field3245 & 0x8) != 0, (this.field6274.field3245 & 0x7) != 0);
        if (this.field6273.field5289) {
            this.field6273.method1021(Integer.MAX_VALUE, this.field6272, this.field6269, this.field6286);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6281, 1.0F / this.field6281, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6273.method2173((byte) 115, this.field6274.field3274, this.field6267, this.field6274.field3269, this.field6274.field3272);
        this.field6273.method2136(var4, 4, 0, this.field6268, (byte) 60);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lon;IIIII)V")
    public class418(class220 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6274 = arg0;
        this.field6273 = this.field6274.field3249;
        this.field6283 = new int[this.field6274.field370 * this.field6274.field369];
        this.field6286 = arg5;
        this.field6281 = arg2;
        this.field6284 = arg1;
        this.field6269 = arg4;
        this.field6272 = arg3;
        this.field6268 = new class131(this.field6273, 5123, null, 1);
    }
}
