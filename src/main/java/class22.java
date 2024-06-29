import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    public static int[] field479 = new int[4000];

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lrd;")
    public static class173 field484 = class133.method843(":tradereq:", -77);

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    public static volatile boolean field483 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lrd;")
    public static class173 field482 = class133.method843("(U", -98);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field486 = -1;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lrd;")
    public static class173 field472 = class133.method843("<col=ff7000>", -104);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lrd;")
    private static class173 field490 = class133.method843(" is already on your friend list)3", 65);

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lrd;")
    private static class173 field485 = class133.method843("skill)2", -124);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lrd;")
    public static class173 field471 = field485;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lrd;")
    public static class173 field473 = field490;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[I")
    public static int[] field492 = new int[500];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "J")
    public long field487;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ldd;")
    public class35 field475;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method183(byte arg0, byte[] arg1) {
        if (arg0 != 53) {
            return null;
        }
        class121 var2 = new class121(arg1);
        int var3 = var2.method751((byte) 94);
        field477++;
        int var4 = var2.method776(86);
        if (var4 < 0 || class78.field1533 != 0 && var4 > class78.field1533) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method770(49152, var7, 0, var4);
            return var7;
        } else {
            int var5 = var2.method776(71);
            if (var5 < 0 || class78.field1533 != 0 && class78.field1533 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class90.method573(var6, var5, arg1, var4, 9);
            } else {
                class71.field1389.method224(var6, true, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I")
    public static final int method184(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 9) {
            return 98;
        } else {
            field489++;
            return (4096 - arg1) * arg0 + arg1 * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Lrd;")
    public static final class173 method185(int arg0, long arg1) {
        field491++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 != -23750) {
                field490 = null;
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class147.field2779[(int) (var8 - arg1 * 37L)];
            }
            class173 var7 = new class173();
            var7.field3415 = var6;
            var7.field3379 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method186(boolean arg0) {
        field472 = null;
        field484 = null;
        field492 = null;
        field479 = null;
        field485 = null;
        if (arg0) {
            method185(-10, -94L);
        }
        field471 = null;
        field482 = null;
        field473 = null;
        field490 = null;
    }
}
