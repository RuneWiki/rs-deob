import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class109 extends class130 {

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
    public String field1640;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public static final void method853(int arg0, byte arg1) {
        field1644++;
        int var2 = 80 % ((arg1 + 38) / 56);
        class188 var3 = class10.method48((byte) 118, 4, arg0);
        var3.method1306(-23128);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILfh;)V")
    public static final void method854(int arg0, class194 arg1) {
        field1642++;
        if ((arg1.field2973.length - arg1.field2982) < 1) {
            return;
        }
        int var2 = arg1.method1337((byte) 45);
        if (var2 < 0 || var2 > 1 || (arg1.field2973.length - arg1.field2982) < 2) {
            return;
        }
        int var3 = arg1.method1396(-107);
        if (arg0 != 1) {
            method854(-28, null);
        }
        if (arg1.field2973.length - arg1.field2982 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method1396(40);
            int var6 = arg1.method1401(123);
            if (var5 < class395.field5835.length && class541.field7914[var5] && (class50.field774.method2854(var5, (byte) -122).field2858 != '1' || var6 >= -1 && var6 <= 1)) {
                class395.field5835[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class109() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class109(String arg0) {
        this.field1640 = arg0;
    }
}
