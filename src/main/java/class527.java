import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class527 extends class508 {

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field7131 = 0;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "Z")
    public static boolean field7136 = false;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lqj;IIII)Lar;", line = 3)
    public static final class4 method2863(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        field7134++;
        if (arg4 != 34037) {
            return null;
        } else if (!arg0.field7586 && (!class4.method36(arg3, (byte) 98) || !class4.method36(arg2, (byte) 98))) {
            return arg0.field7540 ? new class4(arg0, 34037, arg1, arg3, arg2) : new class4(arg0, arg1, arg3, arg2, class391.method2101(arg3, 128), class391.method2101(arg2, 128));
        } else {
            return new class4(arg0, 3553, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BIIII)V", line = 24)
    public static final void method2864(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7133++;
        int var5 = 0;
        if (arg0 != 82) {
            field7136 = false;
        }
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class605.method3315(arg3 + arg1, 4095, class263.field3294, class314.field4052);
        int var10 = class605.method3315(arg3 - arg1, 4095, class263.field3294, class314.field4052);
        class57.method362(var10, class550.field7650[arg2], arg4, var9, -113);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class289.field3595 <= var12 && class159.field2063 >= var11) {
                    int var13 = class605.method3315(arg3 + var5, 4095, class263.field3294, class314.field4052);
                    int var14 = class605.method3315(arg3 - var5, 4095, class263.field3294, class314.field4052);
                    if (var12 <= class159.field2063) {
                        class57.method362(var14, class550.field7650[var12], arg4, var13, arg0 ^ 0xFFFFFFC3);
                    }
                    if (class289.field3595 <= var11) {
                        class57.method362(var14, class550.field7650[var11], arg4, var13, 45);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class289.field3595 <= var16 && class159.field2063 >= var15) {
                int var17 = class605.method3315(arg3 + var6, 4095, class263.field3294, class314.field4052);
                int var18 = class605.method3315(arg3 - var6, 4095, class263.field3294, class314.field4052);
                if (var16 <= class159.field2063) {
                    class57.method362(var18, class550.field7650[var16], arg4, var17, arg0 + 11);
                }
                if (class289.field3595 <= var15) {
                    class57.method362(var18, class550.field7650[var15], arg4, var17, 34);
                }
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Les;I)V", line = 98)
    public final void method2865(class630 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                field7132++;
                if (arg1 >= -19) {
                    method2864((byte) 91, 62, 125, 126, -74);
                    return;
                }
                return;
            }
            this.method2866(arg0, 106, var3);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Les;II)V", line = 128)
    private final void method2866(class630 arg0, int arg1, int arg2) {
        field7135++;
        if (arg2 == 2) {
            this.field7131 = arg0.method3470(13111);
        }
        int var4 = -68 % ((58 - arg1) / 44);
    }
}
