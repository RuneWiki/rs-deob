import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class440 extends class476 {

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
    public boolean field6339;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Ljava/lang/String;")
    public String field6345;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Z")
    public boolean field6340;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "J")
    public long field6334;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Ljava/lang/String;")
    public String field6338;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public int field6336;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "Luc;")
    public static class201 field6335;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIII[B)Z", line = 9)
    public static final boolean method2603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field6333++;
        if (arg5 <= 84) {
            return true;
        }
        int var7 = arg2 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg3 - (1 - arg1)) / arg1);
        int var10 = -((arg2 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg0] == 0) {
                    return true;
                }
                arg0 += arg1;
            }
            int var13 = arg0 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 57)
    public static void method2604(int arg0) {
        field6335 = null;
        if (arg0 != 2048) {
            method2604(-50);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lnf;B)V", line = 71)
    public static final void method2605(class28 arg0, byte arg1) {
        for (int var2 = 0; var2 < class154.field2383; var2++) {
            int var3 = class505.field7389[var2];
            class487 var4 = class45.field642[var3];
            int var5 = arg0.method1869(-127);
            if ((var5 & 0x8) != 0) {
                var5 += arg0.method1869(-104) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg0.method1869(-76) << 16;
            }
            class506.method2999(var4, var5, arg0, -1, var3);
        }
        if (arg1 <= 14) {
            method2604(53);
        }
        field6341++;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 106)
    public class440(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field6339 = arg8;
        this.field6342 = arg2;
        this.field6344 = arg7;
        this.field6343 = arg6;
        this.field6345 = arg0;
        this.field6340 = arg9;
        this.field6334 = arg5;
        this.field6338 = arg1;
        this.field6337 = arg3;
        this.field6336 = arg4;
    }
}
