import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class612 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public static int[] field8693 = new int[2];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 3)
    public static void method3470(int arg0) {
        field8693 = null;
        if (arg0 <= 91) {
            field8693 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lco;I)V", line = 13)
    public static final void method3471(class268 arg0, int arg1) {
        field8692++;
        if (arg1 < 93) {
            return;
        }
        for (int var2 = 0; var2 < class10.field111; var2++) {
            int var3 = arg0.method1749((byte) -69);
            int var4 = arg0.method1745(32132);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class206.field2916[var3] != null) {
                class206.field2916[var3].field583 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V", line = 46)
    public static final void method3472(int arg0, int arg1, byte arg2) {
        if (arg2 < 1) {
            field8693 = null;
        }
        field8691++;
        class21 var3 = class601.method3413(arg1, 12, (byte) 111);
        var3.method230(18340);
        var3.field308 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbo;ZZIILbo;Z)I", line = 62)
    public static final int method3473(class225 arg0, boolean arg1, boolean arg2, int arg3, int arg4, class225 arg5, boolean arg6) {
        if (arg1) {
            method3472(-59, 97, (byte) 33);
        }
        field8689++;
        int var7 = class179.method1213(!arg1, arg4, arg6, arg0, arg5);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class179.method1213(!arg1, arg3, arg2, arg0, arg5);
            return arg2 ? -var8 : var8;
        }
    }
}
