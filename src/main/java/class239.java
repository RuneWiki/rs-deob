import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class239 {

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private int field3397 = 0;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lik;")
    private class17 field3392;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "S")
    public static short field3396 = 1;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field3394 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lim;")
    private class183 field3393;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)Lm;", line = 4)
    public static final class49 method1638(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3385++;
        long var5 = (long) arg2 & 0xFFFFL | ((long) arg1 & 0xFFFFL) << 32 | (long) arg3 & 0xFFFFL << 48 | ((long) arg4 & 0xFFFFL) << 16;
        class49 var7 = (class49) class210.field3029.method716(var5, false);
        if (var7 != null) {
            return var7;
        }
        class195[] var8 = null;
        class295 var9 = class68.method504(29, arg2);
        if (var9.field4375 != null) {
            var8 = new class195[var9.field4375.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class155 var11 = class154.method1112(var9.field4375[var10], -62);
                var8[var10] = new class195(var11.field2150, var11.field2154, var11.field2147, var11.field2149, var11.field2143, var11.field2155, var11.field2146, var11.field2141);
            }
        }
        class49 var12 = new class49(var9.field4381, var8, var9.field4379, arg3, arg1, arg4);
        class210.field3029.method721(var5, var12, arg0 + arg0);
        return var12;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lim;", line = 43)
    public final class183 method1639(int arg0) {
        field3391++;
        if (~this.field3397 < arg0 && this.field3392.field226[this.field3397 - 1] != this.field3393) {
            class183 var2 = this.field3393;
            this.field3393 = var2.field2523;
            return var2;
        }
        class183 var3;
        do {
            if (this.field3397 >= this.field3392.field231) {
                return null;
            }
            var3 = this.field3392.field226[this.field3397++].field2523;
        } while (this.field3392.field226[this.field3397 - 1] == var3);
        this.field3393 = var3.field2523;
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILwa;Lcg;I)V", line = 77)
    public static final void method1640(int arg0, class80 arg1, class316 arg2, int arg3) {
        class313 var4 = new class313();
        var4.field4729 = arg2.method2219(16448);
        var4.field4730 = arg2.method2172((byte) 71);
        var4.field4728 = new byte[var4.field4729][][];
        var4.field4722 = new int[var4.field4729];
        field3387++;
        if (arg3 > -83) {
            method1640(-105, (class80) null, (class316) null, 63);
        }
        var4.field4734 = new class285[var4.field4729];
        var4.field4732 = new int[var4.field4729];
        var4.field4733 = new class285[var4.field4729];
        var4.field4735 = new int[var4.field4729];
        for (int var5 = 0; var5 < var4.field4729; var5++) {
            try {
                int var6 = arg2.method2219(16448);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method2158(-872702056);
                    String var18 = arg2.method2158(-872702056);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method2172((byte) 71);
                    }
                    var4.field4735[var5] = var6;
                    var4.field4732[var5] = var19;
                    var4.field4733[var5] = arg1.method615(var18, (byte) 90, class115.method850(15, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method2158(-872702056);
                    String var8 = arg2.method2158(-872702056);
                    int var9 = arg2.method2219(16448);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method2158(-872702056);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method2172((byte) 71);
                            var12[var13] = new byte[var14];
                            arg2.method2207(var12[var13], var14, (byte) 103, 0);
                        }
                    }
                    var4.field4735[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class115.method850(15, var10[var16]);
                    }
                    var4.field4734[var5] = arg1.method614(var15, class115.method850(15, var7), -11, var8);
                    var4.field4728[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4722[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4722[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4722[var5] = -3;
            } catch (Exception var28) {
                var4.field4722[var5] = -4;
            } catch (Throwable var29) {
                var4.field4722[var5] = -5;
            }
        }
        class203.field2900.method1339((byte) -125, var4);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lim;", line = 194)
    public final class183 method1641(boolean arg0) {
        if (arg0) {
            method1640(107, (class80) null, (class316) null, 25);
        }
        this.field3397 = 0;
        field3386++;
        return this.method1639(-1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 209)
    public static final boolean method1642(int arg0, String arg1) {
        field3388++;
        if (arg0 != 10) {
            method1640(-81, (class80) null, (class316) null, -69);
        }
        return class302.method2053(10, true, false, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lik;)V", line = 235)
    public class239(class17 arg0) {
        this.field3392 = arg0;
    }
}
