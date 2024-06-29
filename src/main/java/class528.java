import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class528 extends class42 {

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public int field7723 = -1;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Z")
    public boolean field7724 = false;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field7712 = 0;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[Lmh;")
    public static class454[] field7713 = new class454[75];

    @OriginalMember(owner = "client!au", name = "x", descriptor = "Z")
    public static boolean field7721 = false;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "[Z")
    public static boolean[] field7722 = new boolean[8];

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public int field7720;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 7)
    public static void method3133(int arg0) {
        field7713 = null;
        field7722 = null;
        if (arg0 != -1) {
            method3134(-87, -19, 127, 94, null, -51, 9);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[BII)Z", line = 32)
    public static final boolean method3134(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field7716++;
        int var7 = arg2 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg5 + arg0) / arg3);
        int var10 = -((arg2 - (1 - arg3)) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 78)
    public static final void method3135(int arg0) {
        class157.field2402.method247(class131.field2055, class65.field1111, class190.field2783);
        if (arg0 < 6) {
            method3134(0, 2, -104, 47, null, 89, -114);
        }
        field7715++;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(I)V", line = 104)
    public class528(int arg0) {
        this.field7723 = arg0;
    }
}
