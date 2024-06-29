import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class308 extends class186 {

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "Lpb;")
    public static class2 field4544 = new class2(2, 3);

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "Lvg;")
    public static class622 field4546 = new class622(50, -1);

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "Lii;")
    public static class596 field4545;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II[BIIIZ)Z", line = 4)
    public static final boolean method1921(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4543++;
        int var7 = arg0 % arg1;
        if (arg6) {
            method1924(-47);
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg5 + arg1 - 1) / arg1);
        int var10 = -((arg0 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg4] == 0) {
                    return true;
                }
                arg4 += arg1;
            }
            int var13 = arg4 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V", line = 53)
    public static final void method1922(int arg0) {
        if (arg0 >= -72) {
            field4544 = null;
        }
        field4540++;
        class3.method8((byte) 124);
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V", line = 65)
    public static final void method1923(int arg0) {
        field4542++;
        if (class321.field4680 || arg0 != 0) {
            return;
        }
        class43.method244(class39.field585, true);
        if (class591.field8590 != null) {
            class43.method244(class591.field8590, true);
        }
        class321.field4680 = true;
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)I", line = 97)
    public static final int method1924(int arg0) {
        if (arg0 != -21558) {
            method1922(-82);
        }
        field4541++;
        return class311.field4571;
    }

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)V", line = 108)
    public static void method1925(int arg0) {
        if (arg0 != -17655) {
            field4545 = null;
        }
        field4545 = null;
        field4544 = null;
        field4546 = null;
    }
}
