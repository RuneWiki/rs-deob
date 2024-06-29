import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class332 {

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lrr;")
    private class199 field4893 = new class199();

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lrr;")
    private class199 field4895 = new class199();

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lrr;")
    private class199 field4897 = new class199();

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lrr;")
    private class199 field4898 = new class199();

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Lil;")
    private class265 field4900 = new class265(4);

    @OriginalMember(owner = "client!se", name = "B", descriptor = "B")
    private byte field4903 = 0;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public volatile int field4904 = 0;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public volatile int field4906 = 0;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lil;")
    private class265 field4905 = new class265(8);

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public static int[] field4879 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field4881 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "J")
    private long field4901;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Ldb;")
    private class26 field4902;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lag;")
    private class302 field4907;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZIZII)V", line = 4)
    public static final void method2191(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 > arg3) {
            int var7 = (arg0 + arg3) / 2;
            int var8 = arg3;
            class159 var9 = class234.field3291[var7];
            class234.field3291[var7] = class234.field3291[arg0];
            class234.field3291[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (class452.method2824(var9, arg2, arg6, arg5, class234.field3291[var10], -30906, arg1) <= 0) {
                    class159 var11 = class234.field3291[var10];
                    class234.field3291[var10] = class234.field3291[var8];
                    class234.field3291[var8++] = var11;
                }
            }
            class234.field3291[arg0] = class234.field3291[var8];
            class234.field3291[var8] = var9;
            method2191(var8 - 1, arg1, arg2, arg3, false, arg5, arg6);
            method2191(arg0, arg1, arg2, var8 + 1, false, arg5, arg6);
        }
        if (!arg4) {
            field4890++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I", line = 47)
    private final int method2192(boolean arg0) {
        if (arg0) {
            method2191(-120, false, false, 102, false, -111, 1);
        }
        field4886++;
        return this.field4897.method1242(0) + this.field4898.method1242(0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)V", line = 58)
    public final void method2193(boolean arg0, int arg1) {
        field4877++;
        if (this.field4902 == null) {
            return;
        }
        try {
            this.field4900.field3915 = 0;
            this.field4900.method1707(-115, arg0 ? 2 : 3);
            this.field4900.method1668((byte) 59, 0);
            if (arg1 >= -14) {
                field4881 = 68;
            }
            this.field4902.method245(118, 4, 0, this.field4900.field3879);
        } catch (IOException var4) {
            try {
                this.field4902.method243(-1);
            } catch (Exception var3) {
            }
            this.field4906 = -2;
            this.field4902 = null;
            this.field4904++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z", line = 86)
    public final boolean method2194(int arg0) {
        if (this.field4902 != null) {
            long var2 = class55.method375(-3913);
            int var4 = (int) (var2 - this.field4901);
            this.field4901 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4899 += var4;
            if (this.field4899 > 30000) {
                try {
                    this.field4902.method243(-1);
                } catch (Exception var27) {
                }
                this.field4902 = null;
            }
        }
        field4892++;
        if (this.field4902 == null) {
            return this.method2202(4) == 0 && this.method2192(false) == 0;
        }
        try {
            this.field4902.method239(-24448);
            class302 var5 = (class302) this.field4893.method1252(-108);
            if (arg0 > -127) {
                this.method2204(-47, (class26) null, false);
            }
            while (var5 != null) {
                this.field4900.field3915 = 0;
                this.field4900.method1707(-117, 1);
                this.field4900.method1668((byte) 59, (int) var5.field3305);
                this.field4902.method245(81, 4, 0, this.field4900.field3879);
                this.field4895.method1244(var5, -26);
                var5 = (class302) this.field4893.method1249(-77);
            }
            for (class302 var6 = (class302) this.field4897.method1252(-70); var6 != null; var6 = (class302) this.field4897.method1249(-85)) {
                this.field4900.field3915 = 0;
                this.field4900.method1707(125, 0);
                this.field4900.method1668((byte) 59, (int) var6.field3305);
                this.field4902.method245(126, 4, 0, this.field4900.field3879);
                this.field4898.method1244(var6, -26);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4902.method241((byte) 17);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4899 = 0;
                byte var9 = 0;
                if (this.field4907 == null) {
                    var9 = 8;
                } else if (this.field4907.field4335 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4907.field4329.field3879.length - this.field4907.field4328;
                    int var11 = 512 - this.field4907.field4335;
                    if ((var10 - this.field4907.field4329.field3915) < var11) {
                        var11 = var10 - this.field4907.field4329.field3915;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4902.method242(122, this.field4907.field4329.field3915, this.field4907.field4329.field3879, var11);
                    if (this.field4903 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4907.field4329.field3879[this.field4907.field4329.field3915 + var12] = (byte) class347.method2311(this.field4907.field4329.field3879[this.field4907.field4329.field3915 + var12], this.field4903);
                        }
                    }
                    this.field4907.field4335 += var11;
                    this.field4907.field4329.field3915 += var11;
                    if (this.field4907.field4329.field3915 == var10) {
                        this.field4907.method1439(-29183);
                        this.field4907.field5481 = false;
                        this.field4907 = null;
                    } else if (this.field4907.field4335 == 512) {
                        this.field4907.field4335 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4905.field3915;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4902.method242(124, this.field4905.field3915, this.field4905.field3879, var13);
                    if (this.field4903 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4905.field3879[this.field4905.field3915 + var14] = (byte) class347.method2311(this.field4905.field3879[this.field4905.field3915 + var14], this.field4903);
                        }
                    }
                    this.field4905.field3915 += var13;
                    if (this.field4905.field3915 >= var9) {
                        if (this.field4907 == null) {
                            this.field4905.field3915 = 0;
                            int var15 = this.field4905.method1697(115);
                            int var16 = this.field4905.method1685(8104);
                            int var17 = this.field4905.method1697(122);
                            int var18 = this.field4905.method1666(-2);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class302 var24;
                            if (var20) {
                                for (var24 = (class302) this.field4898.method1252(-42); var24 != null && var24.field3305 != var21; var24 = (class302) this.field4898.method1249(-121)) {
                                }
                            } else {
                                for (var24 = (class302) this.field4895.method1252(-55); var24 != null && var24.field3305 != var21; var24 = (class302) this.field4895.method1249(-121)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field4907 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4907.field4329 = new class265(var18 + var25 + this.field4907.field4328);
                            this.field4907.field4329.method1707(100, var19);
                            this.field4907.field4329.method1704(var18, (byte) 125);
                            this.field4907.field4335 = 8;
                            this.field4905.field3915 = 0;
                        } else if (this.field4907.field4335 != 0) {
                            throw new IOException();
                        } else if (this.field4905.field3879[0] == -1) {
                            this.field4907.field4335 = 1;
                            this.field4905.field3915 = 0;
                        } else {
                            this.field4907 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4902.method243(-1);
            } catch (Exception var26) {
            }
            this.field4904++;
            this.field4902 = null;
            this.field4906 = -2;
            return this.method2202(4) == 0 && this.method2192(false) == 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 365)
    public static final void method2195(int arg0, int arg1) {
        class86.field1192 = new int[arg0];
        class224.field3166 = new int[arg0];
        class45.field665 = new int[arg0];
        if (arg1 == 27309) {
            class156.field2045 = new int[arg0];
            field4878++;
            class207.field2978 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 388)
    public final void method2196(boolean arg0) {
        try {
            this.field4902.method243(-1);
        } catch (Exception var2) {
        }
        field4883++;
        if (!arg0) {
            this.method2200(-96, true, (byte) 37, -107, -55);
        }
        this.field4904++;
        this.field4902 = null;
        this.field4903 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4906 = -1;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)V", line = 408)
    private final void method2197(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4887++;
        if (this.field4902 == null) {
            return;
        }
        try {
            this.field4900.field3915 = 0;
            this.field4900.method1707(117, 6);
            this.field4900.method1668((byte) 59, 3);
            this.field4902.method245(93, 4, 0, this.field4900.field3879);
        } catch (IOException var3) {
            try {
                this.field4902.method243(-1);
            } catch (Exception var2) {
            }
            this.field4904++;
            this.field4902 = null;
            this.field4906 = -2;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Z", line = 436)
    public static final boolean method2198(int arg0, int arg1) {
        field4896++;
        class159 var2 = class104.method707(arg0, (byte) 123);
        if (var2 == null) {
            return false;
        } else if (class2.field22 == 3) {
            String var3 = "";
            if (class59.field849 != 0) {
                var3 = ":" + (var2.field2088 + 7000);
            }
            String var4 = "";
            if (class309.field4426 != null) {
                var4 = "/p=" + class309.field4426;
            }
            if (arg1 != 50000) {
                method2191(120, true, true, 14, false, 74, 11);
            }
            String var5 = "http://" + var2.field2083 + var3 + "/l=" + class58.field833 + "/a=" + class196.field2804 + var4 + "/j" + (class231.field3265 ? "1" : "0") + ",o" + (class333.field4921 ? "1" : "0") + ",a2";
            try {
                class1.field9.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class162.field2111 = var2.field2083;
            class163.field2123 = var2.field2088;
            if (class59.field849 != 0) {
                class228.field3222 = class163.field2123 + 50000;
                class87.field1219 = class163.field2123 + 40000;
                class167.field2197 = class87.field1219;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 492)
    public final void method2199(int arg0) {
        if (arg0 >= -18) {
            this.field4906 = 13;
        }
        if (this.field4902 != null) {
            this.field4902.method246(119);
        }
        field4882++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZBII)Lag;", line = 506)
    public final class302 method2200(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field4889++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class302 var8 = new class302();
        var8.field3305 = var6;
        if (arg4 != 20) {
            return null;
        }
        var8.field5480 = arg1;
        var8.field4328 = arg2;
        if (arg1) {
            if (this.method2202(arg4 ^ 0x10) >= 20) {
                throw new RuntimeException();
            }
            this.field4893.method1244(var8, -26);
        } else if (this.method2192(false) < 20) {
            this.field4897.method1244(var8, -26);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z", line = 549)
    public final boolean method2201(int arg0) {
        field4876++;
        if (arg0 == -27332) {
            return this.method2202(4) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I", line = 560)
    public final int method2202(int arg0) {
        if (arg0 == 4) {
            field4885++;
            return this.field4893.method1242(0) + this.field4895.method1242(arg0 ^ 0x4);
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z", line = 571)
    public final boolean method2203(byte arg0) {
        field4891++;
        if (arg0 > -76) {
            return true;
        } else {
            return this.method2192(false) >= 20;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILdb;Z)V", line = 586)
    public final void method2204(int arg0, class26 arg1, boolean arg2) {
        if (this.field4902 != null) {
            try {
                this.field4902.method243(-1);
            } catch (Exception var8) {
            }
            this.field4902 = null;
        }
        field4880++;
        this.field4902 = arg1;
        this.method2197(true);
        this.method2193(arg2, -55);
        this.field4905.field3915 = 0;
        this.field4907 = null;
        while (true) {
            class302 var4 = (class302) this.field4895.method1243((byte) 67);
            if (var4 == null) {
                while (true) {
                    class302 var5 = (class302) this.field4898.method1243((byte) 67);
                    if (var5 == null) {
                        if (this.field4903 != 0) {
                            try {
                                this.field4900.field3915 = 0;
                                this.field4900.method1707(-117, 4);
                                this.field4900.method1707(77, this.field4903);
                                this.field4900.method1693(0, (byte) 44);
                                this.field4902.method245(40, 4, 0, this.field4900.field3879);
                            } catch (IOException var7) {
                                try {
                                    this.field4902.method243(-1);
                                } catch (Exception var6) {
                                }
                                this.field4906 = -2;
                                this.field4902 = null;
                                this.field4904++;
                            }
                        }
                        this.field4899 = arg0;
                        this.field4901 = class55.method375(arg0 - 3913);
                        return;
                    }
                    this.field4897.method1244(var5, -26);
                }
            }
            this.field4893.method1244(var4, -26);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V", line = 656)
    public static final void method2205(int arg0, int arg1) {
        field4888++;
        class24 var2 = class51.field755;
        synchronized (class51.field755) {
            class51.field755.method215(0, arg1);
            if (arg0 != 7000) {
                method2195(53, -127);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 670)
    public static void method2206(int arg0) {
        if (arg0 != 0) {
            field4881 = -105;
        }
        field4879 = null;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 686)
    public final void method2207(int arg0) {
        field4884++;
        if (arg0 >= -12 || this.field4902 == null) {
            return;
        }
        try {
            this.field4900.field3915 = 0;
            this.field4900.method1707(-121, 7);
            this.field4900.method1668((byte) 59, 0);
            this.field4902.method245(51, 4, 0, this.field4900.field3879);
        } catch (IOException var3) {
            try {
                this.field4902.method243(-1);
            } catch (Exception var2) {
            }
            this.field4902 = null;
            this.field4906 = -2;
            this.field4904++;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 714)
    public final void method2208(byte arg0) {
        int var2 = -123 / ((-arg0 - 28) / 57);
        if (this.field4902 != null) {
            this.field4902.method243(-1);
        }
        field4894++;
    }
}
