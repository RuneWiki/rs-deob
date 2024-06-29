import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class666 extends class309 {

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field9356 = (int) (class683.method3903((byte) 4) / 1000L);

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "S")
    public short field9360;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/lang/String;")
    public String field9359;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[[I")
    public static int[][] field9358 = new int[128][128];

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lqk;")
    public static class1 field9357 = new class1(54, 4);

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lqk;")
    public static class1 field9361 = new class1(83, -1);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILwc;Lwc;)V", line = 8)
    public static final void method3795(int arg0, int arg1, int arg2, class391 arg3, class391 arg4) {
        class472 var5 = class646.method3699(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field6548 = arg3;
        var5.field6544 = arg4;
        int var6 = class661.field9303 == class594.field8355 ? 1 : 0;
        if (!arg3.method77(25833)) {
            arg3.field3455 = class289.field4265[var6];
            class289.field4265[var6] = arg3;
        } else if (arg3.method80(126)) {
            arg3.field3455 = class689.field9618[var6];
            class689.field9618[var6] = arg3;
        } else {
            arg3.field3455 = class226.field3436[var6];
            class226.field3436[var6] = arg3;
            class282.field4043 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method77(25833)) {
            if (arg4.method80(103)) {
                arg4.field3455 = class689.field9618[var6];
                class689.field9618[var6] = arg4;
                return;
            }
            arg4.field3455 = class226.field3436[var6];
            class226.field3436[var6] = arg4;
            class282.field4043 = true;
            return;
        }
        arg4.field3455 = class289.field4265[var6];
        class289.field4265[var6] = arg4;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I", line = 70)
    public static final int method3796(int arg0, int arg1) {
        return class120.field1598 == null ? 0 : class120.field1598[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 73)
    public static void method3797(int arg0) {
        if (arg0 != 128) {
            method3796(64, -66);
        }
        field9357 = null;
        field9361 = null;
        field9358 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 92)
    public class666(String arg0, int arg1) {
        this.field9360 = (short) arg1;
        this.field9359 = arg0;
    }
}
