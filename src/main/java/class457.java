import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class457 extends class330 {

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    private int field6391 = 4096;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
    private int field6395 = 4096;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
    private int field6397 = 4096;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field6389 = 0;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "Z")
    public static boolean field6392 = false;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field6394 = -1;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "Lae;")
    public static class283 field6388;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)I")
    public static final int method2749(int arg0, int arg1, int arg2, int arg3) {
        ++field6385;
        int var4 = arg2 & 3;
        if (~var4 == arg3) {
            return arg1;
        } else if (~var4 == -2) {
            return arg0;
        } else {
            return var4 == 2 ? 7 - arg1 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public static final void method2750(int arg0) {
        ++field6390;
        if (arg0 > -5) {
            field6392 = true;
        }
        for (class469 var1 = (class469) class297.field4327.method3668(58); var1 != null; var1 = (class469) class297.field4327.method3667((byte) -121)) {
            if (var1.field6502.method2972(0)) {
                class128.method878(var1.field6505, -1805);
            } else {
                var1.field6502.method1618(-21502);
                try {
                    var1.field6502.method2967((byte) 118);
                } catch (Exception var5) {
                    class502.method2937(var5, (byte) 51, "TV: " + var1.field6505);
                    class128.method878(var1.field6505, -1805);
                }
                if (!var1.field6499 && !var1.field6504) {
                    class483 var3 = var1.field6502.method2971(0);
                    if (var3 != null) {
                        class271 var4 = var3.method2869(-7532);
                        if (var4 != null) {
                            var4.method1762(1, var1.field6501);
                            class44.field468.method2510(var4);
                            var1.field6499 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class457() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lvt;Ljava/lang/String;II)Lfe;")
    public static final class344 method2751(class768 arg0, String arg1, int arg2, int arg3) {
        ++field6386;
        if (~arg2 == -1) {
            return arg0.method4234(26126, arg1);
        } else {
            if (arg3 >= -15) {
                field6394 = -95;
            }
            if (~arg2 == -2) {
                try {
                    class552.method3255("openjs", 9309, class511.field7007, new Object[] { (new URL(class511.field7007.getCodeBase(), arg1)).toString() });
                    class344 var4 = new class344();
                    var4.field4970 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class344 var5 = new class344();
                    var5.field4970 = 2;
                    return var5;
                }
            } else if (~arg2 == -3) {
                try {
                    class511.field7007.getAppletContext().showDocument(new URL(class511.field7007.getCodeBase(), arg1), "_blank");
                    class344 var6 = new class344();
                    var6.field4970 = 1;
                    return var6;
                } catch (Exception var11) {
                    class344 var7 = new class344();
                    var7.field4970 = 2;
                    return var7;
                }
            } else if (arg2 == 3) {
                try {
                    class552.method3253(class511.field7007, -53, "loggedout");
                } catch (Throwable var13) {
                }
                try {
                    class511.field7007.getAppletContext().showDocument(new URL(class511.field7007.getCodeBase(), arg1), "_top");
                    class344 var8 = new class344();
                    var8.field4970 = 1;
                    return var8;
                } catch (Exception var12) {
                    class344 var9 = new class344();
                    var9.field4970 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(B)V")
    public static void method2752(byte arg0) {
        int var1 = 48 % ((-80 - arg0) / 34);
        field6388 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field6387;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            method2753(false);
        }
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(arg1, 0, 127);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class80.field901 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field6395 * var12 >> 12;
                    var9[var11] = this.field6391 * var13 >> 12;
                    var10[var11] = this.field6397 * var14 >> 12;
                } else {
                    var8[var11] = this.field6395;
                    var9[var11] = this.field6391;
                    var10[var11] = this.field6397;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field6396;
        int var4 = 87 % ((arg2 - -41) / 42);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field6397 = arg0.method3002(-1);
                }
            } else {
                this.field6391 = arg0.method3002(-1);
            }
        } else {
            this.field6395 = arg0.method3002(-1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
    public static final void method2753(boolean arg0) {
        ++field6393;
        client.field1307.method202((0.1F * (float) class688.field9602.field8543.method1947((byte) -98) + 0.7F) * class311.field4472);
        client.field1307.method154(class268.field3886, class254.field3763, class339.field4916, (float) (class669.field9374 << 2), (float) (class540.field7468 << 2), (float) (class376.field5391 << 2));
        if (arg0) {
            field6388 = null;
        }
        client.field1307.method173(class554.field7677);
    }
}
