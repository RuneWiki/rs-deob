import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class266 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lwm;")
    private class399 field4040 = new class399(64);

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lwm;")
    public class399 field4048 = new class399(2);

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lph;")
    private class459 field4046;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lph;")
    public class459 field4045;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field4047 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public final void method1692(int arg0, int arg1) {
        class399 var3 = this.field4040;
        synchronized (this.field4040) {
            this.field4040.method2471((byte) 98, arg1);
        }
        if (arg0 != 8) {
            this.method1694(-90, true);
        }
        field4044++;
        class399 var4 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method2471((byte) 98, arg1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1693(int arg0) {
        field4043++;
        class399 var2 = this.field4040;
        synchronized (this.field4040) {
            this.field4040.method2477(arg0 ^ 0xA1);
        }
        if (arg0 != 255) {
            this.field4046 = null;
        }
        class399 var3 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method2477(-109);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Luo;")
    public final class409 method1694(int arg0, boolean arg1) {
        field4038++;
        class399 var3 = this.field4040;
        class409 var4;
        synchronized (this.field4040) {
            var4 = (class409) this.field4040.method2478(1, (long) arg0);
        }
        if (arg1) {
            this.method1694(-15, false);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field4046;
        byte[] var6;
        synchronized (this.field4046) {
            var6 = this.field4046.method2757(33, arg0, (byte) -124);
        }
        class409 var7 = new class409();
        var7.field6198 = this;
        if (var6 != null) {
            var7.method2536(0, new class289(var6));
        }
        class399 var8 = this.field4040;
        synchronized (this.field4040) {
            this.field4040.method2472(112, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsm;)V")
    public static final void method1695(class188 arg0) {
        if (class429.field6417 >= 65535) {
            return;
        }
        class256 var1 = arg0.field3015;
        class248.field3825[class429.field6417] = arg0;
        class48.field989[class429.field6417] = false;
        class429.field6417++;
        int var2 = arg0.field3021;
        if (arg0.field3019) {
            var2 = 0;
        }
        int var3 = arg0.field3021;
        if (arg0.field3027) {
            var3 = class138.field2320 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1653((byte) -75) + class421.field6346 - var1.method1647(-124) >> class353.field5216;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1653((byte) -75) + var1.method1647(-117) - class421.field6346 >> class353.field5216;
            if (var7 >= class220.field3464) {
                var7 = class220.field3464 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field3026[var5++];
                int var10 = (var1.method1646(-106) + class421.field6346 - var1.method1647(-125) >> class353.field5216) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class493.field7231) {
                    var11 = class493.field7231 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class383.field5598[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class383.field5598[var4][var12][var8] = var13 | (long) class429.field6417;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class383.field5598[var4][var12][var8] = var13 | (long) class429.field6417 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class383.field5598[var4][var12][var8] = var13 | (long) class429.field6417 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class383.field5598[var4][var12][var8] = var13 | (long) class429.field6417 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public final void method1696(int arg0) {
        field4041++;
        class399 var2 = this.field4040;
        synchronized (this.field4040) {
            this.field4040.method2475((byte) 67);
        }
        class399 var3 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method2475((byte) 67);
            if (arg0 != 22729) {
                this.method1693(-100);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lkp;ILph;Lph;)V")
    public class266(class341 arg0, int arg1, class459 arg2, class459 arg3) {
        this.field4046 = arg2;
        this.field4045 = arg3;
        this.field4046.method2763(33, -3);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1697(int arg0, char arg1, String arg2) {
        field4049++;
        int var3 = class378.method2325(-44, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = arg0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }
}
