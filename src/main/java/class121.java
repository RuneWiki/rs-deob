import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class121 {

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public int field1699 = 0;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public int field1698 = -1;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public int field1703 = -1;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public int field1706 = 127;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
    public boolean field1697 = false;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public int field1708 = -1;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
    public boolean field1704 = true;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
    public boolean field1710 = true;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public int field1702 = 8;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public int field1711 = 1190717;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1714 = 128;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public int field1707 = 16;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Lh;")
    public static class572 field1713 = new class572("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Ler;")
    public class90 field1696;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLgw;)V")
    public final void method864(byte arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                field1715++;
                if (arg0 >= -10) {
                    method866((byte) 117);
                    return;
                }
                return;
            }
            this.method869((byte) -56, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lin;I)V")
    public static final void method865(class77 arg0, int arg1) {
        arg0.field1030 = null;
        field1700++;
        int var2 = arg0.field1022.length;
        for (int var3 = arg1; var3 < var2; var3++) {
            arg0.field1022[var3].field5247 = false;
        }
        class374[] var4 = class572.field8427;
        synchronized (class572.field8427) {
            if (class572.field8427.length > var2 && class25.field244[var2] < 200) {
                class572.field8427[var2].method2241((byte) 66, arg0);
                int var10002 = class25.field244[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Lmb;")
    public static final class221 method866(byte arg0) {
        field1709++;
        class221 var1 = (class221) class540.field8065.method3505(100);
        if (var1 != null) {
            var1.method2457(-8422);
            var1.method2987(-1);
            return var1;
        }
        if (arg0 != 105) {
            method865(null, 89);
        }
        class221 var2;
        do {
            var2 = (class221) class56.field658.method3505(70);
            if (var2 == null) {
                return null;
            }
            if (var2.method1430(26544) > class598.method3538(true)) {
                return null;
            }
            var2.method2457(-8422);
            var2.method2987(-1);
        } while ((var2.field7109 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public final void method867(int arg0) {
        if (arg0 >= -64) {
            field1713 = null;
        }
        if (this.field1708 == -1) {
            this.field1708 = this.field1698;
        }
        this.field1702 = this.field1712 | this.field1702 << 8;
        field1705++;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public static void method868(byte arg0) {
        int var1 = -114 / ((32 - arg0) / 61);
        field1713 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLgw;I)V")
    private final void method869(byte arg0, class148 arg1, int arg2) {
        field1701++;
        if (arg0 >= -39) {
            method868((byte) -95);
        }
        if (arg2 == 1) {
            this.field1699 = class641.method3708((byte) -51, arg1.method1028((byte) 123));
        } else if (arg2 == 2) {
            this.field1698 = arg1.method1032((byte) -33);
        } else if (arg2 == 3) {
            this.field1698 = arg1.method1045(true);
            if (this.field1698 == 65535) {
                this.field1698 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field1704 = false;
            return;
        } else if (arg2 == 7) {
            this.field1703 = class641.method3708((byte) -51, arg1.method1028((byte) 123));
            return;
        } else if (arg2 == 8) {
            this.field1696.field1351 = this.field1712;
            return;
        } else if (arg2 == 9) {
            this.field1714 = arg1.method1045(true) << 0;
            return;
        } else if (arg2 == 10) {
            this.field1710 = false;
            return;
        } else if (arg2 == 11) {
            this.field1702 = arg1.method1032((byte) -33);
            return;
        } else if (arg2 == 12) {
            this.field1697 = true;
            return;
        } else {
            if (arg2 == 13) {
                this.field1711 = arg1.method1028((byte) 123);
            } else if (arg2 == 14) {
                this.field1707 = arg1.method1032((byte) -33) << 0;
                return;
            } else if (arg2 == 15) {
                this.field1708 = arg1.method1045(true);
                if (this.field1708 == 65535) {
                    this.field1708 = -1;
                    return;
                }
            } else if (arg2 == 16) {
                this.field1706 = arg1.method1032((byte) -33);
                return;
            } else {
                return;
            }
            return;
        }
    }
}
