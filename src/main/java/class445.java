import jaggl.OpenGL;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class445 extends class374 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lbt;")
    private class89 field6532;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lae;")
    private class30 field6531;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[F")
    private float[] field6542;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public static int[] field6544 = new int[16384];

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "[I")
    public static int[] field6545 = new int[16384];

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Lpe;")
    public static class123 field6549;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lpe;")
    public static class123 field6550;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lpe;")
    public static class123 field6551;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Lpe;")
    public static class123 field6552;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Lpe;")
    public static class123 field6553;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lpe;")
    public static class123 field6554;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Lpe;")
    public static class123 field6555;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lpe;")
    public static class123 field6556;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lpe;")
    public static class123 field6557;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lpe;")
    public static class123 field6558;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lpe;")
    public static class123 field6559;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lpe;")
    public static class123 field6560;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "[Lpe;")
    private static class123[] field6561;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    private int field6535;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lce;")
    private class328 field6541;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lok;")
    public static class74 field6548;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6545[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field6544[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field6549 = new class123(14, 1);
        field6550 = new class123(15, 4);
        field6551 = new class123(16, -2);
        field6552 = new class123(17, 0);
        field6553 = new class123(18, -2);
        field6554 = new class123(19, -2);
        field6555 = new class123(20, 6);
        field6556 = new class123(21, 9);
        field6557 = new class123(22, -2);
        field6558 = new class123(23, 4);
        field6559 = new class123(24, -1);
        field6560 = new class123(25, -2);
        field6561 = new class123[32];
        class123[] var3 = class76.method558(3);
        for (int var4 = 0; var4 < var3.length; ++var4) {
            field6561[var3[var4].field1866] = var3[var4];
        }
        field6563 = 52;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 4)
    private final void method2608(boolean arg0) {
        this.field6541 = new class328(super.field5646, 2);
        ++field6538;
        this.field6541.method2036((byte) -107, 0);
        super.field5646.method1553(1, -8156);
        super.field5646.method1579((byte) -61, -16777216);
        super.field5646.method1576(260, 7681, (byte) 117);
        super.field5646.method1556(770, 34166, 0, 34184);
        super.field5646.method1553(0, -8156);
        OpenGL.glBindProgramARB(34336, this.field6531.field432);
        if (!arg0) {
            OpenGL.glEnable(34336);
            this.field6541.method2041((byte) 33);
            this.field6541.method2036((byte) -107, 1);
            super.field5646.method1553(1, -8156);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5646.method1582(0, !arg0);
            super.field5646.method1556(770, 5890, 0, 34184);
            super.field5646.method1553(0, -8156);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field6541.method2041((byte) 33);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z", line = 38)
    public final boolean method21(byte arg0) {
        ++field6547;
        if (arg0 <= 85) {
            field6545 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZZ)V", line = 50)
    public final void method25(boolean arg0, boolean arg1) {
        ++field6537;
        if (this.field6541 != null) {
            this.field6541.method2035(-114, '\u0000');
            super.field5646.method1553(1, -8156);
            if (!arg1) {
                field6559 = null;
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5646.field3816.method2619((byte) 107), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5646.method1553(0, -8156);
            if (~super.field5646.field3703 != ~this.field6535) {
                int var3 = super.field5646.field3703 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field6542, var4);
                    var4 += 2;
                }
                if (!this.field6532.field1386) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field5646.field3703 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field6535 = super.field5646.field3703;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLew;I)V", line = 100)
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        ++field6539;
        super.field5646.method1546(-2, arg1);
        super.field5646.method1582(arg2, arg0);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V", line = 112)
    public static void method2609(boolean arg0) {
        field6549 = null;
        field6561 = null;
        field6545 = null;
        field6558 = null;
        field6555 = null;
        field6556 = null;
        field6560 = null;
        field6557 = null;
        if (arg0) {
            method2609(true);
        }
        field6544 = null;
        field6550 = null;
        field6552 = null;
        field6548 = null;
        field6551 = null;
        field6559 = null;
        field6553 = null;
        field6554 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 137)
    public final void method20(int arg0, int arg1, int arg2) {
        ++field6533;
        if (this.field6541 != null) {
            super.field5646.method1553(1, -8156);
            if ((128 & arg0) != 0) {
                super.field5646.method1546(-2, (class271) null);
            } else if (this.field6532.field1386) {
                super.field5646.method1546(-2, this.field6532.field1389);
            } else {
                int var4 = super.field5646.field3703 % 4000 * 16 / 4000;
                super.field5646.method1546(arg1 + 20855, this.field6532.field1390[var4]);
            }
            super.field5646.method1553(0, -8156);
            if (arg1 != -20857) {
                field6563 = -92;
            }
            if ((64 & arg0) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class310.field4809, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class310.field4809, 0);
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lsh;FFIIIBFIFF)[B", line = 187)
    public static final byte[] method2610(class510 arg0, float arg1, float arg2, int arg3, int arg4, int arg5, byte arg6, float arg7, int arg8, float arg9, float arg10) {
        if (arg6 != 21) {
            return null;
        } else {
            ++field6543;
            byte[] var11 = new byte[arg4 * arg5 * arg8];
            class148.method1074(0, 0, arg8, arg0, arg3, arg9, arg1, arg4, arg5, arg7, var11, arg10, arg2);
            return var11;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBII)I", line = 201)
    public static final int method2611(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -14) {
            method2609(true);
        }
        ++field6536;
        int var4 = -arg2 + 255;
        int var5 = ((65280 & arg3) * arg2 & 16711680 | (16711935 & arg3) * arg2 & -16711936) >>> 8;
        return ((-16711936 & (arg0 & 16711935) * var4 | 16711680 & (arg0 & 65280) * var4) >>> 8) - -var5;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V", line = 220)
    public final void method19(boolean arg0, int arg1) {
        ++field6534;
        if (arg1 >= -2) {
            method2610((class510) null, -0.09367547F, -0.6017999F, 6, -36, 12, (byte) -94, 0.28937232F, 11, -1.3817307F, 0.38879815F);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBZI)V", line = 231)
    public static final void method2612(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        ++field6546;
        if (class237.field3314 != null && (~arg2 != -4 || ~class454.field6661.field982 != ~arg1 || ~class454.field6661.field979 != ~arg5)) {
            class332.method2051(class25.field375, (byte) -99, class237.field3314);
            class237.field3314 = null;
        }
        if (~arg2 == -4 && class237.field3314 == null) {
            class237.field3314 = class426.method2530(class25.field375, (byte) -25, 0, 0, arg5, arg1);
            if (class237.field3314 != null) {
                class454.field6661.field979 = arg5;
                class454.field6661.field982 = arg1;
                class454.field6661.method1532(class25.field375, 2);
            }
        }
        if (arg2 == 3 && class237.field3314 == null) {
            method2612(arg0, -1, class454.field6661.field970, (byte) 8, true, -1);
        } else {
            Container var7;
            if (class237.field3314 == null) {
                if (class176.field2596 != null) {
                    Insets var6 = class176.field2596.getInsets();
                    int var10001 = -var6.right;
                    class455.field6669 = class176.field2596.getSize().width + var10001 + -var6.left;
                    class69.field921 = class176.field2596.getSize().height + -var6.top - var6.bottom;
                    var7 = class176.field2596;
                } else {
                    var7 = class25.field375.field1611;
                    class455.field6669 = var7.getSize().width;
                    class69.field921 = var7.getSize().height;
                }
            } else {
                var7 = class237.field3314;
                class69.field921 = arg5;
                class455.field6669 = arg1;
            }
            if (~arg2 != -2) {
                if (class521.field7648 < 96 && class113.field1723 == 0) {
                    int var8 = ~class455.field6669 >= -1025 ? class455.field6669 : 1024;
                    int var9 = ~class69.field921 >= -769 ? class69.field921 : 768;
                    class155.field2347 = var8;
                    class252.field3438 = (-var8 + class455.field6669) / 2;
                    class413.field6241 = var9;
                    class33.field457 = 0;
                } else {
                    class155.field2347 = class455.field6669;
                    class413.field6241 = class69.field921;
                    class33.field457 = 0;
                    class252.field3438 = 0;
                }
            } else {
                class33.field457 = 0;
                class413.field6241 = class97.field1506;
                class252.field3438 = (-class227.field3206 + class455.field6669) / 2;
                class155.field2347 = class227.field3206;
            }
            if (class52.field674 != class149.field2269) {
                boolean var10000;
                if (class155.field2347 < 1024 && ~class413.field6241 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            int var10 = 32 % ((-41 - arg3) / 43);
            if (arg4) {
                class224.method1407(true);
            } else {
                class357.field5469.setSize(class155.field2347, class413.field6241);
                class407.field6147.method99(class357.field5469);
                if (class176.field2596 == var7) {
                    Insets var11 = class176.field2596.getInsets();
                    class357.field5469.setLocation(class252.field3438 + var11.left, class33.field457 + var11.top);
                } else {
                    class357.field5469.setLocation(class252.field3438, class33.field457);
                }
            }
            if (~arg2 > -3) {
                class129.field1922 = false;
            } else {
                class129.field1922 = true;
            }
            if (class256.field3477 != -1) {
                class123.method914(true, true);
            }
            if (class232.field3269 != null && class250.method1497(class411.field6213, 113)) {
                class45.method346(true);
            }
            for (int var12 = 0; var12 < 100; ++var12) {
                class147.field2223[var12] = true;
            }
            class426.field6352 = true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lvd;Lbt;)V", line = 378)
    public class445(class258 arg0, class89 arg1) {
        super(arg0);
        this.field6532 = arg1;
        if (super.field5646.field3755 && ~super.field5646.field3809 <= -3) {
            this.field6531 = class460.method2666("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 12, 34336, super.field5646);
            if (this.field6531 != null) {
                int[][] var3 = class53.method392(256, false, 4, 3, 7535, 8, 0.4F, 0, 64);
                int[][] var4 = class53.method392(256, false, 4, 3, 7535, 8, 0.4F, 8, 64);
                this.field6542 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field6542[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6542[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2608(false);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 426)
    public final void method24(int arg0) {
        ++field6540;
        if (this.field6541 != null) {
            this.field6541.method2035(18, '\u0001');
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, (class271) null);
            super.field5646.method1553(0, -8156);
            if (arg0 < 74) {
                field6549 = null;
            }
        }
    }
}
