import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class169 {

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    private int[] field2393 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lbg;")
    public static class324 field2395 = null;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lin;")
    public class60 field2390;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    private int[] field2400;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[S")
    private short[] field2388;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[S")
    private short[] field2394;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[S")
    private short[] field2397;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[S")
    private short[] field2398;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILiv;)V")
    public final void method1184(int arg0, class65 arg1) {
        field2399++;
        while (true) {
            int var3 = arg1.method577(arg0 + 256);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field2398 = null;
                    return;
                }
            }
            this.method1191(var3, (byte) 16, arg1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZBI)Lvj;")
    public static final class305 method1185(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field2387++;
        class305 var5 = new class305();
        var5.field4335 = arg1;
        var5.field4333 = arg0;
        class49.field545.method878((long) arg4, -2301, var5);
        class11.method78(arg0, 2652);
        class188 var6 = class371.method2286(0, arg4);
        if (var6 != null) {
            class120.method951(var6, (byte) -109);
        }
        int var7 = -57 / ((76 - arg3) / 37);
        if (class454.field6681 != null) {
            class120.method951(class454.field6681, (byte) -109);
            class454.field6681 = null;
        }
        class418.method2547(22);
        if (var6 != null) {
            class140.method1050(var6, -1, !arg2);
        }
        if (!arg2) {
            class41.method412(arg0);
        }
        if (!arg2 && class64.field761 != -1) {
            class389.method2393(class64.field761, -1, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z")
    public final boolean method1186(byte arg0) {
        field2389++;
        int var2 = 101 % ((27 - arg0) / 59);
        boolean var3 = true;
        class387 var4 = this.field2390.field690;
        synchronized (this.field2390.field690) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field2393[var5] != -1 && !this.field2390.field690.method2357(0, (byte) -124, this.field2393[var5])) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lya;IILrd;II)V")
    public static final void method1187(class38 arg0, int arg1, int arg2, class222 arg3, int arg4, int arg5) {
        field2386++;
        class77 var6 = class504.field7479.method2005(1409, arg3.field3182);
        if (var6.field1042 == -1) {
            return;
        }
        if (arg2 < 108) {
            method1187(null, -68, -109, null, -96, 15);
        }
        int var7;
        if (arg3.field3229) {
            int var8 = arg3.field3207 + arg1;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class16 var9 = var6.method713(arg3.field3214, arg0, var7, 16306);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field3206;
        int var11 = arg3.field3180;
        if ((var7 & 0x1) == 1) {
            var10 = arg3.field3180;
            var11 = arg3.field3206;
        }
        int var12 = var9.method125();
        int var13 = var9.method117();
        if (var6.field1048) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field1045 == 0) {
            var9.method120(arg5, arg4 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method121(arg5, arg4 + 4 - (var11 * 4), var12, var13, 0, var6.field1045 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Z")
    public final boolean method1188(byte arg0) {
        field2392++;
        if (this.field2400 == null) {
            return true;
        }
        if (arg0 <= 53) {
            this.method1186((byte) 30);
        }
        boolean var2 = true;
        class387 var3 = this.field2390.field690;
        synchronized (this.field2390.field690) {
            for (int var4 = 0; var4 < this.field2400.length; var4++) {
                if (!this.field2390.field690.method2357(0, (byte) -124, this.field2400[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Ljq;")
    public final class353 method1189(byte arg0) {
        field2401++;
        if (this.field2400 == null) {
            return null;
        }
        class353[] var2 = new class353[this.field2400.length];
        class387 var3 = this.field2390.field690;
        synchronized (this.field2390.field690) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field2400.length) {
                    break;
                }
                var2[var4] = class118.method933(0, this.field2390.field690, (byte) 89, this.field2400[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2400.length; var5++) {
            if (var2[var5].field4919 < 13) {
                var2[var5].method2122(0, (byte) -118);
            }
        }
        class353 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class353(var2, var2.length);
        }
        if (arg0 != -63) {
            this.field2397 = null;
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2394 != null) {
            for (int var7 = 0; var7 < this.field2394.length; var7++) {
                var6.method2138(this.field2394[var7], this.field2398[var7], false);
            }
        }
        if (this.field2397 != null) {
            for (int var8 = 0; var8 < this.field2397.length; var8++) {
                var6.method2121(this.field2388[var8], arg0 ^ 0xFFFFFFC1, this.field2397[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field2395 = null;
        if (arg0 != 4) {
            field2395 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLiv;)V")
    private final void method1191(int arg0, byte arg1, class65 arg2) {
        if (arg0 == 1) {
            arg2.method577(255);
        } else if (arg0 == 2) {
            int var4 = arg2.method577(arg1 + 239);
            this.field2400 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2400[var5] = arg2.method623((byte) 103);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method577(255);
                this.field2394 = new short[var6];
                this.field2398 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2394[var7] = (short) arg2.method623((byte) 111);
                    this.field2398[var7] = (short) arg2.method623((byte) -40);
                }
            } else if (arg0 == 41) {
                int var8 = arg2.method577(255);
                this.field2388 = new short[var8];
                this.field2397 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2397[var9] = (short) arg2.method623((byte) -46);
                    this.field2388[var9] = (short) arg2.method623((byte) -28);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field2393[arg0 - 60] = arg2.method623((byte) 110);
            }
        }
        field2391++;
        if (arg1 != 16) {
            this.field2393 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Ljq;")
    public final class353 method1192(int arg0) {
        field2396++;
        class353[] var2 = new class353[5];
        int var3 = 0;
        class387 var4 = this.field2390.field690;
        synchronized (this.field2390.field690) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2393[var5] != -1) {
                    var2[var3++] = class118.method933(0, this.field2390.field690, (byte) 89, this.field2393[var5]);
                }
                var5++;
            }
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field4919 < 13) {
                var2[var6].method2122(0, (byte) -37);
            }
        }
        class353 var7 = new class353(var2, var3);
        if (this.field2394 != null) {
            for (int var8 = 0; var8 < this.field2394.length; var8++) {
                var7.method2138(this.field2394[var8], this.field2398[var8], false);
            }
        }
        if (this.field2397 != null) {
            for (int var9 = 0; var9 < this.field2397.length; var9++) {
                var7.method2121(this.field2388[var9], arg0, this.field2397[var9]);
            }
        }
        return var7;
    }
}
