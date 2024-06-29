import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class240 extends class481 {

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "Lsd;")
    public static class74 field3300 = new class74(98, 4);

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "[I")
    public static int[] field3302 = new int[5];

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "Lrg;")
    public static class395 field3305;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "[[I")
    public static int[][] field3303;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3302 = null;
        field3300 = null;
        if (arg0 != 0) {
            field3305 = null;
        }
        field3303 = null;
        field3305 = null;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        class404.method2413(false, 25);
        int var1 = 98 / ((arg0 - 47) / 51);
        field3301++;
        class284.method1779(105);
        System.gc();
    }
}
