import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class16 {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
    public static volatile boolean field437 = true;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field435 = 3;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lqe;")
    private static class179 field438 = class206.method1380("Press (Wrecover a locked account(W on front page)3", (byte) -26);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lqe;")
    public static class179 field433 = field438;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lqe;")
    public static class179 field441 = class206.method1380("und Ihr Passwort ein)3", (byte) -126);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ls;")
    public static class194 field434 = new class194(64);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lqe;")
    public static class179 field443 = class206.method1380("blinken1:", (byte) 32);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "J")
    public static long field445;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B[B)V")
    public abstract void method122(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)[B")
    public abstract byte[] method123(byte arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILae;)Lqe;")
    public static final class179 method124(int arg0, int arg1, class6 arg2) {
        if (arg1 != 4) {
            field434 = null;
        }
        field440++;
        if (!class116.method746(false, arg0, class159.method1026(arg2, arg1 - 1493540324)) && arg2.field155 == null) {
            return null;
        } else if (arg2.field159 == null || arg2.field159.length <= arg0 || arg2.field159[arg0] == null || arg2.field159[arg0].method1143(122).method1168(true) == 0) {
            return class69.field1378 ? class78.method502((byte) -113, new class179[] { class33.field717, class148.method949((byte) -14, arg0) }) : null;
        } else {
            return arg2.field159[arg0];
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method125(byte arg0) {
        field433 = null;
        field438 = null;
        field443 = null;
        if (arg0 != 40) {
            field443 = null;
        }
        field434 = null;
        field441 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public static final void method126(int arg0, int arg1) {
        field436++;
        if (arg0 == -3) {
            class105.method688(class128.field2349, class34.field740, class56.field1239, (byte) 34);
        } else if (arg0 == -2) {
            class105.method688(class22.field537, class34.field743, class34.field725, (byte) 34);
        } else if (arg0 == -1) {
            class105.method688(class128.field2352, class34.field773, class8.field250, (byte) 34);
        } else if (arg0 == 3) {
            class105.method688(class60.field1288, class34.field756, class34.field734, (byte) 34);
        } else if (arg0 == 4) {
            class105.method688(class93.field1756, class34.field767, class77.field1505, (byte) 34);
        } else if (arg0 == 5) {
            class105.method688(class6.field71, class34.field765, class34.field757, (byte) 34);
        } else if (arg0 == 6) {
            class105.method688(class40.field863, class34.field770, class217.field4025, (byte) 34);
        } else if (arg0 == 7) {
            class105.method688(class78.field1526, class34.field747, class135.field2505, (byte) 34);
        } else if (arg0 == 8) {
            class105.method688(class133.field2414, class34.field737, class165.field2987, (byte) 34);
        } else if (arg0 == 9) {
            class105.method688(class46.field992, class34.field730, class138.field2538, (byte) 34);
        } else if (arg0 == 10) {
            class105.method688(class39.field836, class34.field774, class165.field2986, (byte) 34);
        } else if (arg0 == 11) {
            class105.method688(class98.field1843, class34.field735, class215.field3988, (byte) 34);
        } else if (arg0 == 12) {
            class105.method688(class171.field3064, class34.field754, class42.field887, (byte) 34);
        } else if (arg0 == 13) {
            class105.method688(class128.field2346, class34.field745, class173.field3106, (byte) 34);
        } else if (arg0 == 14) {
            class105.method688(class127.field2327, class34.field766, class152.field2756, (byte) 34);
        } else if (arg0 == 16) {
            class105.method688(class4.field56, class34.field738, class209.field3929, (byte) 34);
        } else if (arg0 == 17) {
            class105.method688(class196.field3637, class34.field758, class18.field484, (byte) 34);
        } else if (arg0 == 18) {
            class105.method688(field433, class34.field750, class134.field2437, (byte) 34);
        } else if (arg0 == 19) {
            class105.method688(class18.field482, class78.field1516, class177.field3216, (byte) 34);
        } else if (arg0 == 20) {
            class105.method688(class128.field2347, class34.field746, class209.field3923, (byte) 34);
        } else if (arg0 == 22) {
            class105.method688(class98.field1842, class34.field727, class136.field2518, (byte) 34);
        } else if (arg0 == 23) {
            class105.method688(class127.field2320, class34.field736, class189.field3517, (byte) 34);
        } else if (arg0 == 24) {
            class105.method688(class240.field4408, class34.field760, class10.field283, (byte) 34);
        } else if (arg0 == 25) {
            class105.method688(class128.field2333, class34.field729, class50.field1074, (byte) 34);
        } else if (arg0 == 26) {
            class105.method688(class178.field3229, class34.field748, class152.field2754, (byte) 34);
        } else if (arg0 == 27) {
            class105.method688(class12.field319, class34.field752, class34.field761, (byte) 34);
        } else {
            class105.method688(class128.field2337, class34.field742, class53.field1170, (byte) 34);
        }
        class223.method1449((byte) 106, 10);
        if (arg1 != -27085) {
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BII)Lqe;")
    public static final class179 method127(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            field443 = null;
        }
        field442++;
        class179 var4 = new class179();
        var4.field3256 = new byte[arg0];
        var4.field3277 = 0;
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field3256[var4.field3277++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method128(int arg0) {
        class180.field3309.method1297((byte) 89);
        field439++;
        class111.field2070.method1339((byte) 98);
        if (arg0 != 5654) {
            method127(15, null, 0, 21);
        }
        class29.field643.method1339((byte) 82);
    }
}
