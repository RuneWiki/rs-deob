import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class313 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    public int[] field4240 = new int[100];

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[I")
    public int[] field4249 = new int[3];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[Lcg;")
    public class271[] field4242 = new class271[8];

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[Lti;")
    public class5[] field4252 = new class5[100];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lhc;")
    public static class368 field4244 = new class368(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field4248;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lij;ILij;)V", line = 12)
    public static final void method1892(class316 arg0, int arg1, class316 arg2) {
        if (arg1 != -7325) {
            field4250 = 1;
        }
        class70.field975 = arg2;
        field4245++;
        class370.field5132 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIIB)I", line = 29)
    public static final int method1893(byte[] arg0, int arg1, int arg2, byte arg3) {
        field4243++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class435.field6142[(var4 ^ arg0[var5]) & 0xFF];
        }
        return arg3 == 74 ? ~var4 : -104;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 54)
    public static void method1894(byte arg0) {
        field4244 = null;
        int var1 = 35 % ((arg0 + 51) / 36);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 65)
    public static final void method1895(byte arg0) {
        class245.field3457.method2522((byte) 118);
        int var1 = -115 / ((6 - arg0) / 35);
        field4246++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILea;III)V", line = 84)
    public static final void method1896(byte arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5) {
        field4241++;
        arg2.method227(arg5, arg1, arg3 + arg5, arg1 + arg4);
        arg2.method461(arg3, -16777216, arg4, -91, arg5, arg1);
        if (class273.field3726 < 100) {
            return;
        }
        float var6 = (float) class333.field4501 / (float) class333.field4520;
        int var7 = arg3;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg4 - var8) / 2 + arg1;
        int var10 = 22 % ((arg0 + 42) / 48);
        int var11 = (arg3 - var7) / 2 + arg5;
        if (class281.field3820 == null || arg3 != class281.field3820.method628() || arg4 != class281.field3820.method631()) {
            class333.method2030(class333.field4518, class333.field4514 + class333.field4501, class333.field4518 - -class333.field4520, class333.field4514, var11, var9, var7 + var11, var9 - -var8);
            class333.method2020(arg2);
            class281.field3820 = arg2.method177(var11, var9, var7, var8, false);
        }
        class281.field3820.method616(var11, var9);
        int var12 = class92.field1290 * var7 / class333.field4520;
        int var13 = class278.field3788 * var8 / class333.field4501;
        int var14 = class442.field6222 * var7 / class333.field4520 + var11;
        int var15 = var9 + var8 - var13 - class87.field1224 * var8 / class333.field4501;
        int var16 = -1996554240;
        if (class133.field1986 == 1) {
            var16 = -1996488705;
        }
        arg2.method245(var14, var15, var12, var13, var16, 1);
        arg2.method190(var14, var15, var12, var13, var16, 0);
        if (class318.field4336 <= 0) {
            return;
        }
        int var17;
        if (class432.field6098 > 50) {
            var17 = 500 - (class432.field6098 * 5);
        } else {
            var17 = class432.field6098 * 5;
        }
        for (class157 var18 = (class157) class333.field4500.method1173(0); var18 != null; var18 = (class157) class333.field4500.method1165(true)) {
            class430 var19 = class204.method1389(var18.field2229, 24);
            if (class337.method2047((byte) 1, var19)) {
                if (class132.field1985 == var18.field2229) {
                    int var20 = var18.field2228 * var7 / class333.field4520 + var11;
                    int var21 = var9 + ((class333.field4501 - var18.field2226) * var8 / class333.field4501);
                    arg2.method461(4, var17 << 24 | 0xFFFF00, 4, -91, var20 - 2, var21 - 2);
                } else if (class281.field3817 != -1 && class281.field3817 == var19.field6021) {
                    int var22 = var18.field2228 * var7 / class333.field4520 + var11;
                    int var23 = (class333.field4501 - var18.field2226) * var8 / class333.field4501 + var9;
                    arg2.method461(4, var17 << 24 | 0xFFFF00, 4, -91, var22 - 2, var23 + -2);
                }
            }
        }
    }
}
