import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class150 {

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Lak;")
    public class159 field2418 = new class159();

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
    public static int[] field2410 = new int[2048];

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Lge;")
    public static class340 field2409 = new class340();

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
    public static int[] field2422 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "F")
    public static float field2414;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Lak;")
    private class159 field2423;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
    public static int[] field2404;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "[S")
    public static short[] field2421;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILak;)V", line = 7)
    public final void method1077(int arg0, class159 arg1) {
        if (arg1.field2545 != null) {
            arg1.method1131(arg0 ^ 0xFF00F7);
        }
        if (arg0 != 16711935) {
            return;
        }
        arg1.field2551 = this.field2418;
        arg1.field2545 = this.field2418.field2545;
        arg1.field2545.field2551 = arg1;
        arg1.field2551.field2545 = arg1;
        field2403++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lak;B)V", line = 28)
    public final void method1078(class159 arg0, byte arg1) {
        if (arg0.field2545 != null) {
            arg0.method1131(8);
        }
        field2415++;
        if (arg1 > 9) {
            arg0.field2545 = this.field2418;
            arg0.field2551 = this.field2418.field2551;
            arg0.field2545.field2551 = arg0;
            arg0.field2551.field2545 = arg0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 47)
    public static void method1079(byte arg0) {
        field2409 = null;
        field2421 = null;
        field2422 = null;
        field2404 = null;
        field2410 = null;
        int var1 = 49 % ((42 - arg0) / 60);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Lak;", line = 61)
    public final class159 method1080(int arg0) {
        if (arg0 != -1) {
            return (class159) null;
        }
        field2412++;
        class159 var2 = this.field2418.field2551;
        if (this.field2418 == var2) {
            return null;
        } else {
            var2.method1131(arg0 + 9);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Lak;", line = 82)
    public final class159 method1081(int arg0) {
        int var2 = 4 / ((arg0 - 51) / 34);
        field2417++;
        class159 var3 = this.field2418.field2551;
        if (this.field2418 == var3) {
            this.field2423 = null;
            return null;
        } else {
            this.field2423 = var3.field2551;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V", line = 108)
    public final void method1082(int arg0) {
        field2411++;
        while (true) {
            class159 var2 = this.field2418.field2551;
            if (this.field2418 == var2) {
                if (arg0 != 64) {
                    this.field2418 = (class159) null;
                }
                this.field2423 = null;
                return;
            }
            var2.method1131(arg0 ^ 0x48);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lak;", line = 129)
    public final class159 method1083(byte arg0) {
        if (arg0 != 113) {
            this.method1086(-105);
        }
        field2408++;
        class159 var2 = this.field2423;
        if (this.field2418 == var2) {
            this.field2423 = null;
            return null;
        } else {
            this.field2423 = var2.field2551;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)Z", line = 155)
    public final boolean method1084(boolean arg0) {
        field2416++;
        if (arg0) {
            this.method1080(-96);
        }
        return this.field2418.field2551 == this.field2418;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 171)
    public static final void method1085(int arg0) {
        field2407++;
        try {
            if (class77.field1147 == 1) {
                int var1 = class228.field3583.method1563(-106);
                if (var1 > 0 && class228.field3583.method1587(arg0 ^ 0x7E)) {
                    int var2 = var1 - class259.field4104;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class228.field3583.method1564(var2, 48);
                    return;
                }
                class228.field3583.method1579(arg0 - 62);
                class228.field3583.method1561((byte) -72);
                class131.field1992 = null;
                class244.field3845 = null;
                if (class58.field885 == null) {
                    class77.field1147 = 0;
                } else {
                    class77.field1147 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class228.field3583.method1579(arg0 ^ 0x42);
            class244.field3845 = null;
            class58.field885 = null;
            class131.field1992 = null;
            class77.field1147 = 0;
        }
        if (arg0 != 64) {
            field2420 = -118;
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lak;", line = 221)
    public final class159 method1086(int arg0) {
        field2413++;
        if (arg0 != 27627) {
            return (class159) null;
        }
        class159 var2 = this.field2418.field2545;
        if (this.field2418 == var2) {
            this.field2423 = null;
            return null;
        } else {
            this.field2423 = var2.field2545;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIILsm;II)Lsm;", line = 247)
    public static final class128 method1087(int arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, int arg6) {
        field2405++;
        long var7 = (long) arg0;
        class128 var9 = (class128) class41.field627.method652(var7, false);
        if (var9 == null) {
            class135 var10 = class135.method925(class248.field3951, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method906(64, 768, -50, -10, -50);
            class41.field627.method642(var9, var7, arg5 - 123);
        }
        int var11 = arg4.method174();
        int var12 = arg4.method186();
        int var13 = arg4.method154();
        int var14 = arg4.method183();
        if (arg5 != 0) {
            field2419 = 116;
        }
        class128 var15 = var9.method198(true, true, true);
        if (arg2 != 0) {
            var15.method149(arg2);
        }
        if (class245.field3886) {
            class22 var16 = (class22) var15;
            if (client.method889(arg1 + var11, class120.field1779, arg3 + var13, -121) != arg6 || arg6 != client.method889(arg1 + var12, class120.field1779, arg3 + var14, arg5 + -107)) {
                for (int var17 = 0; var17 < var16.field280; var17++) {
                    var16.field301[var17] += client.method889(var16.field306[var17] + arg1, class120.field1779, var16.field279[var17] + arg3, class185.method1279(arg5, -122)) - arg6;
                }
                var16.field286.field2516 = false;
                var16.field295.field4822 = false;
            }
        } else {
            class67 var18 = (class67) var15;
            if (arg6 != client.method889(arg1 + var11, class120.field1779, arg3 + var13, -116) || client.method889(arg1 + var12, class120.field1779, arg3 + var14, -124) != arg6) {
                for (int var19 = 0; var19 < var18.field967; var19++) {
                    var18.field969[var19] += client.method889(var18.field973[var19] + arg1, class120.field1779, var18.field990[var19] + arg3, -115) - arg6;
                }
                var18.field982 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lak;", line = 327)
    public final class159 method1088(int arg0) {
        field2406++;
        if (arg0 <= 117) {
            this.method1084(true);
        }
        class159 var2 = this.field2423;
        if (this.field2418 == var2) {
            this.field2423 = null;
            return null;
        } else {
            this.field2423 = var2.field2545;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 361)
    public class150() {
        this.field2418.field2551 = this.field2418;
        this.field2418.field2545 = this.field2418;
    }
}
