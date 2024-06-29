import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class177 extends class176 {

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Z")
    public static boolean field2610 = true;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field2611 = 0;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field2612 = 0;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Lrk;")
    public static class427 field2616;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method1320(int arg0) {
        if (arg0 != -1) {
            method1322(80, (String) null);
        }
        field2616 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
    public static final int method1321(int arg0, int arg1) {
        field2608++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 != 0) {
            return -28;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1322(int arg0, String arg1) {
        field2614++;
        if (arg1 == null) {
            return;
        }
        String var2 = class39.method385(arg0, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class123.field1724; var3++) {
            String var4 = class39.method385(-1, class87.field1294[var3]);
            if (var4 != null && var4.equals(var2)) {
                class123.field1724--;
                for (int var5 = var3; var5 < class123.field1724; var5++) {
                    class87.field1294[var5] = class87.field1294[var5 + 1];
                    class186.field2695[var5] = class186.field2695[var5 + 1];
                    class127.field1795[var5] = class127.field1795[var5 + 1];
                    class172.field2523[var5] = class172.field2523[var5 + 1];
                    class107.field1574[var5] = class107.field1574[var5 + 1];
                    class314.field4246[var5] = class314.field4246[var5 + 1];
                }
                class165.field2431 = class387.field5445;
                class273.field3668++;
                class355.field4828.method1801(34, (byte) -56);
                class355.field4828.method1824(arg0 + 79, class408.method2528(arg0 ^ 0x5B, arg1));
                class355.field4828.method1827(0, arg1);
                return;
            }
        }
    }
}
