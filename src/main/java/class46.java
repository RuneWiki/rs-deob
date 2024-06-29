import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field750 = 1;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lik;")
    public static class267 field751 = new class267(64);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field754 = new String[500];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        field749++;
        int var9 = class215.field3234 + ((class283.field4240 - class215.field3234) * var8 / 100);
        int var10 = 2048 - arg4 & 0x7FF;
        int var11 = arg5 * var9 >> 8;
        if (arg1 < 72) {
            method310(true);
        }
        int var12 = 2048 - arg6 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var11;
        if (var10 != 0) {
            int var16 = class249.field3767[var10];
            var14 = -var11 * var16 >> 16;
            int var17 = class249.field3781[var10];
            var15 = var11 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class249.field3781[var12];
            int var19 = class249.field3767[var12];
            var13 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class259.field3949 = arg4;
        class272.field4088 = arg6;
        class213.field3184 = arg2 - var14;
        class128.field1922 = arg7 - var13;
        class47.field763 = arg3 - var15;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method310(boolean arg0) {
        field751 = null;
        field754 = null;
        if (arg0) {
            method310(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    public static final void method311(int arg0, int arg1, int arg2, int arg3) {
        field752++;
        String var4 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        if (arg3 != 26596) {
            field750 = -19;
        }
        class108.method680(true, var4);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I")
    public static final int method312(int arg0, int arg1, int arg2) {
        field753++;
        class75 var3 = (class75) class166.field2549.method1666((long) arg1, (byte) -99);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field1214.length) {
            return arg2 >= -58 ? 112 : var3.field1214[arg0];
        } else {
            return -1;
        }
    }
}
