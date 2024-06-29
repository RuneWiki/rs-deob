import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class74 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1237 = 1;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1239 = "K";

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
    public static int[] field1241 = new int[100];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method501(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -4 % ((27 - arg2) / 59);
        field1242++;
        int var9 = class123.method866(class85.field1409, arg5, (byte) 99, class234.field3774);
        int var10 = class123.method866(class85.field1409, arg4, (byte) 97, class234.field3774);
        int var11 = class123.method866(class82.field1374, arg7, (byte) -109, class259.field4188);
        int var12 = class123.method866(class82.field1374, arg1, (byte) -108, class259.field4188);
        int var13 = class123.method866(class85.field1409, arg0 + arg5, (byte) -81, class234.field3774);
        int var14 = class123.method866(class85.field1409, arg4 - arg0, (byte) 118, class234.field3774);
        for (int var15 = var9; var15 < var13; var15++) {
            class73.method494(arg6, class204.field3253[var15], 4028, var12, var11);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class73.method494(arg6, class204.field3253[var16], 4028, var12, var11);
        }
        int var17 = class123.method866(class82.field1374, arg0 + arg7, (byte) 86, class259.field4188);
        int var18 = class123.method866(class82.field1374, arg1 - arg0, (byte) -75, class259.field4188);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class204.field3253[var19];
            class73.method494(arg6, var20, 4028, var17, var11);
            class73.method494(arg3, var20, 4028, var18, var17);
            class73.method494(arg6, var20, 4028, var12, var18);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lbc;I)I")
    public static final int method502(class299 arg0, int arg1) {
        if (arg1 >= -31) {
            return -116;
        }
        int var2 = arg0.field4777;
        class182 var3 = arg0.method292(-118);
        if (arg0.field682 == var3.field3006) {
            var2 = arg0.field4785;
        } else if (arg0.field682 == var3.field2985 || arg0.field682 == var3.field2988 || arg0.field682 == var3.field2986 || arg0.field682 == var3.field2998) {
            var2 = arg0.field4775;
        } else if (arg0.field682 == var3.field2987 || arg0.field682 == var3.field2981 || arg0.field682 == var3.field2994 || arg0.field682 == var3.field2996) {
            var2 = arg0.field4779;
        }
        field1240++;
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method503(byte arg0) {
        field1241 = null;
        field1239 = null;
        if (arg0 <= 111) {
            field1241 = null;
        }
    }
}
