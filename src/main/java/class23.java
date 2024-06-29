import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public boolean field174 = false;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Lui;")
    public class231 field175;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lf;B)V", line = 4)
    public static final void method88(class756 arg0, byte arg1) {
        field170++;
        if (arg1 != 87) {
            return;
        }
        boolean var2 = false;
        arg0.method2287((byte) -90);
        for (class756 var3 = (class756) class526.field7066.method2348(-1); var3 != null; var3 = (class756) class526.field7066.method2343(0)) {
            if (class375.method2205((byte) 127, arg0.method4209(78), var3.method4209(103))) {
                var2 = true;
                class311.method1869(arg1 - 38, var3, arg0);
                break;
            }
        }
        if (!var2) {
            class526.field7066.method2341(arg0, -107);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIILha;)Lufa;", line = 36)
    public final class680 method89(boolean arg0, int arg1, int arg2, class60 arg3) {
        field166++;
        long var5 = (long) (arg2 << 16 | this.field168 | (arg0 ? 262144 : 0) | arg3.field632 << 19);
        class680 var7 = (class680) this.field175.field2978.method1571(-119, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field175.field2972.method2882(-51, this.field168)) {
            class204 var8 = class204.method1129(this.field175.field2972, this.field168, arg1);
            if (var8 != null) {
                var8.field2423 = var8.field2424 = var8.field2418 = var8.field2420 = 0;
                if (arg0) {
                    var8.method1126();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1131();
                }
            }
            class680 var10 = arg3.method366(var8, true);
            if (var10 != null) {
                this.field175.field2978.method1574(var5, var10, (byte) -80);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z", line = 78)
    public final boolean method90(int arg0) {
        field171++;
        int var2 = 93 % ((19 - arg0) / 63);
        return this.field175.field2972.method2882(-68, this.field168);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lji;Z)V", line = 90)
    public final void method91(class611 arg0, boolean arg1) {
        field172++;
        if (arg1) {
            method88(null, (byte) 10);
        }
        while (true) {
            int var3 = arg0.method3428((byte) -118);
            if (var3 == 0) {
                return;
            }
            this.method92(arg0, (byte) -43, var3);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lji;BI)V", line = 112)
    private final void method92(class611 arg0, byte arg1, int arg2) {
        field167++;
        if (arg1 != -43) {
            method94(79, -65, null);
        }
        if (arg2 == 1) {
            this.field168 = arg0.method3402((byte) 127);
        } else if (arg2 == 2) {
            this.field173 = arg0.method3385(arg1 ^ 0x56);
        } else if (arg2 == 3) {
            this.field174 = true;
        } else if (arg2 == 4) {
            this.field168 = -1;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 148)
    public static final void method93() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class532.field7227.length; var1++) {
                if (class532.field7227[var1].method3272()) {
                    class565.field7977[var1] = class532.field7227[var1].method3271();
                } else {
                    synchronized (class532.field7227[var1]) {
                        class532.field7227[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class532.field7227[class532.field7227.length - 1].method3270();
                class179.method1023(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class532.field7227.length - 1; var4++) {
                        if (!class532.field7227[var4].method3272()) {
                            synchronized (class532.field7227[var4]) {
                                class532.field7227[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class532.field7227.length - 2; var6++) {
                            class532.field7227[var6].method3270();
                        }
                        class179.method1023(2);
                        while (!class532.field7227[0].method3272()) {
                            synchronized (class532.field7227[0]) {
                                class532.field7227[0].notify();
                            }
                            try {
                                class267.method1599(0, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class532.field7227[0].method3270();
                        return;
                    }
                    try {
                        class267.method1599(0, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class267.method1599(0, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II[Lsba;)V", line = 249)
    public static final void method94(int arg0, int arg1, class218[] arg2) {
        field169++;
        if (arg1 != 28219) {
            method93();
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class218 var4 = arg2[var3];
            if (var4 != null && var4.field2693 == arg0 && !client.method1830(var4)) {
                if (var4.field2832 == 0) {
                    method94(var4.field2708, 28219, arg2);
                    if (var4.field2816 != null) {
                        method94(var4.field2708, 28219, var4.field2816);
                    }
                    class526 var5 = (class526) class520.field6994.method2552((long) var4.field2708, -1);
                    if (var5 != null) {
                        class54.method312(var5.field7062, arg1 - 28101);
                    }
                }
                if (var4.field2832 == 6 && var4.field2666 != -1) {
                    class300 var6 = class460.field6365.method1090(var4.field2666, 16383);
                    if (var6 != null) {
                        var4.field2782 += class242.field3146;
                        int var7 = var4.field2772;
                        while (var4.field2782 > var6.field4033[var4.field2772]) {
                            var4.field2782 -= var6.field4033[var4.field2772];
                            var4.field2772++;
                            if (var4.field2772 >= var6.field4042.length) {
                                var4.field2772 -= var6.field4055;
                                if (var4.field2772 < 0 || var4.field2772 >= var6.field4042.length) {
                                    var4.field2772 = 0;
                                }
                            }
                            var4.field2753 = var4.field2772 + 1;
                            if (var4.field2753 >= var6.field4042.length) {
                                var4.field2753 -= var6.field4055;
                                if (var4.field2753 < 0 || var6.field4042.length <= var4.field2753) {
                                    var4.field2753 = -1;
                                }
                            }
                            class277.method1652(1, var4);
                        }
                        if (var4.field2772 != var7) {
                            class268.method1605(var4.field2772, var6, (byte) 121);
                        }
                    }
                }
            }
        }
    }
}
