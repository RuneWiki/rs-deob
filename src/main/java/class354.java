import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class354 extends class513 {

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[B")
    public byte[] field4735;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
    public static int[] field4730 = new int[25];

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[[B")
    public static byte[][] field4734;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method2000(int arg0) {
        field4733++;
        class534.field7800.method1502(arg0 ^ 0x62);
        class176.field2178.method2185(arg0);
        class616.field8848.method3440(16711935);
        class37.field703.method811(-40);
        class206.field2477.method1953(107);
        class65.field1021.method177((byte) 111);
        class195.field2367.method3268((byte) -113);
        class276.field3774.method140(-127);
        class342.field4519.method2675(53);
        class193.field2350.method684((byte) -2);
        class332.field4418.method726((byte) 79);
        class308.field4085.method564((byte) -90);
        class455.field6408.method3818(arg0 ^ 0xFFFFA572);
        class496.field6935.method1774(true);
        class582.field8483.method2534((byte) 13);
        class415.field5873.method2749(true);
        class32.field653.method2509(false);
        class39.field731.method1394(arg0 + 55);
        class404.field5708.method2762(-27411);
        class468.field6543.method1821(78);
        class112.method802(117);
        class109.method792((byte) -106);
        class4.method17((byte) -11);
        class523.method3096(true);
        if (class39.field729 != class215.field2737) {
            for (int var1 = 0; var1 < class432.field6202.length; var1++) {
                class432.field6202[var1] = null;
            }
            class424.field6103 = 0;
        }
        class685.method3883(true);
        class436.method2612(65535);
        class168.method1058(false);
        class139.method922(4941);
        class372.method2169(true);
        class545.field7926.method2776(false);
        class68.field1045.method302();
        class674.method3834(true);
        class621.method3550((byte) 98);
        class630.field9028.method3785((byte) 104);
        class622.field8936.method3785((byte) 98);
        class474.field6631.method3785((byte) 121);
        class502.field7007.method3785((byte) -71);
        class538.field7834.method3785((byte) -126);
        class89.field1249.method3785((byte) -48);
        class275.field3764.method3785((byte) -114);
        class123.field1589.method3785((byte) -40);
        class692.field9847.method3785((byte) -72);
        class416.field5897.method3785((byte) 91);
        class6.field62.method3785((byte) -86);
        class78.field1145.method3785((byte) 104);
        class351.field4691.method3785((byte) -114);
        class420.field5953.method3785((byte) 95);
        class166.field2040.method3785((byte) 109);
        class153.field1890.method3785((byte) 109);
        class361.field4803.method3785((byte) -76);
        class163.field1998.method3785((byte) 105);
        class618.field8872.method3785((byte) 91);
        class187.field2287.method3785((byte) 120);
        class469.field6553.method3785((byte) -120);
        class672.field9662.method3785((byte) 100);
        class704.field9963.method3785((byte) -38);
        class634.field9107.method3785((byte) 105);
        class70.field1068.method3785((byte) -77);
        class670.field9630.method3785((byte) -32);
        class568.field8300.method3785((byte) 97);
        class216.field2812.method3785((byte) 122);
        class384.field5116.method3785((byte) -72);
        class232.field3103.method3785((byte) -117);
        class384.field5115.method3785((byte) -111);
        class561.field8099.method3785((byte) 107);
        class89.field1252.method2776(false);
        class72.field1088.method2776(false);
        class48.field814.method2776(false);
        class514.field7541.method2776(false);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method2001(int arg0) {
        field4730 = null;
        field4734 = null;
        if (arg0 != 0) {
            method2001(-82);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
    public class354(byte[] arg0) {
        this.field4735 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILrh;Lrh;)V")
    public static final void method2002(int arg0, int arg1, int arg2, class242 arg3, class242 arg4) {
        class433 var5 = class222.method1354(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field6217 = arg3;
        var5.field6210 = arg4;
        int var6 = class340.field4500 == class155.field1899 ? 1 : 0;
        if (!arg3.method175(0)) {
            class67.field1036[var6][class571.field8344[var6]++] = arg3;
        } else if (arg3.method165((byte) -112)) {
            class516.field7547[var6][class596.field8613[var6]++] = arg3;
        } else {
            class549.field7969[var6][class196.field2370[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method175(0)) {
            if (arg4.method165((byte) -111)) {
                class516.field7547[var6][class596.field8613[var6]++] = arg4;
                return;
            }
            class549.field7969[var6][class196.field2370[var6]++] = arg4;
            return;
        }
        class67.field1036[var6][class571.field8344[var6]++] = arg4;
    }
}
