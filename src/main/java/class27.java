import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class27 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    public static int[] field523 = new int[14];

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field527 = -1;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lpk;")
    public static class237 field522;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    public static int[] field525;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)I")
    public static final int method192(int arg0, byte arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 <= 70) {
            return 114;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        field521++;
        return arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method193(int arg0) {
        field525 = null;
        field523 = null;
        field522 = null;
        if (arg0 != -9459) {
            field525 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILpk;Ljava/lang/String;)Loh;")
    public static final class240 method194(int arg0, class237 arg1, String arg2) {
        int var3 = -33 % ((-arg0 - 60) / 55);
        int var4 = arg1.method1621(arg2, 1);
        field526++;
        if (var4 == -1) {
            return new class240(0);
        }
        int[] var5 = arg1.method1632(var4, (byte) -122);
        class240 var6 = new class240(var5.length);
        for (int var7 = 0; var7 < var6.field3727; var7++) {
            class54 var8 = new class54(arg1.method1605(-127, var5[var7], var4));
            var6.field3731[var7] = var8.method439((byte) -117);
            var6.field3734[var7] = var8.method459(false);
            var6.field3738[var7] = var8.method420((byte) 80);
            var6.field3733[var7] = var8.method420((byte) 30);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLnk;)V")
    public static final void method195(byte arg0, class184 arg1) {
        long var2 = 0L;
        if (arg1.field2681 == 0) {
            var2 = class236.method1596(arg1.field2671, arg1.field2674, arg1.field2669);
        }
        int var4 = -1;
        if (arg1.field2681 == 1) {
            var2 = class283.method1873(arg1.field2671, arg1.field2674, arg1.field2669);
        }
        if (arg0 <= 11) {
            method193(-49);
        }
        field520++;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field2681 == 2) {
            var2 = class251.method1709(arg1.field2671, arg1.field2674, arg1.field2669);
        }
        if (arg1.field2681 == 3) {
            var2 = class280.method1864(arg1.field2671, arg1.field2674, arg1.field2669);
        }
        if (var2 != 0L) {
            var6 = (int) var2 >> 20 & 0x3;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var2 & 0x7E443) >> 14;
        }
        arg1.field2675 = var4;
        arg1.field2678 = var6;
        arg1.field2668 = var5;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public static final void method196(int arg0, int arg1) {
        field524++;
        class174.field2551.method938(arg0, (byte) -123);
        if (arg1 != -3) {
            method193(-106);
        }
    }
}
