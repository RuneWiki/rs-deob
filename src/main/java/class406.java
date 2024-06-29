import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class406 extends class690 {

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public int field5228;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "Ldr;")
    public static class675 field5232 = new class675(49, 3);

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field5235 = 0;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2280(int arg0, int arg1, int arg2, int arg3) {
        field5233++;
        if (class394.field5023 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg1 - class604.field8128;
        int var7 = arg3 - class604.field8140;
        for (class79 var8 = (class79) class604.field8112.method1909(true); var8 != null; var8 = (class79) class604.field8112.method1916((byte) 101)) {
            if (var8.field1034 == arg0) {
                int var9 = var8.field1025;
                int var10 = var8.field1031;
                int var11 = class604.field8128 + var9 << 14 | class604.field8140 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        if (arg2 != -8306) {
            method2281(79, -81, (byte) 58);
        }
        return var4;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIB)Z", line = 55)
    public static final boolean method2281(int arg0, int arg1, byte arg2) {
        if (arg2 == -39) {
            field5234++;
            return class430.method2365(true, arg1, arg0) || class273.method1626((byte) -87, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Ljd;", line = 67)
    public final class216 method20(byte arg0) {
        field5229++;
        int var2 = -63 / ((arg0 + 27) / 42);
        return class256.field3285;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IIII)I", line = 77)
    public static final int method2282(int arg0, int arg1, int arg2, int arg3) {
        field5230++;
        if (arg2 != 2) {
            field5235 = -94;
        }
        if ((class234.field3033[arg3][arg0][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class234.field3033[1][arg0][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 95)
    public static void method2283(int arg0) {
        if (arg0 > -2) {
            field5232 = null;
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ltl;Lpd;IIIIIIIII)V", line = 105)
    public class406(class580 arg0, class241 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5231 = arg9;
        this.field5228 = arg10;
    }
}
