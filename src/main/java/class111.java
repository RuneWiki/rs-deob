import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class111 extends class190 {

    @OriginalMember(owner = "client!np", name = "v", descriptor = "Llm;")
    private class307 field1841;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lrv;")
    private class284 field1829;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "[F")
    private float[] field1835;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Luaa;")
    public static class395 field1831 = new class395(4);

    @OriginalMember(owner = "client!np", name = "r", descriptor = "Luaa;")
    public static class395 field1837 = new class395(64);

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Liu;")
    public static class517 field1842 = new class517(93, 3);

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "F")
    private float field1844;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "Lab;")
    private class290 field1834;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Lgp;")
    public static class561 field1843;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "[I")
    public static int[] field1846;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method919(boolean arg0, byte arg1) {
        ++field1840;
        if (this.field1834 != null) {
            this.field1834.method1835((byte) -123, '\u0000');
            super.field2722.method654(false, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2722.field1236.method1577((byte) 3), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2722.method654(false, 0);
            int var3 = 12 % ((-55 - arg1) / 47);
            if (super.field2722.field1135 != this.field1836) {
                int var4 = super.field2722.field1135 % 5120 * 128 / 5120;
                int var5 = var4 * 128;
                for (int var6 = 0; ~var6 > -65; ++var6) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var6, this.field1835, var5);
                    var5 += 2;
                }
                if (this.field1841.field4419) {
                    this.field1844 = (float) (super.field2722.field1135 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field1836 = super.field2722.field1135;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 53)
    private final void method920(int arg0) {
        this.field1834 = new class290(super.field2722, 2);
        ++field1838;
        this.field1834.method1833((byte) 127, 0);
        super.field2722.method654(false, 1);
        super.field2722.method549((byte) 126, -16777216);
        super.field2722.method656(-12645, 7681, 260);
        super.field2722.method643(770, 0, -31364, 34166);
        super.field2722.method654(false, 0);
        OpenGL.glBindProgramARB(34336, this.field1829.field4140);
        OpenGL.glEnable(34336);
        this.field1834.method1838(0);
        this.field1834.method1833((byte) 120, 1);
        super.field2722.method654(false, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2722.method634(arg0 + -117, 0);
        super.field2722.method643(770, 0, arg0 + -31364, 5890);
        super.field2722.method654(false, arg0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1834.method1838(arg0);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljj;Llm;)V", line = 83)
    public class111(class66 arg0, class307 arg1) {
        super(arg0);
        this.field1841 = arg1;
        if (super.field2722.field1263 && super.field2722.field1227 >= 2) {
            this.field1829 = class169.method1170(34336, super.field2722, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -1);
            if (this.field1829 != null) {
                int[][] var3 = class516.method2900(256, false, 0.4F, 0, 3, 8, 64, 0, 4);
                int[][] var4 = class516.method2900(256, false, 0.4F, 0, 3, 8, 64, 8, 4);
                this.field1835 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field1835[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1835[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method920(0);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V", line = 134)
    public final void method921(boolean arg0, int arg1) {
        if (arg1 != 25747) {
            this.method925(70, 71, -28);
        }
        ++field1828;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)Leg;", line = 151)
    public static final class48 method922(int arg0, byte arg1) {
        ++field1826;
        class48 var2 = (class48) class146.field2244.method2407(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class313.field4567.method3175(arg0, (byte) -53, 0);
            class48 var4 = new class48();
            if (arg1 > -1) {
                field1843 = null;
            }
            if (var3 != null) {
                var4.method433(new class268(var3), -1);
            }
            var4.method430((byte) -122);
            class146.field2244.method2408(var4, (long) arg0, -125);
            return var4;
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V", line = 178)
    public static void method923(int arg0) {
        field1846 = null;
        field1837 = null;
        if (arg0 == 3) {
            field1831 = null;
            field1842 = null;
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I", line = 195)
    public static final int method924(int arg0) {
        if (arg0 > -83) {
            return -71;
        } else {
            ++field1832;
            return class507.field7055;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V", line = 206)
    public final void method925(int arg0, int arg1, int arg2) {
        ++field1839;
        if (this.field1834 != null) {
            super.field2722.method654(false, 1);
            if ((arg0 & 128) != arg1) {
                super.field2722.method648(117, (class222) null);
            } else if (~(1 & arg2) == -2) {
                if (!this.field1841.field4419) {
                    int var4 = super.field2722.field1135 % 4000 * 16 / 4000;
                    super.field2722.method648(-77, this.field1841.field4420[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field2722.method648(arg1 + 86, this.field1841.field4413);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field1844, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field1841.field4419) {
                    super.field2722.method648(-21, this.field1841.field4420[0]);
                } else {
                    super.field2722.method648(arg1 ^ -107, this.field1841.field4413);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2722.method654(false, 0);
            if (~(arg0 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class416.field6127, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class416.field6127, 0);
            }
            int var5 = arg0 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 272)
    public final void method926(byte arg0) {
        ++field1827;
        if (this.field1834 != null) {
            this.field1834.method1835((byte) -99, '\u0001');
            super.field2722.method654(false, 1);
            super.field2722.method648(82, (class222) null);
            super.field2722.method654(false, 0);
            if (arg0 >= -102) {
                this.field1829 = null;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILaba;I)V", line = 290)
    public final void method927(int arg0, class222 arg1, int arg2) {
        super.field2722.method648(114, arg1);
        ++field1830;
        if (arg2 == 20731) {
            super.field2722.method634(arg2 ^ 20621, arg0);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)Z", line = 310)
    public final boolean method928(int arg0) {
        int var2 = 110 / ((arg0 - -7) / 57);
        ++field1833;
        return true;
    }
}
