import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class130 extends class179 {

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "Ljava/lang/String;")
    private String field1447 = "null";

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "Lcq;")
    public static class72 field1450 = new class72("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Lcq;")
    public static class72 field1451 = new class72("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "[I")
    public static int[] field1452 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "C")
    public char field1438;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "C")
    public char field1444;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Ltm;")
    public class349 field1436;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Ltm;")
    private class349 field1441;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 6)
    public final int method826(int arg0, int arg1) {
        field1437++;
        if (this.field1436 == null) {
            return this.field1448;
        }
        if (arg1 <= 94) {
            this.method832(65);
        }
        class369 var3 = (class369) this.field1436.method2218(1, (long) arg0);
        return var3 == null ? this.field1448 : var3.field5032;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLbg;)V", line = 29)
    public final void method827(byte arg0, class242 arg1) {
        int var3 = -90 % ((68 - arg0) / 58);
        field1445++;
        while (true) {
            int var4 = arg1.method1563(-128);
            if (var4 == 0) {
                return;
            }
            this.method828(var4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILbg;Z)V", line = 51)
    private final void method828(int arg0, class242 arg1, boolean arg2) {
        field1442++;
        if (arg0 == 1) {
            this.field1444 = class156.method996(arg1.method1589(false), -36);
        } else if (arg0 == 2) {
            this.field1438 = class156.method996(arg1.method1589(false), 105);
        } else if (arg0 == 3) {
            this.field1447 = arg1.method1565(-90);
        } else if (arg0 == 4) {
            this.field1448 = arg1.method1576((byte) 121);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1587((byte) -102);
            this.field1436 = new class349(class39.method249(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1576((byte) 123);
                class43 var7;
                if (arg0 == 5) {
                    var7 = new class28(arg1.method1565(-89));
                } else {
                    var7 = new class369(arg1.method1576((byte) 124));
                }
                this.field1436.method2227(var7, -8218, (long) var6);
            }
        }
        if (!arg2) {
            this.field1444 = (char) 65433;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)I", line = 104)
    public static final int method829(int arg0, int arg1, int arg2, int arg3) {
        field1446++;
        if (arg2 == arg3) {
            return arg3;
        }
        int var4 = arg1 - arg0;
        int var5 = (arg3 & 0x7F) * var4 + ((arg2 & 0x7F) * arg0) >> 7;
        int var6 = (arg2 & 0x380) * arg0 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg2 & 0xFC00) * arg0 + (arg3 & 0xFC00) * var4 >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)Z", line = 125)
    public final boolean method830(int arg0, boolean arg1) {
        field1434++;
        if (this.field1436 == null) {
            return false;
        }
        if (this.field1441 == null) {
            this.method833(-35);
        }
        class369 var3 = (class369) this.field1441.method2218(1, (long) arg0);
        if (var3 == null) {
            return false;
        } else {
            if (!arg1) {
                field1451 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 151)
    public final boolean method831(String arg0, byte arg1) {
        field1440++;
        if (this.field1436 == null) {
            return false;
        }
        if (this.field1441 == null) {
            this.method832(64512);
        }
        class296 var3 = (class296) this.field1441.method2218(1, class11.method58(46, arg0));
        if (arg1 >= -44) {
            this.field1448 = 69;
        }
        while (var3 != null) {
            if (var3.field3946.equals(arg0)) {
                return true;
            }
            var3 = (class296) this.field1441.method2221(52);
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 192)
    private final void method832(int arg0) {
        field1433++;
        this.field1441 = new class349(this.field1436.method2220((byte) 73));
        if (arg0 != 64512) {
            this.field1447 = null;
        }
        for (class28 var2 = (class28) this.field1436.method2222(0); var2 != null; var2 = (class28) this.field1436.method2215(false)) {
            class296 var3 = new class296(var2.field319, (int) var2.field505);
            this.field1441.method2227(var3, -8218, class11.method58(arg0 ^ -64622, var2.field319));
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 215)
    private final void method833(int arg0) {
        if (arg0 >= -20) {
            field1435 = -40;
        }
        this.field1441 = new class349(this.field1436.method2220((byte) 73));
        field1439++;
        for (class369 var2 = (class369) this.field1436.method2222(0); var2 != null; var2 = (class369) this.field1436.method2215(false)) {
            class369 var3 = new class369((int) var2.field505);
            this.field1441.method2227(var3, -8218, (long) var2.field5032);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 237)
    public static void method834(int arg0) {
        if (arg0 >= -22) {
            method829(-60, 4, -107, 0);
        }
        field1450 = null;
        field1451 = null;
        field1452 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Ljava/lang/String;", line = 249)
    public final String method835(int arg0, int arg1) {
        field1443++;
        if (this.field1436 == null) {
            return this.field1447;
        }
        if (arg0 != -3848) {
            this.method833(-112);
        }
        class28 var3 = (class28) this.field1436.method2218(1, (long) arg1);
        return var3 == null ? this.field1447 : var3.field319;
    }
}
