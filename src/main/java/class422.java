import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class422 extends class518 {

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    private int field5553;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    private int field5563;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    private int field5551;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    private int field5565;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "[Lho;")
    public static class222[] field5559 = new class222[37];

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
    public static int[] field5560 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Ljha;")
    public static class33 field5564;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(IIB)V", line = 3)
    public final void method1044(int arg0, int arg1, byte arg2) {
        if (arg2 != 24) {
            this.field5549 = -100;
        }
        ++field5561;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)V", line = 16)
    public final void method1041(int arg0, int arg1, byte arg2) {
        ++field5548;
        if (arg2 < 11) {
            field5562 = -64;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loq;IILmc;)V", line = 30)
    public static final void method2439(class775 arg0, int arg1, int arg2, class234 arg3) {
        ++field5558;
        class295 var4 = new class295();
        var4.field3746 = arg3.method1509(true);
        var4.field3740 = arg3.method1497((byte) 112);
        var4.field3745 = new int[var4.field3746];
        var4.field3741 = new class339[var4.field3746];
        var4.field3747 = new byte[var4.field3746][][];
        var4.field3744 = new int[var4.field3746];
        var4.field3749 = new int[var4.field3746];
        var4.field3742 = new class339[var4.field3746];
        for (int var5 = 0; var4.field3746 > var5; ++var5) {
            try {
                int var6 = arg3.method1509(true);
                if (~var6 != -1 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = arg3.method1540((byte) -124);
                        String var8 = arg3.method1540((byte) -127);
                        int var9 = arg3.method1509(true);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var9 < ~var11; ++var11) {
                            var10[var11] = arg3.method1540((byte) -127);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; var9 > var13; ++var13) {
                                int var14 = arg3.method1497((byte) 90);
                                var12[var13] = new byte[var14];
                                arg3.method1495(var14, 0, (byte) -128, var12[var13]);
                            }
                        }
                        var4.field3749[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; ~var16 > ~var9; ++var16) {
                            var15[var16] = class115.method669((byte) -120, var10[var16]);
                        }
                        var4.field3741[var5] = arg0.method4232(var15, class115.method669((byte) -79, var7), 0, var8);
                        var4.field3747[var5] = var12;
                    }
                } else {
                    String var17 = arg3.method1540((byte) -88);
                    String var18 = arg3.method1540((byte) -110);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method1497((byte) 72);
                    }
                    var4.field3749[var5] = var6;
                    var4.field3745[var5] = var19;
                    var4.field3742[var5] = arg0.method4244(class115.method669((byte) -92, var17), var18, 255);
                }
            } catch (ClassNotFoundException var20) {
                var4.field3744[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3744[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3744[var5] = -3;
            } catch (Exception var23) {
                var4.field3744[var5] = -4;
            } catch (Throwable var24) {
                var4.field3744[var5] = -5;
            }
        }
        if (arg1 > -26) {
            field5562 = 64;
        }
        class403.field5363.method3593(var4, 15);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 145)
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field5557;
        int var4 = this.field5553 * arg1 >> 12;
        int var5 = this.field5565 * arg2 >> 12;
        int var6 = this.field5551 * arg1 >> 12;
        int var7 = this.field5552 * arg2 >> 12;
        int var8 = this.field5549 * arg1 >> 12;
        int var9 = this.field5563 * arg2 >> 12;
        int var10 = this.field5556 * arg1 >> 12;
        int var11 = this.field5555 * arg2 >> 12;
        class512.method2830(var7, var10, var9, arg0 + -1725717765, var8, var5, super.field6594, var11, var4, var6);
        if (arg0 != -23442) {
            method2440((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 188)
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5553 = arg0;
        this.field5563 = arg5;
        this.field5552 = arg3;
        this.field5551 = arg2;
        this.field5555 = arg7;
        this.field5565 = arg1;
        this.field5549 = arg4;
        this.field5556 = arg6;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 204)
    public static void method2440(byte arg0) {
        int var1 = 19 / ((-74 - arg0) / 37);
        field5560 = null;
        field5564 = null;
        field5559 = null;
    }
}
