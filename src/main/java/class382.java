import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class382 {

    @OriginalMember(owner = "client!im", name = "g", descriptor = "[C")
    private static char[] field5050 = new char[64];

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    private int field5049;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lwba;")
    public class431 field5045;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lio;I)V")
    public final void method2186(class157 arg0, int arg1) {
        if (arg1 >= -124) {
            this.method2191(124, (byte) 70, null);
        }
        field5052++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method2191(var3, (byte) -84, arg0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Ltq;")
    public final synchronized class92 method2187(byte arg0) {
        field5048++;
        class92 var2 = (class92) this.field5045.field5804.method2176(-125, (long) this.field5049);
        if (var2 != null) {
            return var2;
        }
        class92 var3 = class92.method506(this.field5045.field5794, this.field5049, 0);
        if (var3 != null) {
            this.field5045.field5804.method2174(var3, (long) this.field5049, (byte) 20);
        }
        return arg0 >= -122 ? null : var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
    public static final void method2188(int arg0, int arg1) {
        class574.field7844 = 1;
        class111.field1339 = false;
        field5046++;
        class253.field3319 = arg0;
        class285.field3762 = null;
        class110.field1302 = -1;
        class174.field2461 = 0;
        class401.field5322 = arg1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static final void method2189(boolean arg0) {
        field5051++;
        class690.field9747 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static void method2190(byte arg0) {
        if (arg0 != 6) {
            method2190((byte) -75);
        }
        field5050 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBLio;)V")
    private final void method2191(int arg0, byte arg1, class157 arg2) {
        if (arg1 > -21) {
            return;
        }
        if (arg0 == 1) {
            this.field5049 = arg2.method963(-124);
        } else if (arg0 == 2) {
            this.field5053 = arg2.method930(255);
            this.field5044 = arg2.method930(255);
        }
        field5047++;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5050[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5050[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5050[var2] = (char) (var2 + 48 - 52);
        }
        field5050[63] = '/';
        field5050[62] = '+';
    }
}
