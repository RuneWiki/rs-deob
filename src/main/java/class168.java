import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class168 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ldr;")
    public static class675 field1967 = new class675(39, 14);

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lhd;")
    public static class694 field1973 = new class694(64);

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "Ldga;")
    public static class195 field1974 = new class195();

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
    public static final void method1018(int arg0, int arg1, int arg2) {
        field1975++;
        if (arg0 > -102) {
            field1967 = null;
        }
        if (class341.field4353 == class237.field3061) {
            if (!class472.method2565(-2, false, 1, arg2, false, 0, 0, 1, arg1)) {
                class472.method2565(-3, false, 1, arg2, false, 0, 0, 1, arg1);
            }
        } else if (!class472.method2565(-3, false, 1, arg2, false, 0, 0, 1, arg1)) {
            class472.method2565(-2, false, 1, arg2, false, 0, 0, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field1967 = null;
        field1974 = null;
        field1973 = null;
        int var1 = -78 / ((27 - arg0) / 60);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lpfa;III)Lek;")
    public static final class474 method1020(class275 arg0, int arg1, int arg2, int arg3) {
        field1976++;
        class572 var4 = new class572(arg0.method1659(79, arg3, arg1));
        class474 var5 = new class474(arg3, var4.method3072(255), var4.method3072(255), var4.method3064(-2031091464), var4.method3064(-2031091464), var4.method3097((byte) 12) == 1, var4.method3097((byte) 12), var4.method3097((byte) 12));
        int var6 = var4.method3097((byte) 12);
        if (arg2 != 64) {
            method1018(97, -12, -61);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field5868.method1904(new class84(var4.method3097((byte) 12), var4.method3031(-1), var4.method3031(-1), var4.method3031(-1), var4.method3031(arg2 ^ 0xFFFFFFBF), var4.method3031(-1), var4.method3031(-1), var4.method3031(-1), var4.method3031(-1)), -71);
        }
        var5.method2575(12800);
        return var5;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII[FIIIFIF)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        int var11 = arg2 - arg9;
        int var12 = arg0 - arg3;
        int var13 = arg6 - arg5;
        field1979++;
        float var14 = arg4[2] * (float) var13 + arg4[arg1] * (float) var11 + arg4[1] * (float) var12;
        float var15 = arg4[5] * (float) var13 + arg4[4] * (float) var12 + arg4[3] * (float) var11;
        float var16 = arg4[8] * (float) var13 + arg4[7] * (float) var12 + arg4[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var17 = arg8 * var17;
        }
        float var18 = var15 + arg10 + 0.5F;
        if (arg7 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class351.field4527 = var17;
        class453.field5672 = var18;
    }
}
