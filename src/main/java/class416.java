import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class416 {

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lfk;")
    private class393 field5919 = new class393();

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    private int field5905;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Lec;")
    private class129 field5916;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field5911 = 0;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5913 = null;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "Lkn;")
    public static class442 field5912 = new class442("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Lkn;")
    public static class442 field5922 = new class442("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V", line = 3)
    public final void method2606(int arg0, int arg1) {
        field5906++;
        if (class149.field2115 != null) {
            for (class240 var3 = (class240) this.field5919.method2482(-82); var3 != null; var3 = (class240) this.field5919.method2476(1)) {
                if (var3.method393(false)) {
                    if (var3.method395(true) == null) {
                        var3.method2467((byte) -69);
                        var3.method2783((byte) -122);
                        this.field5904++;
                    }
                } else if (++var3.field6253 > (long) arg1) {
                    class240 var4 = class149.field2115.method2052(var3, 128);
                    this.field5916.method883((byte) -54, var3.field5600, var4);
                    class141.method968(var4, var3, arg0 ^ 0xFFFFCA45);
                    var3.method2467((byte) -107);
                    var3.method2783((byte) -122);
                }
            }
        }
        if (arg0 != 0) {
            this.field5916 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLt;)Ljava/lang/Object;", line = 53)
    public final Object method2607(byte arg0, class400 arg1) {
        field5920++;
        long var3 = arg1.method2517(116);
        class240 var5 = (class240) this.field5916.method886(var3, 25651);
        if (arg0 != -85) {
            field5922 = null;
        }
        while (var5 != null) {
            if (var5.field3418.method2518(-4857, arg1)) {
                Object var6 = var5.method395(true);
                if (var6 != null) {
                    if (var5.method393(false)) {
                        class44 var7 = new class44(arg1, var6);
                        this.field5916.method883((byte) -54, var5.field5600, var7);
                        this.field5919.method2478(var7, false);
                        var7.field6253 = 0L;
                        var5.method2467((byte) -77);
                        var5.method2783((byte) -122);
                    } else {
                        this.field5919.method2478(var5, false);
                        var5.field6253 = 0L;
                    }
                    return var6;
                }
                var5.method2467((byte) -125);
                var5.method2783((byte) -122);
                this.field5904++;
            }
            var5 = (class240) this.field5916.method882(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I", line = 107)
    public final int method2608(int arg0) {
        if (arg0 == 0) {
            field5917++;
            return this.field5904;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)I", line = 126)
    public final int method2609(int arg0) {
        if (arg0 == 0) {
            field5918++;
            return this.field5905;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)V", line = 137)
    public static final void method2610(int arg0, int arg1) {
        if (!class214.field2988) {
            arg0 = -1;
        }
        field5907++;
        if (class71.field1035 == arg0) {
            return;
        }
        if (arg0 != arg1) {
            class378 var2 = class173.method1136(21742, arg0);
            class238 var3 = var2.method2419((byte) 113);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class241.field3426.method1901(class304.field4191, var3.method1607(), var3.method1615(), new Point(var2.field5410, var2.field5407), true, var3.method1609());
                class71.field1035 = arg0;
            }
        }
        if (arg0 == -1 && class71.field1035 != -1) {
            class241.field3426.method1901(class304.field4191, (int[]) null, -1, new Point(), true, -1);
            class71.field1035 = -1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 176)
    public final void method2611(byte arg0) {
        field5915++;
        this.field5919.method2486(221);
        int var2 = 125 % ((-arg0 - 75) / 43);
        this.field5916.method888(-87);
        this.field5904 = this.field5905;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;Lt;B)V", line = 189)
    public final void method2612(Object arg0, class400 arg1, byte arg2) {
        if (arg2 != -23) {
            return;
        }
        field5908++;
        this.method2615(arg1, -1);
        if (this.field5904 == 0) {
            class240 var4 = (class240) this.field5919.method2481((byte) -78);
            var4.method2467((byte) -126);
            var4.method2783((byte) -122);
        } else {
            this.field5904--;
        }
        class44 var5 = new class44(arg1, arg0);
        this.field5916.method883((byte) -54, arg1.method2517(113), var5);
        this.field5919.method2478(var5, false);
        var5.field6253 = 0L;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 224)
    public static void method2613(int arg0) {
        field5913 = null;
        if (arg0 != -27819) {
            field5923 = -80;
        }
        field5912 = null;
        field5922 = null;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V", line = 313)
    public class416(int arg0) {
        this.field5905 = arg0;
        this.field5904 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5916 = new class129(var2);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V", line = 248)
    public static final void method2614(byte arg0) {
        if (arg0 < 46) {
            field5913 = null;
        }
        while (class333.field4591.method1190((byte) 125, class15.field290) >= 11) {
            int var1 = class333.field4591.method1186((byte) -97, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class381.field5447[var1] == null) {
                class381.field5447[var1] = new class134();
                class381.field5447[var1].field5294 = var1;
                if (class414.field5864[var1] != null) {
                    class381.field5447[var1].method938(class414.field5864[var1], (byte) 64);
                }
                var2 = true;
            }
            class66.field974[class26.field467++] = var1;
            class134 var3 = class381.field5447[var1];
            var3.field5260 = class276.field3837;
            int var4 = class333.field4591.method1186((byte) -97, 1);
            int var5 = class333.field4591.method1186((byte) -97, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class333.field4591.method1186((byte) -97, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class181.field2491[class333.field4591.method1186((byte) -97, 3)];
            int var8 = class333.field4591.method1186((byte) -97, 1);
            if (var8 == 1) {
                class314.field4301[class438.field6171++] = var1;
            }
            if (var2) {
                var3.method2386(16383, var7);
            }
            var3.method930(class412.field5841.field5332[0] + var6, var4 == 1, class412.field5841.field5326[0] + var5, -115, class142.field2034);
        }
        field5921++;
        class333.field4591.method1185((byte) 127);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lt;I)V", line = 328)
    private final void method2615(class400 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field5910++;
        long var3 = arg0.method2517(125);
        for (class240 var5 = (class240) this.field5916.method886(var3, 25651); var5 != null; var5 = (class240) this.field5916.method882(true)) {
            if (var5.field3418.method2518(-4857, arg0)) {
                var5.method2467((byte) -92);
                var5.method2783((byte) -122);
                this.field5904++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V", line = 356)
    public final void method2616(int arg0) {
        for (class240 var2 = (class240) this.field5919.method2482(-28); var2 != null; var2 = (class240) this.field5919.method2476(1)) {
            if (var2.method393(false)) {
                var2.method2467((byte) 115);
                var2.method2783((byte) -122);
                this.field5904++;
            }
        }
        if (arg0 != 13711) {
            this.method2616(25);
        }
        field5909++;
    }
}
