import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class103 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1333 = -1;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Lcc;")
    public static class327 field1335 = new class327(30);

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
    public static boolean field1343 = true;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
    public static boolean field1345 = false;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z", line = 11)
    public final boolean method727(int arg0) {
        field1341++;
        if (arg0 != -3378) {
            field1343 = true;
        }
        return (this.field1331 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lgh;", line = 27)
    public static final class44 method728(int arg0) {
        field1338++;
        try {
            return arg0 > -5 ? (class44) null : (class44) Class.forName("jg").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method729(byte arg0) {
        field1340++;
        if (arg0 > -120) {
            return false;
        } else {
            return (this.field1331 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Z", line = 57)
    public final boolean method730(byte arg0) {
        field1344++;
        if (arg0 <= 64) {
            return true;
        } else {
            return (this.field1331 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z", line = 68)
    public final boolean method731(int arg0) {
        if (arg0 != 1082) {
            this.method729((byte) -113);
        }
        field1342++;
        return (this.field1331 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 79)
    public static void method732(byte arg0) {
        if (arg0 != 122) {
            method733((byte) -52);
        }
        field1335 = null;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Lvn;", line = 91)
    public static final class11 method733(byte arg0) {
        field1336++;
        if (arg0 != 102) {
            field1345 = true;
        }
        byte[] var1 = class338.field5276[0];
        int var2 = class251.field3673[0] * class184.field2508[0];
        class11 var5;
        if (class104.field1356[0]) {
            int[] var6 = new int[var2];
            byte[] var7 = class199.field2812[0];
            for (int var8 = 0; var8 < var2; var8++) {
                var6[var8] = class80.method568(class335.method2339(var7[var8], 255) << 24, class292.field4253[class335.method2339(255, var1[var8])]);
            }
            var5 = new class301(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], var6);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class292.field4253[class335.method2339(255, var1[var4])];
            }
            var5 = new class11(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], var3);
        }
        class236.method1685(false);
        return var5;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z", line = 141)
    public static final boolean method734(int arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field1337++;
        class219 var3 = class345.method2392(arg0, 0);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        int var4 = 54 % ((-arg2 - 38) / 49);
        return var3.method1593(arg1, 23428);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILfh;II)[Luj;", line = 160)
    public static final class158[] method735(int arg0, class140 arg1, int arg2, int arg3) {
        field1339++;
        if (arg2 != 8693) {
            field1345 = true;
        }
        return class134.method1020(1, arg1, arg0, arg3) ? class321.method2225((byte) -46) : null;
    }
}
