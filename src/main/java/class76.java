import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class76 extends class30 {

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lmg;")
    public class76[] field1468;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Z")
    public boolean field1477;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lia;")
    private static class257 field1471 = class28.method234(125, "flash1:");

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Lia;")
    public static class257 field1465 = field1471;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Lia;")
    public static class257 field1470 = field1471;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1474 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "Lia;")
    public static class257 field1494 = class28.method234(80, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "Lia;")
    public static class257 field1489 = class28.method234(-11, "Weiter");

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lca;")
    public class174 field1467;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lba;")
    public static class211 field1482;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "Lvb;")
    public static class226 field1490;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Lne;")
    public class87 field1485;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Z")
    public static final boolean method556(byte arg0, int arg1) {
        field1469++;
        int var2 = -86 % ((59 - arg0) / 57);
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public void method557(int arg0) {
        if (arg0 != -1) {
            field1465 = null;
        }
        if (this.field1477) {
            this.field1467.method1185(-103);
            this.field1467 = null;
        } else {
            this.field1485.method656((byte) -19);
            this.field1485 = null;
        }
        field1473++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
    public static final void method558(boolean arg0, int arg1) {
        field1479++;
        class200.field3421 = arg1;
        if (arg0) {
            class244.field4233 = 50;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)[I")
    public int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            field1489 = null;
        }
        field1478++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lk;I)Ldc;")
    public static final class183 method559(class152 arg0, int arg1) {
        if (arg1 > -9) {
            field1492 = 100;
        }
        field1472++;
        return new class183(arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1064((byte) -90), arg0.method1051((byte) 109));
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)V")
    public final void method560(int arg0, byte arg1, int arg2) {
        int var4 = this.field1480 == 255 ? arg2 : this.field1480;
        field1483++;
        if (arg1 < 73) {
            this.field1485 = null;
        }
        if (this.field1477) {
            this.field1467 = new class174(var4, arg2, arg0);
        } else {
            this.field1485 = new class87(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1482 = null;
        field1471 = null;
        field1474 = null;
        field1489 = null;
        field1494 = null;
        if (arg0 != -1) {
            field1489 = null;
        }
        field1490 = null;
        field1465 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)[I")
    public final int[] method562(int arg0, int arg1, byte arg2) {
        if (arg2 != -104) {
            field1494 = null;
        }
        field1487++;
        return this.field1468[arg1].field1477 ? this.field1468[arg1].method169(-9351, arg0) : this.field1468[arg1].method157(arg0, (byte) 110)[0];
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)I")
    public int method563(int arg0) {
        int var2 = 84 / ((arg0 - 38) / 51);
        field1476++;
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[[I")
    public int[][] method157(int arg0, byte arg1) {
        if (arg1 <= 2) {
            this.method564(-95);
        }
        field1475++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)I")
    public int method564(int arg0) {
        if (arg0 != -1) {
            this.method563(81);
        }
        field1466++;
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)[[I")
    public final int[][] method565(byte arg0, int arg1, int arg2) {
        if (arg0 != -20) {
            field1494 = null;
        }
        field1481++;
        if (!this.field1468[arg1].field1477) {
            return this.field1468[arg1].method157(arg2, (byte) 52);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1468[arg1].method169(-9351, arg2);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lk;BI)V")
    public void method158(class152 arg0, byte arg1, int arg2) {
        field1486++;
        if (arg1 >= -86) {
            this.field1480 = -101;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public void method209(byte arg0) {
        field1484++;
        if (arg0 != 111) {
            this.method158((class152) null, (byte) -113, -19);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IZ)V")
    public class76(int arg0, boolean arg1) {
        this.field1468 = new class76[arg0];
        this.field1477 = arg1;
    }
}
