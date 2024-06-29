import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class76 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[Lof;")
    private class232[] field1238;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lok;")
    private static class146 field1233 = class235.method1724(-12908, "yellow:");

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lok;")
    public static class146 field1232 = field1233;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[I")
    public static int[] field1237 = new int[32];

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field1239 = 20;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Lok;")
    public static class146 field1240 = field1233;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Z")
    public static boolean field1230 = true;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)V", line = 8)
    public static final void method553(int arg0, int arg1, byte arg2) {
        field1236++;
        class158 var3 = class206.method1564(arg0, 13, -99);
        int var4 = -118 % ((-arg2 - 42) / 59);
        var3.method1236(-13730);
        var3.field2663 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 26)
    public static void method554(int arg0) {
        if (arg0 <= 112) {
            field1233 = (class146) null;
        }
        field1237 = null;
        field1240 = null;
        field1232 = null;
        field1233 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)V", line = 41)
    public static final void method555(boolean arg0, int arg1) {
        class194.method1497(arg0, class148.field2518, 17898, class236.field3943, class56.field997);
        if (arg1 == 0) {
            field1235++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 55)
    public static final void method556(int arg0, int arg1) {
        field1234++;
        class37 var2 = class66.field1117;
        synchronized (class66.field1117) {
            if (arg1 != -1) {
                field1233 = (class146) null;
            }
            class75.field1217 = arg0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lce;", line = 85)
    public static final class241 method557(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class241 var4 = var3.field213;
            var3.field213 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V", line = 114)
    public class76(int arg0) {
        this.field1238 = new class232[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class232 var3 = this.field1238[var2] = new class232();
            var3.field3871 = var3;
            var3.field3869 = var3;
        }
    }
}
