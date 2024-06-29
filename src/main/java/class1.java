import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 extends class118 {

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Loj;")
    public static class246 field10 = new class246();

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Z")
    public static boolean field15 = true;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "J")
    public static long field18 = 0L;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lhb;")
    public static class155 field14 = new class155(32);

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Ldk;")
    public static class251 field16;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Ldk;")
    public static class251 field20;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIII)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field12 = arg2;
        this.field2 = arg0;
        this.field1 = arg1;
        this.field8 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        if (arg1 < -40) {
            ++field13;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        ++field3;
        if (arg2 != -6211) {
            this.method2(-117, 12, -19);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6;
        class207.method1449(arg3, 13056, arg2, arg6, arg1, 0, arg7, arg0, arg5);
        int var8 = 17 / ((arg4 - 16) / 52);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        ++field4;
        int var4 = this.field12 * arg2 >> 12;
        int var5 = this.field2 * arg2 >> 12;
        int var6 = this.field8 * arg1 >> 12;
        if (arg0 == 1207757217) {
            int var7 = this.field1 * arg1 >> 12;
            class12.method61(var6, 102, var5, var7, super.field1898, var4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field14 = null;
        field20 = null;
        field16 = null;
        field10 = null;
        if (arg0 != 25) {
            field19 = 5;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7;
        if (arg5 < arg0 - -arg6 && arg0 < arg3 + arg5) {
            if (arg2 < arg4 + arg7 && ~arg4 > ~(arg1 + arg2)) {
                if (arg8 != 14938) {
                    field20 = null;
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwd;Lrm;IZ)V")
    public static final void method7(class162 arg0, class45 arg1, int arg2, boolean arg3) {
        ++field9;
        class215 var4 = new class215();
        var4.field3556 = arg0.method1133((byte) 53);
        var4.field3558 = arg0.method1157(65280);
        var4.field3565 = new int[var4.field3556];
        var4.field3550 = new class172[var4.field3556];
        var4.field3561 = new int[var4.field3556];
        var4.field3557 = new int[var4.field3556];
        var4.field3563 = new byte[var4.field3556][][];
        var4.field3559 = new class172[var4.field3556];
        for (int var5 = 0; ~var4.field3556 < ~var5; ++var5) {
            try {
                int var6 = arg0.method1133((byte) 53);
                if (~var6 != -1 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || var6 == 4) {
                        String var10 = arg0.method1152(-107);
                        String var11 = arg0.method1152(-56);
                        int var12 = arg0.method1133((byte) 53);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = arg0.method1152(-59);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; ~var16 > ~var12; ++var16) {
                                int var17 = arg0.method1157(65280);
                                var15[var16] = new byte[var17];
                                arg0.method1136(var17, var15[var16], -128, 0);
                            }
                        }
                        var4.field3557[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var12 > var19; ++var19) {
                            var18[var19] = class255.method1716(false, var13[var19]);
                        }
                        var4.field3550[var5] = arg1.method312(var18, var11, class255.method1716(false, var10), (byte) -97);
                        var4.field3563[var5] = var15;
                    }
                } else {
                    String var7 = arg0.method1152(-107);
                    String var8 = arg0.method1152(-51);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg0.method1157(65280);
                    }
                    var4.field3557[var5] = var6;
                    var4.field3565[var5] = var9;
                    var4.field3559[var5] = arg1.method328(var8, 0, class255.method1716(false, var7));
                }
            } catch (ClassNotFoundException var20) {
                var4.field3561[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3561[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3561[var5] = -3;
            } catch (Exception var23) {
                var4.field3561[var5] = -4;
            } catch (Throwable var24) {
                var4.field3561[var5] = -5;
            }
        }
        class176.field2880.method1646(arg3, var4);
    }
}
