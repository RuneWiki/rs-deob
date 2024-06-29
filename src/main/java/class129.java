import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class129 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)I", line = 18)
    public static final int method909(int arg0, int arg1, int arg2, int arg3) {
        field2296++;
        if (arg1 != 0) {
            method909(71, -127, -72, 12);
        }
        return arg0 <= arg2 ? (arg2 > arg3 ? arg3 : arg2) : arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 30)
    public static final void method910(byte arg0) {
        field2300++;
        if (arg0 != -26) {
            method910((byte) -86);
        }
        try {
            if (class318.field5373 == 1) {
                int var1 = class184.field3186.method2219(arg0 ^ 0xFFFFDA85);
                if (var1 > 0 && class184.field3186.method2205((byte) -111)) {
                    int var2 = var1 - class165.field2835;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class184.field3186.method2202(var2, 31530);
                    return;
                }
                class184.field3186.method2223((byte) -10);
                class184.field3186.method2214(arg0 + 145);
                if (class240.field4230 == null) {
                    class318.field5373 = 0;
                } else {
                    class318.field5373 = 2;
                }
                class47.field861 = null;
                class161.field2728 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class184.field3186.method2223((byte) -101);
            class161.field2728 = null;
            class318.field5373 = 0;
            class240.field4230 = null;
            class47.field861 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public abstract void method541(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public abstract void method543(int arg0, int arg1);
}
