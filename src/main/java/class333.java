import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class333 extends class384 {

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Leb;")
    private class9 field4290;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Lwd;")
    private class171 field4289;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "Z")
    private boolean field4302;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field4292 = -1;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4291 = new String[100];

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4285 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "Lgaa;")
    public static class460 field4299 = null;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Lnt;")
    public static class758 field4297;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "Z")
    private boolean field4300;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (!this.field4300) {
            super.field5337.method3711(false, arg0);
            super.field5337.method3781(-3, arg2);
        }
        if (arg1 != 80) {
            method1956(85, (class546) null, -75, -114, (byte) 113);
        }
        ++field4287;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(B)V")
    public static void method1955(byte arg0) {
        int var1 = -29 % ((-49 - arg0) / 58);
        field4297 = null;
        field4291 = null;
        field4299 = null;
        field4285 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 <= 23) {
            this.field4289 = null;
        }
        ++field4296;
        class207 var3 = super.field5337.method3707(56);
        if (this.field4302 && var3 != null) {
            super.field5337.method3723(true, 1);
            super.field5337.method3711(false, var3);
            super.field5337.method3723(true, 0);
            super.field5337.method3711(false, this.field4290.field92);
            long var4 = this.field4289.field2250;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5337.field9585[0], -super.field5337.field9585[1], -super.field5337.field9585[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5337.field9564, super.field5337.field9571, super.field5337.field9606, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field5337.field9585[1]) * 928.0F + 96.0F);
            this.field4300 = true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        ++field4293;
        if (this.field4300) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((61 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field4289.field2250;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5337.field9610 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 != 102) {
            field4297 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        if (arg0 != 4) {
            field4301 = 122;
        }
        ++field4294;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILlea;IIB)V")
    public static final void method1956(int arg0, class546 arg1, int arg2, int arg3, byte arg4) {
        ++field4298;
        int var5 = arg1.field435[0];
        int var6 = arg1.field426[0];
        if (var5 >= 0 && var5 < class613.field8591 && ~var6 <= -1 && class1.field3 > var6) {
            if (arg2 >= 0 && ~class613.field8591 < ~arg2 && arg0 >= 0 && arg0 < class1.field3) {
                int var7 = class347.method2036(2, class410.field5786[arg1.field5779], 0, var5, 0, arg1.method253((byte) -27), class2.field9, var6, arg0, -4, arg2, 0, true, class616.field8621, 0);
                if (~var7 <= -2) {
                    if (var7 <= 3) {
                        if (arg3 < 21) {
                            method1956(-66, (class546) null, 1, -75, (byte) -116);
                        }
                        for (int var8 = 0; ~var8 > ~(var7 + -1); ++var8) {
                            arg1.method3099(15869, class2.field9[var8], class616.field8621[var8], arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        ++field4288;
        if (this.field4300) {
            super.field5337.method3723(true, 1);
            super.field5337.method3711(false, (class329) null);
            super.field5337.method3723(true, 0);
            super.field5337.method3711(false, (class329) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4300 = false;
        }
        if (arg0 != -60) {
            this.method1019((byte) -3);
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        if (arg0 <= 78) {
            return false;
        } else {
            ++field4286;
            return this.field4302;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[I[IZILeq;)Lwg;")
    public static final class553 method1957(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4, class357 arg5) {
        ++field4295;
        byte[] var6 = new byte[arg0 * arg4];
        int var7 = 0;
        if (!arg3) {
            field4285 = null;
        }
        while (~var7 > ~arg4) {
            int var8 = arg0 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg2[var7]; ++var9) {
                var6[var8++] = -1;
            }
            ++var7;
        }
        return new class553(arg5, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lck;Lkha;Leb;)V")
    public class333(class221 arg0, class687 arg1, class9 arg2) {
        super(arg0);
        this.field4290 = arg2;
        if (arg1 != null && arg0.field2909 && arg0.field2905) {
            class373 var4 = class280.method1674(arg0, arg1.method3813("gl", "environment_mapped_water_v", -40), 35633, (byte) 55);
            class373 var5 = class280.method1674(arg0, arg1.method3813("gl", "environment_mapped_water_f", -84), 35632, (byte) 110);
            this.field4289 = class415.method2463(arg0, (byte) 96, new class373[] { var4, var5 });
            this.field4302 = this.field4289 != null && this.field4290.method40(3997);
        } else {
            this.field4302 = false;
        }
    }
}
