import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class273 extends class245 {

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    private int field3884;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field3879;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3888 = "";

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Lpga;")
    public static class536 field3883;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILrg;Lge;I)V", line = 3)
    public static final void method1728(int arg0, class645 arg1, class711 arg2, int arg3) {
        ++field3877;
        class67 var4 = new class67();
        var4.field959 = arg1.method3745(arg3 ^ 8351);
        var4.field957 = arg1.method3720(-19541);
        var4.field958 = new int[var4.field959];
        if (arg3 != -14391) {
            field3883 = null;
        }
        var4.field965 = new byte[var4.field959][][];
        var4.field954 = new class197[var4.field959];
        var4.field962 = new class197[var4.field959];
        var4.field966 = new int[var4.field959];
        var4.field956 = new int[var4.field959];
        for (int var5 = 0; ~var5 > ~var4.field959; ++var5) {
            try {
                int var6 = arg1.method3745(-6314);
                if (var6 != 0 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = arg1.method3752(-2);
                        String var11 = arg1.method3752(-2);
                        int var12 = arg1.method3745(-6314);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var12 > var14; ++var14) {
                            var13[var14] = arg1.method3752(-2);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg1.method3720(-19541);
                                var15[var16] = new byte[var17];
                                arg1.method3736(-99, var15[var16], var17, 0);
                            }
                        }
                        var4.field958[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class538.method3160(arg3 + 14470, var13[var19]);
                        }
                        var4.field962[var5] = arg2.method4057(var18, var11, class538.method3160(79, var10), arg3 + 14391);
                        var4.field965[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method3752(-2);
                    String var8 = arg1.method3752(-2);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method3720(arg3 ^ 29794);
                    }
                    var4.field958[var5] = var6;
                    var4.field966[var5] = var9;
                    var4.field954[var5] = arg2.method4045(111, class538.method3160(79, var7), var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field956[var5] = -1;
            } catch (SecurityException var21) {
                var4.field956[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field956[var5] = -3;
            } catch (Exception var23) {
                var4.field956[var5] = -4;
            } catch (Throwable var24) {
                var4.field956[var5] = -5;
            }
        }
        class195.field2969.method1203(var4, (byte) 102);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(III)V", line = 117)
    public final void method158(int arg0, int arg1, int arg2) {
        ++field3878;
        int var4 = this.field3881 * arg0 >> 12;
        int var5 = this.field3884 * arg0 >> 12;
        int var6 = this.field3879 * arg2 >> 12;
        if (arg1 != 0) {
            field3888 = null;
        }
        int var7 = this.field3885 * arg2 >> 12;
        class361.method2246(super.field3567, var4, 90, super.field3574, var5, var7, var6, super.field3570);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V", line = 139)
    public final void method159(int arg0, int arg1, int arg2) {
        ++field3882;
        int var4 = this.field3881 * arg1 >> 12;
        int var5 = this.field3884 * arg1 >> 12;
        int var6 = this.field3879 * arg2 >> 12;
        int var7 = this.field3885 * arg2 >> 12;
        class313.method1986(super.field3570, var4, super.field3574, var7, var6, arg0 ^ arg0, var5);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V", line = 155)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3885 = arg3;
        this.field3884 = arg2;
        this.field3881 = arg0;
        this.field3879 = arg1;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 168)
    public static void method1729(int arg0) {
        field3888 = null;
        field3883 = null;
        if (arg0 != 16777215) {
            method1729(29);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V", line = 181)
    public final void method161(int arg0, int arg1, int arg2) {
        ++field3886;
        int var4 = this.field3881 * arg0 >> 12;
        int var5 = this.field3884 * arg0 >> 12;
        int var6 = -35 / ((arg1 - -27) / 62);
        int var7 = this.field3879 * arg2 >> 12;
        int var8 = this.field3885 * arg2 >> 12;
        class299.method1885(5, var7, var5, var4, var8, super.field3567);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIIIIIII[B)V", line = 201)
    public static final void method1730(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field3887;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 3);
        if (arg5 > -61) {
            method1730((byte[]) null, 15, -70, 33, -1, 54, 3, 41, (byte[]) null);
        }
        for (int var11 = -arg7; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg1++;
                arg0[var10001] += arg8[arg3++];
                int var14 = arg1++;
                arg0[var14] += arg8[arg3++];
                int var15 = arg1++;
                arg0[var15] += arg8[arg3++];
                int var16 = arg1++;
                arg0[var16] += arg8[arg3++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg1++;
                arg0[var10001] += arg8[arg3++];
            }
            arg1 += arg4;
            arg3 += arg6;
        }
    }
}
