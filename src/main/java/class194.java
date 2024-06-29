import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class194 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lik;")
    public static class78 field3020 = new class78();

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[I")
    public static int[] field3041 = new int[4096];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lu;")
    public static final class40 method1294(byte arg0) {
        int var1 = 25 % ((-arg0 - 54) / 56);
        field3023++;
        try {
            return (class40) Class.forName("bc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;BLqs;Z)Lis;")
    public static final class73 method1295(String arg0, byte arg1, class496 arg2, boolean arg3) {
        field3029++;
        int var4 = arg2.method2927(arg0, -103);
        if (var4 == -1) {
            return new class73(0);
        }
        int[] var5 = arg2.method2923(var4, -123);
        if (arg1 >= -81) {
            return null;
        }
        class73 var6 = new class73(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1257) {
                class23 var9 = new class23(arg2.method2926(var5[var8++], -115, var4));
                int var10 = var9.method143(-3230);
                int var11 = var9.method132(41);
                int var12 = var9.method126((byte) -77);
                if (!arg3 && var12 == 1) {
                    var6.field1257--;
                } else {
                    var6.field1252[var7] = var10;
                    var6.field1254[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field3041 = null;
        field3020 = null;
        if (arg0 >= -105) {
            field3027 = 7;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lec;I)V")
    public static final void method1297(int arg0, class68[] arg1, int arg2) {
        field3024++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class68 var4 = arg1[var3];
            if (var4 != null && var4.field1047 == arg2 && !client.method481(var4)) {
                if (var4.field1086 == 0) {
                    method1297(arg0, arg1, var4.field1059);
                    if (var4.field997 != null) {
                        method1297(-20896, var4.field997, var4.field1059);
                    }
                    class52 var5 = (class52) class259.field4346.method2516((long) var4.field1059, -1);
                    if (var5 != null) {
                        class241.method1649(var5.field841, -1);
                    }
                }
                if (var4.field1086 == 6 && var4.field1016 != -1) {
                    class145 var6 = class130.field2232.method634(-1271654143, var4.field1016);
                    if (var6 != null) {
                        var4.field1046 += class431.field6455;
                        while (var4.field1046 > var6.field2375[var4.field1084]) {
                            var4.field1046 -= var6.field2375[var4.field1084];
                            var4.field1084++;
                            if (var6.field2377.length <= var4.field1084) {
                                var4.field1084 -= var6.field2372;
                                if (var4.field1084 < 0 || var4.field1084 >= var6.field2377.length) {
                                    var4.field1084 = 0;
                                }
                            }
                            var4.field1025 = var4.field1084 + 1;
                            if (var6.field2377.length <= var4.field1025) {
                                var4.field1025 -= var6.field2372;
                                if (var4.field1025 < 0 || var4.field1025 >= var6.field2377.length) {
                                    var4.field1025 = -1;
                                }
                            }
                            class396.method2476(var4, arg0 + 20897);
                        }
                    }
                }
            }
        }
        if (arg0 != -20896) {
            field3041 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLsr;)V")
    public static final void method1298(byte arg0, class430 arg1) {
        arg1.field6451 = null;
        field3016++;
        int var2 = arg1.field6447.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field6447[var3].field4520 = false;
        }
        class78[] var4 = class219.field3788;
        synchronized (class219.field3788) {
            if (var2 < class219.field3788.length && class422.field6377[var2] < 200) {
                class219.field3788[var2].method567(arg1, 255);
                int var10002 = class422.field6377[var2]++;
            }
            if (arg0 != -56) {
                method1298((byte) 107, null);
            }
        }
    }
}
