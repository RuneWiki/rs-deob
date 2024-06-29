import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class285 extends class129 {

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lfg;")
    public class71 field4514;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field4509 = 500;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
    public static boolean field4510 = false;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
    public static final void method1901(boolean arg0, boolean arg1) {
        field4515++;
        if (!arg0) {
            field4509 = -54;
        }
        if (class280.field4461 != arg1) {
            class280.field4461 = arg1;
            class227.method1525((byte) -110);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Ldl;")
    public static final class46 method1902(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            return null;
        }
        field4511++;
        class46 var3 = class108.method760(-29533, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field785 == null || var3.field785.length <= arg1) {
            return null;
        } else {
            return var3.field785[arg1];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method1903(String[] arg0, boolean arg1) {
        field4512++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1) {
            field4510 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1904(String arg0, byte arg1) {
        if (arg1 < 12) {
            field4509 = 27;
        }
        field4516++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)V")
    public static final void method1905(int arg0, long arg1) {
        field4508++;
        if (arg1 == 0L || arg0 <= 117) {
            return;
        }
        for (int var3 = 0; var3 < class90.field1589; var3++) {
            if (class237.field3906[var3] == arg1) {
                class90.field1589--;
                for (int var4 = var3; var4 < class90.field1589; var4++) {
                    class237.field3906[var4] = class237.field3906[var4 + 1];
                    class155.field2598[var4] = class155.field2598[var4 + 1];
                    class188.field3046[var4] = class188.field3046[var4 + 1];
                }
                class39.field587++;
                class63.field1093 = class222.field3746;
                class168.field2778.method199(178, 126);
                class168.field2778.method640(21691, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lfg;)V")
    public class285(class71 arg0) {
        this.field4514 = arg0;
    }
}
