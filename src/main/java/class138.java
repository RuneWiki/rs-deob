import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class138 extends class207 {

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[I")
    public static int[] field2634 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Lmh;")
    public static class148 field2637;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field2627;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "[I")
    public static int[] field2628;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)V")
    public static final void method983(int arg0, byte arg1) {
        field2631++;
        if (class84.field1634 == arg0) {
            return;
        }
        if (class84.field1634 == 0) {
            class64.method454((byte) -71);
        }
        if (arg0 == 40) {
            class205.method1464(false);
        }
        if (arg0 != 40 && class270.field4748 != null) {
            class270.field4748.method207((byte) 125);
            class270.field4748 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class10.field324 = 1;
            class132.field2497 = 0;
            class169.field3124 = 0;
            class30.field635 = 1;
            class23.field578 = 0;
            class63.method452((byte) 122);
        }
        int var2 = -99 % ((57 - arg1) / 42);
        boolean var3 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 5) {
            class247.method1672((byte) -77, class56.field1141);
        } else {
            class272.method1855(-95);
        }
        boolean var4 = class84.field1634 == 5 || class84.field1634 == 10 || class84.field1634 == 28;
        if (var3 != var4) {
            if (var3) {
                class39.field909 = class46.field1019;
                if (class139.field2646 == 0) {
                    class60.method431((byte) -94, 2);
                } else {
                    class122.method860(0, false, 255, 2, 0, class46.field1019, class232.field4204);
                }
                class253.field4496.method1157(8837, false);
            } else {
                class60.method431((byte) -112, 2);
                class253.field4496.method1157(8837, true);
            }
        }
        class84.field1634 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILqk;)Lo;")
    public static final class235 method984(int arg0, class200 arg1) {
        if (arg0 == 9550) {
            field2636++;
            return new class235(arg1.method1421((byte) 96), arg1.method1421((byte) -97), arg1.method1421((byte) 94), arg1.method1421((byte) 112), arg1.method1405(-3), arg1.method1405(-3), arg1.method1408((byte) -66));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
    public static final void method985(int arg0) {
        field2632++;
        if (!class11.field336) {
            return;
        }
        class6 var1 = class229.method1596(class20.field526, class226.field4095, (byte) -27);
        if (var1 != null && var1.field179 != null) {
            class55 var2 = new class55();
            var2.field1114 = var1;
            var2.field1128 = var1.field179;
            class59.method427(var2, 200000);
        }
        class11.field336 = false;
        class62.method441(-29481, var1);
        if (arg0 != 26797) {
            field2638 = -9;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILbj;I)Ljf;")
    public static final class63 method986(int arg0, class151 arg1, int arg2) {
        field2630++;
        byte[] var3 = arg1.method1074(arg0, (byte) 95);
        int var4 = 4 / ((-arg2 - 34) / 55);
        return var3 == null ? null : new class63(var3);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field2634 = null;
        field2627 = null;
        field2637 = null;
        if (arg0 != -88) {
            method987((byte) 118);
        }
        field2628 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Lqc;")
    public static final class62 method988(byte arg0) {
        field2629++;
        class101 var1 = new class101(class70.field1438, class169.field3121, field2628[0], class1.field6[0], class24.field592[0], class191.field3393[0], class213.field3857[0], class268.field4718);
        int var2 = 86 / ((31 - arg0) / 41);
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(II)V")
    public class138(int arg0, int arg1) {
        this.field2640 = arg0;
        this.field2639 = arg1;
    }
}
