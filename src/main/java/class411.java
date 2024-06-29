import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class411 {

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public int field6182 = 2048;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field6184 = 0;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public int field6186 = 2048;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field6187 = 0;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Ls;")
    public static class183 field6178;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lf;")
    public static class529 field6175;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static void method2473(byte arg0) {
        field6175 = null;
        field6178 = null;
        if (arg0 != 87) {
            field6178 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLdh;)V")
    public final void method2474(boolean arg0, class209 arg1) {
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field6183++;
                if (!arg0) {
                    method2475(30);
                    return;
                }
                return;
            }
            this.method2477((byte) -127, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static final void method2475(int arg0) {
        field6177++;
        int var1 = 0;
        if (class426.field6401.method392(-2, class170.field2529)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class426.field6401.field989) {
            var1 |= 0x40;
        }
        class512.method3025(false, var1);
        class252.field3743.method2690(var1, true);
        class294.field4196.method461(var1, (byte) -82);
        class431.field6451.method1738(var1, 31481);
        class512.field7494.method2726(1, var1);
        class355.method2221(0, var1);
        if (arg0 > -39) {
            method2476(97, 58);
        }
        class407.method2446(-26325, var1);
        class314.method1962(var1, -112);
        class439.method2647(-88, var1);
        if (class193.field2832 == 10) {
            class11.method76(false, 28);
        } else if (class193.field2832 == 30) {
            class11.method76(false, 25);
            return;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
    public static final int method2476(int arg0, int arg1) {
        if (arg0 > -66) {
            field6175 = null;
        }
        field6179++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILdh;)V")
    private final void method2477(byte arg0, int arg1, class209 arg2) {
        field6185++;
        if (arg1 == 1) {
            this.field6187 = arg2.method1428(32122);
        } else if (arg1 == 2) {
            this.field6186 = arg2.method1450((byte) 97);
        } else if (arg1 == 3) {
            this.field6182 = arg2.method1450((byte) 100);
        } else if (arg1 == 4) {
            this.field6184 = arg2.method1447(29480);
        }
        if (arg0 > -113) {
            field6178 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
    public static final void method2478(int arg0, boolean arg1) {
        if (!arg1) {
            field6176 = 49;
        }
        field6180++;
        class338 var2 = class230.method1580(9, -1332166328, arg0);
        var2.method2052(100);
    }
}
