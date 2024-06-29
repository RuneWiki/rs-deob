import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class74 extends class381 {

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Z")
    public boolean field1165;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field1162 = new int[8];

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field1160 = -1;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lvg;")
    public static class622 field1164 = new class622(116, -2);

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "B")
    public static byte field1158;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIB[B)Z")
    public static final boolean method427(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6) {
        field1157++;
        int var7 = 46 % ((arg5 + 24) / 37);
        int var8 = arg3 % arg0;
        int var9;
        if (var8 == 0) {
            var9 = 0;
        } else {
            var9 = arg0 - var8;
        }
        int var10 = -((arg0 + arg4 - 1) / arg0);
        int var11 = -((arg3 + arg0 - 1) / arg0);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg6[arg1] == 0) {
                    return true;
                }
                arg1 += arg0;
            }
            int var14 = arg1 - var9;
            if (arg6[var14 - 1] == 0) {
                return true;
            }
            arg1 = arg2 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        field1162 = null;
        field1164 = null;
        if (arg0 != -1) {
            field1160 = -73;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIZ)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1159 = arg3;
        this.field1163 = arg4;
        this.field1167 = arg0;
        this.field1166 = arg2;
        this.field1168 = arg1;
        this.field1165 = arg5;
    }
}
