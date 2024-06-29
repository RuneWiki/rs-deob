import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class259 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
    public static int[] field4644 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    public static int[] field4647 = new int[25];

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[Li;")
    public static class187[] field4648 = new class187[32768];

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Llc;")
    private static class143 field4641 = class66.method374("Allocating memory", -1);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Llc;")
    public static class143 field4640 = field4641;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1710(byte arg0) {
        if (arg0 < 49) {
            method1712(-52);
        }
        field4643++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class257.field4625 - 1); var2++) {
                if (class122.field2147[var2] < 1000 && class122.field2147[var2 + 1] > 1000) {
                    var1 = false;
                    class143 var3 = class136.field2382[var2];
                    class136.field2382[var2] = class136.field2382[var2 + 1];
                    class136.field2382[var2 + 1] = var3;
                    class143 var4 = class132.field2319[var2];
                    class132.field2319[var2] = class132.field2319[var2 + 1];
                    class132.field2319[var2 + 1] = var4;
                    int var5 = class128.field2269[var2];
                    class128.field2269[var2] = class128.field2269[var2 + 1];
                    class128.field2269[var2 + 1] = var5;
                    int var6 = class168.field3006[var2];
                    class168.field3006[var2] = class168.field3006[var2 + 1];
                    class168.field3006[var2 + 1] = var6;
                    short var7 = class122.field2147[var2];
                    class122.field2147[var2] = class122.field2147[var2 + 1];
                    class122.field2147[var2 + 1] = var7;
                    long var8 = class69.field1321[var2];
                    class69.field1321[var2] = class69.field1321[var2 + 1];
                    class69.field1321[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILh;)Lrg;")
    public static final class80 method1711(int arg0, class190 arg1) {
        field4642++;
        class80 var2 = new class80(arg1.method1270((byte) 3), arg1.method1270((byte) 117), arg1.method1275(arg0 ^ 0x5240), arg1.method1275(128), arg1.method1269(87), arg1.method1265(arg0 - 21064) == 1);
        int var3 = arg1.method1265(arg0 - 21065);
        if (arg0 != 21184) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1462.method1290((byte) -44, new class184(arg1.method1275(128), arg1.method1275(arg0 - 21056), arg1.method1275(128), arg1.method1275(arg0 - 21056)));
        }
        var2.method451(12800);
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field4641 = null;
        field4644 = null;
        field4647 = null;
        if (arg0 == 1) {
            field4640 = null;
            field4648 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method1713(int arg0) {
        if (arg0 != 7) {
            return;
        }
        class161.field2902.method804((byte) 126);
        int var1 = class161.field2902.method798(1, 8);
        field4646++;
        if (var1 == 0) {
            return;
        }
        int var2 = class161.field2902.method798(2, 8);
        if (var2 == 0) {
            class135.field2379[class268.field4809++] = 2047;
        } else if (var2 == 1) {
            int var3 = class161.field2902.method798(3, 8);
            class229.field4195.method1561(false, var3, 9);
            int var4 = class161.field2902.method798(1, 8);
            if (var4 == 1) {
                class135.field2379[class268.field4809++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class161.field2902.method798(3, arg0 + 1);
            class229.field4195.method1561(true, var5, 9);
            int var6 = class161.field2902.method798(3, arg0 ^ 0xF);
            class229.field4195.method1561(true, var6, 9);
            int var7 = class161.field2902.method798(1, 8);
            if (var7 == 1) {
                class135.field2379[class268.field4809++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class161.field2902.method798(1, arg0 ^ 0xF);
            if (var8 == 1) {
                class135.field2379[class268.field4809++] = 2047;
            }
            int var9 = class161.field2902.method798(1, arg0 ^ 0xF);
            int var10 = class161.field2902.method798(7, 8);
            int var11 = class161.field2902.method798(7, 8);
            class170.field3044 = class161.field2902.method798(2, arg0 ^ 0xF);
            class229.field4195.method216(var9 == 1, var10, var11, -46);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method1714(int arg0, int arg1) {
        class143.field2562.method835(1, arg0);
        class31.field507.method835(arg1 ^ 0x8001, arg0);
        class162.field2915.method835(1, arg0);
        class64.field1205.method835(1, arg0);
        if (arg1 != 32768) {
            field4644 = null;
        }
        field4645++;
    }
}
