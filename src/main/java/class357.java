import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class357 {

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Lkh;")
    private class13 field5291 = new class13(64);

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Lkh;")
    private class13 field5293 = new class13(100);

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lul;")
    private class406 field5285;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Lhn;")
    public static class509 field5287 = new class509(81, -2);

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
    public static int[] field5290;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field5294;

    static {
        new class234("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field5290 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BCI)I", line = 5)
    public static final int method2237(byte arg0, char arg1, int arg2) {
        field5286++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg0 == -60) {
            if (arg1 == 'ñ' && arg2 == 0) {
                var3 = 1762;
            }
            return var3;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)Lsm;", line = 30)
    public final class189 method2238(int arg0, byte arg1) {
        field5292++;
        class13 var3 = this.field5291;
        class189 var4;
        synchronized (this.field5291) {
            var4 = (class189) this.field5291.method87((long) arg0, arg1 ^ 0x8513408F);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field5285;
        byte[] var6;
        synchronized (this.field5285) {
            var6 = this.field5285.method2536(class71.method625(1809521479, arg0), 0, class336.method2119(arg0, true));
        }
        class189 var7 = new class189();
        var7.field3177 = this;
        var7.field3182 = arg0;
        if (var6 != null) {
            var7.method1329(arg1 ^ 0xFFFFFFF5, new class217(var6));
        }
        var7.method1328(82);
        if (arg1 != 78) {
            method2245(true, -85, -50, 76);
        }
        class13 var8 = this.field5291;
        synchronized (this.field5291) {
            this.field5291.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)Lir;", line = 68)
    public final class22 method2239(int arg0, byte arg1) {
        int var3 = 3 % ((arg1 - 31) / 44);
        field5282++;
        class13 var4 = this.field5293;
        class22 var5;
        synchronized (this.field5293) {
            var5 = (class22) this.field5293.method87((long) arg0, -2062335807);
            if (var5 == null) {
                var5 = new class22(arg0);
                this.field5293.method84((long) arg0, var5, (byte) 27);
            }
        }
        synchronized (var5) {
            return var5.method167((byte) 37) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Ljh;", line = 94)
    public static final class112 method2240(boolean arg0) {
        field5294++;
        if (arg0) {
            field5287 = null;
        }
        class112 var1 = (class112) class28.field333.method1963(217);
        if (var1 == null) {
            return new class112();
        } else {
            class169.field2498--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 119)
    public static void method2241(byte arg0) {
        field5287 = null;
        field5290 = null;
        if (arg0 != 84) {
            method2244(null, -72);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 131)
    public final void method2242(int arg0) {
        field5289++;
        class13 var2 = this.field5291;
        synchronized (this.field5291) {
            this.field5291.method88(106);
        }
        class13 var3 = this.field5293;
        synchronized (this.field5293) {
            if (arg0 < -85) {
                this.field5293.method88(101);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V", line = 147)
    public final void method2243(int arg0, boolean arg1) {
        field5283++;
        if (arg1) {
            this.method2242(-93);
        }
        class13 var3 = this.field5291;
        synchronized (this.field5291) {
            this.field5291.method91(18, arg0);
        }
        class13 var4 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method91(57, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Luq;I)V", line = 164)
    public static final void method2244(class114 arg0, int arg1) {
        if (arg1 != -30951) {
            method2244(null, -4);
        }
        field5284++;
        if (!class245.field3859) {
            return;
        }
        class339.field5055++;
        if (arg0.field1620 != null) {
            class114 var2 = class181.method1210(class358.field5318, -2, class371.field5524);
            if (var2 != null) {
                class405 var3 = new class405();
                var3.field5996 = var2;
                var3.field6008 = arg0.field1620;
                var3.field6004 = arg0;
                class192.method1356(var3);
            }
        }
        class74.method640(-29627, class507.field7402);
        class71.field1020.method1566(true, arg0.field1644);
        class71.field1020.method1508(arg1 + 30823, arg0.field1630);
        class71.field1020.method1554((byte) 127, class371.field5524);
        class71.field1020.method1508(arg1 ^ 0x7899, class71.field1028);
        class71.field1020.method1539((byte) -122, class358.field5318);
        class71.field1020.method1539((byte) -121, arg0.field1670);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZIII)V", line = 210)
    public static final void method2245(boolean arg0, int arg1, int arg2, int arg3) {
        field5288++;
        if (!arg0) {
            String var4 = "tele " + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
            System.out.println(var4);
            class447.method2742(true, var4, 3825);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lee;ILul;Lul;Lul;)V", line = 252)
    public class357(class480 arg0, int arg1, class406 arg2, class406 arg3, class406 arg4) {
        this.field5285 = arg2;
        if (this.field5285 != null) {
            int var6 = this.field5285.method2561(-122) - 1;
            this.field5285.method2551(var6, -26070);
        }
        class234.method1637(arg3, arg4, -126);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V", line = 236)
    public final void method2246(boolean arg0) {
        class13 var2 = this.field5291;
        synchronized (this.field5291) {
            if (arg0) {
                this.method2246(false);
            }
            this.field5291.method93((byte) 119);
        }
        field5281++;
        class13 var3 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method93((byte) 104);
        }
    }
}
