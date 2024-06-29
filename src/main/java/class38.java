import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Ltq;")
    public static class572 field417 = new class572(16);

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method201(int arg0, int arg1, int arg2) {
        field418++;
        if (!class215.field2615) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class271.field3434[var3] == null || class271.field3434[var3][var4] == null) {
            return false;
        }
        if (arg1 < 79) {
            field420 = -55;
        }
        class382 var5 = class271.field3434[var3][var4];
        if (arg2 == -1 && var5.field5112 == 0) {
            for (class208 var6 = (class208) class530.field7597.method3174((byte) 49); var6 != null; var6 = (class208) class530.field7597.method3168(false)) {
                if (var6.field2527 == 20 || var6.field2527 == 1002 || var6.field2527 == 50 || var6.field2527 == 2 || var6.field2527 == 19) {
                    for (class382 var7 = class505.method2903(var6.field2523, 65535); var7 != null; var7 = class508.method2917(var7, (byte) -28)) {
                        if (var5.field5055 == var7.field5055) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class208 var8 = (class208) class530.field7597.method3174((byte) 49); var8 != null; var8 = (class208) class530.field7597.method3168(false)) {
                if (var8.field2533 == arg2 && var5.field5055 == var8.field2523 && (var8.field2527 == 20 || var8.field2527 == 1002 || var8.field2527 == 50 || var8.field2527 == 2 || var8.field2527 == 19)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 74)
    public static void method202(byte arg0) {
        if (arg0 >= -53) {
            method202((byte) -30);
        }
        field417 = null;
    }
}
