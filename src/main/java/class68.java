import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class68 extends class147 {

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Llc;")
    public static class135 field846 = new class135("", 13);

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Lpn;")
    public static class72 field847 = new class72(40, -1);

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field849 = 0;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "Lrg;")
    public static class395 field848;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public static void method347(int arg0) {
        field847 = null;
        field848 = null;
        int var1 = 31 / ((arg0 + 15) / 50);
        field846 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
    public static final int method348(int arg0, int arg1, int arg2) {
        if (arg1 <= 51) {
            return 106;
        }
        field845++;
        int var3 = class20.method128(arg2 - 1, -789221, arg0 - 1) - (-class20.method128(arg2 + 1, -789221, arg0 - 1) - (class20.method128(arg2 - 1, -789221, arg0 + 1) + class20.method128(arg2 + 1, -789221, arg0 + 1)));
        int var4 = class20.method128(arg2 - 1, -789221, arg0) + class20.method128(arg2 + 1, -789221, arg0) + class20.method128(arg2, -789221, arg0 - 1) + class20.method128(arg2, -789221, arg0 + 1);
        int var5 = class20.method128(arg2, -789221, arg0);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }
}
