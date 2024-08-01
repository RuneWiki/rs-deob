import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ca")
public class class22 {

    @OriginalMember(owner = "ca", name = "j", descriptor = "Llf;")
    private static class109 field502 = class35.method275("white:", 2);

    @OriginalMember(owner = "ca", name = "a", descriptor = "Llf;")
    public static class109 field493 = field502;

    @OriginalMember(owner = "ca", name = "d", descriptor = "Llf;")
    public static class109 field496 = field502;

    @OriginalMember(owner = "ca", name = "c", descriptor = "Leh;")
    public static class49 field495 = new class49(4096);

    @OriginalMember(owner = "ca", name = "m", descriptor = "Lrc;")
    public static class160 field505 = new class160(64);

    @OriginalMember(owner = "ca", name = "n", descriptor = "Ltf;")
    public static class181 field506 = new class181();

    @OriginalMember(owner = "ca", name = "b", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "ca", name = "e", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "ca", name = "f", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "ca", name = "g", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "ca", name = "h", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "ca", name = "i", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "ca", name = "k", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "ca", name = "l", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "ca", name = "a", descriptor = "(I)V")
    public static void method200(int arg0) {
        field502 = null;
        field506 = null;
        if (arg0 >= -16) {
            field502 = null;
        }
        field496 = null;
        field493 = null;
        field505 = null;
        field495 = null;
    }

    @OriginalMember(owner = "ca", name = "b", descriptor = "(I)V")
    public static final void method201(int arg0) {
        field500++;
        if (class174.field3296 != null || (arg0 != 15859 || class182.field3431 != null)) {
            return;
        }
        int var1 = class69.field1333;
        if (class51.field1041) {
            if (var1 != 1) {
                int var6 = class109.field2134;
                int var7 = class21.field479;
                if (var7 < class104.field2050 - 10 || class104.field2050 + class111.field2190 + 10 < var7 || var6 < class105.field2093 - 10 || var6 > class128.field2471 + class105.field2093 + 10) {
                    class51.field1041 = false;
                    class193.method1294(class128.field2471, class105.field2093, class104.field2050, class111.field2190, 188);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class104.field2050;
            int var9 = class111.field2190;
            int var10 = class105.field2093;
            int var11 = class129.field2511;
            int var12 = -1;
            int var13 = class67.field1310;
            for (int var14 = 0; var14 < class149.field2882; var14++) {
                int var15 = var10 + (-var14 + class149.field2882 + -1) * 15 + 31;
                if (var11 > var8 && var8 + var9 > var11 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var12 = var14;
                }
            }
            if (var12 != -1) {
                class7.method34((byte) 116, var12);
            }
            class51.field1041 = false;
            class193.method1294(class128.field2471, class105.field2093, class104.field2050, class111.field2190, arg0 ^ 0x3D4F);
            return;
        }
        if (var1 == 1 && class149.field2882 > 0) {
            short var2 = class31.field726[class149.field2882 - 1];
            if (var2 == 39 || var2 == 45 || var2 == 24 || var2 == 41 || var2 == 42 || var2 == 15 || var2 == 29 || var2 == 7 || var2 == 20 || var2 == 3 || var2 == 17 || var2 == 1005) {
                int var3 = class146.field2823[class149.field2882 - 1];
                int var4 = class201.field3966[class149.field2882 - 1];
                class200 var5 = class158.method1078(var4, (byte) 125);
                if (class83.method528(class126.method918(var5, arg0 ^ 0x3D8F), 128) || class158.method1077(610157134, class126.method918(var5, arg0 - 15757))) {
                    class164.field3070 = 0;
                    class126.field2435 = false;
                    if (class174.field3296 != null) {
                        class115.method851(class174.field3296, -23101);
                    }
                    class174.field3296 = class158.method1078(var4, (byte) 112);
                    class41.field870 = class67.field1310;
                    class10.field158 = var3;
                    class62.field1200 = class129.field2511;
                    class115.method851(class174.field3296, arg0 ^ 0xFFFF9830);
                    return;
                }
            }
        }
        if (var1 == 1 && (class126.field2429 == 1 && class149.field2882 > 2 || class28.method229(arg0 - 1159876393, class149.field2882 + -1))) {
            var1 = 2;
        }
        if (var1 == 1 && class149.field2882 > 0) {
            class7.method34((byte) 116, class149.field2882 - 1);
        }
        if (var1 == 2 && class149.field2882 > 0) {
            class127.method925((byte) -123);
            return;
        }
    }

    @OriginalMember(owner = "ca", name = "a", descriptor = "(Lbg;BLbg;)V")
    public static final void method202(class18 arg0, byte arg1, class18 arg2) {
        client.field680 = arg2;
        class137.field2656 = arg0;
        field504++;
        if (arg1 != 121) {
            field502 = null;
        }
    }

    @OriginalMember(owner = "ca", name = "a", descriptor = "(B)V")
    public static final void method203(byte arg0) {
        field494++;
        for (int var1 = -1; var1 < class157.field2956; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class125.field2405[var1];
            }
            class184 var6 = class202.field3975[var5];
            if (var6 != null && var6.field3599 > 0) {
                var6.field3599--;
                if (var6.field3599 == 0) {
                    var6.field3588 = null;
                }
            }
        }
        if (arg0 <= 88) {
            field506 = null;
        }
        for (int var2 = 0; var2 < class1.field10; var2++) {
            int var3 = class1.field8[var2];
            class139 var4 = class183.field3444[var3];
            if (var4 != null && var4.field3599 > 0) {
                var4.field3599--;
                if (var4.field3599 == 0) {
                    var4.field3588 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "ca", name = "a", descriptor = "(ZI)Lva;")
    public static final class194 method204(boolean arg0, int arg1) {
        class194 var2 = (class194) class28.field608.method1086((long) arg1, -111);
        field499++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field1021.method147(0, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class194 var4 = new class194();
        int var5 = 0;
        class86 var6 = new class86(var3);
        var6.field1773 = var6.field1808.length - 12;
        int var7 = var6.method582(15);
        var4.field3712 = var6.method569(arg0);
        var4.field3709 = var6.method569(true);
        var4.field3704 = var6.method569(true);
        var4.field3698 = var6.method569(true);
        var6.field1773 = 0;
        var4.field3710 = var6.method596((byte) 113);
        var4.field3711 = new int[var7];
        var4.field3708 = new int[var7];
        var4.field3702 = new class109[var7];
        while (var6.field1773 < var6.field1808.length - 12) {
            int var8 = var6.method569(true);
            if (var8 == 3) {
                var4.field3702[var5] = var6.method562((byte) 87);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3711[var5] = var6.method598((byte) 88);
            } else {
                var4.field3711[var5] = var6.method582(15);
            }
            var4.field3708[var5++] = var8;
        }
        class28.field608.method1082((long) arg1, 119, var4);
        return var4;
    }

    @OriginalMember(owner = "ca", name = "a", descriptor = "(Llf;I)Z")
    public static final boolean method205(class109 arg0, int arg1) {
        field501++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class199.field3786; var2++) {
            if (arg0.method778((byte) -121, class114.field2265[var2])) {
                return true;
            }
        }
        if (arg0.method778((byte) -121, class157.field2955.field3455)) {
            return true;
        } else if (arg1 > -51) {
            return false;
        } else {
            return false;
        }
    }
}
