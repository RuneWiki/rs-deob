import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class86 {

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lsl;")
    private class18 field1452 = new class18();

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static volatile int field1437 = 0;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1447 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1445 = 127;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1441 = "glow2:";

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1451 = "Allocated memory";

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1456 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lsl;")
    private class18 field1454;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lhc;")
    public static class235 field1453;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[[[B")
    public static byte[][][] field1435;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public final void method603(byte arg0) {
        if (arg0 != 111) {
            this.method604((class18) null, -28);
        }
        while (true) {
            class18 var2 = this.field1452.field276;
            if (this.field1452 == var2) {
                field1439++;
                this.field1454 = null;
                return;
            }
            var2.method174(31388);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lsl;I)V")
    public final void method604(class18 arg0, int arg1) {
        field1450++;
        if (arg0.field278 != null) {
            arg0.method174(arg1 + 31493);
        }
        arg0.field276 = this.field1452;
        arg0.field278 = this.field1452.field278;
        arg0.field278.field276 = arg0;
        arg0.field276.field278 = arg0;
        if (arg1 != -105) {
            field1441 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lsl;")
    public final class18 method605(int arg0) {
        field1449++;
        class18 var2 = this.field1452.field276;
        if (arg0 != 0) {
            method615(124, 'k');
        }
        if (this.field1452 == var2) {
            return null;
        } else {
            var2.method174(31388);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method606(int arg0) {
        field1446++;
        class50.field736.method1898((byte) 121);
        if (arg0 < 85) {
            method614(101, 59);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lsl;")
    public final class18 method607(byte arg0) {
        field1436++;
        class18 var2 = this.field1452.field276;
        if (this.field1452 == var2) {
            this.field1454 = null;
            return null;
        }
        this.field1454 = var2.field276;
        if (arg0 < 51) {
            field1441 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
    public static final void method608(byte arg0, int arg1) {
        field1440++;
        class204.field3185.method1897(true, arg1);
        class149.field2354.method1897(true, arg1);
        int var2 = -107 / ((arg0 + 64) / 45);
        class266.field4246.method1897(true, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method609(int arg0) {
        if (class283.field4473 != null && (class283.field4473.field2240 - (class283.field4473.method971(65535) * 64 - 64) >> 7) == class167.field2620 && (class283.field4473.field2278 + (64 - (class283.field4473.method971(65535) * 64)) >> 7) == class130.field2057) {
            class167.field2620 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var7 = 0; var7 < 104; var7++) {
                class245.field3985[var1][var7] = 0;
            }
        }
        field1443++;
        int var2 = -97 / ((arg0 - 45) / 61);
        for (int var3 = 0; var3 < class137.field2110; var3++) {
            class236 var6 = class210.field3267[class99.field1660[var3]];
            if (var6 != null) {
                var6.field2253 = false;
            }
        }
        for (int var4 = 0; var4 < class70.field1119; var4++) {
            class45 var5 = class255.field4082[class284.field4506[var4]];
            if (var5 != null) {
                var5.field2253 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I")
    public final int method610(int arg0) {
        field1438++;
        int var2 = 0;
        class18 var3 = this.field1452.field276;
        if (arg0 != -11971) {
            field1445 = -66;
        }
        while (this.field1452 != var3) {
            var2++;
            var3 = var3.field276;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Lsl;")
    public final class18 method611(byte arg0) {
        if (arg0 != -2) {
            field1434 = 93;
        }
        field1442++;
        class18 var2 = this.field1454;
        if (this.field1452 == var2) {
            this.field1454 = null;
            return null;
        } else {
            this.field1454 = var2.field276;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
    public static void method612(byte arg0) {
        if (arg0 < 109) {
            method615(-3, 'O');
        }
        field1451 = null;
        field1453 = null;
        field1441 = null;
        field1435 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILnj;IIIII)V")
    public static final void method613(int arg0, class144 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 24344) {
            method612((byte) 118);
        }
        field1455++;
        class213.method1446(arg6, arg2, arg3, arg1.field2240, arg1.field2278, (byte) 125, arg0, arg5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method614(int arg0, int arg1) {
        field1433++;
        if (arg0 > -65) {
            field1453 = null;
        }
        class240.field3894 = new int[arg1];
        class190.field2949 = new int[arg1];
        class27.field363 = new int[arg1];
        class161.field2531 = new int[arg1];
        class206.field3227 = new int[arg1];
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IC)C")
    public static final char method615(int arg0, char arg1) {
        field1444++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            if (arg0 != 115) {
                method615(-77, (char) 65494);
            }
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class86() {
        this.field1452.field276 = this.field1452;
        this.field1452.field278 = this.field1452;
    }
}
