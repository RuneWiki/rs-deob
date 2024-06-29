import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class255 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    public static int[] field3460 = new int[1000];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
    public static int[] field3462 = new int[64];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Ltc;")
    public static class477 field3465;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZI)Ljava/lang/String;", line = 5)
    public static final String method1609(int arg0, int arg1, boolean arg2, int arg3) {
        field3464++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            int var7 = var4 - 1;
            if (arg0 >= -111) {
                field3465 = null;
            }
            while (var7 > 0) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
                var7--;
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 56)
    public static void method1610(boolean arg0) {
        field3460 = null;
        if (!arg0) {
            method1609(-50, 121, false, 121);
        }
        field3462 = null;
        field3465 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwk;B)I", line = 68)
    public static final int method1611(class227 arg0, byte arg1) {
        field3463++;
        if (arg0.field2946 == 0) {
            return 0;
        }
        if (arg0.field3001 != -1) {
            class227 var2 = null;
            if (arg0.field3001 < 32768) {
                class234 var3 = (class234) class505.field6640.method39((long) arg0.field3001, 31750);
                if (var3 != null) {
                    var2 = var3.field3131;
                }
            } else if (arg0.field3001 >= 32768) {
                var2 = class592.field8019[arg0.field3001 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field506 - var2.field506;
                int var5 = arg0.field503 - var2.field503;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1429((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) -84);
                }
            }
        }
        if (arg0 instanceof class193) {
            class193 var6 = (class193) arg0;
            if (var6.field2506 != -1 && (var6.field3038 == 0 || var6.field3036 > 0)) {
                var6.method1429(var6.field2506, (byte) -84);
                var6.field2506 = -1;
            }
        } else if (arg0 instanceof class532) {
            class532 var7 = (class532) arg0;
            if (var7.field6931 != -1 && (var7.field3038 == 0 || var7.field3036 > 0)) {
                int var8 = var7.field506 - (var7.field6931 - class100.field1326 - class100.field1326) * 256;
                int var9 = var7.field503 - ((var7.field6911 - class186.field2376 - class186.field2376) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method1429((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, (byte) -84);
                }
                var7.field6931 = -1;
            }
        }
        int var10 = 4 % ((arg1 - 60) / 50);
        return arg0.method1427(false);
    }
}
