import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class170 {

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2756 = -1;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "J")
    public static long field2750 = 0L;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "J")
    public long field2754;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lda;")
    public class312 field2745;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lda;")
    public class312 field2749;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lda;")
    public class312 field2755;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)I")
    public static final int method1269(boolean arg0) {
        if (arg0) {
            return 4;
        } else {
            field2747++;
            return 14;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
    public static final int method1270(int arg0) {
        field2746++;
        try {
            if (class306.field4958 == 0) {
                if (class188.method1355(99) - 5000L < class54.field948) {
                    return 0;
                }
                class244.field4100 = class142.field2344.method572(class205.field3286, (byte) -111, class57.field998);
                class107.field1748 = class188.method1355(99);
                class306.field4958 = 1;
            }
            if ((class107.field1748 + 30000L) < class188.method1355(-105)) {
                return class303.method2063(arg0 + 18625, 1000);
            }
            if (class306.field4958 == 1) {
                if (class244.field4100.field3091 == 2) {
                    return class303.method2063(-18, 1001);
                }
                if (class244.field4100.field3091 != 1) {
                    return -1;
                }
                class159.field2609 = new class144((Socket) class244.field4100.field3089, class142.field2344);
                class244.field4100 = null;
                class236.field3980.field4160 = 0;
                int var1 = 0;
                if (class258.field4339) {
                    var1 = class236.field3978;
                }
                class236.field3980.method1780(23, arg0 + 18858);
                class236.field3980.method1811(var1, (byte) 51);
                class159.field2609.method1066(class236.field3980.field4182, arg0 ^ 0x4928, class236.field3980.field4160, 0);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                int var2 = class159.field2609.method1064(false);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                if (var2 != 0) {
                    return class303.method2063(-118, var2);
                }
                class306.field4958 = 2;
            }
            if (arg0 != -18747) {
                return -50;
            }
            if (class306.field4958 == 2) {
                if (class159.field2609.method1065(arg0 ^ 0x4908) < 2) {
                    return -1;
                }
                class157.field2580 = class159.field2609.method1064(false);
                class157.field2580 <<= 0x8;
                class157.field2580 += class159.field2609.method1064(false);
                class253.field4301 = 0;
                class306.field4956 = new byte[class157.field2580];
                class306.field4958 = 3;
            }
            if (class306.field4958 != 3) {
                return -1;
            }
            int var3 = class159.field2609.method1065(arg0 ^ 0x4958);
            if (var3 < 1) {
                return -1;
            }
            if ((class157.field2580 - class253.field4301) < var3) {
                var3 = class157.field2580 - class253.field4301;
            }
            class159.field2609.method1069(var3, class306.field4956, class253.field4301, 6056);
            class253.field4301 += var3;
            if (class157.field2580 > class253.field4301) {
                return -1;
            } else if (class51.method328(class306.field4956, (byte) -52)) {
                class201.field3241 = new class208[class42.field636];
                int var4 = 0;
                for (int var5 = class280.field4647; var5 <= class130.field2146; var5++) {
                    class208 var6 = class4.method32((byte) 31, var5);
                    if (var6 != null) {
                        class201.field3241[var4++] = var6;
                    }
                }
                class159.field2609.method1070(arg0 ^ 0x4947);
                class256.field4320 = 0;
                class306.field4958 = 0;
                class159.field2609 = null;
                class306.field4956 = null;
                class54.field948 = class188.method1355(-64);
                return 0;
            } else {
                return class303.method2063(arg0 + 18668, 1002);
            }
        } catch (IOException var7) {
            return class303.method2063(-70, 1003);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
    public static final int method1271(byte arg0) {
        field2758++;
        int var1 = -29 / ((arg0 - 39) / 40);
        return 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    public static final void method1272(int arg0, int arg1) {
        if (class158.field2591 == null || arg1 > class158.field2591.length) {
            class158.field2591 = new int[arg1];
        }
        if (arg0 == 0) {
            field2759++;
        }
    }
}
