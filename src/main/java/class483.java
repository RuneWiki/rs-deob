import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class483 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static final void method2630(byte arg0) {
        field5998++;
        if (arg0 >= -87) {
            method2630((byte) 15);
        }
        int var1 = class149.field1788;
        int[] var2 = class95.field1239;
        for (int var3 = 0; var3 < var1; var3++) {
            class365 var9 = class132.field1601[var2[var3]];
            if (var9 != null && var9.field485 > 0) {
                var9.field485--;
                if (var9.field485 == 0) {
                    var9.field494 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class99.field1276; var4++) {
            long var5 = (long) class352.field4562[var4];
            class704 var7 = (class704) class168.field1973.method3828(var5, (byte) -91);
            if (var7 != null) {
                class506 var8 = var7.field9854;
                if (var8.field485 > 0) {
                    var8.field485--;
                    if (var8.field485 == 0) {
                        var8.field494 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)I")
    public static final int method2631(boolean arg0, int arg1) {
        field5999++;
        if (arg0) {
            return arg1 == 16711935 ? -1 : class211.method1238(false, arg1);
        } else {
            return 23;
        }
    }
}
