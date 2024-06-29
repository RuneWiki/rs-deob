import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class237 {

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "Leea;")
    private class132 field3359;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "Z")
    public static boolean field3353;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "[Lkr;")
    public static class743[] field3358;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILda;ILdm;IILjava/lang/String;BILfp;ILaa;)V", line = 4)
    public static final void method1605(int arg0, class59 arg1, int arg2, class50 arg3, int arg4, int arg5, String arg6, byte arg7, int arg8, class323 arg9, int arg10, class484 arg11) {
        field3356++;
        if (arg7 != -57) {
            field3358 = null;
        }
        int var12;
        if (class666.field9338 == 4) {
            var12 = (int) class321.field4568 & 0x3FFF;
        } else {
            var12 = (int) class321.field4568 + class440.field6138 & 0x3FFF;
        }
        int var13 = Math.max(arg3.field783 / 2, arg3.field830 / 2) + 10;
        int var14 = arg0 * arg0 + arg2 * arg2;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class316.field4487[var12];
        int var16 = class316.field4490[var12];
        if (class666.field9338 != 4) {
            var16 = var16 * 256 / (class113.field1812 + 256);
            var15 = var15 * 256 / (class113.field1812 + 256);
        }
        int var17 = arg0 * var15 + (arg2 * var16) >> 14;
        int var18 = arg0 * var16 - arg2 * var15 >> 14;
        int var19 = arg9.method2072(100, null, arg6, (byte) 40);
        int var20 = arg9.method2077(-1, null, 0, 100, arg6);
        int var21 = var17 - var19 / 2;
        if (-arg3.field783 <= var21 && arg3.field783 >= var21 && var18 >= -arg3.field830 && arg3.field830 >= var18) {
            arg1.method648(0, arg5, arg3.field783 / 2 + arg5 + var21, null, arg4 - arg8 - var20 - (-(arg3.field830 / 2) + var18), 50, arg11, arg7 ^ 0xFFFFCE46, 0, var19, arg10, arg6, 1, 0, arg4, null);
        }
    }

    @OriginalMember(owner = "client!tea", name = "finalize", descriptor = "()V", line = 55)
    protected final void finalize() throws Throwable {
        field3357++;
        this.field3359.method1057((byte) -124, this.field3351);
        super.finalize();
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V", line = 66)
    public static void method1606(byte arg0) {
        int var1 = -96 % ((arg0 + 80) / 33);
        field3358 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Z", line = 75)
    public static final boolean method1607(int arg0, int arg1) {
        field3354++;
        if (arg1 == 6 || arg1 == 20 || arg1 == 13 || arg1 == 49 || arg1 == 5) {
            return true;
        } else if (arg1 == 10 || arg1 == 1006) {
            return true;
        } else if (arg0 <= 4) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 96)
    public static final void method1608(boolean arg0) {
        if (arg0) {
            field3352++;
            for (int var1 = 0; var1 < 100; var1++) {
                class329.field4646[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Leea;II)V", line = 113)
    public class237(class132 arg0, int arg1, int arg2) {
        this.field3359 = arg0;
        this.field3351 = arg2;
    }
}
