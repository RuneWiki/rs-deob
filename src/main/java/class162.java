import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class162 extends class786 {

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field2382 = -1;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
    public static boolean field2385 = false;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lffa;")
    public static class195 field2384;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Ljava/lang/String;")
    public String field2386;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Ljava/lang/String;")
    public String field2387;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field2384 = null;
        if (arg0 > -116) {
            method1273(-47, 2, 2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z")
    public static final boolean method1273(int arg0, int arg1, int arg2) {
        ++field2378;
        if (arg1 != -5913) {
            field2385 = false;
        }
        return (arg2 & 540800) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Lak;")
    public final class367 method1274(byte arg0) {
        ++field2381;
        return arg0 != -120 ? null : class10.field228[super.field10804];
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)S")
    public static final short method1275(int arg0, int arg1) {
        if (arg0 != 16287) {
            field2384 = null;
        }
        ++field2383;
        int var2 = arg1 >> 10 & 63;
        int var3 = 112 & arg1 >> 3;
        int var4 = 127 & arg1;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 - -var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILli;IIIILli;III)V")
    public static final void method1276(int arg0, class449 arg1, int arg2, int arg3, int arg4, int arg5, class449 arg6, int arg7, int arg8, int arg9) {
        ++field2379;
        int var10 = arg6.method2688(-26473);
        if (~var10 != 0) {
            Object var11 = null;
            class112 var12 = (class112) class626.field8831.method2373((long) var10, 103);
            if (var12 == null) {
                class625[] var13 = class625.method3579(class491.field6972, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class638.field8979.method482(var13[0], true);
                class626.field8831.method2362(var12, 0, (long) var10);
            }
            class785.method4302(arg7 >> 1, (byte) -93, arg9, arg1.method2692((byte) -124) * 256, arg0, arg1.field7718, arg1.field7710, arg4 >> 1, 0, arg1.field7719);
            if (arg3 >= -74) {
                method1276(-113, (class449) null, 17, 54, -51, -95, (class449) null, 99, -100, 83);
            }
            int var14 = arg2 + -18 + class632.field8926[0];
            int var15 = class632.field8926[1] + -54 + arg5 - 16;
            int var16 = arg8 / 4 * 18 + var14;
            int var17 = arg8 % 4 * 18 + var15;
            var12.method785(var16, var17);
            if (arg1 == arg6) {
                class638.field8979.method467(var17 + -1, 18, (byte) 127, 18, -256, var16 + -1);
            }
            class651.method3726(var17 - 1, 36, var17 - -18, var16 + -1, var16 - -18);
            class758 var18 = class146.method1004((byte) -93);
            var18.field10464 = var17;
            var18.field10468 = arg6;
            var18.field10463 = var17 + 16;
            var18.field10460 = var16 - -16;
            var18.field10466 = var16;
            class633.field8933.method2026((byte) 51, var18);
        }
    }
}
