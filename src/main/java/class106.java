import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class106 {

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Lqg;")
    private class182 field1941 = new class182();

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lkh;")
    public static class117 field1929 = class224.method1450((byte) 127, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lkh;")
    public static class117 field1931 = class224.method1450((byte) 14, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lkh;")
    public static class117 field1925 = class224.method1450((byte) -5, "Versteckt");

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lkh;")
    public static class117 field1937 = class224.method1450((byte) 123, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "[Lkh;")
    public static class117[] field1939 = new class117[100];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lai;")
    public static class10 field1926;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lkb;")
    public static class111 field1935;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public static int[] field1927;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[[[B")
    public static byte[][][] field1932;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final void method706(boolean arg0, int arg1) {
        field1942++;
        byte var2 = 4;
        byte[][] var3 = class13.field412;
        for (int var4 = arg1; var4 < var2; var4++) {
            class93.method637(10000);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class163.field2972[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class216.field3936.length; var13++) {
                                if (class216.field3936[var13] == var12 && var3[var13] != null) {
                                    class50.method389(var4, var3[var13], var8, arg0, (var10 & 0x7) * 8, 103, (var11 & 0x7) * 8, var5 * 8, class173.field3123, var6 * 8, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILqg;)V")
    public final void method707(int arg0, class182 arg1) {
        if (arg1.field3293 != null) {
            arg1.method1254(false);
        }
        arg1.field3297 = this.field1941;
        arg1.field3293 = this.field1941.field3293;
        field1928++;
        arg1.field3293.field3297 = arg1;
        arg1.field3297.field3293 = arg1;
        if (arg0 != 31164) {
            this.method714((byte) 27);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZILsj;)V")
    public static final void method708(int arg0, boolean arg1, int arg2, class207 arg3) {
        if (!arg1) {
            field1935 = null;
        }
        field1938++;
        if (arg3.field4213 == arg2 && arg2 != -1) {
            class174 var4 = class81.method555(arg2, (byte) -104);
            int var5 = var4.field3128;
            if (var5 == 1) {
                arg3.field4274 = 0;
                arg3.field4225 = arg0;
                arg3.field4243 = 0;
                arg3.field4216 = 0;
                class99.method673(arg3.field4244, arg3.field4274, 32521, false, var4, arg3.field4221);
            }
            if (var5 == 2) {
                arg3.field4243 = 0;
                return;
            }
        } else if (arg2 == -1 || arg3.field4213 == -1 || class81.method555(arg2, (byte) 41).field3138 >= class81.method555(arg3.field4213, (byte) -117).field3138) {
            arg3.field4267 = arg3.field4272;
            arg3.field4213 = arg2;
            arg3.field4243 = 0;
            arg3.field4274 = 0;
            arg3.field4225 = arg0;
            arg3.field4216 = 0;
            if (arg3.field4213 == -1) {
                return;
            }
            class99.method673(arg3.field4244, arg3.field4274, 32521, false, class81.method555(arg3.field4213, (byte) 123), arg3.field4221);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method709(byte arg0) {
        if (arg0 != -48) {
            field1937 = null;
        }
        field1924++;
        for (class221 var1 = (class221) class119.field2257.method314((byte) -26); var1 != null; var1 = (class221) class119.field2257.method320(0)) {
            class177 var2 = var1.field3983;
            if (class203.field3675 != var2.field3205 || var2.field3211) {
                var1.method123((byte) -126);
            } else if (class44.field966 >= var2.field3193) {
                var2.method1229(class28.field691, (byte) -127);
                if (var2.field3211) {
                    var1.method123((byte) -126);
                } else {
                    class58.method438(var2.field3205, var2.field3197, var2.field3214, var2.field3198, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method710(boolean arg0) {
        field1939 = null;
        field1937 = null;
        field1935 = null;
        field1931 = null;
        field1926 = null;
        field1932 = null;
        field1929 = null;
        if (arg0) {
            field1925 = null;
            field1927 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLqg;)V")
    public final void method711(byte arg0, class182 arg1) {
        if (arg1.field3293 != null) {
            arg1.method1254(false);
        }
        int var3 = -109 % ((arg0 + 62) / 34);
        arg1.field3297 = this.field1941.field3297;
        field1933++;
        arg1.field3293 = this.field1941;
        arg1.field3293.field3297 = arg1;
        arg1.field3297.field3293 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method712(boolean arg0, Object arg1, boolean arg2) {
        if (arg2) {
            return null;
        }
        field1923++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class207.method1365(var3, 0) : var3;
        } else if (arg1 instanceof class110) {
            class110 var4 = (class110) arg1;
            return var4.method744((byte) -109);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Lqg;")
    public final class182 method713(byte arg0) {
        field1936++;
        class182 var2 = this.field1941.field3297;
        int var3 = 34 % ((-arg0 - 75) / 39);
        return this.field1941 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)Lqg;")
    public final class182 method714(byte arg0) {
        field1922++;
        class182 var2 = this.field1941.field3297;
        if (arg0 != -103) {
            return null;
        } else if (this.field1941 == var2) {
            return null;
        } else {
            var2.method1254(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class106() {
        this.field1941.field3297 = this.field1941;
        this.field1941.field3293 = this.field1941;
    }
}
