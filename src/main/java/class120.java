import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class120 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lkh;")
    private class13 field1810 = new class13(64);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lul;")
    private class406 field1808;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1806;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1809;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lob;")
    public static class521 field1807;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lul;")
    public static class406 field1812;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lya;Lor;III)V")
    public static final void method899(class38 arg0, class455 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class497.field7147) {
            class138 var5 = client.field3311[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2105 != null && var5.field2105.method17(13651334)) {
                arg1.method23(3, 0, arg0, class450.field6574, var5.field2105, 0, true);
            }
        }
        if (arg4 < class497.field7147) {
            class138 var6 = client.field3311[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2105 != null && var6.field2105.method17(13651334)) {
                arg1.method23(3, class450.field6574, arg0, 0, var6.field2105, 0, true);
            }
        }
        if (arg3 < class497.field7147 && arg4 < class385.field5799) {
            class138 var7 = client.field3311[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2105 != null && var7.field2105.method17(13651334)) {
                arg1.method23(3, class450.field6574, arg0, class450.field6574, var7.field2105, 0, true);
            }
        }
        if (arg3 < class497.field7147 && arg4 > 0) {
            class138 var8 = client.field3311[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2105 != null && var8.field2105.method17(13651334)) {
                arg1.method23(3, -class450.field6574, arg0, class450.field6574, var8.field2105, 0, true);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lnl;")
    public final class388 method900(int arg0, int arg1) {
        field1811++;
        class13 var3 = this.field1810;
        class388 var4;
        synchronized (this.field1810) {
            var4 = (class388) this.field1810.method87((long) arg0, arg1 ^ 0x851340C0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 1) {
            method901(-82);
        }
        class406 var5 = this.field1808;
        byte[] var6;
        synchronized (this.field1808) {
            var6 = this.field1808.method2536(5, 0, arg0);
        }
        class388 var7 = new class388();
        if (var6 != null) {
            var7.method2424(new class217(var6), arg1 + 13780);
        }
        class13 var8 = this.field1810;
        synchronized (this.field1810) {
            this.field1810.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method901(int arg0) {
        field1809 = null;
        if (arg0 < 0) {
            field1806 = null;
            field1807 = null;
            field1812 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class120(class480 arg0, int arg1, class406 arg2) {
        this.field1808 = arg2;
        this.field1808.method2551(5, -26070);
    }

    static {
        new class234("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field1806 = "";
        field1809 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        field1807 = new class521(73, 11);
        field1813 = 1338;
    }
}
