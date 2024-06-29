import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class93 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lng;")
    private class226 field1381 = new class226(128);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lng;")
    public class226 field1392 = new class226(64);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lic;")
    public class491 field1389;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lic;")
    private class491 field1387;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public static int[] field1380 = new int[100];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1391;

    static {
        new class475("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIBII)V", line = 8)
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1386++;
        if (arg7 != 57) {
            field1380 = null;
        }
        class278 var10 = null;
        for (class278 var11 = (class278) class422.field6338.method816(119); var11 != null; var11 = (class278) class422.field6338.method812(90)) {
            if (var11.field4016 == arg8 && var11.field4008 == arg2 && var11.field4002 == arg9 && var11.field4015 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class278();
            var10.field4008 = arg2;
            var10.field4015 = arg5;
            var10.field4016 = arg8;
            var10.field4002 = arg9;
            if (arg2 >= 0 && arg9 >= 0 && class30.field323 > arg2 && arg9 < class182.field2661) {
                class65.method384(arg7 ^ 0xFFFFD02D, var10);
            }
            class422.field6338.method809(var10, false);
        }
        var10.field4014 = arg3;
        var10.field4006 = arg6;
        var10.field4012 = arg0;
        var10.field4004 = arg1;
        var10.field4005 = arg4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIIILvb;IIIII)Z", line = 53)
    public static final boolean method537(boolean arg0, int arg1, int arg2, int arg3, int arg4, class130 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1391++;
        int var11 = arg6;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        if (arg0) {
            return true;
        }
        int var15 = arg6 - var13;
        class402.field6048[var13][var14] = 99;
        int var16 = arg1 - var14;
        class230.field3438[var13][var14] = 0;
        byte var17 = 0;
        class199.field2885[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class315.field4499[var10001] = arg1;
        int[][] var19 = arg5.field2008;
        while (var26 != var18) {
            var12 = class315.field4499[var18];
            var11 = class199.field2885[var18];
            int var20 = var12 - var16;
            int var21 = var11 - arg5.field2021;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - arg5.field2009;
            int var23 = var11 - var15;
            if (arg4 == -4) {
                if (arg8 == var11 && arg9 == var12) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class429.method2562(arg9, var11, 1, arg2, var12, (byte) -109, arg3, 1, arg8)) {
                    class170.field2531 = var11;
                    class70.field1055 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg5.method868(67108864, var12, arg3, arg9, 1, 1, arg2, arg10, arg8, var11)) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg5.method866(arg2, arg9, arg10, arg8, (byte) 121, var11, 1, arg3, var12)) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg5.method862(var12, 27254, arg4, 1, arg8, arg9, var11, arg7)) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg5.method874(1, var12, arg8, -49, arg4, var11, arg9, arg7)) {
                class170.field2531 = var11;
                class70.field1055 = var12;
                return true;
            }
            int var25 = class230.field3438[var23][var20] + 1;
            if (var23 > 0 && class402.field6048[var23 - 1][var20] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12;
                class402.field6048[var23 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var23 - 1][var20] = var25;
            }
            if (var23 < 127 && class402.field6048[var23 + 1][var20] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var23 + 1][var20] = 8;
                class230.field3438[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && class402.field6048[var23][var20 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class199.field2885[var26] = var11;
                class315.field4499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var23][var20 - 1] = 1;
                class230.field3438[var23][var20 - 1] = var25;
            }
            if (var20 < 127 && class402.field6048[var23][var20 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class199.field2885[var26] = var11;
                class315.field4499[var26] = var12 + 1;
                class402.field6048[var23][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class402.field6048[var23 - 1][var20 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12 - 1;
                class402.field6048[var23 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var23 - 1][var20 - 1] = var25;
            }
            if (var23 < 127 && var20 > 0 && class402.field6048[var23 + 1][var20 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var23 + 1][var20 - 1] = 9;
                class230.field3438[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class402.field6048[var23 - 1][var20 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12 + 1;
                class402.field6048[var23 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var23 - 1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && class402.field6048[var23 + 1][var20 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var23 + 1][var20 + 1] = 12;
                class230.field3438[var23 + 1][var20 + 1] = var25;
            }
        }
        class170.field2531 = var11;
        class70.field1055 = var12;
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 303)
    public final void method538(int arg0, int arg1, int arg2) {
        this.field1381 = new class226(arg0);
        field1385++;
        if (arg1 != 1) {
            this.method543(-65);
        }
        this.field1392 = new class226(arg2);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Ldt;", line = 316)
    public final class158 method539(int arg0, byte arg1) {
        field1384++;
        class226 var3 = this.field1381;
        class158 var4;
        synchronized (this.field1381) {
            var4 = (class158) this.field1381.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1387.method2945(36, arg0, true);
        class158 var6 = new class158();
        var6.field2322 = arg0;
        var6.field2301 = this;
        if (var5 != null) {
            var6.method1009(new class209(var5), (byte) -3);
        }
        if (arg1 != 60) {
            return null;
        }
        var6.method1004((byte) 37);
        class226 var7 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 348)
    public final void method540(int arg0, int arg1) {
        field1388++;
        class226 var3 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method1534(0, arg0);
            if (arg1 <= 35) {
                this.field1387 = null;
            }
        }
        class226 var4 = this.field1392;
        synchronized (this.field1392) {
            this.field1392.method1534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 368)
    public static final String[] method541(String arg0, char arg1, int arg2) {
        field1382++;
        int var3 = class199.method1357(arg1, 0, arg0);
        String[] var4 = new String[arg2 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 400)
    public final void method542(boolean arg0) {
        field1390++;
        class226 var2 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method1539(-97);
            if (arg0) {
                this.method542(true);
            }
        }
        class226 var3 = this.field1392;
        synchronized (this.field1392) {
            this.field1392.method1539(-121);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 417)
    public final void method543(int arg0) {
        class226 var2 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method1540(0);
        }
        if (arg0 > -12) {
            method544(73);
        }
        field1383++;
        class226 var3 = this.field1392;
        synchronized (this.field1392) {
            this.field1392.method1540(0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 435)
    public static void method544(int arg0) {
        if (arg0 > -70) {
            method544(26);
        }
        field1380 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lai;ILic;Lic;)V", line = 461)
    public class93(class423 arg0, int arg1, class491 arg2, class491 arg3) {
        this.field1389 = arg3;
        this.field1387 = arg2;
        this.field1387.method2942(false, 36);
    }
}
