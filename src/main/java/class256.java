import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class256 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
    public boolean field4326 = true;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4327 = -1;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
    public static int[] field4332 = new int[4];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1842(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 3) {
            method1844(-124, 41, false);
        }
        field4322++;
        if (class23.field423 <= arg0 && class272.field4552 >= arg1 && class55.field972 <= arg7 && class240.field4053 >= arg5) {
            class123.method931(arg4, arg6, arg3, arg5, true, arg7, arg1, arg0);
        } else {
            class69.method472(arg4, false, arg1, arg5, arg3, arg7, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        field4332 = null;
        int var1 = 115 / ((arg0 + 77) / 43);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)I")
    public static final int method1844(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return -43;
        }
        field4329++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4326 = arg6;
        this.field4328 = arg3;
        this.field4324 = arg2;
        this.field4325 = arg5;
        this.field4331 = arg0;
        this.field4330 = arg1;
        this.field4323 = arg4;
    }
}
