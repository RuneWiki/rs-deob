import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class94 extends class115 {

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[S")
    public static short[] field1039 = new short[256];

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "[Lja;")
    public static class152[] field1037 = new class152[14];

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Z")
    public static boolean field1041 = false;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "[[[B")
    public static byte[][][] field1040;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            field1042 = 112;
        }
        field1043++;
        return class43.field530;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static final void method505(boolean arg0) {
        if (arg0) {
            return;
        }
        for (class159 var1 = (class159) class32.field301.method1124(-1); var1 != null; var1 = (class159) class32.field301.method1119(false)) {
            if (class392.method2500(121, var1.field2257)) {
                class157.method1033(0, var1);
            }
        }
        field1036++;
        if (class433.field6324 == 1) {
            class81.field903 = false;
            class334.method2144(class428.field6219, (byte) -64, class162.field2286, class149.field2094, class119.field1595);
            return;
        }
        class334.method2144(class428.field6219, (byte) -64, class162.field2286, class149.field2094, class119.field1595);
        int var2 = class268.field3775.method1748(class326.field4582, -72);
        for (class159 var3 = (class159) class32.field301.method1124(-1); var3 != null; var3 = (class159) class32.field301.method1119(arg0)) {
            int var4 = class270.method1717(var3, -1003);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class149.field2094 = (field1041 ? 26 : 22) + class433.field6324 * 16;
        class119.field1595 = var2 + 8;
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1040 = null;
        field1039 = null;
        if (arg0 != -26129) {
            method506(0);
        }
        field1037 = null;
    }
}
