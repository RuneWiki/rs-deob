import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class126 {

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lpn;")
    public static class72 field1541 = new class72(73, 7);

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1543 = null;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1542;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[I")
    public static int[] field1544;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public static void method599(byte arg0) {
        if (arg0 == 27) {
            field1543 = null;
            field1542 = null;
            field1544 = null;
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method600(int arg0) {
        class456.field6434 = 0;
        class175.field2107 = 0;
        class110.field1354 = -1;
        class354.field5089 = 1;
        class105.field1268 = 0;
        if (arg0 != 128) {
            field1544 = null;
        }
        field1538++;
        class34.field414 = false;
        class224.field3107 = -3;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BZIILcj;)V")
    public static final void method601(byte arg0, boolean arg1, int arg2, int arg3, class198 arg4) {
        field1540++;
        int var5 = arg4.field2539[0];
        int var6 = arg4.field2536[0];
        if (var5 < 0 || var5 >= class159.field1895 || var6 < 0 || class289.field4316 <= var6) {
            return;
        }
        if (arg1) {
            field1543 = null;
        }
        if (arg3 < 0 || arg3 >= class159.field1895 || arg2 < 0 || arg2 >= class289.field4316) {
            return;
        }
        int var7 = class420.method2500(128, class174.field2093[arg4.field994], 0, 0, 0, 0, var6, arg3, var5, true, arg4.method1012(arg1), -4, class382.field5421, arg2, class166.field1978);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method1083(-1, arg0, class382.field5421[var8], class166.field1978[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lhu;ZIIIZI)V")
    public static final void method602(class207 arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1539++;
        if (class221.field3084 >= 50 || arg0 == null || arg0.field2852 == null || arg3 >= arg0.field2852.length || arg0.field2852[arg3] == null) {
            return;
        }
        int var7 = arg0.field2852[arg3][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE2) >> 5;
        if (arg0.field2852[arg3].length > 1) {
            int var10 = (int) ((double) arg0.field2852[arg3].length * Math.random());
            if (var10 > 0) {
                var8 = arg0.field2852[arg3][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                class291.method1831(0, var8, var9, 127, 255);
            }
        } else if (class376.field5363 != 0) {
            class342.field4898[class221.field3084] = var8;
            class58.field729[class221.field3084] = var9;
            class79.field943[class221.field3084] = 0;
            class305.field4511[class221.field3084] = null;
            class73.field881[class221.field3084] = 255;
            if (arg5) {
                field1542 = null;
            }
            int var12 = (arg2 - 64) / 128;
            int var13 = (arg4 - 64) / 128;
            class169.field2004[class221.field3084] = (arg6 << 24) + ((var12 << 16) - (-(var13 << 8) - var11));
            class221.field3084++;
        }
    }
}
