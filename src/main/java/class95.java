import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class95 extends class10 {

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lps;")
    public class63 field1285;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "F")
    public static float field1283;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Lgh;")
    public static class383 field1280;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method824(int arg0) {
        field1281++;
        if (arg0 != -9410) {
            field1282 = -125;
        }
        class139.field1976 = null;
        class205.method1434(0, -1, 0, class94.field1278, class64.field761, class410.field6100, 0, (byte) 27, 0);
        if (class139.field1976 != null) {
            class138.method1040(0, class94.field1278, class21.field239, class326.field4577.field2749, class139.field1976, 0, -1412584499, class410.field6100, class147.field2067, -1268043624);
            class139.field1976 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public static void method825(int arg0) {
        if (arg0 == 19274) {
            field1280 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static final void method826(int arg0) {
        class347.field4824 = 0;
        class450.field6642 = false;
        class473.field6982 = -1;
        class455.field6701 = 0;
        field1284++;
        class495.field7265 = 0;
        class172.field2444 = arg0;
        class428.field6307 = -3;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lfd;II[B)V")
    public class95(class365 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1285 = class482.method2907(false, (byte) -122, arg3, arg0, arg1, arg2, 6406, 6406);
        this.field1285.method1882(10497, false, false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method827(int arg0, String arg1, int arg2, String arg3) {
        class336.field4677 = arg1;
        class123.field1796 = arg3;
        field1286++;
        class412.field6114 = arg2;
        if (class336.field4677.equals("") || class123.field1796.equals("")) {
            class428.field6307 = 3;
        } else if (class77.field1046 == -1) {
            class428.field6307 = -3;
            class24.field289 = 0;
            class171.field2439 = 1;
            class88.field1196 = 0;
            class65 var4 = new class65(128);
            var4.method638(255, 10);
            var4.method618((int) (Math.random() * 9.9999999E7D), (byte) -70);
            var4.method591(class141.method1055(1, class336.field4677), (byte) -48);
            var4.method618((int) (Math.random() * 9.9999999E7D), (byte) -63);
            var4.method605(80, class123.field1796);
            var4.method618((int) (Math.random() * 9.9999999E7D), (byte) 109);
            var4.method609(class496.field7276, (byte) -107, class523.field7684);
            class472.field6970.field827 = 0;
            if (arg0 != 6745) {
                method824(-41);
            }
            class472.field6970.method638(255, class215.field3093.field3575);
            class472.field6970.method638(arg0 ^ 0x1AA6, var4.field827 + 2);
            class472.field6970.method611((byte) 67, 592);
            class472.field6970.method606(0, true, var4.field783, var4.field827);
        } else {
            method826(1);
        }
    }
}
