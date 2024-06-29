import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class453 {

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "[J")
    public static long[] field6474 = new long[10];

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lgr;")
    public static class530 field6477 = new class530(61, -1);

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Ld;")
    public static class267 field6479;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method2770(int arg0) {
        field6478++;
        try {
            if (class249.field3628 == 2) {
                if (class597.field8491 == null) {
                    class597.field8491 = class305.method1899(class445.field6358, class174.field2446, class342.field4704);
                    if (class597.field8491 == null) {
                        return false;
                    }
                }
                if (class474.field6745 == null) {
                    class474.field6745 = new class701(class202.field3005, class648.field9333);
                }
                class317 var1 = class36.field325;
                if (class11.field98 != null) {
                    var1 = class11.field98;
                }
                if (var1.method1951(-116, class183.field2534, class597.field8491, class474.field6745, 22050)) {
                    class36.field325 = var1;
                    class36.field325.method1968((byte) 118);
                    if (class264.field3789 <= 0) {
                        class249.field3628 = 0;
                        class36.field325.method1946(arg0 + 14569, class683.field9697);
                        for (int var2 = 0; var2 < class281.field3932.length; var2++) {
                            class36.field325.method1979(class281.field3932[var2], (byte) 80, var2);
                            class281.field3932[var2] = 255;
                        }
                    } else {
                        class249.field3628 = 3;
                        class36.field325.method1946(14569, class264.field3789 <= class683.field9697 ? class264.field3789 : class683.field9697);
                        for (int var3 = 0; var3 < class281.field3932.length; var3++) {
                            class36.field325.method1979(class281.field3932[var3], (byte) 99, var3);
                            class281.field3932[var3] = 255;
                        }
                    }
                    if (class11.field98 == null) {
                        if (class366.field5361 <= 0L) {
                            class36.field325.method1965(class597.field8491, class179.field2476, (byte) 111);
                        } else {
                            class36.field325.method1964(class366.field5361, class179.field2476, true, class597.field8491, (byte) 74);
                        }
                    }
                    if (class667.field9527 != null) {
                        class667.field9527.method2231((byte) 88, class36.field325);
                    }
                    class597.field8491 = null;
                    class445.field6358 = null;
                    class474.field6745 = null;
                    class366.field5361 = 0L;
                    class11.field98 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class36.field325.method1966(true);
            class249.field3628 = 0;
            class474.field6745 = null;
            class597.field8491 = null;
            class445.field6358 = null;
            class11.field98 = null;
        }
        if (arg0 != 0) {
            field6479 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V", line = 106)
    public static void method2771(byte arg0) {
        field6474 = null;
        field6477 = null;
        if (arg0 == 51) {
            field6479 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILsc;)V", line = 122)
    public static final void method2772(int arg0, class451 arg1) {
        class461.field6566 = arg1;
        field6476++;
        if (arg0 > -5) {
            field6479 = null;
        }
    }
}
