import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class323 extends class445 implements class447 {

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lpb;")
    public static class2 field4702 = new class2(0, 3);

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field4704 = 0;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2004(String arg0, byte arg1) {
        ++field4701;
        if (arg1 <= 38) {
            field4703 = 9;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = arg0.charAt(var4) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lkd;IZ[[I)V")
    public class323(class700 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class564.field8245, class106.field1573, arg1 * 6 * arg1, arg2);
        super.field6476.method3011(-127, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method2637(arg3[var5], 34069 - -var5, arg1, arg1, 255);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method2630(9536), arg1, arg1, 0, class362.method2224(super.field6458, 6406), super.field6476.field9954, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIILua;Lps;J)V")
    public static final void method2005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, class5 arg7, long arg8) {
        ++field4700;
        int var10 = arg2 * arg2 - -(arg4 * arg4);
        if (arg8 >= (long) var10) {
            if (arg3 != 10) {
                field4704 = 67;
            }
            int var11 = Math.min(arg7.field202 / 2, arg7.field76 / 2);
            if (~(var11 * var11) > ~var10) {
                var11 -= 10;
                int var12;
                if (~class684.field9659 != -5) {
                    var12 = (int) class311.field4589 + class53.field817 & 16383;
                } else {
                    var12 = (int) class311.field4589 & 16383;
                }
                int var13 = class271.field3549[var12];
                int var14 = class271.field3544[var12];
                if (~class684.field9659 != -5) {
                    var14 = var14 * 256 / (class697.field9826 + 256);
                    var13 = var13 * 256 / (class697.field9826 + 256);
                }
                int var15 = arg2 * var14 + arg4 * var13 >> 14;
                int var16 = arg4 * var14 + -(arg2 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class23.field433[arg1].method1527((float) arg7.field202 / 2.0F + (float) arg5 + (float) var19, (float) arg7.field76 / 2.0F + (float) arg0 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class492.method2815(class656.field9372[arg1], arg2, arg4, arg0, arg7, arg6, (byte) -93, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method2006(int arg0) {
        if (arg0 <= -20) {
            field4702 = null;
        }
    }
}
