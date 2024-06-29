import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class140 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "F")
    public float field1743 = 0.25F;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "F")
    public float field1738 = 1.0F;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "F")
    public float field1750 = 1.0F;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "F")
    public float field1741;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljia;")
    public class645 field1747;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "F")
    public float field1740;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "F")
    public float field1746;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lkja;")
    public static class686 field1737 = new class686();

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lko;")
    public static class531 field1751 = new class531();

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1756 = 0;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILfg;)Z")
    public final boolean method1019(int arg0, class140 arg1) {
        field1754++;
        if (arg0 == 8) {
            return this.field1748 == arg1.field1748 && this.field1746 == arg1.field1746 && this.field1741 == arg1.field1741 && this.field1740 == arg1.field1740 && this.field1743 == arg1.field1743 && this.field1750 == arg1.field1750 && this.field1738 == arg1.field1738 && this.field1739 == arg1.field1739 && this.field1749 == arg1.field1749 && this.field1747 == arg1.field1747;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method1020(int arg0) {
        field1751 = null;
        int var1 = -85 / ((arg0 + 30) / 63);
        field1737 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
    public static final void method1021(int arg0, int arg1, int arg2) {
        field1744++;
        if (arg1 != 22303) {
            method1020(-86);
        }
        if (!class62.method534(7900)) {
            return;
        }
        if (class48.field648 != arg0) {
            class513.field7244 = "";
        }
        class506.field7198 = arg2;
        class48.field648 = arg0;
        class48.method454(6, arg1 ^ 0xFFFFA8E0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILes;)V")
    public final void method1022(int arg0, class403 arg1) {
        this.field1750 = (float) (arg1.method2396((byte) 89) * 8) / 255.0F;
        field1755++;
        int var3 = -94 / ((arg0 - 58) / 32);
        this.field1743 = (float) (arg1.method2396((byte) -121) * 8) / 255.0F;
        this.field1738 = (float) (arg1.method2396((byte) -113) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class140() {
        this.field1739 = class230.field2745;
        this.field1745 = -50;
        this.field1749 = 0;
        this.field1741 = 0.69921875F;
        this.field1747 = class655.field9031;
        this.field1740 = 1.2F;
        this.field1748 = class245.field2896;
        this.field1742 = -60;
        this.field1746 = 1.1523438F;
        this.field1753 = -50;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Les;)V")
    public class140(class403 arg0) {
        int var2 = arg0.method2396((byte) 49);
        if (class118.field1503.field10628.method1580(0) == 1 && class390.field5065.method583() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1748 = class245.field2896;
            } else {
                this.field1748 = arg0.method2381((byte) 123);
            }
            if ((var2 & 0x2) == 0) {
                this.field1746 = 1.1523438F;
            } else {
                this.field1746 = (float) arg0.method2390((byte) -113) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1741 = 0.69921875F;
            } else {
                this.field1741 = (float) arg0.method2390((byte) -102) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1740 = 1.2F;
            } else {
                this.field1740 = (float) arg0.method2390((byte) -116) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2381((byte) 46);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2390((byte) -117);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2390((byte) 65);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2390((byte) 118);
            }
            this.field1741 = 0.69921875F;
            this.field1740 = 1.2F;
            this.field1748 = class245.field2896;
            this.field1746 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1742 = -60;
            this.field1745 = -50;
            this.field1753 = -50;
        } else {
            this.field1745 = arg0.method2365(true);
            this.field1742 = arg0.method2365(true);
            this.field1753 = arg0.method2365(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field1739 = class230.field2745;
        } else {
            this.field1739 = arg0.method2381((byte) 37);
        }
        if ((var2 & 0x40) == 0) {
            this.field1749 = 0;
        } else {
            this.field1749 = arg0.method2390((byte) 111);
        }
        if ((var2 & 0x80) == 0) {
            this.field1747 = class655.field9031;
        } else {
            int var3 = arg0.method2390((byte) 9);
            int var4 = arg0.method2390((byte) -6);
            int var5 = arg0.method2390((byte) -99);
            int var6 = arg0.method2390((byte) -99);
            int var7 = arg0.method2390((byte) -108);
            int var8 = arg0.method2390((byte) -127);
            this.field1747 = class537.method3190(var3, var6, var8, 124, var5, var4, var7);
        }
    }
}
