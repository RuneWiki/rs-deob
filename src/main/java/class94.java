import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class94 {

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    private int field1576 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    private int field1586 = 128;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Z")
    public boolean field1585 = false;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    private int field1588 = 0;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
    public boolean field1591 = false;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    private int field1580 = 128;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field1594 = -1;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Z")
    public static boolean field1575 = false;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[Ltn;")
    public static class85[] field1584 = new class85[50];

    @OriginalMember(owner = "client!km", name = "u", descriptor = "[I")
    public static int[] field1592 = new int[32];

    @OriginalMember(owner = "client!km", name = "p", descriptor = "S")
    public static short field1587 = 1;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[I")
    public static int[] field1574;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[S")
    private short[] field1572;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[S")
    private short[] field1578;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[S")
    private short[] field1583;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[S")
    private short[] field1593;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBII)Lo;", line = 11)
    public final class96 method732(int arg0, byte arg1, int arg2, int arg3) {
        class96 var5 = (class96) class59.field1010.method2329((byte) 107, (long) this.field1581);
        if (arg1 != 80) {
            this.field1576 = 90;
        }
        field1573++;
        if (var5 == null) {
            class114 var6 = class114.method887(client.field715, this.field1589, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1578 != null) {
                for (int var7 = 0; var7 < this.field1578.length; var7++) {
                    var6.method885(this.field1578[var7], this.field1572[var7]);
                }
            }
            if (this.field1583 != null) {
                for (int var8 = 0; var8 < this.field1583.length; var8++) {
                    var6.method864(this.field1583[var8], this.field1593[var8]);
                }
            }
            var5 = var6.method880(this.field1576 + 64, this.field1588 + 850, -30, -50, -30);
            class59.field1010.method2333((long) this.field1581, arg1 ^ 0x50, var5);
        }
        class96 var9;
        if (this.field1594 == -1 || arg2 == -1) {
            var9 = var5.method532(true, true, true);
        } else {
            var9 = class198.method1524(this.field1594, -101).method314(var5, arg3, false, arg0, arg2);
        }
        if (this.field1586 != 128 || this.field1580 != 128) {
            var9.method521(this.field1586, this.field1580, this.field1586);
        }
        if (this.field1577 != 0) {
            if (this.field1577 == 90) {
                var9.method522();
            }
            if (this.field1577 == 180) {
                var9.method514();
            }
            if (this.field1577 == 270) {
                var9.method526();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILqm;)V", line = 86)
    public final void method733(int arg0, class227 arg1) {
        if (arg0 != -1) {
            this.field1580 = 61;
        }
        field1590++;
        while (true) {
            int var3 = arg1.method1720((byte) -49);
            if (var3 == 0) {
                return;
            }
            this.method736(arg1, -91, var3);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 110)
    public static final void method734(int arg0) {
        class281.field4616 = new class327();
        field1579++;
        if (arg0 != -11709) {
            field1584 = (class85[]) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 143)
    public static void method735(byte arg0) {
        if (arg0 > 104) {
            field1592 = null;
            field1584 = null;
            field1574 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lqm;II)V", line = 177)
    private final void method736(class227 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1589 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field1594 = arg0.method1765(true);
        } else if (arg2 == 4) {
            this.field1586 = arg0.method1765(true);
        } else if (arg2 == 5) {
            this.field1580 = arg0.method1765(true);
        } else if (arg2 == 6) {
            this.field1577 = arg0.method1765(true);
        } else if (arg2 == 7) {
            this.field1576 = arg0.method1720((byte) -48);
        } else if (arg2 == 8) {
            this.field1588 = arg0.method1720((byte) -11);
        } else if (arg2 == 9) {
            this.field1585 = true;
        } else if (arg2 == 10) {
            this.field1591 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1720((byte) -74);
            this.field1572 = new short[var4];
            this.field1578 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1578[var5] = (short) arg0.method1765(true);
                this.field1572[var5] = (short) arg0.method1765(true);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1720((byte) -42);
            this.field1593 = new short[var6];
            this.field1583 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1583[var7] = (short) arg0.method1765(true);
                this.field1593[var7] = (short) arg0.method1765(true);
            }
        }
        if (arg1 != -91) {
            field1592 = (int[]) null;
        }
        field1582++;
    }
}
