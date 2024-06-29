import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class135 extends class124 {

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lr;")
    private static class66 field2501 = class93.method641(43, "Created gameworld");

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "[I")
    public static int[] field2504 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lr;")
    private static class66 field2503 = class93.method641(43, "Choose Option");

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "Lha;")
    public static class63 field2502 = null;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "Lr;")
    public static class66 field2508 = class93.method641(43, "Ablegen");

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "Lr;")
    public static class66 field2500 = field2503;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lr;")
    public static class66 field2497 = class93.method641(43, ":clanreq:");

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "Lr;")
    public static class66 field2498 = field2501;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static void method930(byte arg0) {
        field2504 = null;
        field2508 = null;
        field2497 = null;
        field2500 = null;
        field2502 = null;
        field2503 = null;
        field2498 = null;
        field2501 = null;
        if (arg0 != -27) {
            field2501 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field2499;
            int[][] var3 = super.field1946.method823(arg0, (byte) -99);
            if (super.field1946.field2297 && this.method854(0)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field2339 * super.field2339;
                for (int var8 = 0; class199.field3432 > var8; ++var8) {
                    int var9 = super.field2330[var7 - -(var8 % super.field2340)];
                    var6[var8] = class115.method767(255, var9) << 4;
                    var5[var8] = class115.method767(4080, var9 >> 4);
                    var4[var8] = class115.method767(4080, var9 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLr;)Z")
    public static final boolean method931(byte arg0, class66 arg1) {
        ++field2507;
        try {
            int var2 = arg1.method462((byte) -124, 44);
            if (~var2 == 0) {
                return false;
            } else {
                class66 var3 = arg1.method477(0, (byte) -74, var2);
                class66 var4 = arg1.method485(var2 - -1, true);
                MessageDigest var5 = MessageDigest.getInstance("SHA");
                var5.reset();
                var5.update(var3.method445((byte) -124));
                byte[] var6 = var5.digest();
                byte[] var7 = var4.method476((byte) 24);
                class249 var8 = new class249(5000);
                var8.method1669(var7.length, (byte) 118, 0, var7);
                var8.field4335 = 0;
                var8.method1679(class25.field319, (byte) -88, class166.field2986);
                if (var8.field4350[0] != 1) {
                    return false;
                } else {
                    if (arg0 >= -87) {
                        field2508 = null;
                    }
                    for (int var9 = 0; ~var9 > -21; ++var9) {
                        if (var8.field4350[var9 + 1] != var6[var9]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)I")
    public static final int method932(int arg0) {
        ++field2505;
        if ((double) class69.field1399 == 3.0D) {
            return 37;
        } else {
            if (arg0 != 50) {
                field2502 = null;
            }
            if ((double) class69.field1399 == 4.0D) {
                return 50;
            } else {
                return (double) class69.field1399 == 6.0D ? 75 : 100;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)Lic;")
    public static final class197 method933(int arg0, int arg1, byte arg2) {
        ++field2506;
        if (arg2 >= -119) {
            method932(29);
        }
        class197 var3 = (class197) class2.field33.method1381((long) arg1 << 32 | (long) arg0, -104);
        if (var3 == null) {
            var3 = new class197(arg1, arg0);
            class2.field33.method1380((byte) 121, var3, var3.field1560);
        }
        return var3;
    }
}
