import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class760 extends class739 {

    @OriginalMember(owner = "client!wia", name = "H", descriptor = "Z")
    private boolean field10603 = true;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
    private int field10607 = 4096;

    @OriginalMember(owner = "client!wia", name = "G", descriptor = "Z")
    public static boolean field10602 = false;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
    public static int field10606 = 100;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "[I")
    public static int[] field10610 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "Lsh;")
    public static class71 field10605;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lqg;IILjava/awt/Component;I)Lbl;")
    public static final class651 method4225(class465 arg0, int arg1, int arg2, Component arg3, int arg4) {
        ++field10609;
        if (class541.field7490 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class651 var5 = (class651) Class.forName("bt").newInstance();
                var5.field9067 = arg4;
                var5.field9051 = new int[256 * (class360.field4662 ? 2 : 1)];
                var5.method315(arg3);
                var5.field9053 = (-1024 & arg4) - -1024;
                if (~var5.field9053 < -16385) {
                    var5.field9053 = 16384;
                }
                var5.method311(var5.field9053);
                if (~class147.field2052 < -1 && class323.field4167 == null) {
                    class323.field4167 = new class19();
                    class323.field4167.field342 = arg0;
                    arg0.method2643(class147.field2052, class323.field4167, (byte) 82);
                }
                if (class323.field4167 != null) {
                    if (class323.field4167.field347[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class323.field4167.field347[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class311 var6 = new class311(arg0, arg2);
                    var6.field9067 = arg4;
                    if (arg1 != 1) {
                        field10610 = null;
                    }
                    var6.field9051 = new int[(class360.field4662 ? 2 : 1) * 256];
                    var6.method315(arg3);
                    var6.field9053 = 16384;
                    var6.method311(var6.field9053);
                    if (class147.field2052 > 0 && class323.field4167 == null) {
                        class323.field4167 = new class19();
                        class323.field4167.field342 = arg0;
                        arg0.method2643(class147.field2052, class323.field4167, (byte) 82);
                    }
                    if (class323.field4167 != null) {
                        if (class323.field4167.field347[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class323.field4167.field347[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class651();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(II)Lwf;")
    public static final class138 method4226(int arg0, int arg1) {
        ++field10608;
        if (class609.field8451 && class227.field3004 <= arg1 && ~class461.field6215 <= ~arg1) {
            return arg0 >= -17 ? null : class444.field5900[arg1 - class227.field3004];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
    public class760() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            ++field10600;
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field10603 = arg0.method2600((byte) -124) == 1;
                }
            } else {
                this.field10607 = arg0.method2566(-2);
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
    public static void method4227(byte arg0) {
        int var1 = 26 / ((34 - arg0) / 37);
        field10605 = null;
        field10610 = null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field10604;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 <= 26) {
            this.method223((byte) -39, 4);
        }
        if (super.field10312.field4922) {
            int[] var4 = this.method4115(-123, arg1 + -1 & class683.field9515, 0);
            int[] var5 = this.method4115(-119, arg1, 0);
            int[] var6 = this.method4115(-116, class683.field9515 & arg1 - -1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class29.field523 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field10607;
                int var12 = (var5[var10 - -1 & class346.field4366] + -var5[class346.field4366 & var10 - 1]) * this.field10607;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field10603) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }
}
