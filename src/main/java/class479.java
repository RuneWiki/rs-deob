import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class479 {

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7067 = new String[] { method3712(method3711("Bl\u0003>;\u0005")), method3712(method3711("Bl\u0003>8\u0005")), method3712(method3711("Bl\u0003>:\u0005")) };

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Ldfa;")
    public static class477 field7063 = new class477(64);

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
    public static boolean field7066 = false;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field7065 = -1;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "Lcd;")
    public static class161 field7064;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)V")
    public static final void method3708(boolean arg0, int arg1) {
        try {
            field7062++;
            class451.field6612.method4681(0, class451.field6612.field9136, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9089, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9118, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9135, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9091, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9114, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9101, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9096, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9097, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9109, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9113, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9092, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9127, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9105, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9116, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9132, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9120, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9122, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9130, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9117, (byte) -111);
            class309.method2463(-2);
            class451.field6612.method4681(2, class451.field6612.field9090, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9103, (byte) -111);
            if (arg1 < 21) {
                method3710(6, -77, -14, 85, -10, 74, true, -74);
            }
            class139.method1214((byte) -108);
            class180.method1498((byte) 43);
            class381.field5555 = true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7067[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method3709(int arg0) {
        try {
            field7064 = null;
            field7063 = null;
            if (arg0 != 9697) {
                field7065 = 36;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7067[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method3710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            field7061++;
            int var8 = arg4 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class49.field708 - class272.field3857) * var8 / 100 + class272.field3857;
            class194.field2686 = class194.field2682 * var9 >> 8;
            int var17 = arg0 * var9 >> 8;
            int var10 = 16384 - arg3 & 0x3FFF;
            int var11 = 16384 - arg2 & 0x3FFF;
            int var12 = 0;
            int var13 = 0;
            int var14 = var17;
            if (arg6) {
                method3708(true, 67);
            }
            if (var10 != 0) {
                var13 = class487.field7151[var10] * -var17 >> 14;
                var14 = class487.field7150[var10] * var17 >> 14;
            }
            if (var11 != 0) {
                var12 = class487.field7151[var11] * var14 >> 14;
                var14 = class487.field7150[var11] * var14 >> 14;
            }
            class57.field802 = arg2;
            class688.field9635 = arg5 - var14;
            class282.field3974 = 0;
            class525.field7650 = arg7 - var13;
            class355.field5151 = arg3;
            class670.field9442 = arg1 - var12;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field7067[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3711(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3712(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
