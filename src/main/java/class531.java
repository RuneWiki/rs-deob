import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class531 extends class68 {

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public int field7809;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public int field7815;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public int field7817;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Lgg;")
    public class117 field7813;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "[Lta;")
    public static class143[] field7811;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "[Lvs;")
    public class419[] field7810;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V", line = 5)
    public static void method3149(int arg0) {
        field7811 = null;
        if (arg0 != 16276) {
            field7812 = 52;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V", line = 16)
    public static final void method3150(int arg0, int arg1) {
        if (arg0 == 0) {
            field7816++;
            class153 var2 = class75.method656(6, 255, arg1);
            var2.method997((byte) 93);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lya;Lgg;III)V", line = 30)
    public static final void method3151(class38 arg0, class117 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class470.field6825) {
            class490 var5 = class125.field1664[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7131 != null && var5.field7131.method194((byte) -76)) {
                arg1.method193(var5.field7131, class376.field4951, true, 0, 0, -116, arg0);
            }
        }
        if (arg4 < class470.field6825) {
            class490 var6 = class125.field1664[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7131 != null && var6.field7131.method194((byte) -105)) {
                arg1.method193(var6.field7131, 0, true, class376.field4951, 0, -41, arg0);
            }
        }
        if (arg3 < class470.field6825 && arg4 < class105.field1336) {
            class490 var7 = class125.field1664[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7131 != null && var7.field7131.method194((byte) -110)) {
                arg1.method193(var7.field7131, class376.field4951, true, class376.field4951, 0, -80, arg0);
            }
        }
        if (arg3 < class470.field6825 && arg4 > 0) {
            class490 var8 = class125.field1664[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7131 != null && var8.field7131.method194((byte) -127)) {
                arg1.method193(var8.field7131, class376.field4951, true, -class376.field4951, 0, -32, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILya;BI)Z", line = 77)
    public final boolean method3152(int arg0, class38 arg1, byte arg2, int arg3) {
        field7814++;
        if (arg2 != 21) {
            this.field7817 = -72;
        }
        if (this.field7810 != null) {
            for (int var5 = 0; var5 < this.field7810.length; var5++) {
                if (this.field7810[var5].method2466(arg0, arg3) && this.field7813.method186(105, arg1, arg0, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
