import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class201 extends class627 {

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
    public static final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2572++;
        for (int var5 = arg1; var5 < class48.field702; var5++) {
            Rectangle var6 = class101.field1238[var5];
            if ((var6.x + var6.width) > arg2 && arg2 + arg4 > var6.x && arg3 < (var6.y + var6.height) && var6.y < (arg3 + arg0)) {
                class6.field69[var5] = true;
            }
        }
        class365.method2249(true, arg3 + arg0, arg3, arg2 + arg4, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
    public static final int method1251(int arg0) {
        field2570++;
        byte var1;
        if (class722.field10162 < 96) {
            var1 = 1;
            class585.method3260(true, (byte) -103);
        } else {
            int var2 = class383.method2306(-7304);
            if (var2 <= 100) {
                class58.method459((byte) 123);
                var1 = 4;
            } else if (var2 <= 500) {
                class511.method2941(true);
                var1 = 3;
            } else if (var2 > 1000) {
                class585.method3260(true, (byte) -103);
                var1 = 1;
            } else {
                class368.method2259(arg0 ^ 0x36);
                var1 = 2;
            }
        }
        if (class223.field2944.field633.method4191((byte) -120) != 0) {
            class223.field2944.method346(class223.field2944.field601, 0, false);
            class462.method2730(arg0 - 99, false, 0);
        }
        if (arg0 == 100) {
            class252.method1530((byte) 55);
            return var1;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(II)V")
    public class201(int arg0, int arg1) {
        this.field2566 = arg0;
        this.field2568 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZIIIZI)V")
    public static final void method1252(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 > arg3) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg3;
            class266 var9 = class303.field3903[var7];
            class303.field3903[var7] = class303.field3903[arg4];
            class303.field3903[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (class499.method2895(arg0, arg2, class303.field3903[var10], arg5, var9, arg1, (byte) -99) <= 0) {
                    class266 var11 = class303.field3903[var10];
                    class303.field3903[var10] = class303.field3903[var8];
                    class303.field3903[var8++] = var11;
                }
            }
            class303.field3903[arg4] = class303.field3903[var8];
            class303.field3903[var8] = var9;
            method1252(arg0, arg1, arg2, arg3, var8 - 1, arg5, 104);
            method1252(arg0, arg1, arg2, var8 + 1, arg4, arg5, 120);
        }
        if (arg6 > 89) {
            field2567++;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIII)V")
    public static final void method1253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2569++;
        class548 var5 = class696.method3872(arg1, arg4, -1633381944);
        var5.method3130(arg4 + 54);
        var5.field7725 = arg2;
        var5.field7726 = arg0;
        var5.field7728 = arg3;
    }
}
