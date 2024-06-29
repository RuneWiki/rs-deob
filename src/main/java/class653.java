import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class653 extends class675 {

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lb;")
    private class350 field9202;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Liu;")
    private class602 field9210;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "[F")
    private float[] field9211;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lpb;")
    public static class680 field9214 = new class680("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "F")
    private float field9215;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    private int field9212;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Lee;")
    private class703 field9218;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "[Ljr;")
    public static class121[] field9220;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method1353(byte arg0) {
        ++field9205;
        if (this.field9218 != null) {
            this.field9218.method3982((byte) -120, '\u0001');
            super.field9618.method1825(1, -24);
            if (arg0 != 52) {
                this.field9211 = null;
            }
            super.field9618.method1840((class599) null, 2205);
            super.field9618.method1825(0, 115);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
    public final void method1351(int arg0, int arg1, int arg2) {
        ++field9217;
        if (this.field9218 != null) {
            if (arg1 != 8865) {
                this.field9212 = 105;
            }
            super.field9618.method1825(1, arg1 + -8869);
            if (~(arg0 & 128) != -1) {
                super.field9618.method1840((class599) null, arg1 ^ 10812);
            } else if ((arg2 & 1) != 1) {
                if (this.field9202.field5113) {
                    super.field9618.method1840(this.field9202.field5108, arg1 + -6660);
                } else {
                    super.field9618.method1840(this.field9202.field5109[0], 2205);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field9202.field5113) {
                super.field9618.method1840(this.field9202.field5108, 2205);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9215, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field9618.field4167 % 4000 * 16 / 4000;
                super.field9618.method1840(this.field9202.field5109[var4], 2205);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field9618.method1825(0, 106);
            if (~(arg0 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class718.field10094[2] = super.field9618.field4248 * super.field9618.field4203;
                class718.field10094[1] = super.field9618.field4248 * super.field9618.field4220;
                class718.field10094[0] = super.field9618.field4248 * super.field9618.field4232;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class718.field10094, 0);
            }
            int var5 = arg0 & 3;
            if (~var5 != -3) {
                if (var5 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)Lhq;")
    public static final class167 method3739(int arg0, int arg1, boolean arg2) {
        ++field9208;
        if (arg0 != 0) {
            field9220 = null;
        }
        class310[] var3 = class683.field9701;
        synchronized (class683.field9701) {
            class167 var4;
            if (~class683.field9701.length < ~arg1 && !class683.field9701[arg1].method2030((byte) 0)) {
                var4 = (class167) class683.field9701[arg1].method2032(110);
                var4.method592(arg0 ^ 2);
                int var10002 = class520.field7436[arg1]--;
            } else {
                var4 = new class167();
                var4.field2426 = new class660[arg1];
                for (int var5 = 0; var5 < arg1; ++var5) {
                    var4.field2426[var5] = new class660();
                }
            }
            var4.field2427 = arg2;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZ)V")
    public final void method1350(boolean arg0, boolean arg1) {
        ++field9206;
        if (arg1) {
            this.method3741((byte) -66);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
    public final void method1354(boolean arg0, int arg1) {
        ++field9213;
        if (arg1 == -24765) {
            if (this.field9218 != null) {
                this.field9218.method3982((byte) -120, '\u0000');
                super.field9618.method1825(1, arg1 ^ 24830);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field9618.field4200.method4033(arg1 + 15939), 0);
                OpenGL.glMatrixMode(5888);
                super.field9618.method1825(0, 118);
                if (~super.field9618.field4167 != ~this.field9212) {
                    int var3 = super.field9618.field4167 % 5000 * 128 / 5000;
                    for (int var4 = 0; var4 < 64; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field9211, var3);
                        var3 += 2;
                    }
                    if (this.field9202.field5113) {
                        this.field9215 = (float) (super.field9618.field4167 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field9212 = super.field9618.field4167;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method3740(int arg0, byte arg1, int arg2) {
        ++field9209;
        int var3 = arg2 - arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else {
            int var4 = -48 % ((arg1 - -78) / 36);
            if (~var3 < -7) {
                return "<col=40ff00>";
            } else if (~var3 < -4) {
                return "<col=80ff00>";
            } else {
                return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
    private final void method3741(byte arg0) {
        ++field9216;
        this.field9218 = new class703(super.field9618, 2);
        this.field9218.method3980(0, arg0 + -27285);
        super.field9618.method1825(1, 109);
        super.field9618.method1877((byte) -83, -16777216);
        super.field9618.method1835(false, 260, 7681);
        super.field9618.method1828((byte) -83, 34166, 770, 0);
        super.field9618.method1825(0, arg0 + 225);
        OpenGL.glBindProgramARB(34336, this.field9210.field8483);
        OpenGL.glEnable(34336);
        this.field9218.method3978(arg0 ^ -115);
        this.field9218.method3980(1, -27400);
        super.field9618.method1825(1, 125);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 != -115) {
            this.method1353((byte) 76);
        }
        OpenGL.glMatrixMode(5888);
        super.field9618.method1889(false, 0);
        super.field9618.method1828((byte) -48, 5890, 770, 0);
        super.field9618.method1825(0, arg0 + 34);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field9218.method3978(0);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
    public final boolean method1347(byte arg0) {
        ++field9204;
        if (arg0 <= 105) {
            this.field9215 = 0.90232354F;
        }
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3742(String arg0, byte arg1) {
        ++field9219;
        int var2 = -19 / ((arg1 - 21) / 47);
        if (!class16.field272.startsWith("win")) {
            if (class16.field272.startsWith("linux")) {
                return "lib" + arg0 + ".so";
            } else {
                return class16.field272.startsWith("mac") ? "lib" + arg0 + ".dylib" : null;
            }
        } else {
            return arg0 + ".dll";
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILts;Lkia;IILdja;)V")
    public static final void method3743(int arg0, int arg1, int arg2, class559 arg3, class645 arg4, int arg5, int arg6, class322 arg7) {
        ++field9203;
        class315 var8 = new class315();
        var8.field4704 = arg6 << 9;
        var8.field4683 = arg0 << 9;
        var8.field4698 = arg5;
        if (arg7 == null) {
            if (arg4 == null) {
                if (arg3 != null) {
                    var8.field4693 = arg3;
                    var8.field4694 = arg6 - -arg3.method2692((byte) -128) << 9;
                    var8.field4709 = arg3.method2692((byte) -124) + arg0 << 9;
                    var8.field4679 = class541.method3120(arg3, -1);
                    var8.field4702 = arg3.field7957;
                    var8.field4692 = arg3.field7939;
                    var8.field4701 = arg3.field7977 << 9;
                    var8.field4682 = 0;
                    var8.field4687 = 256;
                    var8.field4689 = 256;
                    class649.field9134.method384((long) arg3.field6361, var8, false);
                }
            } else {
                var8.field4685 = arg4;
                class279 var9 = arg4.field9071;
                if (var9.field3943 != null) {
                    var8.field4686 = true;
                    var9 = var9.method1810((byte) -105, class271.field3796);
                }
                if (var9 != null) {
                    var8.field4694 = var9.field3878 + arg6 << 9;
                    var8.field4709 = arg0 - -var9.field3878 << 9;
                    var8.field4679 = class241.method1640(arg4, 0);
                    var8.field4682 = var9.field3923 << 9;
                    var8.field4689 = var9.field3924;
                    var8.field4702 = var9.field3879;
                    var8.field4692 = var9.field3913;
                    var8.field4687 = var9.field3880;
                    var8.field4701 = var9.field3876 << 9;
                }
                class751.field10412.method2510(var8, false);
            }
        } else {
            var8.field4681 = arg7;
            int var10 = arg7.field4801;
            int var11 = arg7.field4782;
            if (~arg2 == -2 || arg2 == 3) {
                var10 = arg7.field4782;
                var11 = arg7.field4801;
            }
            var8.field4684 = arg7.field4819;
            var8.field4691 = arg7.field4764;
            var8.field4702 = arg7.field4808;
            var8.field4697 = arg7.field4743;
            var8.field4687 = arg7.field4812;
            var8.field4679 = arg7.field4818;
            var8.field4694 = arg6 + var10 << 9;
            var8.field4710 = arg7.field4758;
            var8.field4709 = arg0 - -var11 << 9;
            var8.field4689 = arg7.field4775;
            var8.field4692 = arg7.field4815;
            var8.field4682 = arg7.field4772 << 9;
            var8.field4701 = arg7.field4771 << 9;
            if (arg7.field4830 != null) {
                var8.field4686 = true;
                var8.method2068((byte) -101);
            }
            if (var8.field4684 != null) {
                var8.field4700 = var8.field4710 - -((int) (Math.random() * (double) (var8.field4697 - var8.field4710)));
            }
            class686.field9727.method2510(var8, false);
        }
        int var12 = 66 % ((-30 - arg1) / 53);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILha;Ldja;)V")
    public static final void method3744(int arg0, int arg1, int arg2, int arg3, class66 arg4, class322 arg5) {
        ++field9207;
        class427 var6 = class386.field5496.method3215((byte) 122, arg5.field4769);
        if (var6.field6014 != -1) {
            int var7;
            if (!arg5.field4779) {
                var7 = 0;
            } else {
                int var8 = arg5.field4794 + arg2;
                var7 = var8 & 3;
            }
            class112 var9 = var6.method2545(var7, arg3 + -1, arg5.field4839, arg4);
            if (var9 != null) {
                int var10 = arg5.field4801;
                int var11 = arg5.field4782;
                if (~(var7 & arg3) == -2) {
                    var11 = arg5.field4801;
                    var10 = arg5.field4782;
                }
                int var12 = var9.method781();
                int var13 = var9.method792();
                if (var6.field6013) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (~var6.field6008 != -1) {
                    var9.method786(arg0, arg1 - (var11 - 1) * 4, var12, var13, 0, -16777216 | var6.field6008, 1);
                } else {
                    var9.method783(arg0, -((var11 + -1) * 4) + arg1, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method3745(int arg0) {
        field9220 = null;
        if (arg0 == 25678) {
            field9214 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lkv;Lb;)V")
    public class653(class280 arg0, class350 arg1) {
        super(arg0);
        this.field9202 = arg1;
        if (super.field9618.field4298 && ~super.field9618.field4205 <= -3) {
            this.field9210 = class738.method4135("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 65534, 34336, super.field9618);
            if (this.field9210 != null) {
                int[][] var3 = class724.method4077(256, 0, false, 4, 4, (byte) 37, 64, 3, 0.4F);
                int[][] var4 = class724.method4077(256, 8, false, 4, 4, (byte) 103, 64, 3, 0.4F);
                int var5 = 0;
                this.field9211 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field9211[var5++] = (float) var7[var9] / 4096.0F;
                        this.field9211[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3741((byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lfia;IZ)V")
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        ++field9221;
        super.field9618.method1840(arg0, 2205);
        super.field9618.method1889(false, arg1);
        if (!arg2) {
            this.field9212 = -7;
        }
    }
}
