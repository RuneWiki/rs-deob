import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class680 extends class314 {

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Z")
    private boolean field9546 = true;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    private int field9544 = 4096;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field9541 = new int[2];

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "[Lwt;")
    public static class284[] field9540;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V")
    public static void method3875(int arg0) {
        field9540 = null;
        if (arg0 != 1000226689) {
            method3878((class397) null, -82, -14, 0.33763844F, -0.58256465F, (byte) 99, -10, -0.6692263F, 0.9647081F, 0.61901176F, -17);
        }
        field9541 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)Lkt;")
    public static final class143 method3876(byte arg0) {
        ++field9543;
        if (class378.field5883 != null && class508.field7422 != null) {
            class143 var1 = (class143) class508.field7422.method3660(true);
            if (arg0 >= -47) {
                field9541 = null;
            }
            while (var1 != null) {
                class257 var2 = class378.field5873.method3286(29982, var1.field2408);
                if (var2 != null && var2.field4095 && var2.method1822((byte) -90, class378.field5870)) {
                    return var1;
                }
                var1 = (class143) class508.field7422.method3660(true);
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lk;Ljava/lang/String;ZI)Lsw;")
    public static final class701 method3877(class525 arg0, String arg1, boolean arg2, int arg3) {
        ++field9542;
        if (~arg3 == -1) {
            return arg0.method3175(arg1, (byte) -127);
        } else {
            if (arg2) {
                method3877((class525) null, (String) null, false, 91);
            }
            if (arg3 == 1) {
                try {
                    class358.method2402(class450.field6772, "openjs", (byte) 116, new Object[] { (new URL(class450.field6772.getCodeBase(), arg1)).toString() });
                    class701 var4 = new class701();
                    var4.field9884 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class701 var5 = new class701();
                    var5.field9884 = 2;
                    return var5;
                }
            } else if (arg3 == 2) {
                try {
                    class450.field6772.getAppletContext().showDocument(new URL(class450.field6772.getCodeBase(), arg1), "_blank");
                    class701 var6 = new class701();
                    var6.field9884 = 1;
                    return var6;
                } catch (Exception var11) {
                    class701 var7 = new class701();
                    var7.field9884 = 2;
                    return var7;
                }
            } else if (arg3 == 3) {
                try {
                    class358.method2403("loggedout", class450.field6772, -29103);
                } catch (Throwable var13) {
                }
                try {
                    class450.field6772.getAppletContext().showDocument(new URL(class450.field6772.getCodeBase(), arg1), "_top");
                    class701 var8 = new class701();
                    var8.field9884 = 1;
                    return var8;
                } catch (Exception var12) {
                    class701 var9 = new class701();
                    var9.field9884 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field9546 = ~arg1.method70(-9059) == -2;
            }
        } else {
            this.field9544 = arg1.method67(12021);
        }
        if (arg0 <= -1) {
            ++field9545;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field9539;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 <= 68) {
            this.method5((byte) -82, (class6) null, 56);
        }
        if (super.field4931.field2799) {
            int[] var4 = this.method2140(0, arg0 + -1 & class66.field849, -124);
            int[] var5 = this.method2140(0, arg0, -123);
            int[] var6 = this.method2140(0, class66.field849 & arg0 + 1, -122);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class81.field1009 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field9544;
                int var12 = (var5[class504.field7373 & var10 - -1] + -var5[class504.field7373 & var10 - 1]) * this.field9544;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 - -4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field9546) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lss;IIFFBIFFFI)[B")
    public static final byte[] method3878(class397 arg0, int arg1, int arg2, float arg3, float arg4, byte arg5, int arg6, float arg7, float arg8, float arg9, int arg10) {
        ++field9538;
        byte[] var11 = new byte[arg1 * arg2 * arg10];
        class689.method3905(arg8, arg0, 0, arg6, arg3, arg10, arg1, arg2, arg9, 28747, arg4, arg7, var11);
        return arg5 != -11 ? null : var11;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class680() {
        super(1, false);
    }
}
