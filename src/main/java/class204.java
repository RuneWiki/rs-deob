import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class204 {

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lna;")
    public static class26 field3196 = class69.method505(" loggt sich aus)3", (byte) -121);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lbe;")
    public static class297 field3193;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[Lna;")
    public static class26[] field3195;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lve;Lve;B)V", line = 7)
    public static final void method1376(class266 arg0, class266 arg1, byte arg2) {
        class22.field323 = arg1;
        field3198++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class29.field509 = arg0;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class29.field509.method1898(34, (byte) 103);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class170.field2671 = var4 + var6;
        if (arg2 == -67) {
            class191.field2993 = var3 + var6;
            class13.field211 = var5 + var6;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1377(boolean arg0) {
        field3196 = null;
        if (!arg0) {
            field3196 = (class26) null;
        }
        field3195 = null;
        field3193 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BIILfe;III)V", line = 59)
    public static final void method1378(byte arg0, int arg1, int arg2, class241 arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 122) {
            method1379((class266) null, 7);
        }
        field3191++;
        class97.method724(arg6, arg2, arg3.field3972, arg5, arg1, arg3.field3962, (byte) -85, arg4);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lve;I)V", line = 73)
    public static final void method1379(class266 arg0, int arg1) {
        class225.field3566 = arg0;
        field3197++;
        if (arg1 != 255) {
            field3190 = -56;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 85)
    public static final void method1380(int arg0, int arg1) {
        if (arg1 <= -65) {
            field3189++;
            class120 var2 = class293.method2059(4, 10, arg0);
            var2.method823(true);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 98)
    public static final void method1381(int arg0) {
        class32.field540.method1986((byte) -113);
        field3192++;
        if (arg0 != 21) {
            field3193 = (class297) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I", line = 115)
    public static final int method1382(int arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        if (arg0 != 19067) {
            field3195 = (class26[]) null;
        }
        field3194++;
        return arg2;
    }
}
