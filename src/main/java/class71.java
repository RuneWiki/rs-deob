import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 implements class51 {

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lad;")
    private class5 field1517 = new class5();

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    private int field1519 = 128;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "D")
    private double field1524 = 1.0D;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    private int field1521 = 0;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Ljb;")
    private class64 field1522;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[Lpb;")
    private class106[] field1518;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lqf;")
    private static class117 field1501 = class72.method514(105, "This world is full)3");

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lqf;")
    public static class117 field1504 = field1501;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lqf;")
    private static class117 field1505 = class72.method514(102, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lqf;")
    public static class117 field1499 = field1505;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lqf;")
    public static class117 field1516 = class72.method514(99, "sl_button");

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lwd;")
    public static class153 field1514 = new class153(4096);

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field1526 = 127;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Lqf;")
    public static class117 field1527 = class72.method514(125, "null");

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "[Lqf;")
    public static class117[] field1525 = new class117[100];

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lqf;")
    public static class117 field1528 = class72.method514(119, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Lqf;")
    public static class117 field1529 = class72.method514(104, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Lqf;")
    public static class117 field1530 = class72.method514(101, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field1503;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[Lr;")
    public static class118[] field1510;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ID)V")
    public final void method501(int arg0, double arg1) {
        field1506++;
        this.field1524 = arg1;
        int var4 = -128 % ((arg0 + 81) / 36);
        this.method502((byte) 3);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public final boolean method382(int arg0, int arg1) {
        field1513++;
        int var3 = -76 % ((34 - arg1) / 45);
        return this.field1519 == 64;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)Z")
    public final boolean method380(int arg0, byte arg1) {
        field1507++;
        if (arg1 != 93) {
            this.method502((byte) 112);
        }
        return this.field1518[arg0].field2540;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method502(byte arg0) {
        field1509++;
        for (int var2 = 0; var2 < this.field1518.length; var2++) {
            if (this.field1518[var2] != null) {
                this.field1518[var2].method808();
            }
        }
        this.field1517 = new class5();
        this.field1521 = this.field1523;
        if (arg0 != 3) {
            this.method501(50, -1.6492331380164291D);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[I")
    public final int[] method381(boolean arg0, int arg1) {
        field1511++;
        class106 var3 = this.field1518[arg1];
        if (arg0) {
            method505(86);
        }
        if (var3 != null) {
            if (var3.field2534 != null) {
                this.field1517.method20(var3, 0);
                var3.field2543 = true;
                return var3.field2534;
            }
            boolean var4 = var3.method806(this.field1524, this.field1519, this.field1522);
            if (var4) {
                if (this.field1521 == 0) {
                    class106 var5 = (class106) this.field1517.method16(53);
                    var5.method808();
                } else {
                    this.field1521--;
                }
                this.field1517.method20(var3, 0);
                var3.field2543 = true;
                return var3.field2534;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    public final void method503(int arg0, int arg1) {
        for (int var3 = arg0; var3 < this.field1518.length; var3++) {
            class106 var4 = this.field1518[var3];
            if (var4 != null && var4.field2535 != 0 && var4.field2543) {
                var4.method805(arg1);
                var4.field2543 = false;
            }
        }
        field1500++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)I")
    public final int method379(int arg0, byte arg1) {
        field1498++;
        int var3 = -92 % ((73 - arg1) / 37);
        return this.field1518[arg0] == null ? 0 : this.field1518[arg0].field2533;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLmf;)Lqf;")
    public static final class117 method504(byte arg0, class89 arg1) {
        field1508++;
        if (class70.method497((byte) 111, class42.method292(arg1, -5447)) == 0) {
            return null;
        } else if (arg0 <= 22) {
            return null;
        } else if (arg1.field2068 == null || arg1.field2068.method906((byte) 49).method915(27) == 0) {
            return class139.field3314 ? class95.field2297 : null;
        } else {
            return arg1.field2068;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1501 = null;
        field1505 = null;
        field1530 = null;
        field1527 = null;
        field1514 = null;
        field1516 = null;
        field1510 = null;
        field1529 = null;
        field1504 = null;
        field1503 = null;
        field1528 = null;
        field1499 = null;
        field1525 = null;
        if (arg0 <= 88) {
            method504((byte) -54, null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljb;Ljb;IDI)V")
    public class71(class64 arg0, class64 arg1, int arg2, double arg3, int arg4) {
        this.field1519 = arg4;
        this.field1524 = arg3;
        this.field1523 = arg2;
        this.field1522 = arg1;
        this.field1521 = this.field1523;
        int[] var7 = arg0.method457(0, true);
        int var8 = var7.length;
        this.field1518 = new class106[arg0.method440(0, false)];
        for (int var9 = 0; var9 < var8; var9++) {
            class77 var10 = new class77(arg0.method458(false, var7[var9], 0));
            this.field1518[var7[var9]] = new class106(var10);
        }
    }
}
