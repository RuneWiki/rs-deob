import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class276 {

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lrf;")
    private class79 field4224 = new class79();

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Lrf;")
    private class79 field4237 = new class79();

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lrf;")
    private class79 field4238 = new class79();

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lrf;")
    private class79 field4239 = new class79();

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lag;")
    private class202 field4242 = new class202(4);

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public volatile int field4245 = 0;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "B")
    private byte field4246 = 0;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public volatile int field4247 = 0;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lag;")
    private class202 field4244 = new class202(8);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    public static int[] field4216 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Z")
    public static boolean field4214 = false;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4226 = "";

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
    public static int[] field4230 = new int[14];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "J")
    private long field4241;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Li;")
    private class333 field4248;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lql;")
    private class87 field4243;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[Lem;")
    public static class271[] field4215;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method1845(boolean arg0) {
        if (arg0) {
            this.method1860(false, -102, (byte) -65, 32, -72);
        }
        field4210++;
        return this.method1854((byte) 101) >= 20;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZB)V", line = 16)
    public final void method1846(boolean arg0, byte arg1) {
        field4234++;
        if (this.field4243 == null) {
            return;
        }
        try {
            this.field4242.field3249 = 0;
            this.field4242.method1311(arg0 ? 2 : 3, 10964);
            this.field4242.method1298(0, 2360);
            this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
        } catch (IOException var6) {
            try {
                this.field4243.method607((byte) -76);
            } catch (Exception var5) {
            }
            this.field4245++;
            this.field4243 = null;
            this.field4247 = -2;
        }
        if (arg1 > -59) {
            this.method1846(false, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z", line = 47)
    public final boolean method1847(byte arg0) {
        field4218++;
        if (arg0 != -58) {
            field4221 = 91;
        }
        return this.method1856(false) >= 20;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 60)
    public static void method1848(int arg0) {
        if (arg0 == 13261) {
            field4230 = null;
            field4226 = null;
            field4215 = null;
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 73)
    public final void method1849(byte arg0) {
        field4213++;
        if (this.field4243 == null) {
            return;
        }
        try {
            this.field4242.field3249 = 0;
            this.field4242.method1311(7, 10964);
            if (arg0 > -113) {
                this.method1849((byte) 91);
            }
            this.field4242.method1298(0, 2360);
            this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
        } catch (IOException var5) {
            try {
                this.field4243.method607((byte) -76);
            } catch (Exception var4) {
            }
            this.field4243 = null;
            this.field4247 = -2;
            this.field4245++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBII)I", line = 100)
    public static final int method1850(int arg0, byte arg1, int arg2, int arg3) {
        field4231++;
        if (arg0 == arg3) {
            return arg3;
        }
        int var4 = 49 % ((-arg1 - 80) / 32);
        int var5 = 128 - arg2;
        int var6 = ((arg3 & 0xFF00FF00) >>> 7) * var5 + (((arg0 & 0xFF00FF00) >>> 7) * arg2) & 0xFF00FF00;
        int var7 = (arg0 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var5 & 0xFF00FF00;
        return (var7 >> 7) + var6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)Z", line = 126)
    public static final boolean method1851(byte[] arg0, int arg1) {
        class202 var2 = new class202(arg0);
        field4212++;
        int var3 = var2.method1317((byte) -96);
        if (var3 != 1) {
            return false;
        }
        if (arg1 != -23217) {
            method1848(-15);
        }
        boolean var4 = var2.method1317((byte) -126) == 1;
        if (var4) {
            class43.method323(var2, (byte) -112);
        }
        class222.method1477(-1, var2);
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 150)
    private final void method1852(boolean arg0) {
        field4211++;
        if (!arg0) {
            field4214 = false;
        }
        if (this.field4243 == null) {
            return;
        }
        try {
            this.field4242.field3249 = 0;
            this.field4242.method1311(6, 10964);
            this.field4242.method1298(3, 2360);
            this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
        } catch (IOException var5) {
            try {
                this.field4243.method607((byte) -76);
            } catch (Exception var4) {
            }
            this.field4243 = null;
            this.field4245++;
            this.field4247 = -2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 181)
    public final void method1853(int arg0) {
        try {
            this.field4243.method607((byte) -76);
        } catch (Exception var4) {
        }
        this.field4245++;
        this.field4247 = -1;
        this.field4246 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4243 = null;
        field4217++;
        int var3 = 84 % ((arg0 + 13) / 35);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I", line = 197)
    public final int method1854(byte arg0) {
        if (arg0 <= 57) {
            field4230 = (int[]) null;
        }
        field4219++;
        return this.field4224.method580(false) + this.field4237.method580(false);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z", line = 209)
    public final boolean method1855(int arg0) {
        if (this.field4243 != null) {
            long var2 = class338.method2339((byte) -120);
            int var4 = (int) (var2 - this.field4241);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4240 += var4;
            this.field4241 = var2;
            if (this.field4240 > 30000) {
                try {
                    this.field4243.method607((byte) -76);
                } catch (Exception var30) {
                }
                this.field4243 = null;
            }
        }
        field4236++;
        if (this.field4243 == null) {
            return this.method1854((byte) 60) == 0 && this.method1856(false) == 0;
        }
        try {
            this.field4243.method613(-2);
            for (class333 var6 = (class333) this.field4224.method576((byte) -70); var6 != null; var6 = (class333) this.field4224.method579(0)) {
                this.field4242.field3249 = 0;
                this.field4242.method1311(1, 10964);
                this.field4242.method1298((int) var6.field4610, 2360);
                this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
                this.field4237.method578(-100, var6);
            }
            for (class333 var7 = (class333) this.field4238.method576((byte) -109); var7 != null; var7 = (class333) this.field4238.method579(0)) {
                this.field4242.field3249 = 0;
                this.field4242.method1311(0, 10964);
                this.field4242.method1298((int) var7.field4610, 2360);
                this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
                this.field4239.method578(-106, var7);
            }
            if (arg0 <= 28) {
                field4225 = -107;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4243.method608(-102);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4240 = 0;
                byte var10 = 0;
                if (this.field4248 == null) {
                    var10 = 8;
                } else if (this.field4248.field5107 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = 512 - this.field4248.field5107;
                    int var12 = this.field4248.field5109.field3273.length - this.field4248.field5112;
                    if (var11 > (var12 - this.field4248.field5109.field3249)) {
                        var11 = var12 - this.field4248.field5109.field3249;
                    }
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field4243.method605((byte) -86, this.field4248.field5109.field3249, this.field4248.field5109.field3273, var11);
                    if (this.field4246 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field4248.field5109.field3273[this.field4248.field5109.field3249 + var13] = (byte) class331.method2296(this.field4248.field5109.field3273[this.field4248.field5109.field3249 + var13], this.field4246);
                        }
                    }
                    this.field4248.field5109.field3249 += var11;
                    this.field4248.field5107 += var11;
                    if (this.field4248.field5109.field3249 == var12) {
                        this.field4248.method2024(0);
                        this.field4248.field239 = false;
                        this.field4248 = null;
                    } else if (this.field4248.field5107 == 512) {
                        this.field4248.field5107 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4244.field3249;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field4243.method605((byte) -50, this.field4244.field3249, this.field4244.field3273, var14);
                    if (this.field4246 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4244.field3273[this.field4244.field3249 + var15] = (byte) class331.method2296(this.field4244.field3273[this.field4244.field3249 + var15], this.field4246);
                        }
                    }
                    this.field4244.field3249 += var14;
                    if (var10 <= this.field4244.field3249) {
                        if (this.field4248 == null) {
                            this.field4244.field3249 = 0;
                            int var16 = this.field4244.method1317((byte) -106);
                            int var17 = this.field4244.method1315(14289);
                            int var18 = this.field4244.method1317((byte) -85);
                            int var19 = this.field4244.method1346(-119);
                            boolean var20 = (var18 & 0x80) != 0;
                            int var21 = var18 & 0x7F;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class333 var25;
                            if (var20) {
                                for (var25 = (class333) this.field4239.method576((byte) -74); var25 != null && var25.field4610 != var22; var25 = (class333) this.field4239.method579(0)) {
                                }
                            } else {
                                for (var25 = (class333) this.field4237.method576((byte) -102); var25 != null && var25.field4610 != var22; var25 = (class333) this.field4237.method579(0)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var21 == 0 ? 5 : 9;
                            this.field4248 = var25;
                            this.field4248.field5109 = new class202(var19 + var26 + this.field4248.field5112);
                            this.field4248.field5109.method1311(var21, 10964);
                            this.field4248.field5109.method1359(16705, var19);
                            this.field4248.field5107 = 8;
                            this.field4244.field3249 = 0;
                        } else if (this.field4248.field5107 != 0) {
                            throw new IOException();
                        } else if (this.field4244.field3273[0] == -1) {
                            this.field4248.field5107 = 1;
                            this.field4244.field3249 = 0;
                        } else {
                            this.field4248 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4243.method607((byte) -76);
            } catch (Exception var29) {
            }
            this.field4247 = -2;
            this.field4245++;
            this.field4243 = null;
            return this.method1854((byte) 112) == 0 && this.method1856(false) == 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)I", line = 491)
    private final int method1856(boolean arg0) {
        if (arg0) {
            return 85;
        } else {
            field4209++;
            return this.field4238.method580(arg0) + this.field4239.method580(arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(Z)V", line = 510)
    public static final void method1857(boolean arg0) {
        class128.method844(0, 0, (byte) -111);
        field4233++;
        if (arg0) {
            field4225 = 94;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(Z)V", line = 525)
    public final void method1858(boolean arg0) {
        field4227++;
        if (arg0) {
            this.field4245 = -83;
        }
        if (this.field4243 != null) {
            this.field4243.method612(5000);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V", line = 540)
    public final void method1859(byte arg0) {
        if (this.field4243 != null) {
            this.field4243.method607((byte) -76);
        }
        if (arg0 != 39) {
            this.field4247 = -71;
        }
        field4232++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIBII)Li;", line = 566)
    public final class333 method1860(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4220++;
        class333 var6 = new class333();
        long var7 = (long) ((arg4 << 16) + arg3);
        var6.field4610 = var7;
        var6.field5112 = arg2;
        var6.field237 = arg0;
        if (arg1 != 5416) {
            field4214 = false;
        }
        if (arg0) {
            if (this.method1854((byte) 76) >= 20) {
                throw new RuntimeException();
            }
            this.field4224.method578(-128, var6);
        } else if (this.method1856(false) < 20) {
            this.field4238.method578(-127, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBLql;)V", line = 607)
    public final void method1861(boolean arg0, byte arg1, class87 arg2) {
        if (this.field4243 != null) {
            try {
                this.field4243.method607((byte) -76);
            } catch (Exception var11) {
            }
            this.field4243 = null;
        }
        this.field4243 = arg2;
        this.method1852(true);
        this.method1846(arg0, (byte) -119);
        this.field4248 = null;
        field4235++;
        if (arg1 <= 52) {
            this.field4242 = (class202) null;
        }
        this.field4244.field3249 = 0;
        while (true) {
            class333 var5 = (class333) this.field4237.method577((byte) -92);
            if (var5 == null) {
                while (true) {
                    class333 var6 = (class333) this.field4239.method577((byte) -92);
                    if (var6 == null) {
                        if (this.field4246 != 0) {
                            try {
                                this.field4242.field3249 = 0;
                                this.field4242.method1311(4, 10964);
                                this.field4242.method1311(this.field4246, 10964);
                                this.field4242.method1313(0, -376480);
                                this.field4243.method611((byte) 60, 0, this.field4242.field3273, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4243.method607((byte) -76);
                                } catch (Exception var9) {
                                }
                                this.field4245++;
                                this.field4243 = null;
                                this.field4247 = -2;
                            }
                        }
                        this.field4240 = 0;
                        this.field4241 = class338.method2339((byte) -120);
                        return;
                    }
                    this.field4238.method578(-112, var6);
                }
            }
            this.field4224.method578(-104, var5);
        }
    }
}
