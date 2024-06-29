import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class33 extends class309 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lwo;")
    public class632 field257;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
    public static boolean field259;

    static {
        new class180("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field256 = 0;
        field258 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)[Lvj;", line = 3)
    public static final class373[] method189(int arg0) {
        field253++;
        return arg0 < 66 ? null : new class373[] { class398.field5231, class398.field5245, class464.field6493, class181.field2200, class364.field4784, class5.field41, class614.field8906, class443.field6112, class107.field1299, class504.field6988, class376.field5017, class253.field3267, class498.field6919, class258.field3318, class150.field1790, class547.field8048, class544.field7966, class479.field6732, class129.field1586, class430.field5840, class608.field8844, class108.field1346, class607.field8825, class546.field8035, class608.field8846, class217.field2662, class464.field6497, class448.field6209, class306.field3895, class240.field3000, class39.field298, class119.field1508, class204.field2442, class290.field3768, class298.field3836, class485.field6778, class211.field2576, class461.field6367, class314.field4006, class323.field4105, class303.field3860, class218.field2672, class389.field5145, class255.field3277, class319.field4066, class447.field6197, class157.field1918, class493.field6877, class323.field4100, class209.field2540, class36.field283, class6.field46, class544.field7972, class32.field252, class131.field1596, class563.field8280, class138.field1680, class81.field973, class491.field6849, class528.field7395, class164.field2001, class394.field5208, class4.field20, class301.field3855, class557.field8204, class584.field8488, class74.field868, class559.field8236, class151.field1807, class422.field5449, class185.field2238, class204.field2435, class39.field300, class86.field1042, class299.field3838, class242.field3106, class394.field5206, class613.field8884, class528.field7396, class82.field1000, class438.field6062, class187.field2254, class31.field242, class298.field3830, class358.field4707, class515.field7275, class97.field1196, class67.field647, class378.field5031, class541.field7910, class537.field7726, class99.field1234, class530.field7436, class535.field7513, class425.field5470, class184.field2228, class178.field2157, class377.field5025, class318.field4061, class570.field8369, class634.field9127, class493.field6880, class551.field8118, class311.field3975, class113.field1395, class604.field8723, class118.field1484, class333.field4320, class351.field4532, class604.field8718, class11.field85, client.field3217, class292.field3777, class603.field8713 };
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIIII)V", line = 27)
    public static final void method190(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 19) {
            method190((byte) -33, -38, 68, 60, -11, -38);
        }
        field254++;
        int var6 = arg5 - arg1;
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class35.method199(arg2, false, arg4, arg1, arg3);
            }
        } else if (var7 == 0) {
            class175.method975(arg4, arg5, 90, arg1, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class470.field6589 > arg5) {
                var10 = (class470.field6589 * var8 >> 12) + var9;
                var11 = class470.field6589;
            } else if (arg5 <= class592.field8588) {
                var10 = arg2;
                var11 = arg5;
            } else {
                var11 = class592.field8588;
                var10 = (class592.field8588 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg1 < class470.field6589) {
                var12 = class470.field6589;
                var13 = (class470.field6589 * var8 >> 12) + var9;
            } else if (class592.field8588 >= arg1) {
                var12 = arg1;
                var13 = arg4;
            } else {
                var12 = class592.field8588;
                var13 = (class592.field8588 * var8 >> 12) + var9;
            }
            if (class563.field8282 > var13) {
                var13 = class563.field8282;
                var12 = (class563.field8282 - var9 << 12) / var8;
            } else if (class271.field3513 < var13) {
                var13 = class271.field3513;
                var12 = (class271.field3513 - var9 << 12) / var8;
            }
            if (class563.field8282 > var10) {
                var11 = (class563.field8282 - var9 << 12) / var8;
                var10 = class563.field8282;
            } else if (class271.field3513 < var10) {
                var11 = (class271.field3513 - var9 << 12) / var8;
                var10 = class271.field3513;
            }
            class256.method1447(var11, var13, var10, (byte) 112, arg3, var12);
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 131)
    public static final void method191(int arg0) {
        field255++;
        int[] var1 = new int[class449.field6217.field4733];
        int var2 = 0;
        for (int var3 = 0; var3 < class449.field6217.field4733; var3++) {
            class607 var5 = class449.field6217.method2026((byte) -108, var3);
            if (var5.field8769 >= 0 || var5.field8803 >= 0) {
                var1[var2++] = var3;
            }
        }
        class343.field4416 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class343.field4416[var4] = var1[var4];
        }
        if (arg0 != 1070578988) {
            method191(39);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lmh;II[B)V", line = 167)
    public class33(class537 arg0, int arg1, int arg2, byte[] arg3) {
        this.field257 = class638.method3658((byte) -108, 6406, arg0, arg2, false, 6406, arg3, arg1);
        this.field257.method1671((byte) -46, false, false);
    }
}
