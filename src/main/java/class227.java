import jaggl.OpenGL;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class227 extends class369 {

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Llc;")
    private class648 field3300;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lpl;")
    private class651 field3293;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[F")
    private float[] field3291;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3294 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!em", name = "p", descriptor = "F")
    private float field3298;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Ljv;")
    private class80 field3295;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "[I")
    public static int[] field3301;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field3297;
        if (this.field3295 != null) {
            if (arg2 >= -42) {
                this.method1595(-65);
            }
            super.field5255.method190(-15039, 1);
            if ((arg0 & 128) != 0) {
                super.field5255.method256((byte) -122, (class36) null);
            } else if ((1 & arg1) != 1) {
                if (!this.field3300.field8913) {
                    super.field5255.method256((byte) -84, this.field3300.field8915[0]);
                } else {
                    super.field5255.method256((byte) -97, this.field3300.field8911);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (!this.field3300.field8913) {
                int var4 = super.field5255.field557 % 4000 * 16 / 4000;
                super.field5255.method256((byte) -88, this.field3300.field8915[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                super.field5255.method256((byte) -83, this.field3300.field8911);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3298, 0.0F, 0.0F, 1.0F);
            }
            super.field5255.method190(-15039, 0);
            if ((64 & arg0) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class506.field7040[2] = super.field5255.field645 * super.field5255.field590;
                class506.field7040[0] = super.field5255.field603 * super.field5255.field590;
                class506.field7040[1] = super.field5255.field638 * super.field5255.field590;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class506.field7040, 0);
            }
            int var5 = arg0 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lud;BI)V", line = 76)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (arg1 <= -89) {
            ++field3289;
            super.field5255.method256((byte) -115, arg0);
            super.field5255.method237(0, arg2);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lej;Lku;I)Lwm;", line = 90)
    public static final class564 method1594(class124 arg0, class377 arg1, int arg2) {
        ++field3303;
        class564 var3 = class756.method4218((byte) -103);
        if (arg2 >= -80) {
            field3294 = null;
        }
        var3.field7784 = arg0.field2124;
        var3.field7780 = arg0;
        if (~var3.field7784 != 0) {
            if (var3.field7784 == -2) {
                var3.field7778 = new class665(10000);
            } else if (var3.field7784 <= 18) {
                var3.field7778 = new class665(20);
            } else if (var3.field7784 <= 98) {
                var3.field7778 = new class665(100);
            } else {
                var3.field7778 = new class665(260);
            }
        } else {
            var3.field7778 = new class665(260);
        }
        var3.field7778.method3739(-17, arg1);
        var3.field7778.method3731(var3.field7780.method1059(200), 18676);
        var3.field7781 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lqo;Llc;)V", line = 125)
    public class227(class22 arg0, class648 arg1) {
        super(arg0);
        this.field3300 = arg1;
        if (super.field5255.field663 && super.field5255.field617 >= 2) {
            this.field3293 = class578.method3326(34336, super.field5255, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", false);
            if (this.field3293 != null) {
                int[][] var3 = class665.method3736(4, 3, 64, 4, 256, true, 0, 0.4F, false);
                int[][] var4 = class665.method3736(4, 3, 64, 4, 256, true, 8, 0.4F, false);
                this.field3291 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field3291[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3291[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1595(-25);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V", line = 174)
    private final void method1595(int arg0) {
        ++field3290;
        this.field3295 = new class80(super.field5255, 2);
        this.field3295.method741((byte) 103, 0);
        super.field5255.method190(-15039, 1);
        super.field5255.method358(-16777216, 118);
        super.field5255.method175(260, (byte) 114, 7681);
        super.field5255.method274(false, 0, 770, 34166);
        super.field5255.method190(-15039, 0);
        OpenGL.glBindProgramARB(34336, this.field3293.field8946);
        OpenGL.glEnable(34336);
        this.field3295.method737(-1);
        this.field3295.method741((byte) 127, 1);
        int var2 = 65 / ((arg0 - 62) / 49);
        super.field5255.method190(-15039, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5255.method237(0, 0);
        super.field5255.method274(false, 0, 770, 5890);
        super.field5255.method190(-15039, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3295.method737(-1);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z", line = 206)
    public final boolean method368(int arg0) {
        if (arg0 >= -5) {
            return true;
        } else {
            ++field3288;
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 217)
    public final void method371(int arg0) {
        ++field3304;
        if (this.field3295 != null) {
            if (arg0 >= -75) {
                this.method369(true, false);
            }
            this.field3295.method740('\u0001', 28666);
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -103, (class36) null);
            super.field5255.method190(-15039, 0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V", line = 239)
    public final void method369(boolean arg0, boolean arg1) {
        ++field3305;
        if (this.field3295 != null) {
            this.field3295.method740('\u0000', 28666);
            super.field5255.method190(-15039, 1);
            OpenGL.glMatrixMode(5890);
            if (!arg1) {
                OpenGL.glLoadMatrixf(super.field5255.field589.method2912(1), 0);
                OpenGL.glMatrixMode(5888);
                super.field5255.method190(-15039, 0);
                if (~super.field5255.field557 != ~this.field3292) {
                    int var3 = super.field5255.field557 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field3291, var3);
                        var3 += 2;
                    }
                    if (this.field3300.field8913) {
                        this.field3298 = (float) (super.field5255.field557 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field3292 = super.field5255.field557;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZB)V", line = 285)
    public final void method366(boolean arg0, byte arg1) {
        int var3 = 22 % ((-60 - arg1) / 38);
        ++field3302;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZLff;)V", line = 294)
    public static final void method1596(boolean arg0, boolean arg1, class9 arg2) {
        ++field3299;
        if (~class192.field2844 > -401) {
            class334 var3 = arg2.field126;
            if (var3.field4694 != null) {
                var3 = var3.method2110(class390.field5635, -1);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field4713) {
                String var4 = var3.field4689;
                if (~var3.field4678 != -1) {
                    String var5 = class582.field7970 != class204.field2938 ? class497.field6919.method2936(class607.field8336, 544) : class497.field6921.method2936(class607.field8336, 544);
                    var4 = var4 + class204.method1416(class58.field1147.field8161, true, var3.field4678) + " (" + var5 + var3.field4678 + ")";
                }
                if (class184.field2785 && !arg0) {
                    class118 var6 = class308.field4273 == -1 ? null : class495.field6863.method19(class308.field4273, 28364);
                    if ((class479.field6669 & 2) != 0 && (var6 == null || var3.method2121(var6.field2000, class308.field4273, 61) != var6.field2000)) {
                        class142.method1128(false, class133.field2241 + " -> <col=ffff00>" + var4, 0, (byte) -81, false, 0, -1, true, 30, (long) arg2.field5716, class133.field2242, (long) arg2.field5716, class548.field7549);
                        ++class65.field1248;
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field4666;
                    if (class221.field3180) {
                        var7 = class555.method3197(var7, 0);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (var7[var8] != null && (~var3.field4701 == -1 || !var7[var8].equalsIgnoreCase(class497.field6914.method2936(class607.field8336, 544)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 25;
                                }
                                int var10 = class479.field6675;
                                if (~var8 == -2) {
                                    var9 = 20;
                                }
                                if (~var8 == -3) {
                                    var9 = 44;
                                }
                                if (~var8 == -4) {
                                    var9 = 46;
                                }
                                if (var3.field4652 == var8) {
                                    var10 = var3.field4688;
                                }
                                if (~var8 == -5) {
                                    var9 = 60;
                                }
                                if (var3.field4702 == var8) {
                                    var10 = var3.field4655;
                                }
                                ++class732.field9885;
                                class142.method1128(false, "<col=ffff00>" + var4, 0, (byte) -93, false, 0, -1, true, var9, (long) arg2.field5716, var7[var8], (long) arg2.field5716, !var7[var8].equalsIgnoreCase(class497.field6914.method2936(class607.field8336, 544)) ? var10 : var3.field4718);
                            }
                        }
                    }
                    if (var3.field4701 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class497.field6914.method2936(class607.field8336, 544))) {
                                short var12 = 0;
                                if (~var3.field4678 < ~class58.field1147.field8161) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 25;
                                }
                                if (var11 == 1) {
                                    var13 = 20;
                                }
                                if (~var11 == -3) {
                                    var13 = 44;
                                }
                                if (var11 == 3) {
                                    var13 = 46;
                                }
                                if (~var11 == -5) {
                                    var13 = 60;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                ++class654.field8987;
                                class142.method1128(false, "<col=ffff00>" + var4, 0, (byte) -101, false, 0, -1, true, var13, (long) arg2.field5716, var7[var11], (long) arg2.field5716, var3.field4718);
                            }
                        }
                    }
                }
                ++class201.field2915;
                class142.method1128(arg0, "<col=ffff00>" + var4, 0, (byte) -105, arg1, 0, -1, true, 1008, (long) arg2.field5716, class497.field6913.method2936(class607.field8336, 544), (long) arg2.field5716, class365.field5224);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 454)
    public static void method1597(int arg0) {
        field3301 = null;
        if (arg0 > -72) {
            method1594((class124) null, (class377) null, 77);
        }
        field3294 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 469)
    public static final void method1598(boolean arg0) {
        for (int var1 = 0; ~class239.field3493 < ~var1; ++var1) {
            class238.field3449[var1] = null;
        }
        ++field3296;
        class239.field3493 = 0;
        for (int var2 = 0; class510.field7094 > var2; ++var2) {
            for (int var42 = 0; var42 < class434.field6208; ++var42) {
                for (int var43 = 0; ~class432.field6185 < ~var43; ++var43) {
                    class384 var44 = class649.field8928[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field5569 > 0) {
                            var44.field5569 = (short) (var44.field5569 * -1);
                        }
                        if (~var44.field5580 < -1) {
                            var44.field5580 = (short) (var44.field5580 * -1);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field3301 = null;
        }
        for (int var3 = 0; class510.field7094 > var3; ++var3) {
            for (int var4 = 0; ~class434.field6208 < ~var4; ++var4) {
                for (int var5 = 0; class432.field6185 > var5; ++var5) {
                    class384 var6 = class649.field8928[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class649.field8928[0][var5][var4] != null && class649.field8928[0][var5][var4].field5571 != null;
                        if (~var6.field5580 > -1) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class384 var12 = class649.field8928[var3][var5][var4 + -1];
                            int var13 = class465.field6517[var3].method1851((byte) -86, var4, var5);
                            while (var8 > 0 && var12 != null && var12.field5580 < 0 && ~var6.field5580 == ~var12.field5580 && var6.field5572 == var12.field5572 && ~var13 == ~class465.field6517[var3].method1851((byte) -86, var8 + -1, var5) && (var8 + -1 <= 0 || var13 == class465.field6517[var3].method1851((byte) -86, var8 + -2, var5))) {
                                --var8;
                                var12 = class649.field8928[var3][var5][var8 + -1];
                            }
                            for (class384 var14 = class649.field8928[var3][var5][var4 + 1]; ~var9 > ~class432.field6185 && var14 != null && var14.field5580 < 0 && ~var6.field5580 == ~var14.field5580 && var6.field5572 == var14.field5572 && ~class465.field6517[var3].method1851((byte) -86, var9 - -1, var5) == ~var13 && (~(var9 + 1) <= ~class432.field6185 || var13 == class465.field6517[var3].method1851((byte) -86, var9 + 2, var5)); var14 = class649.field8928[var3][var5][var9 + 1]) {
                                ++var9;
                            }
                            int var15 = -var3 + var3 + 1;
                            int var16 = class465.field6517[var7 ? var3 + 1 : var3].method1851((byte) -86, var8, var5);
                            int var17 = var6.field5580 * var15 + var16;
                            int var18 = class465.field6517[!var7 ? var3 : var3 + 1].method1851((byte) -86, var9 + 1, var5);
                            int var19 = var18 - -(var6.field5580 * var15);
                            int var20 = var5 << class130.field2185;
                            int var21 = var8 << class130.field2185;
                            int var22 = (var9 << class130.field2185) + class1.field3;
                            class238.field3449[class239.field3493++] = new class546(1, var3, var6.field5572 + var20, var6.field5572 + var20, var6.field5572 + var20, var6.field5572 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; ~var23 >= ~var11; ++var23) {
                                for (int var24 = var8; var9 >= var24; ++var24) {
                                    class649.field8928[var23][var5][var24].field5580 = (short) (class649.field8928[var23][var5][var24].field5580 * -1);
                                }
                            }
                        }
                        if (~var6.field5569 > -1) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class384 var29 = class649.field8928[var3][var5 - 1][var4];
                            int var30 = class465.field6517[var3].method1851((byte) -86, var4, var5);
                            while (var25 > 0 && var29 != null && ~var29.field5569 > -1 && ~var6.field5569 == ~var29.field5569 && var6.field5568 == var29.field5568 && class465.field6517[var3].method1851((byte) -86, var4, var25 + -1) == var30 && (~(var25 + -1) >= -1 || class465.field6517[var3].method1851((byte) -86, var4, var25 + -2) == var30)) {
                                --var25;
                                var29 = class649.field8928[var3][var25 - 1][var4];
                            }
                            for (class384 var31 = class649.field8928[var3][var5 - -1][var4]; var26 < class434.field6208 && var31 != null && ~var31.field5569 > -1 && ~var6.field5569 == ~var31.field5569 && var6.field5568 == var31.field5568 && class465.field6517[var3].method1851((byte) -86, var4, var26 + 1) == var30 && (class434.field6208 <= var26 + 1 || class465.field6517[var3].method1851((byte) -86, var4, var26 + 2) == var30); var31 = class649.field8928[var3][var26 + 1][var4]) {
                                ++var26;
                            }
                            int var32 = -var3 + 1 + var3;
                            int var33 = class465.field6517[!var7 ? var3 : var3 + 1].method1851((byte) -86, var4, var25);
                            int var34 = var33 - -(var6.field5569 * var32);
                            int var35 = class465.field6517[!var7 ? var3 : var3 + 1].method1851((byte) -86, var4, var26 + 1);
                            int var36 = var6.field5569 * var32 + var35;
                            int var37 = var25 << class130.field2185;
                            int var38 = (var26 << class130.field2185) + class1.field3;
                            int var39 = var4 << class130.field2185;
                            class238.field3449[class239.field3493++] = new class546(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field5568 + var39, var6.field5568 + var39, var6.field5568 + var39, var39 - -var6.field5568);
                            for (int var40 = var3; ~var28 <= ~var40; ++var40) {
                                for (int var41 = var25; ~var41 >= ~var26; ++var41) {
                                    class649.field8928[var40][var41][var4].field5569 = (short) (class649.field8928[var40][var41][var4].field5569 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class216.field3139 = true;
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 693)
    public static final void method1599(int arg0) {
        ++field3287;
        if (!class371.field5285) {
            if (arg0 <= -37) {
                class371.field5285 = true;
                class201.field2912 += (-class201.field2912 + 24.0F) / 2.0F;
                class392.field5766 = true;
            }
        }
    }
}
