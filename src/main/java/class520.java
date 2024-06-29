import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class520 extends class18 {

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    private int field7050 = -1;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
    private int field7054 = -1;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
    public int field7051;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
    public int field7052;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public int field7053;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
    public static int field7058 = -1;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIIB)V")
    public final void method2957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        super.field434.method939(this, arg7 + 8489);
        ++field7059;
        if (arg7 != -41) {
            this.field7054 = -34;
        }
        OpenGL.glCopyTexSubImage3D(super.field430, 0, arg2, arg6, arg0, arg1, arg3, arg5, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[Ljava/lang/String;)V")
    public static final void method2958(int arg0, String[] arg1) {
        ++field7049;
        if (arg0 < -29) {
            if (arg1.length <= 1) {
                class741.field10225 = class741.field10225 + arg1[0];
                class660.field9148 += arg1[0].length();
            } else {
                for (int var2 = 0; var2 < arg1.length; ++var2) {
                    if (arg1[var2].startsWith("pause")) {
                        int var3 = 5;
                        try {
                            var3 = Integer.parseInt(arg1[var2].substring(6));
                        } catch (Exception var4) {
                        }
                        class652.method3663(86, "Pausing for " + var3 + " seconds...");
                        class130.field2262 = var2 - -1;
                        class470.field6353 = arg1;
                        class126.field2230 = class197.method1423(1) - -((long) (var3 * 1000));
                        return;
                    }
                    class741.field10225 = arg1[var2];
                    class379.method2310(113, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 > -44) {
            method2958(-43, (String[]) null);
        }
        ++field7048;
        OpenGL.glFramebufferTexture3DEXT(this.field7054, this.field7050, super.field430, 0, 0, 0);
        this.field7050 = -1;
        this.field7054 = -1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
    public static final boolean method2959(int arg0, int arg1, int arg2) {
        ++field7056;
        if (arg1 != 33) {
            return false;
        } else {
            return (33 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lha;Z)V")
    public static final void method2960(class66 arg0, boolean arg1) {
        ++field7060;
        if (arg1) {
            method2960((class66) null, false);
        }
        int var2 = 0;
        int var3 = 0;
        if (class618.field8597) {
            var2 = class146.method1175(-29909);
            var3 = class605.method3435((byte) -98);
        }
        arg0.method512(var2, var3, class732.field10098 + var2, var3 + 350);
        arg0.method537(var2, var3, class732.field10098, 350, class276.field3828 << 24 | 3351159, 1);
        class686.method3861(var2, var2 - -class732.field10098, 22738, var3, var3 + 350);
        int var4 = 350 / class407.field5592;
        if (class476.field6433 > 0) {
            int var5 = -class407.field5592 + 346 + -4;
            int var6 = var4 * var5 / (var4 + -1 + class476.field6433);
            int var7 = 4;
            if (~class476.field6433 < -2) {
                var7 += (class476.field6433 + -1 - class362.field4935) * (var5 - var6) / (class476.field6433 - 1);
            }
            arg0.method537(class732.field10098 + -16 + var2, var3 + var7, 12, var6, class276.field3828 << 24 | 3351159, 2);
            for (int var8 = class362.field4935; ~var8 > ~(class362.field4935 + var4) && ~var8 > ~class476.field6433; ++var8) {
                String[] var9 = class478.method2738(class238.field3400[var8], '\b', 14388);
                int var10 = (class732.field10098 - 16 + -8) / var9.length;
                for (int var11 = 0; ~var11 > ~var9.length; ++var11) {
                    int var12 = var10 * var11 + 8;
                    arg0.method512(var2 + var12, var3, var2 + var12 + -8 + var10, var3 + 350);
                    class359.field4908.method598(var3 + 350 + -class16.field239.field2434 - ((-class362.field4935 + var8) * class407.field5592 + 2 + class160.field2572), -1, -16777216, class492.method2828(var9[var11], 23944), var2 - -var12, (byte) -19);
                }
            }
        }
        class555.field7842.method605(var3 + -20 - -350, var2 - -class732.field10098 + -25, "Build: 642", -16777216, -1, (byte) -123);
        arg0.method512(var2, var3, var2 - -class732.field10098, var3 + 350);
        arg0.method528(37, class732.field10098, -1, var3 - class160.field2572 + 350, var2);
        class557.field7861.method598(var3 - -350 + -class333.field4511.field2434 + -1, -1, -16777216, "--> " + class492.method2828(class741.field10225, 23944), var2 + 10, (byte) -19);
        if (class29.field539) {
            int var13 = -1;
            if (class440.field5977 % 30 > 15) {
                var13 = 16777215;
            }
            arg0.method526(10 + (var2 - -class333.field4511.method1172("--> " + class492.method2828(class741.field10225, 23944).substring(0, class660.field9148), (byte) 112)), 12, var13, var3 + 350 - (class333.field4511.field2434 + 11), 1);
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lhk;IIII[BI)V")
    public class520(class111 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7051 = arg4;
        this.field7052 = arg3;
        this.field7053 = arg2;
        super.field434.method939(this, 8448);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field430, 0, super.field427, this.field7053, this.field7052, this.field7051, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lhk;IIII)V")
    public class520(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7053 = arg2;
        this.field7051 = arg4;
        this.field7052 = arg3;
        super.field434.method939(this, 8448);
        OpenGL.glTexImage3Dub(super.field430, 0, super.field427, this.field7053, this.field7052, this.field7051, 0, class628.method3531((byte) 52, super.field427), 5121, (byte[]) null, 0);
        this.method126(true, -22513);
    }
}
