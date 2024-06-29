import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class234 {

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field3361 = -1;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
    public static boolean field3352 = false;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[J")
    public static long[] field3356 = new long[100];

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3357 = "wave:";

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lvn;", line = 10)
    public static final class11 method1662(int arg0) {
        field3364++;
        byte[] var1 = class338.field5276[0];
        if (arg0 <= 35) {
            method1663(-67, 47, -107, 27, 70, 30);
        }
        int var2 = class251.field3673[0] * class184.field2508[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class292.field4253[class335.method2339(var1[var4], 255)];
        }
        class11 var5 = new class11(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], var3);
        class236.method1685(false);
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)Z", line = 44)
    public static final boolean method1663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class71.field935[arg0][var8][var9] == -class130.field1770) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class74.field978[arg0][arg1][arg3] + arg5;
            if (!class218.method1582(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class218.method1582(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class218.method1582(var10, var12, var14)) {
                return false;
            } else if (class218.method1582(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class163.method1233(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class218.method1582(var6 + 1, class74.field978[arg0][arg1][arg3] + arg5, var7 + 1) && class218.method1582(var6 + 128 - 1, class74.field978[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class218.method1582(var6 + 128 - 1, class74.field978[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class218.method1582(var6 + 1, class74.field978[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lli;", line = 120)
    public static final class15 method1664(int arg0, int arg1) {
        field3351++;
        class15 var2 = (class15) class104.field1351.method2265((long) arg1, (byte) 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class318.field4691.method1089(class144.method1130(arg1, 101), (byte) 123, class303.method2121(arg1, (byte) -67));
        class15 var4 = new class15();
        var4.field176 = arg1;
        if (arg0 > -127) {
            return (class15) null;
        }
        if (var3 != null) {
            var4.method113(new class299(var3), false);
        }
        class104.field1351.method2257(-128, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLfh;)V", line = 145)
    public static final void method1665(byte arg0, class140 arg1) {
        field3353++;
        class71.field946 = class80.method570(arg1, class255.field3724, (byte) -118);
        class303.field4441 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class80.field1039[var2] >> 16 & 0xFF);
            int var4 = class80.field1039[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class80.field1039[var2] >> 8 & 0xFF);
            float var7 = (float) (class80.field1039[var2] & 0xFF);
            int var8 = class80.field1039[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var6) / 64.0F;
            int var10 = class80.field1039[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var7) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class303.field4441[var2 * 64 + var12] = class80.method568(class80.method568((int) var3 << 16, (int) var6 << 8), (int) var7);
                var6 += var9;
                var3 += var5;
                var7 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class303.field4441[var13] = class80.field1039[3];
        }
        class42.field524 = new int[32768];
        if (arg0 > -30) {
            field3356 = (long[]) null;
        }
        class312.field4582 = new int[32768];
        class308.method2149(103, (class153) null);
        class64.field809 = new int[32768];
        class339.field5303 = new int[32768];
        class282.field4020 = new class11(128, 254);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 208)
    public static void method1666(int arg0) {
        field3356 = null;
        if (arg0 != 255) {
            method1664(0, -118);
        }
        field3357 = null;
    }
}
