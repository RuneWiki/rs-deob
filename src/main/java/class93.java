import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class93 {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lue;")
    private class213 field1747 = new class213();

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Ltd;")
    private class202 field1755 = new class202();

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    private int field1754;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lwd;")
    private class232 field1753;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[Z")
    public static boolean[] field1746 = new boolean[100];

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1749 = 2;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lvd;")
    public static class222 field1743 = class212.method1357("::fpsoff", 10731);

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lvd;")
    public static class222 field1742 = class212.method1357(")3", 10731);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
    public static int[] field1751 = new int[2000];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lme;")
    public static class133 field1738;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lwb;")
    public static class230 field1750;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lmd;")
    public final class132 method592(int arg0) {
        if (arg0 != 0) {
            this.field1747 = null;
        }
        field1737++;
        return this.field1753.method1522(~arg0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JLue;B)V")
    public final void method593(long arg0, class213 arg1, byte arg2) {
        field1741++;
        if (this.field1756 == 0) {
            class213 var5 = this.field1755.method1289(arg2 ^ 0xFFFFFFF4);
            var5.method826(-22101);
            var5.method1362(arg2 + 10);
            if (this.field1747 == var5) {
                class213 var6 = this.field1755.method1289(arg2 ^ 0xFFFFFFF4);
                var6.method826(-22101);
                var6.method1362(-2);
            }
        } else {
            this.field1756--;
        }
        if (arg2 != -12) {
            this.field1747 = null;
        }
        this.field1753.method1519(true, arg1, arg0);
        this.field1755.method1287(false, arg1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method594(byte arg0) {
        field1752++;
        Object var1 = class52.field989;
        synchronized (class52.field989) {
            if (arg0 != 127) {
                field1743 = null;
            }
            if (class162.field3086 != 0) {
                class162.field3086 = 1;
                try {
                    class52.field989.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public static final void method595(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field2299; var4++) {
            class23 var5 = var3.field2297[var4];
            if ((var5.field536 >> 29 & 0x3L) == 2L && var5.field534 == arg1 && var5.field539 == arg2) {
                class196.method1205(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public final void method596(boolean arg0) {
        while (true) {
            class213 var2 = this.field1755.method1289(0);
            if (var2 == null) {
                if (arg0) {
                    this.field1747 = null;
                }
                field1748++;
                this.field1756 = this.field1754;
                return;
            }
            var2.method826(-22101);
            var2.method1362(-2);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lmd;")
    public final class132 method597(int arg0) {
        field1745++;
        return arg0 < 100 ? null : this.field1753.method1517(0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JB)V")
    public final void method598(long arg0, byte arg1) {
        field1740++;
        if (arg1 >= -73) {
            field1746 = null;
        }
        class213 var4 = (class213) this.field1753.method1520(arg0, 32);
        if (var4 != null) {
            var4.method826(-22101);
            var4.method1362(-2);
            this.field1756++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lre;")
    public static final class183 method599(byte arg0, int arg1) {
        field1739++;
        class183 var2 = (class183) class111.field2095.method601((long) arg1, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field983.method33(-29616, class217.method1380((byte) -113, arg1), class181.method1136(127, arg1));
        class183 var4 = new class183();
        if (var3 != null) {
            var4.method1144(new class109(var3), -127);
        }
        if (arg0 > -14) {
            method599((byte) -111, -73);
        }
        var4.method1145((byte) -126);
        class111.field2095.method593((long) arg1, var4, (byte) -12);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1743 = null;
        field1738 = null;
        if (arg0 != 113) {
            field1742 = null;
        }
        field1742 = null;
        field1751 = null;
        field1750 = null;
        field1746 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JI)Lue;")
    public final class213 method601(long arg0, int arg1) {
        field1744++;
        if (arg1 <= 36) {
            method600((byte) -60);
        }
        class213 var4 = (class213) this.field1753.method1520(arg0, 126);
        if (var4 != null) {
            this.field1755.method1287(false, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
    public class93(int arg0) {
        this.field1754 = arg0;
        int var2 = 1;
        this.field1756 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field1753 = new class232(var2);
    }
}
