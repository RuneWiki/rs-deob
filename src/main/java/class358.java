import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class358 {

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "F")
    public float field5304 = 1.0F;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "F")
    public float field5311 = 0.25F;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "F")
    public float field5314 = 1.0F;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public int field5297;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "F")
    public float field5305;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Lpc;")
    public class477 field5301;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "F")
    public float field5298;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "F")
    public float field5295;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Lob;")
    public static class521 field5309 = new class521(28, -1);

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "[F")
    public static float[] field5313 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lob;")
    public static class521 field5315 = new class521(61, 2);

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field5318 = -1;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field5317 = 1;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "Laj;")
    public static class207 field5320;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Lbn;")
    public static class310 field5319;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "Lul;")
    public static class406 field5321;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljh;I)V")
    public static final void method2247(class112 arg0, int arg1) {
        field5310++;
        if (arg1 != -16658) {
            method2252((byte) 104);
        }
        arg0.field1561 = null;
        if (class169.field2498 < 20) {
            class28.field333.method1957(-68, arg0);
            class169.field2498++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lya;I)V")
    public static final void method2248(class38 arg0, int arg1) {
        field5299++;
        int var2 = class521.field7630;
        int var3 = class397.field5941;
        int var4 = class498.field7158;
        int var5 = class267.field4085 - 3;
        byte var6 = 20;
        if (class528.field7701 == null || class380.field5734 == null) {
            if (class176.field2627.method2556((byte) 21, class430.field6377) && class176.field2627.method2556((byte) 21, class280.field4248)) {
                class528.field7701 = arg0.method345(class84.method702(class176.field2627, class430.field6377, 0), true);
                class84 var7 = class84.method702(class176.field2627, class280.field4248, 0);
                class380.field5734 = arg0.method345(var7, true);
                var7.method707();
                class124.field1846 = arg0.method345(var7, true);
            } else {
                arg0.method284(var2, var3, var4, var6, class469.field6773 | 255 - class155.field2313 << 24, 1);
            }
        }
        if (class528.field7701 != null && class380.field5734 != null) {
            int var8 = (var4 - (class380.field5734.method123() * 2)) / class528.field7701.method123();
            for (int var9 = 0; var9 < var8; var9++) {
                class528.field7701.method132(class380.field5734.method123() + var2 + (var9 * class528.field7701.method123()), var3);
            }
            class380.field5734.method132(var2, var3);
            class124.field1846.method132(var2 + var4 - class124.field1846.method123(), var3);
        }
        class185.field2805.method2038(var2 + 3, false, arg1, class213.field3482 | 0xFF000000, var3 + 14, class271.field4152.method1635(class224.field3673, (byte) 127));
        arg0.method284(var2, var3 + var6, var4, var5 - var6, class469.field6773 | -class155.field2313 + 255 << 24, 1);
        int var10 = class184.field2800.method542(false);
        int var11 = class184.field2800.method543(true);
        int var12 = 0;
        for (class295 var13 = (class295) class456.field6644.method1004((byte) -113); var13 != null; var13 = (class295) class456.field6644.method996(1)) {
            int var30 = ((class382.field5752 - var12 - 1) * 16) + var6 + var3 + 13;
            var12++;
            if (var2 < var10 && var10 < (var2 + var4) && var30 - 13 < var11 && var30 + 4 > var11 && var13.field4490) {
                arg0.method284(var2, var30 - 12, var4, 16, class157.field2375 | 255 - class495.field7138 << 24, 1);
            }
        }
        if ((class459.field6687 == null || class100.field1429 == null || class142.field2181 == null) && class176.field2627.method2556((byte) 21, class142.field2167) && class176.field2627.method2556((byte) 21, class268.field4100) && class176.field2627.method2556((byte) 21, class215.field3495)) {
            class84 var14 = class84.method702(class176.field2627, class268.field4100, 0);
            class100.field1429 = arg0.method345(var14, true);
            var14.method707();
            class40.field534 = arg0.method345(var14, true);
            class459.field6687 = arg0.method345(class84.method702(class176.field2627, class142.field2167, 0), true);
            class84 var15 = class84.method702(class176.field2627, class215.field3495, 0);
            class142.field2181 = arg0.method345(var15, true);
            var15.method707();
            class46.field601 = arg0.method345(var15, true);
        }
        if (class459.field6687 != null && class100.field1429 != null && class142.field2181 != null) {
            int var16 = (var4 - (class142.field2181.method123() * 2)) / class459.field6687.method123();
            for (int var17 = 0; var17 < var16; var17++) {
                class459.field6687.method132(var2 + class142.field2181.method123() + (var17 * class459.field6687.method123()), var3 + (var5 - class459.field6687.method125()));
            }
            int var18 = (var5 - class142.field2181.method125() - var6) / class100.field1429.method125();
            for (int var19 = 0; var19 < var18; var19++) {
                class100.field1429.method132(var2, var19 * class100.field1429.method125() + var6 + var3);
                class40.field534.method132(var2 + var4 - class40.field534.method123(), class100.field1429.method125() * var19 + var3 + var6);
            }
            class142.field2181.method132(var2, var3 + var5 - class142.field2181.method125());
            class46.field601.method132(var2 + var4 - class142.field2181.method123(), -class142.field2181.method125() + var5 + var3);
        }
        int var20 = 0;
        for (class295 var21 = (class295) class456.field6644.method1004((byte) -75); var21 != null; var21 = (class295) class456.field6644.method996(1)) {
            int var22 = var3 + var6 + ((class382.field5752 + -1 + -var20) * 16) + 13;
            int var23 = class213.field3482 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > var22 - 13 && var11 < var22 + 4 && var21.field4490) {
                var23 = class186.field2814 | 0xFF000000;
            }
            int[] var24 = null;
            if (class209.method1447(var21.field4498, (byte) -22)) {
                var24 = class390.field5847.method467((byte) -101, (int) var21.field4494).field7772;
            } else if (var21.field4503 != -1) {
                var24 = class390.field5847.method467((byte) -101, var21.field4503).field7772;
            } else if (class469.method2829((byte) 123, var21.field4498)) {
                class116 var27 = class153.field2265[(int) var21.field4494];
                if (var27 != null) {
                    class37 var28 = var27.field1763;
                    if (var28.field499 != null) {
                        var28 = var28.method256(127, class195.field3271);
                    }
                    if (var28 != null) {
                        var24 = var28.field502;
                    }
                }
            } else if (class229.method1623(var21.field4498, 49)) {
                Object var25 = null;
                class69 var26;
                if (var21.field4498 == 1004) {
                    var26 = class510.field7458.method2973(arg1 ^ 0x7C, (int) var21.field4494);
                } else {
                    var26 = class510.field7458.method2973(-124, (int) (var21.field4494 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field906 != null) {
                    var26 = var26.method604((byte) -15, class195.field3271);
                }
                if (var26 != null) {
                    var24 = var26.field895;
                }
            }
            String var29 = class356.method2234(~arg1, var21);
            if (var24 != null) {
                var29 = var29 + class534.method3165(var24, false);
            }
            class185.field2805.method2037(class305.field4603, class36.field423, var2 + 3, var23, var29, arg1 ^ 0x4D, var22, 0);
            var20++;
            if (var21.field4495) {
                client.field3313.method132(var2 + class380.field5735.method2174(-33, var29) + 5, var22 + -12);
            }
        }
        class127.method927(class397.field5941, class267.field4085, class498.field7158, -65534, class521.field7630);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2249(int arg0, String arg1) {
        class475.method2854(arg1, arg0, "", arg0 - 126, "", 0);
        field5303++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lhp;Z)V")
    public final void method2250(class217 arg0, boolean arg1) {
        this.field5304 = (float) (arg0.method1515((byte) 126) * 8) / 255.0F;
        field5306++;
        this.field5311 = (float) (arg0.method1515((byte) 127) * 8) / 255.0F;
        this.field5314 = (float) (arg0.method1515((byte) 123) * 8) / 255.0F;
        if (!arg1) {
            this.field5298 = 0.19534881F;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lgq;I)Z")
    public final boolean method2251(class358 arg0, int arg1) {
        if (arg1 <= 9) {
            method2248(null, -47);
        }
        field5300++;
        return this.field5308 == arg0.field5308 && this.field5305 == arg0.field5305 && this.field5295 == arg0.field5295 && this.field5298 == arg0.field5298 && this.field5311 == arg0.field5311 && this.field5304 == arg0.field5304 && this.field5314 == arg0.field5314 && this.field5296 == arg0.field5296 && this.field5307 == arg0.field5307 && this.field5301 == arg0.field5301;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method2252(byte arg0) {
        field5320 = null;
        field5309 = null;
        field5321 = null;
        field5313 = null;
        field5315 = null;
        if (arg0 != 114) {
            field5315 = null;
        }
        field5319 = null;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
    public class358() {
        this.field5302 = -60;
        this.field5296 = class333.field4982;
        this.field5308 = class524.field7676;
        this.field5297 = -50;
        this.field5305 = 1.1523438F;
        this.field5301 = class516.field7505;
        this.field5307 = 0;
        this.field5312 = -50;
        this.field5298 = 1.2F;
        this.field5295 = 0.69921875F;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lhp;)V")
    public class358(class217 arg0) {
        int var2 = arg0.method1515((byte) 122);
        if (class193.field3258.method2987(false, class96.field1384) && class181.field2717.method301() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5308 = class524.field7676;
            } else {
                this.field5308 = arg0.method1556(102);
            }
            if ((var2 & 0x2) == 0) {
                this.field5305 = 1.1523438F;
            } else {
                this.field5305 = (float) arg0.method1511(-115) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5295 = 0.69921875F;
            } else {
                this.field5295 = (float) arg0.method1511(-94) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5298 = 1.2F;
            } else {
                this.field5298 = (float) arg0.method1511(-68) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1556(104);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1511(-101);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1511(78);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1511(93);
            }
            this.field5298 = 1.2F;
            this.field5308 = class524.field7676;
            this.field5305 = 1.1523438F;
            this.field5295 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5312 = -50;
            this.field5297 = -50;
            this.field5302 = -60;
        } else {
            this.field5312 = arg0.method1529((byte) -82);
            this.field5302 = arg0.method1529((byte) 117);
            this.field5297 = arg0.method1529((byte) 126);
        }
        if ((var2 & 0x20) == 0) {
            this.field5296 = class333.field4982;
        } else {
            this.field5296 = arg0.method1556(112);
        }
        if ((var2 & 0x40) == 0) {
            this.field5307 = 0;
        } else {
            this.field5307 = arg0.method1511(112);
        }
        if ((var2 & 0x80) == 0) {
            this.field5301 = class516.field7505;
        } else {
            int var3 = arg0.method1511(-26);
            int var4 = arg0.method1511(102);
            int var5 = arg0.method1511(106);
            int var6 = arg0.method1511(-71);
            int var7 = arg0.method1511(-30);
            int var8 = arg0.method1511(-108);
            this.field5301 = class165.method1102(var6, var8, var4, var7, var3, var5, 60);
        }
    }
}
