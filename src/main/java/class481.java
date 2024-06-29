import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class481 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Z")
    public static boolean field6947 = true;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field6949 = -1;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)J", line = 4)
    public static final long method2911(int arg0, String arg1) {
        if (arg0 != 37) {
            field6947 = false;
        }
        field6950++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 52)
    public static final void method2912(byte arg0) {
        if (class187.field3121 < 0) {
            class505.field7362 = -1;
            class187.field3121 = 0;
            class120.field1849 = -1;
        }
        field6948++;
        if (class187.field3121 > class729.field10221) {
            class187.field3121 = class729.field10221;
            class505.field7362 = -1;
            class120.field1849 = -1;
        }
        if (class271.field4161 < 0) {
            class271.field4161 = 0;
            class505.field7362 = -1;
            class120.field1849 = -1;
        }
        if (class729.field10226 < class271.field4161) {
            class120.field1849 = -1;
            class271.field4161 = class729.field10226;
            class505.field7362 = -1;
        }
        if (arg0 < 0) {
            field6947 = true;
        }
    }
}
