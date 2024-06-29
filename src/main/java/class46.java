import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class46 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lpi;")
    public static class340 field669 = new class340(19, 0);

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public static int[] field675 = new int[8];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[Lge;")
    public static class449[] field673 = new class449[50];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lv;")
    public static class455 field672;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[[[I")
    public static int[][][] field674;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 6)
    public static final void method291(int arg0) {
        class31.field518 = 0;
        field670++;
        int var1 = (class37.field573.field6239 >> 7) + class35.field545;
        int var2 = (class37.field573.field6241 >> 7) + class336.field4299;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class31.field518 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class31.field518 = 1;
        }
        int var3 = 70 % ((arg0 - 70) / 54);
        if (class31.field518 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class31.field518 = 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Z", line = 30)
    public static final boolean method292(int arg0, byte arg1, int arg2) {
        field671++;
        int var3 = 22 % ((-arg1 - 70) / 53);
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIZ)V", line = 40)
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field668++;
        if (arg5) {
            field673 = null;
        }
        for (int var6 = arg3; var6 <= arg1; var6++) {
            class183.method1212(arg0, class333.field4265[var6], true, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 62)
    public static void method294(byte arg0) {
        field672 = null;
        field673 = null;
        field669 = null;
        int var1 = 37 % ((66 - arg0) / 53);
        field675 = null;
        field674 = null;
    }
}
