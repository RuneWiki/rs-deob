import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class698 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[Z")
    public static boolean[] field9719 = new boolean[100];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
    public static final int method3930(byte arg0) {
        if (arg0 == -30) {
            field9721++;
            return class234.field3528;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static void method3931(byte arg0) {
        field9719 = null;
        int var1 = 22 / ((arg0 - 67) / 59);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLlja;ZZ)V")
    public static final void method3932(byte arg0, class744 arg1, boolean arg2, boolean arg3) {
        if (arg0 < 43) {
            return;
        }
        field9720++;
        int var4 = arg1.field10314;
        int var5 = (int) arg1.field8133;
        arg1.method3387((byte) -69);
        if (arg2) {
            class584.method3413(31, var4);
        }
        class385.method2407((byte) -78, var4);
        class451 var6 = class166.method1238((byte) -44, var5);
        if (var6 != null) {
            class564.method3329(var6, 8195);
        }
        class104.method735(0);
        if (!arg3 && class371.field5137 != -1) {
            class614.method3563(class371.field5137, 1, (byte) 44);
        }
        class548 var7 = new class548(class11.field217);
        for (class744 var8 = (class744) var7.method3274(true); var8 != null; var8 = (class744) var7.method3276(true)) {
            if (!var8.method3386((byte) 60)) {
                var8 = (class744) var7.method3274(true);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field10312 == 3) {
                int var9 = (int) var8.field8133;
                if (var9 >>> 16 == var4) {
                    method3932((byte) 85, var8, true, arg3);
                }
            }
        }
    }
}
