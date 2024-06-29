import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class213 extends class46 {

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "[S")
    public static short[] field3138 = new short[256];

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3137 = "flash3:";

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3136 = "wave:";

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field3141 = 0;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "Ldk;")
    public static class207 field3139;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method1493(boolean arg0) {
        field3138 = null;
        field3139 = null;
        if (!arg0) {
            field3137 = null;
            field3136 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V")
    public static final void method1494(int arg0, byte arg1, int arg2) {
        field3134++;
        class268 var3 = class288.method1970((byte) -43, arg2);
        int var4 = var3.field4299;
        if (arg1 != -30) {
            field3136 = null;
        }
        int var5 = var3.field4306;
        int var6 = var3.field4307;
        int var7 = class172.field2606[var6 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class110.method841(var5, arg1 ^ 0x9D, ~var8 & class303.field4900[var5] | arg0 << var4 & var8);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        if (arg0 != 15) {
            field3139 = null;
        }
        while (class92.field1488.method684(8, class162.field2510) >= 11) {
            int var1 = class92.field1488.method688((byte) 44, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class92.field1475[var1] == null) {
                var2 = true;
                class92.field1475[var1] = new class207();
                if (class287.field4598[var1] != null) {
                    class92.field1475[var1].method1468(class287.field4598[var1], -116);
                }
            }
            class162.field2518[class103.field1791++] = var1;
            class207 var3 = class92.field1475[var1];
            var3.field3749 = class199.field2930;
            int var4 = class288.field4608[class92.field1488.method688((byte) -106, 3)];
            if (var2) {
                var3.field3712 = var3.field3668 = var4;
            }
            int var5 = class92.field1488.method688((byte) -123, 5);
            int var6 = class92.field1488.method688((byte) -124, 1);
            int var7 = class92.field1488.method688((byte) -127, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class48.field670[class284.field4574++] = var1;
            }
            int var8 = class92.field1488.method688((byte) 53, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1466(field3139.field3686[0] + var8, field3139.field3761[0] + var5, var6 == 1, (byte) 46);
        }
        class92.field1488.method686(arg0 - 15);
        field3135++;
    }
}
