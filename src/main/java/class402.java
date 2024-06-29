import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class402 implements class55 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ljw;")
    public static class581 field5848 = new class581(70, 1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 12)
    public static final int method2505(int arg0, int arg1, int arg2) {
        if (arg2 > -125) {
            field5850 = 27;
        }
        field5849++;
        int var3 = arg1 >> 31 & arg0 - 1;
        return (arg1 + (arg1 >>> 31)) % arg0 + var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIJLmt;)Ljava/lang/String;", line = 25)
    public final String method397(int[] arg0, int arg1, long arg2, class419 arg3) {
        int var6 = 53 % ((arg1 - 52) / 51);
        field5846++;
        if (class83.field1168 == arg3) {
            class373 var7 = class446.field6253.method3005((byte) 126, arg0[0]);
            return var7.method2315(25851, (int) arg2);
        } else if (class554.field7475 == arg3 || class444.field6237 == arg3) {
            class322 var8 = class770.field10602.method2467(120, (int) arg2);
            return var8.field4668;
        } else if (class27.field401 == arg3 || class683.field9612 == arg3 || class758.field10510 == arg3) {
            return class446.field6253.method3005((byte) -20, arg0[0]).method2315(25851, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLlda;ZILlda;II)I", line = 57)
    public static final int method2506(boolean arg0, class513 arg1, boolean arg2, int arg3, class513 arg4, int arg5, int arg6) {
        field5844++;
        int var7 = class446.method2677(arg2, arg5, (byte) 19, arg4, arg1);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg6 != 6906) {
            return -35;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class446.method2677(arg0, arg3, (byte) 48, arg4, arg1);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 90)
    public static final void method2507(int arg0) {
        if (class413.field5935 >= 0) {
            long var1 = class302.method1910(0);
            class413.field5935 = (int) ((long) class413.field5935 - (var1 - class177.field2372));
            if (class413.field5935 <= 0) {
                class40.field638 = class791.field10888.field5094;
                class379.field5543 = class791.field10888.field5090;
                class380.field5557 = class791.field10888.field5085;
                class162.field2200 = class791.field10888.field5092;
                class490.field6804 = class791.field10888.field5096;
                class114.field1554 = class791.field10888.field5083;
                class3.field15 = class791.field10888.field5091;
                class306.field4437 = class791.field10888.field5082;
                class389.field5669 = class791.field10888.field5089;
                class413.field5935 = -1;
                class270.field3979 = class791.field10888.field5088;
            } else {
                int var3 = (class413.field5935 << 8) / class333.field4852;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class490.field6804 = ((class103.field1423 & 0xFF00FF) * var3 + (class791.field10888.field5096 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class103.field1423 & 0xFF00) * var3 + ((class791.field10888.field5096 & 0xFF00) * var4) & 0xFF0000) >>> 8;
                class379.field5543 = (class791.field10888.field5090 - class522.field7161) * var6 + class522.field7161;
                class306.field4437 = (class791.field10888.field5082 - class110.field1516) * var6 + class110.field1516;
                class270.field3979 = (class791.field10888.field5088 - class93.field1332) * var6 + class93.field1332;
                class114.field1554 = class13.field207 * var3 + class791.field10888.field5083 * var4 >> 8;
                class3.field15 = (class791.field10888.field5091 - class326.field4751) * var6 + class326.field4751;
                class380.field5557 = ((class11.field174 & 0xFF00FF) * var3 + ((class791.field10888.field5085 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class11.field174 & 0xFF00) * var3 + (class791.field10888.field5085 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class389.field5669 = (class791.field10888.field5089 - class364.field5308) * var6 + class364.field5308;
                class40.field638 = (class791.field10888.field5094 - class760.field10524) * var6 + class760.field10524;
                if (class652.field9037 != class791.field10888.field5092) {
                    class162.field2200 = class66.field937.method497(class652.field9037, class791.field10888.field5092, var6, class162.field2200);
                }
            }
            class177.field2372 = var1;
        }
        field5847++;
        if (arg0 != 2) {
            field5848 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 150)
    public static void method2508(boolean arg0) {
        if (!arg0) {
            field5850 = -61;
        }
        field5848 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIZIIII)V", line = 162)
    public static final void method2509(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class680.field9517 = arg5;
        class658.field9111 = arg4;
        class563.field7552 = arg3;
        class20.field287 = arg6;
        field5845++;
        if (arg0) {
            field5848 = null;
        }
        class76.field1101 = arg1;
        if (arg2 && class20.field287 >= 100) {
            class634.field8856 = class76.field1101 * 512 + 256;
            class350.field5138 = class563.field7552 * 512 + 256;
            class405.field5867 = class783.method4338(class610.field8296, class634.field8856, -12040, class350.field5138) - class680.field9517;
        }
        class502.field6938 = 2;
        class704.field9868 = -1;
        class518.field7072 = -1;
    }
}
