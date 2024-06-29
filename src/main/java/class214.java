import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class214 extends class34 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "J")
    public static volatile long field3860 = 0L;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "[I")
    public static int[] field3859 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lcc;")
    public static class209 field3862 = class95.method669(93, "<img=1>");

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field3861 = 0;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    public static int[] field3866;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public static void method1504(int arg0) {
        field3866 = null;
        if (arg0 == 0) {
            field3859 = null;
            field3862 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ltf;II)Lcc;")
    public static final class209 method1505(class106 arg0, int arg1, int arg2) {
        field3865++;
        try {
            class209 var3 = new class209();
            var3.field3811 = arg0.method760(255);
            if (var3.field3811 > arg1) {
                var3.field3811 = arg1;
            }
            var3.field3786 = new byte[var3.field3811];
            arg0.field2085 += class61.field1216.method1651(var3.field3811, (byte) 127, arg0.field2085, var3.field3786, 0, arg0.field2108);
            if (arg2 < 88) {
                method1504(-61);
            }
            return var3;
        } catch (Exception var4) {
            return class230.field4182;
        }
    }
}
