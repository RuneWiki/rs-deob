import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class460 extends class181 {

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field5846 = (int) (class571.method3150(99) / 1000L);

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljava/lang/String;")
    public String field5847;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "S")
    public short field5844;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public static int[] field5850;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 3)
    public static final void method2452(int arg0) {
        field5848++;
        class219.field2682.method2406(18385);
        if (arg0 > -6) {
            method2452(-90);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILiw;IZILiw;Z)I", line = 14)
    public static final int method2453(int arg0, class532 arg1, int arg2, boolean arg3, int arg4, class532 arg5, boolean arg6) {
        field5851++;
        int var7 = class324.method1859(-32743, arg4, arg3, arg5, arg1);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            if (arg2 != -30991) {
                field5849 = 44;
            }
            int var8 = class324.method1859(-32743, arg0, arg6, arg5, arg1);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BCLjava/lang/String;)I", line = 48)
    public static final int method2454(byte arg0, char arg1, String arg2) {
        field5845++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0 != 41) {
            field5849 = 127;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 75)
    public class460(String arg0, int arg1) {
        this.field5847 = arg0;
        this.field5844 = (short) arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 85)
    public static void method2455(byte arg0) {
        field5850 = null;
        if (arg0 != 43) {
            method2452(-81);
        }
    }
}
