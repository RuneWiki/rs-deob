import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class373 extends class45 {

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lhu;")
    private class133 field5178;

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lwu;Lwu;Luc;)V")
    public class373(class376 arg0, class376 arg1, class27 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILee;)V")
    public static final void method2185(int arg0, class677 arg1) {
        ++field5179;
        int var2 = arg1.method3790((byte) 22);
        class379.field5280 = new class208[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class379.field5280[var3] = new class208();
            class379.field5280[var3].field3082 = arg1.method3790((byte) 22);
            class379.field5280[var3].field3085 = arg1.method3824(-112);
        }
        if (arg0 == -1) {
            class309.field4442 = arg1.method3790((byte) 22);
            class568.field7465 = arg1.method3790((byte) 22);
            class517.field6907 = arg1.method3790((byte) 22);
            class82.field989 = new class653[-class309.field4442 - -1 + class568.field7465];
            for (int var4 = 0; ~class517.field6907 < ~var4; ++var4) {
                int var5 = arg1.method3790((byte) 22);
                class653 var6 = class82.field989[var5] = new class653();
                var6.field6198 = arg1.method3821((byte) -77);
                var6.field6194 = arg1.method3799(false);
                var6.field8653 = class309.field4442 + var5;
                var6.field8651 = arg1.method3824(arg0 + -103);
                var6.field8652 = arg1.method3824(-122);
            }
            class194.field2925 = arg1.method3799(false);
            client.field4357 = true;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lrda;[Lcba;I)Lnfa;")
    public static final class680 method2186(class663 arg0, class551[] arg1, int arg2) {
        ++field5180;
        for (int var3 = 0; var3 < arg1.length; ++var3) {
            if (arg1[var3] == null || ~arg1[var3].field7267 >= -1L) {
                return null;
            }
        }
        if (arg2 > -70) {
            return null;
        } else {
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; var6 < arg1.length; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg1[var6].field7267);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class334.field4744, 0);
            if (class334.field4744[0] == 0) {
                if (class334.field4744[0] == 0) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class334.field4744, 1);
                if (class334.field4744[1] > 1) {
                    byte[] var7 = new byte[class334.field4744[1]];
                    OpenGL.glGetInfoLogARB(var4, class334.field4744[1], class334.field4744, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (~class334.field4744[0] == -1) {
                    for (int var8 = 0; arg1.length > var8; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg1[var8].field7267);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class680(arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        if (arg0 > 34) {
            ++field5183;
            super.method324((byte) 121);
            this.field5178 = class453.method2578(((class27) super.field584).field428, super.field578, true);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Lkf;II)V")
    public static final void method2187(class256[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class256 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field3509;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field3509 < (var7 & 1) + var6) {
                    class256 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method2187(arg0, arg1, var4 - 1);
            method2187(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIZ)V")
    public final void method321(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5181;
        int var5 = this.method323((byte) -36) * super.field584.field6529 / 10000;
        int[] var6 = new int[4];
        class341.field4807.method393(var6);
        class341.field4807.method419(arg0, arg2 + 2, arg0 + var5, super.field584.field6531 + arg2);
        this.field5178.method1049(arg0, arg1 + arg2, super.field584.field6529, super.field584.field6531);
        class341.field4807.method419(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZI)V")
    public final void method325(int arg0, int arg1, boolean arg2, int arg3) {
        class341.field4807.method455(arg3 + -2, arg0, super.field584.field6529 - -4, super.field584.field6531 + 2, ((class27) super.field584).field431, 0);
        ++field5177;
        class341.field4807.method455(arg3 + -1, arg0 + 1, super.field584.field6529 + 2, super.field584.field6531, 0, 0);
        if (arg1 >= -72) {
            this.method320(-114);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        ++field5182;
        return !super.method320(arg0) ? false : super.field578.method2216(((class27) super.field584).field428, -94);
    }
}
