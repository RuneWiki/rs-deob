import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class413 extends class363 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ldd;")
    private class495 field6203;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Ldd;")
    private class495 field6202;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Ldd;")
    private class495 field6205;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Ldd;")
    private class495 field6204;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Z")
    private boolean field6210;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field6213 = -1;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
    public static int[] field6201 = new int[2];

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Z")
    private boolean field6217;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Z")
    private boolean field6218;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V")
    public final void method125(boolean arg0, int arg1) {
        if (arg1 >= -69) {
            this.field6210 = true;
        }
        this.field6218 = arg0;
        ++field6208;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field6211;
        if (this.field6217) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6217 = false;
        }
        if (arg0) {
            method2487(false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZB)V")
    public final void method122(boolean arg0, byte arg1) {
        ++field6200;
        if (arg1 != 52) {
            this.method120(false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljk;IB)V")
    public final void method121(class446 arg0, int arg1, byte arg2) {
        if (arg2 > -69) {
            method2482((byte) 114, 82, -70);
        }
        ++field6206;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)Z")
    public static final boolean method2482(byte arg0, int arg1, int arg2) {
        if (arg0 <= 4) {
            return false;
        } else {
            ++field6219;
            return class385.method2354(arg2, arg1, (byte) -123) & class394.method2391(arg1, arg2, true);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public final void method2483(byte arg0) {
        if (this.field6217) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field5564.field5343 - 1280), (float) (super.field5564.field5343 + -768), 1.0F / (float) super.field5564.field5336, (float) super.field5564.field5259 / 255.0F);
        }
        ++field6209;
        if (arg0 < 50) {
            method2482((byte) -76, 102, -29);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZLje;Lea;ILvg;ILjava/lang/String;Loa;I)V")
    public static final void method2484(int arg0, int arg1, int arg2, boolean arg3, class275 arg4, class381 arg5, int arg6, class38 arg7, int arg8, String arg9, class489 arg10, int arg11) {
        ++field6207;
        int var12;
        if (~class140.field2103 == -5) {
            var12 = 16383 & (int) class382.field5792;
        } else {
            var12 = 16383 & (int) class382.field5792 - -class289.field4132;
        }
        int var13 = Math.max(arg7.field553 / 2, arg7.field472 / 2) + 10;
        int var14 = arg8 * arg8 + arg11 * arg11;
        if (~(var13 * var13) <= ~var14) {
            int var15 = class457.field6760[var12];
            int var16 = class457.field6759[var12];
            if (~class140.field2103 != -5) {
                var16 = var16 * 256 / (class410.field6171 + 256);
                var15 = var15 * 256 / (class410.field6171 + 256);
            }
            int var17 = arg11 * var15 - -(arg8 * var16) >> 15;
            int var18 = arg11 * var16 + -(arg8 * var15) >> 15;
            int var19 = arg4.method1806(100, (class529[]) null, -1, arg9);
            int var20 = var17 - var19 / 2;
            int var21 = arg4.method1800(0, arg3, arg9, (class529[]) null, 100);
            if (~var20 <= ~(-arg7.field553) && ~var20 >= ~arg7.field553 && -arg7.field472 <= var18 && ~var18 >= ~arg7.field472) {
                arg10.method2902(0, 0, arg0, 1, (int[]) null, 50, (class529[]) null, arg2, arg5, var19, (byte) -95, arg7.field553 / 2 + var20 + arg1, arg9, arg7.field472 / 2 + arg2 + -var18 - (arg6 + var21), 0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2485(boolean arg0, int arg1, int arg2) {
        ++field6212;
        if (!arg0) {
            return true;
        } else {
            return (32768 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        ++field6216;
        int var2 = 32 % ((37 - arg0) / 48);
        return this.field6210;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2486(String arg0, int arg1) {
        ++field6214;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~class315.field4496 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class474.field6980[var2])) {
                    return var2;
                }
            }
            if (arg1 != 2) {
                method2484(-62, 66, 49, false, (class275) null, (class381) null, 34, (class38) null, -85, (String) null, (class489) null, -54);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lod;)V")
    public class413(class349 arg0) {
        super(arg0);
        if (super.field5564.field5279) {
            this.field6203 = class303.method1907(super.field5564, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, (byte) 123);
            this.field6202 = class303.method1907(super.field5564, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, (byte) 117);
            this.field6205 = class303.method1907(super.field5564, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, (byte) 126);
            this.field6204 = class303.method1907(super.field5564, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, (byte) 109);
            this.field6210 = this.field6204 != null & this.field6205 != null & this.field6203 != null & this.field6202 != null;
        } else {
            this.field6210 = false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
    public static void method2487(boolean arg0) {
        if (arg0) {
            field6213 = 42;
        }
        field6201 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        if (arg1 > -13) {
            this.field6205 = null;
        }
        ++field6199;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)V")
    public final void method2488(boolean arg0) {
        ++field6215;
        class357.field5479[3] = (float) super.field5564.field5272;
        OpenGL.glTexGenfv(8192, 9474, class357.field5479, 0);
        if (!this.field6218) {
            OpenGL.glBindProgramARB(34336, super.field5564.field5272 != Integer.MAX_VALUE ? this.field6205.field7318 : this.field6203.field7318);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field5564.field5272 != Integer.MIN_VALUE ? this.field6204.field7318 : this.field6202.field7318);
        }
        OpenGL.glEnable(34336);
        this.field6217 = arg0;
        this.method2483((byte) 96);
    }
}
