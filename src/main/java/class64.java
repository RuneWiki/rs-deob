import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class64 {

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    private int field928 = 32;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Z")
    private boolean field922 = false;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "J")
    private long field923 = class176.method1234(5574);

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "J")
    private long field943 = 0L;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
    private boolean field948 = true;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "J")
    private long field949 = 0L;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    private int field947 = 0;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    private int field951 = 0;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "[Lvc;")
    private class69[] field944 = new class69[8];

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    private int field950 = 0;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "[Lvc;")
    private class69[] field954 = new class69[8];

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field926 = 1;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Loj;")
    public static class297 field941 = null;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ls;")
    public static class196 field918 = new class196(16);

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lvc;")
    private class69 field939;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
    public int[] field931;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[Lin;")
    public static class177[] field940;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 4)
    public void method520(Component arg0) throws Exception {
        field937++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 11)
    private final void method521(int arg0, int arg1) {
        field924++;
        if (arg0 != 1024) {
            this.method523((byte) -124);
        }
        this.field951 -= arg1;
        if (this.field951 < 0) {
            this.field951 = 0;
        }
        if (this.field939 != null) {
            this.field939.method562(arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([II)V", line = 30)
    private final void method522(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class193.field2808) {
            var3 = arg1 << 1;
        }
        class84.method685(arg0, 0, var3);
        this.field951 -= arg1;
        if (this.field939 != null && this.field951 <= 0) {
            this.field951 += class56.field812 >> 4;
            class149.method1050(this.field939, 32);
            this.method536(this.field939, (byte) 8, this.field939.method561());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class69 var10 = null;
                        class69 var11 = this.field944[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class45 var12 = var11.field997;
                                if (var12 == null || var12.field625 <= var8) {
                                    var11.field999 = true;
                                    int var13 = var11.method558();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field625 += var13;
                                    }
                                    if (var4 >= this.field928) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method559();
                                    if (var14 != null) {
                                        int var15 = var11.field998;
                                        while (var14 != null) {
                                            this.method536(var14, (byte) 8, var15 * var14.method561() >> 8);
                                            var14 = var11.method556();
                                        }
                                    }
                                    class69 var16 = var11.field996;
                                    var11.field996 = null;
                                    if (var10 == null) {
                                        this.field944[var7] = var16;
                                    } else {
                                        var10.field996 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field954[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field996;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class69 var18 = this.field944[var17];
                this.field944[var17] = this.field954[var17] = null;
                while (var18 != null) {
                    class69 var19 = var18.field996;
                    var18.field996 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field951 < 0) {
            this.field951 = 0;
        }
        if (this.field939 != null) {
            this.field939.method560(arg0, 0, arg1);
        }
        this.field923 = class176.method1234(5574);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 193)
    public final synchronized void method523(byte arg0) {
        field942++;
        if (this.field922) {
            return;
        }
        long var2 = class176.method1234(5574);
        try {
            if (this.field923 + 500000L < var2) {
                this.field923 = var2 - 500000L;
            }
            while ((this.field923 + 5000L) < var2) {
                this.method521(arg0 + 941, 256);
                this.field923 += (long) (256000 / class56.field812);
            }
            if (arg0 != 83) {
                method525(true);
            }
        } catch (Exception var9) {
            this.field923 = var2;
        }
        if (this.field931 == null) {
            return;
        }
        try {
            if (this.field949 != 0L) {
                if (this.field949 > var2) {
                    return;
                }
                this.method528(this.field952);
                this.field949 = 0L;
                this.field948 = true;
            }
            int var5 = this.method532();
            if ((this.field947 - var5) > this.field955) {
                this.field955 = this.field947 - var5;
            }
            int var6 = this.field946 + this.field945;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field952) {
                this.field952 += 1024;
                if (this.field952 > 16384) {
                    this.field952 = 16384;
                }
                this.method529();
                var5 = 0;
                this.method528(this.field952);
                this.field948 = true;
                if (var6 + 256 > this.field952) {
                    var6 = this.field952 - 256;
                    this.field945 = var6 - this.field946;
                }
            }
            while (var5 < var6) {
                this.method522(this.field931, 256);
                var5 += 256;
                this.method526();
            }
            if (this.field943 < var2) {
                if (this.field948) {
                    this.field948 = false;
                } else if (this.field955 == 0 && this.field950 == 0) {
                    this.method529();
                    this.field949 = var2 + 2000L;
                    return;
                } else {
                    this.field945 = Math.min(this.field950, this.field955);
                    this.field950 = this.field955;
                }
                this.field955 = 0;
                this.field943 = var2 + 2000L;
            }
            this.field947 = var5;
        } catch (Exception var8) {
            this.method529();
            this.field949 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 310)
    public void method524() throws Exception {
        field938++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 317)
    public static final void method525(boolean arg0) {
        class94.field1312.method462(24);
        if (!arg0) {
            method525(true);
        }
        field927++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 328)
    public void method526() throws Exception {
        field933++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 336)
    public final synchronized void method527(int arg0) {
        int var2 = -10 / ((3 - arg0) / 48);
        this.field948 = true;
        try {
            this.method524();
        } catch (Exception var4) {
            this.method529();
            this.field949 = class176.method1234(5574) + 2000L;
        }
        field934++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 356)
    public void method528(int arg0) throws Exception {
        field932++;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()V", line = 370)
    public void method529() {
        field935++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I", line = 378)
    public static final int method530(int arg0, int arg1, int arg2) {
        int var3 = -15 % ((arg2 + 27) / 58);
        field925++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var4 = (arg1 & 0x7F) * arg0 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 406)
    public static void method531(byte arg0) {
        field940 = null;
        field918 = null;
        field941 = null;
        if (arg0 > -18) {
            method530(-36, -35, -4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()I", line = 425)
    public int method532() throws Exception {
        field929++;
        return this.field952;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lvc;I)V", line = 434)
    public final synchronized void method533(class69 arg0, int arg1) {
        if (arg1 != 1) {
            this.method535((byte) -123);
        }
        this.field939 = arg0;
        field919++;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Lwi;", line = 452)
    public static final class234 method534(byte arg0) {
        field936++;
        class234 var1 = new class234(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], class225.field3385[0], class206.field3015);
        if (arg0 != -94) {
            field918 = (class196) null;
        }
        class321.method2235(-2182);
        return var1;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V", line = 465)
    public final void method535(byte arg0) {
        this.field948 = true;
        if (arg0 > -80) {
            this.method533((class69) null, -2);
        }
        field930++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lvc;BI)V", line = 480)
    private final void method536(class69 arg0, byte arg1, int arg2) {
        field953++;
        if (arg1 != 8) {
            this.field955 = 107;
        }
        int var4 = arg2 >> 5;
        class69 var5 = this.field954[var4];
        if (var5 == null) {
            this.field944[var4] = arg0;
        } else {
            var5.field996 = arg0;
        }
        this.field954[var4] = arg0;
        arg0.field998 = arg2;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V", line = 534)
    public static final void method537(byte arg0) {
        field921++;
        if (!class141.field2031 || class74.field1080) {
            return;
        }
        class167[][][] var1 = class302.field4502;
        if (arg0 != -70) {
            return;
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class167 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2390 != null && var6.field2390.field1202 instanceof class218) {
                            class218 var7 = (class218) var6.field2390.field1202;
                            if ((Long.MIN_VALUE & var6.field2390.field1195) == 0L) {
                                var7.method1589(false, true, true, true, false, true, true);
                            } else {
                                var7.method1589(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field2412 != null) {
                            if (var6.field2412.field1313 instanceof class218) {
                                class218 var8 = (class218) var6.field2412.field1313;
                                if ((var6.field2412.field1311 & Long.MIN_VALUE) == 0L) {
                                    var8.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1589(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2412.field1317 instanceof class218) {
                                class218 var9 = (class218) var6.field2412.field1317;
                                if ((Long.MIN_VALUE & var6.field2412.field1311) == 0L) {
                                    var9.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field2387 != null) {
                            if (var6.field2387.field165 instanceof class218) {
                                class218 var10 = (class218) var6.field2387.field165;
                                if ((Long.MIN_VALUE & var6.field2387.field172) == 0L) {
                                    var10.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1589(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2387.field174 instanceof class218) {
                                class218 var11 = (class218) var6.field2387.field174;
                                if ((Long.MIN_VALUE & var6.field2387.field172) == 0L) {
                                    var11.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field2407; var12++) {
                            if (var6.field2406[var12].field2591 instanceof class218) {
                                class218 var13 = (class218) var6.field2406[var12].field2591;
                                if ((var6.field2406[var12].field2585 & Long.MIN_VALUE) == 0L) {
                                    var13.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class74.field1080 = true;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 678)
    public final synchronized void method538(boolean arg0) {
        if (class148.field2129 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class148.field2129.field2113[var3] == this) {
                    class148.field2129.field2113[var3] = null;
                }
                if (class148.field2129.field2113[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class148.field2129.field2120 = true;
                while (class148.field2129.field2116) {
                    class184.method1283(50L, 10);
                }
                class148.field2129 = null;
            }
        }
        field920++;
        this.method529();
        this.field931 = null;
        this.field922 = arg0;
    }
}
