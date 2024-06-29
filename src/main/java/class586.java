import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class586 extends class692 {

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Z")
    private boolean field8422 = false;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "Lhu;")
    private class702 field8434;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Lhu;")
    private class702 field8432;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Lhu;")
    private class702 field8425;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Lhu;")
    private class702 field8429;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "Lwi;")
    private class504 field8426;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Z")
    private boolean field8436;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field8428 = new String[200];

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field8418 = 0;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field8417 = 0;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Z")
    private boolean field8421;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
    private boolean field8424;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 4)
    public final void method1111(byte arg0) {
        if (this.field8421) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8421 = false;
        }
        ++field8423;
        super.field9753.method3321(1, -19587);
        super.field9753.method3384((class377) null, (byte) 113);
        super.field9753.method3359(8448, 8448, true);
        super.field9753.method3351(768, 0, 5890, (byte) -85);
        super.field9753.method3351(770, 2, 34166, (byte) -85);
        super.field9753.method3374(0, 770, 5890, -87);
        super.field9753.method3321(0, -19587);
        if (arg0 == 114) {
            if (this.field8422) {
                super.field9753.method3351(768, 0, 5890, (byte) -85);
                super.field9753.method3374(0, 770, 5890, 92);
                this.field8422 = false;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILfga;I)V", line = 37)
    public final void method1119(int arg0, class377 arg1, int arg2) {
        ++field8420;
        if (arg1 != null) {
            if (this.field8422) {
                super.field9753.method3351(768, 0, 5890, (byte) -85);
                super.field9753.method3374(0, 770, 5890, 109);
                this.field8422 = false;
            }
            super.field9753.method3384(arg1, (byte) 75);
            super.field9753.method3375(arg2, (byte) 102);
        } else if (!this.field8422) {
            super.field9753.method3384(super.field9753.field8223, (byte) 49);
            super.field9753.method3375(1, (byte) 102);
            super.field9753.method3351(768, 0, 34168, (byte) -85);
            super.field9753.method3374(0, 770, 34168, 102);
            this.field8422 = true;
        }
        if (arg0 <= 48) {
            this.method3441(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI)V", line = 73)
    public final void method1113(int arg0, boolean arg1, int arg2) {
        ++field8419;
        if (!arg1) {
            method3443(98);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V", line = 86)
    public static final void method3439(int arg0, int arg1) {
        class61.field942 = arg1;
        if (arg0 != -1) {
            field8433 = -111;
        }
        ++field8435;
        class87.field1292.method2881((byte) -56);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V", line = 101)
    public final void method1117(boolean arg0, byte arg1) {
        ++field8430;
        if (arg1 != 57) {
            this.field8432 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V", line = 119)
    public final void method1118(boolean arg0, int arg1) {
        ++field8416;
        this.field8424 = arg0;
        super.field9753.method3321(1, -19587);
        super.field9753.method3384(this.field8426, (byte) 90);
        super.field9753.method3359(34165, 7681, true);
        if (arg1 == -3826) {
            super.field9753.method3351(768, 0, 34166, (byte) -85);
            super.field9753.method3351(770, 2, 5890, (byte) -85);
            super.field9753.method3374(0, 770, 34168, 41);
            super.field9753.method3321(0, arg1 ^ 17011);
            this.method3441(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 139)
    public final void method3440(int arg0) {
        ++field8414;
        if (this.field8421) {
            int var2 = super.field9753.method445();
            int var3 = super.field9753.method462();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9753.field8252, (float) super.field9753.field8226 / 255.0F);
            super.field9753.method3321(1, -19587);
            super.field9753.method3343(super.field9753.field8199, arg0 ^ 20711);
            super.field9753.method3321(0, -19587);
        }
        if (arg0 != 1) {
            this.method1113(-36, true, 115);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Llea;)V", line = 172)
    public class586(class573 arg0) {
        super(arg0);
        if (super.field9753.field8279) {
            this.field8434 = class696.method3911(34336, (byte) 100, super.field9753, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8432 = class696.method3911(34336, (byte) 16, super.field9753, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8425 = class696.method3911(34336, (byte) 86, super.field9753, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field8429 = class696.method3911(34336, (byte) 81, super.field9753, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field8432 != null & this.field8434 != null & this.field8425 != null & this.field8429 != null) {
                this.field8426 = new class504(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field8426.method2952(false, false, false);
                this.field8436 = true;
            } else {
                this.field8436 = false;
            }
        } else {
            this.field8436 = false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 205)
    public final void method3441(boolean arg0) {
        ++field8415;
        class229 var2 = super.field9753.field8168;
        if (this.field8424) {
            OpenGL.glBindProgramARB(34336, ~super.field9753.field8171 == Integer.MIN_VALUE ? this.field8432.field9841 : this.field8429.field9841);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field9753.field8171 == Integer.MIN_VALUE ? this.field8434.field9841 : this.field8425.field9841);
        }
        var2.method1574(0.0F, (float) super.field9753.field8171, class433.field6047, -1.0F, 0.0F, (byte) -34);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class433.field6047[0], class433.field6047[1], class433.field6047[2], class433.field6047[3]);
        OpenGL.glEnable(34336);
        this.field8421 = arg0;
        this.method3440(1);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([Luf;IZ)V", line = 228)
    public static final void method3442(class519[] arg0, int arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            class519 var4 = arg0[var3];
            if (var4 != null && ~var4.field7223 == ~arg1 && !client.method901(var4)) {
                if (~var4.field7190 == -1) {
                    method3442(arg0, var4.field7247, arg2);
                    if (var4.field7170 != null) {
                        method3442(var4.field7170, var4.field7247, false);
                    }
                    class27 var5 = (class27) class37.field437.method4253((long) var4.field7247, -1);
                    if (var5 != null) {
                        class538.method3124(true, var5.field284);
                    }
                }
                if (var4.field7190 == 6 && var4.field7219 != -1) {
                    class98 var6 = class168.field2552.method3287(87, var4.field7219);
                    if (var6 != null) {
                        var4.field7258 += class662.field9326;
                        int var7 = var4.field7275;
                        while (~var4.field7258 < ~var6.field1388[var4.field7275]) {
                            var4.field7258 -= var6.field1388[var4.field7275];
                            ++var4.field7275;
                            if (~var6.field1402.length >= ~var4.field7275) {
                                var4.field7275 -= var6.field1411;
                                if (var4.field7275 < 0 || ~var6.field1402.length >= ~var4.field7275) {
                                    var4.field7275 = 0;
                                }
                            }
                            var4.field7152 = var4.field7275 - -1;
                            if (~var4.field7152 <= ~var6.field1402.length) {
                                var4.field7152 -= var6.field1411;
                                if (var4.field7152 < 0 || ~var6.field1402.length >= ~var4.field7152) {
                                    var4.field7152 = -1;
                                }
                            }
                            class172.method1268(var4, -120);
                        }
                        if (var4.field7275 != var7) {
                            class354.method2142(255, var4.field7275, var6);
                        }
                    }
                }
            }
        }
        if (arg2) {
            method3442((class519[]) null, 50, false);
        }
        ++field8413;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V", line = 326)
    public static void method3443(int arg0) {
        if (arg0 < 106) {
            field8418 = 116;
        }
        field8428 = null;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z", line = 338)
    public final boolean method1112(int arg0) {
        ++field8427;
        if (arg0 >= -124) {
            this.field8432 = null;
        }
        return this.field8436;
    }
}
