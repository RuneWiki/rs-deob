import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class232 extends class228 {

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Loa;")
    public static class99 field3992 = class221.method1463(2844, "overlay");

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "Loa;")
    public static class99 field4000 = class221.method1463(2844, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "[[I")
    public static int[][] field4001 = new int[104][104];

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Lwk;")
    public static class273 field3993 = new class273(100);

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "Loa;")
    private static class99 field4007 = class221.method1463(2844, "Aug");

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "Loa;")
    private static class99 field4004 = class221.method1463(2844, "Apr");

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "Loa;")
    private static class99 field4008 = class221.method1463(2844, "Jun");

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "Loa;")
    private static class99 field4009 = class221.method1463(2844, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "Loa;")
    private static class99 field4003 = class221.method1463(2844, "Jul");

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Loa;")
    private static class99 field4005 = class221.method1463(2844, "Dec");

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "Loa;")
    private static class99 field4014 = class221.method1463(2844, "Oct");

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "Loa;")
    private static class99 field4010 = class221.method1463(2844, "May");

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "Loa;")
    private static class99 field4012 = class221.method1463(2844, "Nov");

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "Loa;")
    private static class99 field4011 = class221.method1463(2844, "Mar");

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Loa;")
    private static class99 field4006 = class221.method1463(2844, "Jan");

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "Loa;")
    private static class99 field4016 = class221.method1463(2844, "Sep");

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "Loa;")
    private static class99 field4013 = class221.method1463(2844, "Feb");

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "[Loa;")
    public static class99[] field4015 = new class99[] { field4006, field4013, field4011, field4004, field4010, field4008, field4003, field4007, field4016, field4014, field4012, field4005 };

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "Loa;")
    public static class99 field4017 = field4009;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "[B")
    public static byte[] field4002;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "[Z")
    public static boolean[] field3996;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V")
    public static final void method1514(boolean arg0, boolean arg1) {
        int var2 = class190.field3342;
        if (arg1) {
            var2 = 1;
        }
        ++field3995;
        if (arg0) {
            if (~(class168.field3006.field1325 >> 7) == ~class18.field195 && ~(class168.field3006.field1301 >> 7) == ~class118.field2096) {
                class18.field195 = 0;
            }
            for (int var3 = 0; var2 > var3; ++var3) {
                long var4;
                class183 var6;
                if (arg1) {
                    var4 = 8791798054912L;
                    var6 = class168.field3006;
                } else {
                    var6 = class259.field4515[class105.field1765[var3]];
                    var4 = (long) class105.field1765[var3] << 32;
                }
                if (var6 != null && var6.method526(33)) {
                    var6.field3214 = false;
                    if ((class164.field2876 && ~class190.field3342 < -201 || ~class190.field3342 < -51) && !arg1 && ~var6.field1308 == ~var6.field1282) {
                        var6.field3214 = true;
                    }
                    int var7 = var6.field1325 >> 7;
                    int var8 = var6.field1301 >> 7;
                    if (var7 >= 0 && var7 < 104 && ~var8 <= -1 && ~var8 > -105) {
                        if (var6.field3215 != null && class56.field926 >= var6.field3251 && ~var6.field3213 < ~class56.field926) {
                            var6.field3214 = false;
                            var6.field1319 = class115.method777(-1, var6.field1301, class255.field4407, var6.field1325);
                            class76.method538(class255.field4407, var6.field1325, var6.field1301, var6.field1319, var6, var6.field1296, var4, var6.field3219, var6.field3233, var6.field3256, var6.field3240);
                        } else {
                            if (~var6.method516((byte) -65) == -2 && ~(var6.field1325 & 127) == -65 && ~(var6.field1301 & 127) == -65) {
                                if (class28.field531[var7][var8] == class55.field904) {
                                    continue;
                                }
                                class28.field531[var7][var8] = class55.field904;
                            }
                            var6.field1319 = class115.method777(-1, var6.field1301, class255.field4407, var6.field1325);
                            class1.method7(class255.field4407, var6.field1325, var6.field1301, var6.field1319, 60 + 64 * var6.method516((byte) -65) + -64, var6, var6.field1296, var4, var6.field1309);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)I")
    private final int method1515(int arg0, int arg1, int arg2) {
        ++field3994;
        int var4 = -47 % ((arg1 - -27) / 53);
        int var5 = arg0 - -(arg2 * 57);
        int var6 = var5 ^ var5 << 1;
        return -((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ltg;IBI)[Lpi;")
    public static final class139[] method1516(class182 arg0, int arg1, byte arg2, int arg3) {
        ++field3999;
        if (!class153.method1016(arg3, 21451, arg0, arg1)) {
            return null;
        } else {
            if (arg2 < 44) {
                method1514(false, false);
            }
            return class144.method982(true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            int[] var3 = super.field3952.method1262(arg0, 7492);
            ++field3998;
            if (super.field3952.field3276) {
                int var4 = class54.field879[arg0];
                for (int var5 = 0; ~var5 > ~class234.field4046; ++var5) {
                    var3[var5] = this.method1515(class281.field4923[var5], -120, var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method1517(int arg0) {
        field4004 = null;
        field4009 = null;
        field4013 = null;
        if (arg0 != 22742) {
            field4006 = null;
        }
        field3993 = null;
        field4017 = null;
        field3992 = null;
        field4002 = null;
        field4014 = null;
        field4010 = null;
        field4007 = null;
        field4016 = null;
        field4001 = null;
        field4011 = null;
        field4003 = null;
        field3996 = null;
        field4000 = null;
        field4008 = null;
        field4012 = null;
        field4015 = null;
        field4006 = null;
        field4005 = null;
    }
}
