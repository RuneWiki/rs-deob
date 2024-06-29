import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class29 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field493 = -1;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[[I")
    public static int[][] field494 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Z")
    public static boolean field499 = false;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lrk;B)V", line = 3)
    public static final void method334(class427 arg0, byte arg1) {
        class187.field2707 = arg0;
        field497++;
        if (arg1 != -40) {
            field499 = false;
        }
        class57.field918 = class187.field2707.method2626(4, arg1 + 135);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 17)
    public static final void method335(int arg0) {
        field489++;
        for (int var1 = 0; var1 < 5; var1++) {
            class22.field408[var1] = false;
        }
        if (arg0 != 10195) {
            field499 = false;
        }
        class286.field3830 = -1;
        class265.field3565 = 0;
        field493 = -1;
        class184.field2675 = 1;
        class83.field1218 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I", line = 42)
    public static final int method336(int arg0, int arg1, int arg2) {
        field498++;
        int var3 = class280.method1779(arg2 - 1, arg0 - 1, true) + class280.method1779(arg2 - 1, arg0 + 1, true) + class280.method1779(arg2 + 1, arg0 + -1, true) + class280.method1779(arg2 - -1, arg0 + 1, true);
        int var4 = class280.method1779(arg2, arg0 - 1, true) - (-class280.method1779(arg2, arg0 + 1, true) - class280.method1779(arg2 - 1, arg0, true) - class280.method1779(arg2 + 1, arg0, true));
        if (arg1 == 6443) {
            int var5 = class280.method1779(arg2, arg0, true);
            return var5 / 4 + var3 / 16 + var4 / 8;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I", line = 59)
    public static final int method337(int arg0, int arg1) {
        if (arg1 != 28) {
            method341(-22);
        }
        field491++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lal;", line = 73)
    public static final class370 method338(int arg0, int arg1) {
        field492++;
        class370 var2 = (class370) class446.field6428.method2537(-37, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class426.field6029.method2633(arg0, -1, arg1);
        class370 var4 = new class370();
        if (var3 != null) {
            var4.method2305(new class289(var3), (byte) -100);
        }
        var4.method2306(90);
        class446.field6428.method2542(var4, (byte) 101, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 97)
    public static void method339(boolean arg0) {
        field494 = null;
        if (arg0) {
            field494 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V", line = 114)
    public static final void method340(int arg0, byte arg1) {
        field496++;
        if (class166.field2472 == arg0) {
            return;
        }
        if (class166.field2472 == 0) {
            class267.method1719(arg1 - 68);
        }
        if (arg0 == 40) {
            class134.method1072(-2109085497);
        }
        if (arg0 != 40 && class118.field1642 != null) {
            class118.field1642.method2736(5000);
            class118.field1642 = null;
        }
        if (class166.field2472 == 25 || class166.field2472 == 28) {
            class396.field5548.field6055 = 2;
            class209.field2904.field6055 = 2;
            class43.field651.field6055 = 2;
            class13.field102.field6055 = 2;
            class332.field4514.field6055 = 2;
            class417.field5833.field6055 = 2;
            class12.field92.field6055 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class273.field3664 = 0;
            class402.field5612 = 1;
            class186.field2696 = 0;
            class321.field4326 = 1;
            class148.field2281 = 0;
            class153.method1178((byte) 76, true);
            class396.field5548.field6055 = 1;
            class209.field2904.field6055 = 1;
            class43.field651.field6055 = 1;
            class13.field102.field6055 = 1;
            class332.field4514.field6055 = 1;
            class417.field5833.field6055 = 1;
            class12.field92.field6055 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class135.method1076(arg1 + 60);
        }
        if (arg0 == 5) {
            class244.method1604(class187.field2705, class249.field3415, (byte) 116);
        } else {
            class179.method1323(arg1 - 31);
        }
        if (arg1 != -58) {
            method334((class427) null, (byte) 126);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class166.field2472 == 5 || class166.field2472 == 10 || class166.field2472 == 28;
        if (var3 != var2) {
            if (var2) {
                class96.field1386 = class118.field1644;
                if (class148.field2284 == 0) {
                    class356.method2246(2, 12614);
                } else {
                    class340.method2157((byte) 121, false, 255, class138.field1943, class118.field1644, 2, 0);
                }
                class118.field1650.method2768(0, false);
            } else {
                class356.method2246(2, 12614);
                class118.field1650.method2768(0, true);
                if (class293.field3959 != null) {
                    class293.field3959.method2711(0);
                    class293.field3959 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class249.field3415.method235();
        }
        class166.field2472 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 233)
    public static final void method341(int arg0) {
        field490++;
        if (class39.field590) {
            return;
        }
        class287.field3847 = true;
        if (arg0 != 1) {
            method334((class427) null, (byte) -60);
        }
        if (class100.field1443) {
            class313.field4229 = (float) ((int) class313.field4229 - 65 & 0xFFFFFF80);
        } else {
            class170.field2515 += (-class170.field2515 - 24.0F) / 2.0F;
        }
        class39.field590 = true;
    }
}
