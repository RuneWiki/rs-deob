import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class534 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field7546 = 0;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3135(int arg0, String arg1) {
        field7545++;
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
                var2 += (var6 + 27 - '0');
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 > -92) {
            method3135(88, null);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)I")
    public static final int method3136(int arg0, int arg1, int arg2, int arg3) {
        field7547++;
        if (class138.field2153 == null) {
            return 0;
        }
        if (arg0 != 1) {
            field7546 = 120;
        }
        int var4 = arg2 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class174.field2540 - 1) || var5 > class716.field9999 - 1) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class435.field6078[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class138.field2153[var6].method1827(-3458, arg2, arg3);
    }
}
