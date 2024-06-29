import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class139 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "B")
    private byte field2573;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lqe;")
    private static class179 field2568 = class206.method1380("Players", (byte) -128);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field2559 = 0;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2570 = -1;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[I")
    public static int[] field2569 = new int[200];

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lqe;")
    public static class179 field2560 = field2568;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lqe;")
    private static class179 field2574 = class206.method1380("Login", (byte) 64);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lqe;")
    public static class179 field2557 = field2574;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lae;I)V")
    public static final void method880(class6 arg0, int arg1) {
        if (arg1 < 95) {
            method884(43, (byte) 90, 54, 19, -64);
        }
        field2575++;
        if (class115.field2175 == arg0.field142) {
            class143.field2592[arg0.field167] = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method881(int arg0) {
        if (arg0 >= -28) {
            this.method882(57);
        }
        field2562++;
        return this.field2573 & 0x7;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
    public final int method882(int arg0) {
        if (arg0 != 2) {
            this.field2565 = 73;
        }
        field2572++;
        return (this.field2573 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method883(int arg0) {
        if (arg0 != 200) {
            field2568 = null;
        }
        field2560 = null;
        field2557 = null;
        field2574 = null;
        field2569 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBIII)V")
    public static final void method884(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class23.method161(arg2 + arg4, -1, arg3, arg4 - arg2, class14.field331[arg0]);
        int var5 = 0;
        field2566++;
        int var6 = arg2;
        if (arg1 >= -28) {
            method880(null, -98);
        }
        int var7 = -arg2;
        int var8 = -1;
        while (var5 < var6) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class14.field331[arg0 + var6];
                int[] var10 = class14.field331[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class23.method161(var11, -1, arg3, var12, var9);
                class23.method161(var11, -1, arg3, var12, var10);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class14.field331[arg0 + var5];
            int[] var16 = class14.field331[arg0 - var5];
            class23.method161(var13, -1, arg3, var14, var15);
            class23.method161(var13, -1, arg3, var14, var16);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class139() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lra;)V")
    public class139(class185 arg0) {
        this.field2573 = arg0.method1204(false);
        this.field2571 = arg0.method1252(2);
        this.field2558 = arg0.method1231(-4898);
        this.field2563 = arg0.method1231(-4898);
        this.field2561 = arg0.method1231(-4898);
        this.field2565 = arg0.method1231(-4898);
    }
}
