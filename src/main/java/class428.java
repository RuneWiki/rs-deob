import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class428 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[S")
    public static short[] field6306 = new short[256];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)I", line = 3)
    public static final int method2650(int arg0, byte[] arg1, int arg2, int arg3) {
        field6305++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class111.field1536[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return var4 ^ arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 28)
    public static void method2651(byte arg0) {
        field6306 = null;
        if (arg0 <= 67) {
            method2652((String) null, false);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 38)
    public static final String method2652(String arg0, boolean arg1) {
        field6309++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class82.method507(124, arg0.charAt(var2))) {
            var2++;
        }
        if (arg1) {
            return null;
        }
        while (var3 > var2 && class82.method507(123, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class57.method376(var7, 116)) {
                char var8 = class413.method2586(114, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lhe;Le;IIIIII)Lgl;", line = 95)
    public static final class356 method2653(class208 arg0, class312 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6308++;
        class50.field603.field1622 = arg0 != null;
        class50.field603.field1626 = arg7;
        class50.field603.field1615 = arg3;
        class50.field603.field1623 = arg5;
        class50.field603.field1630 = arg6;
        class50.field603.field1621 = arg1.field4911;
        if (arg4 <= 46) {
            return null;
        } else {
            class50.field603.field1614 = arg2;
            return (class356) class110.field1528.method2468(46, class50.field603);
        }
    }
}
