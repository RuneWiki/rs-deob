import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class384 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
    public static int[] field5624 = new int[128];

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field5630 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[[[Ldn;")
    public static class302[][][] field5629;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I", line = 3)
    public static final int method2458(int arg0) {
        field5631++;
        if (arg0 != 0) {
            method2462(-67, true, -19);
        }
        return class96.field1077;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lra;Lra;Lra;I)V", line = 19)
    public static final void method2459(class57 arg0, class57 arg1, class57 arg2, int arg3) {
        class124.field1646 = arg0;
        int var4 = -7 % ((33 - arg3) / 55);
        field5625++;
        class444.method2752(arg2, arg1, 256);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIZI)V", line = 30)
    public static final void method2460(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field5626++;
        class152.method907(arg0, arg4, class426.field6192.length - 1, arg1, arg2, (byte) -42, arg3);
        class153.field2148 = 0;
        class413.field5964 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 49)
    public static void method2461(byte arg0) {
        field5629 = null;
        if (arg0 < 75) {
            field5624 = null;
        }
        field5624 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)V", line = 65)
    public static final void method2462(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field5623 = -35;
        }
        class237.field3225 = arg2 - class106.field1228;
        field5622++;
        class342.field5027 = arg0 - class106.field1222;
    }
}
