import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 extends class183 {

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
    private int field1486 = 1024;

    @OriginalMember(owner = "client!wd", name = "wb", descriptor = "I")
    private int field1497 = 204;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    private int field1480 = 1024;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
    private int field1484 = 81;

    @OriginalMember(owner = "client!wd", name = "Fb", descriptor = "I")
    private int field1506 = 0;

    @OriginalMember(owner = "client!wd", name = "qb", descriptor = "I")
    private int field1491 = 4;

    @OriginalMember(owner = "client!wd", name = "yb", descriptor = "I")
    private int field1499 = 8;

    @OriginalMember(owner = "client!wd", name = "Ib", descriptor = "I")
    private int field1509 = 409;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Ljf;")
    public static class229 field1469 = class212.method1457((byte) 75, "::fpson");

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Ljf;")
    private static class229 field1475 = class212.method1457((byte) 100, "Nov");

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Ljf;")
    private static class229 field1470 = class212.method1457((byte) 103, "Feb");

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Ljf;")
    private static class229 field1481 = class212.method1457((byte) 102, "Jan");

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "Ljf;")
    public static class229 field1482 = class212.method1457((byte) 116, "brillant2:");

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Ljf;")
    public static class229 field1468 = class212.method1457((byte) 93, "underlay");

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Ljf;")
    private static class229 field1473 = class212.method1457((byte) 99, "Aug");

    @OriginalMember(owner = "client!wd", name = "ub", descriptor = "Ljf;")
    private static class229 field1495 = class212.method1457((byte) 70, "Mar");

    @OriginalMember(owner = "client!wd", name = "zb", descriptor = "Ljf;")
    private static class229 field1500 = class212.method1457((byte) 70, "Jun");

    @OriginalMember(owner = "client!wd", name = "xb", descriptor = "Ljf;")
    private static class229 field1498 = class212.method1457((byte) 77, "Dec");

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Ljf;")
    private static class229 field1478 = class212.method1457((byte) 83, "Sep");

    @OriginalMember(owner = "client!wd", name = "Ab", descriptor = "Ljf;")
    private static class229 field1501 = class212.method1457((byte) 110, "Oct");

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "[I")
    public static int[] field1483 = new int[2];

    @OriginalMember(owner = "client!wd", name = "Db", descriptor = "Ljf;")
    private static class229 field1504 = class212.method1457((byte) 117, "Apr");

    @OriginalMember(owner = "client!wd", name = "Cb", descriptor = "Ljf;")
    public static class229 field1503 = class212.method1457((byte) 87, "(Y");

    @OriginalMember(owner = "client!wd", name = "tb", descriptor = "Ljf;")
    private static class229 field1494 = class212.method1457((byte) 85, "Jul");

    @OriginalMember(owner = "client!wd", name = "Hb", descriptor = "Ljf;")
    private static class229 field1508 = class212.method1457((byte) 88, "May");

    @OriginalMember(owner = "client!wd", name = "rb", descriptor = "Ljf;")
    public static class229 field1492 = class212.method1457((byte) 127, ")2");

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "[Ljf;")
    public static class229[] field1489 = new class229[] { field1481, field1470, field1495, field1504, field1508, field1500, field1494, field1473, field1478, field1501, field1475, field1498 };

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!wd", name = "vb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!wd", name = "Bb", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!wd", name = "Eb", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!wd", name = "Gb", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "[I")
    private int[] field1479;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "[[I")
    private int[][] field1485;

    @OriginalMember(owner = "client!wd", name = "sb", descriptor = "[[I")
    private int[][] field1493;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V", line = 27)
    private final void method572(int arg0) {
        field1474++;
        Random var2 = new Random((long) this.field1499);
        this.field1476 = 4096 / this.field1491;
        this.field1493 = new int[this.field1499][this.field1491];
        this.field1479 = new int[this.field1499 + 1];
        this.field1477 = 4096 / this.field1499;
        this.field1471 = this.field1484 / 2;
        this.field1485 = new int[this.field1499][this.field1491 + 1];
        int var3 = this.field1476 / 2;
        int var4 = this.field1477 / 2;
        this.field1479[0] = arg0;
        for (int var5 = 0; var5 < this.field1499; var5++) {
            if (var5 > 0) {
                int var6 = this.field1477;
                int var7 = (class50.method413(4096, false, var2) - 2048) * this.field1497 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1479[var5] = this.field1479[var5 - 1] + var8;
            }
            this.field1485[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1491; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1476;
                    int var11 = (class50.method413(4096, false, var2) - 2048) * this.field1509 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1485[var5][var9] = this.field1485[var5][var9 - 1] + var12;
                }
                this.field1493[var5][var9] = this.field1480 <= 0 ? 4096 : 4096 - class50.method413(this.field1480, false, var2);
            }
            this.field1485[var5][this.field1491] = 4096;
        }
        this.field1479[this.field1499] = 4096;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 101)
    public static final void method573(int arg0, Component arg1) {
        if (arg0 != 4096) {
            field1475 = (class229) null;
        }
        Method var2 = class198.field3469;
        field1502++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class217.field3720);
        arg1.addFocusListener(class217.field3720);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 475)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)[I", line = 162)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            method574(84);
        }
        field1488++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = 0;
            int var5;
            for (var5 = class42.field746[arg0] + this.field1506; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field1499 > var4 && var5 >= this.field1479[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field1479[var4 - 1];
            int var9 = this.field1479[var4];
            if (var5 > (this.field1471 + var8) && var9 - this.field1471 > var5) {
                for (int var10 = 0; var10 < class22.field393; var10++) {
                    int var11 = var7 ? this.field1486 : -this.field1486;
                    int var12 = class97.field1737[var10] + (this.field1476 * var11 >> 12);
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field1491 > var13 && var12 >= this.field1485[var6][var13]) {
                        var13++;
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field1485[var6][var14];
                    int var16 = this.field1485[var6][var13];
                    if (var12 > (var15 + this.field1471) && var16 - this.field1471 > var12) {
                        var3[var10] = this.field1493[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class36.method319(var3, 0, class22.field393, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V", line = 265)
    public static void method574(int arg0) {
        field1492 = null;
        field1470 = null;
        field1508 = null;
        field1494 = null;
        field1501 = null;
        field1489 = null;
        field1475 = null;
        field1468 = null;
        field1481 = null;
        field1469 = null;
        field1500 = null;
        if (arg0 >= -41) {
            field1473 = (class229) null;
        }
        field1503 = null;
        field1478 = null;
        field1473 = null;
        field1482 = null;
        field1498 = null;
        field1483 = null;
        field1495 = null;
        field1504 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLek;I)Lrm;", line = 295)
    public static final class248 method575(int arg0, byte arg1, class185 arg2, int arg3) {
        int var4 = 107 % ((-arg1 - 69) / 51);
        field1487++;
        return class208.method1444(arg0, -28236, arg3, arg2) ? class56.method444((byte) 115) : null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 312)
    public final void method25(int arg0) {
        field1496++;
        this.method572(0);
        if (arg0 != -8) {
            this.method10(53, -76);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JZII)Ljf;", line = 325)
    public static final class229 method576(long arg0, boolean arg1, int arg2, int arg3) {
        field1490++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg2 != 48) {
            method573(-50, (Component) null);
        }
        long var5 = arg0 / (long) arg3;
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg3;
        }
        int var8 = var7;
        if (arg0 < 0L || arg1) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var11 = (int) (arg0 % (long) arg3);
            arg0 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class229 var12 = new class229();
        var12.field3944 = var9;
        var12.field3973 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILkh;I)V", line = 409)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1491 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field1499 = arg1.method93(false);
        } else if (arg2 == 2) {
            this.field1509 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field1497 = arg1.method116(-1);
        } else if (arg2 == 4) {
            this.field1486 = arg1.method116(-1);
        } else if (arg2 == 5) {
            this.field1506 = arg1.method116(-1);
        } else if (arg2 == 6) {
            this.field1484 = arg1.method116(-1);
        } else if (arg2 == 7) {
            this.field1480 = arg1.method116(-1);
        }
        field1505++;
        if (arg0 > -43) {
            method575(115, (byte) 53, (class185) null, -126);
        }
    }
}
