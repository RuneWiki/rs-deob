import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class181 extends class70 {

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "[I")
    public static int[] field3066 = new int[1];

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "Z")
    public static boolean field3069;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILnfa;ZLnfa;IZI)I", line = 5)
    public static final int method1398(int arg0, class225 arg1, boolean arg2, class225 arg3, int arg4, boolean arg5, int arg6) {
        if (arg6 > -125) {
            return 62;
        }
        field3067++;
        int var7 = class94.method782(arg3, arg2, arg0, false, arg1);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class94.method782(arg3, arg5, arg4, false, arg1);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z", line = 39)
    public static final boolean method1399(byte arg0, int arg1, int arg2) {
        field3070++;
        class595 var3 = class576.field8167.method3074(0, arg2);
        int var4 = 1 % ((arg0 - 30) / 51);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method3410(arg1, -124);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 61)
    public static void method1400(int arg0) {
        if (arg0 != 0) {
            method1398(-109, null, false, null, -2, false, 118);
        }
        field3066 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 72)
    public static final String method1401(int arg0, boolean arg1, int arg2, int arg3) {
        field3065++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 && arg0 >= 0) {
            if (arg3 != -1) {
                field3066 = null;
            }
            int var4 = 2;
            int var5 = arg0 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lnha;Ljn;IIIIIIIII)V", line = 122)
    public class181(class686 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3064 = arg9;
        this.field3063 = arg10;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Lvj;", line = 131)
    public final class26 method117(int arg0) {
        field3068++;
        if (arg0 != 1) {
            this.field3064 = 62;
        }
        return class53.field848;
    }
}
