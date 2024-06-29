import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class532 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field7449 = new int[1000];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[S")
    public static short[][] field7447;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldu;Lj;ILqa;ILao;II)V")
    public static final void method3058(class299 arg0, class463 arg1, int arg2, class207 arg3, int arg4, class240 arg5, int arg6, int arg7) {
        field7450++;
        int var8 = arg0.field4090 - (arg6 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg1.field6508 != 0) {
            arg3.method1368(var9, arg6 + 10, -var9 + arg5.method1497() * arg7 + (arg4 - -1), arg1.field6508, var8, (byte) -16);
        }
        if (arg1.field6528 != 0) {
            arg3.method1291(arg1.field6528, arg6 + 10, arg5.method1497() * arg7 + 1 + (arg4 - var9), var8, var9, 0);
        }
        int var10 = arg1.field6505;
        if (arg0.field4091 && arg1.field6534 != -1) {
            var10 = arg1.field6534;
        }
        for (int var11 = arg2; var11 < arg7; var11++) {
            String var12 = class118.field1937[var11];
            if ((arg7 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method1501(arg3, var12, arg0.field4090, arg4, var10, true);
            arg4 += arg5.method1497();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method3059(byte arg0) {
        class141.field2191.method2070(120);
        field7448++;
        class493.field6910.method1256(false);
        class412.field5801.method2727((byte) -69);
        class18.field227.method1204(-80);
        class516.field7253.method3269(true);
        class181.field2574.method864((byte) -104);
        class331.field4418.method196((byte) 29);
        class78.field1263.method1562(-87);
        class595.field8604.method2246(64);
        class534.field7474.method584((byte) 126);
        class263.field3678.method713(-91);
        class340.field4583.method3260(0);
        class163.field2366.method2134((byte) 112);
        class630.field9230.method2773(8);
        class533.field7455.method3118((byte) 50);
        class303.field4141.method2358(2);
        class358.field4823.method1157(8);
        class534.field7475.method2062((byte) 69);
        class62.field1080.method2539(112);
        class642.field9327.method3566(-1);
        class86.method647(true);
        class592.method3479(-1);
        class208.method1375(Integer.MAX_VALUE);
        int var1 = 123 / ((arg0 - 60) / 49);
        class516.method2980(-111);
        class41.field809.method3248(0);
        class365.field4963.method3248(0);
        class213.field3020.method3248(0);
        class35.field674.method3248(0);
        class123.field2013.method3248(0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
    public static final boolean method3060(int arg0, int arg1) {
        field7452++;
        if ((short) arg1 == arg0 || arg0 == 57 || arg0 == 22 || arg0 == 10 || arg0 == 1011) {
            return true;
        } else {
            return arg0 == 58 || arg0 == 1008;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method3061(int arg0) {
        int var1 = -78 / ((8 - arg0) / 33);
        field7447 = null;
        field7449 = null;
    }
}
