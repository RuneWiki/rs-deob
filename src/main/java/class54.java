import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class54 extends class217 {

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Z")
    public volatile boolean field1054 = true;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[[B")
    public static byte[][] field1048 = new byte[250][];

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Llc;")
    private static class143 field1046 = class66.method374("M", -1);

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Llc;")
    public static class143 field1049 = field1046;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Llc;")
    public static class143 field1045 = field1046;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lgf;")
    public static class7 field1047;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Z")
    public boolean field1052;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Z")
    public boolean field1056;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method325(byte arg0) {
        field1048 = null;
        field1049 = null;
        field1045 = null;
        if (arg0 <= 70) {
            field1046 = null;
        }
        field1046 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)[B")
    public abstract byte[] method326(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method327(int arg0, int arg1, int arg2) {
        field1055++;
        class166 var3 = class262.method1746(112, arg2, 12);
        if (arg1 == 0) {
            var3.method1097((byte) -74);
            var3.field2978 = arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)I")
    public static final int method328(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field1047 = null;
        }
        long var2 = class205.method1403(-40);
        field1057++;
        for (class208 var4 = arg1 ? (class208) class55.field1062.method1818(false) : (class208) class55.field1062.method1834((byte) -89); var4 != null; var4 = (class208) class55.field1062.method1834((byte) 106)) {
            if (var2 > (var4.field3820 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3820 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1162;
                    class148.field2691[var5] = class145.field2603[var5];
                    var4.method349(arg0);
                    return var5;
                }
                var4.method349(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILgf;)V")
    public static final void method329(int arg0, class7 arg1) {
        class149.field2744 = arg1.method55(-1, class3.field42);
        class247.field4443 = arg1.method55(-1, class88.field1595);
        field1051++;
        if (arg0 <= 57) {
            method329(31, (class7) null);
        }
        class155.field2799 = arg1.method55(-1, class35.field604);
        class126.field2229 = arg1.method55(-1, class227.field4098);
        class192.field3529 = arg1.method55(-1, class137.field2407);
        class115.field2019 = arg1.method55(-1, class5.field82);
        class267.field4791 = arg1.method55(-1, class178.field3183);
        class225.field4076 = arg1.method55(-1, class89.field1619);
        class36.field628 = arg1.method55(-1, class67.field1265);
        class158.field2860 = arg1.method55(-1, class95.field1751);
        class287.field5042 = arg1.method55(-1, class59.field1131);
        class248.field4459 = arg1.method55(-1, class268.field4800);
        class35.field611 = arg1.method55(-1, class129.field2296);
        class17.field291 = arg1.method55(-1, class162.field2919);
        class80.field1449 = arg1.method55(-1, class179.field3201);
        class68.field1296 = arg1.method55(-1, class191.field3505);
        class265.field4768 = arg1.method55(-1, class184.field3335);
        class137.field2404 = arg1.method55(-1, class190.field3490);
        class229.field4193 = arg1.method55(-1, class114.field2014);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)I")
    public abstract int method330(int arg0);
}
