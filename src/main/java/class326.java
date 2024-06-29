import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class326 extends class159 {

    @OriginalMember(owner = "client!as", name = "p", descriptor = "Lcd;")
    private class23 field4504;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Lam;")
    private class56 field4509;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "[F")
    private float[] field4508;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "F")
    private float field4497;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Lhq;")
    private class367 field4507;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V", line = 7)
    private final void method2082(byte arg0) {
        this.field4507 = new class367(super.field2221, 2);
        ++field4505;
        this.field4507.method2311(true, 0);
        super.field2221.method3738((byte) -63, 1);
        super.field2221.method3752(-16777216, (byte) 123);
        super.field2221.method3729((byte) 95, 260, 7681);
        super.field2221.method3715(34166, 770, 0, (byte) -84);
        super.field2221.method3738((byte) -63, 0);
        OpenGL.glBindProgramARB(34336, this.field4509.field789);
        OpenGL.glEnable(34336);
        this.field4507.method2314((byte) -95);
        this.field4507.method2311(true, 1);
        super.field2221.method3738((byte) -63, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2221.method3720(-26014, 0);
        int var2 = 13 / ((-32 - arg0) / 60);
        super.field2221.method3715(5890, 770, 0, (byte) -96);
        super.field2221.method3738((byte) -63, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field4507.method2314((byte) -111);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z", line = 39)
    public final boolean method372(boolean arg0) {
        if (!arg0) {
            this.method373(false, (byte) -119);
        }
        ++field4510;
        return true;
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Ldaa;", line = 51)
    public static final class346 method2083(byte arg0) {
        ++field4502;
        class346 var1 = (class346) class747.field10285.method3828(109);
        if (var1 != null) {
            var1.method549(6410);
            var1.method21(117);
            return var1;
        } else if (arg0 > -40) {
            return null;
        } else {
            class346 var2;
            do {
                var2 = (class346) class284.field4101.method3828(87);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method2213((byte) 127) < ~class97.method664((byte) -50)) {
                    return null;
                }
                var2.method549(6410);
                var2.method21(96);
            } while (~(Long.MIN_VALUE & var2.field40) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZII)V", line = 96)
    public final void method367(boolean arg0, int arg1, int arg2) {
        ++field4506;
        if (this.field4507 != null) {
            super.field2221.method3738((byte) -63, 1);
            if ((arg1 & 128) != 0) {
                super.field2221.method3681((class559) null, 0);
            } else if ((arg2 & 1) == 1) {
                if (!this.field4504.field284) {
                    int var4 = super.field2221.field9008 % 4000 * 16 / 4000;
                    super.field2221.method3681(this.field4504.field280[var4], 0);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field2221.method3681(this.field4504.field282, 0);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4497, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field4504.field284) {
                    super.field2221.method3681(this.field4504.field282, 0);
                } else {
                    super.field2221.method3681(this.field4504.field280[0], 0);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2221.method3738((byte) -63, 0);
            if (!arg0) {
                this.field4504 = null;
            }
            if (~(64 & arg1) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class85.field1216[2] = super.field2221.field9091 * super.field2221.field9080;
                class85.field1216[1] = super.field2221.field9091 * super.field2221.field9077;
                class85.field1216[0] = super.field2221.field9107 * super.field2221.field9091;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class85.field1216, 0);
            }
            int var5 = 3 & arg1;
            if (~var5 != -3) {
                if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V", line = 170)
    public final void method369(byte arg0) {
        ++field4503;
        if (this.field4507 != null) {
            this.field4507.method2315(true, '\u0001');
            super.field2221.method3738((byte) -63, 1);
            if (arg0 >= -59) {
                this.field4504 = null;
            }
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3738((byte) -63, 0);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BZ)V", line = 190)
    public final void method370(byte arg0, boolean arg1) {
        ++field4498;
        if (arg0 < 88) {
            this.field4512 = -89;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lwu;II)V", line = 200)
    public final void method368(class559 arg0, int arg1, int arg2) {
        ++field4511;
        if (arg1 != 26264) {
            this.method368((class559) null, 114, 6);
        }
        super.field2221.method3681(arg0, 0);
        super.field2221.method3720(-26014, arg2);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z", line = 213)
    public static final boolean method2084(int arg0, boolean arg1, int arg2) {
        ++field4499;
        if (!arg1) {
            field4500 = 29;
        }
        return class338.method2148(arg0, -110, arg2) | (458752 & arg2) != 0 || class622.method3508(arg2, arg0, -125);
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ldw;Lcd;)V", line = 224)
    public class326(class664 arg0, class23 arg1) {
        super(arg0);
        this.field4504 = arg1;
        if (super.field2221.field9123 && ~super.field2221.field9134 <= -3) {
            this.field4509 = class644.method3597(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field2221, 120);
            if (this.field4509 != null) {
                int[][] var3 = class78.method575(false, 0, 0.4F, 256, false, 4, 3, 4, 64);
                int[][] var4 = class78.method575(false, 8, 0.4F, 256, false, 4, 3, 4, 64);
                int var5 = 0;
                this.field4508 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4508[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4508[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2082((byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)V", line = 272)
    public final void method373(boolean arg0, byte arg1) {
        ++field4501;
        if (this.field4507 != null) {
            this.field4507.method2315(true, '\u0000');
            if (arg1 >= -109) {
                method2083((byte) 54);
            }
            super.field2221.method3738((byte) -63, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2221.field9043.method2926(-4504), 0);
            OpenGL.glMatrixMode(5888);
            super.field2221.method3738((byte) -63, 0);
            if (super.field2221.field9008 != this.field4512) {
                int var3 = super.field2221.field9008 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field4508, var3);
                    var3 += 2;
                }
                if (this.field4504.field284) {
                    this.field4497 = (float) (super.field2221.field9008 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field4512 = super.field2221.field9008;
            }
        }
    }
}
