import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 extends class63 {

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    private int field294 = 0;

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "Z")
    public volatile boolean field309 = false;

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
    private int field310 = 0;

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lla;")
    private class67 field281;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "Ljc;")
    public class57 field285;

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "[B")
    public static byte[] field284 = new byte[520];

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "Llc;")
    public static class69 field300 = class69.method470((byte) -122, "hitmarks");

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "Llc;")
    public static class69 field302 = class69.method470((byte) -127, "Unable to connect)3");

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "Llc;")
    public static class69 field287 = class69.method470((byte) -114, "Fps:");

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "Llc;")
    public static class69 field304 = class69.method470((byte) -116, "mapedge");

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "Llc;")
    public static class69 field297 = class69.method470((byte) -123, "slide:");

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
    public static int field303 = 0;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lnb;")
    public static class80 field289 = new class80();

    @OriginalMember(owner = "client!cc", name = "Kb", descriptor = "[I")
    public static int[] field316 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "Lb", descriptor = "Llc;")
    public static class69 field317 = class69.method470((byte) -118, " @lre@");

    @OriginalMember(owner = "client!cc", name = "Nb", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "Lcc;")
    public static class16 field315;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "Loa;")
    public static class85 field283;

    @OriginalMember(owner = "client!cc", name = "Mb", descriptor = "Loa;")
    public static class85 field318;

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "[Lda;")
    public static class20[] field314;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "[Lhc;")
    public static class45[] field299;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "[Z")
    public volatile boolean[] field288;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static void method84(int arg0) {
        field287 = null;
        field314 = null;
        field304 = null;
        field315 = null;
        field299 = null;
        field289 = null;
        field317 = null;
        field300 = null;
        field283 = null;
        field302 = null;
        field284 = null;
        field297 = null;
        field318 = null;
        if (arg0 != -16) {
            field293 = -67;
        }
        field316 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public static final void method85(boolean arg0) {
        if (!arg0) {
            class11.field227.method220((byte) -126);
            class13.field254.method220((byte) -112);
            ++field306;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public final void method86(int arg0, int arg1) {
        ++field305;
        this.field281.method443(arg0 + 1, -97, this);
        if (arg1 != 0) {
            this.field281 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static final void method87(int arg0) {
        class120.field2569 = 0;
        if (arg0 != 1) {
            method85(true);
        }
        ++field295;
        class77.field1746 = 0;
        class66.method431(1);
        class75.method529(0);
        class128.method938((byte) 62);
        for (int var1 = 0; ~var1 > ~class120.field2569; ++var1) {
            int var3 = class91.field1982[var1];
            if (class62.field1282 != class112.field2434[var3].field1088) {
                class112.field2434[var3].field1616 = null;
                class112.field2434[var3] = null;
            }
        }
        if (class103.field2224 != class3.field22.field2061) {
            throw new RuntimeException("gnp1 pos:" + class3.field22.field2061 + " psize:" + class103.field2224);
        } else {
            for (int var2 = 0; var2 < class62.field1284; ++var2) {
                if (class112.field2434[class70.field1569[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class62.field1284);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)I")
    public final int method88(byte arg0) {
        ++field296;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = -84 / ((-11 - arg0) / 34);
        while (var4 < super.field1300.length) {
            if (super.field1305[var4] > 0) {
                var3 += this.method91(14, var4);
                var2 += 100;
            }
            ++var4;
        }
        int var6 = var3 * 100 / var2;
        if (~var6 > ~this.field310) {
            var6 = this.field310;
        } else {
            this.field310 = var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(ZI)V")
    public static final void method89(boolean arg0, int arg1) {
        if (!arg0) {
            field297 = null;
        }
        class122.field2640 = arg1;
        ++field311;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method90(int arg0, String arg1) {
        if (arg0 != 35) {
            method84(108);
        }
        ++field312;
        System.out.println("Error: " + arg1);
        try {
            String var2 = arg1.replace(':', '.');
            String var3 = var2.replace('@', '_');
            String var4 = var3.replace('&', '_');
            String var5 = var4.replace('#', '_');
            class116 var6 = class128.field2750.method748(0, new URL(class128.field2750.field2178.getCodeBase(), "reporterror.ws?c=" + class87.field1917 + "&u=" + class72.field1609 + "&v1=" + class99.field2180 + "&v2=" + class99.field2169 + "&e=" + var5));
            while (var6.field2504 == 0) {
                class108.method814((byte) 15, 1L);
            }
            if (~var6.field2504 == -2) {
                DataInputStream var7 = (DataInputStream) var6.field2505;
                var7.read();
                var7.close();
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(II)I")
    private final int method91(int arg0, int arg1) {
        ++field286;
        if (arg0 != 14) {
            this.field313 = 99;
        }
        if (super.field1300[arg1] != null) {
            return 100;
        } else {
            return this.field288[arg1] ? 100 : this.field281.method447(arg1, this, 2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class122.field2670[0].method80(arg4, arg3);
        class122.field2670[1].method80(arg4, arg3 - (-arg1 - -16));
        ++field290;
        class95.method728(arg4, arg3 + 16, 16, arg1 + -32, class125.field2685);
        int var6 = 70 / ((arg2 - 73) / 50);
        int var7 = (arg1 - 32) * arg1 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (-var7 + -32 + arg1) * arg5 / (arg0 - arg1);
        class95.method728(arg4, arg3 + 16 - -var8, 16, var7, class110.field2424);
        class95.method721(arg4, arg3 - -16 + var8, var7, class11.field238);
        class95.method721(arg4 + 1, arg3 + 16 + var8, var7, class11.field238);
        class95.method725(arg4, var8 + 16 + arg3, 16, class11.field238);
        class95.method725(arg4, 17 - -var8 + arg3, 16, class11.field238);
        class95.method721(arg4 + 15, arg3 + 16 + var8, var7, class40.field782);
        class95.method721(arg4 + 14, arg3 + 17 + var8, var7 - 1, class40.field782);
        class95.method725(arg4, arg3 - -15 + var8 - -var7, 16, class40.field782);
        class95.method725(arg4 - -1, arg3 + 14 + var8 + var7, 15, class40.field782);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I")
    public final int method93(int arg0) {
        ++field308;
        if (this.field309) {
            return 100;
        } else {
            int var2 = this.field281.method447(-1, this, 2);
            if (~var2 > ~this.field294) {
                var2 = this.field294;
            } else {
                this.field294 = var2;
            }
            if (~var2 <= -101) {
                var2 = 99;
            }
            if (arg0 != -23740) {
                this.method95(false, (byte[]) null, 23, (byte) 67);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lla;Ljc;IZZ)V")
    public class16(class67 arg0, class57 arg1, int arg2, boolean arg3, boolean arg4) {
        super(arg3, arg4);
        this.field281 = arg0;
        this.field285 = arg1;
        this.field313 = arg2;
        this.field281.method446(23, 0, this, true);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(ZI)V")
    public final void method94(boolean arg0, int arg1) {
        ++field282;
        if (this.field285 != null || arg0) {
            this.field307 = arg0;
            if (arg1 != 10165) {
                method92(99, -85, -123, -24, -64, 7);
            }
            for (int var3 = 0; super.field1300.length > var3; ++var3) {
                if (super.field1305[var3] > 0) {
                    if (!this.field288[var3]) {
                        this.field281.method446(68, var3 - -1, this, false);
                    } else if (arg0) {
                        class17.method102(var3, true, false, this);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[BIB)V")
    public final void method95(boolean arg0, byte[] arg1, int arg2, byte arg3) {
        ++field291;
        if (~arg2 == -1) {
            this.method407(arg1, arg3 + 590);
            if (this.field285 == null) {
                this.field288 = new boolean[super.field1300.length];
                for (int var5 = 0; var5 < this.field288.length; ++var5) {
                    this.field288[var5] = false;
                }
                this.field309 = true;
            } else {
                class46.method307(this, 261);
            }
        } else {
            if (this.field285 != null) {
                class102.method773(arg2 + -1, 95, this, arg1);
                this.field288[arg2 + -1] = true;
            }
            if (arg0 || this.field307) {
                super.field1300[arg2 + -1] = arg1;
            }
        }
        if (arg3 != -127) {
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
    public final void method96(int arg0, boolean arg1) {
        if (!arg1) {
            field314 = null;
        }
        ++field298;
        if (this.field285 != null && this.field288 != null && this.field288[arg0]) {
            class17.method102(arg0, true, true, this);
        } else {
            this.field281.method446(113, arg0 + 1, this, true);
        }
    }
}
