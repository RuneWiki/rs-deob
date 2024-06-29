import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class125 {

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lli;")
    public class80 field2358 = new class80();

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public static int[] field2351 = new int[32];

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lr;")
    public static class66 field2366;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "J")
    public static long field2369;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lli;")
    private class80 field2362;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Z")
    public static boolean field2364;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lli;")
    public final class80 method860(byte arg0) {
        field2345++;
        class80 var2 = this.field2362;
        if (this.field2358 == var2) {
            this.field2362 = null;
            return null;
        }
        this.field2362 = var2.field1569;
        if (arg0 > -28) {
            this.method868((byte) 93);
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2366 = null;
        if (arg0 != 0) {
            field2370 = 92;
        }
        field2351 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
    public static final void method862(boolean arg0, int arg1) {
        class24.field307 = new int[104];
        class47.field848 = new int[104];
        class249.field4395 = new int[104];
        field2360++;
        class147.field2681 = 99;
        class187.field3232 = new int[104];
        class133.field2483 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class242.field4241 = new byte[var2][104][104];
        class34.field514 = new byte[var2][104][104];
        class165.field2971 = new byte[var2][105][105];
        class193.field3350 = new byte[var2][104][104];
        class192.field3326 = new byte[var2][104][104];
        if (arg1 != -1261) {
            field2368 = -118;
        }
        class250.field4413 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lr;ILr;I)V")
    public static final void method863(class66 arg0, int arg1, class66 arg2, int arg3) {
        class85.field1675 = arg0;
        field2356++;
        class85.field1674 = arg2;
        class4.field47 = false;
        class3.field38 = 0;
        class166.field2988 = arg3;
        if (class85.field1674.method463(class85.field1679, (byte) 116) || class85.field1675.method463(class85.field1679, (byte) 127)) {
            class184.field3217 = 3;
            class173.field3059 = 0;
            return;
        }
        class184.field3217 = -3;
        if (arg1 <= 10) {
            method865(-14, (byte[]) null, -44, (class86) null);
        }
        class165.field2961 = 0;
        class173.field3059 = 1;
        class144.field2632 = 0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method864(int arg0) {
        field2355++;
        while (true) {
            class80 var2 = this.field2358.field1571;
            if (this.field2358 == var2) {
                if (arg0 != 105) {
                    method867(-95);
                }
                this.field2362 = null;
                return;
            }
            var2.method560(-17554);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BILp;)V")
    public static final void method865(int arg0, byte[] arg1, int arg2, class86 arg3) {
        field2348++;
        class147 var4 = new class147();
        var4.field2672 = arg1;
        var4.field1560 = (long) arg0;
        var4.field2684 = 0;
        var4.field2677 = arg3;
        class125 var5 = class256.field4499;
        synchronized (class256.field4499) {
            class256.field4499.method866(var4, true);
            if (arg2 != -30372) {
                method863((class66) null, -25, (class66) null, -36);
            }
        }
        class57.method377(600);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lli;Z)V")
    public final void method866(class80 arg0, boolean arg1) {
        field2349++;
        if (!arg1) {
            return;
        }
        if (arg0.field1569 != null) {
            arg0.method560(-17554);
        }
        arg0.field1571 = this.field2358;
        arg0.field1569 = this.field2358.field1569;
        arg0.field1569.field1571 = arg0;
        arg0.field1571.field1569 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method867(int arg0) {
        for (int var1 = arg0; var1 < class240.field4170; var1++) {
            int var2 = class83.field1599[var1];
            class45 var3 = class59.field988[var2];
            int var4 = class84.field1627.method1677(-6677);
            if ((var4 & 0x10) != 0) {
                var4 += class84.field1627.method1677(arg0 - 6677) << 8;
            }
            class183.method1216(var4, var3, -19219, var2);
        }
        field2347++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)I")
    public final int method868(byte arg0) {
        field2359++;
        class80 var2 = this.field2358.field1571;
        int var3 = 0;
        while (this.field2358 != var2) {
            var3++;
            var2 = var2.field1571;
        }
        if (arg0 < 12) {
            field2351 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lli;")
    public final class80 method869(int arg0) {
        if (arg0 != 30568) {
            this.method871((byte) 75, (class80) null);
        }
        field2350++;
        class80 var2 = this.field2358.field1569;
        if (this.field2358 == var2) {
            this.field2362 = null;
            return null;
        } else {
            this.field2362 = var2.field1569;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)Lli;")
    public final class80 method870(byte arg0) {
        class80 var2 = this.field2362;
        field2346++;
        if (this.field2358 == var2) {
            this.field2362 = null;
            return null;
        } else {
            this.field2362 = var2.field1571;
            int var3 = 81 / ((-arg0 - 49) / 56);
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLli;)V")
    public final void method871(byte arg0, class80 arg1) {
        if (arg1.field1569 != null) {
            arg1.method560(-17554);
        }
        field2353++;
        arg1.field1571 = this.field2358.field1571;
        arg1.field1569 = this.field2358;
        arg1.field1569.field1571 = arg1;
        arg1.field1571.field1569 = arg1;
        if (arg0 <= 33) {
            field2367 = 117;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static final void method872(byte arg0) {
        field2357++;
        for (int var1 = 0; var1 < 100; var1++) {
            class255.field4485[var1] = true;
        }
        if (arg0 <= 30) {
            field2367 = 91;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)Lli;")
    public final class80 method873(byte arg0) {
        if (arg0 != 76) {
            this.field2362 = null;
        }
        class80 var2 = this.field2358.field1571;
        field2352++;
        if (this.field2358 == var2) {
            this.field2362 = null;
            return null;
        } else {
            this.field2362 = var2.field1571;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lli;")
    public final class80 method874(int arg0) {
        field2361++;
        class80 var2 = this.field2358.field1571;
        int var3 = -90 % ((-arg0 - 41) / 50);
        if (this.field2358 == var2) {
            return null;
        } else {
            var2.method560(-17554);
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class125() {
        this.field2358.field1569 = this.field2358;
        this.field2358.field1571 = this.field2358;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2351[var1] = var0 - 1;
            var0 += var0;
        }
        field2367 = 128;
        field2368 = -1;
        field2363 = 0;
        field2366 = class93.method641(43, ": ");
        field2369 = 0L;
        field2365 = 0;
    }
}
