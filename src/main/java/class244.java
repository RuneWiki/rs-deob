import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class244 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lwi;")
    private class330 field3416 = new class330(64);

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Lwi;")
    public class330 field3434 = new class330(50);

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "Lvj;")
    public class310 field3435 = new class310(250);

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Lev;")
    private class497 field3436 = new class497();

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Luu;")
    public class191 field3418;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Z")
    private boolean field3430;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Lau;")
    private class527 field3437;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Luu;")
    private class191 field3427;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field3438;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field3440;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "S")
    public static short field3424 = 1;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lp;")
    public static class147 field3413;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
    public final void method1591(int arg0, int arg1) {
        class330 var3 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method2140(arg0 - 360, arg1);
        }
        field3417++;
        class330 var4 = this.field3434;
        synchronized (this.field3434) {
            this.field3434.method2140(-108, arg1);
        }
        class310 var5 = this.field3435;
        synchronized (this.field3435) {
            this.field3435.method1947(arg0 ^ arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lqa;ILba;IILqi;Lqa;IIZZI)Laa;")
    public final class341 method1592(class165 arg0, int arg1, class268 arg2, int arg3, int arg4, class405 arg5, class165 arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        field3422++;
        class341 var13 = this.method1598(arg7, -128, arg5, arg4, arg3, arg0, arg8, arg11);
        if (var13 != null) {
            return var13;
        }
        class74 var14 = this.method1603((byte) -99, arg4);
        if (arg7 > 1 && var14.field1080 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg7 >= var14.field1055[var16] && var14.field1055[var16] != 0) {
                    var15 = var14.field1080[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1603((byte) -99, var15);
            }
        }
        int[] var17 = var14.method523(arg0, arg9, arg11, arg3, arg7, arg2, (byte) 64, arg5, arg6, arg8);
        if (var17 == null) {
            return null;
        }
        class341 var18;
        if (arg10) {
            var18 = arg6.method767(var17, 0, 36, 36, 32);
        } else {
            var18 = arg0.method767(var17, 0, 36, 36, 32);
        }
        if (!arg10) {
            class497 var19 = new class497();
            var19.field7330 = arg8;
            var19.field7329 = arg3;
            var19.field7324 = arg5 != null;
            var19.field7331 = arg4;
            var19.field7322 = arg7;
            var19.field7323 = arg0.field2233;
            var19.field7325 = arg11;
            this.field3435.method1946(var18, (byte) 118, var19);
        }
        if (arg1 != 64) {
            this.method1602(true);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method1593(int arg0) {
        class330 var2 = this.field3434;
        synchronized (this.field3434) {
            this.field3434.method2127((byte) -73);
        }
        field3423++;
        int var3 = 118 / ((38 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        if (arg0 > 109) {
            field3413 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
    public final void method1595(boolean arg0, boolean arg1) {
        field3415++;
        if (arg0 != this.field3430) {
            this.field3430 = arg0;
            this.method1602(arg1);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
    public static final boolean method1596(int arg0, int arg1, int arg2) {
        field3428++;
        if (arg0 != -7159) {
            field3413 = null;
        }
        return class465.method2800(arg2, arg1, arg0 + 7038) | (arg1 & 0x40000) != 0 || class167.method1134(55, arg2, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3429++;
        if (~class203.field2716.field1173 != arg2 && arg3 != 0 && class303.field4434 < 50 && arg4 != -1) {
            class475.field7049[class303.field4434++] = new class153((byte) 1, arg4, arg3, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILqi;IILqa;II)Laa;")
    public final class341 method1598(int arg0, int arg1, class405 arg2, int arg3, int arg4, class165 arg5, int arg6, int arg7) {
        this.field3436.field7325 = arg7;
        this.field3436.field7322 = arg0;
        int var9 = -102 / ((arg1 - 42) / 53);
        this.field3436.field7331 = arg3;
        this.field3436.field7323 = arg5.field2233;
        field3425++;
        this.field3436.field7330 = arg6;
        this.field3436.field7329 = arg4;
        this.field3436.field7324 = arg2 != null;
        return (class341) this.field3435.method1950((byte) 49, this.field3436);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public final void method1599(int arg0) {
        class330 var2 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method2135(0);
        }
        field3414++;
        class330 var3 = this.field3434;
        synchronized (this.field3434) {
            this.field3434.method2135(0);
        }
        if (arg0 > -39) {
            method1594((byte) -125);
        }
        class310 var4 = this.field3435;
        synchronized (this.field3435) {
            this.field3435.method1944(114);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)V")
    public final void method1600(int arg0, byte arg1) {
        field3426++;
        this.field3439 = arg0;
        class330 var3 = this.field3434;
        synchronized (this.field3434) {
            this.field3434.method2127((byte) 123);
            int var4 = 70 % ((arg1 - 71) / 41);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    public final void method1601(byte arg0) {
        int var2 = -81 / ((arg0 - 18) / 44);
        class310 var3 = this.field3435;
        synchronized (this.field3435) {
            this.field3435.method1952((byte) -74);
        }
        field3421++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public final void method1602(boolean arg0) {
        field3432++;
        class330 var2 = this.field3416;
        synchronized (this.field3416) {
            if (!arg0) {
                return;
            }
            this.field3416.method2127((byte) 124);
        }
        class330 var3 = this.field3434;
        synchronized (this.field3434) {
            this.field3434.method2127((byte) 122);
        }
        class310 var4 = this.field3435;
        synchronized (this.field3435) {
            this.field3435.method1952((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)Lri;")
    public final class74 method1603(byte arg0, int arg1) {
        field3433++;
        class330 var3 = this.field3416;
        class74 var4;
        synchronized (this.field3416) {
            var4 = (class74) this.field3416.method2133((long) arg1, (byte) 94);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -99) {
            field3413 = null;
        }
        class191 var5 = this.field3427;
        byte[] var6;
        synchronized (this.field3427) {
            var6 = this.field3427.method1281(class453.method2761(arg1, 646699144), class146.method970((byte) -116, arg1), 62);
        }
        class74 var7 = new class74();
        var7.field1023 = arg1;
        var7.field1038 = this;
        var7.field1053 = new String[] { null, null, class499.field7366.method2705((byte) 69, this.field3420), null, null };
        var7.field1081 = new String[] { null, null, null, null, class354.field5484.method2705((byte) 69, this.field3420) };
        if (var6 != null) {
            var7.method518(new class164(var6), -77);
        }
        var7.method508(1);
        if (var7.field1091 != -1) {
            var7.method525(this.method1603((byte) -99, var7.field1050), (byte) 98, this.method1603((byte) -99, var7.field1091));
        }
        if (var7.field1026 != -1) {
            var7.method522((byte) 121, this.method1603((byte) -99, var7.field1045), this.method1603((byte) -99, var7.field1026));
        }
        if (!this.field3430 && var7.field1060) {
            var7.field1077 = class164.field2211.method2705((byte) 69, this.field3420);
            var7.field1022 = false;
            var7.field1081 = this.field3440;
            var7.field1043 = 0;
            var7.field1036 = null;
            var7.field1053 = this.field3438;
            if (var7.field1030 != null) {
                boolean var8 = false;
                for (class5 var9 = var7.field1030.method1743(false); var9 != null; var9 = var7.field1030.method1742(117)) {
                    class205 var10 = this.field3437.method3118((int) var9.field35, arg0 ^ 0x3509);
                    if (var10.field2732) {
                        var9.method25(-13489);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field1030 = null;
                }
            }
        }
        class330 var11 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Liv;IZLau;Luu;Luu;)V")
    public class244(class65 arg0, int arg1, boolean arg2, class527 arg3, class191 arg4, class191 arg5) {
        this.field3418 = arg5;
        this.field3430 = arg2;
        this.field3437 = arg3;
        this.field3420 = arg1;
        this.field3427 = arg4;
        if (this.field3427 == null) {
            this.field3419 = 0;
        } else {
            int var7 = this.field3427.method1294(-1) - 1;
            this.field3419 = this.field3427.method1290(false, var7) + var7 * 256;
        }
        this.field3438 = new String[] { null, null, class499.field7366.method2705((byte) 69, this.field3420), null, null };
        this.field3440 = new String[] { null, null, null, null, class354.field5484.method2705((byte) 69, this.field3420) };
    }
}
