import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class33 extends class615 {

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
    private int field467 = -1;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
    private int field468 = -1;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lqj;IIZ[[I)V")
    public class33(class548 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field463 = arg2;
        super.field8644.method2960(this, -2);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class595.method3275(var6 + 34069, super.field8640, arg2, 160, arg2, 32993, arg4[var6], super.field8644.field7622);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field8640, arg2, arg2, 0, 32993, super.field8644.field7622, arg4[var7], 0);
            }
        }
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lqj;II)V")
    public class33(class548 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field463 = arg2;
        super.field8644.method2960(this, -2);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field8640, arg2, arg2, 0, class568.method3141(super.field8640, (byte) 29), 5121, (byte[]) null, 0);
        }
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lqj;IIZ[[BI)V")
    public class33(class548 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field463 = arg2;
        super.field8644.method2960(this, -2);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field8640, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public final void method216(int arg0) {
        ++field464;
        OpenGL.glFramebufferTexture2DEXT(this.field467, this.field468, 3553, 0, 0);
        this.field467 = -1;
        this.field468 = -1;
        if (arg0 != 29468) {
            this.field467 = 33;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;ILvb;Lww;)V")
    public static final void method217(class566 arg0, int arg1, class316 arg2, class647 arg3) {
        ++field466;
        class536 var4 = arg3.method3615(-126, arg0);
        if (var4 != null) {
            int var5 = var4.method167();
            if (var5 < var4.method162()) {
                var5 = var4.method162();
            }
            byte var6 = 10;
            int var7 = arg2.field4058;
            int var8 = arg2.field4053;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg3.field9106 != null) {
                var9 = class383.field4835.method3272(arg3.field9106, class497.field6554, -1, (int[]) null, (class536[]) null);
                for (int var12 = 0; ~var9 < ~var12; ++var12) {
                    String var13 = class497.field6554[var12];
                    if (~(var9 + -1) < ~var12) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class305.field3770.method2934(var13);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class305.field3770.method2932() - -(class305.field3770.method2933() / 2);
            }
            int var15 = var5 / 2 + arg2.field4058;
            int var16 = arg2.field4053;
            if (~var7 > ~(class656.field9261 + var5)) {
                var7 = class656.field9261;
                var15 = var5 / 2 + class656.field9261 + var10 / 2 + 5 + var6;
            } else if (var7 > -var5 + class656.field9257) {
                var15 = class656.field9257 - (var5 / 2 - (-var6 - var10 / 2)) - 5;
                var7 = -var5 + class656.field9257;
            }
            if (~(class656.field9258 + var5) >= ~var8) {
                if (-var5 + class656.field9269 < var8) {
                    var8 = -var5 + class656.field9269;
                    var16 = class656.field9269 - (var5 / 2 + var6) + -var11;
                }
            } else {
                var16 = var5 / 2 + class656.field9258 - -var6;
                var8 = class656.field9258;
            }
            int var17 = (int) (32767.0D * (Math.atan2((double) (-arg2.field4058 + var7), (double) (var8 - arg2.field4053)) / 3.141592653589793D)) & 65535;
            var4.method2907((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            if (arg1 != 32993) {
                method217((class566) null, -18, (class316) null, (class647) null);
            }
            int var21 = -2;
            if (arg3.field9106 != null) {
                var19 = var16;
                var18 = -(var10 / 2) + -5 + var15;
                var20 = var10 + var18 - -10;
                var21 = var16 + 3 - -(class305.field3770.method2932() * var9);
                if (~arg3.field9105 != -1) {
                    arg0.method3118(arg3.field9105, var18, var16, 1, -var16 + var21, var20 - var18);
                }
                if (~arg3.field9112 != -1) {
                    arg0.method3110(-var18 + var20, var16, -var16 + var21, var18, 20822, arg3.field9112);
                }
                for (int var22 = 0; var9 > var22; ++var22) {
                    String var23 = class497.field6554[var22];
                    if (~var22 > ~(var9 - 1)) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class305.field3770.method2931(arg0, var23, var15, var16, arg3.field9120, true);
                    var16 += class305.field3770.method2932();
                }
            }
            if (~arg3.field9127 != 0 || arg3.field9106 != null) {
                class381 var24 = new class381(arg2);
                int var25 = var5 >> 1;
                var24.field4811 = -var25 + var7;
                var24.field4812 = var8 + var25;
                var24.field4805 = var19;
                var24.field4816 = var20;
                var24.field4813 = var21;
                var24.field4809 = var18;
                var24.field4814 = -var25 + var8;
                var24.field4810 = var7 + var25;
                class373.field4705.method239(var24, (byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BIIII)V")
    public final void method218(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg3, super.field8646, arg4);
        ++field465;
        this.field467 = arg2;
        int var6 = -73 % ((arg0 - 20) / 38);
        this.field468 = arg1;
    }
}
