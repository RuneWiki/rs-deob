import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class98 {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/lang/String;")
    public String field1379;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Ljava/lang/String;")
    public String field1380;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Ljava/lang/String;")
    public String field1382;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1374 = -2;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Len;")
    public static class290 field1375 = new class290("", 10);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
    public static int[] field1381 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Llf;")
    public static class215 field1378;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 8)
    public static void method715(byte arg0) {
        int var1 = -67 / ((arg0 - 51) / 49);
        field1381 = null;
        field1378 = null;
        field1375 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBZZI)I", line = 21)
    public static final int method716(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg1 <= 8) {
            field1378 = null;
        }
        field1376++;
        class373 var5 = class687.method3877(arg0, arg3, 116);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field5021.length; var7++) {
            if (var5.field5021[var7] >= 0 && class599.field8366.field9974 > var5.field5021[var7]) {
                class661 var8 = class599.field8366.method3949(0, var5.field5021[var7]);
                int var9 = var8.method3729(-109, class71.field952.method1977((byte) 58, arg4).field6697, arg4);
                if (arg2) {
                    var6 += var5.field5020[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;IZZ)Z", line = 63)
    public static final boolean method717(String arg0, int arg1, boolean arg2, boolean arg3) {
        field1377++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = arg2;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 146)
    public class98(String arg0, String arg1, String arg2) {
        this.field1379 = arg2;
        this.field1380 = arg0;
        this.field1382 = arg1;
    }
}
