import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class176 {

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "Lde;")
    private class534 field2461 = new class534(64);

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lnd;")
    private class547 field2466;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
    public static int[] field2464 = new int[3];

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "Lfia;")
    public static class577 field2467 = new class577(13, 0, 1, 0);

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Lvr;")
    public static class139 field2459;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1205(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2459 = null;
        if (arg0 <= -23) {
            field2464 = null;
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public final void method1207(byte arg0) {
        class534 var2 = this.field2461;
        synchronized (this.field2461) {
            this.field2461.method3065(true);
        }
        field2457++;
        if (arg0 > -32) {
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        field2463++;
        short var1 = 1024;
        short var2 = 3072;
        if (class232.field3053) {
            var2 = 4096;
            if (class690.field9598) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class101.field1404) {
            class101.field1404 = var1;
        }
        if (class101.field1404 > (float) var2) {
            class101.field1404 = var2;
        }
        while (class521.field7309 >= 16384.0F) {
            class521.field7309 -= 16384.0F;
        }
        while (class521.field7309 < 0.0F) {
            class521.field7309 += 16384.0F;
        }
        int var3 = class758.field10586 >> 9;
        int var4 = class347.field4454 >> 9;
        int var5 = class225.method1448(class472.field6329, class758.field10586, class347.field4454, (byte) 28);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < class409.field5183 - 4 && var4 < class543.field7597 - 4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class472.field6329;
                    if (var9 < 3 && class99.method797(var8, 1, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class197.field2685.field5200 != null && class197.field2685.field5200[var9] != null) {
                        var10 = (class197.field2685.field5200[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class195.field2669 != null && class195.field2669[var9] != null) {
                        int var11 = var10 + var5 - class195.field2669[var9].method1677(var8, (byte) 50, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (arg0 != 15030) {
            field2459 = null;
        }
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class538.field7468 < var12) {
            class538.field7468 += (var12 - class538.field7468) / 24;
        } else if (class538.field7468 > var12) {
            class538.field7468 += (var12 - class538.field7468) / 80;
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V")
    public final void method1209(int arg0) {
        field2462++;
        if (arg0 <= 98) {
            method1211(108, null);
        }
        class534 var2 = this.field2461;
        synchronized (this.field2461) {
            this.field2461.method3064(false);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lql;")
    public final class738 method1210(int arg0, int arg1) {
        field2458++;
        class534 var3 = this.field2461;
        class738 var4;
        synchronized (this.field2461) {
            var4 = (class738) this.field2461.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field2466;
        byte[] var6;
        synchronized (this.field2466) {
            var6 = this.field2466.method3153(arg1, 0, arg0);
        }
        class738 var7 = new class738();
        if (var6 != null) {
            var7.method4110(new class461(var6), true);
        }
        class534 var8 = this.field2461;
        synchronized (this.field2461) {
            this.field2461.method3077((byte) 93, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1211(int arg0, String arg1) {
        field2460++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 80) {
            field2459 = null;
        }
        for (int var2 = 0; var2 < class20.field370; var2++) {
            if (arg1.equalsIgnoreCase(class160.field2213[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class752.field10499[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BI)V")
    public final void method1212(byte arg0, int arg1) {
        field2465++;
        class534 var3 = this.field2461;
        synchronized (this.field2461) {
            if (arg0 != 4) {
                method1211(-34, null);
            }
            this.field2461.method3070(arg1, 120);
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lal;ILnd;)V")
    public class176(class102 arg0, int arg1, class547 arg2) {
        this.field2466 = arg2;
        this.field2466.method3178((byte) 32, 32);
    }
}
