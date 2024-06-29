import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 extends class51 {

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[J")
    private long[] field1577 = new long[10];

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lrc;")
    private static class105 field1590 = class43.method374("No matching objects found)1 please shorten search", 0);

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1591 = 0;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Lrc;")
    private static class105 field1596 = class43.method374("Username: ", 0);

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lrc;")
    public static class105 field1597 = class43.method374("l", 0);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[Lhe;")
    public static class47[] field1594 = new class47[50];

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Lrc;")
    public static class105 field1588 = field1596;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Lrc;")
    public static class105 field1579 = field1590;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "J")
    private long field1580;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lbd;")
    public static class11 field1587;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Leb;")
    public static class27 field1600;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Lmd;")
    public static class76 field1589;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V", line = 5)
    public static void method610(byte arg0) {
        field1600 = null;
        field1596 = null;
        if (arg0 <= 59) {
            return;
        }
        field1590 = null;
        field1579 = null;
        field1588 = null;
        field1597 = null;
        field1587 = null;
        field1589 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 23)
    public final void method305(byte arg0) {
        field1595++;
        if (arg0 != -47) {
            this.method304(-40, -89, -55);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1577[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 45)
    public final void method306(byte arg0) {
        this.field1592 = 0;
        this.field1582 = 256;
        if (arg0 <= 10) {
            method611(28);
        }
        this.field1585 = 1;
        field1581++;
        this.field1580 = class1.method3(false);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1577[var2] = this.field1580;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 79)
    public static final void method611(int arg0) {
        field1599++;
        try {
            if (arg0 != -184) {
                field1584 = -55;
            }
            Graphics var1 = class41.field935.getGraphics();
            class119.field2880.method320(17, var1, (byte) -89, 357);
        } catch (Exception var2) {
            class41.field935.repaint();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I", line = 99)
    public final int method304(int arg0, int arg1, int arg2) {
        field1586++;
        int var4 = this.field1585;
        this.field1585 = 1;
        int var5 = this.field1582;
        this.field1582 = 300;
        this.field1580 = class1.method3(false);
        if (this.field1577[this.field1578] == 0L) {
            this.field1585 = var4;
            this.field1582 = var5;
        } else if (this.field1580 > this.field1577[this.field1578]) {
            this.field1582 = (int) ((long) (arg1 * 2560) / (this.field1580 - this.field1577[this.field1578]));
        }
        if (this.field1582 < 25) {
            this.field1582 = 25;
        }
        if (this.field1582 > 256) {
            this.field1582 = 256;
            this.field1585 = (int) ((long) arg1 - (this.field1580 - this.field1577[this.field1578]) / 10L);
        }
        if (arg1 < this.field1585) {
            this.field1585 = arg1;
        }
        this.field1577[this.field1578] = this.field1580;
        this.field1578 = (this.field1578 + 1) % 10;
        if (~this.field1585 < arg0) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1577[var6] != 0L) {
                    this.field1577[var6] += this.field1585;
                }
            }
        }
        if (this.field1585 < arg2) {
            this.field1585 = arg2;
        }
        class75.method634((long) this.field1585, 20306);
        int var7 = 0;
        while (this.field1592 < 256) {
            var7++;
            this.field1592 += this.field1582;
        }
        this.field1592 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I", line = 169)
    public static final int method612(int arg0, int arg1, int arg2, int arg3) {
        field1583++;
        int var4 = arg0 & 0x3;
        if (arg2 >= -126) {
            method613(54);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 220)
    public class72() {
        this.method306((byte) 57);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 257)
    public static final void method613(int arg0) {
        class30.field674.method602((byte) -70);
        if (arg0 < 44) {
            field1594 = null;
        }
        field1598++;
        class37.field844.method602((byte) -70);
    }
}
