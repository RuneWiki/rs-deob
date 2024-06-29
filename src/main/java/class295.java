import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class295 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    public static int[] field4583 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2127(int arg0, int arg1) {
        class138 var2 = class149.method1242(arg0, arg1 ^ arg1, 3);
        var2.method1152(125);
        field4582++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 17)
    public static final boolean method2128(boolean arg0, String arg1) {
        if (!arg0) {
            field4578 = -91;
        }
        field4584++;
        return class4.method33(true, (byte) -57, 10, arg1);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V", line = 30)
    public static final void method2129(int arg0, int arg1, byte arg2) {
        if (class93.field1424 != arg1) {
            class347.field5515 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class347.field5515[var3] = (var3 << 12) / arg1;
            }
            class212.field3338 = arg1 * 32;
            class313.field4848 = arg1 - 1;
            class93.field1424 = arg1;
        }
        if (arg2 > -124) {
            field4578 = 82;
        }
        field4581++;
        if (class181.field2836 == arg0) {
            return;
        }
        if (class93.field1424 == arg0) {
            class135.field2257 = class347.field5515;
        } else {
            class135.field2257 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class135.field2257[var4] = (var4 << 12) / arg0;
            }
        }
        class280.field4324 = arg0 - 1;
        class181.field2836 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lug;I)V", line = 82)
    public static final void method2130(class25 arg0, int arg1) {
        for (int var2 = 0; var2 < class108.field1627; var2++) {
            int var3 = arg0.method270(false);
            int var4 = arg0.method314((byte) 93);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class85.field1217[var3] != null) {
                class85.field1217[var3].field5221 = var4;
            }
        }
        if (arg1 != -3438) {
            field4583 = (int[]) null;
        }
        field4579++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 111)
    public static final void method2131(String arg0, int arg1, int arg2) {
        class138 var3 = class149.method1242(arg1, arg2 + 1, 2);
        if (arg2 != -1) {
            method2128(true, (String) null);
        }
        var3.method1153((byte) 50);
        field4580++;
        var3.field2291 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 132)
    public static void method2132(boolean arg0) {
        field4583 = null;
        if (!arg0) {
            field4583 = (int[]) null;
        }
    }
}
