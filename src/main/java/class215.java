import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class215 implements class19 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Z")
    public static boolean field3038 = false;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
    public static boolean field3039 = true;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[J")
    public static long[] field3036 = new long[32];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
    public static int[] field3041 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1475(int arg0, int arg1, int arg2) {
        field3042++;
        if (arg2 == 1 || arg2 == 3) {
            return class138.field1841[arg1 & 0x3];
        } else {
            if (arg0 <= 17) {
                field3038 = false;
            }
            return class251.field3502[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 20)
    public static void method1476(int arg0) {
        field3041 = null;
        if (arg0 == -25067) {
            field3036 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lfg;ZJ[I)Ljava/lang/String;", line = 40)
    public final String method185(class84 arg0, boolean arg1, long arg2, int[] arg3) {
        field3043++;
        if (class175.field2347 == arg0) {
            class380 var6 = class496.field7314.method932((byte) 126, arg3[0]);
            return var6.method2389(arg1, (int) arg2);
        } else if (class303.field4428 == arg0 || class423.field6452 == arg0) {
            class74 var7 = class103.field1489.method1603((byte) -99, (int) arg2);
            return var7.field1077;
        } else if (class455.field6842 == arg0 || class173.field2328 == arg0 || class254.field3526 == arg0) {
            return class496.field7314.method932((byte) 126, arg3[0]).method2389(true, (int) arg2);
        } else {
            if (!arg1) {
                this.method185(null, false, 95L, null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)[Lla;", line = 79)
    public static final class319[] method1477(int arg0) {
        field3040++;
        if (arg0 != -1) {
            method1475(-106, -97, -46);
        }
        return new class319[] { class182.field2459, client.field2680, class535.field7857, class241.field3382, class179.field2396, class184.field2496, class194.field2597, class156.field2030, class183.field2478, class390.field5953, class137.field1825, class181.field2441, class250.field3476, class52.field732, class348.field5378, class352.field5437, class54.field757, class313.field4576, class178.field2377, class404.field6125, class411.field6250, class36.field523, class449.field6751, class280.field3972, class127.field1724, class421.field6418, class76.field1110, class106.field1492, class164.field2181, class441.field6652, class135.field1804, class391.field5976, class102.field1475, class380.field5792, class273.field3800, class240.field3377, class67.field956, class452.field6818, class448.field6748, class334.field5190, class289.field4217, class80.field1140, class176.field2349, class280.field3970, class52.field735, class204.field2726, class306.field4443, class434.field6589, class147.field1954, class153.field2005, class537.field7875, class134.field1800, class424.field6458, class9.field173, class77.field1117, class333.field5186, class502.field7415, class340.field5267, class152.field1989, class539.field7902, class276.field3931, class23.field333, client.field2673, class534.field7848, class465.field6937, class522.field7680, class309.field4496, class240.field3376, class502.field7403, class354.field5479, class290.field4251, class458.field6859, class380.field5791, class428.field6499, class125.field1683, class7.field151, class538.field7886, class280.field3971, class433.field6580, class321.field4651, class37.field528, class112.field1568, class77.field1121, class80.field1132, class63.field907, class514.field7550, class377.field5764, class414.field6304, class365.field5600, class540.field7915, class73.field1005, class511.field7512, class94.field1378, class496.field7320, class423.field6450, class60.field863, class524.field7707, class390.field5954, class434.field6585, class266.field3708, class288.field4212, class146.field1944, class294.field4290, class111.field1556, class375.field5697, class18.field297, class405.field6151, class106.field1496, class520.field7650, class143.field1914, class88.field1260, class501.field7392, class395.field6036, class520.field7655 };
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILwj;B)V", line = 90)
    public static final void method1478(int arg0, class275 arg1, byte arg2) {
        field3037++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field3817 > class393.field6017) {
            class118.method727(arg1, (byte) 46);
        } else if (class393.field6017 <= arg1.field3870) {
            class447.method2718(64, arg1);
        } else {
            class84.method578(false, arg1, true);
            var3 = class103.field1484;
            var4 = class235.field3331;
        }
        if (arg1.field1867 < 128 || arg1.field1862 < 128 || arg1.field1867 >= ((class398.field6071 - 1) * 128) || arg1.field1862 >= class528.field7734 * 128 - 128) {
            var3 = -1;
            arg1.field3870 = 0;
            arg1.field3850 = -1;
            arg1.field3871 = -1;
            arg1.field3863 = -1;
            arg1.field3817 = 0;
            var4 = 0;
            arg1.field1867 = arg1.field3917[0] * 128 + (arg1.method637((byte) -99) * 64);
            arg1.field1862 = arg1.field3915[0] * 128 + (arg1.method637((byte) -15) * 64);
            arg1.method1760(109);
        }
        if (class56.field800 == arg1 && (arg1.field1867 < 1536 || arg1.field1862 < 1536 || (class398.field6071 * 128 - 1536) <= arg1.field1867 || (class528.field7734 - 12) * 128 <= arg1.field1862)) {
            arg1.field3850 = -1;
            arg1.field3863 = -1;
            arg1.field3817 = 0;
            arg1.field3870 = 0;
            arg1.field3871 = -1;
            var4 = 0;
            var3 = -1;
            arg1.field1867 = arg1.field3917[0] * 128 + arg1.method637((byte) 34) * 64;
            arg1.field1862 = arg1.field3915[0] * 128 + arg1.method637((byte) -125) * 64;
            arg1.method1760(-42);
        }
        int var5 = class307.method1924((byte) 60, arg1);
        int var6 = 38 / ((arg2 + 67) / 44);
        class40.method328(arg1, var4, true, var3, var5);
        class184.method1249(arg1, (byte) 79);
    }
}
