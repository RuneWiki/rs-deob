import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 extends class153 {

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lpj;")
    public static class237 field1455 = class33.method353("<img=1>", 75);

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1459 = 127;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1474 = 500;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Lge;")
    public static class69 field1471 = new class69(16);

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lpj;")
    public static class237 field1476 = class33.method353("blinken2:", 41);

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Lpj;")
    public static class237[] field1477 = new class237[100];

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lpj;")
    public class237 field1457;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Lfa;")
    public static class239 field1464;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lfa;")
    public static class239 field1467;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "[I")
    public int[] field1462;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
    public int[] field1466;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[I")
    public int[] field1468;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final void method597(byte arg0) {
        if (arg0 < 31) {
            field1464 = null;
        }
        class142.method982(0);
        System.gc();
        class79.method610(25, (byte) 105);
        field1460++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lie;IB)V")
    private final void method598(class32 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1457 = arg0.method324(1);
        } else if (arg1 == 2) {
            int var7 = arg0.method316((byte) -95);
            this.field1463 = new int[var7];
            this.field1466 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1466[var8] = arg0.method339(-16777216);
                int var9 = arg0.method316((byte) -102);
                if (var9 == 0) {
                    this.field1463[var8] = -1;
                } else {
                    this.field1463[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method316((byte) 111);
            this.field1462 = new int[var4];
            this.field1468 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1468[var5] = arg0.method339(-16777216);
                int var6 = arg0.method316((byte) 98);
                if (var6 == 0) {
                    this.field1462[var5] = -1;
                } else {
                    this.field1462[var5] = var6;
                }
            }
        }
        if (arg2 < 9) {
            field1464 = null;
        }
        field1469++;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public static void method599(boolean arg0) {
        field1464 = null;
        field1477 = null;
        field1476 = null;
        field1467 = null;
        field1471 = null;
        field1455 = null;
        if (!arg0) {
            method603(-99, true, 50, -35, -107);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public final int method600(int arg0, int arg1) {
        field1473++;
        int var3 = -117 / ((arg0 + 31) / 32);
        if (this.field1466 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field1466.length; var4++) {
            if (this.field1463[var4] == arg1) {
                return this.field1466[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lie;I)Lkk;")
    public static final class224 method601(class32 arg0, int arg1) {
        field1461++;
        class224 var2 = new class224(arg0.method324(1), arg0.method324(1), arg0.method339(-16777216), arg0.method339(arg1 ^ 0xFF000001), arg0.method319((byte) -18), arg1 == arg0.method316((byte) -59));
        int var3 = arg0.method316((byte) -50);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3859.method675(new class23(arg0.method339(-16777216), arg0.method339(-16777216), arg0.method339(-16777216), arg0.method339(-16777216)), (byte) -90);
        }
        var2.method1491(12800);
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLie;)V")
    public final void method602(boolean arg0, class32 arg1) {
        field1458++;
        while (true) {
            int var3 = arg1.method316((byte) 97);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method598((class32) null, -82, (byte) -17);
                    return;
                }
            }
            this.method598(arg1, var3, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIII)I")
    public static final int method603(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field1472++;
            int var5 = 65536 - class150.field2676[arg2 * 1024 / arg3] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
    public final int method604(int arg0, int arg1) {
        field1465++;
        if (this.field1468 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 < 11) {
            field1464 = null;
        }
        while (this.field1468.length > var3) {
            if (this.field1462[var3] == arg1) {
                return this.field1468[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public final void method605(byte arg0) {
        int var2 = 101 % ((-arg0 - 59) / 35);
        if (this.field1468 != null) {
            for (int var3 = 0; var3 < this.field1468.length; var3++) {
                this.field1468[var3] = class34.method362(this.field1468[var3], 32768);
            }
        }
        field1456++;
        if (this.field1466 != null) {
            for (int var4 = 0; var4 < this.field1466.length; var4++) {
                this.field1466[var4] = class34.method362(this.field1466[var4], 32768);
            }
        }
    }
}
