import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class375 {

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lsj;")
    private class266 field5484;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Lah;")
    private class216 field5475;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Lrj;")
    private class353 field5476;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[Lnj;")
    public static class133[] field5473 = new class133[2048];

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5470 = "purple:";

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[Lbb;")
    public static class182[] field5472 = new class182[14];

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field5479 = 0;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field5480 = 0;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "[I")
    public static int[] field5488 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Lbk;")
    private class211 field5487;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lra;")
    public static class57 field5483;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "[Lpi;")
    private class289[] field5478;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILwq;Lwq;IZ)Lpi;", line = 4)
    private final class289 method2351(int arg0, class93 arg1, class93 arg2, int arg3, boolean arg4) {
        field5481++;
        if (this.field5487 == null) {
            throw new RuntimeException();
        }
        if (arg3 >= -32) {
            method2358(false, -63, 88);
        }
        this.field5487.field2888 = arg0 * 8 + 5;
        if (this.field5487.field2867.length <= this.field5487.field2888) {
            throw new RuntimeException();
        } else if (this.field5478[arg0] == null) {
            int var6 = this.field5487.method1336((byte) -62);
            int var7 = this.field5487.method1336((byte) -111);
            class289 var8 = new class289(arg0, arg1, arg2, this.field5475, this.field5484, var6, var7, arg4);
            this.field5478[arg0] = var8;
            return var8;
        } else {
            return this.field5478[arg0];
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 57)
    public static final void method2352(byte arg0) {
        class118.field1411 = null;
        class147.field2062 = null;
        class45.field548 = null;
        class248.field3369 = null;
        class344.field5066 = null;
        class2.field20 = null;
        class159.field2260 = null;
        if (arg0 != 94) {
            return;
        }
        class176.field2449 = null;
        class287.field4059 = null;
        class159.field2258 = null;
        class225.field3075 = null;
        field5471++;
        class137.field1928 = null;
        class105.field1192 = null;
        class12.field130 = null;
        class166.field2328 = null;
        class51.field593 = null;
        class159.field2247 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V", line = 84)
    public static void method2353(byte arg0) {
        field5488 = null;
        field5483 = null;
        field5473 = null;
        field5470 = null;
        field5472 = null;
        if (arg0 != 88) {
            field5479 = 34;
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z", line = 102)
    public final boolean method2354(byte arg0) {
        field5477++;
        if (this.field5487 != null) {
            return true;
        }
        if (this.field5476 == null) {
            if (this.field5475.method1415(25501)) {
                return false;
            }
            this.field5476 = this.field5475.method1420(255, (byte) 0, 255, true, true);
        }
        if (arg0 <= 75) {
            this.method2354((byte) -65);
        }
        if (this.field5476.field1141) {
            return false;
        } else {
            this.field5487 = new class211(this.field5476.method84(-5714));
            this.field5478 = new class289[(this.field5487.field2867.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lra;I)V", line = 135)
    public static final void method2355(class57 arg0, int arg1) {
        class420.field6039 = arg0;
        field5474++;
        if (arg1 != 32) {
            field5479 = -87;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lwq;Lwq;IB)Lpi;", line = 149)
    public final class289 method2356(class93 arg0, class93 arg1, int arg2, byte arg3) {
        if (arg3 != -61) {
            this.method2351(5, (class93) null, (class93) null, 30, true);
        }
        field5485++;
        return this.method2351(arg2, arg1, arg0, -61, true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 164)
    public final void method2357(int arg0) {
        field5486++;
        if (this.field5478 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5478.length; var2++) {
            if (this.field5478[var2] != null) {
                this.field5478[var2].method1839(-32498);
            }
        }
        for (int var3 = arg0; var3 < this.field5478.length; var3++) {
            if (this.field5478[var3] != null) {
                this.field5478[var3].method1841(true);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)Z", line = 208)
    public static final boolean method2358(boolean arg0, int arg1, int arg2) {
        field5482++;
        if (!class81.field903) {
            return false;
        }
        if (arg0) {
            method2355((class57) null, -11);
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class224.field3054[var3] == null || class224.field3054[var3][var4] == null) {
            return false;
        }
        class119 var5 = class224.field3054[var3][var4];
        if (arg2 == -1 && var5.field1535 == 0) {
            for (class159 var6 = (class159) class32.field301.method1124(-1); var6 != null; var6 = (class159) class32.field301.method1119(false)) {
                if (var6.field2257 == 5 || var6.field2257 == 1004 || var6.field2257 == 8 || var6.field2257 == 48 || var6.field2257 == 20) {
                    for (class119 var7 = class179.method1170(var6.field2249, 818041328); var7 != null; var7 = class392.method2496(var7, 23263)) {
                        if (var5.field1424 == var7.field1424) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class159 var8 = (class159) class32.field301.method1124(-1); var8 != null; var8 = (class159) class32.field301.method1119(false)) {
                if (var8.field2266 == arg2 && var5.field1424 == var8.field2249 && (var8.field2257 == 5 || var8.field2257 == 1004 || var8.field2257 == 8 || var8.field2257 == 48 || var8.field2257 == 20)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lah;Lsj;)V", line = 275)
    public class375(class216 arg0, class266 arg1) {
        this.field5484 = arg1;
        this.field5475 = arg0;
        if (!this.field5475.method1415(25501)) {
            this.field5476 = this.field5475.method1420(255, (byte) 0, 255, true, true);
        }
    }
}
