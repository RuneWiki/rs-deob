import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lwa;")
    public static class75 field858 = class66.method560("(U0a )2 in: ", false);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[I")
    public static int[] field863 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[[[B")
    public static byte[][][] field860;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 10)
    public static final void method380(int arg0, int arg1) {
        field857++;
        if (class118.field2003 == arg1) {
            return;
        }
        if (class118.field2003 == 0) {
            class191.method1440((byte) -98);
        }
        if (arg1 == 40) {
            class164.method1227(class121.field2044, class117.field1991, (byte) 120, class121.field2046);
        }
        if (arg1 != 40 && class292.field5024 != null) {
            class292.field5024.method2048((byte) -119);
            class292.field5024 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class55.field916 = 0;
            class65.field1129 = 0;
            class139.field2409 = 1;
            class282.field4867 = 0;
            class228.field3828 = 1;
            class115.method881(0);
        }
        if (arg1 == 5) {
            class87.method702(-74, class136.field2333);
        } else {
            class178.method1313(21100);
        }
        boolean var2 = class118.field2003 == 5 || class118.field2003 == 10 || class118.field2003 == 28;
        boolean var3 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (var2 != var3) {
            if (var3) {
                class163.field2780 = class274.field4726;
                if (class164.field2783 == 0) {
                    class39.method266((byte) -114, 2);
                } else {
                    class221.method1624(0, class274.field4726, (byte) 115, false, class302.field5172, 255, 2);
                }
                class242.field4072.method23(2, false);
            } else {
                class39.method266((byte) -121, 2);
                class242.field4072.method23(2, true);
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class47.method338();
        }
        if (arg0 > 2) {
            class118.field2003 = arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 91)
    public static void method381(int arg0) {
        if (arg0 == 1) {
            field863 = null;
            field860 = (byte[][][]) null;
            field858 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 122)
    public static final void method382(int arg0) {
        field862++;
        class116.field1958.method1200(false);
        class282.field4855.method1200(false);
        int var1 = -67 / ((arg0 + 2) / 49);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLcb;Lcb;)I", line = 147)
    public static final int method383(byte arg0, class267 arg1, class267 arg2) {
        int var3 = 6 / ((45 - arg0) / 58);
        int var4 = 0;
        field861++;
        if (arg1.method1908(class306.field5237, (byte) -18)) {
            var4++;
        }
        if (arg1.method1908(class282.field4859, (byte) -18)) {
            var4++;
        }
        if (arg1.method1908(class180.field3027, (byte) -18)) {
            var4++;
        }
        if (arg2.method1908(class306.field5237, (byte) -18)) {
            var4++;
        }
        if (arg2.method1908(class282.field4859, (byte) -18)) {
            var4++;
        }
        if (arg2.method1908(class180.field3027, (byte) -18)) {
            var4++;
        }
        return var4;
    }
}
