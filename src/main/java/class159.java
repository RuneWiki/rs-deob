import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class159 {

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field1895 = 104;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lpn;")
    public static class72 field1896 = new class72(15, 8);

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "[[B")
    public static byte[][] field1907;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lpn;")
    public static class72 field1906;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "[I")
    public static int[] field1909;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[[[Lqa;")
    public static class263[][][] field1901;

    static {
        new class40("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field1907 = new byte[250][];
        field1908 = 0;
        field1906 = new class72(4, -1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 10)
    public static final void method766(int arg0) {
        field1904++;
        for (int var1 = 0; var1 < 5; var1++) {
            class141.field1696[var1] = false;
        }
        if (arg0 != 16707) {
            return;
        }
        class146.field1766 = class427.field6145;
        class346.field4944 = class13.field193;
        class356.field5115 = -1;
        class208.field2884 = class120.field1490;
        class125.field1534 = class204.field2796;
        class368.field5264 = class58.field734;
        class358.field5167 = 5;
        class50.field658 = class351.field5047;
        class282.field4110 = 0;
        class69.field855 = -1;
        class41.field501 = 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)V", line = 54)
    public static final void method767(int arg0, boolean arg1) {
        if (!arg1) {
            field1903++;
            class89 var2 = class146.method695(5, arg0, (byte) -14);
            var2.method448(13);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIZ)V", line = 70)
    public static final void method768(int arg0, int arg1, int arg2, boolean arg3) {
        field1897++;
        if (class293.field4356 == null) {
            return;
        }
        long var4 = (long) (arg2 | arg1 << 14 | arg0 << 28);
        class173 var6 = (class173) class76.field913.method233(-99, var4);
        if (var6 == null) {
            class231.method1276(arg0, arg2, arg1);
            return;
        }
        class76 var7 = (class76) var6.field2080.method802((byte) 107);
        if (var7 == null) {
            class231.method1276(arg0, arg2, arg1);
            return;
        }
        class24 var8 = (class24) class231.method1276(arg0, arg2, arg1);
        if (var8 == null) {
            var8 = new class24();
        } else {
            var8.field324 = var8.field331 = -1;
        }
        var8.field322 = var7.field918;
        var8.field321 = var7.field914;
        label48: while (true) {
            class76 var9 = (class76) var6.field2080.method806((byte) 104);
            if (var9 == null) {
                break;
            }
            if (var8.field321 != var9.field914) {
                var8.field325 = var9.field918;
                var8.field324 = var9.field914;
                while (true) {
                    class76 var10 = (class76) var6.field2080.method806((byte) 104);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field321 != var10.field914 && var8.field324 != var10.field914) {
                        var8.field334 = var10.field918;
                        var8.field331 = var10.field914;
                    }
                }
            }
        }
        int var11 = class375.method2264(-1547, (arg1 << 7) + 64, arg0, (arg2 << 7) + 64);
        if (!arg3) {
            class214.method1201(arg0, arg2, arg1, var11, var8);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 148)
    public static void method769(int arg0) {
        field1896 = null;
        field1901 = null;
        field1907 = null;
        if (arg0 != -1453) {
            method769(60);
        }
        field1906 = null;
        field1909 = null;
    }
}
