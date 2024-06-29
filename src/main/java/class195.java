import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class195 {

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "Lpja;")
    private class43 field2970 = new class43(64);

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Lpja;")
    public class43 field2977 = new class43(50);

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "Ljga;")
    public class747 field2981 = new class747(250);

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "Lfc;")
    private class274 field2983 = new class274();

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "Lgj;")
    public class662 field2973;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "Lhu;")
    private class143 field2986;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "Z")
    private boolean field2966;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "Lgj;")
    private class662 field2963;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2987;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field2985;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "Z")
    public static boolean field2971 = true;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "S")
    public static short field2982 = 256;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
    public final void method1409(int arg0, int arg1) {
        field2965++;
        this.field2984 = arg0;
        class43 var3 = this.field2977;
        synchronized (this.field2977) {
            if (arg1 != 32) {
                this.method1412(-25);
            }
            this.field2977.method273(127);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BI)Lgn;")
    public final class730 method1410(byte arg0, int arg1) {
        field2980++;
        class43 var3 = this.field2970;
        class730 var4;
        synchronized (this.field2970) {
            var4 = (class730) this.field2970.method266((byte) -127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field2963;
        byte[] var6;
        synchronized (this.field2963) {
            var6 = this.field2963.method3732(class47.method348((byte) -19, arg1), 8906, class10.method64(arg1, (byte) 83));
        }
        class730 var7 = new class730();
        var7.field10035 = arg1;
        if (arg0 <= 3) {
            this.field2970 = null;
        }
        var7.field10073 = this;
        var7.field10017 = new String[] { null, null, class641.field8825.method3566((byte) -56, this.field2972), null, null };
        var7.field10009 = new String[] { null, null, null, null, class641.field8826.method3566((byte) 104, this.field2972) };
        if (var6 != null) {
            var7.method4063(new class93(var6), 124);
        }
        var7.method4057((byte) 103);
        if (var7.field10011 != -1) {
            var7.method4055(this.method1410((byte) 86, var7.field10056), 2634, this.method1410((byte) 12, var7.field10011));
        }
        if (var7.field10081 != -1) {
            var7.method4058(this.method1410((byte) 85, var7.field10081), -14690, this.method1410((byte) 100, var7.field10000));
        }
        if (var7.field10077 != -1) {
            var7.method4054(true, this.method1410((byte) 21, var7.field10077), this.method1410((byte) 19, var7.field10028));
        }
        if (!this.field2966 && var7.field10080) {
            var7.field10079 = class641.field8822.method3566((byte) -109, this.field2972);
            var7.field10017 = this.field2987;
            var7.field10022 = false;
            var7.field10009 = this.field2985;
            var7.field10063 = 0;
            var7.field10030 = null;
            if (var7.field10036 != null) {
                boolean var8 = false;
                for (class154 var9 = var7.field10036.method335(-29067); var9 != null; var9 = var7.field10036.method336(84)) {
                    class485 var10 = this.field2986.method1159((byte) -90, (int) var9.field2528);
                    if (var10.field6562) {
                        var9.method1207(98);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field10036 = null;
                }
            }
        }
        class43 var11 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method270(var7, (long) arg1, -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIILha;Lqha;I)Lnf;")
    public final class604 method1411(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, class112 arg6, int arg7) {
        this.field2983.field3818 = arg3;
        this.field2983.field3816 = arg0;
        this.field2983.field3809 = arg6 != null;
        field2962++;
        this.field2983.field3810 = arg4;
        this.field2983.field3815 = arg5.field952;
        if (arg2 != -1) {
            this.field2985 = null;
        }
        this.field2983.field3814 = arg7;
        this.field2983.field3813 = arg1;
        return (class604) this.field2981.method4146(17398, this.field2983);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method1412(int arg0) {
        int var2 = 84 % ((arg0 + 76) / 43);
        field2969++;
        class43 var3 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method272(20);
        }
        class43 var4 = this.field2977;
        synchronized (this.field2977) {
            this.field2977.method272(20);
        }
        class747 var5 = this.field2981;
        synchronized (this.field2981) {
            this.field2981.method4147(63);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLkh;)Ljava/lang/String;")
    public static final String method1413(byte arg0, class17 arg1) {
        field2964++;
        if (client.method2010(arg1).method3889(true) == 0) {
            return null;
        }
        int var2 = 15 % ((arg0 - 44) / 35);
        if (arg1.field291 == null || arg1.field291.trim().length() == 0) {
            return class178.field2814 ? "Hidden-use" : null;
        } else {
            return arg1.field291;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public final void method1414(int arg0) {
        class43 var2 = this.field2977;
        synchronized (this.field2977) {
            this.field2977.method273(127);
        }
        field2974++;
        if (arg0 < 55) {
            field2971 = true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public final void method1415(byte arg0) {
        class747 var2 = this.field2981;
        synchronized (this.field2981) {
            this.field2981.method4149(false);
        }
        field2968++;
        int var3 = -43 / ((arg0 + 66) / 39);
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
    public static final void method1416(byte arg0) {
        field2978++;
        class3.field35++;
        class537 var1 = class476.method2729(class287.field3939, (byte) -46, class551.field7498);
        if (arg0 >= -77) {
            field2982 = 48;
        }
        var1.field7295.method754(0, 121);
        class173.method1314(false, var1);
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
    public final void method1417(int arg0, int arg1) {
        class43 var3 = this.field2970;
        synchronized (this.field2970) {
            if (arg0 != 0) {
                this.method1420(-46, false);
            }
            this.field2970.method265(arg1, -93);
        }
        field2976++;
        class43 var4 = this.field2977;
        synchronized (this.field2977) {
            this.field2977.method265(arg1, -54);
        }
        class747 var5 = this.field2981;
        synchronized (this.field2981) {
            this.field2981.method4152(arg1, 108);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZIILda;Lha;Lqha;ILha;BII)Lnf;")
    public final class604 method1418(boolean arg0, boolean arg1, int arg2, int arg3, class67 arg4, class66 arg5, class112 arg6, int arg7, class66 arg8, byte arg9, int arg10, int arg11) {
        field2967++;
        if (arg9 > -60) {
            this.field2970 = null;
        }
        class604 var13 = this.method1411(arg2, arg3, -1, arg7, arg10, arg5, arg6, arg11);
        if (var13 != null) {
            return var13;
        }
        class730 var14 = this.method1410((byte) 70, arg2);
        if (arg10 > 1 && var14.field10069 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg10 >= var14.field10027[var16] && var14.field10027[var16] != 0) {
                    var15 = var14.field10069[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1410((byte) 57, var15);
            }
        }
        int[] var17 = var14.method4046(arg7, arg4, arg8, -79, arg5, arg1, arg6, arg11, arg3, arg10);
        if (var17 == null) {
            return null;
        }
        class604 var18;
        if (arg0) {
            var18 = arg8.method495(0, 36, var17, 32, 36, true);
        } else {
            var18 = arg5.method495(0, 36, var17, 32, 36, true);
        }
        if (!arg0) {
            class274 var19 = new class274();
            var19.field3815 = arg5.field952;
            var19.field3809 = arg6 != null;
            var19.field3818 = arg7;
            var19.field3814 = arg11;
            var19.field3816 = arg2;
            var19.field3810 = arg10;
            var19.field3813 = arg3;
            this.field2981.method4150(var19, (byte) -82, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
    public final void method1419(int arg0) {
        class43 var2 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method273(arg0 ^ 0xD);
        }
        field2979++;
        class43 var3 = this.field2977;
        synchronized (this.field2977) {
            this.field2977.method273(127);
            if (arg0 != -2) {
                this.field2966 = false;
            }
        }
        class747 var4 = this.field2981;
        synchronized (this.field2981) {
            this.field2981.method4149(false);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
    public final void method1420(int arg0, boolean arg1) {
        field2975++;
        if (this.field2966 == arg1) {
            return;
        }
        this.field2966 = arg1;
        this.method1419(-2);
        if (arg0 >= -83) {
            this.field2986 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lim;IZLhu;Lgj;Lgj;)V")
    public class195(class598 arg0, int arg1, boolean arg2, class143 arg3, class662 arg4, class662 arg5) {
        this.field2973 = arg5;
        this.field2986 = arg3;
        this.field2972 = arg1;
        this.field2966 = arg2;
        this.field2963 = arg4;
        if (this.field2963 == null) {
            this.field2961 = 0;
        } else {
            int var7 = this.field2963.method3723(5) - 1;
            this.field2961 = var7 * 256 + this.field2963.method3730((byte) -111, var7);
        }
        this.field2987 = new String[] { null, null, class641.field8825.method3566((byte) -122, this.field2972), null, null };
        this.field2985 = new String[] { null, null, null, null, class641.field8826.method3566((byte) 108, this.field2972) };
    }
}
