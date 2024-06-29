import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class391 extends class379 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lei;")
    public static class191 field5076 = new class191();

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method2291(int arg0) {
        if (arg0 != -257) {
            field5076 = null;
        }
        field5076 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method2292(int arg0) {
        field5077++;
        if (class425.field5638 == null) {
            class425.field5638 = class26.method257(1);
            class757.field10482 = class425.field5638[0];
            class114.field1434 = class349.method2069(true);
        }
        if (class691.field9417 == null) {
            class603.method3438(true);
        }
        class26 var1 = class757.field10482;
        if (arg0 != 100) {
            field5076 = null;
        }
        int var2 = class170.method1161(0);
        if (class757.field10482 == var1) {
            class241.field2844 = class757.field10482.field386.method3584(class770.field10592, true);
            if (class757.field10482.field381) {
                class388.field5002 = (class757.field10482.field382 - class757.field10482.field389) * var2 / 100 + class757.field10482.field389;
            }
            if (class757.field10482.field384) {
                class241.field2844 = class241.field2844 + class388.field5002 + "%";
            }
        } else if (class757.field10482 == class26.field413) {
            class691.field9417 = null;
            class48.method454(3, -1);
        } else {
            class241.field2844 = var1.field383.method3584(class770.field10592, true);
            if (class757.field10482.field384) {
                class241.field2844 = class241.field2844 + var1.field382 + "%";
            }
            class388.field5002 = var1.field382;
            if (class757.field10482.field381 || var1.field381) {
                class114.field1434 = class349.method2069(true);
            }
        }
        if (class691.field9417 == null) {
            return;
        }
        class691.field9417.method3642(class757.field10482, class114.field1434, class388.field5002, class241.field2844, 0);
        if (class616.field8286 == null) {
            return;
        }
        for (int var3 = class394.field5111 + 1; var3 < class616.field8286.length; var3++) {
            if (class616.field8286[var3].method281(false) >= 100 && (var3 - 1) == class394.field5111 && class289.field3493 >= 1 && class691.field9417.method3648(99)) {
                try {
                    class616.field8286[var3].method285(4088);
                } catch (Exception var4) {
                    class616.field8286 = null;
                    return;
                }
                class691.field9417.method3643(class616.field8286[var3], -1);
                class394.field5111++;
                if (class616.field8286.length - 1 <= class394.field5111 && class616.field8286.length > 1) {
                    class394.field5111 = class12.field207.method2533(true) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
    public static final int method2293(byte arg0, int arg1) {
        field5075++;
        int var2 = -50 / ((63 - arg0) / 45);
        int var3 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var3 += 16;
        }
        if (arg1 >= 256) {
            var3 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var3 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var3 += 2;
        }
        if (arg1 >= 1) {
            var3++;
            arg1 >>>= 0x1;
        }
        return arg1 + var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILfg;I)V")
    public static final void method2294(int arg0, int arg1, class140 arg2, int arg3) {
        field5073++;
        if (arg3 != -257) {
            method2292(25);
        }
        class448.field6026[arg1][arg0] = arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Leda;)V")
    public static final void method2295(class110 arg0) {
        if (class784.field10818 >= 65535) {
            return;
        }
        class515 var1 = arg0.field1374;
        class331.field4094[class784.field10818] = arg0;
        class109.field1363[class784.field10818] = false;
        class784.field10818++;
        int var2 = arg0.field1385;
        if (arg0.field1373) {
            var2 = 0;
        }
        int var3 = arg0.field1385;
        if (arg0.field1387) {
            var3 = class368.field4569 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3085(true) + class343.field4301 - var1.method3088(21915) >> class714.field10017;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3085(true) + var1.method3088(21915) - class343.field4301 >> class714.field10017;
            if (var7 >= class250.field2938) {
                var7 = class250.field2938 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1381[var5++];
                int var10 = (var1.method3084(0) + class343.field4301 - var1.method3088(21915) >> class714.field10017) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class307.field3799) {
                    var11 = class307.field3799 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class425.field5640[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class425.field5640[var4][var12][var8] = var13 | (long) class784.field10818;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class425.field5640[var4][var12][var8] = var13 | (long) class784.field10818 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class425.field5640[var4][var12][var8] = var13 | (long) class784.field10818 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class425.field5640[var4][var12][var8] = var13 | (long) class784.field10818 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILiaa;)V")
    public static final void method2296(int arg0, class521 arg1) {
        int var2 = 12 / ((16 - arg0) / 54);
        field5071++;
        class96 var3 = (class96) class118.field1501.method2121(75, (long) arg1.field3393);
        if (var3 == null) {
            class250.method1497(68, null, arg1, arg1.field808, arg1.field3455[0], null, 0, arg1.field3453[0]);
        } else {
            var3.method836(64);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II)V")
    public class391(int arg0, int arg1) {
        this.field5072 = arg1;
        this.field5074 = arg0;
    }
}
