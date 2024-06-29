import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class121 {

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "F")
    public float field1571 = 1.0F;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "F")
    public float field1578 = 0.25F;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "F")
    public float field1576 = 1.0F;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "F")
    public float field1584;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "Loi;")
    public class49 field1585;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "F")
    public float field1568;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "F")
    public float field1577;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "[I")
    public static int[] field1580 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Lgn;")
    public static class475 field1582 = new class475(37, 0);

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Lum;")
    public static class347 field1589 = new class347();

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1590 = new String[100];

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "Liu;")
    public static class390 field1591 = new class390(32, 8);

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Lhe;")
    public static class239 field1574;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Lwg;")
    public static class280 field1587;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILae;)V", line = 3)
    public final void method689(int arg0, class156 arg1) {
        int var3 = -120 / ((arg0 - 47) / 59);
        field1583++;
        this.field1576 = (float) (arg1.method941((byte) 123) * 8) / 255.0F;
        this.field1578 = (float) (arg1.method941((byte) 124) * 8) / 255.0F;
        this.field1571 = (float) (arg1.method941((byte) 127) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBI)V", line = 15)
    public static final void method690(int arg0, byte arg1, int arg2) {
        field1572++;
        class121 var3 = class99.field1353[arg0][arg2];
        if (var3 != null) {
            class408.field5989 = var3.field1570;
            class226.field3195 = var3.field1569;
            class226.field3196 = var3.field1586;
        }
        if (arg1 != -127) {
            field1591 = null;
        }
        class234.method1423(-9665);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V", line = 42)
    public static void method691(boolean arg0) {
        field1591 = null;
        field1590 = null;
        field1587 = null;
        field1589 = null;
        field1574 = null;
        field1580 = null;
        if (arg0) {
            field1589 = null;
        }
        field1582 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 97)
    public class121() {
        this.field1569 = -50;
        this.field1584 = 1.1523438F;
        this.field1586 = -60;
        this.field1585 = class442.field6449;
        this.field1575 = class420.field6205;
        this.field1568 = 0.69921875F;
        this.field1570 = -50;
        this.field1573 = class173.field2376;
        this.field1579 = 0;
        this.field1577 = 1.2F;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lae;)V", line = 116)
    public class121(class156 arg0) {
        int var2 = arg0.method941((byte) 126);
        if (class118.field1533.field6886 && class298.field4343.method778() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1573 = class173.field2376;
            } else {
                this.field1573 = arg0.method950(186);
            }
            if ((var2 & 0x2) == 0) {
                this.field1584 = 1.1523438F;
            } else {
                this.field1584 = (float) arg0.method993((byte) -120) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1568 = 0.69921875F;
            } else {
                this.field1568 = (float) arg0.method993((byte) -88) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1577 = 1.2F;
            } else {
                this.field1577 = (float) arg0.method993((byte) -70) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method950(186);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method993((byte) -109);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method993((byte) -75);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method993((byte) -59);
            }
            this.field1584 = 1.1523438F;
            this.field1573 = class173.field2376;
            this.field1577 = 1.2F;
            this.field1568 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1569 = -50;
            this.field1570 = -50;
            this.field1586 = -60;
        } else {
            this.field1569 = arg0.method936((byte) -96);
            this.field1586 = arg0.method936((byte) -96);
            this.field1570 = arg0.method936((byte) -96);
        }
        if ((var2 & 0x20) == 0) {
            this.field1575 = class420.field6205;
        } else {
            this.field1575 = arg0.method950(186);
        }
        if ((var2 & 0x40) == 0) {
            this.field1579 = 0;
        } else {
            this.field1579 = arg0.method993((byte) -87);
        }
        if ((var2 & 0x80) == 0) {
            this.field1585 = class442.field6449;
        } else {
            int var3 = arg0.method993((byte) -120);
            int var4 = arg0.method993((byte) -66);
            int var5 = arg0.method993((byte) -34);
            int var6 = arg0.method993((byte) -60);
            int var7 = arg0.method993((byte) -93);
            int var8 = arg0.method993((byte) -106);
            this.field1585 = class390.method2349(var4, -120, var8, var3, var6, var7, var5);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lru;I)Z", line = 76)
    public final boolean method692(class121 arg0, int arg1) {
        if (arg1 != 18778) {
            method690(94, (byte) -45, 121);
        }
        field1581++;
        return this.field1573 == arg0.field1573 && this.field1584 == arg0.field1584 && this.field1568 == arg0.field1568 && this.field1577 == arg0.field1577 && this.field1578 == arg0.field1578 && this.field1576 == arg0.field1576 && this.field1571 == arg0.field1571 && this.field1575 == arg0.field1575 && this.field1579 == arg0.field1579 && this.field1585 == arg0.field1585;
    }
}
