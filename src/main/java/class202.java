import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class202 extends class106 {

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "Lpo;")
    private class389 field2961;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "Ltq;")
    private class442 field2958;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "[F")
    private float[] field2948;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "[I")
    public static int[] field2957 = new int[1000];

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field2949 = -50;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "[C")
    public static char[] field2959 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2955 = null;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    private int field2954;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Lsc;")
    private class229 field2950;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[Lf;")
    public static class529[] field2947;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
    public static void method1394(boolean arg0) {
        if (!arg0) {
            field2959 = null;
            field2947 = null;
            field2955 = null;
            field2957 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        ++field2962;
        if (arg1 <= 102) {
            field2947 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        ++field2964;
        if (this.field2950 != null) {
            this.field2950.method1494('\u0000', false);
            super.field1770.method1929(arg1, (byte) 76);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1770.field4541.method1599(16383), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1770.method1929(0, (byte) 100);
            if (~super.field1770.field4490 != ~this.field2954) {
                int var3 = super.field1770.field4490 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2948, var4);
                    var4 += 2;
                }
                if (this.field2961.field5850) {
                    float var6 = (float) (super.field1770.field4490 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field2954 = super.field1770.field4490;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        ++field2951;
        super.field1770.method1990(arg2, 11864);
        super.field1770.method1989(-24145, arg1);
        if (arg0 != 128) {
            this.field2954 = 95;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field2953;
        return arg0 != -22884 ? true : true;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        ++field2952;
        if (this.field2950 != null) {
            this.field2950.method1494('\u0001', false);
            if (arg0 == 3) {
                super.field1770.method1929(1, (byte) 121);
                super.field1770.method1990((class492) null, 11864);
                super.field1770.method1929(0, (byte) 90);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    private final void method1395(byte arg0) {
        if (arg0 != 22) {
            this.field2961 = null;
        }
        this.field2950 = new class229(super.field1770, 2);
        ++field2963;
        this.field2950.method1495(0, (byte) -115);
        super.field1770.method1929(1, (byte) 113);
        super.field1770.method1953(-28487, -16777216);
        super.field1770.method1951((byte) -17, 260, 7681);
        super.field1770.method1952(770, 34166, 127, 0);
        super.field1770.method1929(0, (byte) 65);
        OpenGL.glBindProgramARB(34336, this.field2958.field6611);
        OpenGL.glEnable(34336);
        this.field2950.method1493((byte) -97);
        this.field2950.method1495(1, (byte) -115);
        super.field1770.method1929(1, (byte) 76);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field1770.method1989(-24145, 0);
        super.field1770.method1952(770, 5890, arg0 + 103, 0);
        super.field1770.method1929(0, (byte) 75);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2950.method1493((byte) -122);
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        ++field2956;
        if (class258.field3752 > arg0) {
            int var1 = 0;
            for (int var2 = 0; ~var2 > ~class328.field4958.length; ++var2) {
                if (class328.field4958[var2].startsWith("--> ")) {
                    ++var1;
                    if (class258.field3752 == var1) {
                        class370.field5609 = class328.field4958[var2].substring(4);
                        return;
                    }
                }
            }
        } else {
            class370.field5609 = "";
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lvj;Lpo;)V")
    public class202(class303 arg0, class389 arg1) {
        super(arg0);
        this.field2961 = arg1;
        if (super.field1770.field4546 && super.field1770.field4598 >= 2) {
            this.field2958 = class210.method1418(super.field1770, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, 93);
            if (this.field2958 != null) {
                int[][] var3 = class404.method2470(0, 8, 0, 256, 0.4F, false, 3, 4, 64);
                int[][] var4 = class404.method2470(8, 8, 0, 256, 0.4F, false, 3, 4, 64);
                this.field2948 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field2948[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2948[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1395((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        ++field2960;
        if (this.field2950 != null) {
            super.field1770.method1929(1, (byte) 91);
            if ((128 & arg0) == 0) {
                if (!this.field2961.field5850) {
                    int var4 = super.field1770.field4490 % 4000 * 16 / 4000;
                    super.field1770.method1990(this.field2961.field5845[var4], 11864);
                } else {
                    super.field1770.method1990(this.field2961.field5856, 11864);
                }
            } else {
                super.field1770.method1990((class492) null, arg1 + 11821);
            }
            super.field1770.method1929(0, (byte) 104);
            if (arg1 != 43) {
                field2957 = null;
            }
            if (~(64 & arg0) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class130.field2073, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class130.field2073, 0);
            }
            int var5 = 3 & arg0;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
