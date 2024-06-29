import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class66 extends class278 {

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    private int field910 = -1;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "Luf;")
    public static class310 field906 = new class310(32, 10);

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "J")
    public static long field914 = 0L;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "J")
    public static long field915 = 0L;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "Z")
    public static boolean field918 = false;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field917 = 0;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "F")
    public static float field913;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "F")
    public static float field916;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Lim;")
    public static class402 field911;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
    public int[] field907;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method409(int arg0, String arg1) {
        class41.field561 = arg1;
        ++field903;
        if (class282.field3804.field5516 != null) {
            try {
                if (arg0 != -955) {
                    method411(-70, true, false, -80, -83, 5, (class240) null);
                }
                String var2 = class282.field3804.field5516.getParameter("cookieprefix");
                String var3 = class282.field3804.field5516.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg1.length() == -1) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class114.method730(class333.method1850(-3562) + 94608000000L, 10) + "; Max-Age=" + 94608000L;
                }
                class484.method2856("document.cookie=\"" + var5 + "\"", (byte) 113, class282.field3804.field5516);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field912;
        if (arg2 == 0) {
            this.field910 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.method412(-110);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[[I")
    public int[][] method324(int arg0, int arg1) {
        ++field902;
        if (arg0 <= 75) {
            this.method324(-118, -9);
        }
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420 && this.method413(103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field905 * (~class307.field4211 != ~this.field909 ? this.field909 * arg1 / class307.field4211 : arg1);
            if (class507.field7456 != this.field905) {
                for (int var8 = 0; ~var8 > ~class507.field7456; ++var8) {
                    int var9 = this.field905 * var8 / class507.field7456;
                    int var10 = this.field907[var7 - -var9];
                    var6[var8] = class118.method750(var10, 255) << 4;
                    var5[var8] = class118.method750(4080, var10 >> 4);
                    var4[var8] = class118.method750(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class507.field7456 < ~var11; ++var11) {
                    int var12 = this.field907[var7++];
                    var6[var11] = class118.method750(var12 << 4, 4080);
                    var5[var11] = class118.method750(65280, var12) >> 4;
                    var4[var11] = class118.method750(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method410(boolean arg0) {
        ++field898;
        super.method410(arg0);
        this.field907 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZZIIILvh;)V")
    public static final void method411(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, class240 arg6) {
        class159.field2290 = arg6;
        if (arg2) {
            class261.field3590 = arg3;
            class510.field7488 = 1;
            ++field908;
            class305.field4187 = arg1;
            class362.field5020 = arg5;
            class284.field3821 = arg4;
            class281.field3795 = arg0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)I")
    public final int method412(int arg0) {
        ++field899;
        int var2 = 115 / ((arg0 - 69) / 41);
        return this.field910;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Z")
    public final boolean method413(int arg0) {
        ++field901;
        if (this.field907 != null) {
            return true;
        } else if (~this.field910 <= -1) {
            class531 var2 = ~class378.field5318 > -1 ? class531.method3126(class140.field1996, this.field910) : class531.method3134(class140.field1996, class378.field5318, this.field910);
            var2.method3127();
            this.field907 = var2.method3131();
            this.field909 = var2.field7815;
            this.field905 = var2.field7821;
            return true;
        } else {
            int var3 = 44 / ((arg0 - -50) / 63);
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLss;)Lss;")
    public static final class295 method414(byte arg0, class295 arg1) {
        ++field904;
        class295 var2 = client.method1199(arg1);
        if (arg0 <= 104) {
            field918 = false;
        }
        if (var2 == null) {
            var2 = arg1.field4027;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method415(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        ++field900;
        System.exit(1);
        int var2 = -76 % ((-22 - arg0) / 38);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public static void method416(byte arg0) {
        field911 = null;
        if (arg0 < -19) {
            field906 = null;
        }
    }
}
