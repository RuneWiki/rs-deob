import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class135 extends class247 {

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/lang/String;")
    public String field1950;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field1949 = 0;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field1955 = -1;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lvl;")
    public static class73 field1948;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lvl;")
    public static class73 field1951;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lvl;")
    public static class73 field1954;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method857(int arg0, int arg1) {
        if (arg1 < 57) {
            field1955 = 61;
        }
        field1957++;
        class176.field2767.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZ)V")
    public static final void method858(int arg0, int arg1, boolean arg2) {
        field1952++;
        int var3 = class136.field1960 * arg0 >> 8;
        if (arg1 == -1 && !class229.field3542) {
            class256.method1818(1);
        } else if (arg1 != -1 && (class127.field1826 != arg1 || !class67.method438(104)) && var3 != 0 && !class229.field3542) {
            class176.method1259(1, arg1, 2, 0, class77.field1177, var3, false);
        }
        if (!arg2) {
            method861(-100);
        }
        class127.field1826 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static final void method859(byte arg0) {
        if (class239.field3841.toLowerCase().indexOf("microsoft") == -1) {
            class18.field244[45] = 26;
            class18.field244[46] = 72;
            class18.field244[93] = 43;
            if (class239.field3849 == null) {
                class18.field244[192] = 58;
                class18.field244[222] = 59;
            } else {
                class18.field244[222] = 58;
                class18.field244[192] = 28;
                class18.field244[520] = 59;
            }
            class18.field244[61] = 27;
            class18.field244[59] = 57;
            class18.field244[44] = 71;
            class18.field244[47] = 73;
            class18.field244[92] = 74;
            class18.field244[91] = 42;
        } else {
            class18.field244[222] = 59;
            class18.field244[189] = 26;
            class18.field244[186] = 57;
            class18.field244[223] = 28;
            class18.field244[188] = 71;
            class18.field244[190] = 72;
            class18.field244[220] = 74;
            class18.field244[187] = 27;
            class18.field244[221] = 43;
            class18.field244[192] = 58;
            class18.field244[191] = 73;
            class18.field244[219] = 42;
        }
        if (arg0 != 123) {
            field1951 = null;
        }
        field1953++;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class135() {
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)Lca;")
    public static final class91 method860(byte arg0) {
        field1947++;
        if (arg0 == -95) {
            class91 var1 = new class91(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], class190.field2959[0], class229.field3539);
            class115.method762((byte) -93);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static void method861(int arg0) {
        field1951 = null;
        if (arg0 != 189) {
            method860((byte) 15);
        }
        field1948 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class135(String arg0) {
        this.field1950 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBLvl;)Z")
    public static final boolean method862(int arg0, int arg1, byte arg2, class73 arg3) {
        field1956++;
        byte[] var4 = arg3.method501(-2, arg1, arg0);
        int var5 = -123 / ((arg2 - 25) / 63);
        if (var4 == null) {
            return false;
        } else {
            class55.method360(true, var4);
            return true;
        }
    }
}
