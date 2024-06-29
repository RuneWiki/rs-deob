import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class123 {

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Loa;")
    public static class98 field1970 = class38.method349(255, "Titelbild geladen)3");

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Loa;")
    public static class98 field1976 = class38.method349(255, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "[Z")
    public static boolean[] field1978 = new boolean[112];

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Loa;")
    public static class98 field1981 = class38.method349(255, "sideicons");

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Loa;")
    private static class98 field1982 = class38.method349(255, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Loa;")
    public static class98 field1968 = field1982;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLtd;)Z")
    public static final boolean method705(byte arg0, class132 arg1) {
        int var2 = arg1.field3126;
        int var3 = 30 / ((31 - arg0) / 39);
        field1969++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class80.field1794++;
            class118.method935(0, class139.field3386, 35, -23060, 0, class102.method840(new class98[] { class146.field3549, class134.field3287[var2] }, 10), 0);
            class26.field636++;
            class118.method935(0, class138.field3368, 20, -23060, 0, class102.method840(new class98[] { class146.field3549, class134.field3287[var2] }, 10), 0);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class118.method935(0, class139.field3386, 41, -23060, 0, class102.method840(new class98[] { class146.field3549, arg1.field3204 }, 10), 0);
            class36.field880++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ltb;Ltb;ZII)Lfe;")
    public static final class41 method706(class130 arg0, class130 arg1, boolean arg2, int arg3, int arg4) {
        field1975++;
        boolean var5 = true;
        int[] var6 = arg1.method1061(arg3, 256);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method1059((byte) -9, arg3, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method1059((byte) -9, 0, var9);
                } else {
                    var10 = arg0.method1059((byte) -9, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            if (arg4 == 255) {
                return new class41(arg1, arg0, arg3, arg2);
            } else {
                return null;
            }
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLoc;)V")
    public static final void method707(byte arg0, class100 arg1) {
        field1983++;
        if (arg0 != 71) {
            return;
        }
        short var2 = 256;
        for (int var3 = 0; var3 < class79.field1738.length; var3++) {
            class79.field1738[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class79.field1738[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class140.field3430[var15] = (class79.field1738[var15 - 128] + class79.field1738[var15 - 1] + class79.field1738[var15 + 128] + class79.field1738[var15 - -1]) / 4;
                }
            }
            int[] var13 = class79.field1738;
            class79.field1738 = class140.field3430;
            class140.field3430 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2328; var7++) {
            for (int var8 = 0; var8 < arg1.field2325; var8++) {
                if (arg1.field2326[var6++] != 0) {
                    int var9 = arg1.field2322 + var8 + 16;
                    int var10 = arg1.field2324 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class79.field1738[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1981 = null;
        field1968 = null;
        if (arg0 != -452665785) {
            method708(-86);
        }
        field1978 = null;
        field1976 = null;
        field1970 = null;
        field1982 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
    public class86(int arg0) {
        this.field1971 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZII)V")
    public static final void method709(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1982 = null;
        }
        field1972++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class8.field194 = arg2;
        class74.field1549 = arg3;
        class32.field782 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhb;")
    public static final class51 method710(Throwable arg0, String arg1) {
        field1973++;
        class51 var2;
        if (arg0 instanceof class51) {
            var2 = (class51) arg0;
            var2.field1124 = var2.field1124 + ' ' + arg1;
        } else {
            var2 = new class51(arg0, arg1);
        }
        return var2;
    }
}
