import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class323 extends class29 {

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lve;")
    public class282 field5049;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lqg;")
    public static class256 field5048 = new class256();

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field5051 = 0;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Lbh;", line = 7)
    public static final class288 method2251(int arg0, int arg1) {
        class288 var2 = (class288) class56.field737.method1619((long) arg1, 101);
        field5050++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class277.field4377.method250(true, 3, arg1);
        class288 var4 = new class288();
        if (arg0 < 80) {
            field5055 = -56;
        }
        if (var3 != null) {
            var4.method2025((byte) -104, new class192(var3));
        }
        class56.field737.method1621((long) arg1, -122, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 30)
    public static void method2252(int arg0) {
        field5048 = null;
        if (arg0 != -1348706096) {
            field5052 = 82;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Ln;Lkb;)V", line = 46)
    public static final void method2253(byte arg0, class298[] arg1, class39 arg2) {
        field5054++;
        class274.field4348 = arg2;
        class157.field2425 = arg1;
        if (arg0 >= -14) {
            method2252(-20);
        }
        class231.field3700 = new boolean[class157.field2425.length];
        class225.field3581.method1745(-66);
        int var3 = class274.field4348.method266(-39, "details");
        int[] var4 = class274.field4348.method270(-78, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class225.field3581.method1750(class327.method2269(var4[var5], (byte) 99, new class192(class274.field4348.method250(true, var3, var4[var5]))), (byte) 125, (long) var4[var5]);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z", line = 73)
    public static final boolean method2254(int arg0, int arg1, int arg2) {
        field5047++;
        if (!class19.field274) {
            return false;
        }
        int var3 = arg2 >> 16;
        if (arg0 != -20) {
            field5051 = -124;
        }
        int var4 = arg2 & 0xFFFF;
        if (class21.field309[var3] == null || class21.field309[var3][var4] == null) {
            return false;
        }
        class160 var5 = class21.field309[var3][var4];
        if (arg1 == -1 && var5.field2608 == 0) {
            for (int var6 = 0; var6 < class126.field1887; var6++) {
                if (class50.field686[var6] == 19 || class50.field686[var6] == 1006 || class50.field686[var6] == 59 || class50.field686[var6] == 2 || class50.field686[var6] == 31) {
                    for (class160 var7 = class37.method238((byte) 73, class300.field4675[var6]); var7 != null; var7 = class26.method182(-1, var7)) {
                        if (var5.field2446 == var7.field2446) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class126.field1887; var8++) {
                if (class19.field270[var8] == arg1 && class300.field4675[var8] == var5.field2446 && (class50.field686[var8] == 19 || class50.field686[var8] == 1006 || class50.field686[var8] == 59 || class50.field686[var8] == 2 || class50.field686[var8] == 31)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lve;)V", line = 142)
    public class323(class282 arg0) {
        this.field5049 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I", line = 155)
    public static final int method2255(int arg0) {
        field5053++;
        if (arg0 < 51) {
            field5051 = -28;
        }
        return 6;
    }
}
