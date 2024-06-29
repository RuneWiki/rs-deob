import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class221 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static volatile int field3981 = -1;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3985 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lmc;IIIZB)V")
    public static final void method1595(class151 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        class269.field4739 = 1;
        class149.field2845 = 10000;
        class215.field3939 = arg0;
        field3982++;
        class262.field4622 = arg3;
        class205.field3675 = arg4;
        class241.field4266 = arg2;
        if (arg5 > -57) {
            field3985 = 16;
        }
        class25.field486 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lsg;I)I")
    public static final int method1596(class30 arg0, int arg1) {
        field3987++;
        if (arg1 != -6837) {
            return -82;
        }
        for (int var2 = 0; var2 < class105.field2115.length; var2++) {
            if (class105.field2115[var2].method285(arg0, arg1 + 6837)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZILmc;Lmc;)Lvg;")
    public static final class219 method1597(int arg0, boolean arg1, int arg2, class151 arg3, class151 arg4) {
        field3983++;
        boolean var5 = true;
        int[] var6 = arg4.method1097(arg2, true);
        if (arg0 != 14448) {
            method1595((class151) null, 36, 111, -128, false, (byte) -63);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1128(0, var6[var7], arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method1128(arg0 ^ 0x3870, var9, 0);
                } else {
                    var10 = arg3.method1128(0, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class219(arg4, arg3, arg2, arg1);
        } catch (Exception var11) {
            return null;
        }
    }
}
