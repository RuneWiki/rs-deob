import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class387 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field5175 = 0;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[F")
    public static float[] field5177 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5170 = null;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[Lxa;")
    public static class458[] field5169;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lwg;", line = 5)
    public final class387 method2117(int arg0, int arg1) {
        if (arg1 != 0) {
            method2120((byte) -26);
        }
        field5176++;
        return new class387(this.field5174, arg0, this.field5173, this.field5179);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z[BILap;IIII)Lhea;", line = 22)
    public static final class385 method2118(boolean arg0, byte[] arg1, int arg2, class435 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 34037) {
            return null;
        }
        field5172++;
        if (!arg3.field6061 && (!class644.method3612(false, arg2) || !class644.method3612(false, arg6))) {
            return arg3.field6012 ? new class385(arg3, 34037, arg4, arg2, arg6, arg0, arg1, arg5) : new class385(arg3, arg4, arg2, arg6, class146.method799(arg2, -123), class146.method799(arg6, -116), arg1, arg5);
        } else {
            return new class385(arg3, 3553, arg4, arg2, arg6, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwd;)V", line = 44)
    public static final void method2119(class247 arg0) {
        if (class112.field1296 >= 65535) {
            return;
        }
        class463 var1 = arg0.field3189;
        class256.field3279[class112.field1296] = arg0;
        class44.field499[class112.field1296] = false;
        class112.field1296++;
        int var2 = arg0.field3188;
        if (arg0.field3176) {
            var2 = 0;
        }
        int var3 = arg0.field3188;
        if (arg0.field3175) {
            var3 = class337.field4416 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2641((byte) -14) + class389.field5194 - var1.method2637(60) >> class8.field70;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2641((byte) -14) + var1.method2637(91) - class389.field5194 >> class8.field70;
            if (var7 >= class272.field3451) {
                var7 = class272.field3451 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field3180[var5++];
                int var10 = (var1.method2640(-2049) + class389.field5194 - var1.method2637(104) >> class8.field70) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class181.field2222) {
                    var11 = class181.field2222 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class2.field17[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class2.field17[var4][var12][var8] = var13 | (long) class112.field1296;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class2.field17[var4][var12][var8] = var13 | (long) class112.field1296 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class2.field17[var4][var12][var8] = var13 | (long) class112.field1296 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class2.field17[var4][var12][var8] = var13 | (long) class112.field1296 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 138)
    public static void method2120(byte arg0) {
        field5170 = null;
        field5169 = null;
        if (arg0 != 33) {
            method2119(null);
        }
        field5177 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIII)V", line = 155)
    public class387(int arg0, int arg1, int arg2, int arg3) {
        this.field5171 = arg1;
        this.field5179 = arg3;
        this.field5174 = arg0;
        this.field5173 = arg2;
    }
}
