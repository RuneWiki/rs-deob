import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class115 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lea;")
    private class46 field2201 = new class46();

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Llj;")
    private class129 field2210 = new class129();

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field2207;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Llc;")
    private class122 field2211;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lmb;")
    private static class132 field2206 = class166.method1092("Hidden", 114);

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lmb;")
    private static class132 field2204 = class166.method1092("Loaded interfaces", 124);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lmb;")
    public static class132 field2195 = field2206;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lmb;")
    public static class132 field2197 = field2204;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lmb;")
    private static class132 field2213 = class166.method1092("Loading sprites )2 ", 121);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lmb;")
    public static class132 field2205 = field2213;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            method773(-87);
        }
        field2198++;
        class219 var5 = (class219) class231.field4166.method806(-1, (long) arg4);
        if (var5 == null) {
            var5 = new class219();
            class231.field4166.method810(var5, (long) arg4, arg3 - 18274);
        }
        if (arg2 >= var5.field3997.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3997.length; var8++) {
                var6[var8] = var5.field3997[var8];
                var7[var8] = var5.field3998[var8];
            }
            for (int var9 = var5.field3997.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3997 = var6;
            var5.field3998 = var7;
        }
        var5.field3997[arg2] = arg1;
        var5.field3998[arg2] = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lnj;")
    public final class151 method771(byte arg0) {
        if (arg0 == 78) {
            field2203++;
            return this.field2211.method807(-19009);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Lnj;")
    public final class151 method772(boolean arg0) {
        field2199++;
        return arg0 ? null : this.field2211.method811((byte) -4);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method773(int arg0) {
        field2206 = null;
        if (arg0 >= -47) {
            field2206 = null;
        }
        field2205 = null;
        field2204 = null;
        field2213 = null;
        field2197 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JLea;I)V")
    public final void method774(long arg0, class46 arg1, int arg2) {
        if (this.field2212 == 0) {
            class46 var5 = this.field2210.method853(-43);
            var5.method995((byte) 109);
            var5.method306((byte) -114);
            if (this.field2201 == var5) {
                class46 var6 = this.field2210.method853(arg2 - 102);
                var6.method995((byte) 93);
                var6.method306((byte) -80);
            }
        } else {
            this.field2212--;
        }
        if (arg2 == 0) {
            field2202++;
            this.field2211.method810(arg1, arg0, -18274);
            this.field2210.method845(arg2 + 4521, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BJ)V")
    public final void method775(byte arg0, long arg1) {
        if (arg0 != 80) {
            this.method772(false);
        }
        class46 var4 = (class46) this.field2211.method806(-1, arg1);
        if (var4 != null) {
            var4.method995((byte) -35);
            var4.method306((byte) -83);
            this.field2212++;
        }
        field2194++;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static final void method776(int arg0) {
        if (!class202.field3721) {
            class8.field82[0] = class187.field3475;
            class57.field974 = 1;
            class95.field1679[0] = class75.field1247;
            class31.field488[0] = 1007;
        }
        field2214++;
        if (class45.field784 != -1) {
            class214.method1336(class45.field784, -26564);
        }
        for (int var1 = 0; var1 < client.field536; var1++) {
            if (class196.field3636[var1]) {
                class36.field603[var1] = true;
            }
            class25.field410[var1] = class196.field3636[var1];
            class196.field3636[var1] = false;
        }
        class31.field483 = -1;
        class55.field942 = class30.field460;
        class222.field4052 = -1;
        class111.field2101 = null;
        if (class45.field784 != -1) {
            client.field536 = 0;
            class163.method1055(0, class45.field784, false, class47.field813, 0, -1, 0, class187.field3461, 0);
        }
        class239.method1519();
        class218.method1362((byte) -87);
        int var2 = 29 % ((10 - arg0) / 56);
        if (class202.field3721) {
            class215.method1340((byte) 116);
        } else if (class31.field483 != -1) {
            class72.method440(class31.field483, (byte) -82, class222.field4052);
        }
        if (class205.field3757 == 3) {
            for (int var3 = 0; var3 < client.field536; var3++) {
                if (class25.field410[var3]) {
                    class239.method1531(class203.field3725[var3], class236.field4270[var3], class13.field168[var3], class128.field2382[var3], 16711935, 128);
                } else if (class36.field603[var3]) {
                    class239.method1531(class203.field3725[var3], class236.field4270[var3], class13.field168[var3], class128.field2382[var3], 16711680, 128);
                }
            }
        }
        class53.method363(class210.field3854.field723, class139.field2615, class112.field2118, class210.field3854.field673, true);
        class112.field2118 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)Lea;")
    public final class46 method777(int arg0, long arg1) {
        field2209++;
        class46 var4 = (class46) this.field2211.method806(arg0, arg1);
        if (var4 != null) {
            this.field2210.method845(4521, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public final void method778(byte arg0) {
        field2208++;
        while (true) {
            class46 var2 = this.field2210.method853(-102);
            if (var2 == null) {
                this.field2212 = this.field2207;
                if (arg0 < 92) {
                    method770(106, -89, -66, 112, -24);
                    return;
                } else {
                    return;
                }
            }
            var2.method995((byte) -59);
            var2.method306((byte) -123);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        int var2 = 1;
        this.field2212 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2207 = arg0;
        this.field2211 = new class122(var2);
    }
}
