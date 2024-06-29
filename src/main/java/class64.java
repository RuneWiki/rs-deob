import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class64 extends class242 {

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Ljf;")
    public static class229 field1103 = class212.method1457((byte) 82, "Hidden)2");

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lni;")
    public static class24 field1099 = new class24(64);

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "S")
    public static short field1106 = 32767;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Ljf;")
    public static class229 field1114 = class212.method1457((byte) 69, "weiss:");

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Ljf;")
    public static class229 field1107 = class212.method1457((byte) 82, "Clientscript error in: ");

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Ljf;")
    private static class229 field1110 = class212.method1457((byte) 63, "flash3:");

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "Ljf;")
    public static class229 field1116 = field1110;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Ljf;")
    public static class229 field1109 = field1110;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Lek;")
    public static class185 field1113;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
    public static int[] field1115;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 4)
    public static final void method477(int arg0, int arg1) {
        class253 var2 = class301.field5117;
        synchronized (class301.field5117) {
            if (arg0 != 1) {
                method478(-87, -39, 40);
            }
            class293.field5020 = arg1;
        }
        field1101++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I", line = 20)
    public static final int method478(int arg0, int arg1, int arg2) {
        field1112++;
        int var3 = class223.method1536(arg1 - 1, arg2 - 1, true) + class223.method1536(arg1 + 1, arg2 + -1, true) + class223.method1536(arg1 + -1, arg2 + 1, true) + class223.method1536(arg1 + 1, arg2 - -1, true);
        int var4 = class223.method1536(arg1 - 1, arg2, true) + class223.method1536(arg1 + 1, arg2, true) - (-class223.method1536(arg1, arg2 - 1, true) + -class223.method1536(arg1, arg2 + 1, true));
        int var5 = class223.method1536(arg1, arg2, true);
        return arg0 == 0 ? var3 / 16 + var4 / 8 + (var5 / 4) : -103;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 42)
    public static void method479(int arg0) {
        field1114 = null;
        field1115 = null;
        if (arg0 != -6071) {
            return;
        }
        field1107 = null;
        field1103 = null;
        field1109 = null;
        field1116 = null;
        field1099 = null;
        field1110 = null;
        field1113 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 66)
    public static final void method480(int arg0) {
        field1104++;
        for (int var1 = 0; var1 < class325.field5479; var1++) {
            class128 var2 = class301.method2062((byte) 122, var1);
            if (var2 != null && var2.field2283 == 0) {
                class28.field497[var1] = 0;
                class286.field4908[var1] = 0;
            }
        }
        int var3 = -53 % ((arg0 + 12) / 53);
        class298.field5082 = new class268(16);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZ)Z", line = 125)
    public final boolean method481(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1103 = (class229) null;
        }
        field1098++;
        return arg0 >= this.field1102 && this.field1105 >= arg0 && arg1 >= this.field1100 && arg1 <= this.field1108;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIII)V", line = 140)
    public class64(int arg0, int arg1, int arg2, int arg3) {
        this.field1108 = arg3;
        this.field1100 = arg1;
        this.field1102 = arg0;
        this.field1105 = arg2;
    }
}
