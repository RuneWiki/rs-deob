import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class211 {

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field3004 = -1;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Ltk;")
    public static class191 field3000 = new class191(0, 0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1424(Component arg0, byte arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
    public abstract int method1425(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1426(int arg0, Component arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhb;Ljava/lang/String;IIIILth;IILsj;Lon;I)V")
    public static final void method1427(class433 arg0, String arg1, int arg2, int arg3, int arg4, int arg5, class355 arg6, int arg7, int arg8, class266 arg9, class184 arg10, int arg11) {
        field3006++;
        int var12;
        if (class129.field1568 == 4) {
            var12 = (int) class441.field6333 & 0x3FFF;
        } else {
            var12 = (int) class441.field6333 + class297.field4137 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field2618 / 2, arg10.field2516 / 2) + 10;
        int var14 = arg3 * arg3 + arg11 * arg11;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class158.field2055[var12];
        int var16 = class158.field2059[var12];
        if (class129.field1568 != 4) {
            var16 = var16 * 256 / (class292.field4089 + 256);
            var15 = var15 * 256 / (class292.field4089 + 256);
        }
        int var17 = arg3 * var16 + arg11 * var15 >> 15;
        int var18 = arg11 * var16 - arg3 * var15 >> 15;
        int var19 = arg6.method2261((class381[]) null, arg4, arg1, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg6.method2257((class381[]) null, (byte) 62, 100, arg1, 0);
        if (var20 >= -arg10.field2618 && var20 <= arg10.field2618 && (-arg10.field2516) <= var18 && var18 <= arg10.field2516) {
            arg9.method1765(arg10.field2618 / 2 + arg2 + var20, true, arg0, 50, arg7, arg10.field2516 / 2 + arg7 - var18 - arg5 - var21, 0, (int[]) null, (class381[]) null, 0, arg2, arg8, var19, arg1, 0, 1);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1428(Random arg0, int arg1, int arg2) {
        field2999++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class17.method115((byte) 122, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4 = -114 / ((-arg2 - 54) / 46);
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var3 <= var5);
            return class161.method1035(arg1, var5, 75);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static void method1429(boolean arg0) {
        field3000 = null;
        if (arg0) {
            field3004 = 34;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static final void method1430(int arg0) {
        field3001++;
        class237 var1 = class88.field1060;
        synchronized (class88.field1060) {
            class88.field1060.method1626((byte) 106);
        }
        int var2 = 72 / ((63 - arg0) / 46);
        class237 var3 = class285.field4005;
        synchronized (class285.field4005) {
            class285.field4005.method1626((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lfs;ZLfs;)V")
    public static final void method1431(class331 arg0, boolean arg1, class331 arg2) {
        if (arg0.field4673 != null) {
            arg0.method2133(-31493);
        }
        field3003++;
        arg0.field4673 = arg2;
        arg0.field4676 = arg2.field4676;
        arg0.field4673.field4676 = arg0;
        if (arg1) {
            field3000 = null;
        }
        arg0.field4676.field4673 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILae;)V")
    public static final void method1432(int arg0, class134 arg1) {
        field3002++;
        if (arg0 != 100) {
            method1432(111, (class134) null);
        }
        if (class331.field4686) {
            class23.method168(arg1, 126);
        } else {
            class200.method1323(116, arg1);
        }
    }
}
