import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class296 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4684 = "white:";

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "F")
    public static float field4687 = 0.0F;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lph;")
    public static class203 field4685;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[I)[I")
    public static final int[] method1982(byte arg0, int[] arg1) {
        field4682++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 78) {
            field4684 = null;
        }
        int[] var2 = new int[arg1.length];
        class68.method533(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
    public static final int method1983(byte arg0) {
        field4683++;
        if (arg0 > -15) {
            field4684 = null;
        }
        return ((class179.field2991 ? 1 : 0) << 19) + (class282.field4476 << 17) + ((class112.field1735 & 0x3) << 11) + ((class153.field2496 ? 1 : 0) << 10) + ((class150.field2463 ? 1 : 0) << 9) + ((class153.field2495 ? 1 : 0) << 8) + ((class104.field1595 ? 1 : 0) << 7) + ((class112.field1731 ? 1 : 0) << 6) + (((class201.field3274 ? 1 : 0) << 3) + (class220.field3520 & 0x7) - -((class230.field3660 ? 1 : 0) << 4)) - (-((class151.field2470 ? 1 : 0) << 5) - ((class80.field1324 ? 1 : 0) << 13) - (((class89.field1425 ? 1 : 0) << 15) + ((class132.field2209 ? 1 : 0) << 16)) + -((class77.field1287 == 0 ? 0 : 1) << 20) - (((class274.field4382 == 0 ? 0 : 1) << 21) - (-((class111.field1719 == 0 ? 0 : 1) << 22) + -(class98.method741() << 23))));
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)[Lcj;")
    public static final class74[] method1984(byte arg0) {
        field4688++;
        if (arg0 != 5) {
            field4687 = -1.1910269F;
        }
        class74[] var1 = new class74[class132.field2195];
        for (int var2 = 0; var2 < class132.field2195; var2++) {
            var1[var2] = new class74(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], class66.field1082[var2], class244.field3857);
        }
        class213.method1410(0);
        return var1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1985(long arg0, int arg1) {
        field4686++;
        if (arg1 != 3026) {
            return null;
        } else if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var5);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class190.field3111[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        if (arg0 != -1637949142) {
            field4687 = -1.4372704F;
        }
        field4684 = null;
        field4685 = null;
    }
}
