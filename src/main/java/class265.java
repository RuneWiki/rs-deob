import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class265 {

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "Z")
    public static boolean field3797 = false;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "F")
    public static float field3790 = 0.25F;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "Z")
    public static boolean field3796;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ll;IB[I)V")
    public static final void method1748(class639 arg0, int arg1, byte arg2, int[] arg3) {
        if (arg0.field4564 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field4564.length; var5++) {
                if (arg0.field4564[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field4545 != -1) {
                class131 var6 = class610.field8698.method2999(arg0.field4545, false);
                int var7 = var6.field1806;
                if (var7 == 1) {
                    arg0.field4535 = arg1;
                    arg0.field4605 = 0;
                    arg0.field4616 = 1;
                    arg0.field4597 = 0;
                    arg0.field4551 = 0;
                    if (!arg0.field4612) {
                        class701.method3941(arg0.field4605, var6, (byte) 101, arg0);
                    }
                }
                if (var7 == 2) {
                    arg0.field4597 = 0;
                }
            }
        }
        field3798++;
        if (arg2 >= -40) {
            method1748(null, -30, (byte) 77, null);
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field4564 == null || arg0.field4564[var9] == -1 || class610.field8698.method2999(arg3[var9], false).field1784 >= class610.field8698.method2999(arg0.field4564[var9], false).field1784) {
                arg0.field4564 = arg3;
                arg0.field4535 = arg1;
                break;
            }
        }
        if (var8) {
            arg0.field4535 = arg1;
            arg0.field4564 = arg3;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1749(String arg0, byte arg1) {
        field3792++;
        if (arg1 != -125) {
            field3791 = 5;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var9 + 10 - (97 - var10);
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 - 55;
                }
                if (var11 != 0 && class443.method2703((byte) var11, -106)) {
                    var2.append(class520.method3162(-19480, (byte) var11));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)V")
    public static final void method1750(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        if (var3 != null) {
            class502.method3061(var3.field5422);
            if (var3.field5422 != null) {
                var3.field5422 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Llia;)V")
    public static final void method1751(class187 arg0) {
        if (class5.field56 >= 65535) {
            return;
        }
        class40 var1 = arg0.field2630;
        class62.field1000[class5.field56] = arg0;
        class714.field10080[class5.field56] = false;
        class5.field56++;
        int var2 = arg0.field2627;
        if (arg0.field2628) {
            var2 = 0;
        }
        int var3 = arg0.field2627;
        if (arg0.field2612) {
            var3 = class433.field6202 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method427(-1) + class231.field3477 - var1.method425((byte) 75) >> class639.field9095;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method427(-1) + var1.method425((byte) 95) - class231.field3477 >> class639.field9095;
            if (var7 >= class408.field5806) {
                var7 = class408.field5806 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2621[var5++];
                int var10 = (var1.method422((byte) -85) + class231.field3477 - var1.method425((byte) 95) >> class639.field9095) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class439.field6264) {
                    var11 = class439.field6264 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class72.field1096[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class72.field1096[var4][var12][var8] = var13 | (long) class5.field56;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class72.field1096[var4][var12][var8] = var13 | (long) class5.field56 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class72.field1096[var4][var12][var8] = var13 | (long) class5.field56 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class72.field1096[var4][var12][var8] = var13 | (long) class5.field56 << 48;
                    }
                }
            }
        }
    }
}
