import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class110 {

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "[I")
    public static int[] field1769 = new int[3];

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)Lol;", line = 9)
    public static final class260 method1027(int arg0, int arg1, int arg2, int arg3) {
        field1767++;
        class252 var4 = class454.field6818[arg3][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        if (arg2 != -256) {
            method1029(-60, -50, 3, -70, 58, -63, -33);
        }
        class260 var5 = null;
        int var6 = -1;
        for (class531 var7 = var4.field4026; var7 != null; var7 = var7.field7736) {
            class459 var8 = var7.field7739;
            if (var8 instanceof class260) {
                class260 var9 = (class260) var8;
                int var10 = var9.method1841(20744) * 256 + 252 - 256;
                int var11 = var9.field9696 - var10 >> 9;
                int var12 = var9.field9705 - var10 >> 9;
                int var13 = var9.field9696 + var10 >> 9;
                int var14 = var9.field9705 + var10 >> 9;
                if (arg1 >= var11 && arg0 >= var12 && arg1 <= var13 && arg0 <= var14) {
                    int var15 = (var14 - (arg0 - 1)) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 70)
    public static void method1028(int arg0) {
        int var1 = -3 / ((-arg0 - 57) / 43);
        field1769 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)I", line = 82)
    public static final int method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1768++;
        int var7 = arg5 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg4;
        }
        int var9 = -57 / ((-arg6 - 54) / 63);
        if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return 1 + 7 - arg1 - arg3;
        }
    }
}
