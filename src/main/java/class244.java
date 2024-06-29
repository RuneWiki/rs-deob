import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class244 {

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field4335 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static volatile int field4337 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lhi;")
    public static class24 field4326 = null;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lha;")
    public static class46 field4339 = class271.method1828("(U1", -46);

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lha;")
    public static class46 field4342 = class271.method1828("Titelbild geladen)3", -46);

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
    public static int[] field4344 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[B")
    public byte[] field4323;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[B")
    public byte[] field4324;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIJI)Z")
    public static final boolean method1670(byte arg0, int arg1, long arg2, int arg3) {
        field4329++;
        int var5 = 40 / ((arg0 - 55) / 43);
        int var6 = ((int) arg2 & 0x370967) >> 20;
        int var7 = (int) arg2 >> 14 & 0x1F;
        int var8 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class236 var9 = class157.method1158(var8, 112);
            int var10 = var9.field4114;
            int var11;
            int var12;
            if (var6 == 0 || var6 == 2) {
                var12 = var9.field4152;
                var11 = var9.field4130;
            } else {
                var11 = var9.field4152;
                var12 = var9.field4130;
            }
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            class112.method916(0, -10543, class277.field4824.field2523[0], arg1, class277.field4824.field2517[0], arg3, 2, var12, 0, var10, true, var11);
        } else {
            class112.method916(var7 + 1, -10543, class277.field4824.field2523[0], arg1, class277.field4824.field2517[0], arg3, 2, 0, var6, 0, true, 0);
        }
        class58.field964 = 0;
        class277.field4821 = class143.field2607;
        class126.field2313 = 2;
        class78.field1493 = class100.field1850;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method1671(int arg0) {
        class236.field4171.method84(arg0 ^ 0xFFFF8183);
        if (arg0 == 4) {
            field4331++;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method1672(int arg0) {
        if (arg0 == 38) {
            field4342 = null;
            field4339 = null;
            field4326 = null;
            field4344 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLwe;)V")
    public static final void method1674(byte arg0, class75 arg1) {
        field4332++;
        int var2 = arg1.method557(-22718);
        class114.field2159 = new class122[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class114.field2159[var3] = new class122();
            class114.field2159[var3].field2267 = arg1.method557(-22718);
            class114.field2159[var3].field2270 = arg1.method583(0);
        }
        class122.field2268 = arg1.method557(-22718);
        class161.field2850 = arg1.method557(-22718);
        class126.field2314 = arg1.method557(arg0 - 22649);
        class202.field3629 = new class119[class161.field2850 + 1 - class122.field2268];
        for (int var4 = 0; var4 < class126.field2314; var4++) {
            int var5 = arg1.method557(-22718);
            class119 var6 = class202.field3629[var5] = new class119();
            var6.field3723 = arg1.method558(arg0 ^ 0xFFFFFFBA);
            var6.field3733 = arg1.method562((byte) -71);
            var6.field2240 = class122.field2268 + var5;
            var6.field2232 = arg1.method583(0);
            var6.field2230 = arg1.method583(0);
        }
        if (arg0 != -69) {
            field4344 = null;
        }
        class194.field3483 = arg1.method562((byte) -71);
        class71.field1217 = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIZII)V")
    public static final void method1675(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4343++;
        if (arg5 > arg6) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg6;
            class119 var9 = class118.field2213[var7];
            class118.field2213[var7] = class118.field2213[arg5];
            class118.field2213[arg5] = var9;
            for (int var10 = arg6; var10 < arg5; var10++) {
                if (class98.method762(false, arg0, var9, class118.field2213[var10], arg4, arg2, arg3) <= 0) {
                    class119 var11 = class118.field2213[var10];
                    class118.field2213[var10] = class118.field2213[var8];
                    class118.field2213[var8++] = var11;
                }
            }
            class118.field2213[arg5] = class118.field2213[var8];
            class118.field2213[var8] = var9;
            method1675(arg0, 121, arg2, arg3, arg4, var8 - 1, arg6);
            method1675(arg0, 127, arg2, arg3, arg4, arg5, var8 + 1);
        }
        if (arg1 < 117) {
            field4335 = -17;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method1676(byte arg0) {
        class194.field3475.method1599(25);
        field4328++;
        int var1 = -71 % ((arg0 + 3) / 41);
        class14.field220.method1665(1502);
        class32.field600.method1665(1502);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        field4322++;
        int var1 = class147.field2651.method283((byte) 0, 8);
        if (var1 < class156.field2783) {
            for (int var2 = var1; var2 < class156.field2783; var2++) {
                class60.field1012[class175.field3149++] = class129.field2373[var2];
            }
        }
        if (var1 > class156.field2783) {
            throw new RuntimeException("gppov1");
        }
        class156.field2783 = 0;
        if (arg0 != 13802) {
            field4326 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class129.field2373[var3];
            class81 var5 = class1.field6[var4];
            int var6 = class147.field2651.method283((byte) 0, 1);
            if (var6 == 0) {
                class129.field2373[class156.field2783++] = var4;
                var5.field2557 = class157.field2803;
            } else {
                int var7 = class147.field2651.method283((byte) 0, 2);
                if (var7 == 0) {
                    class129.field2373[class156.field2783++] = var4;
                    var5.field2557 = class157.field2803;
                    class93.field1758[class111.field2082++] = var4;
                } else if (var7 == 1) {
                    class129.field2373[class156.field2783++] = var4;
                    var5.field2557 = class157.field2803;
                    int var8 = class147.field2651.method283((byte) 0, 3);
                    var5.method1062(false, false, var8);
                    int var9 = class147.field2651.method283((byte) 0, 1);
                    if (var9 == 1) {
                        class93.field1758[class111.field2082++] = var4;
                    }
                } else if (var7 == 2) {
                    class129.field2373[class156.field2783++] = var4;
                    var5.field2557 = class157.field2803;
                    int var10 = class147.field2651.method283((byte) 0, 3);
                    var5.method1062(true, false, var10);
                    int var11 = class147.field2651.method283((byte) 0, 3);
                    var5.method1062(true, false, var11);
                    int var12 = class147.field2651.method283((byte) 0, 1);
                    if (var12 == 1) {
                        class93.field1758[class111.field2082++] = var4;
                    }
                } else if (var7 == 3) {
                    class60.field1012[class175.field3149++] = var4;
                }
            }
        }
    }
}
