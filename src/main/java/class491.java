import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class491 extends class379 {

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field6932 = 127;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field6933 = 16777215;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "[I")
    public static int[] field6931 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lbg;")
    public static class317 field6929;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public static final void method2877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6934++;
        if (arg1 != -32746) {
            field6933 = -95;
        }
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        class80.method554(class2.field16[arg4], 97, arg2, arg0 + arg3, -arg3 + arg0);
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class2.field16[arg4 + var6];
                int[] var10 = class2.field16[arg4 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class80.method554(var9, 114, arg2, var11, var12);
                class80.method554(var10, 96, arg2, var11, var12);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class2.field16[arg4 + var5];
            int[] var16 = class2.field16[arg4 - var5];
            class80.method554(var15, 102, arg2, var13, var14);
            class80.method554(var16, 110, arg2, var13, var14);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method2878(int arg0) {
        field6929 = null;
        if (arg0 != 128) {
            field6932 = 83;
        }
        field6931 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
    public static final void method2879(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 16777215) {
                method2878(-21);
            }
        } catch (InterruptedException var3) {
        }
        field6930++;
    }
}
