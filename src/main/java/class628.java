import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class628 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lvl;")
    public static class15 field8732 = new class15(36, 3);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method3528(int arg0, int arg1, int arg2, int arg3) {
        field8731++;
        if (class678.field9440 == arg3 && class666.field9267 == arg0 && class335.field4519 == arg2) {
            return;
        }
        class666.field9267 = arg0;
        class335.field4519 = arg2;
        class678.field9440 = arg3;
        class180.field2828 = true;
        double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class662.field9202 = var12;
        if (arg1 != -1496) {
            method3531((byte) 118, -84);
        }
        class759.field10459 = var10;
        class87.field1204 = var8;
        class648.field8967 = var14;
        class668.field9292 = var8 * var12;
        class787.field10797 = 0.0D;
        class7.field157 = var10 * var14;
        class37.field633 = -var8 * var14;
        class189.field2915 = -var10 * var12;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method3529(int arg0, int arg1, int arg2) {
        field8730++;
        class445 var3 = class414.field5670.method2319(arg2, false);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg1 <= 53) {
            method3530(114, 28, -50, -19, -107, 115, 14, -6, 65, 42, (byte) 32, 123);
        }
        return var3.method2584(19502, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIIIIBI)V", line = 89)
    public static final void method3530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        field8733++;
        if (arg10 != -49) {
            method3531((byte) -116, -32);
        }
        if (!class659.method3706(104, arg2)) {
            return;
        }
        if (class79.field1113[arg2] == null) {
            client.method2007(class431.field5870[arg2], -1, arg0, arg8, arg5, arg11, arg6, arg9, arg7, arg4, arg1, arg3);
        } else {
            client.method2007(class79.field1113[arg2], -1, arg0, arg8, arg5, arg11, arg6, arg9, arg7, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)I", line = 110)
    public static final int method3531(byte arg0, int arg1) {
        field8729++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else {
            int var2 = 120 / ((-arg0 - 38) / 48);
            if (arg1 == 6406 || arg1 == 34844) {
                return 6406;
            } else if (arg1 == 6409 || arg1 == 34846) {
                return 6409;
            } else if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 143)
    public static void method3532(byte arg0) {
        int var1 = -74 / ((-arg0 - 1) / 59);
        field8732 = null;
    }
}
