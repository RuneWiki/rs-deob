import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class452 {

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6625 = new String[] { method3506(method3505("U2ouO")), method3506(method3505("U2owO")), method3506(method3505("U2ovO")), method3506(method3505("U2opO")) };

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lsb;")
    public static class261 field6621 = new class261(106, 4);

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3501(int arg0, int arg1, int arg2) {
        try {
            field6623++;
            if (arg1 != 0) {
                field6624 = 111;
            }
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6625[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 25)
    public static final void method3502(byte arg0) {
        try {
            field6620++;
            class248.field3552.method781(2);
            class129.field1611.method4754((byte) 69);
            class732.field10450.method2756(116);
            class101.field1359.method2826(16);
            class321.field4379.method594((byte) -47);
            class153.field1955.method3240(true);
            class10.field132.method1887(true);
            class11.field153.method3480(125);
            class16.field203.method5244((byte) -12);
            class640.field9099.method1938((byte) 124);
            class272.field3853.method852(true);
            class135.field1750.method3956(-74);
            class772.field10996.method2794((byte) 75);
            class123.field1553.method2207(-122);
            class319.field4356.method2509(512);
            class646.field9183.method5251(true);
            class202.field2972.method608(0);
            class671.field9451.method1272(-18441);
            class463.field6758.method4691((byte) 93);
            class345.field5030.method4351((byte) 102);
            class443.field6547.method4511(33);
            class505.field7396.method4304(256);
            class561.field8158.method1409(-5835);
            class398.method3118(3);
            class257.method2146((byte) 105);
            class594.method4380(true);
            class499.method3830(1);
            int var1 = -6 % ((arg0 - 51) / 38);
            class647.method4718((byte) 119);
            class255.field3662.method2047(11914);
            class565.field8248.method2047(11914);
            class30.field378.method2047(11914);
            class282.field3973.method2047(11914);
            class158.field2027.method2047(11914);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6625[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(FIFFFFFI)F", line = 73)
    public static final float method3503(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
        try {
            field6622++;
            float var8 = 0.0F;
            float var9 = arg0 - arg3;
            float var10 = arg4 - arg2;
            float var11 = arg5 - arg6;
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;
            if (arg7 != -1) {
                field6624 = -75;
            }
            while (var8 < 1.1F) {
                float var15 = var8 * var9 + arg3;
                float var16 = var8 * var10 + arg2;
                float var17 = var8 * var11 + arg6;
                int var18 = (int) var15 >> 9;
                int var19 = (int) var17 >> 9;
                if (var18 > 0 && var19 > 0 && class625.field8929 > var18 && class14.field187 > var19) {
                    int var20 = class203.field2988.field2981;
                    if (var20 < 3 && (class76.field1089[1][var18][var19] & 0x2) != 0) {
                        var20++;
                    }
                    int var21 = class213.field3124[var20].method5440((byte) 15, (int) var15, (int) var17);
                    if (var16 > (float) var21) {
                        if (arg1 < 2) {
                            return var8;
                        }
                        return method3503(var15, arg1 - 1, var13, var12, var16, var17, var14, -1) * 0.1F + (var8 - 0.1F);
                    }
                }
                var14 = var17;
                var12 = var15;
                var8 += 0.1F;
                var13 = var16;
            }
            return -1.0F;
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field6625[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 138)
    public static void method3504(byte arg0) {
        try {
            field6621 = null;
            if (arg0 >= -20) {
                method3501(88, 98, -5);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6625[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3505(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3506(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
