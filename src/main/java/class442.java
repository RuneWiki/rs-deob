import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class442 {

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Luf;")
    public static class445 field6159 = new class445();

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field6163 = 0;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public int field6161;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Ljava/lang/String;")
    public String field6162;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lwk;IIB)J", line = 3)
    public static final long method2652(class141 arg0, int arg1, int arg2, byte arg3) {
        field6160++;
        if (arg3 >= -56) {
            return -18L;
        }
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class414 var8 = class66.field1181.method131(2, arg0.method1109((byte) -94));
        long var9 = (long) (arg0.method1112((byte) -127) | 0x10000 << 14 | arg2 << 7 | arg1 | arg0.method1111(false) << 20);
        if (var8.field5737 == 0) {
            var9 |= var6;
        }
        if (var8.field5750 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg0.method1109((byte) 72) << 32;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lmf;", line = 34)
    public static final class416 method2653(int arg0, int arg1, int arg2) {
        if (class390.field5454[arg0][arg1][arg2] == null) {
            boolean var3 = class390.field5454[0][arg1][arg2] != null && class390.field5454[0][arg1][arg2].field5834 != null;
            if (var3 && arg0 >= class749.field10470 - 1) {
                return null;
            }
            class467.method2836(arg0, arg1, arg2);
        }
        return class390.field5454[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 48)
    public static final String method2654(String arg0, String arg1, int arg2, String arg3) {
        field6158++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, var4 + arg3.length())) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg0.length() + var4);
        }
        if (arg2 != -1) {
            field6163 = 122;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V", line = 71)
    public static void method2655(boolean arg0) {
        if (!arg0) {
            field6163 = -64;
        }
        field6159 = null;
    }
}
