import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class365 extends class118 {

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "Lkm;")
    private class120 field5255;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "Lni;")
    private class630 field5251;

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public static int field5259 = 50;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field5249 = new String[field5259];

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "[I")
    public static int[] field5256 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "[I")
    public static int[] field5258 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "[I")
    public static int[] field5257 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "[I")
    public static int[] field5253 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "[I")
    public static int[] field5250 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "[I")
    public static int[] field5252 = new int[field5259];

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
    public final boolean method446(byte arg0) {
        if (arg0 != 29) {
            return false;
        } else {
            ++field5245;
            return true;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZB)V")
    public final void method442(boolean arg0, byte arg1) {
        this.field5251.method3670('\u0000', false);
        if (arg1 < -101) {
            ++field5247;
            if (this.field5255.field1555) {
                super.field1544.method2842(1, (byte) 42);
                super.field1544.method2811(this.field5255.field1558, -2);
                super.field1544.method2842(0, (byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lbaa;IB)V")
    public final void method440(class541 arg0, int arg1, byte arg2) {
        if (arg2 >= -17) {
            field5250 = null;
        }
        super.field1544.method2811(arg0, -2);
        ++field5244;
        super.field1544.method2791(arg1, (byte) 111);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILno;)V")
    public static final void method2233(int arg0, class483 arg1) {
        ++field5242;
        arg1.method2933(0);
        int var2 = class404.field5807;
        class179 var3 = class239.field3493 = class383.field5604[var2] = new class179();
        var3.field1053 = var2;
        int var4 = arg1.method2937(-19811, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268431539 & var4) >> 14;
        var3.field1090[0] = -class584.field8677 + var6;
        int var7 = var4 & 16383;
        var3.field3464 = (var3.field1090[0] << 7) - -(var3.method514(0) << 6);
        var3.field1089[0] = -class424.field6061 + var7;
        var3.field3463 = (var3.field1089[0] << 7) + (var3.method514(arg0 + -16) << 6);
        class355.field5157 = var3.field3457 = var5;
        if (arg0 == 16) {
            if (class156.field1996[var2] != null) {
                var3.method1190(27, class156.field1996[var2]);
            }
            class264.field3925 = 0;
            class533.field7895[class264.field3925++] = var2;
            class262.field3877[var2] = 0;
            class574.field8478 = 0;
            for (int var8 = 1; ~var8 > -2049; ++var8) {
                if (~var2 != ~var8) {
                    int var9 = arg1.method2937(-19811, 18);
                    int var10 = var9 >> 16;
                    int var11 = var9 >> 8 & 255;
                    int var12 = 255 & var9;
                    class351 var13 = class442.field6468[var8] = new class351();
                    var13.field5108 = 0;
                    var13.field5106 = -1;
                    var13.field5110 = false;
                    var13.field5112 = (var10 << 28) + (var11 << 14) + var12;
                    class402.field5764[class574.field8478++] = var8;
                    class262.field3877[var8] = 0;
                }
            }
            arg1.method2930(20056);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public final void method441(int arg0) {
        ++field5248;
        this.field5251.method3670('\u0001', false);
        super.field1544.method2842(1, (byte) 42);
        super.field1544.method2811((class541) null, -2);
        super.field1544.method2842(0, (byte) 42);
        int var2 = 15 / ((-58 - arg0) / 41);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBI)V")
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field5246;
        float var4 = (float) ((arg0 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((27 & arg0) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        if (arg1 != 23) {
            field5257 = null;
        }
        boolean var7 = (arg0 & 128) != 0;
        super.field1544.method2842(1, (byte) 42);
        if (var7) {
            class533.field7894[1] = 0.0F;
            class533.field7894[2] = 0.0F;
            class533.field7894[3] = 0.0F;
            class533.field7894[0] = var6;
        } else {
            class533.field7894[3] = 0.0F;
            class533.field7894[0] = 0.0F;
            class533.field7894[1] = 0.0F;
            class533.field7894[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class533.field7894, 0);
        class533.field7894[0] = 0.0F;
        class533.field7894[2] = 0.0F;
        class533.field7894[1] = var6;
        class533.field7894[3] = (float) super.field1544.field6961 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class533.field7894, 0);
        if (this.field5255.field1555) {
            class533.field7894[0] = 0.0F;
            class533.field7894[1] = 0.0F;
            class533.field7894[3] = (float) super.field1544.field6961 * var5 % 1.0F;
            class533.field7894[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class533.field7894, 0);
        } else {
            int var8 = (int) ((float) super.field1544.field6961 * var5 * 16.0F);
            super.field1544.method2811(this.field5255.field1554[var8 % 16], arg1 ^ -23);
        }
        super.field1544.method2842(0, (byte) 42);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
    public static void method2234(int arg0) {
        field5249 = null;
        field5253 = null;
        field5257 = null;
        field5258 = null;
        if (arg0 != 0) {
            method2234(31);
        }
        field5250 = null;
        field5252 = null;
        field5256 = null;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Los;Lkm;)V")
    public class365(class468 arg0, class120 arg1) {
        super(arg0);
        this.field5255 = arg1;
        this.field5251 = new class630(arg0, 2);
        this.field5251.method3673(0, -1);
        super.field1544.method2842(1, (byte) 42);
        if (this.field5255.field1555) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field1544.method2842(0, (byte) 42);
        this.field5251.method3674(true);
        this.field5251.method3673(1, -1);
        super.field1544.method2842(1, (byte) 42);
        if (this.field5255.field1555) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field1544.method2842(0, (byte) 42);
        this.field5251.method3674(true);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BZ)V")
    public final void method439(byte arg0, boolean arg1) {
        ++field5243;
        if (arg0 != 56) {
            this.method446((byte) -85);
        }
    }
}
