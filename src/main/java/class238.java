import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class238 extends class189 {

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "Lpca;")
    public static class714 field3180 = new class714(3000000, 200);

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "Lqfa;")
    public static class98 field3185 = new class98(83, 1);

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 3)
    public static void method1523(int arg0) {
        if (arg0 > -43) {
            method1524(39, false, -117, true, -19, null, null);
        }
        field3180 = null;
        field3185 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IZIZILoaa;Loaa;)I", line = 23)
    public static final int method1524(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, class287 arg5, class287 arg6) {
        field3181++;
        if (arg2 != 1) {
            return -4;
        }
        int var7 = class47.method306(arg3, arg6, -123, arg0, arg5);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class47.method306(arg1, arg6, -124, arg4, arg5);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BII)B", line = 55)
    public static final byte method1525(byte arg0, int arg1, int arg2) {
        if (arg0 != -32) {
            method1525((byte) -97, 106, -52);
        }
        field3182++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(II)V", line = 74)
    public class238(int arg0, int arg1) {
        this.field3183 = arg1;
        this.field3184 = arg0;
    }
}
