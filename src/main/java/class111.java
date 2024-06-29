import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class111 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lwf;")
    private class117 field1574 = new class117(64);

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lkda;")
    private class328 field1585;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Llu;")
    public static class610 field1572 = new class610(48, 11);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lwf;")
    public static class117 field1575 = new class117(20);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lh;")
    public static class572 field1581 = new class572("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lh;")
    public static class572 field1584 = new class572("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1587 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "[I")
    public static int[] field1583;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lcp;")
    public final class619 method810(int arg0, int arg1) {
        field1580++;
        int var3 = 11 % ((71 - arg0) / 54);
        class117 var4 = this.field1574;
        class619 var5;
        synchronized (this.field1574) {
            var5 = (class619) this.field1574.method842(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class328 var6 = this.field1585;
        byte[] var7;
        synchronized (this.field1585) {
            var7 = this.field1585.method1966(arg1, 31, true);
        }
        class619 var8 = new class619();
        if (var7 != null) {
            var8.method3625((byte) -111, new class148(var7));
        }
        class117 var9 = this.field1574;
        synchronized (this.field1574) {
            this.field1574.method835((byte) 121, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method811(int arg0) {
        class117 var2 = this.field1574;
        synchronized (this.field1574) {
            this.field1574.method846(arg0 ^ arg0);
        }
        field1571++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public final void method812(boolean arg0, int arg1) {
        class117 var3 = this.field1574;
        synchronized (this.field1574) {
            if (!arg0) {
                method815(104, (byte) -99, 30);
            }
            this.field1574.method834(arg1, 0);
        }
        field1576++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Ljj;")
    public static final class101 method813(byte arg0) {
        field1578++;
        if (class339.field4681 == null || class52.field605 == null) {
            return null;
        }
        if (arg0 < 66) {
            method814(-88);
        }
        for (class101 var1 = (class101) class52.field605.method1739(-5301); var1 != null; var1 = (class101) class52.field605.method1739(-5301)) {
            class308 var2 = class339.field4665.method3058(var1.field1463, 0);
            if (var2 != null && var2.field4260 && var2.method1876(class339.field4663, (byte) -65)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method814(int arg0) {
        field1575 = null;
        field1584 = null;
        if (arg0 < 74) {
            field1587 = -39;
        }
        field1583 = null;
        field1581 = null;
        field1572 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)Z")
    public static final boolean method815(int arg0, byte arg1, int arg2) {
        field1577++;
        if ((class146.field2114[1][arg0][arg2] & 0x2) == 0) {
            if (arg1 <= 34) {
                field1575 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public final void method816(boolean arg0) {
        field1573++;
        class117 var2 = this.field1574;
        synchronized (this.field1574) {
            this.field1574.method837(126);
        }
        if (!arg0) {
            this.method811(-89);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class111(class39 arg0, int arg1, class328 arg2) {
        this.field1585 = arg2;
        this.field1585.method1975(95, 31);
    }
}
