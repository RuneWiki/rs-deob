import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class466 extends class339 {

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public int field6118 = 0;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "Leba;")
    public static class550 field6121 = new class550(90, 10);

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field6128 = 0;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6119;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
    public static int[] field6127;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIB)V")
    public static final void method2594(int arg0, int arg1, byte arg2) {
        field6123++;
        if ((class672.field9558 < class672.field9562)) {
            class672.field9558 = (float) ((double) class672.field9558 / 30.0D + (double) class672.field9558);
            if (class672.field9562 < class672.field9558) {
                class672.field9558 = class672.field9562;
            }
            class310.method1827((byte) 102);
            class672.field9559 = (int) class672.field9558 >> 1;
            class672.field9560 = class524.method2972(class672.field9559, 93);
        } else if (class672.field9562 < class672.field9558) {
            class672.field9558 = (float) ((double) class672.field9558 - (double) class672.field9558 / 30.0D);
            if (class672.field9558 < class672.field9562) {
                class672.field9558 = class672.field9562;
            }
            class310.method1827((byte) 125);
            class672.field9559 = (int) class672.field9558 >> 1;
            class672.field9560 = class524.method2972(class672.field9559, 96);
        }
        if (class59.field746 != -1 && class68.field827 != -1) {
            int var3 = class59.field746 - class698.field9854;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class68.field827 - class424.field5722;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class698.field9854 += var3;
            if (var3 == 0 && var4 == 0) {
                class59.field746 = -1;
                class68.field827 = -1;
            }
            class424.field5722 += var4;
            class310.method1827((byte) 99);
        }
        if (class158.field2276 <= 0) {
            class619.field8600 = -1;
            class10.field102 = -1;
        } else {
            class321.field4289--;
            if (class321.field4289 == 0) {
                class321.field4289 = 100;
                class158.field2276--;
            }
        }
        if (class81.field943 && class533.field7329 != null) {
            for (class31 var5 = (class31) class533.field7329.method2506(68); var5 != null; var5 = (class31) class533.field7329.method2505(-117)) {
                class83 var6 = class672.field9554.method2158(var5.field429.field9786, (byte) -124);
                if (var5.method191(arg1, arg0, -30474)) {
                    if (var6.field984 != null) {
                        if (var6.field984[4] != null) {
                            class592.method3274(false, true, -1, 1008, var6.field984[4], false, (long) var5.field429.field9786, -1, 0, var6.field991, var6.field966);
                        }
                        if (var6.field984[3] != null) {
                            class592.method3274(false, true, -1, 1009, var6.field984[3], false, (long) var5.field429.field9786, -1, 0, var6.field991, var6.field966);
                        }
                        if (var6.field984[2] != null) {
                            class592.method3274(false, true, -1, 1002, var6.field984[2], false, (long) var5.field429.field9786, -1, 0, var6.field991, var6.field966);
                        }
                        if (var6.field984[1] != null) {
                            class592.method3274(false, true, -1, 1012, var6.field984[1], false, (long) var5.field429.field9786, -1, 0, var6.field991, var6.field966);
                        }
                        if (var6.field984[0] != null) {
                            class592.method3274(false, true, -1, 1004, var6.field984[0], false, (long) var5.field429.field9786, -1, 0, var6.field991, var6.field966);
                        }
                    }
                    if (!var5.field429.field9787) {
                        var5.field429.field9787 = true;
                        class656.method3750(class284.field3756, var5.field429.field9786, var6.field991);
                    }
                    if (var5.field429.field9787) {
                        class656.method3750(class309.field4187, var5.field429.field9786, var6.field991);
                    }
                } else if (var5.field429.field9787) {
                    var5.field429.field9787 = false;
                    class656.method3750(class226.field2936, var5.field429.field9786, var6.field991);
                }
            }
        }
        if (arg2 > -86) {
            field6127 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILio;)V")
    private final void method2595(int arg0, int arg1, class157 arg2) {
        if (arg1 == 2) {
            this.field6118 = arg2.method963(-128);
        }
        field6122++;
        if (arg0 <= 108) {
            field6127 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)[Ljw;")
    public static final class259[] method2596(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field6120++;
            return new class259[] { class41.field518, class321.field4284, class164.field2350, class377.field4998, class83.field992, class111.field1414, class57.field729, class348.field4638, class704.field9939, class408.field5367, class425.field5728, class197.field2688, class228.field2959, class118.field1502, class204.field2737 };
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lio;I)V")
    public final void method2597(class157 arg0, int arg1) {
        if (arg1 != -1) {
            method2594(-33, 118, (byte) 34);
        }
        while (true) {
            int var3 = arg0.method930(arg1 + 256);
            if (var3 == 0) {
                field6126++;
                return;
            }
            this.method2595(126, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
    public static final void method2598(int arg0, byte arg1) {
        class55.field726 = arg0;
        field6124++;
        if (arg1 > 107) {
            class380 var2 = class133.field1843;
            synchronized (class133.field1843) {
                class133.field1843.method2168((byte) -70);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)V")
    public static void method2599(boolean arg0) {
        field6119 = null;
        field6127 = null;
        if (arg0) {
            field6121 = null;
        }
        field6121 = null;
    }
}
