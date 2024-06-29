import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class320 extends class306 implements class201 {

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    private int field4569;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lao;")
    public static class188 field4571 = new class188(86, 0);

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field4577;

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lqg;I[BI)V")
    public class320(class321 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4569 = arg1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BC)Z")
    public static final boolean method2003(byte arg0, char arg1) {
        ++field4575;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class165.method1186(arg1, true)) {
            return true;
        } else {
            char[] var2 = class396.field5827;
            if (arg0 >= -106) {
                method2005(95, (byte) -20, 10, -36);
            }
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class455.field6736;
            for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                char var6 = var4[var5];
                if (~arg1 == ~var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
    public static void method2004(boolean arg0) {
        if (!arg0) {
            field4578 = -39;
        }
        field4571 = null;
        field4577 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBII)I")
    public static final int method2005(int arg0, byte arg1, int arg2, int arg3) {
        ++field4572;
        int var4 = arg3 / arg0;
        int var5 = arg0 + -1 & arg3;
        int var6 = arg2 / arg0;
        int var7 = arg0 - 1 & arg2;
        int var8 = class503.method2991(var4, var6, false);
        int var9 = class503.method2991(var4 + 1, var6, false);
        int var10 = class503.method2991(var4, var6 + 1, false);
        if (arg1 < 91) {
            return -77;
        } else {
            int var11 = class503.method2991(var4 + 1, var6 + 1, false);
            int var12 = class31.method254((byte) -128, var9, var8, arg0, var5);
            int var13 = class31.method254((byte) -126, var11, var10, arg0, var5);
            return class31.method254((byte) 93, var13, var12, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
    public final int method755(int arg0) {
        if (arg0 != -20843) {
            this.method760((byte[]) null, -31, -102, 85);
        }
        ++field4573;
        return this.field4569;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([BIII)V")
    public final void method760(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field4576;
        this.method1929(arg0, arg3);
        this.field4569 = arg1;
        if (arg2 <= 71) {
            field4577 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)J")
    public final long method757(boolean arg0) {
        if (arg0) {
            return -107L;
        } else {
            ++field4570;
            return super.field4378.method2647();
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
    public final int method759(byte arg0) {
        if (arg0 != -23) {
            field4577 = null;
        }
        ++field4574;
        return 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[BZ[I[II[B[[B)I")
    public static final int method2006(int arg0, byte[][] arg1, boolean arg2, int[] arg3, int[] arg4, int arg5, byte[] arg6, byte[][] arg7) {
        ++field4568;
        int var8 = arg4[arg0];
        int var9 = arg3[arg0] + var8;
        int var10 = arg4[arg5];
        int var11 = var10 - -arg3[arg5];
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var11 > ~var9) {
            var13 = var11;
        }
        if (!arg2) {
            return 48;
        } else {
            int var14 = 255 & arg6[arg0];
            if ((255 & arg6[arg5]) < var14) {
                var14 = arg6[arg5] & 255;
            }
            byte[] var15 = arg7[arg0];
            byte[] var16 = arg1[arg5];
            int var17 = -var8 + var12;
            int var18 = var12 - var10;
            for (int var19 = var12; ~var13 < ~var19; ++var19) {
                int var20 = var16[var18++] + var15[var17++];
                if (var20 < var14) {
                    var14 = var20;
                }
            }
            return -var14;
        }
    }
}
