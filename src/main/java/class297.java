import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class297 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
    public static int[] field4690 = new int[14];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
    public static boolean field4695 = true;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "J")
    public static volatile long field4692 = 0L;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)J", line = 20)
    public static final long method2117(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null || var3.field3347 == null ? 0L : var3.field3347.field1729;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 28)
    public static void method2118(int arg0) {
        if (arg0 <= -20) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILak;)V", line = 38)
    public static final void method2119(int arg0, class172 arg1) {
        field4693++;
        if (arg0 != 2059) {
            method2119(-69, (class172) null);
        }
        class291.field4649 = arg1;
        class36.field479 = class291.field4649.method1299(4, (byte) 55);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(CB)Z", line = 59)
    public static final boolean method2120(char arg0, byte arg1) {
        field4691++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg1 >= -70) {
            field4694 = -28;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class7.field102;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjj;)V", line = 98)
    public static final void method2121(byte arg0, class44 arg1) {
        if (arg0 <= 65) {
            return;
        }
        for (int var2 = 0; var2 < class24.field334; var2++) {
            int var3 = arg1.method281(-60);
            int var4 = arg1.method271(21081);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class280.field4515[var3] != null) {
                class280.field4515[var3].field466 = var4;
            }
        }
        field4696++;
    }
}
