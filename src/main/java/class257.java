import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class257 {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "J")
    public static long field4088 = 0L;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILig;)V")
    public final void method1715(int arg0, int arg1, class136 arg2) {
        field4094++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1012(4);
            if (var4 == 0) {
                return;
            }
            this.method1717(arg1, -86, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Lub;")
    public static final class169 method1716(byte arg0, int arg1) {
        class169 var2 = (class169) client.field4569.method1155((long) arg1, true);
        field4087++;
        if (var2 != null) {
            return var2;
        }
        class169 var3 = class234.method1555(true, class220.field3517, class156.field2540, false, arg1);
        if (var3 != null) {
            client.field4569.method1161(var3, (byte) -105, (long) arg1);
        }
        return arg0 > -31 ? null : var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILig;)V")
    private final void method1717(int arg0, int arg1, int arg2, class136 arg3) {
        if (arg2 == 1) {
            this.field4090 = arg3.method996(65280);
        } else if (arg2 == 2) {
            this.field4083 = arg3.method1012(4);
            this.field4091 = arg3.method1012(4);
        }
        field4084++;
        if (arg1 >= -46) {
            this.field4083 = -70;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method1718(int arg0, int arg1) {
        int var2 = -97 / ((arg1 + 18) / 53);
        field4093++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lwf;")
    public final class17 method1719(byte arg0) {
        class17 var2 = (class17) class211.field3389.method1155((long) this.field4090, true);
        field4092++;
        if (var2 != null) {
            return var2;
        }
        class17 var3 = class22.method177(true, class28.field489, this.field4090, 0);
        if (var3 != null) {
            class211.field3389.method1161(var3, (byte) -116, (long) this.field4090);
        }
        return arg0 == -21 ? var3 : null;
    }
}
