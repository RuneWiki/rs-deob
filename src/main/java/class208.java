import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class208 {

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lkp;")
    private class456 field2462;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lhd;")
    private class694 field2455;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "Lcga;")
    public static class449 field2472 = new class449(55, 3);

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lnn;")
    public static class385 field2473 = new class385(8);

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2474 = new String[5];

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 5)
    public static void method1217(int arg0) {
        field2472 = null;
        if (arg0 == -6675) {
            field2474 = null;
            field2473 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 18)
    public final void method1218(int arg0) {
        this.field2462.method2501(9);
        field2469++;
        this.field2455.method3839((byte) -93);
        this.field2459 = this.field2460;
        if (arg0 < 92) {
            this.method1230((byte) 22, 23L, null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILaea;)V", line = 32)
    private final void method1219(int arg0, class47 arg1) {
        field2466++;
        if (arg0 >= -118) {
            this.field2455 = null;
        }
        if (arg1 != null) {
            arg1.method1566(-119);
            arg1.method2110(124);
            this.field2459 += arg1.field631;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 49)
    public final Object method1220(byte arg0) {
        field2457++;
        if (arg0 <= 119) {
            this.field2460 = 49;
        }
        class47 var2 = (class47) this.field2455.method3830((byte) 106);
        while (var2 != null) {
            Object var3 = var2.method285((byte) 82);
            if (var3 != null) {
                return var3;
            }
            class47 var4 = var2;
            var2 = (class47) this.field2455.method3838((byte) -92);
            var4.method1566(-85);
            var4.method2110(102);
            this.field2459 += var4.field631;
        }
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 80)
    public final Object method1221(long arg0, boolean arg1) {
        field2471++;
        class47 var4 = (class47) this.field2455.method3828(arg0, (byte) -91);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method285((byte) 102);
        if (var5 == null) {
            var4.method1566(-104);
            var4.method2110(93);
            this.field2459 += var4.field631;
            return null;
        }
        if (var4.method287(-23906)) {
            class306 var6 = new class306(var5, var4.field631);
            this.field2455.method3832(var6, var4.field3321, 96);
            this.field2462.method2504((byte) -96, var6);
            var6.field4648 = 0L;
            var4.method1566(-76);
            var4.method2110(119);
        } else {
            this.field2462.method2504((byte) -125, var4);
            var4.field4648 = 0L;
        }
        if (!arg1) {
            field2473 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 127)
    public final void method1222(int arg0, int arg1) {
        if (arg0 != 14564) {
            return;
        }
        if (class595.field7983 != null) {
            for (class47 var3 = (class47) this.field2462.method2502(false); var3 != null; var3 = (class47) this.field2462.method2509((byte) -126)) {
                if (var3.method287(arg0 ^ 0xFFFF9A7A)) {
                    if (var3.method285((byte) 108) == null) {
                        var3.method1566(arg0 ^ 0xFFFFC72E);
                        var3.method2110(97);
                        this.field2459++;
                    }
                } else if (++var3.field4648 > (long) arg1) {
                    class47 var4 = class595.field7983.method1190(var3, 9156);
                    this.field2455.method3832(var4, var3.field3321, arg0 - 14438);
                    class517.method2804(var4, var3, -116);
                    var3.method1566(arg0 ^ 0xFFFFC771);
                    var3.method2110(101);
                }
            }
        }
        field2463++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(JB)V", line = 177)
    private final void method1223(long arg0, byte arg1) {
        field2456++;
        class47 var4 = (class47) this.field2455.method3828(arg0, (byte) -91);
        if (arg1 == 97) {
            this.method1219(arg1 - 220, var4);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 190)
    public final void method1224(boolean arg0) {
        for (class47 var2 = (class47) this.field2462.method2502(arg0); var2 != null; var2 = (class47) this.field2462.method2509((byte) 55)) {
            if (var2.method287(-23906)) {
                var2.method1566(-82);
                var2.method2110(116);
                this.field2459 += var2.field631;
            }
        }
        field2470++;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)I", line = 212)
    public final int method1225(int arg0) {
        field2464++;
        if (arg0 < 27) {
            this.field2455 = null;
        }
        return this.field2459;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V", line = 331)
    public class208(int arg0, int arg1) {
        this.field2462 = new class456();
        this.field2460 = arg0;
        this.field2459 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && var3 < arg1; var3 += var3) {
        }
        this.field2455 = new class694(var3);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)I", line = 227)
    public final int method1226(int arg0) {
        field2468++;
        int var2 = 0;
        for (class47 var3 = (class47) this.field2462.method2502(false); var3 != null; var3 = (class47) this.field2462.method2509((byte) -124)) {
            if (!var3.method287(-23906)) {
                var2++;
            }
        }
        if (arg0 > -34) {
            this.field2460 = -64;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I", line = 251)
    public final int method1227(int arg0) {
        field2465++;
        if (arg0 >= -85) {
            this.field2460 = 53;
        }
        return this.field2460;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBLjava/lang/Object;J)V", line = 267)
    public final void method1228(int arg0, byte arg1, Object arg2, long arg3) {
        if (arg1 != 41) {
            return;
        }
        field2458++;
        if (arg0 > this.field2460) {
            throw new IllegalStateException("s>cs");
        }
        this.method1223(arg3, (byte) 97);
        this.field2459 -= arg0;
        while (this.field2459 < 0) {
            class47 var7 = (class47) this.field2462.method2507((byte) 80);
            this.method1219(-124, var7);
        }
        class306 var6 = new class306(arg2, arg0);
        this.field2455.method3832(var6, arg3, 12);
        this.field2462.method2504((byte) -91, var6);
        var6.field4648 = 0L;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 298)
    public final Object method1229(int arg0) {
        field2461++;
        if (arg0 > -81) {
            this.method1218(111);
        }
        class47 var2 = (class47) this.field2455.method3838((byte) -92);
        while (var2 != null) {
            Object var3 = var2.method285((byte) 115);
            if (var3 != null) {
                return var3;
            }
            class47 var4 = var2;
            var2 = (class47) this.field2455.method3838((byte) -92);
            var4.method1566(-102);
            var4.method2110(88);
            this.field2459 += var4.field631;
        }
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V", line = 347)
    public class208(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BJLjava/lang/Object;)V", line = 357)
    public final void method1230(byte arg0, long arg1, Object arg2) {
        this.method1228(1, (byte) 41, arg2, arg1);
        field2467++;
        int var5 = -67 % ((arg0 + 49) / 55);
    }
}
