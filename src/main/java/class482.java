import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class482 extends class665 {

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public int field6708;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field6703 = 0;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lec;", line = 6)
    public static final class213 method2725(byte arg0) {
        field6706++;
        if (arg0 >= -101) {
            field6703 = -92;
        }
        return class148.field2178;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljr;I)Lhu;", line = 17)
    public static final class117 method2726(class96 arg0, int arg1) {
        if (arg1 >= -1) {
            return null;
        } else {
            field6707++;
            return new class117(arg0.method722(4), arg0.method722(4), arg0.method722(4), arg0.method722(4), arg0.method736(-121), arg0.method736(-119), arg0.method718(-73));
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/lang/String;)J", line = 37)
    public static final long method2727(int arg0, String arg1) {
        field6704++;
        long var2 = 0L;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg0 != 12544) {
            method2726(null, 24);
        }
        while (var4 > var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (27 - (48 - var6));
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBLjava/lang/String;ILjava/lang/String;Z)V", line = 83)
    public static final void method2728(boolean arg0, int arg1, byte arg2, String arg3, int arg4, String arg5, boolean arg6) {
        field6705++;
        class389.field5462.field1844 = 1;
        String var7 = arg3.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg4 != -1) {
            class374 var11 = class324.field4784.method2171((byte) -80, arg4);
            if (var11 == null || var11.method2182(115) != arg6) {
                return;
            }
            if (var11.method2182(115)) {
                var10 = var11.field5301;
            } else {
                var9 = var11.field5300;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class648.field9184.field7533; var13++) {
            class257 var16 = class648.field9184.method3064(var13, -108);
            if ((!arg0 || var16.field3617) && var16.field3648 == -1 && var16.field3670 == -1 && var16.field3624 == 0 && var16.field3655.toLowerCase().indexOf(var7) != -1) {
                if (arg4 != -1) {
                    if (arg6) {
                        if (!arg5.equals(var16.method1586(arg4, -14419, var10))) {
                            continue;
                        }
                    } else if (arg1 != var16.method1580(false, arg4, var9)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class264.field3738 = null;
                    class233.field3311 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class362.field5171 = 0;
        class264.field3738 = var8;
        class233.field3311 = var12;
        String[] var14 = new String[class233.field3311];
        if (arg2 != -50) {
            return;
        }
        for (int var15 = 0; var15 < class233.field3311; var15++) {
            var14[var15] = class648.field9184.method3064(var8[var15], -65).field3655;
        }
        class250.method1544(class264.field3738, true, var14);
        class389.field5462.method918(true);
        class389.field5462.field1844 = 2;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(I)V", line = 195)
    public class482(int arg0) {
        this.field6708 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2244(byte arg0);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Z")
    public abstract boolean method2245(byte arg0);
}
