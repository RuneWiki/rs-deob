import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class93 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lce;")
    public static class126 field1451 = class206.method1445(-7923, " )2> ");

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lce;")
    private static class126 field1456 = class206.method1445(-7923, "Allocated memory");

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lce;")
    public static class126 field1455 = field1456;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lce;")
    public static class126 field1453 = class206.method1445(-7923, ":duelfriend:");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lce;")
    public static class126 field1457 = class206.method1445(-7923, "<col=00ffff>");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lcc;")
    public static class313 field1450;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 7)
    public static final void method637(int arg0) {
        field1452++;
        int var1 = -12 / ((arg0 - 15) / 49);
        if (class217.field3648 != null) {
            class170.method1245(class217.field3648, true);
            class217.field3648 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[B)[B", line = 24)
    public static final byte[] method638(int arg0, byte[] arg1) {
        field1454++;
        class134 var2 = new class134(arg1);
        int var3 = var2.method948(-124);
        int var4 = var2.method957(496113200);
        if (var4 < 0 || class74.field1186 != 0 && var4 > class74.field1186) {
            throw new RuntimeException();
        } else if (~var3 == arg0) {
            byte[] var7 = new byte[var4];
            var2.method968(var7, var4, 88, 0);
            return var7;
        } else {
            int var5 = var2.method957(496113200);
            if (var5 < 0 || class74.field1186 != 0 && var5 > class74.field1186) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class72.method522(var6, var5, arg1, var4, 9);
            } else {
                class260.field4358.method1895((byte) 124, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 74)
    public static void method639(int arg0) {
        if (arg0 != 9) {
            field1458 = -30;
        }
        field1455 = null;
        field1453 = null;
        field1457 = null;
        field1450 = null;
        field1451 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lei;ILei;)V", line = 111)
    public static final void method640(class68 arg0, int arg1, class68 arg2) {
        field1449++;
        if (arg0.field1114 != null) {
            arg0.method499((byte) 64);
        }
        if (arg1 != -1) {
            method641(120);
        }
        arg0.field1129 = arg2;
        arg0.field1114 = arg2.field1114;
        arg0.field1114.field1129 = arg0;
        arg0.field1129.field1114 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 139)
    public static final void method641(int arg0) {
        field1448++;
        class84.field1343.method1178(-122);
        int var1 = 11 / ((arg0 - 63) / 52);
    }
}
