import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 extends class130 {

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[J")
    private long[] field1637 = new long[10];

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    private int field1629 = 0;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    private int field1635 = 256;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    private int field1638 = 1;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "J")
    private long field1630 = class80.method504(-1);

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[Z")
    public static boolean[] field1618 = new boolean[112];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lqe;")
    public static class179 field1620 = class206.method1380("Bitte geben Sie Ihr Passwort ein)3", (byte) -127);

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Z")
    public static boolean field1628 = false;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Lqe;")
    public static class179 field1627 = class206.method1380("Mem:", (byte) 71);

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Lqe;")
    public static class179 field1633 = class206.method1380("Ihr Spielkonto wurde deaktiviert)3", (byte) -127);

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[I")
    public static int[] field1636 = new int[100];

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lqe;")
    public static class179 field1626 = class206.method1380("<)4col>", (byte) -127);

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field1632 = -1;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[Lqe;)[Lqe;")
    public static final class179[] method566(int arg0, class179[] arg1) {
        if (arg0 != -32701) {
            field1620 = null;
        }
        class179[] var2 = new class179[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class78.method502((byte) -80, new class179[] { class148.method949((byte) -14, var3), class42.field895 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class78.method502((byte) -120, new class179[] { var2[var3], arg1[var3] });
            }
        }
        field1625++;
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZII)I")
    public static final int method567(int arg0, boolean arg1, int arg2, int arg3) {
        field1624++;
        if (arg1) {
            field1618 = null;
        }
        int var4 = arg3 / arg2;
        int var5 = arg3 & arg2 - 1;
        int var6 = arg0 & arg2 - 1;
        int var7 = arg0 / arg2;
        int var8 = class201.method1337(var7, var4, 8);
        int var9 = class201.method1337(var7, var4 + 1, 8);
        int var10 = class201.method1337(var7 + 1, var4, 8);
        int var11 = class201.method1337(var7 + 1, var4 - -1, 8);
        int var12 = class183.method1190(var5, arg2, var8, var9, 0);
        int var13 = class183.method1190(var5, arg2, var10, var11, 0);
        return class183.method1190(var6, arg2, var12, var13, 0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public static final void method568(boolean arg0, int arg1) {
        field1621++;
        for (class43 var2 = (class43) class30.field652.method913(0); var2 != null; var2 = (class43) class30.field652.method907(true)) {
            if ((long) arg1 == (var2.field1694 >> 48 & 0xFFFFL)) {
                var2.method592((byte) -128);
            }
        }
        if (!arg0) {
            field1618 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILqa;)V")
    public static final void method569(int arg0, class175 arg1) {
        field1619++;
        int var2 = arg1.field3136 - class13.field322;
        if (arg1.field3196 == 0) {
            arg1.field3162 = 1024;
        }
        int var3 = arg1.field3178 * 64 + arg1.field3158 * 128;
        arg1.field3159 += (var3 - arg1.field3159) / var2;
        int var4 = arg1.field3178 * 64 + arg1.field3157 * arg0;
        arg1.field3198 += (var4 - arg1.field3198) / var2;
        if (arg1.field3196 == 1) {
            arg1.field3162 = 1536;
        }
        arg1.field3186 = 0;
        if (arg1.field3196 == 2) {
            arg1.field3162 = 0;
        }
        if (arg1.field3196 == 3) {
            arg1.field3162 = 512;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public static void method570(int arg0) {
        if (arg0 != 10) {
            method566(-20, null);
        }
        field1627 = null;
        field1626 = null;
        field1636 = null;
        field1620 = null;
        field1618 = null;
        field1633 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method571(byte arg0) {
        int var1 = 36 / ((2 - arg0) / 58);
        field1623++;
        if (class129.field2356 > 0) {
            class219.method1429(-85);
        } else {
            class223.method1449((byte) 106, 40);
            class40.field870 = class199.field3714;
            class199.field3714 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method572(int arg0) {
        if (arg0 == 1) {
            field1622++;
            for (int var2 = 0; var2 < 10; var2++) {
                this.field1637[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class84() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1637[var1] = this.field1630;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I")
    public final int method573(int arg0, int arg1, int arg2) {
        field1634++;
        int var4 = this.field1635;
        int var5 = this.field1638;
        this.field1635 = 300;
        this.field1638 = 1;
        this.field1630 = class80.method504(-1);
        if (this.field1637[this.field1631] == 0L) {
            this.field1638 = var5;
            this.field1635 = var4;
        } else if (this.field1630 > this.field1637[this.field1631]) {
            this.field1635 = (int) ((long) (arg1 * 2560) / (this.field1630 - this.field1637[this.field1631]));
        }
        if (this.field1635 < 25) {
            this.field1635 = 25;
        }
        if (this.field1635 > 256) {
            this.field1635 = 256;
            this.field1638 = (int) ((long) arg1 - (this.field1630 - this.field1637[this.field1631]) / 10L);
        }
        if (this.field1638 > arg1) {
            this.field1638 = arg1;
        }
        this.field1637[this.field1631] = this.field1630;
        this.field1631 = (this.field1631 + 1) % 10;
        if (this.field1638 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1637[var6] != 0L) {
                    this.field1637[var6] += this.field1638;
                }
            }
        }
        if (this.field1638 < arg2) {
            this.field1638 = arg2;
        }
        int var7 = 0;
        class137.method873((long) this.field1638, -967787128);
        while (this.field1629 < 256) {
            this.field1629 += this.field1635;
            var7++;
        }
        int var8 = 32 / ((arg0 - 65) / 34);
        this.field1629 &= 0xFF;
        return var7;
    }
}
