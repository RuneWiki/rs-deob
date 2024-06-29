import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class164 extends class503 {

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Z")
    private boolean field2150;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lth;")
    private class405 field2140;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lth;")
    private class405 field2148;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lth;")
    private class405 field2143;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lth;")
    private class405 field2149;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lts;")
    public static class356 field2146 = null;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    private boolean field2142;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Z")
    private boolean field2145;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 6)
    public final void method629(byte arg0) {
        if (this.field2142) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2142 = false;
        }
        if (arg0 != -122) {
            this.field2150 = true;
        }
        ++field2155;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZZ)Z", line = 27)
    public static boolean method1036(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 35)
    public final void method1037(byte arg0) {
        class416.field6160[3] = (float) super.field7679.field7422;
        ++field2144;
        OpenGL.glTexGenfv(8192, 9474, class416.field6160, 0);
        if (!this.field2145) {
            OpenGL.glBindProgramARB(34336, super.field7679.field7422 != Integer.MAX_VALUE ? this.field2143.field5944 : this.field2140.field5944);
        } else {
            OpenGL.glBindProgramARB(34336, super.field7679.field7422 == Integer.MAX_VALUE ? this.field2148.field5944 : this.field2149.field5944);
        }
        if (arg0 > -99) {
            field2152 = 24;
        }
        OpenGL.glEnable(34336);
        this.field2142 = true;
        this.method1039(-768);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 60)
    public static void method1038(boolean arg0) {
        field2146 = null;
        if (!arg0) {
            method1040((byte) 112, '-');
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 71)
    public final void method1039(int arg0) {
        if (this.field2142) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field7679.field7449 + -1280), (float) (super.field7679.field7449 + -768), 1.0F / (float) super.field7679.field7438, (float) super.field7679.field7411 / 255.0F);
        }
        ++field2141;
        if (arg0 != -768) {
            this.method1039(-100);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Z", line = 87)
    public final boolean method623(byte arg0) {
        if (arg0 < 45) {
            return true;
        } else {
            ++field2154;
            return this.field2150;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 98)
    public final void method624(int arg0, int arg1, int arg2) {
        ++field2139;
        int var4 = -19 / (arg0 / 59);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V", line = 108)
    public final void method625(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field2151;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BC)B", line = 122)
    public static final byte method1040(byte arg0, char arg1) {
        ++field2147;
        if (arg0 != -103) {
            method1038(false);
        }
        byte var2;
        if ((~arg1 >= -1 || arg1 >= 128) && (~arg1 > -161 || ~arg1 < -256)) {
            if (arg1 != 8364) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (~arg1 != -403) {
                    if (arg1 != 8222) {
                        if (arg1 != 8230) {
                            if (arg1 != 8224) {
                                if (~arg1 != -8226) {
                                    if (arg1 != 710) {
                                        if (arg1 == 8240) {
                                            var2 = -119;
                                        } else if (arg1 == 352) {
                                            var2 = -118;
                                        } else if (~arg1 != -8250) {
                                            if (~arg1 != -339) {
                                                if (arg1 == 381) {
                                                    var2 = -114;
                                                } else if (arg1 == 8216) {
                                                    var2 = -111;
                                                } else if (arg1 != 8217) {
                                                    if (arg1 == 8220) {
                                                        var2 = -109;
                                                    } else if (arg1 != 8221) {
                                                        if (~arg1 != -8227) {
                                                            if (~arg1 == -8212) {
                                                                var2 = -106;
                                                            } else if (arg1 != 8212) {
                                                                if (~arg1 != -733) {
                                                                    if (arg1 != 8482) {
                                                                        if (~arg1 != -354) {
                                                                            if (arg1 != 8250) {
                                                                                if (~arg1 == -340) {
                                                                                    var2 = -100;
                                                                                } else if (~arg1 != -383) {
                                                                                    if (arg1 != 376) {
                                                                                        var2 = 63;
                                                                                    } else {
                                                                                        var2 = -97;
                                                                                    }
                                                                                } else {
                                                                                    var2 = -98;
                                                                                }
                                                                            } else {
                                                                                var2 = -101;
                                                                            }
                                                                        } else {
                                                                            var2 = -102;
                                                                        }
                                                                    } else {
                                                                        var2 = -103;
                                                                    }
                                                                } else {
                                                                    var2 = -104;
                                                                }
                                                            } else {
                                                                var2 = -105;
                                                            }
                                                        } else {
                                                            var2 = -107;
                                                        }
                                                    } else {
                                                        var2 = -108;
                                                    }
                                                } else {
                                                    var2 = -110;
                                                }
                                            } else {
                                                var2 = -116;
                                            }
                                        } else {
                                            var2 = -117;
                                        }
                                    } else {
                                        var2 = -120;
                                    }
                                } else {
                                    var2 = -121;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -124;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)Z", line = 249)
    public static final boolean method1041(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            ++field2157;
            return (arg0 & 16) != 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lrl;)V", line = 260)
    public class164(class487 arg0) {
        super(arg0);
        if (!super.field7679.field7447) {
            this.field2150 = false;
        } else {
            this.field2140 = class100.method606(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -25535, super.field7679);
            this.field2148 = class100.method606(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -25535, super.field7679);
            this.field2143 = class100.method606(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -25535, super.field7679);
            this.field2149 = class100.method606(34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -25535, super.field7679);
            this.field2150 = this.field2149 != null & this.field2143 != null & this.field2140 != null & this.field2148 != null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLtu;)V", line = 279)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        ++field2153;
        if (arg1 >= -21) {
            this.field2148 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V", line = 291)
    public final void method627(boolean arg0, int arg1) {
        this.field2145 = arg0;
        ++field2156;
        if (arg1 != -1805) {
            this.field2142 = true;
        }
    }
}
