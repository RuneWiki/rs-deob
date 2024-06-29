import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class531 {

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Z")
    public static boolean field7753 = false;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "B")
    public byte field7750;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field7756;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Ljava/lang/String;")
    public String field7754;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Ljava/lang/String;")
    public String field7755;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Ljava/lang/String;")
    public String field7757;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Ljava/lang/String;")
    public String field7758;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Lrg;")
    public static final class457 method3144(int arg0, int arg1) {
        field7752++;
        class457 var2 = (class457) class78.field1135.method232(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class491.field7054.method2536(arg0, arg1, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class457 var4 = class500.method2964(var3, -6);
            class78.field1135.method231(var4, (long) arg0, -92);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3145(String arg0, int arg1) {
        field7749++;
        if (arg0 == null) {
            return;
        }
        int var2 = -60 / ((-arg1 - 55) / 35);
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var3 = class38.method286(arg0, true);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class327.field4923; var4++) {
            String var5 = class257.field3933[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class38.method286(var5, true);
            if (var6 != null && var6.equals(var3)) {
                class327.field4923--;
                for (int var7 = var4; var7 < class327.field4923; var7++) {
                    class257.field3933[var7] = class257.field3933[var7 + 1];
                    class93.field1318[var7] = class93.field1318[var7 + 1];
                    class210.field3435[var7] = class210.field3435[var7 + 1];
                    class436.field6442[var7] = class436.field6442[var7 + 1];
                    class426.field6348[var7] = class426.field6348[var7 + 1];
                }
                class327.field4925++;
                class534.field7856 = class152.field2263;
                class74.method640(-29627, class309.field4657);
                class71.field1020.method1545(class4.method10(arg0, 77), -83);
                class71.field1020.method1534(arg0, false);
                return;
            }
        }
    }
}
