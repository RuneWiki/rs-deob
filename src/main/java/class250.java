import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class250 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[B")
    public static byte[] field3457 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lqj;")
    public static class296 field3463;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Ljava/lang/String;")
    public String field3461;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field3457 = null;
        field3463 = null;
        if (arg0 != 0) {
            field3463 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZIILaa;IIIII[[[BI)V")
    public static final void method1553(int arg0, int arg1, boolean arg2, int arg3, int arg4, class281 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte[][][] arg11, int arg12) {
        field3458++;
        if (arg9 == 0 || arg6 == 0) {
            return;
        }
        if (arg9 == 9) {
            arg9 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg9 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 1;
        }
        if (arg2) {
            method1554(-77, -90, 46, -29);
        }
        if (arg9 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 8;
        }
        arg5.method1793(arg1, arg10, arg3, arg12, arg7, arg0, arg11[arg9 - 1][arg8], arg6, arg4);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)I")
    public static final int method1554(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2 != 7) {
            method1555(105, (String) null);
        }
        field3460++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1555(int arg0, String arg1) {
        field3464++;
        if (class173.field2458 == null) {
            class289.method1863((byte) 115);
        }
        String[] var2 = class65.method449((byte) -114, arg1, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class356.field5021; var4 > 0; var4--) {
                class173.field2458[var4] = class173.field2458[var4 - 1];
            }
            class173.field2458[0] = var2[var3];
            if (class173.field2458.length - 1 > class356.field5021) {
                if (class266.field3637 > 0) {
                    class266.field3637++;
                }
                class356.field5021++;
            }
        }
        if (arg0 >= -121) {
            field3463 = null;
        }
    }
}
