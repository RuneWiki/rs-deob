import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class283 extends class53 {

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lp;")
    private class280 field4976 = class24.field433;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Lp;")
    public static class280 field4973 = class18.method140((byte) -125, "null");

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field4974 = -1;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field4992 = 0;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "Ltg;")
    public static class180 field4991;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Lhe;")
    public class19 field4969;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Lhe;")
    private class19 field4983;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Z")
    public static boolean field4981;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    public static final void method1912(boolean arg0, int arg1) {
        field4993++;
        int var2 = -17 % ((-arg1 - 17) / 36);
        byte var3 = 4;
        byte[][] var4 = class89.field1438;
        for (int var5 = 0; var5 < var3; var5++) {
            class128.method884(-19552);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class40.field684[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3F880BB) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 3 & 0x7FF;
                            int var11 = (var8 & 0x7) >> 1;
                            int var12 = var8 >> 14 & 0x3FF;
                            int var13 = (var12 / 8 << 8) + var10 / 8;
                            for (int var14 = 0; var14 < class3.field93.length; var14++) {
                                if (class3.field93[var14] == var13 && var4[var14] != null) {
                                    class93.method661(var9, var6 * 8, 3, class183.field3211, var7 * 8, (var12 & 0x7) * 8, var4[var14], arg0, var5, (var10 & 0x7) * 8, var11);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static final void method1913(boolean arg0) {
        field4975++;
        if (arg0) {
            field4981 = false;
        }
        class204.field3546.method1485((byte) -108);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public final int method1914(int arg0, int arg1) {
        field4988++;
        if (this.field4969 == null) {
            return this.field4982;
        } else {
            int var3 = -23 / ((35 - arg1) / 53);
            class190 var4 = (class190) this.field4969.method150((long) arg0, -89);
            return var4 == null ? this.field4982 : var4.field3329;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(BI)I")
    public static final int method1915(byte arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFF3BFF) >> 16) / 256.0D;
        int var4 = 37 % ((30 - arg0) / 35);
        field4978++;
        double var5 = var2;
        double var7 = (double) ((arg1 & 0xFFB3) >> 8) / 256.0D;
        double var9 = 0.0D;
        double var11 = var2;
        double var13 = (double) (arg1 & 0xFF) / 256.0D;
        if (var2 < var7) {
            var5 = var7;
        }
        if (var2 > var7) {
            var11 = var7;
        }
        if (var5 < var13) {
            var5 = var13;
        }
        if (var11 > var13) {
            var11 = var13;
        }
        double var15 = 0.0D;
        double var17 = (var5 + var11) / 2.0D;
        int var19 = (int) (var17 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var5 != var11) {
            if (var17 < 0.5D) {
                var15 = (var5 - var11) / (var5 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var5 - var11) / (2.0D - var5 - var11);
            }
            if (var2 == var5) {
                var9 = (var7 - var13) / (var5 - var11);
            } else if (var5 == var7) {
                var9 = (var13 - var2) / (var5 - var11) + 2.0D;
            } else if (var5 == var13) {
                var9 = (var2 - var7) / (var5 - var11) + 4.0D;
            }
        }
        double var20 = var9 / 6.0D;
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var20 * 256.0D);
        if (var19 > 243) {
            var22 >>= 0x4;
        } else if (var19 > 217) {
            var22 >>= 0x3;
        } else if (var19 > 192) {
            var22 >>= 0x2;
        } else if (var19 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + ((var23 >> 2 << 10) + (var19 >> 1));
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    private final void method1916(int arg0) {
        this.field4983 = new class19(this.field4969.method154(arg0 - 76));
        field4979++;
        if (arg0 != -2) {
            field4992 = -26;
        }
        for (class238 var2 = (class238) this.field4969.method142(true); var2 != null; var2 = (class238) this.field4969.method143((byte) -122)) {
            class28 var3 = new class28(var2.field4124, (int) var2.field2827);
            this.field4983.method148(-1, var3, var2.field4124.method1869((byte) -73));
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Llj;II)V")
    private final void method1917(class25 arg0, int arg1, int arg2) {
        field4984++;
        if (arg1 == 1) {
            this.field4986 = arg0.method189((byte) -103);
        } else if (arg1 == 2) {
            this.field4987 = arg0.method189((byte) -103);
        } else if (arg1 == 3) {
            this.field4976 = arg0.method198(false);
        } else if (arg1 == 4) {
            this.field4982 = arg0.method199((byte) -85);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method193((byte) 77);
            this.field4969 = new class19(class79.method585(var4, -805756542));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method199((byte) -85);
                class161 var7;
                if (arg1 == 5) {
                    var7 = new class238(arg0.method198(false));
                } else {
                    var7 = new class190(arg0.method199((byte) -85));
                }
                this.field4969.method148(-1, var7, (long) var6);
            }
        }
        if (arg2 != -7) {
            this.field4982 = -17;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILp;)Z")
    public final boolean method1918(int arg0, class280 arg1) {
        field4980++;
        if (this.field4969 == null) {
            return false;
        }
        if (this.field4983 == null) {
            this.method1916(-2);
        }
        class28 var3 = (class28) this.field4983.method150(arg1.method1869((byte) -83), 105);
        if (arg0 < 95) {
            field4981 = false;
        }
        while (var3 != null) {
            if (var3.field533.method1888(arg1, 25648)) {
                return true;
            }
            var3 = (class28) this.field4983.method151(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZILlj;IIIII)V")
    public static final void method1919(int arg0, boolean arg1, int arg2, class25 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            field4973 = null;
        }
        if (arg7 >= 0 && arg7 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg1) {
                class259.field4598[arg6][arg7][arg0] = 0;
            }
            while (true) {
                int var9 = arg3.method189((byte) -103);
                if (var9 == 0) {
                    if (arg1) {
                        class145.field2529[0][arg7][arg0] = class168.field2937[0][arg7][arg0];
                    } else if (arg6 == 0) {
                        class145.field2529[0][arg7][arg0] = -class262.method1773(arg7 + arg5 + 932731, false, arg2 + arg0 + 556238) * 8;
                    } else {
                        class145.field2529[arg6][arg7][arg0] = class145.field2529[arg6 - 1][arg7][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg3.method189((byte) -103);
                    if (arg1) {
                        class145.field2529[0][arg7][arg0] = var10 * 8 + class168.field2937[0][arg7][arg0];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg6 == 0) {
                            class145.field2529[0][arg7][arg0] = -var10 * 8;
                        } else {
                            class145.field2529[arg6][arg7][arg0] = class145.field2529[arg6 - 1][arg7][arg0] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class54.field882[arg6][arg7][arg0] = arg3.method200(32768);
                    class252.field4401[arg6][arg7][arg0] = (byte) ((var9 - 2) / 4);
                    class59.field954[arg6][arg7][arg0] = (byte) class214.method1432(var9 + arg4 - 2, 3);
                } else if (var9 > 81) {
                    class219.field3754[arg6][arg7][arg0] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class259.field4598[arg6][arg7][arg0] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method189((byte) -103);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg3.method189((byte) -103);
                    break;
                }
                if (var11 <= 49) {
                    arg3.method189((byte) -103);
                }
            }
        }
        field4977++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLlj;)V")
    public final void method1920(boolean arg0, class25 arg1) {
        if (!arg0) {
            return;
        }
        field4985++;
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                return;
            }
            this.method1917(arg1, var3, -7);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        field4991 = null;
        field4973 = null;
        int var1 = -123 % ((arg0 + 21) / 60);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
    public final boolean method1922(int arg0, int arg1) {
        field4989++;
        if (this.field4969 == null) {
            return false;
        }
        if (this.field4983 == null) {
            this.method1924((byte) 105);
        }
        class190 var3 = (class190) this.field4983.method150((long) arg0, arg1 ^ 0xFFFFFF23);
        if (arg1 != -180) {
            method1919(81, true, 59, (class25) null, 72, -59, -86, -62, -106);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)Lp;")
    public final class280 method1923(int arg0, int arg1) {
        field4970++;
        if (this.field4969 == null) {
            return this.field4976;
        }
        class238 var3 = (class238) this.field4969.method150((long) arg1, arg0 ^ 0x887ABB88);
        if (arg0 != -2005222424) {
            this.field4987 = 57;
        }
        return var3 == null ? this.field4976 : var3.field4124;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    private final void method1924(byte arg0) {
        field4990++;
        this.field4983 = new class19(this.field4969.method154(-64));
        if (arg0 > 95) {
            for (class190 var2 = (class190) this.field4969.method142(true); var2 != null; var2 = (class190) this.field4969.method143((byte) -120)) {
                class190 var3 = new class190((int) var2.field2827);
                this.field4983.method148(-1, var3, (long) var2.field3329);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIILrf;)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class277 arg6) {
        field4972++;
        if (arg2 == 0) {
            class234.method1577(arg5, arg4, 128, arg1, arg0, arg6.field4791, arg3, arg6.field4793);
        }
    }
}
