import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class579 extends class56 {

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field8173 = 204;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    private int field8174 = 1;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    private int field8172 = 1;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Lgda;")
    public static class53 field8171 = new class53(75, 7);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lgca;")
    public static class249 field8177;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 4)
    public static void method3299(int arg0) {
        field8177 = null;
        field8171 = null;
        if (arg0 != 1) {
            method3301((String) null, true, -35, (String) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[I", line = 15)
    public final int[] method24(int arg0, boolean arg1) {
        ++field8175;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            method3299(-51);
        }
        if (super.field673.field8073) {
            for (int var4 = 0; ~class328.field4576 < ~var4; ++var4) {
                int var5 = class132.field1945[var4];
                int var6 = class720.field10000[arg0];
                int var7 = this.field8174 * var5 >> 12;
                int var8 = this.field8172 * var6 >> 12;
                int var9 = var5 % (4096 / this.field8174) * this.field8174;
                int var10 = var6 % (4096 / this.field8172) * this.field8172;
                if (~var10 > ~this.field8173) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field8173 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field8173) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 117)
    public class579() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Lbu;ILeea;)Laea;", line = 124)
    public static final class49 method3300(class19[] arg0, int arg1, class131 arg2) {
        ++field8178;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            if (arg0[var3] == null || arg0[var3].field293 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg0.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field293);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class601.field8431, 0);
        if (~class601.field8431[0] == arg1) {
            if (~class601.field8431[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class601.field8431, 1);
            if (~class601.field8431[1] < -2) {
                byte[] var7 = new byte[class601.field8431[1]];
                OpenGL.glGetInfoLogARB(var4, class601.field8431[1], class601.field8431, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class601.field8431[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field293);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class49(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILee;I)V", line = 189)
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field8179;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field8173 = arg1.method3757((byte) -65);
                }
            } else {
                this.field8172 = arg1.method3750((byte) 35);
            }
        } else {
            this.field8174 = arg1.method3750((byte) 35);
        }
        if (arg0 != 3731) {
            method3301((String) null, false, 91, (String) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V", line = 236)
    public static final void method3301(String arg0, boolean arg1, int arg2, String arg3) {
        class209.field2755 = arg0;
        ++field8176;
        class449.field6370 = arg3;
        class598.field8406 = arg1;
        if (class598.field8406 || !class209.field2755.equals("") && !class449.field6370.equals("")) {
            if (class549.field7670 != 1) {
                class253.field3705 = -1;
                class545.field7597 = 0;
            }
            class711.field9881 = false;
            class496.method2962(-3, false);
            class261.field3766 = 0;
            class215.field2831 = 1;
            class169.field2311 = arg2;
        } else {
            class496.method2962(3, false);
        }
    }
}
