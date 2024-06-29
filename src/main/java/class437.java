import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class437 extends class55 {

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Ltn;")
    private class88 field5814;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "Lpt;")
    private class533 field5816;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "Z")
    private boolean field5828;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field5822 = 0;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Z")
    public static boolean field5819 = false;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lsw;")
    public static class757 field5817;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
    private boolean field5815;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "[I")
    public static int[] field5812;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        if (this.field5815) {
            super.field759.method2393(1, (byte) -119);
            super.field759.method2396(22357, (class572) null);
            super.field759.method2393(0, (byte) -103);
            super.field759.method2396(22357, (class572) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5815 = false;
        }
        if (arg0) {
            ++field5813;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (this.field5815) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field5816.field7391;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field759.field5633 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field5824;
        if (!arg2) {
            this.method202(-122);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBJI)V")
    public static final void method2488(int arg0, byte arg1, long arg2, int arg3) {
        ++field5826;
        int var5 = -46 % ((arg1 - -53) / 42);
        int var6 = 31 & (int) arg2 >> 14;
        int var7 = ((int) arg2 & 3758343) >> 20;
        int var8 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var6 != 10 && ~var6 != -12 && ~var6 != -23) {
            class648.method3633(0, 0, var7, var6, true, arg3, 0, arg0, 17829);
        } else {
            class543 var9 = client.field3995.method3384(var8, false);
            int var10;
            int var11;
            if (var7 != 0 && ~var7 != -3) {
                var10 = var9.field7520;
                var11 = var9.field7534;
            } else {
                var11 = var9.field7520;
                var10 = var9.field7534;
            }
            int var12 = var9.field7537;
            if (~var7 != -1) {
                var12 = (var12 << var7 & 15) - -(var12 >> -var7 + 4);
            }
            class648.method3633(var12, var11, 0, 0, true, arg3, var10, arg0, 17829);
        }
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V")
    public static void method2489(int arg0) {
        if (arg0 != -10847) {
            field5822 = -64;
        }
        field5817 = null;
        field5812 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        ++field5825;
        int var3 = 62 % ((arg1 - -61) / 44);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2490(boolean arg0, int arg1) {
        if (arg0) {
            method2488(57, (byte) -75, 72L, 70);
        }
        ++field5818;
        return arg1 >= 4 && ~arg1 >= -9;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        if (arg0 != 5) {
            this.method196(-83, false);
        }
        ++field5821;
        class418 var3 = super.field759.method2370((byte) 64);
        if (this.field5828 && var3 != null) {
            super.field759.method2393(1, (byte) -127);
            super.field759.method2396(22357, var3);
            super.field759.method2393(0, (byte) -92);
            super.field759.method2396(22357, this.field5814.field1226);
            long var4 = this.field5816.field7391;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field759.field5596[0], -super.field759.field5596[1], -super.field759.field5596[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field759.field5620, super.field759.field5656, super.field759.field5600, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field759.field5596[1]) * 928.0F);
            this.field5815 = true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2491(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5823;
        long var6 = (long) ((!arg0 ? 0 : Integer.MIN_VALUE) | arg4);
        if (arg1 == 2709) {
            class515 var8 = (class515) class310.field4077.method1160(var6, 124);
            if (var8 == null) {
                var8 = new class515();
                class310.field4077.method1153(var8, var6, arg1 + -2710);
            }
            if (arg3 >= var8.field7226.length) {
                int[] var9 = new int[arg3 + 1];
                int[] var10 = new int[arg3 + 1];
                for (int var11 = 0; var11 < var8.field7226.length; ++var11) {
                    var9[var11] = var8.field7226[var11];
                    var10[var11] = var8.field7228[var11];
                }
                for (int var12 = var8.field7226.length; ~var12 > ~arg3; ++var12) {
                    var9[var12] = -1;
                    var10[var12] = 0;
                }
                var8.field7226 = var9;
                var8.field7228 = var10;
            }
            var8.field7226[arg3] = arg2;
            var8.field7228[arg3] = arg5;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Ltk;Lnd;Ltn;)V")
    public class437(class347 arg0, class547 arg1, class88 arg2) {
        super(arg0);
        this.field5814 = arg2;
        if (arg1 != null && arg0.field4479 && arg0.field4478) {
            class5 var4 = class3.method12(arg0, arg1.method3158("gl", (byte) 124, "environment_mapped_water_v"), 35633, -114);
            class5 var5 = class3.method12(arg0, arg1.method3158("gl", (byte) 125, "environment_mapped_water_f"), 35632, -66);
            this.field5816 = class680.method3830(arg0, (byte) -123, new class5[] { var4, var5 });
            this.field5828 = this.field5816 != null && this.field5814.method723(true);
        } else {
            this.field5828 = false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (!this.field5815) {
            super.field759.method2396(22357, arg2);
            super.field759.method2379(arg0, -15829);
        }
        ++field5827;
        if (arg1 < 30) {
            method2489(-21);
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        ++field5820;
        if (arg0 != 1) {
            this.field5828 = true;
        }
        return this.field5828;
    }
}
