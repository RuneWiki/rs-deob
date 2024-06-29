import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class112 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lha;")
    private class243 field1444;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lpq;")
    private class50 field1453;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lqn;")
    private class66 field1438;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
    public static int[] field1449 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[B")
    public static byte[] field1454 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field1441 = -1;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field1450 = -1;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lug;")
    public static class118 field1442;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lir;")
    public static class185 field1440;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Lfb;")
    private class341 field1456;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[Loq;")
    private class232[] field1445;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[Ll;")
    public static class315[] field1455;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[[[B")
    public static byte[][][] field1452;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V", line = 10)
    public static final void method828(int arg0, String arg1, boolean arg2, String arg3) {
        field1446++;
        class247.field3477 = arg0;
        class427.field6216 = arg1;
        class425.field6207 = arg3;
        if (class427.field6216.equals("") || class425.field6207.equals("")) {
            class241.field3371 = 3;
        } else if (class13.field209 == -1) {
            class24.field433 = 1;
            class241.field3371 = -3;
            class25.field448 = 0;
            class48.field749 = 0;
            class341 var4 = new class341(128);
            var4.method2204(10, 8);
            var4.method2240((byte) -88, (int) (Math.random() * 9.9999999E7D));
            if (!arg2) {
                method828(-70, (String) null, true, (String) null);
            }
            var4.method2258(25445, class337.method2194(class427.field6216, 1));
            var4.method2240((byte) -88, (int) (Math.random() * 9.9999999E7D));
            var4.method2214(class425.field6207, -77);
            var4.method2240((byte) -88, (int) (Math.random() * 9.9999999E7D));
            var4.method2216(false, class281.field4136, class36.field556);
            class140.field1797.field5049 = 0;
            class140.field1797.method2204(24, 8);
            class140.field1797.method2204(var4.field5049 + 2, 8);
            class140.field1797.method2250(false, 556);
            class140.field1797.method2252(0, -847501448, var4.field5049, var4.field5042);
        } else {
            class273.method1808(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 58)
    public static void method829(boolean arg0) {
        field1440 = null;
        if (!arg0) {
            method829(true);
        }
        field1454 = null;
        field1455 = null;
        field1442 = null;
        field1449 = null;
        field1452 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Z", line = 74)
    public final boolean method830(boolean arg0) {
        if (!arg0) {
            this.field1445 = null;
        }
        field1439++;
        if (this.field1456 != null) {
            return true;
        }
        if (this.field1438 == null) {
            if (this.field1453.method353((byte) -108)) {
                return false;
            }
            this.field1438 = this.field1453.method352((byte) 0, 255, true, 255, (byte) 35);
        }
        if (this.field1438.field5227) {
            return false;
        } else {
            this.field1456 = new class341(this.field1438.method569(0));
            this.field1445 = new class232[(this.field1456.field5042.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lpq;Lha;)V", line = 129)
    public class112(class50 arg0, class243 arg1) {
        this.field1444 = arg1;
        this.field1453 = arg0;
        if (!this.field1453.method353((byte) 79)) {
            this.field1438 = this.field1453.method352((byte) 0, 255, true, 255, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 142)
    public final void method831(byte arg0) {
        field1443++;
        if (arg0 >= -36) {
            method828(-98, (String) null, true, (String) null);
        }
        if (this.field1445 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1445.length; var2++) {
            if (this.field1445[var2] != null) {
                this.field1445[var2].method1499(0);
            }
        }
        for (int var3 = 0; var3 < this.field1445.length; var3++) {
            if (this.field1445[var3] != null) {
                this.field1445[var3].method1505(-25893);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBZLeg;Leg;)Loq;", line = 178)
    private final class232 method832(int arg0, byte arg1, boolean arg2, class330 arg3, class330 arg4) {
        field1447++;
        if (this.field1456 == null) {
            throw new RuntimeException();
        }
        this.field1456.field5049 = arg0 * 8 + 5;
        if (this.field1456.field5049 >= this.field1456.field5042.length) {
            throw new RuntimeException();
        } else if (this.field1445[arg0] == null) {
            if (arg1 != 28) {
                this.method831((byte) 127);
            }
            int var6 = this.field1456.method2232(-53);
            int var7 = this.field1456.method2232(-120);
            class232 var8 = new class232(arg0, arg3, arg4, this.field1453, this.field1444, var6, var7, arg2);
            this.field1445[arg0] = var8;
            return var8;
        } else {
            return this.field1445[arg0];
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLeg;Leg;)Loq;", line = 218)
    public final class232 method833(int arg0, byte arg1, class330 arg2, class330 arg3) {
        field1448++;
        return arg1 >= -33 ? null : this.method832(arg0, (byte) 28, true, arg3, arg2);
    }
}
