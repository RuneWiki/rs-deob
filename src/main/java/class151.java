import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class151 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2232 = -1;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2233 = "Loaded input handler";

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        field2236++;
        class72.method570((byte) 8);
        class76.method598((byte) 119);
        class72.method571((byte) 42);
        class167.method1213(0);
        class166.method1204(80);
        class252.method1709(2);
        class268.method1820(-1989393656);
        class127.method952(127);
        class211.method1471(-1784196468);
        class60.method488((byte) 123);
        class18.method140(-123);
        class253.method1714((byte) -5);
        class19.method141(0);
        class48.method407(-88);
        class14.method112(arg0 + 1);
        class105.method798(true);
        class254.method1719((byte) -117);
        class73.method572(1);
        if (~class149.field2214 != arg0) {
            for (int var1 = 0; var1 < class6.field83.length; var1++) {
                class6.field83[var1] = null;
            }
            class174.field2685 = 0;
        }
        class91.method692((byte) -67);
        class130.method963((byte) 83);
        class294.method1950(true);
        class193.method1370((byte) -98);
        class213.field3271.method1172((byte) 114);
        ((class293) class224.field3596).method1945(128);
        class179.field2813.method1367(false);
        class104.field1631.method696(13440);
        class115.field1765.method696(13440);
        class264.field4184.method696(arg0 ^ 0xFFFFCB7F);
        class150.field2231.method696(13440);
        class274.field4369.method696(13440);
        class205.field3153.method696(13440);
        class233.field3687.method696(arg0 + 13441);
        class246.field3910.method696(13440);
        class77.field1176.method696(13440);
        class155.field2318.method696(13440);
        class114.field1750.method696(13440);
        class192.field3009.method1172((byte) 122);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method1094(byte arg0) {
        field2233 = null;
        int var1 = 35 % ((71 - arg0) / 51);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLub;)V")
    public static final void method1095(byte arg0, class92 arg1) {
        class9.field159 = arg1;
        if (arg0 != 69) {
            method1096((byte) -117, (byte[]) null);
        }
        field2237++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1096(byte arg0, byte[] arg1) {
        field2235++;
        if (arg0 != 37) {
            field2232 = 21;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class81.method638(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method1097(boolean arg0, int arg1) {
        if (!arg0) {
            method1095((byte) -24, (class92) null);
        }
        field2238++;
        return class148.field2196[arg1].length() > 0 ? class68.field1082[arg1] + class50.field812 + class148.field2196[arg1] : class68.field1082[arg1];
    }
}
