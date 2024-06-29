import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class58 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/lang/String;")
    public static String field876 = " ";

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lpk;")
    public static class120 field874;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[[[B")
    public static byte[][][] field872;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;Laj;)I", line = 6)
    public static final int method481(byte arg0, String arg1, class1 arg2) {
        if (arg0 != 19) {
            method483((byte) -53, (class266) null, 75, 16);
        }
        int var3 = arg2.field48;
        byte[] var4 = class142.method1090(arg1, true);
        field873++;
        arg2.method9(var4.length, arg0 - 20);
        arg2.field48 += class170.field2744.method211(arg2.field34, arg2.field48, -128, var4, 0, var4.length);
        return arg2.field48 - var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 29)
    public static void method482(int arg0) {
        field874 = null;
        if (arg0 == -20761) {
            field872 = (byte[][][]) null;
            field876 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLtk;II)V", line = 43)
    public static final void method483(byte arg0, class266 arg1, int arg2, int arg3) {
        field875++;
        if (class137.field2225 < 2 && class25.field428 == 0 && !class315.field4977 || arg0 < 86) {
            return;
        }
        String var4 = class299.method2120((byte) 126);
        if (arg1 == null) {
            int var5 = class146.field2392.method1472(var4, arg3 + 4, arg2 + 15, 16777215, 0, class99.field1587, class242.field3633);
            class318.method2250(var5 + class146.field2392.method1468(var4), -118, 15, arg3 + 4, arg2);
            return;
        }
        class205 var6 = arg1.method1846(64, class92.field1505);
        if (var6 == null) {
            var6 = class146.field2392;
        }
        var6.method1477(var4, arg3, arg2, arg1.field3941, arg1.field3939, arg1.field4076, arg1.field3923, arg1.field3921, arg1.field3949, class99.field1587, class242.field3633, class37.field552);
        class318.method2250(class37.field552[2], -104, class37.field552[3], class37.field552[0], class37.field552[1]);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method484(boolean arg0) {
        if (class86.field1388 < 128.0F) {
            class86.field1388 = 128.0F;
        }
        while (class171.field2747 >= 2048.0F) {
            class171.field2747 -= 2048.0F;
        }
        if (arg0) {
            return;
        }
        field871++;
        while (class171.field2747 < 0.0F) {
            class171.field2747 += 2048.0F;
        }
        int var1 = class2.field77 >> 7;
        if (class86.field1388 > 383.0F) {
            class86.field1388 = 383.0F;
        }
        int var2 = class306.field4858 >> 7;
        int var3 = class170.method1265(class306.field4858, class2.field77, class75.field1153, 1);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class75.field1153;
                    if (var7 < 3 && (class332.field5184[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class50.field766[var7][var5][var6] & 0xFF) * 8 + var3 - class85.field1374[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class315.field4971) {
            class315.field4971 += (var9 - class315.field4971) / 24;
        } else if (class315.field4971 > var9) {
            class315.field4971 += (var9 - class315.field4971) / 80;
        }
    }
}
