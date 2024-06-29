import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class107 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lsq;")
    private class27 field1556 = new class27();

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[Z")
    public static boolean[] field1568 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lik;")
    public static class410 field1569 = new class410(64);

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1571 = 50;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Z")
    public static boolean field1573 = false;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
    public static int[] field1574 = new int[200];

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lsq;")
    private class27 field1559;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lsq;")
    public final class27 method891(int arg0) {
        field1557++;
        if (arg0 != 20838) {
            method893(-62);
        }
        class27 var2 = this.field1556.field480;
        if (this.field1556 == var2) {
            this.field1559 = null;
            return null;
        } else {
            this.field1559 = var2.field480;
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lsq;")
    public final class27 method892(int arg0) {
        field1561++;
        if (arg0 != 0) {
            field1569 = null;
        }
        class27 var2 = this.field1556.field471;
        if (this.field1556 == var2) {
            this.field1559 = null;
            return null;
        } else {
            this.field1559 = var2.field471;
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static void method893(int arg0) {
        if (arg0 != 16658) {
            field1570 = -89;
        }
        field1569 = null;
        field1574 = null;
        field1568 = null;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public final void method894(int arg0) {
        if (arg0 <= 98) {
            this.method892(-22);
        }
        while (true) {
            class27 var2 = this.field1556.field480;
            if (this.field1556 == var2) {
                field1567++;
                this.field1559 = null;
                return;
            }
            var2.method328(-73);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method895(byte arg0) {
        field1563++;
        class410 var1 = class68.field1018;
        synchronized (class68.field1018) {
            class68.field1018.method2539(arg0 - 55);
        }
        class410 var2 = class388.field5462;
        synchronized (class388.field5462) {
            if (arg0 != 85) {
                method893(-88);
            }
            class388.field5462.method2539(112);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method896(boolean arg0) {
        field1560++;
        if (class421.field5895 == 5 && !arg0) {
            class421.field5895 = 6;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lsq;")
    public final class27 method897(byte arg0) {
        field1564++;
        class27 var2 = this.field1556.field480;
        if (arg0 >= -18) {
            return null;
        } else if (this.field1556 == var2) {
            return null;
        } else {
            var2.method328(-67);
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Lsq;")
    public final class27 method898(int arg0) {
        field1562++;
        class27 var2 = this.field1559;
        if (arg0 != 64) {
            field1572 = -93;
        }
        if (this.field1556 == var2) {
            this.field1559 = null;
            return null;
        } else {
            this.field1559 = var2.field480;
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Z")
    public final boolean method899(byte arg0) {
        int var2 = 34 % ((35 - arg0) / 53);
        field1558++;
        return this.field1556.field480 == this.field1556;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)I")
    public final int method900(byte arg0) {
        field1566++;
        int var2 = 0;
        if (arg0 <= 93) {
            method896(true);
        }
        for (class27 var3 = this.field1556.field480; var3 != this.field1556; var3 = var3.field480) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLsq;)V")
    public final void method901(boolean arg0, class27 arg1) {
        field1565++;
        if (arg1.field471 != null) {
            arg1.method328(-73);
        }
        if (!arg0) {
            arg1.field480 = this.field1556;
            arg1.field471 = this.field1556.field471;
            arg1.field471.field480 = arg1;
            arg1.field480.field471 = arg1;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class107() {
        this.field1556.field480 = this.field1556;
        this.field1556.field471 = this.field1556;
    }
}
