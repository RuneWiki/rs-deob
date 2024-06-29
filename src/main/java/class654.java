import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class654 extends class631 {

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Z")
    private boolean field8984 = false;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Z")
    private boolean field8980;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lpo;")
    private class558 field8966;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Lpo;")
    private class558 field8985;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lpo;")
    private class558 field8967;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Lpo;")
    private class558 field8983;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lmfa;")
    private class615 field8978;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lqfa;")
    public static class98 field8969 = new class98(93, 2);

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lqfa;")
    public static class98 field8986 = new class98(77, 1);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Lnga;")
    public static class513 field8979;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    private boolean field8961;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
    private boolean field8968;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 3)
    public final void method1513(int arg0) {
        ++field8964;
        if (this.field8968) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8968 = false;
        }
        super.field8722.method884(1, true);
        if (arg0 > 74) {
            super.field8722.method926((class210) null, 74);
            super.field8722.method946(false, 8448, 8448);
            super.field8722.method883((byte) 34, 0, 768, 5890);
            super.field8722.method883((byte) 34, 2, 770, 34166);
            super.field8722.method948(5890, 0, 770, (byte) -95);
            super.field8722.method884(0, true);
            if (this.field8984) {
                super.field8722.method883((byte) 34, 0, 768, 5890);
                super.field8722.method948(5890, 0, 770, (byte) 73);
                this.field8984 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZZ)V", line = 35)
    public final void method1509(boolean arg0, boolean arg1) {
        this.field8961 = arg1;
        ++field8962;
        super.field8722.method884(1, arg0);
        super.field8722.method926(this.field8978, 59);
        super.field8722.method946(!arg0, 34165, 7681);
        super.field8722.method883((byte) 34, 0, 768, 34166);
        super.field8722.method883((byte) 34, 2, 770, 5890);
        super.field8722.method948(34168, 0, 770, (byte) 80);
        super.field8722.method884(0, arg0);
        this.method3598((byte) -87);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V", line = 54)
    public final void method3594(int arg0) {
        ++field8981;
        if (arg0 != 34336) {
            this.field8961 = true;
        }
        if (this.field8968) {
            int var2 = super.field8722.method434();
            int var3 = super.field8722.method387();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field8722.field1883, (float) super.field8722.field1928 / 255.0F);
            super.field8722.method884(1, true);
            super.field8722.method933(super.field8722.field1922, (byte) 28);
            super.field8722.method884(0, true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILta;)V", line = 82)
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field8972;
        if (arg2 != null) {
            if (this.field8984) {
                super.field8722.method883((byte) 34, 0, 768, 5890);
                super.field8722.method948(5890, 0, 770, (byte) -100);
                this.field8984 = false;
            }
            super.field8722.method926(arg2, 87);
            super.field8722.method891(arg0, (byte) 17);
        } else if (!this.field8984) {
            super.field8722.method926(super.field8722.field1838, 112);
            super.field8722.method891(1, (byte) 17);
            super.field8722.method883((byte) 34, 0, 768, 34168);
            super.field8722.method948(34168, 0, 770, (byte) 118);
            this.field8984 = true;
        }
        int var4 = 107 % ((52 - arg1) / 62);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 118)
    public static final String method3595(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field8976;
            return !class436.field6192 && class231.field3108 != null ? class231.field3108.field459 : "";
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILka;IIB)Lkj;", line = 133)
    public static final class566 method3596(int arg0, class471 arg1, int arg2, int arg3, byte arg4) {
        ++field8982;
        if (arg4 != 14) {
            return null;
        } else {
            return arg1 == null ? null : new class566(arg2, arg0, arg3, arg1.method266(), arg1.method234(), arg1.method259(), arg1.method253(), arg1.method222(), arg1.method260(), arg1.method245());
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIII)V", line = 156)
    public static final void method3597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8973;
        if (~arg2 == ~arg3 && ~arg5 == ~arg9 && arg7 == arg8 && arg1 == arg6) {
            class172.method1109(arg9, arg2, arg6, arg4, arg8, arg0 + 41);
        } else {
            int var10 = arg2;
            int var11 = arg9;
            int var12 = arg2 * 3;
            int var13 = arg9 * 3;
            int var14 = arg3 * 3;
            int var15 = arg5 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = -arg2 + var14 + -var16 + arg8;
            int var19 = -var17 - -var15 + arg6 + -arg9;
            int var20 = -var14 + var12 + var16 - var14;
            int var21 = -var15 + var13 + var17 - var15;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 - -(var27 + var29 + var31 >> 12);
                int var34 = arg9 - -(var28 + var32 - -var30 >> 12);
                class172.method1109(var11, var10, var34, arg4, var33, 120);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 != 3) {
            field8969 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V", line = 231)
    public final void method1512(int arg0, int arg1, int arg2) {
        if (arg1 > 72) {
            ++field8965;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Leea;)V", line = 244)
    public class654(class131 arg0) {
        super(arg0);
        if (!super.field8722.field1921) {
            this.field8980 = false;
        } else {
            this.field8966 = class210.method1294(true, 34336, super.field8722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8985 = class210.method1294(true, 34336, super.field8722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            this.field8967 = class210.method1294(true, 34336, super.field8722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            this.field8983 = class210.method1294(true, 34336, super.field8722, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (this.field8983 != null & this.field8967 != null & this.field8985 != null & this.field8966 != null) {
                this.field8978 = new class615(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field8978.method3445(false, false, 107);
                this.field8980 = true;
            } else {
                this.field8980 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 272)
    public final void method3598(byte arg0) {
        ++field8971;
        if (arg0 <= -11) {
            class55 var2 = super.field8722.field1822;
            if (!this.field8961) {
                OpenGL.glBindProgramARB(34336, ~super.field8722.field1903 != Integer.MIN_VALUE ? this.field8967.field7837 : this.field8966.field7837);
            } else {
                OpenGL.glBindProgramARB(34336, super.field8722.field1903 == Integer.MAX_VALUE ? this.field8985.field7837 : this.field8983.field7837);
            }
            var2.method341((float) super.field8722.field1903, -1.0F, class420.field5925, 0.0F, 0.0F, (byte) 124);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class420.field5925[0], class420.field5925[1], class420.field5925[2], class420.field5925[3]);
            OpenGL.glEnable(34336);
            this.field8968 = true;
            this.method3594(34336);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 303)
    public final void method1506(int arg0, boolean arg1) {
        ++field8977;
        if (arg0 != 17660) {
            method3600(81);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)I", line = 316)
    public static final int method3599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8970;
        if (~(1 & arg6) == -2) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        if (arg1 != 31172) {
            method3599(-11, -82, 79, -8, 12, 95, -119);
        }
        int var8 = arg5 & 3;
        if (var8 == 0) {
            return arg4;
        } else if (~var8 == -2) {
            return -arg3 + 8 + -arg0;
        } else {
            return ~var8 == -3 ? -arg2 - -1 + -arg4 + 7 : arg3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z", line = 350)
    public final boolean method1507(byte arg0) {
        int var2 = 92 % ((-9 - arg0) / 53);
        ++field8975;
        return this.field8980;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V", line = 361)
    public static void method3600(int arg0) {
        if (arg0 < 23) {
            method3595(true);
        }
        field8969 = null;
        field8979 = null;
        field8986 = null;
    }
}
