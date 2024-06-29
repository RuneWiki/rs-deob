import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class399 {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    public boolean field5542;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field5535 = -1;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
    public static int[] field5544 = new int[5];

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lof;")
    public static class568 field5541 = new class568(4, 3);

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    public static int[] field5548 = new int[3];

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ljn;")
    public class659 field5537;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Ljn;")
    public class659 field5546;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    public boolean field5545;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIIIII[[[BLoa;II)V", line = 4)
    public static final void method2265(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[][][] arg9, class638 arg10, int arg11, int arg12) {
        field5536++;
        if (arg7 == 0 || arg5 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        arg10.method458(arg3, arg12, arg0, arg4, arg11, arg6, arg9[arg7 - 1][arg8], arg5, arg1);
        if (arg2 > -102) {
            method2268(109);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLwc;)V", line = 40)
    public static final void method2266(byte arg0, class60 arg1) {
        field5538++;
        arg1.field817 = null;
        int var2 = arg1.field818.length;
        int var3 = 0;
        if (arg0 != -63) {
            method2265(-97, 122, (byte) 74, -65, -114, 87, -13, 56, -49, null, null, 66, -4);
        }
        while (var3 < var2) {
            arg1.field818[var3].field6808 = false;
            var3++;
        }
        class663[] var4 = class625.field8714;
        synchronized (class625.field8714) {
            if (var2 < class625.field8714.length && class25.field328[var2] < 200) {
                class625.field8714[var2].method3679(arg1, 0);
                int var10002 = class25.field328[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z", line = 69)
    public static final boolean method2267(int arg0, int arg1) {
        if (arg0 == 7) {
            field5534++;
            return arg1 == 7 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 83)
    public static void method2268(int arg0) {
        field5541 = null;
        if (arg0 > -89) {
            field5547 = -84;
        }
        field5548 = null;
        field5544 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Z", line = 96)
    public final boolean method2269(boolean arg0) {
        if (arg0) {
            field5541 = null;
        }
        field5540++;
        return this.field5545 && !this.field5542;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 114)
    public final void method2270(int arg0) {
        field5539++;
        if (this.field5546 != null) {
            this.field5546.method776(false);
        }
        if (arg0 == 23408) {
            this.field5545 = false;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Z)V", line = 134)
    public class399(boolean arg0) {
        this.field5542 = arg0;
    }
}
