import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class649 extends class54 {

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9401 = new String[] { method4773(method4772("?\"\u0011&og")), method4773(method4772("?\"\u0011&mg")), method4773(method4772("?\"\u0011&lg")), method4773(method4772("?\"\u0011&hg")), method4773(method4772("4m^&T")), method4773(method4772("?\"\u0011&jg")), method4773(method4772("!6\u001cd")), method4773(method4772("?\"\u0011&ng")), method4773(method4772("?\"\u0011&kg")), method4773(method4772("?\"\u0011&dg")) };

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "Z")
    public static boolean field9397 = true;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILhia;)V")
    public class649(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 != 0) {
                field9397 = true;
            }
            ++field9393;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9401[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)Z")
    public final boolean method4768(int arg0) {
        try {
            ++field9395;
            if (super.field589.method656(true)) {
                return false;
            } else if (super.field589.method653(24915) == class243.field3725) {
                return true;
            } else {
                if (arg0 != -10243) {
                    field9397 = false;
                }
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9401[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            ++field9400;
            if (!arg0) {
                method4769((String) null, false, 102);
            }
            if (super.field589.method653(24915) != class243.field3725) {
                super.field593 = 1;
            } else if (super.field589.method656(true)) {
                super.field593 = 0;
            }
            if (~super.field593 != -1 && ~super.field593 != -2) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9401[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method4769(String arg0, boolean arg1, int arg2) {
        try {
            ++field9392;
            if (arg0 != null) {
                if (~class157.field1960 <= -101) {
                    class536.method4041(4, class309.field4886.method2616(false, class167.field2300), 103);
                } else {
                    String var3 = class727.method5306((byte) -106, arg0);
                    if (var3 != null) {
                        for (int var4 = 0; ~var4 > ~class157.field1960; ++var4) {
                            String var5 = class727.method5306((byte) -99, class54.field598[var4]);
                            if (var5 != null && var5.equals(var3)) {
                                class536.method4041(4, arg0 + class309.field4887.method2616(false, class167.field2300), 104);
                                return;
                            }
                            if (class666.field9687[var4] != null) {
                                String var6 = class727.method5306((byte) -71, class666.field9687[var4]);
                                if (var6 != null && var6.equals(var3)) {
                                    class536.method4041(4, arg0 + class309.field4887.method2616(false, class167.field2300), 116);
                                    return;
                                }
                            }
                        }
                        int var7 = 0;
                        if (arg2 == -19855) {
                            while (~class588.field8654 < ~var7) {
                                String var8 = class727.method5306((byte) -66, class754.field10971[var7]);
                                if (var8 != null && var8.equals(var3)) {
                                    class536.method4041(4, class309.field4892.method2616(false, class167.field2300) + arg0 + class309.field4893.method2616(false, class167.field2300), 103);
                                    return;
                                }
                                if (class311.field4935[var7] != null) {
                                    String var9 = class727.method5306((byte) -70, class311.field4935[var7]);
                                    if (var9 != null && var9.equals(var3)) {
                                        class536.method4041(4, class309.field4892.method2616(false, class167.field2300) + arg0 + class309.field4893.method2616(false, class167.field2300), 118);
                                        return;
                                    }
                                }
                                ++var7;
                            }
                            if (class727.method5306((byte) -39, class225.field3446.field10506).equals(var3)) {
                                class536.method4041(4, class309.field4889.method2616(false, class167.field2300), 107);
                            } else {
                                ++class104.field1196;
                                class280 var10 = class610.method4508(class262.field4027, class279.field4190, (byte) 121);
                                var10.field4197.method1428((byte) -24, 1 + class554.method4169(23827, arg0));
                                var10.field4197.method1464(arg0, 255);
                                var10.field4197.method1428((byte) -24, arg1 ? 1 : 0);
                                class106.method934((byte) 53, var10);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field9401[5] + (arg0 != null ? field9401[4] : field9401[6]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field9396;
            if (super.field589.method656(true)) {
                return 3;
            } else if (super.field589.method653(24915) == class243.field3725) {
                return 1;
            } else {
                if (arg1 > -106) {
                    field9397 = true;
                }
                return 3;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9401[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(Z)I")
    public final int method4770(boolean arg0) {
        try {
            if (arg0) {
                return 79;
            } else {
                ++field9399;
                return super.field593;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9401[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static final void method4771(byte arg0) {
        try {
            ++field9398;
            int var1 = -75 % ((arg0 - 52) / 32);
            for (int var2 = 0; var2 < 100; ++var2) {
                class26.field321[var2] = true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9401[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field9394;
            if (arg0) {
                field9397 = true;
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9401[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lhia;)V")
    public class649(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4772(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4773(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
